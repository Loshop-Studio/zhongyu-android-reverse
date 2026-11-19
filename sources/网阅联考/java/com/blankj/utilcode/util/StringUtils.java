package com.blankj.utilcode.util;

import android.content.res.Resources;
import androidx.annotation.ArrayRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import java.util.IllegalFormatException;

/* loaded from: classes2.dex */
public final class StringUtils {
    private StringUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (charSequence.charAt(i4) != charSequence2.charAt(i4)) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsIgnoreCase(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static String format(@Nullable String str, Object... objArr) {
        if (str == null || objArr == null || objArr.length <= 0) {
            return str;
        }
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException e4) {
            e4.printStackTrace();
            return str;
        }
    }

    public static String getString(@StringRes int i4) {
        return getString(i4, null);
    }

    public static String[] getStringArray(@ArrayRes int i4) {
        try {
            return Utils.getApp().getResources().getStringArray(i4);
        } catch (Resources.NotFoundException e4) {
            e4.printStackTrace();
            return new String[]{String.valueOf(i4)};
        }
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isWhitespace(str.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTrimEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String lowerFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        return String.valueOf((char) (str.charAt(0) + ' ')) + str.substring(1);
    }

    public static String null2Length0(String str) {
        return str == null ? "" : str;
    }

    public static String reverse(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        if (length <= 1) {
            return str;
        }
        int i4 = length >> 1;
        char[] charArray = str.toCharArray();
        for (int i5 = 0; i5 < i4; i5++) {
            char c4 = charArray[i5];
            int i6 = (length - i5) - 1;
            charArray[i5] = charArray[i6];
            charArray[i6] = c4;
        }
        return new String(charArray);
    }

    public static String toDBC(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i4 = 0; i4 < length; i4++) {
            char c4 = charArray[i4];
            if (c4 == 12288) {
                charArray[i4] = ' ';
            } else if (65281 > c4 || c4 > 65374) {
                charArray[i4] = c4;
            } else {
                charArray[i4] = (char) (c4 - 65248);
            }
        }
        return new String(charArray);
    }

    public static String toSBC(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i4 = 0; i4 < length; i4++) {
            char c4 = charArray[i4];
            if (c4 == ' ') {
                charArray[i4] = 12288;
            } else if ('!' > c4 || c4 > '~') {
                charArray[i4] = c4;
            } else {
                charArray[i4] = (char) (c4 + 65248);
            }
        }
        return new String(charArray);
    }

    public static String upperFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return ((char) (str.charAt(0) - ' ')) + str.substring(1);
    }

    public static String getString(@StringRes int i4, Object... objArr) {
        try {
            return format(Utils.getApp().getString(i4), objArr);
        } catch (Resources.NotFoundException e4) {
            e4.printStackTrace();
            return String.valueOf(i4);
        }
    }
}
