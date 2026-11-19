package com.xuexiang.xui.widget.edittext;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public class AsteriskPasswordTransformationMethod extends PasswordTransformationMethod {
    private static AsteriskPasswordTransformationMethod sInstance;

    private static class AsteriskPasswordCharSequence implements CharSequence {
        private CharSequence mSource;

        AsteriskPasswordCharSequence(CharSequence charSequence) {
            this.mSource = charSequence;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i4) {
            return '*';
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.mSource.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i4, int i5) {
            return this.mSource.subSequence(i4, i5);
        }
    }

    public static PasswordTransformationMethod getInstance() {
        AsteriskPasswordTransformationMethod asteriskPasswordTransformationMethod = sInstance;
        if (asteriskPasswordTransformationMethod != null) {
            return asteriskPasswordTransformationMethod;
        }
        AsteriskPasswordTransformationMethod asteriskPasswordTransformationMethod2 = new AsteriskPasswordTransformationMethod();
        sInstance = asteriskPasswordTransformationMethod2;
        return asteriskPasswordTransformationMethod2;
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new AsteriskPasswordCharSequence(charSequence);
    }
}
