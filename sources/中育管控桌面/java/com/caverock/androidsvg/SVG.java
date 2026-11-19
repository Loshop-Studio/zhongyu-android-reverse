package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import androidx.core.view.ViewCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.caverock.androidsvg.CSSParser;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040d1.AbstractC6217c;

/* loaded from: classes3.dex */
public class SVG {

    /* renamed from: g */
    public static boolean f2771g = true;

    /* renamed from: a */
    public C4770d0 f2772a = null;

    /* renamed from: b */
    public String f2773b = "";

    /* renamed from: c */
    public String f2774c = "";

    /* renamed from: d */
    public float f2775d = 96.0f;

    /* renamed from: e */
    public CSSParser.C4757n f2776e = new CSSParser.C4757n();

    /* renamed from: f */
    public Map f2777f = new HashMap();

    public enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    public static class Style implements Cloneable {

        /* renamed from: A */
        public Boolean f2782A;

        /* renamed from: B */
        public Boolean f2783B;

        /* renamed from: C */
        public AbstractC4788m0 f2784C;

        /* renamed from: D */
        public Float f2785D;

        /* renamed from: E */
        public String f2786E;

        /* renamed from: F */
        public FillRule f2787F;

        /* renamed from: G */
        public String f2788G;

        /* renamed from: H */
        public AbstractC4788m0 f2789H;

        /* renamed from: I */
        public Float f2790I;

        /* renamed from: J */
        public AbstractC4788m0 f2791J;

        /* renamed from: K */
        public Float f2792K;

        /* renamed from: L */
        public VectorEffect f2793L;

        /* renamed from: M */
        public RenderQuality f2794M;

        /* renamed from: a */
        public long f2795a = 0;

        /* renamed from: b */
        public AbstractC4788m0 f2796b;

        /* renamed from: c */
        public FillRule f2797c;

        /* renamed from: d */
        public Float f2798d;

        /* renamed from: e */
        public AbstractC4788m0 f2799e;

        /* renamed from: f */
        public Float f2800f;

        /* renamed from: g */
        public C4791o f2801g;

        /* renamed from: h */
        public LineCap f2802h;

        /* renamed from: i */
        public LineJoin f2803i;

        /* renamed from: j */
        public Float f2804j;

        /* renamed from: k */
        public C4791o[] f2805k;

        /* renamed from: l */
        public C4791o f2806l;

        /* renamed from: m */
        public Float f2807m;

        /* renamed from: n */
        public C4773f f2808n;

        /* renamed from: o */
        public List f2809o;

        /* renamed from: p */
        public C4791o f2810p;

        /* renamed from: q */
        public Integer f2811q;

        /* renamed from: r */
        public FontStyle f2812r;

        /* renamed from: s */
        public TextDecoration f2813s;

        /* renamed from: t */
        public TextDirection f2814t;

        /* renamed from: u */
        public TextAnchor f2815u;

        /* renamed from: v */
        public Boolean f2816v;

        /* renamed from: w */
        public C4766c f2817w;

        /* renamed from: x */
        public String f2818x;

        /* renamed from: y */
        public String f2819y;

        /* renamed from: z */
        public String f2820z;

        public enum FillRule {
            NonZero,
            EvenOdd
        }

        public enum FontStyle {
            Normal,
            Italic,
            Oblique
        }

        public enum LineCap {
            Butt,
            Round,
            Square
        }

        public enum LineJoin {
            Miter,
            Round,
            Bevel
        }

        public enum RenderQuality {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum TextAnchor {
            Start,
            Middle,
            End
        }

        public enum TextDecoration {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum TextDirection {
            LTR,
            RTL
        }

        public enum VectorEffect {
            None,
            NonScalingStroke
        }

        /* renamed from: b */
        public static Style m2998b() {
            Style style = new Style();
            style.f2795a = -1L;
            C4773f c4773f = C4773f.f2898b;
            style.f2796b = c4773f;
            FillRule fillRule = FillRule.NonZero;
            style.f2797c = fillRule;
            Float fValueOf = Float.valueOf(1.0f);
            style.f2798d = fValueOf;
            style.f2799e = null;
            style.f2800f = fValueOf;
            style.f2801g = new C4791o(1.0f);
            style.f2802h = LineCap.Butt;
            style.f2803i = LineJoin.Miter;
            style.f2804j = Float.valueOf(4.0f);
            style.f2805k = null;
            style.f2806l = new C4791o(0.0f);
            style.f2807m = fValueOf;
            style.f2808n = c4773f;
            style.f2809o = null;
            style.f2810p = new C4791o(12.0f, Unit.pt);
            style.f2811q = 400;
            style.f2812r = FontStyle.Normal;
            style.f2813s = TextDecoration.None;
            style.f2814t = TextDirection.LTR;
            style.f2815u = TextAnchor.Start;
            Boolean bool = Boolean.TRUE;
            style.f2816v = bool;
            style.f2817w = null;
            style.f2818x = null;
            style.f2819y = null;
            style.f2820z = null;
            style.f2782A = bool;
            style.f2783B = bool;
            style.f2784C = c4773f;
            style.f2785D = fValueOf;
            style.f2786E = null;
            style.f2787F = fillRule;
            style.f2788G = null;
            style.f2789H = null;
            style.f2790I = fValueOf;
            style.f2791J = null;
            style.f2792K = fValueOf;
            style.f2793L = VectorEffect.None;
            style.f2794M = RenderQuality.auto;
            return style;
        }

        public Object clone() {
            Style style = (Style) super.clone();
            C4791o[] c4791oArr = this.f2805k;
            if (c4791oArr != null) {
                style.f2805k = (C4791o[]) c4791oArr.clone();
            }
            return style;
        }

        /* renamed from: d */
        public void m2999d(boolean z6) {
            Float fValueOf = Float.valueOf(1.0f);
            Boolean bool = Boolean.TRUE;
            this.f2782A = bool;
            if (!z6) {
                bool = Boolean.FALSE;
            }
            this.f2816v = bool;
            this.f2817w = null;
            this.f2786E = null;
            this.f2807m = fValueOf;
            this.f2784C = C4773f.f2898b;
            this.f2785D = fValueOf;
            this.f2788G = null;
            this.f2789H = null;
            this.f2790I = fValueOf;
            this.f2791J = null;
            this.f2792K = fValueOf;
            this.f2793L = VectorEffect.None;
        }
    }

    public enum Unit {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* renamed from: com.caverock.androidsvg.SVG$a */
    public static /* synthetic */ class C4760a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2866a;

        static {
            int[] iArr = new int[Unit.values().length];
            f2866a = iArr;
            try {
                iArr[Unit.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2866a[Unit.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2866a[Unit.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2866a[Unit.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2866a[Unit.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2866a[Unit.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2866a[Unit.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2866a[Unit.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2866a[Unit.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$a0 */
    public static class C4761a0 extends AbstractC4783k {

        /* renamed from: o */
        public C4791o f2867o;

        /* renamed from: p */
        public C4791o f2868p;

        /* renamed from: q */
        public C4791o f2869q;

        /* renamed from: r */
        public C4791o f2870r;

        /* renamed from: s */
        public C4791o f2871s;

        /* renamed from: t */
        public C4791o f2872t;

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "rect";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$a1 */
    public static class C4762a1 extends C4786l0 implements InterfaceC4806v0 {

        /* renamed from: c */
        public String f2873c;

        /* renamed from: d */
        public InterfaceC4814z0 f2874d;

        public C4762a1(String str) {
            this.f2873c = str;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4806v0
        /* renamed from: d */
        public InterfaceC4814z0 mo3001d() {
            return this.f2874d;
        }

        public String toString() {
            return "TextChild: '" + this.f2873c + "'";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$b0 */
    public static class C4764b0 extends AbstractC4782j0 implements InterfaceC4778h0 {
        @Override // com.caverock.androidsvg.SVG.InterfaceC4778h0
        public List getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4778h0
        /* renamed from: h */
        public void mo3006h(C4786l0 c4786l0) {
        }

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "solidColor";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$b1 */
    public static class C4765b1 extends C4785l {

        /* renamed from: p */
        public String f2879p;

        /* renamed from: q */
        public C4791o f2880q;

        /* renamed from: r */
        public C4791o f2881r;

        /* renamed from: s */
        public C4791o f2882s;

        /* renamed from: t */
        public C4791o f2883t;

        @Override // com.caverock.androidsvg.SVG.C4785l, com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "use";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$c */
    public static class C4766c {

        /* renamed from: a */
        public C4791o f2884a;

        /* renamed from: b */
        public C4791o f2885b;

        /* renamed from: c */
        public C4791o f2886c;

        /* renamed from: d */
        public C4791o f2887d;

        public C4766c(C4791o c4791o, C4791o c4791o2, C4791o c4791o3, C4791o c4791o4) {
            this.f2884a = c4791o;
            this.f2885b = c4791o2;
            this.f2886c = c4791o3;
            this.f2887d = c4791o4;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$c0 */
    public static class C4767c0 extends AbstractC4782j0 implements InterfaceC4778h0 {

        /* renamed from: h */
        public Float f2888h;

        @Override // com.caverock.androidsvg.SVG.InterfaceC4778h0
        public List getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4778h0
        /* renamed from: h */
        public void mo3006h(C4786l0 c4786l0) {
        }

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "stop";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$c1 */
    public static class C4768c1 extends AbstractC4794p0 implements InterfaceC4799s {
        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "view";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$d */
    public static class C4769d extends AbstractC4783k {

        /* renamed from: o */
        public C4791o f2889o;

        /* renamed from: p */
        public C4791o f2890p;

        /* renamed from: q */
        public C4791o f2891q;

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "circle";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$d0 */
    public static class C4770d0 extends AbstractC4794p0 {

        /* renamed from: q */
        public C4791o f2892q;

        /* renamed from: r */
        public C4791o f2893r;

        /* renamed from: s */
        public C4791o f2894s;

        /* renamed from: t */
        public C4791o f2895t;

        /* renamed from: u */
        public String f2896u;

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "svg";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$e */
    public static class C4771e extends C4785l implements InterfaceC4799s {

        /* renamed from: p */
        public Boolean f2897p;

        @Override // com.caverock.androidsvg.SVG.C4785l, com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "clipPath";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$e0 */
    public interface InterfaceC4772e0 {
        /* renamed from: a */
        Set mo3007a();

        /* renamed from: b */
        String mo3008b();

        /* renamed from: c */
        void mo3009c(Set set);

        /* renamed from: e */
        void mo3010e(Set set);

        /* renamed from: f */
        Set mo3011f();

        /* renamed from: g */
        void mo3012g(Set set);

        /* renamed from: i */
        void mo3013i(Set set);

        /* renamed from: j */
        void mo3014j(String str);

        /* renamed from: l */
        Set mo3015l();

        /* renamed from: m */
        Set mo3016m();
    }

    /* renamed from: com.caverock.androidsvg.SVG$f */
    public static class C4773f extends AbstractC4788m0 {

        /* renamed from: b */
        public static final C4773f f2898b = new C4773f(ViewCompat.MEASURED_STATE_MASK);

        /* renamed from: c */
        public static final C4773f f2899c = new C4773f(0);

        /* renamed from: a */
        public int f2900a;

        public C4773f(int i6) {
            this.f2900a = i6;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f2900a));
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$f0 */
    public static abstract class AbstractC4774f0 extends AbstractC4780i0 implements InterfaceC4778h0, InterfaceC4772e0 {

        /* renamed from: i */
        public List f2901i = new ArrayList();

        /* renamed from: j */
        public Set f2902j = null;

        /* renamed from: k */
        public String f2903k = null;

        /* renamed from: l */
        public Set f2904l = null;

        /* renamed from: m */
        public Set f2905m = null;

        /* renamed from: n */
        public Set f2906n = null;

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: a */
        public Set mo3007a() {
            return null;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: b */
        public String mo3008b() {
            return this.f2903k;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: c */
        public void mo3009c(Set set) {
            this.f2906n = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: e */
        public void mo3010e(Set set) {
            this.f2902j = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: f */
        public Set mo3011f() {
            return this.f2902j;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: g */
        public void mo3012g(Set set) {
            this.f2904l = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4778h0
        public List getChildren() {
            return this.f2901i;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4778h0
        /* renamed from: h */
        public void mo3006h(C4786l0 c4786l0) {
            this.f2901i.add(c4786l0);
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: i */
        public void mo3013i(Set set) {
            this.f2905m = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: j */
        public void mo3014j(String str) {
            this.f2903k = str;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: l */
        public Set mo3015l() {
            return this.f2905m;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: m */
        public Set mo3016m() {
            return this.f2906n;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$g */
    public static class C4775g extends AbstractC4788m0 {

        /* renamed from: a */
        public static C4775g f2907a = new C4775g();

        /* renamed from: b */
        public static C4775g m3017b() {
            return f2907a;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$g0 */
    public static abstract class AbstractC4776g0 extends AbstractC4780i0 implements InterfaceC4772e0 {

        /* renamed from: i */
        public Set f2908i = null;

        /* renamed from: j */
        public String f2909j = null;

        /* renamed from: k */
        public Set f2910k = null;

        /* renamed from: l */
        public Set f2911l = null;

        /* renamed from: m */
        public Set f2912m = null;

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: a */
        public Set mo3007a() {
            return this.f2910k;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: b */
        public String mo3008b() {
            return this.f2909j;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: c */
        public void mo3009c(Set set) {
            this.f2912m = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: e */
        public void mo3010e(Set set) {
            this.f2908i = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: f */
        public Set mo3011f() {
            return this.f2908i;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: g */
        public void mo3012g(Set set) {
            this.f2910k = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: i */
        public void mo3013i(Set set) {
            this.f2911l = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: j */
        public void mo3014j(String str) {
            this.f2909j = str;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: l */
        public Set mo3015l() {
            return this.f2911l;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4772e0
        /* renamed from: m */
        public Set mo3016m() {
            return this.f2912m;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$h */
    public static class C4777h extends C4785l implements InterfaceC4799s {
        @Override // com.caverock.androidsvg.SVG.C4785l, com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "defs";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$h0 */
    public interface InterfaceC4778h0 {
        List getChildren();

        /* renamed from: h */
        void mo3006h(C4786l0 c4786l0);
    }

    /* renamed from: com.caverock.androidsvg.SVG$i */
    public static class C4779i extends AbstractC4783k {

        /* renamed from: o */
        public C4791o f2913o;

        /* renamed from: p */
        public C4791o f2914p;

        /* renamed from: q */
        public C4791o f2915q;

        /* renamed from: r */
        public C4791o f2916r;

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "ellipse";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$i0 */
    public static abstract class AbstractC4780i0 extends AbstractC4782j0 {

        /* renamed from: h */
        public C4763b f2917h = null;
    }

    /* renamed from: com.caverock.androidsvg.SVG$j */
    public static abstract class AbstractC4781j extends AbstractC4782j0 implements InterfaceC4778h0 {

        /* renamed from: h */
        public List f2918h = new ArrayList();

        /* renamed from: i */
        public Boolean f2919i;

        /* renamed from: j */
        public Matrix f2920j;

        /* renamed from: k */
        public GradientSpread f2921k;

        /* renamed from: l */
        public String f2922l;

        @Override // com.caverock.androidsvg.SVG.InterfaceC4778h0
        public List getChildren() {
            return this.f2918h;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4778h0
        /* renamed from: h */
        public void mo3006h(C4786l0 c4786l0) throws SVGParseException {
            if (c4786l0 instanceof C4767c0) {
                this.f2918h.add(c4786l0);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + c4786l0 + " elements.");
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$j0 */
    public static abstract class AbstractC4782j0 extends C4786l0 {

        /* renamed from: c */
        public String f2923c = null;

        /* renamed from: d */
        public Boolean f2924d = null;

        /* renamed from: e */
        public Style f2925e = null;

        /* renamed from: f */
        public Style f2926f = null;

        /* renamed from: g */
        public List f2927g = null;

        public String toString() {
            return mo3000n();
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$k */
    public static abstract class AbstractC4783k extends AbstractC4776g0 implements InterfaceC4787m {

        /* renamed from: n */
        public Matrix f2928n;

        @Override // com.caverock.androidsvg.SVG.InterfaceC4787m
        /* renamed from: k */
        public void mo3018k(Matrix matrix) {
            this.f2928n = matrix;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$k0 */
    public static class C4784k0 extends AbstractC4781j {

        /* renamed from: m */
        public C4791o f2929m;

        /* renamed from: n */
        public C4791o f2930n;

        /* renamed from: o */
        public C4791o f2931o;

        /* renamed from: p */
        public C4791o f2932p;

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "linearGradient";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$l */
    public static class C4785l extends AbstractC4774f0 implements InterfaceC4787m {

        /* renamed from: o */
        public Matrix f2933o;

        @Override // com.caverock.androidsvg.SVG.InterfaceC4787m
        /* renamed from: k */
        public void mo3018k(Matrix matrix) {
            this.f2933o = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "group";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$l0 */
    public static class C4786l0 {

        /* renamed from: a */
        public SVG f2934a;

        /* renamed from: b */
        public InterfaceC4778h0 f2935b;

        /* renamed from: n */
        public abstract String mo3000n();
    }

    /* renamed from: com.caverock.androidsvg.SVG$m */
    public interface InterfaceC4787m {
        /* renamed from: k */
        void mo3018k(Matrix matrix);
    }

    /* renamed from: com.caverock.androidsvg.SVG$m0 */
    public static abstract class AbstractC4788m0 implements Cloneable {
    }

    /* renamed from: com.caverock.androidsvg.SVG$n */
    public static class C4789n extends AbstractC4790n0 implements InterfaceC4787m {

        /* renamed from: p */
        public String f2936p;

        /* renamed from: q */
        public C4791o f2937q;

        /* renamed from: r */
        public C4791o f2938r;

        /* renamed from: s */
        public C4791o f2939s;

        /* renamed from: t */
        public C4791o f2940t;

        /* renamed from: u */
        public Matrix f2941u;

        @Override // com.caverock.androidsvg.SVG.InterfaceC4787m
        /* renamed from: k */
        public void mo3018k(Matrix matrix) {
            this.f2941u = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "image";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$n0 */
    public static abstract class AbstractC4790n0 extends AbstractC4774f0 {

        /* renamed from: o */
        public PreserveAspectRatio f2942o = null;
    }

    /* renamed from: com.caverock.androidsvg.SVG$o0 */
    public static class C4792o0 extends AbstractC4781j {

        /* renamed from: m */
        public C4791o f2945m;

        /* renamed from: n */
        public C4791o f2946n;

        /* renamed from: o */
        public C4791o f2947o;

        /* renamed from: p */
        public C4791o f2948p;

        /* renamed from: q */
        public C4791o f2949q;

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "radialGradient";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$p */
    public static class C4793p extends AbstractC4783k {

        /* renamed from: o */
        public C4791o f2950o;

        /* renamed from: p */
        public C4791o f2951p;

        /* renamed from: q */
        public C4791o f2952q;

        /* renamed from: r */
        public C4791o f2953r;

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "line";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$p0 */
    public static abstract class AbstractC4794p0 extends AbstractC4790n0 {

        /* renamed from: p */
        public C4763b f2954p;
    }

    /* renamed from: com.caverock.androidsvg.SVG$q */
    public static class C4795q extends AbstractC4794p0 implements InterfaceC4799s {

        /* renamed from: q */
        public boolean f2955q;

        /* renamed from: r */
        public C4791o f2956r;

        /* renamed from: s */
        public C4791o f2957s;

        /* renamed from: t */
        public C4791o f2958t;

        /* renamed from: u */
        public C4791o f2959u;

        /* renamed from: v */
        public Float f2960v;

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return RequestParameters.MARKER;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$q0 */
    public static class C4796q0 extends C4785l {
        @Override // com.caverock.androidsvg.SVG.C4785l, com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "switch";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$r */
    public static class C4797r extends AbstractC4774f0 implements InterfaceC4799s {

        /* renamed from: o */
        public Boolean f2961o;

        /* renamed from: p */
        public Boolean f2962p;

        /* renamed from: q */
        public C4791o f2963q;

        /* renamed from: r */
        public C4791o f2964r;

        /* renamed from: s */
        public C4791o f2965s;

        /* renamed from: t */
        public C4791o f2966t;

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "mask";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$r0 */
    public static class C4798r0 extends AbstractC4794p0 implements InterfaceC4799s {
        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "symbol";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$s */
    public interface InterfaceC4799s {
    }

    /* renamed from: com.caverock.androidsvg.SVG$s0 */
    public static class C4800s0 extends AbstractC4808w0 implements InterfaceC4806v0 {

        /* renamed from: o */
        public String f2967o;

        /* renamed from: p */
        public InterfaceC4814z0 f2968p;

        @Override // com.caverock.androidsvg.SVG.InterfaceC4806v0
        /* renamed from: d */
        public InterfaceC4814z0 mo3001d() {
            return this.f2968p;
        }

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "tref";
        }

        /* renamed from: o */
        public void m3027o(InterfaceC4814z0 interfaceC4814z0) {
            this.f2968p = interfaceC4814z0;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$t */
    public static class C4801t extends AbstractC4788m0 {

        /* renamed from: a */
        public String f2969a;

        /* renamed from: b */
        public AbstractC4788m0 f2970b;

        public C4801t(String str, AbstractC4788m0 abstractC4788m0) {
            this.f2969a = str;
            this.f2970b = abstractC4788m0;
        }

        public String toString() {
            return this.f2969a + " " + this.f2970b;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$t0 */
    public static class C4802t0 extends AbstractC4812y0 implements InterfaceC4806v0 {

        /* renamed from: s */
        public InterfaceC4814z0 f2971s;

        @Override // com.caverock.androidsvg.SVG.InterfaceC4806v0
        /* renamed from: d */
        public InterfaceC4814z0 mo3001d() {
            return this.f2971s;
        }

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "tspan";
        }

        /* renamed from: o */
        public void m3028o(InterfaceC4814z0 interfaceC4814z0) {
            this.f2971s = interfaceC4814z0;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$u */
    public static class C4803u extends AbstractC4783k {

        /* renamed from: o */
        public C4805v f2972o;

        /* renamed from: p */
        public Float f2973p;

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "path";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$u0 */
    public static class C4804u0 extends AbstractC4812y0 implements InterfaceC4814z0, InterfaceC4787m {

        /* renamed from: s */
        public Matrix f2974s;

        @Override // com.caverock.androidsvg.SVG.InterfaceC4787m
        /* renamed from: k */
        public void mo3018k(Matrix matrix) {
            this.f2974s = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "text";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$v */
    public static class C4805v implements InterfaceC4807w {

        /* renamed from: b */
        public int f2976b = 0;

        /* renamed from: d */
        public int f2978d = 0;

        /* renamed from: a */
        public byte[] f2975a = new byte[8];

        /* renamed from: c */
        public float[] f2977c = new float[16];

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        /* renamed from: a */
        public void mo3029a(float f6, float f7, float f8, float f9) {
            m3031c((byte) 3);
            m3032d(4);
            float[] fArr = this.f2977c;
            int i6 = this.f2978d;
            int i7 = i6 + 1;
            this.f2978d = i7;
            fArr[i6] = f6;
            int i8 = i6 + 2;
            this.f2978d = i8;
            fArr[i7] = f7;
            int i9 = i6 + 3;
            this.f2978d = i9;
            fArr[i8] = f8;
            this.f2978d = i6 + 4;
            fArr[i9] = f9;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        /* renamed from: b */
        public void mo3030b(float f6, float f7, float f8, boolean z6, boolean z7, float f9, float f10) {
            m3031c((byte) ((z6 ? 2 : 0) | 4 | (z7 ? 1 : 0)));
            m3032d(5);
            float[] fArr = this.f2977c;
            int i6 = this.f2978d;
            int i7 = i6 + 1;
            this.f2978d = i7;
            fArr[i6] = f6;
            int i8 = i6 + 2;
            this.f2978d = i8;
            fArr[i7] = f7;
            int i9 = i6 + 3;
            this.f2978d = i9;
            fArr[i8] = f8;
            int i10 = i6 + 4;
            this.f2978d = i10;
            fArr[i9] = f9;
            this.f2978d = i6 + 5;
            fArr[i10] = f10;
        }

        /* renamed from: c */
        public final void m3031c(byte b7) {
            int i6 = this.f2976b;
            byte[] bArr = this.f2975a;
            if (i6 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f2975a = bArr2;
            }
            byte[] bArr3 = this.f2975a;
            int i7 = this.f2976b;
            this.f2976b = i7 + 1;
            bArr3[i7] = b7;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        public void close() {
            m3031c((byte) 8);
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        public void cubicTo(float f6, float f7, float f8, float f9, float f10, float f11) {
            m3031c((byte) 2);
            m3032d(6);
            float[] fArr = this.f2977c;
            int i6 = this.f2978d;
            int i7 = i6 + 1;
            this.f2978d = i7;
            fArr[i6] = f6;
            int i8 = i6 + 2;
            this.f2978d = i8;
            fArr[i7] = f7;
            int i9 = i6 + 3;
            this.f2978d = i9;
            fArr[i8] = f8;
            int i10 = i6 + 4;
            this.f2978d = i10;
            fArr[i9] = f9;
            int i11 = i6 + 5;
            this.f2978d = i11;
            fArr[i10] = f10;
            this.f2978d = i6 + 6;
            fArr[i11] = f11;
        }

        /* renamed from: d */
        public final void m3032d(int i6) {
            float[] fArr = this.f2977c;
            if (fArr.length < this.f2978d + i6) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f2977c = fArr2;
            }
        }

        /* renamed from: e */
        public void m3033e(InterfaceC4807w interfaceC4807w) {
            int i6 = 0;
            for (int i7 = 0; i7 < this.f2976b; i7++) {
                byte b7 = this.f2975a[i7];
                if (b7 == 0) {
                    float[] fArr = this.f2977c;
                    int i8 = i6 + 1;
                    float f6 = fArr[i6];
                    i6 += 2;
                    interfaceC4807w.moveTo(f6, fArr[i8]);
                } else if (b7 == 1) {
                    float[] fArr2 = this.f2977c;
                    int i9 = i6 + 1;
                    float f7 = fArr2[i6];
                    i6 += 2;
                    interfaceC4807w.lineTo(f7, fArr2[i9]);
                } else if (b7 == 2) {
                    float[] fArr3 = this.f2977c;
                    interfaceC4807w.cubicTo(fArr3[i6], fArr3[i6 + 1], fArr3[i6 + 2], fArr3[i6 + 3], fArr3[i6 + 4], fArr3[i6 + 5]);
                    i6 += 6;
                } else if (b7 == 3) {
                    float[] fArr4 = this.f2977c;
                    float f8 = fArr4[i6];
                    float f9 = fArr4[i6 + 1];
                    int i10 = i6 + 3;
                    float f10 = fArr4[i6 + 2];
                    i6 += 4;
                    interfaceC4807w.mo3029a(f8, f9, f10, fArr4[i10]);
                } else if (b7 != 8) {
                    boolean z6 = (b7 & 2) != 0;
                    boolean z7 = (b7 & 1) != 0;
                    float[] fArr5 = this.f2977c;
                    interfaceC4807w.mo3030b(fArr5[i6], fArr5[i6 + 1], fArr5[i6 + 2], z6, z7, fArr5[i6 + 3], fArr5[i6 + 4]);
                    i6 += 5;
                } else {
                    interfaceC4807w.close();
                }
            }
        }

        /* renamed from: f */
        public boolean m3034f() {
            return this.f2976b == 0;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        public void lineTo(float f6, float f7) {
            m3031c((byte) 1);
            m3032d(2);
            float[] fArr = this.f2977c;
            int i6 = this.f2978d;
            int i7 = i6 + 1;
            this.f2978d = i7;
            fArr[i6] = f6;
            this.f2978d = i6 + 2;
            fArr[i7] = f7;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        public void moveTo(float f6, float f7) {
            m3031c((byte) 0);
            m3032d(2);
            float[] fArr = this.f2977c;
            int i6 = this.f2978d;
            int i7 = i6 + 1;
            this.f2978d = i7;
            fArr[i6] = f6;
            this.f2978d = i6 + 2;
            fArr[i7] = f7;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$v0 */
    public interface InterfaceC4806v0 {
        /* renamed from: d */
        InterfaceC4814z0 mo3001d();
    }

    /* renamed from: com.caverock.androidsvg.SVG$w */
    public interface InterfaceC4807w {
        /* renamed from: a */
        void mo3029a(float f6, float f7, float f8, float f9);

        /* renamed from: b */
        void mo3030b(float f6, float f7, float f8, boolean z6, boolean z7, float f9, float f10);

        void close();

        void cubicTo(float f6, float f7, float f8, float f9, float f10, float f11);

        void lineTo(float f6, float f7);

        void moveTo(float f6, float f7);
    }

    /* renamed from: com.caverock.androidsvg.SVG$w0 */
    public static abstract class AbstractC4808w0 extends AbstractC4774f0 {
        @Override // com.caverock.androidsvg.SVG.AbstractC4774f0, com.caverock.androidsvg.SVG.InterfaceC4778h0
        /* renamed from: h */
        public void mo3006h(C4786l0 c4786l0) throws SVGParseException {
            if (c4786l0 instanceof InterfaceC4806v0) {
                this.f2901i.add(c4786l0);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + c4786l0 + " elements.");
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$x */
    public static class C4809x extends AbstractC4794p0 implements InterfaceC4799s {

        /* renamed from: q */
        public Boolean f2979q;

        /* renamed from: r */
        public Boolean f2980r;

        /* renamed from: s */
        public Matrix f2981s;

        /* renamed from: t */
        public C4791o f2982t;

        /* renamed from: u */
        public C4791o f2983u;

        /* renamed from: v */
        public C4791o f2984v;

        /* renamed from: w */
        public C4791o f2985w;

        /* renamed from: x */
        public String f2986x;

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "pattern";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$x0 */
    public static class C4810x0 extends AbstractC4808w0 implements InterfaceC4806v0 {

        /* renamed from: o */
        public String f2987o;

        /* renamed from: p */
        public C4791o f2988p;

        /* renamed from: q */
        public InterfaceC4814z0 f2989q;

        @Override // com.caverock.androidsvg.SVG.InterfaceC4806v0
        /* renamed from: d */
        public InterfaceC4814z0 mo3001d() {
            return this.f2989q;
        }

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "textPath";
        }

        /* renamed from: o */
        public void m3035o(InterfaceC4814z0 interfaceC4814z0) {
            this.f2989q = interfaceC4814z0;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$y */
    public static class C4811y extends AbstractC4783k {

        /* renamed from: o */
        public float[] f2990o;

        @Override // com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "polyline";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$y0 */
    public static abstract class AbstractC4812y0 extends AbstractC4808w0 {

        /* renamed from: o */
        public List f2991o;

        /* renamed from: p */
        public List f2992p;

        /* renamed from: q */
        public List f2993q;

        /* renamed from: r */
        public List f2994r;
    }

    /* renamed from: com.caverock.androidsvg.SVG$z */
    public static class C4813z extends C4811y {
        @Override // com.caverock.androidsvg.SVG.C4811y, com.caverock.androidsvg.SVG.C4786l0
        /* renamed from: n */
        public String mo3000n() {
            return "polygon";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$z0 */
    public interface InterfaceC4814z0 {
    }

    /* renamed from: g */
    public static AbstractC6217c m2981g() {
        return null;
    }

    /* renamed from: h */
    public static SVG m2982h(InputStream inputStream) {
        return new SVGParser().m3150z(inputStream, f2771g);
    }

    /* renamed from: a */
    public void m2983a(CSSParser.C4757n c4757n) {
        this.f2776e.m2965b(c4757n);
    }

    /* renamed from: b */
    public void m2984b() {
        this.f2776e.m2968e(CSSParser.Source.RenderOptions);
    }

    /* renamed from: c */
    public final String m2985c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", SignParameters.NEW_LINE);
    }

    /* renamed from: d */
    public List m2986d() {
        return this.f2776e.m2966c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final AbstractC4782j0 m2987e(InterfaceC4778h0 interfaceC4778h0, String str) {
        AbstractC4782j0 abstractC4782j0M2987e;
        AbstractC4782j0 abstractC4782j0 = (AbstractC4782j0) interfaceC4778h0;
        if (str.equals(abstractC4782j0.f2923c)) {
            return abstractC4782j0;
        }
        for (Object obj : interfaceC4778h0.getChildren()) {
            if (obj instanceof AbstractC4782j0) {
                AbstractC4782j0 abstractC4782j02 = (AbstractC4782j0) obj;
                if (str.equals(abstractC4782j02.f2923c)) {
                    return abstractC4782j02;
                }
                if ((obj instanceof InterfaceC4778h0) && (abstractC4782j0M2987e = m2987e((InterfaceC4778h0) obj, str)) != null) {
                    return abstractC4782j0M2987e;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public AbstractC4782j0 m2988f(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f2772a.f2923c)) {
            return this.f2772a;
        }
        if (this.f2777f.containsKey(str)) {
            return (AbstractC4782j0) this.f2777f.get(str);
        }
        AbstractC4782j0 abstractC4782j0M2987e = m2987e(this.f2772a, str);
        this.f2777f.put(str, abstractC4782j0M2987e);
        return abstractC4782j0M2987e;
    }

    /* renamed from: i */
    public C4770d0 m2989i() {
        return this.f2772a;
    }

    /* renamed from: j */
    public boolean m2990j() {
        return !this.f2776e.m2967d();
    }

    /* renamed from: k */
    public Picture m2991k() {
        return m2993m(null);
    }

    /* renamed from: l */
    public Picture m2992l(int i6, int i7, C4823a c4823a) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i6, i7);
        if (c4823a == null || c4823a.f3150f == null) {
            c4823a = c4823a == null ? new C4823a() : new C4823a(c4823a);
            c4823a.m3190g(0.0f, 0.0f, i6, i7);
        }
        new C4824b(canvasBeginRecording, this.f2775d).m3219G0(this, c4823a);
        picture.endRecording();
        return picture;
    }

    /* renamed from: m */
    public Picture m2993m(C4823a c4823a) {
        C4791o c4791o;
        C4763b c4763b = (c4823a == null || !c4823a.m3188e()) ? this.f2772a.f2954p : c4823a.f3148d;
        if (c4823a != null && c4823a.m3189f()) {
            return m2992l((int) Math.ceil(c4823a.f3150f.m3003b()), (int) Math.ceil(c4823a.f3150f.m3004c()), c4823a);
        }
        C4770d0 c4770d0 = this.f2772a;
        C4791o c4791o2 = c4770d0.f2894s;
        if (c4791o2 != null) {
            Unit unit = c4791o2.f2944b;
            Unit unit2 = Unit.percent;
            if (unit != unit2 && (c4791o = c4770d0.f2895t) != null && c4791o.f2944b != unit2) {
                return m2992l((int) Math.ceil(c4791o2.m3020d(this.f2775d)), (int) Math.ceil(this.f2772a.f2895t.m3020d(this.f2775d)), c4823a);
            }
        }
        if (c4791o2 != null && c4763b != null) {
            return m2992l((int) Math.ceil(c4791o2.m3020d(this.f2775d)), (int) Math.ceil((c4763b.f2878d * r1) / c4763b.f2877c), c4823a);
        }
        C4791o c4791o3 = c4770d0.f2895t;
        if (c4791o3 == null || c4763b == null) {
            return m2992l(512, 512, c4823a);
        }
        return m2992l((int) Math.ceil((c4763b.f2877c * r1) / c4763b.f2878d), (int) Math.ceil(c4791o3.m3020d(this.f2775d)), c4823a);
    }

    /* renamed from: n */
    public C4786l0 m2994n(String str) {
        if (str == null) {
            return null;
        }
        String strM2985c = m2985c(str);
        if (strM2985c.length() <= 1 || !strM2985c.startsWith("#")) {
            return null;
        }
        return m2988f(strM2985c.substring(1));
    }

    /* renamed from: o */
    public void m2995o(String str) {
        this.f2774c = str;
    }

    /* renamed from: p */
    public void m2996p(C4770d0 c4770d0) {
        this.f2772a = c4770d0;
    }

    /* renamed from: q */
    public void m2997q(String str) {
        this.f2773b = str;
    }

    /* renamed from: com.caverock.androidsvg.SVG$o */
    public static class C4791o implements Cloneable {

        /* renamed from: a */
        public float f2943a;

        /* renamed from: b */
        public Unit f2944b;

        public C4791o(float f6, Unit unit) {
            this.f2943a = f6;
            this.f2944b = unit;
        }

        /* renamed from: b */
        public float m3019b() {
            return this.f2943a;
        }

        /* renamed from: d */
        public float m3020d(float f6) {
            int i6 = C4760a.f2866a[this.f2944b.ordinal()];
            if (i6 == 1) {
                return this.f2943a;
            }
            switch (i6) {
                case 4:
                    return this.f2943a * f6;
                case 5:
                    return (this.f2943a * f6) / 2.54f;
                case 6:
                    return (this.f2943a * f6) / 25.4f;
                case 7:
                    return (this.f2943a * f6) / 72.0f;
                case 8:
                    return (this.f2943a * f6) / 6.0f;
                default:
                    return this.f2943a;
            }
        }

        /* renamed from: e */
        public float m3021e(C4824b c4824b) {
            if (this.f2944b != Unit.percent) {
                return m3023h(c4824b);
            }
            C4763b c4763bM3242S = c4824b.m3242S();
            if (c4763bM3242S == null) {
                return this.f2943a;
            }
            float f6 = c4763bM3242S.f2877c;
            if (f6 == c4763bM3242S.f2878d) {
                return (this.f2943a * f6) / 100.0f;
            }
            return (this.f2943a * ((float) (Math.sqrt((f6 * f6) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        /* renamed from: f */
        public float m3022f(C4824b c4824b, float f6) {
            return this.f2944b == Unit.percent ? (this.f2943a * f6) / 100.0f : m3023h(c4824b);
        }

        /* renamed from: h */
        public float m3023h(C4824b c4824b) {
            switch (C4760a.f2866a[this.f2944b.ordinal()]) {
                case 9:
                    C4763b c4763bM3242S = c4824b.m3242S();
                    if (c4763bM3242S != null) {
                        break;
                    } else {
                        break;
                    }
            }
            return this.f2943a;
        }

        /* renamed from: i */
        public float m3024i(C4824b c4824b) {
            if (this.f2944b != Unit.percent) {
                return m3023h(c4824b);
            }
            C4763b c4763bM3242S = c4824b.m3242S();
            return c4763bM3242S == null ? this.f2943a : (this.f2943a * c4763bM3242S.f2878d) / 100.0f;
        }

        /* renamed from: j */
        public boolean m3025j() {
            return this.f2943a < 0.0f;
        }

        /* renamed from: k */
        public boolean m3026k() {
            return this.f2943a == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f2943a) + this.f2944b;
        }

        public C4791o(float f6) {
            this.f2943a = f6;
            this.f2944b = Unit.px;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$b */
    public static class C4763b {

        /* renamed from: a */
        public float f2875a;

        /* renamed from: b */
        public float f2876b;

        /* renamed from: c */
        public float f2877c;

        /* renamed from: d */
        public float f2878d;

        public C4763b(float f6, float f7, float f8, float f9) {
            this.f2875a = f6;
            this.f2876b = f7;
            this.f2877c = f8;
            this.f2878d = f9;
        }

        /* renamed from: a */
        public static C4763b m3002a(float f6, float f7, float f8, float f9) {
            return new C4763b(f6, f7, f8 - f6, f9 - f7);
        }

        /* renamed from: b */
        public float m3003b() {
            return this.f2875a + this.f2877c;
        }

        /* renamed from: c */
        public float m3004c() {
            return this.f2876b + this.f2878d;
        }

        /* renamed from: d */
        public void m3005d(C4763b c4763b) {
            float f6 = c4763b.f2875a;
            if (f6 < this.f2875a) {
                this.f2875a = f6;
            }
            float f7 = c4763b.f2876b;
            if (f7 < this.f2876b) {
                this.f2876b = f7;
            }
            if (c4763b.m3003b() > m3003b()) {
                this.f2877c = c4763b.m3003b() - this.f2875a;
            }
            if (c4763b.m3004c() > m3004c()) {
                this.f2878d = c4763b.m3004c() - this.f2876b;
            }
        }

        public String toString() {
            return "[" + this.f2875a + " " + this.f2876b + " " + this.f2877c + " " + this.f2878d + "]";
        }

        public C4763b(C4763b c4763b) {
            this.f2875a = c4763b.f2875a;
            this.f2876b = c4763b.f2876b;
            this.f2877c = c4763b.f2877c;
            this.f2878d = c4763b.f2878d;
        }
    }
}
