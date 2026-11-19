package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import androidx.work.WorkInfo;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    CodedOutputStreamWriter wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();

    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        public AbstractBufferedEncoder(int i6) {
            super();
            if (i6 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i6, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        public final void buffer(byte b7) {
            byte[] bArr = this.buffer;
            int i6 = this.position;
            this.position = i6 + 1;
            bArr[i6] = b7;
            this.totalBytesWritten++;
        }

        public final void bufferFixed32NoTag(int i6) {
            byte[] bArr = this.buffer;
            int i7 = this.position;
            int i8 = i7 + 1;
            this.position = i8;
            bArr[i7] = (byte) (i6 & 255);
            int i9 = i7 + 2;
            this.position = i9;
            bArr[i8] = (byte) ((i6 >> 8) & 255);
            int i10 = i7 + 3;
            this.position = i10;
            bArr[i9] = (byte) ((i6 >> 16) & 255);
            this.position = i7 + 4;
            bArr[i10] = (byte) ((i6 >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        public final void bufferFixed64NoTag(long j6) {
            byte[] bArr = this.buffer;
            int i6 = this.position;
            int i7 = i6 + 1;
            this.position = i7;
            bArr[i6] = (byte) (j6 & 255);
            int i8 = i6 + 2;
            this.position = i8;
            bArr[i7] = (byte) ((j6 >> 8) & 255);
            int i9 = i6 + 3;
            this.position = i9;
            bArr[i8] = (byte) ((j6 >> 16) & 255);
            int i10 = i6 + 4;
            this.position = i10;
            bArr[i9] = (byte) (255 & (j6 >> 24));
            int i11 = i6 + 5;
            this.position = i11;
            bArr[i10] = (byte) (((int) (j6 >> 32)) & 255);
            int i12 = i6 + 6;
            this.position = i12;
            bArr[i11] = (byte) (((int) (j6 >> 40)) & 255);
            int i13 = i6 + 7;
            this.position = i13;
            bArr[i12] = (byte) (((int) (j6 >> 48)) & 255);
            this.position = i6 + 8;
            bArr[i13] = (byte) (((int) (j6 >> 56)) & 255);
            this.totalBytesWritten += 8;
        }

        public final void bufferInt32NoTag(int i6) {
            if (i6 >= 0) {
                bufferUInt32NoTag(i6);
            } else {
                bufferUInt64NoTag(i6);
            }
        }

        public final void bufferTag(int i6, int i7) {
            bufferUInt32NoTag(WireFormat.makeTag(i6, i7));
        }

        public final void bufferUInt32NoTag(int i6) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((i6 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    byte[] bArr = this.buffer;
                    int i7 = this.position;
                    this.position = i7 + 1;
                    bArr[i7] = (byte) ((i6 | 128) & 255);
                    this.totalBytesWritten++;
                    i6 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i8 = this.position;
                this.position = i8 + 1;
                bArr2[i8] = (byte) i6;
                this.totalBytesWritten++;
                return;
            }
            long j6 = this.position;
            while ((i6 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                byte[] bArr3 = this.buffer;
                int i9 = this.position;
                this.position = i9 + 1;
                UnsafeUtil.putByte(bArr3, i9, (byte) ((i6 | 128) & 255));
                i6 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i10 = this.position;
            this.position = i10 + 1;
            UnsafeUtil.putByte(bArr4, i10, (byte) i6);
            this.totalBytesWritten += (int) (this.position - j6);
        }

        public final void bufferUInt64NoTag(long j6) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((j6 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i6 = this.position;
                    this.position = i6 + 1;
                    bArr[i6] = (byte) ((((int) j6) | 128) & 255);
                    this.totalBytesWritten++;
                    j6 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i7 = this.position;
                this.position = i7 + 1;
                bArr2[i7] = (byte) j6;
                this.totalBytesWritten++;
                return;
            }
            long j7 = this.position;
            while ((j6 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i8 = this.position;
                this.position = i8 + 1;
                UnsafeUtil.putByte(bArr3, i8, (byte) ((((int) j6) | 128) & 255));
                j6 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i9 = this.position;
            this.position = i9 + 1;
            UnsafeUtil.putByte(bArr4, i9, (byte) j6);
            this.totalBytesWritten += (int) (this.position - j7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        public ArrayEncoder(byte[] bArr, int i6, int i7) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i8 = i6 + i7;
            if ((i6 | i7 | (bArr.length - i8)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i6), Integer.valueOf(i7)));
            }
            this.buffer = bArr;
            this.offset = i6;
            this.position = i6;
            this.limit = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte b7) throws OutOfSpaceException {
            try {
                byte[] bArr = this.buffer;
                int i6 = this.position;
                this.position = i6 + 1;
                bArr[i6] = b7;
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i6, boolean z6) throws OutOfSpaceException {
            writeTag(i6, 0);
            write(z6 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i6, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i6, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i6, int i7) throws OutOfSpaceException {
            writeUInt32NoTag(i7);
            write(bArr, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i6, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i6, ByteString byteString) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i6, int i7) throws OutOfSpaceException {
            writeTag(i6, 5);
            writeFixed32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i6) throws OutOfSpaceException {
            try {
                byte[] bArr = this.buffer;
                int i7 = this.position;
                int i8 = i7 + 1;
                this.position = i8;
                bArr[i7] = (byte) (i6 & 255);
                int i9 = i7 + 2;
                this.position = i9;
                bArr[i8] = (byte) ((i6 >> 8) & 255);
                int i10 = i7 + 3;
                this.position = i10;
                bArr[i9] = (byte) ((i6 >> 16) & 255);
                this.position = i7 + 4;
                bArr[i10] = (byte) ((i6 >> 24) & 255);
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i6, long j6) throws OutOfSpaceException {
            writeTag(i6, 1);
            writeFixed64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j6) throws OutOfSpaceException {
            try {
                byte[] bArr = this.buffer;
                int i6 = this.position;
                int i7 = i6 + 1;
                this.position = i7;
                bArr[i6] = (byte) (((int) j6) & 255);
                int i8 = i6 + 2;
                this.position = i8;
                bArr[i7] = (byte) (((int) (j6 >> 8)) & 255);
                int i9 = i6 + 3;
                this.position = i9;
                bArr[i8] = (byte) (((int) (j6 >> 16)) & 255);
                int i10 = i6 + 4;
                this.position = i10;
                bArr[i9] = (byte) (((int) (j6 >> 24)) & 255);
                int i11 = i6 + 5;
                this.position = i11;
                bArr[i10] = (byte) (((int) (j6 >> 32)) & 255);
                int i12 = i6 + 6;
                this.position = i12;
                bArr[i11] = (byte) (((int) (j6 >> 40)) & 255);
                int i13 = i6 + 7;
                this.position = i13;
                bArr[i12] = (byte) (((int) (j6 >> 48)) & 255);
                this.position = i6 + 8;
                bArr[i13] = (byte) (((int) (j6 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i6, int i7) throws OutOfSpaceException {
            writeTag(i6, 0);
            writeInt32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i6) throws OutOfSpaceException {
            if (i6 >= 0) {
                writeUInt32NoTag(i6);
            } else {
                writeUInt64NoTag(i6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i6, int i7) throws OutOfSpaceException {
            write(bArr, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i6, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i6, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i6);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i6, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i6);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i6, String str) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws OutOfSpaceException {
            int i6 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    this.position = Utf8.encode(str, this.buffer, this.position, spaceLeft());
                    return;
                }
                int i7 = i6 + iComputeUInt32SizeNoTag2;
                this.position = i7;
                int iEncode = Utf8.encode(str, this.buffer, i7, spaceLeft());
                this.position = i6;
                writeUInt32NoTag((iEncode - i6) - iComputeUInt32SizeNoTag2);
                this.position = iEncode;
            } catch (Utf8.UnpairedSurrogateException e6) {
                this.position = i6;
                inefficientWriteStringNoTag(str, e6);
            } catch (IndexOutOfBoundsException e7) {
                throw new OutOfSpaceException(e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i6, int i7) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i6, i7));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i6, int i7) throws OutOfSpaceException {
            writeTag(i6, 0);
            writeUInt32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i6) throws OutOfSpaceException {
            while ((i6 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i7 = this.position;
                    this.position = i7 + 1;
                    bArr[i7] = (byte) ((i6 | 128) & 255);
                    i6 >>>= 7;
                } catch (IndexOutOfBoundsException e6) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e6);
                }
            }
            byte[] bArr2 = this.buffer;
            int i8 = this.position;
            this.position = i8 + 1;
            bArr2[i8] = (byte) i6;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i6, long j6) throws OutOfSpaceException {
            writeTag(i6, 0);
            writeUInt64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j6) throws OutOfSpaceException {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j6 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i6 = this.position;
                    this.position = i6 + 1;
                    UnsafeUtil.putByte(bArr, i6, (byte) ((((int) j6) | 128) & 255));
                    j6 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i7 = this.position;
                this.position = i7 + 1;
                UnsafeUtil.putByte(bArr2, i7, (byte) j6);
                return;
            }
            while ((j6 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i8 = this.position;
                    this.position = i8 + 1;
                    bArr3[i8] = (byte) ((((int) j6) | 128) & 255);
                    j6 >>>= 7;
                } catch (IndexOutOfBoundsException e6) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e6);
                }
            }
            byte[] bArr4 = this.buffer;
            int i9 = this.position;
            this.position = i9 + 1;
            bArr4[i9] = (byte) j6;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i6, byte[] bArr, int i7, int i8) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeByteArrayNoTag(bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i6, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i6, int i7) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i6, this.buffer, this.position, i7);
                this.position += i7;
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i7)), e6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(iRemaining)), e6);
            }
        }
    }

    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        public ByteOutputEncoder(ByteOutput byteOutput, int i6) {
            super(i6);
            if (byteOutput == null) {
                throw new NullPointerException("out");
            }
            this.out = byteOutput;
        }

        private void doFlush() {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i6) {
            if (this.limit - this.position < i6) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b7) {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i6, boolean z6) {
            flushIfNotAvailable(11);
            bufferTag(i6, 0);
            buffer(z6 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i6, byte[] bArr) {
            writeByteArray(i6, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i6, int i7) {
            writeUInt32NoTag(i7);
            write(bArr, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i6, ByteBuffer byteBuffer) {
            writeTag(i6, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i6, ByteString byteString) {
            writeTag(i6, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i6, int i7) {
            flushIfNotAvailable(14);
            bufferTag(i6, 5);
            bufferFixed32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i6) {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i6, long j6) {
            flushIfNotAvailable(18);
            bufferTag(i6, 1);
            bufferFixed64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j6) {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i6, int i7) {
            flushIfNotAvailable(20);
            bufferTag(i6, 0);
            bufferInt32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i6) {
            if (i6 >= 0) {
                writeUInt32NoTag(i6);
            } else {
                writeUInt64NoTag(i6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i6, int i7) {
            flush();
            this.out.writeLazy(bArr, i6, i7);
            this.totalBytesWritten += i7;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i6, MessageLite messageLite) {
            writeTag(i6, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i6, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i6);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i6, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i6);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i6, String str) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i6 = iComputeUInt32SizeNoTag + length;
            int i7 = this.limit;
            if (i6 > i7) {
                byte[] bArr = new byte[length];
                int iEncode = Utf8.encode(str, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i6 > i7 - this.position) {
                doFlush();
            }
            int i8 = this.position;
            try {
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iEncodedLength = Utf8.encodedLength(str);
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    this.totalBytesWritten += iEncodedLength;
                    return;
                }
                int i9 = i8 + iComputeUInt32SizeNoTag2;
                this.position = i9;
                int iEncode2 = Utf8.encode(str, this.buffer, i9, this.limit - i9);
                this.position = i8;
                int i10 = (iEncode2 - i8) - iComputeUInt32SizeNoTag2;
                bufferUInt32NoTag(i10);
                this.position = iEncode2;
                this.totalBytesWritten += i10;
            } catch (Utf8.UnpairedSurrogateException e6) {
                this.totalBytesWritten -= this.position - i8;
                this.position = i8;
                inefficientWriteStringNoTag(str, e6);
            } catch (IndexOutOfBoundsException e7) {
                throw new OutOfSpaceException(e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i6, int i7) {
            writeUInt32NoTag(WireFormat.makeTag(i6, i7));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i6, int i7) {
            flushIfNotAvailable(20);
            bufferTag(i6, 0);
            bufferUInt32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i6) {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i6, long j6) {
            flushIfNotAvailable(20);
            bufferTag(i6, 0);
            bufferUInt64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j6) {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i6, byte[] bArr, int i7, int i8) {
            writeTag(i6, 2);
            writeByteArrayNoTag(bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i6, MessageLite messageLite, Schema schema) {
            writeTag(i6, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i6, int i7) {
            flush();
            this.out.write(bArr, i6, i7);
            this.totalBytesWritten += i7;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }
    }

    public static final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        public HeapNioEncoder(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.ArrayEncoder, androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.byteBuffer, this.initialPosition + getTotalBytesWritten());
        }
    }

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        public OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        public OutputStreamEncoder(OutputStream outputStream, int i6) {
            super(i6);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.out = outputStream;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i6) throws IOException {
            if (this.limit - this.position < i6) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b7) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i6, boolean z6) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i6, 0);
            buffer(z6 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i6, byte[] bArr) throws IOException {
            writeByteArray(i6, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i6, int i7) throws IOException {
            writeUInt32NoTag(i7);
            write(bArr, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i6, ByteBuffer byteBuffer) throws IOException {
            writeTag(i6, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i6, ByteString byteString) throws IOException {
            writeTag(i6, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i6, int i7) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i6, 5);
            bufferFixed32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i6) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i6, long j6) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i6, 1);
            bufferFixed64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j6) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i6, int i7) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i6, 0);
            bufferInt32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i6) throws IOException {
            if (i6 >= 0) {
                writeUInt32NoTag(i6);
            } else {
                writeUInt64NoTag(i6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i6, int i7) throws IOException {
            write(bArr, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i6, MessageLite messageLite) throws IOException {
            writeTag(i6, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i6, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i6);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i6, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i6);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i6, String str) throws IOException {
            writeTag(i6, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int iEncodedLength;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i6 = iComputeUInt32SizeNoTag + length;
                int i7 = this.limit;
                if (i6 > i7) {
                    byte[] bArr = new byte[length];
                    int iEncode = Utf8.encode(str, bArr, 0, length);
                    writeUInt32NoTag(iEncode);
                    writeLazy(bArr, 0, iEncode);
                    return;
                }
                if (i6 > i7 - this.position) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i8 = this.position;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i9 = i8 + iComputeUInt32SizeNoTag2;
                        this.position = i9;
                        int iEncode2 = Utf8.encode(str, this.buffer, i9, this.limit - i9);
                        this.position = i8;
                        iEncodedLength = (iEncode2 - i8) - iComputeUInt32SizeNoTag2;
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = iEncode2;
                    } else {
                        iEncodedLength = Utf8.encodedLength(str);
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    }
                    this.totalBytesWritten += iEncodedLength;
                } catch (Utf8.UnpairedSurrogateException e6) {
                    this.totalBytesWritten -= this.position - i8;
                    this.position = i8;
                    throw e6;
                } catch (ArrayIndexOutOfBoundsException e7) {
                    throw new OutOfSpaceException(e7);
                }
            } catch (Utf8.UnpairedSurrogateException e8) {
                inefficientWriteStringNoTag(str, e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i6, int i7) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i6, i7));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i6, int i7) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i6, 0);
            bufferUInt32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i6) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i6, long j6) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i6, 0);
            bufferUInt64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j6) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i6, byte[] bArr, int i7, int i8) throws IOException {
            writeTag(i6, 2);
            writeByteArrayNoTag(bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i6, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i6, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i6, int i7) throws IOException {
            int i8 = this.limit;
            int i9 = this.position;
            if (i8 - i9 >= i7) {
                System.arraycopy(bArr, i6, this.buffer, i9, i7);
                this.position += i7;
                this.totalBytesWritten += i7;
                return;
            }
            int i10 = i8 - i9;
            System.arraycopy(bArr, i6, this.buffer, i9, i10);
            int i11 = i6 + i10;
            int i12 = i7 - i10;
            this.position = this.limit;
            this.totalBytesWritten += i10;
            doFlush();
            if (i12 <= this.limit) {
                System.arraycopy(bArr, i11, this.buffer, 0, i12);
                this.position = i12;
            } else {
                this.out.write(bArr, i11, i12);
            }
            this.totalBytesWritten += i12;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i6 = this.limit;
            int i7 = this.position;
            if (i6 - i7 >= iRemaining) {
                byteBuffer.get(this.buffer, i7, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            int i8 = i6 - i7;
            byteBuffer.get(this.buffer, i7, i8);
            int i9 = iRemaining - i8;
            this.position = this.limit;
            this.totalBytesWritten += i8;
            doFlush();
            while (true) {
                int i10 = this.limit;
                if (i9 > i10) {
                    byteBuffer.get(this.buffer, 0, i10);
                    this.out.write(this.buffer, 0, this.limit);
                    int i11 = this.limit;
                    i9 -= i11;
                    this.totalBytesWritten += i11;
                } else {
                    byteBuffer.get(this.buffer, 0, i9);
                    this.position = i9;
                    this.totalBytesWritten += i9;
                    return;
                }
            }
        }
    }

    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        public SafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) throws OutOfSpaceException {
            try {
                Utf8.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(e6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.originalBuffer, this.buffer.position());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b7) throws OutOfSpaceException {
            try {
                this.buffer.put(b7);
            } catch (BufferOverflowException e6) {
                throw new OutOfSpaceException(e6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i6, boolean z6) throws OutOfSpaceException {
            writeTag(i6, 0);
            write(z6 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i6, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i6, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i6, int i7) throws OutOfSpaceException {
            writeUInt32NoTag(i7);
            write(bArr, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i6, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i6, ByteString byteString) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i6, int i7) throws OutOfSpaceException {
            writeTag(i6, 5);
            writeFixed32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i6) throws OutOfSpaceException {
            try {
                this.buffer.putInt(i6);
            } catch (BufferOverflowException e6) {
                throw new OutOfSpaceException(e6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i6, long j6) throws OutOfSpaceException {
            writeTag(i6, 1);
            writeFixed64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j6) throws OutOfSpaceException {
            try {
                this.buffer.putLong(j6);
            } catch (BufferOverflowException e6) {
                throw new OutOfSpaceException(e6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i6, int i7) throws OutOfSpaceException {
            writeTag(i6, 0);
            writeInt32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i6) throws OutOfSpaceException {
            if (i6 >= 0) {
                writeUInt32NoTag(i6);
            } else {
                writeUInt64NoTag(i6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i6, int i7) throws OutOfSpaceException {
            write(bArr, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i6, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i6, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i6);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i6, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i6);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i6, String str) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            int iPosition = this.buffer.position();
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    encode(str);
                    return;
                }
                int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                Java8Compatibility.position(this.buffer, iPosition2);
                encode(str);
                int iPosition3 = this.buffer.position();
                Java8Compatibility.position(this.buffer, iPosition);
                writeUInt32NoTag(iPosition3 - iPosition2);
                Java8Compatibility.position(this.buffer, iPosition3);
            } catch (Utf8.UnpairedSurrogateException e6) {
                Java8Compatibility.position(this.buffer, iPosition);
                inefficientWriteStringNoTag(str, e6);
            } catch (IllegalArgumentException e7) {
                throw new OutOfSpaceException(e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i6, int i7) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i6, i7));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i6, int i7) throws OutOfSpaceException {
            writeTag(i6, 0);
            writeUInt32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i6) throws OutOfSpaceException {
            while ((i6 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                try {
                    this.buffer.put((byte) ((i6 | 128) & 255));
                    i6 >>>= 7;
                } catch (BufferOverflowException e6) {
                    throw new OutOfSpaceException(e6);
                }
            }
            this.buffer.put((byte) i6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i6, long j6) throws OutOfSpaceException {
            writeTag(i6, 0);
            writeUInt64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j6) throws OutOfSpaceException {
            while (((-128) & j6) != 0) {
                try {
                    this.buffer.put((byte) ((((int) j6) | 128) & 255));
                    j6 >>>= 7;
                } catch (BufferOverflowException e6) {
                    throw new OutOfSpaceException(e6);
                }
            }
            this.buffer.put((byte) j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i6, byte[] bArr, int i7, int i8) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeByteArrayNoTag(bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i6, int i7) throws OutOfSpaceException {
            try {
                this.buffer.put(bArr, i6, i7);
            } catch (IndexOutOfBoundsException e6) {
                throw new OutOfSpaceException(e6);
            } catch (BufferOverflowException e7) {
                throw new OutOfSpaceException(e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i6, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e6) {
                throw new OutOfSpaceException(e6);
            }
        }
    }

    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        public UnsafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            long jPosition = byteBuffer.position() + jAddressOffset;
            this.initialPosition = jPosition;
            long jLimit = jAddressOffset + byteBuffer.limit();
            this.limit = jLimit;
            this.oneVarintLimit = jLimit - 10;
            this.position = jPosition;
        }

        private int bufferPos(long j6) {
            return (int) (j6 - this.address);
        }

        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void repositionBuffer(long j6) {
            Java8Compatibility.position(this.buffer, bufferPos(j6));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.originalBuffer, bufferPos(this.position));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b7) throws OutOfSpaceException {
            long j6 = this.position;
            if (j6 >= this.limit) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
            this.position = 1 + j6;
            UnsafeUtil.putByte(j6, b7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i6, boolean z6) throws OutOfSpaceException {
            writeTag(i6, 0);
            write(z6 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i6, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i6, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i6, int i7) throws OutOfSpaceException {
            writeUInt32NoTag(i7);
            write(bArr, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i6, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i6, ByteString byteString) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i6, int i7) throws OutOfSpaceException {
            writeTag(i6, 5);
            writeFixed32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i6) {
            this.buffer.putInt(bufferPos(this.position), i6);
            this.position += 4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i6, long j6) throws OutOfSpaceException {
            writeTag(i6, 1);
            writeFixed64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j6) {
            this.buffer.putLong(bufferPos(this.position), j6);
            this.position += 8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i6, int i7) throws OutOfSpaceException {
            writeTag(i6, 0);
            writeInt32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i6) throws OutOfSpaceException {
            if (i6 >= 0) {
                writeUInt32NoTag(i6);
            } else {
                writeUInt64NoTag(i6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i6, int i7) throws OutOfSpaceException {
            write(bArr, i6, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i6, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i6, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i6);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i6, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i6);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i6, String str) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            long j6 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iEncodedLength = Utf8.encodedLength(str);
                    writeUInt32NoTag(iEncodedLength);
                    repositionBuffer(this.position);
                    Utf8.encodeUtf8(str, this.buffer);
                    this.position += iEncodedLength;
                    return;
                }
                int iBufferPos = bufferPos(this.position) + iComputeUInt32SizeNoTag2;
                Java8Compatibility.position(this.buffer, iBufferPos);
                Utf8.encodeUtf8(str, this.buffer);
                int iPosition = this.buffer.position() - iBufferPos;
                writeUInt32NoTag(iPosition);
                this.position += iPosition;
            } catch (Utf8.UnpairedSurrogateException e6) {
                this.position = j6;
                repositionBuffer(j6);
                inefficientWriteStringNoTag(str, e6);
            } catch (IllegalArgumentException e7) {
                throw new OutOfSpaceException(e7);
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i6, int i7) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i6, i7));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i6, int i7) throws OutOfSpaceException {
            writeTag(i6, 0);
            writeUInt32NoTag(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i6) throws OutOfSpaceException {
            if (this.position <= this.oneVarintLimit) {
                while ((i6 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    long j6 = this.position;
                    this.position = j6 + 1;
                    UnsafeUtil.putByte(j6, (byte) ((i6 | 128) & 255));
                    i6 >>>= 7;
                }
                long j7 = this.position;
                this.position = 1 + j7;
                UnsafeUtil.putByte(j7, (byte) i6);
                return;
            }
            while (true) {
                long j8 = this.position;
                if (j8 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((i6 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                    this.position = 1 + j8;
                    UnsafeUtil.putByte(j8, (byte) i6);
                    return;
                } else {
                    this.position = j8 + 1;
                    UnsafeUtil.putByte(j8, (byte) ((i6 | 128) & 255));
                    i6 >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i6, long j6) throws OutOfSpaceException {
            writeTag(i6, 0);
            writeUInt64NoTag(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j6) throws OutOfSpaceException {
            if (this.position <= this.oneVarintLimit) {
                while ((j6 & (-128)) != 0) {
                    long j7 = this.position;
                    this.position = j7 + 1;
                    UnsafeUtil.putByte(j7, (byte) ((((int) j6) | 128) & 255));
                    j6 >>>= 7;
                }
                long j8 = this.position;
                this.position = 1 + j8;
                UnsafeUtil.putByte(j8, (byte) j6);
                return;
            }
            while (true) {
                long j9 = this.position;
                if (j9 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((j6 & (-128)) == 0) {
                    this.position = 1 + j9;
                    UnsafeUtil.putByte(j9, (byte) j6);
                    return;
                } else {
                    this.position = j9 + 1;
                    UnsafeUtil.putByte(j9, (byte) ((((int) j6) | 128) & 255));
                    j6 >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i6, byte[] bArr, int i7, int i8) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeByteArrayNoTag(bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i6, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeTag(i6, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i6, int i7) throws OutOfSpaceException {
            if (bArr != null && i6 >= 0 && i7 >= 0 && bArr.length - i7 >= i6) {
                long j6 = i7;
                long j7 = this.limit - j6;
                long j8 = this.position;
                if (j7 >= j8) {
                    UnsafeUtil.copyMemory(bArr, i6, j8, j6);
                    this.position += j6;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i7)));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                int iRemaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += iRemaining;
            } catch (BufferOverflowException e6) {
                throw new OutOfSpaceException(e6);
            }
        }
    }

    public static int computeBoolSize(int i6, boolean z6) {
        return computeTagSize(i6) + computeBoolSizeNoTag(z6);
    }

    public static int computeBoolSizeNoTag(boolean z6) {
        return 1;
    }

    public static int computeByteArraySize(int i6, byte[] bArr) {
        return computeTagSize(i6) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i6, ByteBuffer byteBuffer) {
        return computeTagSize(i6) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i6, ByteString byteString) {
        return computeTagSize(i6) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i6, double d6) {
        return computeTagSize(i6) + computeDoubleSizeNoTag(d6);
    }

    public static int computeDoubleSizeNoTag(double d6) {
        return 8;
    }

    public static int computeEnumSize(int i6, int i7) {
        return computeTagSize(i6) + computeEnumSizeNoTag(i7);
    }

    public static int computeEnumSizeNoTag(int i6) {
        return computeInt32SizeNoTag(i6);
    }

    public static int computeFixed32Size(int i6, int i7) {
        return computeTagSize(i6) + computeFixed32SizeNoTag(i7);
    }

    public static int computeFixed32SizeNoTag(int i6) {
        return 4;
    }

    public static int computeFixed64Size(int i6, long j6) {
        return computeTagSize(i6) + computeFixed64SizeNoTag(j6);
    }

    public static int computeFixed64SizeNoTag(long j6) {
        return 8;
    }

    public static int computeFloatSize(int i6, float f6) {
        return computeTagSize(i6) + computeFloatSizeNoTag(f6);
    }

    public static int computeFloatSizeNoTag(float f6) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i6, MessageLite messageLite) {
        return (computeTagSize(i6) * 2) + messageLite.getSerializedSize();
    }

    @InlineMe(replacement = "value.getSerializedSize()")
    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i6, int i7) {
        return computeTagSize(i6) + computeInt32SizeNoTag(i7);
    }

    public static int computeInt32SizeNoTag(int i6) {
        return computeUInt64SizeNoTag(i6);
    }

    public static int computeInt64Size(int i6, long j6) {
        return computeTagSize(i6) + computeInt64SizeNoTag(j6);
    }

    public static int computeInt64SizeNoTag(long j6) {
        return computeUInt64SizeNoTag(j6);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i6, LazyFieldLite lazyFieldLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i6) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeLazyFieldSize(int i6, LazyFieldLite lazyFieldLite) {
        return computeTagSize(i6) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i6) {
        return computeUInt32SizeNoTag(i6) + i6;
    }

    public static int computeMessageSetExtensionSize(int i6, MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i6) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i6, MessageLite messageLite) {
        return computeTagSize(i6) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i6) {
        if (i6 > 4096) {
            return 4096;
        }
        return i6;
    }

    public static int computeRawMessageSetExtensionSize(int i6, ByteString byteString) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i6) + computeBytesSize(3, byteString);
    }

    @InlineMe(imports = {"androidx.datastore.preferences.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt32SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint32Size(int i6) {
        return computeUInt32SizeNoTag(i6);
    }

    @InlineMe(imports = {"androidx.datastore.preferences.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt64SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint64Size(long j6) {
        return computeUInt64SizeNoTag(j6);
    }

    public static int computeSFixed32Size(int i6, int i7) {
        return computeTagSize(i6) + computeSFixed32SizeNoTag(i7);
    }

    public static int computeSFixed32SizeNoTag(int i6) {
        return 4;
    }

    public static int computeSFixed64Size(int i6, long j6) {
        return computeTagSize(i6) + computeSFixed64SizeNoTag(j6);
    }

    public static int computeSFixed64SizeNoTag(long j6) {
        return 8;
    }

    public static int computeSInt32Size(int i6, int i7) {
        return computeTagSize(i6) + computeSInt32SizeNoTag(i7);
    }

    public static int computeSInt32SizeNoTag(int i6) {
        return computeUInt32SizeNoTag(encodeZigZag32(i6));
    }

    public static int computeSInt64Size(int i6, long j6) {
        return computeTagSize(i6) + computeSInt64SizeNoTag(j6);
    }

    public static int computeSInt64SizeNoTag(long j6) {
        return computeUInt64SizeNoTag(encodeZigZag64(j6));
    }

    public static int computeStringSize(int i6, String str) {
        return computeTagSize(i6) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = Utf8.encodedLength(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i6) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i6, 0));
    }

    public static int computeUInt32Size(int i6, int i7) {
        return computeTagSize(i6) + computeUInt32SizeNoTag(i7);
    }

    public static int computeUInt32SizeNoTag(int i6) {
        return (352 - (Integer.numberOfLeadingZeros(i6) * 9)) >>> 6;
    }

    public static int computeUInt64Size(int i6, long j6) {
        return computeTagSize(i6) + computeUInt64SizeNoTag(j6);
    }

    public static int computeUInt64SizeNoTag(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    public static int encodeZigZag32(int i6) {
        return (i6 >> 31) ^ (i6 << 1);
    }

    public static long encodeZigZag64(long j6) {
        return (j6 >> 63) ^ (j6 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new SafeDirectNioEncoder(byteBuffer);
    }

    public static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new UnsafeDirectNioEncoder(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush();

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws OutOfSpaceException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e6) {
            throw new OutOfSpaceException(e6);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte b7);

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer);

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i6, int i7);

    public abstract void writeBool(int i6, boolean z6);

    public final void writeBoolNoTag(boolean z6) {
        write(z6 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i6, byte[] bArr);

    public abstract void writeByteArray(int i6, byte[] bArr, int i7, int i8);

    public final void writeByteArrayNoTag(byte[] bArr) {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i6, int i7);

    public abstract void writeByteBuffer(int i6, ByteBuffer byteBuffer);

    public abstract void writeBytes(int i6, ByteString byteString);

    public abstract void writeBytesNoTag(ByteString byteString);

    public final void writeDouble(int i6, double d6) {
        writeFixed64(i6, Double.doubleToRawLongBits(d6));
    }

    public final void writeDoubleNoTag(double d6) {
        writeFixed64NoTag(Double.doubleToRawLongBits(d6));
    }

    public final void writeEnum(int i6, int i7) {
        writeInt32(i6, i7);
    }

    public final void writeEnumNoTag(int i6) {
        writeInt32NoTag(i6);
    }

    public abstract void writeFixed32(int i6, int i7);

    public abstract void writeFixed32NoTag(int i6);

    public abstract void writeFixed64(int i6, long j6);

    public abstract void writeFixed64NoTag(long j6);

    public final void writeFloat(int i6, float f6) {
        writeFixed32(i6, Float.floatToRawIntBits(f6));
    }

    public final void writeFloatNoTag(float f6) {
        writeFixed32NoTag(Float.floatToRawIntBits(f6));
    }

    @Deprecated
    public final void writeGroup(int i6, MessageLite messageLite) {
        writeTag(i6, 3);
        writeGroupNoTag(messageLite);
        writeTag(i6, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i6, int i7);

    public abstract void writeInt32NoTag(int i6);

    public final void writeInt64(int i6, long j6) {
        writeUInt64(i6, j6);
    }

    public final void writeInt64NoTag(long j6) {
        writeUInt64NoTag(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer);

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i6, int i7);

    public abstract void writeMessage(int i6, MessageLite messageLite);

    public abstract void writeMessage(int i6, MessageLite messageLite, Schema schema);

    public abstract void writeMessageNoTag(MessageLite messageLite);

    public abstract void writeMessageNoTag(MessageLite messageLite, Schema schema);

    public abstract void writeMessageSetExtension(int i6, MessageLite messageLite);

    public final void writeRawByte(byte b7) {
        write(b7);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer);

    public final void writeRawBytes(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @InlineMe(replacement = "this.writeFixed32NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian32(int i6) {
        writeFixed32NoTag(i6);
    }

    @InlineMe(replacement = "this.writeFixed64NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian64(long j6) {
        writeFixed64NoTag(j6);
    }

    public abstract void writeRawMessageSetExtension(int i6, ByteString byteString);

    @InlineMe(replacement = "this.writeUInt32NoTag(value)")
    @Deprecated
    public final void writeRawVarint32(int i6) {
        writeUInt32NoTag(i6);
    }

    @InlineMe(replacement = "this.writeUInt64NoTag(value)")
    @Deprecated
    public final void writeRawVarint64(long j6) {
        writeUInt64NoTag(j6);
    }

    public final void writeSFixed32(int i6, int i7) {
        writeFixed32(i6, i7);
    }

    public final void writeSFixed32NoTag(int i6) {
        writeFixed32NoTag(i6);
    }

    public final void writeSFixed64(int i6, long j6) {
        writeFixed64(i6, j6);
    }

    public final void writeSFixed64NoTag(long j6) {
        writeFixed64NoTag(j6);
    }

    public final void writeSInt32(int i6, int i7) {
        writeUInt32(i6, encodeZigZag32(i7));
    }

    public final void writeSInt32NoTag(int i6) {
        writeUInt32NoTag(encodeZigZag32(i6));
    }

    public final void writeSInt64(int i6, long j6) {
        writeUInt64(i6, encodeZigZag64(j6));
    }

    public final void writeSInt64NoTag(long j6) {
        writeUInt64NoTag(encodeZigZag64(j6));
    }

    public abstract void writeString(int i6, String str);

    public abstract void writeStringNoTag(String str);

    public abstract void writeTag(int i6, int i7);

    public abstract void writeUInt32(int i6, int i7);

    public abstract void writeUInt32NoTag(int i6);

    public abstract void writeUInt64(int i6, long j6);

    public abstract void writeUInt64NoTag(long j6);

    private CodedOutputStream() {
    }

    @Deprecated
    public static int computeGroupSize(int i6, MessageLite messageLite, Schema schema) {
        return (computeTagSize(i6) * 2) + computeGroupSizeNoTag(messageLite, schema);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(schema);
    }

    public static int computeMessageSize(int i6, MessageLite messageLite, Schema schema) {
        return computeTagSize(i6) + computeMessageSizeNoTag(messageLite, schema);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite, Schema schema) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(schema));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i6) {
        return new OutputStreamEncoder(outputStream, i6);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite, Schema schema) {
        schema.writeTo(messageLite, this.wrapper);
    }

    public final void writeRawByte(int i6) {
        write((byte) i6);
    }

    public final void writeRawBytes(byte[] bArr, int i6, int i7) {
        write(bArr, i6, i7);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i6, int i7) {
        return new ArrayEncoder(bArr, i6, i7);
    }

    @Deprecated
    public final void writeGroup(int i6, MessageLite messageLite, Schema schema) {
        writeTag(i6, 3);
        writeGroupNoTag(messageLite, schema);
        writeTag(i6, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new HeapNioEncoder(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (UnsafeDirectNioEncoder.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i6) {
        return newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(ByteOutput byteOutput, int i6) {
        if (i6 >= 0) {
            return new ByteOutputEncoder(byteOutput, i6);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
