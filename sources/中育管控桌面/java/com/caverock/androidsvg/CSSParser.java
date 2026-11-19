package com.caverock.androidsvg;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.time.DurationKt;
import p040d1.C6215a;

/* loaded from: classes3.dex */
public class CSSParser {

    /* renamed from: a */
    public MediaType f2665a;

    /* renamed from: b */
    public Source f2666b;

    /* renamed from: c */
    public boolean f2667c = false;

    public enum AttribOp {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    public enum Combinator {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    public enum MediaType {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    public enum PseudoClassIdents {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;


        /* renamed from: z */
        public static final Map f2715z = new HashMap();

        static {
            for (PseudoClassIdents pseudoClassIdents : values()) {
                if (pseudoClassIdents != UNSUPPORTED) {
                    f2715z.put(pseudoClassIdents.name().replace('_', '-'), pseudoClassIdents);
                }
            }
        }

        /* renamed from: a */
        public static PseudoClassIdents m2946a(String str) {
            PseudoClassIdents pseudoClassIdents = (PseudoClassIdents) f2715z.get(str);
            return pseudoClassIdents != null ? pseudoClassIdents : UNSUPPORTED;
        }
    }

    public enum Source {
        Document,
        RenderOptions
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$a */
    public static /* synthetic */ class C4744a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2719a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2720b;

        static {
            int[] iArr = new int[PseudoClassIdents.values().length];
            f2720b = iArr;
            try {
                iArr[PseudoClassIdents.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2720b[PseudoClassIdents.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2720b[PseudoClassIdents.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2720b[PseudoClassIdents.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2720b[PseudoClassIdents.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2720b[PseudoClassIdents.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2720b[PseudoClassIdents.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2720b[PseudoClassIdents.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2720b[PseudoClassIdents.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2720b[PseudoClassIdents.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2720b[PseudoClassIdents.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2720b[PseudoClassIdents.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2720b[PseudoClassIdents.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2720b[PseudoClassIdents.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2720b[PseudoClassIdents.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2720b[PseudoClassIdents.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2720b[PseudoClassIdents.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2720b[PseudoClassIdents.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f2720b[PseudoClassIdents.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f2720b[PseudoClassIdents.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f2720b[PseudoClassIdents.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f2720b[PseudoClassIdents.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f2720b[PseudoClassIdents.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f2720b[PseudoClassIdents.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[AttribOp.values().length];
            f2719a = iArr2;
            try {
                iArr2[AttribOp.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f2719a[AttribOp.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f2719a[AttribOp.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$b */
    public static class C4745b {

        /* renamed from: a */
        public final String f2721a;

        /* renamed from: b */
        public final AttribOp f2722b;

        /* renamed from: c */
        public final String f2723c;

        public C4745b(String str, AttribOp attribOp, String str2) {
            this.f2721a = str;
            this.f2722b = attribOp;
            this.f2723c = str2;
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$c */
    public static class C4746c extends SVGParser.C4821g {

        /* renamed from: com.caverock.androidsvg.CSSParser$c$a */
        public static class a {

            /* renamed from: a */
            public int f2724a;

            /* renamed from: b */
            public int f2725b;

            public a(int i6, int i7) {
                this.f2724a = i6;
                this.f2725b = i7;
            }
        }

        public C4746c(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        /* renamed from: C */
        public final int m2948C(int i6) {
            if (i6 >= 48 && i6 <= 57) {
                return i6 - 48;
            }
            if (i6 >= 65 && i6 <= 70) {
                return i6 - 55;
            }
            if (i6 < 97 || i6 > 102) {
                return -1;
            }
            return i6 - 87;
        }

        /* renamed from: D */
        public final a m2949D() {
            C6215a c6215aM6320c;
            a aVar;
            if (m3165h()) {
                return null;
            }
            int i6 = this.f3140b;
            if (!m3163f('(')) {
                return null;
            }
            m3157A();
            int i7 = 1;
            if (m3164g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (m3164g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i8 = (!m3163f('+') && m3163f('-')) ? -1 : 1;
                    C6215a c6215aM6320c2 = C6215a.m6320c(this.f3139a, this.f3140b, this.f3141c, false);
                    if (c6215aM6320c2 != null) {
                        this.f3140b = c6215aM6320c2.m6321a();
                    }
                    if (m3163f('n') || m3163f('N')) {
                        if (c6215aM6320c2 == null) {
                            c6215aM6320c2 = new C6215a(1L, this.f3140b);
                        }
                        m3157A();
                        boolean zM3163f = m3163f('+');
                        if (!zM3163f && (zM3163f = m3163f('-'))) {
                            i7 = -1;
                        }
                        if (zM3163f) {
                            m3157A();
                            c6215aM6320c = C6215a.m6320c(this.f3139a, this.f3140b, this.f3141c, false);
                            if (c6215aM6320c == null) {
                                this.f3140b = i6;
                                return null;
                            }
                            this.f3140b = c6215aM6320c.m6321a();
                            int i9 = i7;
                            i7 = i8;
                            i8 = i9;
                        } else {
                            int i10 = i7;
                            i7 = i8;
                            i8 = i10;
                            c6215aM6320c = null;
                        }
                    } else {
                        c6215aM6320c = c6215aM6320c2;
                        c6215aM6320c2 = null;
                    }
                    aVar = new a(c6215aM6320c2 == null ? 0 : i7 * c6215aM6320c2.m6322d(), c6215aM6320c != null ? i8 * c6215aM6320c.m6322d() : 0);
                }
            }
            m3157A();
            if (m3163f(')')) {
                return aVar;
            }
            this.f3140b = i6;
            return null;
        }

        /* renamed from: E */
        public final String m2950E() {
            if (m3165h()) {
                return null;
            }
            String strM3174q = m3174q();
            return strM3174q != null ? strM3174q : m2953H();
        }

        /* renamed from: F */
        public String m2951F() {
            int iM2948C;
            if (m3165h()) {
                return null;
            }
            char cCharAt = this.f3139a.charAt(this.f3140b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.f3140b++;
            int iIntValue = m3169l().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = m3169l().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = m3169l().intValue();
                        } else {
                            int iM2948C2 = m2948C(iIntValue);
                            if (iM2948C2 != -1) {
                                for (int i6 = 1; i6 <= 5 && (iM2948C = m2948C((iIntValue = m3169l().intValue()))) != -1; i6++) {
                                    iM2948C2 = (iM2948C2 * 16) + iM2948C;
                                }
                                sb.append((char) iM2948C2);
                            }
                        }
                    }
                }
                sb.append((char) iIntValue);
                iIntValue = m3169l().intValue();
            }
            return sb.toString();
        }

        /* renamed from: G */
        public final List m2952G() {
            if (m3165h()) {
                return null;
            }
            int i6 = this.f3140b;
            if (!m3163f('(')) {
                return null;
            }
            m3157A();
            ArrayList arrayList = null;
            do {
                String strM2953H = m2953H();
                if (strM2953H == null) {
                    this.f3140b = i6;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strM2953H);
                m3157A();
            } while (m3183z());
            if (m3163f(')')) {
                return arrayList;
            }
            this.f3140b = i6;
            return null;
        }

        /* renamed from: H */
        public String m2953H() {
            int iM2961P = m2961P();
            int i6 = this.f3140b;
            if (iM2961P == i6) {
                return null;
            }
            String strSubstring = this.f3139a.substring(i6, iM2961P);
            this.f3140b = iM2961P;
            return strSubstring;
        }

        /* renamed from: I */
        public String m2954I() {
            char cCharAt;
            int iM2948C;
            StringBuilder sb = new StringBuilder();
            while (!m3165h() && (cCharAt = this.f3139a.charAt(this.f3140b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !m3168k(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.f3140b++;
                if (cCharAt == '\\') {
                    if (!m3165h()) {
                        String str = this.f3139a;
                        int i6 = this.f3140b;
                        this.f3140b = i6 + 1;
                        cCharAt = str.charAt(i6);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iM2948C2 = m2948C(cCharAt);
                            if (iM2948C2 != -1) {
                                for (int i7 = 1; i7 <= 5 && !m3165h() && (iM2948C = m2948C(this.f3139a.charAt(this.f3140b))) != -1; i7++) {
                                    this.f3140b++;
                                    iM2948C2 = (iM2948C2 * 16) + iM2948C;
                                }
                                sb.append((char) iM2948C2);
                            }
                        }
                    }
                }
                sb.append(cCharAt);
            }
            if (sb.length() == 0) {
                return null;
            }
            return sb.toString();
        }

        /* renamed from: J */
        public String m2955J() {
            if (m3165h()) {
                return null;
            }
            int i6 = this.f3140b;
            int iCharAt = this.f3139a.charAt(i6);
            int i7 = i6;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !m3167j(iCharAt)) {
                if (!m3168k(iCharAt)) {
                    i7 = this.f3140b + 1;
                }
                iCharAt = m3158a();
            }
            if (this.f3140b > i6) {
                return this.f3139a.substring(i6, i7);
            }
            this.f3140b = i6;
            return null;
        }

        /* renamed from: K */
        public final List m2956K() {
            List list;
            List list2;
            if (m3165h()) {
                return null;
            }
            int i6 = this.f3140b;
            if (!m3163f('(')) {
                return null;
            }
            m3157A();
            List listM2957L = m2957L();
            if (listM2957L == null) {
                this.f3140b = i6;
                return null;
            }
            if (!m3163f(')')) {
                this.f3140b = i6;
                return null;
            }
            Iterator it = listM2957L.iterator();
            while (it.hasNext() && (list = ((C4758o) it.next()).f2740a) != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext() && (list2 = ((C4759p) it2.next()).f2745d) != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((InterfaceC4747d) it3.next()) instanceof C4750g) {
                            return null;
                        }
                    }
                }
            }
            return listM2957L;
        }

        /* renamed from: L */
        public final List m2957L() {
            C4744a c4744a = null;
            if (m3165h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            C4758o c4758o = new C4758o(c4744a);
            while (!m3165h() && m2958M(c4758o)) {
                if (m3183z()) {
                    arrayList.add(c4758o);
                    c4758o = new C4758o(c4744a);
                }
            }
            if (!c4758o.m2975f()) {
                arrayList.add(c4758o);
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* renamed from: M */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m2958M(com.caverock.androidsvg.CSSParser.C4758o r11) throws com.caverock.androidsvg.CSSParseException {
            /*
                Method dump skipped, instructions count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.C4746c.m2958M(com.caverock.androidsvg.CSSParser$o):boolean");
        }

        /* renamed from: N */
        public String m2959N() {
            if (m3165h()) {
                return null;
            }
            int i6 = this.f3140b;
            if (!m3164g("url(")) {
                return null;
            }
            m3157A();
            String strM2951F = m2951F();
            if (strM2951F == null) {
                strM2951F = m2954I();
            }
            if (strM2951F == null) {
                this.f3140b = i6;
                return null;
            }
            m3157A();
            if (m3165h() || m3164g(")")) {
                return strM2951F;
            }
            this.f3140b = i6;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: O */
        public final void m2960O(C4758o c4758o, C4759p c4759p) throws CSSParseException {
            InterfaceC4747d c4752i;
            C4748e c4748e;
            C4748e c4748e2;
            String strM2953H = m2953H();
            if (strM2953H == null) {
                throw new CSSParseException("Invalid pseudo class");
            }
            PseudoClassIdents pseudoClassIdentsM2946a = PseudoClassIdents.m2946a(strM2953H);
            C4744a c4744a = null;
            switch (C4744a.f2720b[pseudoClassIdentsM2946a.ordinal()]) {
                case 1:
                    C4748e c4748e3 = new C4748e(0, 1, true, false, null);
                    c4758o.m2971b();
                    c4748e2 = c4748e3;
                    c4752i = c4748e2;
                    c4759p.m2978b(c4752i);
                    return;
                case 2:
                    C4748e c4748e4 = new C4748e(0, 1, false, false, null);
                    c4758o.m2971b();
                    c4752i = c4748e4;
                    c4759p.m2978b(c4752i);
                    return;
                case 3:
                    c4752i = new C4752i(false, null);
                    c4758o.m2971b();
                    c4759p.m2978b(c4752i);
                    return;
                case 4:
                    c4748e = new C4748e(0, 1, true, true, c4759p.f2743b);
                    c4758o.m2971b();
                    c4752i = c4748e;
                    c4759p.m2978b(c4752i);
                    return;
                case 5:
                    C4748e c4748e5 = new C4748e(0, 1, false, true, c4759p.f2743b);
                    c4758o.m2971b();
                    c4752i = c4748e5;
                    c4759p.m2978b(c4752i);
                    return;
                case 6:
                    c4752i = new C4752i(true, c4759p.f2743b);
                    c4758o.m2971b();
                    c4759p.m2978b(c4752i);
                    return;
                case 7:
                    c4752i = new C4753j(c4744a);
                    c4758o.m2971b();
                    c4759p.m2978b(c4752i);
                    return;
                case 8:
                    c4752i = new C4749f(c4744a);
                    c4758o.m2971b();
                    c4759p.m2978b(c4752i);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z6 = pseudoClassIdentsM2946a == PseudoClassIdents.nth_child || pseudoClassIdentsM2946a == PseudoClassIdents.nth_of_type;
                    boolean z7 = pseudoClassIdentsM2946a == PseudoClassIdents.nth_of_type || pseudoClassIdentsM2946a == PseudoClassIdents.nth_last_of_type;
                    a aVarM2949D = m2949D();
                    if (aVarM2949D == null) {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + strM2953H);
                    }
                    c4748e = new C4748e(aVarM2949D.f2724a, aVarM2949D.f2725b, z6, z7, c4759p.f2743b);
                    c4758o.m2971b();
                    c4752i = c4748e;
                    c4759p.m2978b(c4752i);
                    return;
                case 13:
                    List listM2956K = m2956K();
                    if (listM2956K == null) {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + strM2953H);
                    }
                    C4750g c4750g = new C4750g(listM2956K);
                    c4758o.f2741b = c4750g.m2963b();
                    c4748e2 = c4750g;
                    c4752i = c4748e2;
                    c4759p.m2978b(c4752i);
                    return;
                case 14:
                    c4752i = new C4754k(c4744a);
                    c4758o.m2971b();
                    c4759p.m2978b(c4752i);
                    return;
                case 15:
                    m2952G();
                    c4752i = new C4751h(strM2953H);
                    c4758o.m2971b();
                    c4759p.m2978b(c4752i);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    c4752i = new C4751h(strM2953H);
                    c4758o.m2971b();
                    c4759p.m2978b(c4752i);
                    return;
                default:
                    throw new CSSParseException("Unsupported pseudo class: " + strM2953H);
            }
        }

        /* renamed from: P */
        public final int m2961P() {
            int i6;
            if (m3165h()) {
                return this.f3140b;
            }
            int i7 = this.f3140b;
            int iCharAt = this.f3139a.charAt(i7);
            if (iCharAt == 45) {
                iCharAt = m3158a();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i6 = i7;
            } else {
                int iM3158a = m3158a();
                while (true) {
                    if ((iM3158a < 65 || iM3158a > 90) && ((iM3158a < 97 || iM3158a > 122) && !((iM3158a >= 48 && iM3158a <= 57) || iM3158a == 45 || iM3158a == 95))) {
                        break;
                    }
                    iM3158a = m3158a();
                }
                i6 = this.f3140b;
            }
            this.f3140b = i7;
            return i6;
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$d */
    public interface InterfaceC4747d {
        /* renamed from: a */
        boolean mo2962a(C4756m c4756m, SVG.AbstractC4782j0 abstractC4782j0);
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$e */
    public static class C4748e implements InterfaceC4747d {

        /* renamed from: a */
        public int f2726a;

        /* renamed from: b */
        public int f2727b;

        /* renamed from: c */
        public boolean f2728c;

        /* renamed from: d */
        public boolean f2729d;

        /* renamed from: e */
        public String f2730e;

        public C4748e(int i6, int i7, boolean z6, boolean z7, String str) {
            this.f2726a = i6;
            this.f2727b = i7;
            this.f2728c = z6;
            this.f2729d = z7;
            this.f2730e = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.InterfaceC4747d
        /* renamed from: a */
        public boolean mo2962a(C4756m c4756m, SVG.AbstractC4782j0 abstractC4782j0) {
            int i6;
            int i7;
            String strMo3000n = (this.f2729d && this.f2730e == null) ? abstractC4782j0.mo3000n() : this.f2730e;
            SVG.InterfaceC4778h0 interfaceC4778h0 = abstractC4782j0.f2935b;
            if (interfaceC4778h0 != null) {
                Iterator it = interfaceC4778h0.getChildren().iterator();
                i6 = 0;
                i7 = 0;
                while (it.hasNext()) {
                    SVG.AbstractC4782j0 abstractC4782j02 = (SVG.AbstractC4782j0) ((SVG.C4786l0) it.next());
                    if (abstractC4782j02 == abstractC4782j0) {
                        i6 = i7;
                    }
                    if (strMo3000n == null || abstractC4782j02.mo3000n().equals(strMo3000n)) {
                        i7++;
                    }
                }
            } else {
                i6 = 0;
                i7 = 1;
            }
            int i8 = this.f2728c ? i6 + 1 : i7 - i6;
            int i9 = this.f2726a;
            if (i9 == 0) {
                return i8 == this.f2727b;
            }
            int i10 = this.f2727b;
            return (i8 - i10) % i9 == 0 && (Integer.signum(i8 - i10) == 0 || Integer.signum(i8 - this.f2727b) == Integer.signum(this.f2726a));
        }

        public String toString() {
            String str = this.f2728c ? "" : "last-";
            return this.f2729d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f2726a), Integer.valueOf(this.f2727b), this.f2730e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f2726a), Integer.valueOf(this.f2727b));
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$f */
    public static class C4749f implements InterfaceC4747d {
        public C4749f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.CSSParser.InterfaceC4747d
        /* renamed from: a */
        public boolean mo2962a(C4756m c4756m, SVG.AbstractC4782j0 abstractC4782j0) {
            return !(abstractC4782j0 instanceof SVG.InterfaceC4778h0) || ((SVG.InterfaceC4778h0) abstractC4782j0).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        public /* synthetic */ C4749f(C4744a c4744a) {
            this();
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$g */
    public static class C4750g implements InterfaceC4747d {

        /* renamed from: a */
        public List f2731a;

        public C4750g(List list) {
            this.f2731a = list;
        }

        @Override // com.caverock.androidsvg.CSSParser.InterfaceC4747d
        /* renamed from: a */
        public boolean mo2962a(C4756m c4756m, SVG.AbstractC4782j0 abstractC4782j0) {
            Iterator it = this.f2731a.iterator();
            while (it.hasNext()) {
                if (CSSParser.m2936l(c4756m, (C4758o) it.next(), abstractC4782j0)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public int m2963b() {
            Iterator it = this.f2731a.iterator();
            int i6 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i7 = ((C4758o) it.next()).f2741b;
                if (i7 > i6) {
                    i6 = i7;
                }
            }
            return i6;
        }

        public String toString() {
            return "not(" + this.f2731a + ")";
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$h */
    public static class C4751h implements InterfaceC4747d {

        /* renamed from: a */
        public String f2732a;

        public C4751h(String str) {
            this.f2732a = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.InterfaceC4747d
        /* renamed from: a */
        public boolean mo2962a(C4756m c4756m, SVG.AbstractC4782j0 abstractC4782j0) {
            return false;
        }

        public String toString() {
            return this.f2732a;
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$i */
    public static class C4752i implements InterfaceC4747d {

        /* renamed from: a */
        public boolean f2733a;

        /* renamed from: b */
        public String f2734b;

        public C4752i(boolean z6, String str) {
            this.f2733a = z6;
            this.f2734b = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.InterfaceC4747d
        /* renamed from: a */
        public boolean mo2962a(C4756m c4756m, SVG.AbstractC4782j0 abstractC4782j0) {
            int i6;
            String strMo3000n = (this.f2733a && this.f2734b == null) ? abstractC4782j0.mo3000n() : this.f2734b;
            SVG.InterfaceC4778h0 interfaceC4778h0 = abstractC4782j0.f2935b;
            if (interfaceC4778h0 != null) {
                Iterator it = interfaceC4778h0.getChildren().iterator();
                i6 = 0;
                while (it.hasNext()) {
                    SVG.AbstractC4782j0 abstractC4782j02 = (SVG.AbstractC4782j0) ((SVG.C4786l0) it.next());
                    if (strMo3000n == null || abstractC4782j02.mo3000n().equals(strMo3000n)) {
                        i6++;
                    }
                }
            } else {
                i6 = 1;
            }
            return i6 == 1;
        }

        public String toString() {
            return this.f2733a ? String.format("only-of-type <%s>", this.f2734b) : String.format("only-child", new Object[0]);
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$j */
    public static class C4753j implements InterfaceC4747d {
        public C4753j() {
        }

        @Override // com.caverock.androidsvg.CSSParser.InterfaceC4747d
        /* renamed from: a */
        public boolean mo2962a(C4756m c4756m, SVG.AbstractC4782j0 abstractC4782j0) {
            return abstractC4782j0.f2935b == null;
        }

        public String toString() {
            return "root";
        }

        public /* synthetic */ C4753j(C4744a c4744a) {
            this();
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$k */
    public static class C4754k implements InterfaceC4747d {
        public C4754k() {
        }

        @Override // com.caverock.androidsvg.CSSParser.InterfaceC4747d
        /* renamed from: a */
        public boolean mo2962a(C4756m c4756m, SVG.AbstractC4782j0 abstractC4782j0) {
            return c4756m != null && abstractC4782j0 == c4756m.f2738a;
        }

        public String toString() {
            return TypedValues.AttributesType.S_TARGET;
        }

        public /* synthetic */ C4754k(C4744a c4744a) {
            this();
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$l */
    public static class C4755l {

        /* renamed from: a */
        public C4758o f2735a;

        /* renamed from: b */
        public SVG.Style f2736b;

        /* renamed from: c */
        public Source f2737c;

        public C4755l(C4758o c4758o, SVG.Style style, Source source) {
            this.f2735a = c4758o;
            this.f2736b = style;
            this.f2737c = source;
        }

        public String toString() {
            return String.valueOf(this.f2735a) + " {...} (src=" + this.f2737c + ")";
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$m */
    public static class C4756m {

        /* renamed from: a */
        public SVG.AbstractC4782j0 f2738a;

        public String toString() {
            SVG.AbstractC4782j0 abstractC4782j0 = this.f2738a;
            return abstractC4782j0 != null ? String.format("<%s id=\"%s\">", abstractC4782j0.mo3000n(), this.f2738a.f2923c) : "";
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$n */
    public static class C4757n {

        /* renamed from: a */
        public List f2739a = null;

        /* renamed from: a */
        public void m2964a(C4755l c4755l) {
            if (this.f2739a == null) {
                this.f2739a = new ArrayList();
            }
            for (int i6 = 0; i6 < this.f2739a.size(); i6++) {
                if (((C4755l) this.f2739a.get(i6)).f2735a.f2741b > c4755l.f2735a.f2741b) {
                    this.f2739a.add(i6, c4755l);
                    return;
                }
            }
            this.f2739a.add(c4755l);
        }

        /* renamed from: b */
        public void m2965b(C4757n c4757n) {
            if (c4757n.f2739a == null) {
                return;
            }
            if (this.f2739a == null) {
                this.f2739a = new ArrayList(c4757n.f2739a.size());
            }
            Iterator it = c4757n.f2739a.iterator();
            while (it.hasNext()) {
                m2964a((C4755l) it.next());
            }
        }

        /* renamed from: c */
        public List m2966c() {
            return this.f2739a;
        }

        /* renamed from: d */
        public boolean m2967d() {
            List list = this.f2739a;
            return list == null || list.isEmpty();
        }

        /* renamed from: e */
        public void m2968e(Source source) {
            List list = this.f2739a;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C4755l) it.next()).f2737c == source) {
                    it.remove();
                }
            }
        }

        /* renamed from: f */
        public int m2969f() {
            List list = this.f2739a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f2739a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f2739a.iterator();
            while (it.hasNext()) {
                sb.append(((C4755l) it.next()).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$p */
    public static class C4759p {

        /* renamed from: a */
        public Combinator f2742a;

        /* renamed from: b */
        public String f2743b;

        /* renamed from: c */
        public List f2744c = null;

        /* renamed from: d */
        public List f2745d = null;

        public C4759p(Combinator combinator, String str) {
            this.f2742a = null;
            this.f2743b = null;
            this.f2742a = combinator == null ? Combinator.DESCENDANT : combinator;
            this.f2743b = str;
        }

        /* renamed from: a */
        public void m2977a(String str, AttribOp attribOp, String str2) {
            if (this.f2744c == null) {
                this.f2744c = new ArrayList();
            }
            this.f2744c.add(new C4745b(str, attribOp, str2));
        }

        /* renamed from: b */
        public void m2978b(InterfaceC4747d interfaceC4747d) {
            if (this.f2745d == null) {
                this.f2745d = new ArrayList();
            }
            this.f2745d.add(interfaceC4747d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Combinator combinator = this.f2742a;
            if (combinator == Combinator.CHILD) {
                sb.append("> ");
            } else if (combinator == Combinator.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.f2743b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            List<C4745b> list = this.f2744c;
            if (list != null) {
                for (C4745b c4745b : list) {
                    sb.append('[');
                    sb.append(c4745b.f2721a);
                    int i6 = C4744a.f2719a[c4745b.f2722b.ordinal()];
                    if (i6 == 1) {
                        sb.append('=');
                        sb.append(c4745b.f2723c);
                    } else if (i6 == 2) {
                        sb.append("~=");
                        sb.append(c4745b.f2723c);
                    } else if (i6 == 3) {
                        sb.append("|=");
                        sb.append(c4745b.f2723c);
                    }
                    sb.append(']');
                }
            }
            List<InterfaceC4747d> list2 = this.f2745d;
            if (list2 != null) {
                for (InterfaceC4747d interfaceC4747d : list2) {
                    sb.append(':');
                    sb.append(interfaceC4747d);
                }
            }
            return sb.toString();
        }
    }

    public CSSParser(MediaType mediaType, Source source) {
        this.f2665a = mediaType;
        this.f2666b = source;
    }

    /* renamed from: a */
    public static int m2930a(List list, int i6, SVG.AbstractC4782j0 abstractC4782j0) {
        int i7 = 0;
        if (i6 < 0) {
            return 0;
        }
        Object obj = list.get(i6);
        SVG.InterfaceC4778h0 interfaceC4778h0 = abstractC4782j0.f2935b;
        if (obj != interfaceC4778h0) {
            return -1;
        }
        Iterator it = interfaceC4778h0.getChildren().iterator();
        while (it.hasNext()) {
            if (((SVG.C4786l0) it.next()) == abstractC4782j0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m2931b(String str, MediaType mediaType) {
        C4746c c4746c = new C4746c(str);
        c4746c.m3157A();
        return m2932c(m2934h(c4746c), mediaType);
    }

    /* renamed from: c */
    public static boolean m2932c(List list, MediaType mediaType) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaType mediaType2 = (MediaType) it.next();
            if (mediaType2 == MediaType.all || mediaType2 == mediaType) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static List m2933f(String str) {
        C4746c c4746c = new C4746c(str);
        ArrayList arrayList = null;
        while (!c4746c.m3165h()) {
            String strM3175r = c4746c.m3175r();
            if (strM3175r != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strM3175r);
                c4746c.m3157A();
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static List m2934h(C4746c c4746c) {
        String strM3180w;
        ArrayList arrayList = new ArrayList();
        while (!c4746c.m3165h() && (strM3180w = c4746c.m3180w()) != null) {
            try {
                arrayList.add(MediaType.valueOf(strM3180w));
            } catch (IllegalArgumentException unused) {
            }
            if (!c4746c.m3183z()) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static boolean m2935k(C4756m c4756m, C4758o c4758o, int i6, List list, int i7, SVG.AbstractC4782j0 abstractC4782j0) {
        C4759p c4759pM2974e = c4758o.m2974e(i6);
        if (!m2938n(c4756m, c4759pM2974e, list, i7, abstractC4782j0)) {
            return false;
        }
        Combinator combinator = c4759pM2974e.f2742a;
        if (combinator == Combinator.DESCENDANT) {
            if (i6 == 0) {
                return true;
            }
            while (i7 >= 0) {
                if (m2937m(c4756m, c4758o, i6 - 1, list, i7)) {
                    return true;
                }
                i7--;
            }
            return false;
        }
        if (combinator == Combinator.CHILD) {
            return m2937m(c4756m, c4758o, i6 - 1, list, i7);
        }
        int iM2930a = m2930a(list, i7, abstractC4782j0);
        if (iM2930a <= 0) {
            return false;
        }
        return m2935k(c4756m, c4758o, i6 - 1, list, i7, (SVG.AbstractC4782j0) abstractC4782j0.f2935b.getChildren().get(iM2930a - 1));
    }

    /* renamed from: l */
    public static boolean m2936l(C4756m c4756m, C4758o c4758o, SVG.AbstractC4782j0 abstractC4782j0) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = abstractC4782j0.f2935b; obj != null; obj = ((SVG.C4786l0) obj).f2935b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return c4758o.m2976g() == 1 ? m2938n(c4756m, c4758o.m2974e(0), arrayList, size, abstractC4782j0) : m2935k(c4756m, c4758o, c4758o.m2976g() - 1, arrayList, size, abstractC4782j0);
    }

    /* renamed from: m */
    public static boolean m2937m(C4756m c4756m, C4758o c4758o, int i6, List list, int i7) {
        C4759p c4759pM2974e = c4758o.m2974e(i6);
        SVG.AbstractC4782j0 abstractC4782j0 = (SVG.AbstractC4782j0) list.get(i7);
        if (!m2938n(c4756m, c4759pM2974e, list, i7, abstractC4782j0)) {
            return false;
        }
        Combinator combinator = c4759pM2974e.f2742a;
        if (combinator == Combinator.DESCENDANT) {
            if (i6 == 0) {
                return true;
            }
            while (i7 > 0) {
                i7--;
                if (m2937m(c4756m, c4758o, i6 - 1, list, i7)) {
                    return true;
                }
            }
            return false;
        }
        if (combinator == Combinator.CHILD) {
            return m2937m(c4756m, c4758o, i6 - 1, list, i7 - 1);
        }
        int iM2930a = m2930a(list, i7, abstractC4782j0);
        if (iM2930a <= 0) {
            return false;
        }
        return m2935k(c4756m, c4758o, i6 - 1, list, i7, (SVG.AbstractC4782j0) abstractC4782j0.f2935b.getChildren().get(iM2930a - 1));
    }

    /* renamed from: n */
    public static boolean m2938n(C4756m c4756m, C4759p c4759p, List list, int i6, SVG.AbstractC4782j0 abstractC4782j0) {
        List list2;
        String str = c4759p.f2743b;
        if (str != null && !str.equals(abstractC4782j0.mo3000n().toLowerCase(Locale.US))) {
            return false;
        }
        List<C4745b> list3 = c4759p.f2744c;
        if (list3 != null) {
            for (C4745b c4745b : list3) {
                String str2 = c4745b.f2721a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!c4745b.f2723c.equals(abstractC4782j0.f2923c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = abstractC4782j0.f2927g) == null || !list2.contains(c4745b.f2723c)) {
                    return false;
                }
            }
        }
        List list4 = c4759p.f2745d;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC4747d) it.next()).mo2962a(c4756m, abstractC4782j0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static void m2939p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    /* renamed from: d */
    public C4757n m2940d(String str) {
        C4746c c4746c = new C4746c(str);
        c4746c.m3157A();
        return m2944j(c4746c);
    }

    /* renamed from: e */
    public final void m2941e(C4757n c4757n, C4746c c4746c) throws CSSParseException {
        String strM2953H = c4746c.m2953H();
        c4746c.m3157A();
        if (strM2953H == null) {
            throw new CSSParseException("Invalid '@' rule");
        }
        if (!this.f2667c && strM2953H.equals("media")) {
            List listM2934h = m2934h(c4746c);
            if (!c4746c.m3163f('{')) {
                throw new CSSParseException("Invalid @media rule: missing rule set");
            }
            c4746c.m3157A();
            if (m2932c(listM2934h, this.f2665a)) {
                this.f2667c = true;
                c4757n.m2965b(m2944j(c4746c));
                this.f2667c = false;
            } else {
                m2944j(c4746c);
            }
            if (!c4746c.m3165h() && !c4746c.m3163f('}')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f2667c || !strM2953H.equals("import")) {
            m2939p("Ignoring @%s rule", strM2953H);
            m2945o(c4746c);
        } else {
            String strM2959N = c4746c.m2959N();
            if (strM2959N == null) {
                strM2959N = c4746c.m2951F();
            }
            if (strM2959N == null) {
                throw new CSSParseException("Invalid @import rule: expected string or url()");
            }
            c4746c.m3157A();
            m2934h(c4746c);
            if (!c4746c.m3165h() && !c4746c.m3163f(';')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
            SVG.m2981g();
        }
        c4746c.m3157A();
    }

    /* renamed from: g */
    public final SVG.Style m2942g(C4746c c4746c) throws CSSParseException {
        SVG.Style style = new SVG.Style();
        do {
            String strM2953H = c4746c.m2953H();
            c4746c.m3157A();
            if (!c4746c.m3163f(':')) {
                throw new CSSParseException("Expected ':'");
            }
            c4746c.m3157A();
            String strM2955J = c4746c.m2955J();
            if (strM2955J == null) {
                throw new CSSParseException("Expected property value");
            }
            c4746c.m3157A();
            if (c4746c.m3163f('!')) {
                c4746c.m3157A();
                if (!c4746c.m3164g("important")) {
                    throw new CSSParseException("Malformed rule set: found unexpected '!'");
                }
                c4746c.m3157A();
            }
            c4746c.m3163f(';');
            SVGParser.m3047S0(style, strM2953H, strM2955J);
            c4746c.m3157A();
            if (c4746c.m3165h()) {
                break;
            }
        } while (!c4746c.m3163f('}'));
        return style;
    }

    /* renamed from: i */
    public final boolean m2943i(C4757n c4757n, C4746c c4746c) throws CSSParseException {
        List listM2957L = c4746c.m2957L();
        if (listM2957L == null || listM2957L.isEmpty()) {
            return false;
        }
        if (!c4746c.m3163f('{')) {
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        c4746c.m3157A();
        SVG.Style styleM2942g = m2942g(c4746c);
        c4746c.m3157A();
        Iterator it = listM2957L.iterator();
        while (it.hasNext()) {
            c4757n.m2964a(new C4755l((C4758o) it.next(), styleM2942g, this.f2666b));
        }
        return true;
    }

    /* renamed from: j */
    public final C4757n m2944j(C4746c c4746c) {
        C4757n c4757n = new C4757n();
        while (!c4746c.m3165h()) {
            try {
                if (!c4746c.m3164g("<!--") && !c4746c.m3164g("-->")) {
                    if (!c4746c.m3163f('@')) {
                        if (!m2943i(c4757n, c4746c)) {
                            break;
                        }
                    } else {
                        m2941e(c4757n, c4746c);
                    }
                }
            } catch (CSSParseException e6) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e6.getMessage());
                return c4757n;
            }
        }
        return c4757n;
    }

    /* renamed from: o */
    public final void m2945o(C4746c c4746c) {
        int i6 = 0;
        while (!c4746c.m3165h()) {
            int iIntValue = c4746c.m3169l().intValue();
            if (iIntValue == 59 && i6 == 0) {
                return;
            }
            if (iIntValue == 123) {
                i6++;
            } else if (iIntValue == 125 && i6 > 0 && i6 - 1 == 0) {
                return;
            }
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$o */
    public static class C4758o {

        /* renamed from: a */
        public List f2740a;

        /* renamed from: b */
        public int f2741b;

        public C4758o() {
            this.f2740a = null;
            this.f2741b = 0;
        }

        /* renamed from: a */
        public void m2970a(C4759p c4759p) {
            if (this.f2740a == null) {
                this.f2740a = new ArrayList();
            }
            this.f2740a.add(c4759p);
        }

        /* renamed from: b */
        public void m2971b() {
            this.f2741b += 1000;
        }

        /* renamed from: c */
        public void m2972c() {
            this.f2741b++;
        }

        /* renamed from: d */
        public void m2973d() {
            this.f2741b += DurationKt.NANOS_IN_MILLIS;
        }

        /* renamed from: e */
        public C4759p m2974e(int i6) {
            return (C4759p) this.f2740a.get(i6);
        }

        /* renamed from: f */
        public boolean m2975f() {
            List list = this.f2740a;
            return list == null || list.isEmpty();
        }

        /* renamed from: g */
        public int m2976g() {
            List list = this.f2740a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f2740a.iterator();
            while (it.hasNext()) {
                sb.append((C4759p) it.next());
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.f2741b);
            sb.append(']');
            return sb.toString();
        }

        public /* synthetic */ C4758o(C4744a c4744a) {
            this();
        }
    }
}
