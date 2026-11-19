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
public final class VerifiedUserKt {
    private static ImageVector _verifiedUser;

    public static final ImageVector getVerifiedUser(Icons.Rounded rounded) {
        ImageVector imageVector = _verifiedUser;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VerifiedUser", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.19f, 1.36f);
        pathBuilder.lineToRelative(-7.0f, 3.11f);
        pathBuilder.curveTo(3.47f, 4.79f, 3.0f, 5.51f, 3.0f, 6.3f);
        pathBuilder.lineTo(3.0f, 11.0f);
        pathBuilder.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        pathBuilder.curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        pathBuilder.lineTo(21.0f, 6.3f);
        pathBuilder.curveToRelative(0.0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f);
        pathBuilder.lineToRelative(-7.0f, -3.11f);
        pathBuilder.curveToRelative(-0.51f, -0.23f, -1.11f, -0.23f, -1.62f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.29f, 16.29f);
        pathBuilder.lineTo(6.7f, 13.7f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(10.0f, 14.17f);
        pathBuilder.lineToRelative(5.88f, -5.88f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(-6.59f, 6.59f);
        pathBuilder.curveToRelative(-0.38f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _verifiedUser = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
