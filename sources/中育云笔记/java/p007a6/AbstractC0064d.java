package p007a6;

import android.text.TextUtils;
import anet.channel.request.Request;
import com.tendcloud.tenddata.C7863av;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* renamed from: a6.d */
/* loaded from: classes5.dex */
public abstract class AbstractC0064d {
    /* renamed from: a */
    public static String m127a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & C7863av.f14384i);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static byte[] m128b(String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            int length = upperCase.length() / 2;
            byte[] bArr = new byte[length];
            try {
                byte[] bytes = upperCase.getBytes(Request.DEFAULT_CHARSET);
                for (int i10 = 0; i10 < length; i10++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("0x");
                    int i11 = i10 * 2;
                    sb2.append(new String(new byte[]{bytes[i11]}, Request.DEFAULT_CHARSET));
                    bArr[i10] = (byte) (((byte) (Byte.decode(sb2.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i11 + 1]}, Request.DEFAULT_CHARSET)).byteValue());
                }
                return bArr;
            } catch (UnsupportedEncodingException | NumberFormatException e10) {
                AbstractC0067g.m138c("HexUtil", "hex string 2 byte array exception : " + e10.getMessage());
                return new byte[0];
            }
        } catch (Throwable th) {
            AbstractC0067g.m138c("HexUtil", "hex string toUpperCase exception : " + th.getMessage());
            return new byte[0];
        }
    }
}
