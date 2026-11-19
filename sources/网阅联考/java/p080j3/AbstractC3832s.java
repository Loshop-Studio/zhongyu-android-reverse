package p080j3;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p117r2.AbstractC4523z;
import p117r2.C4516s;
import p117r2.C4520w;

/* renamed from: j3.s */
/* loaded from: classes2.dex */
public abstract class AbstractC3832s {

    /* renamed from: j3.s$a */
    public class a extends AbstractC3832s {
        public a() {
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo5097a(C3808b0 c3808b0, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC3832s.this.mo5097a(c3808b0, it.next());
            }
        }
    }

    /* renamed from: j3.s$b */
    public class b extends AbstractC3832s {
        public b() {
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: a */
        public void mo5097a(C3808b0 c3808b0, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i4 = 0; i4 < length; i4++) {
                AbstractC3832s.this.mo5097a(c3808b0, Array.get(obj, i4));
            }
        }
    }

    /* renamed from: j3.s$c */
    public static final class c extends AbstractC3832s {

        /* renamed from: a */
        public final Method f4691a;

        /* renamed from: b */
        public final int f4692b;

        /* renamed from: c */
        public final InterfaceC3821i f4693c;

        public c(Method method, int i4, InterfaceC3821i interfaceC3821i) {
            this.f4691a = method;
            this.f4692b = i4;
            this.f4693c = interfaceC3821i;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: a */
        public void mo5097a(C3808b0 c3808b0, Object obj) {
            if (obj == null) {
                throw AbstractC3822i0.m5067o(this.f4691a, this.f4692b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                c3808b0.m4996l((AbstractC4523z) this.f4693c.mo4967a(obj));
            } catch (IOException e4) {
                throw AbstractC3822i0.m5068p(this.f4691a, e4, this.f4692b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    /* renamed from: j3.s$d */
    public static final class d extends AbstractC3832s {

        /* renamed from: a */
        public final String f4694a;

        /* renamed from: b */
        public final InterfaceC3821i f4695b;

        /* renamed from: c */
        public final boolean f4696c;

        public d(String str, InterfaceC3821i interfaceC3821i, boolean z3) {
            Objects.requireNonNull(str, "name == null");
            this.f4694a = str;
            this.f4695b = interfaceC3821i;
            this.f4696c = z3;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: a */
        public void mo5097a(C3808b0 c3808b0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f4695b.mo4967a(obj)) == null) {
                return;
            }
            c3808b0.m4987a(this.f4694a, str, this.f4696c);
        }
    }

    /* renamed from: j3.s$e */
    public static final class e extends AbstractC3832s {

        /* renamed from: a */
        public final Method f4697a;

        /* renamed from: b */
        public final int f4698b;

        /* renamed from: c */
        public final InterfaceC3821i f4699c;

        /* renamed from: d */
        public final boolean f4700d;

        public e(Method method, int i4, InterfaceC3821i interfaceC3821i, boolean z3) {
            this.f4697a = method;
            this.f4698b = i4;
            this.f4699c = interfaceC3821i;
            this.f4700d = z3;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo5097a(C3808b0 c3808b0, Map map) {
            if (map == null) {
                throw AbstractC3822i0.m5067o(this.f4697a, this.f4698b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC3822i0.m5067o(this.f4697a, this.f4698b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC3822i0.m5067o(this.f4697a, this.f4698b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f4699c.mo4967a(value);
                if (str2 == null) {
                    throw AbstractC3822i0.m5067o(this.f4697a, this.f4698b, "Field map value '" + value + "' converted to null by " + this.f4699c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c3808b0.m4987a(str, str2, this.f4700d);
            }
        }
    }

    /* renamed from: j3.s$f */
    public static final class f extends AbstractC3832s {

        /* renamed from: a */
        public final String f4701a;

        /* renamed from: b */
        public final InterfaceC3821i f4702b;

        public f(String str, InterfaceC3821i interfaceC3821i) {
            Objects.requireNonNull(str, "name == null");
            this.f4701a = str;
            this.f4702b = interfaceC3821i;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: a */
        public void mo5097a(C3808b0 c3808b0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f4702b.mo4967a(obj)) == null) {
                return;
            }
            c3808b0.m4988b(this.f4701a, str);
        }
    }

    /* renamed from: j3.s$g */
    public static final class g extends AbstractC3832s {

        /* renamed from: a */
        public final Method f4703a;

        /* renamed from: b */
        public final int f4704b;

        /* renamed from: c */
        public final InterfaceC3821i f4705c;

        public g(Method method, int i4, InterfaceC3821i interfaceC3821i) {
            this.f4703a = method;
            this.f4704b = i4;
            this.f4705c = interfaceC3821i;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo5097a(C3808b0 c3808b0, Map map) {
            if (map == null) {
                throw AbstractC3822i0.m5067o(this.f4703a, this.f4704b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC3822i0.m5067o(this.f4703a, this.f4704b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC3822i0.m5067o(this.f4703a, this.f4704b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                c3808b0.m4988b(str, (String) this.f4705c.mo4967a(value));
            }
        }
    }

    /* renamed from: j3.s$h */
    public static final class h extends AbstractC3832s {

        /* renamed from: a */
        public final Method f4706a;

        /* renamed from: b */
        public final int f4707b;

        public h(Method method, int i4) {
            this.f4706a = method;
            this.f4707b = i4;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo5097a(C3808b0 c3808b0, C4516s c4516s) {
            if (c4516s == null) {
                throw AbstractC3822i0.m5067o(this.f4706a, this.f4707b, "Headers parameter must not be null.", new Object[0]);
            }
            c3808b0.m4989c(c4516s);
        }
    }

    /* renamed from: j3.s$i */
    public static final class i extends AbstractC3832s {

        /* renamed from: a */
        public final Method f4708a;

        /* renamed from: b */
        public final int f4709b;

        /* renamed from: c */
        public final C4516s f4710c;

        /* renamed from: d */
        public final InterfaceC3821i f4711d;

        public i(Method method, int i4, C4516s c4516s, InterfaceC3821i interfaceC3821i) {
            this.f4708a = method;
            this.f4709b = i4;
            this.f4710c = c4516s;
            this.f4711d = interfaceC3821i;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: a */
        public void mo5097a(C3808b0 c3808b0, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                c3808b0.m4990d(this.f4710c, (AbstractC4523z) this.f4711d.mo4967a(obj));
            } catch (IOException e4) {
                throw AbstractC3822i0.m5067o(this.f4708a, this.f4709b, "Unable to convert " + obj + " to RequestBody", e4);
            }
        }
    }

    /* renamed from: j3.s$j */
    public static final class j extends AbstractC3832s {

        /* renamed from: a */
        public final Method f4712a;

        /* renamed from: b */
        public final int f4713b;

        /* renamed from: c */
        public final InterfaceC3821i f4714c;

        /* renamed from: d */
        public final String f4715d;

        public j(Method method, int i4, InterfaceC3821i interfaceC3821i, String str) {
            this.f4712a = method;
            this.f4713b = i4;
            this.f4714c = interfaceC3821i;
            this.f4715d = str;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo5097a(C3808b0 c3808b0, Map map) {
            if (map == null) {
                throw AbstractC3822i0.m5067o(this.f4712a, this.f4713b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC3822i0.m5067o(this.f4712a, this.f4713b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC3822i0.m5067o(this.f4712a, this.f4713b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                c3808b0.m4990d(C4516s.m5958d("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f4715d), (AbstractC4523z) this.f4714c.mo4967a(value));
            }
        }
    }

    /* renamed from: j3.s$k */
    public static final class k extends AbstractC3832s {

        /* renamed from: a */
        public final Method f4716a;

        /* renamed from: b */
        public final int f4717b;

        /* renamed from: c */
        public final String f4718c;

        /* renamed from: d */
        public final InterfaceC3821i f4719d;

        /* renamed from: e */
        public final boolean f4720e;

        public k(Method method, int i4, String str, InterfaceC3821i interfaceC3821i, boolean z3) {
            this.f4716a = method;
            this.f4717b = i4;
            Objects.requireNonNull(str, "name == null");
            this.f4718c = str;
            this.f4719d = interfaceC3821i;
            this.f4720e = z3;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: a */
        public void mo5097a(C3808b0 c3808b0, Object obj) {
            if (obj != null) {
                c3808b0.m4992f(this.f4718c, (String) this.f4719d.mo4967a(obj), this.f4720e);
                return;
            }
            throw AbstractC3822i0.m5067o(this.f4716a, this.f4717b, "Path parameter \"" + this.f4718c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: j3.s$l */
    public static final class l extends AbstractC3832s {

        /* renamed from: a */
        public final String f4721a;

        /* renamed from: b */
        public final InterfaceC3821i f4722b;

        /* renamed from: c */
        public final boolean f4723c;

        public l(String str, InterfaceC3821i interfaceC3821i, boolean z3) {
            Objects.requireNonNull(str, "name == null");
            this.f4721a = str;
            this.f4722b = interfaceC3821i;
            this.f4723c = z3;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: a */
        public void mo5097a(C3808b0 c3808b0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f4722b.mo4967a(obj)) == null) {
                return;
            }
            c3808b0.m4993g(this.f4721a, str, this.f4723c);
        }
    }

    /* renamed from: j3.s$m */
    public static final class m extends AbstractC3832s {

        /* renamed from: a */
        public final Method f4724a;

        /* renamed from: b */
        public final int f4725b;

        /* renamed from: c */
        public final InterfaceC3821i f4726c;

        /* renamed from: d */
        public final boolean f4727d;

        public m(Method method, int i4, InterfaceC3821i interfaceC3821i, boolean z3) {
            this.f4724a = method;
            this.f4725b = i4;
            this.f4726c = interfaceC3821i;
            this.f4727d = z3;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo5097a(C3808b0 c3808b0, Map map) {
            if (map == null) {
                throw AbstractC3822i0.m5067o(this.f4724a, this.f4725b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC3822i0.m5067o(this.f4724a, this.f4725b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC3822i0.m5067o(this.f4724a, this.f4725b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f4726c.mo4967a(value);
                if (str2 == null) {
                    throw AbstractC3822i0.m5067o(this.f4724a, this.f4725b, "Query map value '" + value + "' converted to null by " + this.f4726c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c3808b0.m4993g(str, str2, this.f4727d);
            }
        }
    }

    /* renamed from: j3.s$n */
    public static final class n extends AbstractC3832s {

        /* renamed from: a */
        public final InterfaceC3821i f4728a;

        /* renamed from: b */
        public final boolean f4729b;

        public n(InterfaceC3821i interfaceC3821i, boolean z3) {
            this.f4728a = interfaceC3821i;
            this.f4729b = z3;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: a */
        public void mo5097a(C3808b0 c3808b0, Object obj) {
            if (obj == null) {
                return;
            }
            c3808b0.m4993g((String) this.f4728a.mo4967a(obj), null, this.f4729b);
        }
    }

    /* renamed from: j3.s$o */
    public static final class o extends AbstractC3832s {

        /* renamed from: a */
        public static final o f4730a = new o();

        @Override // p080j3.AbstractC3832s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo5097a(C3808b0 c3808b0, C4520w.c cVar) {
            if (cVar != null) {
                c3808b0.m4991e(cVar);
            }
        }
    }

    /* renamed from: j3.s$p */
    public static final class p extends AbstractC3832s {

        /* renamed from: a */
        public final Method f4731a;

        /* renamed from: b */
        public final int f4732b;

        public p(Method method, int i4) {
            this.f4731a = method;
            this.f4732b = i4;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: a */
        public void mo5097a(C3808b0 c3808b0, Object obj) {
            if (obj == null) {
                throw AbstractC3822i0.m5067o(this.f4731a, this.f4732b, "@Url parameter is null.", new Object[0]);
            }
            c3808b0.m4997m(obj);
        }
    }

    /* renamed from: j3.s$q */
    public static final class q extends AbstractC3832s {

        /* renamed from: a */
        public final Class f4733a;

        public q(Class cls) {
            this.f4733a = cls;
        }

        @Override // p080j3.AbstractC3832s
        /* renamed from: a */
        public void mo5097a(C3808b0 c3808b0, Object obj) {
            c3808b0.m4994h(this.f4733a, obj);
        }
    }

    /* renamed from: a */
    public abstract void mo5097a(C3808b0 c3808b0, Object obj);

    /* renamed from: b */
    public final AbstractC3832s m5098b() {
        return new b();
    }

    /* renamed from: c */
    public final AbstractC3832s m5099c() {
        return new a();
    }
}
