package androidx.compose.p014ui.graphics.vector;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.ImageBitmap;
import androidx.compose.p014ui.graphics.ImageBitmapConfig;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class VectorComponent extends VNode {
    public static final int $stable = 8;
    private final DrawCache cacheDrawScope;
    private final InterfaceC9540l drawVectorBlock;
    private final MutableState intrinsicColorFilter$delegate;
    private InterfaceC9529a invalidateCallback;
    private boolean isDirty;
    private String name;
    private long previousDrawSize;
    private final GroupComponent root;
    private float rootScaleX;
    private float rootScaleY;
    private ColorFilter tintFilter;
    private final MutableState viewportSize$delegate;

    public VectorComponent(GroupComponent groupComponent) {
        super(null);
        this.root = groupComponent;
        groupComponent.setInvalidateListener$ui_release(new InterfaceC9540l() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((VNode) obj);
                return C10786q.f26013a;
            }

            public final void invoke(VNode vNode) {
                VectorComponent.this.doInvalidate();
            }
        });
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = new InterfaceC9529a() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m31576invoke() {
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m31576invoke();
                return C10786q.f26013a;
            }
        };
        this.intrinsicColorFilter$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        Size.Companion companion = Size.Companion;
        this.viewportSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m30694boximpl(companion.m30715getZeroNHjbRc()), null, 2, null);
        this.previousDrawSize = companion.m30714getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new InterfaceC9540l() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(DrawScope drawScope) {
                GroupComponent root = this.this$0.getRoot();
                VectorComponent vectorComponent = this.this$0;
                float f10 = vectorComponent.rootScaleX;
                float f11 = vectorComponent.rootScaleY;
                long jM30653getZeroF1C5BW0 = Offset.Companion.m30653getZeroF1C5BW0();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo31357scale0AR0LA0(f10, f11, jM30653getZeroF1C5BW0);
                    root.draw(drawScope);
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    public final void draw(DrawScope drawScope, float f10, ColorFilter colorFilter) {
        DrawScope drawScope2;
        int iM31097getAlpha8_sVssgQ = (this.root.isTintable() && this.root.m31558getTintColor0d7_KjU() != 16 && VectorKt.tintableWithAlphaMask(getIntrinsicColorFilter$ui_release()) && VectorKt.tintableWithAlphaMask(colorFilter)) ? ImageBitmapConfig.Companion.m31097getAlpha8_sVssgQ() : ImageBitmapConfig.Companion.m31098getArgb8888_sVssgQ();
        if (!this.isDirty && Size.m30702equalsimpl0(this.previousDrawSize, drawScope.mo31429getSizeNHjbRc()) && ImageBitmapConfig.m31093equalsimpl0(iM31097getAlpha8_sVssgQ, m31573getCacheBitmapConfig_sVssgQ$ui_release())) {
            drawScope2 = drawScope;
        } else {
            this.tintFilter = ImageBitmapConfig.m31093equalsimpl0(iM31097getAlpha8_sVssgQ, ImageBitmapConfig.Companion.m31097getAlpha8_sVssgQ()) ? ColorFilter.Companion.m30919tintxETnrds$default(ColorFilter.Companion, this.root.m31558getTintColor0d7_KjU(), 0, 2, null) : null;
            this.rootScaleX = Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() >> 32)) / Float.intBitsToFloat((int) (m31574getViewportSizeNHjbRc$ui_release() >> 32));
            this.rootScaleY = Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() & 4294967295L)) / Float.intBitsToFloat((int) (m31574getViewportSizeNHjbRc$ui_release() & 4294967295L));
            drawScope2 = drawScope;
            this.cacheDrawScope.m31556drawCachedImageFqjB98A(iM31097getAlpha8_sVssgQ, IntSize.m33667constructorimpl((((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() >> 32)))) << 32)), drawScope2, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope2.mo31429getSizeNHjbRc();
        }
        if (colorFilter == null) {
            colorFilter = getIntrinsicColorFilter$ui_release() != null ? getIntrinsicColorFilter$ui_release() : this.tintFilter;
        }
        this.cacheDrawScope.drawInto(drawScope2, f10, colorFilter);
    }

    /* renamed from: getCacheBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m31573getCacheBitmapConfig_sVssgQ$ui_release() {
        ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.mo30745getConfig_sVssgQ() : ImageBitmapConfig.Companion.m31098getArgb8888_sVssgQ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.intrinsicColorFilter$delegate.getValue();
    }

    public final InterfaceC9529a getInvalidateCallback$ui_release() {
        return this.invalidateCallback;
    }

    public final String getName() {
        return this.name;
    }

    public final GroupComponent getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m31574getViewportSizeNHjbRc$ui_release() {
        return ((Size) this.viewportSize$delegate.getValue()).m30711unboximpl();
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.intrinsicColorFilter$delegate.setValue(colorFilter);
    }

    public final void setInvalidateCallback$ui_release(InterfaceC9529a interfaceC9529a) {
        this.invalidateCallback = interfaceC9529a;
    }

    public final void setName(String str) {
        this.name = str;
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m31575setViewportSizeuvyYCjk$ui_release(long j10) {
        this.viewportSize$delegate.setValue(Size.m30694boximpl(j10));
    }

    public String toString() {
        String str = "Params: \tname: " + this.name + SignParameters.NEW_LINE + "\tviewportWidth: " + Float.intBitsToFloat((int) (m31574getViewportSizeNHjbRc$ui_release() >> 32)) + SignParameters.NEW_LINE + "\tviewportHeight: " + Float.intBitsToFloat((int) (m31574getViewportSizeNHjbRc$ui_release() & 4294967295L)) + SignParameters.NEW_LINE;
        AbstractC9979u.m20293f(str, "toString(...)");
        return str;
    }

    @Override // androidx.compose.p014ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }
}
