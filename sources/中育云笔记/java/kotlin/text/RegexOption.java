package kotlin.text;

import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class RegexOption {

    /* renamed from: e */
    public static final RegexOption f23445e = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);

    /* renamed from: f */
    public static final RegexOption f23446f = new RegexOption("MULTILINE", 1, 8, 0, 2, null);

    /* renamed from: g */
    public static final RegexOption f23447g = new RegexOption("LITERAL", 2, 16, 0, 2, null);

    /* renamed from: h */
    public static final RegexOption f23448h = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);

    /* renamed from: i */
    public static final RegexOption f23449i = new RegexOption("COMMENTS", 4, 4, 0, 2, null);

    /* renamed from: j */
    public static final RegexOption f23450j = new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null);

    /* renamed from: k */
    public static final RegexOption f23451k = new RegexOption("CANON_EQ", 6, 128, 0, 2, null);

    /* renamed from: l */
    public static final /* synthetic */ RegexOption[] f23452l;

    /* renamed from: m */
    public static final /* synthetic */ InterfaceC11943a f23453m;

    /* renamed from: c */
    public final int f23454c;

    /* renamed from: d */
    public final int f23455d;

    static {
        RegexOption[] regexOptionArrM20349a = m20349a();
        f23452l = regexOptionArrM20349a;
        f23453m = AbstractC9953a.m20230a(regexOptionArrM20349a);
    }

    public RegexOption(String str, int i10, int i11, int i12) {
        this.f23454c = i11;
        this.f23455d = i12;
    }

    /* renamed from: a */
    public static final /* synthetic */ RegexOption[] m20349a() {
        return new RegexOption[]{f23445e, f23446f, f23447g, f23448h, f23449i, f23450j, f23451k};
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) f23452l.clone();
    }

    /* renamed from: c */
    public int m20350c() {
        return this.f23454c;
    }

    public /* synthetic */ RegexOption(String str, int i10, int i11, int i12, int i13, AbstractC9972n abstractC9972n) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }
}
