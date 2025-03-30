public class TowerOFHanoi {
    public static void towerOFHanoi(int n, char from, char to, char aux){
        if(n == 0) return; // base case
        towerOFHanoi(n-1, from, aux, to); // move n-1 disks from 'from' to 'aux' using 'to' as auxiliary
        // debug => n = 5, from = 'A', to = 'C', aux = 'B' => towerOFHanoi(5 - 1, 'A', 'B', 'C') => towerOFHanoi(4, 'A', 'B', 'C')
        // debug => n = 4, from = 'A', to = 'B', aux = 'C' => towerOFHanoi(4 - 1, 'A', 'C', 'B') => towerOFHanoi(3, 'A', 'C', 'B')
        // debug => n = 3, from = 'A', to = 'C', aux = 'B' => towerOFHanoi(3 - 1, 'A', 'B', 'C') => towerOFHanoi(2, 'A', 'B', 'C')
        // debug => n = 2, from = 'A', to = 'B', aux = 'C' => towerOFHanoi(2 - 1, 'A', 'C', 'B') => towerOFHanoi(1, 'A', 'C', 'B')
        // debug => n = 1, from = 'A', to = 'C', aux = 'B' => towerOFHanoi(1 - 1, 'A', 'B', 'C') => towerOFHanoi(0, 'A', 'B', 'C')
        // debug => n = 0 => return
        System.out.println(" Move disk " + n + " from " + from + " to " + to); // move nth disk from 'from' to 'to'
        towerOFHanoi(n-1, aux, to, from); // move n-1 disks from 'aux' to 'to' using 'from' as auxiliary
    }
    public static void main(String[] args) {
        towerOFHanoi(3, 'L', 'S', 'M');
    }
}
