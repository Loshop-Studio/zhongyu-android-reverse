package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

/* loaded from: classes3.dex */
public final class ViewKt {
    @InterfaceC10770a
    public static final /* synthetic */ SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        AbstractC9979u.m20294g(view, "view");
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}
