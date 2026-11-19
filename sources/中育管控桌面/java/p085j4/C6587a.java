package p085j4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: j4.a */
/* loaded from: classes4.dex */
public final class C6587a extends View {

    /* renamed from: o */
    public static final a f8561o = new a(null);

    /* renamed from: p */
    public static final int f8562p = 8;

    /* renamed from: a */
    public final String f8563a;

    /* renamed from: b */
    public Bitmap f8564b;

    /* renamed from: c */
    public Rect f8565c;

    /* renamed from: d */
    public Rect f8566d;

    /* renamed from: e */
    public final Paint f8567e;

    /* renamed from: f */
    public final Paint f8568f;

    /* renamed from: g */
    public final Paint f8569g;

    /* renamed from: h */
    public final float f8570h;

    /* renamed from: i */
    public float f8571i;

    /* renamed from: j */
    public float f8572j;

    /* renamed from: k */
    public int f8573k;

    /* renamed from: l */
    public final float f8574l;

    /* renamed from: m */
    public final int f8575m;

    /* renamed from: n */
    public Function1 f8576n;

    /* renamed from: j4.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C6587a(Context context, AttributeSet attributeSet, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, (i7 & 4) != 0 ? 0 : i6);
    }

    /* renamed from: a */
    public final int m7484a(float f6, float f7) {
        Rect rect = this.f8565c;
        float f8 = rect.left;
        float f9 = rect.top;
        float f10 = rect.right;
        float f11 = rect.bottom;
        boolean z6 = Math.abs(f6 - f8) < this.f8574l;
        boolean z7 = Math.abs(f7 - f9) < this.f8574l;
        boolean z8 = Math.abs(f6 - f10) < this.f8574l;
        boolean z9 = Math.abs(f7 - f11) < this.f8574l;
        if (z6 && z7) {
            return 6;
        }
        if (z8 && z7) {
            return 7;
        }
        if (z6 && z9) {
            return 8;
        }
        if (z8 && z9) {
            return 9;
        }
        if (z6) {
            return 2;
        }
        if (z7) {
            return 3;
        }
        if (z8) {
            return 4;
        }
        if (z9) {
            return 5;
        }
        return this.f8565c.contains((int) f6, (int) f7) ? 1 : 0;
    }

    /* renamed from: b */
    public final void m7485b() {
        Rect rect;
        if (this.f8566d.isEmpty()) {
            Log.w(this.f8563a, "内容边界未设置");
            rect = new Rect(0, 0, getWidth(), getHeight());
        } else {
            rect = this.f8566d;
        }
        Rect rect2 = this.f8565c;
        int i6 = rect2.left;
        int i7 = rect.left;
        if (i6 < i7) {
            rect2.offsetTo(i7, rect2.top);
        }
        Rect rect3 = this.f8565c;
        int i8 = rect3.top;
        int i9 = rect.top;
        if (i8 < i9) {
            rect3.offsetTo(rect3.left, i9);
        }
        Rect rect4 = this.f8565c;
        int i10 = rect4.right;
        int i11 = rect.right;
        if (i10 > i11) {
            rect4.offsetTo(i11 - rect4.width(), this.f8565c.top);
        }
        Rect rect5 = this.f8565c;
        int i12 = rect5.bottom;
        int i13 = rect.bottom;
        if (i12 > i13) {
            rect5.offsetTo(rect5.left, i13 - rect5.height());
        }
        int iWidth = this.f8565c.width();
        int i14 = this.f8575m;
        if (iWidth < i14) {
            int i15 = this.f8573k;
            if (i15 == 2 || i15 == 6 || i15 == 8) {
                Rect rect6 = this.f8565c;
                rect6.left = rect6.right - i14;
            } else {
                Rect rect7 = this.f8565c;
                rect7.right = rect7.left + i14;
            }
        }
        int iHeight = this.f8565c.height();
        int i16 = this.f8575m;
        if (iHeight < i16) {
            int i17 = this.f8573k;
            if (i17 == 3 || i17 == 6 || i17 == 7) {
                Rect rect8 = this.f8565c;
                rect8.top = rect8.bottom - i16;
            } else {
                Rect rect9 = this.f8565c;
                rect9.bottom = rect9.top + i16;
            }
        }
        Rect rect10 = this.f8565c;
        int i18 = rect10.left;
        int i19 = rect.left;
        if (i18 < i19) {
            rect10.left = i19;
            int iWidth2 = rect10.width();
            int i20 = this.f8575m;
            if (iWidth2 < i20) {
                Rect rect11 = this.f8565c;
                rect11.right = rect11.left + i20;
            }
        }
        Rect rect12 = this.f8565c;
        int i21 = rect12.right;
        int i22 = rect.right;
        if (i21 > i22) {
            rect12.right = i22;
            int iWidth3 = rect12.width();
            int i23 = this.f8575m;
            if (iWidth3 < i23) {
                Rect rect13 = this.f8565c;
                rect13.left = rect13.right - i23;
            }
        }
        Rect rect14 = this.f8565c;
        int i24 = rect14.top;
        int i25 = rect.top;
        if (i24 < i25) {
            rect14.top = i25;
            int iHeight2 = rect14.height();
            int i26 = this.f8575m;
            if (iHeight2 < i26) {
                Rect rect15 = this.f8565c;
                rect15.bottom = rect15.top + i26;
            }
        }
        Rect rect16 = this.f8565c;
        int i27 = rect16.bottom;
        int i28 = rect.bottom;
        if (i27 > i28) {
            rect16.bottom = i28;
            int iHeight3 = rect16.height();
            int i29 = this.f8575m;
            if (iHeight3 < i29) {
                Rect rect17 = this.f8565c;
                rect17.top = rect17.bottom - i29;
            }
        }
        Rect rect18 = this.f8565c;
        int i30 = rect18.left;
        int i31 = rect.left;
        if (i30 < i31) {
            rect18.offsetTo(i31, rect18.top);
        }
        Rect rect19 = this.f8565c;
        int i32 = rect19.top;
        int i33 = rect.top;
        if (i32 < i33) {
            rect19.offsetTo(rect19.left, i33);
        }
        Rect rect20 = this.f8565c;
        int i34 = rect20.right;
        int i35 = rect.right;
        if (i34 > i35) {
            rect20.offsetTo(i35 - rect20.width(), this.f8565c.top);
        }
        Rect rect21 = this.f8565c;
        int i36 = rect21.bottom;
        int i37 = rect.bottom;
        if (i36 > i37) {
            rect21.offsetTo(rect21.left, i37 - rect21.height());
        }
        int iWidth4 = this.f8565c.width();
        int i38 = this.f8575m;
        if (iWidth4 < i38) {
            Rect rect22 = this.f8565c;
            rect22.right = rect22.left + i38;
        }
        int iHeight4 = this.f8565c.height();
        int i39 = this.f8575m;
        if (iHeight4 < i39) {
            Rect rect23 = this.f8565c;
            rect23.bottom = rect23.top + i39;
        }
    }

    /* renamed from: c */
    public final void m7486c(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap bitmap2 = this.f8564b;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.f8564b = bitmap;
        invalidate();
    }

    public final Rect getCropRect() {
        return this.f8565c;
    }

    public final Bitmap getCroppedBitmap() {
        if (this.f8564b != null && !this.f8565c.isEmpty()) {
            int iCoerceAtLeast = RangesKt.coerceAtLeast(0, this.f8565c.left);
            int iCoerceAtLeast2 = RangesKt.coerceAtLeast(0, this.f8565c.top);
            Bitmap bitmap = this.f8564b;
            Intrinsics.checkNotNull(bitmap);
            int iCoerceAtMost = RangesKt.coerceAtMost(bitmap.getWidth() - iCoerceAtLeast, this.f8565c.width());
            Bitmap bitmap2 = this.f8564b;
            Intrinsics.checkNotNull(bitmap2);
            int iCoerceAtMost2 = RangesKt.coerceAtMost(bitmap2.getHeight() - iCoerceAtLeast2, this.f8565c.height());
            if (iCoerceAtLeast >= 0 && iCoerceAtLeast2 >= 0 && iCoerceAtMost > 0 && iCoerceAtMost2 > 0) {
                int i6 = iCoerceAtLeast + iCoerceAtMost;
                Bitmap bitmap3 = this.f8564b;
                Intrinsics.checkNotNull(bitmap3);
                if (i6 <= bitmap3.getWidth()) {
                    int i7 = iCoerceAtLeast2 + iCoerceAtMost2;
                    Bitmap bitmap4 = this.f8564b;
                    Intrinsics.checkNotNull(bitmap4);
                    if (i7 <= bitmap4.getHeight()) {
                        try {
                            Bitmap bitmap5 = this.f8564b;
                            Intrinsics.checkNotNull(bitmap5);
                            return Bitmap.createBitmap(bitmap5, iCoerceAtLeast, iCoerceAtLeast2, iCoerceAtMost, iCoerceAtMost2);
                        } catch (Exception e6) {
                            Log.e(this.f8563a, "创建裁剪后的 Bitmap 失败: " + e6.getMessage(), e6);
                            return null;
                        }
                    }
                }
            }
            String str = this.f8563a;
            Bitmap bitmap6 = this.f8564b;
            Intrinsics.checkNotNull(bitmap6);
            int width = bitmap6.getWidth();
            Bitmap bitmap7 = this.f8564b;
            Intrinsics.checkNotNull(bitmap7);
            Log.e(str, "原始的bitmap: width=" + width + ", height=" + bitmap7.getHeight());
        }
        return null;
    }

    public final Rect getCurrentCropRect() {
        return this.f8565c;
    }

    public final Function1<Rect, Unit> getOnCropRectChangeListener() {
        return this.f8576n;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f8564b;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f8564b = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Bitmap bitmap = this.f8564b;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            Path path = new Path();
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            RectF rectF2 = new RectF(this.f8565c);
            path.addRect(rectF, Path.Direction.CW);
            path.addRect(rectF2, Path.Direction.CCW);
            canvas.drawPath(path, this.f8568f);
            canvas.drawRect(this.f8565c, this.f8567e);
            float strokeWidth = this.f8569g.getStrokeWidth() / 2;
            Rect rect = this.f8565c;
            int i6 = rect.left;
            int i7 = rect.top;
            canvas.drawLine(i6 - strokeWidth, i7 - strokeWidth, (i6 - strokeWidth) + this.f8570h, i7 - strokeWidth, this.f8569g);
            Rect rect2 = this.f8565c;
            int i8 = rect2.left;
            int i9 = rect2.top;
            canvas.drawLine(i8 - strokeWidth, i9 - strokeWidth, i8 - strokeWidth, this.f8570h + (i9 - strokeWidth), this.f8569g);
            Rect rect3 = this.f8565c;
            int i10 = rect3.right;
            int i11 = rect3.top;
            canvas.drawLine(i10 + strokeWidth, i11 - strokeWidth, (i10 + strokeWidth) - this.f8570h, i11 - strokeWidth, this.f8569g);
            Rect rect4 = this.f8565c;
            int i12 = rect4.right;
            int i13 = rect4.top;
            canvas.drawLine(i12 + strokeWidth, i13 - strokeWidth, i12 + strokeWidth, this.f8570h + (i13 - strokeWidth), this.f8569g);
            Rect rect5 = this.f8565c;
            int i14 = rect5.left;
            int i15 = rect5.bottom;
            canvas.drawLine(i14 - strokeWidth, i15 + strokeWidth, (i14 - strokeWidth) + this.f8570h, i15 + strokeWidth, this.f8569g);
            Rect rect6 = this.f8565c;
            int i16 = rect6.left;
            int i17 = rect6.bottom;
            canvas.drawLine(i16 - strokeWidth, i17 + strokeWidth, i16 - strokeWidth, (i17 + strokeWidth) - this.f8570h, this.f8569g);
            Rect rect7 = this.f8565c;
            int i18 = rect7.right;
            int i19 = rect7.bottom;
            canvas.drawLine(i18 + strokeWidth, i19 + strokeWidth, (i18 + strokeWidth) - this.f8570h, i19 + strokeWidth, this.f8569g);
            Rect rect8 = this.f8565c;
            int i20 = rect8.right;
            int i21 = rect8.bottom;
            canvas.drawLine(i20 + strokeWidth, i21 + strokeWidth, i20 + strokeWidth, (i21 + strokeWidth) - this.f8570h, this.f8569g);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        m7485b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        boolean z6;
        Intrinsics.checkNotNullParameter(event, "event");
        float x6 = event.getX();
        float y6 = event.getY();
        int action = event.getAction();
        if (action == 0) {
            this.f8571i = x6;
            this.f8572j = y6;
            this.f8573k = m7484a(x6, y6);
            return true;
        }
        if (action == 1) {
            this.f8573k = 0;
            return true;
        }
        if (action != 2) {
            return true;
        }
        int i6 = (int) (x6 - this.f8571i);
        int i7 = (int) (y6 - this.f8572j);
        switch (this.f8573k) {
            case 1:
                Rect rect = this.f8565c;
                int i8 = rect.left;
                int i9 = i8 + i6;
                int i10 = rect.top;
                int i11 = i10 + i7;
                int i12 = rect.right;
                int i13 = i12 + i6;
                int i14 = rect.bottom;
                int i15 = i14 + i7;
                Rect rect2 = this.f8566d;
                z6 = true;
                int i16 = rect2.left;
                if (i9 < i16) {
                    i6 = i16 - i8;
                } else {
                    int i17 = rect2.right;
                    if (i13 > i17) {
                        i6 = i17 - i12;
                    }
                }
                int i18 = rect2.top;
                if (i11 < i18) {
                    i7 = i18 - i10;
                } else {
                    int i19 = rect2.bottom;
                    if (i15 > i19) {
                        i7 = i19 - i14;
                    }
                }
                rect.offset(i6, i7);
                break;
            case 2:
                Rect rect3 = this.f8565c;
                rect3.left = RangesKt.coerceIn(rect3.left + i6, this.f8566d.left, rect3.right - 100);
                z6 = true;
                break;
            case 3:
                Rect rect4 = this.f8565c;
                rect4.top = RangesKt.coerceIn(rect4.top + i7, this.f8566d.top, rect4.bottom - 100);
                z6 = true;
                break;
            case 4:
                Rect rect5 = this.f8565c;
                rect5.right = RangesKt.coerceIn(rect5.right + i6, rect5.left + 100, this.f8566d.right);
                z6 = true;
                break;
            case 5:
                Rect rect6 = this.f8565c;
                rect6.bottom = RangesKt.coerceIn(rect6.bottom + i7, rect6.top + 100, this.f8566d.bottom);
                z6 = true;
                break;
            case 6:
                Rect rect7 = this.f8565c;
                int i20 = rect7.left + i6;
                int i21 = rect7.top + i7;
                rect7.left = RangesKt.coerceIn(i20, this.f8566d.left, rect7.right - 100);
                this.f8565c.top = RangesKt.coerceIn(i21, this.f8566d.top, r5.bottom - 100);
                z6 = true;
                break;
            case 7:
                Rect rect8 = this.f8565c;
                int i22 = rect8.right + i6;
                int i23 = rect8.top + i7;
                rect8.right = RangesKt.coerceIn(i22, rect8.left + 100, this.f8566d.right);
                this.f8565c.top = RangesKt.coerceIn(i23, this.f8566d.top, r5.bottom - 100);
                z6 = true;
                break;
            case 8:
                Rect rect9 = this.f8565c;
                int i24 = rect9.left + i6;
                int i25 = rect9.bottom + i7;
                rect9.left = RangesKt.coerceIn(i24, this.f8566d.left, rect9.right - 100);
                Rect rect10 = this.f8565c;
                rect10.bottom = RangesKt.coerceIn(i25, rect10.top + 100, this.f8566d.bottom);
                z6 = true;
                break;
            case 9:
                Rect rect11 = this.f8565c;
                int i26 = rect11.right + i6;
                int i27 = rect11.bottom + i7;
                rect11.right = RangesKt.coerceIn(i26, rect11.left + 100, this.f8566d.right);
                Rect rect12 = this.f8565c;
                rect12.bottom = RangesKt.coerceIn(i27, rect12.top + 100, this.f8566d.bottom);
                z6 = true;
                break;
            default:
                z6 = true;
                break;
        }
        this.f8571i = x6;
        this.f8572j = y6;
        invalidate();
        Function1 function1 = this.f8576n;
        if (function1 == null) {
            return z6;
        }
        function1.invoke(this.f8565c);
        return z6;
    }

    public final void setContentBoundaries(Rect boundaries) {
        Intrinsics.checkNotNullParameter(boundaries, "boundaries");
        this.f8566d.set(boundaries);
        if (this.f8564b == null || !this.f8565c.isEmpty()) {
            m7485b();
        } else {
            int iWidth = (int) (this.f8566d.width() * 0.8d);
            int iHeight = (int) (this.f8566d.height() * 0.6d);
            Rect rect = this.f8566d;
            int iWidth2 = rect.left + ((rect.width() - iWidth) / 2);
            Rect rect2 = this.f8566d;
            int iHeight2 = rect2.top + ((rect2.height() - iHeight) / 2);
            this.f8565c.set(iWidth2, iHeight2, iWidth + iWidth2, iHeight + iHeight2);
            Function1 function1 = this.f8576n;
            if (function1 != null) {
                function1.invoke(this.f8565c);
            }
        }
        invalidate();
    }

    public final void setCropRect(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.f8565c = rect;
    }

    public final void setCropRectColor(int i6) {
        this.f8567e.setColor(i6);
        this.f8569g.setColor(i6);
        invalidate();
    }

    public final void setOnCropRectChangeListener(Function1<? super Rect, Unit> function1) {
        this.f8576n = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6587a(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8563a = "MyFloatingToolService-cropRectView";
        this.f8565c = new Rect();
        this.f8566d = new Rect();
        Paint paint = new Paint(1);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(5.0f);
        this.f8567e = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(Color.parseColor("#99000000"));
        paint2.setStyle(Paint.Style.FILL);
        this.f8568f = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(5.0f);
        this.f8569g = paint3;
        this.f8570h = 50.0f;
        this.f8574l = 50.0f;
        this.f8575m = 100;
    }
}
