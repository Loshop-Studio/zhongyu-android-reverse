package org.eclipse.paho.client.mqttv3.internal.websocket;

import androidx.work.WorkInfo;
import com.alibaba.fastjson.asm.Opcodes;
import com.tendcloud.tenddata.C7863av;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.SecureRandom;

/* loaded from: classes6.dex */
public class WebSocketFrame {
    public static final int frameLengthOverhead = 6;
    private boolean closeFlag;
    private boolean fin;
    private byte opcode;
    private byte[] payload;

    public WebSocketFrame(byte b10, boolean z10, byte[] bArr) {
        this.closeFlag = false;
        this.opcode = b10;
        this.fin = z10;
        if (bArr != null) {
            this.payload = (byte[]) bArr.clone();
        }
    }

    public static void appendFinAndOpCode(ByteBuffer byteBuffer, byte b10, boolean z10) {
        byteBuffer.put((byte) ((b10 & 15) | (z10 ? (byte) 128 : (byte) 0)));
    }

    private static void appendLength(ByteBuffer byteBuffer, int i10, boolean z10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        int i11 = z10 ? WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT : 0;
        if (i10 <= 65535) {
            if (i10 < 126) {
                byteBuffer.put((byte) (i10 | i11));
                return;
            }
            byteBuffer.put((byte) (i11 | Opcodes.IAND));
            byteBuffer.put((byte) (i10 >> 8));
            byteBuffer.put((byte) (i10 & 255));
            return;
        }
        byteBuffer.put((byte) (i11 | 127));
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) ((i10 >> 24) & 255));
        byteBuffer.put((byte) ((i10 >> 16) & 255));
        byteBuffer.put((byte) ((i10 >> 8) & 255));
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void appendLengthAndMask(ByteBuffer byteBuffer, int i10, byte[] bArr) {
        if (bArr == null) {
            appendLength(byteBuffer, i10, false);
        } else {
            appendLength(byteBuffer, i10, true);
            byteBuffer.put(bArr);
        }
    }

    public static byte[] generateMaskingKey() {
        SecureRandom secureRandom = new SecureRandom();
        return new byte[]{(byte) secureRandom.nextInt(255), (byte) secureRandom.nextInt(255), (byte) secureRandom.nextInt(255), (byte) secureRandom.nextInt(255)};
    }

    private void setFinAndOpCode(byte b10) {
        this.fin = (b10 & 128) != 0;
        this.opcode = (byte) (b10 & 15);
    }

    public byte[] encodeFrame() {
        byte[] bArr = this.payload;
        int length = bArr.length;
        int i10 = length + 6;
        if (bArr.length > 65535) {
            i10 = length + 14;
        } else if (bArr.length >= 126) {
            i10 = length + 8;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        appendFinAndOpCode(byteBufferAllocate, this.opcode, this.fin);
        byte[] bArrGenerateMaskingKey = generateMaskingKey();
        appendLengthAndMask(byteBufferAllocate, this.payload.length, bArrGenerateMaskingKey);
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.payload;
            if (i11 >= bArr2.length) {
                byteBufferAllocate.flip();
                return byteBufferAllocate.array();
            }
            byte b10 = (byte) (bArr2[i11] ^ bArrGenerateMaskingKey[i11 % 4]);
            bArr2[i11] = b10;
            byteBufferAllocate.put(b10);
            i11++;
        }
    }

    public byte getOpcode() {
        return this.opcode;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    public boolean isCloseFlag() {
        return this.closeFlag;
    }

    public boolean isFin() {
        return this.fin;
    }

    public WebSocketFrame(byte[] bArr) {
        byte[] bArr2;
        int i10 = 0;
        this.closeFlag = false;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        setFinAndOpCode(byteBufferWrap.get());
        byte b10 = byteBufferWrap.get();
        boolean z10 = (b10 & 128) != 0;
        int i11 = (byte) (b10 & 127);
        int i12 = i11 == 127 ? 8 : i11 == 126 ? 2 : 0;
        while (true) {
            i12--;
            if (i12 <= 0) {
                break;
            } else {
                i11 |= (byteBufferWrap.get() & C7863av.f14384i) << (i12 * 8);
            }
        }
        if (z10) {
            bArr2 = new byte[4];
            byteBufferWrap.get(bArr2, 0, 4);
        } else {
            bArr2 = null;
        }
        byte[] bArr3 = new byte[i11];
        this.payload = bArr3;
        byteBufferWrap.get(bArr3, 0, i11);
        if (!z10) {
            return;
        }
        while (true) {
            byte[] bArr4 = this.payload;
            if (i10 >= bArr4.length) {
                return;
            }
            bArr4[i10] = (byte) (bArr4[i10] ^ bArr2[i10 % 4]);
            i10++;
        }
    }

    public WebSocketFrame(InputStream inputStream) throws IOException {
        byte[] bArr;
        int i10 = 0;
        this.closeFlag = false;
        setFinAndOpCode((byte) inputStream.read());
        byte b10 = this.opcode;
        if (b10 != 2) {
            if (b10 == 8) {
                this.closeFlag = true;
                return;
            } else {
                throw new IOException("Invalid Frame: Opcode: " + ((int) this.opcode));
            }
        }
        byte b11 = (byte) inputStream.read();
        boolean z10 = (b11 & 128) != 0;
        int i11 = (byte) (b11 & 127);
        int i12 = i11 != 127 ? i11 == 126 ? 2 : 0 : 8;
        i11 = i12 > 0 ? 0 : i11;
        while (true) {
            i12--;
            if (i12 < 0) {
                break;
            } else {
                i11 |= (((byte) inputStream.read()) & C7863av.f14384i) << (i12 * 8);
            }
        }
        if (z10) {
            bArr = new byte[4];
            inputStream.read(bArr, 0, 4);
        } else {
            bArr = null;
        }
        this.payload = new byte[i11];
        int i13 = 0;
        int i14 = i11;
        while (i13 != i11) {
            int i15 = inputStream.read(this.payload, i13, i14);
            i13 += i15;
            i14 -= i15;
        }
        if (!z10) {
            return;
        }
        while (true) {
            byte[] bArr2 = this.payload;
            if (i10 >= bArr2.length) {
                return;
            }
            bArr2[i10] = (byte) (bArr2[i10] ^ bArr[i10 % 4]);
            i10++;
        }
    }
}
