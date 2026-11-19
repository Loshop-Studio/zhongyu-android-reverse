package androidx.compose.p014ui.graphics.vector;

import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.painter.Painter;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    private final MutableState autoMirror$delegate;
    private Composition composition;
    private float currentAlpha;
    private ColorFilter currentColorFilter;
    private int drawCount;
    private final MutableIntState invalidateCount$delegate;
    private final MutableState size$delegate;
    private final VectorComponent vector;

    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getInvalidateCount() {
        return this.invalidateCount$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateCount(int i10) {
        this.invalidateCount$delegate.setIntValue(i10);
    }

    @Override // androidx.compose.p014ui.graphics.painter.Painter
    public boolean applyAlpha(float f10) {
        this.currentAlpha = f10;
        return true;
    }

    @Override // androidx.compose.p014ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.autoMirror$delegate.getValue()).booleanValue();
    }

    /* renamed from: getBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m31582getBitmapConfig_sVssgQ$ui_release() {
        return this.vector.m31573getCacheBitmapConfig_sVssgQ$ui_release();
    }

    public final Composition getComposition$ui_release() {
        return this.composition;
    }

    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.vector.getIntrinsicColorFilter$ui_release();
    }

    @Override // androidx.compose.p014ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo31549getIntrinsicSizeNHjbRc() {
        return m31583getSizeNHjbRc$ui_release();
    }

    public final String getName$ui_release() {
        return this.vector.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m31583getSizeNHjbRc$ui_release() {
        return ((Size) this.size$delegate.getValue()).m30711unboximpl();
    }

    public final VectorComponent getVector$ui_release() {
        return this.vector;
    }

    /* renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m31584getViewportSizeNHjbRc$ui_release() {
        return this.vector.m31574getViewportSizeNHjbRc$ui_release();
    }

    @Override // androidx.compose.p014ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        VectorComponent vectorComponent = this.vector;
        ColorFilter intrinsicColorFilter$ui_release = this.currentColorFilter;
        if (intrinsicColorFilter$ui_release == null) {
            intrinsicColorFilter$ui_release = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (getAutoMirror$ui_release() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long jMo31428getCenterF1C5BW0 = drawScope.mo31428getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo31357scale0AR0LA0(-1.0f, 1.0f, jMo31428getCenterF1C5BW0);
                vectorComponent.draw(drawScope, this.currentAlpha, intrinsicColorFilter$ui_release);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            }
        } else {
            vectorComponent.draw(drawScope, this.currentAlpha, intrinsicColorFilter$ui_release);
        }
        this.drawCount = getInvalidateCount();
    }

    public final void setAutoMirror$ui_release(boolean z10) {
        this.autoMirror$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setComposition$ui_release(Composition composition) {
        this.composition = composition;
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    public final void setName$ui_release(String str) {
        this.vector.setName(str);
    }

    /* renamed from: setSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m31585setSizeuvyYCjk$ui_release(long j10) {
        this.size$delegate.setValue(Size.m30694boximpl(j10));
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m31586setViewportSizeuvyYCjk$ui_release(long j10) {
        this.vector.m31575setViewportSizeuvyYCjk$ui_release(j10);
    }

    public VectorPainter(GroupComponent groupComponent) {
        this.size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m30694boximpl(Size.Companion.m30715getZeroNHjbRc()), null, 2, null);
        this.autoMirror$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.setInvalidateCallback$ui_release(new InterfaceC9529a() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m31587invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m31587invoke() {
                if (this.this$0.drawCount == this.this$0.getInvalidateCount()) {
                    VectorPainter vectorPainter = this.this$0;
                    vectorPainter.setInvalidateCount(vectorPainter.getInvalidateCount() + 1);
                }
            }
        });
        this.vector = vectorComponent;
        this.invalidateCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.currentAlpha = 1.0f;
        this.drawCount = -1;
    }

    public /* synthetic */ VectorPainter(GroupComponent groupComponent, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? new GroupComponent() : groupComponent);
    }
}
