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
public final class EditOffKt {
    private static ImageVector _editOff;

    public static final ImageVector getEditOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _editOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EditOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 18.08f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(0.92f);
        pathBuilder.lineToRelative(5.12f, -5.12f);
        pathBuilder.lineToRelative(-0.92f, -0.92f);
        pathBuilder.lineTo(5.0f, 18.08f);
        pathBuilder.close();
        pathBuilder.moveTo(14.06f, 9.02f);
        pathBuilder.lineToRelative(-1.11f, 1.11f);
        pathBuilder.lineToRelative(0.92f, 0.92f);
        pathBuilder.lineToRelative(1.11f, -1.11f);
        pathBuilder.lineTo(14.06f, 9.02f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.06f, 9.02f);
        pathBuilder2.lineToRelative(0.92f, 0.92f);
        pathBuilder2.lineToRelative(-1.11f, 1.11f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineToRelative(2.52f, -2.52f);
        pathBuilder2.lineToRelative(-3.75f, -3.75f);
        pathBuilder2.lineToRelative(-2.52f, 2.52f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineTo(14.06f, 9.02f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.71f, 7.04f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder2.lineToRelative(-2.34f, -2.34f);
        pathBuilder2.curveTo(18.17f, 3.09f, 17.92f, 3.0f, 17.66f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f);
        pathBuilder2.lineToRelative(-1.83f, 1.83f);
        pathBuilder2.lineToRelative(3.75f, 3.75f);
        pathBuilder2.lineTo(20.71f, 7.04f);
        pathBuilder2.close();
        pathBuilder2.moveTo(2.81f, 2.81f);
        pathBuilder2.lineTo(1.39f, 4.22f);
        pathBuilder2.lineToRelative(7.32f, 7.32f);
        pathBuilder2.lineTo(3.0f, 17.25f);
        pathBuilder2.verticalLineTo(21.0f);
        pathBuilder2.horizontalLineToRelative(3.75f);
        pathBuilder2.lineToRelative(5.71f, -5.71f);
        pathBuilder2.lineToRelative(7.32f, 7.32f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(2.81f, 2.81f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.92f, 19.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineToRelative(-0.92f);
        pathBuilder2.lineToRelative(5.13f, -5.13f);
        pathBuilder2.lineToRelative(0.92f, 0.92f);
        pathBuilder2.lineTo(5.92f, 19.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
