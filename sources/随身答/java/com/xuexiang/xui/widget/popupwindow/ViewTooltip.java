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
import com.xuexiang.xui.utils.AbstractC6801g;
import p093e3.AbstractC7843b;

/* loaded from: classes4.dex */
public class ViewTooltip {

    /* renamed from: a */
    public final View f7839a;

    /* renamed from: b */
    public final C6885g f7840b;

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
    public class RunnableC6879a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f7849a;

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$a$a */
        public class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final /* synthetic */ Rect f7851a;

            public a(Rect rect) {
                this.f7851a = rect;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ViewTooltip.this.f7840b.m6986j(this.f7851a, RunnableC6879a.this.f7849a.getWidth());
                ViewTooltip.this.f7840b.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        }

        public RunnableC6879a(ViewGroup viewGroup) {
            this.f7849a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            ViewTooltip.this.f7839a.getGlobalVisibleRect(rect);
            int[] iArr = new int[2];
            ViewTooltip.this.f7839a.getLocationOnScreen(iArr);
            rect.left = iArr[0];
            this.f7849a.addView(ViewTooltip.this.f7840b, -2, -2);
            ViewTooltip.this.f7840b.getViewTreeObserver().addOnPreDrawListener(new a(rect));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$b */
    public static /* synthetic */ class C6880b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7853a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f7854b;

        static {
            int[] iArr = new int[ALIGN.values().length];
            f7854b = iArr;
            try {
                iArr[ALIGN.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7854b[ALIGN.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Position.values().length];
            f7853a = iArr2;
            try {
                iArr2[Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7853a[Position.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7853a[Position.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7853a[Position.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$c */
    public static class C6881c implements InterfaceC6884f {

        /* renamed from: a */
        public long f7855a = 400;

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.InterfaceC6884f
        /* renamed from: a */
        public void mo6975a(View view, Animator.AnimatorListener animatorListener) {
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(this.f7855a).setListener(animatorListener);
        }

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.InterfaceC6884f
        /* renamed from: b */
        public void mo6976b(View view, Animator.AnimatorListener animatorListener) {
            view.animate().alpha(0.0f).setDuration(this.f7855a).setListener(animatorListener);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$d */
    public interface InterfaceC6882d {
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$e */
    public interface InterfaceC6883e {
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$f */
    public interface InterfaceC6884f {
        /* renamed from: a */
        void mo6975a(View view, Animator.AnimatorListener animatorListener);

        /* renamed from: b */
        void mo6976b(View view, Animator.AnimatorListener animatorListener);
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g */
    public static class C6885g extends FrameLayout {

        /* renamed from: a */
        public final int f7856a;

        /* renamed from: b */
        public View f7857b;

        /* renamed from: c */
        public int f7858c;

        /* renamed from: d */
        public Path f7859d;

        /* renamed from: e */
        public Paint f7860e;

        /* renamed from: f */
        public Position f7861f;

        /* renamed from: g */
        public ALIGN f7862g;

        /* renamed from: h */
        public boolean f7863h;

        /* renamed from: i */
        public boolean f7864i;

        /* renamed from: j */
        public long f7865j;

        /* renamed from: k */
        public InterfaceC6884f f7866k;

        /* renamed from: l */
        public int f7867l;

        /* renamed from: m */
        public int f7868m;

        /* renamed from: n */
        public int f7869n;

        /* renamed from: o */
        public int f7870o;

        /* renamed from: p */
        public int f7871p;

        /* renamed from: q */
        public Rect f7872q;

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C6885g.m6977a(C6885g.this);
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$b */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ Animator.AnimatorListener f7874a;

            public b(Animator.AnimatorListener animatorListener) {
                this.f7874a = animatorListener;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f7874a.onAnimationEnd(animator);
                C6885g.m6978b(C6885g.this);
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$c */
        public class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C6885g.this.f7863h) {
                    C6885g.this.m6985i();
                }
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C6885g.this.m6985i();
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$e */
        public class e extends AnimatorListenerAdapter {
            public e() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (C6885g.this.getParent() != null) {
                    ((ViewGroup) C6885g.this.getParent()).removeView(C6885g.this);
                }
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$f */
        public class f implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final /* synthetic */ Rect f7879a;

            public f(Rect rect) {
                this.f7879a = rect;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                C6885g.this.m6984h(this.f7879a);
                C6885g.this.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        }

        public C6885g(Context context) {
            super(context);
            this.f7856a = 15;
            this.f7858c = Color.parseColor("#B2299EE3");
            this.f7861f = Position.BOTTOM;
            this.f7862g = ALIGN.CENTER;
            this.f7864i = true;
            this.f7865j = 4000L;
            this.f7866k = new C6881c();
            this.f7867l = 30;
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.f7857b = textView;
            textView.setTextColor(-1);
            addView(this.f7857b, -2, -2);
            this.f7857b.setPadding(0, 0, 0, 0);
            Paint paint = new Paint(1);
            this.f7860e = paint;
            paint.setColor(this.f7858c);
            this.f7860e.setStyle(Paint.Style.FILL);
            int iM6481n = AbstractC6801g.m6481n(getContext(), R$attr.xui_tip_popup_padding_top);
            this.f7869n = iM6481n;
            this.f7868m = iM6481n;
            int iM6481n2 = AbstractC6801g.m6481n(getContext(), R$attr.xui_tip_popup_padding_left);
            this.f7871p = iM6481n2;
            this.f7870o = iM6481n2;
            setTextTypeFace(AbstractC7843b.m12292c());
        }

        /* renamed from: a */
        public static /* synthetic */ InterfaceC6882d m6977a(C6885g c6885g) {
            c6885g.getClass();
            return null;
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC6883e m6978b(C6885g c6885g) {
            c6885g.getClass();
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m6981e(android.graphics.Rect r8, int r9) {
            /*
                r7 = this;
                android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f7861f
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
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f7861f
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
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f7861f
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
            throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.popupwindow.ViewTooltip.C6885g.m6981e(android.graphics.Rect, int):boolean");
        }

        /* renamed from: f */
        public final Path m6982f(RectF rectF, float f10, float f11, float f12, float f13) {
            Path path = new Path();
            if (this.f7872q == null) {
                return path;
            }
            float f14 = f10 < 0.0f ? 0.0f : f10;
            float f15 = f11 < 0.0f ? 0.0f : f11;
            float f16 = f13 < 0.0f ? 0.0f : f13;
            float f17 = f12 < 0.0f ? 0.0f : f12;
            Position position = this.f7861f;
            Position position2 = Position.RIGHT;
            float f18 = position == position2 ? 15.0f : 0.0f;
            Position position3 = Position.BOTTOM;
            float f19 = position == position3 ? 15.0f : 0.0f;
            Position position4 = Position.LEFT;
            float f20 = position == position4 ? 15.0f : 0.0f;
            Position position5 = Position.TOP;
            float f21 = position != position5 ? 0.0f : 15.0f;
            float f22 = f18 + rectF.left;
            float f23 = f19 + rectF.top;
            float f24 = rectF.right - f20;
            float f25 = rectF.bottom - f21;
            float fCenterX = r3.centerX() - getX();
            float f26 = f14 / 2.0f;
            float f27 = f22 + f26;
            path.moveTo(f27, f23);
            float f28 = f15;
            float f29 = f16;
            if (this.f7861f == position3) {
                float f30 = 15;
                path.lineTo(fCenterX - f30, f23);
                path.lineTo(fCenterX, rectF.top);
                path.lineTo(f30 + fCenterX, f23);
            }
            float f31 = f28 / 2.0f;
            path.lineTo(f24 - f31, f23);
            path.quadTo(f24, f23, f24, f31 + f23);
            if (this.f7861f == position4) {
                float f32 = f25 / 2.0f;
                float f33 = 15;
                path.lineTo(f24, f32 - f33);
                path.lineTo(rectF.right, f32);
                path.lineTo(f24, f32 + f33);
            }
            float f34 = f17 / 2.0f;
            path.lineTo(f24, f25 - f34);
            path.quadTo(f24, f25, f24 - f34, f25);
            if (this.f7861f == position5) {
                float f35 = 15;
                path.lineTo(fCenterX + f35, f25);
                path.lineTo(fCenterX, rectF.bottom);
                path.lineTo(fCenterX - f35, f25);
            }
            float f36 = f29 / 2.0f;
            path.lineTo(f22 + f36, f25);
            path.quadTo(f22, f25, f22, f25 - f36);
            if (this.f7861f == position2) {
                float f37 = f25 / 2.0f;
                float f38 = 15;
                path.lineTo(f22, f37 + f38);
                path.lineTo(rectF.left, f37);
                path.lineTo(f22, f37 - f38);
            }
            path.lineTo(f22, f23 + f26);
            path.quadTo(f22, f23, f27, f23);
            path.close();
            return path;
        }

        /* renamed from: g */
        public void m6983g() {
            if (this.f7863h) {
                setOnClickListener(new c());
            }
            if (this.f7864i) {
                postDelayed(new d(), this.f7865j);
            }
        }

        /* renamed from: h */
        public final void m6984h(Rect rect) {
            setupPosition(rect);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            int i9 = this.f7867l;
            this.f7859d = m6982f(rectF, i9, i9, i9, i9);
            m6987k();
            m6983g();
        }

        /* renamed from: i */
        public void m6985i() {
            m6988l(new e());
        }

        /* renamed from: j */
        public void m6986j(Rect rect, int i9) {
            this.f7872q = new Rect(rect);
            Rect rect2 = new Rect(rect);
            if (m6981e(rect2, i9)) {
                getViewTreeObserver().addOnPreDrawListener(new f(rect2));
            } else {
                m6984h(rect2);
            }
        }

        /* renamed from: k */
        public void m6987k() {
            this.f7866k.mo6975a(this, new a());
        }

        /* renamed from: l */
        public void m6988l(Animator.AnimatorListener animatorListener) {
            this.f7866k.mo6976b(this, new b(animatorListener));
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Path path = this.f7859d;
            if (path != null) {
                canvas.drawPath(path, this.f7860e);
            }
        }

        @Override // android.view.View
        public void onSizeChanged(int i9, int i10, int i11, int i12) {
            super.onSizeChanged(i9, i10, i11, i12);
            RectF rectF = new RectF(0.0f, 0.0f, i9, i10);
            int i13 = this.f7867l;
            this.f7859d = m6982f(rectF, i13, i13, i13, i13);
        }

        public void setAlign(ALIGN align) {
            this.f7862g = align;
            postInvalidate();
        }

        public void setAutoHide(boolean z9) {
            this.f7864i = z9;
        }

        public void setClickToHide(boolean z9) {
            this.f7863h = z9;
        }

        public void setColor(int i9) {
            this.f7858c = i9;
            this.f7860e.setColor(i9);
            postInvalidate();
        }

        public void setCorner(int i9) {
            this.f7867l = i9;
        }

        public void setCustomView(View view) {
            removeView(this.f7857b);
            this.f7857b = view;
            addView(view, -2, -2);
        }

        public void setDuration(long j9) {
            this.f7865j = j9;
        }

        public void setListenerDisplay(InterfaceC6882d interfaceC6882d) {
        }

        public void setListenerHide(InterfaceC6883e interfaceC6883e) {
        }

        public void setPosition(Position position) {
            this.f7861f = position;
            int i9 = C6880b.f7853a[position.ordinal()];
            if (i9 == 1) {
                setPaddingRelative(this.f7871p, this.f7868m, this.f7870o, this.f7869n + 15);
            } else if (i9 == 2) {
                setPaddingRelative(this.f7871p, this.f7868m + 15, this.f7870o, this.f7869n);
            } else if (i9 == 3) {
                setPaddingRelative(this.f7871p, this.f7868m, this.f7870o + 15, this.f7869n);
            } else if (i9 == 4) {
                setPaddingRelative(this.f7871p + 15, this.f7868m, this.f7870o, this.f7869n);
            }
            postInvalidate();
        }

        public void setText(String str) {
            View view = this.f7857b;
            if (view instanceof TextView) {
                ((TextView) view).setText(Html.fromHtml(str));
            }
            postInvalidate();
        }

        public void setTextColor(int i9) {
            View view = this.f7857b;
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i9);
            }
            postInvalidate();
        }

        public void setTextGravity(int i9) {
            View view = this.f7857b;
            if (view instanceof TextView) {
                ((TextView) view).setGravity(i9);
            }
            postInvalidate();
        }

        public void setTextTypeFace(Typeface typeface) {
            View view = this.f7857b;
            if (view instanceof TextView) {
                ((TextView) view).setTypeface(typeface);
            }
            postInvalidate();
        }

        public void setTooltipAnimation(InterfaceC6884f interfaceC6884f) {
            this.f7866k = interfaceC6884f;
        }

        public void setupPosition(Rect rect) {
            Position position = this.f7861f;
            Position position2 = Position.LEFT;
            if (position != position2 && position != Position.RIGHT) {
                iWidth = this.f7862g == ALIGN.CENTER ? (int) ((rect.width() / 2.0f) - ((getWidth() * 1.0f) / 2.0f)) : 0;
                if (this.f7861f == Position.BOTTOM) {
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
            int i9 = C6880b.f7854b[this.f7862g.ordinal()];
            if (i9 != 1 && i9 == 2) {
                iWidth = (int) (((iMax * (-1.0f)) / 2.0f) + (iMin / 2.0f));
            }
            if (this.f7861f == position2) {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.left - getWidth());
            } else {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.right);
            }
        }
    }

    public ViewTooltip(View view) {
        this.f7839a = view;
        this.f7840b = new C6885g(m6971d(view.getContext()));
    }

    /* renamed from: e */
    public static ViewTooltip m6969e(View view) {
        return new ViewTooltip(view);
    }

    /* renamed from: c */
    public ViewTooltip m6970c(int i9) {
        this.f7840b.setColor(i9);
        return this;
    }

    /* renamed from: d */
    public Activity m6971d(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: f */
    public ViewTooltip m6972f(Position position) {
        this.f7840b.setPosition(position);
        return this;
    }

    /* renamed from: g */
    public C6885g m6973g() {
        Context context = this.f7840b.getContext();
        if (context != null && (context instanceof Activity)) {
            this.f7839a.postDelayed(new RunnableC6879a((ViewGroup) ((Activity) context).getWindow().getDecorView()), 100L);
        }
        return this.f7840b;
    }

    /* renamed from: h */
    public ViewTooltip m6974h(String str) {
        this.f7840b.setText(str);
        return this;
    }
}
