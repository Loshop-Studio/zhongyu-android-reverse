package androidx.navigation.p017ui;

import androidx.navigation.p017ui.AppBarConfiguration;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.InterfaceC8723c;
import p300x7.InterfaceC10559a;

/* renamed from: androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 */
/* loaded from: classes3.dex */
public final class C4262x56421ee5 implements AppBarConfiguration.OnNavigateUpListener, InterfaceC9129q {
    private final /* synthetic */ InterfaceC10559a function;

    public C4262x56421ee5(InterfaceC10559a function) {
        AbstractC9133u.m16133g(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AppBarConfiguration.OnNavigateUpListener) && (obj instanceof InterfaceC9129q)) {
            return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC9129q
    public final InterfaceC8723c getFunctionDelegate() {
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
