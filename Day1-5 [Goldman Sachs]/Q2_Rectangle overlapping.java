class Solution {

    int x21 = rec2[0], y21 = rec2[1], x22 = rec2[2], y22 = rec2[3];
        // become a line or point, return false
        if ((x11 == x12 || y11 == y12 || x21 == x22 || y21 == y22)) {
            return false;
        }
        // x-axios do not overlap
        if (x21 >= x12 || x11 >= x22) {
        
         return false;
        }

        // y-axios do not overlap
        if (y21 >= y12 || y11 >= y22) {
            return false;
        }

        return true;
    }
}