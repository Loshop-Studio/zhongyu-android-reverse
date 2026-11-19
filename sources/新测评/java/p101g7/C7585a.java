package p101g7;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableKt;
import com.blankj.utilcode.util.Utils;
import com.zykj.evaluation.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: g7.a */
/* loaded from: classes4.dex */
public final class C7585a {

    /* renamed from: a */
    public static final C7585a f12711a = new C7585a();

    /* renamed from: b */
    public static int f12712b = 60;

    /* renamed from: c */
    public static final int f12713c = 8;

    /* renamed from: b */
    public static /* synthetic */ Bitmap m12439b(C7585a c7585a, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 1600;
        }
        if ((i12 & 2) != 0) {
            i11 = 220;
        }
        return c7585a.m12442a(i10, i11);
    }

    /* renamed from: d */
    public static /* synthetic */ Bitmap m12440d(C7585a c7585a, Bitmap bitmap, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 245;
        }
        return c7585a.m12443c(bitmap, i10);
    }

    /* renamed from: j */
    public static /* synthetic */ Bitmap m12441j(C7585a c7585a, Bitmap bitmap, String str, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return c7585a.m12448i(bitmap, str, z9, z10);
    }

    /* renamed from: a */
    public final Bitmap m12442a(int i10, int i11) throws Resources.NotFoundException {
        Bitmap bitmap$default;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        Drawable drawable = ResourcesCompat.getDrawable(Utils.getApp().getResources(), R.drawable.pic_no_answer, null);
        if (drawable != null && (bitmap$default = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null)) != null) {
            float f10 = i10;
            float f11 = 0.5f * f10;
            float height = (bitmap$default.getHeight() * f11) / bitmap$default.getWidth();
            float f12 = 2;
            float f13 = (f10 - f11) / f12;
            float f14 = (i11 - height) / f12;
            canvas.drawBitmap(bitmap$default, new Rect(0, 0, bitmap$default.getWidth(), bitmap$default.getHeight()), new RectF(f13, f14, f11 + f13, height + f14), (Paint) null);
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: c */
    public final Bitmap m12443c(Bitmap sourceBitmap, int i10) {
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        Bitmap bitmapCopy = sourceBitmap.copy(Bitmap.Config.ARGB_8888, true);
        int[] iArr = new int[bitmapCopy.getWidth() * bitmapCopy.getHeight()];
        bitmapCopy.getPixels(iArr, 0, bitmapCopy.getWidth(), 0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
        Iterator<Integer> it = ArraysKt.getIndices(iArr).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            int i11 = iArr[iNextInt];
            if (Color.alpha(i11) != 0 && Color.red(i11) >= i10 && Color.green(i11) >= i10 && Color.blue(i11) >= i10) {
                iArr[iNextInt] = Color.argb(0, Color.red(i11), Color.green(i11), Color.blue(i11));
            }
        }
        bitmapCopy.setPixels(iArr, 0, bitmapCopy.getWidth(), 0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
        Intrinsics.checkNotNull(bitmapCopy);
        return bitmapCopy;
    }

    /* renamed from: e */
    public final Bitmap m12444e(Bitmap... bitmapArray) {
        Intrinsics.checkNotNullParameter(bitmapArray, "bitmapArray");
        int length = bitmapArray.length;
        int i10 = 1;
        int i11 = 0;
        int height = 0;
        while (i11 < length) {
            Bitmap bitmap = bitmapArray[i11];
            int iMax = Integer.max(i10, bitmap.getWidth());
            height = ((height * iMax) / i10) + ((bitmap.getHeight() * iMax) / bitmap.getWidth());
            i11++;
            i10 = iMax;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, height, Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int length2 = bitmapArray.length;
        int i12 = 0;
        float f10 = 0.0f;
        while (i12 < length2) {
            Bitmap bitmap2 = bitmapArray[i12];
            float f11 = i10;
            float height2 = ((bitmap2.getHeight() * f11) / bitmap2.getWidth()) + f10;
            canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new RectF(0.0f, f10, f11, height2), (Paint) null);
            bitmap2.recycle();
            i12++;
            f10 = height2;
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: f */
    public final Bitmap m12445f(String... pathArray) {
        Intrinsics.checkNotNullParameter(pathArray, "pathArray");
        ArrayList arrayList = new ArrayList(pathArray.length);
        for (String str : pathArray) {
            arrayList.add(BitmapFactory.decodeFile(str));
        }
        C7585a c7585a = f12711a;
        Bitmap[] bitmapArr = (Bitmap[]) arrayList.toArray(new Bitmap[0]);
        return c7585a.m12444e((Bitmap[]) Arrays.copyOf(bitmapArr, bitmapArr.length));
    }

    /* renamed from: g */
    public final Bitmap m12446g(int i10, Bitmap... bitmapArray) {
        Intrinsics.checkNotNullParameter(bitmapArray, "bitmapArray");
        float f10 = 0.0f;
        float height = 0.0f;
        for (Bitmap bitmap : bitmapArray) {
            height += bitmap.getWidth() < i10 ? r5.getHeight() : (r5.getHeight() * i10) / r5.getWidth();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, (int) height, Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        int length = bitmapArray.length;
        int i11 = 0;
        while (i11 < length) {
            Bitmap bitmap2 = bitmapArray[i11];
            Rect rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
            float height2 = bitmap2.getWidth() < i10 ? bitmap2.getHeight() : (bitmap2.getHeight() * i10) / bitmap2.getWidth();
            float width = bitmap2.getWidth() < i10 ? bitmap2.getWidth() : i10;
            float f11 = (i10 - width) / 2;
            float f12 = height2 + f10;
            canvas.drawBitmap(bitmap2, rect, new RectF(f11, f10, width + f11, f12), (Paint) null);
            bitmap2.recycle();
            i11++;
            f10 = f12;
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: h */
    public final Bitmap m12447h(int i10, Bitmap... bitmapArray) {
        Intrinsics.checkNotNullParameter(bitmapArray, "bitmapArray");
        int iMax = 0;
        for (Bitmap bitmap : bitmapArray) {
            iMax = Integer.max(iMax, ((bitmap.getHeight() * 2200) / bitmap.getWidth()) + 1);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        for (Bitmap bitmap2 : bitmapArray) {
            canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new Rect(0, 0, bitmapCreateBitmap.getWidth(), (bitmap2.getHeight() * bitmapCreateBitmap.getWidth()) / bitmap2.getWidth()), (Paint) null);
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: i */
    public final Bitmap m12448i(Bitmap sourceBitmap, String resultPath, boolean z9, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        Intrinsics.checkNotNullParameter(resultPath, "resultPath");
        try {
            int width = sourceBitmap.getWidth();
            int height = sourceBitmap.getHeight();
            float fMin = Math.min(width, 1600) / width;
            Matrix matrix = new Matrix();
            matrix.setScale(fMin, fMin);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sourceBitmap, 0, 0, width, height, matrix, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            File file = new File(resultPath);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                File parentFile2 = file.getParentFile();
                Intrinsics.checkNotNull(parentFile2);
                parentFile2.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmapCreateBitmap.compress(StringsKt.endsWith$default(resultPath, "png", false, 2, (Object) null) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.WEBP, f12712b, fileOutputStream);
            fileOutputStream.close();
            if (z9) {
                sourceBitmap.recycle();
            }
            if (z10) {
                bitmapCreateBitmap.recycle();
            }
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: k */
    public final void m12449k(int i10) {
        f12712b = i10;
    }
}
