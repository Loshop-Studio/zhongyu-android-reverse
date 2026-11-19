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
public final class TramKt {
    private static ImageVector _tram;

    public static final ImageVector getTram(Icons.Outlined outlined) {
        ImageVector imageVector = _tram;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Tram", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 5.0f);
        pathBuilder.lineToRelative(0.75f, -1.5f);
        pathBuilder.lineTo(17.0f, 3.5f);
        pathBuilder.lineTo(17.0f, 2.0f);
        pathBuilder.lineTo(7.0f, 2.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(4.75f);
        pathBuilder.lineTo(11.0f, 5.0f);
        pathBuilder.curveToRelative(-3.13f, 0.09f, -6.0f, 0.73f, -6.0f, 3.5f);
        pathBuilder.lineTo(5.0f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 1.5f, 1.11f, 2.73f, 2.55f, 2.95f);
        pathBuilder.lineTo(6.0f, 21.5f);
        pathBuilder.verticalLineToRelative(0.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.lineToRelative(-1.55f, -1.55f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveTo(17.89f, 19.73f, 19.0f, 18.5f, 19.0f, 17.0f);
        pathBuilder.lineTo(19.0f, 8.5f);
        pathBuilder.curveToRelative(0.0f, -2.77f, -2.87f, -3.41f, -6.0f, -3.5f);
        pathBuilder.close();
        pathBuilder.moveTo(11.03f, 7.0f);
        pathBuilder.horizontalLineToRelative(1.94f);
        pathBuilder.curveToRelative(2.75f, 0.08f, 3.62f, 0.58f, 3.9f, 1.0f);
        pathBuilder.lineTo(7.13f, 8.0f);
        pathBuilder.curveToRelative(0.28f, -0.42f, 1.15f, -0.92f, 3.9f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.85f, 17.95f);
        pathBuilder.lineTo(7.74f, 17.95f);
        pathBuilder.curveTo(7.3f, 17.84f, 7.0f, 17.45f, 7.0f, 17.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(3.89f);
        pathBuilder.curveToRelative(-0.24f, 0.27f, -0.39f, 0.61f, -0.39f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.36f, 0.13f, 0.69f, 0.35f, 0.95f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 0.45f, -0.3f, 0.84f, -0.74f, 0.95f);
        pathBuilder.horizontalLineToRelative(-3.11f);
        pathBuilder.curveToRelative(0.22f, -0.26f, 0.35f, -0.59f, 0.35f, -0.95f);
        pathBuilder.curveToRelative(0.0f, -0.39f, -0.15f, -0.73f, -0.39f, -1.0f);
        pathBuilder.lineTo(17.0f, 16.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 14.0f);
        pathBuilder.lineTo(7.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tram = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
