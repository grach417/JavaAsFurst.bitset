import java.util.stream.IntStream;

class BitSet {


    private int size;


    int[] arrayBitSet;


    BitSet(int size) {

        if (size % Integer.SIZE != 0) {
            this.arrayBitSet = new int[(size / Integer.SIZE) + 1];
        } else {
            this.arrayBitSet = new int[size / Integer.SIZE];
        }
        IntStream.range(0, (size / Integer.SIZE) - 1).forEach(i ->
                this.arrayBitSet[i] = 0);
        this.size = size;
    }


    BitSet intersect(BitSet set1) {
        BitSet set;
        if (this.size > set1.size) {
            set = new BitSet(set1.size);
        } else {
            set = new BitSet(this.size);
        }
        IntStream.range(0, set.arrayBitSet.length).forEach(i ->
                set.arrayBitSet[i] = this.arrayBitSet[i] & set1.arrayBitSet[i]);
        return set;
    }


    BitSet union(BitSet set2) {
        BitSet set;
        int lengthOfSet;
        if (this.size > set2.size) {
            set = new BitSet(set2.size + (this.size - set2.size));
            lengthOfSet = set2.arrayBitSet.length;
        } else {
            set = new BitSet(this.size + (set2.size - this.size));
            lengthOfSet = this.arrayBitSet.length;
        }

        IntStream.range(0, set.arrayBitSet.length).forEach(i -> {
            if (i < lengthOfSet) {
                set.arrayBitSet[i] = this.arrayBitSet[i] | set2.arrayBitSet[i];
            } else {
                if (lengthOfSet == this.arrayBitSet.length) {
                    set.arrayBitSet[i] = set2.arrayBitSet[i];
                } else {
                    set.arrayBitSet[i] = this.arrayBitSet[i];
                }
            }
        });
        return set;
    }

    BitSet complement() {
        BitSet set2 = new BitSet(this.size);
        IntStream.range(0, this.size / Integer.SIZE).forEach(i ->
                set2.arrayBitSet[i] =~ this.arrayBitSet[i]);
        return set2;
    }

    boolean containElement(int element) {
        int byt = this.arrayBitSet[element / (Integer.SIZE + 1)];
        byt >>= (Integer.SIZE - (element % Integer.SIZE));
        return byt % 2 == 1;
    }

    void remove(int element) {

        if (element <= this.size) {

            int number = element % Integer.SIZE;
            int intNum = Integer.MAX_VALUE - 1;
            if (element % Integer.SIZE == 0) {
                element = (element / Integer.SIZE) - 1;
            } else {
                element = element / Integer.SIZE;

                for (int i = 0; i < Integer.SIZE - number; i++) {
                    intNum <<= (1);
                    intNum |= 1;
                }
            }
            this.arrayBitSet[element] &= intNum;
        }

    }

    void addition(int element) {

        if (element <= this.size) {
            int number = element % Integer.SIZE;
            int intNum = 1;
            if (element % Integer.SIZE == 0) {
                element = (element / Integer.SIZE) - 1;
            } else {
                element = element / (Integer.SIZE + 1);
                intNum = intNum << (Integer.SIZE - number);
            }
            this.arrayBitSet[element] |= intNum;
        }
    }
}
