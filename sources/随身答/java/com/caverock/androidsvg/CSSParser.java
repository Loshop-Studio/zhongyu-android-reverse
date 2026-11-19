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
import p133i1.C8127a;

/* loaded from: classes3.dex */
public class CSSParser {

    /* renamed from: a */
    public MediaType f3986a;

    /* renamed from: b */
    public Source f3987b;

    /* renamed from: c */
    public boolean f3988c;

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
        public static final Map f4036z = new HashMap();

        static {
            for (PseudoClassIdents pseudoClassIdents : values()) {
                if (pseudoClassIdents != UNSUPPORTED) {
                    f4036z.put(pseudoClassIdents.name().replace('_', '-'), pseudoClassIdents);
                }
            }
        }

        /* renamed from: a */
        public static PseudoClassIdents m3633a(String str) {
            PseudoClassIdents pseudoClassIdents = (PseudoClassIdents) f4036z.get(str);
            return pseudoClassIdents != null ? pseudoClassIdents : UNSUPPORTED;
        }
    }

    public enum Source {
        Document,
        RenderOptions
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$a */
    public static /* synthetic */ class C5544a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4040a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4041b;

        static {
            int[] iArr = new int[PseudoClassIdents.values().length];
            f4041b = iArr;
            try {
                iArr[PseudoClassIdents.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4041b[PseudoClassIdents.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4041b[PseudoClassIdents.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4041b[PseudoClassIdents.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4041b[PseudoClassIdents.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4041b[PseudoClassIdents.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4041b[PseudoClassIdents.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4041b[PseudoClassIdents.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4041b[PseudoClassIdents.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4041b[PseudoClassIdents.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4041b[PseudoClassIdents.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4041b[PseudoClassIdents.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4041b[PseudoClassIdents.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4041b[PseudoClassIdents.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4041b[PseudoClassIdents.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4041b[PseudoClassIdents.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4041b[PseudoClassIdents.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4041b[PseudoClassIdents.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f4041b[PseudoClassIdents.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4041b[PseudoClassIdents.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4041b[PseudoClassIdents.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4041b[PseudoClassIdents.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4041b[PseudoClassIdents.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4041b[PseudoClassIdents.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[AttribOp.values().length];
            f4040a = iArr2;
            try {
                iArr2[AttribOp.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4040a[AttribOp.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4040a[AttribOp.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$b */
    public static class C5545b {

        /* renamed from: a */
        public final String f4042a;

        /* renamed from: b */
        public final AttribOp f4043b;

        /* renamed from: c */
        public final String f4044c;

        public C5545b(String str, AttribOp attribOp, String str2) {
            this.f4042a = str;
            this.f4043b = attribOp;
            this.f4044c = str2;
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$c */
    public static class C5546c extends SVGParser.C5621g {

        /* renamed from: com.caverock.androidsvg.CSSParser$c$a */
        public static class a {

            /* renamed from: a */
            public int f4045a;

            /* renamed from: b */
            public int f4046b;

            public a(int i9, int i10) {
                this.f4045a = i9;
                this.f4046b = i10;
            }
        }

        public C5546c(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        /* renamed from: C */
        public final int m3635C(int i9) {
            if (i9 >= 48 && i9 <= 57) {
                return i9 - 48;
            }
            if (i9 >= 65 && i9 <= 70) {
                return i9 - 55;
            }
            if (i9 < 97 || i9 > 102) {
                return -1;
            }
            return i9 - 87;
        }

        /* renamed from: D */
        public final a m3636D() {
            C8127a c8127aM13020c;
            a aVar;
            if (m3858h()) {
                return null;
            }
            int i9 = this.f4461b;
            if (!m3856f('(')) {
                return null;
            }
            m3850A();
            int i10 = 1;
            if (m3857g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (m3857g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i11 = (!m3856f('+') && m3856f('-')) ? -1 : 1;
                    C8127a c8127aM13020c2 = C8127a.m13020c(this.f4460a, this.f4461b, this.f4462c, false);
                    if (c8127aM13020c2 != null) {
                        this.f4461b = c8127aM13020c2.m13021a();
                    }
                    if (m3856f('n') || m3856f('N')) {
                        if (c8127aM13020c2 == null) {
                            c8127aM13020c2 = new C8127a(1L, this.f4461b);
                        }
                        m3850A();
                        boolean zM3856f = m3856f('+');
                        if (!zM3856f && (zM3856f = m3856f('-'))) {
                            i10 = -1;
                        }
                        if (zM3856f) {
                            m3850A();
                            c8127aM13020c = C8127a.m13020c(this.f4460a, this.f4461b, this.f4462c, false);
                            if (c8127aM13020c == null) {
                                this.f4461b = i9;
                                return null;
                            }
                            this.f4461b = c8127aM13020c.m13021a();
                            int i12 = i10;
                            i10 = i11;
                            i11 = i12;
                        } else {
                            int i13 = i10;
                            i10 = i11;
                            i11 = i13;
                            c8127aM13020c = null;
                        }
                    } else {
                        c8127aM13020c = c8127aM13020c2;
                        c8127aM13020c2 = null;
                    }
                    aVar = new a(c8127aM13020c2 == null ? 0 : i10 * c8127aM13020c2.m13022d(), c8127aM13020c != null ? i11 * c8127aM13020c.m13022d() : 0);
                }
            }
            m3850A();
            if (m3856f(')')) {
                return aVar;
            }
            this.f4461b = i9;
            return null;
        }

        /* renamed from: E */
        public final String m3637E() {
            if (m3858h()) {
                return null;
            }
            String strM3867q = m3867q();
            return strM3867q != null ? strM3867q : m3640H();
        }

        /* renamed from: F */
        public String m3638F() {
            int iM3635C;
            if (m3858h()) {
                return null;
            }
            char cCharAt = this.f4460a.charAt(this.f4461b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.f4461b++;
            int iIntValue = m3862l().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = m3862l().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = m3862l().intValue();
                        } else {
                            int iM3635C2 = m3635C(iIntValue);
                            if (iM3635C2 != -1) {
                                for (int i9 = 1; i9 <= 5 && (iM3635C = m3635C((iIntValue = m3862l().intValue()))) != -1; i9++) {
                                    iM3635C2 = (iM3635C2 * 16) + iM3635C;
                                }
                                sb.append((char) iM3635C2);
                            }
                        }
                    }
                }
                sb.append((char) iIntValue);
                iIntValue = m3862l().intValue();
            }
            return sb.toString();
        }

        /* renamed from: G */
        public final List m3639G() {
            if (m3858h()) {
                return null;
            }
            int i9 = this.f4461b;
            if (!m3856f('(')) {
                return null;
            }
            m3850A();
            ArrayList arrayList = null;
            do {
                String strM3640H = m3640H();
                if (strM3640H == null) {
                    this.f4461b = i9;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strM3640H);
                m3850A();
            } while (m3876z());
            if (m3856f(')')) {
                return arrayList;
            }
            this.f4461b = i9;
            return null;
        }

        /* renamed from: H */
        public String m3640H() {
            int iM3648P = m3648P();
            int i9 = this.f4461b;
            if (iM3648P == i9) {
                return null;
            }
            String strSubstring = this.f4460a.substring(i9, iM3648P);
            this.f4461b = iM3648P;
            return strSubstring;
        }

        /* renamed from: I */
        public String m3641I() {
            char cCharAt;
            int iM3635C;
            StringBuilder sb = new StringBuilder();
            while (!m3858h() && (cCharAt = this.f4460a.charAt(this.f4461b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !m3861k(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.f4461b++;
                if (cCharAt == '\\') {
                    if (!m3858h()) {
                        String str = this.f4460a;
                        int i9 = this.f4461b;
                        this.f4461b = i9 + 1;
                        cCharAt = str.charAt(i9);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iM3635C2 = m3635C(cCharAt);
                            if (iM3635C2 != -1) {
                                for (int i10 = 1; i10 <= 5 && !m3858h() && (iM3635C = m3635C(this.f4460a.charAt(this.f4461b))) != -1; i10++) {
                                    this.f4461b++;
                                    iM3635C2 = (iM3635C2 * 16) + iM3635C;
                                }
                                sb.append((char) iM3635C2);
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
        public String m3642J() {
            if (m3858h()) {
                return null;
            }
            int i9 = this.f4461b;
            int iCharAt = this.f4460a.charAt(i9);
            int i10 = i9;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !m3860j(iCharAt)) {
                if (!m3861k(iCharAt)) {
                    i10 = this.f4461b + 1;
                }
                iCharAt = m3851a();
            }
            if (this.f4461b > i9) {
                return this.f4460a.substring(i9, i10);
            }
            this.f4461b = i9;
            return null;
        }

        /* renamed from: K */
        public final List m3643K() {
            List list;
            List list2;
            if (m3858h()) {
                return null;
            }
            int i9 = this.f4461b;
            if (!m3856f('(')) {
                return null;
            }
            m3850A();
            List listM3644L = m3644L();
            if (listM3644L == null) {
                this.f4461b = i9;
                return null;
            }
            if (!m3856f(')')) {
                this.f4461b = i9;
                return null;
            }
            Iterator it = listM3644L.iterator();
            while (it.hasNext() && (list = ((C5558o) it.next()).f4061a) != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext() && (list2 = ((C5559p) it2.next()).f4066d) != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((InterfaceC5547d) it3.next()) instanceof C5550g) {
                            return null;
                        }
                    }
                }
            }
            return listM3644L;
        }

        /* renamed from: L */
        public final List m3644L() {
            C5544a c5544a = null;
            if (m3858h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            C5558o c5558o = new C5558o(c5544a);
            while (!m3858h() && m3645M(c5558o)) {
                if (m3876z()) {
                    arrayList.add(c5558o);
                    c5558o = new C5558o(c5544a);
                }
            }
            if (!c5558o.m3662f()) {
                arrayList.add(c5558o);
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* renamed from: M */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m3645M(com.caverock.androidsvg.CSSParser.C5558o r11) throws com.caverock.androidsvg.CSSParseException {
            /*
                Method dump skipped, instructions count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.C5546c.m3645M(com.caverock.androidsvg.CSSParser$o):boolean");
        }

        /* renamed from: N */
        public String m3646N() {
            if (m3858h()) {
                return null;
            }
            int i9 = this.f4461b;
            if (!m3857g("url(")) {
                return null;
            }
            m3850A();
            String strM3638F = m3638F();
            if (strM3638F == null) {
                strM3638F = m3641I();
            }
            if (strM3638F == null) {
                this.f4461b = i9;
                return null;
            }
            m3850A();
            if (m3858h() || m3857g(")")) {
                return strM3638F;
            }
            this.f4461b = i9;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: O */
        public final void m3647O(C5558o c5558o, C5559p c5559p) throws CSSParseException {
            InterfaceC5547d c5552i;
            C5548e c5548e;
            C5548e c5548e2;
            String strM3640H = m3640H();
            if (strM3640H == null) {
                throw new CSSParseException("Invalid pseudo class");
            }
            PseudoClassIdents pseudoClassIdentsM3633a = PseudoClassIdents.m3633a(strM3640H);
            C5544a c5544a = null;
            switch (C5544a.f4041b[pseudoClassIdentsM3633a.ordinal()]) {
                case 1:
                    C5548e c5548e3 = new C5548e(0, 1, true, false, null);
                    c5558o.m3658b();
                    c5548e2 = c5548e3;
                    c5552i = c5548e2;
                    c5559p.m3665b(c5552i);
                    return;
                case 2:
                    C5548e c5548e4 = new C5548e(0, 1, false, false, null);
                    c5558o.m3658b();
                    c5552i = c5548e4;
                    c5559p.m3665b(c5552i);
                    return;
                case 3:
                    c5552i = new C5552i(false, null);
                    c5558o.m3658b();
                    c5559p.m3665b(c5552i);
                    return;
                case 4:
                    c5548e = new C5548e(0, 1, true, true, c5559p.f4064b);
                    c5558o.m3658b();
                    c5552i = c5548e;
                    c5559p.m3665b(c5552i);
                    return;
                case 5:
                    C5548e c5548e5 = new C5548e(0, 1, false, true, c5559p.f4064b);
                    c5558o.m3658b();
                    c5552i = c5548e5;
                    c5559p.m3665b(c5552i);
                    return;
                case 6:
                    c5552i = new C5552i(true, c5559p.f4064b);
                    c5558o.m3658b();
                    c5559p.m3665b(c5552i);
                    return;
                case 7:
                    c5552i = new C5553j(c5544a);
                    c5558o.m3658b();
                    c5559p.m3665b(c5552i);
                    return;
                case 8:
                    c5552i = new C5549f(c5544a);
                    c5558o.m3658b();
                    c5559p.m3665b(c5552i);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z9 = pseudoClassIdentsM3633a == PseudoClassIdents.nth_child || pseudoClassIdentsM3633a == PseudoClassIdents.nth_of_type;
                    boolean z10 = pseudoClassIdentsM3633a == PseudoClassIdents.nth_of_type || pseudoClassIdentsM3633a == PseudoClassIdents.nth_last_of_type;
                    a aVarM3636D = m3636D();
                    if (aVarM3636D == null) {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + strM3640H);
                    }
                    c5548e = new C5548e(aVarM3636D.f4045a, aVarM3636D.f4046b, z9, z10, c5559p.f4064b);
                    c5558o.m3658b();
                    c5552i = c5548e;
                    c5559p.m3665b(c5552i);
                    return;
                case 13:
                    List listM3643K = m3643K();
                    if (listM3643K == null) {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + strM3640H);
                    }
                    C5550g c5550g = new C5550g(listM3643K);
                    c5558o.f4062b = c5550g.m3650b();
                    c5548e2 = c5550g;
                    c5552i = c5548e2;
                    c5559p.m3665b(c5552i);
                    return;
                case 14:
                    c5552i = new C5554k(c5544a);
                    c5558o.m3658b();
                    c5559p.m3665b(c5552i);
                    return;
                case 15:
                    m3639G();
                    c5552i = new C5551h(strM3640H);
                    c5558o.m3658b();
                    c5559p.m3665b(c5552i);
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
                    c5552i = new C5551h(strM3640H);
                    c5558o.m3658b();
                    c5559p.m3665b(c5552i);
                    return;
                default:
                    throw new CSSParseException("Unsupported pseudo class: " + strM3640H);
            }
        }

        /* renamed from: P */
        public final int m3648P() {
            int i9;
            if (m3858h()) {
                return this.f4461b;
            }
            int i10 = this.f4461b;
            int iCharAt = this.f4460a.charAt(i10);
            if (iCharAt == 45) {
                iCharAt = m3851a();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i9 = i10;
            } else {
                int iM3851a = m3851a();
                while (true) {
                    if ((iM3851a < 65 || iM3851a > 90) && ((iM3851a < 97 || iM3851a > 122) && !((iM3851a >= 48 && iM3851a <= 57) || iM3851a == 45 || iM3851a == 95))) {
                        break;
                    }
                    iM3851a = m3851a();
                }
                i9 = this.f4461b;
            }
            this.f4461b = i10;
            return i9;
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$d */
    public interface InterfaceC5547d {
        /* renamed from: a */
        boolean mo3649a(C5556m c5556m, SVG.AbstractC5582j0 abstractC5582j0);
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$e */
    public static class C5548e implements InterfaceC5547d {

        /* renamed from: a */
        public int f4047a;

        /* renamed from: b */
        public int f4048b;

        /* renamed from: c */
        public boolean f4049c;

        /* renamed from: d */
        public boolean f4050d;

        /* renamed from: e */
        public String f4051e;

        public C5548e(int i9, int i10, boolean z9, boolean z10, String str) {
            this.f4047a = i9;
            this.f4048b = i10;
            this.f4049c = z9;
            this.f4050d = z10;
            this.f4051e = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.InterfaceC5547d
        /* renamed from: a */
        public boolean mo3649a(C5556m c5556m, SVG.AbstractC5582j0 abstractC5582j0) {
            int i9;
            int i10;
            String strMo3692n = (this.f4050d && this.f4051e == null) ? abstractC5582j0.mo3692n() : this.f4051e;
            SVG.InterfaceC5578h0 interfaceC5578h0 = abstractC5582j0.f4256b;
            if (interfaceC5578h0 != null) {
                Iterator it = interfaceC5578h0.getChildren().iterator();
                i9 = 0;
                i10 = 0;
                while (it.hasNext()) {
                    SVG.AbstractC5582j0 abstractC5582j02 = (SVG.AbstractC5582j0) ((SVG.C5586l0) it.next());
                    if (abstractC5582j02 == abstractC5582j0) {
                        i9 = i10;
                    }
                    if (strMo3692n == null || abstractC5582j02.mo3692n().equals(strMo3692n)) {
                        i10++;
                    }
                }
            } else {
                i9 = 0;
                i10 = 1;
            }
            int i11 = this.f4049c ? i9 + 1 : i10 - i9;
            int i12 = this.f4047a;
            if (i12 == 0) {
                return i11 == this.f4048b;
            }
            int i13 = this.f4048b;
            return (i11 - i13) % i12 == 0 && (Integer.signum(i11 - i13) == 0 || Integer.signum(i11 - this.f4048b) == Integer.signum(this.f4047a));
        }

        public String toString() {
            String str = this.f4049c ? "" : "last-";
            return this.f4050d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f4047a), Integer.valueOf(this.f4048b), this.f4051e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f4047a), Integer.valueOf(this.f4048b));
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$f */
    public static class C5549f implements InterfaceC5547d {
        public C5549f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.CSSParser.InterfaceC5547d
        /* renamed from: a */
        public boolean mo3649a(C5556m c5556m, SVG.AbstractC5582j0 abstractC5582j0) {
            return !(abstractC5582j0 instanceof SVG.InterfaceC5578h0) || ((SVG.InterfaceC5578h0) abstractC5582j0).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        public /* synthetic */ C5549f(C5544a c5544a) {
            this();
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$g */
    public static class C5550g implements InterfaceC5547d {

        /* renamed from: a */
        public List f4052a;

        public C5550g(List list) {
            this.f4052a = list;
        }

        @Override // com.caverock.androidsvg.CSSParser.InterfaceC5547d
        /* renamed from: a */
        public boolean mo3649a(C5556m c5556m, SVG.AbstractC5582j0 abstractC5582j0) {
            Iterator it = this.f4052a.iterator();
            while (it.hasNext()) {
                if (CSSParser.m3623l(c5556m, (C5558o) it.next(), abstractC5582j0)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public int m3650b() {
            Iterator it = this.f4052a.iterator();
            int i9 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i10 = ((C5558o) it.next()).f4062b;
                if (i10 > i9) {
                    i9 = i10;
                }
            }
            return i9;
        }

        public String toString() {
            return "not(" + this.f4052a + ")";
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$h */
    public static class C5551h implements InterfaceC5547d {

        /* renamed from: a */
        public String f4053a;

        public C5551h(String str) {
            this.f4053a = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.InterfaceC5547d
        /* renamed from: a */
        public boolean mo3649a(C5556m c5556m, SVG.AbstractC5582j0 abstractC5582j0) {
            return false;
        }

        public String toString() {
            return this.f4053a;
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$i */
    public static class C5552i implements InterfaceC5547d {

        /* renamed from: a */
        public boolean f4054a;

        /* renamed from: b */
        public String f4055b;

        public C5552i(boolean z9, String str) {
            this.f4054a = z9;
            this.f4055b = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.InterfaceC5547d
        /* renamed from: a */
        public boolean mo3649a(C5556m c5556m, SVG.AbstractC5582j0 abstractC5582j0) {
            int i9;
            String strMo3692n = (this.f4054a && this.f4055b == null) ? abstractC5582j0.mo3692n() : this.f4055b;
            SVG.InterfaceC5578h0 interfaceC5578h0 = abstractC5582j0.f4256b;
            if (interfaceC5578h0 != null) {
                Iterator it = interfaceC5578h0.getChildren().iterator();
                i9 = 0;
                while (it.hasNext()) {
                    SVG.AbstractC5582j0 abstractC5582j02 = (SVG.AbstractC5582j0) ((SVG.C5586l0) it.next());
                    if (strMo3692n == null || abstractC5582j02.mo3692n().equals(strMo3692n)) {
                        i9++;
                    }
                }
            } else {
                i9 = 1;
            }
            return i9 == 1;
        }

        public String toString() {
            return this.f4054a ? String.format("only-of-type <%s>", this.f4055b) : String.format("only-child", new Object[0]);
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$j */
    public static class C5553j implements InterfaceC5547d {
        public C5553j() {
        }

        @Override // com.caverock.androidsvg.CSSParser.InterfaceC5547d
        /* renamed from: a */
        public boolean mo3649a(C5556m c5556m, SVG.AbstractC5582j0 abstractC5582j0) {
            return abstractC5582j0.f4256b == null;
        }

        public String toString() {
            return "root";
        }

        public /* synthetic */ C5553j(C5544a c5544a) {
            this();
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$k */
    public static class C5554k implements InterfaceC5547d {
        public C5554k() {
        }

        @Override // com.caverock.androidsvg.CSSParser.InterfaceC5547d
        /* renamed from: a */
        public boolean mo3649a(C5556m c5556m, SVG.AbstractC5582j0 abstractC5582j0) {
            return c5556m != null && abstractC5582j0 == c5556m.f4059a;
        }

        public String toString() {
            return TypedValues.AttributesType.S_TARGET;
        }

        public /* synthetic */ C5554k(C5544a c5544a) {
            this();
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$l */
    public static class C5555l {

        /* renamed from: a */
        public C5558o f4056a;

        /* renamed from: b */
        public SVG.Style f4057b;

        /* renamed from: c */
        public Source f4058c;

        public C5555l(C5558o c5558o, SVG.Style style, Source source) {
            this.f4056a = c5558o;
            this.f4057b = style;
            this.f4058c = source;
        }

        public String toString() {
            return String.valueOf(this.f4056a) + " {...} (src=" + this.f4058c + ")";
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$m */
    public static class C5556m {

        /* renamed from: a */
        public SVG.AbstractC5582j0 f4059a;

        public String toString() {
            SVG.AbstractC5582j0 abstractC5582j0 = this.f4059a;
            return abstractC5582j0 != null ? String.format("<%s id=\"%s\">", abstractC5582j0.mo3692n(), this.f4059a.f4244c) : "";
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$n */
    public static class C5557n {

        /* renamed from: a */
        public List f4060a = null;

        /* renamed from: a */
        public void m3651a(C5555l c5555l) {
            if (this.f4060a == null) {
                this.f4060a = new ArrayList();
            }
            for (int i9 = 0; i9 < this.f4060a.size(); i9++) {
                if (((C5555l) this.f4060a.get(i9)).f4056a.f4062b > c5555l.f4056a.f4062b) {
                    this.f4060a.add(i9, c5555l);
                    return;
                }
            }
            this.f4060a.add(c5555l);
        }

        /* renamed from: b */
        public void m3652b(C5557n c5557n) {
            if (c5557n.f4060a == null) {
                return;
            }
            if (this.f4060a == null) {
                this.f4060a = new ArrayList(c5557n.f4060a.size());
            }
            Iterator it = c5557n.f4060a.iterator();
            while (it.hasNext()) {
                m3651a((C5555l) it.next());
            }
        }

        /* renamed from: c */
        public List m3653c() {
            return this.f4060a;
        }

        /* renamed from: d */
        public boolean m3654d() {
            List list = this.f4060a;
            return list == null || list.isEmpty();
        }

        /* renamed from: e */
        public void m3655e(Source source) {
            List list = this.f4060a;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C5555l) it.next()).f4058c == source) {
                    it.remove();
                }
            }
        }

        /* renamed from: f */
        public int m3656f() {
            List list = this.f4060a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f4060a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f4060a.iterator();
            while (it.hasNext()) {
                sb.append(((C5555l) it.next()).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$p */
    public static class C5559p {

        /* renamed from: a */
        public Combinator f4063a;

        /* renamed from: b */
        public String f4064b;

        /* renamed from: c */
        public List f4065c = null;

        /* renamed from: d */
        public List f4066d = null;

        public C5559p(Combinator combinator, String str) {
            this.f4063a = null;
            this.f4064b = null;
            this.f4063a = combinator == null ? Combinator.DESCENDANT : combinator;
            this.f4064b = str;
        }

        /* renamed from: a */
        public void m3664a(String str, AttribOp attribOp, String str2) {
            if (this.f4065c == null) {
                this.f4065c = new ArrayList();
            }
            this.f4065c.add(new C5545b(str, attribOp, str2));
        }

        /* renamed from: b */
        public void m3665b(InterfaceC5547d interfaceC5547d) {
            if (this.f4066d == null) {
                this.f4066d = new ArrayList();
            }
            this.f4066d.add(interfaceC5547d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Combinator combinator = this.f4063a;
            if (combinator == Combinator.CHILD) {
                sb.append("> ");
            } else if (combinator == Combinator.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.f4064b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            List<C5545b> list = this.f4065c;
            if (list != null) {
                for (C5545b c5545b : list) {
                    sb.append('[');
                    sb.append(c5545b.f4042a);
                    int i9 = C5544a.f4040a[c5545b.f4043b.ordinal()];
                    if (i9 == 1) {
                        sb.append('=');
                        sb.append(c5545b.f4044c);
                    } else if (i9 == 2) {
                        sb.append("~=");
                        sb.append(c5545b.f4044c);
                    } else if (i9 == 3) {
                        sb.append("|=");
                        sb.append(c5545b.f4044c);
                    }
                    sb.append(']');
                }
            }
            List<InterfaceC5547d> list2 = this.f4066d;
            if (list2 != null) {
                for (InterfaceC5547d interfaceC5547d : list2) {
                    sb.append(':');
                    sb.append(interfaceC5547d);
                }
            }
            return sb.toString();
        }
    }

    public CSSParser(Source source) {
        this(MediaType.screen, source);
    }

    /* renamed from: a */
    public static int m3617a(List list, int i9, SVG.AbstractC5582j0 abstractC5582j0) {
        int i10 = 0;
        if (i9 < 0) {
            return 0;
        }
        Object obj = list.get(i9);
        SVG.InterfaceC5578h0 interfaceC5578h0 = abstractC5582j0.f4256b;
        if (obj != interfaceC5578h0) {
            return -1;
        }
        Iterator it = interfaceC5578h0.getChildren().iterator();
        while (it.hasNext()) {
            if (((SVG.C5586l0) it.next()) == abstractC5582j0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m3618b(String str, MediaType mediaType) {
        C5546c c5546c = new C5546c(str);
        c5546c.m3850A();
        return m3619c(m3621h(c5546c), mediaType);
    }

    /* renamed from: c */
    public static boolean m3619c(List list, MediaType mediaType) {
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
    public static List m3620f(String str) {
        C5546c c5546c = new C5546c(str);
        ArrayList arrayList = null;
        while (!c5546c.m3858h()) {
            String strM3868r = c5546c.m3868r();
            if (strM3868r != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strM3868r);
                c5546c.m3850A();
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static List m3621h(C5546c c5546c) {
        String strM3873w;
        ArrayList arrayList = new ArrayList();
        while (!c5546c.m3858h() && (strM3873w = c5546c.m3873w()) != null) {
            try {
                arrayList.add(MediaType.valueOf(strM3873w));
            } catch (IllegalArgumentException unused) {
            }
            if (!c5546c.m3876z()) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static boolean m3622k(C5556m c5556m, C5558o c5558o, int i9, List list, int i10, SVG.AbstractC5582j0 abstractC5582j0) {
        C5559p c5559pM3661e = c5558o.m3661e(i9);
        if (!m3625n(c5556m, c5559pM3661e, list, i10, abstractC5582j0)) {
            return false;
        }
        Combinator combinator = c5559pM3661e.f4063a;
        if (combinator == Combinator.DESCENDANT) {
            if (i9 == 0) {
                return true;
            }
            while (i10 >= 0) {
                if (m3624m(c5556m, c5558o, i9 - 1, list, i10)) {
                    return true;
                }
                i10--;
            }
            return false;
        }
        if (combinator == Combinator.CHILD) {
            return m3624m(c5556m, c5558o, i9 - 1, list, i10);
        }
        int iM3617a = m3617a(list, i10, abstractC5582j0);
        if (iM3617a <= 0) {
            return false;
        }
        return m3622k(c5556m, c5558o, i9 - 1, list, i10, (SVG.AbstractC5582j0) abstractC5582j0.f4256b.getChildren().get(iM3617a - 1));
    }

    /* renamed from: l */
    public static boolean m3623l(C5556m c5556m, C5558o c5558o, SVG.AbstractC5582j0 abstractC5582j0) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = abstractC5582j0.f4256b; obj != null; obj = ((SVG.C5586l0) obj).f4256b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return c5558o.m3663g() == 1 ? m3625n(c5556m, c5558o.m3661e(0), arrayList, size, abstractC5582j0) : m3622k(c5556m, c5558o, c5558o.m3663g() - 1, arrayList, size, abstractC5582j0);
    }

    /* renamed from: m */
    public static boolean m3624m(C5556m c5556m, C5558o c5558o, int i9, List list, int i10) {
        C5559p c5559pM3661e = c5558o.m3661e(i9);
        SVG.AbstractC5582j0 abstractC5582j0 = (SVG.AbstractC5582j0) list.get(i10);
        if (!m3625n(c5556m, c5559pM3661e, list, i10, abstractC5582j0)) {
            return false;
        }
        Combinator combinator = c5559pM3661e.f4063a;
        if (combinator == Combinator.DESCENDANT) {
            if (i9 == 0) {
                return true;
            }
            while (i10 > 0) {
                i10--;
                if (m3624m(c5556m, c5558o, i9 - 1, list, i10)) {
                    return true;
                }
            }
            return false;
        }
        if (combinator == Combinator.CHILD) {
            return m3624m(c5556m, c5558o, i9 - 1, list, i10 - 1);
        }
        int iM3617a = m3617a(list, i10, abstractC5582j0);
        if (iM3617a <= 0) {
            return false;
        }
        return m3622k(c5556m, c5558o, i9 - 1, list, i10, (SVG.AbstractC5582j0) abstractC5582j0.f4256b.getChildren().get(iM3617a - 1));
    }

    /* renamed from: n */
    public static boolean m3625n(C5556m c5556m, C5559p c5559p, List list, int i9, SVG.AbstractC5582j0 abstractC5582j0) {
        List list2;
        String str = c5559p.f4064b;
        if (str != null && !str.equals(abstractC5582j0.mo3692n().toLowerCase(Locale.US))) {
            return false;
        }
        List<C5545b> list3 = c5559p.f4065c;
        if (list3 != null) {
            for (C5545b c5545b : list3) {
                String str2 = c5545b.f4042a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!c5545b.f4044c.equals(abstractC5582j0.f4244c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = abstractC5582j0.f4248g) == null || !list2.contains(c5545b.f4044c)) {
                    return false;
                }
            }
        }
        List list4 = c5559p.f4066d;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC5547d) it.next()).mo3649a(c5556m, abstractC5582j0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static void m3626p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    /* renamed from: d */
    public C5557n m3627d(String str) {
        C5546c c5546c = new C5546c(str);
        c5546c.m3850A();
        return m3631j(c5546c);
    }

    /* renamed from: e */
    public final void m3628e(C5557n c5557n, C5546c c5546c) throws CSSParseException {
        String strM3640H = c5546c.m3640H();
        c5546c.m3850A();
        if (strM3640H == null) {
            throw new CSSParseException("Invalid '@' rule");
        }
        if (!this.f3988c && strM3640H.equals("media")) {
            List listM3621h = m3621h(c5546c);
            if (!c5546c.m3856f('{')) {
                throw new CSSParseException("Invalid @media rule: missing rule set");
            }
            c5546c.m3850A();
            if (m3619c(listM3621h, this.f3986a)) {
                this.f3988c = true;
                c5557n.m3652b(m3631j(c5546c));
                this.f3988c = false;
            } else {
                m3631j(c5546c);
            }
            if (!c5546c.m3858h() && !c5546c.m3856f('}')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f3988c || !strM3640H.equals("import")) {
            m3626p("Ignoring @%s rule", strM3640H);
            m3632o(c5546c);
        } else {
            String strM3646N = c5546c.m3646N();
            if (strM3646N == null) {
                strM3646N = c5546c.m3638F();
            }
            if (strM3646N == null) {
                throw new CSSParseException("Invalid @import rule: expected string or url()");
            }
            c5546c.m3850A();
            m3621h(c5546c);
            if (!c5546c.m3858h() && !c5546c.m3856f(';')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
            SVG.m3668k();
        }
        c5546c.m3850A();
    }

    /* renamed from: g */
    public final SVG.Style m3629g(C5546c c5546c) throws CSSParseException {
        SVG.Style style = new SVG.Style();
        do {
            String strM3640H = c5546c.m3640H();
            c5546c.m3850A();
            if (!c5546c.m3856f(':')) {
                throw new CSSParseException("Expected ':'");
            }
            c5546c.m3850A();
            String strM3642J = c5546c.m3642J();
            if (strM3642J == null) {
                throw new CSSParseException("Expected property value");
            }
            c5546c.m3850A();
            if (c5546c.m3856f('!')) {
                c5546c.m3850A();
                if (!c5546c.m3857g("important")) {
                    throw new CSSParseException("Malformed rule set: found unexpected '!'");
                }
                c5546c.m3850A();
            }
            c5546c.m3856f(';');
            SVGParser.m3740S0(style, strM3640H, strM3642J);
            c5546c.m3850A();
            if (c5546c.m3858h()) {
                break;
            }
        } while (!c5546c.m3856f('}'));
        return style;
    }

    /* renamed from: i */
    public final boolean m3630i(C5557n c5557n, C5546c c5546c) throws CSSParseException {
        List listM3644L = c5546c.m3644L();
        if (listM3644L == null || listM3644L.isEmpty()) {
            return false;
        }
        if (!c5546c.m3856f('{')) {
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        c5546c.m3850A();
        SVG.Style styleM3629g = m3629g(c5546c);
        c5546c.m3850A();
        Iterator it = listM3644L.iterator();
        while (it.hasNext()) {
            c5557n.m3651a(new C5555l((C5558o) it.next(), styleM3629g, this.f3987b));
        }
        return true;
    }

    /* renamed from: j */
    public final C5557n m3631j(C5546c c5546c) {
        C5557n c5557n = new C5557n();
        while (!c5546c.m3858h()) {
            try {
                if (!c5546c.m3857g("<!--") && !c5546c.m3857g("-->")) {
                    if (!c5546c.m3856f('@')) {
                        if (!m3630i(c5557n, c5546c)) {
                            break;
                        }
                    } else {
                        m3628e(c5557n, c5546c);
                    }
                }
            } catch (CSSParseException e10) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e10.getMessage());
                return c5557n;
            }
        }
        return c5557n;
    }

    /* renamed from: o */
    public final void m3632o(C5546c c5546c) {
        int i9 = 0;
        while (!c5546c.m3858h()) {
            int iIntValue = c5546c.m3862l().intValue();
            if (iIntValue == 59 && i9 == 0) {
                return;
            }
            if (iIntValue == 123) {
                i9++;
            } else if (iIntValue == 125 && i9 > 0 && i9 - 1 == 0) {
                return;
            }
        }
    }

    public CSSParser(MediaType mediaType, Source source) {
        this.f3988c = false;
        this.f3986a = mediaType;
        this.f3987b = source;
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$o */
    public static class C5558o {

        /* renamed from: a */
        public List f4061a;

        /* renamed from: b */
        public int f4062b;

        public C5558o() {
            this.f4061a = null;
            this.f4062b = 0;
        }

        /* renamed from: a */
        public void m3657a(C5559p c5559p) {
            if (this.f4061a == null) {
                this.f4061a = new ArrayList();
            }
            this.f4061a.add(c5559p);
        }

        /* renamed from: b */
        public void m3658b() {
            this.f4062b += 1000;
        }

        /* renamed from: c */
        public void m3659c() {
            this.f4062b++;
        }

        /* renamed from: d */
        public void m3660d() {
            this.f4062b += DurationKt.NANOS_IN_MILLIS;
        }

        /* renamed from: e */
        public C5559p m3661e(int i9) {
            return (C5559p) this.f4061a.get(i9);
        }

        /* renamed from: f */
        public boolean m3662f() {
            List list = this.f4061a;
            return list == null || list.isEmpty();
        }

        /* renamed from: g */
        public int m3663g() {
            List list = this.f4061a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f4061a.iterator();
            while (it.hasNext()) {
                sb.append((C5559p) it.next());
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.f4062b);
            sb.append(']');
            return sb.toString();
        }

        public /* synthetic */ C5558o(C5544a c5544a) {
            this();
        }
    }
}
