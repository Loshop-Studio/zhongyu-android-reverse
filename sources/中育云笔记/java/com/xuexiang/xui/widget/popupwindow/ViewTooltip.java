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
import com.xuexiang.xui.utils.AbstractC8041g;
import p420y7.AbstractC11916b;

/* loaded from: classes5.dex */
public class ViewTooltip {

    /* renamed from: a */
    public final View f16600a;

    /* renamed from: b */
    public final TooltipView f16601b;

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

    public static class TooltipView extends FrameLayout {

        /* renamed from: c */
        public final int f16610c;

        /* renamed from: d */
        public View f16611d;

        /* renamed from: e */
        public int f16612e;

        /* renamed from: f */
        public Path f16613f;

        /* renamed from: g */
        public Paint f16614g;

        /* renamed from: h */
        public Position f16615h;

        /* renamed from: i */
        public ALIGN f16616i;

        /* renamed from: j */
        public boolean f16617j;

        /* renamed from: k */
        public boolean f16618k;

        /* renamed from: l */
        public long f16619l;

        /* renamed from: m */
        public InterfaceC8195f f16620m;

        /* renamed from: n */
        public int f16621n;

        /* renamed from: o */
        public int f16622o;

        /* renamed from: p */
        public int f16623p;

        /* renamed from: q */
        public int f16624q;

        /* renamed from: r */
        public int f16625r;

        /* renamed from: s */
        public Rect f16626s;

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$TooltipView$a */
        public class C8184a extends AnimatorListenerAdapter {
            public C8184a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                TooltipView.m13033a(TooltipView.this);
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$TooltipView$b */
        public class C8185b extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ Animator.AnimatorListener f16628a;

            public C8185b(Animator.AnimatorListener animatorListener) {
                this.f16628a = animatorListener;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f16628a.onAnimationEnd(animator);
                TooltipView.m13034b(TooltipView.this);
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$TooltipView$c */
        public class ViewOnClickListenerC8186c implements View.OnClickListener {
            public ViewOnClickListenerC8186c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TooltipView.this.f16617j) {
                    TooltipView.this.m13041i();
                }
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$TooltipView$d */
        public class RunnableC8187d implements Runnable {
            public RunnableC8187d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TooltipView.this.m13041i();
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$TooltipView$e */
        public class C8188e extends AnimatorListenerAdapter {
            public C8188e() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (TooltipView.this.getParent() != null) {
                    ((ViewGroup) TooltipView.this.getParent()).removeView(TooltipView.this);
                }
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$TooltipView$f */
        public class ViewTreeObserverOnPreDrawListenerC8189f implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: c */
            public final /* synthetic */ Rect f16633c;

            public ViewTreeObserverOnPreDrawListenerC8189f(Rect rect) {
                this.f16633c = rect;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                TooltipView.this.m13040h(this.f16633c);
                TooltipView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        }

        public TooltipView(Context context) {
            super(context);
            this.f16610c = 15;
            this.f16612e = Color.parseColor("#B2299EE3");
            this.f16615h = Position.BOTTOM;
            this.f16616i = ALIGN.CENTER;
            this.f16618k = true;
            this.f16619l = 4000L;
            this.f16620m = new C8192c();
            this.f16621n = 30;
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.f16611d = textView;
            textView.setTextColor(-1);
            addView(this.f16611d, -2, -2);
            this.f16611d.setPadding(0, 0, 0, 0);
            Paint paint = new Paint(1);
            this.f16614g = paint;
            paint.setColor(this.f16612e);
            this.f16614g.setStyle(Paint.Style.FILL);
            int iM12219f = AbstractC8041g.m12219f(getContext(), R$attr.xui_tip_popup_padding_top);
            this.f16623p = iM12219f;
            this.f16622o = iM12219f;
            int iM12219f2 = AbstractC8041g.m12219f(getContext(), R$attr.xui_tip_popup_padding_left);
            this.f16625r = iM12219f2;
            this.f16624q = iM12219f2;
            setTextTypeFace(AbstractC11916b.m26459c());
        }

        /* renamed from: a */
        public static /* synthetic */ InterfaceC8193d m13033a(TooltipView tooltipView) {
            tooltipView.getClass();
            return null;
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC8194e m13034b(TooltipView tooltipView) {
            tooltipView.getClass();
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m13037e(android.graphics.Rect r8, int r9) {
            /*
                r7 = this;
                android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f16615h
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
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f16615h
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
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f16615h
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
            throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipView.m13037e(android.graphics.Rect, int):boolean");
        }

        /* renamed from: f */
        public final Path m13038f(RectF rectF, float f10, float f11, float f12, float f13) {
            Path path = new Path();
            if (this.f16626s == null) {
                return path;
            }
            float f14 = f10 < 0.0f ? 0.0f : f10;
            float f15 = f11 < 0.0f ? 0.0f : f11;
            float f16 = f13 < 0.0f ? 0.0f : f13;
            float f17 = f12 < 0.0f ? 0.0f : f12;
            Position position = this.f16615h;
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
            if (this.f16615h == position3) {
                float f30 = 15;
                path.lineTo(fCenterX - f30, f23);
                path.lineTo(fCenterX, rectF.top);
                path.lineTo(f30 + fCenterX, f23);
            }
            float f31 = f28 / 2.0f;
            path.lineTo(f24 - f31, f23);
            path.quadTo(f24, f23, f24, f31 + f23);
            if (this.f16615h == position4) {
                float f32 = f25 / 2.0f;
                float f33 = 15;
                path.lineTo(f24, f32 - f33);
                path.lineTo(rectF.right, f32);
                path.lineTo(f24, f32 + f33);
            }
            float f34 = f17 / 2.0f;
            path.lineTo(f24, f25 - f34);
            path.quadTo(f24, f25, f24 - f34, f25);
            if (this.f16615h == position5) {
                float f35 = 15;
                path.lineTo(fCenterX + f35, f25);
                path.lineTo(fCenterX, rectF.bottom);
                path.lineTo(fCenterX - f35, f25);
            }
            float f36 = f29 / 2.0f;
            path.lineTo(f22 + f36, f25);
            path.quadTo(f22, f25, f22, f25 - f36);
            if (this.f16615h == position2) {
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
        public void m13039g() {
            if (this.f16617j) {
                setOnClickListener(new ViewOnClickListenerC8186c());
            }
            if (this.f16618k) {
                postDelayed(new RunnableC8187d(), this.f16619l);
            }
        }

        /* renamed from: h */
        public final void m13040h(Rect rect) {
            setupPosition(rect);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            int i10 = this.f16621n;
            this.f16613f = m13038f(rectF, i10, i10, i10, i10);
            m13043k();
            m13039g();
        }

        /* renamed from: i */
        public void m13041i() {
            m13044l(new C8188e());
        }

        /* renamed from: j */
        public void m13042j(Rect rect, int i10) {
            this.f16626s = new Rect(rect);
            Rect rect2 = new Rect(rect);
            if (m13037e(rect2, i10)) {
                getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC8189f(rect2));
            } else {
                m13040h(rect2);
            }
        }

        /* renamed from: k */
        public void m13043k() {
            this.f16620m.mo13045a(this, new C8184a());
        }

        /* renamed from: l */
        public void m13044l(Animator.AnimatorListener animatorListener) {
            this.f16620m.mo13046b(this, new C8185b(animatorListener));
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Path path = this.f16613f;
            if (path != null) {
                canvas.drawPath(path, this.f16614g);
            }
        }

        @Override // android.view.View
        public void onSizeChanged(int i10, int i11, int i12, int i13) {
            super.onSizeChanged(i10, i11, i12, i13);
            RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
            int i14 = this.f16621n;
            this.f16613f = m13038f(rectF, i14, i14, i14, i14);
        }

        public void setAlign(ALIGN align) {
            this.f16616i = align;
            postInvalidate();
        }

        public void setAutoHide(boolean z10) {
            this.f16618k = z10;
        }

        public void setClickToHide(boolean z10) {
            this.f16617j = z10;
        }

        public void setColor(int i10) {
            this.f16612e = i10;
            this.f16614g.setColor(i10);
            postInvalidate();
        }

        public void setCorner(int i10) {
            this.f16621n = i10;
        }

        public void setCustomView(View view) {
            removeView(this.f16611d);
            this.f16611d = view;
            addView(view, -2, -2);
        }

        public void setDuration(long j10) {
            this.f16619l = j10;
        }

        public void setListenerDisplay(InterfaceC8193d interfaceC8193d) {
        }

        public void setListenerHide(InterfaceC8194e interfaceC8194e) {
        }

        public void setPosition(Position position) {
            this.f16615h = position;
            int i10 = C8191b.f16639a[position.ordinal()];
            if (i10 == 1) {
                setPaddingRelative(this.f16625r, this.f16622o, this.f16624q, this.f16623p + 15);
            } else if (i10 == 2) {
                setPaddingRelative(this.f16625r, this.f16622o + 15, this.f16624q, this.f16623p);
            } else if (i10 == 3) {
                setPaddingRelative(this.f16625r, this.f16622o, this.f16624q + 15, this.f16623p);
            } else if (i10 == 4) {
                setPaddingRelative(this.f16625r + 15, this.f16622o, this.f16624q, this.f16623p);
            }
            postInvalidate();
        }

        public void setText(String str) {
            View view = this.f16611d;
            if (view instanceof TextView) {
                ((TextView) view).setText(Html.fromHtml(str));
            }
            postInvalidate();
        }

        public void setTextColor(int i10) {
            View view = this.f16611d;
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            }
            postInvalidate();
        }

        public void setTextGravity(int i10) {
            View view = this.f16611d;
            if (view instanceof TextView) {
                ((TextView) view).setGravity(i10);
            }
            postInvalidate();
        }

        public void setTextTypeFace(Typeface typeface) {
            View view = this.f16611d;
            if (view instanceof TextView) {
                ((TextView) view).setTypeface(typeface);
            }
            postInvalidate();
        }

        public void setTooltipAnimation(InterfaceC8195f interfaceC8195f) {
            this.f16620m = interfaceC8195f;
        }

        public void setupPosition(Rect rect) {
            Position position = this.f16615h;
            Position position2 = Position.LEFT;
            if (position != position2 && position != Position.RIGHT) {
                iWidth = this.f16616i == ALIGN.CENTER ? (int) ((rect.width() / 2.0f) - ((getWidth() * 1.0f) / 2.0f)) : 0;
                if (this.f16615h == Position.BOTTOM) {
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
            int i10 = C8191b.f16640b[this.f16616i.ordinal()];
            if (i10 != 1 && i10 == 2) {
                iWidth = (int) (((iMax * (-1.0f)) / 2.0f) + (iMin / 2.0f));
            }
            if (this.f16615h == position2) {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.left - getWidth());
            } else {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.right);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$a */
    public class RunnableC8190a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ ViewGroup f16635c;

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$a$a */
        public class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: c */
            public final /* synthetic */ Rect f16637c;

            public a(Rect rect) {
                this.f16637c = rect;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ViewTooltip.this.f16601b.m13042j(this.f16637c, RunnableC8190a.this.f16635c.getWidth());
                ViewTooltip.this.f16601b.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        }

        public RunnableC8190a(ViewGroup viewGroup) {
            this.f16635c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            ViewTooltip.this.f16600a.getGlobalVisibleRect(rect);
            int[] iArr = new int[2];
            ViewTooltip.this.f16600a.getLocationOnScreen(iArr);
            rect.left = iArr[0];
            this.f16635c.addView(ViewTooltip.this.f16601b, -2, -2);
            ViewTooltip.this.f16601b.getViewTreeObserver().addOnPreDrawListener(new a(rect));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$b */
    public static /* synthetic */ class C8191b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16639a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f16640b;

        static {
            int[] iArr = new int[ALIGN.values().length];
            f16640b = iArr;
            try {
                iArr[ALIGN.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16640b[ALIGN.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Position.values().length];
            f16639a = iArr2;
            try {
                iArr2[Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16639a[Position.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16639a[Position.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16639a[Position.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$c */
    public static class C8192c implements InterfaceC8195f {

        /* renamed from: a */
        public long f16641a = 400;

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.InterfaceC8195f
        /* renamed from: a */
        public void mo13045a(View view, Animator.AnimatorListener animatorListener) {
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(this.f16641a).setListener(animatorListener);
        }

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.InterfaceC8195f
        /* renamed from: b */
        public void mo13046b(View view, Animator.AnimatorListener animatorListener) {
            view.animate().alpha(0.0f).setDuration(this.f16641a).setListener(animatorListener);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$d */
    public interface InterfaceC8193d {
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$e */
    public interface InterfaceC8194e {
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$f */
    public interface InterfaceC8195f {
        /* renamed from: a */
        void mo13045a(View view, Animator.AnimatorListener animatorListener);

        /* renamed from: b */
        void mo13046b(View view, Animator.AnimatorListener animatorListener);
    }

    public ViewTooltip(View view) {
        this.f16600a = view;
        this.f16601b = new TooltipView(m13029d(view.getContext()));
    }

    /* renamed from: e */
    public static ViewTooltip m13027e(View view) {
        return new ViewTooltip(view);
    }

    /* renamed from: c */
    public ViewTooltip m13028c(int i10) {
        this.f16601b.setColor(i10);
        return this;
    }

    /* renamed from: d */
    public Activity m13029d(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: f */
    public ViewTooltip m13030f(Position position) {
        this.f16601b.setPosition(position);
        return this;
    }

    /* renamed from: g */
    public TooltipView m13031g() {
        Context context = this.f16601b.getContext();
        if (context != null && (context instanceof Activity)) {
            this.f16600a.postDelayed(new RunnableC8190a((ViewGroup) ((Activity) context).getWindow().getDecorView()), 100L);
        }
        return this.f16601b;
    }

    /* renamed from: h */
    public ViewTooltip m13032h(String str) {
        this.f16601b.setText(str);
        return this;
    }
}
