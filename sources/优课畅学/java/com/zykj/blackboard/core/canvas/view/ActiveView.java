package com.zykj.blackboard.core.canvas.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.zykj.blackboard.utils.CanvasUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class ActiveView extends View implements ActiveLayer {
    public Map<Integer, View> _$_findViewCache;
    private Bitmap mBitmap;
    private final Matrix mMatrix;
    private final Paint mPaint;
    private final Path mPath;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActiveView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9133u.m16133g(context, "context");
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

    @Override // com.zykj.blackboard.core.canvas.view.ActiveLayer
    public void clear() {
        this.mPath.reset();
        this.mBitmap = null;
        Log.i("DrawView", "Active-> clear()");
        postInvalidateOnAnimation();
    }

    @Override // com.zykj.blackboard.core.canvas.view.ActiveLayer
    public void draw(Bitmap bitmap, Matrix matrix) {
        AbstractC9133u.m16133g(bitmap, "bitmap");
        this.mPath.reset();
        this.mBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        this.mMatrix.reset();
        if (matrix != null) {
            this.mMatrix.set(new Matrix(matrix));
        }
        Log.i("DrawView", "Active-> drawBitmap()");
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i("DrawView", "Active -> onDraw s");
        if (canvas != null) {
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                CanvasUtils.INSTANCE.drawLargeBitmap(canvas, bitmap, this.mMatrix);
            }
            if (!this.mPath.isEmpty()) {
                canvas.drawPath(this.mPath, this.mPaint);
            }
        }
        Log.i("DrawView", "Active -> onDraw e");
    }

    @Override // com.zykj.blackboard.core.canvas.view.ActiveLayer
    public void refresh() {
        Log.i("DrawView", "Active-> refresh()");
        postInvalidateOnAnimation();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9133u.m16133g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9133u.m16133g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.mMatrix = new Matrix();
        this.mPath = new Path();
        this.mPaint = new Paint();
    }

    public /* synthetic */ ActiveView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // com.zykj.blackboard.core.canvas.view.ActiveLayer
    public void draw(Path path, Paint paint, Matrix matrix) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(paint, "paint");
        Path path2 = new Path(path);
        Matrix matrix2 = matrix != null ? new Matrix(matrix) : null;
        this.mBitmap = null;
        this.mPath.set(path2);
        if (matrix2 != null) {
            this.mPath.transform(matrix2);
        }
        this.mPaint.set(paint);
        Log.i("DrawView", "Active-> drawPath()");
        postInvalidateOnAnimation();
    }
}
