package p070b.p074b.p075a.p076a.p104z;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.p044a0.C0245b;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.p080c.C0570a;
import p070b.p074b.p075a.p076a.p093o.C0636a;
import p070b.p074b.p075a.p076a.p101w.C0669a;
import p070b.p074b.p075a.p076a.p101w.C0675g;
import p070b.p074b.p075a.p076a.p101w.C0678j;

/* renamed from: b.b.a.a.z.h */
/* loaded from: classes.dex */
public class C0696h extends AbstractC0701m {

    /* renamed from: d */
    public final TextWatcher f4134d;

    /* renamed from: e */
    public final View.OnFocusChangeListener f4135e;

    /* renamed from: f */
    public final TextInputLayout.C0945e f4136f;

    /* renamed from: g */
    public final TextInputLayout.InterfaceC0946f f4137g;

    /* renamed from: h */
    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.InterfaceC0947g f4138h;

    /* renamed from: i */
    public boolean f4139i;

    /* renamed from: j */
    public boolean f4140j;

    /* renamed from: k */
    public long f4141k;

    /* renamed from: l */
    public StateListDrawable f4142l;

    /* renamed from: m */
    public C0675g f4143m;

    /* renamed from: n */
    public AccessibilityManager f4144n;

    /* renamed from: o */
    public ValueAnimator f4145o;

    /* renamed from: p */
    public ValueAnimator f4146p;

    /* renamed from: b.b.a.a.z.h$a */
    public class a implements TextWatcher {

        /* renamed from: b.b.a.a.z.h$a$a, reason: collision with other inner class name */
        public class RunnableC1092a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AutoCompleteTextView f4148b;

            public RunnableC1092a(AutoCompleteTextView autoCompleteTextView) {
                this.f4148b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f4148b.isPopupShowing();
                C0696h.m2333f(C0696h.this, zIsPopupShowing);
                C0696h.this.f4139i = zIsPopupShowing;
            }
        }

        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C0696h c0696h = C0696h.this;
            AutoCompleteTextView autoCompleteTextViewM2332e = C0696h.m2332e(c0696h, c0696h.f4160a.getEditText());
            autoCompleteTextViewM2332e.post(new RunnableC1092a(autoCompleteTextViewM2332e));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: b.b.a.a.z.h$b */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C0696h.this.f4160a.setEndIconActivated(z);
            if (z) {
                return;
            }
            C0696h.m2333f(C0696h.this, false);
            C0696h.this.f4139i = false;
        }
    }

    /* renamed from: b.b.a.a.z.h$c */
    public class c extends TextInputLayout.C0945e {
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C0945e, p000a.p031h.p043j.C0243a
        /* renamed from: d */
        public void mo810d(View view, C0245b c0245b) {
            boolean zIsShowingHintText;
            super.mo810d(view, c0245b);
            if (C0696h.this.f4160a.getEditText().getKeyListener() == null) {
                c0245b.f1563a.setClassName(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                zIsShowingHintText = c0245b.f1563a.isShowingHintText();
            } else {
                Bundle bundleM821f = c0245b.m821f();
                zIsShowingHintText = bundleM821f != null && (bundleM821f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (zIsShowingHintText) {
                c0245b.m826k(null);
            }
        }

        @Override // p000a.p031h.p043j.C0243a
        /* renamed from: e */
        public void mo811e(View view, AccessibilityEvent accessibilityEvent) {
            this.f1556a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            C0696h c0696h = C0696h.this;
            AutoCompleteTextView autoCompleteTextViewM2332e = C0696h.m2332e(c0696h, c0696h.f4160a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C0696h.this.f4144n.isTouchExplorationEnabled()) {
                C0696h.m2334g(C0696h.this, autoCompleteTextViewM2332e);
            }
        }
    }

    /* renamed from: b.b.a.a.z.h$d */
    public class d implements TextInputLayout.InterfaceC0946f {
        public d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0946f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo2329a(com.google.android.material.textfield.TextInputLayout r12) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p075a.p076a.p104z.C0696h.d.mo2329a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    /* renamed from: b.b.a.a.z.h$e */
    public class e implements TextInputLayout.InterfaceC0947g {
        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0947g
        /* renamed from: a */
        public void mo2330a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.removeTextChangedListener(C0696h.this.f4134d);
            if (autoCompleteTextView.getOnFocusChangeListener() == C0696h.this.f4135e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            autoCompleteTextView.setOnDismissListener(null);
        }
    }

    /* renamed from: b.b.a.a.z.h$f */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0696h.m2334g(C0696h.this, (AutoCompleteTextView) C0696h.this.f4160a.getEditText());
        }
    }

    public C0696h(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f4134d = new a();
        this.f4135e = new b();
        this.f4136f = new c(this.f4160a);
        this.f4137g = new d();
        this.f4138h = new e();
        this.f4139i = false;
        this.f4140j = false;
        this.f4141k = Long.MAX_VALUE;
    }

    /* renamed from: e */
    public static AutoCompleteTextView m2332e(C0696h c0696h, EditText editText) {
        Objects.requireNonNull(c0696h);
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: f */
    public static void m2333f(C0696h c0696h, boolean z) {
        if (c0696h.f4140j != z) {
            c0696h.f4140j = z;
            c0696h.f4146p.cancel();
            c0696h.f4145o.start();
        }
    }

    /* renamed from: g */
    public static void m2334g(C0696h c0696h, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(c0696h);
        if (autoCompleteTextView == null) {
            return;
        }
        if (c0696h.m2338i()) {
            c0696h.f4139i = false;
        }
        if (c0696h.f4139i) {
            c0696h.f4139i = false;
            return;
        }
        boolean z = c0696h.f4140j;
        boolean z2 = !z;
        if (z != z2) {
            c0696h.f4140j = z2;
            c0696h.f4146p.cancel();
            c0696h.f4145o.start();
        }
        if (!c0696h.f4140j) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    @Override // p070b.p074b.p075a.p076a.p104z.AbstractC0701m
    /* renamed from: a */
    public void mo2326a() throws Resources.NotFoundException {
        float dimensionPixelOffset = this.f4161b.getResources().getDimensionPixelOffset(C1088R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f4161b.getResources().getDimensionPixelOffset(C1088R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f4161b.getResources().getDimensionPixelOffset(C1088R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0675g c0675gM2337h = m2337h(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C0675g c0675gM2337h2 = m2337h(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f4143m = c0675gM2337h;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f4142l = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, c0675gM2337h);
        this.f4142l.addState(new int[0], c0675gM2337h2);
        this.f4160a.setEndIconDrawable(C0034a.m129a(this.f4161b, C1088R.drawable.mtrl_dropdown_arrow));
        TextInputLayout textInputLayout = this.f4160a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1088R.string.exposed_dropdown_menu_content_description));
        this.f4160a.setEndIconOnClickListener(new f());
        this.f4160a.m2689a(this.f4137g);
        this.f4160a.f5024g0.add(this.f4138h);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = C0570a.f3534a;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(67);
        valueAnimatorOfFloat.addUpdateListener(new C0697i(this));
        this.f4146p = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(50);
        valueAnimatorOfFloat2.addUpdateListener(new C0697i(this));
        this.f4145o = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0700l(this));
        CheckableImageButton checkableImageButton = this.f4162c;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        checkableImageButton.setImportantForAccessibility(2);
        this.f4144n = (AccessibilityManager) this.f4161b.getSystemService("accessibility");
    }

    @Override // p070b.p074b.p075a.p076a.p104z.AbstractC0701m
    /* renamed from: b */
    public boolean mo2335b(int i) {
        return i != 0;
    }

    @Override // p070b.p074b.p075a.p076a.p104z.AbstractC0701m
    /* renamed from: d */
    public boolean mo2336d() {
        return true;
    }

    /* renamed from: h */
    public final C0675g m2337h(float f2, float f3, float f4, int i) {
        C0678j.b bVar = new C0678j.b();
        bVar.f4060e = new C0669a(f2);
        bVar.f4061f = new C0669a(f2);
        bVar.f4063h = new C0669a(f3);
        bVar.f4062g = new C0669a(f3);
        C0678j c0678jM2310a = bVar.m2310a();
        Context context = this.f4161b;
        String str = C0675g.f3996x;
        int iM2096q = C0562a.m2096q(context, C1088R.attr.colorSurface, C0675g.class.getSimpleName());
        C0675g c0675g = new C0675g();
        c0675g.f3998b.f4022b = new C0636a(context);
        c0675g.m2303w();
        c0675g.m2296p(ColorStateList.valueOf(iM2096q));
        C0675g.b bVar2 = c0675g.f3998b;
        if (bVar2.f4035o != f4) {
            bVar2.f4035o = f4;
            c0675g.m2303w();
        }
        c0675g.f3998b.f4021a = c0678jM2310a;
        c0675g.invalidateSelf();
        C0675g.b bVar3 = c0675g.f3998b;
        if (bVar3.f4029i == null) {
            bVar3.f4029i = new Rect();
        }
        c0675g.f3998b.f4029i.set(0, i, 0, i);
        c0675g.invalidateSelf();
        return c0675g;
    }

    /* renamed from: i */
    public final boolean m2338i() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f4141k;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }
}
