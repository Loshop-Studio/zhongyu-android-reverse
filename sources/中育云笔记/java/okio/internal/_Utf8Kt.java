package okio.internal;

import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.accs.data.Message;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Utf8;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;
import p309qc.C10786q;
import p310qd.AbstractC10819z;

/* loaded from: classes6.dex */
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i10;
        char cCharAt;
        AbstractC9979u.m20294g(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            char cCharAt2 = str.charAt(i11);
            if (AbstractC9979u.m20296i(cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i12 = i11;
                while (i11 < length2) {
                    char cCharAt3 = str.charAt(i11);
                    if (AbstractC9979u.m20296i(cCharAt3, 128) < 0) {
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) cCharAt3;
                        i11++;
                        while (true) {
                            i12 = i13;
                            if (i11 >= length2 || AbstractC9979u.m20296i(str.charAt(i11), 128) >= 0) {
                                break;
                            }
                            i13 = i12 + 1;
                            bArr[i12] = (byte) str.charAt(i11);
                            i11++;
                        }
                    } else {
                        if (AbstractC9979u.m20296i(cCharAt3, 2048) < 0) {
                            bArr[i12] = (byte) ((cCharAt3 >> 6) | Opcodes.CHECKCAST);
                            i12 += 2;
                            bArr[i12 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i12] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i12 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i12 += 3;
                            bArr[i12 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (AbstractC9979u.m20296i(cCharAt3, 56319) > 0 || length2 <= (i10 = i11 + 1) || 56320 > (cCharAt = str.charAt(i10)) || cCharAt >= 57344) {
                            bArr[i12] = Utf8.REPLACEMENT_BYTE;
                            i11++;
                            i12++;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + str.charAt(i10)) - 56613888;
                            bArr[i12] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i12 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i12 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i12 += 4;
                            bArr[i12 + 3] = (byte) ((iCharAt & 63) | 128);
                            i11 += 2;
                        }
                        i11++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
                AbstractC9979u.m20293f(bArrCopyOf, "copyOf(...)");
                return bArrCopyOf;
            }
            bArr[i11] = (byte) cCharAt2;
            i11++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        AbstractC9979u.m20293f(bArrCopyOf2, "copyOf(...)");
        return bArrCopyOf2;
    }

    public static final String commonToUtf8String(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        AbstractC9979u.m20294g(bArr, "<this>");
        if (i17 < 0 || i11 > bArr.length || i17 > i11) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i17 + " endIndex=" + i11);
        }
        char[] cArr = new char[i11 - i17];
        int i18 = 0;
        while (i17 < i11) {
            byte b10 = bArr[i17];
            if (b10 >= 0) {
                i12 = i18 + 1;
                cArr[i18] = (char) b10;
                i17++;
                while (i17 < i11) {
                    byte b11 = bArr[i17];
                    if (b11 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i12] = (char) b11;
                    i12++;
                }
                C10786q c10786q = C10786q.f26013a;
            } else {
                if ((b10 >> 5) == -2) {
                    int i19 = i17 + 1;
                    if (i11 <= i19) {
                        i12 = i18 + 1;
                        cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    } else {
                        byte b12 = bArr[i19];
                        if ((b12 & 192) == 128) {
                            int i20 = (b10 << 6) ^ (b12 ^ 3968);
                            if (i20 < 128) {
                                i12 = i18 + 1;
                                cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else {
                                i12 = i18 + 1;
                                cArr[i18] = (char) i20;
                            }
                            C10786q c10786q2 = C10786q.f26013a;
                        } else {
                            i12 = i18 + 1;
                            cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                    C10786q c10786q3 = C10786q.f26013a;
                } else if ((b10 >> 4) == -2) {
                    int i21 = i17 + 2;
                    if (i11 <= i21) {
                        i12 = i18 + 1;
                        cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        C10786q c10786q4 = C10786q.f26013a;
                        int i22 = i17 + 1;
                        i13 = (i11 <= i22 || (bArr[i22] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b13 = bArr[i17 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i21];
                            if ((b14 & 192) == 128) {
                                int i23 = (b10 << MqttWireMessage.MESSAGE_TYPE_PINGREQ) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                if (i23 < 2048) {
                                    i12 = i18 + 1;
                                    cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else if (55296 > i23 || i23 >= 57344) {
                                    i12 = i18 + 1;
                                    cArr[i18] = (char) i23;
                                } else {
                                    i12 = i18 + 1;
                                    cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                }
                                C10786q c10786q5 = C10786q.f26013a;
                                i13 = 3;
                            } else {
                                i12 = i18 + 1;
                                cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                C10786q c10786q6 = C10786q.f26013a;
                            }
                        } else {
                            i12 = i18 + 1;
                            cArr[i18] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            C10786q c10786q7 = C10786q.f26013a;
                        }
                    }
                } else {
                    if ((b10 >> 3) == -2) {
                        int i24 = i17 + 3;
                        if (i11 <= i24) {
                            i14 = i18 + 1;
                            cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                            C10786q c10786q8 = C10786q.f26013a;
                            int i25 = i17 + 1;
                            if (i11 > i25 && (bArr[i25] & 192) == 128) {
                                int i26 = i17 + 2;
                                i16 = (i11 <= i26 || (bArr[i26] & 192) != 128) ? 2 : 3;
                            }
                            i16 = 1;
                        } else {
                            byte b15 = bArr[i17 + 1];
                            if ((b15 & 192) == 128) {
                                byte b16 = bArr[i17 + 2];
                                if ((b16 & 192) == 128) {
                                    byte b17 = bArr[i24];
                                    if ((b17 & 192) == 128) {
                                        int i27 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << MqttWireMessage.MESSAGE_TYPE_PINGREQ));
                                        if (i27 > 1114111) {
                                            i14 = i18 + 1;
                                            cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 > i27 || i27 >= 57344) && i27 >= 65536) {
                                            if (i27 != 65533) {
                                                cArr[i18] = (char) ((i27 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                                i15 = i18 + 2;
                                                cArr[i18 + 1] = (char) ((i27 & Message.EXT_HEADER_VALUE_MAX_LEN) + Utf8.LOG_SURROGATE_HEADER);
                                            } else {
                                                cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                                i15 = i18 + 1;
                                            }
                                            C10786q c10786q9 = C10786q.f26013a;
                                            i14 = i15;
                                            i16 = 4;
                                        } else {
                                            i14 = i18 + 1;
                                            cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                        }
                                        C10786q c10786q10 = C10786q.f26013a;
                                        i16 = 4;
                                    } else {
                                        i14 = i18 + 1;
                                        cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                        C10786q c10786q11 = C10786q.f26013a;
                                    }
                                } else {
                                    i14 = i18 + 1;
                                    cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                    C10786q c10786q12 = C10786q.f26013a;
                                }
                            } else {
                                i14 = i18 + 1;
                                cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                                C10786q c10786q13 = C10786q.f26013a;
                                i16 = 1;
                            }
                        }
                        i17 += i16;
                    } else {
                        i14 = i18 + 1;
                        cArr[i18] = Utf8.REPLACEMENT_CHARACTER;
                        i17++;
                    }
                    i18 = i14;
                }
                i17 += i13;
            }
            i18 = i12;
        }
        return AbstractC10819z.m23244v(cArr, 0, i18);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        return commonToUtf8String(bArr, i10, i11);
    }
}
