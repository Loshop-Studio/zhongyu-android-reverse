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
public final class RealEstateAgentKt {
    private static ImageVector _realEstateAgent;

    public static final ImageVector getRealEstateAgent(Icons.Outlined outlined) {
        ImageVector imageVector = _realEstateAgent;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RealEstateAgent", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 6.5f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(7.5f);
        pathBuilder.lineTo(14.0f, 4.0f);
        pathBuilder.lineTo(9.0f, 7.5f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.lineToRelative(7.0f, -5.0f);
        pathBuilder.lineTo(21.0f, 6.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -1.2f, -0.75f, -2.28f, -1.87f, -2.7f);
        pathBuilder.lineTo(8.97f, 11.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-1.44f);
        pathBuilder.lineToRelative(7.0f, 1.94f);
        pathBuilder.lineToRelative(8.0f, -2.5f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveTo(22.0f, 17.34f, 20.66f, 16.0f, 19.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.97f, 20.41f);
        pathBuilder.lineTo(7.0f, 18.48f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(1.61f);
        pathBuilder.lineToRelative(5.82f, 2.17f);
        pathBuilder.curveTo(14.77f, 15.3f, 15.0f, 15.63f, 15.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, -1.99f, -0.05f, -2.3f, -0.15f);
        pathBuilder.lineToRelative(-2.38f, -0.79f);
        pathBuilder.lineToRelative(-0.63f, 1.9f);
        pathBuilder.lineToRelative(2.38f, 0.79f);
        pathBuilder.curveToRelative(0.51f, 0.17f, 1.04f, 0.26f, 1.58f, 0.26f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.curveToRelative(0.39f, 0.0f, 0.74f, 0.23f, 0.9f, 0.56f);
        pathBuilder.lineTo(13.97f, 20.41f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _realEstateAgent = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
