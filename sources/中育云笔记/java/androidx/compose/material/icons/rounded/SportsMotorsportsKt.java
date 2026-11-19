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
public final class SportsMotorsportsKt {
    private static ImageVector _sportsMotorsports;

    public static final ImageVector getSportsMotorsports(Icons.Rounded rounded) {
        ImageVector imageVector = _sportsMotorsports;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsMotorsports", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 11.39f);
        pathBuilder.curveToRelative(0.0f, -0.65f, -0.39f, -1.23f, -0.98f, -1.48f);
        pathBuilder.lineTo(5.44f, 7.55f);
        pathBuilder.curveToRelative(-1.48f, 1.68f, -2.32f, 3.7f, -2.8f, 5.45f);
        pathBuilder.horizontalLineToRelative(7.75f);
        pathBuilder.curveTo(11.28f, 13.0f, 12.0f, 12.28f, 12.0f, 11.39f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.96f, 11.22f);
        pathBuilder2.curveToRelative(-0.41f, -4.41f, -4.56f, -7.49f, -8.98f, -7.2f);
        pathBuilder2.curveToRelative(-2.51f, 0.16f, -4.44f, 0.94f, -5.93f, 2.04f);
        pathBuilder2.lineToRelative(4.74f, 2.01f);
        pathBuilder2.curveToRelative(1.33f, 0.57f, 2.2f, 1.87f, 2.2f, 3.32f);
        pathBuilder2.curveToRelative(0.0f, 1.99f, -1.62f, 3.61f, -3.61f, 3.61f);
        pathBuilder2.horizontalLineTo(2.21f);
        pathBuilder2.curveTo(2.0f, 16.31f, 2.0f, 17.2f, 2.0f, 17.2f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.curveTo(18.67f, 20.0f, 22.41f, 15.99f, 21.96f, 11.22f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsMotorsports = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
