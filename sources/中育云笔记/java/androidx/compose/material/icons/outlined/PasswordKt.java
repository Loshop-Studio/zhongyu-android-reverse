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
public final class PasswordKt {
    private static ImageVector _password;

    public static final ImageVector getPassword(Icons.Outlined outlined) {
        ImageVector imageVector = _password;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Password", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.15f, 12.95f);
        pathBuilder.lineTo(4.0f, 11.47f);
        pathBuilder.lineToRelative(0.85f, 1.48f);
        pathBuilder.lineToRelative(1.3f, -0.75f);
        pathBuilder.lineTo(5.3f, 10.72f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.horizontalLineTo(5.3f);
        pathBuilder.lineToRelative(0.85f, -1.47f);
        pathBuilder.lineTo(4.85f, 7.0f);
        pathBuilder.lineTo(4.0f, 8.47f);
        pathBuilder.lineTo(3.15f, 7.0f);
        pathBuilder.lineToRelative(-1.3f, 0.75f);
        pathBuilder.lineTo(2.7f, 9.22f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(1.7f);
        pathBuilder.lineTo(1.85f, 12.2f);
        pathBuilder.lineTo(3.15f, 12.95f);
        pathBuilder.close();
        pathBuilder.moveTo(9.85f, 12.2f);
        pathBuilder.lineToRelative(1.3f, 0.75f);
        pathBuilder.lineTo(12.0f, 11.47f);
        pathBuilder.lineToRelative(0.85f, 1.48f);
        pathBuilder.lineToRelative(1.3f, -0.75f);
        pathBuilder.lineToRelative(-0.85f, -1.48f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.horizontalLineToRelative(-1.7f);
        pathBuilder.lineToRelative(0.85f, -1.47f);
        pathBuilder.lineTo(12.85f, 7.0f);
        pathBuilder.lineTo(12.0f, 8.47f);
        pathBuilder.lineTo(11.15f, 7.0f);
        pathBuilder.lineToRelative(-1.3f, 0.75f);
        pathBuilder.lineToRelative(0.85f, 1.47f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(1.7f);
        pathBuilder.lineTo(9.85f, 12.2f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 9.22f);
        pathBuilder.horizontalLineToRelative(-1.7f);
        pathBuilder.lineToRelative(0.85f, -1.47f);
        pathBuilder.lineTo(20.85f, 7.0f);
        pathBuilder.lineTo(20.0f, 8.47f);
        pathBuilder.lineTo(19.15f, 7.0f);
        pathBuilder.lineToRelative(-1.3f, 0.75f);
        pathBuilder.lineToRelative(0.85f, 1.47f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(1.7f);
        pathBuilder.lineToRelative(-0.85f, 1.48f);
        pathBuilder.lineToRelative(1.3f, 0.75f);
        pathBuilder.lineTo(20.0f, 11.47f);
        pathBuilder.lineToRelative(0.85f, 1.48f);
        pathBuilder.lineToRelative(1.3f, -0.75f);
        pathBuilder.lineToRelative(-0.85f, -1.48f);
        pathBuilder.horizontalLineTo(23.0f);
        pathBuilder.verticalLineTo(9.22f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _password = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
