package androidx.compose.p014ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.p014ui.graphics.BlendMode;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.BrushKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.PathFillType;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathNode;
import androidx.compose.p014ui.graphics.vector.PathParser;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    private static final String SHAPE_CLIP_PATH = "clip-path";
    private static final String SHAPE_GROUP = "group";
    private static final String SHAPE_PATH = "path";

    public static final ImageVector.Builder createVectorImageBuilder(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jM30914getUnspecified0d7_KjU;
        int iM30818getSrcIn0nO6VwU;
        ColorStateList namedColorStateList;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = androidVectorParser.getNamedBoolean(typedArrayObtainAttributes, "autoMirrored", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "viewportWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "viewportHeight", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (namedFloat2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float dimension = androidVectorParser.getDimension(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
        float dimension2 = androidVectorParser.getDimension(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
        if (typedArrayObtainAttributes.hasValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
            TypedValue typedValue = new TypedValue();
            typedArrayObtainAttributes.getValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
            jM30914getUnspecified0d7_KjU = (typedValue.type == 2 || (namedColorStateList = androidVectorParser.getNamedColorStateList(typedArrayObtainAttributes, theme, "tint", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) == null) ? Color.Companion.m30914getUnspecified0d7_KjU() : ColorKt.Color(namedColorStateList.getDefaultColor());
        } else {
            jM30914getUnspecified0d7_KjU = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        long j10 = jM30914getUnspecified0d7_KjU;
        int i10 = androidVectorParser.getInt(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
        if (i10 == -1) {
            iM30818getSrcIn0nO6VwU = BlendMode.Companion.m30818getSrcIn0nO6VwU();
        } else if (i10 == 3) {
            iM30818getSrcIn0nO6VwU = BlendMode.Companion.m30820getSrcOver0nO6VwU();
        } else if (i10 == 5) {
            iM30818getSrcIn0nO6VwU = BlendMode.Companion.m30818getSrcIn0nO6VwU();
        } else if (i10 != 9) {
            switch (i10) {
                case 14:
                    iM30818getSrcIn0nO6VwU = BlendMode.Companion.m30809getModulate0nO6VwU();
                    break;
                case 15:
                    iM30818getSrcIn0nO6VwU = BlendMode.Companion.m30814getScreen0nO6VwU();
                    break;
                case 16:
                    iM30818getSrcIn0nO6VwU = BlendMode.Companion.m30812getPlus0nO6VwU();
                    break;
                default:
                    iM30818getSrcIn0nO6VwU = BlendMode.Companion.m30818getSrcIn0nO6VwU();
                    break;
            }
        } else {
            iM30818getSrcIn0nO6VwU = BlendMode.Companion.m30817getSrcAtop0nO6VwU();
        }
        int i11 = iM30818getSrcIn0nO6VwU;
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(dimension / resources.getDisplayMetrics().density);
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(dimension2 / resources.getDisplayMetrics().density);
        typedArrayObtainAttributes.recycle();
        return new ImageVector.Builder(null, fM33501constructorimpl, fM33501constructorimpl2, namedFloat, namedFloat2, j10, i11, namedBoolean, 1, null);
    }

    /* renamed from: getStrokeLineCap-CSYIeUk, reason: not valid java name */
    private static final int m31598getStrokeLineCapCSYIeUk(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : StrokeCap.Companion.m31233getSquareKaPHkGw() : StrokeCap.Companion.m31232getRoundKaPHkGw() : StrokeCap.Companion.m31231getButtKaPHkGw();
    }

    /* renamed from: getStrokeLineCap-CSYIeUk$default, reason: not valid java name */
    public static /* synthetic */ int m31599getStrokeLineCapCSYIeUk$default(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = StrokeCap.Companion.m31231getButtKaPHkGw();
        }
        return m31598getStrokeLineCapCSYIeUk(i10, i11);
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA, reason: not valid java name */
    private static final int m31600getStrokeLineJoinkLtJ_vA(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : StrokeJoin.Companion.m31241getBevelLxFBmk8() : StrokeJoin.Companion.m31243getRoundLxFBmk8() : StrokeJoin.Companion.m31242getMiterLxFBmk8();
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA$default, reason: not valid java name */
    public static /* synthetic */ int m31601getStrokeLineJoinkLtJ_vA$default(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = StrokeJoin.Companion.m31242getMiterLxFBmk8();
        }
        return m31600getStrokeLineJoinkLtJ_vA(i10, i11);
    }

    public static final boolean isAtEnd(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    private static final Brush obtainBrushFromComplexColor(ComplexColorCompat complexColorCompat) {
        if (!complexColorCompat.willDraw()) {
            return null;
        }
        Shader shader = complexColorCompat.getShader();
        return shader != null ? BrushKt.ShaderBrush(shader) : new SolidColor(ColorKt.Color(complexColorCompat.getColor()), null);
    }

    public static final void parseClipPath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA());
        List emptyPath = string2 == null ? VectorKt.getEmptyPath() : PathParser.pathStringToNodes$default(androidVectorParser.pathParser, string2, null, 2, null);
        typedArrayObtainAttributes.recycle();
        ImageVector.Builder.addGroup$default(builder, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, emptyPath, 254, null);
    }

    public static final int parseCurrentVectorNode(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i10) throws XmlPullParserException {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !AbstractC9979u.m20289b("group", androidVectorParser.getXmlParser().getName())) {
                return i10;
            }
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                builder.clearGroup();
            }
            return 0;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name == null) {
            return i10;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals(SHAPE_CLIP_PATH)) {
                return i10;
            }
            parseClipPath(androidVectorParser, resources, theme, attributeSet, builder);
            return i10 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals(SHAPE_PATH)) {
                return i10;
            }
            parsePath(androidVectorParser, resources, theme, attributeSet, builder);
            return i10;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i10;
        }
        parseGroup(androidVectorParser, resources, theme, attributeSet, builder);
        return i10;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(androidVectorParser, resources, attributeSet, theme, builder, i10);
    }

    public static final void parseGroup(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, Key.ROTATION, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f10 = androidVectorParser.getFloat(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f11 = androidVectorParser.getFloat(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "scaleX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "scaleY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "translateX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "translateY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        typedArrayObtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f10, f11, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }

    public static final void parsePath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (!TypedArrayUtils.hasAttribute(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA());
        List<? extends PathNode> emptyPath = string2 == null ? VectorKt.getEmptyPath() : PathParser.pathStringToNodes$default(androidVectorParser.pathParser, string2, null, 2, null);
        ComplexColorCompat namedComplexColor = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "fillColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "fillAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
        int iM31598getStrokeLineCapCSYIeUk = m31598getStrokeLineCapCSYIeUk(androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineCap", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), StrokeCap.Companion.m31231getButtKaPHkGw());
        int iM31600getStrokeLineJoinkLtJ_vA = m31600getStrokeLineJoinkLtJ_vA(androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), StrokeJoin.Companion.m31241getBevelLxFBmk8());
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
        ComplexColorCompat namedComplexColor2 = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float namedFloat3 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float namedFloat6 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float namedFloat7 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        int namedInt = androidVectorParser.getNamedInt(typedArrayObtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
        typedArrayObtainAttributes.recycle();
        builder.m31564addPathoIyEayM(emptyPath, namedInt == 0 ? PathFillType.Companion.m31161getNonZeroRgk1Os() : PathFillType.Companion.m31160getEvenOddRgk1Os(), str, obtainBrushFromComplexColor(namedComplexColor), namedFloat, obtainBrushFromComplexColor(namedComplexColor2), namedFloat3, namedFloat4, iM31598getStrokeLineCapCSYIeUk, iM31600getStrokeLineJoinkLtJ_vA, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
    }

    public static final XmlPullParser seekToStartTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
