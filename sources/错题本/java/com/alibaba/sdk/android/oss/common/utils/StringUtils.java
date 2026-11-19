package com.alibaba.sdk.android.oss.common.utils;

import androidx.collection.AbstractC0584a;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class StringUtils {
    public static final Charset UTF8 = Charset.forName("utf-8");

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String join(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
            if (i < strArr.length - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String replaceEach(String str, String[] strArr, String[] strArr2) {
        String str2;
        String str3;
        int length;
        int length2 = strArr.length;
        int length3 = strArr2.length;
        if (!isNullOrEmpty(str) && (length2 != 0 || length3 != 0)) {
            if (length2 != length3) {
                throw new IllegalArgumentException(AbstractC0584a.m912m(length2, length3, "Search and Replace array lengths don't match: ", " vs "));
            }
            boolean[] zArr = new boolean[length2];
            int i = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < length2; i9++) {
                if (!zArr[i9] && !isNullOrEmpty(strArr[i9]) && strArr2[i9] != null) {
                    int iIndexOf = str.indexOf(strArr[i9]);
                    if (iIndexOf == -1) {
                        zArr[i9] = true;
                    } else if (i == -1 || iIndexOf < i) {
                        i8 = i9;
                        i = iIndexOf;
                    }
                }
            }
            if (i != -1) {
                int i10 = 0;
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    if (strArr[i11] != null && (str3 = strArr2[i11]) != null && (length = str3.length() - strArr[i11].length()) > 0) {
                        i10 += length * 3;
                    }
                }
                StringBuilder sb = new StringBuilder(str.length() + Math.min(i10, str.length() / 5));
                int length4 = 0;
                while (i != -1) {
                    while (length4 < i) {
                        sb.append(str.charAt(length4));
                        length4++;
                    }
                    sb.append(strArr2[i8]);
                    length4 = strArr[i8].length() + i;
                    i = -1;
                    i8 = -1;
                    for (int i12 = 0; i12 < length2; i12++) {
                        if (!zArr[i12] && (str2 = strArr[i12]) != null && !str2.isEmpty() && strArr2[i12] != null) {
                            int iIndexOf2 = str.indexOf(strArr[i12], length4);
                            if (iIndexOf2 == -1) {
                                zArr[i12] = true;
                            } else if (i == -1 || iIndexOf2 < i) {
                                i8 = i12;
                                i = iIndexOf2;
                            }
                        }
                    }
                }
                int length5 = str.length();
                while (length4 < length5) {
                    sb.append(str.charAt(length4));
                    length4++;
                }
                return sb.toString();
            }
        }
        return str;
    }

    public static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static String join(String str, Collection<String> collection) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            sb.append(it.next());
            if (i < collection.size() - 1) {
                sb.append(str);
            }
            i++;
        }
        return sb.toString();
    }
}
