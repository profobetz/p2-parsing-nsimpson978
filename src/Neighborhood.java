import java.util.ArrayList;
import java.util.List;

public class Neighborhood {
    private String name;
    private List<ServiceRequest> requests;

    public Neighborhood(String name) {
        this.name = name;
        this.requests = new ArrayList<>();
    }

    public void addRequest(ServiceRequest requestA) {
        requests.add(requestA);
    }

    public double getAverageDaysOpen() {
        if (requests.isEmpty()) 
          return 0;
        double totalDays = 0;
        for (ServiceRequest requestS : requests) {
            totalDays += requestS.getDaysOpen();
        }
        return totalDays / requests.size();
    }

    public long getOpenCasesCount() {
    long count = 0;
    for (ServiceRequest request : requests) {
        if (request.isOpen()) {
            count++;
        }
    }
    return count;
}

public long getOverdueCasesCount() {
    long count = 0;
    for (ServiceRequest request : requests) {
        if (!request.isClosedOnTime()) {
            count++;
        }
    }
    return count;
}

public double getOverduePercentage() {
    if (requests.isEmpty()) 
      return 0;
    long overdue = getOverdueCasesCount();
    int total = requests.size();
    return (100.0 * overdue) / total;
}


    public String getName() {
        return name;
    }

    public List<ServiceRequest> getRequests() {
        return requests;
    }
    
  }
