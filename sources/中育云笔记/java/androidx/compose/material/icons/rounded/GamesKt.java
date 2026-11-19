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
public final class GamesKt {
    private static ImageVector _games;

    public static final ImageVector getGames(Icons.Rounded rounded) {
        ImageVector imageVector = _games;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Games", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 7.29f);
        pathBuilder.lineTo(15.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.29f);
        pathBuilder.curveToRelative(0.0f, 0.13f, 0.05f, 0.26f, 0.15f, 0.35f);
        pathBuilder.lineToRelative(2.5f, 2.5f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(2.5f, -2.5f);
        pathBuilder.curveToRelative(0.09f, -0.09f, 0.14f, -0.21f, 0.14f, -0.35f);
        pathBuilder.close();
        pathBuilder.moveTo(7.29f, 9.0f);
        pathBuilder.lineTo(3.0f, 9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.29f);
        pathBuilder.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        pathBuilder.lineToRelative(2.5f, -2.5f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(-2.5f, -2.5f);
        pathBuilder.curveTo(7.55f, 9.05f, 7.43f, 9.0f, 7.29f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 16.71f);
        pathBuilder.lineTo(9.0f, 21.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.29f);
        pathBuilder.curveToRelative(0.0f, -0.13f, -0.05f, -0.26f, -0.15f, -0.35f);
        pathBuilder.lineToRelative(-2.5f, -2.5f);
        pathBuilder.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        pathBuilder.lineToRelative(-2.5f, 2.5f);
        pathBuilder.curveToRelative(-0.09f, 0.09f, -0.14f, 0.21f, -0.14f, 0.35f);
        pathBuilder.close();
        pathBuilder.moveTo(16.35f, 9.15f);
        pathBuilder.lineToRelative(-2.5f, 2.5f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(2.5f, 2.5f);
        pathBuilder.curveToRelative(0.09f, 0.09f, 0.22f, 0.15f, 0.35f, 0.15f);
        pathBuilder.lineTo(21.0f, 15.01f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-4.29f);
        pathBuilder.curveToRelative(-0.14f, -0.01f, -0.26f, 0.04f, -0.36f, 0.14f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _games = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
