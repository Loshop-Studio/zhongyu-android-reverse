package p200z5;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p058f5.AbstractC6360c0;
import p058f5.C6383v;
import p058f5.C6387z;

/* renamed from: z5.v */
/* loaded from: classes4.dex */
public abstract class AbstractC7981v {

    /* renamed from: z5.v$a */
    public class a extends AbstractC7981v {
        public a() {
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo9864a(C7953a0 c7953a0, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC7981v.this.mo9864a(c7953a0, it.next());
            }
        }
    }

    /* renamed from: z5.v$b */
    public class b extends AbstractC7981v {
        public b() {
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: a */
        public void mo9864a(C7953a0 c7953a0, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i6 = 0; i6 < length; i6++) {
                AbstractC7981v.this.mo9864a(c7953a0, Array.get(obj, i6));
            }
        }
    }

    /* renamed from: z5.v$c */
    public static final class c extends AbstractC7981v {

        /* renamed from: a */
        public final Method f10817a;

        /* renamed from: b */
        public final int f10818b;

        /* renamed from: c */
        public final InterfaceC7966h f10819c;

        public c(Method method, int i6, InterfaceC7966h interfaceC7966h) {
            this.f10817a = method;
            this.f10818b = i6;
            this.f10819c = interfaceC7966h;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: a */
        public void mo9864a(C7953a0 c7953a0, Object obj) {
            if (obj == null) {
                throw AbstractC7967h0.m9836p(this.f10817a, this.f10818b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                c7953a0.m9761l((AbstractC6360c0) this.f10819c.convert(obj));
            } catch (IOException e6) {
                throw AbstractC7967h0.m9837q(this.f10817a, e6, this.f10818b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    /* renamed from: z5.v$d */
    public static final class d extends AbstractC7981v {

        /* renamed from: a */
        public final String f10820a;

        /* renamed from: b */
        public final InterfaceC7966h f10821b;

        /* renamed from: c */
        public final boolean f10822c;

        public d(String str, InterfaceC7966h interfaceC7966h, boolean z6) {
            Objects.requireNonNull(str, "name == null");
            this.f10820a = str;
            this.f10821b = interfaceC7966h;
            this.f10822c = z6;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: a */
        public void mo9864a(C7953a0 c7953a0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f10821b.convert(obj)) == null) {
                return;
            }
            c7953a0.m9752a(this.f10820a, str, this.f10822c);
        }
    }

    /* renamed from: z5.v$e */
    public static final class e extends AbstractC7981v {

        /* renamed from: a */
        public final Method f10823a;

        /* renamed from: b */
        public final int f10824b;

        /* renamed from: c */
        public final InterfaceC7966h f10825c;

        /* renamed from: d */
        public final boolean f10826d;

        public e(Method method, int i6, InterfaceC7966h interfaceC7966h, boolean z6) {
            this.f10823a = method;
            this.f10824b = i6;
            this.f10825c = interfaceC7966h;
            this.f10826d = z6;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo9864a(C7953a0 c7953a0, Map map) {
            if (map == null) {
                throw AbstractC7967h0.m9836p(this.f10823a, this.f10824b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC7967h0.m9836p(this.f10823a, this.f10824b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC7967h0.m9836p(this.f10823a, this.f10824b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f10825c.convert(value);
                if (str2 == null) {
                    throw AbstractC7967h0.m9836p(this.f10823a, this.f10824b, "Field map value '" + value + "' converted to null by " + this.f10825c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c7953a0.m9752a(str, str2, this.f10826d);
            }
        }
    }

    /* renamed from: z5.v$f */
    public static final class f extends AbstractC7981v {

        /* renamed from: a */
        public final String f10827a;

        /* renamed from: b */
        public final InterfaceC7966h f10828b;

        /* renamed from: c */
        public final boolean f10829c;

        public f(String str, InterfaceC7966h interfaceC7966h, boolean z6) {
            Objects.requireNonNull(str, "name == null");
            this.f10827a = str;
            this.f10828b = interfaceC7966h;
            this.f10829c = z6;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: a */
        public void mo9864a(C7953a0 c7953a0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f10828b.convert(obj)) == null) {
                return;
            }
            c7953a0.m9753b(this.f10827a, str, this.f10829c);
        }
    }

    /* renamed from: z5.v$g */
    public static final class g extends AbstractC7981v {

        /* renamed from: a */
        public final Method f10830a;

        /* renamed from: b */
        public final int f10831b;

        /* renamed from: c */
        public final InterfaceC7966h f10832c;

        /* renamed from: d */
        public final boolean f10833d;

        public g(Method method, int i6, InterfaceC7966h interfaceC7966h, boolean z6) {
            this.f10830a = method;
            this.f10831b = i6;
            this.f10832c = interfaceC7966h;
            this.f10833d = z6;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo9864a(C7953a0 c7953a0, Map map) {
            if (map == null) {
                throw AbstractC7967h0.m9836p(this.f10830a, this.f10831b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC7967h0.m9836p(this.f10830a, this.f10831b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC7967h0.m9836p(this.f10830a, this.f10831b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                c7953a0.m9753b(str, (String) this.f10832c.convert(value), this.f10833d);
            }
        }
    }

    /* renamed from: z5.v$h */
    public static final class h extends AbstractC7981v {

        /* renamed from: a */
        public final Method f10834a;

        /* renamed from: b */
        public final int f10835b;

        public h(Method method, int i6) {
            this.f10834a = method;
            this.f10835b = i6;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo9864a(C7953a0 c7953a0, C6383v c6383v) {
            if (c6383v == null) {
                throw AbstractC7967h0.m9836p(this.f10834a, this.f10835b, "Headers parameter must not be null.", new Object[0]);
            }
            c7953a0.m9754c(c6383v);
        }
    }

    /* renamed from: z5.v$i */
    public static final class i extends AbstractC7981v {

        /* renamed from: a */
        public final Method f10836a;

        /* renamed from: b */
        public final int f10837b;

        /* renamed from: c */
        public final C6383v f10838c;

        /* renamed from: d */
        public final InterfaceC7966h f10839d;

        public i(Method method, int i6, C6383v c6383v, InterfaceC7966h interfaceC7966h) {
            this.f10836a = method;
            this.f10837b = i6;
            this.f10838c = c6383v;
            this.f10839d = interfaceC7966h;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: a */
        public void mo9864a(C7953a0 c7953a0, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                c7953a0.m9755d(this.f10838c, (AbstractC6360c0) this.f10839d.convert(obj));
            } catch (IOException e6) {
                throw AbstractC7967h0.m9836p(this.f10836a, this.f10837b, "Unable to convert " + obj + " to RequestBody", e6);
            }
        }
    }

    /* renamed from: z5.v$j */
    public static final class j extends AbstractC7981v {

        /* renamed from: a */
        public final Method f10840a;

        /* renamed from: b */
        public final int f10841b;

        /* renamed from: c */
        public final InterfaceC7966h f10842c;

        /* renamed from: d */
        public final String f10843d;

        public j(Method method, int i6, InterfaceC7966h interfaceC7966h, String str) {
            this.f10840a = method;
            this.f10841b = i6;
            this.f10842c = interfaceC7966h;
            this.f10843d = str;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo9864a(C7953a0 c7953a0, Map map) {
            if (map == null) {
                throw AbstractC7967h0.m9836p(this.f10840a, this.f10841b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC7967h0.m9836p(this.f10840a, this.f10841b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC7967h0.m9836p(this.f10840a, this.f10841b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                c7953a0.m9755d(C6383v.m6798e(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f10843d), (AbstractC6360c0) this.f10842c.convert(value));
            }
        }
    }

    /* renamed from: z5.v$k */
    public static final class k extends AbstractC7981v {

        /* renamed from: a */
        public final Method f10844a;

        /* renamed from: b */
        public final int f10845b;

        /* renamed from: c */
        public final String f10846c;

        /* renamed from: d */
        public final InterfaceC7966h f10847d;

        /* renamed from: e */
        public final boolean f10848e;

        public k(Method method, int i6, String str, InterfaceC7966h interfaceC7966h, boolean z6) {
            this.f10844a = method;
            this.f10845b = i6;
            Objects.requireNonNull(str, "name == null");
            this.f10846c = str;
            this.f10847d = interfaceC7966h;
            this.f10848e = z6;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: a */
        public void mo9864a(C7953a0 c7953a0, Object obj) throws EOFException {
            if (obj != null) {
                c7953a0.m9757f(this.f10846c, (String) this.f10847d.convert(obj), this.f10848e);
                return;
            }
            throw AbstractC7967h0.m9836p(this.f10844a, this.f10845b, "Path parameter \"" + this.f10846c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: z5.v$l */
    public static final class l extends AbstractC7981v {

        /* renamed from: a */
        public final String f10849a;

        /* renamed from: b */
        public final InterfaceC7966h f10850b;

        /* renamed from: c */
        public final boolean f10851c;

        public l(String str, InterfaceC7966h interfaceC7966h, boolean z6) {
            Objects.requireNonNull(str, "name == null");
            this.f10849a = str;
            this.f10850b = interfaceC7966h;
            this.f10851c = z6;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: a */
        public void mo9864a(C7953a0 c7953a0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f10850b.convert(obj)) == null) {
                return;
            }
            c7953a0.m9758g(this.f10849a, str, this.f10851c);
        }
    }

    /* renamed from: z5.v$m */
    public static final class m extends AbstractC7981v {

        /* renamed from: a */
        public final Method f10852a;

        /* renamed from: b */
        public final int f10853b;

        /* renamed from: c */
        public final InterfaceC7966h f10854c;

        /* renamed from: d */
        public final boolean f10855d;

        public m(Method method, int i6, InterfaceC7966h interfaceC7966h, boolean z6) {
            this.f10852a = method;
            this.f10853b = i6;
            this.f10854c = interfaceC7966h;
            this.f10855d = z6;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo9864a(C7953a0 c7953a0, Map map) {
            if (map == null) {
                throw AbstractC7967h0.m9836p(this.f10852a, this.f10853b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC7967h0.m9836p(this.f10852a, this.f10853b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC7967h0.m9836p(this.f10852a, this.f10853b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f10854c.convert(value);
                if (str2 == null) {
                    throw AbstractC7967h0.m9836p(this.f10852a, this.f10853b, "Query map value '" + value + "' converted to null by " + this.f10854c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c7953a0.m9758g(str, str2, this.f10855d);
            }
        }
    }

    /* renamed from: z5.v$n */
    public static final class n extends AbstractC7981v {

        /* renamed from: a */
        public final InterfaceC7966h f10856a;

        /* renamed from: b */
        public final boolean f10857b;

        public n(InterfaceC7966h interfaceC7966h, boolean z6) {
            this.f10856a = interfaceC7966h;
            this.f10857b = z6;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: a */
        public void mo9864a(C7953a0 c7953a0, Object obj) {
            if (obj == null) {
                return;
            }
            c7953a0.m9758g((String) this.f10856a.convert(obj), null, this.f10857b);
        }
    }

    /* renamed from: z5.v$o */
    public static final class o extends AbstractC7981v {

        /* renamed from: a */
        public static final o f10858a = new o();

        @Override // p200z5.AbstractC7981v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo9864a(C7953a0 c7953a0, C6387z.c cVar) {
            if (cVar != null) {
                c7953a0.m9756e(cVar);
            }
        }
    }

    /* renamed from: z5.v$p */
    public static final class p extends AbstractC7981v {

        /* renamed from: a */
        public final Method f10859a;

        /* renamed from: b */
        public final int f10860b;

        public p(Method method, int i6) {
            this.f10859a = method;
            this.f10860b = i6;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: a */
        public void mo9864a(C7953a0 c7953a0, Object obj) {
            if (obj == null) {
                throw AbstractC7967h0.m9836p(this.f10859a, this.f10860b, "@Url parameter is null.", new Object[0]);
            }
            c7953a0.m9762m(obj);
        }
    }

    /* renamed from: z5.v$q */
    public static final class q extends AbstractC7981v {

        /* renamed from: a */
        public final Class f10861a;

        public q(Class cls) {
            this.f10861a = cls;
        }

        @Override // p200z5.AbstractC7981v
        /* renamed from: a */
        public void mo9864a(C7953a0 c7953a0, Object obj) {
            c7953a0.m9759h(this.f10861a, obj);
        }
    }

    /* renamed from: a */
    public abstract void mo9864a(C7953a0 c7953a0, Object obj);

    /* renamed from: b */
    public final AbstractC7981v m9865b() {
        return new b();
    }

    /* renamed from: c */
    public final AbstractC7981v m9866c() {
        return new a();
    }
}
