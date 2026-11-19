package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.ImageBitmapConfig;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class VectorComponent extends VNode {
    public static final int $stable = 8;
    private final DrawCache cacheDrawScope;
    private final InterfaceC10570l drawVectorBlock;
    private final MutableState intrinsicColorFilter$delegate;
    private InterfaceC10559a invalidateCallback;
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
        groupComponent.setInvalidateListener$ui_release(new InterfaceC10570l() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((VNode) obj);
                return C8736p.f16368a;
            }

            public final void invoke(VNode vNode) {
                VectorComponent.this.doInvalidate();
            }
        });
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = new InterfaceC10559a() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m24974invoke() {
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m24974invoke();
                return C8736p.f16368a;
            }
        };
        this.intrinsicColorFilter$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        Size.Companion companion = Size.Companion;
        this.viewportSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m24092boximpl(companion.m24113getZeroNHjbRc()), null, 2, null);
        this.previousDrawSize = companion.m24112getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new InterfaceC10570l() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(DrawScope drawScope) {
                GroupComponent root = this.this$0.getRoot();
                VectorComponent vectorComponent = this.this$0;
                float f10 = vectorComponent.rootScaleX;
                float f11 = vectorComponent.rootScaleY;
                long jM24051getZeroF1C5BW0 = Offset.Companion.m24051getZeroF1C5BW0();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo24755scale0AR0LA0(f10, f11, jM24051getZeroF1C5BW0);
                    root.draw(drawScope);
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
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
        int iM24495getAlpha8_sVssgQ = (this.root.isTintable() && this.root.m24956getTintColor0d7_KjU() != 16 && VectorKt.tintableWithAlphaMask(getIntrinsicColorFilter$ui_release()) && VectorKt.tintableWithAlphaMask(colorFilter)) ? ImageBitmapConfig.Companion.m24495getAlpha8_sVssgQ() : ImageBitmapConfig.Companion.m24496getArgb8888_sVssgQ();
        if (!this.isDirty && Size.m24100equalsimpl0(this.previousDrawSize, drawScope.mo24827getSizeNHjbRc()) && ImageBitmapConfig.m24491equalsimpl0(iM24495getAlpha8_sVssgQ, m24971getCacheBitmapConfig_sVssgQ$ui_release())) {
            drawScope2 = drawScope;
        } else {
            this.tintFilter = ImageBitmapConfig.m24491equalsimpl0(iM24495getAlpha8_sVssgQ, ImageBitmapConfig.Companion.m24495getAlpha8_sVssgQ()) ? ColorFilter.Companion.m24317tintxETnrds$default(ColorFilter.Companion, this.root.m24956getTintColor0d7_KjU(), 0, 2, null) : null;
            this.rootScaleX = Float.intBitsToFloat((int) (drawScope.mo24827getSizeNHjbRc() >> 32)) / Float.intBitsToFloat((int) (m24972getViewportSizeNHjbRc$ui_release() >> 32));
            this.rootScaleY = Float.intBitsToFloat((int) (drawScope.mo24827getSizeNHjbRc() & 4294967295L)) / Float.intBitsToFloat((int) (m24972getViewportSizeNHjbRc$ui_release() & 4294967295L));
            drawScope2 = drawScope;
            this.cacheDrawScope.m24954drawCachedImageFqjB98A(iM24495getAlpha8_sVssgQ, IntSize.m27065constructorimpl((((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo24827getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo24827getSizeNHjbRc() >> 32)))) << 32)), drawScope2, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope2.mo24827getSizeNHjbRc();
        }
        if (colorFilter == null) {
            colorFilter = getIntrinsicColorFilter$ui_release() != null ? getIntrinsicColorFilter$ui_release() : this.tintFilter;
        }
        this.cacheDrawScope.drawInto(drawScope2, f10, colorFilter);
    }

    /* renamed from: getCacheBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m24971getCacheBitmapConfig_sVssgQ$ui_release() {
        ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.mo24143getConfig_sVssgQ() : ImageBitmapConfig.Companion.m24496getArgb8888_sVssgQ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.intrinsicColorFilter$delegate.getValue();
    }

    public final InterfaceC10559a getInvalidateCallback$ui_release() {
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
    public final long m24972getViewportSizeNHjbRc$ui_release() {
        return ((Size) this.viewportSize$delegate.getValue()).m24109unboximpl();
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.intrinsicColorFilter$delegate.setValue(colorFilter);
    }

    public final void setInvalidateCallback$ui_release(InterfaceC10559a interfaceC10559a) {
        this.invalidateCallback = interfaceC10559a;
    }

    public final void setName(String str) {
        this.name = str;
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m24973setViewportSizeuvyYCjk$ui_release(long j10) {
        this.viewportSize$delegate.setValue(Size.m24092boximpl(j10));
    }

    public String toString() {
        String str = "Params: \tname: " + this.name + SignParameters.NEW_LINE + "\tviewportWidth: " + Float.intBitsToFloat((int) (m24972getViewportSizeNHjbRc$ui_release() >> 32)) + SignParameters.NEW_LINE + "\tviewportHeight: " + Float.intBitsToFloat((int) (m24972getViewportSizeNHjbRc$ui_release() & 4294967295L)) + SignParameters.NEW_LINE;
        AbstractC9133u.m16132f(str, "toString(...)");
        return str;
    }

    @Override // androidx.compose.p013ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }
}
