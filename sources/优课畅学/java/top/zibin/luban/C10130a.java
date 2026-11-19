package top.zibin.luban;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import ga.InterfaceC8691b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: top.zibin.luban.a */
/* loaded from: classes5.dex */
public class C10130a {

    /* renamed from: a */
    public InterfaceC8691b f20218a;

    /* renamed from: b */
    public File f20219b;

    /* renamed from: c */
    public int f20220c;

    /* renamed from: d */
    public int f20221d;

    /* renamed from: e */
    public boolean f20222e;

    public C10130a(InterfaceC8691b interfaceC8691b, File file, boolean z10) {
        this.f20219b = file;
        this.f20218a = interfaceC8691b;
        this.f20222e = z10;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        BitmapFactory.decodeStream(interfaceC8691b.open(), null, options);
        this.f20220c = options.outWidth;
        this.f20221d = options.outHeight;
    }

    /* renamed from: a */
    public File m18927a() throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = m18928b();
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f20218a.open(), null, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Checker checker = Checker.SINGLE;
        if (checker.m18922d(this.f20218a.open())) {
            bitmapDecodeStream = m18929c(bitmapDecodeStream, checker.m18920b(this.f20218a.open()));
        }
        bitmapDecodeStream.compress(this.f20222e ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 60, byteArrayOutputStream);
        bitmapDecodeStream.recycle();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f20219b);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
        byteArrayOutputStream.close();
        return this.f20219b;
    }

    /* renamed from: b */
    public final int m18928b() {
        int i10 = this.f20220c;
        if (i10 % 2 == 1) {
            i10++;
        }
        this.f20220c = i10;
        int i11 = this.f20221d;
        if (i11 % 2 == 1) {
            i11++;
        }
        this.f20221d = i11;
        int iMax = Math.max(i10, i11);
        float fMin = Math.min(this.f20220c, this.f20221d) / iMax;
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
        if (iMax > 4990 && iMax < 10240) {
            return 4;
        }
        int i13 = iMax / 1280;
        if (i13 == 0) {
            return 1;
        }
        return i13;
    }

    /* renamed from: c */
    public final Bitmap m18929c(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
