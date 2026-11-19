package androidx.navigation.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9979u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class NavContext {
    private final Context context;

    public NavContext(Context context) {
        this.context = context;
    }

    public final Object getApplication() {
        Context context = this.context;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getResourceName(int i10) throws Resources.NotFoundException {
        try {
            Context context = this.context;
            AbstractC9979u.m20291d(context);
            String resourceName = context.getResources().getResourceName(i10);
            AbstractC9979u.m20291d(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i10);
        }
    }
}
