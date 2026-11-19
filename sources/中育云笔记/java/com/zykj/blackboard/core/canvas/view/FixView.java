package com.zykj.blackboard.core.canvas.view;

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
import com.zykj.blackboard.core.canvas.view.FixView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10342e;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p390w9.InterfaceC11714c;

/* loaded from: classes5.dex */
public final class FixView extends View implements InterfaceC11714c {

    /* renamed from: c */
    public Bitmap f18003c;

    /* renamed from: d */
    public final Object f18004d;

    /* renamed from: e */
    public Map f18005e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9979u.m20294g(context, "context");
    }

    /* renamed from: d */
    public static final void m13966d(FixView this$0, Bitmap old) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(old, "$old");
        synchronized (this$0.f18004d) {
            try {
                if (!old.isRecycled() && !AbstractC9979u.m20289b(old, this$0.f18003c)) {
                    old.recycle();
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final Bitmap getMBitmap() {
        Bitmap bitmap = this.f18003c;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return this.f18003c;
    }

    @Override // p390w9.InterfaceC11714c
    /* renamed from: a */
    public void mo13967a(Bitmap bitmap) {
        Bitmap bitmapM13969e;
        String message;
        AbstractC9979u.m20294g(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            LogUtils.m3887e("页面 FixView.kt -> draw，传入源位图已回收，放弃拷贝");
            return;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        final Bitmap bitmap2 = null;
        try {
            bitmapM13969e = bitmap.copy(config, false);
        } catch (IllegalArgumentException e10) {
            if (Build.VERSION.SDK_INT < 26 || (message = e10.getMessage()) == null || !AbstractC10793c0.m23104S(message, "color space", true)) {
                LogUtils.m3887e("页面 FixView.kt -> draw，发生不可控异常，异常=" + e10.getMessage());
                bitmapM13969e = null;
            } else {
                LogUtils.m3887e("页面 FixView.kt -> draw，Bitmap 拷贝缺失 ColorSpace，执行安全回退拷贝");
                bitmapM13969e = m13969e(bitmap, config, false);
            }
        } catch (Exception e11) {
            LogUtils.m3887e("页面 FixView.kt -> draw，发生未知异常，异常=" + e11.getMessage());
            bitmapM13969e = null;
        }
        if (bitmapM13969e != null) {
            synchronized (this.f18004d) {
                try {
                    if (!AbstractC9979u.m20289b(this.f18003c, bitmapM13969e)) {
                        bitmap2 = this.f18003c;
                        this.f18003c = bitmapM13969e;
                    }
                    C10786q c10786q = C10786q.f26013a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            postInvalidateOnAnimation();
            if (bitmap2 != null) {
                postDelayed(new Runnable() { // from class: w9.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        FixView.m13966d(this.f27874c, bitmap2);
                    }
                }, 100L);
            }
        }
    }

    @Override // p390w9.InterfaceC11714c
    /* renamed from: b */
    public Rect mo13968b() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    /* renamed from: e */
    public final Bitmap m13969e(Bitmap bitmap, Bitmap.Config config, boolean z10) {
        Bitmap bitmapCreateBitmap;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config, true, ColorSpace.get(ColorSpace.Named.SRGB));
                AbstractC9979u.m20293f(bitmapCreateBitmap, "createBitmap(source.widt…ight, config, true, srgb)");
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
                AbstractC9979u.m20293f(bitmapCreateBitmap, "createBitmap(source.width, source.height, config)");
            }
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(config, z10);
            bitmapCreateBitmap.recycle();
            return bitmapCopy;
        } catch (Exception e10) {
            LogUtils.m3887e("页面 FixView.kt -> fallbackSafeCopy，执行失败，异常=" + e10.getMessage());
            return null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        synchronized (this.f18004d) {
            Bitmap mBitmap = getMBitmap();
            if (mBitmap != null) {
                C10342e.f24648a.m21630a(canvas, mBitmap, new Matrix());
                C10786q c10786q = C10786q.f26013a;
            }
        }
    }

    @Override // p390w9.InterfaceC11714c
    public void reset() {
        this.f18003c = null;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9979u.m20294g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9979u.m20294g(context, "context");
        this.f18005e = new LinkedHashMap();
        this.f18004d = new Object();
    }

    public /* synthetic */ FixView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
