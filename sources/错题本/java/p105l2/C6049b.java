package p105l2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* renamed from: l2.b */
/* loaded from: classes3.dex */
public final class C6049b extends PasswordTransformationMethod {

    /* renamed from: a */
    public static C6049b f9640a;

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        C6048a c6048a = new C6048a();
        c6048a.f9639a = charSequence;
        return c6048a;
    }
}
