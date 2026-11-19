package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C0358u;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* renamed from: androidx.swiperefreshlayout.widget.a */
/* loaded from: classes.dex */
class C0668a extends ImageView {

    /* renamed from: a */
    private Animation.AnimationListener f4218a;

    /* renamed from: b */
    int f4219b;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    private class a extends OvalShape {

        /* renamed from: a */
        private RadialGradient f4220a;

        /* renamed from: b */
        private Paint f4221b = new Paint();

        a(int i4) {
            C0668a.this.f4219b = i4;
            m3718a((int) rect().width());
        }

        /* renamed from: a */
        private void m3718a(int i4) {
            float f4 = i4 / 2;
            RadialGradient radialGradient = new RadialGradient(f4, f4, C0668a.this.f4219b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f4220a = radialGradient;
            this.f4221b.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = C0668a.this.getWidth() / 2;
            float height = C0668a.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f4221b);
            canvas.drawCircle(width, height, r0 - C0668a.this.f4219b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f4, float f5) {
            super.onResize(f4, f5);
            m3718a((int) f4);
        }
    }

    C0668a(Context context, int i4) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f4 = getContext().getResources().getDisplayMetrics().density;
        int i5 = (int) (1.75f * f4);
        int i6 = (int) (IGoodView.DEFAULT_TO_ALPHA * f4);
        this.f4219b = (int) (3.5f * f4);
        if (m3716a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0358u.m2065x0(this, f4 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this.f4219b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f4219b, i6, i5, 503316480);
            int i7 = this.f4219b;
            setPadding(i7, i7, i7, i7);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i4);
        C0358u.m2057t0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m3716a() {
        return true;
    }

    /* renamed from: b */
    public void m3717b(Animation.AnimationListener animationListener) {
        this.f4218a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f4218a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f4218a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (m3716a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f4219b * 2), getMeasuredHeight() + (this.f4219b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i4);
        }
    }
}
