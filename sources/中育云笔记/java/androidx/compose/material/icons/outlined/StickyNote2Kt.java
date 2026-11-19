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
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class StickyNote2Kt {
    private static ImageVector _stickyNote2;

    public static final ImageVector getStickyNote2(Icons.Outlined outlined) {
        ImageVector imageVector = _stickyNote2;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.StickyNote2", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 5.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.lineToRelative(-5.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.lineToRelative(6.0f, -6.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 14.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 10.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stickyNote2 = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getStickyNote2$annotations(Icons.Outlined outlined) {
    }
}
