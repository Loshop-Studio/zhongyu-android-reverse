package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.UByte;

/* loaded from: classes3.dex */
class IterableByteBufferInputStream extends InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize = 0;
    private boolean hasArray;
    private Iterator<ByteBuffer> iterator;

    public IterableByteBufferInputStream(Iterable<ByteBuffer> iterable) {
        this.iterator = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.dataSize++;
        }
        this.currentIndex = -1;
        if (getNextByteBuffer()) {
            return;
        }
        this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
        this.currentIndex = 0;
        this.currentByteBufferPos = 0;
        this.currentAddress = 0L;
    }

    private boolean getNextByteBuffer() {
        ByteBuffer next;
        do {
            this.currentIndex++;
            if (!this.iterator.hasNext()) {
                return false;
            }
            next = this.iterator.next();
            this.currentByteBuffer = next;
        } while (!next.hasRemaining());
        this.currentByteBufferPos = this.currentByteBuffer.position();
        if (this.currentByteBuffer.hasArray()) {
            this.hasArray = true;
            this.currentArray = this.currentByteBuffer.array();
            this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
        } else {
            this.hasArray = false;
            this.currentAddress = UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentArray = null;
        }
        return true;
    }

    private void updateCurrentByteBufferPos(int i6) {
        int i7 = this.currentByteBufferPos + i6;
        this.currentByteBufferPos = i7;
        if (i7 == this.currentByteBuffer.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        if (this.hasArray) {
            int i6 = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset] & UByte.MAX_VALUE;
            updateCurrentByteBufferPos(1);
            return i6;
        }
        int i7 = UnsafeUtil.getByte(this.currentByteBufferPos + this.currentAddress) & UByte.MAX_VALUE;
        updateCurrentByteBufferPos(1);
        return i7;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i6, int i7) {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        int iLimit = this.currentByteBuffer.limit();
        int i8 = this.currentByteBufferPos;
        int i9 = iLimit - i8;
        if (i7 > i9) {
            i7 = i9;
        }
        if (this.hasArray) {
            System.arraycopy(this.currentArray, i8 + this.currentArrayOffset, bArr, i6, i7);
            updateCurrentByteBufferPos(i7);
            return i7;
        }
        int iPosition = this.currentByteBuffer.position();
        Java8Compatibility.position(this.currentByteBuffer, this.currentByteBufferPos);
        this.currentByteBuffer.get(bArr, i6, i7);
        Java8Compatibility.position(this.currentByteBuffer, iPosition);
        updateCurrentByteBufferPos(i7);
        return i7;
    }
}
