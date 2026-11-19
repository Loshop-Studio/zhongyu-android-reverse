package androidx.compose.material.icons.automirrored.rounded;

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
public final class InsertDriveFileKt {
    private static ImageVector _insertDriveFile;

    public static final ImageVector getInsertDriveFile(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _insertDriveFile;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.InsertDriveFile", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 2.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder.lineTo(4.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilder.lineTo(18.0f, 22.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(20.0f, 8.83f);
        pathBuilder.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        pathBuilder.lineToRelative(-4.83f, -4.83f);
        pathBuilder.curveToRelative(-0.37f, -0.38f, -0.88f, -0.59f, -1.41f, -0.59f);
        pathBuilder.lineTo(6.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 8.0f);
        pathBuilder.lineTo(13.0f, 3.5f);
        pathBuilder.lineTo(18.5f, 9.0f);
        pathBuilder.lineTo(14.0f, 9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _insertDriveFile = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
