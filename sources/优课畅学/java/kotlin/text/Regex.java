package kotlin.text;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8675n;
import p113g8.C8673l;
import p113g8.InterfaceC8672k;
import p134i7.AbstractC8807u;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public final class Regex implements Serializable {

    /* renamed from: b */
    public static final C9140a f17511b = new C9140a(null);

    /* renamed from: a */
    public final Pattern f17512a;

    public static final class Serialized implements Serializable {

        /* renamed from: c */
        public static final C9139a f17513c = new C9139a(null);

        /* renamed from: a */
        public final String f17514a;

        /* renamed from: b */
        public final int f17515b;

        /* renamed from: kotlin.text.Regex$Serialized$a */
        public static final class C9139a {
            public /* synthetic */ C9139a(AbstractC9126n abstractC9126n) {
                this();
            }

            public C9139a() {
            }
        }

        public Serialized(String pattern, int i10) {
            AbstractC9133u.m16133g(pattern, "pattern");
            this.f17514a = pattern;
            this.f17515b = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f17514a, this.f17515b);
            AbstractC9133u.m16132f(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }
    }

    /* renamed from: kotlin.text.Regex$a */
    public static final class C9140a {
        public /* synthetic */ C9140a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: b */
        public final int m16187b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        /* renamed from: c */
        public final String m16188c(String literal) {
            AbstractC9133u.m16133g(literal, "literal");
            String strQuote = Pattern.quote(literal);
            AbstractC9133u.m16132f(strQuote, "quote(...)");
            return strQuote;
        }

        public C9140a() {
        }
    }

    public Regex(Pattern nativePattern) {
        AbstractC9133u.m16133g(nativePattern, "nativePattern");
        this.f17512a = nativePattern;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC8672k m16175c(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.m16177b(charSequence, i10);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        String strPattern = this.f17512a.pattern();
        AbstractC9133u.m16132f(strPattern, "pattern(...)");
        return new Serialized(strPattern, this.f17512a.flags());
    }

    /* renamed from: a */
    public final boolean m16176a(CharSequence input) {
        AbstractC9133u.m16133g(input, "input");
        return this.f17512a.matcher(input).find();
    }

    /* renamed from: b */
    public final InterfaceC8672k m16177b(CharSequence input, int i10) {
        AbstractC9133u.m16133g(input, "input");
        Matcher matcher = this.f17512a.matcher(input);
        AbstractC9133u.m16132f(matcher, "matcher(...)");
        return AbstractC8675n.m14069e(matcher, i10, input);
    }

    /* renamed from: d */
    public final String m16178d() {
        String strPattern = this.f17512a.pattern();
        AbstractC9133u.m16132f(strPattern, "pattern(...)");
        return strPattern;
    }

    /* renamed from: e */
    public final InterfaceC8672k m16179e(CharSequence input, int i10) {
        AbstractC9133u.m16133g(input, "input");
        Matcher matcherRegion = this.f17512a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        AbstractC9133u.m16130d(matcherRegion);
        return new C8673l(matcherRegion, input);
    }

    /* renamed from: g */
    public final InterfaceC8672k m16180g(CharSequence input) {
        AbstractC9133u.m16133g(input, "input");
        Matcher matcher = this.f17512a.matcher(input);
        AbstractC9133u.m16132f(matcher, "matcher(...)");
        return AbstractC8675n.m14070f(matcher, input);
    }

    /* renamed from: h */
    public final boolean m16181h(CharSequence input) {
        AbstractC9133u.m16133g(input, "input");
        return this.f17512a.matcher(input).matches();
    }

    /* renamed from: i */
    public final String m16182i(CharSequence input, String replacement) {
        AbstractC9133u.m16133g(input, "input");
        AbstractC9133u.m16133g(replacement, "replacement");
        String strReplaceAll = this.f17512a.matcher(input).replaceAll(replacement);
        AbstractC9133u.m16132f(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* renamed from: j */
    public final String m16183j(CharSequence input, InterfaceC10570l transform) {
        AbstractC9133u.m16133g(input, "input");
        AbstractC9133u.m16133g(transform, "transform");
        int iIntValue = 0;
        InterfaceC8672k interfaceC8672kM16175c = m16175c(this, input, 0, 2, null);
        if (interfaceC8672kM16175c == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, iIntValue, interfaceC8672kM16175c.mo14055b().getStart().intValue());
            sb.append((CharSequence) transform.invoke(interfaceC8672kM16175c));
            iIntValue = interfaceC8672kM16175c.mo14055b().getEndInclusive().intValue() + 1;
            interfaceC8672kM16175c = interfaceC8672kM16175c.next();
            if (iIntValue >= length) {
                break;
            }
        } while (interfaceC8672kM16175c != null);
        if (iIntValue < length) {
            sb.append(input, iIntValue, length);
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    /* renamed from: k */
    public final String m16184k(CharSequence input, String replacement) {
        AbstractC9133u.m16133g(input, "input");
        AbstractC9133u.m16133g(replacement, "replacement");
        String strReplaceFirst = this.f17512a.matcher(input).replaceFirst(replacement);
        AbstractC9133u.m16132f(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    /* renamed from: l */
    public final List m16185l(CharSequence input, int i10) {
        AbstractC9133u.m16133g(input, "input");
        AbstractC8661c0.m13953D0(i10);
        Matcher matcher = this.f17512a.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return AbstractC8807u.m14755e(input.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? AbstractC8323h.m13513h(i10, 10) : 10);
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
        String string = this.f17512a.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String pattern) {
        AbstractC9133u.m16133g(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC9133u.m16132f(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String pattern, RegexOption option) {
        AbstractC9133u.m16133g(pattern, "pattern");
        AbstractC9133u.m16133g(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, f17511b.m16187b(option.m16190b()));
        AbstractC9133u.m16132f(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
