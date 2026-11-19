package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* loaded from: classes.dex */
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
    private final ReadWriteBuf f394bb;
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

        public Value(int i4, int i5, int i6, long j4) {
            this.key = i4;
            this.type = i5;
            this.minBitWidth = i6;
            this.iValue = j4;
            this.dValue = Double.MIN_VALUE;
        }

        public static Value blob(int i4, int i5, int i6, int i7) {
            return new Value(i4, i6, i7, i5);
        }

        public static Value bool(int i4, boolean z3) {
            return new Value(i4, 26, 0, z3 ? 1L : 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int elemWidth(int i4, int i5) {
            return elemWidth(this.type, this.minBitWidth, this.iValue, i4, i5);
        }

        public static Value float32(int i4, float f4) {
            return new Value(i4, 3, 2, f4);
        }

        public static Value float64(int i4, double d4) {
            return new Value(i4, 3, 3, d4);
        }

        public static Value int16(int i4, int i5) {
            return new Value(i4, 1, 1, i5);
        }

        public static Value int32(int i4, int i5) {
            return new Value(i4, 1, 2, i5);
        }

        public static Value int64(int i4, long j4) {
            return new Value(i4, 1, 3, j4);
        }

        public static Value int8(int i4, int i5) {
            return new Value(i4, 1, 0, i5);
        }

        private static byte packedType(int i4, int i5) {
            return (byte) (i4 | (i5 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int paddingBytes(int i4, int i5) {
            return ((~i4) + 1) & (i5 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType() {
            return storedPackedType(0);
        }

        private int storedWidth(int i4) {
            return FlexBuffers.isTypeInline(this.type) ? Math.max(this.minBitWidth, i4) : this.minBitWidth;
        }

        public static Value uInt16(int i4, int i5) {
            return new Value(i4, 2, 1, i5);
        }

        public static Value uInt32(int i4, int i5) {
            return new Value(i4, 2, 2, i5);
        }

        public static Value uInt64(int i4, long j4) {
            return new Value(i4, 2, 3, j4);
        }

        public static Value uInt8(int i4, int i5) {
            return new Value(i4, 2, 0, i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int elemWidth(int i4, int i5, long j4, int i6, int i7) {
            if (FlexBuffers.isTypeInline(i4)) {
                return i5;
            }
            for (int i8 = 1; i8 <= 32; i8 *= 2) {
                int iWidthUInBits = FlexBuffersBuilder.widthUInBits((int) (((paddingBytes(i6, i8) + i6) + (i7 * i8)) - j4));
                if ((1 << iWidthUInBits) == i8) {
                    return iWidthUInBits;
                }
            }
            return 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType(int i4) {
            return packedType(storedWidth(i4), this.type);
        }

        public Value(int i4, int i5, int i6, double d4) {
            this.key = i4;
            this.type = i5;
            this.minBitWidth = i6;
            this.dValue = d4;
            this.iValue = Long.MIN_VALUE;
        }
    }

    public FlexBuffersBuilder(int i4) {
        this(new ArrayReadWriteBuf(i4), 1);
    }

    private int align(int i4) {
        int i5 = 1 << i4;
        int iPaddingBytes = Value.paddingBytes(this.f394bb.writePosition(), i5);
        while (true) {
            int i6 = iPaddingBytes - 1;
            if (iPaddingBytes == 0) {
                return i5;
            }
            this.f394bb.put((byte) 0);
            iPaddingBytes = i6;
        }
    }

    private Value createKeyVector(int i4, int i5) {
        long j4 = i5;
        int iMax = Math.max(0, widthUInBits(j4));
        int i6 = i4;
        while (i6 < this.stack.size()) {
            i6++;
            iMax = Math.max(iMax, Value.elemWidth(4, 0, this.stack.get(i6).key, this.f394bb.writePosition(), i6));
        }
        int iAlign = align(iMax);
        writeInt(j4, iAlign);
        int iWritePosition = this.f394bb.writePosition();
        while (i4 < this.stack.size()) {
            int i7 = this.stack.get(i4).key;
            writeOffset(this.stack.get(i4).key, iAlign);
            i4++;
        }
        return new Value(-1, FlexBuffers.toTypedVector(4, 0), iMax, iWritePosition);
    }

    private Value createVector(int i4, int i5, int i6, boolean z3, boolean z4, Value value) {
        int i7;
        int typedVector;
        int i8 = i6;
        long j4 = i8;
        int iMax = Math.max(0, widthUInBits(j4));
        if (value != null) {
            iMax = Math.max(iMax, value.elemWidth(this.f394bb.writePosition(), 0));
            i7 = 3;
        } else {
            i7 = 1;
        }
        int i9 = 4;
        int iMax2 = iMax;
        for (int i10 = i5; i10 < this.stack.size(); i10++) {
            iMax2 = Math.max(iMax2, this.stack.get(i10).elemWidth(this.f394bb.writePosition(), i10 + i7));
            if (z3 && i10 == i5) {
                i9 = this.stack.get(i10).type;
                if (!FlexBuffers.isTypedVectorElementType(i9)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i11 = i5;
        int iAlign = align(iMax2);
        if (value != null) {
            writeOffset(value.iValue, iAlign);
            writeInt(1 << value.minBitWidth, iAlign);
        }
        if (!z4) {
            writeInt(j4, iAlign);
        }
        int iWritePosition = this.f394bb.writePosition();
        for (int i12 = i11; i12 < this.stack.size(); i12++) {
            writeAny(this.stack.get(i12), iAlign);
        }
        if (!z3) {
            while (i11 < this.stack.size()) {
                this.f394bb.put(this.stack.get(i11).storedPackedType(iMax2));
                i11++;
            }
        }
        if (value != null) {
            typedVector = 9;
        } else if (z3) {
            if (!z4) {
                i8 = 0;
            }
            typedVector = FlexBuffers.toTypedVector(i9, i8);
        } else {
            typedVector = 10;
        }
        return new Value(i4, typedVector, iMax2, iWritePosition);
    }

    private int putKey(String str) {
        if (str == null) {
            return -1;
        }
        int iWritePosition = this.f394bb.writePosition();
        if ((this.flags & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f394bb.put(bytes, 0, bytes.length);
            this.f394bb.put((byte) 0);
            this.keyPool.put(str, Integer.valueOf(iWritePosition));
            return iWritePosition;
        }
        Integer num = this.keyPool.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f394bb.put(bytes2, 0, bytes2.length);
        this.f394bb.put((byte) 0);
        this.keyPool.put(str, Integer.valueOf(iWritePosition));
        return iWritePosition;
    }

    public static int widthUInBits(long j4) {
        if (j4 <= FlexBuffers.Unsigned.byteToUnsignedInt((byte) -1)) {
            return 0;
        }
        if (j4 <= FlexBuffers.Unsigned.shortToUnsignedInt((short) -1)) {
            return 1;
        }
        return j4 <= FlexBuffers.Unsigned.intToUnsignedLong(-1) ? 2 : 3;
    }

    private void writeAny(Value value, int i4) {
        int i5 = value.type;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            if (i5 == 3) {
                writeDouble(value.dValue, i4);
                return;
            } else if (i5 != 26) {
                writeOffset(value.iValue, i4);
                return;
            }
        }
        writeInt(value.iValue, i4);
    }

    private Value writeBlob(int i4, byte[] bArr, int i5, boolean z3) {
        int iWidthUInBits = widthUInBits(bArr.length);
        writeInt(bArr.length, align(iWidthUInBits));
        int iWritePosition = this.f394bb.writePosition();
        this.f394bb.put(bArr, 0, bArr.length);
        if (z3) {
            this.f394bb.put((byte) 0);
        }
        return Value.blob(i4, iWritePosition, i5, iWidthUInBits);
    }

    private void writeDouble(double d4, int i4) {
        if (i4 == 4) {
            this.f394bb.putFloat((float) d4);
        } else if (i4 == 8) {
            this.f394bb.putDouble(d4);
        }
    }

    private void writeInt(long j4, int i4) {
        if (i4 == 1) {
            this.f394bb.put((byte) j4);
            return;
        }
        if (i4 == 2) {
            this.f394bb.putShort((short) j4);
        } else if (i4 == 4) {
            this.f394bb.putInt((int) j4);
        } else {
            if (i4 != 8) {
                return;
            }
            this.f394bb.putLong(j4);
        }
    }

    private void writeOffset(long j4, int i4) {
        writeInt((int) (this.f394bb.writePosition() - j4), i4);
    }

    private Value writeString(int i4, String str) {
        return writeBlob(i4, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public int endMap(String str, int i4) {
        int iPutKey = putKey(str);
        ArrayList<Value> arrayList = this.stack;
        Collections.sort(arrayList.subList(i4, arrayList.size()), this.keyComparator);
        Value valueCreateVector = createVector(iPutKey, i4, this.stack.size() - i4, false, false, createKeyVector(i4, this.stack.size() - i4));
        while (this.stack.size() > i4) {
            this.stack.remove(r0.size() - 1);
        }
        this.stack.add(valueCreateVector);
        return (int) valueCreateVector.iValue;
    }

    public int endVector(String str, int i4, boolean z3, boolean z4) {
        Value valueCreateVector = createVector(putKey(str), i4, this.stack.size() - i4, z3, z4, null);
        while (this.stack.size() > i4) {
            this.stack.remove(r10.size() - 1);
        }
        this.stack.add(valueCreateVector);
        return (int) valueCreateVector.iValue;
    }

    public ByteBuffer finish() {
        int iAlign = align(this.stack.get(0).elemWidth(this.f394bb.writePosition(), 0));
        writeAny(this.stack.get(0), iAlign);
        this.f394bb.put(this.stack.get(0).storedPackedType());
        this.f394bb.put((byte) iAlign);
        this.finished = true;
        return ByteBuffer.wrap(this.f394bb.data(), 0, this.f394bb.writePosition());
    }

    public ReadWriteBuf getBuffer() {
        return this.f394bb;
    }

    public int putBlob(byte[] bArr) {
        return putBlob(null, bArr);
    }

    public void putBoolean(boolean z3) {
        putBoolean(null, z3);
    }

    public void putFloat(float f4) {
        putFloat((String) null, f4);
    }

    public void putInt(int i4) {
        putInt((String) null, i4);
    }

    public int putString(String str) {
        return putString(null, str);
    }

    public void putUInt(int i4) {
        putUInt(null, i4);
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

    private void putUInt64(String str, long j4) {
        this.stack.add(Value.uInt64(putKey(str), j4));
    }

    public int putBlob(String str, byte[] bArr) {
        Value valueWriteBlob = writeBlob(putKey(str), bArr, 25, false);
        this.stack.add(valueWriteBlob);
        return (int) valueWriteBlob.iValue;
    }

    public void putBoolean(String str, boolean z3) {
        this.stack.add(Value.bool(putKey(str), z3));
    }

    public void putFloat(String str, float f4) {
        this.stack.add(Value.float32(putKey(str), f4));
    }

    public void putInt(String str, int i4) {
        putInt(str, i4);
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

    public void putUInt(long j4) {
        putUInt(null, j4);
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer, int i4) {
        this(new ArrayReadWriteBuf(byteBuffer.array()), i4);
    }

    private void putUInt(String str, long j4) {
        Value valueUInt64;
        int iPutKey = putKey(str);
        int iWidthUInBits = widthUInBits(j4);
        if (iWidthUInBits == 0) {
            valueUInt64 = Value.uInt8(iPutKey, (int) j4);
        } else if (iWidthUInBits == 1) {
            valueUInt64 = Value.uInt16(iPutKey, (int) j4);
        } else if (iWidthUInBits == 2) {
            valueUInt64 = Value.uInt32(iPutKey, (int) j4);
        } else {
            valueUInt64 = Value.uInt64(iPutKey, j4);
        }
        this.stack.add(valueUInt64);
    }

    public void putFloat(double d4) {
        putFloat((String) null, d4);
    }

    public void putInt(String str, long j4) {
        int iPutKey = putKey(str);
        if (-128 <= j4 && j4 <= 127) {
            this.stack.add(Value.int8(iPutKey, (int) j4));
            return;
        }
        if (-32768 <= j4 && j4 <= 32767) {
            this.stack.add(Value.int16(iPutKey, (int) j4));
        } else if (-2147483648L <= j4 && j4 <= 2147483647L) {
            this.stack.add(Value.int32(iPutKey, (int) j4));
        } else {
            this.stack.add(Value.int64(iPutKey, j4));
        }
    }

    public FlexBuffersBuilder(ReadWriteBuf readWriteBuf, int i4) {
        this.stack = new ArrayList<>();
        this.keyPool = new HashMap<>();
        this.stringPool = new HashMap<>();
        this.finished = false;
        this.keyComparator = new Comparator<Value>() { // from class: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.1
            @Override // java.util.Comparator
            public int compare(Value value, Value value2) {
                byte b4;
                byte b5;
                int i5 = value.key;
                int i6 = value2.key;
                do {
                    b4 = FlexBuffersBuilder.this.f394bb.get(i5);
                    b5 = FlexBuffersBuilder.this.f394bb.get(i6);
                    if (b4 == 0) {
                        return b4 - b5;
                    }
                    i5++;
                    i6++;
                } while (b4 == b5);
                return b4 - b5;
            }
        };
        this.f394bb = readWriteBuf;
        this.flags = i4;
    }

    public void putFloat(String str, double d4) {
        this.stack.add(Value.float64(putKey(str), d4));
    }

    public void putInt(long j4) {
        putInt((String) null, j4);
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
