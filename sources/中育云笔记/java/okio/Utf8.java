package okio;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.jvm.internal.AbstractC9979u;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;
import p181hd.InterfaceC9540l;

/* loaded from: classes6.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i10) {
        if (i10 < 0 || i10 >= 32) {
            return 127 <= i10 && i10 < 160;
        }
        return true;
    }

    public static final boolean isUtf8Continuation(byte b10) {
        return (b10 & 192) == 128;
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i10, int i11, InterfaceC9540l yield) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        AbstractC9979u.m20294g(bArr, "<this>");
        AbstractC9979u.m20294g(yield, "yield");
        int i12 = i10 + 1;
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i12];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i13 = (b11 ^ 3968) ^ (b10 << 6);
        if (i13 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i13));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i10, int i11, InterfaceC9540l yield) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        AbstractC9979u.m20294g(bArr, "<this>");
        AbstractC9979u.m20294g(yield, "yield");
        int i12 = i10 + 2;
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            int i13 = i10 + 1;
            return (i11 <= i13 || (bArr[i13] & 192) != 128) ? 1 : 2;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i12];
        if ((b12 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i14 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b10 << MqttWireMessage.MESSAGE_TYPE_PINGREQ);
        if (i14 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 > i14 || i14 >= 57344) {
            yield.invoke(Integer.valueOf(i14));
            return 3;
        }
        yield.invoke(numValueOf);
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i10, int i11, InterfaceC9540l yield) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        AbstractC9979u.m20294g(bArr, "<this>");
        AbstractC9979u.m20294g(yield, "yield");
        int i12 = i10 + 3;
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            int i13 = i10 + 1;
            if (i11 <= i13 || (bArr[i13] & 192) != 128) {
                return 1;
            }
            int i14 = i10 + 2;
            return (i11 <= i14 || (bArr[i14] & 192) != 128) ? 2 : 3;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i10 + 2];
        if ((b12 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b13 = bArr[i12];
        if ((b13 & 192) != 128) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i15 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << MqttWireMessage.MESSAGE_TYPE_PINGREQ)) ^ (b10 << 18);
        if (i15 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i15 && i15 < 57344) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i15 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i15));
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void processUtf16Chars(byte[] r12, int r13, int r14, p181hd.InterfaceC9540l r15) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf16Chars(byte[], int, int, hd.l):void");
    }

    public static final void processUtf8Bytes(String str, int i10, int i11, InterfaceC9540l yield) {
        int i12;
        char cCharAt;
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(yield, "yield");
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (AbstractC9979u.m20296i(cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i10++;
                while (i10 < i11 && AbstractC9979u.m20296i(str.charAt(i10), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i10)));
                    i10++;
                }
            } else {
                if (AbstractC9979u.m20296i(cCharAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | Opcodes.CHECKCAST)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (AbstractC9979u.m20296i(cCharAt2, 56319) > 0 || i11 <= (i12 = i10 + 1) || 56320 > (cCharAt = str.charAt(i12)) || cCharAt >= 57344) {
                    yield.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                } else {
                    int iCharAt = ((cCharAt2 << '\n') + str.charAt(i12)) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i10 += 2;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void processUtf8CodePoints(byte[] r11, int r12, int r13, p181hd.InterfaceC9540l r14) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf8CodePoints(byte[], int, int, hd.l):void");
    }

    public static final long size(String str) {
        AbstractC9979u.m20294g(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static /* synthetic */ long size$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return size(str, i10, i11);
    }

    public static final long size(String str, int i10) {
        AbstractC9979u.m20294g(str, "<this>");
        return size$default(str, i10, 0, 2, null);
    }

    public static final long size(String str, int i10, int i11) {
        int i12;
        AbstractC9979u.m20294g(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            long j10 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt < 128) {
                    j10++;
                } else {
                    if (cCharAt < 2048) {
                        i12 = 2;
                    } else if (cCharAt < 55296 || cCharAt > 57343) {
                        i12 = 3;
                    } else {
                        int i13 = i10 + 1;
                        char cCharAt2 = i13 < i11 ? str.charAt(i13) : (char) 0;
                        if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                            j10++;
                            i10 = i13;
                        } else {
                            j10 += 4;
                            i10 += 2;
                        }
                    }
                    j10 += i12;
                }
                i10++;
            }
            return j10;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
    }
}
