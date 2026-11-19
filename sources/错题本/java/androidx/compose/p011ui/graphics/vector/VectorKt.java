package androidx.compose.p011ui.graphics.vector;

import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.BlendModeColorFilter;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.PathFillType;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u0012\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0014\u001a\u00020\u000f*\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a\"\u0014\u0010 \u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001a\"\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0017\"\u0014\u0010&\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001a\"\u0014\u0010'\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u001a\"\u0014\u0010(\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u001a\"\u0014\u0010)\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u001a\"\u0014\u0010*\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u001a\"\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/\"\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/\"\u0017\u00106\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0017\u0010;\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, m5110d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "block", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "PathData", "(Lr6/c;)Ljava/util/List;", "", "pathStr", "addPathNodes", "(Ljava/lang/String;)Ljava/util/List;", "Landroidx/compose/ui/graphics/Color;", "other", "", "rgbEqual--OWjLjI", "(JJ)Z", "rgbEqual", "Landroidx/compose/ui/graphics/ColorFilter;", "tintableWithAlphaMask", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "DefaultGroupName", "Ljava/lang/String;", "", "DefaultRotation", "F", "DefaultPivotX", "DefaultPivotY", "DefaultScaleX", "DefaultScaleY", "DefaultTranslationX", "DefaultTranslationY", "EmptyPath", "Ljava/util/List;", "getEmptyPath", "()Ljava/util/List;", "DefaultPathName", "DefaultStrokeLineWidth", "DefaultStrokeLineMiter", "DefaultTrimPathStart", "DefaultTrimPathEnd", "DefaultTrimPathOffset", "Landroidx/compose/ui/graphics/StrokeCap;", "DefaultStrokeLineCap", "I", "getDefaultStrokeLineCap", "()I", "Landroidx/compose/ui/graphics/StrokeJoin;", "DefaultStrokeLineJoin", "getDefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/BlendMode;", "DefaultTintBlendMode", "getDefaultTintBlendMode", "DefaultTintColor", "J", "getDefaultTintColor", "()J", "Landroidx/compose/ui/graphics/PathFillType;", "DefaultFillType", "getDefaultFillType", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class VectorKt {

    @NotNull
    public static final String DefaultGroupName = "";

    @NotNull
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;

    @NotNull
    private static final List<PathNode> EmptyPath = EmptyList.INSTANCE;
    private static final int DefaultStrokeLineCap = StrokeCap.INSTANCE.m11035getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.INSTANCE.m11046getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.INSTANCE.m10622getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.INSTANCE.m10717getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.INSTANCE.m10965getNonZeroRgk1Os();

    @NotNull
    public static final List<PathNode> PathData(@NotNull InterfaceC6471c interfaceC6471c) {
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC6471c.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    @NotNull
    public static final List<PathNode> addPathNodes(@Nullable String str) {
        return str == null ? EmptyPath : new PathParser().parsePathString(str).toNodes();
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    @NotNull
    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    /* renamed from: rgbEqual--OWjLjI, reason: not valid java name */
    public static final boolean m11385rgbEqualOWjLjI(long j7, long j8) {
        return Color.m10688getRedimpl(j7) == Color.m10688getRedimpl(j8) && Color.m10687getGreenimpl(j7) == Color.m10687getGreenimpl(j8) && Color.m10685getBlueimpl(j7) == Color.m10685getBlueimpl(j8);
    }

    public static final boolean tintableWithAlphaMask(@Nullable ColorFilter colorFilter) {
        if (!(colorFilter instanceof BlendModeColorFilter)) {
            return colorFilter == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
        int blendMode = blendModeColorFilter.getBlendMode();
        BlendMode.Companion companion = BlendMode.INSTANCE;
        return BlendMode.m10593equalsimpl0(blendMode, companion.m10622getSrcIn0nO6VwU()) || BlendMode.m10593equalsimpl0(blendModeColorFilter.getBlendMode(), companion.m10624getSrcOver0nO6VwU());
    }
}
