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
public final class RealEstateAgentKt {
    private static ImageVector _realEstateAgent;

    public static final ImageVector getRealEstateAgent(Icons.Filled filled) {
        ImageVector imageVector = _realEstateAgent;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RealEstateAgent", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.lineToRelative(-2.09f, -0.73f);
        pathBuilder.lineToRelative(0.33f, -0.94f);
        pathBuilder.lineTo(13.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(2.82f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.18f, -0.53f, 1.18f, -1.18f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f);
        pathBuilder.lineTo(8.97f, 11.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(9.02f);
        pathBuilder.lineTo(14.0f, 22.0f);
        pathBuilder.lineToRelative(8.0f, -3.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(21.99f, 17.9f, 21.11f, 17.0f, 20.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 1.5f);
        pathBuilder.lineToRelative(-7.0f, 5.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(8.14f, 3.26f);
        pathBuilder.curveTo(18.26f, 12.71f, 19.0f, 13.79f, 19.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.lineTo(14.0f, 1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 10.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 8.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 10.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 8.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _realEstateAgent = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
