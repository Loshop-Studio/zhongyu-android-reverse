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
public final class RsvpKt {
    private static ImageVector _rsvp;

    public static final ImageVector getRsvp(Icons.Outlined outlined) {
        ImageVector imageVector = _rsvp;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Rsvp", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.lineToRelative(-1.75f, 6.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.lineTo(12.5f, 9.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.lineToRelative(1.0f, 3.43f);
        pathBuilder.lineTo(16.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.1f, 12.9f);
        pathBuilder.lineTo(6.0f, 15.0f);
        pathBuilder.horizontalLineTo(4.5f);
        pathBuilder.lineToRelative(-0.85f, -2.0f);
        pathBuilder.horizontalLineTo(2.5f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.curveTo(5.35f, 9.0f, 6.0f, 9.65f, 6.0f, 10.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveTo(6.0f, 12.1f, 5.6f, 12.65f, 5.1f, 12.9f);
        pathBuilder.close();
        pathBuilder.moveTo(4.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.close();
        pathBuilder.moveTo(21.5f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveTo(23.0f, 12.33f, 22.33f, 13.0f, 21.5f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 9.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(0.75f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-0.75f);
        pathBuilder.horizontalLineTo(7.75f);
        pathBuilder.curveTo(7.34f, 12.75f, 7.0f, 12.41f, 7.0f, 12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineTo(11.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rsvp = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
