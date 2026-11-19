package p241s3;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* renamed from: s3.a */
/* loaded from: classes4.dex */
public class C9469a extends PasswordTransformationMethod {

    /* renamed from: a */
    public static C9469a f16512a;

    /* renamed from: s3.a$a */
    public static class a implements CharSequence {

        /* renamed from: a */
        public CharSequence f16513a;

        public a(CharSequence charSequence) {
            this.f16513a = charSequence;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i9) {
            return '*';
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.f16513a.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i9, int i10) {
            return this.f16513a.subSequence(i9, i10);
        }
    }

    public static PasswordTransformationMethod getInstance() {
        C9469a c9469a = f16512a;
        if (c9469a != null) {
            return c9469a;
        }
        C9469a c9469a2 = new C9469a();
        f16512a = c9469a2;
        return c9469a2;
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new a(charSequence);
    }
}
