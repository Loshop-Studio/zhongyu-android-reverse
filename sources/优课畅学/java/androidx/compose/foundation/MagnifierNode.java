package androidx.compose.foundation;

import android.view.View;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DelegatableNode_androidKt;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p013ui.node.ObserverModifierNode;
import androidx.compose.p013ui.node.ObserverModifierNodeKt;
import androidx.compose.p013ui.node.SemanticsModifierNode;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpSize;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractC9159b;
import kotlinx.coroutines.channels.C9160c;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MagnifierNode extends Modifier.Node implements GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    public static final int $stable = 8;
    private State<Offset> anchorPositionInRootState;
    private boolean clippingEnabled;
    private float cornerRadius;
    private Density density;
    private InterfaceC9158a drawSignalChannel;
    private float elevation;
    private final MutableState layoutCoordinates$delegate;
    private PlatformMagnifier magnifier;
    private InterfaceC10570l magnifierCenter;
    private InterfaceC10570l onSizeChanged;
    private PlatformMagnifierFactory platformMagnifierFactory;
    private IntSize previousSize;
    private long size;
    private InterfaceC10570l sourceCenter;
    private long sourceCenterInRoot;
    private boolean useTextDefault;
    private View view;
    private float zoom;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.MagnifierNode$onAttach$1", m17801f = "Magnifier.android.kt", m17802l = {382, 386}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.MagnifierNode$onAttach$1 */
    public static final class C11861 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C11861(InterfaceC9324c<? super C11861> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return MagnifierNode.this.new C11861(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C11861) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r5, r4) == r0) goto L20;
         */
        /* JADX WARN: Path cross not found for [B:13:0x0029, B:16:0x0032], limit reached: 23 */
        /* JADX WARN: Path cross not found for [B:16:0x0032, B:13:0x0029], limit reached: 23 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0038 -> B:11:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0042 -> B:21:0x0045). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r5)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.AbstractC9079b.m15926b(r5)
                goto L32
            L1e:
                kotlin.AbstractC9079b.m15926b(r5)
            L21:
                androidx.compose.foundation.MagnifierNode r5 = androidx.compose.foundation.MagnifierNode.this
                kotlinx.coroutines.channels.a r5 = androidx.compose.foundation.MagnifierNode.access$getDrawSignalChannel$p(r5)
                if (r5 == 0) goto L32
                r4.label = r3
                java.lang.Object r5 = r5.mo15876f(r4)
                if (r5 != r0) goto L32
                goto L44
            L32:
                androidx.compose.foundation.MagnifierNode r5 = androidx.compose.foundation.MagnifierNode.this
                androidx.compose.foundation.PlatformMagnifier r5 = androidx.compose.foundation.MagnifierNode.access$getMagnifier$p(r5)
                if (r5 == 0) goto L21
                androidx.compose.foundation.MagnifierNode$onAttach$1$1 r5 = new p300x7.InterfaceC10570l() { // from class: androidx.compose.foundation.MagnifierNode.onAttach.1.1
                    static {
                        /*
                            androidx.compose.foundation.MagnifierNode$onAttach$1$1 r0 = new androidx.compose.foundation.MagnifierNode$onAttach$1$1
                            r0.<init>()
                            
                            // error: 0x0005: SPUT (r0 I:androidx.compose.foundation.MagnifierNode$onAttach$1$1) androidx.compose.foundation.MagnifierNode.onAttach.1.1.INSTANCE androidx.compose.foundation.MagnifierNode$onAttach$1$1
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.C11861.AnonymousClass1.<clinit>():void");
                    }

                    {
                        /*
                            r1 = this;
                            r0 = 1
                            r1.<init>(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.C11861.AnonymousClass1.<init>():void");
                    }

                    public final void invoke(long r1) {
                        /*
                            r0 = this;
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.C11861.AnonymousClass1.invoke(long):void");
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                        /*
                            r2 = this;
                            java.lang.Number r3 = (java.lang.Number) r3
                            long r0 = r3.longValue()
                            r2.invoke(r0)
                            h7.p r3 = p123h7.C8736p.f16368a
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.C11861.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                    }
                }
                r4.label = r2
                java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r5, r4)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                androidx.compose.foundation.MagnifierNode r5 = androidx.compose.foundation.MagnifierNode.this
                androidx.compose.foundation.PlatformMagnifier r5 = androidx.compose.foundation.MagnifierNode.access$getMagnifier$p(r5)
                if (r5 == 0) goto L21
                r5.updateContent()
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.C11861.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ MagnifierNode(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, PlatformMagnifierFactory platformMagnifierFactory, AbstractC9126n abstractC9126n) {
        this(interfaceC10570l, interfaceC10570l2, interfaceC10570l3, f10, z10, j10, f11, f12, z11, platformMagnifierFactory);
    }

    /* renamed from: getAnchorPositionInRoot-F1C5BW0, reason: not valid java name */
    private final long m20409getAnchorPositionInRootF1C5BW0() {
        if (this.anchorPositionInRootState == null) {
            this.anchorPositionInRootState = SnapshotStateKt.derivedStateOf(new InterfaceC10559a() { // from class: androidx.compose.foundation.MagnifierNode$anchorPositionInRoot$1
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    return Offset.m24024boximpl(m20417invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m20417invokeF1C5BW0() {
                    LayoutCoordinates layoutCoordinates = this.this$0.getLayoutCoordinates();
                    return layoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(layoutCoordinates) : Offset.Companion.m24050getUnspecifiedF1C5BW0();
                }
            });
        }
        State<Offset> state = this.anchorPositionInRootState;
        return state != null ? state.getValue().m24045unboximpl() : Offset.Companion.m24050getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getLayoutCoordinates() {
        return (LayoutCoordinates) this.layoutCoordinates$delegate.getValue();
    }

    private final void recreateMagnifier() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View viewRequireView = this.view;
        if (viewRequireView == null) {
            viewRequireView = DelegatableNode_androidKt.requireView(this);
        }
        View view = viewRequireView;
        this.view = view;
        Density densityRequireDensity = this.density;
        if (densityRequireDensity == null) {
            densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        }
        Density density = densityRequireDensity;
        this.density = density;
        this.magnifier = this.platformMagnifierFactory.mo20444createnHHXs2Y(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, density, this.zoom);
        updateSizeIfNecessary();
    }

    private final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateMagnifier() {
        /*
            r9 = this;
            androidx.compose.ui.unit.Density r0 = r9.density
            if (r0 != 0) goto La
            androidx.compose.ui.unit.Density r0 = androidx.compose.p013ui.node.DelegatableNodeKt.requireDensity(r9)
            r9.density = r0
        La:
            x7.l r1 = r9.sourceCenter
            java.lang.Object r1 = r1.invoke(r0)
            androidx.compose.ui.geometry.Offset r1 = (androidx.compose.p013ui.geometry.Offset) r1
            long r1 = r1.m24045unboximpl()
            r3 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r1 & r3
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L83
            long r5 = r9.m20409getAnchorPositionInRootF1C5BW0()
            long r5 = r5 & r3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L83
            long r5 = r9.m20409getAnchorPositionInRootF1C5BW0()
            long r1 = androidx.compose.p013ui.geometry.Offset.m24040plusMKHz9U(r5, r1)
            r9.sourceCenterInRoot = r1
            x7.l r1 = r9.magnifierCenter
            if (r1 == 0) goto L66
            java.lang.Object r0 = r1.invoke(r0)
            androidx.compose.ui.geometry.Offset r0 = (androidx.compose.p013ui.geometry.Offset) r0
            long r0 = r0.m24045unboximpl()
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.p013ui.geometry.Offset.m24024boximpl(r0)
            long r1 = r0.m24045unboximpl()
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L55
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L66
            long r0 = r0.m24045unboximpl()
            long r2 = r9.m20409getAnchorPositionInRootF1C5BW0()
            long r0 = androidx.compose.p013ui.geometry.Offset.m24040plusMKHz9U(r2, r0)
        L64:
            r5 = r0
            goto L6d
        L66:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p013ui.geometry.Offset.Companion
            long r0 = r0.m24050getUnspecifiedF1C5BW0()
            goto L64
        L6d:
            androidx.compose.foundation.PlatformMagnifier r0 = r9.magnifier
            if (r0 != 0) goto L74
            r9.recreateMagnifier()
        L74:
            androidx.compose.foundation.PlatformMagnifier r2 = r9.magnifier
            if (r2 == 0) goto L7f
            long r3 = r9.sourceCenterInRoot
            float r7 = r9.zoom
            r2.mo20443updateWko1d7g(r3, r5, r7)
        L7f:
            r9.updateSizeIfNecessary()
            return
        L83:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p013ui.geometry.Offset.Companion
            long r0 = r0.m24050getUnspecifiedF1C5BW0()
            r9.sourceCenterInRoot = r0
            androidx.compose.foundation.PlatformMagnifier r0 = r9.magnifier
            if (r0 == 0) goto L92
            r0.dismiss()
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.updateMagnifier():void");
    }

    private final void updateSizeIfNecessary() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null || IntSize.m27067equalsimpl(platformMagnifier.mo20442getSizeYbymL2g(), this.previousSize)) {
            return;
        }
        InterfaceC10570l interfaceC10570l = this.onSizeChanged;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(DpSize.m26985boximpl(density.mo20495toDpSizekrfVVM(IntSizeKt.m27082toSizeozmzZPI(platformMagnifier.mo20442getSizeYbymL2g()))));
        }
        this.previousSize = IntSize.m27062boximpl(platformMagnifier.mo20442getSizeYbymL2g());
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(Magnifier_androidKt.getMagnifierPositionInRoot(), new InterfaceC10559a() { // from class: androidx.compose.foundation.MagnifierNode.applySemantics.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                return Offset.m24024boximpl(m20418invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0, reason: not valid java name */
            public final long m20418invokeF1C5BW0() {
                return MagnifierNode.this.sourceCenterInRoot;
            }
        });
    }

    @Override // androidx.compose.p013ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        InterfaceC9158a interfaceC9158a = this.drawSignalChannel;
        if (interfaceC9158a != null) {
            C9160c.m16531b(interfaceC9158a.mo27213trySendJP2dKIU(C8736p.f16368a));
        }
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m20410getCornerRadiusD9Ej5fM() {
        return this.cornerRadius;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m20411getElevationD9Ej5fM() {
        return this.elevation;
    }

    public final InterfaceC10570l getMagnifierCenter() {
        return this.magnifierCenter;
    }

    public final InterfaceC10570l getOnSizeChanged() {
        return this.onSizeChanged;
    }

    public final PlatformMagnifierFactory getPlatformMagnifierFactory() {
        return this.platformMagnifierFactory;
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m20412getSizeMYxV2XQ() {
        return this.size;
    }

    public final InterfaceC10570l getSourceCenter() {
        return this.sourceCenter;
    }

    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public final float getZoom() {
        return this.zoom;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.drawSignalChannel = AbstractC9159b.m16529b(0, null, null, 7, null);
        AbstractC8839h.m14861d(getCoroutineScope(), null, CoroutineStart.f17555d, new C11861(null), 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.magnifier = null;
    }

    @Override // androidx.compose.p013ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        setLayoutCoordinates(layoutCoordinates);
    }

    @Override // androidx.compose.p013ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new InterfaceC10559a() { // from class: androidx.compose.foundation.MagnifierNode.onObservedReadsChanged.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m20419invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m20419invoke() {
                MagnifierNode.this.updateMagnifier();
            }
        });
    }

    public final void setClippingEnabled(boolean z10) {
        this.clippingEnabled = z10;
    }

    /* renamed from: setCornerRadius-0680j_4, reason: not valid java name */
    public final void m20413setCornerRadius0680j_4(float f10) {
        this.cornerRadius = f10;
    }

    /* renamed from: setElevation-0680j_4, reason: not valid java name */
    public final void m20414setElevation0680j_4(float f10) {
        this.elevation = f10;
    }

    public final void setMagnifierCenter(InterfaceC10570l interfaceC10570l) {
        this.magnifierCenter = interfaceC10570l;
    }

    public final void setOnSizeChanged(InterfaceC10570l interfaceC10570l) {
        this.onSizeChanged = interfaceC10570l;
    }

    public final void setPlatformMagnifierFactory(PlatformMagnifierFactory platformMagnifierFactory) {
        this.platformMagnifierFactory = platformMagnifierFactory;
    }

    /* renamed from: setSize-EaSLcWc, reason: not valid java name */
    public final void m20415setSizeEaSLcWc(long j10) {
        this.size = j10;
    }

    public final void setSourceCenter(InterfaceC10570l interfaceC10570l) {
        this.sourceCenter = interfaceC10570l;
    }

    public final void setUseTextDefault(boolean z10) {
        this.useTextDefault = z10;
    }

    public final void setZoom(float f10) {
        this.zoom = f10;
    }

    /* renamed from: update-5F03MCQ, reason: not valid java name */
    public final void m20416update5F03MCQ(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, float f10, boolean z10, long j10, float f11, float f12, boolean z11, InterfaceC10570l interfaceC10570l3, PlatformMagnifierFactory platformMagnifierFactory) {
        float f13 = this.zoom;
        long j11 = this.size;
        float f14 = this.cornerRadius;
        boolean z12 = this.useTextDefault;
        float f15 = this.elevation;
        boolean z13 = this.clippingEnabled;
        PlatformMagnifierFactory platformMagnifierFactory2 = this.platformMagnifierFactory;
        View view = this.view;
        Density density = this.density;
        this.sourceCenter = interfaceC10570l;
        this.magnifierCenter = interfaceC10570l2;
        this.zoom = f10;
        this.useTextDefault = z10;
        this.size = j10;
        this.cornerRadius = f11;
        this.elevation = f12;
        this.clippingEnabled = z11;
        this.onSizeChanged = interfaceC10570l3;
        this.platformMagnifierFactory = platformMagnifierFactory;
        View viewRequireView = DelegatableNode_androidKt.requireView(this);
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        if (this.magnifier != null && ((!Magnifier_androidKt.equalsIncludingNaN(f10, f13) && !platformMagnifierFactory.getCanUpdateZoom()) || !DpSize.m26994equalsimpl0(j10, j11) || !C3156Dp.m26904equalsimpl0(f11, f14) || !C3156Dp.m26904equalsimpl0(f12, f15) || z10 != z12 || z11 != z13 || !AbstractC9133u.m16128b(platformMagnifierFactory, platformMagnifierFactory2) || !AbstractC9133u.m16128b(viewRequireView, view) || !AbstractC9133u.m16128b(densityRequireDensity, density))) {
            recreateMagnifier();
        }
        updateMagnifier();
    }

    public /* synthetic */ MagnifierNode(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, PlatformMagnifierFactory platformMagnifierFactory, int i10, AbstractC9126n abstractC9126n) {
        this(interfaceC10570l, (i10 & 2) != 0 ? null : interfaceC10570l2, (i10 & 4) != 0 ? null : interfaceC10570l3, (i10 & 8) != 0 ? Float.NaN : f10, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? DpSize.Companion.m27006getUnspecifiedMYxV2XQ() : j10, (i10 & 64) != 0 ? C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM() : f11, (i10 & 128) != 0 ? C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM() : f12, (i10 & 256) != 0 ? true : z11, (i10 & 512) != 0 ? PlatformMagnifierFactory.Companion.getForCurrentPlatform() : platformMagnifierFactory, null);
    }

    private MagnifierNode(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = interfaceC10570l;
        this.magnifierCenter = interfaceC10570l2;
        this.onSizeChanged = interfaceC10570l3;
        this.zoom = f10;
        this.useTextDefault = z10;
        this.size = j10;
        this.cornerRadius = f11;
        this.elevation = f12;
        this.clippingEnabled = z11;
        this.platformMagnifierFactory = platformMagnifierFactory;
        this.layoutCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.sourceCenterInRoot = Offset.Companion.m24050getUnspecifiedF1C5BW0();
    }
}
