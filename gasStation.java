public class gasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas = totalCost + gas[i];
            totalCost = totalCost + cost[i];
            tank = tank + gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        if (totalGas < totalCost) {
            return -1;
        }
        return start;
    }

    public static void main(String[] args) {
        gasStation obj = new gasStation();
        int[] gas = { 1, 2, 3, 4, 5, 4, 1, 1, 1 };
        int[] cost = { 3, 4, 5, 1, 2, 1, 2, 10, 8};
        System.out.println(obj.canCompleteCircuit(gas, cost)); // 3
    }
}
