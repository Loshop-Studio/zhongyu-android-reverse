package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p005b.p014h.C0071b0;
import p000a.p005b.p014h.C0085i;
import p000a.p005b.p014h.C0113w;
import p000a.p031h.p033c.C0192a;
import p000a.p031h.p041h.C0234a;
import p000a.p031h.p043j.C0243a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p049j.p050a.AbstractC0287a;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p075a.p076a.p080c.C0570a;
import p070b.p074b.p075a.p076a.p096r.C0647b;
import p070b.p074b.p075a.p076a.p096r.C0648c;
import p070b.p074b.p075a.p076a.p098t.C0662a;
import p070b.p074b.p075a.p076a.p098t.C0663b;
import p070b.p074b.p075a.p076a.p101w.C0675g;
import p070b.p074b.p075a.p076a.p101w.C0678j;
import p070b.p074b.p075a.p076a.p104z.AbstractC0701m;
import p070b.p074b.p075a.p076a.p104z.C0695g;
import p070b.p074b.p075a.p076a.p104z.C0702n;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: A */
    public CharSequence f4980A;

    /* renamed from: A0 */
    public int f4981A0;

    /* renamed from: B */
    public boolean f4982B;

    /* renamed from: B0 */
    public int f4983B0;

    /* renamed from: C */
    public C0675g f4984C;

    /* renamed from: C0 */
    public int f4985C0;

    /* renamed from: D */
    public C0675g f4986D;

    /* renamed from: D0 */
    public boolean f4987D0;

    /* renamed from: E */
    public C0678j f4988E;

    /* renamed from: E0 */
    public final C0648c f4989E0;

    /* renamed from: F */
    public final int f4990F;

    /* renamed from: F0 */
    public boolean f4991F0;

    /* renamed from: G */
    public int f4992G;

    /* renamed from: G0 */
    public ValueAnimator f4993G0;

    /* renamed from: H */
    public final int f4994H;

    /* renamed from: H0 */
    public boolean f4995H0;

    /* renamed from: I */
    public int f4996I;

    /* renamed from: I0 */
    public boolean f4997I0;

    /* renamed from: J */
    public int f4998J;

    /* renamed from: K */
    public int f4999K;

    /* renamed from: L */
    public int f5000L;

    /* renamed from: M */
    public int f5001M;

    /* renamed from: N */
    public final Rect f5002N;

    /* renamed from: O */
    public final Rect f5003O;

    /* renamed from: P */
    public final RectF f5004P;

    /* renamed from: Q */
    public Typeface f5005Q;

    /* renamed from: R */
    public final CheckableImageButton f5006R;

    /* renamed from: S */
    public ColorStateList f5007S;

    /* renamed from: T */
    public boolean f5008T;

    /* renamed from: U */
    public PorterDuff.Mode f5009U;

    /* renamed from: V */
    public boolean f5010V;

    /* renamed from: W */
    public Drawable f5011W;

    /* renamed from: a0 */
    public int f5012a0;

    /* renamed from: b */
    public final FrameLayout f5013b;

    /* renamed from: b0 */
    public View.OnLongClickListener f5014b0;

    /* renamed from: c */
    public final LinearLayout f5015c;

    /* renamed from: c0 */
    public final LinkedHashSet<InterfaceC0946f> f5016c0;

    /* renamed from: d */
    public final LinearLayout f5017d;

    /* renamed from: d0 */
    public int f5018d0;

    /* renamed from: e */
    public final FrameLayout f5019e;

    /* renamed from: e0 */
    public final SparseArray<AbstractC0701m> f5020e0;

    /* renamed from: f */
    public EditText f5021f;

    /* renamed from: f0 */
    public final CheckableImageButton f5022f0;

    /* renamed from: g */
    public CharSequence f5023g;

    /* renamed from: g0 */
    public final LinkedHashSet<InterfaceC0947g> f5024g0;

    /* renamed from: h */
    public final C0702n f5025h;

    /* renamed from: h0 */
    public ColorStateList f5026h0;

    /* renamed from: i */
    public boolean f5027i;

    /* renamed from: i0 */
    public boolean f5028i0;

    /* renamed from: j */
    public int f5029j;

    /* renamed from: j0 */
    public PorterDuff.Mode f5030j0;

    /* renamed from: k */
    public boolean f5031k;

    /* renamed from: k0 */
    public boolean f5032k0;

    /* renamed from: l */
    public TextView f5033l;

    /* renamed from: l0 */
    public Drawable f5034l0;

    /* renamed from: m */
    public int f5035m;

    /* renamed from: m0 */
    public int f5036m0;

    /* renamed from: n */
    public int f5037n;

    /* renamed from: n0 */
    public Drawable f5038n0;

    /* renamed from: o */
    public CharSequence f5039o;

    /* renamed from: o0 */
    public View.OnLongClickListener f5040o0;

    /* renamed from: p */
    public boolean f5041p;

    /* renamed from: p0 */
    public View.OnLongClickListener f5042p0;

    /* renamed from: q */
    public TextView f5043q;

    /* renamed from: q0 */
    public final CheckableImageButton f5044q0;

    /* renamed from: r */
    public ColorStateList f5045r;

    /* renamed from: r0 */
    public ColorStateList f5046r0;

    /* renamed from: s */
    public int f5047s;

    /* renamed from: s0 */
    public ColorStateList f5048s0;

    /* renamed from: t */
    public ColorStateList f5049t;

    /* renamed from: t0 */
    public ColorStateList f5050t0;

    /* renamed from: u */
    public ColorStateList f5051u;

    /* renamed from: u0 */
    public int f5052u0;

    /* renamed from: v */
    public CharSequence f5053v;

    /* renamed from: v0 */
    public int f5054v0;

    /* renamed from: w */
    public final TextView f5055w;

    /* renamed from: w0 */
    public int f5056w0;

    /* renamed from: x */
    public CharSequence f5057x;

    /* renamed from: x0 */
    public ColorStateList f5058x0;

    /* renamed from: y */
    public final TextView f5059y;

    /* renamed from: y0 */
    public int f5060y0;

    /* renamed from: z */
    public boolean f5061z;

    /* renamed from: z0 */
    public int f5062z0;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C0941a implements TextWatcher {
        public C0941a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.m2711y(!r0.f4997I0, false);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f5027i) {
                textInputLayout.m2705s(editable.length());
            }
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f5041p) {
                textInputLayout2.m2712z(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class RunnableC0942b implements Runnable {
        public RunnableC0942b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f5022f0.performClick();
            TextInputLayout.this.f5022f0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class RunnableC0943c implements Runnable {
        public RunnableC0943c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f5021f.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C0944d implements ValueAnimator.AnimatorUpdateListener {
        public C0944d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f4989E0.m2256o(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C0945e extends C0243a {

        /* renamed from: d */
        public final TextInputLayout f5067d;

        public C0945e(TextInputLayout textInputLayout) {
            this.f5067d = textInputLayout;
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: d */
        public void mo810d(View view, C0245b c0245b) {
            this.f1556a.onInitializeAccessibilityNodeInfo(view, c0245b.f1563a);
            EditText editText = this.f5067d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f5067d.getHint();
            CharSequence helperText = this.f5067d.getHelperText();
            CharSequence error = this.f5067d.getError();
            int counterMaxLength = this.f5067d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f5067d.getCounterOverflowDescription();
            boolean z = true;
            boolean z2 = !TextUtils.isEmpty(text);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !TextUtils.isEmpty(helperText);
            boolean z5 = !TextUtils.isEmpty(error);
            if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
                z = false;
            }
            String string = z3 ? hint.toString() : BuildConfig.FLAVOR;
            StringBuilder sbM2079g = C0561a.m2079g(string);
            sbM2079g.append(((z5 || z4) && !TextUtils.isEmpty(string)) ? ", " : BuildConfig.FLAVOR);
            StringBuilder sbM2079g2 = C0561a.m2079g(sbM2079g.toString());
            if (z5) {
                helperText = error;
            } else if (!z4) {
                helperText = BuildConfig.FLAVOR;
            }
            sbM2079g2.append((Object) helperText);
            String string2 = sbM2079g2.toString();
            if (z2) {
                c0245b.f1563a.setText(text);
            } else if (!TextUtils.isEmpty(string2)) {
                c0245b.f1563a.setText(string2);
            }
            if (!TextUtils.isEmpty(string2)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    c0245b.m826k(string2);
                } else {
                    if (z2) {
                        string2 = ((Object) text) + ", " + string2;
                    }
                    c0245b.f1563a.setText(string2);
                }
                boolean z6 = !z2;
                if (i >= 26) {
                    c0245b.f1563a.setShowingHintText(z6);
                } else {
                    c0245b.m823h(4, z6);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            c0245b.f1563a.setMaxTextLength(counterMaxLength);
            if (z) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                c0245b.f1563a.setError(error);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface InterfaceC0946f {
        /* renamed from: a */
        void mo2329a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface InterfaceC0947g {
        /* renamed from: a */
        void mo2330a(TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public static class C0948h extends AbstractC0287a {
        public static final Parcelable.Creator<C0948h> CREATOR = new a();

        /* renamed from: d */
        public CharSequence f5068d;

        /* renamed from: e */
        public boolean f5069e;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0948h> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0948h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0948h[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0948h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0948h(parcel, classLoader);
            }
        }

        public C0948h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5068d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f5069e = parcel.readInt() == 1;
        }

        public C0948h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbM2079g = C0561a.m2079g("TextInputLayout.SavedState{");
            sbM2079g.append(Integer.toHexString(System.identityHashCode(this)));
            sbM2079g.append(" error=");
            sbM2079g.append((Object) this.f5068d);
            sbM2079g.append("}");
            return sbM2079g.toString();
        }

        @Override // p000a.p049j.p050a.AbstractC0287a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1718b, i);
            TextUtils.writeToParcel(this.f5068d, parcel, i);
            parcel.writeInt(this.f5069e ? 1 : 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x049e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r31, android.util.AttributeSet r32) {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private AbstractC0701m getEndIconDelegate() {
        AbstractC0701m abstractC0701m = this.f5020e0.get(this.f5018d0);
        return abstractC0701m != null ? abstractC0701m : this.f5020e0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f5044q0.getVisibility() == 0) {
            return this.f5044q0;
        }
        if (m2699k() && m2700l()) {
            return this.f5022f0;
        }
        return null;
    }

    /* renamed from: o */
    public static void m2681o(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m2681o((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: p */
    public static void m2682p(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        if (this.f5021f != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f5018d0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f5021f = editText;
        m2701m();
        setTextInputAccessibilityDelegate(new C0945e(this));
        this.f4989E0.m2258q(this.f5021f.getTypeface());
        C0648c c0648c = this.f4989E0;
        float textSize = this.f5021f.getTextSize();
        if (c0648c.f3903i != textSize) {
            c0648c.f3903i = textSize;
            c0648c.m2253k();
        }
        int gravity = this.f5021f.getGravity();
        this.f4989E0.m2255n((gravity & (-113)) | 48);
        C0648c c0648c2 = this.f4989E0;
        if (c0648c2.f3901g != gravity) {
            c0648c2.f3901g = gravity;
            c0648c2.m2253k();
        }
        this.f5021f.addTextChangedListener(new C0941a());
        if (this.f5048s0 == null) {
            this.f5048s0 = this.f5021f.getHintTextColors();
        }
        if (this.f5061z) {
            if (TextUtils.isEmpty(this.f4980A)) {
                CharSequence hint = this.f5021f.getHint();
                this.f5023g = hint;
                setHint(hint);
                this.f5021f.setHint((CharSequence) null);
            }
            this.f4982B = true;
        }
        if (this.f5033l != null) {
            m2705s(this.f5021f.getText().length());
        }
        m2708v();
        this.f5025h.m2340b();
        this.f5015c.bringToFront();
        this.f5017d.bringToFront();
        this.f5019e.bringToFront();
        this.f5044q0.bringToFront();
        Iterator<InterfaceC0946f> it = this.f5016c0.iterator();
        while (it.hasNext()) {
            it.next().mo2329a(this);
        }
        m2683A();
        m2686D();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m2711y(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.f5044q0.setVisibility(z ? 0 : 8);
        this.f5019e.setVisibility(z ? 8 : 0);
        m2686D();
        if (m2699k()) {
            return;
        }
        m2707u();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f4980A)) {
            return;
        }
        this.f4980A = charSequence;
        C0648c c0648c = this.f4989E0;
        if (charSequence == null || !TextUtils.equals(c0648c.f3917w, charSequence)) {
            c0648c.f3917w = charSequence;
            c0648c.f3918x = null;
            Bitmap bitmap = c0648c.f3920z;
            if (bitmap != null) {
                bitmap.recycle();
                c0648c.f3920z = null;
            }
            c0648c.m2253k();
        }
        if (this.f4987D0) {
            return;
        }
        m2702n();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f5041p == z) {
            return;
        }
        if (z) {
            C0113w c0113w = new C0113w(getContext(), null);
            this.f5043q = c0113w;
            c0113w.setId(C1088R.id.textinput_placeholder);
            TextView textView = this.f5043q;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            textView.setAccessibilityLiveRegion(1);
            setPlaceholderTextAppearance(this.f5047s);
            setPlaceholderTextColor(this.f5045r);
            TextView textView2 = this.f5043q;
            if (textView2 != null) {
                this.f5013b.addView(textView2);
                this.f5043q.setVisibility(0);
            }
        } else {
            TextView textView3 = this.f5043q;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            this.f5043q = null;
        }
        this.f5041p = z;
    }

    /* renamed from: A */
    public final void m2683A() {
        int paddingStart;
        if (this.f5021f == null) {
            return;
        }
        if (this.f5006R.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            EditText editText = this.f5021f;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            paddingStart = editText.getPaddingStart();
        }
        TextView textView = this.f5055w;
        int compoundPaddingTop = this.f5021f.getCompoundPaddingTop();
        int compoundPaddingBottom = this.f5021f.getCompoundPaddingBottom();
        WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
        textView.setPaddingRelative(paddingStart, compoundPaddingTop, 0, compoundPaddingBottom);
    }

    /* renamed from: B */
    public final void m2684B() {
        this.f5055w.setVisibility((this.f5053v == null || this.f4987D0) ? 8 : 0);
        m2707u();
    }

    /* renamed from: C */
    public final void m2685C(boolean z, boolean z2) {
        int defaultColor = this.f5058x0.getDefaultColor();
        int colorForState = this.f5058x0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f5058x0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f5000L = colorForState2;
        } else if (z2) {
            this.f5000L = colorForState;
        } else {
            this.f5000L = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2686D() {
        /*
            r6 = this;
            android.widget.EditText r0 = r6.f5021f
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r6.m2700l()
            r1 = 0
            if (r0 != 0) goto L23
            com.google.android.material.internal.CheckableImageButton r0 = r6.f5044q0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L1a
            goto L23
        L1a:
            android.widget.EditText r0 = r6.f5021f
            java.util.WeakHashMap<android.view.View, a.h.j.v> r2 = p000a.p031h.p043j.C0266o.f1616a
            int r0 = r0.getPaddingEnd()
            goto L24
        L23:
            r0 = r1
        L24:
            android.widget.TextView r2 = r6.f5059y
            android.widget.EditText r3 = r6.f5021f
            int r3 = r3.getPaddingTop()
            android.widget.EditText r4 = r6.f5021f
            int r4 = r4.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, a.h.j.v> r5 = p000a.p031h.p043j.C0266o.f1616a
            r2.setPaddingRelative(r1, r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2686D():void");
    }

    /* renamed from: E */
    public final void m2687E() {
        int visibility = this.f5059y.getVisibility();
        boolean z = (this.f5057x == null || this.f4987D0) ? false : true;
        this.f5059y.setVisibility(z ? 0 : 8);
        if (visibility != this.f5059y.getVisibility()) {
            getEndIconDelegate().mo2327c(z);
        }
        m2707u();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2688F() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2688F():void");
    }

    /* renamed from: a */
    public void m2689a(InterfaceC0946f interfaceC0946f) {
        this.f5016c0.add(interfaceC0946f);
        if (this.f5021f != null) {
            interfaceC0946f.mo2329a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f5013b.addView(view, layoutParams2);
        this.f5013b.setLayoutParams(layoutParams);
        m2710x();
        setEditText((EditText) view);
    }

    /* renamed from: b */
    public void m2690b(float f2) {
        if (this.f4989E0.f3897c == f2) {
            return;
        }
        if (this.f4993G0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f4993G0 = valueAnimator;
            valueAnimator.setInterpolator(C0570a.f3535b);
            this.f4993G0.setDuration(167L);
            this.f4993G0.addUpdateListener(new C0944d());
        }
        this.f4993G0.setFloatValues(this.f4989E0.f3897c, f2);
        this.f4993G0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2691c() {
        /*
            r6 = this;
            b.b.a.a.w.g r0 = r6.f4984C
            if (r0 != 0) goto L5
            return
        L5:
            b.b.a.a.w.j r1 = r6.f4988E
            r0.setShapeAppearanceModel(r1)
            int r0 = r6.f4992G
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L21
            int r0 = r6.f4996I
            if (r0 <= r2) goto L1c
            int r0 = r6.f5000L
            if (r0 == 0) goto L1c
            r0 = r4
            goto L1d
        L1c:
            r0 = r3
        L1d:
            if (r0 == 0) goto L21
            r0 = r4
            goto L22
        L21:
            r0 = r3
        L22:
            if (r0 == 0) goto L2e
            b.b.a.a.w.g r0 = r6.f4984C
            int r1 = r6.f4996I
            float r1 = (float) r1
            int r5 = r6.f5000L
            r0.m2298r(r1, r5)
        L2e:
            int r0 = r6.f5001M
            int r1 = r6.f4992G
            if (r1 != r4) goto L45
            r0 = 2130968943(0x7f04016f, float:1.7546554E38)
            android.content.Context r1 = r6.getContext()
            int r0 = p070b.p074b.p075a.p076a.C0562a.m2084e(r1, r0, r3)
            int r1 = r6.f5001M
            int r0 = p000a.p031h.p035d.C0202a.m755a(r1, r0)
        L45:
            r6.f5001M = r0
            b.b.a.a.w.g r1 = r6.f4984C
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.m2296p(r0)
            int r0 = r6.f5018d0
            r1 = 3
            if (r0 != r1) goto L5e
            android.widget.EditText r0 = r6.f5021f
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L5e:
            b.b.a.a.w.g r0 = r6.f4986D
            if (r0 != 0) goto L63
            goto L7a
        L63:
            int r1 = r6.f4996I
            if (r1 <= r2) goto L6c
            int r1 = r6.f5000L
            if (r1 == 0) goto L6c
            r3 = r4
        L6c:
            if (r3 == 0) goto L77
            int r1 = r6.f5000L
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.m2296p(r1)
        L77:
            r6.invalidate()
        L7a:
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2691c():void");
    }

    /* renamed from: d */
    public final void m2692d() {
        m2693e(this.f5022f0, this.f5028i0, this.f5026h0, this.f5032k0, this.f5030j0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f5023g == null || (editText = this.f5021f) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f4982B;
        this.f4982B = false;
        CharSequence hint = editText.getHint();
        this.f5021f.setHint(this.f5023g);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f5021f.setHint(hint);
            this.f4982B = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f4997I0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f4997I0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f5061z) {
            C0648c c0648c = this.f4989E0;
            Objects.requireNonNull(c0648c);
            int iSave = canvas.save();
            if (c0648c.f3918x != null && c0648c.f3896b) {
                c0648c.f3890M.getLineLeft(0);
                c0648c.f3882E.setTextSize(c0648c.f3879B);
                float f2 = c0648c.f3911q;
                float f3 = c0648c.f3912r;
                float f4 = c0648c.f3878A;
                if (f4 != 1.0f) {
                    canvas.scale(f4, f4, f2, f3);
                }
                canvas.translate(f2, f3);
                c0648c.f3890M.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        C0675g c0675g = this.f4986D;
        if (c0675g != null) {
            Rect bounds = c0675g.getBounds();
            bounds.top = bounds.bottom - this.f4996I;
            this.f4986D.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        if (this.f4995H0) {
            return;
        }
        this.f4995H0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0648c c0648c = this.f4989E0;
        if (c0648c != null) {
            c0648c.f3880C = drawableState;
            ColorStateList colorStateList2 = c0648c.f3906l;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c0648c.f3905k) != null && colorStateList.isStateful())) {
                c0648c.m2253k();
                z2 = true;
            } else {
                z2 = false;
            }
            z = z2 | false;
        } else {
            z = false;
        }
        if (this.f5021f != null) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            m2711y(isLaidOut() && isEnabled(), false);
        }
        m2708v();
        m2688F();
        if (z) {
            invalidate();
        }
        this.f4995H0 = false;
    }

    /* renamed from: e */
    public final void m2693e(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: f */
    public final void m2694f() {
        m2693e(this.f5006R, this.f5008T, this.f5007S, this.f5010V, this.f5009U);
    }

    /* renamed from: g */
    public final int m2695g() {
        float fM2249f;
        if (!this.f5061z) {
            return 0;
        }
        int i = this.f4992G;
        if (i == 0 || i == 1) {
            fM2249f = this.f4989E0.m2249f();
        } else {
            if (i != 2) {
                return 0;
            }
            fM2249f = this.f4989E0.m2249f() / 2.0f;
        }
        return (int) fM2249f;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f5021f;
        if (editText == null) {
            return super.getBaseline();
        }
        return m2695g() + getPaddingTop() + editText.getBaseline();
    }

    public C0675g getBoxBackground() {
        int i = this.f4992G;
        if (i == 1 || i == 2) {
            return this.f4984C;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f5001M;
    }

    public int getBoxBackgroundMode() {
        return this.f4992G;
    }

    public float getBoxCornerRadiusBottomEnd() {
        C0675g c0675g = this.f4984C;
        return c0675g.f3998b.f4021a.f4051h.mo2279a(c0675g.m2288h());
    }

    public float getBoxCornerRadiusBottomStart() {
        C0675g c0675g = this.f4984C;
        return c0675g.f3998b.f4021a.f4050g.mo2279a(c0675g.m2288h());
    }

    public float getBoxCornerRadiusTopEnd() {
        C0675g c0675g = this.f4984C;
        return c0675g.f3998b.f4021a.f4049f.mo2279a(c0675g.m2288h());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f4984C.m2292l();
    }

    public int getBoxStrokeColor() {
        return this.f5056w0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f5058x0;
    }

    public int getBoxStrokeWidth() {
        return this.f4998J;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f4999K;
    }

    public int getCounterMaxLength() {
        return this.f5029j;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f5027i && this.f5031k && (textView = this.f5033l) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f5049t;
    }

    public ColorStateList getCounterTextColor() {
        return this.f5049t;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f5048s0;
    }

    public EditText getEditText() {
        return this.f5021f;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f5022f0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f5022f0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f5018d0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f5022f0;
    }

    public CharSequence getError() {
        C0702n c0702n = this.f5025h;
        if (c0702n.f4174l) {
            return c0702n.f4173k;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f5025h.f4176n;
    }

    public int getErrorCurrentTextColors() {
        return this.f5025h.m2345g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f5044q0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f5025h.m2345g();
    }

    public CharSequence getHelperText() {
        C0702n c0702n = this.f5025h;
        if (c0702n.f4180r) {
            return c0702n.f4179q;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f5025h.f4181s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f5061z) {
            return this.f4980A;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f4989E0.m2249f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f4989E0.m2250g();
    }

    public ColorStateList getHintTextColor() {
        return this.f5050t0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f5022f0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f5022f0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f5041p) {
            return this.f5039o;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f5047s;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f5045r;
    }

    public CharSequence getPrefixText() {
        return this.f5053v;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f5055w.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f5055w;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f5006R.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f5006R.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f5057x;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f5059y.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f5059y;
    }

    public Typeface getTypeface() {
        return this.f5005Q;
    }

    /* renamed from: h */
    public final boolean m2696h() {
        return this.f5061z && !TextUtils.isEmpty(this.f4980A) && (this.f4984C instanceof C0695g);
    }

    /* renamed from: i */
    public final int m2697i(int i, boolean z) {
        int compoundPaddingLeft = this.f5021f.getCompoundPaddingLeft() + i;
        return (this.f5053v == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f5055w.getMeasuredWidth()) + this.f5055w.getPaddingLeft();
    }

    /* renamed from: j */
    public final int m2698j(int i, boolean z) {
        int compoundPaddingRight = i - this.f5021f.getCompoundPaddingRight();
        return (this.f5053v == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f5055w.getMeasuredWidth() - this.f5055w.getPaddingRight());
    }

    /* renamed from: k */
    public final boolean m2699k() {
        return this.f5018d0 != 0;
    }

    /* renamed from: l */
    public boolean m2700l() {
        return this.f5019e.getVisibility() == 0 && this.f5022f0.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2701m() {
        /*
            r4 = this;
            int r0 = r4.f4992G
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L51
            if (r0 == r2) goto L40
            r3 = 2
            if (r0 != r3) goto L27
            boolean r0 = r4.f5061z
            if (r0 == 0) goto L1d
            b.b.a.a.w.g r0 = r4.f4984C
            boolean r0 = r0 instanceof p070b.p074b.p075a.p076a.p104z.C0695g
            if (r0 != 0) goto L1d
            b.b.a.a.z.g r0 = new b.b.a.a.z.g
            b.b.a.a.w.j r3 = r4.f4988E
            r0.<init>(r3)
            goto L24
        L1d:
            b.b.a.a.w.g r0 = new b.b.a.a.w.g
            b.b.a.a.w.j r3 = r4.f4988E
            r0.<init>(r3)
        L24:
            r4.f4984C = r0
            goto L53
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r4.f4992G
            r1.append(r2)
            java.lang.String r2 = " is illegal; only @BoxBackgroundMode constants are supported."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L40:
            b.b.a.a.w.g r0 = new b.b.a.a.w.g
            b.b.a.a.w.j r1 = r4.f4988E
            r0.<init>(r1)
            r4.f4984C = r0
            b.b.a.a.w.g r0 = new b.b.a.a.w.g
            r0.<init>()
            r4.f4986D = r0
            goto L55
        L51:
            r4.f4984C = r1
        L53:
            r4.f4986D = r1
        L55:
            android.widget.EditText r0 = r4.f5021f
            if (r0 == 0) goto L68
            b.b.a.a.w.g r1 = r4.f4984C
            if (r1 == 0) goto L68
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L68
            int r0 = r4.f4992G
            if (r0 == 0) goto L68
            goto L69
        L68:
            r2 = 0
        L69:
            if (r2 == 0) goto L74
            android.widget.EditText r0 = r4.f5021f
            b.b.a.a.w.g r1 = r4.f4984C
            java.util.WeakHashMap<android.view.View, a.h.j.v> r2 = p000a.p031h.p043j.C0266o.f1616a
            r0.setBackground(r1)
        L74:
            r4.m2688F()
            int r0 = r4.f4992G
            if (r0 == 0) goto L7e
            r4.m2710x()
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2701m():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2702n() {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2702n():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f5021f != null && this.f5021f.getMeasuredHeight() < (iMax = Math.max(this.f5017d.getMeasuredHeight(), this.f5015c.getMeasuredHeight()))) {
            this.f5021f.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM2707u = m2707u();
        if (z || zM2707u) {
            this.f5021f.post(new RunnableC0943c());
        }
        if (this.f5043q != null && (editText = this.f5021f) != null) {
            this.f5043q.setGravity(editText.getGravity());
            this.f5043q.setPadding(this.f5021f.getCompoundPaddingLeft(), this.f5021f.getCompoundPaddingTop(), this.f5021f.getCompoundPaddingRight(), this.f5021f.getCompoundPaddingBottom());
        }
        m2683A();
        m2686D();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0948h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0948h c0948h = (C0948h) parcelable;
        super.onRestoreInstanceState(c0948h.f1718b);
        setError(c0948h.f5068d);
        if (c0948h.f5069e) {
            this.f5022f0.post(new RunnableC0942b());
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0948h c0948h = new C0948h(super.onSaveInstanceState());
        if (this.f5025h.m2343e()) {
            c0948h.f5068d = getError();
        }
        c0948h.f5069e = m2699k() && this.f5022f0.isChecked();
        return c0948h;
    }

    /* renamed from: q */
    public void m2703q(TextView textView, int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(C1088R.style.TextAppearance_AppCompat_Caption);
            Context context = getContext();
            Object obj = C0192a.f1425a;
            textView.setTextColor(C0192a.d.m741a(context, C1088R.color.design_error));
        }
    }

    /* renamed from: r */
    public final void m2704r() {
        if (this.f5033l != null) {
            EditText editText = this.f5021f;
            m2705s(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: s */
    public void m2705s(int i) {
        boolean z = this.f5031k;
        int i2 = this.f5029j;
        if (i2 == -1) {
            this.f5033l.setText(String.valueOf(i));
            this.f5033l.setContentDescription(null);
            this.f5031k = false;
        } else {
            this.f5031k = i > i2;
            Context context = getContext();
            this.f5033l.setContentDescription(context.getString(this.f5031k ? C1088R.string.character_counter_overflowed_content_description : C1088R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.f5029j)));
            if (z != this.f5031k) {
                m2706t();
            }
            C0234a c0234aM798c = C0234a.m798c();
            TextView textView = this.f5033l;
            String string = getContext().getString(C1088R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f5029j));
            textView.setText(string != null ? c0234aM798c.m799d(string, c0234aM798c.f1534c, true).toString() : null);
        }
        if (this.f5021f == null || z == this.f5031k) {
            return;
        }
        m2711y(false, false);
        m2688F();
        m2708v();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f5001M != i) {
            this.f5001M = i;
            this.f5060y0 = i;
            this.f4981A0 = i;
            this.f4983B0 = i;
            m2691c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        Context context = getContext();
        Object obj = C0192a.f1425a;
        setBoxBackgroundColor(C0192a.d.m741a(context, i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f5060y0 = defaultColor;
        this.f5001M = defaultColor;
        this.f5062z0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f4981A0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f4983B0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m2691c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f4992G) {
            return;
        }
        this.f4992G = i;
        if (this.f5021f != null) {
            m2701m();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f5056w0 != i) {
            this.f5056w0 = i;
            m2688F();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f5056w0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            m2688F();
        } else {
            this.f5052u0 = colorStateList.getDefaultColor();
            this.f4985C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f5054v0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.f5056w0 = defaultColor;
        m2688F();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f5058x0 != colorStateList) {
            this.f5058x0 = colorStateList;
            m2688F();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f4998J = i;
        m2688F();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f4999K = i;
        m2688F();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f5027i != z) {
            if (z) {
                C0113w c0113w = new C0113w(getContext(), null);
                this.f5033l = c0113w;
                c0113w.setId(C1088R.id.textinput_counter);
                Typeface typeface = this.f5005Q;
                if (typeface != null) {
                    this.f5033l.setTypeface(typeface);
                }
                this.f5033l.setMaxLines(1);
                this.f5025h.m2339a(this.f5033l, 2);
                ((ViewGroup.MarginLayoutParams) this.f5033l.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(C1088R.dimen.mtrl_textinput_counter_margin_start));
                m2706t();
                m2704r();
            } else {
                this.f5025h.m2347i(this.f5033l, 2);
                this.f5033l = null;
            }
            this.f5027i = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f5029j != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f5029j = i;
            if (this.f5027i) {
                m2704r();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f5035m != i) {
            this.f5035m = i;
            m2706t();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f5051u != colorStateList) {
            this.f5051u = colorStateList;
            m2706t();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f5037n != i) {
            this.f5037n = i;
            m2706t();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f5049t != colorStateList) {
            this.f5049t = colorStateList;
            m2706t();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f5048s0 = colorStateList;
        this.f5050t0 = colorStateList;
        if (this.f5021f != null) {
            m2711y(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m2681o(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f5022f0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f5022f0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f5022f0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C0034a.m129a(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f5022f0.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f5018d0;
        this.f5018d0 = i;
        Iterator<InterfaceC0947g> it = this.f5024g0.iterator();
        while (it.hasNext()) {
            it.next().mo2330a(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo2335b(this.f4992G)) {
            getEndIconDelegate().mo2326a();
            m2692d();
        } else {
            StringBuilder sbM2079g = C0561a.m2079g("The current box background mode ");
            sbM2079g.append(this.f4992G);
            sbM2079g.append(" is not supported by the end icon mode ");
            sbM2079g.append(i);
            throw new IllegalStateException(sbM2079g.toString());
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f5022f0;
        View.OnLongClickListener onLongClickListener = this.f5040o0;
        checkableImageButton.setOnClickListener(onClickListener);
        m2682p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5040o0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f5022f0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m2682p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f5026h0 != colorStateList) {
            this.f5026h0 = colorStateList;
            this.f5028i0 = true;
            m2692d();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f5030j0 != mode) {
            this.f5030j0 = mode;
            this.f5032k0 = true;
            m2692d();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m2700l() != z) {
            this.f5022f0.setVisibility(z ? 0 : 8);
            m2686D();
            m2707u();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f5025h.f4174l) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f5025h.m2346h();
            return;
        }
        C0702n c0702n = this.f5025h;
        c0702n.m2341c();
        c0702n.f4173k = charSequence;
        c0702n.f4175m.setText(charSequence);
        int i = c0702n.f4171i;
        if (i != 1) {
            c0702n.f4172j = 1;
        }
        c0702n.m2349k(i, c0702n.f4172j, c0702n.m2348j(c0702n.f4175m, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0702n c0702n = this.f5025h;
        c0702n.f4176n = charSequence;
        TextView textView = c0702n.f4175m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C0702n c0702n = this.f5025h;
        if (c0702n.f4174l == z) {
            return;
        }
        c0702n.m2341c();
        if (z) {
            C0113w c0113w = new C0113w(c0702n.f4163a, null);
            c0702n.f4175m = c0113w;
            c0113w.setId(C1088R.id.textinput_error);
            c0702n.f4175m.setTextAlignment(5);
            Typeface typeface = c0702n.f4184v;
            if (typeface != null) {
                c0702n.f4175m.setTypeface(typeface);
            }
            int i = c0702n.f4177o;
            c0702n.f4177o = i;
            TextView textView = c0702n.f4175m;
            if (textView != null) {
                c0702n.f4164b.m2703q(textView, i);
            }
            ColorStateList colorStateList = c0702n.f4178p;
            c0702n.f4178p = colorStateList;
            TextView textView2 = c0702n.f4175m;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0702n.f4176n;
            c0702n.f4176n = charSequence;
            TextView textView3 = c0702n.f4175m;
            if (textView3 != null) {
                textView3.setContentDescription(charSequence);
            }
            c0702n.f4175m.setVisibility(4);
            TextView textView4 = c0702n.f4175m;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            textView4.setAccessibilityLiveRegion(1);
            c0702n.m2339a(c0702n.f4175m, 0);
        } else {
            c0702n.m2346h();
            c0702n.m2347i(c0702n.f4175m, 0);
            c0702n.f4175m = null;
            c0702n.f4164b.m2708v();
            c0702n.f4164b.m2688F();
        }
        c0702n.f4174l = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C0034a.m129a(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f5044q0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f5025h.f4174l);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f5044q0;
        View.OnLongClickListener onLongClickListener = this.f5042p0;
        checkableImageButton.setOnClickListener(onClickListener);
        m2682p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5042p0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f5044q0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m2682p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f5046r0 = colorStateList;
        Drawable drawable = this.f5044q0.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.f5044q0.getDrawable() != drawable) {
            this.f5044q0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5044q0.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (this.f5044q0.getDrawable() != drawable) {
            this.f5044q0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        C0702n c0702n = this.f5025h;
        c0702n.f4177o = i;
        TextView textView = c0702n.f4175m;
        if (textView != null) {
            c0702n.f4164b.m2703q(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0702n c0702n = this.f5025h;
        c0702n.f4178p = colorStateList;
        TextView textView = c0702n.f4175m;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f5025h.f4180r) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f5025h.f4180r) {
            setHelperTextEnabled(true);
        }
        C0702n c0702n = this.f5025h;
        c0702n.m2341c();
        c0702n.f4179q = charSequence;
        c0702n.f4181s.setText(charSequence);
        int i = c0702n.f4171i;
        if (i != 2) {
            c0702n.f4172j = 2;
        }
        c0702n.m2349k(i, c0702n.f4172j, c0702n.m2348j(c0702n.f4181s, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0702n c0702n = this.f5025h;
        c0702n.f4183u = colorStateList;
        TextView textView = c0702n.f4181s;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C0702n c0702n = this.f5025h;
        if (c0702n.f4180r == z) {
            return;
        }
        c0702n.m2341c();
        if (z) {
            C0113w c0113w = new C0113w(c0702n.f4163a, null);
            c0702n.f4181s = c0113w;
            c0113w.setId(C1088R.id.textinput_helper_text);
            c0702n.f4181s.setTextAlignment(5);
            Typeface typeface = c0702n.f4184v;
            if (typeface != null) {
                c0702n.f4181s.setTypeface(typeface);
            }
            c0702n.f4181s.setVisibility(4);
            TextView textView = c0702n.f4181s;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            textView.setAccessibilityLiveRegion(1);
            int i = c0702n.f4182t;
            c0702n.f4182t = i;
            TextView textView2 = c0702n.f4181s;
            if (textView2 != null) {
                textView2.setTextAppearance(i);
            }
            ColorStateList colorStateList = c0702n.f4183u;
            c0702n.f4183u = colorStateList;
            TextView textView3 = c0702n.f4181s;
            if (textView3 != null && colorStateList != null) {
                textView3.setTextColor(colorStateList);
            }
            c0702n.m2339a(c0702n.f4181s, 1);
        } else {
            c0702n.m2341c();
            int i2 = c0702n.f4171i;
            if (i2 == 2) {
                c0702n.f4172j = 0;
            }
            c0702n.m2349k(i2, c0702n.f4172j, c0702n.m2348j(c0702n.f4181s, null));
            c0702n.m2347i(c0702n.f4181s, 1);
            c0702n.f4181s = null;
            c0702n.f4164b.m2708v();
            c0702n.f4164b.m2688F();
        }
        c0702n.f4180r = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C0702n c0702n = this.f5025h;
        c0702n.f4182t = i;
        TextView textView = c0702n.f4181s;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f5061z) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f4991F0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f5061z) {
            this.f5061z = z;
            if (z) {
                CharSequence hint = this.f5021f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f4980A)) {
                        setHint(hint);
                    }
                    this.f5021f.setHint((CharSequence) null);
                }
                this.f4982B = true;
            } else {
                this.f4982B = false;
                if (!TextUtils.isEmpty(this.f4980A) && TextUtils.isEmpty(this.f5021f.getHint())) {
                    this.f5021f.setHint(this.f4980A);
                }
                setHintInternal(null);
            }
            if (this.f5021f != null) {
                m2710x();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C0648c c0648c = this.f4989E0;
        C0663b c0663b = new C0663b(c0648c.f3895a.getContext(), i);
        ColorStateList colorStateList = c0663b.f3963b;
        if (colorStateList != null) {
            c0648c.f3906l = colorStateList;
        }
        float f2 = c0663b.f3962a;
        if (f2 != 0.0f) {
            c0648c.f3904j = f2;
        }
        ColorStateList colorStateList2 = c0663b.f3967f;
        if (colorStateList2 != null) {
            c0648c.f3889L = colorStateList2;
        }
        c0648c.f3887J = c0663b.f3968g;
        c0648c.f3888K = c0663b.f3969h;
        c0648c.f3886I = c0663b.f3970i;
        C0662a c0662a = c0648c.f3916v;
        if (c0662a != null) {
            c0662a.f3961c = true;
        }
        C0647b c0647b = new C0647b(c0648c);
        c0663b.m2272a();
        c0648c.f3916v = new C0662a(c0647b, c0663b.f3973l);
        c0663b.m2273b(c0648c.f3895a.getContext(), c0648c.f3916v);
        c0648c.m2253k();
        this.f5050t0 = this.f4989E0.f3906l;
        if (this.f5021f != null) {
            m2711y(false, false);
            m2710x();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f5050t0 != colorStateList) {
            if (this.f5048s0 == null) {
                C0648c c0648c = this.f4989E0;
                if (c0648c.f3906l != colorStateList) {
                    c0648c.f3906l = colorStateList;
                    c0648c.m2253k();
                }
            }
            this.f5050t0 = colorStateList;
            if (this.f5021f != null) {
                m2711y(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f5022f0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0034a.m129a(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f5022f0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f5018d0 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f5026h0 = colorStateList;
        this.f5028i0 = true;
        m2692d();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f5030j0 = mode;
        this.f5032k0 = true;
        m2692d();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f5041p && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f5041p) {
                setPlaceholderTextEnabled(true);
            }
            this.f5039o = charSequence;
        }
        EditText editText = this.f5021f;
        m2712z(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f5047s = i;
        TextView textView = this.f5043q;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f5045r != colorStateList) {
            this.f5045r = colorStateList;
            TextView textView = this.f5043q;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f5053v = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f5055w.setText(charSequence);
        m2684B();
    }

    public void setPrefixTextAppearance(int i) {
        this.f5055w.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f5055w.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f5006R.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f5006R.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C0034a.m129a(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f5006R.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m2694f();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f5006R;
        View.OnLongClickListener onLongClickListener = this.f5014b0;
        checkableImageButton.setOnClickListener(onClickListener);
        m2682p(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5014b0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f5006R;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m2682p(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f5007S != colorStateList) {
            this.f5007S = colorStateList;
            this.f5008T = true;
            m2694f();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f5009U != mode) {
            this.f5009U = mode;
            this.f5010V = true;
            m2694f();
        }
    }

    public void setStartIconVisible(boolean z) {
        if ((this.f5006R.getVisibility() == 0) != z) {
            this.f5006R.setVisibility(z ? 0 : 8);
            m2683A();
            m2707u();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f5057x = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f5059y.setText(charSequence);
        m2687E();
    }

    public void setSuffixTextAppearance(int i) {
        this.f5059y.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f5059y.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0945e c0945e) {
        EditText editText = this.f5021f;
        if (editText != null) {
            C0266o.m875n(editText, c0945e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f5005Q) {
            this.f5005Q = typeface;
            this.f4989E0.m2258q(typeface);
            C0702n c0702n = this.f5025h;
            if (typeface != c0702n.f4184v) {
                c0702n.f4184v = typeface;
                TextView textView = c0702n.f4175m;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = c0702n.f4181s;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f5033l;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final void m2706t() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f5033l;
        if (textView != null) {
            m2703q(textView, this.f5031k ? this.f5035m : this.f5037n);
            if (!this.f5031k && (colorStateList2 = this.f5049t) != null) {
                this.f5033l.setTextColor(colorStateList2);
            }
            if (!this.f5031k || (colorStateList = this.f5051u) == null) {
                return;
            }
            this.f5033l.setTextColor(colorStateList);
        }
    }

    /* renamed from: u */
    public final boolean m2707u() {
        boolean z;
        if (this.f5021f == null) {
            return false;
        }
        boolean z2 = true;
        if (!(getStartIconDrawable() == null && this.f5053v == null) && this.f5015c.getMeasuredWidth() > 0) {
            int measuredWidth = this.f5015c.getMeasuredWidth() - this.f5021f.getPaddingLeft();
            if (this.f5011W == null || this.f5012a0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f5011W = colorDrawable;
                this.f5012a0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f5021f.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f5011W;
            if (drawable != drawable2) {
                this.f5021f.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f5011W != null) {
                Drawable[] compoundDrawablesRelative2 = this.f5021f.getCompoundDrawablesRelative();
                this.f5021f.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f5011W = null;
                z = true;
            }
            z = false;
        }
        if ((this.f5044q0.getVisibility() == 0 || ((m2699k() && m2700l()) || this.f5057x != null)) && this.f5017d.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f5059y.getMeasuredWidth() - this.f5021f.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f5021f.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f5034l0;
            if (drawable3 == null || this.f5036m0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f5034l0 = colorDrawable2;
                    this.f5036m0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.f5034l0;
                if (drawable4 != drawable5) {
                    this.f5038n0 = compoundDrawablesRelative3[2];
                    this.f5021f.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.f5036m0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f5021f.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f5034l0, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.f5034l0 == null) {
                return z;
            }
            Drawable[] compoundDrawablesRelative4 = this.f5021f.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f5034l0) {
                this.f5021f.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f5038n0, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.f5034l0 = null;
        }
        return z2;
    }

    /* renamed from: v */
    public void m2708v() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f5021f;
        if (editText == null || this.f4992G != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C0071b0.m282a(background)) {
            background = background.mutate();
        }
        if (this.f5025h.m2343e()) {
            currentTextColor = this.f5025h.m2345g();
        } else {
            if (!this.f5031k || (textView = this.f5033l) == null) {
                background.clearColorFilter();
                this.f5021f.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(C0085i.m334c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: w */
    public final void m2709w(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* renamed from: x */
    public final void m2710x() {
        if (this.f4992G != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5013b.getLayoutParams();
            int iM2695g = m2695g();
            if (iM2695g != layoutParams.topMargin) {
                layoutParams.topMargin = iM2695g;
                this.f5013b.requestLayout();
            }
        }
    }

    /* renamed from: y */
    public final void m2711y(boolean z, boolean z2) {
        ColorStateList textColors;
        C0648c c0648c;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f5021f;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f5021f;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zM2343e = this.f5025h.m2343e();
        ColorStateList colorStateList = this.f5048s0;
        if (colorStateList != null) {
            C0648c c0648c2 = this.f4989E0;
            if (c0648c2.f3906l != colorStateList) {
                c0648c2.f3906l = colorStateList;
                c0648c2.m2253k();
            }
            C0648c c0648c3 = this.f4989E0;
            ColorStateList colorStateList2 = this.f5048s0;
            if (c0648c3.f3905k != colorStateList2) {
                c0648c3.f3905k = colorStateList2;
                c0648c3.m2253k();
            }
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f5048s0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f4985C0) : this.f4985C0;
            this.f4989E0.m2254m(ColorStateList.valueOf(colorForState));
            C0648c c0648c4 = this.f4989E0;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(colorForState);
            if (c0648c4.f3905k != colorStateListValueOf) {
                c0648c4.f3905k = colorStateListValueOf;
                c0648c4.m2253k();
            }
        } else if (zM2343e) {
            C0648c c0648c5 = this.f4989E0;
            TextView textView2 = this.f5025h.f4175m;
            c0648c5.m2254m(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.f5031k && (textView = this.f5033l) != null) {
                c0648c = this.f4989E0;
                textColors = textView.getTextColors();
            } else if (z4 && (textColors = this.f5050t0) != null) {
                c0648c = this.f4989E0;
            }
            c0648c.m2254m(textColors);
        }
        if (z3 || (isEnabled() && (z4 || zM2343e))) {
            if (z2 || this.f4987D0) {
                ValueAnimator valueAnimator = this.f4993G0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f4993G0.cancel();
                }
                if (z && this.f4991F0) {
                    m2690b(1.0f);
                } else {
                    this.f4989E0.m2256o(1.0f);
                }
                this.f4987D0 = false;
                if (m2696h()) {
                    m2702n();
                }
                EditText editText3 = this.f5021f;
                m2712z(editText3 != null ? editText3.getText().length() : 0);
                m2684B();
                m2687E();
                return;
            }
            return;
        }
        if (z2 || !this.f4987D0) {
            ValueAnimator valueAnimator2 = this.f4993G0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f4993G0.cancel();
            }
            if (z && this.f4991F0) {
                m2690b(0.0f);
            } else {
                this.f4989E0.m2256o(0.0f);
            }
            if (m2696h() && (!((C0695g) this.f4984C).f4131A.isEmpty()) && m2696h()) {
                ((C0695g) this.f4984C).m2331x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f4987D0 = true;
            TextView textView3 = this.f5043q;
            if (textView3 != null && this.f5041p) {
                textView3.setText((CharSequence) null);
                this.f5043q.setVisibility(4);
            }
            m2684B();
            m2687E();
        }
    }

    /* renamed from: z */
    public final void m2712z(int i) {
        if (i != 0 || this.f4987D0) {
            TextView textView = this.f5043q;
            if (textView == null || !this.f5041p) {
                return;
            }
            textView.setText((CharSequence) null);
            this.f5043q.setVisibility(4);
            return;
        }
        TextView textView2 = this.f5043q;
        if (textView2 == null || !this.f5041p) {
            return;
        }
        textView2.setText(this.f5039o);
        this.f5043q.setVisibility(0);
        this.f5043q.bringToFront();
    }
}
