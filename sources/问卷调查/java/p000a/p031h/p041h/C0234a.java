package p000a.p031h.p041h;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import io.github.inflationx.calligraphy3.BuildConfig;
import java.util.Locale;
import p000a.p031h.p041h.C0237d;

/* renamed from: a.h.h.a */
/* loaded from: classes.dex */
public final class C0234a {

    /* renamed from: d */
    public static final InterfaceC0236c f1527d;

    /* renamed from: e */
    public static final String f1528e;

    /* renamed from: f */
    public static final String f1529f;

    /* renamed from: g */
    public static final C0234a f1530g;

    /* renamed from: h */
    public static final C0234a f1531h;

    /* renamed from: a */
    public final boolean f1532a;

    /* renamed from: b */
    public final int f1533b;

    /* renamed from: c */
    public final InterfaceC0236c f1534c;

    /* renamed from: a.h.h.a$a */
    public static class a {

        /* renamed from: e */
        public static final byte[] f1535e = new byte[1792];

        /* renamed from: a */
        public final CharSequence f1536a;

        /* renamed from: b */
        public final int f1537b;

        /* renamed from: c */
        public int f1538c;

        /* renamed from: d */
        public char f1539d;

        static {
            for (int i = 0; i < 1792; i++) {
                f1535e[i] = Character.getDirectionality(i);
            }
        }

        public a(CharSequence charSequence, boolean z) {
            this.f1536a = charSequence;
            this.f1537b = charSequence.length();
        }

        /* renamed from: a */
        public byte m800a() {
            char cCharAt = this.f1536a.charAt(this.f1538c - 1);
            this.f1539d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f1536a, this.f1538c);
                this.f1538c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f1538c--;
            char c2 = this.f1539d;
            return c2 < 1792 ? f1535e[c2] : Character.getDirectionality(c2);
        }
    }

    static {
        InterfaceC0236c interfaceC0236c = C0237d.f1546c;
        f1527d = interfaceC0236c;
        f1528e = Character.toString((char) 8206);
        f1529f = Character.toString((char) 8207);
        f1530g = new C0234a(false, 2, interfaceC0236c);
        f1531h = new C0234a(true, 2, interfaceC0236c);
    }

    public C0234a(boolean z, int i, InterfaceC0236c interfaceC0236c) {
        this.f1532a = z;
        this.f1533b = i;
        this.f1534c = interfaceC0236c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r3 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r4 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r0.f1538c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        switch(r0.m800a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r3 != r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        if (r3 != r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m796a(java.lang.CharSequence r9) {
        /*
            a.h.h.a$a r0 = new a.h.h.a$a
            r1 = 0
            r0.<init>(r9, r1)
            r0.f1538c = r1
            r9 = -1
            r2 = 1
            r3 = r1
            r4 = r3
            r5 = r4
        Ld:
            int r6 = r0.f1538c
            int r7 = r0.f1537b
            if (r6 >= r7) goto L70
            if (r3 != 0) goto L70
            java.lang.CharSequence r7 = r0.f1536a
            char r6 = r7.charAt(r6)
            r0.f1539d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L39
            java.lang.CharSequence r6 = r0.f1536a
            int r7 = r0.f1538c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f1538c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f1538c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L4d
        L39:
            int r6 = r0.f1538c
            int r6 = r6 + r2
            r0.f1538c = r6
            char r6 = r0.f1539d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L49
            byte[] r7 = p000a.p031h.p041h.C0234a.a.f1535e
            r6 = r7[r6]
            goto L4d
        L49:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L4d:
            if (r6 == 0) goto L6b
            if (r6 == r2) goto L68
            r7 = 2
            if (r6 == r7) goto L68
            r7 = 9
            if (r6 == r7) goto Ld
            switch(r6) {
                case 14: goto L64;
                case 15: goto L64;
                case 16: goto L60;
                case 17: goto L60;
                case 18: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L6e
        L5c:
            int r5 = r5 + (-1)
            r4 = r1
            goto Ld
        L60:
            int r5 = r5 + 1
            r4 = r2
            goto Ld
        L64:
            int r5 = r5 + 1
            r4 = r9
            goto Ld
        L68:
            if (r5 != 0) goto L6e
            goto L88
        L6b:
            if (r5 != 0) goto L6e
            goto L8c
        L6e:
            r3 = r5
            goto Ld
        L70:
            if (r3 != 0) goto L73
            goto L91
        L73:
            if (r4 == 0) goto L77
            r1 = r4
            goto L91
        L77:
            int r4 = r0.f1538c
            if (r4 <= 0) goto L91
            byte r4 = r0.m800a()
            switch(r4) {
                case 14: goto L8a;
                case 15: goto L8a;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r5 = r5 + 1
            goto L77
        L86:
            if (r3 != r5) goto L8e
        L88:
            r1 = r2
            goto L91
        L8a:
            if (r3 != r5) goto L8e
        L8c:
            r1 = r9
            goto L91
        L8e:
            int r5 = r5 + (-1)
            goto L77
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p041h.C0234a.m796a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        return 1;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m797b(java.lang.CharSequence r6) {
        /*
            a.h.h.a$a r0 = new a.h.h.a$a
            r1 = 0
            r0.<init>(r6, r1)
            int r6 = r0.f1537b
            r0.f1538c = r6
            r6 = r1
        Lb:
            r2 = r6
        Lc:
            int r3 = r0.f1538c
            r4 = 1
            if (r3 <= 0) goto L41
            byte r3 = r0.m800a()
            if (r3 == 0) goto L39
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r6 != 0) goto Lc
            goto L3f
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            if (r6 != r2) goto L2f
            goto L34
        L2c:
            if (r6 != r2) goto L2f
            goto L3b
        L2f:
            int r2 = r2 + (-1)
            goto Lc
        L32:
            if (r2 != 0) goto L36
        L34:
            r1 = r4
            goto L41
        L36:
            if (r6 != 0) goto Lc
            goto L3f
        L39:
            if (r2 != 0) goto L3d
        L3b:
            r1 = -1
            goto L41
        L3d:
            if (r6 != 0) goto Lc
        L3f:
            r6 = r2
            goto Lb
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p041h.C0234a.m797b(java.lang.CharSequence):int");
    }

    /* renamed from: c */
    public static C0234a m798c() {
        Locale locale = Locale.getDefault();
        Locale locale2 = C0238e.f1551a;
        boolean z = TextUtils.getLayoutDirectionFromLocale(locale) == 1;
        InterfaceC0236c interfaceC0236c = f1527d;
        return interfaceC0236c == f1527d ? z ? f1531h : f1530g : new C0234a(z, 2, interfaceC0236c);
    }

    /* renamed from: d */
    public CharSequence m799d(CharSequence charSequence, InterfaceC0236c interfaceC0236c, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zM804b = ((C0237d.c) interfaceC0236c).m804b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z2 = (this.f1533b & 2) != 0;
        String str = BuildConfig.FLAVOR;
        if (z2 && z) {
            boolean zM804b2 = ((C0237d.c) (zM804b ? C0237d.f1545b : C0237d.f1544a)).m804b(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((this.f1532a || !(zM804b2 || m796a(charSequence) == 1)) ? (!this.f1532a || (zM804b2 && m796a(charSequence) != -1)) ? BuildConfig.FLAVOR : f1529f : f1528e));
        }
        if (zM804b != this.f1532a) {
            spannableStringBuilder.append(zM804b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean zM804b3 = ((C0237d.c) (zM804b ? C0237d.f1545b : C0237d.f1544a)).m804b(charSequence, 0, charSequence.length());
            if (!this.f1532a && (zM804b3 || m797b(charSequence) == 1)) {
                str = f1528e;
            } else if (this.f1532a && (!zM804b3 || m797b(charSequence) == -1)) {
                str = f1529f;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        return spannableStringBuilder;
    }
}
