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
import com.xuexiang.xui.utils.AbstractC5859g;
import p126p1.AbstractC7591b;

/* loaded from: classes3.dex */
public class ViewTooltip {

    /* renamed from: a */
    public final View f5290a;

    /* renamed from: b */
    public final C5943g f5291b;

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
    public class RunnableC5937a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f5300a;

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$a$a */
        public class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final /* synthetic */ Rect f5302a;

            public a(Rect rect) {
                this.f5302a = rect;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ViewTooltip.this.f5291b.m4897j(this.f5302a, RunnableC5937a.this.f5300a.getWidth());
                ViewTooltip.this.f5291b.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        }

        public RunnableC5937a(ViewGroup viewGroup) {
            this.f5300a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            ViewTooltip.this.f5290a.getGlobalVisibleRect(rect);
            int[] iArr = new int[2];
            ViewTooltip.this.f5290a.getLocationOnScreen(iArr);
            rect.left = iArr[0];
            this.f5300a.addView(ViewTooltip.this.f5291b, -2, -2);
            ViewTooltip.this.f5291b.getViewTreeObserver().addOnPreDrawListener(new a(rect));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$b */
    public static /* synthetic */ class C5938b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5304a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f5305b;

        static {
            int[] iArr = new int[ALIGN.values().length];
            f5305b = iArr;
            try {
                iArr[ALIGN.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5305b[ALIGN.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Position.values().length];
            f5304a = iArr2;
            try {
                iArr2[Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5304a[Position.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5304a[Position.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5304a[Position.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$c */
    public static class C5939c implements InterfaceC5942f {

        /* renamed from: a */
        public long f5306a = 400;

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.InterfaceC5942f
        /* renamed from: a */
        public void mo4886a(View view, Animator.AnimatorListener animatorListener) {
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(this.f5306a).setListener(animatorListener);
        }

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.InterfaceC5942f
        /* renamed from: b */
        public void mo4887b(View view, Animator.AnimatorListener animatorListener) {
            view.animate().alpha(0.0f).setDuration(this.f5306a).setListener(animatorListener);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$d */
    public interface InterfaceC5940d {
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$e */
    public interface InterfaceC5941e {
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$f */
    public interface InterfaceC5942f {
        /* renamed from: a */
        void mo4886a(View view, Animator.AnimatorListener animatorListener);

        /* renamed from: b */
        void mo4887b(View view, Animator.AnimatorListener animatorListener);
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g */
    public static class C5943g extends FrameLayout {

        /* renamed from: a */
        public final int f5307a;

        /* renamed from: b */
        public View f5308b;

        /* renamed from: c */
        public int f5309c;

        /* renamed from: d */
        public Path f5310d;

        /* renamed from: e */
        public Paint f5311e;

        /* renamed from: f */
        public Position f5312f;

        /* renamed from: g */
        public ALIGN f5313g;

        /* renamed from: h */
        public boolean f5314h;

        /* renamed from: i */
        public boolean f5315i;

        /* renamed from: j */
        public long f5316j;

        /* renamed from: k */
        public InterfaceC5942f f5317k;

        /* renamed from: l */
        public int f5318l;

        /* renamed from: m */
        public int f5319m;

        /* renamed from: n */
        public int f5320n;

        /* renamed from: o */
        public int f5321o;

        /* renamed from: p */
        public int f5322p;

        /* renamed from: q */
        public Rect f5323q;

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C5943g.m4888a(C5943g.this);
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$b */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ Animator.AnimatorListener f5325a;

            public b(Animator.AnimatorListener animatorListener) {
                this.f5325a = animatorListener;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f5325a.onAnimationEnd(animator);
                C5943g.m4889b(C5943g.this);
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$c */
        public class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C5943g.this.f5314h) {
                    C5943g.this.m4896i();
                }
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5943g.this.m4896i();
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$e */
        public class e extends AnimatorListenerAdapter {
            public e() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (C5943g.this.getParent() != null) {
                    ((ViewGroup) C5943g.this.getParent()).removeView(C5943g.this);
                }
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$f */
        public class f implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final /* synthetic */ Rect f5330a;

            public f(Rect rect) {
                this.f5330a = rect;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                C5943g.this.m4895h(this.f5330a);
                C5943g.this.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        }

        public C5943g(Context context) {
            super(context);
            this.f5307a = 15;
            this.f5309c = Color.parseColor("#B2299EE3");
            this.f5312f = Position.BOTTOM;
            this.f5313g = ALIGN.CENTER;
            this.f5315i = true;
            this.f5316j = 4000L;
            this.f5317k = new C5939c();
            this.f5318l = 30;
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.f5308b = textView;
            textView.setTextColor(-1);
            addView(this.f5308b, -2, -2);
            this.f5308b.setPadding(0, 0, 0, 0);
            Paint paint = new Paint(1);
            this.f5311e = paint;
            paint.setColor(this.f5309c);
            this.f5311e.setStyle(Paint.Style.FILL);
            int iM4389o = AbstractC5859g.m4389o(getContext(), R$attr.xui_tip_popup_padding_top);
            this.f5320n = iM4389o;
            this.f5319m = iM4389o;
            int iM4389o2 = AbstractC5859g.m4389o(getContext(), R$attr.xui_tip_popup_padding_left);
            this.f5322p = iM4389o2;
            this.f5321o = iM4389o2;
            setTextTypeFace(AbstractC7591b.m9000c());
        }

        /* renamed from: a */
        public static /* synthetic */ InterfaceC5940d m4888a(C5943g c5943g) {
            c5943g.getClass();
            return null;
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC5941e m4889b(C5943g c5943g) {
            c5943g.getClass();
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m4892e(android.graphics.Rect r8, int r9) {
            /*
                r7 = this;
                android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f5312f
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
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f5312f
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
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f5312f
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
            throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.popupwindow.ViewTooltip.C5943g.m4892e(android.graphics.Rect, int):boolean");
        }

        /* renamed from: f */
        public final Path m4893f(RectF rectF, float f6, float f7, float f8, float f9) {
            Path path = new Path();
            if (this.f5323q == null) {
                return path;
            }
            float f10 = f6 < 0.0f ? 0.0f : f6;
            float f11 = f7 < 0.0f ? 0.0f : f7;
            float f12 = f9 < 0.0f ? 0.0f : f9;
            float f13 = f8 < 0.0f ? 0.0f : f8;
            Position position = this.f5312f;
            Position position2 = Position.RIGHT;
            float f14 = position == position2 ? 15.0f : 0.0f;
            Position position3 = Position.BOTTOM;
            float f15 = position == position3 ? 15.0f : 0.0f;
            Position position4 = Position.LEFT;
            float f16 = position == position4 ? 15.0f : 0.0f;
            Position position5 = Position.TOP;
            float f17 = position != position5 ? 0.0f : 15.0f;
            float f18 = f14 + rectF.left;
            float f19 = f15 + rectF.top;
            float f20 = rectF.right - f16;
            float f21 = rectF.bottom - f17;
            float fCenterX = r3.centerX() - getX();
            float f22 = f10 / 2.0f;
            float f23 = f18 + f22;
            path.moveTo(f23, f19);
            float f24 = f11;
            float f25 = f12;
            if (this.f5312f == position3) {
                float f26 = 15;
                path.lineTo(fCenterX - f26, f19);
                path.lineTo(fCenterX, rectF.top);
                path.lineTo(f26 + fCenterX, f19);
            }
            float f27 = f24 / 2.0f;
            path.lineTo(f20 - f27, f19);
            path.quadTo(f20, f19, f20, f27 + f19);
            if (this.f5312f == position4) {
                float f28 = f21 / 2.0f;
                float f29 = 15;
                path.lineTo(f20, f28 - f29);
                path.lineTo(rectF.right, f28);
                path.lineTo(f20, f28 + f29);
            }
            float f30 = f13 / 2.0f;
            path.lineTo(f20, f21 - f30);
            path.quadTo(f20, f21, f20 - f30, f21);
            if (this.f5312f == position5) {
                float f31 = 15;
                path.lineTo(fCenterX + f31, f21);
                path.lineTo(fCenterX, rectF.bottom);
                path.lineTo(fCenterX - f31, f21);
            }
            float f32 = f25 / 2.0f;
            path.lineTo(f18 + f32, f21);
            path.quadTo(f18, f21, f18, f21 - f32);
            if (this.f5312f == position2) {
                float f33 = f21 / 2.0f;
                float f34 = 15;
                path.lineTo(f18, f33 + f34);
                path.lineTo(rectF.left, f33);
                path.lineTo(f18, f33 - f34);
            }
            path.lineTo(f18, f19 + f22);
            path.quadTo(f18, f19, f23, f19);
            path.close();
            return path;
        }

        /* renamed from: g */
        public void m4894g() {
            if (this.f5314h) {
                setOnClickListener(new c());
            }
            if (this.f5315i) {
                postDelayed(new d(), this.f5316j);
            }
        }

        /* renamed from: h */
        public final void m4895h(Rect rect) {
            setupPosition(rect);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            int i6 = this.f5318l;
            this.f5310d = m4893f(rectF, i6, i6, i6, i6);
            m4898k();
            m4894g();
        }

        /* renamed from: i */
        public void m4896i() {
            m4899l(new e());
        }

        /* renamed from: j */
        public void m4897j(Rect rect, int i6) {
            this.f5323q = new Rect(rect);
            Rect rect2 = new Rect(rect);
            if (m4892e(rect2, i6)) {
                getViewTreeObserver().addOnPreDrawListener(new f(rect2));
            } else {
                m4895h(rect2);
            }
        }

        /* renamed from: k */
        public void m4898k() {
            this.f5317k.mo4886a(this, new a());
        }

        /* renamed from: l */
        public void m4899l(Animator.AnimatorListener animatorListener) {
            this.f5317k.mo4887b(this, new b(animatorListener));
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Path path = this.f5310d;
            if (path != null) {
                canvas.drawPath(path, this.f5311e);
            }
        }

        @Override // android.view.View
        public void onSizeChanged(int i6, int i7, int i8, int i9) {
            super.onSizeChanged(i6, i7, i8, i9);
            RectF rectF = new RectF(0.0f, 0.0f, i6, i7);
            int i10 = this.f5318l;
            this.f5310d = m4893f(rectF, i10, i10, i10, i10);
        }

        public void setAlign(ALIGN align) {
            this.f5313g = align;
            postInvalidate();
        }

        public void setAutoHide(boolean z6) {
            this.f5315i = z6;
        }

        public void setClickToHide(boolean z6) {
            this.f5314h = z6;
        }

        public void setColor(int i6) {
            this.f5309c = i6;
            this.f5311e.setColor(i6);
            postInvalidate();
        }

        public void setCorner(int i6) {
            this.f5318l = i6;
        }

        public void setCustomView(View view) {
            removeView(this.f5308b);
            this.f5308b = view;
            addView(view, -2, -2);
        }

        public void setDuration(long j6) {
            this.f5316j = j6;
        }

        public void setListenerDisplay(InterfaceC5940d interfaceC5940d) {
        }

        public void setListenerHide(InterfaceC5941e interfaceC5941e) {
        }

        public void setPosition(Position position) {
            this.f5312f = position;
            int i6 = C5938b.f5304a[position.ordinal()];
            if (i6 == 1) {
                setPaddingRelative(this.f5322p, this.f5319m, this.f5321o, this.f5320n + 15);
            } else if (i6 == 2) {
                setPaddingRelative(this.f5322p, this.f5319m + 15, this.f5321o, this.f5320n);
            } else if (i6 == 3) {
                setPaddingRelative(this.f5322p, this.f5319m, this.f5321o + 15, this.f5320n);
            } else if (i6 == 4) {
                setPaddingRelative(this.f5322p + 15, this.f5319m, this.f5321o, this.f5320n);
            }
            postInvalidate();
        }

        public void setText(String str) {
            View view = this.f5308b;
            if (view instanceof TextView) {
                ((TextView) view).setText(Html.fromHtml(str));
            }
            postInvalidate();
        }

        public void setTextColor(int i6) {
            View view = this.f5308b;
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i6);
            }
            postInvalidate();
        }

        public void setTextGravity(int i6) {
            View view = this.f5308b;
            if (view instanceof TextView) {
                ((TextView) view).setGravity(i6);
            }
            postInvalidate();
        }

        public void setTextTypeFace(Typeface typeface) {
            View view = this.f5308b;
            if (view instanceof TextView) {
                ((TextView) view).setTypeface(typeface);
            }
            postInvalidate();
        }

        public void setTooltipAnimation(InterfaceC5942f interfaceC5942f) {
            this.f5317k = interfaceC5942f;
        }

        public void setupPosition(Rect rect) {
            Position position = this.f5312f;
            Position position2 = Position.LEFT;
            if (position != position2 && position != Position.RIGHT) {
                iWidth = this.f5313g == ALIGN.CENTER ? (int) ((rect.width() / 2.0f) - ((getWidth() * 1.0f) / 2.0f)) : 0;
                if (this.f5312f == Position.BOTTOM) {
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
            int i6 = C5938b.f5305b[this.f5313g.ordinal()];
            if (i6 != 1 && i6 == 2) {
                iWidth = (int) (((iMax * (-1.0f)) / 2.0f) + (iMin / 2.0f));
            }
            if (this.f5312f == position2) {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.left - getWidth());
            } else {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.right);
            }
        }
    }

    public ViewTooltip(View view) {
        this.f5290a = view;
        this.f5291b = new C5943g(m4882d(view.getContext()));
    }

    /* renamed from: e */
    public static ViewTooltip m4880e(View view) {
        return new ViewTooltip(view);
    }

    /* renamed from: c */
    public ViewTooltip m4881c(int i6) {
        this.f5291b.setColor(i6);
        return this;
    }

    /* renamed from: d */
    public Activity m4882d(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: f */
    public ViewTooltip m4883f(Position position) {
        this.f5291b.setPosition(position);
        return this;
    }

    /* renamed from: g */
    public C5943g m4884g() {
        Context context = this.f5291b.getContext();
        if (context != null && (context instanceof Activity)) {
            this.f5290a.postDelayed(new RunnableC5937a((ViewGroup) ((Activity) context).getWindow().getDecorView()), 100L);
        }
        return this.f5291b;
    }

    /* renamed from: h */
    public ViewTooltip m4885h(String str) {
        this.f5291b.setText(str);
        return this;
    }
}
