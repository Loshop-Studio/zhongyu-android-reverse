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
public final class PersonAddDisabledKt {
    private static ImageVector _personAddDisabled;

    public static final ImageVector getPersonAddDisabled(Icons.Rounded rounded) {
        ImageVector imageVector = _personAddDisabled;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PersonAddDisabled", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.48f, 11.95f);
        pathBuilder.curveToRelative(0.17f, 0.02f, 0.34f, 0.05f, 0.52f, 0.05f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.18f, 0.03f, 0.35f, 0.05f, 0.52f);
        pathBuilder.lineToRelative(3.43f, 3.43f);
        pathBuilder.close();
        pathBuilder.moveTo(16.69f, 14.16f);
        pathBuilder.lineToRelative(5.74f, 5.74f);
        pathBuilder.curveToRelative(0.33f, -0.17f, 0.57f, -0.5f, 0.57f, -0.9f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -2.14f, -3.56f, -3.5f, -6.31f, -3.84f);
        pathBuilder.close();
        pathBuilder.moveTo(2.12f, 2.42f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(4.0f, 7.12f);
        pathBuilder.lineTo(4.0f, 10.0f);
        pathBuilder.lineTo(2.0f, 10.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.88f);
        pathBuilder.lineToRelative(2.51f, 2.51f);
        pathBuilder.curveTo(9.19f, 15.11f, 7.0f, 16.3f, 7.0f, 18.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(8.88f);
        pathBuilder.lineToRelative(3.29f, 3.29f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(2.12f, 2.42f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 10.0f);
        pathBuilder.verticalLineToRelative(-0.88f);
        pathBuilder.lineToRelative(0.88f, 0.88f);
        pathBuilder.lineTo(6.0f, 10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personAddDisabled = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
