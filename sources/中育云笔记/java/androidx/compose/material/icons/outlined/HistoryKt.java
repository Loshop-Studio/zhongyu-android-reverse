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
public final class HistoryKt {
    private static ImageVector _history;

    public static final ImageVector getHistory(Icons.Outlined outlined) {
        ImageVector imageVector = _history;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.History", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 3.0f);
        pathBuilder.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder.lineTo(1.0f, 12.0f);
        pathBuilder.lineToRelative(3.89f, 3.89f);
        pathBuilder.lineToRelative(0.07f, 0.14f);
        pathBuilder.lineTo(9.0f, 12.0f);
        pathBuilder.lineTo(6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        pathBuilder.curveToRelative(-1.93f, 0.0f, -3.68f, -0.79f, -4.94f, -2.06f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveTo(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f);
        pathBuilder.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder.reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 8.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.lineToRelative(4.25f, 2.52f);
        pathBuilder.lineToRelative(0.77f, -1.28f);
        pathBuilder.lineToRelative(-3.52f, -2.09f);
        pathBuilder.lineTo(13.5f, 8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _history = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
