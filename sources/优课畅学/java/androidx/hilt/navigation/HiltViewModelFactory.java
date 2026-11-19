package androidx.hilt.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class HiltViewModelFactory {
    public static final ViewModelProvider.Factory create(Context context, NavBackStackEntry navBackStackEntry) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(navBackStackEntry, "navBackStackEntry");
        return create(context, navBackStackEntry.getDefaultViewModelProviderFactory());
    }

    public static final ViewModelProvider.Factory create(Context context, ViewModelProvider.Factory delegateFactory) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(delegateFactory, "delegateFactory");
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                ViewModelProvider.Factory factoryM13541a = dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.m13541a((ComponentActivity) context, delegateFactory);
                AbstractC9133u.m16132f(factoryM13541a, "createInternal(\n        … */ delegateFactory\n    )");
                return factoryM13541a;
            }
            context = ((ContextWrapper) context).getBaseContext();
            AbstractC9133u.m16132f(context, "ctx.baseContext");
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
    }
}
