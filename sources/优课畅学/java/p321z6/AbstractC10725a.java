package p321z6;

import ba.InterfaceC5219c;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.Comparator;
import java.util.concurrent.Callable;
import p100f7.AbstractC8462a;
import p299x6.InterfaceC10553a;
import p299x6.InterfaceC10555c;
import p299x6.InterfaceC10556d;
import p299x6.InterfaceC10557e;
import p299x6.InterfaceC10558f;

/* renamed from: z6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10725a {

    /* renamed from: a */
    public static final InterfaceC10556d f21268a = new g();

    /* renamed from: b */
    public static final Runnable f21269b = new d();

    /* renamed from: c */
    public static final InterfaceC10553a f21270c = new a();

    /* renamed from: d */
    public static final InterfaceC10555c f21271d = new b();

    /* renamed from: e */
    public static final InterfaceC10555c f21272e = new e();

    /* renamed from: f */
    public static final InterfaceC10555c f21273f = new k();

    /* renamed from: g */
    public static final InterfaceC10557e f21274g = new c();

    /* renamed from: h */
    public static final InterfaceC10558f f21275h = new l();

    /* renamed from: i */
    public static final InterfaceC10558f f21276i = new f();

    /* renamed from: j */
    public static final Callable f21277j = new j();

    /* renamed from: k */
    public static final Comparator f21278k = new i();

    /* renamed from: l */
    public static final InterfaceC10555c f21279l = new h();

    /* renamed from: z6.a$c */
    public static final class c implements InterfaceC10557e {
    }

    /* renamed from: z6.a$e */
    public static final class e implements InterfaceC10555c {
        @Override // p299x6.InterfaceC10555c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            AbstractC8462a.m13801k(th);
        }
    }

    /* renamed from: z6.a$f */
    public static final class f implements InterfaceC10558f {
    }

    /* renamed from: z6.a$h */
    public static final class h implements InterfaceC10555c {
        @Override // p299x6.InterfaceC10555c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(InterfaceC5219c interfaceC5219c) {
            interfaceC5219c.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: z6.a$i */
    public static final class i implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: z6.a$j */
    public static final class j implements Callable {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* renamed from: z6.a$k */
    public static final class k implements InterfaceC10555c {
        @Override // p299x6.InterfaceC10555c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            AbstractC8462a.m13801k(new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: z6.a$l */
    public static final class l implements InterfaceC10558f {
    }

    /* renamed from: z6.a$a */
    public static final class a implements InterfaceC10553a {
        public String toString() {
            return "EmptyAction";
        }

        @Override // p299x6.InterfaceC10553a
        public void run() {
        }
    }

    /* renamed from: z6.a$d */
    public static final class d implements Runnable {
        public String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: z6.a$b */
    public static final class b implements InterfaceC10555c {
        public String toString() {
            return "EmptyConsumer";
        }

        @Override // p299x6.InterfaceC10555c
        public void accept(Object obj) {
        }
    }

    /* renamed from: z6.a$g */
    public static final class g implements InterfaceC10556d {
        public String toString() {
            return "IdentityFunction";
        }

        @Override // p299x6.InterfaceC10556d
        public Object apply(Object obj) {
            return obj;
        }
    }
}
