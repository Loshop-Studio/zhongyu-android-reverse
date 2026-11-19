package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.caverock.androidsvg.CSSParser;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p133i1.AbstractC8129c;

/* loaded from: classes3.dex */
public class SVG {

    /* renamed from: g */
    public static boolean f4092g = true;

    /* renamed from: a */
    public C5570d0 f4093a = null;

    /* renamed from: b */
    public String f4094b = "";

    /* renamed from: c */
    public String f4095c = "";

    /* renamed from: d */
    public float f4096d = 96.0f;

    /* renamed from: e */
    public CSSParser.C5557n f4097e = new CSSParser.C5557n();

    /* renamed from: f */
    public Map f4098f = new HashMap();

    public enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    public static class Style implements Cloneable {

        /* renamed from: A */
        public Boolean f4103A;

        /* renamed from: B */
        public Boolean f4104B;

        /* renamed from: C */
        public AbstractC5588m0 f4105C;

        /* renamed from: D */
        public Float f4106D;

        /* renamed from: E */
        public String f4107E;

        /* renamed from: F */
        public FillRule f4108F;

        /* renamed from: G */
        public String f4109G;

        /* renamed from: H */
        public AbstractC5588m0 f4110H;

        /* renamed from: I */
        public Float f4111I;

        /* renamed from: J */
        public AbstractC5588m0 f4112J;

        /* renamed from: K */
        public Float f4113K;

        /* renamed from: L */
        public VectorEffect f4114L;

        /* renamed from: M */
        public RenderQuality f4115M;

        /* renamed from: a */
        public long f4116a = 0;

        /* renamed from: b */
        public AbstractC5588m0 f4117b;

        /* renamed from: c */
        public FillRule f4118c;

        /* renamed from: d */
        public Float f4119d;

        /* renamed from: e */
        public AbstractC5588m0 f4120e;

        /* renamed from: f */
        public Float f4121f;

        /* renamed from: g */
        public C5591o f4122g;

        /* renamed from: h */
        public LineCap f4123h;

        /* renamed from: i */
        public LineJoin f4124i;

        /* renamed from: j */
        public Float f4125j;

        /* renamed from: k */
        public C5591o[] f4126k;

        /* renamed from: l */
        public C5591o f4127l;

        /* renamed from: m */
        public Float f4128m;

        /* renamed from: n */
        public C5573f f4129n;

        /* renamed from: o */
        public List f4130o;

        /* renamed from: p */
        public C5591o f4131p;

        /* renamed from: q */
        public Integer f4132q;

        /* renamed from: r */
        public FontStyle f4133r;

        /* renamed from: s */
        public TextDecoration f4134s;

        /* renamed from: t */
        public TextDirection f4135t;

        /* renamed from: u */
        public TextAnchor f4136u;

        /* renamed from: v */
        public Boolean f4137v;

        /* renamed from: w */
        public C5566c f4138w;

        /* renamed from: x */
        public String f4139x;

        /* renamed from: y */
        public String f4140y;

        /* renamed from: z */
        public String f4141z;

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
        public static Style m3690b() {
            Style style = new Style();
            style.f4116a = -1L;
            C5573f c5573f = C5573f.f4219b;
            style.f4117b = c5573f;
            FillRule fillRule = FillRule.NonZero;
            style.f4118c = fillRule;
            Float fValueOf = Float.valueOf(1.0f);
            style.f4119d = fValueOf;
            style.f4120e = null;
            style.f4121f = fValueOf;
            style.f4122g = new C5591o(1.0f);
            style.f4123h = LineCap.Butt;
            style.f4124i = LineJoin.Miter;
            style.f4125j = Float.valueOf(4.0f);
            style.f4126k = null;
            style.f4127l = new C5591o(0.0f);
            style.f4128m = fValueOf;
            style.f4129n = c5573f;
            style.f4130o = null;
            style.f4131p = new C5591o(12.0f, Unit.pt);
            style.f4132q = 400;
            style.f4133r = FontStyle.Normal;
            style.f4134s = TextDecoration.None;
            style.f4135t = TextDirection.LTR;
            style.f4136u = TextAnchor.Start;
            Boolean bool = Boolean.TRUE;
            style.f4137v = bool;
            style.f4138w = null;
            style.f4139x = null;
            style.f4140y = null;
            style.f4141z = null;
            style.f4103A = bool;
            style.f4104B = bool;
            style.f4105C = c5573f;
            style.f4106D = fValueOf;
            style.f4107E = null;
            style.f4108F = fillRule;
            style.f4109G = null;
            style.f4110H = null;
            style.f4111I = fValueOf;
            style.f4112J = null;
            style.f4113K = fValueOf;
            style.f4114L = VectorEffect.None;
            style.f4115M = RenderQuality.auto;
            return style;
        }

        public Object clone() {
            Style style = (Style) super.clone();
            C5591o[] c5591oArr = this.f4126k;
            if (c5591oArr != null) {
                style.f4126k = (C5591o[]) c5591oArr.clone();
            }
            return style;
        }

        /* renamed from: d */
        public void m3691d(boolean z9) {
            Float fValueOf = Float.valueOf(1.0f);
            Boolean bool = Boolean.TRUE;
            this.f4103A = bool;
            if (!z9) {
                bool = Boolean.FALSE;
            }
            this.f4137v = bool;
            this.f4138w = null;
            this.f4107E = null;
            this.f4128m = fValueOf;
            this.f4105C = C5573f.f4219b;
            this.f4106D = fValueOf;
            this.f4109G = null;
            this.f4110H = null;
            this.f4111I = fValueOf;
            this.f4112J = null;
            this.f4113K = fValueOf;
            this.f4114L = VectorEffect.None;
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
    public static /* synthetic */ class C5560a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4187a;

        static {
            int[] iArr = new int[Unit.values().length];
            f4187a = iArr;
            try {
                iArr[Unit.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4187a[Unit.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4187a[Unit.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4187a[Unit.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4187a[Unit.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4187a[Unit.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4187a[Unit.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4187a[Unit.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4187a[Unit.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$a0 */
    public static class C5561a0 extends AbstractC5583k {

        /* renamed from: o */
        public C5591o f4188o;

        /* renamed from: p */
        public C5591o f4189p;

        /* renamed from: q */
        public C5591o f4190q;

        /* renamed from: r */
        public C5591o f4191r;

        /* renamed from: s */
        public C5591o f4192s;

        /* renamed from: t */
        public C5591o f4193t;

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "rect";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$a1 */
    public static class C5562a1 extends C5586l0 implements InterfaceC5606v0 {

        /* renamed from: c */
        public String f4194c;

        /* renamed from: d */
        public InterfaceC5614z0 f4195d;

        public C5562a1(String str) {
            this.f4194c = str;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5606v0
        /* renamed from: d */
        public InterfaceC5614z0 mo3693d() {
            return this.f4195d;
        }

        public String toString() {
            return "TextChild: '" + this.f4194c + "'";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$b0 */
    public static class C5564b0 extends AbstractC5582j0 implements InterfaceC5578h0 {
        @Override // com.caverock.androidsvg.SVG.InterfaceC5578h0
        public List getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5578h0
        /* renamed from: h */
        public void mo3699h(C5586l0 c5586l0) {
        }

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "solidColor";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$b1 */
    public static class C5565b1 extends C5585l {

        /* renamed from: p */
        public String f4200p;

        /* renamed from: q */
        public C5591o f4201q;

        /* renamed from: r */
        public C5591o f4202r;

        /* renamed from: s */
        public C5591o f4203s;

        /* renamed from: t */
        public C5591o f4204t;

        @Override // com.caverock.androidsvg.SVG.C5585l, com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "use";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$c */
    public static class C5566c {

        /* renamed from: a */
        public C5591o f4205a;

        /* renamed from: b */
        public C5591o f4206b;

        /* renamed from: c */
        public C5591o f4207c;

        /* renamed from: d */
        public C5591o f4208d;

        public C5566c(C5591o c5591o, C5591o c5591o2, C5591o c5591o3, C5591o c5591o4) {
            this.f4205a = c5591o;
            this.f4206b = c5591o2;
            this.f4207c = c5591o3;
            this.f4208d = c5591o4;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$c0 */
    public static class C5567c0 extends AbstractC5582j0 implements InterfaceC5578h0 {

        /* renamed from: h */
        public Float f4209h;

        @Override // com.caverock.androidsvg.SVG.InterfaceC5578h0
        public List getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5578h0
        /* renamed from: h */
        public void mo3699h(C5586l0 c5586l0) {
        }

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "stop";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$c1 */
    public static class C5568c1 extends AbstractC5594p0 implements InterfaceC5599s {
        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "view";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$d */
    public static class C5569d extends AbstractC5583k {

        /* renamed from: o */
        public C5591o f4210o;

        /* renamed from: p */
        public C5591o f4211p;

        /* renamed from: q */
        public C5591o f4212q;

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "circle";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$d0 */
    public static class C5570d0 extends AbstractC5594p0 {

        /* renamed from: q */
        public C5591o f4213q;

        /* renamed from: r */
        public C5591o f4214r;

        /* renamed from: s */
        public C5591o f4215s;

        /* renamed from: t */
        public C5591o f4216t;

        /* renamed from: u */
        public String f4217u;

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "svg";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$e */
    public static class C5571e extends C5585l implements InterfaceC5599s {

        /* renamed from: p */
        public Boolean f4218p;

        @Override // com.caverock.androidsvg.SVG.C5585l, com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "clipPath";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$e0 */
    public interface InterfaceC5572e0 {
        /* renamed from: a */
        Set mo3700a();

        /* renamed from: b */
        String mo3701b();

        /* renamed from: c */
        void mo3702c(Set set);

        /* renamed from: e */
        void mo3703e(Set set);

        /* renamed from: f */
        Set mo3704f();

        /* renamed from: g */
        void mo3705g(Set set);

        /* renamed from: i */
        void mo3706i(Set set);

        /* renamed from: j */
        void mo3707j(String str);

        /* renamed from: l */
        Set mo3708l();

        /* renamed from: m */
        Set mo3709m();
    }

    /* renamed from: com.caverock.androidsvg.SVG$f */
    public static class C5573f extends AbstractC5588m0 {

        /* renamed from: b */
        public static final C5573f f4219b = new C5573f(ViewCompat.MEASURED_STATE_MASK);

        /* renamed from: c */
        public static final C5573f f4220c = new C5573f(0);

        /* renamed from: a */
        public int f4221a;

        public C5573f(int i9) {
            this.f4221a = i9;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f4221a));
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$f0 */
    public static abstract class AbstractC5574f0 extends AbstractC5580i0 implements InterfaceC5578h0, InterfaceC5572e0 {

        /* renamed from: i */
        public List f4222i = new ArrayList();

        /* renamed from: j */
        public Set f4223j = null;

        /* renamed from: k */
        public String f4224k = null;

        /* renamed from: l */
        public Set f4225l = null;

        /* renamed from: m */
        public Set f4226m = null;

        /* renamed from: n */
        public Set f4227n = null;

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: a */
        public Set mo3700a() {
            return null;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: b */
        public String mo3701b() {
            return this.f4224k;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: c */
        public void mo3702c(Set set) {
            this.f4227n = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: e */
        public void mo3703e(Set set) {
            this.f4223j = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: f */
        public Set mo3704f() {
            return this.f4223j;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: g */
        public void mo3705g(Set set) {
            this.f4225l = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5578h0
        public List getChildren() {
            return this.f4222i;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5578h0
        /* renamed from: h */
        public void mo3699h(C5586l0 c5586l0) {
            this.f4222i.add(c5586l0);
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: i */
        public void mo3706i(Set set) {
            this.f4226m = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: j */
        public void mo3707j(String str) {
            this.f4224k = str;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: l */
        public Set mo3708l() {
            return this.f4226m;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: m */
        public Set mo3709m() {
            return this.f4227n;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$g */
    public static class C5575g extends AbstractC5588m0 {

        /* renamed from: a */
        public static C5575g f4228a = new C5575g();

        /* renamed from: b */
        public static C5575g m3710b() {
            return f4228a;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$g0 */
    public static abstract class AbstractC5576g0 extends AbstractC5580i0 implements InterfaceC5572e0 {

        /* renamed from: i */
        public Set f4229i = null;

        /* renamed from: j */
        public String f4230j = null;

        /* renamed from: k */
        public Set f4231k = null;

        /* renamed from: l */
        public Set f4232l = null;

        /* renamed from: m */
        public Set f4233m = null;

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: a */
        public Set mo3700a() {
            return this.f4231k;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: b */
        public String mo3701b() {
            return this.f4230j;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: c */
        public void mo3702c(Set set) {
            this.f4233m = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: e */
        public void mo3703e(Set set) {
            this.f4229i = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: f */
        public Set mo3704f() {
            return this.f4229i;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: g */
        public void mo3705g(Set set) {
            this.f4231k = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: i */
        public void mo3706i(Set set) {
            this.f4232l = set;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: j */
        public void mo3707j(String str) {
            this.f4230j = str;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: l */
        public Set mo3708l() {
            return this.f4232l;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5572e0
        /* renamed from: m */
        public Set mo3709m() {
            return this.f4233m;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$h */
    public static class C5577h extends C5585l implements InterfaceC5599s {
        @Override // com.caverock.androidsvg.SVG.C5585l, com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "defs";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$h0 */
    public interface InterfaceC5578h0 {
        List getChildren();

        /* renamed from: h */
        void mo3699h(C5586l0 c5586l0);
    }

    /* renamed from: com.caverock.androidsvg.SVG$i */
    public static class C5579i extends AbstractC5583k {

        /* renamed from: o */
        public C5591o f4234o;

        /* renamed from: p */
        public C5591o f4235p;

        /* renamed from: q */
        public C5591o f4236q;

        /* renamed from: r */
        public C5591o f4237r;

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "ellipse";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$i0 */
    public static abstract class AbstractC5580i0 extends AbstractC5582j0 {

        /* renamed from: h */
        public C5563b f4238h = null;
    }

    /* renamed from: com.caverock.androidsvg.SVG$j */
    public static abstract class AbstractC5581j extends AbstractC5582j0 implements InterfaceC5578h0 {

        /* renamed from: h */
        public List f4239h = new ArrayList();

        /* renamed from: i */
        public Boolean f4240i;

        /* renamed from: j */
        public Matrix f4241j;

        /* renamed from: k */
        public GradientSpread f4242k;

        /* renamed from: l */
        public String f4243l;

        @Override // com.caverock.androidsvg.SVG.InterfaceC5578h0
        public List getChildren() {
            return this.f4239h;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5578h0
        /* renamed from: h */
        public void mo3699h(C5586l0 c5586l0) throws SVGParseException {
            if (c5586l0 instanceof C5567c0) {
                this.f4239h.add(c5586l0);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + c5586l0 + " elements.");
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$j0 */
    public static abstract class AbstractC5582j0 extends C5586l0 {

        /* renamed from: c */
        public String f4244c = null;

        /* renamed from: d */
        public Boolean f4245d = null;

        /* renamed from: e */
        public Style f4246e = null;

        /* renamed from: f */
        public Style f4247f = null;

        /* renamed from: g */
        public List f4248g = null;

        public String toString() {
            return mo3692n();
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$k */
    public static abstract class AbstractC5583k extends AbstractC5576g0 implements InterfaceC5587m {

        /* renamed from: n */
        public Matrix f4249n;

        @Override // com.caverock.androidsvg.SVG.InterfaceC5587m
        /* renamed from: k */
        public void mo3711k(Matrix matrix) {
            this.f4249n = matrix;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$k0 */
    public static class C5584k0 extends AbstractC5581j {

        /* renamed from: m */
        public C5591o f4250m;

        /* renamed from: n */
        public C5591o f4251n;

        /* renamed from: o */
        public C5591o f4252o;

        /* renamed from: p */
        public C5591o f4253p;

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "linearGradient";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$l */
    public static class C5585l extends AbstractC5574f0 implements InterfaceC5587m {

        /* renamed from: o */
        public Matrix f4254o;

        @Override // com.caverock.androidsvg.SVG.InterfaceC5587m
        /* renamed from: k */
        public void mo3711k(Matrix matrix) {
            this.f4254o = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "group";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$l0 */
    public static class C5586l0 {

        /* renamed from: a */
        public SVG f4255a;

        /* renamed from: b */
        public InterfaceC5578h0 f4256b;

        /* renamed from: n */
        public abstract String mo3692n();
    }

    /* renamed from: com.caverock.androidsvg.SVG$m */
    public interface InterfaceC5587m {
        /* renamed from: k */
        void mo3711k(Matrix matrix);
    }

    /* renamed from: com.caverock.androidsvg.SVG$m0 */
    public static abstract class AbstractC5588m0 implements Cloneable {
    }

    /* renamed from: com.caverock.androidsvg.SVG$n */
    public static class C5589n extends AbstractC5590n0 implements InterfaceC5587m {

        /* renamed from: p */
        public String f4257p;

        /* renamed from: q */
        public C5591o f4258q;

        /* renamed from: r */
        public C5591o f4259r;

        /* renamed from: s */
        public C5591o f4260s;

        /* renamed from: t */
        public C5591o f4261t;

        /* renamed from: u */
        public Matrix f4262u;

        @Override // com.caverock.androidsvg.SVG.InterfaceC5587m
        /* renamed from: k */
        public void mo3711k(Matrix matrix) {
            this.f4262u = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "image";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$n0 */
    public static abstract class AbstractC5590n0 extends AbstractC5574f0 {

        /* renamed from: o */
        public PreserveAspectRatio f4263o = null;
    }

    /* renamed from: com.caverock.androidsvg.SVG$o0 */
    public static class C5592o0 extends AbstractC5581j {

        /* renamed from: m */
        public C5591o f4266m;

        /* renamed from: n */
        public C5591o f4267n;

        /* renamed from: o */
        public C5591o f4268o;

        /* renamed from: p */
        public C5591o f4269p;

        /* renamed from: q */
        public C5591o f4270q;

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "radialGradient";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$p */
    public static class C5593p extends AbstractC5583k {

        /* renamed from: o */
        public C5591o f4271o;

        /* renamed from: p */
        public C5591o f4272p;

        /* renamed from: q */
        public C5591o f4273q;

        /* renamed from: r */
        public C5591o f4274r;

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "line";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$p0 */
    public static abstract class AbstractC5594p0 extends AbstractC5590n0 {

        /* renamed from: p */
        public C5563b f4275p;
    }

    /* renamed from: com.caverock.androidsvg.SVG$q */
    public static class C5595q extends AbstractC5594p0 implements InterfaceC5599s {

        /* renamed from: q */
        public boolean f4276q;

        /* renamed from: r */
        public C5591o f4277r;

        /* renamed from: s */
        public C5591o f4278s;

        /* renamed from: t */
        public C5591o f4279t;

        /* renamed from: u */
        public C5591o f4280u;

        /* renamed from: v */
        public Float f4281v;

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return RequestParameters.MARKER;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$q0 */
    public static class C5596q0 extends C5585l {
        @Override // com.caverock.androidsvg.SVG.C5585l, com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "switch";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$r */
    public static class C5597r extends AbstractC5574f0 implements InterfaceC5599s {

        /* renamed from: o */
        public Boolean f4282o;

        /* renamed from: p */
        public Boolean f4283p;

        /* renamed from: q */
        public C5591o f4284q;

        /* renamed from: r */
        public C5591o f4285r;

        /* renamed from: s */
        public C5591o f4286s;

        /* renamed from: t */
        public C5591o f4287t;

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "mask";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$r0 */
    public static class C5598r0 extends AbstractC5594p0 implements InterfaceC5599s {
        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "symbol";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$s */
    public interface InterfaceC5599s {
    }

    /* renamed from: com.caverock.androidsvg.SVG$s0 */
    public static class C5600s0 extends AbstractC5608w0 implements InterfaceC5606v0 {

        /* renamed from: o */
        public String f4288o;

        /* renamed from: p */
        public InterfaceC5614z0 f4289p;

        @Override // com.caverock.androidsvg.SVG.InterfaceC5606v0
        /* renamed from: d */
        public InterfaceC5614z0 mo3693d() {
            return this.f4289p;
        }

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "tref";
        }

        /* renamed from: o */
        public void m3720o(InterfaceC5614z0 interfaceC5614z0) {
            this.f4289p = interfaceC5614z0;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$t */
    public static class C5601t extends AbstractC5588m0 {

        /* renamed from: a */
        public String f4290a;

        /* renamed from: b */
        public AbstractC5588m0 f4291b;

        public C5601t(String str, AbstractC5588m0 abstractC5588m0) {
            this.f4290a = str;
            this.f4291b = abstractC5588m0;
        }

        public String toString() {
            return this.f4290a + " " + this.f4291b;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$t0 */
    public static class C5602t0 extends AbstractC5612y0 implements InterfaceC5606v0 {

        /* renamed from: s */
        public InterfaceC5614z0 f4292s;

        @Override // com.caverock.androidsvg.SVG.InterfaceC5606v0
        /* renamed from: d */
        public InterfaceC5614z0 mo3693d() {
            return this.f4292s;
        }

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "tspan";
        }

        /* renamed from: o */
        public void m3721o(InterfaceC5614z0 interfaceC5614z0) {
            this.f4292s = interfaceC5614z0;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$u */
    public static class C5603u extends AbstractC5583k {

        /* renamed from: o */
        public C5605v f4293o;

        /* renamed from: p */
        public Float f4294p;

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "path";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$u0 */
    public static class C5604u0 extends AbstractC5612y0 implements InterfaceC5614z0, InterfaceC5587m {

        /* renamed from: s */
        public Matrix f4295s;

        @Override // com.caverock.androidsvg.SVG.InterfaceC5587m
        /* renamed from: k */
        public void mo3711k(Matrix matrix) {
            this.f4295s = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "text";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$v */
    public static class C5605v implements InterfaceC5607w {

        /* renamed from: b */
        public int f4297b = 0;

        /* renamed from: d */
        public int f4299d = 0;

        /* renamed from: a */
        public byte[] f4296a = new byte[8];

        /* renamed from: c */
        public float[] f4298c = new float[16];

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        /* renamed from: a */
        public void mo3722a(float f10, float f11, float f12, float f13) {
            m3724c((byte) 3);
            m3725d(4);
            float[] fArr = this.f4298c;
            int i9 = this.f4299d;
            int i10 = i9 + 1;
            this.f4299d = i10;
            fArr[i9] = f10;
            int i11 = i9 + 2;
            this.f4299d = i11;
            fArr[i10] = f11;
            int i12 = i9 + 3;
            this.f4299d = i12;
            fArr[i11] = f12;
            this.f4299d = i9 + 4;
            fArr[i12] = f13;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        /* renamed from: b */
        public void mo3723b(float f10, float f11, float f12, boolean z9, boolean z10, float f13, float f14) {
            m3724c((byte) ((z9 ? 2 : 0) | 4 | (z10 ? 1 : 0)));
            m3725d(5);
            float[] fArr = this.f4298c;
            int i9 = this.f4299d;
            int i10 = i9 + 1;
            this.f4299d = i10;
            fArr[i9] = f10;
            int i11 = i9 + 2;
            this.f4299d = i11;
            fArr[i10] = f11;
            int i12 = i9 + 3;
            this.f4299d = i12;
            fArr[i11] = f12;
            int i13 = i9 + 4;
            this.f4299d = i13;
            fArr[i12] = f13;
            this.f4299d = i9 + 5;
            fArr[i13] = f14;
        }

        /* renamed from: c */
        public final void m3724c(byte b10) {
            int i9 = this.f4297b;
            byte[] bArr = this.f4296a;
            if (i9 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f4296a = bArr2;
            }
            byte[] bArr3 = this.f4296a;
            int i10 = this.f4297b;
            this.f4297b = i10 + 1;
            bArr3[i10] = b10;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        public void close() {
            m3724c((byte) 8);
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            m3724c((byte) 2);
            m3725d(6);
            float[] fArr = this.f4298c;
            int i9 = this.f4299d;
            int i10 = i9 + 1;
            this.f4299d = i10;
            fArr[i9] = f10;
            int i11 = i9 + 2;
            this.f4299d = i11;
            fArr[i10] = f11;
            int i12 = i9 + 3;
            this.f4299d = i12;
            fArr[i11] = f12;
            int i13 = i9 + 4;
            this.f4299d = i13;
            fArr[i12] = f13;
            int i14 = i9 + 5;
            this.f4299d = i14;
            fArr[i13] = f14;
            this.f4299d = i9 + 6;
            fArr[i14] = f15;
        }

        /* renamed from: d */
        public final void m3725d(int i9) {
            float[] fArr = this.f4298c;
            if (fArr.length < this.f4299d + i9) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f4298c = fArr2;
            }
        }

        /* renamed from: e */
        public void m3726e(InterfaceC5607w interfaceC5607w) {
            int i9 = 0;
            for (int i10 = 0; i10 < this.f4297b; i10++) {
                byte b10 = this.f4296a[i10];
                if (b10 == 0) {
                    float[] fArr = this.f4298c;
                    int i11 = i9 + 1;
                    float f10 = fArr[i9];
                    i9 += 2;
                    interfaceC5607w.moveTo(f10, fArr[i11]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.f4298c;
                    int i12 = i9 + 1;
                    float f11 = fArr2[i9];
                    i9 += 2;
                    interfaceC5607w.lineTo(f11, fArr2[i12]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.f4298c;
                    interfaceC5607w.cubicTo(fArr3[i9], fArr3[i9 + 1], fArr3[i9 + 2], fArr3[i9 + 3], fArr3[i9 + 4], fArr3[i9 + 5]);
                    i9 += 6;
                } else if (b10 == 3) {
                    float[] fArr4 = this.f4298c;
                    float f12 = fArr4[i9];
                    float f13 = fArr4[i9 + 1];
                    int i13 = i9 + 3;
                    float f14 = fArr4[i9 + 2];
                    i9 += 4;
                    interfaceC5607w.mo3722a(f12, f13, f14, fArr4[i13]);
                } else if (b10 != 8) {
                    boolean z9 = (b10 & 2) != 0;
                    boolean z10 = (b10 & 1) != 0;
                    float[] fArr5 = this.f4298c;
                    interfaceC5607w.mo3723b(fArr5[i9], fArr5[i9 + 1], fArr5[i9 + 2], z9, z10, fArr5[i9 + 3], fArr5[i9 + 4]);
                    i9 += 5;
                } else {
                    interfaceC5607w.close();
                }
            }
        }

        /* renamed from: f */
        public boolean m3727f() {
            return this.f4297b == 0;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        public void lineTo(float f10, float f11) {
            m3724c((byte) 1);
            m3725d(2);
            float[] fArr = this.f4298c;
            int i9 = this.f4299d;
            int i10 = i9 + 1;
            this.f4299d = i10;
            fArr[i9] = f10;
            this.f4299d = i9 + 2;
            fArr[i10] = f11;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        public void moveTo(float f10, float f11) {
            m3724c((byte) 0);
            m3725d(2);
            float[] fArr = this.f4298c;
            int i9 = this.f4299d;
            int i10 = i9 + 1;
            this.f4299d = i10;
            fArr[i9] = f10;
            this.f4299d = i9 + 2;
            fArr[i10] = f11;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$v0 */
    public interface InterfaceC5606v0 {
        /* renamed from: d */
        InterfaceC5614z0 mo3693d();
    }

    /* renamed from: com.caverock.androidsvg.SVG$w */
    public interface InterfaceC5607w {
        /* renamed from: a */
        void mo3722a(float f10, float f11, float f12, float f13);

        /* renamed from: b */
        void mo3723b(float f10, float f11, float f12, boolean z9, boolean z10, float f13, float f14);

        void close();

        void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15);

        void lineTo(float f10, float f11);

        void moveTo(float f10, float f11);
    }

    /* renamed from: com.caverock.androidsvg.SVG$w0 */
    public static abstract class AbstractC5608w0 extends AbstractC5574f0 {
        @Override // com.caverock.androidsvg.SVG.AbstractC5574f0, com.caverock.androidsvg.SVG.InterfaceC5578h0
        /* renamed from: h */
        public void mo3699h(C5586l0 c5586l0) throws SVGParseException {
            if (c5586l0 instanceof InterfaceC5606v0) {
                this.f4222i.add(c5586l0);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + c5586l0 + " elements.");
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$x */
    public static class C5609x extends AbstractC5594p0 implements InterfaceC5599s {

        /* renamed from: q */
        public Boolean f4300q;

        /* renamed from: r */
        public Boolean f4301r;

        /* renamed from: s */
        public Matrix f4302s;

        /* renamed from: t */
        public C5591o f4303t;

        /* renamed from: u */
        public C5591o f4304u;

        /* renamed from: v */
        public C5591o f4305v;

        /* renamed from: w */
        public C5591o f4306w;

        /* renamed from: x */
        public String f4307x;

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "pattern";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$x0 */
    public static class C5610x0 extends AbstractC5608w0 implements InterfaceC5606v0 {

        /* renamed from: o */
        public String f4308o;

        /* renamed from: p */
        public C5591o f4309p;

        /* renamed from: q */
        public InterfaceC5614z0 f4310q;

        @Override // com.caverock.androidsvg.SVG.InterfaceC5606v0
        /* renamed from: d */
        public InterfaceC5614z0 mo3693d() {
            return this.f4310q;
        }

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "textPath";
        }

        /* renamed from: o */
        public void m3728o(InterfaceC5614z0 interfaceC5614z0) {
            this.f4310q = interfaceC5614z0;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$y */
    public static class C5611y extends AbstractC5583k {

        /* renamed from: o */
        public float[] f4311o;

        @Override // com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "polyline";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$y0 */
    public static abstract class AbstractC5612y0 extends AbstractC5608w0 {

        /* renamed from: o */
        public List f4312o;

        /* renamed from: p */
        public List f4313p;

        /* renamed from: q */
        public List f4314q;

        /* renamed from: r */
        public List f4315r;
    }

    /* renamed from: com.caverock.androidsvg.SVG$z */
    public static class C5613z extends C5611y {
        @Override // com.caverock.androidsvg.SVG.C5611y, com.caverock.androidsvg.SVG.C5586l0
        /* renamed from: n */
        public String mo3692n() {
            return "polygon";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$z0 */
    public interface InterfaceC5614z0 {
    }

    /* renamed from: k */
    public static AbstractC8129c m3668k() {
        return null;
    }

    /* renamed from: l */
    public static SVG m3669l(InputStream inputStream) {
        return new SVGParser().m3843z(inputStream, f4092g);
    }

    /* renamed from: a */
    public void m3670a(CSSParser.C5557n c5557n) {
        this.f4097e.m3652b(c5557n);
    }

    /* renamed from: b */
    public void m3671b() {
        this.f4097e.m3655e(CSSParser.Source.RenderOptions);
    }

    /* renamed from: c */
    public final String m3672c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", AbsSection.SEP_ORIGIN_LINE_BREAK);
    }

    /* renamed from: d */
    public List m3673d() {
        return this.f4097e.m3653c();
    }

    /* renamed from: e */
    public final C5563b m3674e(float f10) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        float fM3713d;
        Unit unit5;
        C5570d0 c5570d0 = this.f4093a;
        C5591o c5591o = c5570d0.f4215s;
        C5591o c5591o2 = c5570d0.f4216t;
        if (c5591o == null || c5591o.m3719j() || (unit = c5591o.f4265b) == (unit2 = Unit.percent) || unit == (unit3 = Unit.em) || unit == (unit4 = Unit.ex)) {
            return new C5563b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fM3713d2 = c5591o.m3713d(f10);
        if (c5591o2 == null) {
            C5563b c5563b = this.f4093a.f4275p;
            fM3713d = c5563b != null ? (c5563b.f4199d * fM3713d2) / c5563b.f4198c : fM3713d2;
        } else {
            if (c5591o2.m3719j() || (unit5 = c5591o2.f4265b) == unit2 || unit5 == unit3 || unit5 == unit4) {
                return new C5563b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fM3713d = c5591o2.m3713d(f10);
        }
        return new C5563b(0.0f, 0.0f, fM3713d2, fM3713d);
    }

    /* renamed from: f */
    public float m3675f() {
        if (this.f4093a != null) {
            return m3674e(this.f4096d).f4199d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* renamed from: g */
    public RectF m3676g() {
        C5570d0 c5570d0 = this.f4093a;
        if (c5570d0 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C5563b c5563b = c5570d0.f4275p;
        if (c5563b == null) {
            return null;
        }
        return c5563b.m3697d();
    }

    /* renamed from: h */
    public float m3677h() {
        if (this.f4093a != null) {
            return m3674e(this.f4096d).f4198c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final AbstractC5582j0 m3678i(InterfaceC5578h0 interfaceC5578h0, String str) {
        AbstractC5582j0 abstractC5582j0M3678i;
        AbstractC5582j0 abstractC5582j0 = (AbstractC5582j0) interfaceC5578h0;
        if (str.equals(abstractC5582j0.f4244c)) {
            return abstractC5582j0;
        }
        for (Object obj : interfaceC5578h0.getChildren()) {
            if (obj instanceof AbstractC5582j0) {
                AbstractC5582j0 abstractC5582j02 = (AbstractC5582j0) obj;
                if (str.equals(abstractC5582j02.f4244c)) {
                    return abstractC5582j02;
                }
                if ((obj instanceof InterfaceC5578h0) && (abstractC5582j0M3678i = m3678i((InterfaceC5578h0) obj, str)) != null) {
                    return abstractC5582j0M3678i;
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    public AbstractC5582j0 m3679j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f4093a.f4244c)) {
            return this.f4093a;
        }
        if (this.f4098f.containsKey(str)) {
            return (AbstractC5582j0) this.f4098f.get(str);
        }
        AbstractC5582j0 abstractC5582j0M3678i = m3678i(this.f4093a, str);
        this.f4098f.put(str, abstractC5582j0M3678i);
        return abstractC5582j0M3678i;
    }

    /* renamed from: m */
    public C5570d0 m3680m() {
        return this.f4093a;
    }

    /* renamed from: n */
    public boolean m3681n() {
        return !this.f4097e.m3654d();
    }

    /* renamed from: o */
    public void m3682o(Canvas canvas, C5623a c5623a) {
        if (c5623a == null) {
            c5623a = new C5623a();
        }
        if (!c5623a.m3883g()) {
            c5623a.m3884h(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new C5624b(canvas, this.f4096d).m3913G0(this, c5623a);
    }

    /* renamed from: p */
    public C5586l0 m3683p(String str) {
        if (str == null) {
            return null;
        }
        String strM3672c = m3672c(str);
        if (strM3672c.length() <= 1 || !strM3672c.startsWith("#")) {
            return null;
        }
        return m3679j(strM3672c.substring(1));
    }

    /* renamed from: q */
    public void m3684q(String str) {
        this.f4095c = str;
    }

    /* renamed from: r */
    public void m3685r(String str) {
        C5570d0 c5570d0 = this.f4093a;
        if (c5570d0 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c5570d0.f4216t = SVGParser.m3762o0(str);
    }

    /* renamed from: s */
    public void m3686s(float f10, float f11, float f12, float f13) {
        C5570d0 c5570d0 = this.f4093a;
        if (c5570d0 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c5570d0.f4275p = new C5563b(f10, f11, f12, f13);
    }

    /* renamed from: t */
    public void m3687t(String str) {
        C5570d0 c5570d0 = this.f4093a;
        if (c5570d0 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c5570d0.f4215s = SVGParser.m3762o0(str);
    }

    /* renamed from: u */
    public void m3688u(C5570d0 c5570d0) {
        this.f4093a = c5570d0;
    }

    /* renamed from: v */
    public void m3689v(String str) {
        this.f4094b = str;
    }

    /* renamed from: com.caverock.androidsvg.SVG$o */
    public static class C5591o implements Cloneable {

        /* renamed from: a */
        public float f4264a;

        /* renamed from: b */
        public Unit f4265b;

        public C5591o(float f10, Unit unit) {
            this.f4264a = f10;
            this.f4265b = unit;
        }

        /* renamed from: b */
        public float m3712b() {
            return this.f4264a;
        }

        /* renamed from: d */
        public float m3713d(float f10) {
            int i9 = C5560a.f4187a[this.f4265b.ordinal()];
            if (i9 == 1) {
                return this.f4264a;
            }
            switch (i9) {
                case 4:
                    return this.f4264a * f10;
                case 5:
                    return (this.f4264a * f10) / 2.54f;
                case 6:
                    return (this.f4264a * f10) / 25.4f;
                case 7:
                    return (this.f4264a * f10) / 72.0f;
                case 8:
                    return (this.f4264a * f10) / 6.0f;
                default:
                    return this.f4264a;
            }
        }

        /* renamed from: e */
        public float m3714e(C5624b c5624b) {
            if (this.f4265b != Unit.percent) {
                return m3716g(c5624b);
            }
            C5563b c5563bM3936S = c5624b.m3936S();
            if (c5563bM3936S == null) {
                return this.f4264a;
            }
            float f10 = c5563bM3936S.f4198c;
            if (f10 == c5563bM3936S.f4199d) {
                return (this.f4264a * f10) / 100.0f;
            }
            return (this.f4264a * ((float) (Math.sqrt((f10 * f10) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        /* renamed from: f */
        public float m3715f(C5624b c5624b, float f10) {
            return this.f4265b == Unit.percent ? (this.f4264a * f10) / 100.0f : m3716g(c5624b);
        }

        /* renamed from: g */
        public float m3716g(C5624b c5624b) {
            switch (C5560a.f4187a[this.f4265b.ordinal()]) {
                case 9:
                    C5563b c5563bM3936S = c5624b.m3936S();
                    if (c5563bM3936S != null) {
                        break;
                    } else {
                        break;
                    }
            }
            return this.f4264a;
        }

        /* renamed from: h */
        public float m3717h(C5624b c5624b) {
            if (this.f4265b != Unit.percent) {
                return m3716g(c5624b);
            }
            C5563b c5563bM3936S = c5624b.m3936S();
            return c5563bM3936S == null ? this.f4264a : (this.f4264a * c5563bM3936S.f4199d) / 100.0f;
        }

        /* renamed from: i */
        public boolean m3718i() {
            return this.f4264a < 0.0f;
        }

        /* renamed from: j */
        public boolean m3719j() {
            return this.f4264a == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f4264a) + this.f4265b;
        }

        public C5591o(float f10) {
            this.f4264a = f10;
            this.f4265b = Unit.px;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$b */
    public static class C5563b {

        /* renamed from: a */
        public float f4196a;

        /* renamed from: b */
        public float f4197b;

        /* renamed from: c */
        public float f4198c;

        /* renamed from: d */
        public float f4199d;

        public C5563b(float f10, float f11, float f12, float f13) {
            this.f4196a = f10;
            this.f4197b = f11;
            this.f4198c = f12;
            this.f4199d = f13;
        }

        /* renamed from: a */
        public static C5563b m3694a(float f10, float f11, float f12, float f13) {
            return new C5563b(f10, f11, f12 - f10, f13 - f11);
        }

        /* renamed from: b */
        public float m3695b() {
            return this.f4196a + this.f4198c;
        }

        /* renamed from: c */
        public float m3696c() {
            return this.f4197b + this.f4199d;
        }

        /* renamed from: d */
        public RectF m3697d() {
            return new RectF(this.f4196a, this.f4197b, m3695b(), m3696c());
        }

        /* renamed from: e */
        public void m3698e(C5563b c5563b) {
            float f10 = c5563b.f4196a;
            if (f10 < this.f4196a) {
                this.f4196a = f10;
            }
            float f11 = c5563b.f4197b;
            if (f11 < this.f4197b) {
                this.f4197b = f11;
            }
            if (c5563b.m3695b() > m3695b()) {
                this.f4198c = c5563b.m3695b() - this.f4196a;
            }
            if (c5563b.m3696c() > m3696c()) {
                this.f4199d = c5563b.m3696c() - this.f4197b;
            }
        }

        public String toString() {
            return "[" + this.f4196a + " " + this.f4197b + " " + this.f4198c + " " + this.f4199d + "]";
        }

        public C5563b(C5563b c5563b) {
            this.f4196a = c5563b.f4196a;
            this.f4197b = c5563b.f4197b;
            this.f4198c = c5563b.f4198c;
            this.f4199d = c5563b.f4199d;
        }
    }
}
