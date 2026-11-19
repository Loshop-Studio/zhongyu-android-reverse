package androidx.compose.material.icons.filled;

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

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_runningWithErrors", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RunningWithErrors", "Landroidx/compose/material/icons/Icons$Filled;", "getRunningWithErrors", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRunningWithErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningWithErrors.kt\nandroidx/compose/material/icons/filled/RunningWithErrorsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,61:1\n212#2,12:62\n233#2,18:75\n253#2:112\n174#3:74\n705#4,2:93\n717#4,2:95\n719#4,11:101\n72#5,4:97\n*S KotlinDebug\n*F\n+ 1 RunningWithErrors.kt\nandroidx/compose/material/icons/filled/RunningWithErrorsKt\n*L\n29#1:62,12\n30#1:75,18\n30#1:112\n29#1:74\n30#1:93,2\n30#1:95,2\n30#1:101,11\n30#1:97,4\n*E\n"})
/* loaded from: classes.dex */
public final class RunningWithErrorsKt {
    private static ImageVector _runningWithErrors;

    public static final ImageVector getRunningWithErrors(Icons.Filled filled) {
        ImageVector imageVector = _runningWithErrors;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RunningWithErrors", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 10.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 20.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 17.29f);
        pathBuilder.curveTo(16.53f, 18.95f, 14.39f, 20.0f, 12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.lineToRelative(7.55f, -7.55f);
        pathBuilder.curveTo(17.72f, 3.34f, 15.02f, 2.0f, 12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.curveToRelative(2.25f, 0.0f, 4.33f, -0.74f, 6.0f, -2.0f);
        pathBuilder.verticalLineTo(17.29f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _runningWithErrors = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
