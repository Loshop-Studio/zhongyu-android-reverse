package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import java.util.ArrayList;
import java.util.List;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class ImageVectorKt {
    public static final ImageVector.Builder group(ImageVector.Builder builder, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends PathNode> list, InterfaceC10570l interfaceC10570l) {
        builder.addGroup(str, f10, f11, f12, f13, f14, f15, f16, list);
        interfaceC10570l.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        builder.addGroup(str2, f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) != 0 ? 1.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & 256) != 0 ? VectorKt.getEmptyPath() : list);
        interfaceC10570l.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* renamed from: path-R_LF-3I, reason: not valid java name */
    public static final ImageVector.Builder m24963pathR_LF3I(ImageVector.Builder builder, String str, Brush brush, float f10, Brush brush2, float f11, float f12, int i10, int i11, float f13, int i12, InterfaceC10570l interfaceC10570l) {
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC10570l.invoke(pathBuilder);
        return ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), i12, str, brush, f10, brush2, f11, f12, i10, i11, f13, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m24964pathR_LF3I$default(ImageVector.Builder builder, String str, Brush brush, float f10, Brush brush2, float f11, float f12, int i10, int i11, float f13, int i12, InterfaceC10570l interfaceC10570l, int i13, Object obj) {
        String str2 = (i13 & 1) != 0 ? "" : str;
        Brush brush3 = (i13 & 2) != 0 ? null : brush;
        float f14 = (i13 & 4) != 0 ? 1.0f : f10;
        Brush brush4 = (i13 & 8) != 0 ? null : brush2;
        float f15 = (i13 & 16) != 0 ? 1.0f : f11;
        float f16 = (i13 & 32) != 0 ? 0.0f : f12;
        int defaultStrokeLineCap = (i13 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i10;
        int defaultStrokeLineJoin = (i13 & 128) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i11;
        float f17 = (i13 & 256) != 0 ? 4.0f : f13;
        int defaultFillType = (i13 & 512) != 0 ? VectorKt.getDefaultFillType() : i12;
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC10570l.invoke(pathBuilder);
        return ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, str2, brush3, f14, brush4, f15, f16, defaultStrokeLineCap, defaultStrokeLineJoin, f17, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean push(ArrayList<T> arrayList, T t10) {
        return arrayList.add(t10);
    }
}
