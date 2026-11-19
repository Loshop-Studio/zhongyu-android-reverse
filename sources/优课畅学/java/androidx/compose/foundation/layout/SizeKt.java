package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.DpSize;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class SizeKt {
    private static final FillElement FillWholeMaxHeight;
    private static final FillElement FillWholeMaxSize;
    private static final FillElement FillWholeMaxWidth;
    private static final WrapContentElement WrapContentHeightCenter;
    private static final WrapContentElement WrapContentHeightTop;
    private static final WrapContentElement WrapContentSizeCenter;
    private static final WrapContentElement WrapContentSizeTopStart;
    private static final WrapContentElement WrapContentWidthCenter;
    private static final WrapContentElement WrapContentWidthStart;

    static {
        FillElement.Companion companion = FillElement.Companion;
        FillWholeMaxWidth = companion.width(1.0f);
        FillWholeMaxHeight = companion.height(1.0f);
        FillWholeMaxSize = companion.size(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.Companion;
        Alignment.Companion companion3 = Alignment.Companion;
        WrapContentWidthCenter = companion2.width(companion3.getCenterHorizontally(), false);
        WrapContentWidthStart = companion2.width(companion3.getStart(), false);
        WrapContentHeightCenter = companion2.height(companion3.getCenterVertically(), false);
        WrapContentHeightTop = companion2.height(companion3.getTop(), false);
        WrapContentSizeCenter = companion2.size(companion3.getCenter(), false);
        WrapContentSizeTopStart = companion2.size(companion3.getTopStart(), false);
    }

    @Stable
    /* renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m20887defaultMinSizeVpY3zN4(Modifier modifier, float f10, float f11) {
        return modifier.then(new UnspecifiedConstraintsElement(f10, f11, null));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20888defaultMinSizeVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        return m20887defaultMinSizeVpY3zN4(modifier, f10, f11);
    }

    @Stable
    public static final Modifier fillMaxHeight(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10) {
        return modifier.then(f10 == 1.0f ? FillWholeMaxHeight : FillElement.Companion.height(f10));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return fillMaxHeight(modifier, f10);
    }

    @Stable
    public static final Modifier fillMaxSize(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10) {
        return modifier.then(f10 == 1.0f ? FillWholeMaxSize : FillElement.Companion.size(f10));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return fillMaxSize(modifier, f10);
    }

    @Stable
    public static final Modifier fillMaxWidth(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10) {
        return modifier.then(f10 == 1.0f ? FillWholeMaxWidth : FillElement.Companion.width(f10));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return fillMaxWidth(modifier, f10);
    }

    @Stable
    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m20889height3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new SizeElement(0.0f, f10, 0.0f, f10, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("height");
                inspectorInfo.setValue(C3156Dp.m26897boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    /* renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m20890heightInVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new SizeElement(0.0f, f10, 0.0f, f11, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("heightIn");
                inspectorInfo.getProperties().set("min", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("max", C3156Dp.m26897boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20891heightInVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        return m20890heightInVpY3zN4(modifier, f10, f11);
    }

    @Stable
    /* renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m20892requiredHeight3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new SizeElement(0.0f, f10, 0.0f, f10, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.setValue(C3156Dp.m26897boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    /* renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m20893requiredHeightInVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new SizeElement(0.0f, f10, 0.0f, f11, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredHeightIn");
                inspectorInfo.getProperties().set("min", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("max", C3156Dp.m26897boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20894requiredHeightInVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        return m20893requiredHeightInVpY3zN4(modifier, f10, f11);
    }

    @Stable
    /* renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m20895requiredSize3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new SizeElement(f10, f10, f10, f10, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(C3156Dp.m26897boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final Modifier m20896requiredSize6HolHcs(Modifier modifier, long j10) {
        return m20897requiredSizeVpY3zN4(modifier, DpSize.m26997getWidthD9Ej5fM(j10), DpSize.m26995getHeightD9Ej5fM(j10));
    }

    @Stable
    /* renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m20897requiredSizeVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new SizeElement(f10, f11, f10, f11, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSize");
                inspectorInfo.getProperties().set("width", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("height", C3156Dp.m26897boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m20898requiredSizeInqDBjuR0(Modifier modifier, final float f10, final float f11, final float f12, final float f13) {
        return modifier.then(new SizeElement(f10, f11, f12, f13, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSizeIn");
                inspectorInfo.getProperties().set("minWidth", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("minHeight", C3156Dp.m26897boximpl(f11));
                inspectorInfo.getProperties().set("maxWidth", C3156Dp.m26897boximpl(f12));
                inspectorInfo.getProperties().set("maxHeight", C3156Dp.m26897boximpl(f13));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20899requiredSizeInqDBjuR0$default(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f12 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 8) != 0) {
            f13 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        return m20898requiredSizeInqDBjuR0(modifier, f10, f11, f12, f13);
    }

    @Stable
    /* renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m20900requiredWidth3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new SizeElement(f10, 0.0f, f10, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(C3156Dp.m26897boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    /* renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m20901requiredWidthInVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new SizeElement(f10, 0.0f, f11, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredWidthIn");
                inspectorInfo.getProperties().set("min", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("max", C3156Dp.m26897boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20902requiredWidthInVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        return m20901requiredWidthInVpY3zN4(modifier, f10, f11);
    }

    @Stable
    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m20903size3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new SizeElement(f10, f10, f10, f10, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("size");
                inspectorInfo.setValue(C3156Dp.m26897boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m20904size6HolHcs(Modifier modifier, long j10) {
        return m20905sizeVpY3zN4(modifier, DpSize.m26997getWidthD9Ej5fM(j10), DpSize.m26995getHeightD9Ej5fM(j10));
    }

    @Stable
    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m20905sizeVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new SizeElement(f10, f11, f10, f11, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("size");
                inspectorInfo.getProperties().set("width", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("height", C3156Dp.m26897boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m20906sizeInqDBjuR0(Modifier modifier, final float f10, final float f11, final float f12, final float f13) {
        return modifier.then(new SizeElement(f10, f11, f12, f13, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("sizeIn");
                inspectorInfo.getProperties().set("minWidth", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("minHeight", C3156Dp.m26897boximpl(f11));
                inspectorInfo.getProperties().set("maxWidth", C3156Dp.m26897boximpl(f12));
                inspectorInfo.getProperties().set("maxHeight", C3156Dp.m26897boximpl(f13));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20907sizeInqDBjuR0$default(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f12 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 8) != 0) {
            f13 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        return m20906sizeInqDBjuR0(modifier, f10, f11, f12, f13);
    }

    @Stable
    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m20908width3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new SizeElement(f10, 0.0f, f10, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("width");
                inspectorInfo.setValue(C3156Dp.m26897boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    /* renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m20909widthInVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new SizeElement(f10, 0.0f, f11, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("widthIn");
                inspectorInfo.getProperties().set("min", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("max", C3156Dp.m26897boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20910widthInVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        return m20909widthInVpY3zN4(modifier, f10, f11);
    }

    @Stable
    public static final Modifier wrapContentHeight(Modifier modifier, Alignment.Vertical vertical, boolean z10) {
        Alignment.Companion companion = Alignment.Companion;
        return modifier.then((!AbstractC9133u.m16128b(vertical, companion.getCenterVertically()) || z10) ? (!AbstractC9133u.m16128b(vertical, companion.getTop()) || z10) ? WrapContentElement.Companion.height(vertical, z10) : WrapContentHeightTop : WrapContentHeightCenter);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wrapContentHeight(modifier, vertical, z10);
    }

    @Stable
    public static final Modifier wrapContentSize(Modifier modifier, Alignment alignment, boolean z10) {
        Alignment.Companion companion = Alignment.Companion;
        return modifier.then((!AbstractC9133u.m16128b(alignment, companion.getCenter()) || z10) ? (!AbstractC9133u.m16128b(alignment, companion.getTopStart()) || z10) ? WrapContentElement.Companion.size(alignment, z10) : WrapContentSizeTopStart : WrapContentSizeCenter);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wrapContentSize(modifier, alignment, z10);
    }

    @Stable
    public static final Modifier wrapContentWidth(Modifier modifier, Alignment.Horizontal horizontal, boolean z10) {
        Alignment.Companion companion = Alignment.Companion;
        return modifier.then((!AbstractC9133u.m16128b(horizontal, companion.getCenterHorizontally()) || z10) ? (!AbstractC9133u.m16128b(horizontal, companion.getStart()) || z10) ? WrapContentElement.Companion.width(horizontal, z10) : WrapContentWidthStart : WrapContentWidthCenter);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            horizontal = Alignment.Companion.getCenterHorizontally();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wrapContentWidth(modifier, horizontal, z10);
    }
}
