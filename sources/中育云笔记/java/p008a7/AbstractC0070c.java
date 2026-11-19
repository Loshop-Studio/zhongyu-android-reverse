package p008a7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.fastjson.asm.Opcodes;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p219k6.AbstractC9820b;
import p235l6.AbstractC10149c;

/* renamed from: a7.c */
/* loaded from: classes5.dex */
public abstract class AbstractC0070c {
    /* renamed from: a */
    public static int m145a(int i10, int i11) {
        if (i10 % 2 == 1) {
            i10++;
        }
        if (i11 % 2 == 1) {
            i11++;
        }
        int iMax = Math.max(i10, i11);
        float fMin = Math.min(i10, i11) / iMax;
        if (fMin > 1.0f || fMin <= 0.5625d) {
            double d10 = fMin;
            if (d10 > 0.5625d || d10 <= 0.5d) {
                return (int) Math.ceil(iMax / (1280.0d / d10));
            }
            int i12 = iMax / 1280;
            if (i12 == 0) {
                return 1;
            }
            return i12;
        }
        if (iMax < 1664) {
            return 1;
        }
        if (iMax < 4990) {
            return 2;
        }
        if (iMax <= 4990 || iMax >= 10240) {
            return iMax / 1280;
        }
        return 4;
    }

    /* renamed from: b */
    public static int[] m146b(int i10, int i11) {
        int i12 = -1;
        if (i10 == 0 && i11 == 0) {
            return new int[]{-1, -1};
        }
        int iM145a = m145a(i10, i11);
        long jM147c = m147c();
        boolean z10 = false;
        int i13 = iM145a;
        int i14 = -1;
        while (!z10) {
            i12 = i10 / i13;
            i14 = i11 / i13;
            if (i12 * i14 * 4 > jM147c) {
                i13 *= 2;
            } else {
                z10 = true;
            }
        }
        return new int[]{i12, i14};
    }

    /* renamed from: c */
    public static long m147c() {
        long j10 = Runtime.getRuntime().totalMemory();
        if (j10 > 104857600) {
            return 104857600L;
        }
        return j10;
    }

    /* renamed from: d */
    public static int m148d(Context context, String str) throws IOException {
        ExifInterface exifInterface;
        InputStream inputStreamM19892a = null;
        try {
            try {
                if (AbstractC10149c.m21174c(str)) {
                    inputStreamM19892a = AbstractC9820b.m19892a(context, Uri.parse(str));
                    exifInterface = new ExifInterface(inputStreamM19892a);
                } else {
                    exifInterface = new ExifInterface(str);
                }
                int attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                if (attributeInt == 3) {
                    AbstractC0076i.m196a(inputStreamM19892a);
                    return Opcodes.GETFIELD;
                }
                if (attributeInt == 6) {
                    AbstractC0076i.m196a(inputStreamM19892a);
                    return 90;
                }
                if (attributeInt != 8) {
                    AbstractC0076i.m196a(inputStreamM19892a);
                    return 0;
                }
                AbstractC0076i.m196a(inputStreamM19892a);
                return 270;
            } catch (Exception e10) {
                e10.printStackTrace();
                AbstractC0076i.m196a(inputStreamM19892a);
                return 0;
            }
        } catch (Throwable th) {
            AbstractC0076i.m196a(inputStreamM19892a);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m149e(android.content.Context r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008a7.AbstractC0070c.m149e(android.content.Context, java.lang.String):void");
    }

    /* renamed from: f */
    public static Bitmap m150f(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: g */
    public static void m151g(Bitmap bitmap, FileOutputStream fileOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.flush();
            fileOutputStream.close();
            AbstractC0076i.m196a(fileOutputStream);
            AbstractC0076i.m196a(byteArrayOutputStream);
        } catch (Exception e11) {
            e = e11;
            byteArrayOutputStream2 = byteArrayOutputStream;
            e.printStackTrace();
            AbstractC0076i.m196a(fileOutputStream);
            AbstractC0076i.m196a(byteArrayOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            AbstractC0076i.m196a(fileOutputStream);
            AbstractC0076i.m196a(byteArrayOutputStream2);
            throw th;
        }
    }
}
