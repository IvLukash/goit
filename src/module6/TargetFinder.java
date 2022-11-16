package module6;

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
        //******************************
        //int x = 0, y = 0;
        //int difX = Math.abs(targets[0][0] - aiCoords[0]);
        //int difY = Math.abs(targets[0][1] - aiCoords[1]);
//
        //for (int i = 0; i < targets.length; i++) {
        //    int localDifX = Math.abs(targets[i][0] - aiCoords[0]);
        //    int localDifY = Math.abs(targets[i][1] - aiCoords[1]);
//
        //    if ((localDifX + localDifY) < (difX + difY)) {
        //        difX = localDifX;
        //        difY = localDifY;
        //        x = targets[i][0];
        //        y = targets[i][1];
        //    }
        //}
        //return new int[] {x, y};
    }
}
