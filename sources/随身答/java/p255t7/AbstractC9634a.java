package p255t7;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: t7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9634a {
    /* renamed from: a */
    public static Application m15907a(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }
}
