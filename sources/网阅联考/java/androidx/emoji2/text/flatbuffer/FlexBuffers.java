package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public class FlexBuffers {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ReadBuf EMPTY_BB = new ArrayReadWriteBuf(new byte[]{0}, 1);
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    public static class Blob extends Sized {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final Blob EMPTY = new Blob(FlexBuffers.EMPTY_BB, 1, 1);

        public Blob(ReadBuf readBuf, int i4, int i5) {
            super(readBuf, i4, i5);
        }

        public static Blob empty() {
            return EMPTY;
        }

        public ByteBuffer data() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f392bb.data());
            byteBufferWrap.position(this.end);
            byteBufferWrap.limit(this.end + size());
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i4) {
            return this.f392bb.get(this.end + i4);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i4 = 0; i4 < size; i4++) {
                bArr[i4] = this.f392bb.get(this.end + i4);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            return this.f392bb.getString(this.end, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(Typography.quote);
            sb.append(this.f392bb.getString(this.end, size()));
            sb.append(Typography.quote);
            return sb;
        }
    }

    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    public static class Key extends Object {
        private static final Key EMPTY = new Key(FlexBuffers.EMPTY_BB, 0, 0);

        public Key(ReadBuf readBuf, int i4, int i5) {
            super(readBuf, i4, i5);
        }

        public static Key empty() {
            return EMPTY;
        }

        public int compareTo(byte[] bArr) {
            byte b4;
            byte b5;
            int i4 = this.end;
            int i5 = 0;
            do {
                b4 = this.f392bb.get(i4);
                b5 = bArr[i5];
                if (b4 == 0) {
                    return b4 - b5;
                }
                i4++;
                i5++;
                if (i5 == bArr.length) {
                    return b4 - b5;
                }
            } while (b4 == b5);
            return b4 - b5;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.end == this.end && key.byteWidth == this.byteWidth;
        }

        public int hashCode() {
            return this.end ^ this.byteWidth;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            int i4 = this.end;
            while (this.f392bb.get(i4) != 0) {
                i4++;
            }
            int i5 = this.end;
            return this.f392bb.getString(i5, i4 - i5);
        }
    }

    public static class KeyVector {
        private final TypedVector vec;

        public KeyVector(TypedVector typedVector) {
            this.vec = typedVector;
        }

        public Key get(int i4) {
            if (i4 >= size()) {
                return Key.EMPTY;
            }
            TypedVector typedVector = this.vec;
            int i5 = typedVector.end + (i4 * typedVector.byteWidth);
            TypedVector typedVector2 = this.vec;
            ReadBuf readBuf = typedVector2.f392bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, i5, typedVector2.byteWidth), 1);
        }

        public int size() {
            return this.vec.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i4 = 0; i4 < this.vec.size(); i4++) {
                this.vec.get(i4).toString(sb);
                if (i4 != this.vec.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static class Map extends Vector {
        private static final Map EMPTY_MAP = new Map(FlexBuffers.EMPTY_BB, 1, 1);

        public Map(ReadBuf readBuf, int i4, int i5) {
            super(readBuf, i4, i5);
        }

        private int binarySearch(KeyVector keyVector, byte[] bArr) {
            int size = keyVector.size() - 1;
            int i4 = 0;
            while (i4 <= size) {
                int i5 = (i4 + size) >>> 1;
                int iCompareTo = keyVector.get(i5).compareTo(bArr);
                if (iCompareTo < 0) {
                    i4 = i5 + 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i5;
                    }
                    size = i5 - 1;
                }
            }
            return -(i4 + 1);
        }

        public static Map empty() {
            return EMPTY_MAP;
        }

        public Reference get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }

        public KeyVector keys() {
            int i4 = this.end - (this.byteWidth * 3);
            ReadBuf readBuf = this.f392bb;
            int iIndirect = FlexBuffers.indirect(readBuf, i4, this.byteWidth);
            ReadBuf readBuf2 = this.f392bb;
            int i5 = this.byteWidth;
            return new KeyVector(new TypedVector(readBuf, iIndirect, FlexBuffers.readInt(readBuf2, i4 + i5, i5), 4));
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("{ ");
            KeyVector keyVectorKeys = keys();
            int size = size();
            Vector vectorValues = values();
            for (int i4 = 0; i4 < size; i4++) {
                sb.append(Typography.quote);
                sb.append(keyVectorKeys.get(i4).toString());
                sb.append("\" : ");
                sb.append(vectorValues.get(i4).toString());
                if (i4 != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public Vector values() {
            return new Vector(this.f392bb, this.end, this.byteWidth);
        }

        public Reference get(byte[] bArr) {
            KeyVector keyVectorKeys = keys();
            int size = keyVectorKeys.size();
            int iBinarySearch = binarySearch(keyVectorKeys, bArr);
            return (iBinarySearch < 0 || iBinarySearch >= size) ? Reference.NULL_REFERENCE : get(iBinarySearch);
        }
    }

    public static abstract class Object {

        /* renamed from: bb */
        ReadBuf f392bb;
        int byteWidth;
        int end;

        public Object(ReadBuf readBuf, int i4, int i5) {
            this.f392bb = readBuf;
            this.end = i4;
            this.byteWidth = i5;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    public static class Reference {
        private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.EMPTY_BB, 0, 1, 0);

        /* renamed from: bb */
        private ReadBuf f393bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        public Reference(ReadBuf readBuf, int i4, int i5, int i6) {
            this(readBuf, i4, i5, 1 << (i6 & 3), i6 >> 2);
        }

        public Blob asBlob() {
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            ReadBuf readBuf = this.f393bb;
            return new Blob(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public boolean asBoolean() {
            return isBoolean() ? this.f393bb.get(this.end) != 0 : asUInt() != 0;
        }

        public double asFloat() {
            int i4 = this.type;
            if (i4 == 3) {
                return FlexBuffers.readDouble(this.f393bb, this.end, this.parentWidth);
            }
            if (i4 == 1) {
                return FlexBuffers.readInt(this.f393bb, this.end, this.parentWidth);
            }
            if (i4 != 2) {
                if (i4 == 5) {
                    return Double.parseDouble(asString());
                }
                if (i4 == 6) {
                    ReadBuf readBuf = this.f393bb;
                    return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                }
                if (i4 == 7) {
                    ReadBuf readBuf2 = this.f393bb;
                    return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                }
                if (i4 == 8) {
                    ReadBuf readBuf3 = this.f393bb;
                    return FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                }
                if (i4 == 10) {
                    return asVector().size();
                }
                if (i4 != 26) {
                    return 0.0d;
                }
            }
            return FlexBuffers.readUInt(this.f393bb, this.end, this.parentWidth);
        }

        public int asInt() {
            int i4 = this.type;
            if (i4 == 1) {
                return FlexBuffers.readInt(this.f393bb, this.end, this.parentWidth);
            }
            if (i4 == 2) {
                return (int) FlexBuffers.readUInt(this.f393bb, this.end, this.parentWidth);
            }
            if (i4 == 3) {
                return (int) FlexBuffers.readDouble(this.f393bb, this.end, this.parentWidth);
            }
            if (i4 == 5) {
                return Integer.parseInt(asString());
            }
            if (i4 == 6) {
                ReadBuf readBuf = this.f393bb;
                return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i4 == 7) {
                ReadBuf readBuf2 = this.f393bb;
                return (int) FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i4 == 8) {
                ReadBuf readBuf3 = this.f393bb;
                return (int) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i4 == 10) {
                return asVector().size();
            }
            if (i4 != 26) {
                return 0;
            }
            return FlexBuffers.readInt(this.f393bb, this.end, this.parentWidth);
        }

        public Key asKey() {
            if (!isKey()) {
                return Key.empty();
            }
            ReadBuf readBuf = this.f393bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public long asLong() {
            int i4 = this.type;
            if (i4 == 1) {
                return FlexBuffers.readLong(this.f393bb, this.end, this.parentWidth);
            }
            if (i4 == 2) {
                return FlexBuffers.readUInt(this.f393bb, this.end, this.parentWidth);
            }
            if (i4 == 3) {
                return (long) FlexBuffers.readDouble(this.f393bb, this.end, this.parentWidth);
            }
            if (i4 == 5) {
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i4 == 6) {
                ReadBuf readBuf = this.f393bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i4 == 7) {
                ReadBuf readBuf2 = this.f393bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i4 == 8) {
                ReadBuf readBuf3 = this.f393bb;
                return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i4 == 10) {
                return asVector().size();
            }
            if (i4 != 26) {
                return 0L;
            }
            return FlexBuffers.readInt(this.f393bb, this.end, this.parentWidth);
        }

        public Map asMap() {
            if (!isMap()) {
                return Map.empty();
            }
            ReadBuf readBuf = this.f393bb;
            return new Map(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public String asString() {
            if (isString()) {
                int iIndirect = FlexBuffers.indirect(this.f393bb, this.end, this.parentWidth);
                ReadBuf readBuf = this.f393bb;
                int i4 = this.byteWidth;
                return this.f393bb.getString(iIndirect, (int) FlexBuffers.readUInt(readBuf, iIndirect - i4, i4));
            }
            if (!isKey()) {
                return "";
            }
            int iIndirect2 = FlexBuffers.indirect(this.f393bb, this.end, this.byteWidth);
            int i5 = iIndirect2;
            while (this.f393bb.get(i5) != 0) {
                i5++;
            }
            return this.f393bb.getString(iIndirect2, i5 - iIndirect2);
        }

        public long asUInt() {
            int i4 = this.type;
            if (i4 == 2) {
                return FlexBuffers.readUInt(this.f393bb, this.end, this.parentWidth);
            }
            if (i4 == 1) {
                return FlexBuffers.readLong(this.f393bb, this.end, this.parentWidth);
            }
            if (i4 == 3) {
                return (long) FlexBuffers.readDouble(this.f393bb, this.end, this.parentWidth);
            }
            if (i4 == 10) {
                return asVector().size();
            }
            if (i4 == 26) {
                return FlexBuffers.readInt(this.f393bb, this.end, this.parentWidth);
            }
            if (i4 == 5) {
                return Long.parseLong(asString());
            }
            if (i4 == 6) {
                ReadBuf readBuf = this.f393bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i4 == 7) {
                ReadBuf readBuf2 = this.f393bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
            }
            if (i4 != 8) {
                return 0L;
            }
            ReadBuf readBuf3 = this.f393bb;
            return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.parentWidth);
        }

        public Vector asVector() {
            if (isVector()) {
                ReadBuf readBuf = this.f393bb;
                return new Vector(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i4 = this.type;
            if (i4 == 15) {
                ReadBuf readBuf2 = this.f393bb;
                return new TypedVector(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            }
            if (!FlexBuffers.isTypedVector(i4)) {
                return Vector.empty();
            }
            ReadBuf readBuf3 = this.f393bb;
            return new TypedVector(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth, FlexBuffers.toTypedVectorElementType(this.type));
        }

        public int getType() {
            return this.type;
        }

        public boolean isBlob() {
            return this.type == 25;
        }

        public boolean isBoolean() {
            return this.type == 26;
        }

        public boolean isFloat() {
            int i4 = this.type;
            return i4 == 3 || i4 == 8;
        }

        public boolean isInt() {
            int i4 = this.type;
            return i4 == 1 || i4 == 6;
        }

        public boolean isIntOrUInt() {
            return isInt() || isUInt();
        }

        public boolean isKey() {
            return this.type == 4;
        }

        public boolean isMap() {
            return this.type == 9;
        }

        public boolean isNull() {
            return this.type == 0;
        }

        public boolean isNumeric() {
            return isIntOrUInt() || isFloat();
        }

        public boolean isString() {
            return this.type == 5;
        }

        public boolean isTypedVector() {
            return FlexBuffers.isTypedVector(this.type);
        }

        public boolean isUInt() {
            int i4 = this.type;
            return i4 == 2 || i4 == 7;
        }

        public boolean isVector() {
            int i4 = this.type;
            return i4 == 10 || i4 == 9;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public Reference(ReadBuf readBuf, int i4, int i5, int i6, int i7) {
            this.f393bb = readBuf;
            this.end = i4;
            this.parentWidth = i5;
            this.byteWidth = i6;
            this.type = i7;
        }

        public StringBuilder toString(StringBuilder sb) {
            int i4 = this.type;
            if (i4 != 36) {
                switch (i4) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(asLong());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(asUInt());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(asFloat());
                        return sb;
                    case 4:
                        Key keyAsKey = asKey();
                        sb.append(Typography.quote);
                        StringBuilder string = keyAsKey.toString(sb);
                        string.append(Typography.quote);
                        return string;
                    case 5:
                        sb.append(Typography.quote);
                        sb.append(asString());
                        sb.append(Typography.quote);
                        return sb;
                    case 9:
                        return asMap().toString(sb);
                    case 10:
                        return asVector().toString(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.type);
                    case 25:
                        return asBlob().toString(sb);
                    case 26:
                        sb.append(asBoolean());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(asVector());
            return sb;
        }
    }

    public static abstract class Sized extends Object {
        protected final int size;

        public Sized(ReadBuf readBuf, int i4, int i5) {
            super(readBuf, i4, i5);
            this.size = FlexBuffers.readInt(this.f392bb, i4 - i5, i5);
        }

        public int size() {
            return this.size;
        }
    }

    public static class TypedVector extends Vector {
        private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.EMPTY_BB, 1, 1, 1);
        private final int elemType;

        public TypedVector(ReadBuf readBuf, int i4, int i5, int i6) {
            super(readBuf, i4, i5);
            this.elemType = i6;
        }

        public static TypedVector empty() {
            return EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int i4) {
            if (i4 >= size()) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f392bb, this.end + (i4 * this.byteWidth), this.byteWidth, 1, this.elemType);
        }

        public int getElemType() {
            return this.elemType;
        }

        public boolean isEmptyVector() {
            return this == EMPTY_VECTOR;
        }
    }

    public static class Unsigned {
        public static int byteToUnsignedInt(byte b4) {
            return b4 & UByte.MAX_VALUE;
        }

        public static long intToUnsignedLong(int i4) {
            return i4 & 4294967295L;
        }

        public static int shortToUnsignedInt(short s3) {
            return s3 & UShort.MAX_VALUE;
        }
    }

    public static class Vector extends Sized {
        private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.EMPTY_BB, 1, 1);

        public Vector(ReadBuf readBuf, int i4, int i5) {
            super(readBuf, i4, i5);
        }

        public static Vector empty() {
            return EMPTY_VECTOR;
        }

        public Reference get(int i4) {
            long size = size();
            long j4 = i4;
            if (j4 >= size) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f392bb, this.end + (i4 * this.byteWidth), this.byteWidth, Unsigned.byteToUnsignedInt(this.f392bb.get((int) (this.end + (size * this.byteWidth) + j4))));
        }

        public boolean isEmpty() {
            return this == EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i4 = 0; i4 < size; i4++) {
                get(i4).toString(sb);
                if (i4 != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }
    }

    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new ByteBufferReadWriteBuf(byteBuffer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indirect(ReadBuf readBuf, int i4, int i5) {
        return (int) (i4 - readUInt(readBuf, i4, i5));
    }

    public static boolean isTypeInline(int i4) {
        return i4 <= 3 || i4 == 26;
    }

    public static boolean isTypedVector(int i4) {
        return (i4 >= 11 && i4 <= 15) || i4 == 36;
    }

    public static boolean isTypedVectorElementType(int i4) {
        return (i4 >= 1 && i4 <= 4) || i4 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(ReadBuf readBuf, int i4, int i5) {
        if (i5 == 4) {
            return readBuf.getFloat(i4);
        }
        if (i5 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(ReadBuf readBuf, int i4, int i5) {
        return (int) readLong(readBuf, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(ReadBuf readBuf, int i4, int i5) {
        int i6;
        if (i5 == 1) {
            i6 = readBuf.get(i4);
        } else if (i5 == 2) {
            i6 = readBuf.getShort(i4);
        } else {
            if (i5 != 4) {
                if (i5 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i4);
            }
            i6 = readBuf.getInt(i4);
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(ReadBuf readBuf, int i4, int i5) {
        if (i5 == 1) {
            return Unsigned.byteToUnsignedInt(readBuf.get(i4));
        }
        if (i5 == 2) {
            return Unsigned.shortToUnsignedInt(readBuf.getShort(i4));
        }
        if (i5 == 4) {
            return Unsigned.intToUnsignedLong(readBuf.getInt(i4));
        }
        if (i5 != 8) {
            return -1L;
        }
        return readBuf.getLong(i4);
    }

    public static int toTypedVector(int i4, int i5) {
        if (i5 == 0) {
            return (i4 - 1) + 11;
        }
        if (i5 == 2) {
            return (i4 - 1) + 16;
        }
        if (i5 == 3) {
            return (i4 - 1) + 19;
        }
        if (i5 != 4) {
            return 0;
        }
        return (i4 - 1) + 22;
    }

    public static int toTypedVectorElementType(int i4) {
        return (i4 - 11) + 1;
    }

    public static Reference getRoot(ReadBuf readBuf) {
        int iLimit = readBuf.limit() - 1;
        byte b4 = readBuf.get(iLimit);
        int i4 = iLimit - 1;
        return new Reference(readBuf, i4 - b4, b4, Unsigned.byteToUnsignedInt(readBuf.get(i4)));
    }
}
