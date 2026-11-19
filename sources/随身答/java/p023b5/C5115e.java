package p023b5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.blankj.utilcode.util.LogUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p263u5.C9686e;

/* renamed from: b5.e */
/* loaded from: classes4.dex */
public final class C5115e extends View implements InterfaceC5114d {

    /* renamed from: a */
    public Bitmap f2230a;

    /* renamed from: b */
    public final Object f2231b;

    /* renamed from: c */
    public Map f2232c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5115e(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2232c = new LinkedHashMap();
        this.f2231b = new Object();
    }

    private final Bitmap getMBitmap() {
        Bitmap bitmap = this.f2230a;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return this.f2230a;
    }

    @Override // p023b5.InterfaceC5114d
    /* renamed from: a */
    public void mo2174a(Bitmap bitmap) {
        String message;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            LogUtils.m2955e("页面FixView.kt -> draw(): 传入的源位图已回收，放弃拷贝");
            return;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapM2176c = null;
        try {
            bitmapM2176c = bitmap.copy(config, false);
        } catch (IllegalArgumentException e10) {
            if (Build.VERSION.SDK_INT < 26 || (message = e10.getMessage()) == null || !StringsKt.contains((CharSequence) message, (CharSequence) "color space", true)) {
                LogUtils.m2955e("页面FixView.kt -> draw() 发生不可控异常: " + e10.getMessage());
            } else {
                LogUtils.m2955e("页面FixView.kt -> Bitmap copy 缺失 ColorSpace，执行安全回退拷贝");
                bitmapM2176c = m2176c(bitmap, config, false);
            }
        } catch (Exception e11) {
            LogUtils.m2955e("页面FixView.kt -> draw() 发生未知异常: " + e11.getMessage());
        }
        if (bitmapM2176c != null) {
            synchronized (this.f2231b) {
                try {
                    Bitmap bitmap2 = this.f2230a;
                    this.f2230a = bitmapM2176c;
                    if (bitmap2 != null && !Intrinsics.areEqual(bitmap2, bitmapM2176c) && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LogUtils.m2954d("页面FixView.kt -> draw() 拷贝并替换完成");
            postInvalidateOnAnimation();
        }
    }

    @Override // p023b5.InterfaceC5114d
    /* renamed from: b */
    public Rect mo2175b() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    /* renamed from: c */
    public final Bitmap m2176c(Bitmap bitmap, Bitmap.Config config, boolean z9) {
        Bitmap bitmapCreateBitmap;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config, true, ColorSpace.get(ColorSpace.Named.SRGB));
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(source.widt…ight, config, true, srgb)");
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(source.width, source.height, config)");
            }
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(config, z9);
            bitmapCreateBitmap.recycle();
            return bitmapCopy;
        } catch (Exception e10) {
            LogUtils.m2955e("页面FixView.kt -> fallbackSafeCopy 失败: " + e10.getMessage());
            return null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Unit unit;
        super.onDraw(canvas);
        LogUtils.m2956i("FixView.kt -> onDraw,FixView -> onDraw s");
        if (canvas == null) {
            return;
        }
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        synchronized (this.f2231b) {
            try {
                Bitmap mBitmap = getMBitmap();
                if (mBitmap != null) {
                    C9686e.f17123a.m16168a(canvas, mBitmap, new Matrix());
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    LogUtils.m2955e("FixView.kt ->onDraw, onDraw: bitmap 为空或已回收");
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        LogUtils.m2956i("FixView.kt -> onDraw, FixView -> onDraw e");
    }

    @Override // p023b5.InterfaceC5114d
    public void reset() {
        this.f2230a = null;
        postInvalidateOnAnimation();
    }

    public /* synthetic */ C5115e(Context context, AttributeSet attributeSet, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i9);
    }
}
