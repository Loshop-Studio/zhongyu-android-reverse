package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import io.reactivex.annotations.SchedulerSupport;
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
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p040d1.C6215a;
import p040d1.C6216b;

/* loaded from: classes3.dex */
public class SVGParser {

    /* renamed from: d */
    public int f2998d;

    /* renamed from: a */
    public SVG f2995a = null;

    /* renamed from: b */
    public SVG.InterfaceC4778h0 f2996b = null;

    /* renamed from: c */
    public boolean f2997c = false;

    /* renamed from: e */
    public boolean f2999e = false;

    /* renamed from: f */
    public SVGElem f3000f = null;

    /* renamed from: g */
    public StringBuilder f3001g = null;

    /* renamed from: h */
    public boolean f3002h = false;

    /* renamed from: i */
    public StringBuilder f3003i = null;

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


        /* renamed from: R0 */
        public static final Map f3039R0 = new HashMap();

        static {
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    f3039R0.put("class", sVGAttr);
                } else if (sVGAttr != UNSUPPORTED) {
                    f3039R0.put(sVGAttr.name().replace('_', '-'), sVGAttr);
                }
            }
        }

        /* renamed from: a */
        public static SVGAttr m3151a(String str) {
            SVGAttr sVGAttr = (SVGAttr) f3039R0.get(str);
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
        public static final Map f3104G = new HashMap();

        static {
            for (SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    f3104G.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    f3104G.put(sVGElem.name(), sVGElem);
                }
            }
        }

        /* renamed from: a */
        public static SVGElem m3152a(String str) {
            SVGElem sVGElem = (SVGElem) f3104G.get(str);
            return sVGElem != null ? sVGElem : UNSUPPORTED;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$a */
    public static /* synthetic */ class C4815a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3132a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3133b;

        static {
            int[] iArr = new int[SVGAttr.values().length];
            f3133b = iArr;
            try {
                iArr[SVGAttr.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3133b[SVGAttr.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3133b[SVGAttr.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3133b[SVGAttr.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3133b[SVGAttr.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3133b[SVGAttr.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3133b[SVGAttr.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3133b[SVGAttr.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3133b[SVGAttr.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3133b[SVGAttr.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3133b[SVGAttr.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3133b[SVGAttr.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3133b[SVGAttr.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3133b[SVGAttr.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3133b[SVGAttr.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3133b[SVGAttr.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3133b[SVGAttr.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3133b[SVGAttr.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f3133b[SVGAttr.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f3133b[SVGAttr.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f3133b[SVGAttr.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f3133b[SVGAttr.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f3133b[SVGAttr.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f3133b[SVGAttr.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f3133b[SVGAttr.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f3133b[SVGAttr.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f3133b[SVGAttr.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f3133b[SVGAttr.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f3133b[SVGAttr.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f3133b[SVGAttr.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f3133b[SVGAttr.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f3133b[SVGAttr.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f3133b[SVGAttr.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f3133b[SVGAttr.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f3133b[SVGAttr.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f3133b[SVGAttr.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f3133b[SVGAttr.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f3133b[SVGAttr.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f3133b[SVGAttr.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f3133b[SVGAttr.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f3133b[SVGAttr.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f3133b[SVGAttr.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f3133b[SVGAttr.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f3133b[SVGAttr.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f3133b[SVGAttr.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f3133b[SVGAttr.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f3133b[SVGAttr.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f3133b[SVGAttr.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f3133b[SVGAttr.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f3133b[SVGAttr.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f3133b[SVGAttr.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f3133b[SVGAttr.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f3133b[SVGAttr.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f3133b[SVGAttr.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f3133b[SVGAttr.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f3133b[SVGAttr.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f3133b[SVGAttr.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f3133b[SVGAttr.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f3133b[SVGAttr.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f3133b[SVGAttr.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f3133b[SVGAttr.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f3133b[SVGAttr.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f3133b[SVGAttr.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f3133b[SVGAttr.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f3133b[SVGAttr.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f3133b[SVGAttr.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f3133b[SVGAttr.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f3133b[SVGAttr.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f3133b[SVGAttr.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f3133b[SVGAttr.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f3133b[SVGAttr.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f3133b[SVGAttr.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f3133b[SVGAttr.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f3133b[SVGAttr.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f3133b[SVGAttr.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f3133b[SVGAttr.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f3133b[SVGAttr.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f3133b[SVGAttr.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f3133b[SVGAttr.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f3133b[SVGAttr.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f3133b[SVGAttr.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f3133b[SVGAttr.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f3133b[SVGAttr.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f3133b[SVGAttr.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f3133b[SVGAttr.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f3133b[SVGAttr.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f3133b[SVGAttr.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f3133b[SVGAttr.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f3133b[SVGAttr.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[SVGElem.values().length];
            f3132a = iArr2;
            try {
                iArr2[SVGElem.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f3132a[SVGElem.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f3132a[SVGElem.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f3132a[SVGElem.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f3132a[SVGElem.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f3132a[SVGElem.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f3132a[SVGElem.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f3132a[SVGElem.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f3132a[SVGElem.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f3132a[SVGElem.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f3132a[SVGElem.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f3132a[SVGElem.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f3132a[SVGElem.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f3132a[SVGElem.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f3132a[SVGElem.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f3132a[SVGElem.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f3132a[SVGElem.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f3132a[SVGElem.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f3132a[SVGElem.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f3132a[SVGElem.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f3132a[SVGElem.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f3132a[SVGElem.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f3132a[SVGElem.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f3132a[SVGElem.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f3132a[SVGElem.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f3132a[SVGElem.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f3132a[SVGElem.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f3132a[SVGElem.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f3132a[SVGElem.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f3132a[SVGElem.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f3132a[SVGElem.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$b */
    public static class C4816b {

        /* renamed from: a */
        public static final Map f3134a;

        static {
            HashMap map = new HashMap(10);
            f3134a = map;
            map.put(SchedulerSupport.NONE, PreserveAspectRatio.Alignment.none);
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
        public static PreserveAspectRatio.Alignment m3153a(String str) {
            return (PreserveAspectRatio.Alignment) f3134a.get(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$c */
    public static class C4817c {

        /* renamed from: a */
        public static final Map f3135a;

        static {
            HashMap map = new HashMap(47);
            f3135a = map;
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
        public static Integer m3154a(String str) {
            return (Integer) f3135a.get(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$d */
    public static class C4818d {

        /* renamed from: a */
        public static final Map f3136a;

        static {
            HashMap map = new HashMap(9);
            f3136a = map;
            SVG.Unit unit = SVG.Unit.pt;
            map.put("xx-small", new SVG.C4791o(0.694f, unit));
            map.put("x-small", new SVG.C4791o(0.833f, unit));
            map.put("small", new SVG.C4791o(10.0f, unit));
            map.put("medium", new SVG.C4791o(12.0f, unit));
            map.put("large", new SVG.C4791o(14.4f, unit));
            map.put("x-large", new SVG.C4791o(17.3f, unit));
            map.put("xx-large", new SVG.C4791o(20.7f, unit));
            SVG.Unit unit2 = SVG.Unit.percent;
            map.put("smaller", new SVG.C4791o(83.33f, unit2));
            map.put("larger", new SVG.C4791o(120.0f, unit2));
        }

        /* renamed from: a */
        public static SVG.C4791o m3155a(String str) {
            return (SVG.C4791o) f3136a.get(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$e */
    public static class C4819e {

        /* renamed from: a */
        public static final Map f3137a;

        static {
            HashMap map = new HashMap(13);
            f3137a = map;
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
        public static Integer m3156a(String str) {
            return (Integer) f3137a.get(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$f */
    public class C4820f extends DefaultHandler2 {
        public C4820f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i6, int i7) {
            SVGParser.this.m3124c1(new String(cArr, i6, i7));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            SVGParser.this.m3140o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            SVGParser.this.m3141p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            SVGParser.this.m3143r(str, SVGParser.this.m3148x0(new C4821g(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            SVGParser.this.m3115W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
            SVGParser.this.m3117X0(str, str2, str3, attributes);
        }

        public /* synthetic */ C4820f(SVGParser sVGParser, C4815a c4815a) {
            this();
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$g */
    public static class C4821g {

        /* renamed from: a */
        public String f3139a;

        /* renamed from: c */
        public int f3141c;

        /* renamed from: b */
        public int f3140b = 0;

        /* renamed from: d */
        public C6216b f3142d = new C6216b();

        public C4821g(String str) {
            this.f3141c = 0;
            String strTrim = str.trim();
            this.f3139a = strTrim;
            this.f3141c = strTrim.length();
        }

        /* renamed from: A */
        public void m3157A() {
            while (true) {
                int i6 = this.f3140b;
                if (i6 >= this.f3141c || !m3168k(this.f3139a.charAt(i6))) {
                    return;
                } else {
                    this.f3140b++;
                }
            }
        }

        /* renamed from: a */
        public int m3158a() {
            int i6 = this.f3140b;
            int i7 = this.f3141c;
            if (i6 == i7) {
                return -1;
            }
            int i8 = i6 + 1;
            this.f3140b = i8;
            if (i8 < i7) {
                return this.f3139a.charAt(i8);
            }
            return -1;
        }

        /* renamed from: b */
        public String m3159b() {
            int i6 = this.f3140b;
            while (!m3165h() && !m3168k(this.f3139a.charAt(this.f3140b))) {
                this.f3140b++;
            }
            String strSubstring = this.f3139a.substring(i6, this.f3140b);
            this.f3140b = i6;
            return strSubstring;
        }

        /* renamed from: c */
        public Boolean m3160c(Object obj) {
            if (obj == null) {
                return null;
            }
            m3183z();
            return m3170m();
        }

        /* renamed from: d */
        public float m3161d(float f6) {
            if (Float.isNaN(f6)) {
                return Float.NaN;
            }
            m3183z();
            return m3171n();
        }

        /* renamed from: e */
        public float m3162e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            m3183z();
            return m3171n();
        }

        /* renamed from: f */
        public boolean m3163f(char c7) {
            int i6 = this.f3140b;
            boolean z6 = i6 < this.f3141c && this.f3139a.charAt(i6) == c7;
            if (z6) {
                this.f3140b++;
            }
            return z6;
        }

        /* renamed from: g */
        public boolean m3164g(String str) {
            int length = str.length();
            int i6 = this.f3140b;
            boolean z6 = i6 <= this.f3141c - length && this.f3139a.substring(i6, i6 + length).equals(str);
            if (z6) {
                this.f3140b += length;
            }
            return z6;
        }

        /* renamed from: h */
        public boolean m3165h() {
            return this.f3140b == this.f3141c;
        }

        /* renamed from: i */
        public boolean m3166i() {
            int i6 = this.f3140b;
            if (i6 == this.f3141c) {
                return false;
            }
            char cCharAt = this.f3139a.charAt(i6);
            if (cCharAt < 'a' || cCharAt > 'z') {
                return cCharAt >= 'A' && cCharAt <= 'Z';
            }
            return true;
        }

        /* renamed from: j */
        public boolean m3167j(int i6) {
            return i6 == 10 || i6 == 13;
        }

        /* renamed from: k */
        public boolean m3168k(int i6) {
            return i6 == 32 || i6 == 10 || i6 == 13 || i6 == 9;
        }

        /* renamed from: l */
        public Integer m3169l() {
            int i6 = this.f3140b;
            if (i6 == this.f3141c) {
                return null;
            }
            String str = this.f3139a;
            this.f3140b = i6 + 1;
            return Integer.valueOf(str.charAt(i6));
        }

        /* renamed from: m */
        public Boolean m3170m() {
            int i6 = this.f3140b;
            if (i6 == this.f3141c) {
                return null;
            }
            char cCharAt = this.f3139a.charAt(i6);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f3140b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        /* renamed from: n */
        public float m3171n() {
            float fM6324b = this.f3142d.m6324b(this.f3139a, this.f3140b, this.f3141c);
            if (!Float.isNaN(fM6324b)) {
                this.f3140b = this.f3142d.m6323a();
            }
            return fM6324b;
        }

        /* renamed from: o */
        public String m3172o() {
            if (m3165h()) {
                return null;
            }
            int i6 = this.f3140b;
            int iCharAt = this.f3139a.charAt(i6);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = m3158a();
            }
            int i7 = this.f3140b;
            while (m3168k(iCharAt)) {
                iCharAt = m3158a();
            }
            if (iCharAt == 40) {
                this.f3140b++;
                return this.f3139a.substring(i6, i7);
            }
            this.f3140b = i6;
            return null;
        }

        /* renamed from: p */
        public SVG.C4791o m3173p() {
            float fM3171n = m3171n();
            if (Float.isNaN(fM3171n)) {
                return null;
            }
            SVG.Unit unitM3179v = m3179v();
            return unitM3179v == null ? new SVG.C4791o(fM3171n, SVG.Unit.px) : new SVG.C4791o(fM3171n, unitM3179v);
        }

        /* renamed from: q */
        public String m3174q() {
            if (m3165h()) {
                return null;
            }
            int i6 = this.f3140b;
            char cCharAt = this.f3139a.charAt(i6);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iM3158a = m3158a();
            while (iM3158a != -1 && iM3158a != cCharAt) {
                iM3158a = m3158a();
            }
            if (iM3158a == -1) {
                this.f3140b = i6;
                return null;
            }
            int i7 = this.f3140b;
            this.f3140b = i7 + 1;
            return this.f3139a.substring(i6 + 1, i7);
        }

        /* renamed from: r */
        public String m3175r() {
            return m3177t(' ', false);
        }

        /* renamed from: s */
        public String m3176s(char c7) {
            return m3177t(c7, false);
        }

        /* renamed from: t */
        public String m3177t(char c7, boolean z6) {
            if (m3165h()) {
                return null;
            }
            char cCharAt = this.f3139a.charAt(this.f3140b);
            if ((!z6 && m3168k(cCharAt)) || cCharAt == c7) {
                return null;
            }
            int i6 = this.f3140b;
            int iM3158a = m3158a();
            while (iM3158a != -1 && iM3158a != c7 && (z6 || !m3168k(iM3158a))) {
                iM3158a = m3158a();
            }
            return this.f3139a.substring(i6, this.f3140b);
        }

        /* renamed from: u */
        public String m3178u(char c7) {
            return m3177t(c7, true);
        }

        /* renamed from: v */
        public SVG.Unit m3179v() {
            if (m3165h()) {
                return null;
            }
            if (this.f3139a.charAt(this.f3140b) == '%') {
                this.f3140b++;
                return SVG.Unit.percent;
            }
            int i6 = this.f3140b;
            if (i6 > this.f3141c - 2) {
                return null;
            }
            try {
                SVG.Unit unitValueOf = SVG.Unit.valueOf(this.f3139a.substring(i6, i6 + 2).toLowerCase(Locale.US));
                this.f3140b += 2;
                return unitValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: w */
        public String m3180w() {
            if (m3165h()) {
                return null;
            }
            int i6 = this.f3140b;
            char cCharAt = this.f3139a.charAt(i6);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.f3140b = i6;
                return null;
            }
            int iM3158a = m3158a();
            while (true) {
                if ((iM3158a < 65 || iM3158a > 90) && (iM3158a < 97 || iM3158a > 122)) {
                    break;
                }
                iM3158a = m3158a();
            }
            return this.f3139a.substring(i6, this.f3140b);
        }

        /* renamed from: x */
        public float m3181x() {
            m3183z();
            float fM6324b = this.f3142d.m6324b(this.f3139a, this.f3140b, this.f3141c);
            if (!Float.isNaN(fM6324b)) {
                this.f3140b = this.f3142d.m6323a();
            }
            return fM6324b;
        }

        /* renamed from: y */
        public String m3182y() {
            if (m3165h()) {
                return null;
            }
            int i6 = this.f3140b;
            this.f3140b = this.f3141c;
            return this.f3139a.substring(i6);
        }

        /* renamed from: z */
        public boolean m3183z() {
            m3157A();
            int i6 = this.f3140b;
            if (i6 == this.f3141c || this.f3139a.charAt(i6) != ',') {
                return false;
            }
            this.f3140b++;
            m3157A();
            return true;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$h */
    public class C4822h implements Attributes {

        /* renamed from: a */
        public XmlPullParser f3143a;

        public C4822h(XmlPullParser xmlPullParser) {
            this.f3143a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f3143a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i6) {
            return this.f3143a.getAttributeName(i6);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i6) {
            String attributeName = this.f3143a.getAttributeName(i6);
            if (this.f3143a.getAttributePrefix(i6) == null) {
                return attributeName;
            }
            return this.f3143a.getAttributePrefix(i6) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i6) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i6) {
            return this.f3143a.getAttributeNamespace(i6);
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
        public String getValue(int i6) {
            return this.f3143a.getAttributeValue(i6);
        }
    }

    /* renamed from: A0 */
    public static Set m3036A0(String str) {
        C4821g c4821g = new C4821g(str);
        HashSet hashSet = new HashSet();
        while (!c4821g.m3165h()) {
            hashSet.add(c4821g.m3175r());
            c4821g.m3157A();
        }
        return hashSet;
    }

    /* renamed from: B0 */
    public static SVG.C4791o[] m3037B0(String str) {
        SVG.C4791o c4791oM3173p;
        C4821g c4821g = new C4821g(str);
        c4821g.m3157A();
        if (c4821g.m3165h() || (c4791oM3173p = c4821g.m3173p()) == null || c4791oM3173p.m3025j()) {
            return null;
        }
        float fM3019b = c4791oM3173p.m3019b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c4791oM3173p);
        while (!c4821g.m3165h()) {
            c4821g.m3183z();
            SVG.C4791o c4791oM3173p2 = c4821g.m3173p();
            if (c4791oM3173p2 == null || c4791oM3173p2.m3025j()) {
                return null;
            }
            arrayList.add(c4791oM3173p2);
            fM3019b += c4791oM3173p2.m3019b();
        }
        if (fM3019b == 0.0f) {
            return null;
        }
        return (SVG.C4791o[]) arrayList.toArray(new SVG.C4791o[arrayList.size()]);
    }

    /* renamed from: C0 */
    public static SVG.Style.LineCap m3038C0(String str) {
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
    public static SVG.Style.LineJoin m3039D0(String str) {
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
    public static void m3040E0(SVG.AbstractC4782j0 abstractC4782j0, String str) {
        C4821g c4821g = new C4821g(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strM3176s = c4821g.m3176s(':');
            c4821g.m3157A();
            if (!c4821g.m3163f(':')) {
                return;
            }
            c4821g.m3157A();
            String strM3178u = c4821g.m3178u(';');
            if (strM3178u == null) {
                return;
            }
            c4821g.m3157A();
            if (c4821g.m3165h() || c4821g.m3163f(';')) {
                if (abstractC4782j0.f2926f == null) {
                    abstractC4782j0.f2926f = new SVG.Style();
                }
                m3047S0(abstractC4782j0.f2926f, strM3176s, strM3178u);
                c4821g.m3157A();
            }
        }
    }

    /* renamed from: F0 */
    public static Set m3041F0(String str) {
        C4821g c4821g = new C4821g(str);
        HashSet hashSet = new HashSet();
        while (!c4821g.m3165h()) {
            String strM3175r = c4821g.m3175r();
            int iIndexOf = strM3175r.indexOf(45);
            if (iIndexOf != -1) {
                strM3175r = strM3175r.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strM3175r, "", "").getLanguage());
            c4821g.m3157A();
        }
        return hashSet;
    }

    /* renamed from: G0 */
    public static SVG.Style.TextAnchor m3042G0(String str) {
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
    public static SVG.Style.TextDecoration m3043H0(String str) {
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
    public static SVG.Style.TextDirection m3044I0(String str) {
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
    public static SVG.Style.VectorEffect m3045M0(String str) {
        str.getClass();
        if (str.equals(SchedulerSupport.NONE)) {
            return SVG.Style.VectorEffect.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return SVG.Style.VectorEffect.NonScalingStroke;
        }
        return null;
    }

    /* renamed from: N0 */
    public static SVG.C4763b m3046N0(String str) throws SVGParseException {
        C4821g c4821g = new C4821g(str);
        c4821g.m3157A();
        float fM3171n = c4821g.m3171n();
        c4821g.m3183z();
        float fM3171n2 = c4821g.m3171n();
        c4821g.m3183z();
        float fM3171n3 = c4821g.m3171n();
        c4821g.m3183z();
        float fM3171n4 = c4821g.m3171n();
        if (Float.isNaN(fM3171n) || Float.isNaN(fM3171n2) || Float.isNaN(fM3171n3) || Float.isNaN(fM3171n4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        }
        if (fM3171n3 < 0.0f) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        }
        if (fM3171n4 >= 0.0f) {
            return new SVG.C4763b(fM3171n, fM3171n2, fM3171n3, fM3171n4);
        }
        throw new SVGParseException("Invalid viewBox. height cannot be negative");
    }

    /* renamed from: S0 */
    public static void m3047S0(SVG.Style style, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (C4815a.f3133b[SVGAttr.m3151a(str).ordinal()]) {
                case 47:
                    SVG.AbstractC4788m0 abstractC4788m0M3076t0 = m3076t0(str2);
                    style.f2796b = abstractC4788m0M3076t0;
                    if (abstractC4788m0M3076t0 != null) {
                        style.f2795a |= 1;
                        break;
                    }
                    break;
                case 48:
                    SVG.Style.FillRule fillRuleM3057e0 = m3057e0(str2);
                    style.f2797c = fillRuleM3057e0;
                    if (fillRuleM3057e0 != null) {
                        style.f2795a |= 2;
                        break;
                    }
                    break;
                case 49:
                    Float fM3072r0 = m3072r0(str2);
                    style.f2798d = fM3072r0;
                    if (fM3072r0 != null) {
                        style.f2795a |= 4;
                        break;
                    }
                    break;
                case 50:
                    SVG.AbstractC4788m0 abstractC4788m0M3076t02 = m3076t0(str2);
                    style.f2799e = abstractC4788m0M3076t02;
                    if (abstractC4788m0M3076t02 != null) {
                        style.f2795a |= 8;
                        break;
                    }
                    break;
                case 51:
                    Float fM3072r02 = m3072r0(str2);
                    style.f2800f = fM3072r02;
                    if (fM3072r02 != null) {
                        style.f2795a |= 16;
                        break;
                    }
                    break;
                case 52:
                    style.f2801g = m3069o0(str2);
                    style.f2795a |= 32;
                    break;
                case 53:
                    SVG.Style.LineCap lineCapM3038C0 = m3038C0(str2);
                    style.f2802h = lineCapM3038C0;
                    if (lineCapM3038C0 != null) {
                        style.f2795a |= 64;
                        break;
                    }
                    break;
                case 54:
                    SVG.Style.LineJoin lineJoinM3039D0 = m3039D0(str2);
                    style.f2803i = lineJoinM3039D0;
                    if (lineJoinM3039D0 != null) {
                        style.f2795a |= 128;
                        break;
                    }
                    break;
                case 55:
                    style.f2804j = Float.valueOf(m3059f0(str2));
                    style.f2795a |= 256;
                    break;
                case 56:
                    if (!SchedulerSupport.NONE.equals(str2)) {
                        SVG.C4791o[] c4791oArrM3037B0 = m3037B0(str2);
                        style.f2805k = c4791oArrM3037B0;
                        if (c4791oArrM3037B0 != null) {
                            style.f2795a |= 512;
                            break;
                        }
                    } else {
                        style.f2805k = null;
                        style.f2795a |= 512;
                        break;
                    }
                    break;
                case 57:
                    style.f2806l = m3069o0(str2);
                    style.f2795a |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    break;
                case 58:
                    style.f2807m = m3072r0(str2);
                    style.f2795a |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                    break;
                case 59:
                    style.f2808n = m3051b0(str2);
                    style.f2795a |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    break;
                case 60:
                    m3062h0(style, str2);
                    break;
                case 61:
                    List listM3063i0 = m3063i0(str2);
                    style.f2809o = listM3063i0;
                    if (listM3063i0 != null) {
                        style.f2795a |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                        break;
                    }
                    break;
                case 62:
                    SVG.C4791o c4791oM3065j0 = m3065j0(str2);
                    style.f2810p = c4791oM3065j0;
                    if (c4791oM3065j0 != null) {
                        style.f2795a |= PlaybackStateCompat.ACTION_PREPARE;
                        break;
                    }
                    break;
                case 63:
                    Integer numM3067l0 = m3067l0(str2);
                    style.f2811q = numM3067l0;
                    if (numM3067l0 != null) {
                        style.f2795a |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                        break;
                    }
                    break;
                case 64:
                    SVG.Style.FontStyle fontStyleM3066k0 = m3066k0(str2);
                    style.f2812r = fontStyleM3066k0;
                    if (fontStyleM3066k0 != null) {
                        style.f2795a |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                        break;
                    }
                    break;
                case 65:
                    SVG.Style.TextDecoration textDecorationM3043H0 = m3043H0(str2);
                    style.f2813s = textDecorationM3043H0;
                    if (textDecorationM3043H0 != null) {
                        style.f2795a |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                        break;
                    }
                    break;
                case 66:
                    SVG.Style.TextDirection textDirectionM3044I0 = m3044I0(str2);
                    style.f2814t = textDirectionM3044I0;
                    if (textDirectionM3044I0 != null) {
                        style.f2795a |= 68719476736L;
                        break;
                    }
                    break;
                case 67:
                    SVG.Style.TextAnchor textAnchorM3042G0 = m3042G0(str2);
                    style.f2815u = textAnchorM3042G0;
                    if (textAnchorM3042G0 != null) {
                        style.f2795a |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        break;
                    }
                    break;
                case 68:
                    Boolean boolM3074s0 = m3074s0(str2);
                    style.f2816v = boolM3074s0;
                    if (boolM3074s0 != null) {
                        style.f2795a |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                        break;
                    }
                    break;
                case 69:
                    String strM3068m0 = m3068m0(str2, str);
                    style.f2818x = strM3068m0;
                    style.f2819y = strM3068m0;
                    style.f2820z = strM3068m0;
                    style.f2795a |= 14680064;
                    break;
                case 70:
                    style.f2818x = m3068m0(str2, str);
                    style.f2795a |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                    break;
                case 71:
                    style.f2819y = m3068m0(str2, str);
                    style.f2795a |= 4194304;
                    break;
                case 72:
                    style.f2820z = m3068m0(str2, str);
                    style.f2795a |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            style.f2782A = Boolean.valueOf(!str2.equals(SchedulerSupport.NONE));
                            style.f2795a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            style.f2783B = Boolean.valueOf(str2.equals("visible"));
                            style.f2795a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        style.f2784C = SVG.C4775g.m3017b();
                    } else {
                        try {
                            style.f2784C = m3051b0(str2);
                        } catch (SVGParseException e6) {
                            Log.w("SVGParser", e6.getMessage());
                            return;
                        }
                    }
                    style.f2795a |= 67108864;
                    break;
                case 76:
                    style.f2785D = m3072r0(str2);
                    style.f2795a |= 134217728;
                    break;
                case 77:
                    SVG.C4766c c4766cM3049a0 = m3049a0(str2);
                    style.f2817w = c4766cM3049a0;
                    if (c4766cM3049a0 != null) {
                        style.f2795a |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                        break;
                    }
                    break;
                case 78:
                    style.f2786E = m3068m0(str2, str);
                    style.f2795a |= 268435456;
                    break;
                case 79:
                    style.f2787F = m3057e0(str2);
                    style.f2795a |= 536870912;
                    break;
                case 80:
                    style.f2788G = m3068m0(str2, str);
                    style.f2795a |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        style.f2789H = SVG.C4775g.m3017b();
                    } else {
                        try {
                            style.f2789H = m3051b0(str2);
                        } catch (SVGParseException e7) {
                            Log.w("SVGParser", e7.getMessage());
                            return;
                        }
                    }
                    style.f2795a |= 2147483648L;
                    break;
                case 82:
                    style.f2790I = m3072r0(str2);
                    style.f2795a |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        style.f2791J = SVG.C4775g.m3017b();
                    } else {
                        try {
                            style.f2791J = m3051b0(str2);
                        } catch (SVGParseException e8) {
                            Log.w("SVGParser", e8.getMessage());
                            return;
                        }
                    }
                    style.f2795a |= 8589934592L;
                    break;
                case 84:
                    style.f2792K = m3072r0(str2);
                    style.f2795a |= 17179869184L;
                    break;
                case 85:
                    SVG.Style.VectorEffect vectorEffectM3045M0 = m3045M0(str2);
                    style.f2793L = vectorEffectM3045M0;
                    if (vectorEffectM3045M0 != null) {
                        style.f2795a |= 34359738368L;
                        break;
                    }
                    break;
                case 86:
                    SVG.Style.RenderQuality renderQualityM3080y0 = m3080y0(str2);
                    style.f2794M = renderQualityM3080y0;
                    if (renderQualityM3080y0 != null) {
                        style.f2795a |= 137438953472L;
                        break;
                    }
                    break;
            }
        } catch (SVGParseException unused) {
        }
    }

    /* renamed from: a0 */
    public static SVG.C4766c m3049a0(String str) {
        if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        C4821g c4821g = new C4821g(str.substring(5));
        c4821g.m3157A();
        SVG.C4791o c4791oM3071q0 = m3071q0(c4821g);
        c4821g.m3183z();
        SVG.C4791o c4791oM3071q02 = m3071q0(c4821g);
        c4821g.m3183z();
        SVG.C4791o c4791oM3071q03 = m3071q0(c4821g);
        c4821g.m3183z();
        SVG.C4791o c4791oM3071q04 = m3071q0(c4821g);
        c4821g.m3157A();
        if (c4821g.m3163f(')') || c4821g.m3165h()) {
            return new SVG.C4766c(c4791oM3071q0, c4791oM3071q02, c4791oM3071q03, c4791oM3071q04);
        }
        return null;
    }

    /* renamed from: b0 */
    public static SVG.C4773f m3051b0(String str) throws SVGParseException {
        if (str.charAt(0) == '#') {
            C6215a c6215aM6319b = C6215a.m6319b(str, 1, str.length());
            if (c6215aM6319b == null) {
                throw new SVGParseException("Bad hex colour value: " + str);
            }
            int iM6321a = c6215aM6319b.m6321a();
            if (iM6321a == 4) {
                int iM6322d = c6215aM6319b.m6322d();
                int i6 = iM6322d & 3840;
                int i7 = iM6322d & 240;
                int i8 = iM6322d & 15;
                return new SVG.C4773f(i8 | (i6 << 8) | (-16777216) | (i6 << 12) | (i7 << 8) | (i7 << 4) | (i8 << 4));
            }
            if (iM6321a == 5) {
                int iM6322d2 = c6215aM6319b.m6322d();
                int i9 = 61440 & iM6322d2;
                int i10 = iM6322d2 & 3840;
                int i11 = iM6322d2 & 240;
                int i12 = iM6322d2 & 15;
                return new SVG.C4773f((i12 << 24) | (i12 << 28) | (i9 << 8) | (i9 << 4) | (i10 << 4) | i10 | i11 | (i11 >> 4));
            }
            if (iM6321a == 7) {
                return new SVG.C4773f(c6215aM6319b.m6322d() | ViewCompat.MEASURED_STATE_MASK);
            }
            if (iM6321a == 9) {
                return new SVG.C4773f((c6215aM6319b.m6322d() >>> 8) | (c6215aM6319b.m6322d() << 24));
            }
            throw new SVGParseException("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return m3053c0(lowerCase);
            }
            C4821g c4821g = new C4821g(str.substring(zStartsWith2 ? 5 : 4));
            c4821g.m3157A();
            float fM3171n = c4821g.m3171n();
            float fM3161d = c4821g.m3161d(fM3171n);
            if (!Float.isNaN(fM3161d)) {
                c4821g.m3163f('%');
            }
            float fM3161d2 = c4821g.m3161d(fM3161d);
            if (!Float.isNaN(fM3161d2)) {
                c4821g.m3163f('%');
            }
            if (!zStartsWith2) {
                c4821g.m3157A();
                if (!Float.isNaN(fM3161d2) && c4821g.m3163f(')')) {
                    return new SVG.C4773f(m3073s(fM3171n, fM3161d, fM3161d2) | ViewCompat.MEASURED_STATE_MASK);
                }
                throw new SVGParseException("Bad hsl() colour value: " + str);
            }
            float fM3161d3 = c4821g.m3161d(fM3161d2);
            c4821g.m3157A();
            if (!Float.isNaN(fM3161d3) && c4821g.m3163f(')')) {
                return new SVG.C4773f((m3064j(fM3161d3 * 256.0f) << 24) | m3073s(fM3171n, fM3161d, fM3161d2));
            }
            throw new SVGParseException("Bad hsla() colour value: " + str);
        }
        C4821g c4821g2 = new C4821g(str.substring(zStartsWith ? 5 : 4));
        c4821g2.m3157A();
        float fM3171n2 = c4821g2.m3171n();
        if (!Float.isNaN(fM3171n2) && c4821g2.m3163f('%')) {
            fM3171n2 = (fM3171n2 * 256.0f) / 100.0f;
        }
        float fM3161d4 = c4821g2.m3161d(fM3171n2);
        if (!Float.isNaN(fM3161d4) && c4821g2.m3163f('%')) {
            fM3161d4 = (fM3161d4 * 256.0f) / 100.0f;
        }
        float fM3161d5 = c4821g2.m3161d(fM3161d4);
        if (!Float.isNaN(fM3161d5) && c4821g2.m3163f('%')) {
            fM3161d5 = (fM3161d5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            c4821g2.m3157A();
            if (!Float.isNaN(fM3161d5) && c4821g2.m3163f(')')) {
                return new SVG.C4773f((m3064j(fM3171n2) << 16) | ViewCompat.MEASURED_STATE_MASK | (m3064j(fM3161d4) << 8) | m3064j(fM3161d5));
            }
            throw new SVGParseException("Bad rgb() colour value: " + str);
        }
        float fM3161d6 = c4821g2.m3161d(fM3161d5);
        c4821g2.m3157A();
        if (!Float.isNaN(fM3161d6) && c4821g2.m3163f(')')) {
            return new SVG.C4773f((m3064j(fM3161d6 * 256.0f) << 24) | (m3064j(fM3171n2) << 16) | (m3064j(fM3161d4) << 8) | m3064j(fM3161d5));
        }
        throw new SVGParseException("Bad rgba() colour value: " + str);
    }

    /* renamed from: c0 */
    public static SVG.C4773f m3053c0(String str) throws SVGParseException {
        Integer numM3154a = C4817c.m3154a(str);
        if (numM3154a != null) {
            return new SVG.C4773f(numM3154a.intValue());
        }
        throw new SVGParseException("Invalid colour keyword: " + str);
    }

    /* renamed from: d0 */
    public static SVG.AbstractC4788m0 m3055d0(String str) {
        str.getClass();
        if (str.equals(SchedulerSupport.NONE)) {
            return SVG.C4773f.f2899c;
        }
        if (str.equals("currentColor")) {
            return SVG.C4775g.m3017b();
        }
        try {
            return m3051b0(str);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    /* renamed from: e0 */
    public static SVG.Style.FillRule m3057e0(String str) {
        if ("nonzero".equals(str)) {
            return SVG.Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return SVG.Style.FillRule.EvenOdd;
        }
        return null;
    }

    /* renamed from: f0 */
    public static float m3059f0(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return m3061g0(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    /* renamed from: g0 */
    public static float m3061g0(String str, int i6, int i7) throws SVGParseException {
        float fM6324b = new C6216b().m6324b(str, i6, i7);
        if (!Float.isNaN(fM6324b)) {
            return fM6324b;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    /* renamed from: h0 */
    public static void m3062h0(SVG.Style style, String str) {
        String strM3176s;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            C4821g c4821g = new C4821g(str);
            Integer numM3156a = null;
            SVG.Style.FontStyle fontStyleM3066k0 = null;
            String str2 = null;
            while (true) {
                strM3176s = c4821g.m3176s('/');
                c4821g.m3157A();
                if (strM3176s != null) {
                    if (numM3156a != null && fontStyleM3066k0 != null) {
                        break;
                    }
                    if (!strM3176s.equals("normal") && (numM3156a != null || (numM3156a = C4819e.m3156a(strM3176s)) == null)) {
                        if (fontStyleM3066k0 != null || (fontStyleM3066k0 = m3066k0(strM3176s)) == null) {
                            if (str2 != null || !strM3176s.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strM3176s;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            SVG.C4791o c4791oM3065j0 = m3065j0(strM3176s);
            if (c4821g.m3163f('/')) {
                c4821g.m3157A();
                String strM3175r = c4821g.m3175r();
                if (strM3175r != null) {
                    try {
                        m3069o0(strM3175r);
                    } catch (SVGParseException unused) {
                        return;
                    }
                }
                c4821g.m3157A();
            }
            style.f2809o = m3063i0(c4821g.m3182y());
            style.f2810p = c4791oM3065j0;
            style.f2811q = Integer.valueOf(numM3156a == null ? 400 : numM3156a.intValue());
            if (fontStyleM3066k0 == null) {
                fontStyleM3066k0 = SVG.Style.FontStyle.Normal;
            }
            style.f2812r = fontStyleM3066k0;
            style.f2795a |= 122880;
        }
    }

    /* renamed from: i0 */
    public static List m3063i0(String str) {
        C4821g c4821g = new C4821g(str);
        ArrayList arrayList = null;
        do {
            String strM3174q = c4821g.m3174q();
            if (strM3174q == null) {
                strM3174q = c4821g.m3178u(',');
            }
            if (strM3174q == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strM3174q);
            c4821g.m3183z();
        } while (!c4821g.m3165h());
        return arrayList;
    }

    /* renamed from: j */
    public static int m3064j(float f6) {
        if (f6 < 0.0f) {
            return 0;
        }
        if (f6 > 255.0f) {
            return 255;
        }
        return Math.round(f6);
    }

    /* renamed from: j0 */
    public static SVG.C4791o m3065j0(String str) {
        try {
            SVG.C4791o c4791oM3155a = C4818d.m3155a(str);
            return c4791oM3155a == null ? m3069o0(str) : c4791oM3155a;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    /* renamed from: k0 */
    public static SVG.Style.FontStyle m3066k0(String str) {
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
    public static Integer m3067l0(String str) {
        return C4819e.m3156a(str);
    }

    /* renamed from: m0 */
    public static String m3068m0(String str, String str2) {
        if (!str.equals(SchedulerSupport.NONE) && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    /* renamed from: o0 */
    public static SVG.C4791o m3069o0(String str) throws SVGParseException {
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
            return new SVG.C4791o(m3061g0(str, 0, length), unitValueOf);
        } catch (NumberFormatException e6) {
            throw new SVGParseException("Invalid length value: " + str, e6);
        }
    }

    /* renamed from: p0 */
    public static List m3070p0(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C4821g c4821g = new C4821g(str);
        c4821g.m3157A();
        while (!c4821g.m3165h()) {
            float fM3171n = c4821g.m3171n();
            if (Float.isNaN(fM3171n)) {
                throw new SVGParseException("Invalid length list value: " + c4821g.m3159b());
            }
            SVG.Unit unitM3179v = c4821g.m3179v();
            if (unitM3179v == null) {
                unitM3179v = SVG.Unit.px;
            }
            arrayList.add(new SVG.C4791o(fM3171n, unitM3179v));
            c4821g.m3183z();
        }
        return arrayList;
    }

    /* renamed from: q0 */
    public static SVG.C4791o m3071q0(C4821g c4821g) {
        return c4821g.m3164g(DebugKt.DEBUG_PROPERTY_VALUE_AUTO) ? new SVG.C4791o(0.0f) : c4821g.m3173p();
    }

    /* renamed from: r0 */
    public static Float m3072r0(String str) {
        try {
            float fM3059f0 = m3059f0(str);
            float f6 = 0.0f;
            if (fM3059f0 < 0.0f) {
                fM3059f0 = f6;
            } else {
                f6 = 1.0f;
                if (fM3059f0 > 1.0f) {
                    fM3059f0 = f6;
                }
            }
            return Float.valueOf(fM3059f0);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static int m3073s(float f6, float f7, float f8) {
        float f9 = f6 % 360.0f;
        if (f6 < 0.0f) {
            f9 += 360.0f;
        }
        float f10 = f9 / 60.0f;
        float f11 = f7 / 100.0f;
        float f12 = f8 / 100.0f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        } else if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        float f13 = f12 >= 0.0f ? f12 > 1.0f ? 1.0f : f12 : 0.0f;
        float f14 = f13 <= 0.5f ? (f11 + 1.0f) * f13 : (f13 + f11) - (f11 * f13);
        float f15 = (f13 * 2.0f) - f14;
        return m3064j(m3075t(f15, f14, f10 - 2.0f) * 256.0f) | (m3064j(m3075t(f15, f14, f10 + 2.0f) * 256.0f) << 16) | (m3064j(m3075t(f15, f14, f10) * 256.0f) << 8);
    }

    /* renamed from: s0 */
    public static Boolean m3074s0(String str) {
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
    public static float m3075t(float f6, float f7, float f8) {
        float f9;
        if (f8 < 0.0f) {
            f8 += 6.0f;
        }
        if (f8 >= 6.0f) {
            f8 -= 6.0f;
        }
        if (f8 < 1.0f) {
            f9 = (f7 - f6) * f8;
        } else {
            if (f8 < 3.0f) {
                return f7;
            }
            if (f8 >= 4.0f) {
                return f6;
            }
            f9 = (f7 - f6) * (4.0f - f8);
        }
        return f9 + f6;
    }

    /* renamed from: t0 */
    public static SVG.AbstractC4788m0 m3076t0(String str) {
        if (!str.startsWith("url(")) {
            return m3055d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new SVG.C4801t(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new SVG.C4801t(strTrim, strTrim2.length() > 0 ? m3055d0(strTrim2) : null);
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
    public static com.caverock.androidsvg.SVG.C4805v m3077u0(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.m3077u0(java.lang.String):com.caverock.androidsvg.SVG$v");
    }

    /* renamed from: v0 */
    public static PreserveAspectRatio m3078v0(String str) throws SVGParseException {
        PreserveAspectRatio.Scale scale;
        C4821g c4821g = new C4821g(str);
        c4821g.m3157A();
        String strM3175r = c4821g.m3175r();
        if ("defer".equals(strM3175r)) {
            c4821g.m3157A();
            strM3175r = c4821g.m3175r();
        }
        PreserveAspectRatio.Alignment alignmentM3153a = C4816b.m3153a(strM3175r);
        c4821g.m3157A();
        if (c4821g.m3165h()) {
            scale = null;
        } else {
            String strM3175r2 = c4821g.m3175r();
            strM3175r2.getClass();
            if (strM3175r2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.meet;
            } else {
                if (!strM3175r2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
                }
                scale = PreserveAspectRatio.Scale.slice;
            }
        }
        return new PreserveAspectRatio(alignmentM3153a, scale);
    }

    /* renamed from: w0 */
    public static void m3079w0(SVG.AbstractC4790n0 abstractC4790n0, String str) {
        abstractC4790n0.f2942o = m3078v0(str);
    }

    /* renamed from: y0 */
    public static SVG.Style.RenderQuality m3080y0(String str) {
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
    public static Set m3081z0(String str) {
        C4821g c4821g = new C4821g(str);
        HashSet hashSet = new HashSet();
        while (!c4821g.m3165h()) {
            String strM3175r = c4821g.m3175r();
            if (strM3175r.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strM3175r.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            c4821g.m3157A();
        }
        return hashSet;
    }

    /* renamed from: A */
    public final void m3082A(SVG.C4769d c4769d, Attributes attributes) throws SVGParseException {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            switch (C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()]) {
                case 12:
                    c4769d.f2889o = m3069o0(strTrim);
                    break;
                case 13:
                    c4769d.f2890p = m3069o0(strTrim);
                    break;
                case 14:
                    SVG.C4791o c4791oM3069o0 = m3069o0(strTrim);
                    c4769d.f2891q = c4791oM3069o0;
                    if (c4791oM3069o0.m3025j()) {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
            }
        }
    }

    /* renamed from: B */
    public final void m3083B(SVG.C4771e c4771e, Attributes attributes) throws SVGParseException {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            if (C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    c4771e.f2897p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute clipPathUnits");
                    }
                    c4771e.f2897p = Boolean.TRUE;
                }
            }
        }
    }

    /* renamed from: C */
    public final void m3084C(SVG.InterfaceC4772e0 interfaceC4772e0, Attributes attributes) {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            switch (C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()]) {
                case 21:
                    interfaceC4772e0.mo3010e(m3081z0(strTrim));
                    break;
                case 22:
                    interfaceC4772e0.mo3014j(strTrim);
                    break;
                case 23:
                    interfaceC4772e0.mo3012g(m3041F0(strTrim));
                    break;
                case 24:
                    interfaceC4772e0.mo3013i(m3036A0(strTrim));
                    break;
                case 25:
                    List listM3063i0 = m3063i0(strTrim);
                    interfaceC4772e0.mo3009c(listM3063i0 != null ? new HashSet(listM3063i0) : new HashSet(0));
                    break;
            }
        }
    }

    /* renamed from: D */
    public final void m3085D(SVG.AbstractC4782j0 abstractC4782j0, Attributes attributes) throws SVGParseException {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String qName = attributes.getQName(i6);
            if (qName.equals("id") || qName.equals("xml:id")) {
                abstractC4782j0.f2923c = attributes.getValue(i6).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i6).trim();
                if ("default".equals(strTrim)) {
                    abstractC4782j0.f2924d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        abstractC4782j0.f2924d = Boolean.TRUE;
                        return;
                    }
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    /* renamed from: E */
    public final void m3086E(SVG.C4779i c4779i, Attributes attributes) throws SVGParseException {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            switch (C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()]) {
                case 10:
                    SVG.C4791o c4791oM3069o0 = m3069o0(strTrim);
                    c4779i.f2915q = c4791oM3069o0;
                    if (c4791oM3069o0.m3025j()) {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                case 11:
                    SVG.C4791o c4791oM3069o02 = m3069o0(strTrim);
                    c4779i.f2916r = c4791oM3069o02;
                    if (c4791oM3069o02.m3025j()) {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                case 12:
                    c4779i.f2913o = m3069o0(strTrim);
                    break;
                case 13:
                    c4779i.f2914p = m3069o0(strTrim);
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
    public final void m3087F(com.caverock.androidsvg.SVG.AbstractC4781j r5, org.xml.sax.Attributes r6) throws com.caverock.androidsvg.SVGParseException {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L90
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.caverock.androidsvg.SVGParser.C4815a.f3133b
            java.lang.String r3 = r6.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.m3151a(r3)
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
            r5.f2921k = r2     // Catch: java.lang.IllegalArgumentException -> L2d
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
            android.graphics.Matrix r1 = r4.m3092J0(r1)
            r5.f2920j = r1
            goto L8c
        L50:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.f2919i = r1
            goto L8c
        L5d:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.f2919i = r1
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
            r5.f2922l = r1
        L8c:
            int r0 = r0 + 1
            goto L1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.m3087F(com.caverock.androidsvg.SVG$j, org.xml.sax.Attributes):void");
    }

    /* renamed from: G */
    public final void m3088G(SVG.C4789n c4789n, Attributes attributes) throws SVGParseException {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            int i7 = C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()];
            if (i7 == 1) {
                c4789n.f2937q = m3069o0(strTrim);
            } else if (i7 == 2) {
                c4789n.f2938r = m3069o0(strTrim);
            } else if (i7 == 3) {
                SVG.C4791o c4791oM3069o0 = m3069o0(strTrim);
                c4789n.f2939s = c4791oM3069o0;
                if (c4791oM3069o0.m3025j()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i7 == 4) {
                SVG.C4791o c4791oM3069o02 = m3069o0(strTrim);
                c4789n.f2940t = c4791oM3069o02;
                if (c4791oM3069o02.m3025j()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i7 != 6) {
                if (i7 == 7) {
                    m3079w0(c4789n, strTrim);
                }
            } else if ("".equals(attributes.getURI(i6)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i6))) {
                c4789n.f2936p = strTrim;
            }
        }
    }

    /* renamed from: H */
    public final void m3089H(SVG.C4793p c4793p, Attributes attributes) {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            switch (C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()]) {
                case 15:
                    c4793p.f2950o = m3069o0(strTrim);
                    break;
                case 16:
                    c4793p.f2951p = m3069o0(strTrim);
                    break;
                case 17:
                    c4793p.f2952q = m3069o0(strTrim);
                    break;
                case 18:
                    c4793p.f2953r = m3069o0(strTrim);
                    break;
            }
        }
    }

    /* renamed from: I */
    public final void m3090I(SVG.C4784k0 c4784k0, Attributes attributes) {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            switch (C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()]) {
                case 15:
                    c4784k0.f2929m = m3069o0(strTrim);
                    break;
                case 16:
                    c4784k0.f2930n = m3069o0(strTrim);
                    break;
                case 17:
                    c4784k0.f2931o = m3069o0(strTrim);
                    break;
                case 18:
                    c4784k0.f2932p = m3069o0(strTrim);
                    break;
            }
        }
    }

    /* renamed from: J */
    public final void m3091J(SVG.C4795q c4795q, Attributes attributes) throws SVGParseException {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            switch (C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()]) {
                case 26:
                    c4795q.f2956r = m3069o0(strTrim);
                    break;
                case 27:
                    c4795q.f2957s = m3069o0(strTrim);
                    break;
                case 28:
                    SVG.C4791o c4791oM3069o0 = m3069o0(strTrim);
                    c4795q.f2958t = c4791oM3069o0;
                    if (c4791oM3069o0.m3025j()) {
                        throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                case 29:
                    SVG.C4791o c4791oM3069o02 = m3069o0(strTrim);
                    c4795q.f2959u = c4791oM3069o02;
                    if (c4791oM3069o02.m3025j()) {
                        throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new SVGParseException("Invalid value for attribute markerUnits");
                        }
                        c4795q.f2955q = true;
                        break;
                    } else {
                        c4795q.f2955q = false;
                        break;
                    }
                case 31:
                    if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(strTrim)) {
                        c4795q.f2960v = Float.valueOf(Float.NaN);
                        break;
                    } else {
                        c4795q.f2960v = Float.valueOf(m3059f0(strTrim));
                        break;
                    }
            }
        }
    }

    /* renamed from: J0 */
    public final Matrix m3092J0(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        C4821g c4821g = new C4821g(str);
        c4821g.m3157A();
        while (!c4821g.m3165h()) {
            String strM3172o = c4821g.m3172o();
            if (strM3172o == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
            switch (strM3172o) {
                case "matrix":
                    c4821g.m3157A();
                    float fM3171n = c4821g.m3171n();
                    c4821g.m3183z();
                    float fM3171n2 = c4821g.m3171n();
                    c4821g.m3183z();
                    float fM3171n3 = c4821g.m3171n();
                    c4821g.m3183z();
                    float fM3171n4 = c4821g.m3171n();
                    c4821g.m3183z();
                    float fM3171n5 = c4821g.m3171n();
                    c4821g.m3183z();
                    float fM3171n6 = c4821g.m3171n();
                    c4821g.m3157A();
                    if (!Float.isNaN(fM3171n6) && c4821g.m3163f(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{fM3171n, fM3171n3, fM3171n5, fM3171n2, fM3171n4, fM3171n6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "rotate":
                    c4821g.m3157A();
                    float fM3171n7 = c4821g.m3171n();
                    float fM3181x = c4821g.m3181x();
                    float fM3181x2 = c4821g.m3181x();
                    c4821g.m3157A();
                    if (Float.isNaN(fM3171n7) || !c4821g.m3163f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fM3181x)) {
                        matrix.preRotate(fM3171n7);
                        break;
                    } else if (!Float.isNaN(fM3181x2)) {
                        matrix.preRotate(fM3171n7, fM3181x, fM3181x2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "scale":
                    c4821g.m3157A();
                    float fM3171n8 = c4821g.m3171n();
                    float fM3181x3 = c4821g.m3181x();
                    c4821g.m3157A();
                    if (!Float.isNaN(fM3171n8) && c4821g.m3163f(')')) {
                        if (!Float.isNaN(fM3181x3)) {
                            matrix.preScale(fM3171n8, fM3181x3);
                            break;
                        } else {
                            matrix.preScale(fM3171n8, fM3171n8);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                case "skewX":
                    c4821g.m3157A();
                    float fM3171n9 = c4821g.m3171n();
                    c4821g.m3157A();
                    if (!Float.isNaN(fM3171n9) && c4821g.m3163f(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(fM3171n9)), 0.0f);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "skewY":
                    c4821g.m3157A();
                    float fM3171n10 = c4821g.m3171n();
                    c4821g.m3157A();
                    if (!Float.isNaN(fM3171n10) && c4821g.m3163f(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fM3171n10)));
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                case "translate":
                    c4821g.m3157A();
                    float fM3171n11 = c4821g.m3171n();
                    float fM3181x4 = c4821g.m3181x();
                    c4821g.m3157A();
                    if (!Float.isNaN(fM3171n11) && c4821g.m3163f(')')) {
                        if (!Float.isNaN(fM3181x4)) {
                            matrix.preTranslate(fM3171n11, fM3181x4);
                            break;
                        } else {
                            matrix.preTranslate(fM3171n11, 0.0f);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    break;
                default:
                    throw new SVGParseException("Invalid transform list fn: " + strM3172o + ")");
            }
            if (c4821g.m3165h()) {
                return matrix;
            }
            c4821g.m3183z();
        }
        return matrix;
    }

    /* renamed from: K */
    public final void m3093K(SVG.C4797r c4797r, Attributes attributes) throws SVGParseException {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            int i7 = C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()];
            if (i7 == 1) {
                c4797r.f2963q = m3069o0(strTrim);
            } else if (i7 == 2) {
                c4797r.f2964r = m3069o0(strTrim);
            } else if (i7 == 3) {
                SVG.C4791o c4791oM3069o0 = m3069o0(strTrim);
                c4797r.f2965s = c4791oM3069o0;
                if (c4791oM3069o0.m3025j()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (i7 == 4) {
                SVG.C4791o c4791oM3069o02 = m3069o0(strTrim);
                c4797r.f2966t = c4791oM3069o02;
                if (c4791oM3069o02.m3025j()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (i7 != 43) {
                if (i7 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    c4797r.f2962p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute maskContentUnits");
                    }
                    c4797r.f2962p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                c4797r.f2961o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new SVGParseException("Invalid value for attribute maskUnits");
                }
                c4797r.f2961o = Boolean.TRUE;
            }
        }
    }

    /* renamed from: K0 */
    public final void m3094K0(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            C4820f c4820f = new C4820f(this, null);
            xMLReader.setContentHandler(c4820f);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", c4820f);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e6) {
            throw new SVGParseException("Stream error", e6);
        } catch (ParserConfigurationException e7) {
            throw new SVGParseException("XML parser problem", e7);
        } catch (SAXException e8) {
            throw new SVGParseException("SVG parse error", e8);
        }
    }

    /* renamed from: L */
    public final void m3095L(SVG.C4803u c4803u, Attributes attributes) throws SVGParseException {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            int i7 = C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()];
            if (i7 == 8) {
                c4803u.f2972o = m3077u0(strTrim);
            } else if (i7 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(m3059f0(strTrim));
                c4803u.f2973p = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    /* renamed from: L0 */
    public final void m3096L0(InputStream inputStream, boolean z6) throws XmlPullParserException, ParserConfigurationException, SAXException, IOException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                C4822h c4822h = new C4822h(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        m3115W0();
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        C4821g c4821g = new C4821g(xmlPullParserNewPullParser.getText());
                        m3143r(c4821g.m3175r(), m3148x0(c4821g));
                    } else if (eventType == 10) {
                        if (z6 && this.f2995a.m2989i() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                m3094K0(inputStream);
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
                        m3117X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, c4822h);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        m3141p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        m3126e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        m3124c1(xmlPullParserNewPullParser.getText());
                    }
                }
                m3140o();
            } catch (IOException e6) {
                throw new SVGParseException("Stream error", e6);
            }
        } catch (XmlPullParserException e7) {
            throw new SVGParseException("XML parser problem", e7);
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
    public final void m3097M(com.caverock.androidsvg.SVG.C4809x r6, org.xml.sax.Attributes r7) throws com.caverock.androidsvg.SVGParseException {
        /*
            r5 = this;
            r0 = 0
        L1:
            int r1 = r7.getLength()
            if (r0 >= r1) goto Ld3
            java.lang.String r1 = r7.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.caverock.androidsvg.SVGParser.C4815a.f3133b
            java.lang.String r3 = r7.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.m3151a(r3)
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
            android.graphics.Matrix r1 = r5.m3092J0(r1)
            r6.f2981s = r1
            goto Lcf
        L3f:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L4b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.f2980r = r1
            goto Lcf
        L4b:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L57
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.f2980r = r1
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
            r6.f2979q = r1
            goto Lcf
        L6a:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L75
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.f2979q = r1
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
            r6.f2986x = r1
            goto Lcf
        L98:
            com.caverock.androidsvg.SVG$o r1 = m3069o0(r1)
            r6.f2985w = r1
            boolean r1 = r1.m3025j()
            if (r1 != 0) goto La5
            goto Lcf
        La5:
            com.caverock.androidsvg.SVGParseException r6 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r7 = "Invalid <pattern> element. height cannot be negative"
            r6.<init>(r7)
            throw r6
        Lad:
            com.caverock.androidsvg.SVG$o r1 = m3069o0(r1)
            r6.f2984v = r1
            boolean r1 = r1.m3025j()
            if (r1 != 0) goto Lba
            goto Lcf
        Lba:
            com.caverock.androidsvg.SVGParseException r6 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r7 = "Invalid <pattern> element. width cannot be negative"
            r6.<init>(r7)
            throw r6
        Lc2:
            com.caverock.androidsvg.SVG$o r1 = m3069o0(r1)
            r6.f2983u = r1
            goto Lcf
        Lc9:
            com.caverock.androidsvg.SVG$o r1 = m3069o0(r1)
            r6.f2982t = r1
        Lcf:
            int r0 = r0 + 1
            goto L1
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.m3097M(com.caverock.androidsvg.SVG$x, org.xml.sax.Attributes):void");
    }

    /* renamed from: N */
    public final void m3098N(SVG.C4811y c4811y, Attributes attributes, String str) throws SVGParseException {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            if (SVGAttr.m3151a(attributes.getLocalName(i6)) == SVGAttr.points) {
                C4821g c4821g = new C4821g(attributes.getValue(i6));
                ArrayList arrayList = new ArrayList();
                c4821g.m3157A();
                while (!c4821g.m3165h()) {
                    float fM3171n = c4821g.m3171n();
                    if (Float.isNaN(fM3171n)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    c4821g.m3183z();
                    float fM3171n2 = c4821g.m3171n();
                    if (Float.isNaN(fM3171n2)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    c4821g.m3183z();
                    arrayList.add(Float.valueOf(fM3171n));
                    arrayList.add(Float.valueOf(fM3171n2));
                }
                c4811y.f2990o = new float[arrayList.size()];
                int size = arrayList.size();
                int i7 = 0;
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    c4811y.f2990o[i7] = ((Float) obj).floatValue();
                    i7++;
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
    public final void m3099O(com.caverock.androidsvg.SVG.C4792o0 r5, org.xml.sax.Attributes r6) throws com.caverock.androidsvg.SVGParseException {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L5e
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.caverock.androidsvg.SVGParser.C4815a.f3133b
            java.lang.String r3 = r6.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.m3151a(r3)
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
            com.caverock.androidsvg.SVG$o r1 = m3069o0(r1)
            r5.f2947o = r1
            boolean r1 = r1.m3025j()
            if (r1 != 0) goto L38
            goto L5b
        L38:
            com.caverock.androidsvg.SVGParseException r5 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r6 = "Invalid <radialGradient> element. r cannot be negative"
            r5.<init>(r6)
            throw r5
        L40:
            com.caverock.androidsvg.SVG$o r1 = m3069o0(r1)
            r5.f2946n = r1
            goto L5b
        L47:
            com.caverock.androidsvg.SVG$o r1 = m3069o0(r1)
            r5.f2945m = r1
            goto L5b
        L4e:
            com.caverock.androidsvg.SVG$o r1 = m3069o0(r1)
            r5.f2949q = r1
            goto L5b
        L55:
            com.caverock.androidsvg.SVG$o r1 = m3069o0(r1)
            r5.f2948p = r1
        L5b:
            int r0 = r0 + 1
            goto L1
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.m3099O(com.caverock.androidsvg.SVG$o0, org.xml.sax.Attributes):void");
    }

    /* renamed from: O0 */
    public final void m3100O0(Attributes attributes) throws SVGParseException {
        m3136l("<path>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4803u c4803u = new SVG.C4803u();
        c4803u.f2934a = this.f2995a;
        c4803u.f2935b = this.f2996b;
        m3085D(c4803u, attributes);
        m3107S(c4803u, attributes);
        m3114W(c4803u, attributes);
        m3084C(c4803u, attributes);
        m3095L(c4803u, attributes);
        this.f2996b.mo3006h(c4803u);
    }

    /* renamed from: P */
    public final void m3101P(SVG.C4761a0 c4761a0, Attributes attributes) throws SVGParseException {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            int i7 = C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()];
            if (i7 == 1) {
                c4761a0.f2867o = m3069o0(strTrim);
            } else if (i7 == 2) {
                c4761a0.f2868p = m3069o0(strTrim);
            } else if (i7 == 3) {
                SVG.C4791o c4791oM3069o0 = m3069o0(strTrim);
                c4761a0.f2869q = c4791oM3069o0;
                if (c4791oM3069o0.m3025j()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i7 == 4) {
                SVG.C4791o c4791oM3069o02 = m3069o0(strTrim);
                c4761a0.f2870r = c4791oM3069o02;
                if (c4791oM3069o02.m3025j()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i7 == 10) {
                SVG.C4791o c4791oM3069o03 = m3069o0(strTrim);
                c4761a0.f2871s = c4791oM3069o03;
                if (c4791oM3069o03.m3025j()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i7 != 11) {
                continue;
            } else {
                SVG.C4791o c4791oM3069o04 = m3069o0(strTrim);
                c4761a0.f2872t = c4791oM3069o04;
                if (c4791oM3069o04.m3025j()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    /* renamed from: P0 */
    public final void m3102P0(Attributes attributes) throws SVGParseException {
        m3136l("<pattern>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4809x c4809x = new SVG.C4809x();
        c4809x.f2934a = this.f2995a;
        c4809x.f2935b = this.f2996b;
        m3085D(c4809x, attributes);
        m3107S(c4809x, attributes);
        m3084C(c4809x, attributes);
        m3118Y(c4809x, attributes);
        m3097M(c4809x, attributes);
        this.f2996b.mo3006h(c4809x);
        this.f2996b = c4809x;
    }

    /* renamed from: Q */
    public final void m3103Q(SVG.C4770d0 c4770d0, Attributes attributes) throws SVGParseException {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            int i7 = C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()];
            if (i7 == 1) {
                c4770d0.f2892q = m3069o0(strTrim);
            } else if (i7 == 2) {
                c4770d0.f2893r = m3069o0(strTrim);
            } else if (i7 == 3) {
                SVG.C4791o c4791oM3069o0 = m3069o0(strTrim);
                c4770d0.f2894s = c4791oM3069o0;
                if (c4791oM3069o0.m3025j()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i7 == 4) {
                SVG.C4791o c4791oM3069o02 = m3069o0(strTrim);
                c4770d0.f2895t = c4791oM3069o02;
                if (c4791oM3069o02.m3025j()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i7 == 5) {
                c4770d0.f2896u = strTrim;
            }
        }
    }

    /* renamed from: Q0 */
    public final void m3104Q0(Attributes attributes) throws SVGParseException {
        m3136l("<polygon>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4811y c4813z = new SVG.C4813z();
        c4813z.f2934a = this.f2995a;
        c4813z.f2935b = this.f2996b;
        m3085D(c4813z, attributes);
        m3107S(c4813z, attributes);
        m3114W(c4813z, attributes);
        m3084C(c4813z, attributes);
        m3098N(c4813z, attributes, "polygon");
        this.f2996b.mo3006h(c4813z);
    }

    /* renamed from: R */
    public final void m3105R(SVG.C4767c0 c4767c0, Attributes attributes) {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            if (C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()] == 37) {
                c4767c0.f2888h = m3139n0(strTrim);
            }
        }
    }

    /* renamed from: R0 */
    public final void m3106R0(Attributes attributes) throws SVGParseException {
        m3136l("<polyline>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4811y c4811y = new SVG.C4811y();
        c4811y.f2934a = this.f2995a;
        c4811y.f2935b = this.f2996b;
        m3085D(c4811y, attributes);
        m3107S(c4811y, attributes);
        m3114W(c4811y, attributes);
        m3084C(c4811y, attributes);
        m3098N(c4811y, attributes, "polyline");
        this.f2996b.mo3006h(c4811y);
    }

    /* renamed from: S */
    public final void m3107S(SVG.AbstractC4782j0 abstractC4782j0, Attributes attributes) {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            if (strTrim.length() != 0) {
                int i7 = C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()];
                if (i7 == 45) {
                    m3040E0(abstractC4782j0, strTrim);
                } else if (i7 != 46) {
                    if (abstractC4782j0.f2925e == null) {
                        abstractC4782j0.f2925e = new SVG.Style();
                    }
                    m3047S0(abstractC4782j0.f2925e, attributes.getLocalName(i6), attributes.getValue(i6).trim());
                } else {
                    abstractC4782j0.f2927g = CSSParser.m2933f(strTrim);
                }
            }
        }
    }

    /* renamed from: T */
    public final void m3108T(SVG.C4800s0 c4800s0, Attributes attributes) {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            if (C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()] == 6 && ("".equals(attributes.getURI(i6)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i6)))) {
                c4800s0.f2967o = strTrim;
            }
        }
    }

    /* renamed from: T0 */
    public final void m3109T0(Attributes attributes) throws SVGParseException {
        m3136l("<radialGradient>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4792o0 c4792o0 = new SVG.C4792o0();
        c4792o0.f2934a = this.f2995a;
        c4792o0.f2935b = this.f2996b;
        m3085D(c4792o0, attributes);
        m3107S(c4792o0, attributes);
        m3087F(c4792o0, attributes);
        m3099O(c4792o0, attributes);
        this.f2996b.mo3006h(c4792o0);
        this.f2996b = c4792o0;
    }

    /* renamed from: U */
    public final void m3110U(SVG.C4810x0 c4810x0, Attributes attributes) {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            int i7 = C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()];
            if (i7 != 6) {
                if (i7 == 39) {
                    c4810x0.f2988p = m3069o0(strTrim);
                }
            } else if ("".equals(attributes.getURI(i6)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i6))) {
                c4810x0.f2987o = strTrim;
            }
        }
    }

    /* renamed from: U0 */
    public final void m3111U0(Attributes attributes) throws SVGParseException {
        m3136l("<rect>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4761a0 c4761a0 = new SVG.C4761a0();
        c4761a0.f2934a = this.f2995a;
        c4761a0.f2935b = this.f2996b;
        m3085D(c4761a0, attributes);
        m3107S(c4761a0, attributes);
        m3114W(c4761a0, attributes);
        m3084C(c4761a0, attributes);
        m3101P(c4761a0, attributes);
        this.f2996b.mo3006h(c4761a0);
    }

    /* renamed from: V */
    public final void m3112V(SVG.AbstractC4812y0 abstractC4812y0, Attributes attributes) {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            int i7 = C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()];
            if (i7 == 1) {
                abstractC4812y0.f2991o = m3070p0(strTrim);
            } else if (i7 == 2) {
                abstractC4812y0.f2992p = m3070p0(strTrim);
            } else if (i7 == 19) {
                abstractC4812y0.f2993q = m3070p0(strTrim);
            } else if (i7 == 20) {
                abstractC4812y0.f2994r = m3070p0(strTrim);
            }
        }
    }

    /* renamed from: V0 */
    public final void m3113V0(Attributes attributes) throws SVGParseException {
        m3136l("<solidColor>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4764b0 c4764b0 = new SVG.C4764b0();
        c4764b0.f2934a = this.f2995a;
        c4764b0.f2935b = this.f2996b;
        m3085D(c4764b0, attributes);
        m3107S(c4764b0, attributes);
        this.f2996b.mo3006h(c4764b0);
        this.f2996b = c4764b0;
    }

    /* renamed from: W */
    public final void m3114W(SVG.InterfaceC4787m interfaceC4787m, Attributes attributes) {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            if (SVGAttr.m3151a(attributes.getLocalName(i6)) == SVGAttr.transform) {
                interfaceC4787m.mo3018k(m3092J0(attributes.getValue(i6)));
            }
        }
    }

    /* renamed from: W0 */
    public final void m3115W0() {
        this.f2995a = new SVG();
    }

    /* renamed from: X */
    public final void m3116X(SVG.C4765b1 c4765b1, Attributes attributes) throws SVGParseException {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            int i7 = C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()];
            if (i7 == 1) {
                c4765b1.f2880q = m3069o0(strTrim);
            } else if (i7 == 2) {
                c4765b1.f2881r = m3069o0(strTrim);
            } else if (i7 == 3) {
                SVG.C4791o c4791oM3069o0 = m3069o0(strTrim);
                c4765b1.f2882s = c4791oM3069o0;
                if (c4791oM3069o0.m3025j()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i7 == 4) {
                SVG.C4791o c4791oM3069o02 = m3069o0(strTrim);
                c4765b1.f2883t = c4791oM3069o02;
                if (c4791oM3069o02.m3025j()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i7 == 6 && ("".equals(attributes.getURI(i6)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i6)))) {
                c4765b1.f2879p = strTrim;
            }
        }
    }

    /* renamed from: X0 */
    public final void m3117X0(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.f2997c) {
            this.f2998d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem sVGElemM3152a = SVGElem.m3152a(str2);
            switch (C4815a.f3132a[sVGElemM3152a.ordinal()]) {
                case 1:
                    m3122a1(attributes);
                    break;
                case 2:
                case 3:
                    m3142q(attributes);
                    break;
                case 4:
                    m3137m(attributes);
                    break;
                case 5:
                    m3132i1(attributes);
                    break;
                case 6:
                    m3100O0(attributes);
                    break;
                case 7:
                    m3111U0(attributes);
                    break;
                case 8:
                    m3131i(attributes);
                    break;
                case 9:
                    m3138n(attributes);
                    break;
                case 10:
                    m3145v(attributes);
                    break;
                case 11:
                    m3106R0(attributes);
                    break;
                case 12:
                    m3104Q0(attributes);
                    break;
                case 13:
                    m3125d1(attributes);
                    break;
                case 14:
                    m3130h1(attributes);
                    break;
                case 15:
                    m3128g1(attributes);
                    break;
                case 16:
                    m3135k1(attributes);
                    break;
                case 17:
                    m3123b1(attributes);
                    break;
                case 18:
                    m3147x(attributes);
                    break;
                case 19:
                    m3146w(attributes);
                    break;
                case 20:
                    m3109T0(attributes);
                    break;
                case 21:
                    m3119Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.f2999e = true;
                    this.f3000f = sVGElemM3152a;
                    break;
                case 24:
                    m3134k(attributes);
                    break;
                case 25:
                    m3127f1(attributes);
                    break;
                case 26:
                    m3102P0(attributes);
                    break;
                case 27:
                    m3144u(attributes);
                    break;
                case 28:
                    m3133j1(attributes);
                    break;
                case 29:
                    m3149y(attributes);
                    break;
                case 30:
                    m3121Z0(attributes);
                    break;
                case 31:
                    m3113V0(attributes);
                    break;
                default:
                    this.f2997c = true;
                    this.f2998d = 1;
                    break;
            }
        }
    }

    /* renamed from: Y */
    public final void m3118Y(SVG.AbstractC4794p0 abstractC4794p0, Attributes attributes) {
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            int i7 = C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()];
            if (i7 == 7) {
                m3079w0(abstractC4794p0, strTrim);
            } else if (i7 == 87) {
                abstractC4794p0.f2954p = m3046N0(strTrim);
            }
        }
    }

    /* renamed from: Y0 */
    public final void m3119Y0(Attributes attributes) throws SVGParseException {
        m3136l("<stop>", new Object[0]);
        SVG.InterfaceC4778h0 interfaceC4778h0 = this.f2996b;
        if (interfaceC4778h0 == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(interfaceC4778h0 instanceof SVG.AbstractC4781j)) {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        SVG.C4767c0 c4767c0 = new SVG.C4767c0();
        c4767c0.f2934a = this.f2995a;
        c4767c0.f2935b = this.f2996b;
        m3085D(c4767c0, attributes);
        m3107S(c4767c0, attributes);
        m3105R(c4767c0, attributes);
        this.f2996b.mo3006h(c4767c0);
        this.f2996b = c4767c0;
    }

    /* renamed from: Z */
    public final void m3120Z(String str) {
        this.f2995a.m2983a(new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document).m2940d(str));
    }

    /* renamed from: Z0 */
    public final void m3121Z0(Attributes attributes) throws SVGParseException {
        m3136l("<style>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
            String strTrim = attributes.getValue(i6).trim();
            int i7 = C4815a.f3133b[SVGAttr.m3151a(attributes.getLocalName(i6)).ordinal()];
            if (i7 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i7 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && CSSParser.m2931b(str, CSSParser.MediaType.screen)) {
            this.f3002h = true;
        } else {
            this.f2997c = true;
            this.f2998d = 1;
        }
    }

    /* renamed from: a1 */
    public final void m3122a1(Attributes attributes) throws SVGParseException {
        m3136l("<svg>", new Object[0]);
        SVG.C4770d0 c4770d0 = new SVG.C4770d0();
        c4770d0.f2934a = this.f2995a;
        c4770d0.f2935b = this.f2996b;
        m3085D(c4770d0, attributes);
        m3107S(c4770d0, attributes);
        m3084C(c4770d0, attributes);
        m3118Y(c4770d0, attributes);
        m3103Q(c4770d0, attributes);
        SVG.InterfaceC4778h0 interfaceC4778h0 = this.f2996b;
        if (interfaceC4778h0 == null) {
            this.f2995a.m2996p(c4770d0);
        } else {
            interfaceC4778h0.mo3006h(c4770d0);
        }
        this.f2996b = c4770d0;
    }

    /* renamed from: b1 */
    public final void m3123b1(Attributes attributes) throws SVGParseException {
        m3136l("<symbol>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.AbstractC4794p0 c4798r0 = new SVG.C4798r0();
        c4798r0.f2934a = this.f2995a;
        c4798r0.f2935b = this.f2996b;
        m3085D(c4798r0, attributes);
        m3107S(c4798r0, attributes);
        m3084C(c4798r0, attributes);
        m3118Y(c4798r0, attributes);
        this.f2996b.mo3006h(c4798r0);
        this.f2996b = c4798r0;
    }

    /* renamed from: c1 */
    public final void m3124c1(String str) {
        if (this.f2997c) {
            return;
        }
        if (this.f2999e) {
            if (this.f3001g == null) {
                this.f3001g = new StringBuilder(str.length());
            }
            this.f3001g.append(str);
        } else if (this.f3002h) {
            if (this.f3003i == null) {
                this.f3003i = new StringBuilder(str.length());
            }
            this.f3003i.append(str);
        } else if (this.f2996b instanceof SVG.AbstractC4808w0) {
            m3129h(str);
        }
    }

    /* renamed from: d1 */
    public final void m3125d1(Attributes attributes) throws SVGParseException {
        m3136l("<text>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4804u0 c4804u0 = new SVG.C4804u0();
        c4804u0.f2934a = this.f2995a;
        c4804u0.f2935b = this.f2996b;
        m3085D(c4804u0, attributes);
        m3107S(c4804u0, attributes);
        m3114W(c4804u0, attributes);
        m3084C(c4804u0, attributes);
        m3112V(c4804u0, attributes);
        this.f2996b.mo3006h(c4804u0);
        this.f2996b = c4804u0;
    }

    /* renamed from: e1 */
    public final void m3126e1(char[] cArr, int i6, int i7) {
        if (this.f2997c) {
            return;
        }
        if (this.f2999e) {
            if (this.f3001g == null) {
                this.f3001g = new StringBuilder(i7);
            }
            this.f3001g.append(cArr, i6, i7);
        } else if (this.f3002h) {
            if (this.f3003i == null) {
                this.f3003i = new StringBuilder(i7);
            }
            this.f3003i.append(cArr, i6, i7);
        } else if (this.f2996b instanceof SVG.AbstractC4808w0) {
            m3129h(new String(cArr, i6, i7));
        }
    }

    /* renamed from: f1 */
    public final void m3127f1(Attributes attributes) throws SVGParseException {
        m3136l("<textPath>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4810x0 c4810x0 = new SVG.C4810x0();
        c4810x0.f2934a = this.f2995a;
        c4810x0.f2935b = this.f2996b;
        m3085D(c4810x0, attributes);
        m3107S(c4810x0, attributes);
        m3084C(c4810x0, attributes);
        m3110U(c4810x0, attributes);
        this.f2996b.mo3006h(c4810x0);
        this.f2996b = c4810x0;
        SVG.InterfaceC4778h0 interfaceC4778h0 = c4810x0.f2935b;
        if (interfaceC4778h0 instanceof SVG.InterfaceC4814z0) {
            c4810x0.m3035o((SVG.InterfaceC4814z0) interfaceC4778h0);
        } else {
            c4810x0.m3035o(((SVG.InterfaceC4806v0) interfaceC4778h0).mo3001d());
        }
    }

    /* renamed from: g1 */
    public final void m3128g1(Attributes attributes) throws SVGParseException {
        m3136l("<tref>", new Object[0]);
        SVG.InterfaceC4778h0 interfaceC4778h0 = this.f2996b;
        if (interfaceC4778h0 == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(interfaceC4778h0 instanceof SVG.AbstractC4808w0)) {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        SVG.C4800s0 c4800s0 = new SVG.C4800s0();
        c4800s0.f2934a = this.f2995a;
        c4800s0.f2935b = this.f2996b;
        m3085D(c4800s0, attributes);
        m3107S(c4800s0, attributes);
        m3084C(c4800s0, attributes);
        m3108T(c4800s0, attributes);
        this.f2996b.mo3006h(c4800s0);
        SVG.InterfaceC4778h0 interfaceC4778h02 = c4800s0.f2935b;
        if (interfaceC4778h02 instanceof SVG.InterfaceC4814z0) {
            c4800s0.m3027o((SVG.InterfaceC4814z0) interfaceC4778h02);
        } else {
            c4800s0.m3027o(((SVG.InterfaceC4806v0) interfaceC4778h02).mo3001d());
        }
    }

    /* renamed from: h */
    public final void m3129h(String str) {
        SVG.AbstractC4774f0 abstractC4774f0 = (SVG.AbstractC4774f0) this.f2996b;
        int size = abstractC4774f0.f2901i.size();
        SVG.C4786l0 c4786l0 = size == 0 ? null : (SVG.C4786l0) abstractC4774f0.f2901i.get(size - 1);
        if (!(c4786l0 instanceof SVG.C4762a1)) {
            this.f2996b.mo3006h(new SVG.C4762a1(str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        SVG.C4762a1 c4762a1 = (SVG.C4762a1) c4786l0;
        sb.append(c4762a1.f2873c);
        sb.append(str);
        c4762a1.f2873c = sb.toString();
    }

    /* renamed from: h1 */
    public final void m3130h1(Attributes attributes) throws SVGParseException {
        m3136l("<tspan>", new Object[0]);
        SVG.InterfaceC4778h0 interfaceC4778h0 = this.f2996b;
        if (interfaceC4778h0 == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(interfaceC4778h0 instanceof SVG.AbstractC4808w0)) {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        SVG.C4802t0 c4802t0 = new SVG.C4802t0();
        c4802t0.f2934a = this.f2995a;
        c4802t0.f2935b = this.f2996b;
        m3085D(c4802t0, attributes);
        m3107S(c4802t0, attributes);
        m3084C(c4802t0, attributes);
        m3112V(c4802t0, attributes);
        this.f2996b.mo3006h(c4802t0);
        this.f2996b = c4802t0;
        SVG.InterfaceC4778h0 interfaceC4778h02 = c4802t0.f2935b;
        if (interfaceC4778h02 instanceof SVG.InterfaceC4814z0) {
            c4802t0.m3028o((SVG.InterfaceC4814z0) interfaceC4778h02);
        } else {
            c4802t0.m3028o(((SVG.InterfaceC4806v0) interfaceC4778h02).mo3001d());
        }
    }

    /* renamed from: i */
    public final void m3131i(Attributes attributes) throws SVGParseException {
        m3136l("<circle>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4769d c4769d = new SVG.C4769d();
        c4769d.f2934a = this.f2995a;
        c4769d.f2935b = this.f2996b;
        m3085D(c4769d, attributes);
        m3107S(c4769d, attributes);
        m3114W(c4769d, attributes);
        m3084C(c4769d, attributes);
        m3082A(c4769d, attributes);
        this.f2996b.mo3006h(c4769d);
    }

    /* renamed from: i1 */
    public final void m3132i1(Attributes attributes) throws SVGParseException {
        m3136l("<use>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4765b1 c4765b1 = new SVG.C4765b1();
        c4765b1.f2934a = this.f2995a;
        c4765b1.f2935b = this.f2996b;
        m3085D(c4765b1, attributes);
        m3107S(c4765b1, attributes);
        m3114W(c4765b1, attributes);
        m3084C(c4765b1, attributes);
        m3116X(c4765b1, attributes);
        this.f2996b.mo3006h(c4765b1);
        this.f2996b = c4765b1;
    }

    /* renamed from: j1 */
    public final void m3133j1(Attributes attributes) throws SVGParseException {
        m3136l("<view>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.AbstractC4794p0 c4768c1 = new SVG.C4768c1();
        c4768c1.f2934a = this.f2995a;
        c4768c1.f2935b = this.f2996b;
        m3085D(c4768c1, attributes);
        m3084C(c4768c1, attributes);
        m3118Y(c4768c1, attributes);
        this.f2996b.mo3006h(c4768c1);
        this.f2996b = c4768c1;
    }

    /* renamed from: k */
    public final void m3134k(Attributes attributes) throws SVGParseException {
        m3136l("<clipPath>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4771e c4771e = new SVG.C4771e();
        c4771e.f2934a = this.f2995a;
        c4771e.f2935b = this.f2996b;
        m3085D(c4771e, attributes);
        m3107S(c4771e, attributes);
        m3114W(c4771e, attributes);
        m3084C(c4771e, attributes);
        m3083B(c4771e, attributes);
        this.f2996b.mo3006h(c4771e);
        this.f2996b = c4771e;
    }

    /* renamed from: k1 */
    public final void m3135k1(Attributes attributes) throws SVGParseException {
        m3136l("<switch>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4796q0 c4796q0 = new SVG.C4796q0();
        c4796q0.f2934a = this.f2995a;
        c4796q0.f2935b = this.f2996b;
        m3085D(c4796q0, attributes);
        m3107S(c4796q0, attributes);
        m3114W(c4796q0, attributes);
        m3084C(c4796q0, attributes);
        this.f2996b.mo3006h(c4796q0);
        this.f2996b = c4796q0;
    }

    /* renamed from: l */
    public final void m3136l(String str, Object... objArr) {
    }

    /* renamed from: m */
    public final void m3137m(Attributes attributes) throws SVGParseException {
        m3136l("<defs>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4777h c4777h = new SVG.C4777h();
        c4777h.f2934a = this.f2995a;
        c4777h.f2935b = this.f2996b;
        m3085D(c4777h, attributes);
        m3107S(c4777h, attributes);
        m3114W(c4777h, attributes);
        this.f2996b.mo3006h(c4777h);
        this.f2996b = c4777h;
    }

    /* renamed from: n */
    public final void m3138n(Attributes attributes) throws SVGParseException {
        m3136l("<ellipse>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4779i c4779i = new SVG.C4779i();
        c4779i.f2934a = this.f2995a;
        c4779i.f2935b = this.f2996b;
        m3085D(c4779i, attributes);
        m3107S(c4779i, attributes);
        m3114W(c4779i, attributes);
        m3084C(c4779i, attributes);
        m3086E(c4779i, attributes);
        this.f2996b.mo3006h(c4779i);
    }

    /* renamed from: n0 */
    public final Float m3139n0(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z6 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z6 = false;
        }
        try {
            float fM3061g0 = m3061g0(str, 0, length);
            float f6 = 100.0f;
            if (z6) {
                fM3061g0 /= 100.0f;
            }
            if (fM3061g0 < 0.0f) {
                f6 = 0.0f;
            } else if (fM3061g0 <= 100.0f) {
                f6 = fM3061g0;
            }
            return Float.valueOf(f6);
        } catch (NumberFormatException e6) {
            throw new SVGParseException("Invalid offset value in <stop>: " + str, e6);
        }
    }

    /* renamed from: o */
    public final void m3140o() {
    }

    /* renamed from: p */
    public final void m3141p(String str, String str2, String str3) {
        if (this.f2997c) {
            int i6 = this.f2998d - 1;
            this.f2998d = i6;
            if (i6 == 0) {
                this.f2997c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i7 = C4815a.f3132a[SVGElem.m3152a(str2).ordinal()];
            if (i7 != 1 && i7 != 2 && i7 != 4 && i7 != 5 && i7 != 13 && i7 != 14) {
                switch (i7) {
                    case 22:
                    case 23:
                        this.f2999e = false;
                        StringBuilder sb = this.f3001g;
                        if (sb != null) {
                            SVGElem sVGElem = this.f3000f;
                            if (sVGElem == SVGElem.title) {
                                this.f2995a.m2997q(sb.toString());
                            } else if (sVGElem == SVGElem.desc) {
                                this.f2995a.m2995o(sb.toString());
                            }
                            this.f3001g.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.f3003i;
                        if (sb2 != null) {
                            this.f3002h = false;
                            m3120Z(sb2.toString());
                            this.f3003i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.f2996b = ((SVG.C4786l0) this.f2996b).f2935b;
        }
    }

    /* renamed from: q */
    public final void m3142q(Attributes attributes) throws SVGParseException {
        m3136l("<g>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4785l c4785l = new SVG.C4785l();
        c4785l.f2934a = this.f2995a;
        c4785l.f2935b = this.f2996b;
        m3085D(c4785l, attributes);
        m3107S(c4785l, attributes);
        m3114W(c4785l, attributes);
        m3084C(c4785l, attributes);
        this.f2996b.mo3006h(c4785l);
        this.f2996b = c4785l;
    }

    /* renamed from: r */
    public final void m3143r(String str, Map map) {
        if (str.equals("xml-stylesheet")) {
            SVG.m2981g();
        }
    }

    /* renamed from: u */
    public final void m3144u(Attributes attributes) throws SVGParseException {
        m3136l("<image>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4789n c4789n = new SVG.C4789n();
        c4789n.f2934a = this.f2995a;
        c4789n.f2935b = this.f2996b;
        m3085D(c4789n, attributes);
        m3107S(c4789n, attributes);
        m3114W(c4789n, attributes);
        m3084C(c4789n, attributes);
        m3088G(c4789n, attributes);
        this.f2996b.mo3006h(c4789n);
        this.f2996b = c4789n;
    }

    /* renamed from: v */
    public final void m3145v(Attributes attributes) throws SVGParseException {
        m3136l("<line>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4793p c4793p = new SVG.C4793p();
        c4793p.f2934a = this.f2995a;
        c4793p.f2935b = this.f2996b;
        m3085D(c4793p, attributes);
        m3107S(c4793p, attributes);
        m3114W(c4793p, attributes);
        m3084C(c4793p, attributes);
        m3089H(c4793p, attributes);
        this.f2996b.mo3006h(c4793p);
    }

    /* renamed from: w */
    public final void m3146w(Attributes attributes) throws SVGParseException {
        m3136l("<linearGradient>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4784k0 c4784k0 = new SVG.C4784k0();
        c4784k0.f2934a = this.f2995a;
        c4784k0.f2935b = this.f2996b;
        m3085D(c4784k0, attributes);
        m3107S(c4784k0, attributes);
        m3087F(c4784k0, attributes);
        m3090I(c4784k0, attributes);
        this.f2996b.mo3006h(c4784k0);
        this.f2996b = c4784k0;
    }

    /* renamed from: x */
    public final void m3147x(Attributes attributes) throws SVGParseException {
        m3136l("<marker>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4795q c4795q = new SVG.C4795q();
        c4795q.f2934a = this.f2995a;
        c4795q.f2935b = this.f2996b;
        m3085D(c4795q, attributes);
        m3107S(c4795q, attributes);
        m3084C(c4795q, attributes);
        m3118Y(c4795q, attributes);
        m3091J(c4795q, attributes);
        this.f2996b.mo3006h(c4795q);
        this.f2996b = c4795q;
    }

    /* renamed from: x0 */
    public final Map m3148x0(C4821g c4821g) {
        HashMap map = new HashMap();
        c4821g.m3157A();
        String strM3176s = c4821g.m3176s('=');
        while (strM3176s != null) {
            c4821g.m3163f('=');
            map.put(strM3176s, c4821g.m3174q());
            c4821g.m3157A();
            strM3176s = c4821g.m3176s('=');
        }
        return map;
    }

    /* renamed from: y */
    public final void m3149y(Attributes attributes) throws SVGParseException {
        m3136l("<mask>", new Object[0]);
        if (this.f2996b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.C4797r c4797r = new SVG.C4797r();
        c4797r.f2934a = this.f2995a;
        c4797r.f2935b = this.f2996b;
        m3085D(c4797r, attributes);
        m3107S(c4797r, attributes);
        m3084C(c4797r, attributes);
        m3093K(c4797r, attributes);
        this.f2996b.mo3006h(c4797r);
        this.f2996b = c4797r;
    }

    /* renamed from: z */
    public SVG m3150z(InputStream inputStream, boolean z6) throws IOException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i6 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i6 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            m3096L0(inputStream, z6);
            return this.f2995a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
