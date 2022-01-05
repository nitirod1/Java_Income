import java.net.ProtocolException;
import java.util.Scanner;
import java.util.regex.Pattern;

interface something {
    public void Income(float income);

    public void Outcome(float outcome);

    public void Result();
}

interface checkError {
    public int find_locate(String input);
}

class Income_outcome implements something {
    private float money;
    private float income;
    private float outcome;

    public Income_outcome(float money, float income, float outcome) {
        this.money = money;
        this.income = income;
        this.outcome = outcome;
    }

    public void Income(float income) {
        this.money = this.money + income;
    }

    public void Outcome(float outcome) {
        this.money = this.money - outcome;
    }

    public void Result() {
        System.out.println(this.income);
        System.out.println(this.outcome);
        System.out.println(this.money);
    }
}

class ErrorInput implements checkError {
    public int find_locate(String input) {
        String str = "+-0";
        return str.indexOf(input);
    }
}

public class Progress_income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Income_outcome p1 = new Income_outcome(500, 0, 0);
        ErrorInput p2 = new ErrorInput();
        System.out.println("select option");
        String progress = sc.nextLine();
        int choose = p2.find_locate(progress);
        while (choose > -1 && choose < 2) {
            System.out.print("amount money");
            float amount = 0;
            try {
                amount = Float.parseFloat(sc.nextLine());
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (choose == 0) {
                p1.Income(amount);
            } else if (choose == 1) {
                p1.Outcome(amount);
            } else {
                System.out.println("Error" + choose);
            }
            System.out.println("select option");
            progress = sc.nextLine();
            System.out.print(progress);
            choose = p2.find_locate(progress);
        }
        sc.close();
        p1.Result();
    }
}