package com.google.flatbuffers;

import androidx.camera.video.AudioStats;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
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

        public Blob(ReadBuf readBuf, int i9, int i10) {
            super(readBuf, i9, i10);
        }

        public static Blob empty() {
            return EMPTY;
        }

        public ByteBuffer data() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f5061bb.data());
            byteBufferWrap.position(this.end);
            byteBufferWrap.limit(this.end + size());
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i9) {
            return this.f5061bb.get(this.end + i9);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i9 = 0; i9 < size; i9++) {
                bArr[i9] = this.f5061bb.get(this.end + i9);
            }
            return bArr;
        }

        @Override // com.google.flatbuffers.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public String toString() {
            return this.f5061bb.getString(this.end, size());
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(Typography.quote);
            sb.append(this.f5061bb.getString(this.end, size()));
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

        public Key(ReadBuf readBuf, int i9, int i10) {
            super(readBuf, i9, i10);
        }

        public static Key empty() {
            return EMPTY;
        }

        public int compareTo(byte[] bArr) {
            byte b10;
            byte b11;
            int i9 = this.end;
            int i10 = 0;
            do {
                b10 = this.f5061bb.get(i9);
                b11 = bArr[i10];
                if (b10 == 0) {
                    return b10 - b11;
                }
                i9++;
                i10++;
                if (i10 == bArr.length) {
                    return b10 - b11;
                }
            } while (b10 == b11);
            return b10 - b11;
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

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public String toString() {
            int i9 = this.end;
            while (this.f5061bb.get(i9) != 0) {
                i9++;
            }
            int i10 = this.end;
            return this.f5061bb.getString(i10, i9 - i10);
        }
    }

    public static class KeyVector {
        private final TypedVector vec;

        public KeyVector(TypedVector typedVector) {
            this.vec = typedVector;
        }

        public Key get(int i9) {
            if (i9 >= size()) {
                return Key.EMPTY;
            }
            TypedVector typedVector = this.vec;
            int i10 = typedVector.end + (i9 * typedVector.byteWidth);
            TypedVector typedVector2 = this.vec;
            ReadBuf readBuf = typedVector2.f5061bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, i10, typedVector2.byteWidth), 1);
        }

        public int size() {
            return this.vec.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i9 = 0; i9 < this.vec.size(); i9++) {
                this.vec.get(i9).toString(sb);
                if (i9 != this.vec.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static class Map extends Vector {
        private static final Map EMPTY_MAP = new Map(FlexBuffers.EMPTY_BB, 1, 1);

        public Map(ReadBuf readBuf, int i9, int i10) {
            super(readBuf, i9, i10);
        }

        private int binarySearch(KeyVector keyVector, byte[] bArr) {
            int size = keyVector.size() - 1;
            int i9 = 0;
            while (i9 <= size) {
                int i10 = (i9 + size) >>> 1;
                int iCompareTo = keyVector.get(i10).compareTo(bArr);
                if (iCompareTo < 0) {
                    i9 = i10 + 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i10;
                    }
                    size = i10 - 1;
                }
            }
            return -(i9 + 1);
        }

        public static Map empty() {
            return EMPTY_MAP;
        }

        public Reference get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }

        public KeyVector keys() {
            int i9 = this.end - (this.byteWidth * 3);
            ReadBuf readBuf = this.f5061bb;
            int iIndirect = FlexBuffers.indirect(readBuf, i9, this.byteWidth);
            ReadBuf readBuf2 = this.f5061bb;
            int i10 = this.byteWidth;
            return new KeyVector(new TypedVector(readBuf, iIndirect, FlexBuffers.readInt(readBuf2, i9 + i10, i10), 4));
        }

        @Override // com.google.flatbuffers.FlexBuffers.Vector, com.google.flatbuffers.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("{ ");
            KeyVector keyVectorKeys = keys();
            int size = size();
            Vector vectorValues = values();
            for (int i9 = 0; i9 < size; i9++) {
                sb.append(Typography.quote);
                sb.append(keyVectorKeys.get(i9).toString());
                sb.append("\" : ");
                sb.append(vectorValues.get(i9).toString());
                if (i9 != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public Vector values() {
            return new Vector(this.f5061bb, this.end, this.byteWidth);
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
        ReadBuf f5061bb;
        int byteWidth;
        int end;

        public Object(ReadBuf readBuf, int i9, int i10) {
            this.f5061bb = readBuf;
            this.end = i9;
            this.byteWidth = i10;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    public static class Reference {
        private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.EMPTY_BB, 0, 1, 0);

        /* renamed from: bb */
        private ReadBuf f5062bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        public Reference(ReadBuf readBuf, int i9, int i10, int i11) {
            this(readBuf, i9, i10, 1 << (i11 & 3), i11 >> 2);
        }

        public Blob asBlob() {
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            ReadBuf readBuf = this.f5062bb;
            return new Blob(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public boolean asBoolean() {
            return isBoolean() ? this.f5062bb.get(this.end) != 0 : asUInt() != 0;
        }

        public double asFloat() {
            int i9 = this.type;
            if (i9 == 3) {
                return FlexBuffers.readDouble(this.f5062bb, this.end, this.parentWidth);
            }
            if (i9 == 1) {
                return FlexBuffers.readInt(this.f5062bb, this.end, this.parentWidth);
            }
            if (i9 != 2) {
                if (i9 == 5) {
                    return Double.parseDouble(asString());
                }
                if (i9 == 6) {
                    ReadBuf readBuf = this.f5062bb;
                    return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                }
                if (i9 == 7) {
                    ReadBuf readBuf2 = this.f5062bb;
                    return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                }
                if (i9 == 8) {
                    ReadBuf readBuf3 = this.f5062bb;
                    return FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                }
                if (i9 == 10) {
                    return asVector().size();
                }
                if (i9 != 26) {
                    return AudioStats.AUDIO_AMPLITUDE_NONE;
                }
            }
            return FlexBuffers.readUInt(this.f5062bb, this.end, this.parentWidth);
        }

        public int asInt() {
            int i9 = this.type;
            if (i9 == 1) {
                return FlexBuffers.readInt(this.f5062bb, this.end, this.parentWidth);
            }
            if (i9 == 2) {
                return (int) FlexBuffers.readUInt(this.f5062bb, this.end, this.parentWidth);
            }
            if (i9 == 3) {
                return (int) FlexBuffers.readDouble(this.f5062bb, this.end, this.parentWidth);
            }
            if (i9 == 5) {
                return Integer.parseInt(asString());
            }
            if (i9 == 6) {
                ReadBuf readBuf = this.f5062bb;
                return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i9 == 7) {
                ReadBuf readBuf2 = this.f5062bb;
                return (int) FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i9 == 8) {
                ReadBuf readBuf3 = this.f5062bb;
                return (int) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i9 == 10) {
                return asVector().size();
            }
            if (i9 != 26) {
                return 0;
            }
            return FlexBuffers.readInt(this.f5062bb, this.end, this.parentWidth);
        }

        public Key asKey() {
            if (!isKey()) {
                return Key.empty();
            }
            ReadBuf readBuf = this.f5062bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public long asLong() {
            int i9 = this.type;
            if (i9 == 1) {
                return FlexBuffers.readLong(this.f5062bb, this.end, this.parentWidth);
            }
            if (i9 == 2) {
                return FlexBuffers.readUInt(this.f5062bb, this.end, this.parentWidth);
            }
            if (i9 == 3) {
                return (long) FlexBuffers.readDouble(this.f5062bb, this.end, this.parentWidth);
            }
            if (i9 == 5) {
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i9 == 6) {
                ReadBuf readBuf = this.f5062bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i9 == 7) {
                ReadBuf readBuf2 = this.f5062bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i9 == 8) {
                ReadBuf readBuf3 = this.f5062bb;
                return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i9 == 10) {
                return asVector().size();
            }
            if (i9 != 26) {
                return 0L;
            }
            return FlexBuffers.readInt(this.f5062bb, this.end, this.parentWidth);
        }

        public Map asMap() {
            if (!isMap()) {
                return Map.empty();
            }
            ReadBuf readBuf = this.f5062bb;
            return new Map(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public String asString() {
            if (isString()) {
                int iIndirect = FlexBuffers.indirect(this.f5062bb, this.end, this.parentWidth);
                ReadBuf readBuf = this.f5062bb;
                int i9 = this.byteWidth;
                return this.f5062bb.getString(iIndirect, (int) FlexBuffers.readUInt(readBuf, iIndirect - i9, i9));
            }
            if (!isKey()) {
                return "";
            }
            int iIndirect2 = FlexBuffers.indirect(this.f5062bb, this.end, this.byteWidth);
            int i10 = iIndirect2;
            while (this.f5062bb.get(i10) != 0) {
                i10++;
            }
            return this.f5062bb.getString(iIndirect2, i10 - iIndirect2);
        }

        public long asUInt() {
            int i9 = this.type;
            if (i9 == 2) {
                return FlexBuffers.readUInt(this.f5062bb, this.end, this.parentWidth);
            }
            if (i9 == 1) {
                return FlexBuffers.readLong(this.f5062bb, this.end, this.parentWidth);
            }
            if (i9 == 3) {
                return (long) FlexBuffers.readDouble(this.f5062bb, this.end, this.parentWidth);
            }
            if (i9 == 10) {
                return asVector().size();
            }
            if (i9 == 26) {
                return FlexBuffers.readInt(this.f5062bb, this.end, this.parentWidth);
            }
            if (i9 == 5) {
                return Long.parseLong(asString());
            }
            if (i9 == 6) {
                ReadBuf readBuf = this.f5062bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i9 == 7) {
                ReadBuf readBuf2 = this.f5062bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
            }
            if (i9 != 8) {
                return 0L;
            }
            ReadBuf readBuf3 = this.f5062bb;
            return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.parentWidth);
        }

        public Vector asVector() {
            if (isVector()) {
                ReadBuf readBuf = this.f5062bb;
                return new Vector(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i9 = this.type;
            if (i9 == 15) {
                ReadBuf readBuf2 = this.f5062bb;
                return new TypedVector(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            }
            if (!FlexBuffers.isTypedVector(i9)) {
                return Vector.empty();
            }
            ReadBuf readBuf3 = this.f5062bb;
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
            int i9 = this.type;
            return i9 == 3 || i9 == 8;
        }

        public boolean isInt() {
            int i9 = this.type;
            return i9 == 1 || i9 == 6;
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
            int i9 = this.type;
            return i9 == 2 || i9 == 7;
        }

        public boolean isVector() {
            int i9 = this.type;
            return i9 == 10 || i9 == 9;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public Reference(ReadBuf readBuf, int i9, int i10, int i11, int i12) {
            this.f5062bb = readBuf;
            this.end = i9;
            this.parentWidth = i10;
            this.byteWidth = i11;
            this.type = i12;
        }

        public StringBuilder toString(StringBuilder sb) {
            int i9 = this.type;
            if (i9 != 36) {
                switch (i9) {
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

        public Sized(ReadBuf readBuf, int i9, int i10) {
            super(readBuf, i9, i10);
            this.size = FlexBuffers.readInt(this.f5061bb, i9 - i10, i10);
        }

        public int size() {
            return this.size;
        }
    }

    public static class TypedVector extends Vector {
        private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.EMPTY_BB, 1, 1, 1);
        private final int elemType;

        public TypedVector(ReadBuf readBuf, int i9, int i10, int i11) {
            super(readBuf, i9, i10);
            this.elemType = i11;
        }

        public static TypedVector empty() {
            return EMPTY_VECTOR;
        }

        @Override // com.google.flatbuffers.FlexBuffers.Vector
        public Reference get(int i9) {
            if (i9 >= size()) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f5061bb, this.end + (i9 * this.byteWidth), this.byteWidth, 1, this.elemType);
        }

        public int getElemType() {
            return this.elemType;
        }

        public boolean isEmptyVector() {
            return this == EMPTY_VECTOR;
        }
    }

    public static class Unsigned {
        public static int byteToUnsignedInt(byte b10) {
            return b10 & UByte.MAX_VALUE;
        }

        public static long intToUnsignedLong(int i9) {
            return i9 & 4294967295L;
        }

        public static int shortToUnsignedInt(short s9) {
            return s9 & UShort.MAX_VALUE;
        }
    }

    public static class Vector extends Sized {
        private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.EMPTY_BB, 1, 1);

        public Vector(ReadBuf readBuf, int i9, int i10) {
            super(readBuf, i9, i10);
        }

        public static Vector empty() {
            return EMPTY_VECTOR;
        }

        public Reference get(int i9) {
            long size = size();
            long j9 = i9;
            if (j9 >= size) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f5061bb, this.end + (i9 * this.byteWidth), this.byteWidth, Unsigned.byteToUnsignedInt(this.f5061bb.get((int) (this.end + (size * this.byteWidth) + j9))));
        }

        public boolean isEmpty() {
            return this == EMPTY_VECTOR;
        }

        @Override // com.google.flatbuffers.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i9 = 0; i9 < size; i9++) {
                get(i9).toString(sb);
                if (i9 != size - 1) {
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
    public static int indirect(ReadBuf readBuf, int i9, int i10) {
        return (int) (i9 - readUInt(readBuf, i9, i10));
    }

    public static boolean isTypeInline(int i9) {
        return i9 <= 3 || i9 == 26;
    }

    public static boolean isTypedVector(int i9) {
        return (i9 >= 11 && i9 <= 15) || i9 == 36;
    }

    public static boolean isTypedVectorElementType(int i9) {
        return (i9 >= 1 && i9 <= 4) || i9 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(ReadBuf readBuf, int i9, int i10) {
        if (i10 == 4) {
            return readBuf.getFloat(i9);
        }
        if (i10 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(ReadBuf readBuf, int i9, int i10) {
        return (int) readLong(readBuf, i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(ReadBuf readBuf, int i9, int i10) {
        int i11;
        if (i10 == 1) {
            i11 = readBuf.get(i9);
        } else if (i10 == 2) {
            i11 = readBuf.getShort(i9);
        } else {
            if (i10 != 4) {
                if (i10 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i9);
            }
            i11 = readBuf.getInt(i9);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(ReadBuf readBuf, int i9, int i10) {
        if (i10 == 1) {
            return Unsigned.byteToUnsignedInt(readBuf.get(i9));
        }
        if (i10 == 2) {
            return Unsigned.shortToUnsignedInt(readBuf.getShort(i9));
        }
        if (i10 == 4) {
            return Unsigned.intToUnsignedLong(readBuf.getInt(i9));
        }
        if (i10 != 8) {
            return -1L;
        }
        return readBuf.getLong(i9);
    }

    public static int toTypedVector(int i9, int i10) {
        if (i10 == 0) {
            return i9 + 10;
        }
        if (i10 == 2) {
            return i9 + 15;
        }
        if (i10 == 3) {
            return i9 + 18;
        }
        if (i10 != 4) {
            return 0;
        }
        return i9 + 21;
    }

    public static int toTypedVectorElementType(int i9) {
        return i9 - 10;
    }

    public static Reference getRoot(ReadBuf readBuf) {
        int iLimit = readBuf.limit();
        byte b10 = readBuf.get(iLimit - 1);
        int i9 = iLimit - 2;
        return new Reference(readBuf, i9 - b10, b10, Unsigned.byteToUnsignedInt(readBuf.get(i9)));
    }
}
