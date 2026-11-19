package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes.dex */
public class FlatBufferBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: bb */
    ByteBuffer f391bb;
    ByteBufferFactory bb_factory;
    boolean finished;
    boolean force_defaults;
    int minalign;
    boolean nested;
    int num_vtables;
    int object_start;
    int space;
    final Utf8 utf8;
    int vector_num_elems;
    int[] vtable;
    int vtable_in_use;
    int[] vtables;

    public static class ByteBufferBackedInputStream extends InputStream {
        ByteBuffer buf;

        public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
            this.buf = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.buf.get() & UByte.MAX_VALUE;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int i4);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int i4) {
            return ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public FlatBufferBuilder(int i4, ByteBufferFactory byteBufferFactory) {
        this(i4, byteBufferFactory, null, Utf8.getDefault());
    }

    @Deprecated
    private int dataStart() {
        finished();
        return this.space;
    }

    public static ByteBuffer growByteBuffer(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        int iCapacity = byteBuffer.capacity();
        if (((-1073741824) & iCapacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i4 = iCapacity == 0 ? 1 : iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferNewByteBuffer = byteBufferFactory.newByteBuffer(i4);
        byteBufferNewByteBuffer.position(byteBufferNewByteBuffer.clear().capacity() - iCapacity);
        byteBufferNewByteBuffer.put(byteBuffer);
        return byteBufferNewByteBuffer;
    }

    public static boolean isFieldPresent(Table table, int i4) {
        return table.__offset(i4) != 0;
    }

    public void Nested(int i4) {
        if (i4 != offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void addBoolean(boolean z3) {
        prep(1, 0);
        putBoolean(z3);
    }

    public void addByte(byte b4) {
        prep(1, 0);
        putByte(b4);
    }

    public void addDouble(double d4) {
        prep(8, 0);
        putDouble(d4);
    }

    public void addFloat(float f4) {
        prep(4, 0);
        putFloat(f4);
    }

    public void addInt(int i4) {
        prep(4, 0);
        putInt(i4);
    }

    public void addLong(long j4) {
        prep(8, 0);
        putLong(j4);
    }

    public void addOffset(int i4) {
        prep(4, 0);
        putInt((offset() - i4) + 4);
    }

    public void addShort(short s3) {
        prep(2, 0);
        putShort(s3);
    }

    public void addStruct(int i4, int i5, int i6) {
        if (i5 != i6) {
            Nested(i5);
            slot(i4);
        }
    }

    public void clear() {
        this.space = this.f391bb.capacity();
        this.f391bb.clear();
        this.minalign = 1;
        while (true) {
            int i4 = this.vtable_in_use;
            if (i4 <= 0) {
                this.vtable_in_use = 0;
                this.nested = false;
                this.finished = false;
                this.object_start = 0;
                this.num_vtables = 0;
                this.vector_num_elems = 0;
                return;
            }
            int[] iArr = this.vtable;
            int i5 = i4 - 1;
            this.vtable_in_use = i5;
            iArr[i5] = 0;
        }
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.f391bb;
        int i4 = this.space - length;
        this.space = i4;
        byteBuffer.position(i4);
        this.f391bb.put(bArr);
        return endVector();
    }

    public <T extends Table> int createSortedVectorOfTables(T t3, int[] iArr) {
        t3.sortTables(iArr, this.f391bb);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        int iEncodedLength = this.utf8.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, iEncodedLength, 1);
        ByteBuffer byteBuffer = this.f391bb;
        int i4 = this.space - iEncodedLength;
        this.space = i4;
        byteBuffer.position(i4);
        this.utf8.encodeUtf8(charSequence, this.f391bb);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i4, int i5, int i6) {
        int i7 = i4 * i5;
        startVector(i4, i5, i6);
        ByteBuffer byteBuffer = this.f391bb;
        int i8 = this.space - i7;
        this.space = i8;
        byteBuffer.position(i8);
        ByteBuffer byteBufferOrder = this.f391bb.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.limit(i7);
        return byteBufferOrder;
    }

    public int createVectorOfTables(int[] iArr) {
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public ByteBuffer dataBuffer() {
        finished();
        return this.f391bb;
    }

    public int endTable() {
        int i4;
        if (this.vtable == null || !this.nested) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int iOffset = offset();
        int i5 = this.vtable_in_use - 1;
        while (i5 >= 0 && this.vtable[i5] == 0) {
            i5--;
        }
        int i6 = i5 + 1;
        while (i5 >= 0) {
            int i7 = this.vtable[i5];
            addShort((short) (i7 != 0 ? iOffset - i7 : 0));
            i5--;
        }
        addShort((short) (iOffset - this.object_start));
        addShort((short) ((i6 + 2) * 2));
        int i8 = 0;
        loop2: while (true) {
            if (i8 >= this.num_vtables) {
                i4 = 0;
                break;
            }
            int iCapacity = this.f391bb.capacity() - this.vtables[i8];
            int i9 = this.space;
            short s3 = this.f391bb.getShort(iCapacity);
            if (s3 == this.f391bb.getShort(i9)) {
                for (int i10 = 2; i10 < s3; i10 += 2) {
                    if (this.f391bb.getShort(iCapacity + i10) != this.f391bb.getShort(i9 + i10)) {
                        break;
                    }
                }
                i4 = this.vtables[i8];
                break loop2;
            }
            i8++;
        }
        if (i4 != 0) {
            int iCapacity2 = this.f391bb.capacity() - iOffset;
            this.space = iCapacity2;
            this.f391bb.putInt(iCapacity2, i4 - iOffset);
        } else {
            int i11 = this.num_vtables;
            int[] iArr = this.vtables;
            if (i11 == iArr.length) {
                this.vtables = Arrays.copyOf(iArr, i11 * 2);
            }
            int[] iArr2 = this.vtables;
            int i12 = this.num_vtables;
            this.num_vtables = i12 + 1;
            iArr2[i12] = offset();
            ByteBuffer byteBuffer = this.f391bb;
            byteBuffer.putInt(byteBuffer.capacity() - iOffset, offset() - iOffset);
        }
        this.nested = false;
        return iOffset;
    }

    public int endVector() {
        if (!this.nested) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.nested = false;
        putInt(this.vector_num_elems);
        return offset();
    }

    public void finish(int i4, boolean z3) {
        prep(this.minalign, (z3 ? 4 : 0) + 4);
        addOffset(i4);
        if (z3) {
            addInt(this.f391bb.capacity() - this.space);
        }
        this.f391bb.position(this.space);
        this.finished = true;
    }

    public void finishSizePrefixed(int i4) {
        finish(i4, true);
    }

    public void finished() {
        if (!this.finished) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public FlatBufferBuilder forceDefaults(boolean z3) {
        this.force_defaults = z3;
        return this;
    }

    public FlatBufferBuilder init(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this.bb_factory = byteBufferFactory;
        this.f391bb = byteBuffer;
        byteBuffer.clear();
        this.f391bb.order(ByteOrder.LITTLE_ENDIAN);
        this.minalign = 1;
        this.space = this.f391bb.capacity();
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.object_start = 0;
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        return this;
    }

    public void notNested() {
        if (this.nested) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        return this.f391bb.capacity() - this.space;
    }

    public void pad(int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer = this.f391bb;
            int i6 = this.space - 1;
            this.space = i6;
            byteBuffer.put(i6, (byte) 0);
        }
    }

    public void prep(int i4, int i5) {
        if (i4 > this.minalign) {
            this.minalign = i4;
        }
        int i6 = ((~((this.f391bb.capacity() - this.space) + i5)) + 1) & (i4 - 1);
        while (this.space < i6 + i4 + i5) {
            int iCapacity = this.f391bb.capacity();
            ByteBuffer byteBuffer = this.f391bb;
            ByteBuffer byteBufferGrowByteBuffer = growByteBuffer(byteBuffer, this.bb_factory);
            this.f391bb = byteBufferGrowByteBuffer;
            if (byteBuffer != byteBufferGrowByteBuffer) {
                this.bb_factory.releaseByteBuffer(byteBuffer);
            }
            this.space += this.f391bb.capacity() - iCapacity;
        }
        pad(i6);
    }

    public void putBoolean(boolean z3) {
        ByteBuffer byteBuffer = this.f391bb;
        int i4 = this.space - 1;
        this.space = i4;
        byteBuffer.put(i4, z3 ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b4) {
        ByteBuffer byteBuffer = this.f391bb;
        int i4 = this.space - 1;
        this.space = i4;
        byteBuffer.put(i4, b4);
    }

    public void putDouble(double d4) {
        ByteBuffer byteBuffer = this.f391bb;
        int i4 = this.space - 8;
        this.space = i4;
        byteBuffer.putDouble(i4, d4);
    }

    public void putFloat(float f4) {
        ByteBuffer byteBuffer = this.f391bb;
        int i4 = this.space - 4;
        this.space = i4;
        byteBuffer.putFloat(i4, f4);
    }

    public void putInt(int i4) {
        ByteBuffer byteBuffer = this.f391bb;
        int i5 = this.space - 4;
        this.space = i5;
        byteBuffer.putInt(i5, i4);
    }

    public void putLong(long j4) {
        ByteBuffer byteBuffer = this.f391bb;
        int i4 = this.space - 8;
        this.space = i4;
        byteBuffer.putLong(i4, j4);
    }

    public void putShort(short s3) {
        ByteBuffer byteBuffer = this.f391bb;
        int i4 = this.space - 2;
        this.space = i4;
        byteBuffer.putShort(i4, s3);
    }

    public void required(int i4, int i5) {
        int iCapacity = this.f391bb.capacity() - i4;
        if (this.f391bb.getShort((iCapacity - this.f391bb.getInt(iCapacity)) + i5) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i5 + " must be set");
    }

    public byte[] sizedByteArray(int i4, int i5) {
        finished();
        byte[] bArr = new byte[i5];
        this.f391bb.position(i4);
        this.f391bb.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer byteBufferDuplicate = this.f391bb.duplicate();
        byteBufferDuplicate.position(this.space);
        byteBufferDuplicate.limit(this.f391bb.capacity());
        return new ByteBufferBackedInputStream(byteBufferDuplicate);
    }

    public void slot(int i4) {
        this.vtable[i4] = offset();
    }

    public void startTable(int i4) {
        notNested();
        int[] iArr = this.vtable;
        if (iArr == null || iArr.length < i4) {
            this.vtable = new int[i4];
        }
        this.vtable_in_use = i4;
        Arrays.fill(this.vtable, 0, i4, 0);
        this.nested = true;
        this.object_start = offset();
    }

    public void startVector(int i4, int i5, int i6) {
        notNested();
        this.vector_num_elems = i5;
        int i7 = i4 * i5;
        prep(4, i7);
        prep(i6, i7);
        this.nested = true;
    }

    public FlatBufferBuilder(int i4, ByteBufferFactory byteBufferFactory, ByteBuffer byteBuffer, Utf8 utf8) {
        this.minalign = 1;
        this.vtable = null;
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.vtables = new int[16];
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        this.force_defaults = false;
        i4 = i4 <= 0 ? 1 : i4;
        this.bb_factory = byteBufferFactory;
        if (byteBuffer != null) {
            this.f391bb = byteBuffer;
            byteBuffer.clear();
            this.f391bb.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f391bb = byteBufferFactory.newByteBuffer(i4);
        }
        this.utf8 = utf8;
        this.space = this.f391bb.capacity();
    }

    public void addBoolean(int i4, boolean z3, boolean z4) {
        if (this.force_defaults || z3 != z4) {
            addBoolean(z3);
            slot(i4);
        }
    }

    public void addByte(int i4, byte b4, int i5) {
        if (this.force_defaults || b4 != i5) {
            addByte(b4);
            slot(i4);
        }
    }

    public void addDouble(int i4, double d4, double d5) {
        if (this.force_defaults || d4 != d5) {
            addDouble(d4);
            slot(i4);
        }
    }

    public void addFloat(int i4, float f4, double d4) {
        if (this.force_defaults || f4 != d4) {
            addFloat(f4);
            slot(i4);
        }
    }

    public void addInt(int i4, int i5, int i6) {
        if (this.force_defaults || i5 != i6) {
            addInt(i5);
            slot(i4);
        }
    }

    public void addLong(int i4, long j4, long j5) {
        if (this.force_defaults || j4 != j5) {
            addLong(j4);
            slot(i4);
        }
    }

    public void addShort(int i4, short s3, int i5) {
        if (this.force_defaults || s3 != i5) {
            addShort(s3);
            slot(i4);
        }
    }

    public void finishSizePrefixed(int i4, String str) {
        finish(i4, str, true);
    }

    public void addOffset(int i4, int i5, int i6) {
        if (this.force_defaults || i5 != i6) {
            addOffset(i5);
            slot(i4);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.space, this.f391bb.capacity() - this.space);
    }

    public int createByteVector(byte[] bArr, int i4, int i5) {
        startVector(1, i5, 1);
        ByteBuffer byteBuffer = this.f391bb;
        int i6 = this.space - i5;
        this.space = i6;
        byteBuffer.position(i6);
        this.f391bb.put(bArr, i4, i5);
        return endVector();
    }

    public void finish(int i4) {
        finish(i4, false);
    }

    public int createString(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f391bb;
        int i4 = this.space - iRemaining;
        this.space = i4;
        byteBuffer2.position(i4);
        this.f391bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i4, String str, boolean z3) {
        prep(this.minalign, (z3 ? 4 : 0) + 8);
        if (str.length() == 4) {
            for (int i5 = 3; i5 >= 0; i5--) {
                addByte((byte) str.charAt(i5));
            }
            finish(i4, z3);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f391bb;
        int i4 = this.space - iRemaining;
        this.space = i4;
        byteBuffer2.position(i4);
        this.f391bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i4, String str) {
        finish(i4, str, false);
    }

    public FlatBufferBuilder(int i4) {
        this(i4, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
    }

    public FlatBufferBuilder() {
        this(1024);
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this(byteBuffer.capacity(), byteBufferFactory, byteBuffer, Utf8.getDefault());
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, new HeapByteBufferFactory());
    }
}
