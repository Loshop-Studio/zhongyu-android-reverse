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
public final class CardGiftcardKt {
    private static ImageVector _cardGiftcard;

    public static final ImageVector getCardGiftcard(Icons.Sharp sharp) {
        ImageVector imageVector = _cardGiftcard;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CardGiftcard", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(-4.18f);
        pathBuilder.curveToRelative(0.11f, -0.31f, 0.18f, -0.65f, 0.18f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(-1.05f, 0.0f, -1.96f, 0.54f, -2.5f, 1.35f);
        pathBuilder.lineToRelative(-0.5f, 0.67f);
        pathBuilder.lineToRelative(-0.5f, -0.68f);
        pathBuilder.curveTo(10.96f, 2.54f, 10.05f, 2.0f, 9.0f, 2.0f);
        pathBuilder.curveTo(7.34f, 2.0f, 6.0f, 3.34f, 6.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 0.35f, 0.07f, 0.69f, 0.18f, 1.0f);
        pathBuilder.lineTo(2.01f, 6.0f);
        pathBuilder.verticalLineToRelative(15.0f);
        pathBuilder.lineTo(22.0f, 21.0f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 19.0f);
        pathBuilder.lineTo(4.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 14.0f);
        pathBuilder.lineTo(4.0f, 14.0f);
        pathBuilder.lineTo(4.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(5.08f);
        pathBuilder.lineTo(7.0f, 10.83f);
        pathBuilder.lineTo(8.62f, 12.0f);
        pathBuilder.lineTo(12.0f, 7.4f);
        pathBuilder.lineToRelative(3.38f, 4.6f);
        pathBuilder.lineTo(17.0f, 10.83f);
        pathBuilder.lineTo(14.92f, 8.0f);
        pathBuilder.lineTo(20.0f, 8.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cardGiftcard = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
