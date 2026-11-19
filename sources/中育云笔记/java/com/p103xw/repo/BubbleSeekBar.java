package com.p103xw.repo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.asm.Opcodes;
import com.p103xw.repo.bubbleseekbar.R$color;
import com.p103xw.repo.bubbleseekbar.R$styleable;
import java.math.BigDecimal;
import p293p9.AbstractC10638b;
import p293p9.C10637a;

/* loaded from: classes5.dex */
public class BubbleSeekBar extends View {

    /* renamed from: A */
    public boolean f17670A;

    /* renamed from: B */
    public boolean f17671B;

    /* renamed from: C */
    public long f17672C;

    /* renamed from: D */
    public boolean f17673D;

    /* renamed from: E */
    public long f17674E;

    /* renamed from: F */
    public boolean f17675F;

    /* renamed from: G */
    public boolean f17676G;

    /* renamed from: H */
    public int f17677H;

    /* renamed from: I */
    public int f17678I;

    /* renamed from: J */
    public int f17679J;

    /* renamed from: K */
    public float f17680K;

    /* renamed from: L */
    public float f17681L;

    /* renamed from: M */
    public float f17682M;

    /* renamed from: N */
    public float f17683N;

    /* renamed from: O */
    public float f17684O;

    /* renamed from: P */
    public boolean f17685P;

    /* renamed from: Q */
    public int f17686Q;

    /* renamed from: R */
    public boolean f17687R;

    /* renamed from: S */
    public SparseArray f17688S;

    /* renamed from: T */
    public float f17689T;

    /* renamed from: U */
    public boolean f17690U;

    /* renamed from: V */
    public float f17691V;

    /* renamed from: W */
    public float f17692W;

    /* renamed from: c */
    public float f17693c;

    /* renamed from: d */
    public float f17694d;

    /* renamed from: e */
    public float f17695e;

    /* renamed from: e0 */
    public Paint f17696e0;

    /* renamed from: f */
    public boolean f17697f;

    /* renamed from: f0 */
    public Rect f17698f0;

    /* renamed from: g */
    public int f17699g;

    /* renamed from: g0 */
    public WindowManager f17700g0;

    /* renamed from: h */
    public int f17701h;

    /* renamed from: h0 */
    public C8315i f17702h0;

    /* renamed from: i */
    public int f17703i;

    /* renamed from: i0 */
    public int f17704i0;

    /* renamed from: j */
    public int f17705j;

    /* renamed from: j0 */
    public float f17706j0;

    /* renamed from: k */
    public int f17707k;

    /* renamed from: k0 */
    public float f17708k0;

    /* renamed from: l */
    public int f17709l;

    /* renamed from: l0 */
    public float f17710l0;

    /* renamed from: m */
    public int f17711m;

    /* renamed from: m0 */
    public WindowManager.LayoutParams f17712m0;

    /* renamed from: n */
    public int f17713n;

    /* renamed from: n0 */
    public int[] f17714n0;

    /* renamed from: o */
    public boolean f17715o;

    /* renamed from: o0 */
    public boolean f17716o0;

    /* renamed from: p */
    public boolean f17717p;

    /* renamed from: p0 */
    public float f17718p0;

    /* renamed from: q */
    public boolean f17719q;

    /* renamed from: q0 */
    public C10637a f17720q0;

    /* renamed from: r */
    public int f17721r;

    /* renamed from: r0 */
    public float f17722r0;

    /* renamed from: s */
    public int f17723s;

    /* renamed from: t */
    public int f17724t;

    /* renamed from: u */
    public int f17725u;

    /* renamed from: v */
    public boolean f17726v;

    /* renamed from: w */
    public int f17727w;

    /* renamed from: x */
    public int f17728x;

    /* renamed from: y */
    public boolean f17729y;

    /* renamed from: z */
    public boolean f17730z;

    /* renamed from: com.xw.repo.BubbleSeekBar$a */
    public class RunnableC8307a implements Runnable {
        public RunnableC8307a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.requestLayout();
        }
    }

    /* renamed from: com.xw.repo.BubbleSeekBar$b */
    public class RunnableC8308b implements Runnable {
        public RunnableC8308b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.f17716o0 = false;
            BubbleSeekBar.this.m13708z();
        }
    }

    /* renamed from: com.xw.repo.BubbleSeekBar$c */
    public class C8309c extends AnimatorListenerAdapter {
        public C8309c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            BubbleSeekBar.this.f17685P = false;
            BubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BubbleSeekBar.this.f17685P = false;
            BubbleSeekBar.this.invalidate();
        }
    }

    /* renamed from: com.xw.repo.BubbleSeekBar$d */
    public class RunnableC8310d implements Runnable {

        /* renamed from: com.xw.repo.BubbleSeekBar$d$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (!BubbleSeekBar.this.f17673D) {
                    BubbleSeekBar.this.m13700G();
                }
                BubbleSeekBar.this.f17685P = false;
                BubbleSeekBar.this.invalidate();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!BubbleSeekBar.this.f17673D) {
                    BubbleSeekBar.this.m13700G();
                }
                BubbleSeekBar.this.f17685P = false;
                BubbleSeekBar.this.invalidate();
            }
        }

        public RunnableC8310d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.f17702h0.animate().alpha(BubbleSeekBar.this.f17673D ? 1.0f : 0.0f).setDuration(BubbleSeekBar.this.f17672C).setListener(new a()).start();
        }
    }

    /* renamed from: com.xw.repo.BubbleSeekBar$e */
    public class C8311e implements ValueAnimator.AnimatorUpdateListener {
        public C8311e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BubbleSeekBar.this.f17682M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f17695e = bubbleSeekBar.m13696C();
            if (BubbleSeekBar.this.f17675F || BubbleSeekBar.this.f17702h0.getParent() == null) {
                BubbleSeekBar.this.m13706M();
            } else {
                BubbleSeekBar bubbleSeekBar2 = BubbleSeekBar.this;
                bubbleSeekBar2.f17710l0 = bubbleSeekBar2.m13695B();
                BubbleSeekBar.this.f17712m0.x = (int) (BubbleSeekBar.this.f17710l0 + 0.5f);
                BubbleSeekBar.this.f17700g0.updateViewLayout(BubbleSeekBar.this.f17702h0, BubbleSeekBar.this.f17712m0);
                BubbleSeekBar.this.f17702h0.m13709a(BubbleSeekBar.this.f17729y ? String.valueOf(BubbleSeekBar.this.getProgressFloat()) : String.valueOf(BubbleSeekBar.this.getProgress()));
            }
            BubbleSeekBar.this.invalidate();
            BubbleSeekBar.m13679k(BubbleSeekBar.this);
        }
    }

    /* renamed from: com.xw.repo.BubbleSeekBar$f */
    public class C8312f extends AnimatorListenerAdapter {
        public C8312f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (!BubbleSeekBar.this.f17675F && !BubbleSeekBar.this.f17673D) {
                BubbleSeekBar.this.m13700G();
            }
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f17695e = bubbleSeekBar.m13696C();
            BubbleSeekBar.this.f17685P = false;
            BubbleSeekBar.this.f17716o0 = true;
            BubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!BubbleSeekBar.this.f17675F && !BubbleSeekBar.this.f17673D) {
                BubbleSeekBar.this.m13700G();
            }
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f17695e = bubbleSeekBar.m13696C();
            BubbleSeekBar.this.f17685P = false;
            BubbleSeekBar.this.f17716o0 = true;
            BubbleSeekBar.this.invalidate();
            BubbleSeekBar.m13679k(BubbleSeekBar.this);
        }
    }

    /* renamed from: com.xw.repo.BubbleSeekBar$g */
    public class C8313g extends AnimatorListenerAdapter {
        public C8313g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BubbleSeekBar.this.f17700g0.addView(BubbleSeekBar.this.f17702h0, BubbleSeekBar.this.f17712m0);
        }
    }

    /* renamed from: com.xw.repo.BubbleSeekBar$h */
    public class RunnableC8314h implements Runnable {
        public RunnableC8314h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.m13707N();
            BubbleSeekBar.this.f17687R = true;
        }
    }

    /* renamed from: com.xw.repo.BubbleSeekBar$i */
    public class C8315i extends View {

        /* renamed from: c */
        public Paint f17740c;

        /* renamed from: d */
        public Path f17741d;

        /* renamed from: e */
        public RectF f17742e;

        /* renamed from: f */
        public Rect f17743f;

        /* renamed from: g */
        public String f17744g;

        public C8315i(BubbleSeekBar bubbleSeekBar, Context context) {
            this(bubbleSeekBar, context, null);
        }

        /* renamed from: a */
        public void m13709a(String str) {
            if (str == null || this.f17744g.equals(str)) {
                return;
            }
            this.f17744g = str;
            invalidate();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.f17741d.reset();
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() - (BubbleSeekBar.this.f17704i0 / 3.0f);
            this.f17741d.moveTo(measuredWidth, measuredHeight);
            float measuredWidth2 = (float) ((getMeasuredWidth() / 2.0f) - ((Math.sqrt(3.0d) / 2.0d) * BubbleSeekBar.this.f17704i0));
            float f10 = BubbleSeekBar.this.f17704i0 * 1.5f;
            this.f17741d.quadTo(measuredWidth2 - AbstractC10638b.m22506a(2), f10 - AbstractC10638b.m22506a(2), measuredWidth2, f10);
            this.f17741d.arcTo(this.f17742e, 150.0f, 240.0f);
            this.f17741d.quadTo(((float) ((getMeasuredWidth() / 2.0f) + ((Math.sqrt(3.0d) / 2.0d) * BubbleSeekBar.this.f17704i0))) + AbstractC10638b.m22506a(2), f10 - AbstractC10638b.m22506a(2), measuredWidth, measuredHeight);
            this.f17741d.close();
            this.f17740c.setColor(BubbleSeekBar.this.f17677H);
            canvas.drawPath(this.f17741d, this.f17740c);
            this.f17740c.setTextSize(BubbleSeekBar.this.f17678I);
            this.f17740c.setColor(BubbleSeekBar.this.f17679J);
            Paint paint = this.f17740c;
            String str = this.f17744g;
            paint.getTextBounds(str, 0, str.length(), this.f17743f);
            Paint.FontMetrics fontMetrics = this.f17740c.getFontMetrics();
            float f11 = BubbleSeekBar.this.f17704i0;
            float f12 = fontMetrics.descent;
            canvas.drawText(this.f17744g, getMeasuredWidth() / 2.0f, (f11 + ((f12 - fontMetrics.ascent) / 2.0f)) - f12, this.f17740c);
        }

        @Override // android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            setMeasuredDimension(BubbleSeekBar.this.f17704i0 * 3, BubbleSeekBar.this.f17704i0 * 3);
            this.f17742e.set((getMeasuredWidth() / 2.0f) - BubbleSeekBar.this.f17704i0, 0.0f, (getMeasuredWidth() / 2.0f) + BubbleSeekBar.this.f17704i0, BubbleSeekBar.this.f17704i0 * 2);
        }

        public C8315i(BubbleSeekBar bubbleSeekBar, Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public C8315i(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f17744g = "";
            Paint paint = new Paint();
            this.f17740c = paint;
            paint.setAntiAlias(true);
            this.f17740c.setTextAlign(Paint.Align.CENTER);
            this.f17741d = new Path();
            this.f17742e = new RectF();
            this.f17743f = new Rect();
        }
    }

    /* renamed from: com.xw.repo.BubbleSeekBar$j */
    public interface InterfaceC8316j {
        /* renamed from: a */
        SparseArray m13710a(int i10, SparseArray sparseArray);
    }

    /* renamed from: com.xw.repo.BubbleSeekBar$k */
    public interface InterfaceC8317k {
    }

    public BubbleSeekBar(Context context) {
        this(context, null);
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC8317k m13679k(BubbleSeekBar bubbleSeekBar) {
        bubbleSeekBar.getClass();
        return null;
    }

    /* renamed from: A */
    public final float m13694A(float f10) {
        float f11 = this.f17691V;
        if (f10 <= f11) {
            return f11;
        }
        float f12 = this.f17692W;
        if (f10 >= f12) {
            return f12;
        }
        float f13 = 0.0f;
        int i10 = 0;
        while (i10 <= this.f17713n) {
            float f14 = this.f17684O;
            f13 = (i10 * f14) + this.f17691V;
            if (f13 <= f10 && f10 - f13 <= f14) {
                break;
            }
            i10++;
        }
        float f15 = f10 - f13;
        float f16 = this.f17684O;
        return f15 <= f16 / 2.0f ? f13 : ((i10 + 1) * f16) + this.f17691V;
    }

    /* renamed from: B */
    public final float m13695B() {
        return this.f17676G ? this.f17706j0 - ((this.f17683N * (this.f17695e - this.f17693c)) / this.f17680K) : this.f17706j0 + ((this.f17683N * (this.f17695e - this.f17693c)) / this.f17680K);
    }

    /* renamed from: C */
    public final float m13696C() {
        float f10;
        float f11;
        if (this.f17676G) {
            f10 = ((this.f17692W - this.f17682M) * this.f17680K) / this.f17683N;
            f11 = this.f17693c;
        } else {
            f10 = ((this.f17682M - this.f17691V) * this.f17680K) / this.f17683N;
            f11 = this.f17693c;
        }
        return f10 + f11;
    }

    /* renamed from: D */
    public final void m13697D() {
        String strM13698E;
        String strM13698E2;
        this.f17696e0.setTextSize(this.f17678I);
        if (this.f17729y) {
            strM13698E = m13698E(this.f17676G ? this.f17694d : this.f17693c);
        } else {
            strM13698E = this.f17676G ? this.f17697f ? m13698E(this.f17694d) : String.valueOf((int) this.f17694d) : this.f17697f ? m13698E(this.f17693c) : String.valueOf((int) this.f17693c);
        }
        this.f17696e0.getTextBounds(strM13698E, 0, strM13698E.length(), this.f17698f0);
        int iWidth = (this.f17698f0.width() + (this.f17686Q * 2)) >> 1;
        if (this.f17729y) {
            strM13698E2 = m13698E(this.f17676G ? this.f17693c : this.f17694d);
        } else {
            strM13698E2 = this.f17676G ? this.f17697f ? m13698E(this.f17693c) : String.valueOf((int) this.f17693c) : this.f17697f ? m13698E(this.f17694d) : String.valueOf((int) this.f17694d);
        }
        this.f17696e0.getTextBounds(strM13698E2, 0, strM13698E2.length(), this.f17698f0);
        int iWidth2 = (this.f17698f0.width() + (this.f17686Q * 2)) >> 1;
        int iM22506a = AbstractC10638b.m22506a(14);
        this.f17704i0 = iM22506a;
        this.f17704i0 = Math.max(iM22506a, Math.max(iWidth, iWidth2)) + this.f17686Q;
    }

    /* renamed from: E */
    public final String m13698E(float f10) {
        return String.valueOf(m13699F(f10));
    }

    /* renamed from: F */
    public final float m13699F(float f10) {
        return BigDecimal.valueOf(f10).setScale(1, 4).floatValue();
    }

    /* renamed from: G */
    public final void m13700G() {
        C8315i c8315i = this.f17702h0;
        if (c8315i == null) {
            return;
        }
        c8315i.setVisibility(8);
        if (this.f17702h0.getParent() != null) {
            this.f17700g0.removeViewImmediate(this.f17702h0);
        }
    }

    /* renamed from: H */
    public final void m13701H() {
        if (this.f17693c == this.f17694d) {
            this.f17693c = 0.0f;
            this.f17694d = 100.0f;
        }
        float f10 = this.f17693c;
        float f11 = this.f17694d;
        if (f10 > f11) {
            this.f17694d = f10;
            this.f17693c = f11;
        }
        float f12 = this.f17695e;
        float f13 = this.f17693c;
        if (f12 < f13) {
            this.f17695e = f13;
        }
        float f14 = this.f17695e;
        float f15 = this.f17694d;
        if (f14 > f15) {
            this.f17695e = f15;
        }
        int i10 = this.f17701h;
        int i11 = this.f17699g;
        if (i10 < i11) {
            this.f17701h = i11 + AbstractC10638b.m22506a(2);
        }
        int i12 = this.f17703i;
        int i13 = this.f17701h;
        if (i12 <= i13) {
            this.f17703i = i13 + AbstractC10638b.m22506a(2);
        }
        int i14 = this.f17705j;
        int i15 = this.f17701h;
        if (i14 <= i15) {
            this.f17705j = i15 * 2;
        }
        if (this.f17713n <= 0) {
            this.f17713n = 10;
        }
        float f16 = this.f17694d - this.f17693c;
        this.f17680K = f16;
        float f17 = f16 / this.f17713n;
        this.f17681L = f17;
        if (f17 < 1.0f) {
            this.f17697f = true;
        }
        if (this.f17697f) {
            this.f17729y = true;
        }
        int i16 = this.f17724t;
        if (i16 != -1) {
            this.f17719q = true;
        }
        if (this.f17719q) {
            if (i16 == -1) {
                this.f17724t = 0;
            }
            if (this.f17724t == 2) {
                this.f17715o = true;
            }
        }
        if (this.f17725u < 1) {
            this.f17725u = 1;
        }
        m13702I();
        if (this.f17670A) {
            this.f17671B = false;
            this.f17717p = false;
        }
        if (this.f17717p && !this.f17715o) {
            this.f17717p = false;
        }
        if (this.f17671B) {
            float f18 = this.f17693c;
            this.f17718p0 = f18;
            if (this.f17695e != f18) {
                this.f17718p0 = this.f17681L;
            }
            this.f17715o = true;
            this.f17717p = true;
        }
        if (this.f17675F) {
            this.f17673D = false;
        }
        if (this.f17673D) {
            setProgress(this.f17695e);
        }
        this.f17727w = (this.f17697f || this.f17671B || (this.f17719q && this.f17724t == 2)) ? this.f17721r : this.f17727w;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e A[PHI: r5
      0x004e: PHI (r5v3 float) = (r5v2 float), (r5v2 float), (r5v2 float), (r5v7 float) binds: [B:26:0x0049, B:27:0x004b, B:19:0x002e, B:24:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13702I() {
        /*
            r8 = this;
            int r0 = r8.f17724t
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 != r3) goto L9
            r0 = r2
            goto La
        L9:
            r0 = r1
        La:
            int r4 = r8.f17725u
            if (r4 <= r2) goto L14
            int r4 = r8.f17713n
            int r4 = r4 % r3
            if (r4 != 0) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            int r3 = r8.f17713n
            if (r1 > r3) goto L71
            boolean r4 = r8.f17676G
            if (r4 == 0) goto L25
            float r5 = r8.f17694d
            float r6 = r8.f17681L
            float r7 = (float) r1
            float r6 = r6 * r7
            float r5 = r5 - r6
            goto L2c
        L25:
            float r5 = r8.f17693c
            float r6 = r8.f17681L
            float r7 = (float) r1
            float r6 = r6 * r7
            float r5 = r5 + r6
        L2c:
            if (r0 == 0) goto L49
            if (r2 == 0) goto L4e
            int r3 = r8.f17725u
            int r3 = r1 % r3
            if (r3 != 0) goto L6e
            if (r4 == 0) goto L41
            float r3 = r8.f17694d
            float r4 = r8.f17681L
            float r5 = (float) r1
            float r4 = r4 * r5
            float r3 = r3 - r4
        L3f:
            r5 = r3
            goto L4e
        L41:
            float r3 = r8.f17693c
            float r4 = r8.f17681L
            float r5 = (float) r1
            float r4 = r4 * r5
            float r3 = r3 + r4
            goto L3f
        L49:
            if (r1 == 0) goto L4e
            if (r1 == r3) goto L4e
            goto L6e
        L4e:
            android.util.SparseArray r3 = r8.f17688S
            boolean r4 = r8.f17697f
            if (r4 == 0) goto L59
            java.lang.String r4 = r8.m13698E(r5)
            goto L6b
        L59:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = (int) r5
            r4.append(r5)
            java.lang.String r5 = ""
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L6b:
            r3.put(r1, r4)
        L6e:
            int r1 = r1 + 1
            goto L15
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p103xw.repo.BubbleSeekBar.m13702I():void");
    }

    /* renamed from: J */
    public final boolean m13703J(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float f10 = (this.f17683N / this.f17680K) * (this.f17695e - this.f17693c);
        float f11 = this.f17676G ? this.f17692W - f10 : this.f17691V + f10;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        return ((motionEvent.getX() - f11) * (motionEvent.getX() - f11)) + ((motionEvent.getY() - measuredHeight) * (motionEvent.getY() - measuredHeight)) <= (this.f17691V + ((float) AbstractC10638b.m22506a(8))) * (this.f17691V + ((float) AbstractC10638b.m22506a(8)));
    }

    /* renamed from: K */
    public final boolean m13704K(MotionEvent motionEvent) {
        return isEnabled() && motionEvent.getX() >= ((float) getPaddingLeft()) && motionEvent.getX() <= ((float) (getMeasuredWidth() - getPaddingRight())) && motionEvent.getY() >= ((float) getPaddingTop()) && motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    /* renamed from: L */
    public final void m13705L() {
        Window window;
        getLocationInWindow(this.f17714n0);
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            if (view.getMeasuredWidth() > 0) {
                int[] iArr = this.f17714n0;
                iArr[0] = iArr[0] % view.getMeasuredWidth();
            }
        }
        if (this.f17676G) {
            this.f17706j0 = (this.f17714n0[0] + this.f17692W) - (this.f17702h0.getMeasuredWidth() / 2.0f);
        } else {
            this.f17706j0 = (this.f17714n0[0] + this.f17691V) - (this.f17702h0.getMeasuredWidth() / 2.0f);
        }
        this.f17710l0 = m13695B();
        float measuredHeight = this.f17714n0[1] - this.f17702h0.getMeasuredHeight();
        this.f17708k0 = measuredHeight;
        this.f17708k0 = measuredHeight - AbstractC10638b.m22506a(24);
        if (AbstractC10638b.m22507b()) {
            this.f17708k0 -= AbstractC10638b.m22506a(4);
        }
        Context context = getContext();
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (window.getAttributes().flags & 1024) == 0) {
            return;
        }
        Resources system = Resources.getSystem();
        this.f17708k0 += system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID));
    }

    /* renamed from: M */
    public final float m13706M() {
        float f10 = this.f17695e;
        if (this.f17671B && this.f17690U) {
            float f11 = this.f17681L / 2.0f;
            if (this.f17730z) {
                if (f10 != this.f17693c && f10 != this.f17694d) {
                    for (int i10 = 0; i10 <= this.f17713n; i10++) {
                        float f12 = this.f17681L;
                        float f13 = i10 * f12;
                        if (f13 < f10 && f13 + f12 >= f10) {
                            return f11 + f13 > f10 ? f13 : f13 + f12;
                        }
                    }
                }
            }
            float f14 = this.f17718p0;
            if (f10 >= f14) {
                if (f10 >= f11 + f14) {
                    float f15 = f14 + this.f17681L;
                    this.f17718p0 = f15;
                    return f15;
                }
            } else if (f10 < f14 - f11) {
                float f16 = f14 - this.f17681L;
                this.f17718p0 = f16;
                return f16;
            }
            return f14;
        }
        return f10;
    }

    /* renamed from: N */
    public final void m13707N() {
        C8315i c8315i = this.f17702h0;
        if (c8315i == null || c8315i.getParent() != null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f17712m0;
        layoutParams.x = (int) (this.f17710l0 + 0.5f);
        layoutParams.y = (int) (this.f17708k0 + 0.5f);
        this.f17702h0.setAlpha(0.0f);
        this.f17702h0.setVisibility(0);
        this.f17702h0.animate().alpha(1.0f).setDuration(this.f17730z ? 0L : this.f17672C).setListener(new C8313g()).start();
        this.f17702h0.m13709a(this.f17729y ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
    }

    public C10637a getConfigBuilder() {
        if (this.f17720q0 == null) {
            this.f17720q0 = new C10637a(this);
        }
        C10637a c10637a = this.f17720q0;
        c10637a.f25632a = this.f17693c;
        c10637a.f25633b = this.f17694d;
        c10637a.f25634c = this.f17695e;
        c10637a.f25635d = this.f17697f;
        c10637a.f25636e = this.f17699g;
        c10637a.f25637f = this.f17701h;
        c10637a.f25638g = this.f17703i;
        c10637a.f25639h = this.f17705j;
        c10637a.f25640i = this.f17707k;
        c10637a.f25641j = this.f17709l;
        c10637a.f25642k = this.f17711m;
        c10637a.f25643l = this.f17713n;
        c10637a.f25644m = this.f17715o;
        c10637a.f25645n = this.f17717p;
        c10637a.f25646o = this.f17719q;
        c10637a.f25647p = this.f17721r;
        c10637a.f25648q = this.f17723s;
        c10637a.f25649r = this.f17724t;
        c10637a.f25650s = this.f17725u;
        c10637a.f25651t = this.f17726v;
        c10637a.f25652u = this.f17727w;
        c10637a.f25653v = this.f17728x;
        c10637a.f25654w = this.f17729y;
        c10637a.f25655x = this.f17672C;
        c10637a.f25656y = this.f17730z;
        c10637a.f25657z = this.f17670A;
        c10637a.f25623A = this.f17671B;
        c10637a.f25624B = this.f17677H;
        c10637a.f25625C = this.f17678I;
        c10637a.f25626D = this.f17679J;
        c10637a.f25627E = this.f17673D;
        c10637a.f25628F = this.f17674E;
        c10637a.f25629G = this.f17675F;
        c10637a.f25630H = this.f17676G;
        return c10637a;
    }

    public float getMax() {
        return this.f17694d;
    }

    public float getMin() {
        return this.f17693c;
    }

    public InterfaceC8317k getOnProgressChangedListener() {
        return null;
    }

    public int getProgress() {
        return Math.round(m13706M());
    }

    public float getProgressFloat() {
        return m13699F(m13706M());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m13700G();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0258  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p103xw.repo.BubbleSeekBar.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f17675F) {
            return;
        }
        m13705L();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iMax = this.f17705j * 2;
        if (this.f17726v) {
            this.f17696e0.setTextSize(this.f17727w);
            this.f17696e0.getTextBounds("j", 0, 1, this.f17698f0);
            iMax += this.f17698f0.height();
        }
        if (this.f17719q && this.f17724t >= 1) {
            this.f17696e0.setTextSize(this.f17721r);
            this.f17696e0.getTextBounds("j", 0, 1, this.f17698f0);
            iMax = Math.max(iMax, (this.f17705j * 2) + this.f17698f0.height());
        }
        setMeasuredDimension(View.resolveSize(AbstractC10638b.m22506a(Opcodes.GETFIELD), i10), iMax + (this.f17686Q * 2));
        this.f17691V = getPaddingLeft() + this.f17705j;
        this.f17692W = (getMeasuredWidth() - getPaddingRight()) - this.f17705j;
        if (this.f17719q) {
            this.f17696e0.setTextSize(this.f17721r);
            int i12 = this.f17724t;
            if (i12 == 0) {
                String str = (String) this.f17688S.get(0);
                this.f17696e0.getTextBounds(str, 0, str.length(), this.f17698f0);
                this.f17691V += this.f17698f0.width() + this.f17686Q;
                String str2 = (String) this.f17688S.get(this.f17713n);
                this.f17696e0.getTextBounds(str2, 0, str2.length(), this.f17698f0);
                this.f17692W -= this.f17698f0.width() + this.f17686Q;
            } else if (i12 >= 1) {
                String str3 = (String) this.f17688S.get(0);
                this.f17696e0.getTextBounds(str3, 0, str3.length(), this.f17698f0);
                this.f17691V = getPaddingLeft() + Math.max(this.f17705j, this.f17698f0.width() / 2.0f) + this.f17686Q;
                String str4 = (String) this.f17688S.get(this.f17713n);
                this.f17696e0.getTextBounds(str4, 0, str4.length(), this.f17698f0);
                this.f17692W = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.f17705j, this.f17698f0.width() / 2.0f)) - this.f17686Q;
            }
        } else if (this.f17726v && this.f17724t == -1) {
            this.f17696e0.setTextSize(this.f17727w);
            String str5 = (String) this.f17688S.get(0);
            this.f17696e0.getTextBounds(str5, 0, str5.length(), this.f17698f0);
            this.f17691V = getPaddingLeft() + Math.max(this.f17705j, this.f17698f0.width() / 2.0f) + this.f17686Q;
            String str6 = (String) this.f17688S.get(this.f17713n);
            this.f17696e0.getTextBounds(str6, 0, str6.length(), this.f17698f0);
            this.f17692W = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.f17705j, this.f17698f0.width() / 2.0f)) - this.f17686Q;
        }
        float f10 = this.f17692W - this.f17691V;
        this.f17683N = f10;
        this.f17684O = (f10 * 1.0f) / this.f17713n;
        if (this.f17675F) {
            return;
        }
        this.f17702h0.measure(i10, i11);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f17695e = bundle.getFloat("progress");
        super.onRestoreInstanceState(bundle.getParcelable("save_instance"));
        C8315i c8315i = this.f17702h0;
        if (c8315i != null) {
            c8315i.m13709a(this.f17729y ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        }
        setProgress(this.f17695e);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("save_instance", super.onSaveInstanceState());
        bundle.putFloat("progress", this.f17695e);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new RunnableC8307a());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p103xw.repo.BubbleSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        if (this.f17675F || !this.f17673D) {
            return;
        }
        if (i10 != 0) {
            m13700G();
        } else if (this.f17687R) {
            m13707N();
        }
        super.onVisibilityChanged(view, i10);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setBubbleColor(@ColorInt int i10) {
        if (this.f17677H != i10) {
            this.f17677H = i10;
            C8315i c8315i = this.f17702h0;
            if (c8315i != null) {
                c8315i.invalidate();
            }
        }
    }

    public void setCustomSectionTextArray(@NonNull InterfaceC8316j interfaceC8316j) {
        this.f17688S = interfaceC8316j.m13710a(this.f17713n, this.f17688S);
        for (int i10 = 0; i10 <= this.f17713n; i10++) {
            if (this.f17688S.get(i10) == null) {
                this.f17688S.put(i10, "");
            }
        }
        this.f17726v = false;
        requestLayout();
        invalidate();
    }

    public void setOnProgressChangedListener(InterfaceC8317k interfaceC8317k) {
    }

    public void setProgress(float f10) {
        this.f17695e = f10;
        if (!this.f17675F) {
            this.f17710l0 = m13695B();
        }
        if (this.f17673D) {
            m13700G();
            postDelayed(new RunnableC8314h(), this.f17674E);
        }
        if (this.f17671B) {
            this.f17690U = false;
        }
        postInvalidate();
    }

    public void setSecondTrackColor(@ColorInt int i10) {
        if (this.f17709l != i10) {
            this.f17709l = i10;
            invalidate();
        }
    }

    public void setThumbColor(@ColorInt int i10) {
        if (this.f17711m != i10) {
            this.f17711m = i10;
            invalidate();
        }
    }

    public void setTrackColor(@ColorInt int i10) {
        if (this.f17707k != i10) {
            this.f17707k = i10;
            invalidate();
        }
    }

    /* renamed from: z */
    public final void m13708z() {
        ValueAnimator valueAnimatorOfFloat;
        float f10 = 0.0f;
        int i10 = 0;
        while (i10 <= this.f17713n) {
            float f11 = this.f17684O;
            f10 = (i10 * f11) + this.f17691V;
            float f12 = this.f17682M;
            if (f10 <= f12 && f12 - f10 <= f11) {
                break;
            } else {
                i10++;
            }
        }
        boolean z10 = BigDecimal.valueOf((double) this.f17682M).setScale(1, 4).floatValue() == f10;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z10) {
            valueAnimatorOfFloat = null;
        } else {
            float f13 = this.f17682M;
            float f14 = f13 - f10;
            float f15 = this.f17684O;
            valueAnimatorOfFloat = f14 <= f15 / 2.0f ? ValueAnimator.ofFloat(f13, f10) : ValueAnimator.ofFloat(f13, ((i10 + 1) * f15) + this.f17691V);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new C8311e());
        }
        if (!this.f17675F) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17702h0, (Property<C8315i, Float>) View.ALPHA, this.f17673D ? 1.0f : 0.0f);
            if (z10) {
                animatorSet.setDuration(this.f17672C).play(objectAnimatorOfFloat);
            } else {
                animatorSet.setDuration(this.f17672C).playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
            }
        } else if (!z10) {
            animatorSet.setDuration(this.f17672C).playTogether(valueAnimatorOfFloat);
        }
        animatorSet.addListener(new C8312f());
        animatorSet.start();
    }

    public BubbleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17724t = -1;
        this.f17688S = new SparseArray();
        this.f17714n0 = new int[2];
        this.f17716o0 = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BubbleSeekBar, i10, 0);
        this.f17693c = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_min, 0.0f);
        this.f17694d = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_max, 100.0f);
        this.f17695e = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_progress, this.f17693c);
        this.f17697f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_is_float_type, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_track_size, AbstractC10638b.m22506a(2));
        this.f17699g = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_second_track_size, dimensionPixelSize + AbstractC10638b.m22506a(2));
        this.f17701h = dimensionPixelSize2;
        this.f17703i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_radius, dimensionPixelSize2 + AbstractC10638b.m22506a(2));
        this.f17705j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_radius_on_dragging, this.f17701h * 2);
        this.f17713n = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_count, 10);
        this.f17707k = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_track_color, ContextCompat.getColor(context, R$color.colorPrimary));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_second_track_color, ContextCompat.getColor(context, R$color.colorAccent));
        this.f17709l = color;
        this.f17711m = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_thumb_color, color);
        this.f17719q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_section_text, false);
        this.f17721r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_section_text_size, AbstractC10638b.m22508c(14));
        this.f17723s = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_section_text_color, this.f17707k);
        this.f17670A = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_seek_step_section, false);
        this.f17671B = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_seek_by_section, false);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_text_position, -1);
        if (integer == 0) {
            this.f17724t = 0;
        } else if (integer == 1) {
            this.f17724t = 1;
        } else if (integer == 2) {
            this.f17724t = 2;
        } else {
            this.f17724t = -1;
        }
        this.f17725u = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_text_interval, 1);
        this.f17726v = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_thumb_text, false);
        this.f17727w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_text_size, AbstractC10638b.m22508c(14));
        this.f17728x = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_thumb_text_color, this.f17709l);
        this.f17677H = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_bubble_color, this.f17709l);
        this.f17678I = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_bubble_text_size, AbstractC10638b.m22508c(14));
        this.f17679J = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_bubble_text_color, -1);
        this.f17715o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_section_mark, false);
        this.f17717p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_auto_adjust_section_mark, false);
        this.f17729y = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_progress_in_float, false);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_anim_duration, -1);
        this.f17672C = integer2 < 0 ? 200L : integer2;
        this.f17730z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_touch_to_seek, false);
        this.f17673D = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_always_show_bubble, false);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_always_show_bubble_delay, 0);
        this.f17674E = integer3 < 0 ? 0L : integer3;
        this.f17675F = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_hide_bubble, false);
        this.f17676G = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_rtl, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_android_enabled, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f17696e0 = paint;
        paint.setAntiAlias(true);
        this.f17696e0.setStrokeCap(Paint.Cap.ROUND);
        this.f17696e0.setTextAlign(Paint.Align.CENTER);
        this.f17698f0 = new Rect();
        this.f17686Q = AbstractC10638b.m22506a(2);
        m13701H();
        if (this.f17675F) {
            return;
        }
        this.f17700g0 = (WindowManager) context.getSystemService("window");
        C8315i c8315i = new C8315i(this, context);
        this.f17702h0 = c8315i;
        c8315i.m13709a(this.f17729y ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f17712m0 = layoutParams;
        layoutParams.gravity = 8388659;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.flags = 524328;
        if (!AbstractC10638b.m22507b() && Build.VERSION.SDK_INT < 25) {
            this.f17712m0.type = 2005;
        } else {
            this.f17712m0.type = 2;
        }
        m13697D();
    }
}
