package androidx.compose.p014ui.graphics.vector;

import androidx.compose.p014ui.graphics.BlendMode;
import androidx.compose.p014ui.graphics.BlendModeColorFilter;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.PathFillType;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import java.util.List;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10978w;

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
    private static final List<PathNode> EmptyPath = AbstractC10978w.m24136n();
    private static final int DefaultStrokeLineCap = StrokeCap.Companion.m31231getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.Companion.m31242getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.Companion.m30818getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.Companion.m30913getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.Companion.m31161getNonZeroRgk1Os();

    public static final List<PathNode> PathData(InterfaceC9540l interfaceC9540l) {
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC9540l.invoke(pathBuilder);
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
    public static final boolean m31581rgbEqualOWjLjI(long j10, long j11) {
        return Color.m30884getRedimpl(j10) == Color.m30884getRedimpl(j11) && Color.m30883getGreenimpl(j10) == Color.m30883getGreenimpl(j11) && Color.m30881getBlueimpl(j10) == Color.m30881getBlueimpl(j11);
    }

    public static final boolean tintableWithAlphaMask(ColorFilter colorFilter) {
        if (!(colorFilter instanceof BlendModeColorFilter)) {
            return colorFilter == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
        int iM30822getBlendMode0nO6VwU = blendModeColorFilter.m30822getBlendMode0nO6VwU();
        BlendMode.Companion companion = BlendMode.Companion;
        return BlendMode.m30789equalsimpl0(iM30822getBlendMode0nO6VwU, companion.m30818getSrcIn0nO6VwU()) || BlendMode.m30789equalsimpl0(blendModeColorFilter.m30822getBlendMode0nO6VwU(), companion.m30820getSrcOver0nO6VwU());
    }
}
