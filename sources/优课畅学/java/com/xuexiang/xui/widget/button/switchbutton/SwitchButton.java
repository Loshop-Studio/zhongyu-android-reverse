package com.xuexiang.xui.widget.button.switchbutton;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import com.tencent.smtt.audio.core.p057db.ApnHelper;

/* loaded from: classes4.dex */
public class SwitchButton extends CompoundButton {

    /* renamed from: j0 */
    public static int[] f7371j0 = {R.attr.state_checked, R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: k0 */
    public static int[] f7372k0 = {-16842912, R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: A */
    public RectF f7373A;

    /* renamed from: B */
    public Paint f7374B;

    /* renamed from: C */
    public boolean f7375C;

    /* renamed from: D */
    public boolean f7376D;

    /* renamed from: E */
    public boolean f7377E;

    /* renamed from: F */
    public ObjectAnimator f7378F;

    /* renamed from: G */
    public float f7379G;

    /* renamed from: H */
    public RectF f7380H;

    /* renamed from: I */
    public float f7381I;

    /* renamed from: J */
    public float f7382J;

    /* renamed from: K */
    public float f7383K;

    /* renamed from: L */
    public int f7384L;

    /* renamed from: M */
    public int f7385M;

    /* renamed from: N */
    public Paint f7386N;

    /* renamed from: O */
    public CharSequence f7387O;

    /* renamed from: P */
    public CharSequence f7388P;

    /* renamed from: Q */
    public TextPaint f7389Q;

    /* renamed from: R */
    public Layout f7390R;

    /* renamed from: S */
    public Layout f7391S;

    /* renamed from: T */
    public float f7392T;

    /* renamed from: U */
    public float f7393U;

    /* renamed from: V */
    public int f7394V;

    /* renamed from: W */
    public int f7395W;

    /* renamed from: a */
    public Drawable f7396a;

    /* renamed from: b */
    public Drawable f7397b;

    /* renamed from: c */
    public ColorStateList f7398c;

    /* renamed from: d */
    public ColorStateList f7399d;

    /* renamed from: e */
    public float f7400e;

    /* renamed from: e0 */
    public int f7401e0;

    /* renamed from: f */
    public float f7402f;

    /* renamed from: f0 */
    public boolean f7403f0;

    /* renamed from: g */
    public RectF f7404g;

    /* renamed from: g0 */
    public boolean f7405g0;

    /* renamed from: h */
    public float f7406h;

    /* renamed from: h0 */
    public boolean f7407h0;

    /* renamed from: i */
    public long f7408i;

    /* renamed from: i0 */
    public CompoundButton.OnCheckedChangeListener f7409i0;

    /* renamed from: j */
    public boolean f7410j;

    /* renamed from: k */
    public int f7411k;

    /* renamed from: l */
    public int f7412l;

    /* renamed from: m */
    public int f7413m;

    /* renamed from: n */
    public int f7414n;

    /* renamed from: o */
    public int f7415o;

    /* renamed from: p */
    public int f7416p;

    /* renamed from: q */
    public int f7417q;

    /* renamed from: r */
    public int f7418r;

    /* renamed from: s */
    public int f7419s;

    /* renamed from: t */
    public int f7420t;

    /* renamed from: u */
    public Drawable f7421u;

    /* renamed from: v */
    public Drawable f7422v;

    /* renamed from: w */
    public RectF f7423w;

    /* renamed from: x */
    public RectF f7424x;

    /* renamed from: y */
    public RectF f7425y;

    /* renamed from: z */
    public RectF f7426z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6900a();

        /* renamed from: a */
        public CharSequence f7427a;

        /* renamed from: b */
        public CharSequence f7428b;

        /* renamed from: com.xuexiang.xui.widget.button.switchbutton.SwitchButton$SavedState$a */
        public static class C6900a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f7427a, parcel, i10);
            TextUtils.writeToParcel(this.f7428b, parcel, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f7427a = (CharSequence) creator.createFromParcel(parcel);
            this.f7428b = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7377E = false;
        this.f7403f0 = false;
        this.f7405g0 = false;
        this.f7407h0 = false;
        m6691d(context, attributeSet);
    }

    private float getProgress() {
        return this.f7379G;
    }

    private boolean getStatusBasedOnPos() {
        return getProgress() > 0.5f;
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setProgress(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            r2.f7379G = r3
            r2.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.button.switchbutton.SwitchButton.setProgress(float):void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$2, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener] */
    /* renamed from: a */
    public void m6688a(boolean z10) {
        ObjectAnimator objectAnimator = this.f7378F;
        if (objectAnimator == null) {
            return;
        }
        if (objectAnimator.isRunning()) {
            ?? dialogInterfaceOnClickListenerC67382 = new ApnHelper.DialogInterfaceOnClickListenerC67382(dialogInterfaceOnClickListenerC67382, dialogInterfaceOnClickListenerC67382);
        }
        this.f7378F.setDuration(this.f7408i);
        if (z10) {
            this.f7378F.setFloatValues(this.f7379G, 1.0f);
        } else {
            this.f7378F.setFloatValues(this.f7379G, 0.0f);
        }
        this.f7378F.start();
    }

    /* renamed from: b */
    public final void m6689b() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.f7407h0 = true;
    }

    /* renamed from: c */
    public final int m6690c(double d10) {
        return (int) Math.ceil(d10);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v17 ??, still in use, count: 1, list:
          (r3v17 ?? I:android.animation.ObjectAnimator) from 0x0080: IPUT 
          (r3v17 ?? I:android.animation.ObjectAnimator)
          (r27v0 'this' ?? I:com.xuexiang.xui.widget.button.switchbutton.SwitchButton A[IMMUTABLE_TYPE, THIS])
         (LINE:129) com.xuexiang.xui.widget.button.switchbutton.SwitchButton.F android.animation.ObjectAnimator
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* renamed from: d */
    public final void m6691d(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v17 ??, still in use, count: 1, list:
          (r3v17 ?? I:android.animation.ObjectAnimator) from 0x0080: IPUT 
          (r3v17 ?? I:android.animation.ObjectAnimator)
          (r27v0 'this' ?? I:com.xuexiang.xui.widget.button.switchbutton.SwitchButton A[IMMUTABLE_TYPE, THIS])
         (LINE:129) com.xuexiang.xui.widget.button.switchbutton.SwitchButton.F android.animation.ObjectAnimator
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (this.f7375C || (colorStateList2 = this.f7399d) == null) {
            setDrawableState(this.f7396a);
        } else {
            this.f7416p = colorStateList2.getColorForState(getDrawableState(), this.f7416p);
        }
        int[] iArr = isChecked() ? f7372k0 : f7371j0;
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.f7419s = textColors.getColorForState(f7371j0, defaultColor);
            this.f7420t = textColors.getColorForState(f7372k0, defaultColor);
        }
        if (!this.f7376D && (colorStateList = this.f7398c) != null) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), this.f7417q);
            this.f7417q = colorForState;
            this.f7418r = this.f7398c.getColorForState(iArr, colorForState);
            return;
        }
        Drawable drawable = this.f7397b;
        if ((drawable instanceof StateListDrawable) && this.f7410j) {
            drawable.setState(iArr);
            this.f7422v = this.f7397b.getCurrent().mutate();
        } else {
            this.f7422v = null;
        }
        setDrawableState(this.f7397b);
        Drawable drawable2 = this.f7397b;
        if (drawable2 != null) {
            this.f7421u = drawable2.getCurrent().mutate();
        }
    }

    /* renamed from: e */
    public final Layout m6692e(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f7389Q, (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* renamed from: f */
    public final int m6693f(int i10) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (this.f7413m == 0 && this.f7375C) {
            this.f7413m = this.f7396a.getIntrinsicHeight();
        }
        if (mode != 1073741824) {
            if (this.f7413m == 0) {
                this.f7413m = m6690c(getResources().getDisplayMetrics().density * 20.0f);
            }
            float f10 = this.f7413m;
            RectF rectF = this.f7404g;
            int iM6690c = m6690c(f10 + rectF.top + rectF.bottom);
            this.f7415o = iM6690c;
            if (iM6690c < 0) {
                this.f7415o = 0;
                this.f7413m = 0;
                return size;
            }
            int iM6690c2 = m6690c(this.f7393U - iM6690c);
            if (iM6690c2 > 0) {
                this.f7415o += iM6690c2;
                this.f7413m += iM6690c2;
            }
            int iMax = Math.max(this.f7413m, this.f7415o);
            return Math.max(Math.max(iMax, getPaddingTop() + iMax + getPaddingBottom()), getSuggestedMinimumHeight());
        }
        if (this.f7413m != 0) {
            RectF rectF2 = this.f7404g;
            this.f7415o = m6690c(r6 + rectF2.top + rectF2.bottom);
            this.f7415o = m6690c(Math.max(r6, this.f7393U));
            if ((((r6 + getPaddingTop()) + getPaddingBottom()) - Math.min(0.0f, this.f7404g.top)) - Math.min(0.0f, this.f7404g.bottom) > size) {
                this.f7413m = 0;
            }
        }
        if (this.f7413m == 0) {
            int iM6690c3 = m6690c(((size - getPaddingTop()) - getPaddingBottom()) + Math.min(0.0f, this.f7404g.top) + Math.min(0.0f, this.f7404g.bottom));
            this.f7415o = iM6690c3;
            if (iM6690c3 < 0) {
                this.f7415o = 0;
                this.f7413m = 0;
                return size;
            }
            RectF rectF3 = this.f7404g;
            this.f7413m = m6690c((iM6690c3 - rectF3.top) - rectF3.bottom);
        }
        if (this.f7413m < 0) {
            this.f7415o = 0;
            this.f7413m = 0;
        }
        return size;
    }

    /* renamed from: g */
    public final int m6694g(int i10) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (this.f7412l == 0 && this.f7375C) {
            this.f7412l = this.f7396a.getIntrinsicWidth();
        }
        int iM6690c = m6690c(this.f7392T);
        if (this.f7406h == 0.0f) {
            this.f7406h = 1.8f;
        }
        if (mode != 1073741824) {
            if (this.f7412l == 0) {
                this.f7412l = m6690c(getResources().getDisplayMetrics().density * 20.0f);
            }
            if (this.f7406h == 0.0f) {
                this.f7406h = 1.8f;
            }
            int iM6690c2 = m6690c(this.f7412l * this.f7406h);
            float f10 = iM6690c + this.f7395W;
            float f11 = iM6690c2 - this.f7412l;
            RectF rectF = this.f7404g;
            int iM6690c3 = m6690c(f10 - ((f11 + Math.max(rectF.left, rectF.right)) + this.f7394V));
            float f12 = iM6690c2;
            RectF rectF2 = this.f7404g;
            int iM6690c4 = m6690c(rectF2.left + f12 + rectF2.right + Math.max(0, iM6690c3));
            this.f7414n = iM6690c4;
            if (iM6690c4 >= 0) {
                int iM6690c5 = m6690c(f12 + Math.max(0.0f, this.f7404g.left) + Math.max(0.0f, this.f7404g.right) + Math.max(0, iM6690c3));
                return Math.max(iM6690c5, getPaddingLeft() + iM6690c5 + getPaddingRight());
            }
            this.f7412l = 0;
            this.f7414n = 0;
            return size;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (this.f7412l != 0) {
            int iM6690c6 = m6690c(r2 * this.f7406h);
            int i11 = this.f7395W + iM6690c;
            int i12 = iM6690c6 - this.f7412l;
            RectF rectF3 = this.f7404g;
            int iM6690c7 = i11 - (i12 + m6690c(Math.max(rectF3.left, rectF3.right)));
            float f13 = iM6690c6;
            RectF rectF4 = this.f7404g;
            int iM6690c8 = m6690c(rectF4.left + f13 + rectF4.right + Math.max(iM6690c7, 0));
            this.f7414n = iM6690c8;
            if (iM6690c8 < 0) {
                this.f7412l = 0;
            }
            if (f13 + Math.max(this.f7404g.left, 0.0f) + Math.max(this.f7404g.right, 0.0f) + Math.max(iM6690c7, 0) > paddingLeft) {
                this.f7412l = 0;
            }
        }
        if (this.f7412l == 0) {
            int iM6690c9 = m6690c((((size - getPaddingLeft()) - getPaddingRight()) - Math.max(this.f7404g.left, 0.0f)) - Math.max(this.f7404g.right, 0.0f));
            if (iM6690c9 < 0) {
                this.f7412l = 0;
                this.f7414n = 0;
                return size;
            }
            float f14 = iM6690c9;
            this.f7412l = m6690c(f14 / this.f7406h);
            RectF rectF5 = this.f7404g;
            int iM6690c10 = m6690c(f14 + rectF5.left + rectF5.right);
            this.f7414n = iM6690c10;
            if (iM6690c10 < 0) {
                this.f7412l = 0;
                this.f7414n = 0;
                return size;
            }
            int i13 = iM6690c + this.f7395W;
            int i14 = iM6690c9 - this.f7412l;
            RectF rectF6 = this.f7404g;
            int iM6690c11 = i13 - (i14 + m6690c(Math.max(rectF6.left, rectF6.right)));
            if (iM6690c11 > 0) {
                this.f7412l -= iM6690c11;
            }
            if (this.f7412l < 0) {
                this.f7412l = 0;
                this.f7414n = 0;
            }
        }
        return size;
    }

    public long getAnimationDuration() {
        return this.f7408i;
    }

    public ColorStateList getBackColor() {
        return this.f7398c;
    }

    public Drawable getBackDrawable() {
        return this.f7397b;
    }

    public float getBackRadius() {
        return this.f7402f;
    }

    public PointF getBackSizeF() {
        return new PointF(this.f7424x.width(), this.f7424x.height());
    }

    public CharSequence getTextOff() {
        return this.f7388P;
    }

    public CharSequence getTextOn() {
        return this.f7387O;
    }

    public ColorStateList getThumbColor() {
        return this.f7399d;
    }

    public Drawable getThumbDrawable() {
        return this.f7396a;
    }

    public float getThumbHeight() {
        return this.f7413m;
    }

    public RectF getThumbMargin() {
        return this.f7404g;
    }

    public float getThumbRadius() {
        return this.f7400e;
    }

    public float getThumbRangeRatio() {
        return this.f7406h;
    }

    public float getThumbWidth() {
        return this.f7412l;
    }

    public int getTintColor() {
        return this.f7411k;
    }

    /* renamed from: h */
    public void m6695h(CharSequence charSequence, CharSequence charSequence2) {
        this.f7387O = charSequence;
        this.f7388P = charSequence2;
        this.f7390R = null;
        this.f7391S = null;
        this.f7405g0 = false;
        requestLayout();
        invalidate();
    }

    /* renamed from: i */
    public void m6696i(float f10, float f11, float f12, float f13) {
        this.f7404g.set(f10, f11, f12, f13);
        this.f7405g0 = false;
        requestLayout();
    }

    /* renamed from: j */
    public final void m6697j() {
        int i10;
        if (this.f7412l == 0 || (i10 = this.f7413m) == 0 || this.f7414n == 0 || this.f7415o == 0) {
            return;
        }
        if (this.f7400e == -1.0f) {
            this.f7400e = Math.min(r0, i10) / 2.0f;
        }
        if (this.f7402f == -1.0f) {
            this.f7402f = Math.min(this.f7414n, this.f7415o) / 2.0f;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int iM6690c = m6690c((this.f7414n - Math.min(0.0f, this.f7404g.left)) - Math.min(0.0f, this.f7404g.right));
        float paddingTop = measuredHeight <= m6690c((this.f7415o - Math.min(0.0f, this.f7404g.top)) - Math.min(0.0f, this.f7404g.bottom)) ? getPaddingTop() + Math.max(0.0f, this.f7404g.top) : (((measuredHeight - r3) + 1) / 2.0f) + getPaddingTop() + Math.max(0.0f, this.f7404g.top);
        float paddingLeft = measuredWidth <= this.f7414n ? getPaddingLeft() + Math.max(0.0f, this.f7404g.left) : (((measuredWidth - iM6690c) + 1) / 2.0f) + getPaddingLeft() + Math.max(0.0f, this.f7404g.left);
        this.f7423w.set(paddingLeft, paddingTop, this.f7412l + paddingLeft, this.f7413m + paddingTop);
        RectF rectF = this.f7423w;
        float f10 = rectF.left;
        RectF rectF2 = this.f7404g;
        float f11 = f10 - rectF2.left;
        RectF rectF3 = this.f7424x;
        float f12 = rectF.top;
        float f13 = rectF2.top;
        rectF3.set(f11, f12 - f13, this.f7414n + f11, (f12 - f13) + this.f7415o);
        RectF rectF4 = this.f7425y;
        RectF rectF5 = this.f7423w;
        rectF4.set(rectF5.left, 0.0f, (this.f7424x.right - this.f7404g.right) - rectF5.width(), 0.0f);
        this.f7402f = Math.min(Math.min(this.f7424x.width(), this.f7424x.height()) / 2.0f, this.f7402f);
        Drawable drawable = this.f7397b;
        if (drawable != null) {
            RectF rectF6 = this.f7424x;
            drawable.setBounds((int) rectF6.left, (int) rectF6.top, m6690c(rectF6.right), m6690c(this.f7424x.bottom));
        }
        if (this.f7390R != null) {
            RectF rectF7 = this.f7424x;
            float fWidth = (rectF7.left + (((((rectF7.width() + this.f7394V) - this.f7412l) - this.f7404g.right) - this.f7390R.getWidth()) / 2.0f)) - this.f7401e0;
            RectF rectF8 = this.f7424x;
            float fHeight = rectF8.top + ((rectF8.height() - this.f7390R.getHeight()) / 2.0f);
            this.f7426z.set(fWidth, fHeight, this.f7390R.getWidth() + fWidth, this.f7390R.getHeight() + fHeight);
        }
        if (this.f7391S != null) {
            RectF rectF9 = this.f7424x;
            float fWidth2 = ((rectF9.right - (((((rectF9.width() + this.f7394V) - this.f7412l) - this.f7404g.left) - this.f7391S.getWidth()) / 2.0f)) - this.f7391S.getWidth()) + this.f7401e0;
            RectF rectF10 = this.f7424x;
            float fHeight2 = rectF10.top + ((rectF10.height() - this.f7391S.getHeight()) / 2.0f);
            this.f7373A.set(fWidth2, fHeight2, this.f7391S.getWidth() + fWidth2, this.f7391S.getHeight() + fHeight2);
        }
        this.f7405g0 = true;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f7405g0) {
            m6697j();
        }
        if (this.f7405g0) {
            if (this.f7376D) {
                if (!this.f7410j || this.f7421u == null || this.f7422v == null) {
                    this.f7397b.setAlpha(255);
                    this.f7397b.draw(canvas);
                } else {
                    Drawable drawable = isChecked() ? this.f7421u : this.f7422v;
                    Drawable drawable2 = isChecked() ? this.f7422v : this.f7421u;
                    int progress = (int) (getProgress() * 255.0f);
                    drawable.setAlpha(progress);
                    drawable.draw(canvas);
                    drawable2.setAlpha(255 - progress);
                    drawable2.draw(canvas);
                }
            } else if (this.f7410j) {
                int i10 = isChecked() ? this.f7417q : this.f7418r;
                int i11 = isChecked() ? this.f7418r : this.f7417q;
                int progress2 = (int) (getProgress() * 255.0f);
                this.f7374B.setARGB((Color.alpha(i10) * progress2) / 255, Color.red(i10), Color.green(i10), Color.blue(i10));
                RectF rectF = this.f7424x;
                float f10 = this.f7402f;
                canvas.drawRoundRect(rectF, f10, f10, this.f7374B);
                this.f7374B.setARGB((Color.alpha(i11) * (255 - progress2)) / 255, Color.red(i11), Color.green(i11), Color.blue(i11));
                RectF rectF2 = this.f7424x;
                float f11 = this.f7402f;
                canvas.drawRoundRect(rectF2, f11, f11, this.f7374B);
                this.f7374B.setAlpha(255);
            } else {
                this.f7374B.setColor(this.f7417q);
                RectF rectF3 = this.f7424x;
                float f12 = this.f7402f;
                canvas.drawRoundRect(rectF3, f12, f12, this.f7374B);
            }
            Layout layout = ((double) getProgress()) > 0.5d ? this.f7390R : this.f7391S;
            RectF rectF4 = ((double) getProgress()) > 0.5d ? this.f7426z : this.f7373A;
            if (layout != null && rectF4 != null) {
                int progress3 = (int) ((((double) getProgress()) >= 0.75d ? (getProgress() * 4.0f) - 3.0f : ((double) getProgress()) < 0.25d ? 1.0f - (getProgress() * 4.0f) : 0.0f) * 255.0f);
                int i12 = ((double) getProgress()) > 0.5d ? this.f7419s : this.f7420t;
                layout.getPaint().setARGB((Color.alpha(i12) * progress3) / 255, Color.red(i12), Color.green(i12), Color.blue(i12));
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                layout.draw(canvas);
                canvas.restore();
            }
            this.f7380H.set(this.f7423w);
            this.f7380H.offset(this.f7379G * this.f7425y.width(), 0.0f);
            if (this.f7375C) {
                Drawable drawable3 = this.f7396a;
                RectF rectF5 = this.f7380H;
                drawable3.setBounds((int) rectF5.left, (int) rectF5.top, m6690c(rectF5.right), m6690c(this.f7380H.bottom));
                this.f7396a.draw(canvas);
            } else {
                this.f7374B.setColor(this.f7416p);
                RectF rectF6 = this.f7380H;
                float f13 = this.f7400e;
                canvas.drawRoundRect(rectF6, f13, f13, this.f7374B);
            }
            if (this.f7377E) {
                this.f7386N.setColor(Color.parseColor("#AA0000"));
                canvas.drawRect(this.f7424x, this.f7386N);
                this.f7386N.setColor(Color.parseColor("#0000FF"));
                canvas.drawRect(this.f7380H, this.f7386N);
                this.f7386N.setColor(Color.parseColor("#000000"));
                RectF rectF7 = this.f7425y;
                float f14 = rectF7.left;
                float f15 = this.f7423w.top;
                canvas.drawLine(f14, f15, rectF7.right, f15, this.f7386N);
                this.f7386N.setColor(Color.parseColor("#00CC00"));
                canvas.drawRect(((double) getProgress()) > 0.5d ? this.f7426z : this.f7373A, this.f7386N);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f7390R == null && !TextUtils.isEmpty(this.f7387O)) {
            this.f7390R = m6692e(this.f7387O);
        }
        if (this.f7391S == null && !TextUtils.isEmpty(this.f7388P)) {
            this.f7391S = m6692e(this.f7388P);
        }
        float width = this.f7390R != null ? r0.getWidth() : 0.0f;
        float width2 = this.f7391S != null ? r2.getWidth() : 0.0f;
        if (width == 0.0f && width2 == 0.0f) {
            this.f7392T = 0.0f;
        } else {
            this.f7392T = Math.max(width, width2);
        }
        float height = this.f7390R != null ? r0.getHeight() : 0.0f;
        float height2 = this.f7391S != null ? r2.getHeight() : 0.0f;
        if (height == 0.0f && height2 == 0.0f) {
            this.f7393U = 0.0f;
        } else {
            this.f7393U = Math.max(height, height2);
        }
        setMeasuredDimension(m6694g(i10), m6693f(i11));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        m6695h(savedState.f7427a, savedState.f7428b);
        this.f7403f0 = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7403f0 = false;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7427a = this.f7387O;
        savedState.f7428b = this.f7388P;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        m6697j();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.button.switchbutton.SwitchButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setAnimationDuration(long j10) {
        this.f7408i = j10;
    }

    public void setBackColor(ColorStateList colorStateList) {
        this.f7398c = colorStateList;
        if (colorStateList != null) {
            setBackDrawable(null);
        }
        invalidate();
    }

    public void setBackColorRes(int i10) {
        setBackColor(ContextCompat.getColorStateList(getContext(), i10));
    }

    public void setBackDrawable(Drawable drawable) {
        this.f7397b = drawable;
        this.f7376D = drawable != null;
        refreshDrawableState();
        this.f7405g0 = false;
        requestLayout();
        invalidate();
    }

    public void setBackDrawableRes(int i10) {
        setBackDrawable(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setBackRadius(float f10) {
        this.f7402f = f10;
        if (this.f7376D) {
            return;
        }
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        if (isChecked() != z10) {
            m6688a(z10);
        }
        if (this.f7403f0) {
            setCheckedImmediatelyNoEvent(z10);
        } else {
            super.setChecked(z10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.smtt.audio.core.db.ApnHelper, com.tencent.smtt.audio.core.db.ApnHelper$2, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener] */
    public void setCheckedImmediately(boolean z10) {
        super.setChecked(z10);
        ObjectAnimator objectAnimator = this.f7378F;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ?? dialogInterfaceOnClickListenerC67382 = new ApnHelper.DialogInterfaceOnClickListenerC67382(dialogInterfaceOnClickListenerC67382, dialogInterfaceOnClickListenerC67382);
        }
        setProgress(z10 ? 1.0f : 0.0f);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z10) {
        if (this.f7409i0 == null) {
            setCheckedImmediately(z10);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z10);
        super.setOnCheckedChangeListener(this.f7409i0);
    }

    public void setCheckedNoEvent(boolean z10) {
        if (this.f7409i0 == null) {
            setChecked(z10);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z10);
        super.setOnCheckedChangeListener(this.f7409i0);
    }

    public void setDrawDebugRect(boolean z10) {
        this.f7377E = z10;
        invalidate();
    }

    public void setFadeBack(boolean z10) {
        this.f7410j = z10;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f7409i0 = onCheckedChangeListener;
    }

    public void setTextAdjust(int i10) {
        this.f7401e0 = i10;
        this.f7405g0 = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i10) {
        this.f7395W = i10;
        this.f7405g0 = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int i10) {
        this.f7394V = i10;
        this.f7405g0 = false;
        requestLayout();
        invalidate();
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.f7399d = colorStateList;
        if (colorStateList != null) {
            setThumbDrawable(null);
        }
        invalidate();
    }

    public void setThumbColorRes(int i10) {
        setThumbColor(ContextCompat.getColorStateList(getContext(), i10));
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f7396a = drawable;
        this.f7375C = drawable != null;
        refreshDrawableState();
        this.f7405g0 = false;
        requestLayout();
        invalidate();
    }

    public void setThumbDrawableRes(int i10) {
        setThumbDrawable(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            m6696i(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            m6696i(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void setThumbRadius(float f10) {
        this.f7400e = f10;
        if (this.f7375C) {
            return;
        }
        invalidate();
    }

    public void setThumbRangeRatio(float f10) {
        this.f7406h = f10;
        this.f7405g0 = false;
        requestLayout();
    }

    public void setTintColor(int i10) {
        this.f7411k = i10;
        this.f7399d = AbstractC6902a.m6701b(i10);
        this.f7398c = AbstractC6902a.m6700a(this.f7411k);
        this.f7376D = false;
        this.f7375C = false;
        refreshDrawableState();
        invalidate();
    }
}
