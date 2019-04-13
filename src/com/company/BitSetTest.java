import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BitSetTest {

    @Test
    void intersect(){
        BitSet s = new BitSet(320);
        s.addition(32);
        s.addition(32*2);
        s.addition(32*3);
        s.addition(32*6);
        s.addition(32*8);
        BitSet s1 = new BitSet(320);
        s1.addition(32);
        s1.addition(32*2);
        s1.addition(32*3);
        s1.addition(32*7);
        s1.addition(32*9);
        BitSet m = s.intersect(s1);
        Assert.assertEquals("[1, 1, 1, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(m.arrayBitSet));
    }
    @Test
    void union(){
        BitSet s = new BitSet(320);
        s.addition(32);
        s.addition(32*2);
        s.addition(32*3);
        s.addition(32*6);
        s.addition(32*8);
        BitSet s1 = new BitSet(320);
        s1.addition(32);
        s1.addition(32*2);
        s1.addition(32*3);
        s1.addition(32*7);
        s1.addition(32*9);
        BitSet m = s.union(s1);
        Assert.assertEquals("[1, 1, 1, 0, 0, 1, 1, 1, 1, 0]", Arrays.toString(m.arrayBitSet));
    }
    @Test
    void complement(){
        BitSet s = new BitSet(320);
        s.addition(32);
        s.addition(32*2);
        s.addition(32*3);
        s.addition(32*6);
        s.addition(32*8);
        BitSet s1 = new BitSet(320);
        s1.addition(32);
        s1.addition(32*2);
        s1.addition(32*3);
        s1.addition(32*7);
        s1.addition(32*9);
        BitSet m = s.complement();
        BitSet m1 = s1.complement();
        Assert.assertEquals("[-2, -2, -2, -1, -1, -2, -1, -2, -1, -1]", Arrays.toString(m.arrayBitSet));
        Assert.assertEquals("[-2, -2, -2, -1, -1, -1, -2, -1, -2, -1]", Arrays.toString(m1.arrayBitSet));

        }
    @Test
    void containElement(){
        BitSet s = new BitSet(320);
        s.addition(32);
        s.addition(32*2);
        s.addition(32*3);
        s.addition(32*6);
        s.addition(32*8);
        BitSet s1 = new BitSet(320);
        s1.addition(32);
        s1.addition(32*2);
        s1.addition(32*3);
        s1.addition(32*7);
        s1.addition(32*9);

        Assert.assertFalse(s.containElement(32*4));
        Assert.assertFalse(s1.containElement(32*5));

        Assert.assertTrue(s.containElement(32*2));
        Assert.assertTrue(s1.containElement(32*7));

    }
    @Test
    void addition(){
        BitSet s = new BitSet(320);
        s.addition(32);
        Assert.assertEquals("[1, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(s.arrayBitSet));
        BitSet s1 = new BitSet(320);
        s1.addition(32*2);
        Assert.assertEquals("[0, 1, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(s1.arrayBitSet));
    }
    @Test
    void remove(){
        BitSet s = new BitSet(320);
        s.addition(32);
        s.addition(32*2);
        s.addition(32*3);
        s.addition(32*6);
        s.addition(32*8);

        s.remove(32);
        Assert.assertEquals("[0, 1, 1, 0, 0, 1, 0, 1, 0, 0]", Arrays.toString(s.arrayBitSet));

        BitSet s1 = new BitSet(320);
        s1.addition(32);
        s1.addition(32*2);
        s1.addition(32*3);
        s1.addition(32*7);
        s1.addition(32*9);

        s1.remove(32);
        Assert.assertEquals("[0, 1, 1, 0, 0, 0, 1, 0, 1, 0]", Arrays.toString(s1.arrayBitSet));
    }
}
