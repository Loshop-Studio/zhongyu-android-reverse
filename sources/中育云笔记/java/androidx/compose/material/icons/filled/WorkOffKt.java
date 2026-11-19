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
public final class WorkOffKt {
    private static ImageVector _workOff;

    public static final ImageVector getWorkOff(Icons.Filled filled) {
        ImageVector imageVector = _workOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WorkOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 21.74f);
        pathBuilder.lineToRelative(-1.46f, -1.46f);
        pathBuilder.lineTo(7.21f, 5.95f);
        pathBuilder.lineTo(3.25f, 1.99f);
        pathBuilder.lineTo(1.99f, 3.25f);
        pathBuilder.lineToRelative(2.7f, 2.7f);
        pathBuilder.horizontalLineToRelative(-0.64f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        pathBuilder.lineToRelative(-0.01f, 11.0f);
        pathBuilder.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(15.64f);
        pathBuilder.lineTo(21.74f, 23.0f);
        pathBuilder.lineTo(23.0f, 21.74f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 7.95f);
        pathBuilder.curveToRelative(0.05f, -1.11f, -0.84f, -2.0f, -1.95f, -1.95f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineTo(3.95f);
        pathBuilder.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -1.95f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(-1.11f, -0.05f, -2.0f, 0.84f, -2.0f, 1.95f);
        pathBuilder.verticalLineToRelative(0.32f);
        pathBuilder.lineToRelative(13.95f, 14.0f);
        pathBuilder.verticalLineTo(7.95f);
        pathBuilder.close();
        pathBuilder.moveTo(14.05f, 6.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.verticalLineTo(3.95f);
        pathBuilder.horizontalLineToRelative(4.05f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
