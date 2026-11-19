package com.zykj.blackboard.core.canvas.view;

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
import com.zykj.blackboard.C7044R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class MaskView extends View implements MaskLayer {
    public Map<Integer, View> _$_findViewCache;
    private Bitmap _mBitmap;
    private final Path clipPath;
    private Paint maskStrokePaint;
    private final Rect tempDstRect;
    private final Rect tempSrcRect;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9133u.m16133g(context, "context");
    }

    private final Bitmap getMBitmap() {
        if (this._mBitmap.isRecycled()) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), C7044R.drawable.pic_mask);
            AbstractC9133u.m16132f(bitmapDecodeResource, "decodeResource(\n        …ic_mask\n                )");
            this._mBitmap = bitmapDecodeResource;
        }
        return this._mBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hide$lambda-3, reason: not valid java name */
    public static final void m27430hide$lambda3(MaskView this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-2, reason: not valid java name */
    public static final void m27431show$lambda2(MaskView this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.setVisibility(0);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.blackboard.core.canvas.view.MaskLayer
    public void changeClipRectF(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "rectF");
        Path path = this.clipPath;
        path.reset();
        path.addRect(rectF, Path.Direction.CCW);
    }

    @Override // com.zykj.blackboard.core.canvas.view.MaskLayer
    public void hide() {
        post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.view.a
            @Override // java.lang.Runnable
            public final void run() {
                MaskView.m27430hide$lambda3(this.f8706a);
            }
        });
        Log.i("DrawView", "MaskView -> onDraw hide");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
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
            } catch (Exception e10) {
                e10.printStackTrace();
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
        post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.view.b
            @Override // java.lang.Runnable
            public final void run() {
                MaskView.m27431show$lambda2(this.f8707a);
            }
        });
        Log.i("DrawView", "MaskView -> onDraw show");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9133u.m16133g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9133u.m16133g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.clipPath = new Path();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), C7044R.drawable.pic_mask);
        AbstractC9133u.m16132f(bitmapDecodeResource, "decodeResource(\n        …R.drawable.pic_mask\n    )");
        this._mBitmap = bitmapDecodeResource;
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

    public /* synthetic */ MaskView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
