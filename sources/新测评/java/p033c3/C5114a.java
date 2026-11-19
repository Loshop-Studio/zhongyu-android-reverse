package p033c3;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* renamed from: c3.a */
/* loaded from: classes4.dex */
public class C5114a extends PasswordTransformationMethod {

    /* renamed from: a */
    public static C5114a f2673a;

    /* renamed from: c3.a$a */
    public static class a implements CharSequence {

        /* renamed from: a */
        public CharSequence f2674a;

        public a(CharSequence charSequence) {
            this.f2674a = charSequence;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i10) {
            return '*';
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.f2674a.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i10, int i11) {
            return this.f2674a.subSequence(i10, i11);
        }
    }

    public static PasswordTransformationMethod getInstance() {
        C5114a c5114a = f2673a;
        if (c5114a != null) {
            return c5114a;
        }
        C5114a c5114a2 = new C5114a();
        f2673a = c5114a2;
        return c5114a2;
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new a(charSequence);
    }
}
