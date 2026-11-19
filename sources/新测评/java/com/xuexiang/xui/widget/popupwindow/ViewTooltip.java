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
import com.xuexiang.xui.utils.AbstractC6482g;
import p186o2.AbstractC8697b;

/* loaded from: classes4.dex */
public class ViewTooltip {

    /* renamed from: a */
    public final View f6581a;

    /* renamed from: b */
    public final C6565g f6582b;

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
    public class RunnableC6559a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f6591a;

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$a$a */
        public class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final /* synthetic */ Rect f6593a;

            public a(Rect rect) {
                this.f6593a = rect;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ViewTooltip.this.f6582b.m5888j(this.f6593a, RunnableC6559a.this.f6591a.getWidth());
                ViewTooltip.this.f6582b.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        }

        public RunnableC6559a(ViewGroup viewGroup) {
            this.f6591a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            ViewTooltip.this.f6581a.getGlobalVisibleRect(rect);
            int[] iArr = new int[2];
            ViewTooltip.this.f6581a.getLocationOnScreen(iArr);
            rect.left = iArr[0];
            this.f6591a.addView(ViewTooltip.this.f6582b, -2, -2);
            ViewTooltip.this.f6582b.getViewTreeObserver().addOnPreDrawListener(new a(rect));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$b */
    public static /* synthetic */ class C6560b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6595a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f6596b;

        static {
            int[] iArr = new int[ALIGN.values().length];
            f6596b = iArr;
            try {
                iArr[ALIGN.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6596b[ALIGN.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Position.values().length];
            f6595a = iArr2;
            try {
                iArr2[Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6595a[Position.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6595a[Position.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6595a[Position.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$c */
    public static class C6561c implements InterfaceC6564f {

        /* renamed from: a */
        public long f6597a = 400;

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.InterfaceC6564f
        /* renamed from: a */
        public void mo5877a(View view, Animator.AnimatorListener animatorListener) {
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(this.f6597a).setListener(animatorListener);
        }

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.InterfaceC6564f
        /* renamed from: b */
        public void mo5878b(View view, Animator.AnimatorListener animatorListener) {
            view.animate().alpha(0.0f).setDuration(this.f6597a).setListener(animatorListener);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$d */
    public interface InterfaceC6562d {
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$e */
    public interface InterfaceC6563e {
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$f */
    public interface InterfaceC6564f {
        /* renamed from: a */
        void mo5877a(View view, Animator.AnimatorListener animatorListener);

        /* renamed from: b */
        void mo5878b(View view, Animator.AnimatorListener animatorListener);
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g */
    public static class C6565g extends FrameLayout {

        /* renamed from: a */
        public final int f6598a;

        /* renamed from: b */
        public View f6599b;

        /* renamed from: c */
        public int f6600c;

        /* renamed from: d */
        public Path f6601d;

        /* renamed from: e */
        public Paint f6602e;

        /* renamed from: f */
        public Position f6603f;

        /* renamed from: g */
        public ALIGN f6604g;

        /* renamed from: h */
        public boolean f6605h;

        /* renamed from: i */
        public boolean f6606i;

        /* renamed from: j */
        public long f6607j;

        /* renamed from: k */
        public InterfaceC6564f f6608k;

        /* renamed from: l */
        public int f6609l;

        /* renamed from: m */
        public int f6610m;

        /* renamed from: n */
        public int f6611n;

        /* renamed from: o */
        public int f6612o;

        /* renamed from: p */
        public int f6613p;

        /* renamed from: q */
        public Rect f6614q;

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C6565g.m5879a(C6565g.this);
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$b */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ Animator.AnimatorListener f6616a;

            public b(Animator.AnimatorListener animatorListener) {
                this.f6616a = animatorListener;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f6616a.onAnimationEnd(animator);
                C6565g.m5880b(C6565g.this);
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$c */
        public class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C6565g.this.f6605h) {
                    C6565g.this.m5887i();
                }
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C6565g.this.m5887i();
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$e */
        public class e extends AnimatorListenerAdapter {
            public e() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (C6565g.this.getParent() != null) {
                    ((ViewGroup) C6565g.this.getParent()).removeView(C6565g.this);
                }
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$f */
        public class f implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final /* synthetic */ Rect f6621a;

            public f(Rect rect) {
                this.f6621a = rect;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                C6565g.this.m5886h(this.f6621a);
                C6565g.this.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        }

        public C6565g(Context context) {
            super(context);
            this.f6598a = 15;
            this.f6600c = Color.parseColor("#B2299EE3");
            this.f6603f = Position.BOTTOM;
            this.f6604g = ALIGN.CENTER;
            this.f6606i = true;
            this.f6607j = 4000L;
            this.f6608k = new C6561c();
            this.f6609l = 30;
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.f6599b = textView;
            textView.setTextColor(-1);
            addView(this.f6599b, -2, -2);
            this.f6599b.setPadding(0, 0, 0, 0);
            Paint paint = new Paint(1);
            this.f6602e = paint;
            paint.setColor(this.f6600c);
            this.f6602e.setStyle(Paint.Style.FILL);
            int iM5384o = AbstractC6482g.m5384o(getContext(), R$attr.xui_tip_popup_padding_top);
            this.f6611n = iM5384o;
            this.f6610m = iM5384o;
            int iM5384o2 = AbstractC6482g.m5384o(getContext(), R$attr.xui_tip_popup_padding_left);
            this.f6613p = iM5384o2;
            this.f6612o = iM5384o2;
            setTextTypeFace(AbstractC8697b.m14301c());
        }

        /* renamed from: a */
        public static /* synthetic */ InterfaceC6562d m5879a(C6565g c6565g) {
            c6565g.getClass();
            return null;
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC6563e m5880b(C6565g c6565g) {
            c6565g.getClass();
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m5883e(android.graphics.Rect r8, int r9) {
            /*
                r7 = this;
                android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f6603f
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
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f6603f
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
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f6603f
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
            throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.popupwindow.ViewTooltip.C6565g.m5883e(android.graphics.Rect, int):boolean");
        }

        /* renamed from: f */
        public final Path m5884f(RectF rectF, float f10, float f11, float f12, float f13) {
            Path path = new Path();
            if (this.f6614q == null) {
                return path;
            }
            float f14 = f10 < 0.0f ? 0.0f : f10;
            float f15 = f11 < 0.0f ? 0.0f : f11;
            float f16 = f13 < 0.0f ? 0.0f : f13;
            float f17 = f12 < 0.0f ? 0.0f : f12;
            Position position = this.f6603f;
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
            if (this.f6603f == position3) {
                float f30 = 15;
                path.lineTo(fCenterX - f30, f23);
                path.lineTo(fCenterX, rectF.top);
                path.lineTo(f30 + fCenterX, f23);
            }
            float f31 = f28 / 2.0f;
            path.lineTo(f24 - f31, f23);
            path.quadTo(f24, f23, f24, f31 + f23);
            if (this.f6603f == position4) {
                float f32 = f25 / 2.0f;
                float f33 = 15;
                path.lineTo(f24, f32 - f33);
                path.lineTo(rectF.right, f32);
                path.lineTo(f24, f32 + f33);
            }
            float f34 = f17 / 2.0f;
            path.lineTo(f24, f25 - f34);
            path.quadTo(f24, f25, f24 - f34, f25);
            if (this.f6603f == position5) {
                float f35 = 15;
                path.lineTo(fCenterX + f35, f25);
                path.lineTo(fCenterX, rectF.bottom);
                path.lineTo(fCenterX - f35, f25);
            }
            float f36 = f29 / 2.0f;
            path.lineTo(f22 + f36, f25);
            path.quadTo(f22, f25, f22, f25 - f36);
            if (this.f6603f == position2) {
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
        public void m5885g() {
            if (this.f6605h) {
                setOnClickListener(new c());
            }
            if (this.f6606i) {
                postDelayed(new d(), this.f6607j);
            }
        }

        /* renamed from: h */
        public final void m5886h(Rect rect) {
            setupPosition(rect);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            int i10 = this.f6609l;
            this.f6601d = m5884f(rectF, i10, i10, i10, i10);
            m5889k();
            m5885g();
        }

        /* renamed from: i */
        public void m5887i() {
            m5890l(new e());
        }

        /* renamed from: j */
        public void m5888j(Rect rect, int i10) {
            this.f6614q = new Rect(rect);
            Rect rect2 = new Rect(rect);
            if (m5883e(rect2, i10)) {
                getViewTreeObserver().addOnPreDrawListener(new f(rect2));
            } else {
                m5886h(rect2);
            }
        }

        /* renamed from: k */
        public void m5889k() {
            this.f6608k.mo5877a(this, new a());
        }

        /* renamed from: l */
        public void m5890l(Animator.AnimatorListener animatorListener) {
            this.f6608k.mo5878b(this, new b(animatorListener));
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Path path = this.f6601d;
            if (path != null) {
                canvas.drawPath(path, this.f6602e);
            }
        }

        @Override // android.view.View
        public void onSizeChanged(int i10, int i11, int i12, int i13) {
            super.onSizeChanged(i10, i11, i12, i13);
            RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
            int i14 = this.f6609l;
            this.f6601d = m5884f(rectF, i14, i14, i14, i14);
        }

        public void setAlign(ALIGN align) {
            this.f6604g = align;
            postInvalidate();
        }

        public void setAutoHide(boolean z9) {
            this.f6606i = z9;
        }

        public void setClickToHide(boolean z9) {
            this.f6605h = z9;
        }

        public void setColor(int i10) {
            this.f6600c = i10;
            this.f6602e.setColor(i10);
            postInvalidate();
        }

        public void setCorner(int i10) {
            this.f6609l = i10;
        }

        public void setCustomView(View view) {
            removeView(this.f6599b);
            this.f6599b = view;
            addView(view, -2, -2);
        }

        public void setDuration(long j10) {
            this.f6607j = j10;
        }

        public void setListenerDisplay(InterfaceC6562d interfaceC6562d) {
        }

        public void setListenerHide(InterfaceC6563e interfaceC6563e) {
        }

        public void setPosition(Position position) {
            this.f6603f = position;
            int i10 = C6560b.f6595a[position.ordinal()];
            if (i10 == 1) {
                setPaddingRelative(this.f6613p, this.f6610m, this.f6612o, this.f6611n + 15);
            } else if (i10 == 2) {
                setPaddingRelative(this.f6613p, this.f6610m + 15, this.f6612o, this.f6611n);
            } else if (i10 == 3) {
                setPaddingRelative(this.f6613p, this.f6610m, this.f6612o + 15, this.f6611n);
            } else if (i10 == 4) {
                setPaddingRelative(this.f6613p + 15, this.f6610m, this.f6612o, this.f6611n);
            }
            postInvalidate();
        }

        public void setText(String str) {
            View view = this.f6599b;
            if (view instanceof TextView) {
                ((TextView) view).setText(Html.fromHtml(str));
            }
            postInvalidate();
        }

        public void setTextColor(int i10) {
            View view = this.f6599b;
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            }
            postInvalidate();
        }

        public void setTextGravity(int i10) {
            View view = this.f6599b;
            if (view instanceof TextView) {
                ((TextView) view).setGravity(i10);
            }
            postInvalidate();
        }

        public void setTextTypeFace(Typeface typeface) {
            View view = this.f6599b;
            if (view instanceof TextView) {
                ((TextView) view).setTypeface(typeface);
            }
            postInvalidate();
        }

        public void setTooltipAnimation(InterfaceC6564f interfaceC6564f) {
            this.f6608k = interfaceC6564f;
        }

        public void setupPosition(Rect rect) {
            Position position = this.f6603f;
            Position position2 = Position.LEFT;
            if (position != position2 && position != Position.RIGHT) {
                iWidth = this.f6604g == ALIGN.CENTER ? (int) ((rect.width() / 2.0f) - ((getWidth() * 1.0f) / 2.0f)) : 0;
                if (this.f6603f == Position.BOTTOM) {
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
            int i10 = C6560b.f6596b[this.f6604g.ordinal()];
            if (i10 != 1 && i10 == 2) {
                iWidth = (int) (((iMax * (-1.0f)) / 2.0f) + (iMin / 2.0f));
            }
            if (this.f6603f == position2) {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.left - getWidth());
            } else {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.right);
            }
        }
    }

    public ViewTooltip(View view) {
        this.f6581a = view;
        this.f6582b = new C6565g(m5873d(view.getContext()));
    }

    /* renamed from: e */
    public static ViewTooltip m5871e(View view) {
        return new ViewTooltip(view);
    }

    /* renamed from: c */
    public ViewTooltip m5872c(int i10) {
        this.f6582b.setColor(i10);
        return this;
    }

    /* renamed from: d */
    public Activity m5873d(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: f */
    public ViewTooltip m5874f(Position position) {
        this.f6582b.setPosition(position);
        return this;
    }

    /* renamed from: g */
    public C6565g m5875g() {
        Context context = this.f6582b.getContext();
        if (context != null && (context instanceof Activity)) {
            this.f6581a.postDelayed(new RunnableC6559a((ViewGroup) ((Activity) context).getWindow().getDecorView()), 100L);
        }
        return this.f6582b;
    }

    /* renamed from: h */
    public ViewTooltip m5876h(String str) {
        this.f6582b.setText(str);
        return this;
    }
}
