package androidx.compose.material.icons.rounded;

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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_layers", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Layers", "Landroidx/compose/material/icons/Icons$Rounded;", "getLayers", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLayers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layers.kt\nandroidx/compose/material/icons/rounded/LayersKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,60:1\n212#2,12:61\n233#2,18:74\n253#2:111\n174#3:73\n705#4,2:92\n717#4,2:94\n719#4,11:100\n72#5,4:96\n*S KotlinDebug\n*F\n+ 1 Layers.kt\nandroidx/compose/material/icons/rounded/LayersKt\n*L\n29#1:61,12\n30#1:74,18\n30#1:111\n29#1:73\n30#1:92,2\n30#1:94,2\n30#1:100,11\n30#1:96,4\n*E\n"})
/* loaded from: classes.dex */
public final class LayersKt {
    private static ImageVector _layers;

    public static final ImageVector getLayers(Icons.Rounded rounded) {
        ImageVector imageVector = _layers;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Layers", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.6f, 18.06f);
        pathBuilder.curveToRelative(-0.36f, 0.28f, -0.87f, 0.28f, -1.23f, 0.0f);
        pathBuilder.lineToRelative(-6.15f, -4.78f);
        pathBuilder.curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0.0f);
        pathBuilder.curveToRelative(-0.51f, 0.4f, -0.51f, 1.17f, 0.0f, 1.57f);
        pathBuilder.lineToRelative(6.76f, 5.26f);
        pathBuilder.curveToRelative(0.72f, 0.56f, 1.73f, 0.56f, 2.46f, 0.0f);
        pathBuilder.lineToRelative(6.76f, -5.26f);
        pathBuilder.curveToRelative(0.51f, -0.4f, 0.51f, -1.17f, 0.0f, -1.57f);
        pathBuilder.lineToRelative(-0.01f, -0.01f);
        pathBuilder.curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0.0f);
        pathBuilder.lineToRelative(-6.15f, 4.79f);
        pathBuilder.close();
        pathBuilder.moveTo(13.23f, 15.04f);
        pathBuilder.lineToRelative(6.76f, -5.26f);
        pathBuilder.curveToRelative(0.51f, -0.4f, 0.51f, -1.18f, 0.0f, -1.58f);
        pathBuilder.lineToRelative(-6.76f, -5.26f);
        pathBuilder.curveToRelative(-0.72f, -0.56f, -1.73f, -0.56f, -2.46f, 0.0f);
        pathBuilder.lineTo(4.01f, 8.21f);
        pathBuilder.curveToRelative(-0.51f, 0.4f, -0.51f, 1.18f, 0.0f, 1.58f);
        pathBuilder.lineToRelative(6.76f, 5.26f);
        pathBuilder.curveToRelative(0.72f, 0.56f, 1.74f, 0.56f, 2.46f, -0.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _layers = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
