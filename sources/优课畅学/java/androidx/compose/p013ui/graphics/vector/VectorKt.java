package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.BlendMode;
import androidx.compose.p013ui.graphics.BlendModeColorFilter;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.PathFillType;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import java.util.List;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class VectorKt {
    public static final String DefaultGroupName = "";
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
    private static final List<PathNode> EmptyPath = AbstractC8809v.m14771n();
    private static final int DefaultStrokeLineCap = StrokeCap.Companion.m24629getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.Companion.m24640getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.Companion.m24216getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.Companion.m24311getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.Companion.m24559getNonZeroRgk1Os();

    public static final List<PathNode> PathData(InterfaceC10570l interfaceC10570l) {
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC10570l.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    public static final List<PathNode> addPathNodes(String str) {
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

    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    /* renamed from: rgbEqual--OWjLjI, reason: not valid java name */
    public static final boolean m24979rgbEqualOWjLjI(long j10, long j11) {
        return Color.m24282getRedimpl(j10) == Color.m24282getRedimpl(j11) && Color.m24281getGreenimpl(j10) == Color.m24281getGreenimpl(j11) && Color.m24279getBlueimpl(j10) == Color.m24279getBlueimpl(j11);
    }

    public static final boolean tintableWithAlphaMask(ColorFilter colorFilter) {
        if (!(colorFilter instanceof BlendModeColorFilter)) {
            return colorFilter == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
        int iM24220getBlendMode0nO6VwU = blendModeColorFilter.m24220getBlendMode0nO6VwU();
        BlendMode.Companion companion = BlendMode.Companion;
        return BlendMode.m24187equalsimpl0(iM24220getBlendMode0nO6VwU, companion.m24216getSrcIn0nO6VwU()) || BlendMode.m24187equalsimpl0(blendModeColorFilter.m24220getBlendMode0nO6VwU(), companion.m24218getSrcOver0nO6VwU());
    }
}
