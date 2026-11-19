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
public final class CampaignKt {
    private static ImageVector _campaign;

    public static final ImageVector getCampaign(Icons.Filled filled) {
        ImageVector imageVector = _campaign;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Campaign", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 11.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 17.61f);
        pathBuilder.curveToRelative(0.96f, 0.71f, 2.21f, 1.65f, 3.2f, 2.39f);
        pathBuilder.curveToRelative(0.4f, -0.53f, 0.8f, -1.07f, 1.2f, -1.6f);
        pathBuilder.curveToRelative(-0.99f, -0.74f, -2.24f, -1.68f, -3.2f, -2.4f);
        pathBuilder.curveToRelative(-0.4f, 0.54f, -0.8f, 1.08f, -1.2f, 1.61f);
        pathBuilder.close();
        pathBuilder.moveTo(20.4f, 5.6f);
        pathBuilder.curveToRelative(-0.4f, -0.53f, -0.8f, -1.07f, -1.2f, -1.6f);
        pathBuilder.curveToRelative(-0.99f, 0.74f, -2.24f, 1.68f, -3.2f, 2.4f);
        pathBuilder.curveToRelative(0.4f, 0.53f, 0.8f, 1.07f, 1.2f, 1.6f);
        pathBuilder.curveToRelative(0.96f, -0.72f, 2.21f, -1.65f, 3.2f, -2.4f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 9.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.lineToRelative(5.0f, 3.0f);
        pathBuilder.lineTo(13.0f, 6.0f);
        pathBuilder.lineTo(8.0f, 9.0f);
        pathBuilder.lineTo(4.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.33f, -0.58f, -2.53f, -1.5f, -3.35f);
        pathBuilder.verticalLineToRelative(6.69f);
        pathBuilder.curveToRelative(0.92f, -0.81f, 1.5f, -2.01f, 1.5f, -3.34f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _campaign = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
