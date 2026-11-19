package com.zykj.blackboard.core.canvas.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.utils.CanvasUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010!\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0015¢\u0006\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/view/ActiveView;", "Landroid/view/View;", "Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Matrix;", "matrix", "Ld6/s;", "draw", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V", "drawReference", "Landroid/graphics/Rect;", "sourceRect", "drawRegion", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)V", "Landroid/graphics/Path;", "path", "Landroid/graphics/Paint;", "paint", "(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V", "refresh", "()V", "clear", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "mBitmap", "Landroid/graphics/Bitmap;", "mMatrix", "Landroid/graphics/Matrix;", "mSourceRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "mDestinationRect", "Landroid/graphics/RectF;", "", "hasSourceRect", "Z", "mPath", "Landroid/graphics/Path;", "mPaint", "Landroid/graphics/Paint;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ActiveView extends View implements ActiveLayer {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private boolean hasSourceRect;

    @Nullable
    private Bitmap mBitmap;

    @NotNull
    private final RectF mDestinationRect;

    @NotNull
    private final Matrix mMatrix;

    @NotNull
    private final Paint mPaint;

    @NotNull
    private final Path mPath;

    @NotNull
    private final Rect mSourceRect;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ActiveView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
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

    @Override // com.zykj.blackboard.core.canvas.view.ActiveLayer
    public void clear() {
        this.mPath.reset();
        this.mBitmap = null;
        this.hasSourceRect = false;
        Log.i("DrawView", "Active-> clear()");
        postInvalidateOnAnimation();
    }

    @Override // com.zykj.blackboard.core.canvas.view.ActiveLayer
    public void draw(@NotNull Bitmap bitmap, @Nullable Matrix matrix) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        this.mPath.reset();
        this.mBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        this.hasSourceRect = false;
        this.mMatrix.reset();
        if (matrix != null) {
            this.mMatrix.set(new Matrix(matrix));
        }
        Log.i("DrawView", "Active-> drawBitmap()");
        postInvalidateOnAnimation();
    }

    public final void drawReference(@NotNull Bitmap bitmap, @Nullable Matrix matrix) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        this.mPath.reset();
        this.mBitmap = bitmap;
        this.hasSourceRect = false;
        this.mMatrix.reset();
        if (matrix != null) {
            this.mMatrix.set(matrix);
        }
        postInvalidateOnAnimation();
    }

    public final void drawRegion(@NotNull Bitmap bitmap, @NotNull Rect sourceRect) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        AbstractC5830k.m5330g(sourceRect, "sourceRect");
        this.mPath.reset();
        this.mBitmap = bitmap;
        this.mSourceRect.set(sourceRect);
        this.mDestinationRect.set(0.0f, 0.0f, sourceRect.width(), sourceRect.height());
        this.hasSourceRect = true;
        this.mMatrix.reset();
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        Log.i("DrawView", "Active -> onDraw s");
        if (canvas != null) {
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                if (this.hasSourceRect) {
                    canvas.drawBitmap(bitmap, this.mSourceRect, this.mDestinationRect, (Paint) null);
                } else {
                    CanvasUtils.INSTANCE.drawLargeBitmap(canvas, bitmap, this.mMatrix);
                }
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
    @JvmOverloads
    public ActiveView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ActiveView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.mMatrix = new Matrix();
        this.mSourceRect = new Rect();
        this.mDestinationRect = new RectF();
        this.mPath = new Path();
        this.mPaint = new Paint();
    }

    @Override // com.zykj.blackboard.core.canvas.view.ActiveLayer
    public void draw(@NotNull Path path, @NotNull Paint paint, @Nullable Matrix matrix) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(paint, "paint");
        Path path2 = new Path(path);
        Matrix matrix2 = matrix != null ? new Matrix(matrix) : null;
        this.mBitmap = null;
        this.hasSourceRect = false;
        this.mPath.set(path2);
        if (matrix2 != null) {
            this.mPath.transform(matrix2);
        }
        this.mPaint.set(paint);
        Log.i("DrawView", "Active-> drawPath()");
        postInvalidateOnAnimation();
    }

    public /* synthetic */ ActiveView(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }
}
