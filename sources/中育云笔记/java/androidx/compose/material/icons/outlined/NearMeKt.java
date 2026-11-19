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
public final class NearMeKt {
    private static ImageVector _nearMe;

    public static final ImageVector getNearMe(Icons.Outlined outlined) {
        ImageVector imageVector = _nearMe;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NearMe", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.27f, 6.73f);
        pathBuilder.lineToRelative(-4.24f, 10.13f);
        pathBuilder.lineToRelative(-1.32f, -3.42f);
        pathBuilder.lineToRelative(-0.32f, -0.83f);
        pathBuilder.lineToRelative(-0.82f, -0.32f);
        pathBuilder.lineToRelative(-3.43f, -1.33f);
        pathBuilder.lineToRelative(10.13f, -4.23f);
        pathBuilder.moveTo(21.0f, 3.0f);
        pathBuilder.lineTo(3.0f, 10.53f);
        pathBuilder.verticalLineToRelative(0.98f);
        pathBuilder.lineToRelative(6.84f, 2.65f);
        pathBuilder.lineTo(12.48f, 21.0f);
        pathBuilder.horizontalLineToRelative(0.98f);
        pathBuilder.lineTo(21.0f, 3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearMe = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
