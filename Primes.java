public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n + 1];
        int i = 2;
        while (i <= n) {
            arr[i] = true;
            i++;
        }
        int p = 2;
        while (p * p <= n) {
            if (arr[p]) {
                int multiple = p * p;
                while (multiple <= n) {
                    arr[multiple] = false;
                    multiple += p;
                }
            }
            p++;
        }
        int primeCount = 0;
        System.out.println("Prime numbers up to " + n + ":");
        int j = 2;
        while (j <= n) {
            if (arr[j]) {
                System.out.println(j);
                primeCount++;
            }
            j++;
        }
        double percentage = (primeCount * 100.0) / n;
        System.out.println("There are " + primeCount + " primes between 2 and " + n +
                           " (" + String.format("%.0f", percentage) + "% are primes)");
    }
}