package androidx.compose.material.icons.outlined;

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
public final class MediationKt {
    private static ImageVector _mediation;

    public static final ImageVector getMediation(Icons.Outlined outlined) {
        ImageVector imageVector = _mediation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Mediation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 16.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-5.06f);
        pathBuilder.curveToRelative(-0.34f, -3.1f, -2.26f, -5.72f, -4.94f, -7.05f);
        pathBuilder.curveTo(7.96f, 2.31f, 6.64f, 1.0f, 5.0f, 1.0f);
        pathBuilder.curveTo(3.34f, 1.0f, 2.0f, 2.34f, 2.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.curveToRelative(0.95f, 0.0f, 1.78f, -0.45f, 2.33f, -1.14f);
        pathBuilder.curveTo(9.23f, 6.9f, 10.6f, 8.77f, 10.92f, 11.0f);
        pathBuilder.horizontalLineToRelative(-3.1f);
        pathBuilder.curveTo(7.4f, 9.84f, 6.3f, 9.0f, 5.0f, 9.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.curveToRelative(1.3f, 0.0f, 2.4f, -0.84f, 2.82f, -2.0f);
        pathBuilder.horizontalLineToRelative(3.1f);
        pathBuilder.curveToRelative(-0.32f, 2.23f, -1.69f, 4.1f, -3.58f, 5.14f);
        pathBuilder.curveTo(6.78f, 17.45f, 5.95f, 17.0f, 5.0f, 17.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.curveToRelative(1.64f, 0.0f, 2.96f, -1.31f, 2.99f, -2.95f);
        pathBuilder.curveToRelative(2.68f, -1.33f, 4.6f, -3.95f, 4.94f, -7.05f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mediation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
