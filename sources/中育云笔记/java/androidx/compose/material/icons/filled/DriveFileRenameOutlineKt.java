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
public final class DriveFileRenameOutlineKt {
    private static ImageVector _driveFileRenameOutline;

    public static final ImageVector getDriveFileRenameOutline(Icons.Filled filled) {
        ImageVector imageVector = _driveFileRenameOutline;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DriveFileRenameOutline", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.41f, 5.8f);
        pathBuilder.lineTo(17.2f, 4.59f);
        pathBuilder.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilder.lineToRelative(-2.68f, 2.68f);
        pathBuilder.lineTo(3.0f, 15.96f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(4.04f);
        pathBuilder.lineToRelative(8.74f, -8.74f);
        pathBuilder.lineToRelative(2.63f, -2.63f);
        pathBuilder.curveToRelative(0.79f, -0.78f, 0.79f, -2.05f, 0.0f, -2.83f);
        pathBuilder.close();
        pathBuilder.moveTo(6.21f, 18.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-1.21f);
        pathBuilder.lineToRelative(8.66f, -8.66f);
        pathBuilder.lineToRelative(1.21f, 1.21f);
        pathBuilder.lineTo(6.21f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 20.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _driveFileRenameOutline = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
