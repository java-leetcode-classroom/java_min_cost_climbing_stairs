public class Solution {
  public int minCostClimbingStairs(int[] cost) {
    int minCost = 0;
    int costLen = cost.length;
    int lastOne = 0;
    int lastTwo = cost[costLen-1];
    for (int startStair = costLen - 2; startStair >= 0; startStair--) {
      minCost = cost[startStair] + Math.min(lastOne, lastTwo);
      lastOne = lastTwo;
      lastTwo = minCost;
    }
    return Math.min(lastOne, lastTwo);
  }
}
