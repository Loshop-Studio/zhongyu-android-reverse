package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.collection.IntIntPair;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.layout.LayoutIdKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.text.PlatformTextStyle;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010#J\u001a\u00107\u001a\u0002052\u0006\u00108\u001a\u000209H\u0004ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\b\u0010<\u001a\u000205H\u0016J\r\u0010=\u001a\u000205H\u0007¢\u0006\u0002\u0010>J\b\u0010?\u001a\u000205H\u0016J&\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010C\u001a\u00020AH\u0002ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ \u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020\u0007H\u0016J,\u0010J\u001a\u00020K2\"\u0010L\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070Mj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`NH\u0002J\u0018\u0010O\u001a\u0002052\u0006\u0010P\u001a\u00020Q2\u0006\u0010O\u001a\u00020RH\u0016J\"\u0010S\u001a\u00020T2\u0006\u0010P\u001a\u00020Q2\u0006\u00108\u001a\u000209H\u0002ø\u0001\u0000¢\u0006\u0004\bU\u0010VJH\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u001c2\u0006\u0010\\\u001a\u00020\u001c2\u0006\u0010]\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020X2\u0006\u0010_\u001a\u00020X2\u0006\u0010`\u001a\u00020\u001c2\u0006\u0010a\u001a\u00020\u0019H\u0002J\u000e\u0010b\u001a\u0002052\u0006\u0010c\u001a\u00020dJ>\u0010e\u001a\u00020f2\u0006\u00108\u001a\u0002092\u0006\u0010g\u001a\u00020h2\u0006\u0010c\u001a\u00020d2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00140j2\u0006\u0010k\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\bl\u0010mJ\r\u0010n\u001a\u000205H\u0000¢\u0006\u0002\boJ\u001f\u0010p\u001a\u000205*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010O\u001a\u00020RH\u0002¢\u0006\u0002\u0010qJ\u0019\u0010r\u001a\u000205*\u00020s2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010tJ\u0012\u0010r\u001a\u000205*\u00020u2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010v\u001a\u000205*\u00020w2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00140jR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020)0\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017R\u0014\u0010+\u001a\u00020,X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u000200X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006x"}, m13558d2 = {"Landroidx/constraintlayout/compose/Measurer;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "computedLayoutResult", "", "designElements", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;", "Lkotlin/collections/ArrayList;", "forcedScaleFactor", "", "getForcedScaleFactor", "()F", "setForcedScaleFactor", "(F)V", "frameCache", "", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/constraintlayout/core/state/WidgetFrame;", "getFrameCache", "()Ljava/util/Map;", "heightConstraintsHolder", "", "lastMeasures", "", "", "layoutCurrentHeight", "getLayoutCurrentHeight", "()I", "layoutCurrentWidth", "getLayoutCurrentWidth", "layoutInformationReceiver", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "getLayoutInformationReceiver", "()Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "setLayoutInformationReceiver", "(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V", "placeables", "Landroidx/compose/ui/layout/Placeable;", "getPlaceables", "root", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "getRoot", "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "state", "Landroidx/constraintlayout/compose/State;", "getState", "()Landroidx/constraintlayout/compose/State;", "widthConstraintsHolder", "addLayoutInformationReceiver", "", "layoutReceiver", "applyRootSize", "constraints", "Landroidx/compose/ui/unit/Constraints;", "applyRootSize-BRTryo0", "(J)V", "computeLayoutResult", "createDesignElements", "(Landroidx/compose/runtime/Composer;I)V", "didMeasures", "getColor", "Landroidx/compose/ui/graphics/Color;", "str", "defaultColor", "getColor-wrIjXm8", "(Ljava/lang/String;J)J", "getDesignInfo", "startX", "startY", "args", "getTextStyle", "Landroidx/compose/ui/text/TextStyle;", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "measure", "constraintWidget", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "measureWidget", "Landroidx/collection/IntIntPair;", "measureWidget-yQShABA", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;J)J", "obtainConstraints", "", "dimensionBehaviour", "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;", TypedValues.Custom.S_DIMENSION, "matchConstraintDefaultDimension", "measureStrategy", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "outConstraints", "parseDesignElements", "constraintSet", "Landroidx/constraintlayout/compose/ConstraintSet;", "performMeasure", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "measurables", "", "optimizationLevel", "performMeasure-2eBlSMk", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;I)J", "resetMeasureState", "resetMeasureState$constraintlayout_compose_release", "copyFrom", "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "drawDebugBounds", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "performLayout", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@Deprecated(message = "Replace with Measurer2 instead for proper Measure/Layout handling.", replaceWith = @ReplaceWith(expression = "Measurer2", imports = {}))
@PublishedApi
@SourceDebugExtension({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/Measurer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2303:1\n1#2:2304\n361#3,7:2305\n33#4,6:2312\n33#4,4:2318\n38#4:2324\n33#4,4:2331\n38#4:2377\n288#5,2:2322\n1225#6,6:2325\n149#7:2335\n149#7:2372\n71#8:2336\n68#8,6:2337\n74#8:2371\n78#8:2376\n79#9,6:2343\n86#9,4:2358\n90#9,2:2368\n94#9:2375\n368#10,9:2349\n377#10:2370\n378#10,2:2373\n4034#11,6:2362\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/Measurer\n*L\n1752#1:2305,7\n1989#1:2312,6\n1996#1:2318,4\n1996#1:2324\n2129#1:2331,4\n2129#1:2377\n2000#1:2322,2\n2078#1:2325,6\n2145#1:2335\n2156#1:2372\n2154#1:2336\n2154#1:2337,6\n2154#1:2371\n2154#1:2376\n2154#1:2343,6\n2154#1:2358,4\n2154#1:2368,2\n2154#1:2375\n2154#1:2349,9\n2154#1:2370\n2154#1:2373,2\n2154#1:2362,6\n*E\n"})
/* loaded from: classes2.dex */
public class Measurer implements BasicMeasure.Measurer, DesignInfoProvider {
    public static final int $stable = 8;
    private String computedLayoutResult = "";
    private ArrayList<ConstraintSetParser.DesignElement> designElements;
    private float forcedScaleFactor;
    private final Map<Measurable, WidgetFrame> frameCache;
    private final int[] heightConstraintsHolder;
    private final Map<String, Integer[]> lastMeasures;
    private LayoutInformationReceiver layoutInformationReceiver;
    private final Map<Measurable, Placeable> placeables;
    private final ConstraintWidgetContainer root;
    private final State state;
    private final int[] widthConstraintsHolder;

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Measurer(Density density) {
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.setMeasurer(this);
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = new State(density);
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
        this.designElements = new ArrayList<>();
    }

    private final void copyFrom(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.measuredWidth);
        numArr[1] = Integer.valueOf(measure.measuredHeight);
        numArr[2] = Integer.valueOf(measure.measuredBaseline);
    }

    /* renamed from: getColor-wrIjXm8, reason: not valid java name */
    private final long m23955getColorwrIjXm8(String str, long defaultColor) {
        if (str != null && StringsKt.startsWith$default((CharSequence) str, '#', false, 2, (Object) null)) {
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (strSubstring.length() == 6) {
                strSubstring = "FF" + strSubstring;
            }
            try {
                return ColorKt.Color((int) Long.parseLong(strSubstring, 16));
            } catch (Exception unused) {
            }
        }
        return defaultColor;
    }

    /* renamed from: getColor-wrIjXm8$default, reason: not valid java name */
    public static /* synthetic */ long m23956getColorwrIjXm8$default(Measurer measurer, String str, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColor-wrIjXm8");
        }
        if ((i10 & 2) != 0) {
            j10 = Color.INSTANCE.m21002getBlack0d7_KjU();
        }
        return measurer.m23955getColorwrIjXm8(str, j10);
    }

    private final TextStyle getTextStyle(HashMap<String, String> params) {
        String str = params.get("size");
        long jM23766getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE();
        if (str != null) {
            jM23766getUnspecifiedXSAIIZE = TextUnitKt.getSp(Float.parseFloat(str));
        }
        return new TextStyle(m23956getColorwrIjXm8$default(this, params.get(TypedValues.Custom.S_COLOR), 0L, 2, null), jM23766getUnspecifiedXSAIIZE, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureWidget-yQShABA, reason: not valid java name */
    private final long m23957measureWidgetyQShABA(ConstraintWidget constraintWidget, long constraints) {
        Object companionWidget = constraintWidget.getCompanionWidget();
        String str = constraintWidget.stringId;
        int i10 = 0;
        if (constraintWidget instanceof VirtualLayout) {
            int i11 = Constraints.m23512getHasFixedWidthimpl(constraints) ? 1073741824 : Constraints.m23510getHasBoundedWidthimpl(constraints) ? Integer.MIN_VALUE : 0;
            if (Constraints.m23511getHasFixedHeightimpl(constraints)) {
                i10 = 1073741824;
            } else if (Constraints.m23509getHasBoundedHeightimpl(constraints)) {
                i10 = Integer.MIN_VALUE;
            }
            VirtualLayout virtualLayout = (VirtualLayout) constraintWidget;
            virtualLayout.measure(i11, Constraints.m23514getMaxWidthimpl(constraints), i10, Constraints.m23513getMaxHeightimpl(constraints));
            return IntIntPair.m16972constructorimpl(virtualLayout.getMeasuredWidth(), virtualLayout.getMeasuredHeight());
        }
        if (companionWidget instanceof Measurable) {
            Placeable placeableMo22324measureBRTryo0 = ((Measurable) companionWidget).mo22324measureBRTryo0(constraints);
            this.placeables.put(companionWidget, placeableMo22324measureBRTryo0);
            return IntIntPair.m16972constructorimpl(placeableMo22324measureBRTryo0.getWidth(), placeableMo22324measureBRTryo0.getHeight());
        }
        Log.w("CCL", "Nothing to measure for widget: " + str);
        return IntIntPair.m16972constructorimpl(0, 0);
    }

    private final boolean obtainConstraints(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int dimension, int matchConstraintDefaultDimension, int measureStrategy, boolean otherDimensionResolved, boolean currentDimensionResolved, int rootMaxConstraint, int[] outConstraints) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i10 == 1) {
            outConstraints[0] = dimension;
            outConstraints[1] = dimension;
            return false;
        }
        if (i10 == 2) {
            outConstraints[0] = 0;
            outConstraints[1] = rootMaxConstraint;
            return true;
        }
        if (i10 == 3) {
            boolean z9 = currentDimensionResolved || ((measureStrategy == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || matchConstraintDefaultDimension != 1 || otherDimensionResolved));
            outConstraints[0] = z9 ? dimension : 0;
            if (!z9) {
                dimension = rootMaxConstraint;
            }
            outConstraints[1] = dimension;
            return !z9;
        }
        if (i10 == 4) {
            outConstraints[0] = rootMaxConstraint;
            outConstraints[1] = rootMaxConstraint;
            return false;
        }
        throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
    }

    public final void addLayoutInformationReceiver(LayoutInformationReceiver layoutReceiver) {
        this.layoutInformationReceiver = layoutReceiver;
        if (layoutReceiver != null) {
            layoutReceiver.setLayoutInformation(this.computedLayoutResult);
        }
    }

    /* renamed from: applyRootSize-BRTryo0, reason: not valid java name */
    public final void m23958applyRootSizeBRTryo0(long constraints) {
        this.root.setWidth(Constraints.m23514getMaxWidthimpl(constraints));
        this.root.setHeight(Constraints.m23513getMaxHeightimpl(constraints));
        this.forcedScaleFactor = Float.NaN;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null && (layoutInformationReceiver == null || layoutInformationReceiver.getForcedWidth() != Integer.MIN_VALUE)) {
            LayoutInformationReceiver layoutInformationReceiver2 = this.layoutInformationReceiver;
            Intrinsics.checkNotNull(layoutInformationReceiver2);
            int forcedWidth = layoutInformationReceiver2.getForcedWidth();
            if (forcedWidth > this.root.getWidth()) {
                this.forcedScaleFactor = this.root.getWidth() / forcedWidth;
            } else {
                this.forcedScaleFactor = 1.0f;
            }
            this.root.setWidth(forcedWidth);
        }
        LayoutInformationReceiver layoutInformationReceiver3 = this.layoutInformationReceiver;
        if (layoutInformationReceiver3 != null) {
            if (layoutInformationReceiver3 == null || layoutInformationReceiver3.getForcedHeight() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver4 = this.layoutInformationReceiver;
                Intrinsics.checkNotNull(layoutInformationReceiver4);
                int forcedHeight = layoutInformationReceiver4.getForcedHeight();
                if (Float.isNaN(this.forcedScaleFactor)) {
                    this.forcedScaleFactor = 1.0f;
                }
                float height = forcedHeight > this.root.getHeight() ? this.root.getHeight() / forcedHeight : 1.0f;
                if (height < this.forcedScaleFactor) {
                    this.forcedScaleFactor = height;
                }
                this.root.setHeight(forcedHeight);
            }
        }
    }

    public void computeLayoutResult() {
        ConstraintWidget constraintWidget;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append("  root: {");
        sb.append("interpolated: { left:  0,");
        sb.append("  top:  0,");
        sb.append("  right:   " + this.root.getWidth() + " ,");
        sb.append("  bottom:  " + this.root.getHeight() + " ,");
        sb.append(" } }");
        ArrayList<ConstraintWidget> children = this.root.getChildren();
        int size = children.size();
        int i10 = 0;
        while (i10 < size) {
            ConstraintWidget constraintWidget2 = children.get(i10);
            i10++;
            ConstraintWidget constraintWidget3 = constraintWidget2;
            Object companionWidget = constraintWidget3.getCompanionWidget();
            if (companionWidget instanceof Measurable) {
                WidgetFrame widgetFrame = null;
                if (constraintWidget3.stringId == null) {
                    Measurable measurable = (Measurable) companionWidget;
                    Object layoutId = LayoutIdKt.getLayoutId(measurable);
                    if (layoutId == null) {
                        layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
                    }
                    constraintWidget3.stringId = layoutId != null ? layoutId.toString() : null;
                }
                WidgetFrame widgetFrame2 = this.frameCache.get(companionWidget);
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.widget) != null) {
                    widgetFrame = constraintWidget.frame;
                }
                if (widgetFrame != null) {
                    sb.append(' ' + constraintWidget3.stringId + ": {");
                    sb.append(" interpolated : ");
                    widgetFrame.serialize(sb, true);
                    sb.append("}, ");
                }
            } else if (constraintWidget3 instanceof Guideline) {
                sb.append(' ' + constraintWidget3.stringId + ": {");
                Guideline guideline = (Guideline) constraintWidget3;
                if (guideline.getOrientation() == 0) {
                    sb.append(" type: 'hGuideline', ");
                } else {
                    sb.append(" type: 'vGuideline', ");
                }
                sb.append(" interpolated: ");
                sb.append(" { left: " + guideline.getX() + ", top: " + guideline.getY() + ", right: " + (guideline.getX() + guideline.getWidth()) + ", bottom: " + (guideline.getY() + guideline.getHeight()) + " }");
                sb.append("}, ");
            }
        }
        sb.append(" }");
        String string = sb.toString();
        this.computedLayoutResult = string;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(string);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void createDesignElements(androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.Measurer.createDesignElements(androidx.compose.runtime.Composer, int):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void didMeasures() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void drawDebugBounds(final BoxScope boxScope, final float f10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(2126574786);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(f10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2126574786, i11, -1, "androidx.constraintlayout.compose.Measurer.drawDebugBounds (ConstraintLayout.kt:2076)");
            }
            Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
            boolean zChangedInstance = ((i11 & 112) == 32) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.constraintlayout.compose.Measurer$drawDebugBounds$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        this.this$0.drawDebugBounds(drawScope, f10);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CanvasKt.Canvas(modifierMatchParentSize, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.Measurer.drawDebugBounds.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    Measurer.this.drawDebugBounds(boxScope, f10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Override // androidx.constraintlayout.compose.DesignInfoProvider
    public String getDesignInfo(int startX, int startY, String args) {
        return ToolingUtilsKt.parseConstraintsToJson(this.root, this.state, startX, startY, args);
    }

    public final float getForcedScaleFactor() {
        return this.forcedScaleFactor;
    }

    public final Map<Measurable, WidgetFrame> getFrameCache() {
        return this.frameCache;
    }

    public final int getLayoutCurrentHeight() {
        return this.root.getHeight();
    }

    public final int getLayoutCurrentWidth() {
        return this.root.getWidth();
    }

    public final LayoutInformationReceiver getLayoutInformationReceiver() {
        return this.layoutInformationReceiver;
    }

    public final Map<Measurable, Placeable> getPlaceables() {
        return this.placeables;
    }

    public final ConstraintWidgetContainer getRoot() {
        return this.root;
    }

    public final State getState() {
        return this.state;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void measure(androidx.constraintlayout.core.widgets.ConstraintWidget r18, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r19) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.Measurer.measure(androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure):void");
    }

    public final void parseDesignElements(ConstraintSet constraintSet) {
        if (constraintSet instanceof JSONConstraintSet) {
            ((JSONConstraintSet) constraintSet).emitDesignElements(this.designElements);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void performLayout(Placeable.PlacementScope placementScope, List<? extends Measurable> list) {
        Measurable measurable;
        Placeable placeable;
        Placeable.PlacementScope placementScope2;
        int i10 = 0;
        if (this.frameCache.isEmpty()) {
            ArrayList<ConstraintWidget> children = this.root.getChildren();
            int size = children.size();
            for (int i11 = 0; i11 < size; i11++) {
                ConstraintWidget constraintWidget = children.get(i11);
                Object companionWidget = constraintWidget.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    this.frameCache.put(companionWidget, new WidgetFrame(constraintWidget.frame.update()));
                }
            }
        }
        int size2 = list.size();
        while (true) {
            if (i10 >= size2) {
                LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
                if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
                    computeLayoutResult();
                    return;
                }
                return;
            }
            Measurable measurable2 = list.get(i10);
            if (this.frameCache.containsKey(measurable2)) {
                measurable = measurable2;
            } else {
                Iterator<T> it = this.frameCache.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Measurable measurable3 = (Measurable) next;
                    if (LayoutIdKt.getLayoutId(measurable3) != null && Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), LayoutIdKt.getLayoutId(measurable2))) {
                        obj = next;
                        break;
                    }
                }
                measurable = (Measurable) obj;
                if (measurable == null) {
                    placementScope2 = placementScope;
                }
                i10++;
                placementScope = placementScope2;
            }
            WidgetFrame widgetFrame = this.frameCache.get(measurable);
            if (widgetFrame == null || (placeable = this.placeables.get(measurable)) == null) {
                return;
            }
            if (this.frameCache.containsKey(measurable2)) {
                placementScope2 = placementScope;
                ConstraintLayoutKt.m23903placeWithFrameTransformKtjjmr4$default(placementScope2, placeable, widgetFrame, 0L, 4, null);
            } else {
                placementScope2 = placementScope;
                ConstraintLayoutKt.m23903placeWithFrameTransformKtjjmr4$default(placementScope2, measurable2.mo22324measureBRTryo0(Constraints.INSTANCE.m23524fixedJhjzzOo(placeable.getWidth(), placeable.getHeight())), widgetFrame, 0L, 4, null);
            }
            i10++;
            placementScope = placementScope2;
        }
    }

    /* renamed from: performMeasure-2eBlSMk, reason: not valid java name */
    public final long m23959performMeasure2eBlSMk(long constraints, LayoutDirection layoutDirection, ConstraintSet constraintSet, List<? extends Measurable> measurables, int optimizationLevel) {
        if (measurables.isEmpty()) {
            return IntSizeKt.IntSize(Constraints.m23516getMinWidthimpl(constraints), Constraints.m23515getMinHeightimpl(constraints));
        }
        this.state.width(Constraints.m23512getHasFixedWidthimpl(constraints) ? androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m23514getMaxWidthimpl(constraints)) : androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m23516getMinWidthimpl(constraints)));
        this.state.height(Constraints.m23511getHasFixedHeightimpl(constraints) ? androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m23513getMaxHeightimpl(constraints)) : androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m23515getMinHeightimpl(constraints)));
        this.state.mParent.getWidth().apply(this.state, this.root, 0);
        this.state.mParent.getHeight().apply(this.state, this.root, 1);
        this.state.m24030setRootIncomingConstraintsBRTryo0(constraints);
        this.state.setRtl(layoutDirection == LayoutDirection.Rtl);
        resetMeasureState$constraintlayout_compose_release();
        if (constraintSet.isDirty(measurables)) {
            this.state.reset();
            constraintSet.applyTo(this.state, measurables);
            ConstraintLayoutKt.buildMapping(this.state, measurables);
            this.state.apply(this.root);
        } else {
            ConstraintLayoutKt.buildMapping(this.state, measurables);
        }
        m23958applyRootSizeBRTryo0(constraints);
        this.root.updateHierarchy();
        this.root.setOptimizationLevel(optimizationLevel);
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        constraintWidgetContainer.measure(constraintWidgetContainer.getOptimizationLevel(), 0, 0, 0, 0, 0, 0, 0, 0);
        return IntSizeKt.IntSize(this.root.getWidth(), this.root.getHeight());
    }

    public final void resetMeasureState$constraintlayout_compose_release() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    public final void setForcedScaleFactor(float f10) {
        this.forcedScaleFactor = f10;
    }

    public final void setLayoutInformationReceiver(LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
    }

    public final void drawDebugBounds(DrawScope drawScope, float f10) {
        float layoutCurrentWidth = getLayoutCurrentWidth() * f10;
        float layoutCurrentHeight = getLayoutCurrentHeight() * f10;
        float fM20804getWidthimpl = (Size.m20804getWidthimpl(drawScope.mo21527getSizeNHjbRc()) - layoutCurrentWidth) / 2.0f;
        float fM20801getHeightimpl = (Size.m20801getHeightimpl(drawScope.mo21527getSizeNHjbRc()) - layoutCurrentHeight) / 2.0f;
        Color.Companion companion = Color.INSTANCE;
        long jM21013getWhite0d7_KjU = companion.m21013getWhite0d7_KjU();
        float f11 = fM20804getWidthimpl + layoutCurrentWidth;
        DrawScope.m21513drawLineNGM6Ib0$default(drawScope, jM21013getWhite0d7_KjU, OffsetKt.Offset(fM20804getWidthimpl, fM20801getHeightimpl), OffsetKt.Offset(f11, fM20801getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        long jOffset = OffsetKt.Offset(f11, fM20801getHeightimpl);
        float f12 = fM20801getHeightimpl + layoutCurrentHeight;
        DrawScope.m21513drawLineNGM6Ib0$default(drawScope, jM21013getWhite0d7_KjU, jOffset, OffsetKt.Offset(f11, f12), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        DrawScope.m21513drawLineNGM6Ib0$default(drawScope, jM21013getWhite0d7_KjU, OffsetKt.Offset(f11, f12), OffsetKt.Offset(fM20804getWidthimpl, f12), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        DrawScope.m21513drawLineNGM6Ib0$default(drawScope, jM21013getWhite0d7_KjU, OffsetKt.Offset(fM20804getWidthimpl, f12), OffsetKt.Offset(fM20804getWidthimpl, fM20801getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        float f13 = 1;
        float f14 = fM20804getWidthimpl + f13;
        float f15 = fM20801getHeightimpl + f13;
        long jM21002getBlack0d7_KjU = companion.m21002getBlack0d7_KjU();
        float f16 = f14 + layoutCurrentWidth;
        DrawScope.m21513drawLineNGM6Ib0$default(drawScope, jM21002getBlack0d7_KjU, OffsetKt.Offset(f14, f15), OffsetKt.Offset(f16, f15), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        float f17 = f15 + layoutCurrentHeight;
        DrawScope.m21513drawLineNGM6Ib0$default(drawScope, jM21002getBlack0d7_KjU, OffsetKt.Offset(f16, f15), OffsetKt.Offset(f16, f17), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        DrawScope.m21513drawLineNGM6Ib0$default(drawScope, jM21002getBlack0d7_KjU, OffsetKt.Offset(f16, f17), OffsetKt.Offset(f14, f17), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        DrawScope.m21513drawLineNGM6Ib0$default(drawScope, jM21002getBlack0d7_KjU, OffsetKt.Offset(f14, f17), OffsetKt.Offset(f14, f15), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
    }
}
