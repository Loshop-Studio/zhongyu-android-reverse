package androidx.compose.material.icons;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    public static /* synthetic */ void getMaterialIconDimension$annotations() {
    }

    public static final ImageVector materialIcon(String str, boolean z10, InterfaceC9540l interfaceC9540l) {
        return ((ImageVector.Builder) interfaceC9540l.invoke(new ImageVector.Builder(str, C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, z10, 96, null))).build();
    }

    public static /* synthetic */ ImageVector materialIcon$default(String str, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return ((ImageVector.Builder) interfaceC9540l.invoke(new ImageVector.Builder(str, C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, z10, 96, null))).build();
    }

    /* renamed from: materialPath-YwgOQQI, reason: not valid java name */
    public static final ImageVector.Builder m28310materialPathYwgOQQI(ImageVector.Builder builder, float f10, float f11, int i10, InterfaceC9540l interfaceC9540l) {
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC9540l.invoke(pathBuilder);
        return ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), i10, "", solidColor, f10, null, f11, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m28311materialPathYwgOQQI$default(ImageVector.Builder builder, float f10, float f11, int i10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        float f12 = (i11 & 1) != 0 ? 1.0f : f10;
        float f13 = (i11 & 2) != 0 ? 1.0f : f11;
        int defaultFillType = (i11 & 4) != 0 ? VectorKt.getDefaultFillType() : i10;
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC9540l.invoke(pathBuilder);
        return ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, f12, null, f13, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
