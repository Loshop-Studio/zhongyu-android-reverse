package androidx.emoji2.text.flatbuffer;

import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes2.dex */
public class FlatBufferBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: bb */
    ByteBuffer f553bb;
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
        public int read() {
            try {
                return this.buf.get() & UByte.MAX_VALUE;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int i6);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int i6) {
            return ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public FlatBufferBuilder(int i6, ByteBufferFactory byteBufferFactory) {
        this(i6, byteBufferFactory, null, Utf8.getDefault());
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
        int i6 = iCapacity == 0 ? 1 : iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferNewByteBuffer = byteBufferFactory.newByteBuffer(i6);
        byteBufferNewByteBuffer.position(byteBufferNewByteBuffer.clear().capacity() - iCapacity);
        byteBufferNewByteBuffer.put(byteBuffer);
        return byteBufferNewByteBuffer;
    }

    public static boolean isFieldPresent(Table table, int i6) {
        return table.__offset(i6) != 0;
    }

    public void Nested(int i6) {
        if (i6 != offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void addBoolean(boolean z6) {
        prep(1, 0);
        putBoolean(z6);
    }

    public void addByte(byte b7) {
        prep(1, 0);
        putByte(b7);
    }

    public void addDouble(double d6) {
        prep(8, 0);
        putDouble(d6);
    }

    public void addFloat(float f6) {
        prep(4, 0);
        putFloat(f6);
    }

    public void addInt(int i6) {
        prep(4, 0);
        putInt(i6);
    }

    public void addLong(long j6) {
        prep(8, 0);
        putLong(j6);
    }

    public void addOffset(int i6) {
        prep(4, 0);
        putInt((offset() - i6) + 4);
    }

    public void addShort(short s6) {
        prep(2, 0);
        putShort(s6);
    }

    public void addStruct(int i6, int i7, int i8) {
        if (i7 != i8) {
            Nested(i7);
            slot(i6);
        }
    }

    public void clear() {
        this.space = this.f553bb.capacity();
        this.f553bb.clear();
        this.minalign = 1;
        while (true) {
            int i6 = this.vtable_in_use;
            if (i6 <= 0) {
                this.vtable_in_use = 0;
                this.nested = false;
                this.finished = false;
                this.object_start = 0;
                this.num_vtables = 0;
                this.vector_num_elems = 0;
                return;
            }
            int[] iArr = this.vtable;
            int i7 = i6 - 1;
            this.vtable_in_use = i7;
            iArr[i7] = 0;
        }
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.f553bb;
        int i6 = this.space - length;
        this.space = i6;
        byteBuffer.position(i6);
        this.f553bb.put(bArr);
        return endVector();
    }

    public <T extends Table> int createSortedVectorOfTables(T t6, int[] iArr) {
        t6.sortTables(iArr, this.f553bb);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        int iEncodedLength = this.utf8.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, iEncodedLength, 1);
        ByteBuffer byteBuffer = this.f553bb;
        int i6 = this.space - iEncodedLength;
        this.space = i6;
        byteBuffer.position(i6);
        this.utf8.encodeUtf8(charSequence, this.f553bb);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i6, int i7, int i8) {
        int i9 = i6 * i7;
        startVector(i6, i7, i8);
        ByteBuffer byteBuffer = this.f553bb;
        int i10 = this.space - i9;
        this.space = i10;
        byteBuffer.position(i10);
        ByteBuffer byteBufferOrder = this.f553bb.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.limit(i9);
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
        return this.f553bb;
    }

    public int endTable() {
        int i6;
        if (this.vtable == null || !this.nested) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int iOffset = offset();
        int i7 = this.vtable_in_use - 1;
        while (i7 >= 0 && this.vtable[i7] == 0) {
            i7--;
        }
        for (int i8 = i7; i8 >= 0; i8--) {
            int i9 = this.vtable[i8];
            addShort((short) (i9 != 0 ? iOffset - i9 : 0));
        }
        addShort((short) (iOffset - this.object_start));
        addShort((short) ((i7 + 3) * 2));
        int i10 = 0;
        loop2: while (true) {
            if (i10 >= this.num_vtables) {
                i6 = 0;
                break;
            }
            int iCapacity = this.f553bb.capacity() - this.vtables[i10];
            int i11 = this.space;
            short s6 = this.f553bb.getShort(iCapacity);
            if (s6 == this.f553bb.getShort(i11)) {
                for (int i12 = 2; i12 < s6; i12 += 2) {
                    if (this.f553bb.getShort(iCapacity + i12) != this.f553bb.getShort(i11 + i12)) {
                        break;
                    }
                }
                i6 = this.vtables[i10];
                break loop2;
            }
            i10++;
        }
        if (i6 != 0) {
            int iCapacity2 = this.f553bb.capacity() - iOffset;
            this.space = iCapacity2;
            this.f553bb.putInt(iCapacity2, i6 - iOffset);
        } else {
            int i13 = this.num_vtables;
            int[] iArr = this.vtables;
            if (i13 == iArr.length) {
                this.vtables = Arrays.copyOf(iArr, i13 * 2);
            }
            int[] iArr2 = this.vtables;
            int i14 = this.num_vtables;
            this.num_vtables = i14 + 1;
            iArr2[i14] = offset();
            ByteBuffer byteBuffer = this.f553bb;
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

    public void finish(int i6, boolean z6) {
        prep(this.minalign, (z6 ? 4 : 0) + 4);
        addOffset(i6);
        if (z6) {
            addInt(this.f553bb.capacity() - this.space);
        }
        this.f553bb.position(this.space);
        this.finished = true;
    }

    public void finishSizePrefixed(int i6) {
        finish(i6, true);
    }

    public void finished() {
        if (!this.finished) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public FlatBufferBuilder forceDefaults(boolean z6) {
        this.force_defaults = z6;
        return this;
    }

    public FlatBufferBuilder init(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this.bb_factory = byteBufferFactory;
        this.f553bb = byteBuffer;
        byteBuffer.clear();
        this.f553bb.order(ByteOrder.LITTLE_ENDIAN);
        this.minalign = 1;
        this.space = this.f553bb.capacity();
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
        return this.f553bb.capacity() - this.space;
    }

    public void pad(int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            ByteBuffer byteBuffer = this.f553bb;
            int i8 = this.space - 1;
            this.space = i8;
            byteBuffer.put(i8, (byte) 0);
        }
    }

    public void prep(int i6, int i7) {
        if (i6 > this.minalign) {
            this.minalign = i6;
        }
        int i8 = ((~((this.f553bb.capacity() - this.space) + i7)) + 1) & (i6 - 1);
        while (this.space < i8 + i6 + i7) {
            int iCapacity = this.f553bb.capacity();
            ByteBuffer byteBuffer = this.f553bb;
            ByteBuffer byteBufferGrowByteBuffer = growByteBuffer(byteBuffer, this.bb_factory);
            this.f553bb = byteBufferGrowByteBuffer;
            if (byteBuffer != byteBufferGrowByteBuffer) {
                this.bb_factory.releaseByteBuffer(byteBuffer);
            }
            this.space += this.f553bb.capacity() - iCapacity;
        }
        pad(i8);
    }

    public void putBoolean(boolean z6) {
        ByteBuffer byteBuffer = this.f553bb;
        int i6 = this.space - 1;
        this.space = i6;
        byteBuffer.put(i6, z6 ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b7) {
        ByteBuffer byteBuffer = this.f553bb;
        int i6 = this.space - 1;
        this.space = i6;
        byteBuffer.put(i6, b7);
    }

    public void putDouble(double d6) {
        ByteBuffer byteBuffer = this.f553bb;
        int i6 = this.space - 8;
        this.space = i6;
        byteBuffer.putDouble(i6, d6);
    }

    public void putFloat(float f6) {
        ByteBuffer byteBuffer = this.f553bb;
        int i6 = this.space - 4;
        this.space = i6;
        byteBuffer.putFloat(i6, f6);
    }

    public void putInt(int i6) {
        ByteBuffer byteBuffer = this.f553bb;
        int i7 = this.space - 4;
        this.space = i7;
        byteBuffer.putInt(i7, i6);
    }

    public void putLong(long j6) {
        ByteBuffer byteBuffer = this.f553bb;
        int i6 = this.space - 8;
        this.space = i6;
        byteBuffer.putLong(i6, j6);
    }

    public void putShort(short s6) {
        ByteBuffer byteBuffer = this.f553bb;
        int i6 = this.space - 2;
        this.space = i6;
        byteBuffer.putShort(i6, s6);
    }

    public void required(int i6, int i7) {
        int iCapacity = this.f553bb.capacity() - i6;
        if (this.f553bb.getShort((iCapacity - this.f553bb.getInt(iCapacity)) + i7) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i7 + " must be set");
    }

    public byte[] sizedByteArray(int i6, int i7) {
        finished();
        byte[] bArr = new byte[i7];
        this.f553bb.position(i6);
        this.f553bb.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer byteBufferDuplicate = this.f553bb.duplicate();
        byteBufferDuplicate.position(this.space);
        byteBufferDuplicate.limit(this.f553bb.capacity());
        return new ByteBufferBackedInputStream(byteBufferDuplicate);
    }

    public void slot(int i6) {
        this.vtable[i6] = offset();
    }

    public void startTable(int i6) {
        notNested();
        int[] iArr = this.vtable;
        if (iArr == null || iArr.length < i6) {
            this.vtable = new int[i6];
        }
        this.vtable_in_use = i6;
        Arrays.fill(this.vtable, 0, i6, 0);
        this.nested = true;
        this.object_start = offset();
    }

    public void startVector(int i6, int i7, int i8) {
        notNested();
        this.vector_num_elems = i7;
        int i9 = i6 * i7;
        prep(4, i9);
        prep(i8, i9);
        this.nested = true;
    }

    public FlatBufferBuilder(int i6, ByteBufferFactory byteBufferFactory, ByteBuffer byteBuffer, Utf8 utf8) {
        this.minalign = 1;
        this.vtable = null;
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.vtables = new int[16];
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        this.force_defaults = false;
        i6 = i6 <= 0 ? 1 : i6;
        this.bb_factory = byteBufferFactory;
        if (byteBuffer != null) {
            this.f553bb = byteBuffer;
            byteBuffer.clear();
            this.f553bb.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f553bb = byteBufferFactory.newByteBuffer(i6);
        }
        this.utf8 = utf8;
        this.space = this.f553bb.capacity();
    }

    public void addBoolean(int i6, boolean z6, boolean z7) {
        if (this.force_defaults || z6 != z7) {
            addBoolean(z6);
            slot(i6);
        }
    }

    public void addByte(int i6, byte b7, int i7) {
        if (this.force_defaults || b7 != i7) {
            addByte(b7);
            slot(i6);
        }
    }

    public void addDouble(int i6, double d6, double d7) {
        if (this.force_defaults || d6 != d7) {
            addDouble(d6);
            slot(i6);
        }
    }

    public void addFloat(int i6, float f6, double d6) {
        if (this.force_defaults || f6 != d6) {
            addFloat(f6);
            slot(i6);
        }
    }

    public void addInt(int i6, int i7, int i8) {
        if (this.force_defaults || i7 != i8) {
            addInt(i7);
            slot(i6);
        }
    }

    public void addLong(int i6, long j6, long j7) {
        if (this.force_defaults || j6 != j7) {
            addLong(j6);
            slot(i6);
        }
    }

    public void addShort(int i6, short s6, int i7) {
        if (this.force_defaults || s6 != i7) {
            addShort(s6);
            slot(i6);
        }
    }

    public void finishSizePrefixed(int i6, String str) {
        finish(i6, str, true);
    }

    public void addOffset(int i6, int i7, int i8) {
        if (this.force_defaults || i7 != i8) {
            addOffset(i7);
            slot(i6);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.space, this.f553bb.capacity() - this.space);
    }

    public int createByteVector(byte[] bArr, int i6, int i7) {
        startVector(1, i7, 1);
        ByteBuffer byteBuffer = this.f553bb;
        int i8 = this.space - i7;
        this.space = i8;
        byteBuffer.position(i8);
        this.f553bb.put(bArr, i6, i7);
        return endVector();
    }

    public void finish(int i6) {
        finish(i6, false);
    }

    public int createString(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f553bb;
        int i6 = this.space - iRemaining;
        this.space = i6;
        byteBuffer2.position(i6);
        this.f553bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i6, String str, boolean z6) {
        prep(this.minalign, (z6 ? 4 : 0) + 8);
        if (str.length() == 4) {
            for (int i7 = 3; i7 >= 0; i7--) {
                addByte((byte) str.charAt(i7));
            }
            finish(i6, z6);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f553bb;
        int i6 = this.space - iRemaining;
        this.space = i6;
        byteBuffer2.position(i6);
        this.f553bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i6, String str) {
        finish(i6, str, false);
    }

    public FlatBufferBuilder(int i6) {
        this(i6, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
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
