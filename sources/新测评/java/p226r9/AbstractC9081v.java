package p226r9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p011a9.AbstractC0061x;
import p011a9.C0054q;
import p011a9.C0058u;

/* renamed from: r9.v */
/* loaded from: classes5.dex */
public abstract class AbstractC9081v {

    /* renamed from: r9.v$a */
    public class a extends AbstractC9081v {
        public a() {
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo15322a(C9053a0 c9053a0, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC9081v.this.mo15322a(c9053a0, it.next());
            }
        }
    }

    /* renamed from: r9.v$b */
    public class b extends AbstractC9081v {
        public b() {
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: a */
        public void mo15322a(C9053a0 c9053a0, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC9081v.this.mo15322a(c9053a0, Array.get(obj, i10));
            }
        }
    }

    /* renamed from: r9.v$c */
    public static final class c extends AbstractC9081v {

        /* renamed from: a */
        public final Method f15662a;

        /* renamed from: b */
        public final int f15663b;

        /* renamed from: c */
        public final InterfaceC9066h f15664c;

        public c(Method method, int i10, InterfaceC9066h interfaceC9066h) {
            this.f15662a = method;
            this.f15663b = i10;
            this.f15664c = interfaceC9066h;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: a */
        public void mo15322a(C9053a0 c9053a0, Object obj) {
            if (obj == null) {
                throw AbstractC9067h0.m15294p(this.f15662a, this.f15663b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                c9053a0.m15216l((AbstractC0061x) this.f15664c.convert(obj));
            } catch (IOException e10) {
                throw AbstractC9067h0.m15295q(this.f15662a, e10, this.f15663b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    /* renamed from: r9.v$d */
    public static final class d extends AbstractC9081v {

        /* renamed from: a */
        public final String f15665a;

        /* renamed from: b */
        public final InterfaceC9066h f15666b;

        /* renamed from: c */
        public final boolean f15667c;

        public d(String str, InterfaceC9066h interfaceC9066h, boolean z9) {
            Objects.requireNonNull(str, "name == null");
            this.f15665a = str;
            this.f15666b = interfaceC9066h;
            this.f15667c = z9;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: a */
        public void mo15322a(C9053a0 c9053a0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f15666b.convert(obj)) == null) {
                return;
            }
            c9053a0.m15207a(this.f15665a, str, this.f15667c);
        }
    }

    /* renamed from: r9.v$e */
    public static final class e extends AbstractC9081v {

        /* renamed from: a */
        public final Method f15668a;

        /* renamed from: b */
        public final int f15669b;

        /* renamed from: c */
        public final InterfaceC9066h f15670c;

        /* renamed from: d */
        public final boolean f15671d;

        public e(Method method, int i10, InterfaceC9066h interfaceC9066h, boolean z9) {
            this.f15668a = method;
            this.f15669b = i10;
            this.f15670c = interfaceC9066h;
            this.f15671d = z9;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo15322a(C9053a0 c9053a0, Map map) {
            if (map == null) {
                throw AbstractC9067h0.m15294p(this.f15668a, this.f15669b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC9067h0.m15294p(this.f15668a, this.f15669b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC9067h0.m15294p(this.f15668a, this.f15669b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f15670c.convert(value);
                if (str2 == null) {
                    throw AbstractC9067h0.m15294p(this.f15668a, this.f15669b, "Field map value '" + value + "' converted to null by " + this.f15670c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c9053a0.m15207a(str, str2, this.f15671d);
            }
        }
    }

    /* renamed from: r9.v$f */
    public static final class f extends AbstractC9081v {

        /* renamed from: a */
        public final String f15672a;

        /* renamed from: b */
        public final InterfaceC9066h f15673b;

        /* renamed from: c */
        public final boolean f15674c;

        public f(String str, InterfaceC9066h interfaceC9066h, boolean z9) {
            Objects.requireNonNull(str, "name == null");
            this.f15672a = str;
            this.f15673b = interfaceC9066h;
            this.f15674c = z9;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: a */
        public void mo15322a(C9053a0 c9053a0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f15673b.convert(obj)) == null) {
                return;
            }
            c9053a0.m15208b(this.f15672a, str, this.f15674c);
        }
    }

    /* renamed from: r9.v$g */
    public static final class g extends AbstractC9081v {

        /* renamed from: a */
        public final Method f15675a;

        /* renamed from: b */
        public final int f15676b;

        /* renamed from: c */
        public final InterfaceC9066h f15677c;

        /* renamed from: d */
        public final boolean f15678d;

        public g(Method method, int i10, InterfaceC9066h interfaceC9066h, boolean z9) {
            this.f15675a = method;
            this.f15676b = i10;
            this.f15677c = interfaceC9066h;
            this.f15678d = z9;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo15322a(C9053a0 c9053a0, Map map) {
            if (map == null) {
                throw AbstractC9067h0.m15294p(this.f15675a, this.f15676b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC9067h0.m15294p(this.f15675a, this.f15676b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC9067h0.m15294p(this.f15675a, this.f15676b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                c9053a0.m15208b(str, (String) this.f15677c.convert(value), this.f15678d);
            }
        }
    }

    /* renamed from: r9.v$h */
    public static final class h extends AbstractC9081v {

        /* renamed from: a */
        public final Method f15679a;

        /* renamed from: b */
        public final int f15680b;

        public h(Method method, int i10) {
            this.f15679a = method;
            this.f15680b = i10;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo15322a(C9053a0 c9053a0, C0054q c0054q) {
            if (c0054q == null) {
                throw AbstractC9067h0.m15294p(this.f15679a, this.f15680b, "Headers parameter must not be null.", new Object[0]);
            }
            c9053a0.m15209c(c0054q);
        }
    }

    /* renamed from: r9.v$i */
    public static final class i extends AbstractC9081v {

        /* renamed from: a */
        public final Method f15681a;

        /* renamed from: b */
        public final int f15682b;

        /* renamed from: c */
        public final C0054q f15683c;

        /* renamed from: d */
        public final InterfaceC9066h f15684d;

        public i(Method method, int i10, C0054q c0054q, InterfaceC9066h interfaceC9066h) {
            this.f15681a = method;
            this.f15682b = i10;
            this.f15683c = c0054q;
            this.f15684d = interfaceC9066h;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: a */
        public void mo15322a(C9053a0 c9053a0, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                c9053a0.m15210d(this.f15683c, (AbstractC0061x) this.f15684d.convert(obj));
            } catch (IOException e10) {
                throw AbstractC9067h0.m15294p(this.f15681a, this.f15682b, "Unable to convert " + obj + " to RequestBody", e10);
            }
        }
    }

    /* renamed from: r9.v$j */
    public static final class j extends AbstractC9081v {

        /* renamed from: a */
        public final Method f15685a;

        /* renamed from: b */
        public final int f15686b;

        /* renamed from: c */
        public final InterfaceC9066h f15687c;

        /* renamed from: d */
        public final String f15688d;

        public j(Method method, int i10, InterfaceC9066h interfaceC9066h, String str) {
            this.f15685a = method;
            this.f15686b = i10;
            this.f15687c = interfaceC9066h;
            this.f15688d = str;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo15322a(C9053a0 c9053a0, Map map) {
            if (map == null) {
                throw AbstractC9067h0.m15294p(this.f15685a, this.f15686b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC9067h0.m15294p(this.f15685a, this.f15686b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC9067h0.m15294p(this.f15685a, this.f15686b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                c9053a0.m15210d(C0054q.m179d(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f15688d), (AbstractC0061x) this.f15687c.convert(value));
            }
        }
    }

    /* renamed from: r9.v$k */
    public static final class k extends AbstractC9081v {

        /* renamed from: a */
        public final Method f15689a;

        /* renamed from: b */
        public final int f15690b;

        /* renamed from: c */
        public final String f15691c;

        /* renamed from: d */
        public final InterfaceC9066h f15692d;

        /* renamed from: e */
        public final boolean f15693e;

        public k(Method method, int i10, String str, InterfaceC9066h interfaceC9066h, boolean z9) {
            this.f15689a = method;
            this.f15690b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f15691c = str;
            this.f15692d = interfaceC9066h;
            this.f15693e = z9;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: a */
        public void mo15322a(C9053a0 c9053a0, Object obj) throws EOFException {
            if (obj != null) {
                c9053a0.m15212f(this.f15691c, (String) this.f15692d.convert(obj), this.f15693e);
                return;
            }
            throw AbstractC9067h0.m15294p(this.f15689a, this.f15690b, "Path parameter \"" + this.f15691c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: r9.v$l */
    public static final class l extends AbstractC9081v {

        /* renamed from: a */
        public final String f15694a;

        /* renamed from: b */
        public final InterfaceC9066h f15695b;

        /* renamed from: c */
        public final boolean f15696c;

        public l(String str, InterfaceC9066h interfaceC9066h, boolean z9) {
            Objects.requireNonNull(str, "name == null");
            this.f15694a = str;
            this.f15695b = interfaceC9066h;
            this.f15696c = z9;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: a */
        public void mo15322a(C9053a0 c9053a0, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f15695b.convert(obj)) == null) {
                return;
            }
            c9053a0.m15213g(this.f15694a, str, this.f15696c);
        }
    }

    /* renamed from: r9.v$m */
    public static final class m extends AbstractC9081v {

        /* renamed from: a */
        public final Method f15697a;

        /* renamed from: b */
        public final int f15698b;

        /* renamed from: c */
        public final InterfaceC9066h f15699c;

        /* renamed from: d */
        public final boolean f15700d;

        public m(Method method, int i10, InterfaceC9066h interfaceC9066h, boolean z9) {
            this.f15697a = method;
            this.f15698b = i10;
            this.f15699c = interfaceC9066h;
            this.f15700d = z9;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo15322a(C9053a0 c9053a0, Map map) {
            if (map == null) {
                throw AbstractC9067h0.m15294p(this.f15697a, this.f15698b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw AbstractC9067h0.m15294p(this.f15697a, this.f15698b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw AbstractC9067h0.m15294p(this.f15697a, this.f15698b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f15699c.convert(value);
                if (str2 == null) {
                    throw AbstractC9067h0.m15294p(this.f15697a, this.f15698b, "Query map value '" + value + "' converted to null by " + this.f15699c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                c9053a0.m15213g(str, str2, this.f15700d);
            }
        }
    }

    /* renamed from: r9.v$n */
    public static final class n extends AbstractC9081v {

        /* renamed from: a */
        public final InterfaceC9066h f15701a;

        /* renamed from: b */
        public final boolean f15702b;

        public n(InterfaceC9066h interfaceC9066h, boolean z9) {
            this.f15701a = interfaceC9066h;
            this.f15702b = z9;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: a */
        public void mo15322a(C9053a0 c9053a0, Object obj) {
            if (obj == null) {
                return;
            }
            c9053a0.m15213g((String) this.f15701a.convert(obj), null, this.f15702b);
        }
    }

    /* renamed from: r9.v$o */
    public static final class o extends AbstractC9081v {

        /* renamed from: a */
        public static final o f15703a = new o();

        @Override // p226r9.AbstractC9081v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo15322a(C9053a0 c9053a0, C0058u.c cVar) {
            if (cVar != null) {
                c9053a0.m15211e(cVar);
            }
        }
    }

    /* renamed from: r9.v$p */
    public static final class p extends AbstractC9081v {

        /* renamed from: a */
        public final Method f15704a;

        /* renamed from: b */
        public final int f15705b;

        public p(Method method, int i10) {
            this.f15704a = method;
            this.f15705b = i10;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: a */
        public void mo15322a(C9053a0 c9053a0, Object obj) {
            if (obj == null) {
                throw AbstractC9067h0.m15294p(this.f15704a, this.f15705b, "@Url parameter is null.", new Object[0]);
            }
            c9053a0.m15217m(obj);
        }
    }

    /* renamed from: r9.v$q */
    public static final class q extends AbstractC9081v {

        /* renamed from: a */
        public final Class f15706a;

        public q(Class cls) {
            this.f15706a = cls;
        }

        @Override // p226r9.AbstractC9081v
        /* renamed from: a */
        public void mo15322a(C9053a0 c9053a0, Object obj) {
            c9053a0.m15214h(this.f15706a, obj);
        }
    }

    /* renamed from: a */
    public abstract void mo15322a(C9053a0 c9053a0, Object obj);

    /* renamed from: b */
    public final AbstractC9081v m15323b() {
        return new b();
    }

    /* renamed from: c */
    public final AbstractC9081v m15324c() {
        return new a();
    }
}
