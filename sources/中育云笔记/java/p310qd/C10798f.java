package p310qd;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: qd.f */
/* loaded from: classes6.dex */
public final class C10798f {

    /* renamed from: d */
    public static final b f26042d = new b(null);

    /* renamed from: e */
    public static final C10798f f26043e;

    /* renamed from: f */
    public static final C10798f f26044f;

    /* renamed from: a */
    public final boolean f26045a;

    /* renamed from: b */
    public final a f26046b;

    /* renamed from: c */
    public final c f26047c;

    /* renamed from: qd.f$a */
    public static final class a {

        /* renamed from: j */
        public static final C12148a f26048j = new C12148a(null);

        /* renamed from: k */
        public static final a f26049k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* renamed from: a */
        public final int f26050a;

        /* renamed from: b */
        public final int f26051b;

        /* renamed from: c */
        public final String f26052c;

        /* renamed from: d */
        public final String f26053d;

        /* renamed from: e */
        public final String f26054e;

        /* renamed from: f */
        public final String f26055f;

        /* renamed from: g */
        public final boolean f26056g;

        /* renamed from: h */
        public final boolean f26057h;

        /* renamed from: i */
        public final boolean f26058i;

        /* renamed from: qd.f$a$a, reason: collision with other inner class name */
        public static final class C12148a {
            public /* synthetic */ C12148a(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: a */
            public final a m23178a() {
                return a.f26049k;
            }

            public C12148a() {
            }
        }

        public a(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            AbstractC9979u.m20294g(groupSeparator, "groupSeparator");
            AbstractC9979u.m20294g(byteSeparator, "byteSeparator");
            AbstractC9979u.m20294g(bytePrefix, "bytePrefix");
            AbstractC9979u.m20294g(byteSuffix, "byteSuffix");
            this.f26050a = i10;
            this.f26051b = i11;
            this.f26052c = groupSeparator;
            this.f26053d = byteSeparator;
            this.f26054e = bytePrefix;
            this.f26055f = byteSuffix;
            this.f26056g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f26057h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f26058i = AbstractC10800g.m23189b(groupSeparator) || AbstractC10800g.m23189b(byteSeparator) || AbstractC10800g.m23189b(bytePrefix) || AbstractC10800g.m23189b(byteSuffix);
        }

        /* renamed from: b */
        public final StringBuilder m23177b(StringBuilder sb2, String indent) {
            AbstractC9979u.m20294g(sb2, "sb");
            AbstractC9979u.m20294g(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f26050a);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f26051b);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f26052c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f26053d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f26054e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f26055f);
            sb2.append("\"");
            return sb2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            m23177b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* renamed from: qd.f$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C10798f m23179a() {
            return C10798f.f26043e;
        }

        public b() {
        }
    }

    /* renamed from: qd.f$c */
    public static final class c {

        /* renamed from: h */
        public static final a f26059h = new a(null);

        /* renamed from: i */
        public static final c f26060i = new c("", "", false, 1);

        /* renamed from: a */
        public final String f26061a;

        /* renamed from: b */
        public final String f26062b;

        /* renamed from: c */
        public final boolean f26063c;

        /* renamed from: d */
        public final int f26064d;

        /* renamed from: e */
        public final boolean f26065e;

        /* renamed from: f */
        public final boolean f26066f;

        /* renamed from: g */
        public final boolean f26067g;

        /* renamed from: qd.f$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: a */
            public final c m23186a() {
                return c.f26060i;
            }

            public a() {
            }
        }

        public c(String prefix, String suffix, boolean z10, int i10) {
            AbstractC9979u.m20294g(prefix, "prefix");
            AbstractC9979u.m20294g(suffix, "suffix");
            this.f26061a = prefix;
            this.f26062b = suffix;
            this.f26063c = z10;
            this.f26064d = i10;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.f26065e = z11;
            this.f26066f = z11 && i10 == 1;
            this.f26067g = AbstractC10800g.m23189b(prefix) || AbstractC10800g.m23189b(suffix);
        }

        /* renamed from: b */
        public final StringBuilder m23181b(StringBuilder sb2, String indent) {
            AbstractC9979u.m20294g(sb2, "sb");
            AbstractC9979u.m20294g(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f26061a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f26062b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f26063c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f26064d);
            return sb2;
        }

        /* renamed from: c */
        public final boolean m23182c() {
            return this.f26067g;
        }

        /* renamed from: d */
        public final String m23183d() {
            return this.f26061a;
        }

        /* renamed from: e */
        public final String m23184e() {
            return this.f26062b;
        }

        /* renamed from: f */
        public final boolean m23185f() {
            return this.f26065e;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            m23181b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        a.C12148a c12148a = a.f26048j;
        a aVarM23178a = c12148a.m23178a();
        c.a aVar = c.f26059h;
        f26043e = new C10798f(false, aVarM23178a, aVar.m23186a());
        f26044f = new C10798f(true, c12148a.m23178a(), aVar.m23186a());
    }

    public C10798f(boolean z10, a bytes, c number) {
        AbstractC9979u.m20294g(bytes, "bytes");
        AbstractC9979u.m20294g(number, "number");
        this.f26045a = z10;
        this.f26046b = bytes;
        this.f26047c = number;
    }

    /* renamed from: b */
    public final c m23175b() {
        return this.f26047c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.f26045a);
        sb2.append(",");
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.f26046b.m23177b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f26047c.m23181b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
