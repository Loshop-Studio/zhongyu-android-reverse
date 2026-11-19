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

/* loaded from: classes3.dex */
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

        public AbstractBufferedEncoder(int i9) {
            super();
            if (i9 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i9, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        public final void buffer(byte b10) {
            byte[] bArr = this.buffer;
            int i9 = this.position;
            this.position = i9 + 1;
            bArr[i9] = b10;
            this.totalBytesWritten++;
        }

        public final void bufferFixed32NoTag(int i9) {
            byte[] bArr = this.buffer;
            int i10 = this.position;
            int i11 = i10 + 1;
            this.position = i11;
            bArr[i10] = (byte) (i9 & 255);
            int i12 = i10 + 2;
            this.position = i12;
            bArr[i11] = (byte) ((i9 >> 8) & 255);
            int i13 = i10 + 3;
            this.position = i13;
            bArr[i12] = (byte) ((i9 >> 16) & 255);
            this.position = i10 + 4;
            bArr[i13] = (byte) ((i9 >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        public final void bufferFixed64NoTag(long j9) {
            byte[] bArr = this.buffer;
            int i9 = this.position;
            int i10 = i9 + 1;
            this.position = i10;
            bArr[i9] = (byte) (j9 & 255);
            int i11 = i9 + 2;
            this.position = i11;
            bArr[i10] = (byte) ((j9 >> 8) & 255);
            int i12 = i9 + 3;
            this.position = i12;
            bArr[i11] = (byte) ((j9 >> 16) & 255);
            int i13 = i9 + 4;
            this.position = i13;
            bArr[i12] = (byte) (255 & (j9 >> 24));
            int i14 = i9 + 5;
            this.position = i14;
            bArr[i13] = (byte) (((int) (j9 >> 32)) & 255);
            int i15 = i9 + 6;
            this.position = i15;
            bArr[i14] = (byte) (((int) (j9 >> 40)) & 255);
            int i16 = i9 + 7;
            this.position = i16;
            bArr[i15] = (byte) (((int) (j9 >> 48)) & 255);
            this.position = i9 + 8;
            bArr[i16] = (byte) (((int) (j9 >> 56)) & 255);
            this.totalBytesWritten += 8;
        }

        public final void bufferInt32NoTag(int i9) {
            if (i9 >= 0) {
                bufferUInt32NoTag(i9);
            } else {
                bufferUInt64NoTag(i9);
            }
        }

        public final void bufferTag(int i9, int i10) {
            bufferUInt32NoTag(WireFormat.makeTag(i9, i10));
        }

        public final void bufferUInt32NoTag(int i9) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((i9 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    byte[] bArr = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    bArr[i10] = (byte) ((i9 | 128) & 255);
                    this.totalBytesWritten++;
                    i9 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                bArr2[i11] = (byte) i9;
                this.totalBytesWritten++;
                return;
            }
            long j9 = this.position;
            while ((i9 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                byte[] bArr3 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                UnsafeUtil.putByte(bArr3, i12, (byte) ((i9 | 128) & 255));
                i9 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i13 = this.position;
            this.position = i13 + 1;
            UnsafeUtil.putByte(bArr4, i13, (byte) i9);
            this.totalBytesWritten += (int) (this.position - j9);
        }

        public final void bufferUInt64NoTag(long j9) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((j9 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i9 = this.position;
                    this.position = i9 + 1;
                    bArr[i9] = (byte) ((((int) j9) | 128) & 255);
                    this.totalBytesWritten++;
                    j9 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                bArr2[i10] = (byte) j9;
                this.totalBytesWritten++;
                return;
            }
            long j10 = this.position;
            while ((j9 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                UnsafeUtil.putByte(bArr3, i11, (byte) ((((int) j9) | 128) & 255));
                j9 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            UnsafeUtil.putByte(bArr4, i12, (byte) j9);
            this.totalBytesWritten += (int) (this.position - j10);
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

        public ArrayEncoder(byte[] bArr, int i9, int i10) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i11 = i9 + i10;
            if ((i9 | i10 | (bArr.length - i11)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
            }
            this.buffer = bArr;
            this.offset = i9;
            this.position = i9;
            this.limit = i11;
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
        public final void write(byte b10) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i9 = this.position;
                this.position = i9 + 1;
                bArr[i9] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i9, boolean z9) throws IOException {
            writeTag(i9, 0);
            write(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i9, byte[] bArr) throws IOException {
            writeByteArray(i9, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i9, int i10) throws IOException {
            writeUInt32NoTag(i10);
            write(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i9, ByteBuffer byteBuffer) throws IOException {
            writeTag(i9, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i9, ByteString byteString) throws IOException {
            writeTag(i9, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i9, int i10) throws IOException {
            writeTag(i9, 5);
            writeFixed32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i9) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i10 = this.position;
                int i11 = i10 + 1;
                this.position = i11;
                bArr[i10] = (byte) (i9 & 255);
                int i12 = i10 + 2;
                this.position = i12;
                bArr[i11] = (byte) ((i9 >> 8) & 255);
                int i13 = i10 + 3;
                this.position = i13;
                bArr[i12] = (byte) ((i9 >> 16) & 255);
                this.position = i10 + 4;
                bArr[i13] = (byte) ((i9 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i9, long j9) throws IOException {
            writeTag(i9, 1);
            writeFixed64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j9) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i9 = this.position;
                int i10 = i9 + 1;
                this.position = i10;
                bArr[i9] = (byte) (((int) j9) & 255);
                int i11 = i9 + 2;
                this.position = i11;
                bArr[i10] = (byte) (((int) (j9 >> 8)) & 255);
                int i12 = i9 + 3;
                this.position = i12;
                bArr[i11] = (byte) (((int) (j9 >> 16)) & 255);
                int i13 = i9 + 4;
                this.position = i13;
                bArr[i12] = (byte) (((int) (j9 >> 24)) & 255);
                int i14 = i9 + 5;
                this.position = i14;
                bArr[i13] = (byte) (((int) (j9 >> 32)) & 255);
                int i15 = i9 + 6;
                this.position = i15;
                bArr[i14] = (byte) (((int) (j9 >> 40)) & 255);
                int i16 = i9 + 7;
                this.position = i16;
                bArr[i15] = (byte) (((int) (j9 >> 48)) & 255);
                this.position = i9 + 8;
                bArr[i16] = (byte) (((int) (j9 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i9, int i10) throws IOException {
            writeTag(i9, 0);
            writeInt32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i9) throws IOException {
            if (i9 >= 0) {
                writeUInt32NoTag(i9);
            } else {
                writeUInt64NoTag(i9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i9, int i10) throws IOException {
            write(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i9, MessageLite messageLite) throws IOException {
            writeTag(i9, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i9, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i9);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i9, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i9);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i9, String str) throws IOException {
            writeTag(i9, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws IOException {
            int i9 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    this.position = Utf8.encode(str, this.buffer, this.position, spaceLeft());
                    return;
                }
                int i10 = i9 + iComputeUInt32SizeNoTag2;
                this.position = i10;
                int iEncode = Utf8.encode(str, this.buffer, i10, spaceLeft());
                this.position = i9;
                writeUInt32NoTag((iEncode - i9) - iComputeUInt32SizeNoTag2);
                this.position = iEncode;
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.position = i9;
                inefficientWriteStringNoTag(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i9, int i10) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i9, i10));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i9, int i10) throws IOException {
            writeTag(i9, 0);
            writeUInt32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i9) throws IOException {
            while ((i9 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    bArr[i10] = (byte) ((i9 | 128) & 255);
                    i9 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e10);
                }
            }
            byte[] bArr2 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            bArr2[i11] = (byte) i9;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i9, long j9) throws IOException {
            writeTag(i9, 0);
            writeUInt64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j9) throws IOException {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j9 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i9 = this.position;
                    this.position = i9 + 1;
                    UnsafeUtil.putByte(bArr, i9, (byte) ((((int) j9) | 128) & 255));
                    j9 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                UnsafeUtil.putByte(bArr2, i10, (byte) j9);
                return;
            }
            while ((j9 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    bArr3[i11] = (byte) ((((int) j9) | 128) & 255);
                    j9 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e10);
                }
            }
            byte[] bArr4 = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            bArr4[i12] = (byte) j9;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i9, byte[] bArr, int i10, int i11) throws IOException {
            writeTag(i9, 2);
            writeByteArrayNoTag(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i9, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i9, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i9, int i10) throws IOException {
            try {
                System.arraycopy(bArr, i9, this.buffer, this.position, i10);
                this.position += i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i10)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(iRemaining)), e10);
            }
        }
    }

    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        public ByteOutputEncoder(ByteOutput byteOutput, int i9) {
            super(i9);
            if (byteOutput == null) {
                throw new NullPointerException("out");
            }
            this.out = byteOutput;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i9) throws IOException {
            if (this.limit - this.position < i9) {
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
        public void write(byte b10) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i9, boolean z9) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i9, 0);
            buffer(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i9, byte[] bArr) throws IOException {
            writeByteArray(i9, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i9, int i10) throws IOException {
            writeUInt32NoTag(i10);
            write(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i9, ByteBuffer byteBuffer) throws IOException {
            writeTag(i9, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i9, ByteString byteString) throws IOException {
            writeTag(i9, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i9, int i10) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i9, 5);
            bufferFixed32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i9) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i9, long j9) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i9, 1);
            bufferFixed64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j9) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i9, int i10) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i9, 0);
            bufferInt32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i9) throws IOException {
            if (i9 >= 0) {
                writeUInt32NoTag(i9);
            } else {
                writeUInt64NoTag(i9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i9, int i10) throws IOException {
            flush();
            this.out.writeLazy(bArr, i9, i10);
            this.totalBytesWritten += i10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i9, MessageLite messageLite) throws IOException {
            writeTag(i9, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i9, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i9);
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
        public void writeRawMessageSetExtension(int i9, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i9);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i9, String str) throws IOException {
            writeTag(i9, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i9 = iComputeUInt32SizeNoTag + length;
            int i10 = this.limit;
            if (i9 > i10) {
                byte[] bArr = new byte[length];
                int iEncode = Utf8.encode(str, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i9 > i10 - this.position) {
                doFlush();
            }
            int i11 = this.position;
            try {
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iEncodedLength = Utf8.encodedLength(str);
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    this.totalBytesWritten += iEncodedLength;
                    return;
                }
                int i12 = i11 + iComputeUInt32SizeNoTag2;
                this.position = i12;
                int iEncode2 = Utf8.encode(str, this.buffer, i12, this.limit - i12);
                this.position = i11;
                int i13 = (iEncode2 - i11) - iComputeUInt32SizeNoTag2;
                bufferUInt32NoTag(i13);
                this.position = iEncode2;
                this.totalBytesWritten += i13;
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.totalBytesWritten -= this.position - i11;
                this.position = i11;
                inefficientWriteStringNoTag(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i9, int i10) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i9, i10));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i9, int i10) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i9, 0);
            bufferUInt32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i9) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i9, long j9) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i9, 0);
            bufferUInt64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j9) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i9, byte[] bArr, int i10, int i11) throws IOException {
            writeTag(i9, 2);
            writeByteArrayNoTag(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i9, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i9, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i9, int i10) throws IOException {
            flush();
            this.out.write(bArr, i9, i10);
            this.totalBytesWritten += i10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
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

        public OutputStreamEncoder(OutputStream outputStream, int i9) {
            super(i9);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.out = outputStream;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i9) throws IOException {
            if (this.limit - this.position < i9) {
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
        public void write(byte b10) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i9, boolean z9) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i9, 0);
            buffer(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i9, byte[] bArr) throws IOException {
            writeByteArray(i9, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i9, int i10) throws IOException {
            writeUInt32NoTag(i10);
            write(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i9, ByteBuffer byteBuffer) throws IOException {
            writeTag(i9, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i9, ByteString byteString) throws IOException {
            writeTag(i9, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i9, int i10) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i9, 5);
            bufferFixed32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i9) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i9, long j9) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i9, 1);
            bufferFixed64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j9) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i9, int i10) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i9, 0);
            bufferInt32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i9) throws IOException {
            if (i9 >= 0) {
                writeUInt32NoTag(i9);
            } else {
                writeUInt64NoTag(i9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i9, int i10) throws IOException {
            write(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i9, MessageLite messageLite) throws IOException {
            writeTag(i9, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i9, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i9);
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
        public void writeRawMessageSetExtension(int i9, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i9);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i9, String str) throws IOException {
            writeTag(i9, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int iEncodedLength;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i9 = iComputeUInt32SizeNoTag + length;
                int i10 = this.limit;
                if (i9 > i10) {
                    byte[] bArr = new byte[length];
                    int iEncode = Utf8.encode(str, bArr, 0, length);
                    writeUInt32NoTag(iEncode);
                    writeLazy(bArr, 0, iEncode);
                    return;
                }
                if (i9 > i10 - this.position) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i11 = this.position;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i12 = i11 + iComputeUInt32SizeNoTag2;
                        this.position = i12;
                        int iEncode2 = Utf8.encode(str, this.buffer, i12, this.limit - i12);
                        this.position = i11;
                        iEncodedLength = (iEncode2 - i11) - iComputeUInt32SizeNoTag2;
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = iEncode2;
                    } else {
                        iEncodedLength = Utf8.encodedLength(str);
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    }
                    this.totalBytesWritten += iEncodedLength;
                } catch (Utf8.UnpairedSurrogateException e10) {
                    this.totalBytesWritten -= this.position - i11;
                    this.position = i11;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (Utf8.UnpairedSurrogateException e12) {
                inefficientWriteStringNoTag(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i9, int i10) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i9, i10));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i9, int i10) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i9, 0);
            bufferUInt32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i9) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i9, long j9) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i9, 0);
            bufferUInt64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j9) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i9, byte[] bArr, int i10, int i11) throws IOException {
            writeTag(i9, 2);
            writeByteArrayNoTag(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i9, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i9, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i9, int i10) throws IOException {
            int i11 = this.limit;
            int i12 = this.position;
            if (i11 - i12 >= i10) {
                System.arraycopy(bArr, i9, this.buffer, i12, i10);
                this.position += i10;
                this.totalBytesWritten += i10;
                return;
            }
            int i13 = i11 - i12;
            System.arraycopy(bArr, i9, this.buffer, i12, i13);
            int i14 = i9 + i13;
            int i15 = i10 - i13;
            this.position = this.limit;
            this.totalBytesWritten += i13;
            doFlush();
            if (i15 <= this.limit) {
                System.arraycopy(bArr, i14, this.buffer, 0, i15);
                this.position = i15;
            } else {
                this.out.write(bArr, i14, i15);
            }
            this.totalBytesWritten += i15;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i9 = this.limit;
            int i10 = this.position;
            if (i9 - i10 >= iRemaining) {
                byteBuffer.get(this.buffer, i10, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            int i11 = i9 - i10;
            byteBuffer.get(this.buffer, i10, i11);
            int i12 = iRemaining - i11;
            this.position = this.limit;
            this.totalBytesWritten += i11;
            doFlush();
            while (true) {
                int i13 = this.limit;
                if (i12 > i13) {
                    byteBuffer.get(this.buffer, 0, i13);
                    this.out.write(this.buffer, 0, this.limit);
                    int i14 = this.limit;
                    i12 -= i14;
                    this.totalBytesWritten += i14;
                } else {
                    byteBuffer.get(this.buffer, 0, i12);
                    this.position = i12;
                    this.totalBytesWritten += i12;
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

        private void encode(String str) throws IOException {
            try {
                Utf8.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
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
        public void write(byte b10) throws IOException {
            try {
                this.buffer.put(b10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i9, boolean z9) throws IOException {
            writeTag(i9, 0);
            write(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i9, byte[] bArr) throws IOException {
            writeByteArray(i9, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i9, int i10) throws IOException {
            writeUInt32NoTag(i10);
            write(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i9, ByteBuffer byteBuffer) throws IOException {
            writeTag(i9, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i9, ByteString byteString) throws IOException {
            writeTag(i9, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i9, int i10) throws IOException {
            writeTag(i9, 5);
            writeFixed32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i9) throws IOException {
            try {
                this.buffer.putInt(i9);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i9, long j9) throws IOException {
            writeTag(i9, 1);
            writeFixed64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j9) throws IOException {
            try {
                this.buffer.putLong(j9);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i9, int i10) throws IOException {
            writeTag(i9, 0);
            writeInt32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i9) throws IOException {
            if (i9 >= 0) {
                writeUInt32NoTag(i9);
            } else {
                writeUInt64NoTag(i9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i9, int i10) throws IOException {
            write(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i9, MessageLite messageLite) throws IOException {
            writeTag(i9, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i9, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i9);
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
        public void writeRawMessageSetExtension(int i9, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i9);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i9, String str) throws IOException {
            writeTag(i9, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
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
            } catch (Utf8.UnpairedSurrogateException e10) {
                Java8Compatibility.position(this.buffer, iPosition);
                inefficientWriteStringNoTag(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i9, int i10) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i9, i10));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i9, int i10) throws IOException {
            writeTag(i9, 0);
            writeUInt32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i9) throws IOException {
            while ((i9 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                try {
                    this.buffer.put((byte) ((i9 | 128) & 255));
                    i9 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new OutOfSpaceException(e10);
                }
            }
            this.buffer.put((byte) i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i9, long j9) throws IOException {
            writeTag(i9, 0);
            writeUInt64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j9) throws IOException {
            while (((-128) & j9) != 0) {
                try {
                    this.buffer.put((byte) ((((int) j9) | 128) & 255));
                    j9 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new OutOfSpaceException(e10);
                }
            }
            this.buffer.put((byte) j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i9, byte[] bArr, int i10, int i11) throws IOException {
            writeTag(i9, 2);
            writeByteArrayNoTag(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i9, int i10) throws IOException {
            try {
                this.buffer.put(bArr, i9, i10);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i9, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i9, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
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

        private int bufferPos(long j9) {
            return (int) (j9 - this.address);
        }

        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void repositionBuffer(long j9) {
            Java8Compatibility.position(this.buffer, bufferPos(j9));
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
        public void write(byte b10) throws IOException {
            long j9 = this.position;
            if (j9 >= this.limit) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
            this.position = 1 + j9;
            UnsafeUtil.putByte(j9, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i9, boolean z9) throws IOException {
            writeTag(i9, 0);
            write(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i9, byte[] bArr) throws IOException {
            writeByteArray(i9, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i9, int i10) throws IOException {
            writeUInt32NoTag(i10);
            write(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i9, ByteBuffer byteBuffer) throws IOException {
            writeTag(i9, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i9, ByteString byteString) throws IOException {
            writeTag(i9, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i9, int i10) throws IOException {
            writeTag(i9, 5);
            writeFixed32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i9) throws IOException {
            this.buffer.putInt(bufferPos(this.position), i9);
            this.position += 4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i9, long j9) throws IOException {
            writeTag(i9, 1);
            writeFixed64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j9) throws IOException {
            this.buffer.putLong(bufferPos(this.position), j9);
            this.position += 8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i9, int i10) throws IOException {
            writeTag(i9, 0);
            writeInt32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i9) throws IOException {
            if (i9 >= 0) {
                writeUInt32NoTag(i9);
            } else {
                writeUInt64NoTag(i9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i9, int i10) throws IOException {
            write(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i9, MessageLite messageLite) throws IOException {
            writeTag(i9, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i9, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i9);
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
        public void writeRawMessageSetExtension(int i9, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i9);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i9, String str) throws IOException {
            writeTag(i9, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            long j9 = this.position;
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
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.position = j9;
                repositionBuffer(j9);
                inefficientWriteStringNoTag(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new OutOfSpaceException(e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i9, int i10) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i9, i10));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i9, int i10) throws IOException {
            writeTag(i9, 0);
            writeUInt32NoTag(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i9) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((i9 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    long j9 = this.position;
                    this.position = j9 + 1;
                    UnsafeUtil.putByte(j9, (byte) ((i9 | 128) & 255));
                    i9 >>>= 7;
                }
                long j10 = this.position;
                this.position = 1 + j10;
                UnsafeUtil.putByte(j10, (byte) i9);
                return;
            }
            while (true) {
                long j11 = this.position;
                if (j11 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((i9 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                    this.position = 1 + j11;
                    UnsafeUtil.putByte(j11, (byte) i9);
                    return;
                } else {
                    this.position = j11 + 1;
                    UnsafeUtil.putByte(j11, (byte) ((i9 | 128) & 255));
                    i9 >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i9, long j9) throws IOException {
            writeTag(i9, 0);
            writeUInt64NoTag(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j9) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((j9 & (-128)) != 0) {
                    long j10 = this.position;
                    this.position = j10 + 1;
                    UnsafeUtil.putByte(j10, (byte) ((((int) j9) | 128) & 255));
                    j9 >>>= 7;
                }
                long j11 = this.position;
                this.position = 1 + j11;
                UnsafeUtil.putByte(j11, (byte) j9);
                return;
            }
            while (true) {
                long j12 = this.position;
                if (j12 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((j9 & (-128)) == 0) {
                    this.position = 1 + j12;
                    UnsafeUtil.putByte(j12, (byte) j9);
                    return;
                } else {
                    this.position = j12 + 1;
                    UnsafeUtil.putByte(j12, (byte) ((((int) j9) | 128) & 255));
                    j9 >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i9, byte[] bArr, int i10, int i11) throws IOException {
            writeTag(i9, 2);
            writeByteArrayNoTag(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i9, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i9, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i9, int i10) throws IOException {
            if (bArr != null && i9 >= 0 && i10 >= 0 && bArr.length - i10 >= i9) {
                long j9 = i10;
                long j10 = this.limit - j9;
                long j11 = this.position;
                if (j10 >= j11) {
                    UnsafeUtil.copyMemory(bArr, i9, j11, j9);
                    this.position += j9;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i10)));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                int iRemaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += iRemaining;
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }
    }

    public static int computeBoolSize(int i9, boolean z9) {
        return computeTagSize(i9) + computeBoolSizeNoTag(z9);
    }

    public static int computeBoolSizeNoTag(boolean z9) {
        return 1;
    }

    public static int computeByteArraySize(int i9, byte[] bArr) {
        return computeTagSize(i9) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i9, ByteBuffer byteBuffer) {
        return computeTagSize(i9) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i9, ByteString byteString) {
        return computeTagSize(i9) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i9, double d10) {
        return computeTagSize(i9) + computeDoubleSizeNoTag(d10);
    }

    public static int computeDoubleSizeNoTag(double d10) {
        return 8;
    }

    public static int computeEnumSize(int i9, int i10) {
        return computeTagSize(i9) + computeEnumSizeNoTag(i10);
    }

    public static int computeEnumSizeNoTag(int i9) {
        return computeInt32SizeNoTag(i9);
    }

    public static int computeFixed32Size(int i9, int i10) {
        return computeTagSize(i9) + computeFixed32SizeNoTag(i10);
    }

    public static int computeFixed32SizeNoTag(int i9) {
        return 4;
    }

    public static int computeFixed64Size(int i9, long j9) {
        return computeTagSize(i9) + computeFixed64SizeNoTag(j9);
    }

    public static int computeFixed64SizeNoTag(long j9) {
        return 8;
    }

    public static int computeFloatSize(int i9, float f10) {
        return computeTagSize(i9) + computeFloatSizeNoTag(f10);
    }

    public static int computeFloatSizeNoTag(float f10) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i9, MessageLite messageLite) {
        return (computeTagSize(i9) * 2) + messageLite.getSerializedSize();
    }

    @InlineMe(replacement = "value.getSerializedSize()")
    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i9, int i10) {
        return computeTagSize(i9) + computeInt32SizeNoTag(i10);
    }

    public static int computeInt32SizeNoTag(int i9) {
        return computeUInt64SizeNoTag(i9);
    }

    public static int computeInt64Size(int i9, long j9) {
        return computeTagSize(i9) + computeInt64SizeNoTag(j9);
    }

    public static int computeInt64SizeNoTag(long j9) {
        return computeUInt64SizeNoTag(j9);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i9, LazyFieldLite lazyFieldLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i9) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeLazyFieldSize(int i9, LazyFieldLite lazyFieldLite) {
        return computeTagSize(i9) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i9) {
        return computeUInt32SizeNoTag(i9) + i9;
    }

    public static int computeMessageSetExtensionSize(int i9, MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i9) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i9, MessageLite messageLite) {
        return computeTagSize(i9) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i9) {
        if (i9 > 4096) {
            return 4096;
        }
        return i9;
    }

    public static int computeRawMessageSetExtensionSize(int i9, ByteString byteString) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i9) + computeBytesSize(3, byteString);
    }

    @InlineMe(imports = {"androidx.datastore.preferences.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt32SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint32Size(int i9) {
        return computeUInt32SizeNoTag(i9);
    }

    @InlineMe(imports = {"androidx.datastore.preferences.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt64SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint64Size(long j9) {
        return computeUInt64SizeNoTag(j9);
    }

    public static int computeSFixed32Size(int i9, int i10) {
        return computeTagSize(i9) + computeSFixed32SizeNoTag(i10);
    }

    public static int computeSFixed32SizeNoTag(int i9) {
        return 4;
    }

    public static int computeSFixed64Size(int i9, long j9) {
        return computeTagSize(i9) + computeSFixed64SizeNoTag(j9);
    }

    public static int computeSFixed64SizeNoTag(long j9) {
        return 8;
    }

    public static int computeSInt32Size(int i9, int i10) {
        return computeTagSize(i9) + computeSInt32SizeNoTag(i10);
    }

    public static int computeSInt32SizeNoTag(int i9) {
        return computeUInt32SizeNoTag(encodeZigZag32(i9));
    }

    public static int computeSInt64Size(int i9, long j9) {
        return computeTagSize(i9) + computeSInt64SizeNoTag(j9);
    }

    public static int computeSInt64SizeNoTag(long j9) {
        return computeUInt64SizeNoTag(encodeZigZag64(j9));
    }

    public static int computeStringSize(int i9, String str) {
        return computeTagSize(i9) + computeStringSizeNoTag(str);
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

    public static int computeTagSize(int i9) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i9, 0));
    }

    public static int computeUInt32Size(int i9, int i10) {
        return computeTagSize(i9) + computeUInt32SizeNoTag(i10);
    }

    public static int computeUInt32SizeNoTag(int i9) {
        return (352 - (Integer.numberOfLeadingZeros(i9) * 9)) >>> 6;
    }

    public static int computeUInt64Size(int i9, long j9) {
        return computeTagSize(i9) + computeUInt64SizeNoTag(j9);
    }

    public static int computeUInt64SizeNoTag(long j9) {
        return (640 - (Long.numberOfLeadingZeros(j9) * 9)) >>> 6;
    }

    public static int encodeZigZag32(int i9) {
        return (i9 >> 31) ^ (i9 << 1);
    }

    public static long encodeZigZag64(long j9) {
        return (j9 >> 63) ^ (j9 << 1);
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

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
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
    public abstract void write(byte b10) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i9, int i10) throws IOException;

    public abstract void writeBool(int i9, boolean z9) throws IOException;

    public final void writeBoolNoTag(boolean z9) throws IOException {
        write(z9 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i9, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i9, byte[] bArr, int i10, int i11) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i9, int i10) throws IOException;

    public abstract void writeByteBuffer(int i9, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i9, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public final void writeDouble(int i9, double d10) throws IOException {
        writeFixed64(i9, Double.doubleToRawLongBits(d10));
    }

    public final void writeDoubleNoTag(double d10) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d10));
    }

    public final void writeEnum(int i9, int i10) throws IOException {
        writeInt32(i9, i10);
    }

    public final void writeEnumNoTag(int i9) throws IOException {
        writeInt32NoTag(i9);
    }

    public abstract void writeFixed32(int i9, int i10) throws IOException;

    public abstract void writeFixed32NoTag(int i9) throws IOException;

    public abstract void writeFixed64(int i9, long j9) throws IOException;

    public abstract void writeFixed64NoTag(long j9) throws IOException;

    public final void writeFloat(int i9, float f10) throws IOException {
        writeFixed32(i9, Float.floatToRawIntBits(f10));
    }

    public final void writeFloatNoTag(float f10) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void writeGroup(int i9, MessageLite messageLite) throws IOException {
        writeTag(i9, 3);
        writeGroupNoTag(messageLite);
        writeTag(i9, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i9, int i10) throws IOException;

    public abstract void writeInt32NoTag(int i9) throws IOException;

    public final void writeInt64(int i9, long j9) throws IOException {
        writeUInt64(i9, j9);
    }

    public final void writeInt64NoTag(long j9) throws IOException {
        writeUInt64NoTag(j9);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i9, int i10) throws IOException;

    public abstract void writeMessage(int i9, MessageLite messageLite) throws IOException;

    public abstract void writeMessage(int i9, MessageLite messageLite, Schema schema) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException;

    public abstract void writeMessageSetExtension(int i9, MessageLite messageLite) throws IOException;

    public final void writeRawByte(byte b10) throws IOException {
        write(b10);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @InlineMe(replacement = "this.writeFixed32NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian32(int i9) throws IOException {
        writeFixed32NoTag(i9);
    }

    @InlineMe(replacement = "this.writeFixed64NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian64(long j9) throws IOException {
        writeFixed64NoTag(j9);
    }

    public abstract void writeRawMessageSetExtension(int i9, ByteString byteString) throws IOException;

    @InlineMe(replacement = "this.writeUInt32NoTag(value)")
    @Deprecated
    public final void writeRawVarint32(int i9) throws IOException {
        writeUInt32NoTag(i9);
    }

    @InlineMe(replacement = "this.writeUInt64NoTag(value)")
    @Deprecated
    public final void writeRawVarint64(long j9) throws IOException {
        writeUInt64NoTag(j9);
    }

    public final void writeSFixed32(int i9, int i10) throws IOException {
        writeFixed32(i9, i10);
    }

    public final void writeSFixed32NoTag(int i9) throws IOException {
        writeFixed32NoTag(i9);
    }

    public final void writeSFixed64(int i9, long j9) throws IOException {
        writeFixed64(i9, j9);
    }

    public final void writeSFixed64NoTag(long j9) throws IOException {
        writeFixed64NoTag(j9);
    }

    public final void writeSInt32(int i9, int i10) throws IOException {
        writeUInt32(i9, encodeZigZag32(i10));
    }

    public final void writeSInt32NoTag(int i9) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i9));
    }

    public final void writeSInt64(int i9, long j9) throws IOException {
        writeUInt64(i9, encodeZigZag64(j9));
    }

    public final void writeSInt64NoTag(long j9) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j9));
    }

    public abstract void writeString(int i9, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i9, int i10) throws IOException;

    public abstract void writeUInt32(int i9, int i10) throws IOException;

    public abstract void writeUInt32NoTag(int i9) throws IOException;

    public abstract void writeUInt64(int i9, long j9) throws IOException;

    public abstract void writeUInt64NoTag(long j9) throws IOException;

    private CodedOutputStream() {
    }

    @Deprecated
    public static int computeGroupSize(int i9, MessageLite messageLite, Schema schema) {
        return (computeTagSize(i9) * 2) + computeGroupSizeNoTag(messageLite, schema);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(schema);
    }

    public static int computeMessageSize(int i9, MessageLite messageLite, Schema schema) {
        return computeTagSize(i9) + computeMessageSizeNoTag(messageLite, schema);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite, Schema schema) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(schema));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i9) {
        return new OutputStreamEncoder(outputStream, i9);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite, Schema schema) throws IOException {
        schema.writeTo(messageLite, this.wrapper);
    }

    public final void writeRawByte(int i9) throws IOException {
        write((byte) i9);
    }

    public final void writeRawBytes(byte[] bArr, int i9, int i10) throws IOException {
        write(bArr, i9, i10);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i9, int i10) {
        return new ArrayEncoder(bArr, i9, i10);
    }

    @Deprecated
    public final void writeGroup(int i9, MessageLite messageLite, Schema schema) throws IOException {
        writeTag(i9, 3);
        writeGroupNoTag(messageLite, schema);
        writeTag(i9, 4);
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
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i9) {
        return newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(ByteOutput byteOutput, int i9) {
        if (i9 >= 0) {
            return new ByteOutputEncoder(byteOutput, i9);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
