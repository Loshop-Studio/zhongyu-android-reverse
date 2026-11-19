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
public final class UnarchiveKt {
    private static ImageVector _unarchive;

    public static final ImageVector getUnarchive(Icons.Outlined outlined) {
        ImageVector imageVector = _unarchive;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Unarchive", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.54f, 5.23f);
        pathBuilder.lineToRelative(-1.39f, -1.68f);
        pathBuilder.curveTo(18.88f, 3.21f, 18.47f, 3.0f, 18.0f, 3.0f);
        pathBuilder.lineTo(6.0f, 3.0f);
        pathBuilder.curveToRelative(-0.47f, 0.0f, -0.88f, 0.21f, -1.16f, 0.55f);
        pathBuilder.lineTo(3.46f, 5.23f);
        pathBuilder.curveTo(3.17f, 5.57f, 3.0f, 6.02f, 3.0f, 6.5f);
        pathBuilder.lineTo(3.0f, 19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(21.0f, 6.5f);
        pathBuilder.curveToRelative(0.0f, -0.48f, -0.17f, -0.93f, -0.46f, -1.27f);
        pathBuilder.close();
        pathBuilder.moveTo(6.24f, 5.0f);
        pathBuilder.horizontalLineToRelative(11.52f);
        pathBuilder.lineToRelative(0.83f, 1.0f);
        pathBuilder.lineTo(5.42f, 6.0f);
        pathBuilder.lineToRelative(0.82f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 19.0f);
        pathBuilder.lineTo(5.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.lineTo(5.0f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(2.55f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(2.9f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.lineTo(16.0f, 14.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unarchive = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
