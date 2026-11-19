package ca;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p136i9.AbstractC8901c0;
import p136i9.C8924v;
import p136i9.C8928z;

/* renamed from: ca.v */
/* loaded from: classes5.dex */
public abstract class AbstractC5305v {

    /* renamed from: ca.v$a */
    public class a extends AbstractC5305v {
        public a() {
        }

        @Override // ca.AbstractC5305v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2326a(C5277a0 c5277a0, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC5305v.this.mo2326a(c5277a0, it.next());
            }
        }
    }

    /* renamed from: ca.v$b */
    public class b extends AbstractC5305v {
        public b() {
        }

        @Override // ca.AbstractC5305v
        /* renamed from: a */
        public void mo2326a(C5277a0 c5277a0, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC5305v.this.mo2326a(c5277a0, Array.get(obj, i10));
            }
        }
    }

    /* renamed from: ca.v$c */
    public static final class c extends AbstractC5305v {

        /* renamed from: a */
        public final Method f2556a;

        /* renamed from: b */
        public final int f2557b;

        /* renamed from: c */
        public final InterfaceC5290h f2558c;

        public c(Method method, int i10, InterfaceC5290h interfaceC5290h) {
            this.f2556a = method;
            this.f2557b = i10;
            this.f2558c = interfaceC5290h;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: a */
        public void mo2326a(C5277a0 c5277a0, Object obj) {
            if (obj == null) {
                throw AbstractC5291h0.m2296p(this.f2556a, this.f2557b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                c5277a0.m2217l((AbstractC8901c0) this.f2558c.convert(obj));
            } catch (IOException e10) {
                throw AbstractC5291h0.m2297q(this.f2556a, e10, this.f2557b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    /* renamed from: ca.v$d */
    public static final class d extends AbstractC5305v {

        /* renamed from: a */
        public final String f2559a;

        /* renamed from: b */
        public final InterfaceC5290h f2560b;

        /* renamed from: c */
        public final boolean f2561c;

        public d(String str, InterfaceC5290h interfaceC5290h, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f2559a = str;
            this.f2560b = interfaceC5290h;
            this.f2561c = z10;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: a */
        public void mo2326a(C5277a0 c5277a0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f2560b.convert(obj)) == null) {
                return;
            }
            c5277a0.m2208a(this.f2559a, str, this.f2561c);
        }
    }

    /* renamed from: ca.v$e */
    public static final class e extends AbstractC5305v {

        /* renamed from: a */
        public final Method f2562a;

        /* renamed from: b */
        public final int f2563b;

        /* renamed from: c */
        public final InterfaceC5290h f2564c;

        /* renamed from: d */
        public final boolean f2565d;

        public e(Method method, int i10, InterfaceC5290h interfaceC5290h, boolean z10) {
            this.f2562a = method;
            this.f2563b = i10;
            this.f2564c = interfaceC5290h;
            this.f2565d = z10;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2326a(C5277a0 c5277a0, Map map) {
            if (map == null) {
                throw AbstractC5291h0.m2296p(this.f2562a, this.f2563b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC5291h0.m2296p(this.f2562a, this.f2563b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC5291h0.m2296p(this.f2562a, this.f2563b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f2564c.convert(value);
                if (str2 == null) {
                    throw AbstractC5291h0.m2296p(this.f2562a, this.f2563b, "Field map value '" + value + "' converted to null by " + this.f2564c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c5277a0.m2208a(str, str2, this.f2565d);
            }
        }
    }

    /* renamed from: ca.v$f */
    public static final class f extends AbstractC5305v {

        /* renamed from: a */
        public final String f2566a;

        /* renamed from: b */
        public final InterfaceC5290h f2567b;

        /* renamed from: c */
        public final boolean f2568c;

        public f(String str, InterfaceC5290h interfaceC5290h, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f2566a = str;
            this.f2567b = interfaceC5290h;
            this.f2568c = z10;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: a */
        public void mo2326a(C5277a0 c5277a0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f2567b.convert(obj)) == null) {
                return;
            }
            c5277a0.m2209b(this.f2566a, str, this.f2568c);
        }
    }

    /* renamed from: ca.v$g */
    public static final class g extends AbstractC5305v {

        /* renamed from: a */
        public final Method f2569a;

        /* renamed from: b */
        public final int f2570b;

        /* renamed from: c */
        public final InterfaceC5290h f2571c;

        /* renamed from: d */
        public final boolean f2572d;

        public g(Method method, int i10, InterfaceC5290h interfaceC5290h, boolean z10) {
            this.f2569a = method;
            this.f2570b = i10;
            this.f2571c = interfaceC5290h;
            this.f2572d = z10;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2326a(C5277a0 c5277a0, Map map) {
            if (map == null) {
                throw AbstractC5291h0.m2296p(this.f2569a, this.f2570b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC5291h0.m2296p(this.f2569a, this.f2570b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC5291h0.m2296p(this.f2569a, this.f2570b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                c5277a0.m2209b(str, (String) this.f2571c.convert(value), this.f2572d);
            }
        }
    }

    /* renamed from: ca.v$h */
    public static final class h extends AbstractC5305v {

        /* renamed from: a */
        public final Method f2573a;

        /* renamed from: b */
        public final int f2574b;

        public h(Method method, int i10) {
            this.f2573a = method;
            this.f2574b = i10;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2326a(C5277a0 c5277a0, C8924v c8924v) {
            if (c8924v == null) {
                throw AbstractC5291h0.m2296p(this.f2573a, this.f2574b, "Headers parameter must not be null.", new Object[0]);
            }
            c5277a0.m2210c(c8924v);
        }
    }

    /* renamed from: ca.v$i */
    public static final class i extends AbstractC5305v {

        /* renamed from: a */
        public final Method f2575a;

        /* renamed from: b */
        public final int f2576b;

        /* renamed from: c */
        public final C8924v f2577c;

        /* renamed from: d */
        public final InterfaceC5290h f2578d;

        public i(Method method, int i10, C8924v c8924v, InterfaceC5290h interfaceC5290h) {
            this.f2575a = method;
            this.f2576b = i10;
            this.f2577c = c8924v;
            this.f2578d = interfaceC5290h;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: a */
        public void mo2326a(C5277a0 c5277a0, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                c5277a0.m2211d(this.f2577c, (AbstractC8901c0) this.f2578d.convert(obj));
            } catch (IOException e10) {
                throw AbstractC5291h0.m2296p(this.f2575a, this.f2576b, "Unable to convert " + obj + " to RequestBody", e10);
            }
        }
    }

    /* renamed from: ca.v$j */
    public static final class j extends AbstractC5305v {

        /* renamed from: a */
        public final Method f2579a;

        /* renamed from: b */
        public final int f2580b;

        /* renamed from: c */
        public final InterfaceC5290h f2581c;

        /* renamed from: d */
        public final String f2582d;

        public j(Method method, int i10, InterfaceC5290h interfaceC5290h, String str) {
            this.f2579a = method;
            this.f2580b = i10;
            this.f2581c = interfaceC5290h;
            this.f2582d = str;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2326a(C5277a0 c5277a0, Map map) {
            if (map == null) {
                throw AbstractC5291h0.m2296p(this.f2579a, this.f2580b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC5291h0.m2296p(this.f2579a, this.f2580b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC5291h0.m2296p(this.f2579a, this.f2580b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                c5277a0.m2211d(C8924v.m15259e(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f2582d), (AbstractC8901c0) this.f2581c.convert(value));
            }
        }
    }

    /* renamed from: ca.v$k */
    public static final class k extends AbstractC5305v {

        /* renamed from: a */
        public final Method f2583a;

        /* renamed from: b */
        public final int f2584b;

        /* renamed from: c */
        public final String f2585c;

        /* renamed from: d */
        public final InterfaceC5290h f2586d;

        /* renamed from: e */
        public final boolean f2587e;

        public k(Method method, int i10, String str, InterfaceC5290h interfaceC5290h, boolean z10) {
            this.f2583a = method;
            this.f2584b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f2585c = str;
            this.f2586d = interfaceC5290h;
            this.f2587e = z10;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: a */
        public void mo2326a(C5277a0 c5277a0, Object obj) throws EOFException {
            if (obj != null) {
                c5277a0.m2213f(this.f2585c, (String) this.f2586d.convert(obj), this.f2587e);
                return;
            }
            throw AbstractC5291h0.m2296p(this.f2583a, this.f2584b, "Path parameter \"" + this.f2585c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: ca.v$l */
    public static final class l extends AbstractC5305v {

        /* renamed from: a */
        public final String f2588a;

        /* renamed from: b */
        public final InterfaceC5290h f2589b;

        /* renamed from: c */
        public final boolean f2590c;

        public l(String str, InterfaceC5290h interfaceC5290h, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f2588a = str;
            this.f2589b = interfaceC5290h;
            this.f2590c = z10;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: a */
        public void mo2326a(C5277a0 c5277a0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f2589b.convert(obj)) == null) {
                return;
            }
            c5277a0.m2214g(this.f2588a, str, this.f2590c);
        }
    }

    /* renamed from: ca.v$m */
    public static final class m extends AbstractC5305v {

        /* renamed from: a */
        public final Method f2591a;

        /* renamed from: b */
        public final int f2592b;

        /* renamed from: c */
        public final InterfaceC5290h f2593c;

        /* renamed from: d */
        public final boolean f2594d;

        public m(Method method, int i10, InterfaceC5290h interfaceC5290h, boolean z10) {
            this.f2591a = method;
            this.f2592b = i10;
            this.f2593c = interfaceC5290h;
            this.f2594d = z10;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2326a(C5277a0 c5277a0, Map map) {
            if (map == null) {
                throw AbstractC5291h0.m2296p(this.f2591a, this.f2592b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC5291h0.m2296p(this.f2591a, this.f2592b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC5291h0.m2296p(this.f2591a, this.f2592b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f2593c.convert(value);
                if (str2 == null) {
                    throw AbstractC5291h0.m2296p(this.f2591a, this.f2592b, "Query map value '" + value + "' converted to null by " + this.f2593c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c5277a0.m2214g(str, str2, this.f2594d);
            }
        }
    }

    /* renamed from: ca.v$n */
    public static final class n extends AbstractC5305v {

        /* renamed from: a */
        public final InterfaceC5290h f2595a;

        /* renamed from: b */
        public final boolean f2596b;

        public n(InterfaceC5290h interfaceC5290h, boolean z10) {
            this.f2595a = interfaceC5290h;
            this.f2596b = z10;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: a */
        public void mo2326a(C5277a0 c5277a0, Object obj) {
            if (obj == null) {
                return;
            }
            c5277a0.m2214g((String) this.f2595a.convert(obj), null, this.f2596b);
        }
    }

    /* renamed from: ca.v$o */
    public static final class o extends AbstractC5305v {

        /* renamed from: a */
        public static final o f2597a = new o();

        @Override // ca.AbstractC5305v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2326a(C5277a0 c5277a0, C8928z.c cVar) {
            if (cVar != null) {
                c5277a0.m2212e(cVar);
            }
        }
    }

    /* renamed from: ca.v$p */
    public static final class p extends AbstractC5305v {

        /* renamed from: a */
        public final Method f2598a;

        /* renamed from: b */
        public final int f2599b;

        public p(Method method, int i10) {
            this.f2598a = method;
            this.f2599b = i10;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: a */
        public void mo2326a(C5277a0 c5277a0, Object obj) {
            if (obj == null) {
                throw AbstractC5291h0.m2296p(this.f2598a, this.f2599b, "@Url parameter is null.", new Object[0]);
            }
            c5277a0.m2218m(obj);
        }
    }

    /* renamed from: ca.v$q */
    public static final class q extends AbstractC5305v {

        /* renamed from: a */
        public final Class f2600a;

        public q(Class cls) {
            this.f2600a = cls;
        }

        @Override // ca.AbstractC5305v
        /* renamed from: a */
        public void mo2326a(C5277a0 c5277a0, Object obj) {
            c5277a0.m2215h(this.f2600a, obj);
        }
    }

    /* renamed from: a */
    public abstract void mo2326a(C5277a0 c5277a0, Object obj);

    /* renamed from: b */
    public final AbstractC5305v m2327b() {
        return new b();
    }

    /* renamed from: c */
    public final AbstractC5305v m2328c() {
        return new a();
    }
}
