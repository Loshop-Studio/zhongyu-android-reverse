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

/* loaded from: classes3.dex */
public class AmrEncoder extends AudioEncoder {
    private static byte[] header = {35, 33, 65, 77, 82, 10};

    public AmrEncoder(String str) {
        this.destinationFile = str;
    }

    @Override // com.zykj.paint.record.AudioEncoder
    @SuppressLint({"WrongConstant"})
    @TargetApi(16)
    public void encode(String str) throws MediaCodec.CryptoException, IOException {
        long j7;
        ByteBuffer[] byteBufferArr;
        ByteBuffer[] byteBufferArr2;
        int i;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/3gpp");
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/3gpp");
            mediaFormat.setInteger("sample-rate", this.SAMPLE_RATE);
            mediaFormat.setInteger("channel-count", this.CHANNEL_COUNT);
            mediaFormat.setInteger("bitrate", this.BIT_RATE);
            boolean z8 = true;
            mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.destinationFile));
            fileOutputStream.write(header);
            mediaCodecCreateEncoderByType.start();
            ByteBuffer[] inputBuffers = mediaCodecCreateEncoderByType.getInputBuffers();
            ByteBuffer[] outputBuffers = mediaCodecCreateEncoderByType.getOutputBuffers();
            byte[] bArr = new byte[88200];
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            double d9 = AudioStats.AUDIO_AMPLITUDE_NONE;
            int i8 = 0;
            while (true) {
                int i9 = i8;
                int iDequeueInputBuffer = 0;
                while (true) {
                    j7 = 0;
                    if (iDequeueInputBuffer == -1 || !z8) {
                        break;
                    }
                    iDequeueInputBuffer = mediaCodecCreateEncoderByType.dequeueInputBuffer(0L);
                    if (iDequeueInputBuffer >= 0) {
                        ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
                        byteBuffer.clear();
                        int i10 = fileInputStream.read(bArr, 0, byteBuffer.limit());
                        if (i10 == -1) {
                            i = iDequeueInputBuffer;
                            byteBufferArr2 = outputBuffers;
                            byteBufferArr = inputBuffers;
                            mediaCodecCreateEncoderByType.queueInputBuffer(i, 0, 0, (long) d9, 4);
                            d9 = d9;
                            z8 = false;
                        } else {
                            i = iDequeueInputBuffer;
                            byteBufferArr = inputBuffers;
                            byteBufferArr2 = outputBuffers;
                            i9 += i10;
                            byteBuffer.put(bArr, 0, i10);
                            mediaCodecCreateEncoderByType.queueInputBuffer(i, 0, i10, (long) d9, 0);
                            d9 = ((i9 / 2) * AnimationKt.MillisToNanos) / this.SAMPLE_RATE;
                        }
                        iDequeueInputBuffer = i;
                    } else {
                        byteBufferArr = inputBuffers;
                        byteBufferArr2 = outputBuffers;
                    }
                    inputBuffers = byteBufferArr;
                    outputBuffers = byteBufferArr2;
                }
                ByteBuffer[] byteBufferArr3 = inputBuffers;
                ByteBuffer[] byteBufferArr4 = outputBuffers;
                double d10 = d9;
                int iDequeueOutputBuffer = 0;
                while (iDequeueOutputBuffer != -1) {
                    iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, j7);
                    if (iDequeueOutputBuffer >= 0) {
                        ByteBuffer byteBuffer2 = byteBufferArr4[iDequeueOutputBuffer];
                        byteBuffer2.position(bufferInfo.offset);
                        byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
                        int i11 = bufferInfo.size;
                        byte[] bArr2 = new byte[i11];
                        byteBuffer2.get(bArr2, 0, i11);
                        fileOutputStream.write(bArr2, 0, bufferInfo.size);
                        mediaCodecCreateEncoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    }
                    j7 = 0;
                }
                if (bufferInfo.flags == 4) {
                    break;
                }
                d9 = d10;
                i8 = i9;
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.zykj.paint.record.AudioEncoder
    public void init(int i, int i8, int i9) {
        super.init(i, i8, i9);
    }
}
