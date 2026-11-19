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
public final class NightlifeKt {
    private static ImageVector _nightlife;

    public static final ImageVector getNightlife(Icons.Rounded rounded) {
        ImageVector imageVector = _nightlife;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Nightlife", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.87f, 5.0f);
        pathBuilder.horizontalLineToRelative(10.26f);
        pathBuilder.curveToRelative(0.8f, 0.0f, 1.28f, 0.89f, 0.83f, 1.55f);
        pathBuilder.lineTo(9.0f, 14.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.lineTo(2.04f, 6.55f);
        pathBuilder.curveTo(1.59f, 5.89f, 2.07f, 5.0f, 2.87f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.1f, 9.0f);
        pathBuilder.lineToRelative(1.4f, -2.0f);
        pathBuilder.horizontalLineTo(4.49f);
        pathBuilder.lineToRelative(1.4f, 2.0f);
        pathBuilder.horizontalLineTo(10.1f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveTo(21.33f, 5.0f, 22.0f, 5.67f, 22.0f, 6.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(22.0f, 7.33f, 21.33f, 8.0f, 20.5f, 8.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 1.84f, -1.64f, 3.28f, -3.54f, 2.95f);
        pathBuilder.curveToRelative(-1.21f, -0.21f, -2.2f, -1.2f, -2.41f, -2.41f);
        pathBuilder.curveTo(12.72f, 15.64f, 14.16f, 14.0f, 16.0f, 14.0f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.69f, 0.06f, 1.0f, 0.17f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveTo(17.0f, 5.9f, 17.9f, 5.0f, 19.0f, 5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightlife = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
