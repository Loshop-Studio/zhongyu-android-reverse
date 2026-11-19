package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
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

        public Blob(ReadBuf readBuf, int i6, int i7) {
            super(readBuf, i6, i7);
        }

        public static Blob empty() {
            return EMPTY;
        }

        public ByteBuffer data() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f554bb.data());
            byteBufferWrap.position(this.end);
            byteBufferWrap.limit(this.end + size());
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i6) {
            return this.f554bb.get(this.end + i6);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i6 = 0; i6 < size; i6++) {
                bArr[i6] = this.f554bb.get(this.end + i6);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            return this.f554bb.getString(this.end, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(Typography.quote);
            sb.append(this.f554bb.getString(this.end, size()));
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

        public Key(ReadBuf readBuf, int i6, int i7) {
            super(readBuf, i6, i7);
        }

        public static Key empty() {
            return EMPTY;
        }

        public int compareTo(byte[] bArr) {
            byte b7;
            byte b8;
            int i6 = this.end;
            int i7 = 0;
            do {
                b7 = this.f554bb.get(i6);
                b8 = bArr[i7];
                if (b7 == 0) {
                    return b7 - b8;
                }
                i6++;
                i7++;
                if (i7 == bArr.length) {
                    return b7 - b8;
                }
            } while (b7 == b8);
            return b7 - b8;
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
            int i6 = this.end;
            while (this.f554bb.get(i6) != 0) {
                i6++;
            }
            int i7 = this.end;
            return this.f554bb.getString(i7, i6 - i7);
        }
    }

    public static class KeyVector {
        private final TypedVector vec;

        public KeyVector(TypedVector typedVector) {
            this.vec = typedVector;
        }

        public Key get(int i6) {
            if (i6 >= size()) {
                return Key.EMPTY;
            }
            TypedVector typedVector = this.vec;
            int i7 = typedVector.end + (i6 * typedVector.byteWidth);
            TypedVector typedVector2 = this.vec;
            ReadBuf readBuf = typedVector2.f554bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, i7, typedVector2.byteWidth), 1);
        }

        public int size() {
            return this.vec.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i6 = 0; i6 < this.vec.size(); i6++) {
                this.vec.get(i6).toString(sb);
                if (i6 != this.vec.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static class Map extends Vector {
        private static final Map EMPTY_MAP = new Map(FlexBuffers.EMPTY_BB, 1, 1);

        public Map(ReadBuf readBuf, int i6, int i7) {
            super(readBuf, i6, i7);
        }

        private int binarySearch(KeyVector keyVector, byte[] bArr) {
            int size = keyVector.size() - 1;
            int i6 = 0;
            while (i6 <= size) {
                int i7 = (i6 + size) >>> 1;
                int iCompareTo = keyVector.get(i7).compareTo(bArr);
                if (iCompareTo < 0) {
                    i6 = i7 + 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i7;
                    }
                    size = i7 - 1;
                }
            }
            return -(i6 + 1);
        }

        public static Map empty() {
            return EMPTY_MAP;
        }

        public Reference get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }

        public KeyVector keys() {
            int i6 = this.end - (this.byteWidth * 3);
            ReadBuf readBuf = this.f554bb;
            int iIndirect = FlexBuffers.indirect(readBuf, i6, this.byteWidth);
            ReadBuf readBuf2 = this.f554bb;
            int i7 = this.byteWidth;
            return new KeyVector(new TypedVector(readBuf, iIndirect, FlexBuffers.readInt(readBuf2, i6 + i7, i7), 4));
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("{ ");
            KeyVector keyVectorKeys = keys();
            int size = size();
            Vector vectorValues = values();
            for (int i6 = 0; i6 < size; i6++) {
                sb.append(Typography.quote);
                sb.append(keyVectorKeys.get(i6).toString());
                sb.append("\" : ");
                sb.append(vectorValues.get(i6).toString());
                if (i6 != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public Vector values() {
            return new Vector(this.f554bb, this.end, this.byteWidth);
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
        ReadBuf f554bb;
        int byteWidth;
        int end;

        public Object(ReadBuf readBuf, int i6, int i7) {
            this.f554bb = readBuf;
            this.end = i6;
            this.byteWidth = i7;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    public static class Reference {
        private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.EMPTY_BB, 0, 1, 0);

        /* renamed from: bb */
        private ReadBuf f555bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        public Reference(ReadBuf readBuf, int i6, int i7, int i8) {
            this(readBuf, i6, i7, 1 << (i8 & 3), i8 >> 2);
        }

        public Blob asBlob() {
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            ReadBuf readBuf = this.f555bb;
            return new Blob(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public boolean asBoolean() {
            return isBoolean() ? this.f555bb.get(this.end) != 0 : asUInt() != 0;
        }

        public double asFloat() {
            int i6 = this.type;
            if (i6 == 3) {
                return FlexBuffers.readDouble(this.f555bb, this.end, this.parentWidth);
            }
            if (i6 == 1) {
                return FlexBuffers.readInt(this.f555bb, this.end, this.parentWidth);
            }
            if (i6 != 2) {
                if (i6 == 5) {
                    return Double.parseDouble(asString());
                }
                if (i6 == 6) {
                    ReadBuf readBuf = this.f555bb;
                    return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                }
                if (i6 == 7) {
                    ReadBuf readBuf2 = this.f555bb;
                    return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                }
                if (i6 == 8) {
                    ReadBuf readBuf3 = this.f555bb;
                    return FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                }
                if (i6 == 10) {
                    return asVector().size();
                }
                if (i6 != 26) {
                    return 0.0d;
                }
            }
            return FlexBuffers.readUInt(this.f555bb, this.end, this.parentWidth);
        }

        public int asInt() {
            int i6 = this.type;
            if (i6 == 1) {
                return FlexBuffers.readInt(this.f555bb, this.end, this.parentWidth);
            }
            if (i6 == 2) {
                return (int) FlexBuffers.readUInt(this.f555bb, this.end, this.parentWidth);
            }
            if (i6 == 3) {
                return (int) FlexBuffers.readDouble(this.f555bb, this.end, this.parentWidth);
            }
            if (i6 == 5) {
                return Integer.parseInt(asString());
            }
            if (i6 == 6) {
                ReadBuf readBuf = this.f555bb;
                return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i6 == 7) {
                ReadBuf readBuf2 = this.f555bb;
                return (int) FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i6 == 8) {
                ReadBuf readBuf3 = this.f555bb;
                return (int) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i6 == 10) {
                return asVector().size();
            }
            if (i6 != 26) {
                return 0;
            }
            return FlexBuffers.readInt(this.f555bb, this.end, this.parentWidth);
        }

        public Key asKey() {
            if (!isKey()) {
                return Key.empty();
            }
            ReadBuf readBuf = this.f555bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public long asLong() {
            int i6 = this.type;
            if (i6 == 1) {
                return FlexBuffers.readLong(this.f555bb, this.end, this.parentWidth);
            }
            if (i6 == 2) {
                return FlexBuffers.readUInt(this.f555bb, this.end, this.parentWidth);
            }
            if (i6 == 3) {
                return (long) FlexBuffers.readDouble(this.f555bb, this.end, this.parentWidth);
            }
            if (i6 == 5) {
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i6 == 6) {
                ReadBuf readBuf = this.f555bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i6 == 7) {
                ReadBuf readBuf2 = this.f555bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i6 == 8) {
                ReadBuf readBuf3 = this.f555bb;
                return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i6 == 10) {
                return asVector().size();
            }
            if (i6 != 26) {
                return 0L;
            }
            return FlexBuffers.readInt(this.f555bb, this.end, this.parentWidth);
        }

        public Map asMap() {
            if (!isMap()) {
                return Map.empty();
            }
            ReadBuf readBuf = this.f555bb;
            return new Map(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public String asString() {
            if (isString()) {
                int iIndirect = FlexBuffers.indirect(this.f555bb, this.end, this.parentWidth);
                ReadBuf readBuf = this.f555bb;
                int i6 = this.byteWidth;
                return this.f555bb.getString(iIndirect, (int) FlexBuffers.readUInt(readBuf, iIndirect - i6, i6));
            }
            if (!isKey()) {
                return "";
            }
            int iIndirect2 = FlexBuffers.indirect(this.f555bb, this.end, this.byteWidth);
            int i7 = iIndirect2;
            while (this.f555bb.get(i7) != 0) {
                i7++;
            }
            return this.f555bb.getString(iIndirect2, i7 - iIndirect2);
        }

        public long asUInt() {
            int i6 = this.type;
            if (i6 == 2) {
                return FlexBuffers.readUInt(this.f555bb, this.end, this.parentWidth);
            }
            if (i6 == 1) {
                return FlexBuffers.readLong(this.f555bb, this.end, this.parentWidth);
            }
            if (i6 == 3) {
                return (long) FlexBuffers.readDouble(this.f555bb, this.end, this.parentWidth);
            }
            if (i6 == 10) {
                return asVector().size();
            }
            if (i6 == 26) {
                return FlexBuffers.readInt(this.f555bb, this.end, this.parentWidth);
            }
            if (i6 == 5) {
                return Long.parseLong(asString());
            }
            if (i6 == 6) {
                ReadBuf readBuf = this.f555bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i6 == 7) {
                ReadBuf readBuf2 = this.f555bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
            }
            if (i6 != 8) {
                return 0L;
            }
            ReadBuf readBuf3 = this.f555bb;
            return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.parentWidth);
        }

        public Vector asVector() {
            if (isVector()) {
                ReadBuf readBuf = this.f555bb;
                return new Vector(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i6 = this.type;
            if (i6 == 15) {
                ReadBuf readBuf2 = this.f555bb;
                return new TypedVector(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            }
            if (!FlexBuffers.isTypedVector(i6)) {
                return Vector.empty();
            }
            ReadBuf readBuf3 = this.f555bb;
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
            int i6 = this.type;
            return i6 == 3 || i6 == 8;
        }

        public boolean isInt() {
            int i6 = this.type;
            return i6 == 1 || i6 == 6;
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
            int i6 = this.type;
            return i6 == 2 || i6 == 7;
        }

        public boolean isVector() {
            int i6 = this.type;
            return i6 == 10 || i6 == 9;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public Reference(ReadBuf readBuf, int i6, int i7, int i8, int i9) {
            this.f555bb = readBuf;
            this.end = i6;
            this.parentWidth = i7;
            this.byteWidth = i8;
            this.type = i9;
        }

        public StringBuilder toString(StringBuilder sb) {
            int i6 = this.type;
            if (i6 != 36) {
                switch (i6) {
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

        public Sized(ReadBuf readBuf, int i6, int i7) {
            super(readBuf, i6, i7);
            this.size = FlexBuffers.readInt(this.f554bb, i6 - i7, i7);
        }

        public int size() {
            return this.size;
        }
    }

    public static class TypedVector extends Vector {
        private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.EMPTY_BB, 1, 1, 1);
        private final int elemType;

        public TypedVector(ReadBuf readBuf, int i6, int i7, int i8) {
            super(readBuf, i6, i7);
            this.elemType = i8;
        }

        public static TypedVector empty() {
            return EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int i6) {
            if (i6 >= size()) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f554bb, this.end + (i6 * this.byteWidth), this.byteWidth, 1, this.elemType);
        }

        public int getElemType() {
            return this.elemType;
        }

        public boolean isEmptyVector() {
            return this == EMPTY_VECTOR;
        }
    }

    public static class Unsigned {
        public static int byteToUnsignedInt(byte b7) {
            return b7 & UByte.MAX_VALUE;
        }

        public static long intToUnsignedLong(int i6) {
            return i6 & 4294967295L;
        }

        public static int shortToUnsignedInt(short s6) {
            return s6 & UShort.MAX_VALUE;
        }
    }

    public static class Vector extends Sized {
        private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.EMPTY_BB, 1, 1);

        public Vector(ReadBuf readBuf, int i6, int i7) {
            super(readBuf, i6, i7);
        }

        public static Vector empty() {
            return EMPTY_VECTOR;
        }

        public Reference get(int i6) {
            long size = size();
            long j6 = i6;
            if (j6 >= size) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f554bb, this.end + (i6 * this.byteWidth), this.byteWidth, Unsigned.byteToUnsignedInt(this.f554bb.get((int) (this.end + (size * this.byteWidth) + j6))));
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
            for (int i6 = 0; i6 < size; i6++) {
                get(i6).toString(sb);
                if (i6 != size - 1) {
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
    public static int indirect(ReadBuf readBuf, int i6, int i7) {
        return (int) (i6 - readUInt(readBuf, i6, i7));
    }

    public static boolean isTypeInline(int i6) {
        return i6 <= 3 || i6 == 26;
    }

    public static boolean isTypedVector(int i6) {
        return (i6 >= 11 && i6 <= 15) || i6 == 36;
    }

    public static boolean isTypedVectorElementType(int i6) {
        return (i6 >= 1 && i6 <= 4) || i6 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(ReadBuf readBuf, int i6, int i7) {
        if (i7 == 4) {
            return readBuf.getFloat(i6);
        }
        if (i7 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(ReadBuf readBuf, int i6, int i7) {
        return (int) readLong(readBuf, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(ReadBuf readBuf, int i6, int i7) {
        int i8;
        if (i7 == 1) {
            i8 = readBuf.get(i6);
        } else if (i7 == 2) {
            i8 = readBuf.getShort(i6);
        } else {
            if (i7 != 4) {
                if (i7 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i6);
            }
            i8 = readBuf.getInt(i6);
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(ReadBuf readBuf, int i6, int i7) {
        if (i7 == 1) {
            return Unsigned.byteToUnsignedInt(readBuf.get(i6));
        }
        if (i7 == 2) {
            return Unsigned.shortToUnsignedInt(readBuf.getShort(i6));
        }
        if (i7 == 4) {
            return Unsigned.intToUnsignedLong(readBuf.getInt(i6));
        }
        if (i7 != 8) {
            return -1L;
        }
        return readBuf.getLong(i6);
    }

    public static int toTypedVector(int i6, int i7) {
        if (i7 == 0) {
            return i6 + 10;
        }
        if (i7 == 2) {
            return i6 + 15;
        }
        if (i7 == 3) {
            return i6 + 18;
        }
        if (i7 != 4) {
            return 0;
        }
        return i6 + 21;
    }

    public static int toTypedVectorElementType(int i6) {
        return i6 - 10;
    }

    public static Reference getRoot(ReadBuf readBuf) {
        int iLimit = readBuf.limit();
        byte b7 = readBuf.get(iLimit - 1);
        int i6 = iLimit - 2;
        return new Reference(readBuf, i6 - b7, b7, Unsigned.byteToUnsignedInt(readBuf.get(i6)));
    }
}
