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
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class TrendingUpKt {
    private static ImageVector _trendingUp;

    public static final ImageVector getTrendingUp(Icons.Rounded rounded) {
        ImageVector imageVector = _trendingUp;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TrendingUp", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.85f, 6.85f);
        pathBuilder.lineToRelative(1.44f, 1.44f);
        pathBuilder.lineToRelative(-4.88f, 4.88f);
        pathBuilder.lineToRelative(-3.29f, -3.29f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-6.0f, 6.01f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(9.41f, 12.0f);
        pathBuilder.lineToRelative(3.29f, 3.29f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(5.59f, -5.58f);
        pathBuilder.lineToRelative(1.44f, 1.44f);
        pathBuilder.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveToRelative(0.01f, -0.28f, -0.21f, -0.5f, -0.49f, -0.5f);
        pathBuilder.horizontalLineToRelative(-4.29f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.36f, 0.85f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _trendingUp = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getTrendingUp$annotations(Icons.Rounded rounded) {
    }
}
