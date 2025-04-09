import java.time.LocalDate;

public class ServiceRequest {
    private LocalDate openDate;
    private LocalDate closedDate;
    private boolean closedOnTime;
    private String reason;
    private String neighborhood;

    public ServiceRequest(LocalDate openDate, LocalDate closedDate, boolean closedOnTime, String reason, String neighborhood) {
        this.openDate = openDate;
        this.closedDate = closedDate;
        this.closedOnTime = closedOnTime;
        this.reason = reason;
        this.neighborhood = neighborhood;
    }

    public boolean isOpen() {
        return closedDate == null;
    }

    public boolean isClosedOnTime() {
        return closedOnTime;
    }

    public long getDaysOpen() {
    LocalDate end;
      if (closedDate != null) {
        end = closedDate;
      } else {
          end = LocalDate.now();
      } 
      return end.toEpochDay() - openDate.toEpochDay();
    }
    
    public String getNeighborhood() {
        return neighborhood;
    }
}
