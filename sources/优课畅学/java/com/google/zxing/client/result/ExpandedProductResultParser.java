package com.google.zxing.client.result;

/* loaded from: classes4.dex */
public final class ExpandedProductResultParser extends ResultParser {
    private static String findAIvalue(int i10, String str) {
        if (str.charAt(i10) != '(') {
            return null;
        }
        String strSubstring = str.substring(i10 + 1);
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < strSubstring.length(); i11++) {
            char cCharAt = strSubstring.charAt(i11);
            if (cCharAt == ')') {
                return sb.toString();
            }
            if (cCharAt < '0' || cCharAt > '9') {
                return null;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    private static String findValue(int i10, String str) {
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(i10);
        for (int i11 = 0; i11 < strSubstring.length(); i11++) {
            char cCharAt = strSubstring.charAt(i11);
            if (cCharAt != '(') {
                sb.append(cCharAt);
            } else {
                if (findAIvalue(i11, strSubstring) != null) {
                    break;
                }
                sb.append('(');
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    @Override // com.google.zxing.client.result.ResultParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.zxing.client.result.ExpandedProductParsedResult parse(com.google.zxing.Result r24) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.result.ExpandedProductResultParser.parse(com.google.zxing.Result):com.google.zxing.client.result.ExpandedProductParsedResult");
    }
}
