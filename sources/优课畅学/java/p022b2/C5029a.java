package p022b2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* renamed from: b2.a */
/* loaded from: classes4.dex */
public class C5029a extends PasswordTransformationMethod {

    /* renamed from: a */
    public static C5029a f2114a;

    /* renamed from: b2.a$a */
    public static class a implements CharSequence {

        /* renamed from: a */
        public CharSequence f2115a;

        public a(CharSequence charSequence) {
            this.f2115a = charSequence;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i10) {
            return '*';
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.f2115a.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i10, int i11) {
            return this.f2115a.subSequence(i10, i11);
        }
    }

    public static PasswordTransformationMethod getInstance() {
        C5029a c5029a = f2114a;
        if (c5029a != null) {
            return c5029a;
        }
        C5029a c5029a2 = new C5029a();
        f2114a = c5029a2;
        return c5029a2;
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new a(charSequence);
    }
}
