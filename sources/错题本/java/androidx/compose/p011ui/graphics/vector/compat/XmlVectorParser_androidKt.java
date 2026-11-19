package androidx.compose.p011ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.BrushKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.PathFillType;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.vector.ImageVector;
import androidx.compose.p011ui.graphics.vector.PathNode;
import androidx.compose.p011ui.graphics.vector.PathParser;
import androidx.compose.p011ui.graphics.vector.VectorKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(m5109d1 = {"\u0000^\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a$\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0018\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0018\u00010\u0013R\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a1\u0010\u001c\u001a\u00020\u0015*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0018\u00010\u0013R\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010\u001f\u001a\u00020\u001e*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0018\u00010\u0013R\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%\u001a9\u0010&\u001a\u00020\u001e*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0018\u00010\u0013R\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b&\u0010 \u001a9\u0010'\u001a\u00020\u001e*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0018\u00010\u0013R\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b'\u0010 \"\u0014\u0010(\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010)\"\u0014\u0010+\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010)\"\u0014\u0010,\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010)\"\u0014\u0010-\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010)\"\u0014\u0010.\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010)\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u0010)\"\u0014\u00101\u001a\u0002008\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00103\u001a\u0002008\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00102\"\u0014\u00104\u001a\u0002008\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, m5110d2 = {"", "id", "Landroidx/compose/ui/graphics/StrokeCap;", "defValue", "getStrokeLineCap-CSYIeUk", "(II)I", "getStrokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeLineJoin-kLtJ_vA", "getStrokeLineJoin", "Lorg/xmlpull/v1/XmlPullParser;", "", "isAtEnd", "(Lorg/xmlpull/v1/XmlPullParser;)Z", "Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "Landroid/content/res/Resources;", SourceRouterRecord.SOURCE_RES_IMAGE, "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "builder", "nestedGroups", "parseCurrentVectorNode", "(Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Landroidx/compose/ui/graphics/vector/ImageVector$Builder;I)I", "seekToStartTag", "(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;", "createVectorImageBuilder", "(Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "Ld6/s;", "parsePath", "(Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroidx/compose/ui/graphics/vector/ImageVector$Builder;)V", "Landroidx/core/content/res/ComplexColorCompat;", "complexColor", "Landroidx/compose/ui/graphics/Brush;", "obtainBrushFromComplexColor", "(Landroidx/core/content/res/ComplexColorCompat;)Landroidx/compose/ui/graphics/Brush;", "parseClipPath", "parseGroup", "LINECAP_BUTT", "I", "LINECAP_ROUND", "LINECAP_SQUARE", "LINEJOIN_MITER", "LINEJOIN_ROUND", "LINEJOIN_BEVEL", "FILL_TYPE_WINDING", "", "SHAPE_CLIP_PATH", "Ljava/lang/String;", "SHAPE_GROUP", "SHAPE_PATH", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,693:1\n1#2:694\n123#3:695\n123#3:696\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n234#1:695\n235#1:696\n*E\n"})
/* loaded from: classes.dex */
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;

    @NotNull
    private static final String SHAPE_CLIP_PATH = "clip-path";

    @NotNull
    private static final String SHAPE_GROUP = "group";

    @NotNull
    private static final String SHAPE_PATH = "path";

    @NotNull
    public static final ImageVector.Builder createVectorImageBuilder(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources resources, @Nullable Resources.Theme theme, @NotNull AttributeSet attributeSet) throws XmlPullParserException {
        long jM10718getUnspecified0d7_KjU;
        int iM10622getSrcIn0nO6VwU;
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
            jM10718getUnspecified0d7_KjU = (typedValue.type == 2 || (namedColorStateList = androidVectorParser.getNamedColorStateList(typedArrayObtainAttributes, theme, "tint", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) == null) ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : ColorKt.Color(namedColorStateList.getDefaultColor());
        } else {
            jM10718getUnspecified0d7_KjU = Color.INSTANCE.m10718getUnspecified0d7_KjU();
        }
        long j7 = jM10718getUnspecified0d7_KjU;
        int i = androidVectorParser.getInt(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
        if (i == -1) {
            iM10622getSrcIn0nO6VwU = BlendMode.INSTANCE.m10622getSrcIn0nO6VwU();
        } else if (i == 3) {
            iM10622getSrcIn0nO6VwU = BlendMode.INSTANCE.m10624getSrcOver0nO6VwU();
        } else if (i == 5) {
            iM10622getSrcIn0nO6VwU = BlendMode.INSTANCE.m10622getSrcIn0nO6VwU();
        } else if (i != 9) {
            switch (i) {
                case 14:
                    iM10622getSrcIn0nO6VwU = BlendMode.INSTANCE.m10613getModulate0nO6VwU();
                    break;
                case 15:
                    iM10622getSrcIn0nO6VwU = BlendMode.INSTANCE.m10618getScreen0nO6VwU();
                    break;
                case 16:
                    iM10622getSrcIn0nO6VwU = BlendMode.INSTANCE.m10616getPlus0nO6VwU();
                    break;
                default:
                    iM10622getSrcIn0nO6VwU = BlendMode.INSTANCE.m10622getSrcIn0nO6VwU();
                    break;
            }
        } else {
            iM10622getSrcIn0nO6VwU = BlendMode.INSTANCE.m10621getSrcAtop0nO6VwU();
        }
        int i8 = iM10622getSrcIn0nO6VwU;
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(dimension / resources.getDisplayMetrics().density);
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(dimension2 / resources.getDisplayMetrics().density);
        typedArrayObtainAttributes.recycle();
        return new ImageVector.Builder(null, fM13305constructorimpl, fM13305constructorimpl2, namedFloat, namedFloat2, j7, i8, namedBoolean, 1, null);
    }

    /* renamed from: getStrokeLineCap-CSYIeUk, reason: not valid java name */
    private static final int m11402getStrokeLineCapCSYIeUk(int i, int i8) {
        return i != 0 ? i != 1 ? i != 2 ? i8 : StrokeCap.INSTANCE.m11037getSquareKaPHkGw() : StrokeCap.INSTANCE.m11036getRoundKaPHkGw() : StrokeCap.INSTANCE.m11035getButtKaPHkGw();
    }

    /* renamed from: getStrokeLineCap-CSYIeUk$default, reason: not valid java name */
    public static /* synthetic */ int m11403getStrokeLineCapCSYIeUk$default(int i, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = StrokeCap.INSTANCE.m11035getButtKaPHkGw();
        }
        return m11402getStrokeLineCapCSYIeUk(i, i8);
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA, reason: not valid java name */
    private static final int m11404getStrokeLineJoinkLtJ_vA(int i, int i8) {
        return i != 0 ? i != 1 ? i != 2 ? i8 : StrokeJoin.INSTANCE.m11045getBevelLxFBmk8() : StrokeJoin.INSTANCE.m11047getRoundLxFBmk8() : StrokeJoin.INSTANCE.m11046getMiterLxFBmk8();
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA$default, reason: not valid java name */
    public static /* synthetic */ int m11405getStrokeLineJoinkLtJ_vA$default(int i, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = StrokeJoin.INSTANCE.m11046getMiterLxFBmk8();
        }
        return m11404getStrokeLineJoinkLtJ_vA(i, i8);
    }

    public static final boolean isAtEnd(@NotNull XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    private static final Brush obtainBrushFromComplexColor(ComplexColorCompat complexColorCompat) {
        if (!complexColorCompat.willDraw()) {
            return null;
        }
        Shader shader = complexColorCompat.getShader();
        return shader != null ? BrushKt.ShaderBrush(shader) : new SolidColor(ColorKt.Color(complexColorCompat.getColor()), null);
    }

    public static final void parseClipPath(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources resources, @Nullable Resources.Theme theme, @NotNull AttributeSet attributeSet, @NotNull ImageVector.Builder builder) {
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

    public static final int parseCurrentVectorNode(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources resources, @NotNull AttributeSet attributeSet, @Nullable Resources.Theme theme, @NotNull ImageVector.Builder builder, int i) throws XmlPullParserException, IllegalArgumentException {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !SHAPE_GROUP.equals(androidVectorParser.getXmlParser().getName())) {
                return i;
            }
            int i8 = i + 1;
            for (int i9 = 0; i9 < i8; i9++) {
                builder.clearGroup();
            }
            return 0;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name == null) {
            return i;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals(SHAPE_CLIP_PATH)) {
                return i;
            }
            parseClipPath(androidVectorParser, resources, theme, attributeSet, builder);
            return i + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals(SHAPE_PATH)) {
                return i;
            }
            parsePath(androidVectorParser, resources, theme, attributeSet, builder);
            return i;
        }
        if (iHashCode != 98629247 || !name.equals(SHAPE_GROUP)) {
            return i;
        }
        parseGroup(androidVectorParser, resources, theme, attributeSet, builder);
        return i;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(androidVectorParser, resources, attributeSet, theme, builder, i);
    }

    public static final void parseGroup(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources resources, @Nullable Resources.Theme theme, @NotNull AttributeSet attributeSet, @NotNull ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, Key.ROTATION, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f = androidVectorParser.getFloat(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f7 = androidVectorParser.getFloat(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "scaleX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "scaleY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "translateX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "translateY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        typedArrayObtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f, f7, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }

    public static final void parsePath(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources resources, @Nullable Resources.Theme theme, @NotNull AttributeSet attributeSet, @NotNull ImageVector.Builder builder) throws IllegalArgumentException {
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
        int iM11402getStrokeLineCapCSYIeUk = m11402getStrokeLineCapCSYIeUk(androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineCap", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), StrokeCap.INSTANCE.m11035getButtKaPHkGw());
        int iM11404getStrokeLineJoinkLtJ_vA = m11404getStrokeLineJoinkLtJ_vA(androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), StrokeJoin.INSTANCE.m11045getBevelLxFBmk8());
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
        ComplexColorCompat namedComplexColor2 = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float namedFloat3 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float namedFloat6 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float namedFloat7 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        int namedInt = androidVectorParser.getNamedInt(typedArrayObtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
        typedArrayObtainAttributes.recycle();
        builder.m11368addPathoIyEayM(emptyPath, namedInt == 0 ? PathFillType.INSTANCE.m10965getNonZeroRgk1Os() : PathFillType.INSTANCE.m10964getEvenOddRgk1Os(), str, obtainBrushFromComplexColor(namedComplexColor), namedFloat, obtainBrushFromComplexColor(namedComplexColor2), namedFloat3, namedFloat4, iM11402getStrokeLineCapCSYIeUk, iM11404getStrokeLineJoinkLtJ_vA, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
    }

    @NotNull
    public static final XmlPullParser seekToStartTag(@NotNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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
