package androidx.navigation.p018ui;

import androidx.navigation.p018ui.AppBarConfiguration;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10772c;

/* renamed from: androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 */
/* loaded from: classes3.dex */
public final class C4190x56421ee5 implements AppBarConfiguration.OnNavigateUpListener, InterfaceC9975q {
    private final /* synthetic */ InterfaceC9529a function;

    public C4190x56421ee5(InterfaceC9529a function) {
        AbstractC9979u.m20294g(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AppBarConfiguration.OnNavigateUpListener) && (obj instanceof InterfaceC9975q)) {
            return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC9975q
    public final InterfaceC10772c getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener
    public final /* synthetic */ boolean onNavigateUp() {
        return ((Boolean) this.function.invoke()).booleanValue();
    }
}
