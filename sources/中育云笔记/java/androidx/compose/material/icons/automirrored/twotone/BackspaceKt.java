package androidx.compose.material.icons.automirrored.twotone;

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
public final class BackspaceKt {
    private static ImageVector _backspace;

    public static final ImageVector getBackspace(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _backspace;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.Backspace", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.06f, 5.0f);
        pathBuilder.lineTo(2.4f, 12.0f);
        pathBuilder.lineToRelative(4.67f, 7.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(7.06f);
        pathBuilder.curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 8.41f);
        pathBuilder.lineTo(10.41f, 7.0f);
        pathBuilder.lineTo(14.0f, 10.59f);
        pathBuilder.lineTo(17.59f, 7.0f);
        pathBuilder.lineTo(19.0f, 8.41f);
        pathBuilder.lineTo(15.41f, 12.0f);
        pathBuilder.lineTo(19.0f, 15.59f);
        pathBuilder.lineTo(17.59f, 17.0f);
        pathBuilder.lineTo(14.0f, 13.41f);
        pathBuilder.lineTo(10.41f, 17.0f);
        pathBuilder.lineTo(9.0f, 15.59f);
        pathBuilder.lineTo(12.59f, 12.0f);
        pathBuilder.lineTo(9.0f, 8.41f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(22.0f, 3.0f);
        pathBuilder2.lineTo(7.0f, 3.0f);
        pathBuilder2.curveToRelative(-0.69f, 0.0f, -1.23f, 0.35f, -1.59f, 0.88f);
        pathBuilder2.lineTo(0.0f, 12.0f);
        pathBuilder2.lineToRelative(5.41f, 8.11f);
        pathBuilder2.curveToRelative(0.36f, 0.53f, 0.9f, 0.89f, 1.59f, 0.89f);
        pathBuilder2.horizontalLineToRelative(15.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.lineTo(24.0f, 5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(22.0f, 19.0f);
        pathBuilder2.lineTo(7.07f, 19.0f);
        pathBuilder2.lineTo(2.4f, 12.0f);
        pathBuilder2.lineToRelative(4.66f, -7.0f);
        pathBuilder2.lineTo(22.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.41f, 17.0f);
        pathBuilder2.lineTo(14.0f, 13.41f);
        pathBuilder2.lineTo(17.59f, 17.0f);
        pathBuilder2.lineTo(19.0f, 15.59f);
        pathBuilder2.lineTo(15.41f, 12.0f);
        pathBuilder2.lineTo(19.0f, 8.41f);
        pathBuilder2.lineTo(17.59f, 7.0f);
        pathBuilder2.lineTo(14.0f, 10.59f);
        pathBuilder2.lineTo(10.41f, 7.0f);
        pathBuilder2.lineTo(9.0f, 8.41f);
        pathBuilder2.lineTo(12.59f, 12.0f);
        pathBuilder2.lineTo(9.0f, 15.59f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backspace = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
