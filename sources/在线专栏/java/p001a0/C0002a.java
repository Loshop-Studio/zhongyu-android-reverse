package p001a0;

import android.text.SpannableStringBuilder;
import com.umeng.analytics.pro.C1892bw;
import java.util.Locale;

/* renamed from: a0.a */
/* loaded from: classes.dex */
public final class C0002a {

    /* renamed from: d */
    static final InterfaceC0004c f2d;

    /* renamed from: e */
    private static final String f3e;

    /* renamed from: f */
    private static final String f4f;

    /* renamed from: g */
    static final C0002a f5g;

    /* renamed from: h */
    static final C0002a f6h;

    /* renamed from: a */
    private final boolean f7a;

    /* renamed from: b */
    private final int f8b;

    /* renamed from: c */
    private final InterfaceC0004c f9c;

    /* renamed from: a0.a$a */
    public static final class a {

        /* renamed from: a */
        private boolean f10a;

        /* renamed from: b */
        private int f11b;

        /* renamed from: c */
        private InterfaceC0004c f12c;

        public a() {
            m18c(C0002a.m9e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C0002a m17b(boolean z3) {
            return z3 ? C0002a.f6h : C0002a.f5g;
        }

        /* renamed from: c */
        private void m18c(boolean z3) {
            this.f10a = z3;
            this.f12c = C0002a.f2d;
            this.f11b = 2;
        }

        /* renamed from: a */
        public C0002a m19a() {
            return (this.f11b == 2 && this.f12c == C0002a.f2d) ? m17b(this.f10a) : new C0002a(this.f10a, this.f11b, this.f12c);
        }
    }

    /* renamed from: a0.a$b */
    private static class b {

        /* renamed from: f */
        private static final byte[] f13f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f14a;

        /* renamed from: b */
        private final boolean f15b;

        /* renamed from: c */
        private final int f16c;

        /* renamed from: d */
        private int f17d;

        /* renamed from: e */
        private char f18e;

        static {
            for (int i4 = 0; i4 < 1792; i4++) {
                f13f[i4] = Character.getDirectionality(i4);
            }
        }

        b(CharSequence charSequence, boolean z3) {
            this.f14a = charSequence;
            this.f15b = z3;
            this.f16c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m20c(char c4) {
            return c4 < 1792 ? f13f[c4] : Character.getDirectionality(c4);
        }

        /* renamed from: f */
        private byte m21f() {
            char cCharAt;
            int i4 = this.f17d;
            do {
                int i5 = this.f17d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f14a;
                int i6 = i5 - 1;
                this.f17d = i6;
                cCharAt = charSequence.charAt(i6);
                this.f18e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f17d = i4;
            this.f18e = ';';
            return C1892bw.f8536k;
        }

        /* renamed from: g */
        private byte m22g() {
            char cCharAt;
            do {
                int i4 = this.f17d;
                if (i4 >= this.f16c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f14a;
                this.f17d = i4 + 1;
                cCharAt = charSequence.charAt(i4);
                this.f18e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        private byte m23h() {
            char cCharAt;
            int i4 = this.f17d;
            while (true) {
                int i5 = this.f17d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f14a;
                int i6 = i5 - 1;
                this.f17d = i6;
                char cCharAt2 = charSequence.charAt(i6);
                this.f18e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i7 = this.f17d;
                        if (i7 > 0) {
                            CharSequence charSequence2 = this.f14a;
                            int i8 = i7 - 1;
                            this.f17d = i8;
                            cCharAt = charSequence2.charAt(i8);
                            this.f18e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f17d = i4;
            this.f18e = '>';
            return C1892bw.f8536k;
        }

        /* renamed from: i */
        private byte m24i() {
            char cCharAt;
            int i4 = this.f17d;
            while (true) {
                int i5 = this.f17d;
                if (i5 >= this.f16c) {
                    this.f17d = i4;
                    this.f18e = '<';
                    return C1892bw.f8536k;
                }
                CharSequence charSequence = this.f14a;
                this.f17d = i5 + 1;
                char cCharAt2 = charSequence.charAt(i5);
                this.f18e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i6 = this.f17d;
                        if (i6 < this.f16c) {
                            CharSequence charSequence2 = this.f14a;
                            this.f17d = i6 + 1;
                            cCharAt = charSequence2.charAt(i6);
                            this.f18e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        /* renamed from: a */
        byte m25a() {
            char cCharAt = this.f14a.charAt(this.f17d - 1);
            this.f18e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f14a, this.f17d);
                this.f17d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f17d--;
            byte bM20c = m20c(this.f18e);
            if (!this.f15b) {
                return bM20c;
            }
            char c4 = this.f18e;
            return c4 == '>' ? m23h() : c4 == ';' ? m21f() : bM20c;
        }

        /* renamed from: b */
        byte m26b() {
            char cCharAt = this.f14a.charAt(this.f17d);
            this.f18e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f14a, this.f17d);
                this.f17d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f17d++;
            byte bM20c = m20c(this.f18e);
            if (!this.f15b) {
                return bM20c;
            }
            char c4 = this.f18e;
            return c4 == '<' ? m24i() : c4 == '&' ? m22g() : bM20c;
        }

        /* renamed from: d */
        int m27d() {
            this.f17d = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (this.f17d < this.f16c && i4 == 0) {
                byte bM26b = m26b();
                if (bM26b != 0) {
                    if (bM26b == 1 || bM26b == 2) {
                        if (i6 == 0) {
                            return 1;
                        }
                    } else if (bM26b != 9) {
                        switch (bM26b) {
                            case 14:
                            case 15:
                                i6++;
                                i5 = -1;
                                continue;
                            case 16:
                            case 17:
                                i6++;
                                i5 = 1;
                                continue;
                            case 18:
                                i6--;
                                i5 = 0;
                                continue;
                        }
                    }
                } else if (i6 == 0) {
                    return -1;
                }
                i4 = i6;
            }
            if (i4 == 0) {
                return 0;
            }
            if (i5 != 0) {
                return i5;
            }
            while (this.f17d > 0) {
                switch (m25a()) {
                    case 14:
                    case 15:
                        if (i4 == i6) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i4 == i6) {
                            return 1;
                        }
                        break;
                    case 18:
                        i6++;
                        continue;
                }
                i6--;
            }
            return 0;
        }

        /* renamed from: e */
        int m28e() {
            this.f17d = this.f16c;
            int i4 = 0;
            int i5 = 0;
            while (this.f17d > 0) {
                byte bM25a = m25a();
                if (bM25a != 0) {
                    if (bM25a == 1 || bM25a == 2) {
                        if (i4 == 0) {
                            return 1;
                        }
                        if (i5 == 0) {
                            i5 = i4;
                        }
                    } else if (bM25a != 9) {
                        switch (bM25a) {
                            case 14:
                            case 15:
                                if (i5 == i4) {
                                    return -1;
                                }
                                i4--;
                                break;
                            case 16:
                            case 17:
                                if (i5 == i4) {
                                    return 1;
                                }
                                i4--;
                                break;
                            case 18:
                                i4++;
                                break;
                            default:
                                if (i5 != 0) {
                                    break;
                                } else {
                                    i5 = i4;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i4 == 0) {
                        return -1;
                    }
                    if (i5 == 0) {
                        i5 = i4;
                    }
                }
            }
            return 0;
        }
    }

    static {
        InterfaceC0004c interfaceC0004c = C0005d.f34c;
        f2d = interfaceC0004c;
        f3e = Character.toString((char) 8206);
        f4f = Character.toString((char) 8207);
        f5g = new C0002a(false, 2, interfaceC0004c);
        f6h = new C0002a(true, 2, interfaceC0004c);
    }

    C0002a(boolean z3, int i4, InterfaceC0004c interfaceC0004c) {
        this.f7a = z3;
        this.f8b = i4;
        this.f9c = interfaceC0004c;
    }

    /* renamed from: a */
    private static int m6a(CharSequence charSequence) {
        return new b(charSequence, false).m27d();
    }

    /* renamed from: b */
    private static int m7b(CharSequence charSequence) {
        return new b(charSequence, false).m28e();
    }

    /* renamed from: c */
    public static C0002a m8c() {
        return new a().m19a();
    }

    /* renamed from: e */
    static boolean m9e(Locale locale) {
        return C0006e.m46a(locale) == 1;
    }

    /* renamed from: f */
    private String m10f(CharSequence charSequence, InterfaceC0004c interfaceC0004c) {
        boolean zMo40a = interfaceC0004c.mo40a(charSequence, 0, charSequence.length());
        return (this.f7a || !(zMo40a || m7b(charSequence) == 1)) ? this.f7a ? (!zMo40a || m7b(charSequence) == -1) ? f4f : "" : "" : f3e;
    }

    /* renamed from: g */
    private String m11g(CharSequence charSequence, InterfaceC0004c interfaceC0004c) {
        boolean zMo40a = interfaceC0004c.mo40a(charSequence, 0, charSequence.length());
        return (this.f7a || !(zMo40a || m6a(charSequence) == 1)) ? this.f7a ? (!zMo40a || m6a(charSequence) == -1) ? f4f : "" : "" : f3e;
    }

    /* renamed from: d */
    public boolean m12d() {
        return (this.f8b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence m13h(CharSequence charSequence) {
        return m14i(charSequence, this.f9c, true);
    }

    /* renamed from: i */
    public CharSequence m14i(CharSequence charSequence, InterfaceC0004c interfaceC0004c, boolean z3) {
        if (charSequence == null) {
            return null;
        }
        boolean zMo40a = interfaceC0004c.mo40a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m12d() && z3) {
            spannableStringBuilder.append((CharSequence) m11g(charSequence, zMo40a ? C0005d.f33b : C0005d.f32a));
        }
        if (zMo40a != this.f7a) {
            spannableStringBuilder.append(zMo40a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z3) {
            spannableStringBuilder.append((CharSequence) m10f(charSequence, zMo40a ? C0005d.f33b : C0005d.f32a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String m15j(String str) {
        return m16k(str, this.f9c, true);
    }

    /* renamed from: k */
    public String m16k(String str, InterfaceC0004c interfaceC0004c, boolean z3) {
        if (str == null) {
            return null;
        }
        return m14i(str, interfaceC0004c, z3).toString();
    }
}
