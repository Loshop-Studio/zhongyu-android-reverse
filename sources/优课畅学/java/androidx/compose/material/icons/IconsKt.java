package androidx.compose.material.icons;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    public static /* synthetic */ void getMaterialIconDimension$annotations() {
    }

    public static final ImageVector materialIcon(String str, boolean z10, InterfaceC10570l interfaceC10570l) {
        return ((ImageVector.Builder) interfaceC10570l.invoke(new ImageVector.Builder(str, C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, z10, 96, null))).build();
    }

    public static /* synthetic */ ImageVector materialIcon$default(String str, boolean z10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return ((ImageVector.Builder) interfaceC10570l.invoke(new ImageVector.Builder(str, C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, z10, 96, null))).build();
    }

    /* renamed from: materialPath-YwgOQQI, reason: not valid java name */
    public static final ImageVector.Builder m21708materialPathYwgOQQI(ImageVector.Builder builder, float f10, float f11, int i10, InterfaceC10570l interfaceC10570l) {
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC10570l.invoke(pathBuilder);
        return ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), i10, "", solidColor, f10, null, f11, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m21709materialPathYwgOQQI$default(ImageVector.Builder builder, float f10, float f11, int i10, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
        float f12 = (i11 & 1) != 0 ? 1.0f : f10;
        float f13 = (i11 & 2) != 0 ? 1.0f : f11;
        int defaultFillType = (i11 & 4) != 0 ? VectorKt.getDefaultFillType() : i10;
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC10570l.invoke(pathBuilder);
        return ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, f12, null, f13, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
