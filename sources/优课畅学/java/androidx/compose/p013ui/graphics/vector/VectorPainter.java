package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.painter.Painter;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

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

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public boolean applyAlpha(float f10) {
        this.currentAlpha = f10;
        return true;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.autoMirror$delegate.getValue()).booleanValue();
    }

    /* renamed from: getBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m24980getBitmapConfig_sVssgQ$ui_release() {
        return this.vector.m24971getCacheBitmapConfig_sVssgQ$ui_release();
    }

    public final Composition getComposition$ui_release() {
        return this.composition;
    }

    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.vector.getIntrinsicColorFilter$ui_release();
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo24947getIntrinsicSizeNHjbRc() {
        return m24981getSizeNHjbRc$ui_release();
    }

    public final String getName$ui_release() {
        return this.vector.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m24981getSizeNHjbRc$ui_release() {
        return ((Size) this.size$delegate.getValue()).m24109unboximpl();
    }

    public final VectorComponent getVector$ui_release() {
        return this.vector;
    }

    /* renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m24982getViewportSizeNHjbRc$ui_release() {
        return this.vector.m24972getViewportSizeNHjbRc$ui_release();
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        VectorComponent vectorComponent = this.vector;
        ColorFilter intrinsicColorFilter$ui_release = this.currentColorFilter;
        if (intrinsicColorFilter$ui_release == null) {
            intrinsicColorFilter$ui_release = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (getAutoMirror$ui_release() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long jMo24826getCenterF1C5BW0 = drawScope.mo24826getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo24755scale0AR0LA0(-1.0f, 1.0f, jMo24826getCenterF1C5BW0);
                vectorComponent.draw(drawScope, this.currentAlpha, intrinsicColorFilter$ui_release);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
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
    public final void m24983setSizeuvyYCjk$ui_release(long j10) {
        this.size$delegate.setValue(Size.m24092boximpl(j10));
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m24984setViewportSizeuvyYCjk$ui_release(long j10) {
        this.vector.m24973setViewportSizeuvyYCjk$ui_release(j10);
    }

    public VectorPainter(GroupComponent groupComponent) {
        this.size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m24092boximpl(Size.Companion.m24113getZeroNHjbRc()), null, 2, null);
        this.autoMirror$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.setInvalidateCallback$ui_release(new InterfaceC10559a() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m24985invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m24985invoke() {
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

    public /* synthetic */ VectorPainter(GroupComponent groupComponent, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? new GroupComponent() : groupComponent);
    }
}
