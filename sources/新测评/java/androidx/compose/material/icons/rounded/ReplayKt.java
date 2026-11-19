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

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_replay", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Replay", "Landroidx/compose/material/icons/Icons$Rounded;", "getReplay", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nReplay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Replay.kt\nandroidx/compose/material/icons/rounded/ReplayKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,54:1\n212#2,12:55\n233#2,18:68\n253#2:105\n174#3:67\n705#4,2:86\n717#4,2:88\n719#4,11:94\n72#5,4:90\n*S KotlinDebug\n*F\n+ 1 Replay.kt\nandroidx/compose/material/icons/rounded/ReplayKt\n*L\n29#1:55,12\n30#1:68,18\n30#1:105\n29#1:67\n30#1:86,2\n30#1:88,2\n30#1:94,11\n30#1:90,4\n*E\n"})
/* loaded from: classes.dex */
public final class ReplayKt {
    private static ImageVector _replay;

    public static final ImageVector getReplay(Icons.Rounded rounded) {
        ImageVector imageVector = _replay;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Replay", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 5.0f);
        pathBuilder.verticalLineTo(2.21f);
        pathBuilder.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineToRelative(-3.8f, 3.79f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(3.79f, 3.79f);
        pathBuilder.curveToRelative(0.32f, 0.31f, 0.86f, 0.09f, 0.86f, -0.36f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(3.73f, 0.0f, 6.68f, 3.42f, 5.86f, 7.29f);
        pathBuilder.curveToRelative(-0.47f, 2.27f, -2.31f, 4.1f, -4.57f, 4.57f);
        pathBuilder.curveToRelative(-3.57f, 0.75f, -6.75f, -1.7f, -7.23f, -5.01f);
        pathBuilder.curveToRelative(-0.07f, -0.48f, -0.49f, -0.85f, -0.98f, -0.85f);
        pathBuilder.curveToRelative(-0.6f, 0.0f, -1.08f, 0.53f, -1.0f, 1.13f);
        pathBuilder.curveToRelative(0.62f, 4.39f, 4.8f, 7.64f, 9.53f, 6.72f);
        pathBuilder.curveToRelative(3.12f, -0.61f, 5.63f, -3.12f, 6.24f, -6.24f);
        pathBuilder.curveTo(20.84f, 9.48f, 16.94f, 5.0f, 12.0f, 5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _replay = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
