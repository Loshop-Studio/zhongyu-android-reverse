package androidx.compose.material.icons.rounded;

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

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_nearMeDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NearMeDisabled", "Landroidx/compose/material/icons/Icons$Rounded;", "getNearMeDisabled", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNearMeDisabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearMeDisabled.kt\nandroidx/compose/material/icons/rounded/NearMeDisabledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,60:1\n212#2,12:61\n233#2,18:74\n253#2:111\n174#3:73\n705#4,2:92\n717#4,2:94\n719#4,11:100\n72#5,4:96\n*S KotlinDebug\n*F\n+ 1 NearMeDisabled.kt\nandroidx/compose/material/icons/rounded/NearMeDisabledKt\n*L\n29#1:61,12\n30#1:74,18\n30#1:111\n29#1:73\n30#1:92,2\n30#1:94,2\n30#1:100,11\n30#1:96,4\n*E\n"})
/* loaded from: classes.dex */
public final class NearMeDisabledKt {
    private static ImageVector _nearMeDisabled;

    public static final ImageVector getNearMeDisabled(Icons.Rounded rounded) {
        ImageVector imageVector = _nearMeDisabled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NearMeDisabled", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.34f);
        pathBuilder.lineToRelative(6.95f, -2.58f);
        pathBuilder.curveToRelative(0.8f, -0.3f, 1.58f, 0.48f, 1.29f, 1.29f);
        pathBuilder.lineTo(17.66f, 12.0f);
        pathBuilder.lineTo(12.0f, 6.34f);
        pathBuilder.close();
        pathBuilder.moveTo(21.9f, 19.07f);
        pathBuilder.lineTo(4.93f, 2.1f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(4.36f, 4.36f);
        pathBuilder.lineToRelative(-4.2f, 1.56f);
        pathBuilder.curveTo(3.27f, 9.59f, 3.0f, 9.97f, 3.0f, 10.4f);
        pathBuilder.curveToRelative(0.0f, 0.42f, 0.26f, 0.8f, 0.65f, 0.96f);
        pathBuilder.lineToRelative(6.42f, 2.57f);
        pathBuilder.lineToRelative(2.57f, 6.42f);
        pathBuilder.curveTo(12.8f, 20.74f, 13.18f, 21.0f, 13.6f, 21.0f);
        pathBuilder.curveToRelative(0.43f, 0.0f, 0.82f, -0.27f, 0.97f, -0.67f);
        pathBuilder.lineToRelative(1.56f, -4.2f);
        pathBuilder.lineToRelative(4.36f, 4.36f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveTo(22.29f, 20.09f, 22.29f, 19.46f, 21.9f, 19.07f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearMeDisabled = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
