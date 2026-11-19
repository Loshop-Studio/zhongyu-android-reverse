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
public final class WaterDamageKt {
    private static ImageVector _waterDamage;

    public static final ImageVector getWaterDamage(Icons.Rounded rounded) {
        ImageVector imageVector = _waterDamage;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WaterDamage", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.33f, 3.6f);
        pathBuilder.lineToRelative(-8.36f, 7.53f);
        pathBuilder.curveTo(2.63f, 11.43f, 2.84f, 12.0f, 3.3f, 12.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-7.0f);
        pathBuilder.horizontalLineToRelative(1.7f);
        pathBuilder.curveToRelative(0.46f, 0.0f, 0.68f, -0.57f, 0.33f, -0.87f);
        pathBuilder.lineTo(12.67f, 3.6f);
        pathBuilder.curveTo(12.29f, 3.26f, 11.71f, 3.26f, 11.33f, 3.6f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -0.78f, 0.99f, -2.44f, 1.58f, -3.36f);
        pathBuilder.curveToRelative(0.2f, -0.31f, 0.64f, -0.31f, 0.84f, 0.0f);
        pathBuilder.curveTo(13.01f, 11.56f, 14.0f, 13.22f, 14.0f, 14.0f);
        pathBuilder.curveTo(14.0f, 15.1f, 13.1f, 16.0f, 12.0f, 16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _waterDamage = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
