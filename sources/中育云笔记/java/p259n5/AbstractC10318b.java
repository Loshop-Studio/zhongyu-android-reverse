package p259n5;

import android.text.TextUtils;
import anet.channel.request.Request;
import com.huawei.hms.framework.common.Logger;
import com.tendcloud.tenddata.C7863av;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/* renamed from: n5.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10318b {

    /* renamed from: a */
    public static final String f24593a = "b";

    /* renamed from: b */
    public static final Pattern f24594b = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* renamed from: a */
    public static String m21525a(String str) {
        return m21526b(str, "SHA-256");
    }

    /* renamed from: b */
    public static String m21526b(String str, String str2) throws UnsupportedEncodingException {
        String str3;
        String str4;
        try {
            try {
                return m21527c(MessageDigest.getInstance(str2).digest(str.getBytes(Request.DEFAULT_CHARSET)));
            } catch (NoSuchAlgorithmException unused) {
                str3 = f24593a;
                str4 = "encrypt NoSuchAlgorithmException";
                Logger.m8588w(str3, str4);
                return null;
            }
        } catch (UnsupportedEncodingException unused2) {
            str3 = f24593a;
            str4 = "encrypt UnsupportedEncodingException";
        }
    }

    /* renamed from: c */
    public static String m21527c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & C7863av.f14384i);
            if (hexString.length() == 1) {
                sb2.append("0");
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static String m21528d(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i10 = 1;
        if (str.length() == 1) {
            return "*";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < str.length(); i11++) {
            String str2 = str.charAt(i11) + "";
            if (f24594b.matcher(str2).matches()) {
                if (i10 % 2 == 0) {
                    str2 = "*";
                }
                i10++;
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }
}
