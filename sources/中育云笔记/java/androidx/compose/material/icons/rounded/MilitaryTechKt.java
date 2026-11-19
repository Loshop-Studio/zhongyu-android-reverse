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
public final class MilitaryTechKt {
    private static ImageVector _militaryTech;

    public static final ImageVector getMilitaryTech(Icons.Rounded rounded) {
        ImageVector imageVector = _militaryTech;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MilitaryTech", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 10.43f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveTo(7.45f, 2.0f, 7.0f, 2.45f, 7.0f, 3.0f);
        pathBuilder.verticalLineToRelative(7.43f);
        pathBuilder.curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f);
        pathBuilder.lineToRelative(4.18f, 2.51f);
        pathBuilder.lineToRelative(-0.99f, 2.34f);
        pathBuilder.lineToRelative(-2.22f, 0.19f);
        pathBuilder.curveTo(8.0f, 16.37f, 7.82f, 16.92f, 8.16f, 17.21f);
        pathBuilder.lineToRelative(1.69f, 1.46f);
        pathBuilder.lineToRelative(-0.51f, 2.18f);
        pathBuilder.curveToRelative(-0.1f, 0.43f, 0.37f, 0.77f, 0.75f, 0.54f);
        pathBuilder.lineTo(12.0f, 20.23f);
        pathBuilder.lineToRelative(1.91f, 1.15f);
        pathBuilder.curveToRelative(0.38f, 0.23f, 0.85f, -0.11f, 0.75f, -0.54f);
        pathBuilder.lineToRelative(-0.51f, -2.18f);
        pathBuilder.lineToRelative(1.69f, -1.46f);
        pathBuilder.curveToRelative(0.33f, -0.29f, 0.16f, -0.84f, -0.29f, -0.88f);
        pathBuilder.lineToRelative(-2.22f, -0.19f);
        pathBuilder.lineToRelative(-0.99f, -2.34f);
        pathBuilder.lineToRelative(4.18f, -2.51f);
        pathBuilder.curveTo(16.82f, 11.11f, 17.0f, 10.79f, 17.0f, 10.43f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 12.23f);
        pathBuilder.lineToRelative(-1.0f, 0.6f);
        pathBuilder.lineToRelative(-1.0f, -0.6f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(12.23f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _militaryTech = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
