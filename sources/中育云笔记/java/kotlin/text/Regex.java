package kotlin.text;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10807n;
import p310qd.InterfaceC10804k;
import p325rc.AbstractC10976v;

/* loaded from: classes6.dex */
public final class Regex implements Serializable {

    /* renamed from: d */
    public static final C9986a f23440d = new C9986a(null);

    /* renamed from: c */
    public final Pattern f23441c;

    public static final class Serialized implements Serializable {

        /* renamed from: e */
        public static final C9985a f23442e = new C9985a(null);

        /* renamed from: c */
        public final String f23443c;

        /* renamed from: d */
        public final int f23444d;

        /* renamed from: kotlin.text.Regex$Serialized$a */
        public static final class C9985a {
            public /* synthetic */ C9985a(AbstractC9972n abstractC9972n) {
                this();
            }

            public C9985a() {
            }
        }

        public Serialized(String pattern, int i10) {
            AbstractC9979u.m20294g(pattern, "pattern");
            this.f23443c = pattern;
            this.f23444d = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f23443c, this.f23444d);
            AbstractC9979u.m20293f(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }
    }

    /* renamed from: kotlin.text.Regex$a */
    public static final class C9986a {
        public /* synthetic */ C9986a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: b */
        public final int m20347b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        /* renamed from: c */
        public final String m20348c(String literal) {
            AbstractC9979u.m20294g(literal, "literal");
            String strQuote = Pattern.quote(literal);
            AbstractC9979u.m20293f(strQuote, "quote(...)");
            return strQuote;
        }

        public C9986a() {
        }
    }

    public Regex(Pattern nativePattern) {
        AbstractC9979u.m20294g(nativePattern, "nativePattern");
        this.f23441c = nativePattern;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC10804k m20336d(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.m20338c(charSequence, i10);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        String strPattern = this.f23441c.pattern();
        AbstractC9979u.m20293f(strPattern, "pattern(...)");
        return new Serialized(strPattern, this.f23441c.flags());
    }

    /* renamed from: a */
    public final boolean m20337a(CharSequence input) {
        AbstractC9979u.m20294g(input, "input");
        return this.f23441c.matcher(input).find();
    }

    /* renamed from: c */
    public final InterfaceC10804k m20338c(CharSequence input, int i10) {
        AbstractC9979u.m20294g(input, "input");
        Matcher matcher = this.f23441c.matcher(input);
        AbstractC9979u.m20293f(matcher, "matcher(...)");
        return AbstractC10807n.m23204e(matcher, i10, input);
    }

    /* renamed from: e */
    public final String m20339e() {
        String strPattern = this.f23441c.pattern();
        AbstractC9979u.m20293f(strPattern, "pattern(...)");
        return strPattern;
    }

    /* renamed from: f */
    public final InterfaceC10804k m20340f(CharSequence input) {
        AbstractC9979u.m20294g(input, "input");
        Matcher matcher = this.f23441c.matcher(input);
        AbstractC9979u.m20293f(matcher, "matcher(...)");
        return AbstractC10807n.m23205f(matcher, input);
    }

    /* renamed from: g */
    public final boolean m20341g(CharSequence input) {
        AbstractC9979u.m20294g(input, "input");
        return this.f23441c.matcher(input).matches();
    }

    /* renamed from: k */
    public final String m20342k(CharSequence input, InterfaceC9540l transform) {
        AbstractC9979u.m20294g(input, "input");
        AbstractC9979u.m20294g(transform, "transform");
        int iIntValue = 0;
        InterfaceC10804k interfaceC10804kM20336d = m20336d(this, input, 0, 2, null);
        if (interfaceC10804kM20336d == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, iIntValue, interfaceC10804kM20336d.mo23193a().getStart().intValue());
            sb2.append((CharSequence) transform.invoke(interfaceC10804kM20336d));
            iIntValue = interfaceC10804kM20336d.mo23193a().getEndInclusive().intValue() + 1;
            interfaceC10804kM20336d = interfaceC10804kM20336d.next();
            if (iIntValue >= length) {
                break;
            }
        } while (interfaceC10804kM20336d != null);
        if (iIntValue < length) {
            sb2.append(input, iIntValue, length);
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    /* renamed from: m */
    public final String m20343m(CharSequence input, String replacement) {
        AbstractC9979u.m20294g(input, "input");
        AbstractC9979u.m20294g(replacement, "replacement");
        String strReplaceAll = this.f23441c.matcher(input).replaceAll(replacement);
        AbstractC9979u.m20293f(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* renamed from: n */
    public final String m20344n(CharSequence input, String replacement) {
        AbstractC9979u.m20294g(input, "input");
        AbstractC9979u.m20294g(replacement, "replacement");
        String strReplaceFirst = this.f23441c.matcher(input).replaceFirst(replacement);
        AbstractC9979u.m20293f(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    /* renamed from: o */
    public final List m20345o(CharSequence input, int i10) {
        AbstractC9979u.m20294g(input, "input");
        AbstractC10793c0.m23086D0(i10);
        Matcher matcher = this.f23441c.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return AbstractC10976v.m24126e(input.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? AbstractC10410o.m21756i(i10, 10) : 10);
        int i11 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.f23441c.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String pattern) {
        AbstractC9979u.m20294g(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC9979u.m20293f(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String pattern, RegexOption option) {
        AbstractC9979u.m20294g(pattern, "pattern");
        AbstractC9979u.m20294g(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, f23440d.m20347b(option.m20350c()));
        AbstractC9979u.m20293f(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
