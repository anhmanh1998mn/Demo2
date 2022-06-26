public class NumberOfResentCallTest {

    public static void main(String[] args) {
        RecentCounter mResentCounter = new RecentCounter();
        for (Integer item: mResentCounter.listInputData) {
            System.out.println("requests ".concat(item + " return ") + mResentCounter.ping(item));
        }

    }

    public static class RecentCounter {
        Integer[] listInputData = null;

        public RecentCounter() {
            listInputData = new Integer[] {1, 100, 3001, 3002};
        }

        public int ping(int t) {
            int count = 0;
            for (Integer item: listInputData) {
                if (item <= t && item >= (t - 3000)) {
                    count++;
                }
            }
            return count;
        }
    }
}
