package p070b.p074b.p075a.p076a.p104z;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p005b.p007d.p008a.C0034a;

/* renamed from: b.b.a.a.z.r */
/* loaded from: classes.dex */
public class C0706r extends AbstractC0701m {

    /* renamed from: d */
    public final TextWatcher f4194d;

    /* renamed from: e */
    public final TextInputLayout.InterfaceC0946f f4195e;

    /* renamed from: f */
    public final TextInputLayout.InterfaceC0947g f4196f;

    /* renamed from: b.b.a.a.z.r$a */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C0706r.this.f4162c.setChecked(!C0706r.m2352e(r1));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: b.b.a.a.z.r$b */
    public class b implements TextInputLayout.InterfaceC0946f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0946f
        /* renamed from: a */
        public void mo2329a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C0706r.this.f4162c.setChecked(!C0706r.m2352e(r4));
            editText.removeTextChangedListener(C0706r.this.f4194d);
            editText.addTextChangedListener(C0706r.this.f4194d);
        }
    }

    /* renamed from: b.b.a.a.z.r$c */
    public class c implements TextInputLayout.InterfaceC0947g {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0947g
        /* renamed from: a */
        public void mo2330a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.removeTextChangedListener(C0706r.this.f4194d);
        }
    }

    /* renamed from: b.b.a.a.z.r$d */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C0706r.this.f4160a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(C0706r.m2352e(C0706r.this) ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
        }
    }

    public C0706r(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f4194d = new a();
        this.f4195e = new b();
        this.f4196f = new c();
    }

    /* renamed from: e */
    public static boolean m2352e(C0706r c0706r) {
        EditText editText = c0706r.f4160a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // p070b.p074b.p075a.p076a.p104z.AbstractC0701m
    /* renamed from: a */
    public void mo2326a() {
        this.f4160a.setEndIconDrawable(C0034a.m129a(this.f4161b, C1088R.drawable.design_password_eye));
        TextInputLayout textInputLayout = this.f4160a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1088R.string.password_toggle_content_description));
        this.f4160a.setEndIconOnClickListener(new d());
        this.f4160a.m2689a(this.f4195e);
        this.f4160a.f5024g0.add(this.f4196f);
        EditText editText = this.f4160a.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
