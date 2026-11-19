package androidx.navigation.fragment;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgs;
import androidx.navigation.NavArgsLazy;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class FragmentNavArgsLazyKt {
    @MainThread
    public static final /* synthetic */ <Args extends NavArgs> NavArgsLazy<Args> navArgs(final Fragment fragment) {
        AbstractC9979u.m20294g(fragment, "<this>");
        AbstractC9979u.m20300m(4, "Args");
        return new NavArgsLazy<>(AbstractC9983y.m20315b(NavArgs.class), new InterfaceC9529a() { // from class: androidx.navigation.fragment.FragmentNavArgsLazyKt.navArgs.1
            @Override // p181hd.InterfaceC9529a
            public final Bundle invoke() {
                Bundle arguments = fragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + fragment + " has null arguments");
            }
        });
    }
}
