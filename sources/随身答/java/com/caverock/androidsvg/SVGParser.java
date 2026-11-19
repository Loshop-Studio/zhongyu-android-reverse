package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.taobao.sophix.PatchStatus;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p133i1.C8127a;
import p133i1.C8128b;

/* loaded from: classes3.dex */
public class SVGParser {

    /* renamed from: d */
    public int f4319d;

    /* renamed from: a */
    public SVG f4316a = null;

    /* renamed from: b */
    public SVG.InterfaceC5578h0 f4317b = null;

    /* renamed from: c */
    public boolean f4318c = false;

    /* renamed from: e */
    public boolean f4320e = false;

    /* renamed from: f */
    public SVGElem f4321f = null;

    /* renamed from: g */
    public StringBuilder f4322g = null;

    /* renamed from: h */
    public boolean f4323h = false;

    /* renamed from: i */
    public StringBuilder f4324i = null;

    public enum SVGAttr {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;


        /* renamed from: Q0 */
        public static final Map f4358Q0 = new HashMap();

        static {
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    f4358Q0.put("class", sVGAttr);
                } else if (sVGAttr != UNSUPPORTED) {
                    f4358Q0.put(sVGAttr.name().replace('_', '-'), sVGAttr);
                }
            }
        }

        /* renamed from: a */
        public static SVGAttr m3844a(String str) {
            SVGAttr sVGAttr = (SVGAttr) f4358Q0.get(str);
            return sVGAttr != null ? sVGAttr : UNSUPPORTED;
        }
    }

    public enum SVGElem {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;


        /* renamed from: G */
        public static final Map f4425G = new HashMap();

        static {
            for (SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    f4425G.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    f4425G.put(sVGElem.name(), sVGElem);
                }
            }
        }

        /* renamed from: a */
        public static SVGElem m3845a(String str) {
            SVGElem sVGElem = (SVGElem) f4425G.get(str);
            return sVGElem != null ? sVGElem : UNSUPPORTED;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$a */
    public static /* synthetic */ class C5615a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4453a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4454b;

        static {
            int[] iArr = new int[SVGAttr.values().length];
            f4454b = iArr;
            try {
                iArr[SVGAttr.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4454b[SVGAttr.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4454b[SVGAttr.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4454b[SVGAttr.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4454b[SVGAttr.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4454b[SVGAttr.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4454b[SVGAttr.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4454b[SVGAttr.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4454b[SVGAttr.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4454b[SVGAttr.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4454b[SVGAttr.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4454b[SVGAttr.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4454b[SVGAttr.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4454b[SVGAttr.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4454b[SVGAttr.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4454b[SVGAttr.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4454b[SVGAttr.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4454b[SVGAttr.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f4454b[SVGAttr.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4454b[SVGAttr.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4454b[SVGAttr.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4454b[SVGAttr.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4454b[SVGAttr.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4454b[SVGAttr.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f4454b[SVGAttr.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4454b[SVGAttr.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4454b[SVGAttr.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f4454b[SVGAttr.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f4454b[SVGAttr.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f4454b[SVGAttr.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f4454b[SVGAttr.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f4454b[SVGAttr.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f4454b[SVGAttr.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f4454b[SVGAttr.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f4454b[SVGAttr.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f4454b[SVGAttr.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f4454b[SVGAttr.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f4454b[SVGAttr.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f4454b[SVGAttr.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f4454b[SVGAttr.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f4454b[SVGAttr.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f4454b[SVGAttr.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f4454b[SVGAttr.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f4454b[SVGAttr.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f4454b[SVGAttr.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f4454b[SVGAttr.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f4454b[SVGAttr.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f4454b[SVGAttr.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f4454b[SVGAttr.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f4454b[SVGAttr.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f4454b[SVGAttr.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f4454b[SVGAttr.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f4454b[SVGAttr.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f4454b[SVGAttr.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f4454b[SVGAttr.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f4454b[SVGAttr.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f4454b[SVGAttr.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f4454b[SVGAttr.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f4454b[SVGAttr.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f4454b[SVGAttr.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f4454b[SVGAttr.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f4454b[SVGAttr.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f4454b[SVGAttr.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f4454b[SVGAttr.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f4454b[SVGAttr.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f4454b[SVGAttr.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f4454b[SVGAttr.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f4454b[SVGAttr.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f4454b[SVGAttr.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f4454b[SVGAttr.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f4454b[SVGAttr.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f4454b[SVGAttr.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f4454b[SVGAttr.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f4454b[SVGAttr.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f4454b[SVGAttr.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f4454b[SVGAttr.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f4454b[SVGAttr.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f4454b[SVGAttr.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f4454b[SVGAttr.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f4454b[SVGAttr.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f4454b[SVGAttr.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f4454b[SVGAttr.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f4454b[SVGAttr.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f4454b[SVGAttr.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f4454b[SVGAttr.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f4454b[SVGAttr.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f4454b[SVGAttr.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f4454b[SVGAttr.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f4454b[SVGAttr.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[SVGElem.values().length];
            f4453a = iArr2;
            try {
                iArr2[SVGElem.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f4453a[SVGElem.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f4453a[SVGElem.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f4453a[SVGElem.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f4453a[SVGElem.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f4453a[SVGElem.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f4453a[SVGElem.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f4453a[SVGElem.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f4453a[SVGElem.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f4453a[SVGElem.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f4453a[SVGElem.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f4453a[SVGElem.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f4453a[SVGElem.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f4453a[SVGElem.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f4453a[SVGElem.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f4453a[SVGElem.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f4453a[SVGElem.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f4453a[SVGElem.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f4453a[SVGElem.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f4453a[SVGElem.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f4453a[SVGElem.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f4453a[SVGElem.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f4453a[SVGElem.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f4453a[SVGElem.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f4453a[SVGElem.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f4453a[SVGElem.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f4453a[SVGElem.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f4453a[SVGElem.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f4453a[SVGElem.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f4453a[SVGElem.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f4453a[SVGElem.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$b */
    public static class C5616b {

        /* renamed from: a */
        public static final Map f4455a;

        static {
            HashMap map = new HashMap(10);
            f4455a = map;
            map.put("none", PreserveAspectRatio.Alignment.none);
            map.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            map.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            map.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            map.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            map.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            map.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            map.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            map.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            map.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }

        /* renamed from: a */
        public static PreserveAspectRatio.Alignment m3846a(String str) {
            return (PreserveAspectRatio.Alignment) f4455a.get(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$c */
    public static class C5617c {

        /* renamed from: a */
        public static final Map f4456a;

        static {
            HashMap map = new HashMap(47);
            f4456a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", Integer.valueOf(SupportMenu.CATEGORY_MASK));
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        /* renamed from: a */
        public static Integer m3847a(String str) {
            return (Integer) f4456a.get(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$d */
    public static class C5618d {

        /* renamed from: a */
        public static final Map f4457a;

        static {
            HashMap map = new HashMap(9);
            f4457a = map;
            SVG.Unit unit = SVG.Unit.pt;
            map.put("xx-small", new SVG.C5591o(0.694f, unit));
            map.put("x-small", new SVG.C5591o(0.833f, unit));
            map.put("small", new SVG.C5591o(10.0f, unit));
            map.put("medium", new SVG.C5591o(12.0f, unit));
            map.put("large", new SVG.C5591o(14.4f, unit));
            map.put("x-large", new SVG.C5591o(17.3f, unit));
            map.put("xx-large", new SVG.C5591o(20.7f, unit));
            SVG.Unit unit2 = SVG.Unit.percent;
            map.put("smaller", new SVG.C5591o(83.33f, unit2));
            map.put("larger", new SVG.C5591o(120.0f, unit2));
        }

        /* renamed from: a */
        public static SVG.C5591o m3848a(String str) {
            return (SVG.C5591o) f4457a.get(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$e */
    public static class C5619e {

        /* renamed from: a */
        public static final Map f4458a;

        static {
            HashMap map = new HashMap(13);
            f4458a = map;
            map.put("normal", 400);
            Integer numValueOf = Integer.valueOf(TypedValues.TransitionType.TYPE_DURATION);
            map.put("bold", numValueOf);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put("100", 100);
            map.put("200", 200);
            map.put("300", 300);
            map.put("400", 400);
            map.put("500", 500);
            map.put("600", 600);
            map.put("700", numValueOf);
            map.put("800", 800);
            map.put("900", 900);
        }

        /* renamed from: a */
        public static Integer m3849a(String str) {
            return (Integer) f4458a.get(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$f */
    public class C5620f extends DefaultHandler2 {
        public C5620f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i9, int i10) {
            SVGParser.this.m3817c1(new String(cArr, i9, i10));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            SVGParser.this.m3833o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            SVGParser.this.m3834p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            SVGParser.this.m3836r(str, SVGParser.this.m3841x0(new C5621g(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            SVGParser.this.m3808W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
            SVGParser.this.m3810X0(str, str2, str3, attributes);
        }

        public /* synthetic */ C5620f(SVGParser sVGParser, C5615a c5615a) {
            this();
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$g */
    public static class C5621g {

        /* renamed from: a */
        public String f4460a;

        /* renamed from: c */
        public int f4462c;

        /* renamed from: b */
        public int f4461b = 0;

        /* renamed from: d */
        public C8128b f4463d = new C8128b();

        public C5621g(String str) {
            this.f4462c = 0;
            String strTrim = str.trim();
            this.f4460a = strTrim;
            this.f4462c = strTrim.length();
        }

        /* renamed from: A */
        public void m3850A() {
            while (true) {
                int i9 = this.f4461b;
                if (i9 >= this.f4462c || !m3861k(this.f4460a.charAt(i9))) {
                    return;
                } else {
                    this.f4461b++;
                }
            }
        }

        /* renamed from: a */
        public int m3851a() {
            int i9 = this.f4461b;
            int i10 = this.f4462c;
            if (i9 == i10) {
                return -1;
            }
            int i11 = i9 + 1;
            this.f4461b = i11;
            if (i11 < i10) {
                return this.f4460a.charAt(i11);
            }
            return -1;
        }

        /* renamed from: b */
        public String m3852b() {
            int i9 = this.f4461b;
            while (!m3858h() && !m3861k(this.f4460a.charAt(this.f4461b))) {
                this.f4461b++;
            }
            String strSubstring = this.f4460a.substring(i9, this.f4461b);
            this.f4461b = i9;
            return strSubstring;
        }

        /* renamed from: c */
        public Boolean m3853c(Object obj) {
            if (obj == null) {
                return null;
            }
            m3876z();
            return m3863m();
        }

        /* renamed from: d */
        public float m3854d(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            m3876z();
            return m3864n();
        }

        /* renamed from: e */
        public float m3855e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            m3876z();
            return m3864n();
        }

        /* renamed from: f */
        public boolean m3856f(char c10) {
            int i9 = this.f4461b;
            boolean z9 = i9 < this.f4462c && this.f4460a.charAt(i9) == c10;
            if (z9) {
                this.f4461b++;
            }
            return z9;
        }

        /* renamed from: g */
        public boolean m3857g(String str) {
            int length = str.length();
            int i9 = this.f4461b;
            boolean z9 = i9 <= this.f4462c - length && this.f4460a.substring(i9, i9 + length).equals(str);
            if (z9) {
                this.f4461b += length;
            }
            return z9;
        }

        /* renamed from: h */
        public boolean m3858h() {
            return this.f4461b == this.f4462c;
        }

        /* renamed from: i */
        public boolean m3859i() {
            int i9 = this.f4461b;
            if (i9 == this.f4462c) {
                return false;
            }
            char cCharAt = this.f4460a.charAt(i9);
            if (cCharAt < 'a' || cCharAt > 'z') {
                return cCharAt >= 'A' && cCharAt <= 'Z';
            }
            return true;
        }

        /* renamed from: j */
        public boolean m3860j(int i9) {
            return i9 == 10 || i9 == 13;
        }

        /* renamed from: k */
        public boolean m3861k(int i9) {
            return i9 == 32 || i9 == 10 || i9 == 13 || i9 == 9;
        }

        /* renamed from: l */
        public Integer m3862l() {
            int i9 = this.f4461b;
            if (i9 == this.f4462c) {
                return null;
            }
            String str = this.f4460a;
            this.f4461b = i9 + 1;
            return Integer.valueOf(str.charAt(i9));
        }

        /* renamed from: m */
        public Boolean m3863m() {
            int i9 = this.f4461b;
            if (i9 == this.f4462c) {
                return null;
            }
            char cCharAt = this.f4460a.charAt(i9);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f4461b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        /* renamed from: n */
        public float m3864n() {
            float fM13024b = this.f4463d.m13024b(this.f4460a, this.f4461b, this.f4462c);
            if (!Float.isNaN(fM13024b)) {
                this.f4461b = this.f4463d.m13023a();
            }
            return fM13024b;
        }

        /* renamed from: o */
        public String m3865o() {
            if (m3858h()) {
                return null;
            }
            int i9 = this.f4461b;
            int iCharAt = this.f4460a.charAt(i9);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = m3851a();
            }
            int i10 = this.f4461b;
            while (m3861k(iCharAt)) {
                iCharAt = m3851a();
            }
            if (iCharAt == 40) {
                this.f4461b++;
                return this.f4460a.substring(i9, i10);
            }
            this.f4461b = i9;
            return null;
        }

        /* renamed from: p */
        public SVG.C5591o m3866p() {
            float fM3864n = m3864n();
            if (Float.isNaN(fM3864n)) {
                return null;
            }
            SVG.Unit unitM3872v = m3872v();
            return unitM3872v == null ? new SVG.C5591o(fM3864n, SVG.Unit.px) : new SVG.C5591o(fM3864n, unitM3872v);
        }

        /* renamed from: q */
        public String m3867q() {
            if (m3858h()) {
                return null;
            }
            int i9 = this.f4461b;
            char cCharAt = this.f4460a.charAt(i9);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iM3851a = m3851a();
            while (iM3851a != -1 && iM3851a != cCharAt) {
                iM3851a = m3851a();
            }
            if (iM3851a == -1) {
                this.f4461b = i9;
                return null;
            }
            int i10 = this.f4461b;
            this.f4461b = i10 + 1;
            return this.f4460a.substring(i9 + 1, i10);
        }

        /* renamed from: r */
        public String m3868r() {
            return m3870t(' ', false);
        }

        /* renamed from: s */
        public String m3869s(char c10) {
            return m3870t(c10, false);
        }

        /* renamed from: t */
        public String m3870t(char c10, boolean z9) {
            if (m3858h()) {
                return null;
            }
            char cCharAt = this.f4460a.charAt(this.f4461b);
            if ((!z9 && m3861k(cCharAt)) || cCharAt == c10) {
                return null;
            }
            int i9 = this.f4461b;
            int iM3851a = m3851a();
            while (iM3851a != -1 && iM3851a != c10 && (z9 || !m3861k(iM3851a))) {
                iM3851a = m3851a();
            }
            return this.f4460a.substring(i9, this.f4461b);
        }

        /* renamed from: u */
        public String m3871u(char c10) {
            return m3870t(c10, true);
        }

        /* renamed from: v */
        public SVG.Unit m3872v() {
            if (m3858h()) {
                return null;
            }
            if (this.f4460a.charAt(this.f4461b) == '%') {
                this.f4461b++;
                return SVG.Unit.percent;
            }
            int i9 = this.f4461b;
            if (i9 > this.f4462c - 2) {
                return null;
            }
            try {
                SVG.Unit unitValueOf = SVG.Unit.valueOf(this.f4460a.substring(i9, i9 + 2).toLowerCase(Locale.US));
                this.f4461b += 2;
                return unitValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: w */
        public String m3873w() {
            if (m3858h()) {
                return null;
            }
            int i9 = this.f4461b;
            char cCharAt = this.f4460a.charAt(i9);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.f4461b = i9;
                return null;
            }
            int iM3851a = m3851a();
            while (true) {
                if ((iM3851a < 65 || iM3851a > 90) && (iM3851a < 97 || iM3851a > 122)) {
                    break;
                }
                iM3851a = m3851a();
            }
            return this.f4460a.substring(i9, this.f4461b);
        }

        /* renamed from: x */
        public float m3874x() {
            m3876z();
            float fM13024b = this.f4463d.m13024b(this.f4460a, this.f4461b, this.f4462c);
            if (!Float.isNaN(fM13024b)) {
                this.f4461b = this.f4463d.m13023a();
            }
            return fM13024b;
        }

        /* renamed from: y */
        public String m3875y() {
            if (m3858h()) {
                return null;
            }
            int i9 = this.f4461b;
            this.f4461b = this.f4462c;
            return this.f4460a.substring(i9);
        }

        /* renamed from: z */
        public boolean m3876z() {
            m3850A();
            int i9 = this.f4461b;
            if (i9 == this.f4462c || this.f4460a.charAt(i9) != ',') {
                return false;
            }
            this.f4461b++;
            m3850A();
            return true;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$h */
    public class C5622h implements Attributes {

        /* renamed from: a */
        public XmlPullParser f4464a;

        public C5622h(XmlPullParser xmlPullParser) {
            this.f4464a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f4464a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i9) {
            return this.f4464a.getAttributeName(i9);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i9) {
            String attributeName = this.f4464a.getAttributeName(i9);
            if (this.f4464a.getAttributePrefix(i9) == null) {
                return attributeName;
            }
            return this.f4464a.getAttributePrefix(i9) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i9) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i9) {
            return this.f4464a.getAttributeNamespace(i9);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i9) {
            return this.f4464a.getAttributeValue(i9);
        }
    }

    /* renamed from: A0 */
    public static Set m3729A0(String str) {
        C5621g c5621g = new C5621g(str);
        HashSet hashSet = new HashSet();
        while (!c5621g.m3858h()) {
            hashSet.add(c5621g.m3868r());
            c5621g.m3850A();
        }
        return hashSet;
    }

    /* renamed from: B0 */
    public static SVG.C5591o[] m3730B0(String str) {
        SVG.C5591o c5591oM3866p;
        C5621g c5621g = new C5621g(str);
        c5621g.m3850A();
        if (c5621g.m3858h() || (c5591oM3866p = c5621g.m3866p()) == null || c5591oM3866p.m3718i()) {
            return null;
        }
        float fM3712b = c5591oM3866p.m3712b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c5591oM3866p);
        while (!c5621g.m3858h()) {
            c5621g.m3876z();
            SVG.C5591o c5591oM3866p2 = c5621g.m3866p();
            if (c5591oM3866p2 == null || c5591oM3866p2.m3718i()) {
                return null;
            }
            arrayList.add(c5591oM3866p2);
            fM3712b += c5591oM3866p2.m3712b();
        }
        if (fM3712b == 0.0f) {
            return null;
        }
        return (SVG.C5591o[]) arrayList.toArray(new SVG.C5591o[arrayList.size()]);
    }

    /* renamed from: C0 */
    public static SVG.Style.LineCap m3731C0(String str) {
        if ("butt".equals(str)) {
            return SVG.Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineCap.Round;
        }
        if ("square".equals(str)) {
            return SVG.Style.LineCap.Square;
        }
        return null;
    }

    /* renamed from: D0 */
    public static SVG.Style.LineJoin m3732D0(String str) {
        if ("miter".equals(str)) {
            return SVG.Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return SVG.Style.LineJoin.Bevel;
        }
        return null;
    }

    /* renamed from: E0 */
    public static void m3733E0(SVG.AbstractC5582j0 abstractC5582j0, String str) {
        C5621g c5621g = new C5621g(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strM3869s = c5621g.m3869s(':');
            c5621g.m3850A();
            if (!c5621g.m3856f(':')) {
                return;
            }
            c5621g.m3850A();
            String strM3871u = c5621g.m3871u(';');
            if (strM3871u == null) {
                return;
            }
            c5621g.m3850A();
            if (c5621g.m3858h() || c5621g.m3856f(';')) {
                if (abstractC5582j0.f4247f == null) {
                    abstractC5582j0.f4247f = new SVG.Style();
                }
                m3740S0(abstractC5582j0.f4247f, strM3869s, strM3871u);
                c5621g.m3850A();
            }
        }
    }

    /* renamed from: F0 */
    public static Set m3734F0(String str) {
        C5621g c5621g = new C5621g(str);
        HashSet hashSet = new HashSet();
        while (!c5621g.m3858h()) {
            String strM3868r = c5621g.m3868r();
            int iIndexOf = strM3868r.indexOf(45);
            if (iIndexOf != -1) {
                strM3868r = strM3868r.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strM3868r, "", "").getLanguage());
            c5621g.m3850A();
        }
        return hashSet;
    }

    /* renamed from: G0 */
    public static SVG.Style.TextAnchor m3735G0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return SVG.Style.TextAnchor.Middle;
            case "end":
                return SVG.Style.TextAnchor.End;
            case "start":
                return SVG.Style.TextAnchor.Start;
            default:
                return null;
        }
    }

    /* renamed from: H0 */
    public static SVG.Style.TextDecoration m3736H0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return SVG.Style.TextDecoration.LineThrough;
            case "underline":
                return SVG.Style.TextDecoration.Underline;
            case "none":
                return SVG.Style.TextDecoration.None;
            case "blink":
                return SVG.Style.TextDecoration.Blink;
            case "overline":
                return SVG.Style.TextDecoration.Overline;
            default:
                return null;
        }
    }

    /* renamed from: I0 */
    public static SVG.Style.TextDirection m3737I0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return SVG.Style.TextDirection.LTR;
        }
        if (str.equals("rtl")) {
            return SVG.Style.TextDirection.RTL;
        }
        return null;
    }

    /* renamed from: M0 */
    public static SVG.Style.VectorEffect m3738M0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return SVG.Style.VectorEffect.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return SVG.Style.VectorEffect.NonScalingStroke;
        }
        return null;
    }

    /* renamed from: N0 */
    public static SVG.C5563b m3739N0(String str) throws SVGParseException {
        C5621g c5621g = new C5621g(str);
        c5621g.m3850A();
        float fM3864n = c5621g.m3864n();
        c5621g.m3876z();
        float fM3864n2 = c5621g.m3864n();
        c5621g.m3876z();
        float fM3864n3 = c5621g.m3864n();
        c5621g.m3876z();
        float fM3864n4 = c5621g.m3864n();
        if (Float.isNaN(fM3864n) || Float.isNaN(fM3864n2) || Float.isNaN(fM3864n3) || Float.isNaN(fM3864n4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        }
        if (fM3864n3 < 0.0f) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        }
        if (fM3864n4 >= 0.0f) {
            return new SVG.C5563b(fM3864n, fM3864n2, fM3864n3, fM3864n4);
        }
        throw new SVGParseException("Invalid viewBox. height cannot be negative");
    }

    /* renamed from: S0 */
    public static void m3740S0(SVG.Style style, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (C5615a.f4454b[SVGAttr.m3844a(str).ordinal()]) {
                case 47:
                    SVG.AbstractC5588m0 abstractC5588m0M3769t0 = m3769t0(str2);
                    style.f4117b = abstractC5588m0M3769t0;
                    if (abstractC5588m0M3769t0 != null) {
                        style.f4116a |= 1;
                        break;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    SVG.Style.FillRule fillRuleM3750e0 = m3750e0(str2);
                    style.f4118c = fillRuleM3750e0;
                    if (fillRuleM3750e0 != null) {
                        style.f4116a |= 2;
                        break;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    Float fM3765r0 = m3765r0(str2);
                    style.f4119d = fM3765r0;
                    if (fM3765r0 != null) {
                        style.f4116a |= 4;
                        break;
                    }
                    break;
                case 50:
                    SVG.AbstractC5588m0 abstractC5588m0M3769t02 = m3769t0(str2);
                    style.f4120e = abstractC5588m0M3769t02;
                    if (abstractC5588m0M3769t02 != null) {
                        style.f4116a |= 8;
                        break;
                    }
                    break;
                case 51:
                    Float fM3765r02 = m3765r0(str2);
                    style.f4121f = fM3765r02;
                    if (fM3765r02 != null) {
                        style.f4116a |= 16;
                        break;
                    }
                    break;
                case 52:
                    style.f4122g = m3762o0(str2);
                    style.f4116a |= 32;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    SVG.Style.LineCap lineCapM3731C0 = m3731C0(str2);
                    style.f4123h = lineCapM3731C0;
                    if (lineCapM3731C0 != null) {
                        style.f4116a |= 64;
                        break;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    SVG.Style.LineJoin lineJoinM3732D0 = m3732D0(str2);
                    style.f4124i = lineJoinM3732D0;
                    if (lineJoinM3732D0 != null) {
                        style.f4116a |= 128;
                        break;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    style.f4125j = Float.valueOf(m3752f0(str2));
                    style.f4116a |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        SVG.C5591o[] c5591oArrM3730B0 = m3730B0(str2);
                        style.f4126k = c5591oArrM3730B0;
                        if (c5591oArrM3730B0 != null) {
                            style.f4116a |= 512;
                            break;
                        }
                    } else {
                        style.f4126k = null;
                        style.f4116a |= 512;
                        break;
                    }
                    break;
                case 57:
                    style.f4127l = m3762o0(str2);
                    style.f4116a |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    break;
                case 58:
                    style.f4128m = m3765r0(str2);
                    style.f4116a |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                    break;
                case 59:
                    style.f4129n = m3744b0(str2);
                    style.f4116a |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    break;
                case 60:
                    m3755h0(style, str2);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    List listM3756i0 = m3756i0(str2);
                    style.f4130o = listM3756i0;
                    if (listM3756i0 != null) {
                        style.f4116a |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                        break;
                    }
                    break;
                case 62:
                    SVG.C5591o c5591oM3758j0 = m3758j0(str2);
                    style.f4131p = c5591oM3758j0;
                    if (c5591oM3758j0 != null) {
                        style.f4116a |= PlaybackStateCompat.ACTION_PREPARE;
                        break;
                    }
                    break;
                case 63:
                    Integer numM3760l0 = m3760l0(str2);
                    style.f4132q = numM3760l0;
                    if (numM3760l0 != null) {
                        style.f4116a |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                        break;
                    }
                    break;
                case 64:
                    SVG.Style.FontStyle fontStyleM3759k0 = m3759k0(str2);
                    style.f4133r = fontStyleM3759k0;
                    if (fontStyleM3759k0 != null) {
                        style.f4116a |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                        break;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    SVG.Style.TextDecoration textDecorationM3736H0 = m3736H0(str2);
                    style.f4134s = textDecorationM3736H0;
                    if (textDecorationM3736H0 != null) {
                        style.f4116a |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                        break;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    SVG.Style.TextDirection textDirectionM3737I0 = m3737I0(str2);
                    style.f4135t = textDirectionM3737I0;
                    if (textDirectionM3737I0 != null) {
                        style.f4116a |= 68719476736L;
                        break;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    SVG.Style.TextAnchor textAnchorM3735G0 = m3735G0(str2);
                    style.f4136u = textAnchorM3735G0;
                    if (textAnchorM3735G0 != null) {
                        style.f4116a |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        break;
                    }
                    break;
                case 68:
                    Boolean boolM3767s0 = m3767s0(str2);
                    style.f4137v = boolM3767s0;
                    if (boolM3767s0 != null) {
                        style.f4116a |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                        break;
                    }
                    break;
                case 69:
                    String strM3761m0 = m3761m0(str2, str);
                    style.f4139x = strM3761m0;
                    style.f4140y = strM3761m0;
                    style.f4141z = strM3761m0;
                    style.f4116a |= 14680064;
                    break;
                case 70:
                    style.f4139x = m3761m0(str2, str);
                    style.f4116a |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                    break;
                case PatchStatus.CODE_LOAD_UNDEFINED /* 71 */:
                    style.f4140y = m3761m0(str2, str);
                    style.f4116a |= 4194304;
                    break;
                case PatchStatus.CODE_LOAD_AES_DECRYPT /* 72 */:
                    style.f4141z = m3761m0(str2, str);
                    style.f4116a |= 8388608;
                    break;
                case PatchStatus.CODE_LOAD_MFITEM /* 73 */:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            style.f4103A = Boolean.valueOf(!str2.equals("none"));
                            style.f4116a |= 16777216;
                            break;
                        }
                    }
                    break;
                case PatchStatus.CODE_LOAD_COPY_FILE /* 74 */:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            style.f4104B = Boolean.valueOf(str2.equals("visible"));
                            style.f4116a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        style.f4105C = SVG.C5575g.m3710b();
                    } else {
                        try {
                            style.f4105C = m3744b0(str2);
                        } catch (SVGParseException e10) {
                            Log.w("SVGParser", e10.getMessage());
                            return;
                        }
                    }
                    style.f4116a |= 67108864;
                    break;
                case PatchStatus.CODE_LOAD_SOPHIX_VERSION /* 76 */:
                    style.f4106D = m3765r0(str2);
                    style.f4116a |= 134217728;
                    break;
                case PatchStatus.CODE_LOAD_NOT_ZIP_FORMAT /* 77 */:
                    SVG.C5566c c5566cM3742a0 = m3742a0(str2);
                    style.f4138w = c5566cM3742a0;
                    if (c5566cM3742a0 != null) {
                        style.f4116a |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                        break;
                    }
                    break;
                case PatchStatus.CODE_LOAD_JIT_CLEAR /* 78 */:
                    style.f4107E = m3761m0(str2, str);
                    style.f4116a |= 268435456;
                    break;
                case PatchStatus.CODE_LOAD_FIND_DEX /* 79 */:
                    style.f4108F = m3750e0(str2);
                    style.f4116a |= 536870912;
                    break;
                case PatchStatus.CODE_LOAD_DELETE_OPT /* 80 */:
                    style.f4109G = m3761m0(str2, str);
                    style.f4116a |= 1073741824;
                    break;
                case PatchStatus.CODE_LOAD_HANDLE_DEX /* 81 */:
                    if (str2.equals("currentColor")) {
                        style.f4110H = SVG.C5575g.m3710b();
                    } else {
                        try {
                            style.f4110H = m3744b0(str2);
                        } catch (SVGParseException e11) {
                            Log.w("SVGParser", e11.getMessage());
                            return;
                        }
                    }
                    style.f4116a |= 2147483648L;
                    break;
                case PatchStatus.CODE_LOAD_FIND_CLASS /* 82 */:
                    style.f4111I = m3765r0(str2);
                    style.f4116a |= 4294967296L;
                    break;
                case PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR /* 83 */:
                    if (str2.equals("currentColor")) {
                        style.f4112J = SVG.C5575g.m3710b();
                    } else {
                        try {
                            style.f4112J = m3744b0(str2);
                        } catch (SVGParseException e12) {
                            Log.w("SVGParser", e12.getMessage());
                            return;
                        }
                    }
                    style.f4116a |= 8589934592L;
                    break;
                case PatchStatus.CODE_LOAD_FIND_METHOD /* 84 */:
                    style.f4113K = m3765r0(str2);
                    style.f4116a |= 17179869184L;
                    break;
                case PatchStatus.CODE_LOAD_FIND_FIELD /* 85 */:
                    SVG.Style.VectorEffect vectorEffectM3738M0 = m3738M0(str2);
                    style.f4114L = vectorEffectM3738M0;
                    if (vectorEffectM3738M0 != null) {
                        style.f4116a |= 34359738368L;
                        break;
                    }
                    break;
                case PatchStatus.CODE_LOAD_ILLEGAL_ACCESS /* 86 */:
                    SVG.Style.RenderQuality renderQualityM3773y0 = m3773y0(str2);
                    style.f4115M = renderQualityM3773y0;
                    if (renderQualityM3773y0 != null) {
                        style.f4116a |= 137438953472L;
                        break;
                    }
                    break;
            }
        } catch (SVGParseException unused) {
        }
    }

    /* renamed from: a0 */
    public static SVG.C5566c m3742a0(String str) {
        if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        C5621g c5621g = new C5621g(str.substring(5));
        c5621g.m3850A();
        SVG.C5591o c5591oM3764q0 = m3764q0(c5621g);
        c5621g.m3876z();
        SVG.C5591o c5591oM3764q02 = m3764q0(c5621g);
        c5621g.m3876z();
        SVG.C5591o c5591oM3764q03 = m3764q0(c5621g);
        c5621g.m3876z();
        SVG.C5591o c5591oM3764q04 = m3764q0(c5621g);
        c5621g.m3850A();
        if (c5621g.m3856f(')') || c5621g.m3858h()) {
            return new SVG.C5566c(c5591oM3764q0, c5591oM3764q02, c5591oM3764q03, c5591oM3764q04);
        }
        return null;
    }

    /* renamed from: b0 */
    public static SVG.C5573f m3744b0(String str) throws SVGParseException {
        if (str.charAt(0) == '#') {
            C8127a c8127aM13019b = C8127a.m13019b(str, 1, str.length());
            if (c8127aM13019b == null) {
                throw new SVGParseException("Bad hex colour value: " + str);
            }
            int iM13021a = c8127aM13019b.m13021a();
            if (iM13021a == 4) {
                int iM13022d = c8127aM13019b.m13022d();
                int i9 = iM13022d & 3840;
                int i10 = iM13022d & 240;
                int i11 = iM13022d & 15;
                return new SVG.C5573f(i11 | (i9 << 8) | (-16777216) | (i9 << 12) | (i10 << 8) | (i10 << 4) | (i11 << 4));
            }
            if (iM13021a == 5) {
                int iM13022d2 = c8127aM13019b.m13022d();
                int i12 = 61440 & iM13022d2;
                int i13 = iM13022d2 & 3840;
                int i14 = iM13022d2 & 240;
                int i15 = iM13022d2 & 15;
                return new SVG.C5573f((i15 << 24) | (i15 << 28) | (i12 << 8) | (i12 << 4) | (i13 << 4) | i13 | i14 | (i14 >> 4));
            }
            if (iM13021a == 7) {
                return new SVG.C5573f(c8127aM13019b.m13022d() | ViewCompat.MEASURED_STATE_MASK);
            }
            if (iM13021a == 9) {
                return new SVG.C5573f((c8127aM13019b.m13022d() >>> 8) | (c8127aM13019b.m13022d() << 24));
            }
            throw new SVGParseException("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return m3746c0(lowerCase);
            }
            C5621g c5621g = new C5621g(str.substring(zStartsWith2 ? 5 : 4));
            c5621g.m3850A();
            float fM3864n = c5621g.m3864n();
            float fM3854d = c5621g.m3854d(fM3864n);
            if (!Float.isNaN(fM3854d)) {
                c5621g.m3856f('%');
            }
            float fM3854d2 = c5621g.m3854d(fM3854d);
            if (!Float.isNaN(fM3854d2)) {
                c5621g.m3856f('%');
            }
            if (!zStartsWith2) {
                c5621g.m3850A();
                if (!Float.isNaN(fM3854d2) && c5621g.m3856f(')')) {
                    return new SVG.C5573f(m3766s(fM3864n, fM3854d, fM3854d2) | ViewCompat.MEASURED_STATE_MASK);
                }
                throw new SVGParseException("Bad hsl() colour value: " + str);
            }
            float fM3854d3 = c5621g.m3854d(fM3854d2);
            c5621g.m3850A();
            if (!Float.isNaN(fM3854d3) && c5621g.m3856f(')')) {
                return new SVG.C5573f((m3757j(fM3854d3 * 256.0f) << 24) | m3766s(fM3864n, fM3854d, fM3854d2));
            }
            throw new SVGParseException("Bad hsla() colour value: " + str);
        }
        C5621g c5621g2 = new C5621g(str.substring(zStartsWith ? 5 : 4));
        c5621g2.m3850A();
        float fM3864n2 = c5621g2.m3864n();
        if (!Float.isNaN(fM3864n2) && c5621g2.m3856f('%')) {
            fM3864n2 = (fM3864n2 * 256.0f) / 100.0f;
        }
        float fM3854d4 = c5621g2.m3854d(fM3864n2);
        if (!Float.isNaN(fM3854d4) && c5621g2.m3856f('%')) {
            fM3854d4 = (fM3854d4 * 256.0f) / 100.0f;
        }
        float fM3854d5 = c5621g2.m3854d(fM3854d4);
        if (!Float.isNaN(fM3854d5) && c5621g2.m3856f('%')) {
            fM3854d5 = (fM3854d5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            c5621g2.m3850A();
            if (!Float.isNaN(fM3854d5) && c5621g2.m3856f(')')) {
                return new SVG.C5573f((m3757j(fM3864n2) << 16) | ViewCompat.MEASURED_STATE_MASK | (m3757j(fM3854d4) << 8) | m3757j(fM3854d5));
            }
            throw new SVGParseException("Bad rgb() colour value: " + str);
        }
        float fM3854d6 = c5621g2.m3854d(fM3854d5);
        c5621g2.m3850A();
        if (!Float.isNaN(fM3854d6) && c5621g2.m3856f(')')) {
            return new SVG.C5573f((m3757j(fM3854d6 * 256.0f) << 24) | (m3757j(fM3864n2) << 16) | (m3757j(fM3854d4) << 8) | m3757j(fM3854d5));
        }
        throw new SVGParseException("Bad rgba() colour value: " + str);
    }

    /* renamed from: c0 */
    public static SVG.C5573f m3746c0(String str) throws SVGParseException {
        Integer numM3847a = C5617c.m3847a(str);
        if (numM3847a != null) {
            return new SVG.C5573f(numM3847a.intValue());
        }
        throw new SVGParseException("Invalid colour keyword: " + str);
    }

    /* renamed from: d0 */
    public static SVG.AbstractC5588m0 m3748d0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return SVG.C5573f.f4220c;
        }
        if (str.equals("currentColor")) {
            return SVG.C5575g.m3710b();
        }
        try {
            return m3744b0(str);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    /* renamed from: e0 */
    public static SVG.Style.FillRule m3750e0(String str) {
        if ("nonzero".equals(str)) {
            return SVG.Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return SVG.Style.FillRule.EvenOdd;
        }
        return null;
    }

    /* renamed from: f0 */
    public static float m3752f0(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return m3754g0(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    /* renamed from: g0 */
    public static float m3754g0(String str, int i9, int i10) throws SVGParseException {
        float fM13024b = new C8128b().m13024b(str, i9, i10);
        if (!Float.isNaN(fM13024b)) {
            return fM13024b;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    /* renamed from: h0 */
    public static void m3755h0(SVG.Style style, String str) {
        String strM3869s;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            C5621g c5621g = new C5621g(str);
            Integer numM3849a = null;
            SVG.Style.FontStyle fontStyleM3759k0 = null;
            String str2 = null;
            while (true) {
                strM3869s = c5621g.m3869s('/');
                c5621g.m3850A();
                if (strM3869s != null) {
                    if (numM3849a != null && fontStyleM3759k0 != null) {
                        break;
                    }
                    if (!strM3869s.equals("normal") && (numM3849a != null || (numM3849a = C5619e.m3849a(strM3869s)) == null)) {
                        if (fontStyleM3759k0 != null || (fontStyleM3759k0 = m3759k0(strM3869s)) == null) {
                            if (str2 != null || !strM3869s.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strM3869s;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            SVG.C5591o c5591oM3758j0 = m3758j0(strM3869s);
            if (c5621g.m3856f('/')) {
                c5621g.m3850A();
                String strM3868r = c5621g.m3868r();
                if (strM3868r != null) {
                    try {
                        m3762o0(strM3868r);
                    } catch (SVGParseException unused) {
                        return;
                    }
                }
                c5621g.m3850A();
            }
            style.f4130o = m3756i0(c5621g.m3875y());
            style.f4131p = c5591oM3758j0;
            style.f4132q = Integer.valueOf(numM3849a == null ? 400 : numM3849a.intValue());
            if (fontStyleM3759k0 == null) {
                fontStyleM3759k0 = SVG.Style.FontStyle.Normal;
            }
            style.f4133r = fontStyleM3759k0;
            style.f4116a |= 122880;
        }
    }

    /* renamed from: i0 */
    public static List m3756i0(String str) {
        C5621g c5621g = new C5621g(str);
        ArrayList arrayList = null;
        do {
            String strM3867q = c5621g.m3867q();
            if (strM3867q == null) {
                strM3867q = c5621g.m3871u(',');
            }
            if (strM3867q == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strM3867q);
            c5621g.m3876z();
        } while (!c5621g.m3858h());
        return arrayList;
    }

    /* renamed from: j */
    public static int m3757j(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    /* renamed from: j0 */
    public static SVG.C5591o m3758j0(String str) {
        try {
            SVG.C5591o c5591oM3848a = C5618d.m3848a(str);
            return c5591oM3848a == null ? m3762o0(str) : c5591oM3848a;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    /* renamed from: k0 */
    public static SVG.Style.FontStyle m3759k0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return SVG.Style.FontStyle.Oblique;
            case "italic":
                return SVG.Style.FontStyle.Italic;
            case "normal":
                return SVG.Style.FontStyle.Normal;
            default:
                return null;
        }
    }

    /* renamed from: l0 */
    public static Integer m3760l0(String str) {
        return C5619e.m3849a(str);
    }

    /* renamed from: m0 */
    public static String m3761m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    /* renamed from: o0 */
    public static SVG.C5591o m3762o0(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        SVG.Unit unitValueOf = SVG.Unit.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            unitValueOf = SVG.Unit.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                unitValueOf = SVG.Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new SVG.C5591o(m3754g0(str, 0, length), unitValueOf);
        } catch (NumberFormatException e10) {
            throw new SVGParseException("Invalid length value: " + str, e10);
        }
    }

    /* renamed from: p0 */
    public static List m3763p0(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C5621g c5621g = new C5621g(str);
        c5621g.m3850A();
        while (!c5621g.m3858h()) {
            float fM3864n = c5621g.m3864n();
            if (Float.isNaN(fM3864n)) {
                throw new SVGParseException("Invalid length list value: " + c5621g.m3852b());
            }
            SVG.Unit unitM3872v = c5621g.m3872v();
            if (unitM3872v == null) {
                unitM3872v = SVG.Unit.px;
            }
            arrayList.add(new SVG.C5591o(fM3864n, unitM3872v));
            c5621g.m3876z();
        }
        return arrayList;
    }

    /* renamed from: q0 */
    public static SVG.C5591o m3764q0(C5621g c5621g) {
        return c5621g.m3857g(DebugKt.DEBUG_PROPERTY_VALUE_AUTO) ? new SVG.C5591o(0.0f) : c5621g.m3866p();
    }

    /* renamed from: r0 */
    public static Float m3765r0(String str) {
        try {
            float fM3752f0 = m3752f0(str);
            float f10 = 0.0f;
            if (fM3752f0 < 0.0f) {
                fM3752f0 = f10;
            } else {
                f10 = 1.0f;
                if (fM3752f0 > 1.0f) {
                    fM3752f0 = f10;
                }
            }
            return Float.valueOf(fM3752f0);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static int m3766s(float f10, float f11, float f12) {
        float f13 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f11 / 100.0f;
        float f16 = f12 / 100.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        } else if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        float f17 = f16 >= 0.0f ? f16 > 1.0f ? 1.0f : f16 : 0.0f;
        float f18 = f17 <= 0.5f ? (f15 + 1.0f) * f17 : (f17 + f15) - (f15 * f17);
        float f19 = (f17 * 2.0f) - f18;
        return m3757j(m3768t(f19, f18, f14 - 2.0f) * 256.0f) | (m3757j(m3768t(f19, f18, f14 + 2.0f) * 256.0f) << 16) | (m3757j(m3768t(f19, f18, f14) * 256.0f) << 8);
    }

    /* renamed from: s0 */
    public static Boolean m3767s0(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    /* renamed from: t */
    public static float m3768t(float f10, float f11, float f12) {
        float f13;
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        if (f12 < 1.0f) {
            f13 = (f11 - f10) * f12;
        } else {
            if (f12 < 3.0f) {
                return f11;
            }
            if (f12 >= 4.0f) {
                return f10;
            }
            f13 = (f11 - f10) * (4.0f - f12);
        }
        return f13 + f10;
    }

    /* renamed from: t0 */
    public static SVG.AbstractC5588m0 m3769t0(String str) {
        if (!str.startsWith("url(")) {
            return m3748d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new SVG.C5601t(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new SVG.C5601t(strTrim, strTrim2.length() > 0 ? m3748d0(strTrim2) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0293, code lost:
    
        android.util.Log.e("SVGParser", "Bad path coords for " + ((char) r11) + " path segment");
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0280 A[SYNTHETIC] */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.caverock.androidsvg.SVG.C5605v m3770u0(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.m3770u0(java.lang.String):com.caverock.androidsvg.SVG$v");
    }

    /* renamed from: v0 */
    public static PreserveAspectRatio m3771v0(String str) throws SVGParseException {
        PreserveAspectRatio.Scale scale;
        C5621g c5621g = new C5621g(str);
        c5621g.m3850A();
        String strM3868r = c5621g.m3868r();
        if ("defer".equals(strM3868r)) {
            c5621g.m3850A();
            strM3868r = c5621g.m3868r();
        }
        PreserveAspectRatio.Alignment alignmentM3846a = C5616b.m3846a(strM3868r);
        c5621g.m3850A();
        if (c5621g.m3858h()) {
            scale = null;
        } else {
            String strM3868r2 = c5621g.m3868r();
            strM3868r2.getClass();
            if (strM3868r2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.meet;
            } else {
                if (!strM3868r2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
                }
                scale = PreserveAspectRatio.Scale.slice;
            }
        }
        return new PreserveAspectRatio(alignmentM3846a, scale);
    }

    /* renamed from: w0 */
    public static void m3772w0(SVG.AbstractC5590n0 abstractC5590n0, String str) {
        abstractC5590n0.f4263o = m3771v0(str);
    }

    /* renamed from: y0 */
    public static SVG.Style.RenderQuality m3773y0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return SVG.Style.RenderQuality.optimizeQuality;
            case "auto":
                return SVG.Style.RenderQuality.auto;
            case "optimizeSpeed":
                return SVG.Style.RenderQuality.optimizeSpeed;
            default:
                return null;
        }
    }

    /* renamed from: z0 */
    public static Set m3774z0(String str) {
        C5621g c5621g = new C5621g(str);
        HashSet hashSet = new HashSet();
        while (!c5621g.m3858h()) {
            String strM3868r = c5621g.m3868r();
            if (strM3868r.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strM3868r.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            c5621g.m3850A();
        }
        return hashSet;
    }

    /* renamed from: A */
    public final void m3775A(SVG.C5569d c5569d, Attributes attributes) throws SVGParseException {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            switch (C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()]) {
                case 12:
                    c5569d.f4210o = m3762o0(strTrim);
                    break;
                case 13:
                    c5569d.f4211p = m3762o0(strTrim);
                    break;
                case 14:
                    SVG.C5591o c5591oM3762o0 = m3762o0(strTrim);
                    c5569d.f4212q = c5591oM3762o0;
                    if (c5591oM3762o0.m3718i()) {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
            }
        }
    }

    /* renamed from: B */
    public final void m3776B(SVG.C5571e c5571e, Attributes attributes) throws SVGParseException {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            if (C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    c5571e.f4218p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute clipPathUnits");
                    }
                    c5571e.f4218p = Boolean.TRUE;
                }
            }
        }
    }

    /* renamed from: C */
    public final void m3777C(SVG.InterfaceC5572e0 interfaceC5572e0, Attributes attributes) {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            switch (C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()]) {
                case 21:
                    interfaceC5572e0.mo3703e(m3774z0(strTrim));
                    break;
                case 22:
                    interfaceC5572e0.mo3707j(strTrim);
                    break;
                case 23:
                    interfaceC5572e0.mo3705g(m3734F0(strTrim));
                    break;
                case 24:
                    interfaceC5572e0.mo3706i(m3729A0(strTrim));
                    break;
                case 25:
                    List listM3756i0 = m3756i0(strTrim);
                    interfaceC5572e0.mo3702c(listM3756i0 != null ? new HashSet(listM3756i0) : new HashSet(0));
                    break;
            }
        }
    }

    /* renamed from: D */
    public final void m3778D(SVG.AbstractC5582j0 abstractC5582j0, Attributes attributes) throws SVGParseException {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String qName = attributes.getQName(i9);
            if (qName.equals("id") || qName.equals("xml:id")) {
                abstractC5582j0.f4244c = attributes.getValue(i9).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i9).trim();
                if ("default".equals(strTrim)) {
                    abstractC5582j0.f4245d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        abstractC5582j0.f4245d = Boolean.TRUE;
                        return;
                    }
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    /* renamed from: E */
    public final void m3779E(SVG.C5579i c5579i, Attributes attributes) throws SVGParseException {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            switch (C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()]) {
                case 10:
                    SVG.C5591o c5591oM3762o0 = m3762o0(strTrim);
                    c5579i.f4236q = c5591oM3762o0;
                    if (c5591oM3762o0.m3718i()) {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                case 11:
                    SVG.C5591o c5591oM3762o02 = m3762o0(strTrim);
                    c5579i.f4237r = c5591oM3762o02;
                    if (c5591oM3762o02.m3718i()) {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                case 12:
                    c5579i.f4234o = m3762o0(strTrim);
                    break;
                case 13:
                    c5579i.f4235p = m3762o0(strTrim);
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        continue;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3780F(com.caverock.androidsvg.SVG.AbstractC5581j r5, org.xml.sax.Attributes r6) throws com.caverock.androidsvg.SVGParseException {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L90
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.caverock.androidsvg.SVGParser.C5615a.f4454b
            java.lang.String r3 = r6.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.m3844a(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L72
            switch(r2) {
                case 32: goto L50;
                case 33: goto L49;
                case 34: goto L26;
                default: goto L25;
            }
        L25:
            goto L8c
        L26:
            com.caverock.androidsvg.SVG$GradientSpread r2 = com.caverock.androidsvg.SVG.GradientSpread.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L2d
            r5.f4242k = r2     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L8c
        L2d:
            com.caverock.androidsvg.SVGParseException r5 = new com.caverock.androidsvg.SVGParseException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "\" is not a valid value."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L49:
            android.graphics.Matrix r1 = r4.m3785J0(r1)
            r5.f4241j = r1
            goto L8c
        L50:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.f4240i = r1
            goto L8c
        L5d:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.f4240i = r1
            goto L8c
        L6a:
            com.caverock.androidsvg.SVGParseException r5 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r6 = "Invalid value for attribute gradientUnits"
            r5.<init>(r6)
            throw r5
        L72:
            java.lang.String r2 = ""
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8a
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8c
        L8a:
            r5.f4243l = r1
        L8c:
            int r0 = r0 + 1
            goto L1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.m3780F(com.caverock.androidsvg.SVG$j, org.xml.sax.Attributes):void");
    }

    /* renamed from: G */
    public final void m3781G(SVG.C5589n c5589n, Attributes attributes) throws SVGParseException {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            int i10 = C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()];
            if (i10 == 1) {
                c5589n.f4258q = m3762o0(strTrim);
            } else if (i10 == 2) {
                c5589n.f4259r = m3762o0(strTrim);
            } else if (i10 == 3) {
                SVG.C5591o c5591oM3762o0 = m3762o0(strTrim);
                c5589n.f4260s = c5591oM3762o0;
                if (c5591oM3762o0.m3718i()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i10 == 4) {
                SVG.C5591o c5591oM3762o02 = m3762o0(strTrim);
                c5589n.f4261t = c5591oM3762o02;
                if (c5591oM3762o02.m3718i()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i10 != 6) {
                if (i10 == 7) {
                    m3772w0(c5589n, strTrim);
                }
            } else if ("".equals(attributes.getURI(i9)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i9))) {
                c5589n.f4257p = strTrim;
            }
        }
    }

    /* renamed from: H */
    public final void m3782H(SVG.C5593p c5593p, Attributes attributes) {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            switch (C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()]) {
                case 15:
                    c5593p.f4271o = m3762o0(strTrim);
                    break;
                case 16:
                    c5593p.f4272p = m3762o0(strTrim);
                    break;
                case 17:
                    c5593p.f4273q = m3762o0(strTrim);
                    break;
                case 18:
                    c5593p.f4274r = m3762o0(strTrim);
                    break;
            }
        }
    }

    /* renamed from: I */
    public final void m3783I(SVG.C5584k0 c5584k0, Attributes attributes) {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            switch (C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()]) {
                case 15:
                    c5584k0.f4250m = m3762o0(strTrim);
                    break;
                case 16:
                    c5584k0.f4251n = m3762o0(strTrim);
                    break;
                case 17:
                    c5584k0.f4252o = m3762o0(strTrim);
                    break;
                case 18:
                    c5584k0.f4253p = m3762o0(strTrim);
                    break;
            }
        }
    }

    /* renamed from: J */
    public final void m3784J(SVG.C5595q c5595q, Attributes attributes) throws SVGParseException {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            switch (C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()]) {
                case 26:
                    c5595q.f4277r = m3762o0(strTrim);
                    break;
                case 27:
                    c5595q.f4278s = m3762o0(strTrim);
                    break;
                case 28:
                    SVG.C5591o c5591oM3762o0 = m3762o0(strTrim);
                    c5595q.f4279t = c5591oM3762o0;
                    if (c5591oM3762o0.m3718i()) {
                        throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                case 29:
                    SVG.C5591o c5591oM3762o02 = m3762o0(strTrim);
                    c5595q.f4280u = c5591oM3762o02;
                    if (c5591oM3762o02.m3718i()) {
                        throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new SVGParseException("Invalid value for attribute markerUnits");
                        }
                        c5595q.f4276q = true;
                        break;
                    } else {
                        c5595q.f4276q = false;
                        break;
                    }
                case 31:
                    if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(strTrim)) {
                        c5595q.f4281v = Float.valueOf(Float.NaN);
                        break;
                    } else {
                        c5595q.f4281v = Float.valueOf(m3752f0(strTrim));
                        break;
                    }
            }
        }
    }

    /* renamed from: J0 */
    public final Matrix m3785J0(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        C5621g c5621g = new C5621g(str);
        c5621g.m3850A();
        while (!c5621g.m3858h()) {
            String strM3865o = c5621g.m3865o();
            if (strM3865o == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
            switch (strM3865o) {
                case "matrix":
                    c5621g.m3850A();
                    float fM3864n = c5621g.m3864n();
                    c5621g.m3876z();
                    float fM3864n2 = c5621g.m3864n();
                    c5621g.m3876z();
                    float fM3864n3 = c5621g.m3864n();
                    c5621g.m3876z();
                    float fM3864n4 = c5621g.m3864n();
                    c5621g.m3876z();
                    float fM3864n5 = c5621g.m3864n();
                    c5621g.m3876z();
                    float fM3864n6 = c5621g.m3864n();
                    c5621g.m3850A();
                    if (!Float.isNaN(fM3864n6) && c5621g.m3856f(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{fM3864n, fM3864n3, fM3864n5, fM3864n2, fM3864n4, fM3864n6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "rotate":
                    c5621g.m3850A();
                    float fM3864n7 = c5621g.m3864n();
                    float fM3874x = c5621g.m3874x();
                    float fM3874x2 = c5621g.m3874x();
                    c5621g.m3850A();
                    if (Float.isNaN(fM3864n7) || !c5621g.m3856f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fM3874x)) {
                        matrix.preRotate(fM3864n7);
                        break;
                    } else if (!Float.isNaN(fM3874x2)) {
                        matrix.preRotate(fM3864n7, fM3874x, fM3874x2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "scale":
                    c5621g.m3850A();
                    float fM3864n8 = c5621g.m3864n();
                    float fM3874x3 = c5621g.m3874x();
                    c5621g.m3850A();
                    if (!Float.isNaN(fM3864n8) && c5621g.m3856f(')')) {
                        if (!Float.isNaN(fM3874x3)) {
                            matrix.preScale(fM3864n8, fM3874x3);
                            break;
                        } else {
                            matrix.preScale(fM3864n8, fM3864n8);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                case "skewX":
                    c5621g.m3850A();
                    float fM3864n9 = c5621g.m3864n();
                    c5621g.m3850A();
                    if (!Float.isNaN(fM3864n9) && c5621g.m3856f(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(fM3864n9)), 0.0f);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "skewY":
                    c5621g.m3850A();
                    float fM3864n10 = c5621g.m3864n();
                    c5621g.m3850A();
                    if (!Float.isNaN(fM3864n10) && c5621g.m3856f(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fM3864n10)));
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "translate":
                    c5621g.m3850A();
                    float fM3864n11 = c5621g.m3864n();
                    float fM3874x4 = c5621g.m3874x();
                    c5621g.m3850A();
                    if (!Float.isNaN(fM3864n11) && c5621g.m3856f(')')) {
                        if (!Float.isNaN(fM3874x4)) {
                            matrix.preTranslate(fM3864n11, fM3874x4);
                            break;
                        } else {
                            matrix.preTranslate(fM3864n11, 0.0f);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                default:
                    throw new SVGParseException("Invalid transform list fn: " + strM3865o + ")");
            }
            if (c5621g.m3858h()) {
                return matrix;
            }
            c5621g.m3876z();
        }
        return matrix;
    }

    /* renamed from: K */
    public final void m3786K(SVG.C5597r c5597r, Attributes attributes) throws SVGParseException {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            int i10 = C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()];
            if (i10 == 1) {
                c5597r.f4284q = m3762o0(strTrim);
            } else if (i10 == 2) {
                c5597r.f4285r = m3762o0(strTrim);
            } else if (i10 == 3) {
                SVG.C5591o c5591oM3762o0 = m3762o0(strTrim);
                c5597r.f4286s = c5591oM3762o0;
                if (c5591oM3762o0.m3718i()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (i10 == 4) {
                SVG.C5591o c5591oM3762o02 = m3762o0(strTrim);
                c5597r.f4287t = c5591oM3762o02;
                if (c5591oM3762o02.m3718i()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (i10 != 43) {
                if (i10 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    c5597r.f4283p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute maskContentUnits");
                    }
                    c5597r.f4283p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                c5597r.f4282o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new SVGParseException("Invalid value for attribute maskUnits");
                }
                c5597r.f4282o = Boolean.TRUE;
            }
        }
    }

    /* renamed from: K0 */
    public final void m3787K0(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            C5620f c5620f = new C5620f(this, null);
            xMLReader.setContentHandler(c5620f);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", c5620f);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new SVGParseException("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new SVGParseException("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new SVGParseException("SVG parse error", e12);
        }
    }

    /* renamed from: L */
    public final void m3788L(SVG.C5603u c5603u, Attributes attributes) throws SVGParseException {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            int i10 = C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()];
            if (i10 == 8) {
                c5603u.f4293o = m3770u0(strTrim);
            } else if (i10 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(m3752f0(strTrim));
                c5603u.f4294p = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    /* renamed from: L0 */
    public final void m3789L0(InputStream inputStream, boolean z9) throws XmlPullParserException, ParserConfigurationException, SAXException, IOException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                C5622h c5622h = new C5622h(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        m3808W0();
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        C5621g c5621g = new C5621g(xmlPullParserNewPullParser.getText());
                        m3836r(c5621g.m3868r(), m3841x0(c5621g));
                    } else if (eventType == 10) {
                        if (z9 && this.f4316a.m3680m() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                m3787K0(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        m3810X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, c5622h);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        m3834p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        m3819e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        m3817c1(xmlPullParserNewPullParser.getText());
                    }
                }
                m3833o();
            } catch (IOException e10) {
                throw new SVGParseException("Stream error", e10);
            }
        } catch (XmlPullParserException e11) {
            throw new SVGParseException("XML parser problem", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cf, code lost:
    
        continue;
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3790M(com.caverock.androidsvg.SVG.C5609x r6, org.xml.sax.Attributes r7) throws com.caverock.androidsvg.SVGParseException {
        /*
            r5 = this;
            r0 = 0
        L1:
            int r1 = r7.getLength()
            if (r0 >= r1) goto Ld3
            java.lang.String r1 = r7.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.caverock.androidsvg.SVGParser.C5615a.f4454b
            java.lang.String r3 = r7.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.m3844a(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto Lc9
            r3 = 2
            if (r2 == r3) goto Lc2
            r3 = 3
            if (r2 == r3) goto Lad
            r3 = 4
            if (r2 == r3) goto L98
            r3 = 6
            if (r2 == r3) goto L7d
            java.lang.String r3 = "userSpaceOnUse"
            java.lang.String r4 = "objectBoundingBox"
            switch(r2) {
                case 40: goto L5f;
                case 41: goto L3f;
                case 42: goto L37;
                default: goto L35;
            }
        L35:
            goto Lcf
        L37:
            android.graphics.Matrix r1 = r5.m3785J0(r1)
            r6.f4302s = r1
            goto Lcf
        L3f:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L4b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.f4301r = r1
            goto Lcf
        L4b:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L57
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.f4301r = r1
            goto Lcf
        L57:
            com.caverock.androidsvg.SVGParseException r6 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r7 = "Invalid value for attribute patternContentUnits"
            r6.<init>(r7)
            throw r6
        L5f:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.f4300q = r1
            goto Lcf
        L6a:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L75
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.f4300q = r1
            goto Lcf
        L75:
            com.caverock.androidsvg.SVGParseException r6 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r7 = "Invalid value for attribute patternUnits"
            r6.<init>(r7)
            throw r6
        L7d:
            java.lang.String r2 = ""
            java.lang.String r3 = r7.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L95
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r7.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lcf
        L95:
            r6.f4307x = r1
            goto Lcf
        L98:
            com.caverock.androidsvg.SVG$o r1 = m3762o0(r1)
            r6.f4306w = r1
            boolean r1 = r1.m3718i()
            if (r1 != 0) goto La5
            goto Lcf
        La5:
            com.caverock.androidsvg.SVGParseException r6 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r7 = "Invalid <pattern> element. height cannot be negative"
            r6.<init>(r7)
            throw r6
        Lad:
            com.caverock.androidsvg.SVG$o r1 = m3762o0(r1)
            r6.f4305v = r1
            boolean r1 = r1.m3718i()
            if (r1 != 0) goto Lba
            goto Lcf
        Lba:
            com.caverock.androidsvg.SVGParseException r6 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r7 = "Invalid <pattern> element. width cannot be negative"
            r6.<init>(r7)
            throw r6
        Lc2:
            com.caverock.androidsvg.SVG$o r1 = m3762o0(r1)
            r6.f4304u = r1
            goto Lcf
        Lc9:
            com.caverock.androidsvg.SVG$o r1 = m3762o0(r1)
            r6.f4303t = r1
        Lcf:
            int r0 = r0 + 1
            goto L1
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.m3790M(com.caverock.androidsvg.SVG$x, org.xml.sax.Attributes):void");
    }

    /* renamed from: N */
    public final void m3791N(SVG.C5611y c5611y, Attributes attributes, String str) throws SVGParseException {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            if (SVGAttr.m3844a(attributes.getLocalName(i9)) == SVGAttr.points) {
                C5621g c5621g = new C5621g(attributes.getValue(i9));
                ArrayList arrayList = new ArrayList();
                c5621g.m3850A();
                while (!c5621g.m3858h()) {
                    float fM3864n = c5621g.m3864n();
                    if (Float.isNaN(fM3864n)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    c5621g.m3876z();
                    float fM3864n2 = c5621g.m3864n();
                    if (Float.isNaN(fM3864n2)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    c5621g.m3876z();
                    arrayList.add(Float.valueOf(fM3864n));
                    arrayList.add(Float.valueOf(fM3864n2));
                }
                c5611y.f4311o = new float[arrayList.size()];
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    c5611y.f4311o[i10] = ((Float) obj).floatValue();
                    i10++;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        continue;
     */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3792O(com.caverock.androidsvg.SVG.C5592o0 r5, org.xml.sax.Attributes r6) throws com.caverock.androidsvg.SVGParseException {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L5e
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.caverock.androidsvg.SVGParser.C5615a.f4454b
            java.lang.String r3 = r6.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.m3844a(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 35
            if (r2 == r3) goto L55
            r3 = 36
            if (r2 == r3) goto L4e
            switch(r2) {
                case 12: goto L47;
                case 13: goto L40;
                case 14: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L5b
        L2b:
            com.caverock.androidsvg.SVG$o r1 = m3762o0(r1)
            r5.f4268o = r1
            boolean r1 = r1.m3718i()
            if (r1 != 0) goto L38
            goto L5b
        L38:
            com.caverock.androidsvg.SVGParseException r5 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r6 = "Invalid <radialGradient> element. r cannot be negative"
            r5.<init>(r6)
            throw r5
        L40:
            com.caverock.androidsvg.SVG$o r1 = m3762o0(r1)
            r5.f4267n = r1
            goto L5b
        L47:
            com.caverock.androidsvg.SVG$o r1 = m3762o0(r1)
            r5.f4266m = r1
            goto L5b
        L4e:
            com.caverock.androidsvg.SVG$o r1 = m3762o0(r1)
            r5.f4270q = r1
            goto L5b
        L55:
            com.caverock.androidsvg.SVG$o r1 = m3762o0(r1)
            r5.f4269p = r1
        L5b:
            int r0 = r0 + 1
            goto L1
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.m3792O(com.caverock.androidsvg.SVG$o0, org.xml.sax.Attributes):void");
    }

    /* renamed from: O0 */
    public final void m3793O0(Attributes attributes) throws SVGParseException {
        m3829l("<path>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5603u c5603u = new SVG.C5603u();
        c5603u.f4255a = this.f4316a;
        c5603u.f4256b = this.f4317b;
        m3778D(c5603u, attributes);
        m3800S(c5603u, attributes);
        m3807W(c5603u, attributes);
        m3777C(c5603u, attributes);
        m3788L(c5603u, attributes);
        this.f4317b.mo3699h(c5603u);
    }

    /* renamed from: P */
    public final void m3794P(SVG.C5561a0 c5561a0, Attributes attributes) throws SVGParseException {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            int i10 = C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()];
            if (i10 == 1) {
                c5561a0.f4188o = m3762o0(strTrim);
            } else if (i10 == 2) {
                c5561a0.f4189p = m3762o0(strTrim);
            } else if (i10 == 3) {
                SVG.C5591o c5591oM3762o0 = m3762o0(strTrim);
                c5561a0.f4190q = c5591oM3762o0;
                if (c5591oM3762o0.m3718i()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i10 == 4) {
                SVG.C5591o c5591oM3762o02 = m3762o0(strTrim);
                c5561a0.f4191r = c5591oM3762o02;
                if (c5591oM3762o02.m3718i()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i10 == 10) {
                SVG.C5591o c5591oM3762o03 = m3762o0(strTrim);
                c5561a0.f4192s = c5591oM3762o03;
                if (c5591oM3762o03.m3718i()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i10 != 11) {
                continue;
            } else {
                SVG.C5591o c5591oM3762o04 = m3762o0(strTrim);
                c5561a0.f4193t = c5591oM3762o04;
                if (c5591oM3762o04.m3718i()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    /* renamed from: P0 */
    public final void m3795P0(Attributes attributes) throws SVGParseException {
        m3829l("<pattern>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5609x c5609x = new SVG.C5609x();
        c5609x.f4255a = this.f4316a;
        c5609x.f4256b = this.f4317b;
        m3778D(c5609x, attributes);
        m3800S(c5609x, attributes);
        m3777C(c5609x, attributes);
        m3811Y(c5609x, attributes);
        m3790M(c5609x, attributes);
        this.f4317b.mo3699h(c5609x);
        this.f4317b = c5609x;
    }

    /* renamed from: Q */
    public final void m3796Q(SVG.C5570d0 c5570d0, Attributes attributes) throws SVGParseException {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            int i10 = C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()];
            if (i10 == 1) {
                c5570d0.f4213q = m3762o0(strTrim);
            } else if (i10 == 2) {
                c5570d0.f4214r = m3762o0(strTrim);
            } else if (i10 == 3) {
                SVG.C5591o c5591oM3762o0 = m3762o0(strTrim);
                c5570d0.f4215s = c5591oM3762o0;
                if (c5591oM3762o0.m3718i()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i10 == 4) {
                SVG.C5591o c5591oM3762o02 = m3762o0(strTrim);
                c5570d0.f4216t = c5591oM3762o02;
                if (c5591oM3762o02.m3718i()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i10 == 5) {
                c5570d0.f4217u = strTrim;
            }
        }
    }

    /* renamed from: Q0 */
    public final void m3797Q0(Attributes attributes) throws SVGParseException {
        m3829l("<polygon>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5611y c5613z = new SVG.C5613z();
        c5613z.f4255a = this.f4316a;
        c5613z.f4256b = this.f4317b;
        m3778D(c5613z, attributes);
        m3800S(c5613z, attributes);
        m3807W(c5613z, attributes);
        m3777C(c5613z, attributes);
        m3791N(c5613z, attributes, "polygon");
        this.f4317b.mo3699h(c5613z);
    }

    /* renamed from: R */
    public final void m3798R(SVG.C5567c0 c5567c0, Attributes attributes) {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            if (C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()] == 37) {
                c5567c0.f4209h = m3832n0(strTrim);
            }
        }
    }

    /* renamed from: R0 */
    public final void m3799R0(Attributes attributes) throws SVGParseException {
        m3829l("<polyline>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5611y c5611y = new SVG.C5611y();
        c5611y.f4255a = this.f4316a;
        c5611y.f4256b = this.f4317b;
        m3778D(c5611y, attributes);
        m3800S(c5611y, attributes);
        m3807W(c5611y, attributes);
        m3777C(c5611y, attributes);
        m3791N(c5611y, attributes, "polyline");
        this.f4317b.mo3699h(c5611y);
    }

    /* renamed from: S */
    public final void m3800S(SVG.AbstractC5582j0 abstractC5582j0, Attributes attributes) {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            if (strTrim.length() != 0) {
                int i10 = C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()];
                if (i10 == 45) {
                    m3733E0(abstractC5582j0, strTrim);
                } else if (i10 != 46) {
                    if (abstractC5582j0.f4246e == null) {
                        abstractC5582j0.f4246e = new SVG.Style();
                    }
                    m3740S0(abstractC5582j0.f4246e, attributes.getLocalName(i9), attributes.getValue(i9).trim());
                } else {
                    abstractC5582j0.f4248g = CSSParser.m3620f(strTrim);
                }
            }
        }
    }

    /* renamed from: T */
    public final void m3801T(SVG.C5600s0 c5600s0, Attributes attributes) {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            if (C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()] == 6 && ("".equals(attributes.getURI(i9)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i9)))) {
                c5600s0.f4288o = strTrim;
            }
        }
    }

    /* renamed from: T0 */
    public final void m3802T0(Attributes attributes) throws SVGParseException {
        m3829l("<radialGradient>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5592o0 c5592o0 = new SVG.C5592o0();
        c5592o0.f4255a = this.f4316a;
        c5592o0.f4256b = this.f4317b;
        m3778D(c5592o0, attributes);
        m3800S(c5592o0, attributes);
        m3780F(c5592o0, attributes);
        m3792O(c5592o0, attributes);
        this.f4317b.mo3699h(c5592o0);
        this.f4317b = c5592o0;
    }

    /* renamed from: U */
    public final void m3803U(SVG.C5610x0 c5610x0, Attributes attributes) {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            int i10 = C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()];
            if (i10 != 6) {
                if (i10 == 39) {
                    c5610x0.f4309p = m3762o0(strTrim);
                }
            } else if ("".equals(attributes.getURI(i9)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i9))) {
                c5610x0.f4308o = strTrim;
            }
        }
    }

    /* renamed from: U0 */
    public final void m3804U0(Attributes attributes) throws SVGParseException {
        m3829l("<rect>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5561a0 c5561a0 = new SVG.C5561a0();
        c5561a0.f4255a = this.f4316a;
        c5561a0.f4256b = this.f4317b;
        m3778D(c5561a0, attributes);
        m3800S(c5561a0, attributes);
        m3807W(c5561a0, attributes);
        m3777C(c5561a0, attributes);
        m3794P(c5561a0, attributes);
        this.f4317b.mo3699h(c5561a0);
    }

    /* renamed from: V */
    public final void m3805V(SVG.AbstractC5612y0 abstractC5612y0, Attributes attributes) {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            int i10 = C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()];
            if (i10 == 1) {
                abstractC5612y0.f4312o = m3763p0(strTrim);
            } else if (i10 == 2) {
                abstractC5612y0.f4313p = m3763p0(strTrim);
            } else if (i10 == 19) {
                abstractC5612y0.f4314q = m3763p0(strTrim);
            } else if (i10 == 20) {
                abstractC5612y0.f4315r = m3763p0(strTrim);
            }
        }
    }

    /* renamed from: V0 */
    public final void m3806V0(Attributes attributes) throws SVGParseException {
        m3829l("<solidColor>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5564b0 c5564b0 = new SVG.C5564b0();
        c5564b0.f4255a = this.f4316a;
        c5564b0.f4256b = this.f4317b;
        m3778D(c5564b0, attributes);
        m3800S(c5564b0, attributes);
        this.f4317b.mo3699h(c5564b0);
        this.f4317b = c5564b0;
    }

    /* renamed from: W */
    public final void m3807W(SVG.InterfaceC5587m interfaceC5587m, Attributes attributes) {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            if (SVGAttr.m3844a(attributes.getLocalName(i9)) == SVGAttr.transform) {
                interfaceC5587m.mo3711k(m3785J0(attributes.getValue(i9)));
            }
        }
    }

    /* renamed from: W0 */
    public final void m3808W0() {
        this.f4316a = new SVG();
    }

    /* renamed from: X */
    public final void m3809X(SVG.C5565b1 c5565b1, Attributes attributes) throws SVGParseException {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            int i10 = C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()];
            if (i10 == 1) {
                c5565b1.f4201q = m3762o0(strTrim);
            } else if (i10 == 2) {
                c5565b1.f4202r = m3762o0(strTrim);
            } else if (i10 == 3) {
                SVG.C5591o c5591oM3762o0 = m3762o0(strTrim);
                c5565b1.f4203s = c5591oM3762o0;
                if (c5591oM3762o0.m3718i()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i10 == 4) {
                SVG.C5591o c5591oM3762o02 = m3762o0(strTrim);
                c5565b1.f4204t = c5591oM3762o02;
                if (c5591oM3762o02.m3718i()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i10 == 6 && ("".equals(attributes.getURI(i9)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i9)))) {
                c5565b1.f4200p = strTrim;
            }
        }
    }

    /* renamed from: X0 */
    public final void m3810X0(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.f4318c) {
            this.f4319d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem sVGElemM3845a = SVGElem.m3845a(str2);
            switch (C5615a.f4453a[sVGElemM3845a.ordinal()]) {
                case 1:
                    m3815a1(attributes);
                    break;
                case 2:
                case 3:
                    m3835q(attributes);
                    break;
                case 4:
                    m3830m(attributes);
                    break;
                case 5:
                    m3825i1(attributes);
                    break;
                case 6:
                    m3793O0(attributes);
                    break;
                case 7:
                    m3804U0(attributes);
                    break;
                case 8:
                    m3824i(attributes);
                    break;
                case 9:
                    m3831n(attributes);
                    break;
                case 10:
                    m3838v(attributes);
                    break;
                case 11:
                    m3799R0(attributes);
                    break;
                case 12:
                    m3797Q0(attributes);
                    break;
                case 13:
                    m3818d1(attributes);
                    break;
                case 14:
                    m3823h1(attributes);
                    break;
                case 15:
                    m3821g1(attributes);
                    break;
                case 16:
                    m3828k1(attributes);
                    break;
                case 17:
                    m3816b1(attributes);
                    break;
                case 18:
                    m3840x(attributes);
                    break;
                case 19:
                    m3839w(attributes);
                    break;
                case 20:
                    m3802T0(attributes);
                    break;
                case 21:
                    m3812Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.f4320e = true;
                    this.f4321f = sVGElemM3845a;
                    break;
                case 24:
                    m3827k(attributes);
                    break;
                case 25:
                    m3820f1(attributes);
                    break;
                case 26:
                    m3795P0(attributes);
                    break;
                case 27:
                    m3837u(attributes);
                    break;
                case 28:
                    m3826j1(attributes);
                    break;
                case 29:
                    m3842y(attributes);
                    break;
                case 30:
                    m3814Z0(attributes);
                    break;
                case 31:
                    m3806V0(attributes);
                    break;
                default:
                    this.f4318c = true;
                    this.f4319d = 1;
                    break;
            }
        }
    }

    /* renamed from: Y */
    public final void m3811Y(SVG.AbstractC5594p0 abstractC5594p0, Attributes attributes) {
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            int i10 = C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()];
            if (i10 == 7) {
                m3772w0(abstractC5594p0, strTrim);
            } else if (i10 == 87) {
                abstractC5594p0.f4275p = m3739N0(strTrim);
            }
        }
    }

    /* renamed from: Y0 */
    public final void m3812Y0(Attributes attributes) throws SVGParseException {
        m3829l("<stop>", new Object[0]);
        SVG.InterfaceC5578h0 interfaceC5578h0 = this.f4317b;
        if (interfaceC5578h0 == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(interfaceC5578h0 instanceof SVG.AbstractC5581j)) {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        SVG.C5567c0 c5567c0 = new SVG.C5567c0();
        c5567c0.f4255a = this.f4316a;
        c5567c0.f4256b = this.f4317b;
        m3778D(c5567c0, attributes);
        m3800S(c5567c0, attributes);
        m3798R(c5567c0, attributes);
        this.f4317b.mo3699h(c5567c0);
        this.f4317b = c5567c0;
    }

    /* renamed from: Z */
    public final void m3813Z(String str) {
        this.f4316a.m3670a(new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document).m3627d(str));
    }

    /* renamed from: Z0 */
    public final void m3814Z0(Attributes attributes) throws SVGParseException {
        m3829l("<style>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i9 = 0; i9 < attributes.getLength(); i9++) {
            String strTrim = attributes.getValue(i9).trim();
            int i10 = C5615a.f4454b[SVGAttr.m3844a(attributes.getLocalName(i9)).ordinal()];
            if (i10 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i10 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && CSSParser.m3618b(str, CSSParser.MediaType.screen)) {
            this.f4323h = true;
        } else {
            this.f4318c = true;
            this.f4319d = 1;
        }
    }

    /* renamed from: a1 */
    public final void m3815a1(Attributes attributes) throws SVGParseException {
        m3829l("<svg>", new Object[0]);
        SVG.C5570d0 c5570d0 = new SVG.C5570d0();
        c5570d0.f4255a = this.f4316a;
        c5570d0.f4256b = this.f4317b;
        m3778D(c5570d0, attributes);
        m3800S(c5570d0, attributes);
        m3777C(c5570d0, attributes);
        m3811Y(c5570d0, attributes);
        m3796Q(c5570d0, attributes);
        SVG.InterfaceC5578h0 interfaceC5578h0 = this.f4317b;
        if (interfaceC5578h0 == null) {
            this.f4316a.m3688u(c5570d0);
        } else {
            interfaceC5578h0.mo3699h(c5570d0);
        }
        this.f4317b = c5570d0;
    }

    /* renamed from: b1 */
    public final void m3816b1(Attributes attributes) throws SVGParseException {
        m3829l("<symbol>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.AbstractC5594p0 c5598r0 = new SVG.C5598r0();
        c5598r0.f4255a = this.f4316a;
        c5598r0.f4256b = this.f4317b;
        m3778D(c5598r0, attributes);
        m3800S(c5598r0, attributes);
        m3777C(c5598r0, attributes);
        m3811Y(c5598r0, attributes);
        this.f4317b.mo3699h(c5598r0);
        this.f4317b = c5598r0;
    }

    /* renamed from: c1 */
    public final void m3817c1(String str) {
        if (this.f4318c) {
            return;
        }
        if (this.f4320e) {
            if (this.f4322g == null) {
                this.f4322g = new StringBuilder(str.length());
            }
            this.f4322g.append(str);
        } else if (this.f4323h) {
            if (this.f4324i == null) {
                this.f4324i = new StringBuilder(str.length());
            }
            this.f4324i.append(str);
        } else if (this.f4317b instanceof SVG.AbstractC5608w0) {
            m3822h(str);
        }
    }

    /* renamed from: d1 */
    public final void m3818d1(Attributes attributes) throws SVGParseException {
        m3829l("<text>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5604u0 c5604u0 = new SVG.C5604u0();
        c5604u0.f4255a = this.f4316a;
        c5604u0.f4256b = this.f4317b;
        m3778D(c5604u0, attributes);
        m3800S(c5604u0, attributes);
        m3807W(c5604u0, attributes);
        m3777C(c5604u0, attributes);
        m3805V(c5604u0, attributes);
        this.f4317b.mo3699h(c5604u0);
        this.f4317b = c5604u0;
    }

    /* renamed from: e1 */
    public final void m3819e1(char[] cArr, int i9, int i10) {
        if (this.f4318c) {
            return;
        }
        if (this.f4320e) {
            if (this.f4322g == null) {
                this.f4322g = new StringBuilder(i10);
            }
            this.f4322g.append(cArr, i9, i10);
        } else if (this.f4323h) {
            if (this.f4324i == null) {
                this.f4324i = new StringBuilder(i10);
            }
            this.f4324i.append(cArr, i9, i10);
        } else if (this.f4317b instanceof SVG.AbstractC5608w0) {
            m3822h(new String(cArr, i9, i10));
        }
    }

    /* renamed from: f1 */
    public final void m3820f1(Attributes attributes) throws SVGParseException {
        m3829l("<textPath>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5610x0 c5610x0 = new SVG.C5610x0();
        c5610x0.f4255a = this.f4316a;
        c5610x0.f4256b = this.f4317b;
        m3778D(c5610x0, attributes);
        m3800S(c5610x0, attributes);
        m3777C(c5610x0, attributes);
        m3803U(c5610x0, attributes);
        this.f4317b.mo3699h(c5610x0);
        this.f4317b = c5610x0;
        SVG.InterfaceC5578h0 interfaceC5578h0 = c5610x0.f4256b;
        if (interfaceC5578h0 instanceof SVG.InterfaceC5614z0) {
            c5610x0.m3728o((SVG.InterfaceC5614z0) interfaceC5578h0);
        } else {
            c5610x0.m3728o(((SVG.InterfaceC5606v0) interfaceC5578h0).mo3693d());
        }
    }

    /* renamed from: g1 */
    public final void m3821g1(Attributes attributes) throws SVGParseException {
        m3829l("<tref>", new Object[0]);
        SVG.InterfaceC5578h0 interfaceC5578h0 = this.f4317b;
        if (interfaceC5578h0 == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(interfaceC5578h0 instanceof SVG.AbstractC5608w0)) {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        SVG.C5600s0 c5600s0 = new SVG.C5600s0();
        c5600s0.f4255a = this.f4316a;
        c5600s0.f4256b = this.f4317b;
        m3778D(c5600s0, attributes);
        m3800S(c5600s0, attributes);
        m3777C(c5600s0, attributes);
        m3801T(c5600s0, attributes);
        this.f4317b.mo3699h(c5600s0);
        SVG.InterfaceC5578h0 interfaceC5578h02 = c5600s0.f4256b;
        if (interfaceC5578h02 instanceof SVG.InterfaceC5614z0) {
            c5600s0.m3720o((SVG.InterfaceC5614z0) interfaceC5578h02);
        } else {
            c5600s0.m3720o(((SVG.InterfaceC5606v0) interfaceC5578h02).mo3693d());
        }
    }

    /* renamed from: h */
    public final void m3822h(String str) {
        SVG.AbstractC5574f0 abstractC5574f0 = (SVG.AbstractC5574f0) this.f4317b;
        int size = abstractC5574f0.f4222i.size();
        SVG.C5586l0 c5586l0 = size == 0 ? null : (SVG.C5586l0) abstractC5574f0.f4222i.get(size - 1);
        if (!(c5586l0 instanceof SVG.C5562a1)) {
            this.f4317b.mo3699h(new SVG.C5562a1(str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        SVG.C5562a1 c5562a1 = (SVG.C5562a1) c5586l0;
        sb.append(c5562a1.f4194c);
        sb.append(str);
        c5562a1.f4194c = sb.toString();
    }

    /* renamed from: h1 */
    public final void m3823h1(Attributes attributes) throws SVGParseException {
        m3829l("<tspan>", new Object[0]);
        SVG.InterfaceC5578h0 interfaceC5578h0 = this.f4317b;
        if (interfaceC5578h0 == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(interfaceC5578h0 instanceof SVG.AbstractC5608w0)) {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        SVG.C5602t0 c5602t0 = new SVG.C5602t0();
        c5602t0.f4255a = this.f4316a;
        c5602t0.f4256b = this.f4317b;
        m3778D(c5602t0, attributes);
        m3800S(c5602t0, attributes);
        m3777C(c5602t0, attributes);
        m3805V(c5602t0, attributes);
        this.f4317b.mo3699h(c5602t0);
        this.f4317b = c5602t0;
        SVG.InterfaceC5578h0 interfaceC5578h02 = c5602t0.f4256b;
        if (interfaceC5578h02 instanceof SVG.InterfaceC5614z0) {
            c5602t0.m3721o((SVG.InterfaceC5614z0) interfaceC5578h02);
        } else {
            c5602t0.m3721o(((SVG.InterfaceC5606v0) interfaceC5578h02).mo3693d());
        }
    }

    /* renamed from: i */
    public final void m3824i(Attributes attributes) throws SVGParseException {
        m3829l("<circle>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5569d c5569d = new SVG.C5569d();
        c5569d.f4255a = this.f4316a;
        c5569d.f4256b = this.f4317b;
        m3778D(c5569d, attributes);
        m3800S(c5569d, attributes);
        m3807W(c5569d, attributes);
        m3777C(c5569d, attributes);
        m3775A(c5569d, attributes);
        this.f4317b.mo3699h(c5569d);
    }

    /* renamed from: i1 */
    public final void m3825i1(Attributes attributes) throws SVGParseException {
        m3829l("<use>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5565b1 c5565b1 = new SVG.C5565b1();
        c5565b1.f4255a = this.f4316a;
        c5565b1.f4256b = this.f4317b;
        m3778D(c5565b1, attributes);
        m3800S(c5565b1, attributes);
        m3807W(c5565b1, attributes);
        m3777C(c5565b1, attributes);
        m3809X(c5565b1, attributes);
        this.f4317b.mo3699h(c5565b1);
        this.f4317b = c5565b1;
    }

    /* renamed from: j1 */
    public final void m3826j1(Attributes attributes) throws SVGParseException {
        m3829l("<view>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.AbstractC5594p0 c5568c1 = new SVG.C5568c1();
        c5568c1.f4255a = this.f4316a;
        c5568c1.f4256b = this.f4317b;
        m3778D(c5568c1, attributes);
        m3777C(c5568c1, attributes);
        m3811Y(c5568c1, attributes);
        this.f4317b.mo3699h(c5568c1);
        this.f4317b = c5568c1;
    }

    /* renamed from: k */
    public final void m3827k(Attributes attributes) throws SVGParseException {
        m3829l("<clipPath>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5571e c5571e = new SVG.C5571e();
        c5571e.f4255a = this.f4316a;
        c5571e.f4256b = this.f4317b;
        m3778D(c5571e, attributes);
        m3800S(c5571e, attributes);
        m3807W(c5571e, attributes);
        m3777C(c5571e, attributes);
        m3776B(c5571e, attributes);
        this.f4317b.mo3699h(c5571e);
        this.f4317b = c5571e;
    }

    /* renamed from: k1 */
    public final void m3828k1(Attributes attributes) throws SVGParseException {
        m3829l("<switch>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5596q0 c5596q0 = new SVG.C5596q0();
        c5596q0.f4255a = this.f4316a;
        c5596q0.f4256b = this.f4317b;
        m3778D(c5596q0, attributes);
        m3800S(c5596q0, attributes);
        m3807W(c5596q0, attributes);
        m3777C(c5596q0, attributes);
        this.f4317b.mo3699h(c5596q0);
        this.f4317b = c5596q0;
    }

    /* renamed from: l */
    public final void m3829l(String str, Object... objArr) {
    }

    /* renamed from: m */
    public final void m3830m(Attributes attributes) throws SVGParseException {
        m3829l("<defs>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5577h c5577h = new SVG.C5577h();
        c5577h.f4255a = this.f4316a;
        c5577h.f4256b = this.f4317b;
        m3778D(c5577h, attributes);
        m3800S(c5577h, attributes);
        m3807W(c5577h, attributes);
        this.f4317b.mo3699h(c5577h);
        this.f4317b = c5577h;
    }

    /* renamed from: n */
    public final void m3831n(Attributes attributes) throws SVGParseException {
        m3829l("<ellipse>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5579i c5579i = new SVG.C5579i();
        c5579i.f4255a = this.f4316a;
        c5579i.f4256b = this.f4317b;
        m3778D(c5579i, attributes);
        m3800S(c5579i, attributes);
        m3807W(c5579i, attributes);
        m3777C(c5579i, attributes);
        m3779E(c5579i, attributes);
        this.f4317b.mo3699h(c5579i);
    }

    /* renamed from: n0 */
    public final Float m3832n0(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z9 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z9 = false;
        }
        try {
            float fM3754g0 = m3754g0(str, 0, length);
            float f10 = 100.0f;
            if (z9) {
                fM3754g0 /= 100.0f;
            }
            if (fM3754g0 < 0.0f) {
                f10 = 0.0f;
            } else if (fM3754g0 <= 100.0f) {
                f10 = fM3754g0;
            }
            return Float.valueOf(f10);
        } catch (NumberFormatException e10) {
            throw new SVGParseException("Invalid offset value in <stop>: " + str, e10);
        }
    }

    /* renamed from: o */
    public final void m3833o() {
    }

    /* renamed from: p */
    public final void m3834p(String str, String str2, String str3) {
        if (this.f4318c) {
            int i9 = this.f4319d - 1;
            this.f4319d = i9;
            if (i9 == 0) {
                this.f4318c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i10 = C5615a.f4453a[SVGElem.m3845a(str2).ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 13 && i10 != 14) {
                switch (i10) {
                    case 22:
                    case 23:
                        this.f4320e = false;
                        StringBuilder sb = this.f4322g;
                        if (sb != null) {
                            SVGElem sVGElem = this.f4321f;
                            if (sVGElem == SVGElem.title) {
                                this.f4316a.m3689v(sb.toString());
                            } else if (sVGElem == SVGElem.desc) {
                                this.f4316a.m3684q(sb.toString());
                            }
                            this.f4322g.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.f4324i;
                        if (sb2 != null) {
                            this.f4323h = false;
                            m3813Z(sb2.toString());
                            this.f4324i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.f4317b = ((SVG.C5586l0) this.f4317b).f4256b;
        }
    }

    /* renamed from: q */
    public final void m3835q(Attributes attributes) throws SVGParseException {
        m3829l("<g>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5585l c5585l = new SVG.C5585l();
        c5585l.f4255a = this.f4316a;
        c5585l.f4256b = this.f4317b;
        m3778D(c5585l, attributes);
        m3800S(c5585l, attributes);
        m3807W(c5585l, attributes);
        m3777C(c5585l, attributes);
        this.f4317b.mo3699h(c5585l);
        this.f4317b = c5585l;
    }

    /* renamed from: r */
    public final void m3836r(String str, Map map) {
        if (str.equals("xml-stylesheet")) {
            SVG.m3668k();
        }
    }

    /* renamed from: u */
    public final void m3837u(Attributes attributes) throws SVGParseException {
        m3829l("<image>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5589n c5589n = new SVG.C5589n();
        c5589n.f4255a = this.f4316a;
        c5589n.f4256b = this.f4317b;
        m3778D(c5589n, attributes);
        m3800S(c5589n, attributes);
        m3807W(c5589n, attributes);
        m3777C(c5589n, attributes);
        m3781G(c5589n, attributes);
        this.f4317b.mo3699h(c5589n);
        this.f4317b = c5589n;
    }

    /* renamed from: v */
    public final void m3838v(Attributes attributes) throws SVGParseException {
        m3829l("<line>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5593p c5593p = new SVG.C5593p();
        c5593p.f4255a = this.f4316a;
        c5593p.f4256b = this.f4317b;
        m3778D(c5593p, attributes);
        m3800S(c5593p, attributes);
        m3807W(c5593p, attributes);
        m3777C(c5593p, attributes);
        m3782H(c5593p, attributes);
        this.f4317b.mo3699h(c5593p);
    }

    /* renamed from: w */
    public final void m3839w(Attributes attributes) throws SVGParseException {
        m3829l("<linearGradient>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5584k0 c5584k0 = new SVG.C5584k0();
        c5584k0.f4255a = this.f4316a;
        c5584k0.f4256b = this.f4317b;
        m3778D(c5584k0, attributes);
        m3800S(c5584k0, attributes);
        m3780F(c5584k0, attributes);
        m3783I(c5584k0, attributes);
        this.f4317b.mo3699h(c5584k0);
        this.f4317b = c5584k0;
    }

    /* renamed from: x */
    public final void m3840x(Attributes attributes) throws SVGParseException {
        m3829l("<marker>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5595q c5595q = new SVG.C5595q();
        c5595q.f4255a = this.f4316a;
        c5595q.f4256b = this.f4317b;
        m3778D(c5595q, attributes);
        m3800S(c5595q, attributes);
        m3777C(c5595q, attributes);
        m3811Y(c5595q, attributes);
        m3784J(c5595q, attributes);
        this.f4317b.mo3699h(c5595q);
        this.f4317b = c5595q;
    }

    /* renamed from: x0 */
    public final Map m3841x0(C5621g c5621g) {
        HashMap map = new HashMap();
        c5621g.m3850A();
        String strM3869s = c5621g.m3869s('=');
        while (strM3869s != null) {
            c5621g.m3856f('=');
            map.put(strM3869s, c5621g.m3867q());
            c5621g.m3850A();
            strM3869s = c5621g.m3869s('=');
        }
        return map;
    }

    /* renamed from: y */
    public final void m3842y(Attributes attributes) throws SVGParseException {
        m3829l("<mask>", new Object[0]);
        if (this.f4317b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C5597r c5597r = new SVG.C5597r();
        c5597r.f4255a = this.f4316a;
        c5597r.f4256b = this.f4317b;
        m3778D(c5597r, attributes);
        m3800S(c5597r, attributes);
        m3777C(c5597r, attributes);
        m3786K(c5597r, attributes);
        this.f4317b.mo3699h(c5597r);
        this.f4317b = c5597r;
    }

    /* renamed from: z */
    public SVG m3843z(InputStream inputStream, boolean z9) throws IOException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i9 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i9 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            m3789L0(inputStream, z9);
            return this.f4316a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
