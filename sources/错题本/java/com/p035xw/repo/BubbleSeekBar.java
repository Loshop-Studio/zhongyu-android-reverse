package com.p035xw.repo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.xuexiang.xui.widget.button.C4168f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import p190w3.AbstractC6715g;
import p190w3.C6709a;
import p190w3.C6711c;
import p190w3.C6712d;
import p190w3.InterfaceC6713e;
import p190w3.InterfaceC6714f;
import p190w3.RunnableC6710b;

/* loaded from: classes3.dex */
public class BubbleSeekBar extends View {

    /* renamed from: o0 */
    public static final /* synthetic */ int f5104o0 = 0;

    /* renamed from: A */
    public final long f5105A;

    /* renamed from: B */
    public final boolean f5106B;

    /* renamed from: C */
    public final long f5107C;

    /* renamed from: D */
    public final boolean f5108D;

    /* renamed from: E */
    public final boolean f5109E;

    /* renamed from: F */
    public int f5110F;

    /* renamed from: G */
    public final int f5111G;

    /* renamed from: H */
    public final int f5112H;

    /* renamed from: I */
    public final float f5113I;

    /* renamed from: J */
    public final float f5114J;

    /* renamed from: K */
    public float f5115K;

    /* renamed from: L */
    public float f5116L;

    /* renamed from: M */
    public float f5117M;

    /* renamed from: N */
    public boolean f5118N;

    /* renamed from: O */
    public final int f5119O;

    /* renamed from: P */
    public boolean f5120P;

    /* renamed from: Q */
    public SparseArray f5121Q;

    /* renamed from: R */
    public float f5122R;

    /* renamed from: S */
    public boolean f5123S;

    /* renamed from: T */
    public float f5124T;

    /* renamed from: U */
    public float f5125U;

    /* renamed from: V */
    public final Paint f5126V;

    /* renamed from: W */
    public final Rect f5127W;

    /* renamed from: a */
    public final float f5128a;

    /* renamed from: b */
    public final float f5129b;

    /* renamed from: c */
    public float f5130c;

    /* renamed from: c0 */
    public final WindowManager f5131c0;

    /* renamed from: d */
    public final boolean f5132d;

    /* renamed from: d0 */
    public final C6712d f5133d0;

    /* renamed from: e */
    public final int f5134e;

    /* renamed from: e0 */
    public final int f5135e0;

    /* renamed from: f */
    public final int f5136f;

    /* renamed from: f0 */
    public float f5137f0;

    /* renamed from: g */
    public final int f5138g;

    /* renamed from: g0 */
    public float f5139g0;

    /* renamed from: h */
    public final int f5140h;

    /* renamed from: h0 */
    public float f5141h0;

    /* renamed from: i */
    public int f5142i;

    /* renamed from: i0 */
    public final WindowManager.LayoutParams f5143i0;

    /* renamed from: j */
    public int f5144j;

    /* renamed from: j0 */
    public final int[] f5145j0;

    /* renamed from: k */
    public int f5146k;

    /* renamed from: k0 */
    public boolean f5147k0;

    /* renamed from: l */
    public final int f5148l;

    /* renamed from: l0 */
    public float f5149l0;

    /* renamed from: m */
    public final boolean f5150m;

    /* renamed from: m0 */
    public C6709a f5151m0;

    /* renamed from: n */
    public final boolean f5152n;

    /* renamed from: n0 */
    public float f5153n0;

    /* renamed from: o */
    public final boolean f5154o;

    /* renamed from: p */
    public final int f5155p;

    /* renamed from: q */
    public final int f5156q;

    /* renamed from: r */
    public final int f5157r;

    /* renamed from: s */
    public final int f5158s;

    /* renamed from: t */
    public boolean f5159t;

    /* renamed from: u */
    public final int f5160u;

    /* renamed from: v */
    public final int f5161v;

    /* renamed from: w */
    public final boolean f5162w;

    /* renamed from: x */
    public final boolean f5163x;

    /* renamed from: y */
    public final boolean f5164y;

    /* renamed from: z */
    public final boolean f5165z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TextPosition {
        public static final int BELOW_SECTION_MARK = 2;
        public static final int BOTTOM_SIDES = 1;
        public static final int SIDES = 0;
    }

    public BubbleSeekBar(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    public static String m3624e(float f) {
        return String.valueOf(BigDecimal.valueOf(f).setScale(1, 4).floatValue());
    }

    /* renamed from: a */
    public final void m3625a() {
        ValueAnimator valueAnimatorOfFloat;
        float f = 0.0f;
        int i = 0;
        while (i <= this.f5148l) {
            float f7 = this.f5117M;
            f = (i * f7) + this.f5124T;
            float f8 = this.f5115K;
            if (f <= f8 && f8 - f <= f7) {
                break;
            } else {
                i++;
            }
        }
        int i8 = 1;
        boolean z8 = BigDecimal.valueOf((double) this.f5115K).setScale(1, 4).floatValue() == f;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z8) {
            valueAnimatorOfFloat = null;
        } else {
            float f9 = this.f5115K;
            float f10 = f9 - f;
            float f11 = this.f5117M;
            valueAnimatorOfFloat = f10 <= f11 / 2.0f ? ValueAnimator.ofFloat(f9, f) : ValueAnimator.ofFloat(f9, ((i + 1) * f11) + this.f5124T);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new C4168f(this, 5));
        }
        boolean z9 = this.f5108D;
        long j7 = this.f5105A;
        if (!z9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f5133d0, (Property<C6712d, Float>) View.ALPHA, this.f5106B ? 1.0f : 0.0f);
            if (z8) {
                animatorSet.setDuration(j7).play(objectAnimatorOfFloat);
            } else {
                animatorSet.setDuration(j7).playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
            }
        } else if (!z8) {
            animatorSet.setDuration(j7).playTogether(valueAnimatorOfFloat);
        }
        animatorSet.addListener(new C6711c(this, i8));
        animatorSet.start();
    }

    /* renamed from: b */
    public final float m3626b(float f) {
        float f7 = this.f5124T;
        if (f <= f7) {
            return f7;
        }
        float f8 = this.f5125U;
        if (f >= f8) {
            return f8;
        }
        float f9 = 0.0f;
        int i = 0;
        while (i <= this.f5148l) {
            float f10 = this.f5117M;
            f9 = (i * f10) + this.f5124T;
            if (f9 <= f && f - f9 <= f10) {
                break;
            }
            i++;
        }
        float f11 = f - f9;
        float f12 = this.f5117M;
        return f11 <= f12 / 2.0f ? f9 : ((i + 1) * f12) + this.f5124T;
    }

    /* renamed from: c */
    public final float m3627c() {
        if (this.f5109E) {
            return this.f5137f0 - (((this.f5130c - this.f5128a) * this.f5116L) / this.f5113I);
        }
        return (((this.f5130c - this.f5128a) * this.f5116L) / this.f5113I) + this.f5137f0;
    }

    /* renamed from: d */
    public final float m3628d() {
        float f;
        float f7;
        if (this.f5109E) {
            f = ((this.f5125U - this.f5115K) * this.f5113I) / this.f5116L;
            f7 = this.f5128a;
        } else {
            f = ((this.f5115K - this.f5124T) * this.f5113I) / this.f5116L;
            f7 = this.f5128a;
        }
        return f + f7;
    }

    /* renamed from: f */
    public final void m3629f() {
        C6712d c6712d = this.f5133d0;
        if (c6712d == null) {
            return;
        }
        c6712d.setVisibility(8);
        if (c6712d.getParent() != null) {
            this.f5131c0.removeViewImmediate(c6712d);
        }
    }

    /* renamed from: g */
    public final float m3630g() {
        float f = this.f5130c;
        if (this.f5165z && this.f5123S) {
            float f7 = this.f5114J / 2.0f;
            if (this.f5163x) {
                if (f != this.f5128a && f != this.f5129b) {
                    for (int i = 0; i <= this.f5148l; i++) {
                        float f8 = this.f5114J;
                        float f9 = i * f8;
                        if (f9 < f) {
                            float f10 = f8 + f9;
                            if (f10 >= f) {
                                return f7 + f9 > f ? f9 : f10;
                            }
                        }
                    }
                }
            }
            float f11 = this.f5149l0;
            if (f >= f11) {
                if (f >= f7 + f11) {
                    float f12 = f11 + this.f5114J;
                    this.f5149l0 = f12;
                    return f12;
                }
            } else if (f < f11 - f7) {
                float f13 = f11 - this.f5114J;
                this.f5149l0 = f13;
                return f13;
            }
            return f11;
        }
        return f;
    }

    public C6709a getConfigBuilder() {
        if (this.f5151m0 == null) {
            this.f5151m0 = new C6709a();
        }
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        this.f5151m0.getClass();
        return this.f5151m0;
    }

    public float getMax() {
        return this.f5129b;
    }

    public float getMin() {
        return this.f5128a;
    }

    public InterfaceC6714f getOnProgressChangedListener() {
        return null;
    }

    public int getProgress() {
        return Math.round(m3630g());
    }

    public float getProgressFloat() {
        return BigDecimal.valueOf(m3630g()).setScale(1, 4).floatValue();
    }

    /* renamed from: h */
    public final void m3631h() {
        C6712d c6712d = this.f5133d0;
        if (c6712d == null || c6712d.getParent() != null) {
            return;
        }
        int i = (int) (this.f5141h0 + 0.5f);
        WindowManager.LayoutParams layoutParams = this.f5143i0;
        layoutParams.x = i;
        layoutParams.y = (int) (this.f5139g0 + 0.5f);
        c6712d.setAlpha(0.0f);
        c6712d.setVisibility(0);
        c6712d.animate().alpha(1.0f).setDuration(this.f5163x ? 0L : this.f5105A).setListener(new C6711c(this, 2)).start();
        c6712d.m6405a(this.f5162w ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        m3629f();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x022f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p035xw.repo.BubbleSeekBar.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        Window window;
        super.onLayout(z8, i, i8, i9, i10);
        if (this.f5108D) {
            return;
        }
        int[] iArr = this.f5145j0;
        getLocationInWindow(iArr);
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            if (view.getMeasuredWidth() > 0) {
                iArr[0] = iArr[0] % view.getMeasuredWidth();
            }
        }
        boolean z9 = this.f5109E;
        C6712d c6712d = this.f5133d0;
        if (z9) {
            this.f5137f0 = (iArr[0] + this.f5125U) - (c6712d.getMeasuredWidth() / 2.0f);
        } else {
            this.f5137f0 = (iArr[0] + this.f5124T) - (c6712d.getMeasuredWidth() / 2.0f);
        }
        this.f5141h0 = m3627c();
        float measuredHeight = iArr[1] - c6712d.getMeasuredHeight();
        this.f5139g0 = measuredHeight;
        this.f5139g0 = measuredHeight - AbstractC6715g.m6407a(24);
        if (AbstractC6715g.m6408b()) {
            this.f5139g0 -= AbstractC6715g.m6407a(4);
        }
        Context context = getContext();
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (window.getAttributes().flags & 1024) == 0) {
            return;
        }
        Resources system = Resources.getSystem();
        this.f5139g0 += system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        int iMax = this.f5140h * 2;
        boolean z8 = this.f5159t;
        Paint paint = this.f5126V;
        Rect rect = this.f5127W;
        if (z8) {
            paint.setTextSize(this.f5160u);
            paint.getTextBounds("j", 0, 1, rect);
            iMax += rect.height();
        }
        boolean z9 = this.f5154o;
        int i9 = this.f5155p;
        if (z9 && this.f5157r >= 1) {
            paint.setTextSize(i9);
            paint.getTextBounds("j", 0, 1, rect);
            iMax = Math.max(iMax, rect.height() + (this.f5140h * 2));
        }
        int i10 = this.f5119O;
        setMeasuredDimension(View.resolveSize(AbstractC6715g.m6407a(180), i), (i10 * 2) + iMax);
        this.f5124T = getPaddingLeft() + this.f5140h;
        this.f5125U = (getMeasuredWidth() - getPaddingRight()) - this.f5140h;
        if (this.f5154o) {
            paint.setTextSize(i9);
            int i11 = this.f5157r;
            if (i11 == 0) {
                String str = (String) this.f5121Q.get(0);
                paint.getTextBounds(str, 0, str.length(), rect);
                this.f5124T += rect.width() + i10;
                String str2 = (String) this.f5121Q.get(this.f5148l);
                paint.getTextBounds(str2, 0, str2.length(), rect);
                this.f5125U -= rect.width() + i10;
            } else if (i11 >= 1) {
                String str3 = (String) this.f5121Q.get(0);
                paint.getTextBounds(str3, 0, str3.length(), rect);
                this.f5124T = getPaddingLeft() + Math.max(this.f5140h, rect.width() / 2.0f) + i10;
                String str4 = (String) this.f5121Q.get(this.f5148l);
                paint.getTextBounds(str4, 0, str4.length(), rect);
                this.f5125U = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.f5140h, rect.width() / 2.0f)) - i10;
            }
        } else if (this.f5159t && this.f5157r == -1) {
            paint.setTextSize(this.f5160u);
            String str5 = (String) this.f5121Q.get(0);
            paint.getTextBounds(str5, 0, str5.length(), rect);
            this.f5124T = getPaddingLeft() + Math.max(this.f5140h, rect.width() / 2.0f) + i10;
            String str6 = (String) this.f5121Q.get(this.f5148l);
            paint.getTextBounds(str6, 0, str6.length(), rect);
            this.f5125U = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.f5140h, rect.width() / 2.0f)) - i10;
        }
        float f = this.f5125U - this.f5124T;
        this.f5116L = f;
        this.f5117M = (f * 1.0f) / this.f5148l;
        if (this.f5108D) {
            return;
        }
        this.f5133d0.measure(i, i8);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f5130c = bundle.getFloat("progress");
        super.onRestoreInstanceState(bundle.getParcelable("save_instance"));
        C6712d c6712d = this.f5133d0;
        if (c6712d != null) {
            c6712d.m6405a(this.f5162w ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        }
        setProgress(this.f5130c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("save_instance", super.onSaveInstanceState());
        bundle.putFloat("progress", this.f5130c);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        post(new RunnableC6710b(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p035xw.repo.BubbleSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (this.f5108D || !this.f5106B) {
            return;
        }
        if (i != 0) {
            m3629f();
        } else if (this.f5120P) {
            m3631h();
        }
        super.onVisibilityChanged(view, i);
    }

    public void setBubbleColor(@ColorInt int i) {
        if (this.f5110F != i) {
            this.f5110F = i;
            C6712d c6712d = this.f5133d0;
            if (c6712d != null) {
                c6712d.invalidate();
            }
        }
    }

    public void setCustomSectionTextArray(@NonNull InterfaceC6713e interfaceC6713e) {
        this.f5121Q = interfaceC6713e.m6406a();
        for (int i = 0; i <= this.f5148l; i++) {
            if (this.f5121Q.get(i) == null) {
                this.f5121Q.put(i, "");
            }
        }
        this.f5159t = false;
        requestLayout();
        invalidate();
    }

    public void setProgress(float f) {
        this.f5130c = f;
        if (!this.f5108D) {
            this.f5141h0 = m3627c();
        }
        if (this.f5106B) {
            m3629f();
            postDelayed(new RunnableC6710b(this, 3), this.f5107C);
        }
        if (this.f5165z) {
            this.f5123S = false;
        }
        postInvalidate();
    }

    public void setSecondTrackColor(@ColorInt int i) {
        if (this.f5144j != i) {
            this.f5144j = i;
            invalidate();
        }
    }

    public void setThumbColor(@ColorInt int i) {
        if (this.f5146k != i) {
            this.f5146k = i;
            invalidate();
        }
    }

    public void setTrackColor(@ColorInt int i) {
        if (this.f5142i != i) {
            this.f5142i = i;
            invalidate();
        }
    }

    public BubbleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x02a0 A[PHI: r6
      0x02a0: PHI (r6v66 float) = (r6v65 float), (r6v65 float), (r6v65 float), (r6v69 float), (r6v71 float) binds: [B:85:0x029b, B:86:0x029d, B:79:0x027f, B:84:0x0292, B:83:0x0289] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BubbleSeekBar(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p035xw.repo.BubbleSeekBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setOnProgressChangedListener(InterfaceC6714f interfaceC6714f) {
    }
}
