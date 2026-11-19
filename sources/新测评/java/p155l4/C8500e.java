package p155l4;

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
import p077e5.C7343d;

/* renamed from: l4.e */
/* loaded from: classes4.dex */
public final class C8500e extends View implements InterfaceC8499d {

    /* renamed from: a */
    public Bitmap f14092a;

    /* renamed from: b */
    public final Object f14093b;

    /* renamed from: c */
    public Map f14094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8500e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14094c = new LinkedHashMap();
        this.f14093b = new Object();
    }

    private final Bitmap getMBitmap() {
        Bitmap bitmap = this.f14092a;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return this.f14092a;
    }

    @Override // p155l4.InterfaceC8499d
    /* renamed from: a */
    public void mo13967a(Bitmap bitmap) {
        String message;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            LogUtils.m3238e("页面FixView.kt -> draw(): 传入的源位图已回收，放弃拷贝");
            return;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapM13969c = null;
        try {
            bitmapM13969c = bitmap.copy(config, false);
        } catch (IllegalArgumentException e10) {
            if (Build.VERSION.SDK_INT < 26 || (message = e10.getMessage()) == null || !StringsKt.contains((CharSequence) message, (CharSequence) "color space", true)) {
                LogUtils.m3238e("页面FixView.kt -> draw() 发生不可控异常: " + e10.getMessage());
            } else {
                LogUtils.m3238e("页面FixView.kt -> Bitmap copy 缺失 ColorSpace，执行安全回退拷贝");
                bitmapM13969c = m13969c(bitmap, config, false);
            }
        } catch (Exception e11) {
            LogUtils.m3238e("页面FixView.kt -> draw() 发生未知异常: " + e11.getMessage());
        }
        if (bitmapM13969c != null) {
            synchronized (this.f14093b) {
                try {
                    Bitmap bitmap2 = this.f14092a;
                    this.f14092a = bitmapM13969c;
                    if (bitmap2 != null && !Intrinsics.areEqual(bitmap2, bitmapM13969c) && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LogUtils.m3237d("页面FixView.kt -> draw() 拷贝并替换完成");
            postInvalidateOnAnimation();
        }
    }

    @Override // p155l4.InterfaceC8499d
    /* renamed from: b */
    public Rect mo13968b() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    /* renamed from: c */
    public final Bitmap m13969c(Bitmap bitmap, Bitmap.Config config, boolean z9) {
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
            LogUtils.m3238e("页面FixView.kt -> fallbackSafeCopy 失败: " + e10.getMessage());
            return null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Unit unit;
        super.onDraw(canvas);
        LogUtils.m3239i("FixView.kt -> onDraw,FixView -> onDraw s");
        if (canvas == null) {
            return;
        }
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        synchronized (this.f14093b) {
            try {
                Bitmap mBitmap = getMBitmap();
                if (mBitmap != null) {
                    C7343d.f11910a.m11747a(canvas, mBitmap, new Matrix());
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    LogUtils.m3238e("FixView.kt ->onDraw, onDraw: bitmap 为空或已回收");
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        LogUtils.m3239i("FixView.kt -> onDraw, FixView -> onDraw e");
    }

    @Override // p155l4.InterfaceC8499d
    public void reset() {
        this.f14092a = null;
        postInvalidateOnAnimation();
    }

    public /* synthetic */ C8500e(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
