package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class Table {

    /* renamed from: bb */
    protected ByteBuffer f396bb;
    protected int bb_pos;
    Utf8 utf8 = Utf8.getDefault();
    private int vtable_size;
    private int vtable_start;

    public static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i4 = 0; i4 < 4; i4++) {
            if (str.charAt(i4) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i4))) {
                return false;
            }
        }
        return true;
    }

    public static int compareStrings(int i4, int i5, ByteBuffer byteBuffer) {
        int i6 = i4 + byteBuffer.getInt(i4);
        int i7 = i5 + byteBuffer.getInt(i5);
        int i8 = byteBuffer.getInt(i6);
        int i9 = byteBuffer.getInt(i7);
        int i10 = i6 + 4;
        int i11 = i7 + 4;
        int iMin = Math.min(i8, i9);
        for (int i12 = 0; i12 < iMin; i12++) {
            int i13 = i12 + i10;
            int i14 = i12 + i11;
            if (byteBuffer.get(i13) != byteBuffer.get(i14)) {
                return byteBuffer.get(i13) - byteBuffer.get(i14);
            }
        }
        return i8 - i9;
    }

    public int __indirect(int i4) {
        return i4 + this.f396bb.getInt(i4);
    }

    public int __offset(int i4) {
        if (i4 < this.vtable_size) {
            return this.f396bb.getShort(this.vtable_start + i4);
        }
        return 0;
    }

    public void __reset(int i4, ByteBuffer byteBuffer) {
        this.f396bb = byteBuffer;
        if (byteBuffer == null) {
            this.bb_pos = 0;
            this.vtable_start = 0;
            this.vtable_size = 0;
        } else {
            this.bb_pos = i4;
            int i5 = i4 - byteBuffer.getInt(i4);
            this.vtable_start = i5;
            this.vtable_size = this.f396bb.getShort(i5);
        }
    }

    public String __string(int i4) {
        return __string(i4, this.f396bb, this.utf8);
    }

    public Table __union(Table table, int i4) {
        return __union(table, i4, this.f396bb);
    }

    public int __vector(int i4) {
        int i5 = i4 + this.bb_pos;
        return i5 + this.f396bb.getInt(i5) + 4;
    }

    public ByteBuffer __vector_as_bytebuffer(int i4, int i5) {
        int i__offset = __offset(i4);
        if (i__offset == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.f396bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i__vector = __vector(i__offset);
        byteBufferOrder.position(i__vector);
        byteBufferOrder.limit(i__vector + (__vector_len(i__offset) * i5));
        return byteBufferOrder;
    }

    public ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i4, int i5) {
        int i__offset = __offset(i4);
        if (i__offset == 0) {
            return null;
        }
        int i__vector = __vector(i__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(i__offset) * i5) + i__vector);
        byteBuffer.position(i__vector);
        return byteBuffer;
    }

    public int __vector_len(int i4) {
        int i5 = i4 + this.bb_pos;
        return this.f396bb.getInt(i5 + this.f396bb.getInt(i5));
    }

    public ByteBuffer getByteBuffer() {
        return this.f396bb;
    }

    public int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    public void sortTables(int[] iArr, final ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            numArr[i4] = Integer.valueOf(iArr[i4]);
        }
        Arrays.sort(numArr, new Comparator<Integer>() { // from class: androidx.emoji2.text.flatbuffer.Table.1
            @Override // java.util.Comparator
            public int compare(Integer num, Integer num2) {
                return Table.this.keysCompare(num, num2, byteBuffer);
            }
        });
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = numArr[i5].intValue();
        }
    }

    public static int __indirect(int i4, ByteBuffer byteBuffer) {
        return i4 + byteBuffer.getInt(i4);
    }

    public static int __offset(int i4, int i5, ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - i5;
        return byteBuffer.getShort((i4 + iCapacity) - byteBuffer.getInt(iCapacity)) + iCapacity;
    }

    public static String __string(int i4, ByteBuffer byteBuffer, Utf8 utf8) {
        int i5 = i4 + byteBuffer.getInt(i4);
        return utf8.decodeUtf8(byteBuffer, i5 + 4, byteBuffer.getInt(i5));
    }

    public static Table __union(Table table, int i4, ByteBuffer byteBuffer) {
        table.__reset(__indirect(i4, byteBuffer), byteBuffer);
        return table;
    }

    public static int compareStrings(int i4, byte[] bArr, ByteBuffer byteBuffer) {
        int i5 = i4 + byteBuffer.getInt(i4);
        int i6 = byteBuffer.getInt(i5);
        int length = bArr.length;
        int i7 = i5 + 4;
        int iMin = Math.min(i6, length);
        for (int i8 = 0; i8 < iMin; i8++) {
            int i9 = i8 + i7;
            if (byteBuffer.get(i9) != bArr[i8]) {
                return byteBuffer.get(i9) - bArr[i8];
            }
        }
        return i6 - length;
    }

    public void __reset() {
        __reset(0, null);
    }
}
