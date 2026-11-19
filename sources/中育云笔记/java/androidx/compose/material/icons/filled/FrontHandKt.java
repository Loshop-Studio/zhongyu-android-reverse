package androidx.compose.material.icons.filled;

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
public final class FrontHandKt {
    private static ImageVector _frontHand;

    public static final ImageVector getFrontHand(Icons.Filled filled) {
        ImageVector imageVector = _frontHand;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FrontHand", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.75f, 8.0f);
        pathBuilder.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -2.04f, 1.53f, -3.72f, 3.5f, -3.97f);
        pathBuilder.lineToRelative(0.0f, -10.78f);
        pathBuilder.curveTo(17.5f, 2.56f, 16.94f, 2.0f, 16.25f, 2.0f);
        pathBuilder.curveTo(15.56f, 2.0f, 15.0f, 2.56f, 15.0f, 3.25f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(1.25f);
        pathBuilder.curveTo(14.0f, 0.56f, 13.44f, 0.0f, 12.75f, 0.0f);
        pathBuilder.reflectiveCurveTo(11.5f, 0.56f, 11.5f, 1.25f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(2.75f);
        pathBuilder.curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilder.reflectiveCurveTo(8.0f, 2.06f, 8.0f, 2.75f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(5.75f);
        pathBuilder.curveTo(7.0f, 5.06f, 6.44f, 4.5f, 5.75f, 4.5f);
        pathBuilder.reflectiveCurveTo(4.5f, 5.06f, 4.5f, 5.75f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 4.56f, 3.69f, 8.25f, 8.25f, 8.25f);
        pathBuilder.reflectiveCurveTo(21.0f, 20.31f, 21.0f, 15.75f);
        pathBuilder.verticalLineToRelative(-6.5f);
        pathBuilder.curveTo(21.0f, 8.56f, 20.44f, 8.0f, 19.75f, 8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _frontHand = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
