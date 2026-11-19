package com.zykj.base.utils;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import p121s2.AbstractC4550b;

@Keep
@Metadata(m5174d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0006"}, m5175d2 = {"Lcom/zykj/base/utils/MD5Utils;", "", "()V", "getMD5", "", "imagePath", "base_release"}, m5176k = 1, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class MD5Utils {
    public static final MD5Utils INSTANCE = new MD5Utils();

    private MD5Utils() {
    }

    public final String getMD5(String imagePath) throws NoSuchAlgorithmException, IOException {
        int i4;
        FileInputStream fileInputStream = new FileInputStream(new File(imagePath));
        StringBuffer stringBuffer = new StringBuffer();
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bArr = new byte[1024];
        while (true) {
            int i5 = fileInputStream.read(bArr);
            i4 = 0;
            if (i5 == -1) {
                break;
            }
            messageDigest.update(bArr, 0, i5);
        }
        byte[] bArrDigest = messageDigest.digest();
        int length = bArrDigest.length - 1;
        if (length >= 0) {
            while (true) {
                int i6 = i4 + 1;
                String string = Integer.toString(AbstractC4550b.m6220b(bArrDigest[i4], 255) + 256, CharsKt__CharJVMKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring = string.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                stringBuffer.append(strSubstring);
                if (i6 > length) {
                    break;
                }
                i4 = i6;
            }
        }
        String string2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "md5.toString()");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = string2.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
