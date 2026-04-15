package HW5;

public class IntegerSet02 {
    private boolean[] set;

    public IntegerSet02() {
        set = new boolean[101];
    }

    public static IntegerSet02 union(IntegerSet02 s1, IntegerSet02 s2) {
        IntegerSet02 result = new IntegerSet02();
        for (int i = 0; i <= 100; i++) {
            if (s1.set[i] || s2.set[i]) {
                result.set[i] = true;
            }
        }
        return result;
    }

    public static IntegerSet02 intersection(IntegerSet02 s1, IntegerSet02 s2) {
        IntegerSet02 result = new IntegerSet02();
        for (int i = 0; i <= 100; i++) {
            if (s1.set[i] && s2.set[i]) {
                result.set[i] = true;
            }
        }
        return result;
    }

    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        }
    }

    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        }
    }

    public String toString() {
        String result = "{ ";
        boolean isEmpty = true;

        for (int i = 0; i <= 100; i++) {
            if (set[i]) {
                if (!isEmpty) {
                    result += ", ";
                }
                result += i;
                isEmpty = false;
            }
        }

        if (isEmpty) {
            return "{ --- }";
        } else {
            return result + " }";
        }
    }

    public boolean isEqualTo(IntegerSet02 otherSet) {
        for (int i = 0; i <= 100; i++) {
            if (this.set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }
}