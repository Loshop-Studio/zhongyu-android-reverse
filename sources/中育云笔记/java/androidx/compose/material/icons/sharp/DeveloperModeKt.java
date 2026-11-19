package androidx.compose.material.icons.sharp;

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
public final class DeveloperModeKt {
    private static ImageVector _developerMode;

    public static final ImageVector getDeveloperMode(Icons.Sharp sharp) {
        ImageVector imageVector = _developerMode;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DeveloperMode", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(19.0f, 1.01f);
        pathBuilder.lineTo(5.0f, 1.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(7.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.41f, 16.59f);
        pathBuilder.lineTo(20.0f, 12.0f);
        pathBuilder.lineToRelative(-4.59f, -4.59f);
        pathBuilder.lineTo(14.0f, 8.83f);
        pathBuilder.lineTo(17.17f, 12.0f);
        pathBuilder.lineTo(14.0f, 15.17f);
        pathBuilder.lineToRelative(1.41f, 1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 15.17f);
        pathBuilder.lineTo(6.83f, 12.0f);
        pathBuilder.lineTo(10.0f, 8.83f);
        pathBuilder.lineTo(8.59f, 7.41f);
        pathBuilder.lineTo(4.0f, 12.0f);
        pathBuilder.lineToRelative(4.59f, 4.59f);
        pathBuilder.lineTo(10.0f, 15.17f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 19.0f);
        pathBuilder.lineTo(7.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(5.0f, 17.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _developerMode = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
