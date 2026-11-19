package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;

/* renamed from: androidx.compose.foundation.text.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1301a implements CodepointTransformation {

    /* renamed from: a */
    public final /* synthetic */ int f765a;

    /* renamed from: b */
    public final /* synthetic */ Object f766b;

    public /* synthetic */ C1301a(Object obj, int i) {
        this.f765a = i;
        this.f766b = obj;
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int transform(int i, int i8) {
        switch (this.f765a) {
            case 0:
                return BasicSecureTextFieldKt.BasicSecureTextField_egD4TGM$lambda$4$lambda$3((State) this.f766b, i, i8);
            default:
                return SecureTextFieldController.codepointTransformation$lambda$0((SecureTextFieldController) this.f766b, i, i8);
        }
    }
}
