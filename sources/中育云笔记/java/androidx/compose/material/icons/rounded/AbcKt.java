package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class AbcKt {
    private static ImageVector _abc;

    public static final ImageVector getAbc(Icons.Rounded rounded) {
        ImageVector imageVector = _abc;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Abc", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.25f, 15.0f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineTo(13.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(0.75f);
        pathBuilder.curveTo(4.5f, 14.66f, 4.16f, 15.0f, 3.75f, 15.0f);
        pathBuilder.reflectiveCurveTo(3.0f, 14.66f, 3.0f, 14.25f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.25f);
        pathBuilder.curveTo(8.0f, 14.66f, 7.66f, 15.0f, 7.25f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 12.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveTo(14.5f, 11.55f, 14.05f, 12.0f, 13.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 10.5f);
        pathBuilder.verticalLineToRelative(0.75f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 12.75f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(0.75f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(12.75f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 10.25f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.curveToRelative(-0.33f, 0.0f, -0.6f, -0.21f, -0.71f, -0.5f);
        pathBuilder.lineToRelative(-2.04f, 0.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineToRelative(2.04f, 0.0f);
        pathBuilder.curveToRelative(0.1f, -0.29f, 0.38f, -0.5f, 0.71f, -0.5f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineTo(10.25f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _abc = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
