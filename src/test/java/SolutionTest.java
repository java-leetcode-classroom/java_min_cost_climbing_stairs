import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private  Solution sol = new Solution();
  @Test
  void minCostClimbingStairsExample1() {
    assertEquals(15, sol.minCostClimbingStairs(new int[]{10,15,20}));
  }
  @Test
  void minCostClimbingStairsExample2() {
    assertEquals(6, sol.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
  }
}