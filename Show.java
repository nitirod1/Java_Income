interface shape {
    public void draw(int size);

    public void draw(int width, int height);

    public void draw_tri(int size);
}

class DrawingShape implements shape {
    public void draw(int size) {
        int i = 0;
        int j = 0;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void draw(int width, int height) {
        int i = 0;
        int j = 0;
        for (i = 0; i < height; i++) {
            for (j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void draw_tri(int size) {
        int i = 0;
        int j = 0;
        boolean flag = false;
        for (i = 0; i < size; i++) {
            for (j = 0; j <= (size * 2) - 1; j++) {
                if (((size * 2) / 2) - i <= j && ((size * 2) / 2) + i >= j) {
                    if (flag != true) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    flag = !flag;
                } else {
                    System.out.print(" ");
                }
            }
            flag = false;
            System.out.println("");
        }

    }
}

public class Show {
    public static void main(String[] args) {
        DrawingShape p1 = new DrawingShape();
        
    }
}