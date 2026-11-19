package p123t0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* renamed from: t0.a */
/* loaded from: classes2.dex */
public class C4581a extends PasswordTransformationMethod {

    /* renamed from: a */
    public static C4581a f5761a;

    /* renamed from: t0.a$a */
    public static class a implements CharSequence {

        /* renamed from: a */
        public CharSequence f5762a;

        public a(CharSequence charSequence) {
            this.f5762a = charSequence;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i4) {
            return '*';
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.f5762a.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i4, int i5) {
            return this.f5762a.subSequence(i4, i5);
        }
    }

    public static PasswordTransformationMethod getInstance() {
        C4581a c4581a = f5761a;
        if (c4581a != null) {
            return c4581a;
        }
        C4581a c4581a2 = new C4581a();
        f5761a = c4581a2;
        return c4581a2;
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new a(charSequence);
    }
}
