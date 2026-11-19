package p038c9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p172l8.AbstractC8925x;
import p172l8.C8918q;
import p172l8.C8922u;

/* renamed from: c9.n */
/* loaded from: classes5.dex */
public abstract class AbstractC5288n {

    /* renamed from: c9.n$a */
    public class a extends AbstractC5288n {
        public a() {
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2468a(C5296v c5296v, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC5288n.this.mo2468a(c5296v, it.next());
            }
        }
    }

    /* renamed from: c9.n$b */
    public class b extends AbstractC5288n {
        public b() {
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: a */
        public void mo2468a(C5296v c5296v, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i9 = 0; i9 < length; i9++) {
                AbstractC5288n.this.mo2468a(c5296v, Array.get(obj, i9));
            }
        }
    }

    /* renamed from: c9.n$c */
    public static final class c extends AbstractC5288n {

        /* renamed from: a */
        public final Method f2582a;

        /* renamed from: b */
        public final int f2583b;

        /* renamed from: c */
        public final InterfaceC5280f f2584c;

        public c(Method method, int i9, InterfaceC5280f interfaceC5280f) {
            this.f2582a = method;
            this.f2583b = i9;
            this.f2584c = interfaceC5280f;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: a */
        public void mo2468a(C5296v c5296v, Object obj) {
            if (obj == null) {
                throw AbstractC5277c0.m2439o(this.f2582a, this.f2583b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                c5296v.m2503l((AbstractC8925x) this.f2584c.convert(obj));
            } catch (IOException e10) {
                throw AbstractC5277c0.m2440p(this.f2582a, e10, this.f2583b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    /* renamed from: c9.n$d */
    public static final class d extends AbstractC5288n {

        /* renamed from: a */
        public final String f2585a;

        /* renamed from: b */
        public final InterfaceC5280f f2586b;

        /* renamed from: c */
        public final boolean f2587c;

        public d(String str, InterfaceC5280f interfaceC5280f, boolean z9) {
            Objects.requireNonNull(str, "name == null");
            this.f2585a = str;
            this.f2586b = interfaceC5280f;
            this.f2587c = z9;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: a */
        public void mo2468a(C5296v c5296v, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f2586b.convert(obj)) == null) {
                return;
            }
            c5296v.m2494a(this.f2585a, str, this.f2587c);
        }
    }

    /* renamed from: c9.n$e */
    public static final class e extends AbstractC5288n {

        /* renamed from: a */
        public final Method f2588a;

        /* renamed from: b */
        public final int f2589b;

        /* renamed from: c */
        public final InterfaceC5280f f2590c;

        /* renamed from: d */
        public final boolean f2591d;

        public e(Method method, int i9, InterfaceC5280f interfaceC5280f, boolean z9) {
            this.f2588a = method;
            this.f2589b = i9;
            this.f2590c = interfaceC5280f;
            this.f2591d = z9;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2468a(C5296v c5296v, Map map) {
            if (map == null) {
                throw AbstractC5277c0.m2439o(this.f2588a, this.f2589b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC5277c0.m2439o(this.f2588a, this.f2589b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC5277c0.m2439o(this.f2588a, this.f2589b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f2590c.convert(value);
                if (str2 == null) {
                    throw AbstractC5277c0.m2439o(this.f2588a, this.f2589b, "Field map value '" + value + "' converted to null by " + this.f2590c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c5296v.m2494a(str, str2, this.f2591d);
            }
        }
    }

    /* renamed from: c9.n$f */
    public static final class f extends AbstractC5288n {

        /* renamed from: a */
        public final String f2592a;

        /* renamed from: b */
        public final InterfaceC5280f f2593b;

        public f(String str, InterfaceC5280f interfaceC5280f) {
            Objects.requireNonNull(str, "name == null");
            this.f2592a = str;
            this.f2593b = interfaceC5280f;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: a */
        public void mo2468a(C5296v c5296v, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f2593b.convert(obj)) == null) {
                return;
            }
            c5296v.m2495b(this.f2592a, str);
        }
    }

    /* renamed from: c9.n$g */
    public static final class g extends AbstractC5288n {

        /* renamed from: a */
        public final Method f2594a;

        /* renamed from: b */
        public final int f2595b;

        /* renamed from: c */
        public final InterfaceC5280f f2596c;

        public g(Method method, int i9, InterfaceC5280f interfaceC5280f) {
            this.f2594a = method;
            this.f2595b = i9;
            this.f2596c = interfaceC5280f;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2468a(C5296v c5296v, Map map) {
            if (map == null) {
                throw AbstractC5277c0.m2439o(this.f2594a, this.f2595b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC5277c0.m2439o(this.f2594a, this.f2595b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC5277c0.m2439o(this.f2594a, this.f2595b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                c5296v.m2495b(str, (String) this.f2596c.convert(value));
            }
        }
    }

    /* renamed from: c9.n$h */
    public static final class h extends AbstractC5288n {

        /* renamed from: a */
        public final Method f2597a;

        /* renamed from: b */
        public final int f2598b;

        public h(Method method, int i9) {
            this.f2597a = method;
            this.f2598b = i9;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2468a(C5296v c5296v, C8918q c8918q) {
            if (c8918q == null) {
                throw AbstractC5277c0.m2439o(this.f2597a, this.f2598b, "Headers parameter must not be null.", new Object[0]);
            }
            c5296v.m2496c(c8918q);
        }
    }

    /* renamed from: c9.n$i */
    public static final class i extends AbstractC5288n {

        /* renamed from: a */
        public final Method f2599a;

        /* renamed from: b */
        public final int f2600b;

        /* renamed from: c */
        public final C8918q f2601c;

        /* renamed from: d */
        public final InterfaceC5280f f2602d;

        public i(Method method, int i9, C8918q c8918q, InterfaceC5280f interfaceC5280f) {
            this.f2599a = method;
            this.f2600b = i9;
            this.f2601c = c8918q;
            this.f2602d = interfaceC5280f;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: a */
        public void mo2468a(C5296v c5296v, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                c5296v.m2497d(this.f2601c, (AbstractC8925x) this.f2602d.convert(obj));
            } catch (IOException e10) {
                throw AbstractC5277c0.m2439o(this.f2599a, this.f2600b, "Unable to convert " + obj + " to RequestBody", e10);
            }
        }
    }

    /* renamed from: c9.n$j */
    public static final class j extends AbstractC5288n {

        /* renamed from: a */
        public final Method f2603a;

        /* renamed from: b */
        public final int f2604b;

        /* renamed from: c */
        public final InterfaceC5280f f2605c;

        /* renamed from: d */
        public final String f2606d;

        public j(Method method, int i9, InterfaceC5280f interfaceC5280f, String str) {
            this.f2603a = method;
            this.f2604b = i9;
            this.f2605c = interfaceC5280f;
            this.f2606d = str;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2468a(C5296v c5296v, Map map) {
            if (map == null) {
                throw AbstractC5277c0.m2439o(this.f2603a, this.f2604b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC5277c0.m2439o(this.f2603a, this.f2604b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC5277c0.m2439o(this.f2603a, this.f2604b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                c5296v.m2497d(C8918q.m13935d(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f2606d), (AbstractC8925x) this.f2605c.convert(value));
            }
        }
    }

    /* renamed from: c9.n$k */
    public static final class k extends AbstractC5288n {

        /* renamed from: a */
        public final Method f2607a;

        /* renamed from: b */
        public final int f2608b;

        /* renamed from: c */
        public final String f2609c;

        /* renamed from: d */
        public final InterfaceC5280f f2610d;

        /* renamed from: e */
        public final boolean f2611e;

        public k(Method method, int i9, String str, InterfaceC5280f interfaceC5280f, boolean z9) {
            this.f2607a = method;
            this.f2608b = i9;
            Objects.requireNonNull(str, "name == null");
            this.f2609c = str;
            this.f2610d = interfaceC5280f;
            this.f2611e = z9;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: a */
        public void mo2468a(C5296v c5296v, Object obj) throws EOFException {
            if (obj != null) {
                c5296v.m2499f(this.f2609c, (String) this.f2610d.convert(obj), this.f2611e);
                return;
            }
            throw AbstractC5277c0.m2439o(this.f2607a, this.f2608b, "Path parameter \"" + this.f2609c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: c9.n$l */
    public static final class l extends AbstractC5288n {

        /* renamed from: a */
        public final String f2612a;

        /* renamed from: b */
        public final InterfaceC5280f f2613b;

        /* renamed from: c */
        public final boolean f2614c;

        public l(String str, InterfaceC5280f interfaceC5280f, boolean z9) {
            Objects.requireNonNull(str, "name == null");
            this.f2612a = str;
            this.f2613b = interfaceC5280f;
            this.f2614c = z9;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: a */
        public void mo2468a(C5296v c5296v, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f2613b.convert(obj)) == null) {
                return;
            }
            c5296v.m2500g(this.f2612a, str, this.f2614c);
        }
    }

    /* renamed from: c9.n$m */
    public static final class m extends AbstractC5288n {

        /* renamed from: a */
        public final Method f2615a;

        /* renamed from: b */
        public final int f2616b;

        /* renamed from: c */
        public final InterfaceC5280f f2617c;

        /* renamed from: d */
        public final boolean f2618d;

        public m(Method method, int i9, InterfaceC5280f interfaceC5280f, boolean z9) {
            this.f2615a = method;
            this.f2616b = i9;
            this.f2617c = interfaceC5280f;
            this.f2618d = z9;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2468a(C5296v c5296v, Map map) {
            if (map == null) {
                throw AbstractC5277c0.m2439o(this.f2615a, this.f2616b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC5277c0.m2439o(this.f2615a, this.f2616b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC5277c0.m2439o(this.f2615a, this.f2616b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f2617c.convert(value);
                if (str2 == null) {
                    throw AbstractC5277c0.m2439o(this.f2615a, this.f2616b, "Query map value '" + value + "' converted to null by " + this.f2617c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c5296v.m2500g(str, str2, this.f2618d);
            }
        }
    }

    /* renamed from: c9.n$n */
    public static final class n extends AbstractC5288n {

        /* renamed from: a */
        public final InterfaceC5280f f2619a;

        /* renamed from: b */
        public final boolean f2620b;

        public n(InterfaceC5280f interfaceC5280f, boolean z9) {
            this.f2619a = interfaceC5280f;
            this.f2620b = z9;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: a */
        public void mo2468a(C5296v c5296v, Object obj) {
            if (obj == null) {
                return;
            }
            c5296v.m2500g((String) this.f2619a.convert(obj), null, this.f2620b);
        }
    }

    /* renamed from: c9.n$o */
    public static final class o extends AbstractC5288n {

        /* renamed from: a */
        public static final o f2621a = new o();

        @Override // p038c9.AbstractC5288n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2468a(C5296v c5296v, C8922u.c cVar) {
            if (cVar != null) {
                c5296v.m2498e(cVar);
            }
        }
    }

    /* renamed from: c9.n$p */
    public static final class p extends AbstractC5288n {

        /* renamed from: a */
        public final Method f2622a;

        /* renamed from: b */
        public final int f2623b;

        public p(Method method, int i9) {
            this.f2622a = method;
            this.f2623b = i9;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: a */
        public void mo2468a(C5296v c5296v, Object obj) {
            if (obj == null) {
                throw AbstractC5277c0.m2439o(this.f2622a, this.f2623b, "@Url parameter is null.", new Object[0]);
            }
            c5296v.m2504m(obj);
        }
    }

    /* renamed from: c9.n$q */
    public static final class q extends AbstractC5288n {

        /* renamed from: a */
        public final Class f2624a;

        public q(Class cls) {
            this.f2624a = cls;
        }

        @Override // p038c9.AbstractC5288n
        /* renamed from: a */
        public void mo2468a(C5296v c5296v, Object obj) {
            c5296v.m2501h(this.f2624a, obj);
        }
    }

    /* renamed from: a */
    public abstract void mo2468a(C5296v c5296v, Object obj);

    /* renamed from: b */
    public final AbstractC5288n m2469b() {
        return new b();
    }

    /* renamed from: c */
    public final AbstractC5288n m2470c() {
        return new a();
    }
}
