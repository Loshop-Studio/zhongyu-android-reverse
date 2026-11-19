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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_cameraswitch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Cameraswitch", "Landroidx/compose/material/icons/Icons$Rounded;", "getCameraswitch", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCameraswitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cameraswitch.kt\nandroidx/compose/material/icons/rounded/CameraswitchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n72#5,4:117\n72#5,4:155\n72#5,4:193\n*S KotlinDebug\n*F\n+ 1 Cameraswitch.kt\nandroidx/compose/material/icons/rounded/CameraswitchKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n52#1:133,18\n52#1:170\n64#1:171,18\n64#1:208\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n52#1:151,2\n52#1:153,2\n52#1:159,11\n64#1:189,2\n64#1:191,2\n64#1:197,11\n30#1:117,4\n52#1:155,4\n64#1:193,4\n*E\n"})
/* loaded from: classes.dex */
public final class CameraswitchKt {
    private static ImageVector _cameraswitch;

    public static final ImageVector getCameraswitch(Icons.Rounded rounded) {
        ImageVector imageVector = _cameraswitch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cameraswitch", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m21435getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM21762getButtKaPHkGw = companion2.m21762getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM21772getBevelLxFBmk8 = companion3.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.lineToRelative(-1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineTo(9.0f, 7.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveTo(6.9f, 7.0f, 6.0f, 7.9f, 6.0f, 9.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveTo(18.0f, 7.9f, 17.1f, 7.0f, 16.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 14.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveTo(14.0f, 13.1f, 13.1f, 14.0f, 12.0f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw2 = companion2.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk82 = companion3.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.45f, 0.28f);
        pathBuilder2.curveTo(9.05f, 0.36f, 8.9f, 0.84f, 9.19f, 1.12f);
        pathBuilder2.lineToRelative(3.01f, 3.01f);
        pathBuilder2.curveToRelative(0.32f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f);
        pathBuilder2.verticalLineTo(2.04f);
        pathBuilder2.curveToRelative(4.45f, 0.44f, 8.06f, 3.82f, 8.84f, 8.17f);
        pathBuilder2.curveToRelative(0.08f, 0.46f, 0.5f, 0.78f, 0.97f, 0.78f);
        pathBuilder2.curveToRelative(0.62f, 0.0f, 1.09f, -0.57f, 0.98f, -1.18f);
        pathBuilder2.curveTo(22.61f, 2.89f, 15.79f, -1.12f, 9.45f, 0.28f);
        pathBuilder2.close();
        ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw2, iM21772getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw3 = companion2.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk83 = companion3.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(11.8f, 19.87f);
        pathBuilder3.curveToRelative(-0.32f, -0.32f, -0.85f, -0.09f, -0.85f, 0.35f);
        pathBuilder3.verticalLineToRelative(1.74f);
        pathBuilder3.curveToRelative(-4.45f, -0.44f, -8.06f, -3.82f, -8.84f, -8.17f);
        pathBuilder3.curveToRelative(-0.08f, -0.46f, -0.5f, -0.78f, -0.97f, -0.78f);
        pathBuilder3.curveToRelative(-0.62f, 0.0f, -1.09f, 0.57f, -0.98f, 1.18f);
        pathBuilder3.curveToRelative(1.24f, 6.92f, 8.06f, 10.93f, 14.4f, 9.53f);
        pathBuilder3.curveToRelative(0.39f, -0.09f, 0.55f, -0.56f, 0.26f, -0.85f);
        pathBuilder3.lineTo(11.8f, 19.87f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw3, iM21772getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cameraswitch = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
