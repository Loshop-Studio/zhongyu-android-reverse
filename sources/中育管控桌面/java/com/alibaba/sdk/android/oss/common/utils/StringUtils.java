package com.alibaba.sdk.android.oss.common.utils;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class StringUtils {
    public static final Charset UTF8 = Charset.forName("utf-8");

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String join(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < strArr.length; i6++) {
            sb.append(strArr[i6]);
            if (i6 < strArr.length - 1) {
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
                throw new IllegalArgumentException("Search and Replace array lengths don't match: " + length2 + " vs " + length3);
            }
            boolean[] zArr = new boolean[length2];
            int i6 = -1;
            int i7 = -1;
            for (int i8 = 0; i8 < length2; i8++) {
                if (!zArr[i8] && !isNullOrEmpty(strArr[i8]) && strArr2[i8] != null) {
                    int iIndexOf = str.indexOf(strArr[i8]);
                    if (iIndexOf == -1) {
                        zArr[i8] = true;
                    } else if (i6 == -1 || iIndexOf < i6) {
                        i7 = i8;
                        i6 = iIndexOf;
                    }
                }
            }
            if (i6 != -1) {
                int i9 = 0;
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    if (strArr[i10] != null && (str3 = strArr2[i10]) != null && (length = str3.length() - strArr[i10].length()) > 0) {
                        i9 += length * 3;
                    }
                }
                StringBuilder sb = new StringBuilder(str.length() + Math.min(i9, str.length() / 5));
                int length4 = 0;
                while (i6 != -1) {
                    while (length4 < i6) {
                        sb.append(str.charAt(length4));
                        length4++;
                    }
                    sb.append(strArr2[i7]);
                    length4 = strArr[i7].length() + i6;
                    i6 = -1;
                    i7 = -1;
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (!zArr[i11] && (str2 = strArr[i11]) != null && !str2.isEmpty() && strArr2[i11] != null) {
                            int iIndexOf2 = str.indexOf(strArr[i11], length4);
                            if (iIndexOf2 == -1) {
                                zArr[i11] = true;
                            } else if (i6 == -1 || iIndexOf2 < i6) {
                                i7 = i11;
                                i6 = iIndexOf2;
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
        int i6 = 0;
        while (it.hasNext()) {
            sb.append(it.next());
            if (i6 < collection.size() - 1) {
                sb.append(str);
            }
            i6++;
        }
        return sb.toString();
    }
}
