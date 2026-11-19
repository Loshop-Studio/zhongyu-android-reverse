package androidx.emoji2.text.flatbuffer;

import androidx.collection.SieveCacheKt;
import androidx.emoji2.text.flatbuffer.FlexBuffers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class FlexBuffersBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    private static final int WIDTH_16 = 1;
    private static final int WIDTH_32 = 2;
    private static final int WIDTH_64 = 3;
    private static final int WIDTH_8 = 0;

    /* renamed from: bb */
    private final ReadWriteBuf f1506bb;
    private boolean finished;
    private final int flags;
    private Comparator<Value> keyComparator;
    private final HashMap<String, Integer> keyPool;
    private final ArrayList<Value> stack;
    private final HashMap<String, Integer> stringPool;

    public static class Value {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final double dValue;
        long iValue;
        int key;
        final int minBitWidth;
        final int type;

        public Value(int i9, int i10, int i11, long j9) {
            this.key = i9;
            this.type = i10;
            this.minBitWidth = i11;
            this.iValue = j9;
            this.dValue = Double.MIN_VALUE;
        }

        public static Value blob(int i9, int i10, int i11, int i12) {
            return new Value(i9, i11, i12, i10);
        }

        public static Value bool(int i9, boolean z9) {
            return new Value(i9, 26, 0, z9 ? 1L : 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int elemWidth(int i9, int i10) {
            return elemWidth(this.type, this.minBitWidth, this.iValue, i9, i10);
        }

        public static Value float32(int i9, float f10) {
            return new Value(i9, 3, 2, f10);
        }

        public static Value float64(int i9, double d10) {
            return new Value(i9, 3, 3, d10);
        }

        public static Value int16(int i9, int i10) {
            return new Value(i9, 1, 1, i10);
        }

        public static Value int32(int i9, int i10) {
            return new Value(i9, 1, 2, i10);
        }

        public static Value int64(int i9, long j9) {
            return new Value(i9, 1, 3, j9);
        }

        public static Value int8(int i9, int i10) {
            return new Value(i9, 1, 0, i10);
        }

        private static byte packedType(int i9, int i10) {
            return (byte) (i9 | (i10 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int paddingBytes(int i9, int i10) {
            return ((~i9) + 1) & (i10 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType() {
            return storedPackedType(0);
        }

        private int storedWidth(int i9) {
            return FlexBuffers.isTypeInline(this.type) ? Math.max(this.minBitWidth, i9) : this.minBitWidth;
        }

        public static Value uInt16(int i9, int i10) {
            return new Value(i9, 2, 1, i10);
        }

        public static Value uInt32(int i9, int i10) {
            return new Value(i9, 2, 2, i10);
        }

        public static Value uInt64(int i9, long j9) {
            return new Value(i9, 2, 3, j9);
        }

        public static Value uInt8(int i9, int i10) {
            return new Value(i9, 2, 0, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int elemWidth(int i9, int i10, long j9, int i11, int i12) {
            if (FlexBuffers.isTypeInline(i9)) {
                return i10;
            }
            for (int i13 = 1; i13 <= 32; i13 *= 2) {
                int iWidthUInBits = FlexBuffersBuilder.widthUInBits((int) (((paddingBytes(i11, i13) + i11) + (i12 * i13)) - j9));
                if ((1 << iWidthUInBits) == i13) {
                    return iWidthUInBits;
                }
            }
            return 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType(int i9) {
            return packedType(storedWidth(i9), this.type);
        }

        public Value(int i9, int i10, int i11, double d10) {
            this.key = i9;
            this.type = i10;
            this.minBitWidth = i11;
            this.dValue = d10;
            this.iValue = Long.MIN_VALUE;
        }
    }

    public FlexBuffersBuilder(int i9) {
        this(new ArrayReadWriteBuf(i9), 1);
    }

    private int align(int i9) {
        int i10 = 1 << i9;
        int iPaddingBytes = Value.paddingBytes(this.f1506bb.writePosition(), i10);
        while (true) {
            int i11 = iPaddingBytes - 1;
            if (iPaddingBytes == 0) {
                return i10;
            }
            this.f1506bb.put((byte) 0);
            iPaddingBytes = i11;
        }
    }

    private Value createKeyVector(int i9, int i10) {
        long j9 = i10;
        int iMax = Math.max(0, widthUInBits(j9));
        int i11 = i9;
        while (i11 < this.stack.size()) {
            int i12 = i11 + 1;
            iMax = Math.max(iMax, Value.elemWidth(4, 0, this.stack.get(i11).key, this.f1506bb.writePosition(), i12));
            i11 = i12;
        }
        int iAlign = align(iMax);
        writeInt(j9, iAlign);
        int iWritePosition = this.f1506bb.writePosition();
        while (i9 < this.stack.size()) {
            int i13 = this.stack.get(i9).key;
            writeOffset(this.stack.get(i9).key, iAlign);
            i9++;
        }
        return new Value(-1, FlexBuffers.toTypedVector(4, 0), iMax, iWritePosition);
    }

    private Value createVector(int i9, int i10, int i11, boolean z9, boolean z10, Value value) {
        int i12;
        int typedVector;
        int i13 = i11;
        long j9 = i13;
        int iMax = Math.max(0, widthUInBits(j9));
        if (value != null) {
            iMax = Math.max(iMax, value.elemWidth(this.f1506bb.writePosition(), 0));
            i12 = 3;
        } else {
            i12 = 1;
        }
        int i14 = 4;
        int iMax2 = iMax;
        for (int i15 = i10; i15 < this.stack.size(); i15++) {
            iMax2 = Math.max(iMax2, this.stack.get(i15).elemWidth(this.f1506bb.writePosition(), i15 + i12));
            if (z9 && i15 == i10) {
                i14 = this.stack.get(i15).type;
                if (!FlexBuffers.isTypedVectorElementType(i14)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i16 = i10;
        int iAlign = align(iMax2);
        if (value != null) {
            writeOffset(value.iValue, iAlign);
            writeInt(1 << value.minBitWidth, iAlign);
        }
        if (!z10) {
            writeInt(j9, iAlign);
        }
        int iWritePosition = this.f1506bb.writePosition();
        for (int i17 = i16; i17 < this.stack.size(); i17++) {
            writeAny(this.stack.get(i17), iAlign);
        }
        if (!z9) {
            while (i16 < this.stack.size()) {
                this.f1506bb.put(this.stack.get(i16).storedPackedType(iMax2));
                i16++;
            }
        }
        if (value != null) {
            typedVector = 9;
        } else if (z9) {
            if (!z10) {
                i13 = 0;
            }
            typedVector = FlexBuffers.toTypedVector(i14, i13);
        } else {
            typedVector = 10;
        }
        return new Value(i9, typedVector, iMax2, iWritePosition);
    }

    private int putKey(String str) {
        if (str == null) {
            return -1;
        }
        int iWritePosition = this.f1506bb.writePosition();
        if ((this.flags & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f1506bb.put(bytes, 0, bytes.length);
            this.f1506bb.put((byte) 0);
            this.keyPool.put(str, Integer.valueOf(iWritePosition));
            return iWritePosition;
        }
        Integer num = this.keyPool.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f1506bb.put(bytes2, 0, bytes2.length);
        this.f1506bb.put((byte) 0);
        this.keyPool.put(str, Integer.valueOf(iWritePosition));
        return iWritePosition;
    }

    public static int widthUInBits(long j9) {
        if (j9 <= FlexBuffers.Unsigned.byteToUnsignedInt((byte) -1)) {
            return 0;
        }
        if (j9 <= FlexBuffers.Unsigned.shortToUnsignedInt((short) -1)) {
            return 1;
        }
        return j9 <= FlexBuffers.Unsigned.intToUnsignedLong(-1) ? 2 : 3;
    }

    private void writeAny(Value value, int i9) {
        int i10 = value.type;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                writeDouble(value.dValue, i9);
                return;
            } else if (i10 != 26) {
                writeOffset(value.iValue, i9);
                return;
            }
        }
        writeInt(value.iValue, i9);
    }

    private Value writeBlob(int i9, byte[] bArr, int i10, boolean z9) {
        int iWidthUInBits = widthUInBits(bArr.length);
        writeInt(bArr.length, align(iWidthUInBits));
        int iWritePosition = this.f1506bb.writePosition();
        this.f1506bb.put(bArr, 0, bArr.length);
        if (z9) {
            this.f1506bb.put((byte) 0);
        }
        return Value.blob(i9, iWritePosition, i10, iWidthUInBits);
    }

    private void writeDouble(double d10, int i9) {
        if (i9 == 4) {
            this.f1506bb.putFloat((float) d10);
        } else if (i9 == 8) {
            this.f1506bb.putDouble(d10);
        }
    }

    private void writeInt(long j9, int i9) {
        if (i9 == 1) {
            this.f1506bb.put((byte) j9);
            return;
        }
        if (i9 == 2) {
            this.f1506bb.putShort((short) j9);
        } else if (i9 == 4) {
            this.f1506bb.putInt((int) j9);
        } else {
            if (i9 != 8) {
                return;
            }
            this.f1506bb.putLong(j9);
        }
    }

    private void writeOffset(long j9, int i9) {
        writeInt((int) (this.f1506bb.writePosition() - j9), i9);
    }

    private Value writeString(int i9, String str) {
        return writeBlob(i9, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public int endMap(String str, int i9) {
        int iPutKey = putKey(str);
        ArrayList<Value> arrayList = this.stack;
        Collections.sort(arrayList.subList(i9, arrayList.size()), this.keyComparator);
        Value valueCreateVector = createVector(iPutKey, i9, this.stack.size() - i9, false, false, createKeyVector(i9, this.stack.size() - i9));
        while (this.stack.size() > i9) {
            this.stack.remove(r9.size() - 1);
        }
        this.stack.add(valueCreateVector);
        return (int) valueCreateVector.iValue;
    }

    public int endVector(String str, int i9, boolean z9, boolean z10) {
        Value valueCreateVector = createVector(putKey(str), i9, this.stack.size() - i9, z9, z10, null);
        while (this.stack.size() > i9) {
            this.stack.remove(r9.size() - 1);
        }
        this.stack.add(valueCreateVector);
        return (int) valueCreateVector.iValue;
    }

    public ByteBuffer finish() {
        int iAlign = align(this.stack.get(0).elemWidth(this.f1506bb.writePosition(), 0));
        writeAny(this.stack.get(0), iAlign);
        this.f1506bb.put(this.stack.get(0).storedPackedType());
        this.f1506bb.put((byte) iAlign);
        this.finished = true;
        return ByteBuffer.wrap(this.f1506bb.data(), 0, this.f1506bb.writePosition());
    }

    public ReadWriteBuf getBuffer() {
        return this.f1506bb;
    }

    public int putBlob(byte[] bArr) {
        return putBlob(null, bArr);
    }

    public void putBoolean(boolean z9) {
        putBoolean(null, z9);
    }

    public void putFloat(float f10) {
        putFloat((String) null, f10);
    }

    public void putInt(int i9) {
        putInt((String) null, i9);
    }

    public int putString(String str) {
        return putString(null, str);
    }

    public void putUInt(int i9) {
        putUInt(null, i9);
    }

    public void putUInt64(BigInteger bigInteger) {
        putUInt64(null, bigInteger.longValue());
    }

    public int startMap() {
        return this.stack.size();
    }

    public int startVector() {
        return this.stack.size();
    }

    public FlexBuffersBuilder() {
        this(256);
    }

    private void putUInt64(String str, long j9) {
        this.stack.add(Value.uInt64(putKey(str), j9));
    }

    public int putBlob(String str, byte[] bArr) {
        Value valueWriteBlob = writeBlob(putKey(str), bArr, 25, false);
        this.stack.add(valueWriteBlob);
        return (int) valueWriteBlob.iValue;
    }

    public void putBoolean(String str, boolean z9) {
        this.stack.add(Value.bool(putKey(str), z9));
    }

    public void putFloat(String str, float f10) {
        this.stack.add(Value.float32(putKey(str), f10));
    }

    public void putInt(String str, int i9) {
        putInt(str, i9);
    }

    public int putString(String str, String str2) {
        int iPutKey = putKey(str);
        if ((this.flags & 2) == 0) {
            Value valueWriteString = writeString(iPutKey, str2);
            this.stack.add(valueWriteString);
            return (int) valueWriteString.iValue;
        }
        Integer num = this.stringPool.get(str2);
        if (num != null) {
            this.stack.add(Value.blob(iPutKey, num.intValue(), 5, widthUInBits(str2.length())));
            return num.intValue();
        }
        Value valueWriteString2 = writeString(iPutKey, str2);
        this.stringPool.put(str2, Integer.valueOf((int) valueWriteString2.iValue));
        this.stack.add(valueWriteString2);
        return (int) valueWriteString2.iValue;
    }

    public void putUInt(long j9) {
        putUInt(null, j9);
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer, int i9) {
        this(new ArrayReadWriteBuf(byteBuffer.array()), i9);
    }

    private void putUInt(String str, long j9) {
        Value valueUInt64;
        int iPutKey = putKey(str);
        int iWidthUInBits = widthUInBits(j9);
        if (iWidthUInBits == 0) {
            valueUInt64 = Value.uInt8(iPutKey, (int) j9);
        } else if (iWidthUInBits == 1) {
            valueUInt64 = Value.uInt16(iPutKey, (int) j9);
        } else if (iWidthUInBits == 2) {
            valueUInt64 = Value.uInt32(iPutKey, (int) j9);
        } else {
            valueUInt64 = Value.uInt64(iPutKey, j9);
        }
        this.stack.add(valueUInt64);
    }

    public void putFloat(double d10) {
        putFloat((String) null, d10);
    }

    public void putInt(String str, long j9) {
        int iPutKey = putKey(str);
        if (-128 <= j9 && j9 <= 127) {
            this.stack.add(Value.int8(iPutKey, (int) j9));
            return;
        }
        if (-32768 <= j9 && j9 <= 32767) {
            this.stack.add(Value.int16(iPutKey, (int) j9));
        } else if (SieveCacheKt.NodeMetaAndPreviousMask <= j9 && j9 <= SieveCacheKt.NodeLinkMask) {
            this.stack.add(Value.int32(iPutKey, (int) j9));
        } else {
            this.stack.add(Value.int64(iPutKey, j9));
        }
    }

    public FlexBuffersBuilder(ReadWriteBuf readWriteBuf, int i9) {
        this.stack = new ArrayList<>();
        this.keyPool = new HashMap<>();
        this.stringPool = new HashMap<>();
        this.finished = false;
        this.keyComparator = new Comparator<Value>() { // from class: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.1
            @Override // java.util.Comparator
            public int compare(Value value, Value value2) {
                byte b10;
                byte b11;
                int i10 = value.key;
                int i11 = value2.key;
                do {
                    b10 = FlexBuffersBuilder.this.f1506bb.get(i10);
                    b11 = FlexBuffersBuilder.this.f1506bb.get(i11);
                    if (b10 == 0) {
                        return b10 - b11;
                    }
                    i10++;
                    i11++;
                } while (b10 == b11);
                return b10 - b11;
            }
        };
        this.f1506bb = readWriteBuf;
        this.flags = i9;
    }

    public void putFloat(String str, double d10) {
        this.stack.add(Value.float64(putKey(str), d10));
    }

    public void putInt(long j9) {
        putInt((String) null, j9);
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
