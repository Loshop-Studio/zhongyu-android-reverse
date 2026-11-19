package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.collection.IntIntPair;
import androidx.compose.p013ui.layout.LayoutIdKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u001eJ\u001a\u00105\u001a\u0002032\u0006\u00106\u001a\u000207H\u0004ø\u0001\u0000¢\u0006\u0004\b8\u00109J\b\u0010:\u001a\u000203H\u0016J\b\u0010;\u001a\u000203H\u0016J \u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u0007H\u0016J\u0018\u0010@\u001a\u0002032\u0006\u0010A\u001a\u00020B2\u0006\u0010@\u001a\u00020CH\u0016J\"\u0010D\u001a\u00020E2\u0006\u0010A\u001a\u00020B2\u0006\u00106\u001a\u000207H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010GJH\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\u00172\u0006\u0010O\u001a\u00020I2\u0006\u0010P\u001a\u00020I2\u0006\u0010Q\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u0014H\u0002JR\u0010S\u001a\u00020T2\u0006\u00106\u001a\u0002072\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020$0Z2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u000f2\u0006\u0010\\\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u000203H\u0000¢\u0006\u0002\b`J\u001f\u0010a\u001a\u000203*\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010@\u001a\u00020CH\u0002¢\u0006\u0002\u0010bJ,\u0010c\u001a\u000203*\u00020d2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020$0Z2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u000fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u000e\u00101\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e"}, m13558d2 = {"Landroidx/constraintlayout/compose/Measurer2;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "computedLayoutResult", "", "forcedScaleFactor", "", "getForcedScaleFactor", "()F", "setForcedScaleFactor", "(F)V", "frameCache", "", "Landroidx/constraintlayout/core/state/WidgetFrame;", "getFrameCache", "()Ljava/util/Map;", "heightConstraintsHolder", "", "lastMeasures", "", "", "layoutCurrentHeight", "getLayoutCurrentHeight", "()I", "layoutCurrentWidth", "getLayoutCurrentWidth", "layoutInformationReceiver", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "getLayoutInformationReceiver", "()Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "setLayoutInformationReceiver", "(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V", "placeables", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "getPlaceables", "setPlaceables", "(Ljava/util/Map;)V", "root", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "getRoot", "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "state", "Landroidx/constraintlayout/compose/State;", "getState", "()Landroidx/constraintlayout/compose/State;", "widthConstraintsHolder", "addLayoutInformationReceiver", "", "layoutReceiver", "applyRootSize", "constraints", "Landroidx/compose/ui/unit/Constraints;", "applyRootSize-BRTryo0", "(J)V", "computeLayoutResult", "didMeasures", "getDesignInfo", "startX", "startY", "args", "measure", "constraintWidget", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "measureWidget", "Landroidx/collection/IntIntPair;", "measureWidget-yQShABA", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;J)J", "obtainConstraints", "", "dimensionBehaviour", "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;", TypedValues.Custom.S_DIMENSION, "matchConstraintDefaultDimension", "measureStrategy", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "outConstraints", "performMeasure", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "constraintSet", "Landroidx/constraintlayout/compose/ConstraintSet;", "measurables", "", "placeableMap", "optimizationLevel", "performMeasure-DjhGOtQ", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;Ljava/util/Map;I)J", "resetMeasureState", "resetMeasureState$constraintlayout_compose_release", "copyFrom", "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "performLayout", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Measurer.kt\nandroidx/constraintlayout/compose/Measurer2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,527:1\n1#2:528\n361#3,7:529\n33#4,6:536\n33#4,6:542\n*S KotlinDebug\n*F\n+ 1 Measurer.kt\nandroidx/constraintlayout/compose/Measurer2\n*L\n215#1:529,7\n458#1:536,6\n465#1:542,6\n*E\n"})
/* loaded from: classes2.dex */
public class Measurer2 implements BasicMeasure.Measurer, DesignInfoProvider {
    public static final int $stable = 8;
    private String computedLayoutResult = "";
    private float forcedScaleFactor;
    private final Map<String, WidgetFrame> frameCache;
    private final int[] heightConstraintsHolder;
    private final Map<String, Integer[]> lastMeasures;
    private LayoutInformationReceiver layoutInformationReceiver;
    private Map<Measurable, Placeable> placeables;
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

    public Measurer2(Density density) {
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
    }

    private final void copyFrom(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.measuredWidth);
        numArr[1] = Integer.valueOf(measure.measuredHeight);
        numArr[2] = Integer.valueOf(measure.measuredBaseline);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureWidget-yQShABA, reason: not valid java name */
    private final long m23960measureWidgetyQShABA(ConstraintWidget constraintWidget, long constraints) {
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
    public final void m23961applyRootSizeBRTryo0(long constraints) {
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
                WidgetFrame widgetFrame2 = this.frameCache.get(MeasurerKt.getAnyOrNullId((Measurable) companionWidget));
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

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void didMeasures() {
    }

    @Override // androidx.constraintlayout.compose.DesignInfoProvider
    public String getDesignInfo(int startX, int startY, String args) {
        return ToolingUtilsKt.parseConstraintsToJson(this.root, this.state, startX, startY, args);
    }

    public final float getForcedScaleFactor() {
        return this.forcedScaleFactor;
    }

    public final Map<String, WidgetFrame> getFrameCache() {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.Measurer2.measure(androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure):void");
    }

    public final void performLayout(Placeable.PlacementScope placementScope, List<? extends Measurable> list, Map<Measurable, Placeable> map) {
        Placeable placeable;
        Placeable.PlacementScope placementScope2;
        this.placeables = map;
        int i10 = 0;
        if (this.frameCache.isEmpty()) {
            ArrayList<ConstraintWidget> children = this.root.getChildren();
            int size = children.size();
            for (int i11 = 0; i11 < size; i11++) {
                ConstraintWidget constraintWidget = children.get(i11);
                Object companionWidget = constraintWidget.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    this.frameCache.put(MeasurerKt.getAnyOrNullId((Measurable) companionWidget), new WidgetFrame(constraintWidget.frame.update()));
                }
            }
        }
        int size2 = list.size();
        while (i10 < size2) {
            Measurable measurable = list.get(i10);
            WidgetFrame widgetFrame = this.frameCache.get(MeasurerKt.getAnyOrNullId(measurable));
            if (widgetFrame == null || (placeable = this.placeables.get(measurable)) == null) {
                placementScope2 = placementScope;
            } else {
                placementScope2 = placementScope;
                ConstraintLayoutKt.m23903placeWithFrameTransformKtjjmr4$default(placementScope2, placeable, widgetFrame, 0L, 4, null);
            }
            i10++;
            placementScope = placementScope2;
        }
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    /* renamed from: performMeasure-DjhGOtQ, reason: not valid java name */
    public final long m23962performMeasureDjhGOtQ(long constraints, LayoutDirection layoutDirection, ConstraintSet constraintSet, List<? extends Measurable> measurables, Map<Measurable, Placeable> placeableMap, int optimizationLevel) {
        this.placeables = placeableMap;
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
        m23961applyRootSizeBRTryo0(constraints);
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

    public final void setPlaceables(Map<Measurable, Placeable> map) {
        this.placeables = map;
    }
}
