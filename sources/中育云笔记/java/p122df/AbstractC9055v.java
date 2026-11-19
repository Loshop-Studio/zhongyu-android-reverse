package p122df;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import je.AbstractC9744x;
import je.C9737q;
import je.C9741u;

/* renamed from: df.v */
/* loaded from: classes6.dex */
public abstract class AbstractC9055v {

    /* renamed from: df.v$a */
    public class a extends AbstractC9055v {
        public a() {
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo17782a(C9027a0 c9027a0, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC9055v.this.mo17782a(c9027a0, it.next());
            }
        }
    }

    /* renamed from: df.v$b */
    public class b extends AbstractC9055v {
        public b() {
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: a */
        public void mo17782a(C9027a0 c9027a0, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC9055v.this.mo17782a(c9027a0, Array.get(obj, i10));
            }
        }
    }

    /* renamed from: df.v$c */
    public static final class c extends AbstractC9055v {

        /* renamed from: a */
        public final Method f21165a;

        /* renamed from: b */
        public final int f21166b;

        /* renamed from: c */
        public final InterfaceC9040h f21167c;

        public c(Method method, int i10, InterfaceC9040h interfaceC9040h) {
            this.f21165a = method;
            this.f21166b = i10;
            this.f21167c = interfaceC9040h;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: a */
        public void mo17782a(C9027a0 c9027a0, Object obj) {
            if (obj == null) {
                throw AbstractC9041h0.m17754p(this.f21165a, this.f21166b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                c9027a0.m17680l((AbstractC9744x) this.f21167c.convert(obj));
            } catch (IOException e10) {
                throw AbstractC9041h0.m17755q(this.f21165a, e10, this.f21166b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    /* renamed from: df.v$d */
    public static final class d extends AbstractC9055v {

        /* renamed from: a */
        public final String f21168a;

        /* renamed from: b */
        public final InterfaceC9040h f21169b;

        /* renamed from: c */
        public final boolean f21170c;

        public d(String str, InterfaceC9040h interfaceC9040h, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f21168a = str;
            this.f21169b = interfaceC9040h;
            this.f21170c = z10;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: a */
        public void mo17782a(C9027a0 c9027a0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f21169b.convert(obj)) == null) {
                return;
            }
            c9027a0.m17671a(this.f21168a, str, this.f21170c);
        }
    }

    /* renamed from: df.v$e */
    public static final class e extends AbstractC9055v {

        /* renamed from: a */
        public final Method f21171a;

        /* renamed from: b */
        public final int f21172b;

        /* renamed from: c */
        public final InterfaceC9040h f21173c;

        /* renamed from: d */
        public final boolean f21174d;

        public e(Method method, int i10, InterfaceC9040h interfaceC9040h, boolean z10) {
            this.f21171a = method;
            this.f21172b = i10;
            this.f21173c = interfaceC9040h;
            this.f21174d = z10;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo17782a(C9027a0 c9027a0, Map map) {
            if (map == null) {
                throw AbstractC9041h0.m17754p(this.f21171a, this.f21172b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC9041h0.m17754p(this.f21171a, this.f21172b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC9041h0.m17754p(this.f21171a, this.f21172b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f21173c.convert(value);
                if (str2 == null) {
                    throw AbstractC9041h0.m17754p(this.f21171a, this.f21172b, "Field map value '" + value + "' converted to null by " + this.f21173c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c9027a0.m17671a(str, str2, this.f21174d);
            }
        }
    }

    /* renamed from: df.v$f */
    public static final class f extends AbstractC9055v {

        /* renamed from: a */
        public final String f21175a;

        /* renamed from: b */
        public final InterfaceC9040h f21176b;

        /* renamed from: c */
        public final boolean f21177c;

        public f(String str, InterfaceC9040h interfaceC9040h, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f21175a = str;
            this.f21176b = interfaceC9040h;
            this.f21177c = z10;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: a */
        public void mo17782a(C9027a0 c9027a0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f21176b.convert(obj)) == null) {
                return;
            }
            c9027a0.m17672b(this.f21175a, str, this.f21177c);
        }
    }

    /* renamed from: df.v$g */
    public static final class g extends AbstractC9055v {

        /* renamed from: a */
        public final Method f21178a;

        /* renamed from: b */
        public final int f21179b;

        /* renamed from: c */
        public final InterfaceC9040h f21180c;

        /* renamed from: d */
        public final boolean f21181d;

        public g(Method method, int i10, InterfaceC9040h interfaceC9040h, boolean z10) {
            this.f21178a = method;
            this.f21179b = i10;
            this.f21180c = interfaceC9040h;
            this.f21181d = z10;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo17782a(C9027a0 c9027a0, Map map) {
            if (map == null) {
                throw AbstractC9041h0.m17754p(this.f21178a, this.f21179b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC9041h0.m17754p(this.f21178a, this.f21179b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC9041h0.m17754p(this.f21178a, this.f21179b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                c9027a0.m17672b(str, (String) this.f21180c.convert(value), this.f21181d);
            }
        }
    }

    /* renamed from: df.v$h */
    public static final class h extends AbstractC9055v {

        /* renamed from: a */
        public final Method f21182a;

        /* renamed from: b */
        public final int f21183b;

        public h(Method method, int i10) {
            this.f21182a = method;
            this.f21183b = i10;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo17782a(C9027a0 c9027a0, C9737q c9737q) {
            if (c9737q == null) {
                throw AbstractC9041h0.m17754p(this.f21182a, this.f21183b, "Headers parameter must not be null.", new Object[0]);
            }
            c9027a0.m17673c(c9737q);
        }
    }

    /* renamed from: df.v$i */
    public static final class i extends AbstractC9055v {

        /* renamed from: a */
        public final Method f21184a;

        /* renamed from: b */
        public final int f21185b;

        /* renamed from: c */
        public final C9737q f21186c;

        /* renamed from: d */
        public final InterfaceC9040h f21187d;

        public i(Method method, int i10, C9737q c9737q, InterfaceC9040h interfaceC9040h) {
            this.f21184a = method;
            this.f21185b = i10;
            this.f21186c = c9737q;
            this.f21187d = interfaceC9040h;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: a */
        public void mo17782a(C9027a0 c9027a0, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                c9027a0.m17674d(this.f21186c, (AbstractC9744x) this.f21187d.convert(obj));
            } catch (IOException e10) {
                throw AbstractC9041h0.m17754p(this.f21184a, this.f21185b, "Unable to convert " + obj + " to RequestBody", e10);
            }
        }
    }

    /* renamed from: df.v$j */
    public static final class j extends AbstractC9055v {

        /* renamed from: a */
        public final Method f21188a;

        /* renamed from: b */
        public final int f21189b;

        /* renamed from: c */
        public final InterfaceC9040h f21190c;

        /* renamed from: d */
        public final String f21191d;

        public j(Method method, int i10, InterfaceC9040h interfaceC9040h, String str) {
            this.f21188a = method;
            this.f21189b = i10;
            this.f21190c = interfaceC9040h;
            this.f21191d = str;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo17782a(C9027a0 c9027a0, Map map) {
            if (map == null) {
                throw AbstractC9041h0.m17754p(this.f21188a, this.f21189b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC9041h0.m17754p(this.f21188a, this.f21189b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC9041h0.m17754p(this.f21188a, this.f21189b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                c9027a0.m17674d(C9737q.m19388d(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f21191d), (AbstractC9744x) this.f21190c.convert(value));
            }
        }
    }

    /* renamed from: df.v$k */
    public static final class k extends AbstractC9055v {

        /* renamed from: a */
        public final Method f21192a;

        /* renamed from: b */
        public final int f21193b;

        /* renamed from: c */
        public final String f21194c;

        /* renamed from: d */
        public final InterfaceC9040h f21195d;

        /* renamed from: e */
        public final boolean f21196e;

        public k(Method method, int i10, String str, InterfaceC9040h interfaceC9040h, boolean z10) {
            this.f21192a = method;
            this.f21193b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f21194c = str;
            this.f21195d = interfaceC9040h;
            this.f21196e = z10;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: a */
        public void mo17782a(C9027a0 c9027a0, Object obj) throws EOFException {
            if (obj != null) {
                c9027a0.m17676f(this.f21194c, (String) this.f21195d.convert(obj), this.f21196e);
                return;
            }
            throw AbstractC9041h0.m17754p(this.f21192a, this.f21193b, "Path parameter \"" + this.f21194c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: df.v$l */
    public static final class l extends AbstractC9055v {

        /* renamed from: a */
        public final String f21197a;

        /* renamed from: b */
        public final InterfaceC9040h f21198b;

        /* renamed from: c */
        public final boolean f21199c;

        public l(String str, InterfaceC9040h interfaceC9040h, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f21197a = str;
            this.f21198b = interfaceC9040h;
            this.f21199c = z10;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: a */
        public void mo17782a(C9027a0 c9027a0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f21198b.convert(obj)) == null) {
                return;
            }
            c9027a0.m17677g(this.f21197a, str, this.f21199c);
        }
    }

    /* renamed from: df.v$m */
    public static final class m extends AbstractC9055v {

        /* renamed from: a */
        public final Method f21200a;

        /* renamed from: b */
        public final int f21201b;

        /* renamed from: c */
        public final InterfaceC9040h f21202c;

        /* renamed from: d */
        public final boolean f21203d;

        public m(Method method, int i10, InterfaceC9040h interfaceC9040h, boolean z10) {
            this.f21200a = method;
            this.f21201b = i10;
            this.f21202c = interfaceC9040h;
            this.f21203d = z10;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo17782a(C9027a0 c9027a0, Map map) {
            if (map == null) {
                throw AbstractC9041h0.m17754p(this.f21200a, this.f21201b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC9041h0.m17754p(this.f21200a, this.f21201b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC9041h0.m17754p(this.f21200a, this.f21201b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f21202c.convert(value);
                if (str2 == null) {
                    throw AbstractC9041h0.m17754p(this.f21200a, this.f21201b, "Query map value '" + value + "' converted to null by " + this.f21202c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c9027a0.m17677g(str, str2, this.f21203d);
            }
        }
    }

    /* renamed from: df.v$n */
    public static final class n extends AbstractC9055v {

        /* renamed from: a */
        public final InterfaceC9040h f21204a;

        /* renamed from: b */
        public final boolean f21205b;

        public n(InterfaceC9040h interfaceC9040h, boolean z10) {
            this.f21204a = interfaceC9040h;
            this.f21205b = z10;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: a */
        public void mo17782a(C9027a0 c9027a0, Object obj) {
            if (obj == null) {
                return;
            }
            c9027a0.m17677g((String) this.f21204a.convert(obj), null, this.f21205b);
        }
    }

    /* renamed from: df.v$o */
    public static final class o extends AbstractC9055v {

        /* renamed from: a */
        public static final o f21206a = new o();

        @Override // p122df.AbstractC9055v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo17782a(C9027a0 c9027a0, C9741u.c cVar) {
            if (cVar != null) {
                c9027a0.m17675e(cVar);
            }
        }
    }

    /* renamed from: df.v$p */
    public static final class p extends AbstractC9055v {

        /* renamed from: a */
        public final Method f21207a;

        /* renamed from: b */
        public final int f21208b;

        public p(Method method, int i10) {
            this.f21207a = method;
            this.f21208b = i10;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: a */
        public void mo17782a(C9027a0 c9027a0, Object obj) {
            if (obj == null) {
                throw AbstractC9041h0.m17754p(this.f21207a, this.f21208b, "@Url parameter is null.", new Object[0]);
            }
            c9027a0.m17681m(obj);
        }
    }

    /* renamed from: df.v$q */
    public static final class q extends AbstractC9055v {

        /* renamed from: a */
        public final Class f21209a;

        public q(Class cls) {
            this.f21209a = cls;
        }

        @Override // p122df.AbstractC9055v
        /* renamed from: a */
        public void mo17782a(C9027a0 c9027a0, Object obj) {
            c9027a0.m17678h(this.f21209a, obj);
        }
    }

    /* renamed from: a */
    public abstract void mo17782a(C9027a0 c9027a0, Object obj);

    /* renamed from: b */
    public final AbstractC9055v m17783b() {
        return new b();
    }

    /* renamed from: c */
    public final AbstractC9055v m17784c() {
        return new a();
    }
}
