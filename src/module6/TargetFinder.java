package module6;

import java.util.Arrays;

public class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int distanceToTarget = (int) (Math.round(Math.sqrt(Math.pow((targets[0][0] - aiCoords[0]), 2) +
                Math.pow((targets[0][1] - aiCoords[1]), 2))));
        int[] nearestTarget = new int[] {targets[0][0], targets[0][1]};
        int minDistance = distanceToTarget;
        for (int i = 1; i < targets.length; i++) {
            distanceToTarget = (int) (Math.round(Math.sqrt(Math.pow((targets[i][0] - aiCoords[0]), 2) +
                    Math.pow((targets[i][1] - aiCoords[1]), 2))));
            if (distanceToTarget < minDistance) {
                minDistance = distanceToTarget;
                nearestTarget = new int[] {targets[i][0], targets[i][1]};
            }
        }
        return nearestTarget;
    }
}
