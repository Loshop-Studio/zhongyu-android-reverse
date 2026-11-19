package p155l4;

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
import p077e5.C7343d;

/* renamed from: l4.b */
/* loaded from: classes4.dex */
public final class C8497b extends View implements InterfaceC8496a {

    /* renamed from: a */
    public Bitmap f14084a;

    /* renamed from: b */
    public final Matrix f14085b;

    /* renamed from: c */
    public final Rect f14086c;

    /* renamed from: d */
    public final RectF f14087d;

    /* renamed from: e */
    public boolean f14088e;

    /* renamed from: f */
    public final Path f14089f;

    /* renamed from: g */
    public final Paint f14090g;

    /* renamed from: h */
    public Map f14091h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8497b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14091h = new LinkedHashMap();
        this.f14085b = new Matrix();
        this.f14086c = new Rect();
        this.f14087d = new RectF();
        this.f14089f = new Path();
        this.f14090g = new Paint();
    }

    @Override // p155l4.InterfaceC8496a
    /* renamed from: a */
    public void mo13963a(Bitmap bitmap, Matrix matrix) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f14089f.reset();
        this.f14084a = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        this.f14088e = false;
        this.f14085b.reset();
        if (matrix != null) {
            this.f14085b.set(new Matrix(matrix));
        }
        Log.i("DrawView", "Active-> drawBitmap()");
        postInvalidateOnAnimation();
    }

    @Override // p155l4.InterfaceC8496a
    /* renamed from: b */
    public void mo13964b(Path path, Paint paint, Matrix matrix) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Path path2 = new Path(path);
        Matrix matrix2 = matrix != null ? new Matrix(matrix) : null;
        this.f14084a = null;
        this.f14088e = false;
        this.f14089f.set(path2);
        if (matrix2 != null) {
            this.f14089f.transform(matrix2);
        }
        this.f14090g.set(paint);
        Log.i("DrawView", "Active-> drawPath()");
        postInvalidateOnAnimation();
    }

    /* renamed from: c */
    public final void m13965c(Bitmap bitmap, Matrix matrix) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f14089f.reset();
        this.f14084a = bitmap;
        this.f14088e = false;
        this.f14085b.reset();
        if (matrix != null) {
            this.f14085b.set(matrix);
        }
        postInvalidateOnAnimation();
    }

    @Override // p155l4.InterfaceC8496a
    public void clear() {
        this.f14089f.reset();
        this.f14084a = null;
        this.f14088e = false;
        Log.i("DrawView", "Active-> clear()");
        postInvalidateOnAnimation();
    }

    /* renamed from: d */
    public final void m13966d(Bitmap bitmap, Rect sourceRect) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(sourceRect, "sourceRect");
        this.f14089f.reset();
        this.f14084a = bitmap;
        this.f14086c.set(sourceRect);
        this.f14087d.set(0.0f, 0.0f, sourceRect.width(), sourceRect.height());
        this.f14088e = true;
        this.f14085b.reset();
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i("DrawView", "Active -> onDraw s");
        if (canvas != null) {
            Bitmap bitmap = this.f14084a;
            if (bitmap != null) {
                if (this.f14088e) {
                    canvas.drawBitmap(bitmap, this.f14086c, this.f14087d, (Paint) null);
                } else {
                    C7343d.f11910a.m11747a(canvas, bitmap, this.f14085b);
                }
            }
            if (!this.f14089f.isEmpty()) {
                canvas.drawPath(this.f14089f, this.f14090g);
            }
        }
        Log.i("DrawView", "Active -> onDraw e");
    }

    public /* synthetic */ C8497b(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
