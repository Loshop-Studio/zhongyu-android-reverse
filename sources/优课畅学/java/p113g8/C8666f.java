package p113g8;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: g8.f */
/* loaded from: classes5.dex */
public final class C8666f {

    /* renamed from: d */
    public static final b f16229d = new b(null);

    /* renamed from: e */
    public static final C8666f f16230e;

    /* renamed from: f */
    public static final C8666f f16231f;

    /* renamed from: a */
    public final boolean f16232a;

    /* renamed from: b */
    public final a f16233b;

    /* renamed from: c */
    public final c f16234c;

    /* renamed from: g8.f$a */
    public static final class a {

        /* renamed from: j */
        public static final C10804a f16235j = new C10804a(null);

        /* renamed from: k */
        public static final a f16236k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* renamed from: a */
        public final int f16237a;

        /* renamed from: b */
        public final int f16238b;

        /* renamed from: c */
        public final String f16239c;

        /* renamed from: d */
        public final String f16240d;

        /* renamed from: e */
        public final String f16241e;

        /* renamed from: f */
        public final String f16242f;

        /* renamed from: g */
        public final boolean f16243g;

        /* renamed from: h */
        public final boolean f16244h;

        /* renamed from: i */
        public final boolean f16245i;

        /* renamed from: g8.f$a$a, reason: collision with other inner class name */
        public static final class C10804a {
            public /* synthetic */ C10804a(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: a */
            public final a m14039a() {
                return a.f16236k;
            }

            public C10804a() {
            }
        }

        public a(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            AbstractC9133u.m16133g(groupSeparator, "groupSeparator");
            AbstractC9133u.m16133g(byteSeparator, "byteSeparator");
            AbstractC9133u.m16133g(bytePrefix, "bytePrefix");
            AbstractC9133u.m16133g(byteSuffix, "byteSuffix");
            this.f16237a = i10;
            this.f16238b = i11;
            this.f16239c = groupSeparator;
            this.f16240d = byteSeparator;
            this.f16241e = bytePrefix;
            this.f16242f = byteSuffix;
            this.f16243g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f16244h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f16245i = AbstractC8668g.m14050b(groupSeparator) || AbstractC8668g.m14050b(byteSeparator) || AbstractC8668g.m14050b(bytePrefix) || AbstractC8668g.m14050b(byteSuffix);
        }

        /* renamed from: b */
        public final StringBuilder m14038b(StringBuilder sb, String indent) {
            AbstractC9133u.m16133g(sb, "sb");
            AbstractC9133u.m16133g(indent, "indent");
            sb.append(indent);
            sb.append("bytesPerLine = ");
            sb.append(this.f16237a);
            sb.append(",");
            sb.append('\n');
            sb.append(indent);
            sb.append("bytesPerGroup = ");
            sb.append(this.f16238b);
            sb.append(",");
            sb.append('\n');
            sb.append(indent);
            sb.append("groupSeparator = \"");
            sb.append(this.f16239c);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("byteSeparator = \"");
            sb.append(this.f16240d);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("bytePrefix = \"");
            sb.append(this.f16241e);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("byteSuffix = \"");
            sb.append(this.f16242f);
            sb.append("\"");
            return sb;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(");
            sb.append('\n');
            m14038b(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: g8.f$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final C8666f m14040a() {
            return C8666f.f16230e;
        }

        public b() {
        }
    }

    /* renamed from: g8.f$c */
    public static final class c {

        /* renamed from: h */
        public static final a f16246h = new a(null);

        /* renamed from: i */
        public static final c f16247i = new c("", "", false, 1);

        /* renamed from: a */
        public final String f16248a;

        /* renamed from: b */
        public final String f16249b;

        /* renamed from: c */
        public final boolean f16250c;

        /* renamed from: d */
        public final int f16251d;

        /* renamed from: e */
        public final boolean f16252e;

        /* renamed from: f */
        public final boolean f16253f;

        /* renamed from: g */
        public final boolean f16254g;

        /* renamed from: g8.f$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: a */
            public final c m14047a() {
                return c.f16247i;
            }

            public a() {
            }
        }

        public c(String prefix, String suffix, boolean z10, int i10) {
            AbstractC9133u.m16133g(prefix, "prefix");
            AbstractC9133u.m16133g(suffix, "suffix");
            this.f16248a = prefix;
            this.f16249b = suffix;
            this.f16250c = z10;
            this.f16251d = i10;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.f16252e = z11;
            this.f16253f = z11 && i10 == 1;
            this.f16254g = AbstractC8668g.m14050b(prefix) || AbstractC8668g.m14050b(suffix);
        }

        /* renamed from: b */
        public final StringBuilder m14042b(StringBuilder sb, String indent) {
            AbstractC9133u.m16133g(sb, "sb");
            AbstractC9133u.m16133g(indent, "indent");
            sb.append(indent);
            sb.append("prefix = \"");
            sb.append(this.f16248a);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("suffix = \"");
            sb.append(this.f16249b);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("removeLeadingZeros = ");
            sb.append(this.f16250c);
            sb.append(',');
            sb.append('\n');
            sb.append(indent);
            sb.append("minLength = ");
            sb.append(this.f16251d);
            return sb;
        }

        /* renamed from: c */
        public final boolean m14043c() {
            return this.f16254g;
        }

        /* renamed from: d */
        public final String m14044d() {
            return this.f16248a;
        }

        /* renamed from: e */
        public final String m14045e() {
            return this.f16249b;
        }

        /* renamed from: f */
        public final boolean m14046f() {
            return this.f16252e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(");
            sb.append('\n');
            m14042b(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        a.C10804a c10804a = a.f16235j;
        a aVarM14039a = c10804a.m14039a();
        c.a aVar = c.f16246h;
        f16230e = new C8666f(false, aVarM14039a, aVar.m14047a());
        f16231f = new C8666f(true, c10804a.m14039a(), aVar.m14047a());
    }

    public C8666f(boolean z10, a bytes, c number) {
        AbstractC9133u.m16133g(bytes, "bytes");
        AbstractC9133u.m16133g(number, "number");
        this.f16232a = z10;
        this.f16233b = bytes;
        this.f16234c = number;
    }

    /* renamed from: b */
    public final c m14036b() {
        return this.f16234c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        sb.append('\n');
        sb.append("    upperCase = ");
        sb.append(this.f16232a);
        sb.append(",");
        sb.append('\n');
        sb.append("    bytes = BytesHexFormat(");
        sb.append('\n');
        this.f16233b.m14038b(sb, "        ").append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.f16234c.m14042b(sb, "        ").append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
