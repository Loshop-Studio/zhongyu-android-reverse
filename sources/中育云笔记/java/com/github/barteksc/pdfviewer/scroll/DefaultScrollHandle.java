package com.github.barteksc.pdfviewer.scroll;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.R$drawable;
import p258n4.InterfaceC10316a;
import p288p4.AbstractC10630d;

/* loaded from: classes5.dex */
public class DefaultScrollHandle extends RelativeLayout implements InterfaceC10316a {

    /* renamed from: c */
    public float f10850c;

    /* renamed from: d */
    public TextView f10851d;

    /* renamed from: e */
    public Context f10852e;

    /* renamed from: f */
    public boolean f10853f;

    /* renamed from: g */
    public PDFView f10854g;

    /* renamed from: h */
    public float f10855h;

    /* renamed from: i */
    public Handler f10856i;

    /* renamed from: j */
    public Runnable f10857j;

    /* renamed from: com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle$a */
    public class RunnableC6338a implements Runnable {
        public RunnableC6338a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultScrollHandle.this.hide();
        }
    }

    public DefaultScrollHandle(Context context) {
        this(context, false);
    }

    private void setPosition(float f10) {
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            return;
        }
        float height = this.f10854g.m7849C() ? this.f10854g.getHeight() : this.f10854g.getWidth();
        float fM22479a = f10 - this.f10850c;
        if (fM22479a < 0.0f) {
            fM22479a = 0.0f;
        } else if (fM22479a > height - AbstractC10630d.m22479a(this.f10852e, 40)) {
            fM22479a = height - AbstractC10630d.m22479a(this.f10852e, 40);
        }
        if (this.f10854g.m7849C()) {
            setY(fM22479a);
        } else {
            setX(fM22479a);
        }
        m7908d();
        invalidate();
    }

    @Override // p258n4.InterfaceC10316a
    /* renamed from: a */
    public void mo7905a() {
        this.f10856i.postDelayed(this.f10857j, 1000L);
    }

    @Override // p258n4.InterfaceC10316a
    /* renamed from: b */
    public void mo7906b() {
        this.f10854g.removeView(this);
    }

    @Override // p258n4.InterfaceC10316a
    /* renamed from: c */
    public boolean mo7907c() {
        return getVisibility() == 0;
    }

    /* renamed from: d */
    public final void m7908d() {
        float x10;
        float width;
        int width2;
        if (this.f10854g.m7849C()) {
            x10 = getY();
            width = getHeight();
            width2 = this.f10854g.getHeight();
        } else {
            x10 = getX();
            width = getWidth();
            width2 = this.f10854g.getWidth();
        }
        this.f10850c = ((x10 + this.f10850c) / width2) * width;
    }

    /* renamed from: e */
    public final boolean m7909e() {
        PDFView pDFView = this.f10854g;
        return (pDFView == null || pDFView.getPageCount() <= 0 || this.f10854g.m7880m()) ? false : true;
    }

    @Override // p258n4.InterfaceC10316a
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
            boolean r0 = r4.m7909e()
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
            r4.mo7905a()
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f10854g
            r5.m7865S()
            return r1
        L2e:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f10854g
            r0.m7872Z()
            android.os.Handler r0 = r4.f10856i
            java.lang.Runnable r2 = r4.f10857j
            r0.removeCallbacks(r2)
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f10854g
            boolean r0 = r0.m7849C()
            if (r0 == 0) goto L4e
            float r0 = r5.getRawY()
            float r2 = r4.getY()
            float r0 = r0 - r2
            r4.f10855h = r0
            goto L59
        L4e:
            float r0 = r5.getRawX()
            float r2 = r4.getX()
            float r0 = r0 - r2
            r4.f10855h = r0
        L59:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f10854g
            boolean r0 = r0.m7849C()
            r2 = 0
            if (r0 == 0) goto L7d
            float r5 = r5.getRawY()
            float r0 = r4.f10855h
            float r5 = r5 - r0
            float r0 = r4.f10850c
            float r5 = r5 + r0
            r4.setPosition(r5)
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f10854g
            float r0 = r4.f10850c
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.m7869W(r0, r2)
            goto L97
        L7d:
            float r5 = r5.getRawX()
            float r0 = r4.f10855h
            float r5 = r5 - r0
            float r0 = r4.f10850c
            float r5 = r5 + r0
            r4.setPosition(r5)
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f10854g
            float r0 = r4.f10850c
            int r3 = r4.getWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.m7869W(r0, r2)
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // p258n4.InterfaceC10316a
    public void setPageNum(int i10) {
        String strValueOf = String.valueOf(i10);
        if (this.f10851d.getText().equals(strValueOf)) {
            return;
        }
        this.f10851d.setText(strValueOf);
    }

    @Override // p258n4.InterfaceC10316a
    public void setScroll(float f10) {
        if (mo7907c()) {
            this.f10856i.removeCallbacks(this.f10857j);
        } else {
            show();
        }
        PDFView pDFView = this.f10854g;
        if (pDFView != null) {
            setPosition((pDFView.m7849C() ? this.f10854g.getHeight() : this.f10854g.getWidth()) * f10);
        }
    }

    public void setTextColor(int i10) {
        this.f10851d.setTextColor(i10);
    }

    public void setTextSize(int i10) {
        this.f10851d.setTextSize(1, i10);
    }

    @Override // p258n4.InterfaceC10316a
    public void setupLayout(PDFView pDFView) {
        Drawable drawable;
        int i10;
        int i11 = 40;
        int i12 = 65;
        if (pDFView.m7849C()) {
            if (this.f10853f) {
                drawable = ContextCompat.getDrawable(this.f10852e, R$drawable.default_scroll_handle_left);
                i10 = 9;
            } else {
                drawable = ContextCompat.getDrawable(this.f10852e, R$drawable.default_scroll_handle_right);
                i10 = 11;
            }
            i12 = 40;
            i11 = 65;
        } else if (this.f10853f) {
            drawable = ContextCompat.getDrawable(this.f10852e, R$drawable.default_scroll_handle_top);
            i10 = 10;
        } else {
            drawable = ContextCompat.getDrawable(this.f10852e, R$drawable.default_scroll_handle_bottom);
            i10 = 12;
        }
        setBackground(drawable);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC10630d.m22479a(this.f10852e, i11), AbstractC10630d.m22479a(this.f10852e, i12));
        layoutParams.setMargins(0, 0, 0, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13, -1);
        addView(this.f10851d, layoutParams2);
        layoutParams.addRule(i10);
        pDFView.addView(this, layoutParams);
        this.f10854g = pDFView;
    }

    @Override // p258n4.InterfaceC10316a
    public void show() {
        setVisibility(0);
    }

    public DefaultScrollHandle(Context context, boolean z10) {
        super(context);
        this.f10850c = 0.0f;
        this.f10856i = new Handler();
        this.f10857j = new RunnableC6338a();
        this.f10852e = context;
        this.f10853f = z10;
        this.f10851d = new TextView(context);
        setVisibility(4);
        setTextColor(ViewCompat.MEASURED_STATE_MASK);
        setTextSize(16);
    }
}
