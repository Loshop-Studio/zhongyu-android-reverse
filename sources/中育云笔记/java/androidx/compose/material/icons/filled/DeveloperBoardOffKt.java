package androidx.compose.material.icons.filled;

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
public final class DeveloperBoardOffKt {
    private static ImageVector _developerBoardOff;

    public static final ImageVector getDeveloperBoardOff(Icons.Filled filled) {
        ImageVector imageVector = _developerBoardOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DeveloperBoardOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.83f, 5.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineToRelative(10.17f);
        pathBuilder.lineTo(19.83f, 17.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(5.83f);
        pathBuilder.lineTo(7.83f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 9.17f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-3.17f);
        pathBuilder.lineTo(12.0f, 9.17f);
        pathBuilder.close();
        pathBuilder.moveTo(9.83f, 7.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineToRelative(1.17f);
        pathBuilder.lineTo(9.83f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.83f, 11.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineToRelative(2.17f);
        pathBuilder.lineTo(13.83f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 21.0f);
        pathBuilder.curveToRelative(0.06f, 0.0f, 0.11f, 0.0f, 0.16f, -0.01f);
        pathBuilder.lineToRelative(2.32f, 2.32f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.1f, 2.1f);
        pathBuilder.lineTo(0.69f, 3.51f);
        pathBuilder.lineToRelative(1.32f, 1.32f);
        pathBuilder.curveTo(2.0f, 4.89f, 2.0f, 4.94f, 2.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 19.0f);
        pathBuilder.verticalLineTo(6.83f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineToRelative(3.17f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(-3.17f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.horizontalLineToRelative(2.17f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _developerBoardOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
