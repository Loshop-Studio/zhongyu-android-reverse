package p164u4;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: u4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7773a {
    /* renamed from: a */
    public static Application m9304a(Context context) {
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
