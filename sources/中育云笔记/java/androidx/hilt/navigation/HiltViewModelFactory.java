package androidx.hilt.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class HiltViewModelFactory {
    public static final ViewModelProvider.Factory create(Context context, NavBackStackEntry navBackStackEntry) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(navBackStackEntry, "navBackStackEntry");
        return create(context, navBackStackEntry.getDefaultViewModelProviderFactory());
    }

    public static final ViewModelProvider.Factory create(Context context, ViewModelProvider.Factory delegateFactory) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(delegateFactory, "delegateFactory");
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                ViewModelProvider.Factory factoryM17595a = dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.m17595a((ComponentActivity) context, delegateFactory);
                AbstractC9979u.m20293f(factoryM17595a, "createInternal(\n        … */ delegateFactory\n    )");
                return factoryM17595a;
            }
            context = ((ContextWrapper) context).getBaseContext();
            AbstractC9979u.m20293f(context, "ctx.baseContext");
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
    }
}
