public class Primes {
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[length + 1];
        int i = 2;
        while (i <= length) {
            arr[i] = true;
            i++;
        }
        int p = 2;
        while (p * p <= length) {
            if (arr[p] == true) {
                int multiple = p * p;
                while (multiple <= length) {
                    arr[multiple] = false;
                    multiple += p;
                }
            }
            p++;
        }
        int primeCount = 0;
        System.out.println("Prime numbers up to " + length + ":");
        int j = 2;
        while (j <= length) {
            if (arr[j]) {
                System.out.println(j);
                primeCount++;
            }
            j++;
        }
        double percentage = (primeCount * 100.0) / length;
        System.out.println("There are " + primeCount + " primes between 2 and " + length +
                           " (" + String.format("%.0f", percentage) + "% are primes)");
    }
}