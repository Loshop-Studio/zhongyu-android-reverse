package p021b1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.R$drawable;
import p070d1.AbstractC8277d;

/* renamed from: b1.a */
/* loaded from: classes3.dex */
public class C5027a extends RelativeLayout implements InterfaceC5028b {

    /* renamed from: a */
    public float f2105a;

    /* renamed from: b */
    public TextView f2106b;

    /* renamed from: c */
    public Context f2107c;

    /* renamed from: d */
    public boolean f2108d;

    /* renamed from: e */
    public PDFView f2109e;

    /* renamed from: f */
    public float f2110f;

    /* renamed from: g */
    public Handler f2111g;

    /* renamed from: h */
    public Runnable f2112h;

    /* renamed from: b1.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5027a.this.hide();
        }
    }

    public C5027a(Context context) {
        this(context, false);
    }

    private void setPosition(float f10) {
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            return;
        }
        float height = this.f2109e.m3558C() ? this.f2109e.getHeight() : this.f2109e.getWidth();
        float fM13429a = f10 - this.f2105a;
        if (fM13429a < 0.0f) {
            fM13429a = 0.0f;
        } else if (fM13429a > height - AbstractC8277d.m13429a(this.f2107c, 40)) {
            fM13429a = height - AbstractC8277d.m13429a(this.f2107c, 40);
        }
        if (this.f2109e.m3558C()) {
            setY(fM13429a);
        } else {
            setX(fM13429a);
        }
        m2072d();
        invalidate();
    }

    @Override // p021b1.InterfaceC5028b
    /* renamed from: a */
    public void mo2069a() {
        this.f2111g.postDelayed(this.f2112h, 1000L);
    }

    @Override // p021b1.InterfaceC5028b
    /* renamed from: b */
    public void mo2070b() {
        this.f2109e.removeView(this);
    }

    @Override // p021b1.InterfaceC5028b
    /* renamed from: c */
    public boolean mo2071c() {
        return getVisibility() == 0;
    }

    /* renamed from: d */
    public final void m2072d() {
        float x10;
        float width;
        int width2;
        if (this.f2109e.m3558C()) {
            x10 = getY();
            width = getHeight();
            width2 = this.f2109e.getHeight();
        } else {
            x10 = getX();
            width = getWidth();
            width2 = this.f2109e.getWidth();
        }
        this.f2105a = ((x10 + this.f2105a) / width2) * width;
    }

    /* renamed from: e */
    public final boolean m2073e() {
        PDFView pDFView = this.f2109e;
        return (pDFView == null || pDFView.getPageCount() <= 0 || this.f2109e.m3589m()) ? false : true;
    }

    @Override // p021b1.InterfaceC5028b
    public void hide() {
        setVisibility(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.m2073e()
            if (r0 != 0) goto Lb
            boolean r5 = super.onTouchEvent(r5)
            return r5
        Lb:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 == r1) goto L25
            r2 = 2
            if (r0 == r2) goto L59
            r2 = 3
            if (r0 == r2) goto L25
            r2 = 5
            if (r0 == r2) goto L2e
            r2 = 6
            if (r0 == r2) goto L25
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L25:
            r4.mo2069a()
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f2109e
            r5.m3574S()
            return r1
        L2e:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f2109e
            r0.m3581Z()
            android.os.Handler r0 = r4.f2111g
            java.lang.Runnable r2 = r4.f2112h
            r0.removeCallbacks(r2)
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f2109e
            boolean r0 = r0.m3558C()
            if (r0 == 0) goto L4e
            float r0 = r5.getRawY()
            float r2 = r4.getY()
            float r0 = r0 - r2
            r4.f2110f = r0
            goto L59
        L4e:
            float r0 = r5.getRawX()
            float r2 = r4.getX()
            float r0 = r0 - r2
            r4.f2110f = r0
        L59:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f2109e
            boolean r0 = r0.m3558C()
            r2 = 0
            if (r0 == 0) goto L7d
            float r5 = r5.getRawY()
            float r0 = r4.f2110f
            float r5 = r5 - r0
            float r0 = r4.f2105a
            float r5 = r5 + r0
            r4.setPosition(r5)
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f2109e
            float r0 = r4.f2105a
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.m3578W(r0, r2)
            goto L97
        L7d:
            float r5 = r5.getRawX()
            float r0 = r4.f2110f
            float r5 = r5 - r0
            float r0 = r4.f2105a
            float r5 = r5 + r0
            r4.setPosition(r5)
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f2109e
            float r0 = r4.f2105a
            int r3 = r4.getWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.m3578W(r0, r2)
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p021b1.C5027a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // p021b1.InterfaceC5028b
    public void setPageNum(int i10) {
        String strValueOf = String.valueOf(i10);
        if (this.f2106b.getText().equals(strValueOf)) {
            return;
        }
        this.f2106b.setText(strValueOf);
    }

    @Override // p021b1.InterfaceC5028b
    public void setScroll(float f10) {
        if (mo2071c()) {
            this.f2111g.removeCallbacks(this.f2112h);
        } else {
            show();
        }
        PDFView pDFView = this.f2109e;
        if (pDFView != null) {
            setPosition((pDFView.m3558C() ? this.f2109e.getHeight() : this.f2109e.getWidth()) * f10);
        }
    }

    public void setTextColor(int i10) {
        this.f2106b.setTextColor(i10);
    }

    public void setTextSize(int i10) {
        this.f2106b.setTextSize(1, i10);
    }

    @Override // p021b1.InterfaceC5028b
    public void setupLayout(PDFView pDFView) {
        Drawable drawable;
        int i10;
        int i11 = 40;
        int i12 = 65;
        if (pDFView.m3558C()) {
            if (this.f2108d) {
                drawable = ContextCompat.getDrawable(this.f2107c, R$drawable.default_scroll_handle_left);
                i10 = 9;
            } else {
                drawable = ContextCompat.getDrawable(this.f2107c, R$drawable.default_scroll_handle_right);
                i10 = 11;
            }
            i12 = 40;
            i11 = 65;
        } else if (this.f2108d) {
            drawable = ContextCompat.getDrawable(this.f2107c, R$drawable.default_scroll_handle_top);
            i10 = 10;
        } else {
            drawable = ContextCompat.getDrawable(this.f2107c, R$drawable.default_scroll_handle_bottom);
            i10 = 12;
        }
        setBackground(drawable);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC8277d.m13429a(this.f2107c, i11), AbstractC8277d.m13429a(this.f2107c, i12));
        layoutParams.setMargins(0, 0, 0, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13, -1);
        addView(this.f2106b, layoutParams2);
        layoutParams.addRule(i10);
        pDFView.addView(this, layoutParams);
        this.f2109e = pDFView;
    }

    @Override // p021b1.InterfaceC5028b
    public void show() {
        setVisibility(0);
    }

    public C5027a(Context context, boolean z10) {
        super(context);
        this.f2105a = 0.0f;
        this.f2111g = new Handler();
        this.f2112h = new a();
        this.f2107c = context;
        this.f2108d = z10;
        this.f2106b = new TextView(context);
        setVisibility(4);
        setTextColor(-16777216);
        setTextSize(16);
    }
}
