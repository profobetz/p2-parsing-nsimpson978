import java.io.File;
import java.util.List;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File csvFile = new File("sample.csv"); 
        RequestLoader loader = new RequestLoader(csvFile);
        List<Neighborhood> neighborhoods = loader.load();

        for (Neighborhood n : neighborhoods) {
            String summary = String.format("%s - %d open / %d total, %d overdue (%.2f%%), %.2f avg. days to closure", 
                    n.getName(),
                    n.getOpenCasesCount(),
                    n.getRequests(),
                    n.getOverdueCasesCount(),
                    n.getOverduePercentage(),
                    n.getAverageDaysOpen()
            );

            System.out.println(summary);
        }
    }
}
