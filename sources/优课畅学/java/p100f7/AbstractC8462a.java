package p100f7;

import ba.InterfaceC5218b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import p244s6.AbstractC10045b;
import p244s6.AbstractC10049f;
import p299x6.InterfaceC10555c;
import p299x6.InterfaceC10556d;
import p321z6.AbstractC10726b;

/* renamed from: f7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8462a {

    /* renamed from: a */
    public static volatile InterfaceC10555c f16042a;

    /* renamed from: b */
    public static volatile InterfaceC10556d f16043b;

    /* renamed from: c */
    public static volatile InterfaceC10556d f16044c;

    /* renamed from: d */
    public static volatile InterfaceC10556d f16045d;

    /* renamed from: e */
    public static volatile InterfaceC10556d f16046e;

    /* renamed from: f */
    public static volatile InterfaceC10556d f16047f;

    /* renamed from: g */
    public static volatile InterfaceC10556d f16048g;

    /* renamed from: h */
    public static volatile InterfaceC10556d f16049h;

    /* renamed from: i */
    public static volatile InterfaceC10556d f16050i;

    /* renamed from: a */
    public static Object m13791a(InterfaceC10556d interfaceC10556d, Object obj) {
        try {
            return interfaceC10556d.apply(obj);
        } catch (Throwable th) {
            throw ExceptionHelper.m15580c(th);
        }
    }

    /* renamed from: b */
    public static AbstractC10049f m13792b(InterfaceC10556d interfaceC10556d, Callable callable) {
        return (AbstractC10049f) AbstractC10726b.m20030c(m13791a(interfaceC10556d, callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: c */
    public static AbstractC10049f m13793c(Callable callable) {
        try {
            return (AbstractC10049f) AbstractC10726b.m20030c(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw ExceptionHelper.m15580c(th);
        }
    }

    /* renamed from: d */
    public static AbstractC10049f m13794d(Callable callable) {
        AbstractC10726b.m20030c(callable, "Scheduler Callable can't be null");
        InterfaceC10556d interfaceC10556d = f16044c;
        return interfaceC10556d == null ? m13793c(callable) : m13792b(interfaceC10556d, callable);
    }

    /* renamed from: e */
    public static AbstractC10049f m13795e(Callable callable) {
        AbstractC10726b.m20030c(callable, "Scheduler Callable can't be null");
        InterfaceC10556d interfaceC10556d = f16046e;
        return interfaceC10556d == null ? m13793c(callable) : m13792b(interfaceC10556d, callable);
    }

    /* renamed from: f */
    public static AbstractC10049f m13796f(Callable callable) {
        AbstractC10726b.m20030c(callable, "Scheduler Callable can't be null");
        InterfaceC10556d interfaceC10556d = f16047f;
        return interfaceC10556d == null ? m13793c(callable) : m13792b(interfaceC10556d, callable);
    }

    /* renamed from: g */
    public static AbstractC10049f m13797g(Callable callable) {
        AbstractC10726b.m20030c(callable, "Scheduler Callable can't be null");
        InterfaceC10556d interfaceC10556d = f16045d;
        return interfaceC10556d == null ? m13793c(callable) : m13792b(interfaceC10556d, callable);
    }

    /* renamed from: h */
    public static boolean m13798h(Throwable th) {
        return (th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException);
    }

    /* renamed from: i */
    public static AbstractC10045b m13799i(AbstractC10045b abstractC10045b) {
        InterfaceC10556d interfaceC10556d = f16050i;
        return interfaceC10556d != null ? (AbstractC10045b) m13791a(interfaceC10556d, abstractC10045b) : abstractC10045b;
    }

    /* renamed from: j */
    public static AbstractC10049f m13800j(AbstractC10049f abstractC10049f) {
        InterfaceC10556d interfaceC10556d = f16048g;
        return interfaceC10556d == null ? abstractC10049f : (AbstractC10049f) m13791a(interfaceC10556d, abstractC10049f);
    }

    /* renamed from: k */
    public static void m13801k(Throwable th) {
        InterfaceC10555c interfaceC10555c = f16042a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m13798h(th)) {
            th = new UndeliverableException(th);
        }
        if (interfaceC10555c != null) {
            try {
                interfaceC10555c.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m13805o(th2);
            }
        }
        th.printStackTrace();
        m13805o(th);
    }

    /* renamed from: l */
    public static AbstractC10049f m13802l(AbstractC10049f abstractC10049f) {
        InterfaceC10556d interfaceC10556d = f16049h;
        return interfaceC10556d == null ? abstractC10049f : (AbstractC10049f) m13791a(interfaceC10556d, abstractC10049f);
    }

    /* renamed from: m */
    public static Runnable m13803m(Runnable runnable) {
        AbstractC10726b.m20030c(runnable, "run is null");
        InterfaceC10556d interfaceC10556d = f16043b;
        return interfaceC10556d == null ? runnable : (Runnable) m13791a(interfaceC10556d, runnable);
    }

    /* renamed from: o */
    public static void m13805o(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    /* renamed from: n */
    public static InterfaceC5218b m13804n(AbstractC10045b abstractC10045b, InterfaceC5218b interfaceC5218b) {
        return interfaceC5218b;
    }
}
