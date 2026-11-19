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
public final class VerifiedUserKt {
    private static ImageVector _verifiedUser;

    public static final ImageVector getVerifiedUser(Icons.TwoTone twoTone) {
        ImageVector imageVector = _verifiedUser;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VerifiedUser", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 1.0f);
        pathBuilder.lineTo(3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        pathBuilder.curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        pathBuilder.lineTo(21.0f, 5.0f);
        pathBuilder.lineToRelative(-9.0f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 11.0f);
        pathBuilder.curveToRelative(0.0f, 4.52f, -2.98f, 8.69f, -7.0f, 9.93f);
        pathBuilder.curveToRelative(-4.02f, -1.24f, -7.0f, -5.41f, -7.0f, -9.93f);
        pathBuilder.lineTo(5.0f, 6.3f);
        pathBuilder.lineToRelative(7.0f, -3.11f);
        pathBuilder.lineToRelative(7.0f, 3.11f);
        pathBuilder.lineTo(19.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.41f, 11.59f);
        pathBuilder.lineTo(6.0f, 13.0f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.lineToRelative(-1.41f, -1.42f);
        pathBuilder.lineTo(10.0f, 14.17f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(5.0f, 6.3f);
        pathBuilder2.verticalLineTo(11.0f);
        pathBuilder2.curveToRelative(0.0f, 4.52f, 2.98f, 8.69f, 7.0f, 9.93f);
        pathBuilder2.curveToRelative(4.02f, -1.23f, 7.0f, -5.41f, 7.0f, -9.93f);
        pathBuilder2.verticalLineTo(6.3f);
        pathBuilder2.lineToRelative(-7.0f, -3.11f);
        pathBuilder2.lineTo(5.0f, 6.3f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 9.0f);
        pathBuilder2.lineToRelative(-8.0f, 8.0f);
        pathBuilder2.lineToRelative(-4.0f, -4.0f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(10.0f, 14.17f);
        pathBuilder2.lineToRelative(6.59f, -6.59f);
        pathBuilder2.lineTo(18.0f, 9.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _verifiedUser = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
