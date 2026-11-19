package kotlin.text;

import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class RegexOption {

    /* renamed from: c */
    public static final RegexOption f17516c = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);

    /* renamed from: d */
    public static final RegexOption f17517d = new RegexOption("MULTILINE", 1, 8, 0, 2, null);

    /* renamed from: e */
    public static final RegexOption f17518e = new RegexOption("LITERAL", 2, 16, 0, 2, null);

    /* renamed from: f */
    public static final RegexOption f17519f = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);

    /* renamed from: g */
    public static final RegexOption f17520g = new RegexOption("COMMENTS", 4, 4, 0, 2, null);

    /* renamed from: h */
    public static final RegexOption f17521h = new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null);

    /* renamed from: i */
    public static final RegexOption f17522i = new RegexOption("CANON_EQ", 6, 128, 0, 2, null);

    /* renamed from: j */
    public static final /* synthetic */ RegexOption[] f17523j;

    /* renamed from: k */
    public static final /* synthetic */ InterfaceC9760a f17524k;

    /* renamed from: a */
    public final int f17525a;

    /* renamed from: b */
    public final int f17526b;

    static {
        RegexOption[] regexOptionArrM16189a = m16189a();
        f17523j = regexOptionArrM16189a;
        f17524k = AbstractC9108a.m16085a(regexOptionArrM16189a);
    }

    public RegexOption(String str, int i10, int i11, int i12) {
        this.f17525a = i11;
        this.f17526b = i12;
    }

    /* renamed from: a */
    public static final /* synthetic */ RegexOption[] m16189a() {
        return new RegexOption[]{f17516c, f17517d, f17518e, f17519f, f17520g, f17521h, f17522i};
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) f17523j.clone();
    }

    /* renamed from: b */
    public int m16190b() {
        return this.f17525a;
    }

    public /* synthetic */ RegexOption(String str, int i10, int i11, int i12, int i13, AbstractC9126n abstractC9126n) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }
}
