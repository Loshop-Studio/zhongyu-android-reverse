package p255t6;

import java.util.concurrent.Callable;
import p244s6.AbstractC10049f;
import p288w6.AbstractC10359a;
import p299x6.InterfaceC10556d;

/* renamed from: t6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10115a {

    /* renamed from: a */
    public static volatile InterfaceC10556d f20191a;

    /* renamed from: b */
    public static volatile InterfaceC10556d f20192b;

    /* renamed from: a */
    public static Object m18854a(InterfaceC10556d interfaceC10556d, Object obj) {
        try {
            return interfaceC10556d.apply(obj);
        } catch (Throwable th) {
            throw AbstractC10359a.m19296a(th);
        }
    }

    /* renamed from: b */
    public static AbstractC10049f m18855b(InterfaceC10556d interfaceC10556d, Callable callable) {
        AbstractC10049f abstractC10049f = (AbstractC10049f) m18854a(interfaceC10556d, callable);
        if (abstractC10049f != null) {
            return abstractC10049f;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: c */
    public static AbstractC10049f m18856c(Callable callable) {
        try {
            AbstractC10049f abstractC10049f = (AbstractC10049f) callable.call();
            if (abstractC10049f != null) {
                return abstractC10049f;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw AbstractC10359a.m19296a(th);
        }
    }

    /* renamed from: d */
    public static AbstractC10049f m18857d(Callable callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        InterfaceC10556d interfaceC10556d = f20191a;
        return interfaceC10556d == null ? m18856c(callable) : m18855b(interfaceC10556d, callable);
    }

    /* renamed from: e */
    public static AbstractC10049f m18858e(AbstractC10049f abstractC10049f) {
        if (abstractC10049f == null) {
            throw new NullPointerException("scheduler == null");
        }
        InterfaceC10556d interfaceC10556d = f20192b;
        return interfaceC10556d == null ? abstractC10049f : (AbstractC10049f) m18854a(interfaceC10556d, abstractC10049f);
    }
}
