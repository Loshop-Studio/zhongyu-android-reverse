package com.zykj.blackboard.core.canvas.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.C4228R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/view/MaskView;", "Landroid/view/View;", "Lcom/zykj/blackboard/core/canvas/view/MaskLayer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ld6/s;", "refresh", "()V", "Landroid/graphics/RectF;", "rectF", "changeClipRectF", "(Landroid/graphics/RectF;)V", "show", "hide", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/Path;", "Landroid/graphics/Bitmap;", "_mBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/Rect;", "tempSrcRect", "Landroid/graphics/Rect;", "tempDstRect", "Landroid/graphics/Paint;", "maskStrokePaint", "Landroid/graphics/Paint;", "getMBitmap", "()Landroid/graphics/Bitmap;", "mBitmap", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MaskView extends View implements MaskLayer {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @SuppressLint({"UseKtx"})
    @NotNull
    private Bitmap _mBitmap;

    @NotNull
    private final Path clipPath;

    @NotNull
    private Paint maskStrokePaint;

    @NotNull
    private final Rect tempDstRect;

    @NotNull
    private final Rect tempSrcRect;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MaskView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
    }

    private final Bitmap getMBitmap() {
        if (this._mBitmap.isRecycled()) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), C4228R.drawable.pic_mask);
            AbstractC5830k.m5329f(bitmapDecodeResource, "decodeResource(\n        …ic_mask\n                )");
            this._mBitmap = bitmapDecodeResource;
        }
        return this._mBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hide$lambda-5, reason: not valid java name */
    public static final void m13759hide$lambda5(MaskView this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        this$0.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-4, reason: not valid java name */
    public static final void m13760show$lambda4(MaskView this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        this$0.setVisibility(0);
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

    @Override // com.zykj.blackboard.core.canvas.view.MaskLayer
    public void changeClipRectF(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "rectF");
        Path path = this.clipPath;
        path.reset();
        path.addRect(rectF, Path.Direction.CCW);
    }

    @Override // com.zykj.blackboard.core.canvas.view.MaskLayer
    public void hide() {
        post(new RunnableC4258a(this, 0));
        Log.i("DrawView", "MaskView -> onDraw hide");
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        super.onDraw(canvas);
        Log.i("DrawView", "MaskView -> onDraw s");
        int iSave = canvas.save();
        canvas.clipPath(this.clipPath, Region.Op.DIFFERENCE);
        try {
            try {
                Bitmap mBitmap = getMBitmap();
                this.tempSrcRect.set(0, 0, mBitmap.getWidth(), mBitmap.getHeight());
                this.tempDstRect.set(0, 0, getWidth(), getHeight());
                canvas.drawBitmap(mBitmap, this.tempSrcRect, this.tempDstRect, (Paint) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            canvas.drawPath(this.clipPath, this.maskStrokePaint);
            Log.i("DrawView", "MaskView -> onDraw e");
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.view.MaskLayer
    public void refresh() {
        Log.i("DrawView", "MaskView -> onDraw refresh");
        postInvalidate();
    }

    @Override // com.zykj.blackboard.core.canvas.view.MaskLayer
    public void show() {
        post(new RunnableC4258a(this, 1));
        Log.i("DrawView", "MaskView -> onDraw show");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MaskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MaskView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        Object objM13956constructorimpl;
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.clipPath = new Path();
        try {
            objM13956constructorimpl = Result.m13956constructorimpl(BitmapFactory.decodeResource(context.getResources(), C4228R.drawable.pic_mask));
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        Bitmap bitmapCreateBitmap = (Bitmap) (Result.m13961isFailureimpl(objM13956constructorimpl) ? null : objM13956constructorimpl);
        if (bitmapCreateBitmap == null) {
            AbstractC3387g.m2339b("页面MaskView.kt=>MaskBitmap", "decode pic_mask failed, use fallback");
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            AbstractC5830k.m5329f(bitmapCreateBitmap, "run {\n        LogUtils.e…p.Config.ARGB_8888)\n    }");
        }
        this._mBitmap = bitmapCreateBitmap;
        this.tempSrcRect = new Rect();
        this.tempDstRect = new Rect();
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#979797"));
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.maskStrokePaint = paint;
    }

    public /* synthetic */ MaskView(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }
}
