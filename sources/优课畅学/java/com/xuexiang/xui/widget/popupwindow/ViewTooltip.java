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
import com.xuexiang.xui.utils.AbstractC6877g;
import p150k1.AbstractC9051b;

/* loaded from: classes4.dex */
public class ViewTooltip {

    /* renamed from: a */
    public final View f7982a;

    /* renamed from: b */
    public final C6970g f7983b;

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
    public class RunnableC6964a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f7992a;

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$a$a */
        public class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final /* synthetic */ Rect f7994a;

            public a(Rect rect) {
                this.f7994a = rect;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ViewTooltip.this.f7983b.m7072j(this.f7994a, RunnableC6964a.this.f7992a.getWidth());
                ViewTooltip.this.f7983b.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        }

        public RunnableC6964a(ViewGroup viewGroup) {
            this.f7992a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            ViewTooltip.this.f7982a.getGlobalVisibleRect(rect);
            int[] iArr = new int[2];
            ViewTooltip.this.f7982a.getLocationOnScreen(iArr);
            rect.left = iArr[0];
            this.f7992a.addView(ViewTooltip.this.f7983b, -2, -2);
            ViewTooltip.this.f7983b.getViewTreeObserver().addOnPreDrawListener(new a(rect));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$b */
    public static /* synthetic */ class C6965b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7996a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f7997b;

        static {
            int[] iArr = new int[ALIGN.values().length];
            f7997b = iArr;
            try {
                iArr[ALIGN.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7997b[ALIGN.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Position.values().length];
            f7996a = iArr2;
            try {
                iArr2[Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7996a[Position.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7996a[Position.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7996a[Position.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$c */
    public static class C6966c implements InterfaceC6969f {

        /* renamed from: a */
        public long f7998a = 400;

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.InterfaceC6969f
        /* renamed from: a */
        public void mo7061a(View view, Animator.AnimatorListener animatorListener) {
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(this.f7998a).setListener(animatorListener);
        }

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.InterfaceC6969f
        /* renamed from: b */
        public void mo7062b(View view, Animator.AnimatorListener animatorListener) {
            view.animate().alpha(0.0f).setDuration(this.f7998a).setListener(animatorListener);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$d */
    public interface InterfaceC6967d {
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$e */
    public interface InterfaceC6968e {
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$f */
    public interface InterfaceC6969f {
        /* renamed from: a */
        void mo7061a(View view, Animator.AnimatorListener animatorListener);

        /* renamed from: b */
        void mo7062b(View view, Animator.AnimatorListener animatorListener);
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g */
    public static class C6970g extends FrameLayout {

        /* renamed from: a */
        public final int f7999a;

        /* renamed from: b */
        public View f8000b;

        /* renamed from: c */
        public int f8001c;

        /* renamed from: d */
        public Path f8002d;

        /* renamed from: e */
        public Paint f8003e;

        /* renamed from: f */
        public Position f8004f;

        /* renamed from: g */
        public ALIGN f8005g;

        /* renamed from: h */
        public boolean f8006h;

        /* renamed from: i */
        public boolean f8007i;

        /* renamed from: j */
        public long f8008j;

        /* renamed from: k */
        public InterfaceC6969f f8009k;

        /* renamed from: l */
        public int f8010l;

        /* renamed from: m */
        public int f8011m;

        /* renamed from: n */
        public int f8012n;

        /* renamed from: o */
        public int f8013o;

        /* renamed from: p */
        public int f8014p;

        /* renamed from: q */
        public Rect f8015q;

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super/*java.lang.Exception*/.printStackTrace();
                C6970g.m7063a(C6970g.this);
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$b */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ Animator.AnimatorListener f8017a;

            public b(Animator.AnimatorListener animatorListener) {
                this.f8017a = animatorListener;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super/*java.lang.Exception*/.printStackTrace();
                this.f8017a.onAnimationEnd(animator);
                C6970g.m7064b(C6970g.this);
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$c */
        public class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C6970g.this.f8006h) {
                    C6970g.this.m7071i();
                }
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C6970g.this.m7071i();
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$e */
        public class e extends AnimatorListenerAdapter {
            public e() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super/*java.lang.Exception*/.printStackTrace();
                if (C6970g.this.getParent() != null) {
                    ((ViewGroup) C6970g.this.getParent()).removeView(C6970g.this);
                }
            }
        }

        /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$g$f */
        public class f implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final /* synthetic */ Rect f8022a;

            public f(Rect rect) {
                this.f8022a = rect;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                C6970g.this.m7070h(this.f8022a);
                C6970g.this.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        }

        public C6970g(Context context) {
            super(context);
            this.f7999a = 15;
            this.f8001c = Color.parseColor("#B2299EE3");
            this.f8004f = Position.BOTTOM;
            this.f8005g = ALIGN.CENTER;
            this.f8007i = true;
            this.f8008j = 4000L;
            this.f8009k = new C6966c();
            this.f8010l = 30;
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.f8000b = textView;
            textView.setTextColor(-1);
            addView(this.f8000b, -2, -2);
            this.f8000b.setPadding(0, 0, 0, 0);
            Paint paint = new Paint(1);
            this.f8003e = paint;
            paint.setColor(this.f8001c);
            this.f8003e.setStyle(Paint.Style.FILL);
            int iM6481o = AbstractC6877g.m6481o(getContext(), R$attr.xui_tip_popup_padding_top);
            this.f8012n = iM6481o;
            this.f8011m = iM6481o;
            int iM6481o2 = AbstractC6877g.m6481o(getContext(), R$attr.xui_tip_popup_padding_left);
            this.f8014p = iM6481o2;
            this.f8013o = iM6481o2;
            setTextTypeFace(AbstractC9051b.m15849d());
        }

        /* renamed from: a */
        public static /* synthetic */ InterfaceC6967d m7063a(C6970g c6970g) {
            c6970g.getClass();
            return null;
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC6968e m7064b(C6970g c6970g) {
            c6970g.getClass();
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m7067e(android.graphics.Rect r8, int r9) {
            /*
                r7 = this;
                android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f8004f
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
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f8004f
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
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.f8004f
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
            throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.popupwindow.ViewTooltip.C6970g.m7067e(android.graphics.Rect, int):boolean");
        }

        /* renamed from: f */
        public final Path m7068f(RectF rectF, float f10, float f11, float f12, float f13) {
            Path path = new Path();
            if (this.f8015q == null) {
                return path;
            }
            float f14 = f10 < 0.0f ? 0.0f : f10;
            float f15 = f11 < 0.0f ? 0.0f : f11;
            float f16 = f13 < 0.0f ? 0.0f : f13;
            float f17 = f12 < 0.0f ? 0.0f : f12;
            Position position = this.f8004f;
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
            if (this.f8004f == position3) {
                float f30 = 15;
                path.lineTo(fCenterX - f30, f23);
                path.lineTo(fCenterX, rectF.top);
                path.lineTo(f30 + fCenterX, f23);
            }
            float f31 = f28 / 2.0f;
            path.lineTo(f24 - f31, f23);
            path.quadTo(f24, f23, f24, f31 + f23);
            if (this.f8004f == position4) {
                float f32 = f25 / 2.0f;
                float f33 = 15;
                path.lineTo(f24, f32 - f33);
                path.lineTo(rectF.right, f32);
                path.lineTo(f24, f32 + f33);
            }
            float f34 = f17 / 2.0f;
            path.lineTo(f24, f25 - f34);
            path.quadTo(f24, f25, f24 - f34, f25);
            if (this.f8004f == position5) {
                float f35 = 15;
                path.lineTo(fCenterX + f35, f25);
                path.lineTo(fCenterX, rectF.bottom);
                path.lineTo(fCenterX - f35, f25);
            }
            float f36 = f29 / 2.0f;
            path.lineTo(f22 + f36, f25);
            path.quadTo(f22, f25, f22, f25 - f36);
            if (this.f8004f == position2) {
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
        public void m7069g() {
            if (this.f8006h) {
                setOnClickListener(new c());
            }
            if (this.f8007i) {
                postDelayed(new d(), this.f8008j);
            }
        }

        /* renamed from: h */
        public final void m7070h(Rect rect) {
            setupPosition(rect);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            int i10 = this.f8010l;
            this.f8002d = m7068f(rectF, i10, i10, i10, i10);
            m7073k();
            m7069g();
        }

        /* renamed from: i */
        public void m7071i() {
            m7074l(new e());
        }

        /* renamed from: j */
        public void m7072j(Rect rect, int i10) {
            this.f8015q = new Rect(rect);
            Rect rect2 = new Rect(rect);
            if (m7067e(rect2, i10)) {
                getViewTreeObserver().addOnPreDrawListener(new f(rect2));
            } else {
                m7070h(rect2);
            }
        }

        /* renamed from: k */
        public void m7073k() {
            this.f8009k.mo7061a(this, new a());
        }

        /* renamed from: l */
        public void m7074l(Animator.AnimatorListener animatorListener) {
            this.f8009k.mo7062b(this, new b(animatorListener));
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Path path = this.f8002d;
            if (path != null) {
                canvas.drawPath(path, this.f8003e);
            }
        }

        @Override // android.view.View
        public void onSizeChanged(int i10, int i11, int i12, int i13) {
            super.onSizeChanged(i10, i11, i12, i13);
            RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
            int i14 = this.f8010l;
            this.f8002d = m7068f(rectF, i14, i14, i14, i14);
        }

        public void setAlign(ALIGN align) {
            this.f8005g = align;
            postInvalidate();
        }

        public void setAutoHide(boolean z10) {
            this.f8007i = z10;
        }

        public void setClickToHide(boolean z10) {
            this.f8006h = z10;
        }

        public void setColor(int i10) {
            this.f8001c = i10;
            this.f8003e.setColor(i10);
            postInvalidate();
        }

        public void setCorner(int i10) {
            this.f8010l = i10;
        }

        public void setCustomView(View view) {
            removeView(this.f8000b);
            this.f8000b = view;
            addView(view, -2, -2);
        }

        public void setDuration(long j10) {
            this.f8008j = j10;
        }

        public void setListenerDisplay(InterfaceC6967d interfaceC6967d) {
        }

        public void setListenerHide(InterfaceC6968e interfaceC6968e) {
        }

        public void setPosition(Position position) {
            this.f8004f = position;
            int i10 = C6965b.f7996a[position.ordinal()];
            if (i10 == 1) {
                setPaddingRelative(this.f8014p, this.f8011m, this.f8013o, this.f8012n + 15);
            } else if (i10 == 2) {
                setPaddingRelative(this.f8014p, this.f8011m + 15, this.f8013o, this.f8012n);
            } else if (i10 == 3) {
                setPaddingRelative(this.f8014p, this.f8011m, this.f8013o + 15, this.f8012n);
            } else if (i10 == 4) {
                setPaddingRelative(this.f8014p + 15, this.f8011m, this.f8013o, this.f8012n);
            }
            postInvalidate();
        }

        public void setText(String str) {
            View view = this.f8000b;
            if (view instanceof TextView) {
                ((TextView) view).setText(Html.fromHtml(str));
            }
            postInvalidate();
        }

        public void setTextColor(int i10) {
            View view = this.f8000b;
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            }
            postInvalidate();
        }

        public void setTextGravity(int i10) {
            View view = this.f8000b;
            if (view instanceof TextView) {
                ((TextView) view).setGravity(i10);
            }
            postInvalidate();
        }

        public void setTextTypeFace(Typeface typeface) {
            View view = this.f8000b;
            if (view instanceof TextView) {
                ((TextView) view).setTypeface(typeface);
            }
            postInvalidate();
        }

        public void setTooltipAnimation(InterfaceC6969f interfaceC6969f) {
            this.f8009k = interfaceC6969f;
        }

        public void setupPosition(Rect rect) {
            Position position = this.f8004f;
            Position position2 = Position.LEFT;
            if (position != position2 && position != Position.RIGHT) {
                iWidth = this.f8005g == ALIGN.CENTER ? (int) ((rect.width() / 2.0f) - ((getWidth() * 1.0f) / 2.0f)) : 0;
                if (this.f8004f == Position.BOTTOM) {
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
            int i10 = C6965b.f7997b[this.f8005g.ordinal()];
            if (i10 != 1 && i10 == 2) {
                iWidth = (int) (((iMax * (-1.0f)) / 2.0f) + (iMin / 2.0f));
            }
            if (this.f8004f == position2) {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.left - getWidth());
            } else {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.right);
            }
        }
    }

    public ViewTooltip(View view) {
        this.f7982a = view;
        this.f7983b = new C6970g(m7057d(view.getContext()));
    }

    /* renamed from: e */
    public static ViewTooltip m7055e(View view) {
        return new ViewTooltip(view);
    }

    /* renamed from: c */
    public ViewTooltip m7056c(int i10) {
        this.f7983b.setColor(i10);
        return this;
    }

    /* renamed from: d */
    public Activity m7057d(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: f */
    public ViewTooltip m7058f(Position position) {
        this.f7983b.setPosition(position);
        return this;
    }

    /* renamed from: g */
    public C6970g m7059g() {
        Context context = this.f7983b.getContext();
        if (context != null && (context instanceof Activity)) {
            this.f7982a.postDelayed(new RunnableC6964a((ViewGroup) ((Activity) context).getWindow().getDecorView()), 100L);
        }
        return this.f7983b;
    }

    /* renamed from: h */
    public ViewTooltip m7060h(String str) {
        this.f7983b.setText(str);
        return this;
    }
}
