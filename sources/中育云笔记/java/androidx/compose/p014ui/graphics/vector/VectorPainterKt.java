package androidx.compose.p014ui.graphics.vector;

import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.BlendMode;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class VectorPainterKt {
    public static final String RootGroupName = "VectorRootGroup";

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RenderVectorGroup(final androidx.compose.p014ui.graphics.vector.VectorGroup r23, java.util.Map<java.lang.String, ? extends androidx.compose.p014ui.graphics.vector.VectorConfig> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.graphics.vector.VectorPainterKt.RenderVectorGroup(androidx.compose.ui.graphics.vector.VectorGroup, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: configureVectorPainter-T4PVSW8, reason: not valid java name */
    public static final VectorPainter m31588configureVectorPainterT4PVSW8(VectorPainter vectorPainter, long j10, long j11, String str, ColorFilter colorFilter, boolean z10) {
        vectorPainter.m31585setSizeuvyYCjk$ui_release(j10);
        vectorPainter.setAutoMirror$ui_release(z10);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter);
        vectorPainter.m31586setViewportSizeuvyYCjk$ui_release(j11);
        vectorPainter.setName$ui_release(str);
        return vectorPainter;
    }

    /* renamed from: configureVectorPainter-T4PVSW8$default, reason: not valid java name */
    public static /* synthetic */ VectorPainter m31589configureVectorPainterT4PVSW8$default(VectorPainter vectorPainter, long j10, long j11, String str, ColorFilter colorFilter, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = RootGroupName;
        }
        return m31588configureVectorPainterT4PVSW8(vectorPainter, j10, j11, str, colorFilter, (i10 & 16) != 0 ? false : z10);
    }

    /* renamed from: createColorFilter-xETnrds, reason: not valid java name */
    private static final ColorFilter m31590createColorFilterxETnrds(long j10, int i10) {
        if (j10 != 16) {
            return ColorFilter.Companion.m30922tintxETnrds(j10, i10);
        }
        return null;
    }

    public static final GroupComponent createGroupComponent(GroupComponent groupComponent, VectorGroup vectorGroup) {
        int size = vectorGroup.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            VectorNode vectorNode = vectorGroup.get(i10);
            if (vectorNode instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNode;
                pathComponent.setPathData(vectorPath.getPathData());
                pathComponent.m31570setPathFillTypeoQ8Xj4U(vectorPath.m31595getPathFillTypeRgk1Os());
                pathComponent.setName(vectorPath.getName());
                pathComponent.setFill(vectorPath.getFill());
                pathComponent.setFillAlpha(vectorPath.getFillAlpha());
                pathComponent.setStroke(vectorPath.getStroke());
                pathComponent.setStrokeAlpha(vectorPath.getStrokeAlpha());
                pathComponent.setStrokeLineWidth(vectorPath.getStrokeLineWidth());
                pathComponent.m31571setStrokeLineCapBeK7IIE(vectorPath.m31596getStrokeLineCapKaPHkGw());
                pathComponent.m31572setStrokeLineJoinWw9F2mQ(vectorPath.m31597getStrokeLineJoinLxFBmk8());
                pathComponent.setStrokeLineMiter(vectorPath.getStrokeLineMiter());
                pathComponent.setTrimPathStart(vectorPath.getTrimPathStart());
                pathComponent.setTrimPathEnd(vectorPath.getTrimPathEnd());
                pathComponent.setTrimPathOffset(vectorPath.getTrimPathOffset());
                groupComponent.insertAt(i10, pathComponent);
            } else if (vectorNode instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                groupComponent2.setName(vectorGroup2.getName());
                groupComponent2.setRotation(vectorGroup2.getRotation());
                groupComponent2.setScaleX(vectorGroup2.getScaleX());
                groupComponent2.setScaleY(vectorGroup2.getScaleY());
                groupComponent2.setTranslationX(vectorGroup2.getTranslationX());
                groupComponent2.setTranslationY(vectorGroup2.getTranslationY());
                groupComponent2.setPivotX(vectorGroup2.getPivotX());
                groupComponent2.setPivotY(vectorGroup2.getPivotY());
                groupComponent2.setClipPathData(vectorGroup2.getClipPathData());
                createGroupComponent(groupComponent2, vectorGroup2);
                groupComponent.insertAt(i10, groupComponent2);
            }
        }
        return groupComponent;
    }

    public static final VectorPainter createVectorPainterFromImageVector(Density density, ImageVector imageVector, GroupComponent groupComponent) {
        long jM31591obtainSizePxVpY3zN4 = m31591obtainSizePxVpY3zN4(density, imageVector.m31560getDefaultWidthD9Ej5fM(), imageVector.m31559getDefaultHeightD9Ej5fM());
        return m31588configureVectorPainterT4PVSW8(new VectorPainter(groupComponent), jM31591obtainSizePxVpY3zN4, m31592obtainViewportSizePq9zytI(jM31591obtainSizePxVpY3zN4, imageVector.getViewportWidth(), imageVector.getViewportHeight()), imageVector.getName(), m31590createColorFilterxETnrds(imageVector.m31562getTintColor0d7_KjU(), imageVector.m31561getTintBlendMode0nO6VwU()), imageVector.getAutoMirror());
    }

    private static final void mirror(DrawScope drawScope, InterfaceC9540l interfaceC9540l) {
        long jMo31428getCenterF1C5BW0 = drawScope.mo31428getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31357scale0AR0LA0(-1.0f, 1.0f, jMo31428getCenterF1C5BW0);
            interfaceC9540l.invoke(drawScope);
        } finally {
            AbstractC9977s.m20286b(1);
            drawContext.getCanvas().restore();
            drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            AbstractC9977s.m20285a(1);
        }
    }

    /* renamed from: obtainSizePx-VpY3zN4, reason: not valid java name */
    private static final long m31591obtainSizePxVpY3zN4(Density density, float f10, float f11) {
        float fMo27099toPx0680j_4 = density.mo27099toPx0680j_4(f10);
        float fMo27099toPx0680j_42 = density.mo27099toPx0680j_4(f11);
        return Size.m30697constructorimpl((Float.floatToRawIntBits(fMo27099toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo27099toPx0680j_42) & 4294967295L));
    }

    /* renamed from: obtainViewportSize-Pq9zytI, reason: not valid java name */
    private static final long m31592obtainViewportSizePq9zytI(long j10, float f10, float f11) {
        if (Float.isNaN(f10)) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if (Float.isNaN(f11)) {
            f11 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        return Size.m30697constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    @Composable
    public static final VectorPainter rememberVectorPainter(ImageVector imageVector, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float genId$ui_release = imageVector.getGenId$ui_release();
        float density2 = density.getDensity();
        boolean zChanged = composer.changed((Float.floatToRawIntBits(density2) & 4294967295L) | (Float.floatToRawIntBits(genId$ui_release) << 32));
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            GroupComponent groupComponent = new GroupComponent();
            createGroupComponent(groupComponent, imageVector.getRoot());
            C10786q c10786q = C10786q.f26013a;
            objRememberedValue = createVectorPainterFromImageVector(density, imageVector, groupComponent);
            composer.updateRememberedValue(objRememberedValue);
        }
        VectorPainter vectorPainter = (VectorPainter) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vectorPainter;
    }

    @Composable
    @InterfaceC10770a
    @ComposableOpenTarget(index = -1)
    /* renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final VectorPainter m31593rememberVectorPaintermlNsNFs(float f10, float f11, float f12, float f13, String str, long j10, int i10, InterfaceC9546r interfaceC9546r, Composer composer, int i11, int i12) {
        float f14 = (i12 & 4) != 0 ? Float.NaN : f12;
        float f15 = (i12 & 8) != 0 ? Float.NaN : f13;
        String str2 = (i12 & 16) != 0 ? RootGroupName : str;
        long jM30914getUnspecified0d7_KjU = (i12 & 32) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        int iM30818getSrcIn0nO6VwU = (i12 & 64) != 0 ? BlendMode.Companion.m30818getSrcIn0nO6VwU() : i10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-964365210, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:85)");
        }
        VectorPainter vectorPainterM31594rememberVectorPaintervIP8VLU = m31594rememberVectorPaintervIP8VLU(f10, f11, f14, f15, str2, jM30914getUnspecified0d7_KjU, iM30818getSrcIn0nO6VwU, false, interfaceC9546r, composer, (i11 & 14) | 12582912 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | ((i11 << 3) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vectorPainterM31594rememberVectorPaintervIP8VLU;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableOpenTarget(index = -1)
    /* renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p014ui.graphics.vector.VectorPainter m31594rememberVectorPaintervIP8VLU(float r17, float r18, float r19, float r20, java.lang.String r21, long r22, int r24, boolean r25, final p181hd.InterfaceC9546r r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.graphics.vector.VectorPainterKt.m31594rememberVectorPaintervIP8VLU(float, float, float, float, java.lang.String, long, int, boolean, hd.r, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.graphics.vector.VectorPainter");
    }
}
