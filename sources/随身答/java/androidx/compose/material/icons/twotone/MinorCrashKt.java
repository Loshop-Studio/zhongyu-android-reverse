package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.SolidColor;
import androidx.compose.p012ui.graphics.StrokeCap;
import androidx.compose.p012ui.graphics.StrokeJoin;
import androidx.compose.p012ui.graphics.vector.ImageVector;
import androidx.compose.p012ui.graphics.vector.PathBuilder;
import androidx.compose.p012ui.graphics.vector.VectorKt;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_minorCrash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MinorCrash", "Landroidx/compose/material/icons/Icons$TwoTone;", "getMinorCrash", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMinorCrash.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinorCrash.kt\nandroidx/compose/material/icons/twotone/MinorCrashKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,117:1\n212#2,12:118\n233#2,18:131\n253#2:168\n233#2,18:169\n253#2:206\n174#3:130\n705#4,2:149\n717#4,2:151\n719#4,11:157\n705#4,2:187\n717#4,2:189\n719#4,11:195\n72#5,4:153\n72#5,4:191\n*S KotlinDebug\n*F\n+ 1 MinorCrash.kt\nandroidx/compose/material/icons/twotone/MinorCrashKt\n*L\n29#1:118,12\n30#1:131,18\n30#1:168\n50#1:169,18\n50#1:206\n29#1:130\n30#1:149,2\n30#1:151,2\n30#1:157,11\n50#1:187,2\n50#1:189,2\n50#1:195,11\n30#1:153,4\n50#1:191,4\n*E\n"})
/* loaded from: classes2.dex */
public final class MinorCrashKt {
    private static ImageVector _minorCrash;

    public static final ImageVector getMinorCrash(Icons.TwoTone twoTone) {
        ImageVector imageVector = _minorCrash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MinorCrash", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m21435getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM21762getButtKaPHkGw = companion2.m21762getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM21772getBevelLxFBmk8 = companion3.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 15.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 19.0f);
        pathBuilder.curveTo(6.67f, 19.0f, 6.0f, 18.33f, 6.0f, 17.5f);
        pathBuilder.reflectiveCurveTo(6.67f, 16.0f, 7.5f, 16.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 16.67f, 9.0f, 17.5f);
        pathBuilder.reflectiveCurveTo(8.33f, 19.0f, 7.5f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 19.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(17.33f, 19.0f, 16.5f, 19.0f);
        pathBuilder.close();
        ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw2 = companion2.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk82 = companion3.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.41f, 5.0f);
        pathBuilder2.lineTo(8.0f, 6.41f);
        pathBuilder2.lineToRelative(-3.0f, -3.0f);
        pathBuilder2.lineTo(6.41f, 2.0f);
        pathBuilder2.lineTo(9.41f, 5.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 3.41f);
        pathBuilder2.lineTo(17.59f, 2.0f);
        pathBuilder2.lineToRelative(-3.0f, 3.0f);
        pathBuilder2.lineTo(16.0f, 6.41f);
        pathBuilder2.lineTo(19.0f, 3.41f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 0.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.0f, 15.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineToRelative(1.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.lineToRelative(2.08f, -5.99f);
        pathBuilder2.curveTo(5.29f, 8.42f, 5.84f, 8.0f, 6.5f, 8.0f);
        pathBuilder2.horizontalLineToRelative(11.0f);
        pathBuilder2.curveToRelative(0.66f, 0.0f, 1.22f, 0.42f, 1.42f, 1.01f);
        pathBuilder2.lineTo(21.0f, 15.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.81f, 13.0f);
        pathBuilder2.horizontalLineToRelative(12.38f);
        pathBuilder2.lineToRelative(-1.04f, -3.0f);
        pathBuilder2.horizontalLineTo(6.85f);
        pathBuilder2.lineTo(5.81f, 13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 15.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.verticalLineTo(15.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.5f, 19.0f);
        pathBuilder2.curveTo(8.33f, 19.0f, 9.0f, 18.33f, 9.0f, 17.5f);
        pathBuilder2.reflectiveCurveTo(8.33f, 16.0f, 7.5f, 16.0f);
        pathBuilder2.reflectiveCurveTo(6.0f, 16.67f, 6.0f, 17.5f);
        pathBuilder2.reflectiveCurveTo(6.67f, 19.0f, 7.5f, 19.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.5f, 19.0f);
        pathBuilder2.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder2.reflectiveCurveTo(17.33f, 16.0f, 16.5f, 16.0f);
        pathBuilder2.reflectiveCurveTo(15.0f, 16.67f, 15.0f, 17.5f);
        pathBuilder2.reflectiveCurveTo(15.67f, 19.0f, 16.5f, 19.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw2, iM21772getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _minorCrash = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
