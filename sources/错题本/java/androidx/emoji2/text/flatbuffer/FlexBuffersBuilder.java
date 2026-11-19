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

/* loaded from: classes2.dex */
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
    private final ReadWriteBuf f1087bb;
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

        public Value(int i, int i8, int i9, long j7) {
            this.key = i;
            this.type = i8;
            this.minBitWidth = i9;
            this.iValue = j7;
            this.dValue = Double.MIN_VALUE;
        }

        public static Value blob(int i, int i8, int i9, int i10) {
            return new Value(i, i9, i10, i8);
        }

        public static Value bool(int i, boolean z8) {
            return new Value(i, 26, 0, z8 ? 1L : 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int elemWidth(int i, int i8) {
            return elemWidth(this.type, this.minBitWidth, this.iValue, i, i8);
        }

        public static Value float32(int i, float f) {
            return new Value(i, 3, 2, f);
        }

        public static Value float64(int i, double d9) {
            return new Value(i, 3, 3, d9);
        }

        public static Value int16(int i, int i8) {
            return new Value(i, 1, 1, i8);
        }

        public static Value int32(int i, int i8) {
            return new Value(i, 1, 2, i8);
        }

        public static Value int64(int i, long j7) {
            return new Value(i, 1, 3, j7);
        }

        public static Value int8(int i, int i8) {
            return new Value(i, 1, 0, i8);
        }

        private static byte packedType(int i, int i8) {
            return (byte) (i | (i8 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int paddingBytes(int i, int i8) {
            return ((~i) + 1) & (i8 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType() {
            return storedPackedType(0);
        }

        private int storedWidth(int i) {
            return FlexBuffers.isTypeInline(this.type) ? Math.max(this.minBitWidth, i) : this.minBitWidth;
        }

        public static Value uInt16(int i, int i8) {
            return new Value(i, 2, 1, i8);
        }

        public static Value uInt32(int i, int i8) {
            return new Value(i, 2, 2, i8);
        }

        public static Value uInt64(int i, long j7) {
            return new Value(i, 2, 3, j7);
        }

        public static Value uInt8(int i, int i8) {
            return new Value(i, 2, 0, i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int elemWidth(int i, int i8, long j7, int i9, int i10) {
            if (FlexBuffers.isTypeInline(i)) {
                return i8;
            }
            for (int i11 = 1; i11 <= 32; i11 *= 2) {
                int iWidthUInBits = FlexBuffersBuilder.widthUInBits((int) (((i10 * i11) + (paddingBytes(i9, i11) + i9)) - j7));
                if ((1 << iWidthUInBits) == i11) {
                    return iWidthUInBits;
                }
            }
            return 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType(int i) {
            return packedType(storedWidth(i), this.type);
        }

        public Value(int i, int i8, int i9, double d9) {
            this.key = i;
            this.type = i8;
            this.minBitWidth = i9;
            this.dValue = d9;
            this.iValue = Long.MIN_VALUE;
        }
    }

    public FlexBuffersBuilder(int i) {
        this(new ArrayReadWriteBuf(i), 1);
    }

    private int align(int i) {
        int i8 = 1 << i;
        int iPaddingBytes = Value.paddingBytes(this.f1087bb.writePosition(), i8);
        while (true) {
            int i9 = iPaddingBytes - 1;
            if (iPaddingBytes == 0) {
                return i8;
            }
            this.f1087bb.put((byte) 0);
            iPaddingBytes = i9;
        }
    }

    private Value createKeyVector(int i, int i8) {
        long j7 = i8;
        int iMax = Math.max(0, widthUInBits(j7));
        int i9 = i;
        while (i9 < this.stack.size()) {
            int i10 = i9 + 1;
            iMax = Math.max(iMax, Value.elemWidth(4, 0, this.stack.get(i9).key, this.f1087bb.writePosition(), i10));
            i9 = i10;
        }
        int iAlign = align(iMax);
        writeInt(j7, iAlign);
        int iWritePosition = this.f1087bb.writePosition();
        while (i < this.stack.size()) {
            int i11 = this.stack.get(i).key;
            writeOffset(this.stack.get(i).key, iAlign);
            i++;
        }
        return new Value(-1, FlexBuffers.toTypedVector(4, 0), iMax, iWritePosition);
    }

    private Value createVector(int i, int i8, int i9, boolean z8, boolean z9, Value value) {
        int i10;
        int typedVector;
        int i11 = i9;
        long j7 = i11;
        int iMax = Math.max(0, widthUInBits(j7));
        if (value != null) {
            iMax = Math.max(iMax, value.elemWidth(this.f1087bb.writePosition(), 0));
            i10 = 3;
        } else {
            i10 = 1;
        }
        int i12 = 4;
        int iMax2 = iMax;
        for (int i13 = i8; i13 < this.stack.size(); i13++) {
            iMax2 = Math.max(iMax2, this.stack.get(i13).elemWidth(this.f1087bb.writePosition(), i13 + i10));
            if (z8 && i13 == i8) {
                i12 = this.stack.get(i13).type;
                if (!FlexBuffers.isTypedVectorElementType(i12)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i14 = i8;
        int iAlign = align(iMax2);
        if (value != null) {
            writeOffset(value.iValue, iAlign);
            writeInt(1 << value.minBitWidth, iAlign);
        }
        if (!z9) {
            writeInt(j7, iAlign);
        }
        int iWritePosition = this.f1087bb.writePosition();
        for (int i15 = i14; i15 < this.stack.size(); i15++) {
            writeAny(this.stack.get(i15), iAlign);
        }
        if (!z8) {
            while (i14 < this.stack.size()) {
                this.f1087bb.put(this.stack.get(i14).storedPackedType(iMax2));
                i14++;
            }
        }
        if (value != null) {
            typedVector = 9;
        } else if (z8) {
            if (!z9) {
                i11 = 0;
            }
            typedVector = FlexBuffers.toTypedVector(i12, i11);
        } else {
            typedVector = 10;
        }
        return new Value(i, typedVector, iMax2, iWritePosition);
    }

    private int putKey(String str) {
        if (str == null) {
            return -1;
        }
        int iWritePosition = this.f1087bb.writePosition();
        if ((this.flags & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f1087bb.put(bytes, 0, bytes.length);
            this.f1087bb.put((byte) 0);
            this.keyPool.put(str, Integer.valueOf(iWritePosition));
            return iWritePosition;
        }
        Integer num = this.keyPool.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f1087bb.put(bytes2, 0, bytes2.length);
        this.f1087bb.put((byte) 0);
        this.keyPool.put(str, Integer.valueOf(iWritePosition));
        return iWritePosition;
    }

    public static int widthUInBits(long j7) {
        if (j7 <= FlexBuffers.Unsigned.byteToUnsignedInt((byte) -1)) {
            return 0;
        }
        if (j7 <= FlexBuffers.Unsigned.shortToUnsignedInt((short) -1)) {
            return 1;
        }
        return j7 <= FlexBuffers.Unsigned.intToUnsignedLong(-1) ? 2 : 3;
    }

    private void writeAny(Value value, int i) {
        int i8 = value.type;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            if (i8 == 3) {
                writeDouble(value.dValue, i);
                return;
            } else if (i8 != 26) {
                writeOffset(value.iValue, i);
                return;
            }
        }
        writeInt(value.iValue, i);
    }

    private Value writeBlob(int i, byte[] bArr, int i8, boolean z8) {
        int iWidthUInBits = widthUInBits(bArr.length);
        writeInt(bArr.length, align(iWidthUInBits));
        int iWritePosition = this.f1087bb.writePosition();
        this.f1087bb.put(bArr, 0, bArr.length);
        if (z8) {
            this.f1087bb.put((byte) 0);
        }
        return Value.blob(i, iWritePosition, i8, iWidthUInBits);
    }

    private void writeDouble(double d9, int i) {
        if (i == 4) {
            this.f1087bb.putFloat((float) d9);
        } else if (i == 8) {
            this.f1087bb.putDouble(d9);
        }
    }

    private void writeInt(long j7, int i) {
        if (i == 1) {
            this.f1087bb.put((byte) j7);
            return;
        }
        if (i == 2) {
            this.f1087bb.putShort((short) j7);
        } else if (i == 4) {
            this.f1087bb.putInt((int) j7);
        } else {
            if (i != 8) {
                return;
            }
            this.f1087bb.putLong(j7);
        }
    }

    private void writeOffset(long j7, int i) {
        writeInt((int) (this.f1087bb.writePosition() - j7), i);
    }

    private Value writeString(int i, String str) {
        return writeBlob(i, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public int endMap(String str, int i) {
        int iPutKey = putKey(str);
        ArrayList<Value> arrayList = this.stack;
        Collections.sort(arrayList.subList(i, arrayList.size()), this.keyComparator);
        Value valueCreateVector = createVector(iPutKey, i, this.stack.size() - i, false, false, createKeyVector(i, this.stack.size() - i));
        while (this.stack.size() > i) {
            this.stack.remove(r9.size() - 1);
        }
        this.stack.add(valueCreateVector);
        return (int) valueCreateVector.iValue;
    }

    public int endVector(String str, int i, boolean z8, boolean z9) {
        Value valueCreateVector = createVector(putKey(str), i, this.stack.size() - i, z8, z9, null);
        while (this.stack.size() > i) {
            this.stack.remove(r9.size() - 1);
        }
        this.stack.add(valueCreateVector);
        return (int) valueCreateVector.iValue;
    }

    public ByteBuffer finish() {
        int iAlign = align(this.stack.get(0).elemWidth(this.f1087bb.writePosition(), 0));
        writeAny(this.stack.get(0), iAlign);
        this.f1087bb.put(this.stack.get(0).storedPackedType());
        this.f1087bb.put((byte) iAlign);
        this.finished = true;
        return ByteBuffer.wrap(this.f1087bb.data(), 0, this.f1087bb.writePosition());
    }

    public ReadWriteBuf getBuffer() {
        return this.f1087bb;
    }

    public int putBlob(byte[] bArr) {
        return putBlob(null, bArr);
    }

    public void putBoolean(boolean z8) {
        putBoolean(null, z8);
    }

    public void putFloat(float f) {
        putFloat((String) null, f);
    }

    public void putInt(int i) {
        putInt((String) null, i);
    }

    public int putString(String str) {
        return putString(null, str);
    }

    public void putUInt(int i) {
        putUInt(null, i);
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

    private void putUInt64(String str, long j7) {
        this.stack.add(Value.uInt64(putKey(str), j7));
    }

    public int putBlob(String str, byte[] bArr) {
        Value valueWriteBlob = writeBlob(putKey(str), bArr, 25, false);
        this.stack.add(valueWriteBlob);
        return (int) valueWriteBlob.iValue;
    }

    public void putBoolean(String str, boolean z8) {
        this.stack.add(Value.bool(putKey(str), z8));
    }

    public void putFloat(String str, float f) {
        this.stack.add(Value.float32(putKey(str), f));
    }

    public void putInt(String str, int i) {
        putInt(str, i);
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

    public void putUInt(long j7) {
        putUInt(null, j7);
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer, int i) {
        this(new ArrayReadWriteBuf(byteBuffer.array()), i);
    }

    private void putUInt(String str, long j7) {
        Value valueUInt64;
        int iPutKey = putKey(str);
        int iWidthUInBits = widthUInBits(j7);
        if (iWidthUInBits == 0) {
            valueUInt64 = Value.uInt8(iPutKey, (int) j7);
        } else if (iWidthUInBits == 1) {
            valueUInt64 = Value.uInt16(iPutKey, (int) j7);
        } else if (iWidthUInBits == 2) {
            valueUInt64 = Value.uInt32(iPutKey, (int) j7);
        } else {
            valueUInt64 = Value.uInt64(iPutKey, j7);
        }
        this.stack.add(valueUInt64);
    }

    public void putFloat(double d9) {
        putFloat((String) null, d9);
    }

    public void putInt(String str, long j7) {
        int iPutKey = putKey(str);
        if (-128 <= j7 && j7 <= 127) {
            this.stack.add(Value.int8(iPutKey, (int) j7));
            return;
        }
        if (-32768 <= j7 && j7 <= 32767) {
            this.stack.add(Value.int16(iPutKey, (int) j7));
        } else if (SieveCacheKt.NodeMetaAndPreviousMask <= j7 && j7 <= SieveCacheKt.NodeLinkMask) {
            this.stack.add(Value.int32(iPutKey, (int) j7));
        } else {
            this.stack.add(Value.int64(iPutKey, j7));
        }
    }

    public FlexBuffersBuilder(ReadWriteBuf readWriteBuf, int i) {
        this.stack = new ArrayList<>();
        this.keyPool = new HashMap<>();
        this.stringPool = new HashMap<>();
        this.finished = false;
        this.keyComparator = new Comparator<Value>() { // from class: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.1
            @Override // java.util.Comparator
            public int compare(Value value, Value value2) {
                byte b6;
                byte b9;
                int i8 = value.key;
                int i9 = value2.key;
                do {
                    b6 = FlexBuffersBuilder.this.f1087bb.get(i8);
                    b9 = FlexBuffersBuilder.this.f1087bb.get(i9);
                    if (b6 == 0) {
                        return b6 - b9;
                    }
                    i8++;
                    i9++;
                } while (b6 == b9);
                return b6 - b9;
            }
        };
        this.f1087bb = readWriteBuf;
        this.flags = i;
    }

    public void putFloat(String str, double d9) {
        this.stack.add(Value.float64(putKey(str), d9));
    }

    public void putInt(long j7) {
        putInt((String) null, j7);
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
