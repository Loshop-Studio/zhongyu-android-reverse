package com.alibaba.fastjson.util;

import anet.channel.request.Request;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.accs.data.Message;
import com.tendcloud.tenddata.C7863av;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import okio.Utf8;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;

/* loaded from: classes3.dex */
public class UTF8Decoder extends CharsetDecoder {
    private static final Charset charset = Charset.forName(Request.DEFAULT_CHARSET);

    public UTF8Decoder() {
        super(charset, 1.0f, 1.0f);
    }

    private CoderResult decodeArrayLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        ByteBuffer byteBuffer2;
        int i10;
        CharBuffer charBuffer2;
        int i11;
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int iArrayOffset2 = byteBuffer.arrayOffset() + byteBuffer.limit();
        char[] cArrArray = charBuffer.array();
        int iArrayOffset3 = charBuffer.arrayOffset() + charBuffer.position();
        int iArrayOffset4 = charBuffer.arrayOffset() + charBuffer.limit();
        int iMin = Math.min(iArrayOffset2 - iArrayOffset, iArrayOffset4 - iArrayOffset3) + iArrayOffset3;
        while (iArrayOffset3 < iMin) {
            byte b10 = bArrArray[iArrayOffset];
            if (b10 < 0) {
                break;
            }
            iArrayOffset++;
            cArrArray[iArrayOffset3] = (char) b10;
            iArrayOffset3++;
        }
        int i12 = iArrayOffset;
        int i13 = iArrayOffset3;
        while (i12 < iArrayOffset2) {
            byte b11 = bArrArray[i12];
            if (b11 < 0) {
                int i14 = iArrayOffset4;
                byteBuffer2 = byteBuffer;
                i10 = i14;
                charBuffer2 = charBuffer;
                if ((b11 >> 5) == -2) {
                    if (iArrayOffset2 - i12 < 2 || i13 >= i10) {
                        return xflow(byteBuffer2, i12, iArrayOffset2, charBuffer2, i13, 2);
                    }
                    byte b12 = bArrArray[i12 + 1];
                    if (isMalformed2(b11, b12)) {
                        return malformed(byteBuffer2, i12, charBuffer2, i13, 2);
                    }
                    i11 = i13 + 1;
                    cArrArray[i13] = (char) ((b12 ^ (b11 << 6)) ^ Utf8.MASK_2BYTES);
                    i12 += 2;
                } else if ((b11 >> 4) == -2) {
                    if (iArrayOffset2 - i12 < 3 || i13 >= i10) {
                        return xflow(byteBuffer2, i12, iArrayOffset2, charBuffer2, i13, 3);
                    }
                    byte b13 = bArrArray[i12 + 1];
                    byte b14 = bArrArray[i12 + 2];
                    if (isMalformed3(b11, b13, b14)) {
                        return malformed(byteBuffer2, i12, charBuffer2, i13, 3);
                    }
                    i11 = i13 + 1;
                    cArrArray[i13] = (char) ((((b13 << 6) ^ (b11 << MqttWireMessage.MESSAGE_TYPE_PINGREQ)) ^ b14) ^ 8064);
                    i12 += 3;
                } else {
                    if ((b11 >> 3) != -2) {
                        return malformed(byteBuffer2, i12, charBuffer2, i13, 1);
                    }
                    if (iArrayOffset2 - i12 < 4 || i10 - i13 < 2) {
                        return xflow(byteBuffer2, i12, iArrayOffset2, charBuffer2, i13, 4);
                    }
                    byte b15 = bArrArray[i12 + 1];
                    byte b16 = bArrArray[i12 + 2];
                    byte b17 = bArrArray[i12 + 3];
                    int i15 = ((b11 & 7) << 18) | ((b15 & Utf8.REPLACEMENT_BYTE) << 12) | ((b16 & Utf8.REPLACEMENT_BYTE) << 6) | (b17 & Utf8.REPLACEMENT_BYTE);
                    if (isMalformed4(b15, b16, b17) || i15 < 65536 || i15 > 1114111) {
                        return malformed(byteBuffer2, i12, charBuffer2, i13, 4);
                    }
                    int i16 = i13 + 1;
                    int i17 = i15 - 65536;
                    cArrArray[i13] = (char) (((i17 >> 10) & Message.EXT_HEADER_VALUE_MAX_LEN) | 55296);
                    i13 += 2;
                    cArrArray[i16] = (char) (56320 | (i17 & Message.EXT_HEADER_VALUE_MAX_LEN));
                    i12 += 4;
                }
                i13 = i11;
            } else {
                if (i13 >= iArrayOffset4) {
                    return xflow(byteBuffer, i12, iArrayOffset2, charBuffer, i13, 1);
                }
                int i18 = iArrayOffset4;
                byteBuffer2 = byteBuffer;
                i10 = i18;
                charBuffer2 = charBuffer;
                cArrArray[i13] = (char) b11;
                i12++;
                i13++;
            }
            ByteBuffer byteBuffer3 = byteBuffer2;
            iArrayOffset4 = i10;
            byteBuffer = byteBuffer3;
            charBuffer = charBuffer2;
        }
        return xflow(byteBuffer, i12, iArrayOffset2, charBuffer, i13, 0);
    }

    private static boolean isMalformed2(int i10, int i11) {
        return (i10 & 30) == 0 || (i11 & Opcodes.CHECKCAST) != 128;
    }

    private static boolean isMalformed3(int i10, int i11, int i12) {
        return ((i10 != -32 || (i11 & 224) != 128) && (i11 & Opcodes.CHECKCAST) == 128 && (i12 & Opcodes.CHECKCAST) == 128) ? false : true;
    }

    private static boolean isMalformed4(int i10, int i11, int i12) {
        return ((i10 & Opcodes.CHECKCAST) == 128 && (i11 & Opcodes.CHECKCAST) == 128 && (i12 & Opcodes.CHECKCAST) == 128) ? false : true;
    }

    private static boolean isNotContinuation(int i10) {
        return (i10 & Opcodes.CHECKCAST) != 128;
    }

    private static CoderResult lookupN(ByteBuffer byteBuffer, int i10) {
        for (int i11 = 1; i11 < i10; i11++) {
            if (isNotContinuation(byteBuffer.get())) {
                return CoderResult.malformedForLength(i11);
            }
        }
        return CoderResult.malformedForLength(i10);
    }

    private static CoderResult malformed(ByteBuffer byteBuffer, int i10, CharBuffer charBuffer, int i11, int i12) {
        byteBuffer.position(i10 - byteBuffer.arrayOffset());
        CoderResult coderResultMalformedN = malformedN(byteBuffer, i12);
        byteBuffer.position(i10);
        charBuffer.position(i11);
        return coderResultMalformedN;
    }

    public static CoderResult malformedN(ByteBuffer byteBuffer, int i10) {
        int i11 = 1;
        if (i10 == 1) {
            byte b10 = byteBuffer.get();
            return (b10 >> 2) == -2 ? byteBuffer.remaining() < 4 ? CoderResult.UNDERFLOW : lookupN(byteBuffer, 5) : (b10 >> 1) == -2 ? byteBuffer.remaining() < 5 ? CoderResult.UNDERFLOW : lookupN(byteBuffer, 6) : CoderResult.malformedForLength(1);
        }
        if (i10 == 2) {
            return CoderResult.malformedForLength(1);
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            int i12 = byteBuffer.get() & C7863av.f14384i;
            byte b11 = byteBuffer.get();
            int i13 = b11 & C7863av.f14384i;
            return (i12 > 244 || (i12 == 240 && (i13 < 144 || i13 > 191)) || ((i12 == 244 && (b11 & 240) != 128) || isNotContinuation(i13))) ? CoderResult.malformedForLength(1) : isNotContinuation(byteBuffer.get()) ? CoderResult.malformedForLength(2) : CoderResult.malformedForLength(3);
        }
        byte b12 = byteBuffer.get();
        byte b13 = byteBuffer.get();
        if ((b12 != -32 || (b13 & 224) != 128) && !isNotContinuation(b13)) {
            i11 = 2;
        }
        return CoderResult.malformedForLength(i11);
    }

    private static CoderResult xflow(Buffer buffer, int i10, int i11, Buffer buffer2, int i12, int i13) {
        buffer.position(i10);
        buffer2.position(i12);
        return (i13 == 0 || i11 - i10 < i13) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    @Override // java.nio.charset.CharsetDecoder
    public CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        return decodeArrayLoop(byteBuffer, charBuffer);
    }
}
