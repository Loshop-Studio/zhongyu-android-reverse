package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class VINResultParser extends ResultParser {
    private static final Pattern IOQ = Pattern.compile("[IOQ]");
    private static final Pattern AZ09 = Pattern.compile("[A-Z0-9]{17}");

    private static char checkChar(int i10) {
        if (i10 < 10) {
            return (char) (i10 + 48);
        }
        if (i10 == 10) {
            return 'X';
        }
        throw new IllegalArgumentException();
    }

    private static boolean checkChecksum(CharSequence charSequence) {
        int i10 = 0;
        int iVinPositionWeight = 0;
        while (i10 < charSequence.length()) {
            int i11 = i10 + 1;
            iVinPositionWeight += vinPositionWeight(i11) * vinCharValue(charSequence.charAt(i10));
            i10 = i11;
        }
        return charSequence.charAt(8) == checkChar(iVinPositionWeight % 11);
    }

    private static String countryCode(CharSequence charSequence) {
        char cCharAt = charSequence.charAt(0);
        char cCharAt2 = charSequence.charAt(1);
        if (cCharAt == '9') {
            if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                return "BR";
            }
            if (cCharAt2 < '3' || cCharAt2 > '9') {
                return null;
            }
            return "BR";
        }
        if (cCharAt == 'S') {
            if (cCharAt2 >= 'A' && cCharAt2 <= 'M') {
                return "UK";
            }
            if (cCharAt2 < 'N' || cCharAt2 > 'T') {
                return null;
            }
            return "DE";
        }
        if (cCharAt == 'Z') {
            if (cCharAt2 < 'A' || cCharAt2 > 'R') {
                return null;
            }
            return "IT";
        }
        switch (cCharAt) {
            case '1':
            case '4':
            case '5':
                return "US";
            case '2':
                return "CA";
            case '3':
                if (cCharAt2 < 'A' || cCharAt2 > 'W') {
                    return null;
                }
                return "MX";
            default:
                switch (cCharAt) {
                    case 'J':
                        if (cCharAt2 < 'A' || cCharAt2 > 'T') {
                            return null;
                        }
                        return "JP";
                    case 'K':
                        if (cCharAt2 < 'L' || cCharAt2 > 'R') {
                            return null;
                        }
                        return "KO";
                    case 'L':
                        return "CN";
                    case IjkMediaMeta.FF_PROFILE_H264_MAIN /* 77 */:
                        if (cCharAt2 < 'A' || cCharAt2 > 'E') {
                            return null;
                        }
                        return "IN";
                    default:
                        switch (cCharAt) {
                            case 'V':
                                if (cCharAt2 >= 'F' && cCharAt2 <= 'R') {
                                    return "FR";
                                }
                                if (cCharAt2 < 'S' || cCharAt2 > 'W') {
                                    return null;
                                }
                                return "ES";
                            case 'W':
                                return "DE";
                            case IjkMediaMeta.FF_PROFILE_H264_EXTENDED /* 88 */:
                                if (cCharAt2 == '0') {
                                    return "RU";
                                }
                                if (cCharAt2 < '3' || cCharAt2 > '9') {
                                    return null;
                                }
                                return "RU";
                            default:
                                return null;
                        }
                }
        }
    }

    private static int modelYear(char c10) {
        if (c10 >= 'E' && c10 <= 'H') {
            return c10 + 1915;
        }
        if (c10 >= 'J' && c10 <= 'N') {
            return c10 + 1914;
        }
        if (c10 == 'P') {
            return 1993;
        }
        if (c10 >= 'R' && c10 <= 'T') {
            return c10 + 1912;
        }
        if (c10 >= 'V' && c10 <= 'Y') {
            return c10 + 1911;
        }
        if (c10 >= '1' && c10 <= '9') {
            return c10 + 1952;
        }
        if (c10 < 'A' || c10 > 'D') {
            throw new IllegalArgumentException();
        }
        return c10 + 1945;
    }

    private static int vinCharValue(char c10) {
        if (c10 >= 'A' && c10 <= 'I') {
            return c10 - '@';
        }
        if (c10 >= 'J' && c10 <= 'R') {
            return c10 - 'I';
        }
        if (c10 >= 'S' && c10 <= 'Z') {
            return c10 - 'Q';
        }
        if (c10 < '0' || c10 > '9') {
            throw new IllegalArgumentException();
        }
        return c10 - '0';
    }

    private static int vinPositionWeight(int i10) {
        if (i10 > 0 && i10 <= 7) {
            return 9 - i10;
        }
        if (i10 == 8) {
            return 10;
        }
        if (i10 == 9) {
            return 0;
        }
        if (i10 < 10 || i10 > 17) {
            throw new IllegalArgumentException();
        }
        return 19 - i10;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public VINParsedResult parse(Result result) {
        if (result.getBarcodeFormat() != BarcodeFormat.CODE_39) {
            return null;
        }
        String strTrim = IOQ.matcher(result.getText()).replaceAll("").trim();
        if (!AZ09.matcher(strTrim).matches()) {
            return null;
        }
        try {
            if (!checkChecksum(strTrim)) {
                return null;
            }
            String strSubstring = strTrim.substring(0, 3);
            return new VINParsedResult(strTrim, strSubstring, strTrim.substring(3, 9), strTrim.substring(9, 17), countryCode(strSubstring), strTrim.substring(3, 8), modelYear(strTrim.charAt(9)), strTrim.charAt(10), strTrim.substring(11));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
