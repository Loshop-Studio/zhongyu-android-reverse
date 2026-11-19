package androidx.compose.material.icons.automirrored.rounded;

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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_rotateLeft", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RotateLeft", "Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;", "getRotateLeft", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRotateLeft.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotateLeft.kt\nandroidx/compose/material/icons/automirrored/rounded/RotateLeftKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n223#2:82\n216#2,3:83\n219#2,4:87\n233#2,18:91\n253#2:128\n174#3:86\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 RotateLeft.kt\nandroidx/compose/material/icons/automirrored/rounded/RotateLeftKt\n*L\n29#1:82\n29#1:83,3\n29#1:87,4\n30#1:91,18\n30#1:128\n29#1:86\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"})
/* loaded from: classes.dex */
public final class RotateLeftKt {
    private static ImageVector _rotateLeft;

    public static final ImageVector getRotateLeft(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _rotateLeft;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.RotateLeft", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.56f, 7.98f);
        pathBuilder.curveTo(6.1f, 7.52f, 5.31f, 7.6f, 5.0f, 8.17f);
        pathBuilder.curveToRelative(-0.28f, 0.51f, -0.5f, 1.03f, -0.67f, 1.58f);
        pathBuilder.curveToRelative(-0.19f, 0.63f, 0.31f, 1.25f, 0.96f, 1.25f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.43f, 0.0f, 0.82f, -0.28f, 0.94f, -0.7f);
        pathBuilder.curveToRelative(0.12f, -0.4f, 0.28f, -0.79f, 0.48f, -1.17f);
        pathBuilder.curveToRelative(0.22f, -0.37f, 0.15f, -0.84f, -0.16f, -1.15f);
        pathBuilder.close();
        pathBuilder.moveTo(5.31f, 13.0f);
        pathBuilder.horizontalLineToRelative(-0.02f);
        pathBuilder.curveToRelative(-0.65f, 0.0f, -1.15f, 0.62f, -0.96f, 1.25f);
        pathBuilder.curveToRelative(0.16f, 0.54f, 0.38f, 1.07f, 0.66f, 1.58f);
        pathBuilder.curveToRelative(0.31f, 0.57f, 1.11f, 0.66f, 1.57f, 0.2f);
        pathBuilder.curveToRelative(0.3f, -0.31f, 0.38f, -0.77f, 0.17f, -1.15f);
        pathBuilder.curveToRelative(-0.2f, -0.37f, -0.36f, -0.76f, -0.48f, -1.16f);
        pathBuilder.curveToRelative(-0.12f, -0.44f, -0.51f, -0.72f, -0.94f, -0.72f);
        pathBuilder.close();
        pathBuilder.moveTo(8.16f, 19.02f);
        pathBuilder.curveToRelative(0.51f, 0.28f, 1.04f, 0.5f, 1.59f, 0.66f);
        pathBuilder.curveToRelative(0.62f, 0.18f, 1.24f, -0.32f, 1.24f, -0.96f);
        pathBuilder.verticalLineToRelative(-0.03f);
        pathBuilder.curveToRelative(0.0f, -0.43f, -0.28f, -0.82f, -0.7f, -0.94f);
        pathBuilder.curveToRelative(-0.4f, -0.12f, -0.78f, -0.28f, -1.15f, -0.48f);
        pathBuilder.curveToRelative(-0.38f, -0.21f, -0.86f, -0.14f, -1.16f, 0.17f);
        pathBuilder.lineToRelative(-0.03f, 0.03f);
        pathBuilder.curveToRelative(-0.45f, 0.45f, -0.36f, 1.24f, 0.21f, 1.55f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 4.07f);
        pathBuilder.verticalLineToRelative(-0.66f);
        pathBuilder.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        pathBuilder.lineTo(9.17f, 4.83f);
        pathBuilder.curveToRelative(-0.4f, 0.4f, -0.4f, 1.04f, 0.0f, 1.43f);
        pathBuilder.lineToRelative(2.13f, 2.08f);
        pathBuilder.curveToRelative(0.63f, 0.62f, 1.7f, 0.17f, 1.7f, -0.72f);
        pathBuilder.lineTo(13.0f, 6.09f);
        pathBuilder.curveToRelative(2.84f, 0.48f, 5.0f, 2.94f, 5.0f, 5.91f);
        pathBuilder.curveToRelative(0.0f, 2.73f, -1.82f, 5.02f, -4.32f, 5.75f);
        pathBuilder.curveToRelative(-0.41f, 0.12f, -0.68f, 0.51f, -0.68f, 0.94f);
        pathBuilder.verticalLineToRelative(0.02f);
        pathBuilder.curveToRelative(0.0f, 0.65f, 0.61f, 1.14f, 1.23f, 0.96f);
        pathBuilder.curveTo(17.57f, 18.71f, 20.0f, 15.64f, 20.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -4.08f, -3.05f, -7.44f, -7.0f, -7.93f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotateLeft = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
