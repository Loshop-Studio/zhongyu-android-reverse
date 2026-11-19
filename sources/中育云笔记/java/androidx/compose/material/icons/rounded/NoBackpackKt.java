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
public final class NoBackpackKt {
    private static ImageVector _noBackpack;

    public static final ImageVector getNoBackpack(Icons.Rounded rounded) {
        ImageVector imageVector = _noBackpack;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoBackpack", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.98f, 4.15f);
        pathBuilder.curveToRelative(0.01f, 0.0f, 0.01f, -0.01f, 0.02f, -0.01f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder.curveTo(7.0f, 2.67f, 7.67f, 2.0f, 8.5f, 2.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 2.67f, 10.0f, 3.5f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder.curveTo(14.0f, 2.67f, 14.67f, 2.0f, 15.5f, 2.0f);
        pathBuilder.reflectiveCurveTo(17.0f, 2.67f, 17.0f, 3.5f);
        pathBuilder.verticalLineToRelative(0.64f);
        pathBuilder.curveToRelative(1.72f, 0.45f, 3.0f, 2.0f, 3.0f, 3.86f);
        pathBuilder.verticalLineToRelative(9.17f);
        pathBuilder.lineToRelative(-2.03f, -2.03f);
        pathBuilder.curveTo(17.98f, 15.09f, 18.0f, 15.05f, 18.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-2.17f);
        pathBuilder.lineTo(6.98f, 4.15f);
        pathBuilder.close();
        pathBuilder.moveTo(20.49f, 21.9f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-0.14f, -0.14f);
        pathBuilder.curveTo(18.65f, 21.91f, 18.34f, 22.0f, 18.0f, 22.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -0.36f, 0.06f, -0.69f, 0.15f, -1.02f);
        pathBuilder.lineTo(2.1f, 4.93f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(16.97f, 16.97f);
        pathBuilder.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        pathBuilder.close();
        pathBuilder.moveTo(11.17f, 14.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineTo(11.17f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noBackpack = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
