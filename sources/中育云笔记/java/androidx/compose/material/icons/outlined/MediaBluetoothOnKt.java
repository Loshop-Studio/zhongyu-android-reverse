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
public final class MediaBluetoothOnKt {
    private static ImageVector _mediaBluetoothOn;

    public static final ImageVector getMediaBluetoothOn(Icons.Outlined outlined) {
        ImageVector imageVector = _mediaBluetoothOn;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MediaBluetoothOn", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 3.0f);
        pathBuilder.lineToRelative(0.01f, 10.55f);
        pathBuilder.curveToRelative(-0.6f, -0.34f, -1.28f, -0.55f, -2.0f, -0.55f);
        pathBuilder.curveTo(4.79f, 13.0f, 3.0f, 14.79f, 3.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, 4.0f, 4.01f, 4.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 19.21f, 11.0f, 17.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.43f);
        pathBuilder.lineTo(17.57f, 9.0f);
        pathBuilder.horizontalLineToRelative(-0.6f);
        pathBuilder.verticalLineToRelative(4.55f);
        pathBuilder.lineToRelative(-2.75f, -2.75f);
        pathBuilder.lineToRelative(-0.85f, 0.85f);
        pathBuilder.lineTo(16.73f, 15.0f);
        pathBuilder.lineToRelative(-3.35f, 3.35f);
        pathBuilder.lineToRelative(0.85f, 0.85f);
        pathBuilder.lineToRelative(2.75f, -2.75f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(0.6f);
        pathBuilder.lineTo(21.0f, 17.57f);
        pathBuilder.lineTo(18.42f, 15.0f);
        pathBuilder.lineTo(21.0f, 12.43f);
        pathBuilder.close();
        pathBuilder.moveTo(18.17f, 11.3f);
        pathBuilder.lineToRelative(1.13f, 1.13f);
        pathBuilder.lineToRelative(-1.13f, 1.13f);
        pathBuilder.verticalLineTo(11.3f);
        pathBuilder.close();
        pathBuilder.moveTo(19.3f, 17.57f);
        pathBuilder.lineToRelative(-1.13f, 1.13f);
        pathBuilder.verticalLineToRelative(-2.26f);
        pathBuilder.lineTo(19.3f, 17.57f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mediaBluetoothOn = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
