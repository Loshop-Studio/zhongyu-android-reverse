package androidx.compose.material.icons.sharp;

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
public final class FormatColorResetKt {
    private static ImageVector _formatColorReset;

    public static final ImageVector getFormatColorReset(Icons.Sharp sharp) {
        ImageVector imageVector = _formatColorReset;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FormatColorReset", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, -3.98f, -6.0f, -10.8f, -6.0f, -10.8f);
        pathBuilder.reflectiveCurveToRelative(-1.18f, 1.35f, -2.5f, 3.19f);
        pathBuilder.lineToRelative(8.44f, 8.44f);
        pathBuilder.curveToRelative(0.03f, -0.27f, 0.06f, -0.55f, 0.06f, -0.83f);
        pathBuilder.close();
        pathBuilder.moveTo(5.41f, 5.14f);
        pathBuilder.lineTo(4.0f, 6.55f);
        pathBuilder.lineToRelative(3.32f, 3.32f);
        pathBuilder.curveTo(6.55f, 11.33f, 6.0f, 12.79f, 6.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.curveToRelative(1.52f, 0.0f, 2.9f, -0.57f, 3.95f, -1.5f);
        pathBuilder.lineToRelative(2.63f, 2.63f);
        pathBuilder.lineTo(20.0f, 19.72f);
        pathBuilder.lineTo(5.41f, 5.14f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatColorReset = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
