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
public final class AutoAwesomeKt {
    private static ImageVector _autoAwesome;

    public static final ImageVector getAutoAwesome(Icons.Sharp sharp) {
        ImageVector imageVector = _autoAwesome;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AutoAwesome", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 9.0f);
        pathBuilder.lineToRelative(1.25f, -2.75f);
        pathBuilder.lineTo(23.0f, 5.0f);
        pathBuilder.lineToRelative(-2.75f, -1.25f);
        pathBuilder.lineTo(19.0f, 1.0f);
        pathBuilder.lineToRelative(-1.25f, 2.75f);
        pathBuilder.lineTo(15.0f, 5.0f);
        pathBuilder.lineToRelative(2.75f, 1.25f);
        pathBuilder.lineTo(19.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 9.5f);
        pathBuilder.lineTo(9.0f, 4.0f);
        pathBuilder.lineTo(6.5f, 9.5f);
        pathBuilder.lineTo(1.0f, 12.0f);
        pathBuilder.lineToRelative(5.5f, 2.5f);
        pathBuilder.lineTo(9.0f, 20.0f);
        pathBuilder.lineToRelative(2.5f, -5.5f);
        pathBuilder.lineTo(17.0f, 12.0f);
        pathBuilder.lineTo(11.5f, 9.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 15.0f);
        pathBuilder.lineToRelative(-1.25f, 2.75f);
        pathBuilder.lineTo(15.0f, 19.0f);
        pathBuilder.lineToRelative(2.75f, 1.25f);
        pathBuilder.lineTo(19.0f, 23.0f);
        pathBuilder.lineToRelative(1.25f, -2.75f);
        pathBuilder.lineTo(23.0f, 19.0f);
        pathBuilder.lineToRelative(-2.75f, -1.25f);
        pathBuilder.lineTo(19.0f, 15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoAwesome = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
