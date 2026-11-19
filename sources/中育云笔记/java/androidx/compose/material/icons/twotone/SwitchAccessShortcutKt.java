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
public final class SwitchAccessShortcutKt {
    private static ImageVector _switchAccessShortcut;

    public static final ImageVector getSwitchAccessShortcut(Icons.TwoTone twoTone) {
        ImageVector imageVector = _switchAccessShortcut;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SwitchAccessShortcut", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.06f, 8.94f);
        pathBuilder.lineTo(5.0f, 8.0f);
        pathBuilder.lineToRelative(2.06f, -0.94f);
        pathBuilder.lineTo(8.0f, 5.0f);
        pathBuilder.lineToRelative(0.94f, 2.06f);
        pathBuilder.lineTo(11.0f, 8.0f);
        pathBuilder.lineTo(8.94f, 8.94f);
        pathBuilder.lineTo(8.0f, 11.0f);
        pathBuilder.lineTo(7.06f, 8.94f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 21.0f);
        pathBuilder.lineToRelative(0.94f, -2.06f);
        pathBuilder.lineTo(11.0f, 18.0f);
        pathBuilder.lineToRelative(-2.06f, -0.94f);
        pathBuilder.lineTo(8.0f, 15.0f);
        pathBuilder.lineToRelative(-0.94f, 2.06f);
        pathBuilder.lineTo(5.0f, 18.0f);
        pathBuilder.lineToRelative(2.06f, 0.94f);
        pathBuilder.lineTo(8.0f, 21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.37f, 12.37f);
        pathBuilder.lineTo(3.0f, 13.0f);
        pathBuilder.lineToRelative(1.37f, 0.63f);
        pathBuilder.lineTo(5.0f, 15.0f);
        pathBuilder.lineToRelative(0.63f, -1.37f);
        pathBuilder.lineTo(7.0f, 13.0f);
        pathBuilder.lineToRelative(-1.37f, -0.63f);
        pathBuilder.lineTo(5.0f, 11.0f);
        pathBuilder.lineTo(4.37f, 12.37f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.73f, 1.08f, -5.27f, 2.75f, -7.25f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.lineToRelative(-2.82f, -2.82f);
        pathBuilder.curveTo(14.84f, 7.82f, 14.0f, 9.88f, 14.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.32f, 2.1f, 6.36f, 5.0f, 7.82f);
        pathBuilder.lineTo(19.0f, 22.0f);
        pathBuilder.curveTo(14.91f, 20.41f, 12.0f, 16.35f, 12.0f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchAccessShortcut = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
