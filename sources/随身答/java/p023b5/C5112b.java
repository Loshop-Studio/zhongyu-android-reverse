package p023b5;

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
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p263u5.C9686e;

/* renamed from: b5.b */
/* loaded from: classes4.dex */
public final class C5112b extends View implements InterfaceC5111a {

    /* renamed from: a */
    public Bitmap f2222a;

    /* renamed from: b */
    public final Matrix f2223b;

    /* renamed from: c */
    public final Rect f2224c;

    /* renamed from: d */
    public final RectF f2225d;

    /* renamed from: e */
    public boolean f2226e;

    /* renamed from: f */
    public final Path f2227f;

    /* renamed from: g */
    public final Paint f2228g;

    /* renamed from: h */
    public Map f2229h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5112b(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2229h = new LinkedHashMap();
        this.f2223b = new Matrix();
        this.f2224c = new Rect();
        this.f2225d = new RectF();
        this.f2227f = new Path();
        this.f2228g = new Paint();
    }

    @Override // p023b5.InterfaceC5111a
    /* renamed from: a */
    public void mo2169a(Bitmap bitmap, Matrix matrix) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f2227f.reset();
        this.f2222a = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        this.f2226e = false;
        this.f2223b.reset();
        if (matrix != null) {
            this.f2223b.set(new Matrix(matrix));
        }
        Log.i("DrawView", "Active-> drawBitmap()");
        postInvalidateOnAnimation();
    }

    @Override // p023b5.InterfaceC5111a
    /* renamed from: b */
    public void mo2170b(Path path, Paint paint, Matrix matrix) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Path path2 = new Path(path);
        Matrix matrix2 = matrix != null ? new Matrix(matrix) : null;
        this.f2222a = null;
        this.f2226e = false;
        this.f2227f.set(path2);
        if (matrix2 != null) {
            this.f2227f.transform(matrix2);
        }
        this.f2228g.set(paint);
        Log.i("DrawView", "Active-> drawPath()");
        postInvalidateOnAnimation();
    }

    /* renamed from: c */
    public final void m2171c(Bitmap bitmap, Matrix matrix) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f2227f.reset();
        this.f2222a = bitmap;
        this.f2226e = false;
        this.f2223b.reset();
        if (matrix != null) {
            this.f2223b.set(matrix);
        }
        postInvalidateOnAnimation();
    }

    @Override // p023b5.InterfaceC5111a
    public void clear() {
        this.f2227f.reset();
        this.f2222a = null;
        this.f2226e = false;
        Log.i("DrawView", "Active-> clear()");
        postInvalidateOnAnimation();
    }

    /* renamed from: d */
    public final void m2172d(Bitmap bitmap, Rect sourceRect) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(sourceRect, "sourceRect");
        this.f2227f.reset();
        this.f2222a = bitmap;
        this.f2224c.set(sourceRect);
        this.f2225d.set(0.0f, 0.0f, sourceRect.width(), sourceRect.height());
        this.f2226e = true;
        this.f2223b.reset();
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i("DrawView", "Active -> onDraw s");
        if (canvas != null) {
            Bitmap bitmap = this.f2222a;
            if (bitmap != null) {
                if (this.f2226e) {
                    canvas.drawBitmap(bitmap, this.f2224c, this.f2225d, (Paint) null);
                } else {
                    C9686e.f17123a.m16168a(canvas, bitmap, this.f2223b);
                }
            }
            if (!this.f2227f.isEmpty()) {
                canvas.drawPath(this.f2227f, this.f2228g);
            }
        }
        Log.i("DrawView", "Active -> onDraw e");
    }

    public /* synthetic */ C5112b(Context context, AttributeSet attributeSet, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i9);
    }
}
