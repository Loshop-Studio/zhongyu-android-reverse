package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class ViewTreeViewModelKt {
    @InterfaceC10770a
    public static final /* synthetic */ ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        AbstractC9979u.m20294g(view, "view");
        return ViewTreeViewModelStoreOwner.get(view);
    }
}
