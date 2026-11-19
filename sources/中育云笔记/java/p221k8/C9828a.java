package p221k8;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* renamed from: k8.a */
/* loaded from: classes5.dex */
public class C9828a extends PasswordTransformationMethod {

    /* renamed from: c */
    public static C9828a f23110c;

    /* renamed from: k8.a$a */
    public static class a implements CharSequence {

        /* renamed from: c */
        public CharSequence f23111c;

        public a(CharSequence charSequence) {
            this.f23111c = charSequence;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i10) {
            return '*';
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.f23111c.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i10, int i11) {
            return this.f23111c.subSequence(i10, i11);
        }
    }

    public static PasswordTransformationMethod getInstance() {
        C9828a c9828a = f23110c;
        if (c9828a != null) {
            return c9828a;
        }
        C9828a c9828a2 = new C9828a();
        f23110c = c9828a2;
        return c9828a2;
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new a(charSequence);
    }
}
