package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.platform.InspectableValueKt;
import androidx.compose.p012ui.platform.InspectorInfo;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.p012ui.unit.DpSize;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.color.utilities.Contrast;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u000b\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0016\u0010\u0012\u001a\u00020\f*\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0016\u0010\u0015\u001a\u00020\f*\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0016\u0010\u0016\u001a\u00020\f*\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u001e\u0010\u0017\u001a\u00020\f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a*\u0010\u001a\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0011\u001a\u001e\u0010\u001e\u001a\u00020\f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0019\u001a*\u0010 \u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0011\u001a\u001e\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0019\u001a&\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0011\u001a\u001e\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a>\u0010*\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001e\u0010/\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019\u001a*\u00101\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011\u001a\u001e\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0019\u001a&\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011\u001a\u001e\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010)\u001a>\u00106\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b7\u0010.\u001a\u001e\u0010%\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010\u0019\u001a*\u00109\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010\u0011\u001a \u0010;\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020?H\u0007\u001a \u0010@\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020A2\b\b\u0002\u0010>\u001a\u00020?H\u0007\u001a \u0010B\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020C2\b\b\u0002\u0010>\u001a\u00020?H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, m13413d2 = {"FillWholeMaxHeight", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxSize", "FillWholeMaxWidth", "WrapContentHeightCenter", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentHeightTop", "WrapContentSizeCenter", "WrapContentSizeTopStart", "WrapContentWidthCenter", "WrapContentWidthStart", "defaultMinSize", "Landroidx/compose/ui/Modifier;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "defaultMinSize-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "fillMaxHeight", "fraction", "", "fillMaxSize", "fillMaxWidth", "height", "height-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "heightIn", "min", "max", "heightIn-VpY3zN4", "requiredHeight", "requiredHeight-3ABfNKs", "requiredHeightIn", "requiredHeightIn-VpY3zN4", "requiredSize", "size", "requiredSize-3ABfNKs", "width", "requiredSize-VpY3zN4", "Landroidx/compose/ui/unit/DpSize;", "requiredSize-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "requiredSizeIn", "maxWidth", "maxHeight", "requiredSizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "requiredWidth", "requiredWidth-3ABfNKs", "requiredWidthIn", "requiredWidthIn-VpY3zN4", "size-3ABfNKs", "size-VpY3zN4", "size-6HolHcs", "sizeIn", "sizeIn-qDBjuR0", "width-3ABfNKs", "widthIn", "widthIn-VpY3zN4", "wrapContentHeight", "align", "Landroidx/compose/ui/Alignment$Vertical;", "unbounded", "", "wrapContentSize", "Landroidx/compose/ui/Alignment;", "wrapContentWidth", "Landroidx/compose/ui/Alignment$Horizontal;", "foundation-layout_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1134:1\n110#2:1135\n110#2:1136\n110#2:1137\n110#2:1138\n110#2:1139\n110#2:1140\n110#2:1141\n110#2:1142\n110#2:1143\n110#2:1144\n110#2:1145\n110#2:1146\n110#2:1147\n110#2:1148\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n68#1:1135\n95#1:1136\n124#1:1137\n154#1:1138\n189#1:1139\n211#1:1140\n240#1:1141\n272#1:1142\n302#1:1143\n334#1:1144\n362#1:1145\n397#1:1146\n420#1:1147\n451#1:1148\n*E\n"})
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
        FillElement.Companion companion = FillElement.INSTANCE;
        FillWholeMaxWidth = companion.width(1.0f);
        FillWholeMaxHeight = companion.height(1.0f);
        FillWholeMaxSize = companion.size(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.INSTANCE;
        Alignment.Companion companion3 = Alignment.INSTANCE;
        WrapContentWidthCenter = companion2.width(companion3.getCenterHorizontally(), false);
        WrapContentWidthStart = companion2.width(companion3.getStart(), false);
        WrapContentHeightCenter = companion2.height(companion3.getCenterVertically(), false);
        WrapContentHeightTop = companion2.height(companion3.getTop(), false);
        WrapContentSizeCenter = companion2.size(companion3.getCenter(), false);
        WrapContentSizeTopStart = companion2.size(companion3.getTopStart(), false);
    }

    @Stable
    /* renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m18145defaultMinSizeVpY3zN4(Modifier modifier, float f10, float f11) {
        return modifier.then(new UnspecifiedConstraintsElement(f10, f11, null));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m18146defaultMinSizeVpY3zN4$default(Modifier modifier, float f10, float f11, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        if ((i9 & 2) != 0) {
            f11 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        return m18145defaultMinSizeVpY3zN4(modifier, f10, f11);
    }

    @Stable
    public static final Modifier fillMaxHeight(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float f10) {
        return modifier.then(f10 == 1.0f ? FillWholeMaxHeight : FillElement.INSTANCE.height(f10));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f10, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = 1.0f;
        }
        return fillMaxHeight(modifier, f10);
    }

    @Stable
    public static final Modifier fillMaxSize(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float f10) {
        return modifier.then(f10 == 1.0f ? FillWholeMaxSize : FillElement.INSTANCE.size(f10));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f10, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = 1.0f;
        }
        return fillMaxSize(modifier, f10);
    }

    @Stable
    public static final Modifier fillMaxWidth(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float f10) {
        return modifier.then(f10 == 1.0f ? FillWholeMaxWidth : FillElement.INSTANCE.width(f10));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f10, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = 1.0f;
        }
        return fillMaxWidth(modifier, f10);
    }

    @Stable
    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m18147height3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new SizeElement(0.0f, f10, 0.0f, f10, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("height");
                inspectorInfo.setValue(C3115Dp.m23992boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    /* renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m18148heightInVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new SizeElement(0.0f, f10, 0.0f, f11, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("heightIn");
                inspectorInfo.getProperties().set("min", C3115Dp.m23992boximpl(f10));
                inspectorInfo.getProperties().set("max", C3115Dp.m23992boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m18149heightInVpY3zN4$default(Modifier modifier, float f10, float f11, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        if ((i9 & 2) != 0) {
            f11 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        return m18148heightInVpY3zN4(modifier, f10, f11);
    }

    @Stable
    /* renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m18150requiredHeight3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new SizeElement(0.0f, f10, 0.0f, f10, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.setValue(C3115Dp.m23992boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    /* renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m18151requiredHeightInVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new SizeElement(0.0f, f10, 0.0f, f11, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredHeightIn");
                inspectorInfo.getProperties().set("min", C3115Dp.m23992boximpl(f10));
                inspectorInfo.getProperties().set("max", C3115Dp.m23992boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m18152requiredHeightInVpY3zN4$default(Modifier modifier, float f10, float f11, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        if ((i9 & 2) != 0) {
            f11 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        return m18151requiredHeightInVpY3zN4(modifier, f10, f11);
    }

    @Stable
    /* renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m18153requiredSize3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new SizeElement(f10, f10, f10, f10, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(C3115Dp.m23992boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final Modifier m18154requiredSize6HolHcs(Modifier modifier, long j9) {
        return m18155requiredSizeVpY3zN4(modifier, DpSize.m24092getWidthD9Ej5fM(j9), DpSize.m24090getHeightD9Ej5fM(j9));
    }

    @Stable
    /* renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m18155requiredSizeVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new SizeElement(f10, f11, f10, f11, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSize");
                inspectorInfo.getProperties().set("width", C3115Dp.m23992boximpl(f10));
                inspectorInfo.getProperties().set("height", C3115Dp.m23992boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m18156requiredSizeInqDBjuR0(Modifier modifier, final float f10, final float f11, final float f12, final float f13) {
        return modifier.then(new SizeElement(f10, f11, f12, f13, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSizeIn");
                inspectorInfo.getProperties().set("minWidth", C3115Dp.m23992boximpl(f10));
                inspectorInfo.getProperties().set("minHeight", C3115Dp.m23992boximpl(f11));
                inspectorInfo.getProperties().set("maxWidth", C3115Dp.m23992boximpl(f12));
                inspectorInfo.getProperties().set("maxHeight", C3115Dp.m23992boximpl(f13));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m18157requiredSizeInqDBjuR0$default(Modifier modifier, float f10, float f11, float f12, float f13, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        if ((i9 & 2) != 0) {
            f11 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        if ((i9 & 4) != 0) {
            f12 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        if ((i9 & 8) != 0) {
            f13 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        return m18156requiredSizeInqDBjuR0(modifier, f10, f11, f12, f13);
    }

    @Stable
    /* renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m18158requiredWidth3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new SizeElement(f10, 0.0f, f10, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(C3115Dp.m23992boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    /* renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m18159requiredWidthInVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new SizeElement(f10, 0.0f, f11, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredWidthIn");
                inspectorInfo.getProperties().set("min", C3115Dp.m23992boximpl(f10));
                inspectorInfo.getProperties().set("max", C3115Dp.m23992boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m18160requiredWidthInVpY3zN4$default(Modifier modifier, float f10, float f11, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        if ((i9 & 2) != 0) {
            f11 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        return m18159requiredWidthInVpY3zN4(modifier, f10, f11);
    }

    @Stable
    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m18161size3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new SizeElement(f10, f10, f10, f10, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("size");
                inspectorInfo.setValue(C3115Dp.m23992boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m18162size6HolHcs(Modifier modifier, long j9) {
        return m18163sizeVpY3zN4(modifier, DpSize.m24092getWidthD9Ej5fM(j9), DpSize.m24090getHeightD9Ej5fM(j9));
    }

    @Stable
    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m18163sizeVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new SizeElement(f10, f11, f10, f11, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("size");
                inspectorInfo.getProperties().set("width", C3115Dp.m23992boximpl(f10));
                inspectorInfo.getProperties().set("height", C3115Dp.m23992boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    /* renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m18164sizeInqDBjuR0(Modifier modifier, final float f10, final float f11, final float f12, final float f13) {
        return modifier.then(new SizeElement(f10, f11, f12, f13, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("sizeIn");
                inspectorInfo.getProperties().set("minWidth", C3115Dp.m23992boximpl(f10));
                inspectorInfo.getProperties().set("minHeight", C3115Dp.m23992boximpl(f11));
                inspectorInfo.getProperties().set("maxWidth", C3115Dp.m23992boximpl(f12));
                inspectorInfo.getProperties().set("maxHeight", C3115Dp.m23992boximpl(f13));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m18165sizeInqDBjuR0$default(Modifier modifier, float f10, float f11, float f12, float f13, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        if ((i9 & 2) != 0) {
            f11 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        if ((i9 & 4) != 0) {
            f12 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        if ((i9 & 8) != 0) {
            f13 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        return m18164sizeInqDBjuR0(modifier, f10, f11, f12, f13);
    }

    @Stable
    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m18166width3ABfNKs(Modifier modifier, final float f10) {
        return modifier.then(new SizeElement(f10, 0.0f, f10, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("width");
                inspectorInfo.setValue(C3115Dp.m23992boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    /* renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m18167widthInVpY3zN4(Modifier modifier, final float f10, final float f11) {
        return modifier.then(new SizeElement(f10, 0.0f, f11, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("widthIn");
                inspectorInfo.getProperties().set("min", C3115Dp.m23992boximpl(f10));
                inspectorInfo.getProperties().set("max", C3115Dp.m23992boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m18168widthInVpY3zN4$default(Modifier modifier, float f10, float f11, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        if ((i9 & 2) != 0) {
            f11 = C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM();
        }
        return m18167widthInVpY3zN4(modifier, f10, f11);
    }

    @Stable
    public static final Modifier wrapContentHeight(Modifier modifier, Alignment.Vertical vertical, boolean z9) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!Intrinsics.areEqual(vertical, companion.getCenterVertically()) || z9) ? (!Intrinsics.areEqual(vertical, companion.getTop()) || z9) ? WrapContentElement.INSTANCE.height(vertical, z9) : WrapContentHeightTop : WrapContentHeightCenter);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            vertical = Alignment.INSTANCE.getCenterVertically();
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return wrapContentHeight(modifier, vertical, z9);
    }

    @Stable
    public static final Modifier wrapContentSize(Modifier modifier, Alignment alignment, boolean z9) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!Intrinsics.areEqual(alignment, companion.getCenter()) || z9) ? (!Intrinsics.areEqual(alignment, companion.getTopStart()) || z9) ? WrapContentElement.INSTANCE.size(alignment, z9) : WrapContentSizeTopStart : WrapContentSizeCenter);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return wrapContentSize(modifier, alignment, z9);
    }

    @Stable
    public static final Modifier wrapContentWidth(Modifier modifier, Alignment.Horizontal horizontal, boolean z9) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!Intrinsics.areEqual(horizontal, companion.getCenterHorizontally()) || z9) ? (!Intrinsics.areEqual(horizontal, companion.getStart()) || z9) ? WrapContentElement.INSTANCE.width(horizontal, z9) : WrapContentWidthStart : WrapContentWidthCenter);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            horizontal = Alignment.INSTANCE.getCenterHorizontally();
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return wrapContentWidth(modifier, horizontal, z9);
    }
}
