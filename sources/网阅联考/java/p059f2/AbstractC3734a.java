package p059f2;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: f2.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3734a {
    /* renamed from: a */
    public static Application m4730a(Context context) {
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
