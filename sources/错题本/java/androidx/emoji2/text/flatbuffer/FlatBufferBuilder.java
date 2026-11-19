package androidx.emoji2.text.flatbuffer;

import android.support.v4.media.AbstractC0037f;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class FlatBufferBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: bb */
    ByteBuffer f1084bb;
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
                return this.buf.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int i);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public FlatBufferBuilder(int i, ByteBufferFactory byteBufferFactory) {
        this(i, byteBufferFactory, null, Utf8.getDefault());
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
        int i = iCapacity == 0 ? 1 : iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferNewByteBuffer = byteBufferFactory.newByteBuffer(i);
        byteBufferNewByteBuffer.position(byteBufferNewByteBuffer.clear().capacity() - iCapacity);
        byteBufferNewByteBuffer.put(byteBuffer);
        return byteBufferNewByteBuffer;
    }

    public static boolean isFieldPresent(Table table, int i) {
        return table.__offset(i) != 0;
    }

    public void Nested(int i) {
        if (i != offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void addBoolean(boolean z8) {
        prep(1, 0);
        putBoolean(z8);
    }

    public void addByte(byte b6) {
        prep(1, 0);
        putByte(b6);
    }

    public void addDouble(double d9) {
        prep(8, 0);
        putDouble(d9);
    }

    public void addFloat(float f) {
        prep(4, 0);
        putFloat(f);
    }

    public void addInt(int i) {
        prep(4, 0);
        putInt(i);
    }

    public void addLong(long j7) {
        prep(8, 0);
        putLong(j7);
    }

    public void addOffset(int i) {
        prep(4, 0);
        putInt((offset() - i) + 4);
    }

    public void addShort(short s8) {
        prep(2, 0);
        putShort(s8);
    }

    public void addStruct(int i, int i8, int i9) {
        if (i8 != i9) {
            Nested(i8);
            slot(i);
        }
    }

    public void clear() {
        this.space = this.f1084bb.capacity();
        this.f1084bb.clear();
        this.minalign = 1;
        while (true) {
            int i = this.vtable_in_use;
            if (i <= 0) {
                this.vtable_in_use = 0;
                this.nested = false;
                this.finished = false;
                this.object_start = 0;
                this.num_vtables = 0;
                this.vector_num_elems = 0;
                return;
            }
            int[] iArr = this.vtable;
            int i8 = i - 1;
            this.vtable_in_use = i8;
            iArr[i8] = 0;
        }
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.f1084bb;
        int i = this.space - length;
        this.space = i;
        byteBuffer.position(i);
        this.f1084bb.put(bArr);
        return endVector();
    }

    public <T extends Table> int createSortedVectorOfTables(T t8, int[] iArr) {
        t8.sortTables(iArr, this.f1084bb);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        int iEncodedLength = this.utf8.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, iEncodedLength, 1);
        ByteBuffer byteBuffer = this.f1084bb;
        int i = this.space - iEncodedLength;
        this.space = i;
        byteBuffer.position(i);
        this.utf8.encodeUtf8(charSequence, this.f1084bb);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i, int i8, int i9) {
        int i10 = i * i8;
        startVector(i, i8, i9);
        ByteBuffer byteBuffer = this.f1084bb;
        int i11 = this.space - i10;
        this.space = i11;
        byteBuffer.position(i11);
        ByteBuffer byteBufferOrder = this.f1084bb.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.limit(i10);
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
        return this.f1084bb;
    }

    public int endTable() {
        int i;
        if (this.vtable == null || !this.nested) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int iOffset = offset();
        int i8 = this.vtable_in_use - 1;
        while (i8 >= 0 && this.vtable[i8] == 0) {
            i8--;
        }
        for (int i9 = i8; i9 >= 0; i9--) {
            int i10 = this.vtable[i9];
            addShort((short) (i10 != 0 ? iOffset - i10 : 0));
        }
        addShort((short) (iOffset - this.object_start));
        addShort((short) ((i8 + 3) * 2));
        int i11 = 0;
        loop2: while (true) {
            if (i11 >= this.num_vtables) {
                i = 0;
                break;
            }
            int iCapacity = this.f1084bb.capacity() - this.vtables[i11];
            int i12 = this.space;
            short s8 = this.f1084bb.getShort(iCapacity);
            if (s8 == this.f1084bb.getShort(i12)) {
                for (int i13 = 2; i13 < s8; i13 += 2) {
                    if (this.f1084bb.getShort(iCapacity + i13) != this.f1084bb.getShort(i12 + i13)) {
                        break;
                    }
                }
                i = this.vtables[i11];
                break loop2;
            }
            i11++;
        }
        if (i != 0) {
            int iCapacity2 = this.f1084bb.capacity() - iOffset;
            this.space = iCapacity2;
            this.f1084bb.putInt(iCapacity2, i - iOffset);
        } else {
            int i14 = this.num_vtables;
            int[] iArr = this.vtables;
            if (i14 == iArr.length) {
                this.vtables = Arrays.copyOf(iArr, i14 * 2);
            }
            int[] iArr2 = this.vtables;
            int i15 = this.num_vtables;
            this.num_vtables = i15 + 1;
            iArr2[i15] = offset();
            ByteBuffer byteBuffer = this.f1084bb;
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

    public void finish(int i, boolean z8) {
        prep(this.minalign, (z8 ? 4 : 0) + 4);
        addOffset(i);
        if (z8) {
            addInt(this.f1084bb.capacity() - this.space);
        }
        this.f1084bb.position(this.space);
        this.finished = true;
    }

    public void finishSizePrefixed(int i) {
        finish(i, true);
    }

    public void finished() {
        if (!this.finished) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public FlatBufferBuilder forceDefaults(boolean z8) {
        this.force_defaults = z8;
        return this;
    }

    public FlatBufferBuilder init(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this.bb_factory = byteBufferFactory;
        this.f1084bb = byteBuffer;
        byteBuffer.clear();
        this.f1084bb.order(ByteOrder.LITTLE_ENDIAN);
        this.minalign = 1;
        this.space = this.f1084bb.capacity();
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
        return this.f1084bb.capacity() - this.space;
    }

    public void pad(int i) {
        for (int i8 = 0; i8 < i; i8++) {
            ByteBuffer byteBuffer = this.f1084bb;
            int i9 = this.space - 1;
            this.space = i9;
            byteBuffer.put(i9, (byte) 0);
        }
    }

    public void prep(int i, int i8) {
        if (i > this.minalign) {
            this.minalign = i;
        }
        int i9 = ((~((this.f1084bb.capacity() - this.space) + i8)) + 1) & (i - 1);
        while (this.space < i9 + i + i8) {
            int iCapacity = this.f1084bb.capacity();
            ByteBuffer byteBuffer = this.f1084bb;
            ByteBuffer byteBufferGrowByteBuffer = growByteBuffer(byteBuffer, this.bb_factory);
            this.f1084bb = byteBufferGrowByteBuffer;
            if (byteBuffer != byteBufferGrowByteBuffer) {
                this.bb_factory.releaseByteBuffer(byteBuffer);
            }
            this.space = (this.f1084bb.capacity() - iCapacity) + this.space;
        }
        pad(i9);
    }

    public void putBoolean(boolean z8) {
        ByteBuffer byteBuffer = this.f1084bb;
        int i = this.space - 1;
        this.space = i;
        byteBuffer.put(i, z8 ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b6) {
        ByteBuffer byteBuffer = this.f1084bb;
        int i = this.space - 1;
        this.space = i;
        byteBuffer.put(i, b6);
    }

    public void putDouble(double d9) {
        ByteBuffer byteBuffer = this.f1084bb;
        int i = this.space - 8;
        this.space = i;
        byteBuffer.putDouble(i, d9);
    }

    public void putFloat(float f) {
        ByteBuffer byteBuffer = this.f1084bb;
        int i = this.space - 4;
        this.space = i;
        byteBuffer.putFloat(i, f);
    }

    public void putInt(int i) {
        ByteBuffer byteBuffer = this.f1084bb;
        int i8 = this.space - 4;
        this.space = i8;
        byteBuffer.putInt(i8, i);
    }

    public void putLong(long j7) {
        ByteBuffer byteBuffer = this.f1084bb;
        int i = this.space - 8;
        this.space = i;
        byteBuffer.putLong(i, j7);
    }

    public void putShort(short s8) {
        ByteBuffer byteBuffer = this.f1084bb;
        int i = this.space - 2;
        this.space = i;
        byteBuffer.putShort(i, s8);
    }

    public void required(int i, int i8) {
        int iCapacity = this.f1084bb.capacity() - i;
        if (this.f1084bb.getShort((iCapacity - this.f1084bb.getInt(iCapacity)) + i8) == 0) {
            throw new AssertionError(AbstractC0037f.m82g(i8, "FlatBuffers: field ", " must be set"));
        }
    }

    public byte[] sizedByteArray(int i, int i8) {
        finished();
        byte[] bArr = new byte[i8];
        this.f1084bb.position(i);
        this.f1084bb.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer byteBufferDuplicate = this.f1084bb.duplicate();
        byteBufferDuplicate.position(this.space);
        byteBufferDuplicate.limit(this.f1084bb.capacity());
        return new ByteBufferBackedInputStream(byteBufferDuplicate);
    }

    public void slot(int i) {
        this.vtable[i] = offset();
    }

    public void startTable(int i) {
        notNested();
        int[] iArr = this.vtable;
        if (iArr == null || iArr.length < i) {
            this.vtable = new int[i];
        }
        this.vtable_in_use = i;
        Arrays.fill(this.vtable, 0, i, 0);
        this.nested = true;
        this.object_start = offset();
    }

    public void startVector(int i, int i8, int i9) {
        notNested();
        this.vector_num_elems = i8;
        int i10 = i * i8;
        prep(4, i10);
        prep(i9, i10);
        this.nested = true;
    }

    public FlatBufferBuilder(int i, ByteBufferFactory byteBufferFactory, ByteBuffer byteBuffer, Utf8 utf8) {
        this.minalign = 1;
        this.vtable = null;
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.vtables = new int[16];
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        this.force_defaults = false;
        i = i <= 0 ? 1 : i;
        this.bb_factory = byteBufferFactory;
        if (byteBuffer != null) {
            this.f1084bb = byteBuffer;
            byteBuffer.clear();
            this.f1084bb.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f1084bb = byteBufferFactory.newByteBuffer(i);
        }
        this.utf8 = utf8;
        this.space = this.f1084bb.capacity();
    }

    public void addBoolean(int i, boolean z8, boolean z9) {
        if (this.force_defaults || z8 != z9) {
            addBoolean(z8);
            slot(i);
        }
    }

    public void addByte(int i, byte b6, int i8) {
        if (this.force_defaults || b6 != i8) {
            addByte(b6);
            slot(i);
        }
    }

    public void addDouble(int i, double d9, double d10) {
        if (this.force_defaults || d9 != d10) {
            addDouble(d9);
            slot(i);
        }
    }

    public void addFloat(int i, float f, double d9) {
        if (this.force_defaults || f != d9) {
            addFloat(f);
            slot(i);
        }
    }

    public void addInt(int i, int i8, int i9) {
        if (this.force_defaults || i8 != i9) {
            addInt(i8);
            slot(i);
        }
    }

    public void addLong(int i, long j7, long j8) {
        if (this.force_defaults || j7 != j8) {
            addLong(j7);
            slot(i);
        }
    }

    public void addShort(int i, short s8, int i8) {
        if (this.force_defaults || s8 != i8) {
            addShort(s8);
            slot(i);
        }
    }

    public void finishSizePrefixed(int i, String str) {
        finish(i, str, true);
    }

    public void addOffset(int i, int i8, int i9) {
        if (this.force_defaults || i8 != i9) {
            addOffset(i8);
            slot(i);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.space, this.f1084bb.capacity() - this.space);
    }

    public int createByteVector(byte[] bArr, int i, int i8) {
        startVector(1, i8, 1);
        ByteBuffer byteBuffer = this.f1084bb;
        int i9 = this.space - i8;
        this.space = i9;
        byteBuffer.position(i9);
        this.f1084bb.put(bArr, i, i8);
        return endVector();
    }

    public void finish(int i) {
        finish(i, false);
    }

    public int createString(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f1084bb;
        int i = this.space - iRemaining;
        this.space = i;
        byteBuffer2.position(i);
        this.f1084bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i, String str, boolean z8) {
        prep(this.minalign, (z8 ? 4 : 0) + 8);
        if (str.length() == 4) {
            for (int i8 = 3; i8 >= 0; i8--) {
                addByte((byte) str.charAt(i8));
            }
            finish(i, z8);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f1084bb;
        int i = this.space - iRemaining;
        this.space = i;
        byteBuffer2.position(i);
        this.f1084bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i, String str) {
        finish(i, str, false);
    }

    public FlatBufferBuilder(int i) {
        this(i, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
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
