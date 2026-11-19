package com.zykj.blackboard.core.canvas.view;

import android.annotation.SuppressLint;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.utils.CanvasUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;

@Metadata(m5109d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0015¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/view/FixView;", "Landroid/view/View;", "Lcom/zykj/blackboard/core/canvas/view/FixLayer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Bitmap;", "source", "Landroid/graphics/Bitmap$Config;", "config", "", "isMutable", "fallbackSafeCopy", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;", "bitmap", "Ld6/s;", "draw", "(Landroid/graphics/Bitmap;)V", "refresh", "()V", "reset", "Landroid/graphics/Rect;", "rect", "()Landroid/graphics/Rect;", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "_mBitmap", "Landroid/graphics/Bitmap;", "", "bitmapLock", "Ljava/lang/Object;", "getMBitmap", "()Landroid/graphics/Bitmap;", "mBitmap", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class FixView extends View implements FixLayer {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private Bitmap _mBitmap;

    @NotNull
    private final Object bitmapLock;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
    }

    private final Bitmap fallbackSafeCopy(Bitmap source, Bitmap.Config config, boolean isMutable) {
        Bitmap bitmapCreateBitmap;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                bitmapCreateBitmap = Bitmap.createBitmap(source.getWidth(), source.getHeight(), config, true, ColorSpace.get(ColorSpace.Named.SRGB));
                AbstractC5830k.m5329f(bitmapCreateBitmap, "createBitmap(source.widt…ight, config, true, srgb)");
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(source.getWidth(), source.getHeight(), config);
                AbstractC5830k.m5329f(bitmapCreateBitmap, "createBitmap(source.width, source.height, config)");
            }
            new Canvas(bitmapCreateBitmap).drawBitmap(source, 0.0f, 0.0f, (Paint) null);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(config, isMutable);
            bitmapCreateBitmap.recycle();
            return bitmapCopy;
        } catch (Exception e) {
            AbstractC3387g.m2339b("页面FixView.kt -> fallbackSafeCopy 失败: " + e.getMessage());
            return null;
        }
    }

    private final Bitmap getMBitmap() {
        Bitmap bitmap = this._mBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return this._mBitmap;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.blackboard.core.canvas.view.FixLayer
    public void draw(@NotNull Bitmap bitmap) {
        String message;
        AbstractC5830k.m5330g(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            AbstractC3387g.m2339b("页面FixView.kt -> draw(): 传入的源位图已回收，放弃拷贝");
            return;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapFallbackSafeCopy = null;
        try {
            bitmapFallbackSafeCopy = bitmap.copy(config, false);
        } catch (IllegalArgumentException e) {
            if (Build.VERSION.SDK_INT < 26 || (message = e.getMessage()) == null || !AbstractC5855p.m5372F(message, "color space", true)) {
                AbstractC3387g.m2339b("页面FixView.kt -> draw() 发生不可控异常: " + e.getMessage());
            } else {
                AbstractC3387g.m2339b("页面FixView.kt -> Bitmap copy 缺失 ColorSpace，执行安全回退拷贝");
                bitmapFallbackSafeCopy = fallbackSafeCopy(bitmap, config, false);
            }
        } catch (Exception e4) {
            AbstractC3387g.m2339b("页面FixView.kt -> draw() 发生未知异常: " + e4.getMessage());
        }
        if (bitmapFallbackSafeCopy != null) {
            synchronized (this.bitmapLock) {
                Bitmap bitmap2 = this._mBitmap;
                this._mBitmap = bitmapFallbackSafeCopy;
                if (bitmap2 != null && !bitmap2.equals(bitmapFallbackSafeCopy) && !bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
            }
            AbstractC3387g.m2338a("页面FixView.kt -> draw() 拷贝并替换完成");
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@Nullable Canvas canvas) {
        C5443s c5443s;
        super.onDraw(canvas);
        AbstractC3387g.m2342e("FixView.kt -> onDraw,FixView -> onDraw s");
        if (canvas == null) {
            return;
        }
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        synchronized (this.bitmapLock) {
            try {
                Bitmap mBitmap = getMBitmap();
                if (mBitmap != null) {
                    CanvasUtils.INSTANCE.drawLargeBitmap(canvas, mBitmap, new Matrix());
                    c5443s = C5443s.f8405a;
                } else {
                    c5443s = null;
                }
                if (c5443s == null) {
                    AbstractC3387g.m2339b("FixView.kt ->onDraw, onDraw: bitmap 为空或已回收");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC3387g.m2342e("FixView.kt -> onDraw, FixView -> onDraw e");
    }

    @Override // com.zykj.blackboard.core.canvas.view.FixLayer
    @NotNull
    public Rect rect() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    @Override // com.zykj.blackboard.core.canvas.view.FixLayer
    public void refresh() {
        postInvalidateOnAnimation();
    }

    @Override // com.zykj.blackboard.core.canvas.view.FixLayer
    public void reset() {
        this._mBitmap = null;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.bitmapLock = new Object();
    }

    public /* synthetic */ FixView(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }
}
