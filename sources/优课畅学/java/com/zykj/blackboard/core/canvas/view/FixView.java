package com.zykj.blackboard.core.canvas.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.zykj.blackboard.utils.CanvasUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class FixView extends View implements FixLayer {
    public Map<Integer, View> _$_findViewCache;
    private Bitmap _mBitmap;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9133u.m16133g(context, "context");
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

    @Override // com.zykj.blackboard.core.canvas.view.FixLayer
    public void draw(Bitmap bitmap) {
        AbstractC9133u.m16133g(bitmap, "bitmap");
        this._mBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        Log.i("DrawView", "FixView-> draw()");
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i("DrawView", "FixView -> onDraw s");
        if (canvas == null) {
            return;
        }
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Bitmap mBitmap = getMBitmap();
        if (mBitmap != null) {
            CanvasUtils.INSTANCE.drawLargeBitmap(canvas, mBitmap, new Matrix());
        }
        Log.i("DrawView", "FixView -> onDraw e");
    }

    @Override // com.zykj.blackboard.core.canvas.view.FixLayer
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
    public FixView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9133u.m16133g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9133u.m16133g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
    }

    public /* synthetic */ FixView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
