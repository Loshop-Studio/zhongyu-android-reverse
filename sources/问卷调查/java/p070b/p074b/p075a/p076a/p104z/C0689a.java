package p070b.p074b.p075a.p076a.p104z;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p005b.p007d.p008a.C0034a;
import p070b.p074b.p075a.p076a.p080c.C0570a;

/* renamed from: b.b.a.a.z.a */
/* loaded from: classes.dex */
public class C0689a extends AbstractC0701m {

    /* renamed from: d */
    public final TextWatcher f4116d;

    /* renamed from: e */
    public final View.OnFocusChangeListener f4117e;

    /* renamed from: f */
    public final TextInputLayout.InterfaceC0946f f4118f;

    /* renamed from: g */
    public final TextInputLayout.InterfaceC0947g f4119g;

    /* renamed from: h */
    public AnimatorSet f4120h;

    /* renamed from: i */
    public ValueAnimator f4121i;

    /* renamed from: b.b.a.a.z.a$a */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C0689a.this.f4160a.getSuffixText() != null) {
                return;
            }
            C0689a.this.m2328e(editable.length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: b.b.a.a.z.a$b */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C0689a.this.m2328e((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z);
        }
    }

    /* renamed from: b.b.a.a.z.a$c */
    public class c implements TextInputLayout.InterfaceC0946f {
        public c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0946f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo2329a(com.google.android.material.textfield.TextInputLayout r5) {
            /*
                r4 = this;
                android.widget.EditText r0 = r5.getEditText()
                boolean r1 = r0.hasFocus()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                android.text.Editable r1 = r0.getText()
                int r1 = r1.length()
                if (r1 <= 0) goto L18
                r1 = r2
                goto L19
            L18:
                r1 = r3
            L19:
                if (r1 == 0) goto L1c
                goto L1d
            L1c:
                r2 = r3
            L1d:
                r5.setEndIconVisible(r2)
                r5.setEndIconCheckable(r3)
                b.b.a.a.z.a r5 = p070b.p074b.p075a.p076a.p104z.C0689a.this
                android.view.View$OnFocusChangeListener r5 = r5.f4117e
                r0.setOnFocusChangeListener(r5)
                b.b.a.a.z.a r5 = p070b.p074b.p075a.p076a.p104z.C0689a.this
                android.text.TextWatcher r5 = r5.f4116d
                r0.removeTextChangedListener(r5)
                b.b.a.a.z.a r5 = p070b.p074b.p075a.p076a.p104z.C0689a.this
                android.text.TextWatcher r5 = r5.f4116d
                r0.addTextChangedListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p075a.p076a.p104z.C0689a.c.mo2329a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    /* renamed from: b.b.a.a.z.a$d */
    public class d implements TextInputLayout.InterfaceC0947g {
        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0947g
        /* renamed from: a */
        public void mo2330a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.removeTextChangedListener(C0689a.this.f4116d);
            if (editText.getOnFocusChangeListener() == C0689a.this.f4117e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    /* renamed from: b.b.a.a.z.a$e */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = C0689a.this.f4160a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    public C0689a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f4116d = new a();
        this.f4117e = new b();
        this.f4118f = new c();
        this.f4119g = new d();
    }

    @Override // p070b.p074b.p075a.p076a.p104z.AbstractC0701m
    /* renamed from: a */
    public void mo2326a() {
        this.f4160a.setEndIconDrawable(C0034a.m129a(this.f4161b, C1088R.drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f4160a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1088R.string.clear_text_end_icon_content_description));
        this.f4160a.setEndIconOnClickListener(new e());
        this.f4160a.m2689a(this.f4118f);
        this.f4160a.f5024g0.add(this.f4119g);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(C0570a.f3537d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new C0693e(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = C0570a.f3534a;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new C0692d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4120h = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f4120h.addListener(new C0690b(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(100L);
        valueAnimatorOfFloat3.addUpdateListener(new C0692d(this));
        this.f4121i = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0691c(this));
    }

    @Override // p070b.p074b.p075a.p076a.p104z.AbstractC0701m
    /* renamed from: c */
    public void mo2327c(boolean z) {
        if (this.f4160a.getSuffixText() == null) {
            return;
        }
        m2328e(z);
    }

    /* renamed from: e */
    public final void m2328e(boolean z) {
        boolean z2 = this.f4160a.m2700l() == z;
        if (z) {
            this.f4121i.cancel();
            this.f4120h.start();
            if (z2) {
                this.f4120h.end();
                return;
            }
            return;
        }
        this.f4120h.cancel();
        this.f4121i.start();
        if (z2) {
            this.f4121i.end();
        }
    }
}
