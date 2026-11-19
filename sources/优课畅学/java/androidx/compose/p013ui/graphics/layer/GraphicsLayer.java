package androidx.compose.p013ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.p013ui.geometry.CornerRadius;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RoundRectKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p013ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p013ui.graphics.AndroidPath;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.BlendMode;
import androidx.compose.p013ui.graphics.ClipOp;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.Paint;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.RenderEffect;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawContextKt;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class GraphicsLayer {
    public static final Companion Companion = new Companion(null);
    private static final LayerSnapshotImpl SnapshotImpl;
    private Outline androidOutline;
    private final ChildLayerDependenciesTracker childDependenciesTracker;
    private boolean clip;
    private final GraphicsLayerImpl impl;
    private androidx.compose.p013ui.graphics.Outline internalOutline;
    private boolean isReleased;
    private final LayerManager layerManager;
    private Path outlinePath;
    private int parentLayerUsages;
    private RectF pathBounds;
    private long pivotOffset;
    private Path roundRectClipPath;
    private float roundRectCornerRadius;
    private long roundRectOutlineSize;
    private long roundRectOutlineTopLeft;
    private long size;
    private CanvasDrawScope softwareDrawScope;
    private Paint softwareLayerPaint;
    private long topLeft;
    private boolean usePathForClip;
    private Density density = DrawContextKt.getDefaultDensity();
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private InterfaceC10570l drawBlock = new InterfaceC10570l() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        public final void invoke(DrawScope drawScope) {
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return C8736p.f16368a;
        }
    };
    private final InterfaceC10570l clipDrawBlock = new InterfaceC10570l() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        {
            super(1);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return C8736p.f16368a;
        }

        public final void invoke(DrawScope drawScope) {
            Path path = this.this$0.outlinePath;
            if (!this.this$0.usePathForClip || !this.this$0.getClip() || path == null) {
                this.this$0.drawWithChildTracking(drawScope);
                return;
            }
            GraphicsLayer graphicsLayer = this.this$0;
            int iM24265getIntersectrtfAjoo = ClipOp.Companion.m24265getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo24750clipPathmtrdDE(path, iM24265getIntersectrtfAjoo);
                graphicsLayer.drawWithChildTracking(drawScope);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            }
        }
    };
    private boolean outlineDirty = true;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.ui.graphics.layer.GraphicsLayer", m17801f = "AndroidGraphicsLayer.android.kt", m17802l = {878}, m17803m = "toImageBitmap")
    /* renamed from: androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 */
    public static final class C27531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27531(InterfaceC9324c<? super C27531> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GraphicsLayer.this.toImageBitmap(this);
        }
    }

    static {
        SnapshotImpl = LayerManager.Companion.isRobolectric() ? LayerSnapshotV21.INSTANCE : Build.VERSION.SDK_INT >= 28 ? LayerSnapshotV28.INSTANCE : SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable() ? LayerSnapshotV22.INSTANCE : LayerSnapshotV21.INSTANCE;
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl, LayerManager layerManager) {
        this.impl = graphicsLayerImpl;
        this.layerManager = layerManager;
        Offset.Companion companion = Offset.Companion;
        this.roundRectOutlineTopLeft = companion.m24051getZeroF1C5BW0();
        this.roundRectOutlineSize = Size.Companion.m24112getUnspecifiedNHjbRc();
        this.childDependenciesTracker = new ChildLayerDependenciesTracker();
        graphicsLayerImpl.setClip(false);
        this.topLeft = IntOffset.Companion.m27038getZeronOccac();
        this.size = IntSize.Companion.m27075getZeroYbymL2g();
        this.pivotOffset = companion.m24050getUnspecifiedF1C5BW0();
    }

    private final void addSubLayer(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.onDependencyAdded(graphicsLayer)) {
            graphicsLayer.onAddedToParentLayer();
        }
    }

    private final void configureOutlineAndClip() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (this.clip || getShadowElevation() > 0.0f) {
                Path path = this.outlinePath;
                if (path != null) {
                    RectF rectFObtainPathBounds = obtainPathBounds();
                    if (!(path instanceof AndroidPath)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((AndroidPath) path).getInternalPath().computeBounds(rectFObtainPathBounds, false);
                    Outline outlineUpdatePathOutline = updatePathOutline(path);
                    if (outlineUpdatePathOutline != null) {
                        outlineUpdatePathOutline.setAlpha(getAlpha());
                        outline = outlineUpdatePathOutline;
                    }
                    this.impl.mo24938setOutlineO0kMr_c(outline, IntSize.m27065constructorimpl((4294967295L & Math.round(rectFObtainPathBounds.height())) | (Math.round(rectFObtainPathBounds.width()) << 32)));
                    if (this.usePathForClip && this.clip) {
                        this.impl.setClip(false);
                        this.impl.discardDisplayList();
                    } else {
                        this.impl.setClip(this.clip);
                    }
                } else {
                    this.impl.setClip(this.clip);
                    Size.Companion.m24113getZeroNHjbRc();
                    Outline outlineObtainAndroidOutline = obtainAndroidOutline();
                    long jM27082toSizeozmzZPI = IntSizeKt.m27082toSizeozmzZPI(this.size);
                    long j10 = this.roundRectOutlineTopLeft;
                    long j11 = this.roundRectOutlineSize;
                    long j12 = j11 == InlineClassHelperKt.UnspecifiedPackedFloats ? jM27082toSizeozmzZPI : j11;
                    int i10 = (int) (j10 >> 32);
                    int i11 = (int) (j10 & 4294967295L);
                    outlineObtainAndroidOutline.setRoundRect(Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j12 >> 32))), Math.round(Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 & 4294967295L))), this.roundRectCornerRadius);
                    outlineObtainAndroidOutline.setAlpha(getAlpha());
                    this.impl.mo24938setOutlineO0kMr_c(outlineObtainAndroidOutline, IntSizeKt.m27078roundToIntSizeuvyYCjk(j12));
                }
            } else {
                this.impl.setClip(false);
                this.impl.mo24938setOutlineO0kMr_c(null, IntSize.Companion.m27075getZeroYbymL2g());
            }
        }
        this.outlineDirty = false;
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            LayerManager layerManager = this.layerManager;
            if (layerManager != null) {
                layerManager.release(this);
            } else {
                discardDisplayList$ui_graphics_release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawWithChildTracking(androidx.compose.p013ui.graphics.drawscope.DrawScope r15) {
        /*
            r14 = this;
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r0 = r14.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.p013ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependency$p(r0)
            androidx.compose.p013ui.graphics.layer.ChildLayerDependenciesTracker.access$setOldDependency$p(r0, r1)
            androidx.collection.MutableScatterSet r1 = androidx.compose.p013ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependenciesSet$p(r0)
            if (r1 == 0) goto L28
            boolean r2 = r1.isNotEmpty()
            if (r2 == 0) goto L28
            androidx.collection.MutableScatterSet r2 = androidx.compose.p013ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(r0)
            if (r2 != 0) goto L22
            androidx.collection.MutableScatterSet r2 = androidx.collection.ScatterSetKt.mutableScatterSetOf()
            androidx.compose.p013ui.graphics.layer.ChildLayerDependenciesTracker.access$setOldDependenciesSet$p(r0, r2)
        L22:
            r2.addAll(r1)
            r1.clear()
        L28:
            r1 = 1
            androidx.compose.p013ui.graphics.layer.ChildLayerDependenciesTracker.access$setTrackingInProgress$p(r0, r1)
            x7.l r1 = r14.drawBlock
            r1.invoke(r15)
            r15 = 0
            androidx.compose.p013ui.graphics.layer.ChildLayerDependenciesTracker.access$setTrackingInProgress$p(r0, r15)
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.p013ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependency$p(r0)
            if (r1 == 0) goto L3e
            r1.onRemovedFromParentLayer()
        L3e:
            androidx.collection.MutableScatterSet r0 = androidx.compose.p013ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(r0)
            if (r0 == 0) goto L91
            boolean r1 = r0.isNotEmpty()
            if (r1 == 0) goto L91
            java.lang.Object[] r1 = r0.elements
            long[] r2 = r0.metadata
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8e
            r4 = r15
        L54:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L89
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L6e:
            if (r9 >= r7) goto L87
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L83
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.graphics.layer.GraphicsLayer r10 = (androidx.compose.p013ui.graphics.layer.GraphicsLayer) r10
            r10.onRemovedFromParentLayer()
        L83:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L6e
        L87:
            if (r7 != r8) goto L8e
        L89:
            if (r4 == r3) goto L8e
            int r4 = r4 + 1
            goto L54
        L8e:
            r0.clear()
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.graphics.layer.GraphicsLayer.drawWithChildTracking(androidx.compose.ui.graphics.drawscope.DrawScope):void");
    }

    public static /* synthetic */ void getClip$annotations() {
    }

    private final Outline obtainAndroidOutline() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final RectF obtainPathBounds() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void onAddedToParentLayer() {
        this.parentLayerUsages++;
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final void recordInternal() {
        this.impl.record(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.impl.getHasDisplayList()) {
            return;
        }
        try {
            recordInternal();
        } catch (Throwable unused) {
        }
    }

    private final void resetOutlineParams() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.Companion.m24112getUnspecifiedNHjbRc();
        this.roundRectOutlineTopLeft = Offset.Companion.m24051getZeroF1C5BW0();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    private final <T> T resolveOutlinePosition(InterfaceC10574p interfaceC10574p) {
        long jM27082toSizeozmzZPI = IntSizeKt.m27082toSizeozmzZPI(this.size);
        long j10 = this.roundRectOutlineTopLeft;
        long j11 = this.roundRectOutlineSize;
        if (j11 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM27082toSizeozmzZPI = j11;
        }
        return (T) interfaceC10574p.invoke(Offset.m24024boximpl(j10), Size.m24092boximpl(jM27082toSizeozmzZPI));
    }

    /* renamed from: setPosition-VbeCjmY, reason: not valid java name */
    private final void m24910setPositionVbeCjmY(long j10, long j11) {
        this.impl.mo24940setPositionH0pRuoY(IntOffset.m27027getXimpl(j10), IntOffset.m27028getYimpl(j10), j11);
    }

    /* renamed from: setRectOutline-tz77jQw$default, reason: not valid java name */
    public static /* synthetic */ void m24911setRectOutlinetz77jQw$default(GraphicsLayer graphicsLayer, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Offset.Companion.m24051getZeroF1C5BW0();
        }
        if ((i10 & 2) != 0) {
            j11 = Size.Companion.m24112getUnspecifiedNHjbRc();
        }
        graphicsLayer.m24926setRectOutlinetz77jQw(j10, j11);
    }

    /* renamed from: setRoundRectOutline-TNW_H78$default, reason: not valid java name */
    public static /* synthetic */ void m24912setRoundRectOutlineTNW_H78$default(GraphicsLayer graphicsLayer, long j10, long j11, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Offset.Companion.m24051getZeroF1C5BW0();
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = Size.Companion.m24112getUnspecifiedNHjbRc();
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        graphicsLayer.m24927setRoundRectOutlineTNW_H78(j12, j13, f10);
    }

    /* renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m24913setSizeozmzZPI(long j10) {
        if (IntSize.m27068equalsimpl0(this.size, j10)) {
            return;
        }
        this.size = j10;
        m24910setPositionVbeCjmY(this.topLeft, j10);
        if (this.roundRectOutlineSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    private final void transformCanvas(Canvas canvas) {
        Canvas canvas2;
        float fM27027getXimpl = IntOffset.m27027getXimpl(this.topLeft);
        float fM27028getYimpl = IntOffset.m27028getYimpl(this.topLeft);
        float fM27027getXimpl2 = IntOffset.m27027getXimpl(this.topLeft) + ((int) (this.size >> 32));
        float fM27028getYimpl2 = IntOffset.m27028getYimpl(this.topLeft) + ((int) (this.size & 4294967295L));
        float alpha = getAlpha();
        ColorFilter colorFilter = getColorFilter();
        int iM24915getBlendMode0nO6VwU = m24915getBlendMode0nO6VwU();
        if (alpha < 1.0f || !BlendMode.m24187equalsimpl0(iM24915getBlendMode0nO6VwU, BlendMode.Companion.m24218getSrcOver0nO6VwU()) || colorFilter != null || CompositingStrategy.m24903equalsimpl0(m24916getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m24909getOffscreenke2Ky5w())) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            Paint.setAlpha(alpha);
            Paint.mo24154setBlendModes9anfk8(iM24915getBlendMode0nO6VwU);
            Paint.setColorFilter(colorFilter);
            canvas2 = canvas;
            canvas2.saveLayer(fM27027getXimpl, fM27028getYimpl, fM27027getXimpl2, fM27028getYimpl2, Paint.asFrameworkPaint());
        } else {
            canvas.save();
            canvas2 = canvas;
        }
        canvas2.translate(fM27027getXimpl, fM27028getYimpl);
        canvas2.concat(this.impl.calculateMatrix());
    }

    private final Outline updatePathOutline(Path path) {
        Outline outline;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || path.isConvex()) {
            Outline outlineObtainAndroidOutline = obtainAndroidOutline();
            if (i10 >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(outlineObtainAndroidOutline, path);
            } else {
                if (!(path instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineObtainAndroidOutline.setConvexPath(((AndroidPath) path).getInternalPath());
            }
            this.usePathForClip = !outlineObtainAndroidOutline.canClip();
            outline = outlineObtainAndroidOutline;
        } else {
            Outline outline2 = this.androidOutline;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.setInvalidated(true);
            outline = null;
        }
        this.outlinePath = path;
        return outline;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void discardDisplayList$ui_graphics_release() {
        /*
            r15 = this;
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r0 = r15.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.p013ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependency$p(r0)
            if (r1 == 0) goto Lf
            r1.onRemovedFromParentLayer()
            r1 = 0
            androidx.compose.p013ui.graphics.layer.ChildLayerDependenciesTracker.access$setDependency$p(r0, r1)
        Lf:
            androidx.collection.MutableScatterSet r0 = androidx.compose.p013ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependenciesSet$p(r0)
            if (r0 == 0) goto L5d
            java.lang.Object[] r1 = r0.elements
            long[] r2 = r0.metadata
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L20:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3a:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.ui.graphics.layer.GraphicsLayer r11 = (androidx.compose.p013ui.graphics.layer.GraphicsLayer) r11
            r11.onRemovedFromParentLayer()
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3a
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L20
        L5a:
            r0.clear()
        L5d:
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r0 = r15.impl
            r0.discardDisplayList()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.graphics.layer.GraphicsLayer.discardDisplayList$ui_graphics_release():void");
    }

    public final void draw$ui_graphics_release(androidx.compose.p013ui.graphics.Canvas canvas, GraphicsLayer graphicsLayer) {
        boolean z10;
        boolean z11;
        if (this.isReleased) {
            return;
        }
        configureOutlineAndClip();
        recreateDisplayListIfNeeded();
        boolean z12 = getShadowElevation() > 0.0f;
        if (z12) {
            canvas.enableZ();
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            transformCanvas(nativeCanvas);
        }
        boolean z13 = !zIsHardwareAccelerated && this.clip;
        if (z13) {
            canvas.save();
            androidx.compose.p013ui.graphics.Outline outline = getOutline();
            if (outline instanceof Outline.Rectangle) {
                androidx.compose.p013ui.graphics.Canvas.m24249clipRectmtrdDE$default(canvas, outline.getBounds(), 0, 2, null);
            } else if (outline instanceof Outline.Rounded) {
                Path Path = this.roundRectClipPath;
                if (Path != null) {
                    Path.rewind();
                } else {
                    Path = AndroidPath_androidKt.Path();
                    this.roundRectClipPath = Path;
                }
                Path.addRoundRect$default(Path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
                androidx.compose.p013ui.graphics.Canvas.m24247clipPathmtrdDE$default(canvas, Path, 0, 2, null);
            } else if (outline instanceof Outline.Generic) {
                androidx.compose.p013ui.graphics.Canvas.m24247clipPathmtrdDE$default(canvas, ((Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
        if (graphicsLayer != null) {
            graphicsLayer.addSubLayer(this);
        }
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            z10 = z12;
            z11 = z13;
            this.impl.draw(canvas);
        } else {
            CanvasDrawScope canvasDrawScope = this.softwareDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                this.softwareDrawScope = canvasDrawScope;
            }
            CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
            Density density = this.density;
            LayoutDirection layoutDirection = this.layoutDirection;
            long jM27082toSizeozmzZPI = IntSizeKt.m27082toSizeozmzZPI(this.size);
            Density density2 = canvasDrawScope2.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = canvasDrawScope2.getDrawContext().getLayoutDirection();
            androidx.compose.p013ui.graphics.Canvas canvas2 = canvasDrawScope2.getDrawContext().getCanvas();
            long jMo24748getSizeNHjbRc = canvasDrawScope2.getDrawContext().mo24748getSizeNHjbRc();
            z10 = z12;
            GraphicsLayer graphicsLayer2 = canvasDrawScope2.getDrawContext().getGraphicsLayer();
            z11 = z13;
            DrawContext drawContext = canvasDrawScope2.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(canvas);
            drawContext.mo24749setSizeuvyYCjk(jM27082toSizeozmzZPI);
            drawContext.setGraphicsLayer(this);
            canvas.save();
            try {
                drawWithChildTracking(canvasDrawScope2);
            } finally {
                canvas.restore();
                DrawContext drawContext2 = canvasDrawScope2.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas2);
                drawContext2.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer2);
            }
        }
        if (z11) {
            canvas.restore();
        }
        if (z10) {
            canvas.disableZ();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        nativeCanvas.restore();
    }

    public final void drawForPersistence$ui_graphics_release(androidx.compose.p013ui.graphics.Canvas canvas) {
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            recreateDisplayListIfNeeded();
            this.impl.draw(canvas);
        }
    }

    public final void emulateTrimMemory$ui_graphics_release() {
        this.impl.discardDisplayList();
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m24914getAmbientShadowColor0d7_KjU() {
        return this.impl.mo24930getAmbientShadowColor0d7_KjU();
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m24915getBlendMode0nO6VwU() {
        return this.impl.mo24931getBlendMode0nO6VwU();
    }

    public final float getCameraDistance() {
        return this.impl.getCameraDistance();
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m24916getCompositingStrategyke2Ky5w() {
        return this.impl.mo24932getCompositingStrategyke2Ky5w();
    }

    public final GraphicsLayerImpl getImpl$ui_graphics_release() {
        return this.impl;
    }

    public final long getLayerId() {
        return this.impl.getLayerId();
    }

    public final androidx.compose.p013ui.graphics.Outline getOutline() {
        androidx.compose.p013ui.graphics.Outline rectangle;
        androidx.compose.p013ui.graphics.Outline outline = this.internalOutline;
        Path path = this.outlinePath;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            Outline.Generic generic = new Outline.Generic(path);
            this.internalOutline = generic;
            return generic;
        }
        long jM27082toSizeozmzZPI = IntSizeKt.m27082toSizeozmzZPI(this.size);
        long j10 = this.roundRectOutlineTopLeft;
        long j11 = this.roundRectOutlineSize;
        if (j11 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM27082toSizeozmzZPI = j11;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM27082toSizeozmzZPI >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jM27082toSizeozmzZPI & 4294967295L));
        if (this.roundRectCornerRadius > 0.0f) {
            rectangle = new Outline.Rounded(RoundRectKt.m24089RoundRectgG7oq9Y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, CornerRadius.m23989constructorimpl((Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0)))));
        } else {
            rectangle = new Outline.Rectangle(new Rect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.internalOutline = rectangle;
        return rectangle;
    }

    public final long getOwnerViewId() {
        return this.impl.getOwnerId();
    }

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    public final long m24917getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    public final RenderEffect getRenderEffect() {
        return this.impl.getRenderEffect();
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m24918getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m24919getSpotShadowColor0d7_KjU() {
        return this.impl.mo24934getSpotShadowColor0d7_KjU();
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m24920getTopLeftnOccac() {
        return this.topLeft;
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    public final boolean isReleased() {
        return this.isReleased;
    }

    /* renamed from: record-mL-hObY, reason: not valid java name */
    public final void m24921recordmLhObY(Density density, LayoutDirection layoutDirection, long j10, InterfaceC10570l interfaceC10570l) {
        m24913setSizeozmzZPI(j10);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = interfaceC10570l;
        this.impl.setInvalidated(true);
        recordInternal();
    }

    public final void release$ui_graphics_release() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    public final void setAlpha(float f10) {
        if (this.impl.getAlpha() == f10) {
            return;
        }
        this.impl.setAlpha(f10);
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m24922setAmbientShadowColor8_81llA(long j10) {
        if (Color.m24277equalsimpl0(j10, this.impl.mo24930getAmbientShadowColor0d7_KjU())) {
            return;
        }
        this.impl.mo24935setAmbientShadowColor8_81llA(j10);
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m24923setBlendModes9anfk8(int i10) {
        if (BlendMode.m24187equalsimpl0(this.impl.mo24931getBlendMode0nO6VwU(), i10)) {
            return;
        }
        this.impl.mo24936setBlendModes9anfk8(i10);
    }

    public final void setCameraDistance(float f10) {
        if (this.impl.getCameraDistance() == f10) {
            return;
        }
        this.impl.setCameraDistance(f10);
    }

    public final void setClip(boolean z10) {
        if (this.clip != z10) {
            this.clip = z10;
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (AbstractC9133u.m16128b(this.impl.getColorFilter(), colorFilter)) {
            return;
        }
        this.impl.setColorFilter(colorFilter);
    }

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m24924setCompositingStrategyWpw9cng(int i10) {
        if (CompositingStrategy.m24903equalsimpl0(this.impl.mo24932getCompositingStrategyke2Ky5w(), i10)) {
            return;
        }
        this.impl.mo24937setCompositingStrategyWpw9cng(i10);
    }

    public final void setPathOutline(Path path) {
        resetOutlineParams();
        this.outlinePath = path;
        configureOutlineAndClip();
    }

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m24925setPivotOffsetk4lQ0M(long j10) {
        if (Offset.m24032equalsimpl0(this.pivotOffset, j10)) {
            return;
        }
        this.pivotOffset = j10;
        this.impl.mo24939setPivotOffsetk4lQ0M(j10);
    }

    /* renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m24926setRectOutlinetz77jQw(long j10, long j11) {
        m24927setRoundRectOutlineTNW_H78(j10, j11, 0.0f);
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        if (AbstractC9133u.m16128b(this.impl.getRenderEffect(), renderEffect)) {
            return;
        }
        this.impl.setRenderEffect(renderEffect);
    }

    public final void setRotationX(float f10) {
        if (this.impl.getRotationX() == f10) {
            return;
        }
        this.impl.setRotationX(f10);
    }

    public final void setRotationY(float f10) {
        if (this.impl.getRotationY() == f10) {
            return;
        }
        this.impl.setRotationY(f10);
    }

    public final void setRotationZ(float f10) {
        if (this.impl.getRotationZ() == f10) {
            return;
        }
        this.impl.setRotationZ(f10);
    }

    /* renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m24927setRoundRectOutlineTNW_H78(long j10, long j11, float f10) {
        if (Offset.m24032equalsimpl0(this.roundRectOutlineTopLeft, j10) && Size.m24100equalsimpl0(this.roundRectOutlineSize, j11) && this.roundRectCornerRadius == f10 && this.outlinePath == null) {
            return;
        }
        resetOutlineParams();
        this.roundRectOutlineTopLeft = j10;
        this.roundRectOutlineSize = j11;
        this.roundRectCornerRadius = f10;
        configureOutlineAndClip();
    }

    public final void setScaleX(float f10) {
        if (this.impl.getScaleX() == f10) {
            return;
        }
        this.impl.setScaleX(f10);
    }

    public final void setScaleY(float f10) {
        if (this.impl.getScaleY() == f10) {
            return;
        }
        this.impl.setScaleY(f10);
    }

    public final void setShadowElevation(float f10) {
        if (this.impl.getShadowElevation() == f10) {
            return;
        }
        this.impl.setShadowElevation(f10);
        this.outlineDirty = true;
        configureOutlineAndClip();
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m24928setSpotShadowColor8_81llA(long j10) {
        if (Color.m24277equalsimpl0(j10, this.impl.mo24934getSpotShadowColor0d7_KjU())) {
            return;
        }
        this.impl.mo24941setSpotShadowColor8_81llA(j10);
    }

    /* renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m24929setTopLeftgyyYBs(long j10) {
        if (IntOffset.m27026equalsimpl0(this.topLeft, j10)) {
            return;
        }
        this.topLeft = j10;
        m24910setPositionVbeCjmY(j10, this.size);
    }

    public final void setTranslationX(float f10) {
        if (this.impl.getTranslationX() == f10) {
            return;
        }
        this.impl.setTranslationX(f10);
    }

    public final void setTranslationY(float f10) {
        if (this.impl.getTranslationY() == f10) {
            return;
        }
        this.impl.setTranslationY(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object toImageBitmap(p179m7.InterfaceC9324c<? super androidx.compose.p013ui.graphics.ImageBitmap> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.p013ui.graphics.layer.GraphicsLayer.C27531
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = (androidx.compose.p013ui.graphics.layer.GraphicsLayer.C27531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = new androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r5)
            androidx.compose.ui.graphics.layer.LayerSnapshotImpl r5 = androidx.compose.p013ui.graphics.layer.GraphicsLayer.SnapshotImpl
            r0.label = r3
            java.lang.Object r5 = r5.toBitmap(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            androidx.compose.ui.graphics.ImageBitmap r5 = androidx.compose.p013ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.graphics.layer.GraphicsLayer.toImageBitmap(m7.c):java.lang.Object");
    }
}
