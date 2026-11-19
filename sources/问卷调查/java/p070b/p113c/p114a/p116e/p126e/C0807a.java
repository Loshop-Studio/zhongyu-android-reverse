package p070b.p113c.p114a.p116e.p126e;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* renamed from: b.c.a.e.e.a */
/* loaded from: classes.dex */
public class C0807a extends PasswordTransformationMethod {

    /* renamed from: b */
    public static C0807a f4522b;

    /* renamed from: b.c.a.e.e.a$a */
    public static class a implements CharSequence {

        /* renamed from: b */
        public CharSequence f4523b;

        public a(CharSequence charSequence) {
            this.f4523b = charSequence;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i) {
            return '*';
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.f4523b.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i, int i2) {
            return this.f4523b.subSequence(i, i2);
        }
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new a(charSequence);
    }
}
