package patterns;

public class Patterns {

    private static void checkForNegInput(int n){
        if (n <= 0){
            throw new IllegalArgumentException("Input must me greater than 0 !");
        }
    }

    private static void checkForOddInput(int n){
        if (n % 2 == 0){
            throw new IllegalArgumentException("Input must me odd !");
        }
    }

    private static void checkForValidInput(int n, boolean doubleCheck){
        checkForNegInput(n);
         if (doubleCheck){
             checkForOddInput(n);
         }

    }



    public static String squareHollowPattern(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n){
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }return  sb.toString();
    }

    public static String numberTriangle(int n){
        checkForValidInput(n, false);
        if (n >= 10){
            throw new IllegalArgumentException("Input must me less than 10 !");
        }

        int col = n + (n - 1);
        StringBuilder sb = new StringBuilder();

        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= col; j++){
                if (i == 1 || j == i || j == col - i + 1){
                    sb.append(n - i + 1);
                }else{
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }return  sb.toString();
    }

    public static String numberIncPyramid(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                sb.append(j);
            }
            sb.append("\n");
        }return  sb.toString();
    }

    public static String numberIncRevPyramid(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++){
            for (int j = n; j >= i; j--){
                sb.append(n - j + 1);
            }
            sb.append("\n");
        }   return   sb.toString();
    }

    public static String numberChangingPyramid(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                sb.append(count++);
            }
           sb.append("\n");
        }    return   sb.toString();
    }

    public static String zerosOnesTriangle(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                sb.append((j % 2 == 0)? 1 : 0);
            }
            sb.append("\n");
        }    return   sb.toString();
    }

    public static String palindromicTriangle(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        int column = n + (n - 1);
        int count;
        for (int i = 1; i <= n; i++){
            count = i;
            for (int j = 1; j <= column; j++){
                if (j < n + i && j > n - i){
                    sb.append(count);
                    if (j < n){
                        count--;
                    }else{
                        count++;
                    }
                }else{
                    sb.append(' ');
                }
            }
            sb.append("\n");
        }   return   sb.toString();
    }

    public static String rhombusPattern(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        int column = n + (n - 1);

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= column ; j++){
                if (j >= i && j < n + i){
                    sb.append('*');
                }else{
                    sb.append(' ');
                }
            }
            sb.append("\n");
        }       return  sb.toString();
    }

    public static String diamondPattern(int n){
        checkForValidInput(n, true);
        StringBuilder sb = new StringBuilder();

        int column = n + (n - 1);
        int mid = n - (n / 2);
        int shift;

        for (int i = 1; i <= n; i++){
            shift = (mid - i >= 0)? mid - i : -1 * (mid - i);
            for (int j = 1; j <= column; j++){
                if (j > shift && j < n - shift + 1){
                    sb.append('*');
                }else{
                    sb.append(' ');
                }
            }
            sb.append("\n");
        }                   return   sb.toString();
    }

    public static String squareFillPattern(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        for (int i = 1 ; i <= n; i++){
            for (int j = 1; j <= n; j++){
                sb.append('*');
            }
            sb.append("\n");
        }                 return  sb.toString();
    }

    public static String rightHalfPyramid(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                sb.append('*');
            }
            sb.append("\n");
        } return sb.toString();
    }

    public static String revPyramid(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++){
            for (int j = n; j >= i; j--){
                 sb.append('*');
            }
            sb.append("\n");
        }    return sb.toString();
    }

    public static String leftHalfPyramid(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        for (int i = n; i >= 1; i--){
            for (int j = 1 ; j <= n; j++){
                if (j >= i){
                     sb.append('*');
                }else{
                    sb.append(' ');
                }
            }
            sb.append("\n");
        }    return sb.toString();
    }

    public static String leftRevHalfPyramid(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++){
            for (int j = 1 ; j <= n; j++){
                if (j >= i){
                    sb.append('*');
                }else{
                    sb.append(' ');
                }
            }
            sb.append("\n");
        }  return sb.toString();
    }

    public static String hollowTriangle(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        int column = n + (n - 1);
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= column; j++){
                if (j == n - i + 1 || j == n + i - 1 || i == n){
                     sb.append('*');
                }else{
                   sb.append(' ');
                }
            }
            sb.append("\n");
        }   return sb.toString();
    }

    public static String triangle(int n){
        checkForValidInput(n, false);
        StringBuilder sb = new StringBuilder();

        int column = n + (n - 1);
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= column; j++){
                if (j > n - i && j < n + i ){
                     sb.append('*');
                }else{
                    sb.append(' ');
                }
            }
           sb.append("\n");
        }   return sb.toString();
    }

    public static String hollowDiamondPattern(int n){
        checkForValidInput(n, true);
        StringBuilder sb = new StringBuilder();

        int column = n + (n - 1);
        int mid = n - (n / 2);
        int shift;

        for (int i = 1; i <= n; i++){
            shift = (mid - i >= 0)? mid - i : -1 * (mid - i);
            for (int j = 1; j <= column; j++){
                if (j == shift + 1 || j == n - shift){
                    sb.append('*');
                }else{
                   sb.append(' ');
                }
            }
            sb.append("\n");
        }  return sb.toString();
    }

    public static String hourGlassPattern(int n){
        checkForValidInput(n, true);
        StringBuilder sb = new StringBuilder();

        int check = n - (n / 2);

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i <= check){
                    if (j <= n - i + 1 && j >= i){
                        sb.append('*');
                    }else{
                        sb.append(' ');
                    }
                }else{
                    if (j <= i && j >= n - i + 1){
                        sb.append('*');
                    }else{
                        sb.append(' ');
                    }
                }
            }
            sb.append("\n");
        }  return sb.toString();
    }

    public static String hollowHourGlassPattern(int n){
        checkForValidInput(n, true);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == n - i + 1 ||  j == i){
                     sb.append('*');
                }else{
                    sb.append(' ');
                }
            }
            sb.append("\n");
        }return sb.toString();
    }
}


