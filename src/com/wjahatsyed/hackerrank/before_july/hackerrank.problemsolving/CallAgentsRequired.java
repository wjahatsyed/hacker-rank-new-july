package hackerRank3;

import java.io.*;

import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class CallAgentsRequired {


    // Complete the howManyAgentsToAdd function below.
    static int howManyAgentsToAdd(int noOfCurrentAgents, List<List<Integer>> callsTimes) {
        int agentNeeded = 0;
        for (int i = 0; i < callsTimes.size() - 1; i++) {
            if (callsTimes.get(i).get(0).equals(callsTimes.get(i + 1).get(0))) {
                agentNeeded++;
            } else {
                if (!(callsTimes.get(i).get(1).intValue() <= callsTimes.get(i + 1).get(0).intValue())) {
                    agentNeeded++;
                }
            }
        }

        agentNeeded = agentNeeded - noOfCurrentAgents;
        return agentNeeded;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int noOfCurrentAgents = Integer.parseInt(bufferedReader.readLine().trim());

        int callsTimesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int callsTimesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> callsTimes = new ArrayList<>();

        IntStream.range(0, callsTimesRows).forEach(i -> {
            try {
                callsTimes.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int res = howManyAgentsToAdd(noOfCurrentAgents, callsTimes);
        System.out.println(res);

        /*bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();*/

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
