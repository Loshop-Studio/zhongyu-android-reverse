package p099f6;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: f6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8460a {
    /* renamed from: a */
    public static Application m13788a(Context context) {
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
