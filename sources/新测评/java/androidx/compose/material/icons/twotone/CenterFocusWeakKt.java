package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3127Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_centerFocusWeak", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CenterFocusWeak", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCenterFocusWeak", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCenterFocusWeak.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CenterFocusWeak.kt\nandroidx/compose/material/icons/twotone/CenterFocusWeakKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n233#2,18:145\n253#2:182\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n705#4,2:163\n717#4,2:165\n719#4,11:171\n72#5,4:129\n72#5,4:167\n*S KotlinDebug\n*F\n+ 1 CenterFocusWeak.kt\nandroidx/compose/material/icons/twotone/CenterFocusWeakKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n38#1:145,18\n38#1:182\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n38#1:163,2\n38#1:165,2\n38#1:171,11\n30#1:129,4\n38#1:167,4\n*E\n"})
/* loaded from: classes2.dex */
public final class CenterFocusWeakKt {
    private static ImageVector _centerFocusWeak;

    public static final ImageVector getCenterFocusWeak(Icons.TwoTone twoTone) {
        ImageVector imageVector = _centerFocusWeak;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CenterFocusWeak", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m21002getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM21329getButtKaPHkGw = companion2.m21329getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM21339getBevelLxFBmk8 = companion3.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 10.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw2 = companion2.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk82 = companion3.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(3.0f, 19.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.lineTo(5.0f, 19.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.lineTo(3.0f, 15.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(3.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineTo(5.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.lineTo(9.0f, 3.0f);
        pathBuilder2.lineTo(5.0f, 3.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 8.0f);
        pathBuilder2.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 14.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.0f, 5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineTo(21.0f, 5.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 19.0f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw2, iM21339getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _centerFocusWeak = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
