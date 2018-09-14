public class Task6 {
    public static String inWords(int number){
        String numS = Integer.toString(number);
        int len = numS.length();
        String zero = "zero";
        String[] digits = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] twoDigits = {"", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};
        String[] others = { "hundred" ,"thousands"};
        String intInWord = "";
        int q;
        int m;

        if(number == 0)
            return zero;

        if(len == 1){
            for(int i = 0; i < 10; i++){
                if(i == number){
                    return digits[i];
                }
            }
        }

        else if(len == 2){
            if(number >= 10 && number <= 19){
                for(int i = 0; i < 10; i++){
                    if(i + 10 == number){
                        return teens[i];
                    }
                }
            }
            else{
                q = number/10;
                m = number%10;

                for(int i = 0; i < 10; i++){
                    if(i == q){
                        intInWord = intInWord.concat(twoDigits[i]);
                        intInWord = intInWord.concat(" ");
                    }
                }

                for(int j = 0; j < 10; j++){
                    if(j == m){
                        intInWord = intInWord.concat(digits[j]);
                    }
                }

                return intInWord;
            }
        }

        else if(len == 3){
            q = number/100;
            m = number%100;

            for(int i = 0; i < 10; i++){
                if(i == q){
                    intInWord = intInWord.concat(digits[i]);
                    intInWord = intInWord.concat(" ");
                    intInWord = intInWord.concat(others[0]);
                }
            }

            if(m != 0){
                intInWord = intInWord.concat(" ");
                if(m > 0 && m < 10){
                    for(int i = 0; i < 10; i++){
                        if(i == m){
                            intInWord.concat(digits[i]);
                        }
                    }
                }
                else if(m >= 10 && m <= 19){
                    for(int i = 0; i < 10; i++){
                        if(i + 10 == m){
                            intInWord = intInWord.concat(teens[i]);
                        }
                    }
                }
                else{
                    q = m/10;
                    m = m%10;

                    for(int i = 0; i < 10; i++){
                        if(i == q){
                            intInWord = intInWord.concat(twoDigits[i]);
                            intInWord = intInWord.concat(" ");
                        }
                    }

                    for(int j = 0; j < 10; j++){
                        if(j == m){
                            intInWord = intInWord.concat(digits[j]);
                        }
                    }
                }

                return intInWord;
            }
        }
        else {
            q = number/1000;
            m = number%1000;

            if(q > 0 && q < 10){
                for(int i = 0; i < 10; i++){
                    if(i == q){
                        intInWord = intInWord.concat(digits[i]);
                        intInWord = intInWord.concat(" ");
                    }
                }
            }

            else if(q >= 10 && q <= 19){
                for(int i = 0; i < 10; i++){
                    if(i + 10 == number){
                        intInWord = intInWord.concat(teens[i]);
                        intInWord = intInWord.concat(" ");
                    }
                }
            }
            else{
                q = q/10;
                m = q%10;

                for(int i = 0; i < 10; i++){
                    if(i == q){
                        intInWord = intInWord.concat(twoDigits[i]);
                        intInWord = intInWord.concat(" ");
                    }
                }

                if(m != 0){
                    for(int j = 0; j < 10; j++){
                        if(j == m){
                            intInWord = intInWord.concat(digits[j]);
                            intInWord = intInWord.concat(" ");
                        }
                    }
                }
            }

            intInWord = intInWord.concat(others[1]);

            m = number%1000;

            if(m != 0){
                intInWord = intInWord.concat(" ");
                q = m/100;
                m = m%100;

                for(int i = 0; i < 10; i++){
                    if(i == q){
                        intInWord = intInWord.concat(digits[i]);
                        intInWord = intInWord.concat(" ");
                        intInWord = intInWord.concat(others[0]);
                    }
                }

                if(m != 0) {
                    intInWord = intInWord.concat(" ");
                    if (m > 0 && m < 10) {
                        for (int i = 0; i < 10; i++) {
                            if (i == m) {
                                intInWord.concat(digits[i]);
                            }
                        }
                    }
                    else if (m >= 10 && m <= 19) {
                        for (int i = 0; i < 10; i++) {
                            if (i + 10 == m) {
                                intInWord = intInWord.concat(teens[i]);
                            }
                        }
                    }
                    else {
                        q = m / 10;
                        m = m % 10;

                        for (int i = 0; i < 10; i++) {
                            if (i == q) {
                                intInWord = intInWord.concat(twoDigits[i]);
                                intInWord = intInWord.concat(" ");
                            }
                        }
                        if(m != 0){
                            for (int j = 0; j < 10; j++) {
                                if (j == m) {
                                    intInWord = intInWord.concat(digits[j]);
                                }
                            }
                        }
                    }
                }
            }
        }
        return intInWord;
    }

    public static void main(String[] args){
        int number = 99999;
        String inwords = inWords(number);
        System.out.print(inwords);
    }
}

