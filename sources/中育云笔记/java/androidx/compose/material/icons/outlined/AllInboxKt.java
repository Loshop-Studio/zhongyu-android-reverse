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
public final class AllInboxKt {
    private static ImageVector _allInbox;

    public static final ImageVector getAllInbox(Icons.Outlined outlined) {
        ImageVector imageVector = _allInbox;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AllInbox", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.lineTo(5.0f, 3.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(21.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(3.13f);
        pathBuilder.curveToRelative(0.21f, 0.78f, 0.67f, 1.47f, 1.27f, 2.0f);
        pathBuilder.lineTo(5.0f, 12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(-4.4f);
        pathBuilder.curveToRelative(0.6f, -0.53f, 1.06f, -1.22f, 1.27f, -2.0f);
        pathBuilder.lineTo(19.0f, 10.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 1.07f, -0.93f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.93f, -2.0f, -2.0f);
        pathBuilder.lineTo(10.0f, 8.0f);
        pathBuilder.lineTo(5.0f, 8.0f);
        pathBuilder.lineTo(5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.47f, -0.19f, 0.9f, -0.48f, 1.25f);
        pathBuilder.curveToRelative(-0.37f, 0.45f, -0.92f, 0.75f, -1.52f, 0.75f);
        pathBuilder.reflectiveCurveToRelative(-1.15f, -0.3f, -1.52f, -0.75f);
        pathBuilder.curveToRelative(-0.29f, -0.35f, -0.48f, -0.78f, -0.48f, -1.25f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.lineTo(3.0f, 15.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(3.13f);
        pathBuilder.curveToRelative(0.02f, 0.09f, 0.06f, 0.17f, 0.09f, 0.25f);
        pathBuilder.curveToRelative(0.24f, 0.68f, 0.65f, 1.28f, 1.18f, 1.75f);
        pathBuilder.lineTo(5.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(-4.4f);
        pathBuilder.curveToRelative(0.54f, -0.47f, 0.95f, -1.07f, 1.18f, -1.75f);
        pathBuilder.curveToRelative(0.03f, -0.08f, 0.07f, -0.16f, 0.09f, -0.25f);
        pathBuilder.lineTo(19.0f, 17.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _allInbox = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
