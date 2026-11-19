package com.tendcloud.tenddata;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;

/* renamed from: com.tendcloud.tenddata.e */
/* loaded from: classes5.dex */
public final class C7949e {
    private C7949e() {
    }

    /* renamed from: a */
    public static Bitmap m11820a(Drawable drawable) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m11826b(Drawable drawable) {
        return m11823a(m11820a(drawable));
    }

    /* renamed from: c */
    public static String m11827c(Drawable drawable) {
        return m11825b(m11820a(drawable));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m11825b(android.graphics.Bitmap r4) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r4 == 0) goto L39
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            byte[] r4 = r1.toByteArray()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            r2 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r4, r2)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            r4 = r0
            r0 = r1
            goto L3a
        L1b:
            r4 = move-exception
            r0 = r1
            goto L30
        L1e:
            r4 = move-exception
            goto L24
        L20:
            r4 = move-exception
            goto L30
        L22:
            r4 = move-exception
            r1 = r0
        L24:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L43
            r1.flush()     // Catch: java.io.IOException -> L43
            r1.close()     // Catch: java.io.IOException -> L43
            goto L43
        L30:
            if (r0 == 0) goto L38
            r0.flush()     // Catch: java.io.IOException -> L38
            r0.close()     // Catch: java.io.IOException -> L38
        L38:
            throw r4
        L39:
            r4 = r0
        L3a:
            if (r0 == 0) goto L42
            r0.flush()     // Catch: java.io.IOException -> L42
            r0.close()     // Catch: java.io.IOException -> L42
        L42:
            r0 = r4
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7949e.m11825b(android.graphics.Bitmap):java.lang.String");
    }

    /* renamed from: a */
    public static byte[] m11823a(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m11824a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return bArr3;
        }
        throw new IllegalArgumentException("访问数据不能为null");
    }

    /* renamed from: a */
    public static Bitmap m11822a(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    /* renamed from: a */
    public static Bitmap m11821a(View view, boolean z10) {
        if (view == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
