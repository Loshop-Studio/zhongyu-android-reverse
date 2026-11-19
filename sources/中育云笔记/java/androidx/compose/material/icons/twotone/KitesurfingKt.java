package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class KitesurfingKt {
    private static ImageVector _kitesurfing;

    public static final ImageVector getKitesurfing(Icons.TwoTone twoTone) {
        ImageVector imageVector = _kitesurfing;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Kitesurfing", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 4.1f, 6.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.06f, 1.0f);
        pathBuilder.horizontalLineToRelative(-2.12f);
        pathBuilder.lineTo(15.5f, 3.44f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineTo(20.06f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 23.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-1.04f, 0.0f, -2.08f, -0.35f, -3.0f, -1.0f);
        pathBuilder.curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6.0f, 0.0f);
        pathBuilder.curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6.0f, 0.0f);
        pathBuilder.curveToRelative(-0.91f, 0.65f, -1.96f, 1.0f, -3.0f, 1.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.lineToRelative(0.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(1.03f, 0.0f, 2.05f, -0.25f, 3.0f, -0.75f);
        pathBuilder.curveToRelative(1.89f, 1.0f, 4.11f, 1.0f, 6.0f, 0.0f);
        pathBuilder.curveToRelative(1.89f, 1.0f, 4.11f, 1.0f, 6.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.95f, 0.5f, 1.97f, 0.75f, 3.0f, 0.75f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 13.28f);
        pathBuilder.curveToRelative(0.0f, 1.44f, -2.19f, 3.62f, -5.04f, 5.58f);
        pathBuilder.curveTo(15.65f, 18.95f, 15.33f, 19.0f, 15.0f, 19.0f);
        pathBuilder.curveToRelative(-1.2f, 0.0f, -2.27f, -0.66f, -3.0f, -1.5f);
        pathBuilder.curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3.0f, 1.5f);
        pathBuilder.curveToRelative(-0.94f, 0.0f, -1.81f, -0.41f, -2.49f, -0.99f);
        pathBuilder.curveToRelative(0.46f, -0.39f, 0.96f, -0.78f, 1.49f, -1.17f);
        pathBuilder.lineToRelative(-1.55f, -2.97f);
        pathBuilder.curveTo(6.15f, 13.3f, 6.0f, 12.64f, 6.0f, 12.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.63f, -0.56f, 3.54f, -1.46f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.curveTo(14.68f, 7.21f, 12.93f, 8.0f, 11.0f, 8.0f);
        pathBuilder.horizontalLineTo(9.6f);
        pathBuilder.lineToRelative(0.0f, 3.5f);
        pathBuilder.horizontalLineToRelative(2.8f);
        pathBuilder.lineToRelative(1.69f, 1.88f);
        pathBuilder.curveToRelative(1.95f, -0.84f, 3.77f, -1.38f, 5.06f, -1.38f);
        pathBuilder.curveTo(19.99f, 12.0f, 21.0f, 12.25f, 21.0f, 13.28f);
        pathBuilder.close();
        pathBuilder.moveTo(12.2f, 14.27f);
        pathBuilder.lineToRelative(-0.7f, -0.77f);
        pathBuilder.lineTo(9.0f, 13.6f);
        pathBuilder.lineToRelative(0.83f, 2.01f);
        pathBuilder.curveTo(10.42f, 15.23f, 11.64f, 14.55f, 12.2f, 14.27f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kitesurfing = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
