package com.zykj.paint.record;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.camera.video.AudioStats;
import androidx.compose.animation.core.AnimationKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class AmrEncoder extends AudioEncoder {
    private static byte[] header = {35, 33, 65, 77, 82, 10};

    public AmrEncoder(String str) {
        this.destinationFile = str;
    }

    @Override // com.zykj.paint.record.AudioEncoder
    @SuppressLint({"WrongConstant"})
    @TargetApi(16)
    public void encode(String str) throws MediaCodec.CryptoException, IOException {
        long j10;
        ByteBuffer[] byteBufferArr;
        ByteBuffer[] byteBufferArr2;
        int i10;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/3gpp");
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/3gpp");
            mediaFormat.setInteger("sample-rate", this.SAMPLE_RATE);
            mediaFormat.setInteger("channel-count", this.CHANNEL_COUNT);
            mediaFormat.setInteger("bitrate", this.BIT_RATE);
            boolean z9 = true;
            mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.destinationFile));
            fileOutputStream.write(header);
            mediaCodecCreateEncoderByType.start();
            ByteBuffer[] inputBuffers = mediaCodecCreateEncoderByType.getInputBuffers();
            ByteBuffer[] outputBuffers = mediaCodecCreateEncoderByType.getOutputBuffers();
            byte[] bArr = new byte[88200];
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                int iDequeueInputBuffer = 0;
                while (true) {
                    j10 = 0;
                    if (iDequeueInputBuffer == -1 || !z9) {
                        break;
                    }
                    iDequeueInputBuffer = mediaCodecCreateEncoderByType.dequeueInputBuffer(0L);
                    if (iDequeueInputBuffer >= 0) {
                        ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
                        byteBuffer.clear();
                        int i13 = fileInputStream.read(bArr, 0, byteBuffer.limit());
                        if (i13 == -1) {
                            i10 = iDequeueInputBuffer;
                            byteBufferArr2 = outputBuffers;
                            byteBufferArr = inputBuffers;
                            mediaCodecCreateEncoderByType.queueInputBuffer(i10, 0, 0, (long) d10, 4);
                            d10 = d10;
                            z9 = false;
                        } else {
                            i10 = iDequeueInputBuffer;
                            byteBufferArr = inputBuffers;
                            byteBufferArr2 = outputBuffers;
                            i12 += i13;
                            byteBuffer.put(bArr, 0, i13);
                            mediaCodecCreateEncoderByType.queueInputBuffer(i10, 0, i13, (long) d10, 0);
                            d10 = ((i12 / 2) * AnimationKt.MillisToNanos) / this.SAMPLE_RATE;
                        }
                        iDequeueInputBuffer = i10;
                    } else {
                        byteBufferArr = inputBuffers;
                        byteBufferArr2 = outputBuffers;
                    }
                    inputBuffers = byteBufferArr;
                    outputBuffers = byteBufferArr2;
                }
                ByteBuffer[] byteBufferArr3 = inputBuffers;
                ByteBuffer[] byteBufferArr4 = outputBuffers;
                double d11 = d10;
                int iDequeueOutputBuffer = 0;
                while (iDequeueOutputBuffer != -1) {
                    iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, j10);
                    if (iDequeueOutputBuffer >= 0) {
                        ByteBuffer byteBuffer2 = byteBufferArr4[iDequeueOutputBuffer];
                        byteBuffer2.position(bufferInfo.offset);
                        byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
                        int i14 = bufferInfo.size;
                        byte[] bArr2 = new byte[i14];
                        byteBuffer2.get(bArr2, 0, i14);
                        fileOutputStream.write(bArr2, 0, bufferInfo.size);
                        mediaCodecCreateEncoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    }
                    j10 = 0;
                }
                if (bufferInfo.flags == 4) {
                    break;
                }
                d10 = d11;
                i11 = i12;
                inputBuffers = byteBufferArr3;
                outputBuffers = byteBufferArr4;
            }
            fileInputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.zykj.paint.record.AudioEncoder
    public void init(int i10, int i11, int i12) {
        super.init(i10, i11, i12);
    }
}
