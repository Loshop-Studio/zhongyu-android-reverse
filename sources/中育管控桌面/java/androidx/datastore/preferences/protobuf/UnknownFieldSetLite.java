package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.Writer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int i6) {
        int[] iArr = this.tags;
        if (i6 > iArr.length) {
            int i7 = this.count;
            int i8 = i7 + (i7 / 2);
            if (i8 >= i6) {
                i6 = i8;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.tags = Arrays.copyOf(iArr, i6);
            this.objects = Arrays.copyOf(this.objects, i6);
        }
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] iArr, int i6) {
        int i7 = 17;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        return i7;
    }

    private UnknownFieldSetLite mergeFrom(CodedInputStream codedInputStream) {
        int tag;
        do {
            tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
        } while (mergeFieldFrom(tag, codedInputStream));
        return this;
    }

    public static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i6 = unknownFieldSetLite.count + unknownFieldSetLite2.count;
        int[] iArrCopyOf = Arrays.copyOf(unknownFieldSetLite.tags, i6);
        System.arraycopy(unknownFieldSetLite2.tags, 0, iArrCopyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        Object[] objArrCopyOf = Arrays.copyOf(unknownFieldSetLite.objects, i6);
        System.arraycopy(unknownFieldSetLite2.objects, 0, objArrCopyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        return new UnknownFieldSetLite(i6, iArrCopyOf, objArrCopyOf, true);
    }

    public static UnknownFieldSetLite newInstance() {
        return new UnknownFieldSetLite();
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (!objArr[i7].equals(objArr2[i7])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (iArr[i7] != iArr2[i7]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int i6, Object obj, Writer writer) {
        int tagFieldNumber = WireFormat.getTagFieldNumber(i6);
        int tagWireType = WireFormat.getTagWireType(i6);
        if (tagWireType == 0) {
            writer.writeInt64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 1) {
            writer.writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 2) {
            writer.writeBytes(tagFieldNumber, (ByteString) obj);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            writer.writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
        } else if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            writer.writeStartGroup(tagFieldNumber);
            ((UnknownFieldSetLite) obj).writeTo(writer);
            writer.writeEndGroup(tagFieldNumber);
        } else {
            writer.writeEndGroup(tagFieldNumber);
            ((UnknownFieldSetLite) obj).writeTo(writer);
            writer.writeStartGroup(tagFieldNumber);
        }
    }

    public void checkMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i6 = this.count;
        return i6 == unknownFieldSetLite.count && tagsEquals(this.tags, unknownFieldSetLite.tags, i6) && objectsEquals(this.objects, unknownFieldSetLite.objects, this.count);
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i6 = this.memoizedSerializedSize;
        if (i6 != -1) {
            return i6;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.count; i8++) {
            int i9 = this.tags[i8];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i9);
            int tagWireType = WireFormat.getTagWireType(i9);
            if (tagWireType == 0) {
                iComputeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i8]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i8]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.objects[i8]);
            } else if (tagWireType == 3) {
                iComputeUInt64Size = (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((UnknownFieldSetLite) this.objects[i8]).getSerializedSize();
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iComputeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i8]).intValue());
            }
            i7 += iComputeUInt64Size;
        }
        this.memoizedSerializedSize = i7;
        return i7;
    }

    public int getSerializedSizeAsMessageSet() {
        int i6 = this.memoizedSerializedSize;
        if (i6 != -1) {
            return i6;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i7 = 0; i7 < this.count; i7++) {
            iComputeRawMessageSetExtensionSize += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.tags[i7]), (ByteString) this.objects[i7]);
        }
        this.memoizedSerializedSize = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    public boolean mergeFieldFrom(int i6, CodedInputStream codedInputStream) throws InvalidProtocolBufferException.InvalidWireTypeException {
        checkMutable();
        int tagFieldNumber = WireFormat.getTagFieldNumber(i6);
        int tagWireType = WireFormat.getTagWireType(i6);
        if (tagWireType == 0) {
            storeField(i6, Long.valueOf(codedInputStream.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(i6, Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(i6, codedInputStream.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
            unknownFieldSetLite.mergeFrom(codedInputStream);
            codedInputStream.checkLastTagWas(WireFormat.makeTag(tagFieldNumber, 4));
            storeField(i6, unknownFieldSetLite);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        storeField(i6, Integer.valueOf(codedInputStream.readFixed32()));
        return true;
    }

    public UnknownFieldSetLite mergeLengthDelimitedField(int i6, ByteString byteString) {
        checkMutable();
        if (i6 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(WireFormat.makeTag(i6, 2), byteString);
        return this;
    }

    public UnknownFieldSetLite mergeVarintField(int i6, int i7) {
        checkMutable();
        if (i6 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(WireFormat.makeTag(i6, 0), Long.valueOf(i7));
        return this;
    }

    public final void printWithIndent(StringBuilder sb, int i6) {
        for (int i7 = 0; i7 < this.count; i7++) {
            MessageLiteToString.printField(sb, i6, String.valueOf(WireFormat.getTagFieldNumber(this.tags[i7])), this.objects[i7]);
        }
    }

    public void storeField(int i6, Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i7 = this.count;
        iArr[i7] = i6;
        this.objects[i7] = obj;
        this.count = i7 + 1;
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) {
        for (int i6 = 0; i6 < this.count; i6++) {
            codedOutputStream.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.tags[i6]), (ByteString) this.objects[i6]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException.InvalidWireTypeException {
        for (int i6 = 0; i6 < this.count; i6++) {
            int i7 = this.tags[i6];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i7);
            int tagWireType = WireFormat.getTagWireType(i7);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.objects[i6]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.objects[i6]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (ByteString) this.objects[i6]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.objects[i6]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.objects[i6]).intValue());
            }
        }
    }

    private UnknownFieldSetLite(int i6, int[] iArr, Object[] objArr, boolean z6) {
        this.memoizedSerializedSize = -1;
        this.count = i6;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z6;
    }

    private static int hashCode(Object[] objArr, int i6) {
        int iHashCode = 17;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return iHashCode;
    }

    public int hashCode() {
        int i6 = this.count;
        return ((((527 + i6) * 31) + hashCode(this.tags, i6)) * 31) + hashCode(this.objects, this.count);
    }

    @CanIgnoreReturnValue
    public UnknownFieldSetLite mergeFrom(UnknownFieldSetLite unknownFieldSetLite) {
        if (unknownFieldSetLite.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i6 = this.count + unknownFieldSetLite.count;
        ensureCapacity(i6);
        System.arraycopy(unknownFieldSetLite.tags, 0, this.tags, this.count, unknownFieldSetLite.count);
        System.arraycopy(unknownFieldSetLite.objects, 0, this.objects, this.count, unknownFieldSetLite.count);
        this.count = i6;
        return this;
    }

    public void writeAsMessageSetTo(Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            for (int i6 = this.count - 1; i6 >= 0; i6--) {
                writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i6]), this.objects[i6]);
            }
            return;
        }
        for (int i7 = 0; i7 < this.count; i7++) {
            writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i7]), this.objects[i7]);
        }
    }

    public void writeTo(Writer writer) {
        if (this.count == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            for (int i6 = 0; i6 < this.count; i6++) {
                writeField(this.tags[i6], this.objects[i6], writer);
            }
            return;
        }
        for (int i7 = this.count - 1; i7 >= 0; i7--) {
            writeField(this.tags[i7], this.objects[i7], writer);
        }
    }
}
