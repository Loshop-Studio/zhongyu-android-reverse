package com.xuexiang.xui.widget.popupwindow;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC3531f;
import p077j0.AbstractC3799b;

/* loaded from: classes2.dex */
public class ViewTooltip {

    /* renamed from: a */
    public final View f3769a;

    /* renamed from: b */
    public final C3604g f3770b;

    public enum ALIGN {
        START,
        CENTER
    }

    public enum Position {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$a */
    public class RunnableC3598a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f3779a;

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$a$a */
        public class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final /* synthetic */ Rect f3781a;

            public a(Rect rect) {
                this.f3781a = rect;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ViewTooltip.this.f3770b.m4519j(this.f3781a, RunnableC3598a.this.f3779a.getWidth());
                ViewTooltip.this.f3770b.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        }

        public RunnableC3598a(ViewGroup viewGroup) {
            this.f3779a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            ViewTooltip.this.f3769a.getGlobalVisibleRect(rect);
            int[] iArr = new int[2];
            ViewTooltip.this.f3769a.getLocationOnScreen(iArr);
            rect.left = iArr[0];
            this.f3779a.addView(ViewTooltip.this.f3770b, -2, -2);
            ViewTooltip.this.f3770b.getViewTreeObserver().addOnPreDrawListener(new a(rect));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$b */
    public static /* synthetic */ class C3599b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3783a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3784b;

        static {
            int[] iArr = new int[ALIGN.values().length];
            f3784b = iArr;
            try {
                iArr[ALIGN.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3784b[ALIGN.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Position.values().length];
            f3783a = iArr2;
            try {
                iArr2[Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3783a[Position.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3783a[Position.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3783a[Position.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$c */
    public static class C3600c implements InterfaceC3603f {

        /* renamed from: a */
        public long f3785a = 400;

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.InterfaceC3603f
        /* renamed from: a */
        public void mo4508a(View view, Animator.AnimatorListener animatorListener) {
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(this.f3785a).setListener(animatorListener);
        }

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.InterfaceC3603f
        /* renamed from: b */
        public void mo4509b(View view, Animator.AnimatorListener animatorListener) {
            view.animate().alpha(0.0f).setDuration(this.f3785a).setListener(animatorListener);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$d */
    public interface InterfaceC3601d {
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$e */
    public interface InterfaceC3602e {
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$f */
    public interface InterfaceC3603f {
        /* renamed from: a */
        void mo4508a(View view, Animator.AnimatorListener animatorListener);

        /* renamed from: b */
        void mo4509b(View view, Animator.AnimatorListener animatorListener);
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g */
    public static class C3604g extends FrameLayout {

        /* renamed from: a */
        public final int f3786a;

        /* renamed from: b */
        public View f3787b;

        /* renamed from: c */
        public int f3788c;

        /* renamed from: d */
        public Path f3789d;

        /* renamed from: e */
        public Paint f3790e;

        /* renamed from: f */
        public Position f3791f;

        /* renamed from: g */
        public ALIGN f3792g;

        /* renamed from: h */
        public boolean f3793h;

        /* renamed from: i */
        public boolean f3794i;

        /* renamed from: j */
        public long f3795j;

        /* renamed from: k */
        public InterfaceC3603f f3796k;

        /* renamed from: l */
        public int f3797l;

        /* renamed from: m */
        public int f3798m;

        /* renamed from: n */
        public int f3799n;

        /* renamed from: o */
        public int f3800o;

        /* renamed from: p */
        public int f3801p;

        /* renamed from: q */
        public Rect f3802q;

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C3604g.m4510a(C3604g.this);
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$b */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ Animator.AnimatorListener f3804a;

            public b(Animator.AnimatorListener animatorListener) {
                this.f3804a = animatorListener;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f3804a.onAnimationEnd(animator);
                C3604g.m4511b(C3604g.this);
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$c */
        public class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C3604g.this.f3793h) {
                    C3604g.this.m4518i();
                }
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3604g.this.m4518i();
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$e */
        public class e extends AnimatorListenerAdapter {
            public e() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (C3604g.this.getParent() != null) {
                    ((ViewGroup) C3604g.this.getParent()).removeView(C3604g.this);
                }
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$f */
        public class f implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final /* synthetic */ Rect f3809a;

            public f(Rect rect) {
                this.f3809a = rect;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                C3604g.this.m4517h(this.f3809a);
                C3604g.this.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        }

        public C3604g(Context context) {
            super(context);
            this.f3786a = 15;
            this.f3788c = Color.parseColor("#B2299EE3");
            this.f3791f = Position.BOTTOM;
            this.f3792g = ALIGN.CENTER;
            this.f3794i = true;
            this.f3795j = 4000L;
            this.f3796k = new C3600c();
            this.f3797l = 30;
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.f3787b = textView;
            textView.setTextColor(-1);
            addView(this.f3787b, -2, -2);
            this.f3787b.setPadding(0, 0, 0, 0);
            Paint paint = new Paint(1);
            this.f3790e = paint;
            paint.setColor(this.f3788c);
            this.f3790e.setStyle(Paint.Style.FILL);
            int iM4073f = AbstractC3531f.m4073f(getContext(), R$attr.xui_tip_popup_padding_top);
            this.f3799n = iM4073f;
            this.f3798m = iM4073f;
            int iM4073f2 = AbstractC3531f.m4073f(getContext(), R$attr.xui_tip_popup_padding_left);
            this.f3801p = iM4073f2;
            this.f3800o = iM4073f2;
            setTextTypeFace(AbstractC3799b.m4959b());
        }

        /* renamed from: a */
        public static /* synthetic */ InterfaceC3601d m4510a(C3604g c3604g) {
            c3604g.getClass();
            return null;
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC3602e m4511b(C3604g c3604g) {
            c3604g.getClass();
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m4514e(android.graphics.Rect r8, int r9) {
            /*
                r7 = this;
                android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f3791f
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r2 = com.xuexiang.xui.widget.popupwindow.ViewTooltip.Position.LEFT
                r3 = 1
                if (r1 != r2) goto L18
                int r1 = r7.getWidth()
                int r2 = r8.left
                if (r1 <= r2) goto L18
                int r2 = r2 + (-30)
                r0.width = r2
                goto L7b
            L18:
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f3791f
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r2 = com.xuexiang.xui.widget.popupwindow.ViewTooltip.Position.RIGHT
                if (r1 != r2) goto L2f
                int r1 = r8.right
                int r2 = r7.getWidth()
                int r1 = r1 + r2
                if (r1 <= r9) goto L2f
                int r8 = r8.right
                int r9 = r9 - r8
                int r9 = r9 + (-30)
                r0.width = r9
                goto L7b
            L2f:
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f3791f
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r2 = com.xuexiang.xui.widget.popupwindow.ViewTooltip.Position.TOP
                if (r1 == r2) goto L39
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r2 = com.xuexiang.xui.widget.popupwindow.ViewTooltip.Position.BOTTOM
                if (r1 != r2) goto L7a
            L39:
                int r1 = r7.getWidth()
                int r2 = r8.width()
                int r1 = r1 - r2
                float r1 = (float) r1
                r2 = 1073741824(0x40000000, float:2.0)
                float r1 = r1 / r2
                int r2 = r8.right
                float r4 = (float) r2
                float r4 = r4 + r1
                float r9 = (float) r9
                int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                r5 = 1106247680(0x41f00000, float:30.0)
                if (r4 <= 0) goto L62
                float r4 = (float) r2
                float r4 = r4 + r1
                float r4 = r4 - r9
                float r4 = r4 + r5
                int r9 = r8.left
                float r9 = (float) r9
                float r9 = r9 - r4
                int r9 = (int) r9
                r8.left = r9
                float r9 = (float) r2
                float r9 = r9 - r4
                int r9 = (int) r9
                r8.right = r9
                goto L7b
            L62:
                int r9 = r8.left
                float r4 = (float) r9
                float r4 = r4 - r1
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 >= 0) goto L7a
                float r4 = (float) r9
                float r4 = r4 - r1
                float r6 = r6 - r4
                float r6 = r6 + r5
                float r9 = (float) r9
                float r9 = r9 + r6
                int r9 = (int) r9
                r8.left = r9
                float r9 = (float) r2
                float r9 = r9 + r6
                int r9 = (int) r9
                r8.right = r9
                goto L7b
            L7a:
                r3 = 0
            L7b:
                r7.setLayoutParams(r0)
                r7.postInvalidate()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.popupwindow.ViewTooltip.C3604g.m4514e(android.graphics.Rect, int):boolean");
        }

        /* renamed from: f */
        public final Path m4515f(RectF rectF, float f4, float f5, float f6, float f7) {
            Path path = new Path();
            if (this.f3802q == null) {
                return path;
            }
            float f8 = f4 < 0.0f ? 0.0f : f4;
            float f9 = f5 < 0.0f ? 0.0f : f5;
            float f10 = f7 < 0.0f ? 0.0f : f7;
            float f11 = f6 < 0.0f ? 0.0f : f6;
            Position position = this.f3791f;
            Position position2 = Position.RIGHT;
            float f12 = position == position2 ? 15.0f : 0.0f;
            Position position3 = Position.BOTTOM;
            float f13 = position == position3 ? 15.0f : 0.0f;
            Position position4 = Position.LEFT;
            float f14 = position == position4 ? 15.0f : 0.0f;
            Position position5 = Position.TOP;
            float f15 = position != position5 ? 0.0f : 15.0f;
            float f16 = f12 + rectF.left;
            float f17 = f13 + rectF.top;
            float f18 = rectF.right - f14;
            float f19 = rectF.bottom - f15;
            float fCenterX = r3.centerX() - getX();
            float f20 = f8 / 2.0f;
            float f21 = f16 + f20;
            path.moveTo(f21, f17);
            if (this.f3791f == position3) {
                float f22 = 15;
                path.lineTo(fCenterX - f22, f17);
                path.lineTo(fCenterX, rectF.top);
                path.lineTo(f22 + fCenterX, f17);
            }
            float f23 = f9 / 2.0f;
            path.lineTo(f18 - f23, f17);
            path.quadTo(f18, f17, f18, f23 + f17);
            if (this.f3791f == position4) {
                float f24 = f19 / 2.0f;
                float f25 = 15;
                path.lineTo(f18, f24 - f25);
                path.lineTo(rectF.right, f24);
                path.lineTo(f18, f24 + f25);
            }
            float f26 = f11 / 2.0f;
            path.lineTo(f18, f19 - f26);
            path.quadTo(f18, f19, f18 - f26, f19);
            if (this.f3791f == position5) {
                float f27 = 15;
                path.lineTo(fCenterX + f27, f19);
                path.lineTo(fCenterX, rectF.bottom);
                path.lineTo(fCenterX - f27, f19);
            }
            float f28 = f10 / 2.0f;
            path.lineTo(f16 + f28, f19);
            path.quadTo(f16, f19, f16, f19 - f28);
            if (this.f3791f == position2) {
                float f29 = f19 / 2.0f;
                float f30 = 15;
                path.lineTo(f16, f29 + f30);
                path.lineTo(rectF.left, f29);
                path.lineTo(f16, f29 - f30);
            }
            path.lineTo(f16, f17 + f20);
            path.quadTo(f16, f17, f21, f17);
            path.close();
            return path;
        }

        /* renamed from: g */
        public void m4516g() {
            if (this.f3793h) {
                setOnClickListener(new c());
            }
            if (this.f3794i) {
                postDelayed(new d(), this.f3795j);
            }
        }

        /* renamed from: h */
        public final void m4517h(Rect rect) {
            setupPosition(rect);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            int i4 = this.f3797l;
            this.f3789d = m4515f(rectF, i4, i4, i4, i4);
            m4520k();
            m4516g();
        }

        /* renamed from: i */
        public void m4518i() {
            m4521l(new e());
        }

        /* renamed from: j */
        public void m4519j(Rect rect, int i4) {
            this.f3802q = new Rect(rect);
            Rect rect2 = new Rect(rect);
            if (m4514e(rect2, i4)) {
                getViewTreeObserver().addOnPreDrawListener(new f(rect2));
            } else {
                m4517h(rect2);
            }
        }

        /* renamed from: k */
        public void m4520k() {
            this.f3796k.mo4508a(this, new a());
        }

        /* renamed from: l */
        public void m4521l(Animator.AnimatorListener animatorListener) {
            this.f3796k.mo4509b(this, new b(animatorListener));
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Path path = this.f3789d;
            if (path != null) {
                canvas.drawPath(path, this.f3790e);
            }
        }

        @Override // android.view.View
        public void onSizeChanged(int i4, int i5, int i6, int i7) {
            super.onSizeChanged(i4, i5, i6, i7);
            RectF rectF = new RectF(0.0f, 0.0f, i4, i5);
            int i8 = this.f3797l;
            this.f3789d = m4515f(rectF, i8, i8, i8, i8);
        }

        public void setAlign(ALIGN align) {
            this.f3792g = align;
            postInvalidate();
        }

        public void setAutoHide(boolean z3) {
            this.f3794i = z3;
        }

        public void setClickToHide(boolean z3) {
            this.f3793h = z3;
        }

        public void setColor(int i4) {
            this.f3788c = i4;
            this.f3790e.setColor(i4);
            postInvalidate();
        }

        public void setCorner(int i4) {
            this.f3797l = i4;
        }

        public void setCustomView(View view) {
            removeView(this.f3787b);
            this.f3787b = view;
            addView(view, -2, -2);
        }

        public void setDuration(long j4) {
            this.f3795j = j4;
        }

        public void setListenerDisplay(InterfaceC3601d interfaceC3601d) {
        }

        public void setListenerHide(InterfaceC3602e interfaceC3602e) {
        }

        public void setPosition(Position position) {
            this.f3791f = position;
            int i4 = C3599b.f3783a[position.ordinal()];
            if (i4 == 1) {
                setPaddingRelative(this.f3801p, this.f3798m, this.f3800o, this.f3799n + 15);
            } else if (i4 == 2) {
                setPaddingRelative(this.f3801p, this.f3798m + 15, this.f3800o, this.f3799n);
            } else if (i4 == 3) {
                setPaddingRelative(this.f3801p, this.f3798m, this.f3800o + 15, this.f3799n);
            } else if (i4 == 4) {
                setPaddingRelative(this.f3801p + 15, this.f3798m, this.f3800o, this.f3799n);
            }
            postInvalidate();
        }

        public void setText(String str) {
            View view = this.f3787b;
            if (view instanceof TextView) {
                ((TextView) view).setText(Html.fromHtml(str));
            }
            postInvalidate();
        }

        public void setTextColor(int i4) {
            View view = this.f3787b;
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i4);
            }
            postInvalidate();
        }

        public void setTextGravity(int i4) {
            View view = this.f3787b;
            if (view instanceof TextView) {
                ((TextView) view).setGravity(i4);
            }
            postInvalidate();
        }

        public void setTextTypeFace(Typeface typeface) {
            View view = this.f3787b;
            if (view instanceof TextView) {
                ((TextView) view).setTypeface(typeface);
            }
            postInvalidate();
        }

        public void setTooltipAnimation(InterfaceC3603f interfaceC3603f) {
            this.f3796k = interfaceC3603f;
        }

        public void setupPosition(Rect rect) {
            Position position = this.f3791f;
            Position position2 = Position.LEFT;
            if (position != position2 && position != Position.RIGHT) {
                iWidth = this.f3792g == ALIGN.CENTER ? (int) ((rect.width() / 2.0f) - ((getWidth() * 1.0f) / 2.0f)) : 0;
                if (this.f3791f == Position.BOTTOM) {
                    setTranslationY(rect.bottom);
                    setTranslationX(rect.left + iWidth);
                    return;
                } else {
                    setTranslationY(rect.top - getHeight());
                    setTranslationX(rect.left + iWidth);
                    return;
                }
            }
            int height = getHeight();
            int iHeight = rect.height();
            int iMax = Math.max(iHeight, height);
            int iMin = Math.min(iHeight, height);
            int i4 = C3599b.f3784b[this.f3792g.ordinal()];
            if (i4 != 1 && i4 == 2) {
                iWidth = (int) (((iMax * (-1.0f)) / 2.0f) + (iMin / 2.0f));
            }
            if (this.f3791f == position2) {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.left - getWidth());
            } else {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.right);
            }
        }
    }

    public ViewTooltip(View view) {
        this.f3769a = view;
        this.f3770b = new C3604g(m4504d(view.getContext()));
    }

    /* renamed from: e */
    public static ViewTooltip m4502e(View view) {
        return new ViewTooltip(view);
    }

    /* renamed from: c */
    public ViewTooltip m4503c(int i4) {
        this.f3770b.setColor(i4);
        return this;
    }

    /* renamed from: d */
    public Activity m4504d(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: f */
    public ViewTooltip m4505f(Position position) {
        this.f3770b.setPosition(position);
        return this;
    }

    /* renamed from: g */
    public C3604g m4506g() {
        Context context = this.f3770b.getContext();
        if (context != null && (context instanceof Activity)) {
            this.f3769a.postDelayed(new RunnableC3598a((ViewGroup) ((Activity) context).getWindow().getDecorView()), 100L);
        }
        return this.f3770b;
    }

    /* renamed from: h */
    public ViewTooltip m4507h(String str) {
        this.f3770b.setText(str);
        return this;
    }
}
