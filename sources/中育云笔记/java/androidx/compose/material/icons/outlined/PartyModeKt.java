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
public final class PartyModeKt {
    private static ImageVector _partyMode;

    public static final ImageVector getPartyMode(Icons.Outlined outlined) {
        ImageVector imageVector = _partyMode;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PartyMode", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-3.17f);
        pathBuilder.lineTo(15.0f, 2.0f);
        pathBuilder.lineTo(9.0f, 2.0f);
        pathBuilder.lineTo(7.17f, 4.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 18.0f);
        pathBuilder.lineTo(4.0f, 18.0f);
        pathBuilder.lineTo(4.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(4.05f);
        pathBuilder.lineToRelative(0.59f, -0.65f);
        pathBuilder.lineTo(9.88f, 4.0f);
        pathBuilder.horizontalLineToRelative(4.24f);
        pathBuilder.lineToRelative(1.24f, 1.35f);
        pathBuilder.lineToRelative(0.59f, 0.65f);
        pathBuilder.lineTo(20.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(3.98f);
        pathBuilder.curveToRelative(-0.92f, -1.21f, -2.35f, -2.0f, -3.98f, -2.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 0.34f, 0.04f, 0.68f, 0.1f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.08f);
        pathBuilder.curveToRelative(-0.11f, -0.31f, -0.18f, -0.65f, -0.18f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.lineTo(8.02f, 15.0f);
        pathBuilder.curveToRelative(0.92f, 1.21f, 2.35f, 2.0f, 3.98f, 2.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -0.34f, -0.03f, -0.68f, -0.1f, -1.0f);
        pathBuilder.horizontalLineToRelative(-2.08f);
        pathBuilder.curveToRelative(0.11f, 0.31f, 0.18f, 0.65f, 0.18f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _partyMode = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
