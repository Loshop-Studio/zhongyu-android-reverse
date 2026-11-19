package p054e7;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import p046d7.AbstractC5448e;
import p046d7.C5444a;
import p046d7.C5447d;
import p214z6.AbstractC6833k;

/* renamed from: e7.k */
/* loaded from: classes4.dex */
public abstract class AbstractC5479k {

    /* renamed from: a */
    public static final C5447d f8471a;

    static {
        String property;
        int i = AbstractC5487s.f8482a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = AbstractC6833k.m6499z(AbstractC6833k.m6493t(Arrays.asList(new C5444a()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((C5444a) next).getClass();
                    do {
                        ((C5444a) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((C5444a) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            f8471a = new C5447d(AbstractC5448e.m4818a(mainLooper));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
