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
public final class NoteAltKt {
    private static ImageVector _noteAlt;

    public static final ImageVector getNoteAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _noteAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoteAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-4.18f);
        pathBuilder.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 2.75f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(12.41f, 4.25f, 12.0f, 4.25f);
        pathBuilder.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.reflectiveCurveTo(11.59f, 2.75f, 12.0f, 2.75f);
        pathBuilder.close();
        pathBuilder.moveTo(8.9f, 17.0f);
        pathBuilder.horizontalLineTo(7.5f);
        pathBuilder.curveTo(7.22f, 17.0f, 7.0f, 16.78f, 7.0f, 16.5f);
        pathBuilder.verticalLineToRelative(-1.43f);
        pathBuilder.curveToRelative(0.0f, -0.13f, 0.05f, -0.26f, 0.15f, -0.35f);
        pathBuilder.lineToRelative(5.81f, -5.81f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.lineToRelative(-5.83f, 5.83f);
        pathBuilder.curveTo(9.16f, 16.95f, 9.03f, 17.0f, 8.9f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.85f, 9.27f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineToRelative(-2.12f, -2.12f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.curveTo(17.05f, 8.76f, 17.05f, 9.07f, 16.85f, 9.27f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noteAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
