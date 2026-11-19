package p041d2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* renamed from: d2.a */
/* loaded from: classes3.dex */
public class C6218a extends PasswordTransformationMethod {

    /* renamed from: a */
    public static C6218a f7508a;

    /* renamed from: d2.a$a */
    public static class a implements CharSequence {

        /* renamed from: a */
        public CharSequence f7509a;

        public a(CharSequence charSequence) {
            this.f7509a = charSequence;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i6) {
            return '*';
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.f7509a.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i6, int i7) {
            return this.f7509a.subSequence(i6, i7);
        }
    }

    public static PasswordTransformationMethod getInstance() {
        C6218a c6218a = f7508a;
        if (c6218a != null) {
            return c6218a;
        }
        C6218a c6218a2 = new C6218a();
        f7508a = c6218a2;
        return c6218a2;
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new a(charSequence);
    }
}
