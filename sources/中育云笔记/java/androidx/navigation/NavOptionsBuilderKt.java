package androidx.navigation;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class NavOptionsBuilderKt {
    public static final NavOptions navOptions(InterfaceC9540l optionsBuilder) {
        AbstractC9979u.m20294g(optionsBuilder, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        return navOptionsBuilder.build$navigation_common_release();
    }
}
