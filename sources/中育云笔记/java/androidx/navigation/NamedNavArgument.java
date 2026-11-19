package androidx.navigation;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class NamedNavArgument {
    private final NavArgument argument;
    private final String name;

    public NamedNavArgument(String name, NavArgument argument) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(argument, "argument");
        this.name = name;
        this.argument = argument;
    }

    public final String component1() {
        return this.name;
    }

    public final NavArgument component2() {
        return this.argument;
    }

    public final NavArgument getArgument() {
        return this.argument;
    }

    public final String getName() {
        return this.name;
    }
}
