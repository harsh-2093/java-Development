public class ReverseString {
        private final String reversedStr;

        // Constructor that accepts the string and reverses it using two pointers
        public ReverseString(String str) {
            if (str == null) {
                this.reversedStr = null;
                return;
            }

            char[] charArray = str.toCharArray();
            int left = 0;
            int right = charArray.length - 1;

            while (left < right) {
                // Swap characters at the left and right positions
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                // Move the pointers towards each other
                left++;
                right--;
            }

            this.reversedStr = new String(charArray);
        }

        // Getter method to retrieve the reversed result
        public String getReversedString() {
            return this.reversedStr;
        }
    }
