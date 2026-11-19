package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

/* renamed from: androidx.compose.foundation.text.input.internal.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C1377f implements CancellationSignal.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ int f780a;

    /* renamed from: b */
    public final /* synthetic */ Object f781b;

    public /* synthetic */ C1377f(Object obj, int i) {
        this.f780a = i;
        this.f781b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f780a) {
            case 0:
                HandwritingGestureApi34.previewHandwritingGesture$lambda$9((TextFieldSelectionManager) this.f781b);
                break;
            default:
                HandwritingGestureApi34.previewHandwritingGesture$lambda$1((TransformedTextFieldState) this.f781b);
                break;
        }
    }
}
