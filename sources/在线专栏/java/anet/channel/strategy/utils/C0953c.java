package anet.channel.strategy.utils;

import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: anet.channel.strategy.utils.c */
/* loaded from: classes.dex */
public class C0953c {
    /* renamed from: a */
    public static boolean m4630a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length < 7 || charArray.length > 15) {
            return false;
        }
        int i4 = 0;
        int i5 = 0;
        for (char c4 : charArray) {
            if (c4 >= '0' && c4 <= '9') {
                i5 = ((i5 * 10) + c4) - 48;
                if (i5 > 255) {
                    return false;
                }
            } else {
                if (c4 != '.' || (i4 = i4 + 1) > 3) {
                    return false;
                }
                i5 = 0;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m4631b(String str) {
        int i4;
        boolean z3;
        int i5;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length < 2) {
            return false;
        }
        if (charArray[0] != ':') {
            i4 = 0;
            z3 = false;
            i5 = 0;
        } else {
            if (charArray[1] != ':') {
                return false;
            }
            i4 = 1;
            z3 = false;
            i5 = 1;
        }
        int i6 = 0;
        boolean z4 = true;
        while (i4 < charArray.length) {
            char c4 = charArray[i4];
            int iDigit = Character.digit(c4, 16);
            if (iDigit != -1) {
                i6 = (i6 << 4) + iDigit;
                if (i6 > 65535) {
                    return false;
                }
                z4 = false;
            } else {
                if (c4 != ':' || (i5 = i5 + 1) > 7) {
                    return false;
                }
                if (!z4) {
                    i6 = 0;
                    z4 = true;
                } else {
                    if (z3) {
                        return false;
                    }
                    z3 = true;
                }
            }
            i4++;
        }
        return z3 || i5 >= 7;
    }

    /* renamed from: c */
    public static boolean m4632c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length <= 0 || charArray.length > 255) {
            return false;
        }
        boolean z3 = false;
        for (int i4 = 0; i4 < charArray.length; i4++) {
            if ((charArray[i4] >= 'A' && charArray[i4] <= 'Z') || ((charArray[i4] >= 'a' && charArray[i4] <= 'z') || charArray[i4] == '*')) {
                z3 = true;
            } else if ((charArray[i4] < '0' || charArray[i4] > '9') && charArray[i4] != '.' && charArray[i4] != '-') {
                return false;
            }
        }
        return z3;
    }

    /* renamed from: d */
    public static String m4633d(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static String m4628a(long j4) {
        StringBuilder sb = new StringBuilder(16);
        long j5 = 1000000000;
        do {
            sb.append(j4 / j5);
            sb.append('.');
            j4 %= j5;
            j5 /= 1000;
        } while (j5 > 0);
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4629a(Map<String, String> map, String str) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(64);
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append("=");
                    sb.append(URLEncoder.encode(m4633d(entry.getValue()), str).replace("+", "%20"));
                    sb.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
                }
            }
            sb.deleteCharAt(sb.length() - 1);
        } catch (UnsupportedEncodingException e4) {
            ALog.m4637e("Request", "format params failed", null, e4, new Object[0]);
        }
        return sb.toString();
    }
}
