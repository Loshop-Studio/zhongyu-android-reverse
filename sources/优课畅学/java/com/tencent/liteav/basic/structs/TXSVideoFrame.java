package com.tencent.liteav.basic.structs;

import android.opengl.GLES20;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class TXSVideoFrame {
    public ByteBuffer buffer;
    public byte[] data;
    public Object eglContext;
    public int frameType;
    public int height;
    public long pts;
    public int rotation;
    public int textureId;
    public int width;

    private native void nativeLoadArrayFromBuffer(byte[] bArr, int i10);

    private native void nativeLoadArrayFromGL(byte[] bArr, int i10, int i11);

    private native void nativeLoadBufferFromGL(int i10, int i11);

    private native void nativeLoadNV21BufferFromI420Buffer(int i10, int i11);

    public byte[] I420toNV21(byte[] bArr, byte[] bArr2, int i10, int i11) {
        if (bArr2 == null) {
            bArr2 = new byte[bArr.length];
        }
        int i12 = i10 * i11;
        int i13 = (i12 / 4) + i12;
        System.arraycopy(bArr, 0, bArr2, 0, i12);
        int i14 = i12;
        int i15 = i13;
        while (i12 < i13) {
            bArr2[i14] = bArr[i15];
            bArr2[i14 + 1] = bArr[i12];
            i12++;
            i15++;
            i14 += 2;
        }
        return bArr2;
    }

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public void loadNV21BufferFromI420Buffer() {
        nativeLoadNV21BufferFromI420Buffer(this.width, this.height);
    }

    public void loadYUVArray(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i10 = this.width;
            int i11 = this.height;
            if (length < ((i10 * i11) * 3) / 2) {
                return;
            }
            if (this.buffer == null) {
                GLES20.glReadPixels(0, 0, i10, (i11 * 3) / 8, 6408, 5121, ByteBuffer.wrap(bArr));
            } else {
                nativeLoadArrayFromBuffer(bArr, ((i10 * i11) * 3) / 2);
            }
        }
    }

    public void loadYUVBufferFromGL() {
        nativeLoadBufferFromGL(this.width, this.height);
    }

    public native void nativeClone(ByteBuffer byteBuffer);

    public native void release();

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TXSVideoFrame m27387clone() {
        TXSVideoFrame tXSVideoFrame = new TXSVideoFrame();
        tXSVideoFrame.width = this.width;
        tXSVideoFrame.height = this.height;
        tXSVideoFrame.frameType = this.frameType;
        tXSVideoFrame.rotation = this.rotation;
        tXSVideoFrame.pts = this.pts;
        tXSVideoFrame.data = this.data;
        tXSVideoFrame.textureId = this.textureId;
        tXSVideoFrame.eglContext = this.eglContext;
        tXSVideoFrame.nativeClone(this.buffer);
        return tXSVideoFrame;
    }
}
