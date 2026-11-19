package p332s4;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p317r4.InterfaceC10841d;
import p343t4.C11216d;

/* renamed from: s4.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11057a implements InterfaceC10841d {

    /* renamed from: a */
    public static final Map f26688a = new HashMap();

    /* renamed from: b */
    public static final Object f26689b = new Object();

    /* renamed from: b */
    public static AbstractC11057a m24512b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return m24513c(context, context.getPackageName());
    }

    /* renamed from: c */
    public static AbstractC11057a m24513c(Context context, String str) {
        AbstractC11057a c11216d;
        synchronized (f26689b) {
            try {
                Map map = f26688a;
                c11216d = (AbstractC11057a) map.get(str);
                if (c11216d == null) {
                    c11216d = new C11216d(context, str);
                    map.put(str, c11216d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11216d;
    }
}
