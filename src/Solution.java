import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Близнецы codeForces
 */
public class Solution {
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] a = bf.readLine().split(" ");
        List<Double> aa = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            aa.add(Double.valueOf(a[i]));
        }
        //sort collection
        Collections.sort(aa);
        //sum collection
        double sum = aa.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        double sum1 = sum;
        int i = aa.size() - 1;
        while (!(sum < (sum1 / 2))) {
            sum = sum - aa.get(i);
            i--;
            count++;
        }
        System.out.println(count);
    }
}