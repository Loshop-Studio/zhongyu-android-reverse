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
public final class ContactMailKt {
    private static ImageVector _contactMail;

    public static final ImageVector getContactMail(Icons.Outlined outlined) {
        ImageVector imageVector = _contactMail;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ContactMail", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 3.0f);
        pathBuilder.lineTo(2.0f, 3.0f);
        pathBuilder.curveTo(0.9f, 3.0f, 0.0f, 3.9f, 0.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilder.lineTo(24.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 19.0f);
        pathBuilder.lineTo(2.0f, 19.0f);
        pathBuilder.lineTo(2.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.lineTo(21.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 8.0f);
        pathBuilder.lineToRelative(-2.5f, 1.75f);
        pathBuilder.lineTo(15.0f, 8.0f);
        pathBuilder.lineTo(15.0f, 7.0f);
        pathBuilder.lineToRelative(2.5f, 1.75f);
        pathBuilder.lineTo(20.0f, 7.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 12.0f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 8.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 16.59f);
        pathBuilder.curveToRelative(0.0f, -2.5f, -3.97f, -3.58f, -6.0f, -3.58f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, 1.08f, -6.0f, 3.58f);
        pathBuilder.lineTo(3.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(-1.41f);
        pathBuilder.close();
        pathBuilder.moveTo(5.48f, 16.0f);
        pathBuilder.curveToRelative(0.74f, -0.5f, 2.22f, -1.0f, 3.52f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(2.77f, 0.49f, 3.52f, 1.0f);
        pathBuilder.lineTo(5.48f, 16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactMail = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
