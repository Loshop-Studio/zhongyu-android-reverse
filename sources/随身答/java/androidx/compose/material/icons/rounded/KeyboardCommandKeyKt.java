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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_keyboardCommandKey", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardCommandKey", "Landroidx/compose/material/icons/Icons$Rounded;", "getKeyboardCommandKey", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nKeyboardCommandKey.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardCommandKey.kt\nandroidx/compose/material/icons/rounded/KeyboardCommandKeyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n72#5,4:139\n*S KotlinDebug\n*F\n+ 1 KeyboardCommandKey.kt\nandroidx/compose/material/icons/rounded/KeyboardCommandKeyKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n30#1:139,4\n*E\n"})
/* loaded from: classes.dex */
public final class KeyboardCommandKeyKt {
    private static ImageVector _keyboardCommandKey;

    public static final ImageVector getKeyboardCommandKey(Icons.Rounded rounded) {
        ImageVector imageVector = _keyboardCommandKey;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.KeyboardCommandKey", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.5f, 3.0f);
        pathBuilder.curveTo(15.57f, 3.0f, 14.0f, 4.57f, 14.0f, 6.5f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveTo(10.0f, 4.57f, 8.43f, 3.0f, 6.5f, 3.0f);
        pathBuilder.reflectiveCurveTo(3.0f, 4.57f, 3.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(4.57f, 10.0f, 6.5f, 10.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(6.5f);
        pathBuilder.curveTo(4.57f, 14.0f, 3.0f, 15.57f, 3.0f, 17.5f);
        pathBuilder.reflectiveCurveTo(4.57f, 21.0f, 6.5f, 21.0f);
        pathBuilder.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(19.43f, 14.0f, 17.5f, 14.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(19.43f, 3.0f, 17.5f, 3.0f);
        pathBuilder.lineTo(17.5f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 8.0f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveTo(16.0f, 5.67f, 16.67f, 5.0f, 17.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(19.0f, 5.67f, 19.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(18.33f, 8.0f, 17.5f, 8.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.lineTo(16.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 8.0f);
        pathBuilder.curveTo(5.67f, 8.0f, 5.0f, 7.33f, 5.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(5.67f, 5.0f, 6.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 5.67f, 8.0f, 6.5f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(6.5f);
        pathBuilder.lineTo(6.5f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.lineTo(10.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 19.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(18.33f, 19.0f, 17.5f, 19.0f);
        pathBuilder.lineTo(17.5f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 19.0f);
        pathBuilder.curveTo(5.67f, 19.0f, 5.0f, 18.33f, 5.0f, 17.5f);
        pathBuilder.reflectiveCurveTo(5.67f, 16.0f, 6.5f, 16.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveTo(8.0f, 18.33f, 7.33f, 19.0f, 6.5f, 19.0f);
        pathBuilder.lineTo(6.5f, 19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardCommandKey = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
