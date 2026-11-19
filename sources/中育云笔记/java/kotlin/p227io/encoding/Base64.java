package kotlin.p227io.encoding;

import com.tendcloud.tenddata.C7863av;
import java.nio.charset.Charset;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Utf8;
import p121dd.AbstractC9024a;
import p310qd.C10792c;
import p325rc.AbstractC10940d;
import p425yc.InterfaceC11943a;

/* loaded from: classes6.dex */
public class Base64 {

    /* renamed from: f */
    public static final C9954a f23381f = new C9954a(null);

    /* renamed from: g */
    public static final byte[] f23382g = {13, 10};

    /* renamed from: h */
    public static final Base64 f23383h;

    /* renamed from: i */
    public static final Base64 f23384i;

    /* renamed from: j */
    public static final Base64 f23385j;

    /* renamed from: a */
    public final boolean f23386a;

    /* renamed from: b */
    public final boolean f23387b;

    /* renamed from: c */
    public final int f23388c;

    /* renamed from: d */
    public final PaddingOption f23389d;

    /* renamed from: e */
    public final int f23390e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PaddingOption {

        /* renamed from: c */
        public static final PaddingOption f23391c = new PaddingOption("PRESENT", 0);

        /* renamed from: d */
        public static final PaddingOption f23392d = new PaddingOption("ABSENT", 1);

        /* renamed from: e */
        public static final PaddingOption f23393e = new PaddingOption("PRESENT_OPTIONAL", 2);

        /* renamed from: f */
        public static final PaddingOption f23394f = new PaddingOption("ABSENT_OPTIONAL", 3);

        /* renamed from: g */
        public static final /* synthetic */ PaddingOption[] f23395g;

        /* renamed from: h */
        public static final /* synthetic */ InterfaceC11943a f23396h;

        static {
            PaddingOption[] paddingOptionArrM20243a = m20243a();
            f23395g = paddingOptionArrM20243a;
            f23396h = AbstractC9953a.m20230a(paddingOptionArrM20243a);
        }

        public PaddingOption(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ PaddingOption[] m20243a() {
            return new PaddingOption[]{f23391c, f23392d, f23393e, f23394f};
        }

        public static PaddingOption valueOf(String str) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, str);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) f23395g.clone();
        }
    }

    /* renamed from: kotlin.io.encoding.Base64$a */
    public static final class C9954a extends Base64 {
        public /* synthetic */ C9954a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C9954a() {
            super(false, false, -1, PaddingOption.f23391c, null);
        }
    }

    static {
        PaddingOption paddingOption = PaddingOption.f23391c;
        f23383h = new Base64(true, false, -1, paddingOption);
        f23384i = new Base64(false, true, 76, paddingOption);
        f23385j = new Base64(false, true, 64, paddingOption);
    }

    public /* synthetic */ Base64(boolean z10, boolean z11, int i10, PaddingOption paddingOption, AbstractC9972n abstractC9972n) {
        this(z10, z11, i10, paddingOption);
    }

    /* renamed from: f */
    public static /* synthetic */ byte[] m20232f(Base64 base64, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return base64.m20237d(charSequence, i10, i11);
    }

    /* renamed from: g */
    public static /* synthetic */ byte[] m20233g(Base64 base64, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return base64.m20238e(bArr, i10, i11);
    }

    /* renamed from: a */
    public final byte[] m20234a(CharSequence source, int i10, int i11) {
        AbstractC9979u.m20294g(source, "source");
        m20236c(source.length(), i10, i11);
        byte[] bArr = new byte[i11 - i10];
        int i12 = 0;
        while (i10 < i11) {
            char cCharAt = source.charAt(i10);
            if (cCharAt <= 255) {
                bArr[i12] = (byte) cCharAt;
                i12++;
            } else {
                bArr[i12] = Utf8.REPLACEMENT_BYTE;
                i12++;
            }
            i10++;
        }
        return bArr;
    }

    /* renamed from: b */
    public final void m20235b(int i10) {
        if (this.f23389d != PaddingOption.f23392d) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i10);
    }

    /* renamed from: c */
    public final void m20236c(int i10, int i11, int i12) {
        AbstractC10940d.Companion.m23885a(i11, i12, i10);
    }

    /* renamed from: d */
    public final byte[] m20237d(CharSequence source, int i10, int i11) {
        byte[] bArrM20234a;
        AbstractC9979u.m20294g(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            m20236c(str.length(), i10, i11);
            String strSubstring = str.substring(i10, i11);
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
            Charset charset = C10792c.f26024g;
            AbstractC9979u.m20292e(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrM20234a = strSubstring.getBytes(charset);
            AbstractC9979u.m20293f(bArrM20234a, "getBytes(...)");
        } else {
            bArrM20234a = m20234a(source, i10, i11);
        }
        return m20233g(this, bArrM20234a, 0, 0, 6, null);
    }

    /* renamed from: e */
    public final byte[] m20238e(byte[] source, int i10, int i11) {
        AbstractC9979u.m20294g(source, "source");
        m20236c(source.length, i10, i11);
        int iM20240i = m20240i(source, i10, i11);
        byte[] bArr = new byte[iM20240i];
        if (m20239h(source, bArr, 0, i10, i11) == iM20240i) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00db, code lost:
    
        if (r7 == (-2)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        if (r7 == (-8)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        if (r4 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        if (r19.f23389d == kotlin.io.encoding.Base64.PaddingOption.f23391c) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        throw new java.lang.IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f1, code lost:
    
        if (r8 != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
    
        r3 = m20242k(r20, r6, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
    
        if (r3 < r24) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
    
        return r9 - r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        r1 = r20[r3] & com.tendcloud.tenddata.C7863av.f14384i;
        r4 = new java.lang.StringBuilder();
        r4.append("Symbol '");
        r4.append((char) r1);
        r4.append("'(");
        r1 = java.lang.Integer.toString(r1, p310qd.AbstractC10788a.m23073a(r23));
        kotlin.jvm.internal.AbstractC9979u.m20293f(r1, "toString(...)");
        r4.append(r1);
        r4.append(") at index ");
        r4.append(r3 - 1);
        r4.append(" is prohibited after the pad character");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0135, code lost:
    
        throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013d, code lost:
    
        throw new java.lang.IllegalArgumentException("The pad bits must be zeros");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0145, code lost:
    
        throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m20239h(byte[] r20, byte[] r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p227io.encoding.Base64.m20239h(byte[], byte[], int, int, int):int");
    }

    /* renamed from: i */
    public final int m20240i(byte[] source, int i10, int i11) {
        AbstractC9979u.m20294g(source, "source");
        int i12 = i11 - i10;
        if (i12 == 0) {
            return 0;
        }
        if (i12 == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i10 + ", endIndex: " + i11);
        }
        if (this.f23387b) {
            while (true) {
                if (i10 >= i11) {
                    break;
                }
                int i13 = AbstractC9024a.f21018b[source[i10] & C7863av.f14384i];
                if (i13 < 0) {
                    if (i13 == -2) {
                        i12 -= i11 - i10;
                        break;
                    }
                    i12--;
                }
                i10++;
            }
        } else if (source[i11 - 1] == 61) {
            i12 = source[i11 + (-2)] == 61 ? i12 - 2 : i12 - 1;
        }
        return (int) ((i12 * 6) / 8);
    }

    /* renamed from: j */
    public final int m20241j(byte[] bArr, int i10, int i11, int i12) {
        if (i12 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i10);
        }
        if (i12 == -6) {
            m20235b(i10);
            return i10 + 1;
        }
        if (i12 != -4) {
            if (i12 == -2) {
                return i10 + 1;
            }
            throw new IllegalStateException("Unreachable");
        }
        m20235b(i10);
        int iM20242k = m20242k(bArr, i10 + 1, i11);
        if (iM20242k != i11 && bArr[iM20242k] == 61) {
            return iM20242k + 1;
        }
        throw new IllegalArgumentException("Missing one pad character at index " + iM20242k);
    }

    /* renamed from: k */
    public final int m20242k(byte[] bArr, int i10, int i11) {
        if (!this.f23387b) {
            return i10;
        }
        while (i10 < i11) {
            if (AbstractC9024a.f21018b[bArr[i10] & C7863av.f14384i] != -1) {
                break;
            }
            i10++;
        }
        return i10;
    }

    public Base64(boolean z10, boolean z11, int i10, PaddingOption paddingOption) {
        this.f23386a = z10;
        this.f23387b = z11;
        this.f23388c = i10;
        this.f23389d = paddingOption;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f23390e = i10 / 4;
    }
}
