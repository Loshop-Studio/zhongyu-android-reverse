package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

/* loaded from: classes3.dex */
public final class ViewKt {
    @InterfaceC8721a
    public static final /* synthetic */ LifecycleOwner findViewTreeLifecycleOwner(View view) {
        AbstractC9133u.m16133g(view, "view");
        return ViewTreeLifecycleOwner.get(view);
    }
}
