public class Main {
    public static void main(String[]args){
        int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        double[][] doubles = {{2.0,2.5,3.0},{4.0,5.0,2.5}};
        boolean[][] booleans = {{true,false,false},{true,true,false},{false,true,true}};
        String[][] words = {{"hello,","world"},{"four","five"}};
        Stick[][] storage = {{new Stick(4), new Stick(6)}, {new Stick(8), new Stick(10)}};

        numbers[0][1] = 4;
        doubles[1][2] = 3.0;
        booleans[0][2] = true;
        words[0][1] = "under";
        storage[0][1] = new Stick(5);

        // Row Major
        for (int i = 0; i < numbers.length;i++){
            for (int n = 0; n<numbers[0].length;n++){
                System.out.println(numbers[i][n]);
            }
        }
        for (int i = 0; i < doubles.length;i++){
            for (int n = 0; n<doubles[0].length;n++){
                System.out.println(doubles[i][n]);
            }
        }
        for (int i = 0; i < booleans.length;i++){
            for (int n = 0; n<booleans[0].length;n++){
                System.out.println(booleans[i][n]);
            }
        }
        for (int i = 0; i < words.length;i++){
            for (int n = 0; n<words[0].length;n++){
                System.out.println(words[i][n]);
            }
        }
        for (int i = 0; i < storage.length;i++){
            for (int n = 0; n<storage[0].length;n++){
                System.out.println(storage[i][n]);
            }
        }

        // Column Major
        for (int i = 0; i < numbers[0].length;i++){
            for (int n = 0; n< numbers.length;n++){
                System.out.println(numbers[n][i]);
            }
        }
        for (int i = 0; i < doubles[0].length;i++){
            for (int n = 0; n< doubles.length;n++){
                System.out.println(doubles[n][i]);
            }
        }
        for (int i = 0; i < booleans[0].length;i++){
            for (int n = 0; n< booleans.length;n++){
                System.out.println(booleans[n][i]);
            }
        }
        for (int i = 0; i < words[0].length;i++){
            for (int n = 0; n< words.length;n++){
                System.out.println(words[n][i]);
            }
        }
        for (int i = 0; i < storage[0].length;i++){
            for (int n = 0; n<storage.length;n++){
                System.out.println(storage[n][i]);
            }
        }
    }
}
