public class gasStation2 {
    public int canCarCom(int[] gas, int[] cost) {
        int position = 0, sum = 0, total = 0;

        for( int i = 0; i < gas.length; i++){
            sum += gas[i] - cost[i];
            if(sum < 0){
                position = i + 1;
                total += sum;
                sum = 0;
            }
        }
        return total + sum >= 0 ? position : -1;
    }
    public static void main(String[] args) {
        gasStation2 obj = new gasStation2();
        int[] gas = { 1, 2, 3, 4, 5, 4, 1, 1, 1 };
        int[] cost = { 3, 4, 5, 1, 2, 1, 2, 10, 8};
        System.out.println(obj.canCarCom(gas, cost)); // -1
    }
}
