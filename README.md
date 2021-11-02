# SocialSportsCenter
Assumptions:

-Changes after showing interest is not allowed
-Court is occupied for full day, i.e. only one session per day
-Rest API will be called with date format YYYY-MM-DD

Run the application with:
mvn clean spring-boot:run

Test curl command:
curl -X POST localhost:8080/bookings -H "Content-Type: application/json" -d "{\"courtName\":\"Court_A\",\"bookingDate\":\"2021-11-01\",\"firstName\":\"ABC\",\"lastName\":\"PQR\",\"email\":\"abc.PQR.com\"}"
