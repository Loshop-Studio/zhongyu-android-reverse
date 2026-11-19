package com.zykj.video.play.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.internal.view.SupportMenu;
import com.zykj.video.play.R$color;
import com.zykj.video.play.R$styleable;
import java.util.List;

/* loaded from: classes5.dex */
public class TCPointSeekBar extends RelativeLayout {

    /* renamed from: A */
    public boolean f14714A;

    /* renamed from: B */
    public InterfaceC8178d f14715B;

    /* renamed from: a */
    public int f14716a;

    /* renamed from: b */
    public int f14717b;

    /* renamed from: c */
    public int f14718c;

    /* renamed from: d */
    public int f14719d;

    /* renamed from: e */
    public int f14720e;

    /* renamed from: f */
    public int f14721f;

    /* renamed from: g */
    public int f14722g;

    /* renamed from: h */
    public int f14723h;

    /* renamed from: i */
    public Paint f14724i;

    /* renamed from: j */
    public Paint f14725j;

    /* renamed from: k */
    public Paint f14726k;

    /* renamed from: l */
    public Drawable f14727l;

    /* renamed from: m */
    public int f14728m;

    /* renamed from: n */
    public float f14729n;

    /* renamed from: o */
    public float f14730o;

    /* renamed from: p */
    public float f14731p;

    /* renamed from: q */
    public float f14732q;

    /* renamed from: r */
    public boolean f14733r;

    /* renamed from: s */
    public float f14734s;

    /* renamed from: t */
    public float f14735t;

    /* renamed from: u */
    public int f14736u;

    /* renamed from: v */
    public int f14737v;

    /* renamed from: w */
    public float f14738w;

    /* renamed from: x */
    public C8182h f14739x;

    /* renamed from: y */
    public List f14740y;

    /* renamed from: z */
    public InterfaceC8179e f14741z;

    /* renamed from: com.zykj.video.play.view.TCPointSeekBar$a */
    public class RunnableC8175a implements Runnable {
        public RunnableC8175a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TCPointSeekBar.this.m12523k();
        }
    }

    /* renamed from: com.zykj.video.play.view.TCPointSeekBar$b */
    public class RunnableC8176b implements Runnable {
        public RunnableC8176b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TCPointSeekBar.this.f14714A) {
                TCPointSeekBar.this.removeAllViews();
                if (TCPointSeekBar.this.f14740y != null) {
                    for (int i10 = 0; i10 < TCPointSeekBar.this.f14740y.size(); i10++) {
                        TCPointSeekBar.this.m12521i((C8180f) TCPointSeekBar.this.f14740y.get(i10), i10);
                    }
                }
                TCPointSeekBar.this.m12523k();
                TCPointSeekBar.this.f14714A = false;
            }
            if (TCPointSeekBar.this.f14733r) {
                return;
            }
            TCPointSeekBar.this.m12524l();
            TCPointSeekBar.this.m12528p();
        }
    }

    /* renamed from: com.zykj.video.play.view.TCPointSeekBar$c */
    public class ViewOnClickListenerC8177c implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C8181g f14744a;

        /* renamed from: b */
        public final /* synthetic */ int f14745b;

        public ViewOnClickListenerC8177c(C8181g c8181g, int i10) {
            this.f14744a = c8181g;
            this.f14745b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TCPointSeekBar.this.f14741z != null) {
                TCPointSeekBar.this.f14741z.mo12465h(this.f14744a, this.f14745b);
            }
        }
    }

    /* renamed from: com.zykj.video.play.view.TCPointSeekBar$d */
    public interface InterfaceC8178d {
        /* renamed from: b */
        void mo12459b(TCPointSeekBar tCPointSeekBar);

        /* renamed from: d */
        void mo12461d(TCPointSeekBar tCPointSeekBar, int i10, boolean z10);

        /* renamed from: g */
        void mo12464g(TCPointSeekBar tCPointSeekBar);
    }

    /* renamed from: com.zykj.video.play.view.TCPointSeekBar$e */
    public interface InterfaceC8179e {
        /* renamed from: h */
        void mo12465h(View view, int i10);
    }

    /* renamed from: com.zykj.video.play.view.TCPointSeekBar$f */
    public static class C8180f {

        /* renamed from: a */
        public int f14747a;

        /* renamed from: b */
        public int f14748b;

        public C8180f(int i10, int i11) {
            this.f14747a = i10;
            this.f14748b = i11;
        }
    }

    /* renamed from: com.zykj.video.play.view.TCPointSeekBar$g */
    public static class C8181g extends View {

        /* renamed from: a */
        public int f14749a;

        /* renamed from: b */
        public Paint f14750b;

        /* renamed from: c */
        public RectF f14751c;

        public C8181g(Context context) {
            super(context);
            this.f14749a = -1;
            m12534a();
        }

        /* renamed from: a */
        public final void m12534a() {
            Paint paint = new Paint();
            this.f14750b = paint;
            paint.setAntiAlias(true);
            this.f14750b.setColor(this.f14749a);
            this.f14751c = new RectF();
        }

        /* renamed from: b */
        public void m12535b(int i10) {
            this.f14749a = i10;
            this.f14750b.setColor(i10);
        }

        /* renamed from: c */
        public void m12536c(float f10, float f11, float f12, float f13) {
            RectF rectF = this.f14751c;
            rectF.left = f10;
            rectF.top = f11;
            rectF.right = f12;
            rectF.bottom = f13;
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawRect(this.f14751c, this.f14750b);
        }
    }

    /* renamed from: com.zykj.video.play.view.TCPointSeekBar$h */
    public static class C8182h extends View {

        /* renamed from: a */
        public Paint f14752a;

        /* renamed from: b */
        public Rect f14753b;

        /* renamed from: c */
        public Drawable f14754c;

        public C8182h(Context context, Drawable drawable) {
            super(context);
            this.f14754c = drawable;
            Paint paint = new Paint();
            this.f14752a = paint;
            paint.setAntiAlias(true);
            this.f14753b = new Rect();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.f14754c.setBounds(this.f14753b);
            this.f14754c.draw(canvas);
        }

        @Override // android.view.View
        public void onSizeChanged(int i10, int i11, int i12, int i13) {
            super.onSizeChanged(i10, i11, i12, i13);
            Rect rect = this.f14753b;
            rect.left = 0;
            rect.top = 0;
            rect.right = i10;
            rect.bottom = i11;
        }
    }

    public TCPointSeekBar(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f14734s = 0.0f;
        this.f14737v = 100;
        this.f14738w = 0.0f;
        m12533u(attributeSet);
    }

    public int getMax() {
        return this.f14737v;
    }

    public int getProgress() {
        return this.f14736u;
    }

    /* renamed from: i */
    public void m12521i(C8180f c8180f, int i10) {
        int i11 = this.f14721f - this.f14720e;
        float intrinsicWidth = (this.f14727l.getIntrinsicWidth() - i11) / 2;
        C8181g c8181g = new C8181g(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f14727l.getIntrinsicWidth(), this.f14727l.getIntrinsicWidth());
        layoutParams.leftMargin = (int) (((c8180f.f14747a * 1.0f) / this.f14737v) * (this.f14719d - this.f14718c));
        c8181g.m12536c(intrinsicWidth, this.f14720e, this.f14721f, i11 + intrinsicWidth);
        c8181g.setLayoutParams(layoutParams);
        c8181g.m12535b(c8180f.f14748b);
        c8181g.setOnClickListener(new ViewOnClickListenerC8177c(c8181g, i10));
        addView(c8181g);
    }

    /* renamed from: j */
    public final void m12522j() {
        post(new RunnableC8176b());
    }

    /* renamed from: k */
    public final void m12523k() {
        this.f14739x = new C8182h(getContext(), this.f14727l);
        this.f14739x.setLayoutParams(new RelativeLayout.LayoutParams(this.f14727l.getIntrinsicHeight(), this.f14727l.getIntrinsicHeight()));
        addView(this.f14739x);
    }

    /* renamed from: l */
    public final void m12524l() {
        float f10 = (this.f14719d - this.f14718c) * ((this.f14736u * 1.0f) / this.f14737v);
        this.f14729n = f10;
        this.f14735t = f10;
        this.f14734s = 0.0f;
        m12525m();
    }

    /* renamed from: m */
    public final void m12525m() {
        float fM12529q = m12529q(this.f14734s);
        this.f14729n = fM12529q;
        this.f14730o = this.f14727l.getIntrinsicWidth() + fM12529q;
        this.f14731p = 0.0f;
        this.f14732q = this.f14717b;
    }

    /* renamed from: n */
    public final void m12526n() {
        float f10 = this.f14729n;
        if (f10 == 0.0f) {
            m12527o(0, true);
            return;
        }
        if (this.f14730o == this.f14716a) {
            m12527o(this.f14737v, true);
            return;
        }
        float f11 = f10 + this.f14728m;
        int i10 = this.f14723h;
        if (f11 >= i10) {
            m12527o(this.f14737v, true);
            return;
        }
        float f12 = (f11 / i10) * 1.0f;
        int i11 = this.f14737v;
        int i12 = (int) (f12 * i11);
        if (i12 <= i11) {
            i11 = i12;
        }
        m12527o(i11, true);
    }

    /* renamed from: o */
    public final void m12527o(int i10, boolean z10) {
        this.f14736u = i10;
        InterfaceC8178d interfaceC8178d = this.f14715B;
        if (interfaceC8178d != null) {
            interfaceC8178d.mo12461d(this, i10, z10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF();
        rectF.left = this.f14718c;
        rectF.right = this.f14719d;
        rectF.top = this.f14720e;
        rectF.bottom = this.f14721f;
        int i10 = this.f14722g;
        canvas.drawRoundRect(rectF, i10, i10, this.f14724i);
        RectF rectF2 = new RectF();
        rectF2.left = this.f14718c;
        rectF2.top = this.f14720e;
        rectF2.right = this.f14730o - this.f14728m;
        rectF2.bottom = this.f14721f;
        int i11 = this.f14722g;
        canvas.drawRoundRect(rectF2, i11, i11, this.f14725j);
        m12522j();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f14716a = i10;
        this.f14717b = i11;
        int i14 = this.f14728m;
        this.f14718c = i14;
        this.f14719d = i10 - i14;
        float f10 = (i11 - this.f14738w) / 2.0f;
        this.f14720e = (int) f10;
        this.f14721f = (int) (i11 - f10);
        this.f14722g = i11 / 2;
        this.f14723h = i10;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            return m12530r(motionEvent);
        }
        if (action != 1) {
            if (action == 2) {
                return m12531s(motionEvent);
            }
            if (action != 3) {
                return false;
            }
        }
        return m12532t(motionEvent);
    }

    /* renamed from: p */
    public final void m12528p() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f14739x.getLayoutParams();
        layoutParams.leftMargin = (int) this.f14729n;
        layoutParams.topMargin = (int) this.f14731p;
        this.f14739x.setLayoutParams(layoutParams);
    }

    /* renamed from: q */
    public final float m12529q(float f10) {
        return this.f14729n + f10;
    }

    /* renamed from: r */
    public final boolean m12530r(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        motionEvent.getY();
        if (x10 < this.f14729n - 100.0f || x10 > this.f14730o + 100.0f) {
            return false;
        }
        InterfaceC8178d interfaceC8178d = this.f14715B;
        if (interfaceC8178d != null) {
            interfaceC8178d.mo12459b(this);
        }
        this.f14733r = true;
        this.f14735t = x10;
        return true;
    }

    /* renamed from: s */
    public final boolean m12531s(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        motionEvent.getY();
        if (!this.f14733r) {
            return false;
        }
        this.f14734s = x10 - this.f14735t;
        m12525m();
        if (this.f14730o - this.f14728m <= this.f14718c) {
            this.f14729n = 0.0f;
            this.f14730o = 0.0f + this.f14727l.getIntrinsicWidth();
        }
        if (this.f14729n + this.f14728m >= this.f14719d) {
            this.f14730o = this.f14716a;
            this.f14729n = r3 - this.f14727l.getIntrinsicWidth();
        }
        m12528p();
        invalidate();
        m12526n();
        this.f14735t = x10;
        return true;
    }

    public void setMax(int i10) {
        this.f14737v = i10;
    }

    public void setOnPointClickListener(InterfaceC8179e interfaceC8179e) {
        this.f14741z = interfaceC8179e;
    }

    public void setOnSeekBarChangeListener(InterfaceC8178d interfaceC8178d) {
        this.f14715B = interfaceC8178d;
    }

    public void setPointList(List<C8180f> list) {
        this.f14740y = list;
        this.f14714A = true;
        invalidate();
    }

    public void setProgress(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f14737v;
        if (i10 > i11) {
            i10 = i11;
        }
        if (this.f14733r) {
            return;
        }
        this.f14736u = i10;
        invalidate();
        m12527o(i10, false);
    }

    /* renamed from: t */
    public final boolean m12532t(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        if (!this.f14733r) {
            return false;
        }
        this.f14733r = false;
        InterfaceC8178d interfaceC8178d = this.f14715B;
        if (interfaceC8178d == null) {
            return true;
        }
        interfaceC8178d.mo12464g(this);
        return true;
    }

    /* renamed from: u */
    public final void m12533u(AttributeSet attributeSet) throws Resources.NotFoundException {
        setWillNotDraw(false);
        int color = getResources().getColor(R$color.superplayer_default_progress_color);
        int color2 = getResources().getColor(R$color.superplayer_default_progress_background_color);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.SuperPlayerTCPointSeekBar);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SuperPlayerTCPointSeekBar_psb_thumbBackground);
            this.f14727l = drawable;
            this.f14728m = drawable.getIntrinsicWidth() / 2;
            color = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperPlayerTCPointSeekBar_psb_progressColor, color);
            color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperPlayerTCPointSeekBar_psb_backgroundColor, color2);
            this.f14736u = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperPlayerTCPointSeekBar_psb_progress, 0);
            this.f14737v = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperPlayerTCPointSeekBar_psb_max, 100);
            this.f14738w = typedArrayObtainStyledAttributes.getDimension(R$styleable.SuperPlayerTCPointSeekBar_psb_progressHeight, 8.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.f14724i = paint;
        paint.setColor(color2);
        Paint paint2 = new Paint();
        this.f14726k = paint2;
        paint2.setColor(SupportMenu.CATEGORY_MASK);
        Paint paint3 = new Paint();
        this.f14725j = paint3;
        paint3.setColor(color);
        post(new RunnableC8175a());
    }
}
