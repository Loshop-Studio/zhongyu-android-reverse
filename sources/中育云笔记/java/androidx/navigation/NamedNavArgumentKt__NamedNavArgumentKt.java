package androidx.navigation;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final /* synthetic */ class NamedNavArgumentKt__NamedNavArgumentKt {
    public static final NamedNavArgument navArgument(String name, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(builder, "builder");
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        builder.invoke(navArgumentBuilder);
        return new NamedNavArgument(name, navArgumentBuilder.build());
    }
}
