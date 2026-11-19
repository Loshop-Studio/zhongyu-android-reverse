package androidx.constraintlayout.compose;

import android.graphics.Matrix;
import androidx.autofill.HintConstants;
import androidx.compose.p009ui.geometry.OffsetKt;
import androidx.compose.p009ui.geometry.Size;
import androidx.compose.p009ui.geometry.SizeKt;
import androidx.compose.p009ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p009ui.graphics.AndroidPath_androidKt;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.graphics.ColorKt;
import androidx.compose.p009ui.graphics.Path;
import androidx.compose.p009ui.graphics.PathEffect;
import androidx.compose.p009ui.graphics.drawscope.DrawScope;
import androidx.compose.p009ui.graphics.drawscope.Stroke;
import androidx.compose.p009ui.layout.LayoutIdKt;
import androidx.compose.p009ui.layout.Measurable;
import androidx.compose.p009ui.layout.Placeable;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.p009ui.unit.Constraints;
import androidx.compose.p009ui.unit.Density;
import androidx.compose.p009ui.unit.IntSizeKt;
import androidx.compose.p009ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.CorePixelDp;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
@Metadata(m7879d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0016J4\u0010\u0012\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015J+\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u00020\b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\bJ.\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\bJ8\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020(2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00103\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105J,\u00106\u001a\u00020\u00062\u0006\u00103\u001a\u00020\n2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<J|\u0010=\u001a\u00020>2\u0006\u00103\u001a\u00020\n2\u0006\u0010*\u001a\u00020+2\u0006\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020,2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020C0B2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010D\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:ø\u0001\u0000¢\u0006\u0004\bE\u0010FJb\u0010G\u001a\u00020\u00102\u0006\u00103\u001a\u00020\n2\u0006\u0010*\u001a\u00020+2\u0006\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020(2\b\u0010\u000b\u001a\u0004\u0018\u00010,2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010H\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ(\u0010K\u001a\u00020\u0010*\u00020L2\b\b\u0002\u0010M\u001a\u00020\u00062\b\b\u0002\u0010N\u001a\u00020\u00062\b\b\u0002\u0010O\u001a\u00020\u0006J.\u0010P\u001a\u00020\u0010*\u00020L2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\bV\u0010WJF\u0010X\u001a\u00020\u0010*\u00020L2\u0006\u0010Y\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\b2\u0006\u0010[\u001a\u00020R2\u0006\u0010\\\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b]\u0010^J4\u0010N\u001a\u00020\u0010*\u00020L2\u0006\u0010Y\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\b2\u0006\u0010[\u001a\u00020R2\u0006\u0010_\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, m7880d2 = {"Landroidx/constraintlayout/compose/MotionMeasurer;", "Landroidx/constraintlayout/compose/Measurer2;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "DEBUG", "", "lastProgressInInterpolation", "", "oldConstraints", "Landroidx/compose/ui/unit/Constraints;", "transition", "Landroidx/constraintlayout/core/state/Transition;", "getTransition", "()Landroidx/constraintlayout/core/state/Transition;", "clearConstraintSets", "", "computeLayoutResult", "encodeKeyFrames", "json", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", RequestParameters.SUBRESOURCE_LOCATION, "", "types", "", "progress", "count", "", "encodeRoot", "getCustomColor", "Landroidx/compose/ui/graphics/Color;", "id", "", HintConstants.AUTOFILL_HINT_NAME, "getCustomColor-XeAY9LY", "(Ljava/lang/String;Ljava/lang/String;F)J", "getCustomFloat", "initWith", "start", "Landroidx/constraintlayout/compose/ConstraintSet;", "end", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/constraintlayout/compose/TransitionImpl;", "measureConstraintSet", "optimizationLevel", "constraintSet", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measureConstraintSet--hBUhpc", "(ILandroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;J)V", "needsRemeasure", "source", "Landroidx/constraintlayout/compose/CompositionSource;", "invalidateOnConstraintsCallback", "Landroidx/constraintlayout/compose/ShouldInvalidateCallback;", "needsRemeasure-NN6Ew-U", "(JLandroidx/constraintlayout/compose/CompositionSource;Landroidx/constraintlayout/compose/ShouldInvalidateCallback;)Z", "performInterpolationMeasure", "Landroidx/compose/ui/unit/IntSize;", "constraintSetStart", "constraintSetEnd", "placeableMap", "", "Landroidx/compose/ui/layout/Placeable;", "compositionSource", "performInterpolationMeasure-LzAeyeM", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Ljava/util/List;Ljava/util/Map;IFLandroidx/constraintlayout/compose/CompositionSource;Landroidx/constraintlayout/compose/ShouldInvalidateCallback;)J", "recalculateInterpolation", "remeasure", "recalculateInterpolation-36Wf7g4", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Ljava/util/List;IFZ)V", "drawDebug", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawBounds", "drawPaths", "drawKeyPositions", "drawFrame", TypedValues.AttributesType.S_FRAME, "Landroidx/constraintlayout/core/state/WidgetFrame;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", TypedValues.Custom.S_COLOR, "drawFrame-g2O1Hgs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V", "drawFrameDebug", "parentWidth", "parentHeight", "startFrame", "endFrame", "drawFrameDebug-PE3pjmc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLandroidx/constraintlayout/core/state/WidgetFrame;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V", "drawPath", "constraintlayout-compose_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMotionMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionMeasurer.kt\nandroidx/constraintlayout/compose/MotionMeasurer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,581:1\n33#2,6:582\n33#2,6:588\n33#2,6:594\n33#2,6:600\n33#2,4:606\n38#2:617\n128#3,7:610\n1#4:618\n169#5:619\n*S KotlinDebug\n*F\n+ 1 MotionMeasurer.kt\nandroidx/constraintlayout/compose/MotionMeasurer\n*L\n63#1:582,6\n69#1:588,6\n224#1:594,6\n289#1:600,6\n330#1:606,4\n330#1:617\n337#1:610,7\n48#1:619\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionMeasurer extends Measurer2 {
    public static final int $stable = 8;
    private final boolean DEBUG;
    private float lastProgressInInterpolation;
    private Constraints oldConstraints;
    private final androidx.constraintlayout.core.state.Transition transition;

    public MotionMeasurer(final Density density) {
        super(density);
        this.transition = new androidx.constraintlayout.core.state.Transition(new CorePixelDp() { // from class: androidx.constraintlayout.compose.b
            @Override // androidx.constraintlayout.core.state.CorePixelDp
            public final float toPixels(float f6) {
                return MotionMeasurer.transition$lambda$1(density, f6);
            }
        });
    }

    public static /* synthetic */ void drawDebug$default(MotionMeasurer motionMeasurer, DrawScope drawScope, boolean z6, boolean z7, boolean z8, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        if ((i6 & 2) != 0) {
            z7 = true;
        }
        if ((i6 & 4) != 0) {
            z8 = true;
        }
        motionMeasurer.drawDebug(drawScope, z6, z7, z8);
    }

    /* renamed from: drawFrame-g2O1Hgs, reason: not valid java name */
    private final void m16920drawFrameg2O1Hgs(DrawScope drawScope, WidgetFrame widgetFrame, PathEffect pathEffect, long j6) {
        if (widgetFrame.isDefaultTransform()) {
            DrawScope.m14444drawRectnJ9OG0$default(drawScope, j6, OffsetKt.Offset(widgetFrame.left, widgetFrame.top), SizeKt.Size(widgetFrame.width(), widgetFrame.height()), 0.0f, new Stroke(3.0f, 0.0f, 0, 0, pathEffect, 14, null), null, 0, 104, null);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(widgetFrame.rotationZ)) {
            matrix.preRotate(widgetFrame.rotationZ, widgetFrame.centerX(), widgetFrame.centerY());
        }
        matrix.preScale(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX, Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY, widgetFrame.centerX(), widgetFrame.centerY());
        int i6 = widgetFrame.left;
        int i7 = widgetFrame.top;
        int i8 = widgetFrame.right;
        int i9 = widgetFrame.bottom;
        float[] fArr = {i6, i7, i8, i7, i8, i9, i6, i9};
        matrix.mapPoints(fArr);
        DrawScope.m14436drawLineNGM6Ib0$default(drawScope, j6, OffsetKt.Offset(fArr[0], fArr[1]), OffsetKt.Offset(fArr[2], fArr[3]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.m14436drawLineNGM6Ib0$default(drawScope, j6, OffsetKt.Offset(fArr[2], fArr[3]), OffsetKt.Offset(fArr[4], fArr[5]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.m14436drawLineNGM6Ib0$default(drawScope, j6, OffsetKt.Offset(fArr[4], fArr[5]), OffsetKt.Offset(fArr[6], fArr[7]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.m14436drawLineNGM6Ib0$default(drawScope, j6, OffsetKt.Offset(fArr[6], fArr[7]), OffsetKt.Offset(fArr[0], fArr[1]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
    }

    /* renamed from: drawFrameDebug-PE3pjmc, reason: not valid java name */
    private final void m16921drawFrameDebugPE3pjmc(DrawScope drawScope, float f6, float f7, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, PathEffect pathEffect, long j6) {
        m16920drawFrameg2O1Hgs(drawScope, widgetFrame, pathEffect, j6);
        m16920drawFrameg2O1Hgs(drawScope, widgetFrame2, pathEffect, j6);
        int numberKeyPositions = this.transition.getNumberKeyPositions(widgetFrame);
        new MotionRenderDebug(23.0f).draw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()), this.transition.getMotion(widgetFrame.widget.stringId), 1000, 1, (int) f6, (int) f7);
        if (numberKeyPositions == 0) {
            return;
        }
        float[] fArr = new float[numberKeyPositions];
        float[] fArr2 = new float[numberKeyPositions];
        float[] fArr3 = new float[numberKeyPositions];
        this.transition.fillKeyPositions(widgetFrame, fArr, fArr2, fArr3);
        int i6 = 1;
        int i7 = numberKeyPositions - 1;
        if (i7 < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            float f8 = fArr3[i8] / 100.0f;
            float f9 = i6 - f8;
            float fWidth = (widgetFrame.width() * f9) + (widgetFrame2.width() * f8);
            float fHeight = (f9 * widgetFrame.height()) + (f8 * widgetFrame2.height());
            float f10 = (fArr[i8] * f6) + (fWidth / 2.0f);
            float f11 = (fArr2[i8] * f7) + (fHeight / 2.0f);
            Path Path = AndroidPath_androidKt.Path();
            Path.moveTo(f10 - 20.0f, f11);
            Path.lineTo(f10, f11 + 20.0f);
            Path.lineTo(f10 + 20.0f, f11);
            Path.lineTo(f10, f11 - 20.0f);
            Path.close();
            int i9 = i8;
            DrawScope.m14440drawPathLG529CI$default(drawScope, Path, j6, 1.0f, new Stroke(3.0f, 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
            if (i9 == i7) {
                return;
            }
            i8 = i9 + 1;
            i6 = 1;
        }
    }

    private final void drawPaths(DrawScope drawScope, float f6, float f7, WidgetFrame widgetFrame, boolean z6, boolean z7) {
        new MotionRenderDebug(23.0f).basicDraw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()), this.transition.getMotion(widgetFrame.widget.stringId), 1000, (int) f6, (int) f7, z6, z7);
    }

    private final void encodeKeyFrames(StringBuilder json, float[] location, int[] types, int[] progress, int count) {
        if (count == 0) {
            return;
        }
        json.append("keyTypes : [");
        for (int i6 = 0; i6 < count; i6++) {
            int i7 = types[i6];
            StringBuilder sb = new StringBuilder();
            sb.append(' ');
            sb.append(i7);
            sb.append(',');
            json.append(sb.toString());
        }
        json.append("],\n");
        json.append("keyPos : [");
        int i8 = count * 2;
        for (int i9 = 0; i9 < i8; i9++) {
            float f6 = location[i9];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            sb2.append(f6);
            sb2.append(',');
            json.append(sb2.toString());
        }
        json.append("],\n ");
        json.append("keyFrames : [");
        for (int i10 = 0; i10 < count; i10++) {
            int i11 = progress[i10];
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            sb3.append(i11);
            sb3.append(',');
            json.append(sb3.toString());
        }
        json.append("],\n ");
    }

    /* renamed from: measureConstraintSet--hBUhpc, reason: not valid java name */
    private final void m16922measureConstraintSethBUhpc(int optimizationLevel, ConstraintSet constraintSet, List<? extends Measurable> measurables, long constraints) {
        String string;
        Object layoutId;
        getState().reset();
        constraintSet.applyTo(getState(), measurables);
        ConstraintLayoutKt.buildMapping(getState(), measurables);
        getState().apply(getRoot());
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        int size = children.size();
        for (int i6 = 0; i6 < size; i6++) {
            children.get(i6).setAnimated(true);
        }
        m16884applyRootSizeBRTryo0(constraints);
        getRoot().updateHierarchy();
        if (this.DEBUG) {
            getRoot().setDebugName("ConstraintLayout");
            ArrayList<ConstraintWidget> children2 = getRoot().getChildren();
            int size2 = children2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ConstraintWidget constraintWidget = children2.get(i7);
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                if (measurable == null || (layoutId = LayoutIdKt.getLayoutId(measurable)) == null || (string = layoutId.toString()) == null) {
                    string = "NOTAG";
                }
                constraintWidget.setDebugName(string);
            }
        }
        getRoot().setOptimizationLevel(optimizationLevel);
        getRoot().measure(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    /* renamed from: needsRemeasure-NN6Ew-U, reason: not valid java name */
    private final boolean m16923needsRemeasureNN6EwU(long constraints, CompositionSource source, ShouldInvalidateCallback invalidateOnConstraintsCallback) {
        if (this.transition.isEmpty() || getFrameCache().isEmpty()) {
            return true;
        }
        Constraints constraints2 = this.oldConstraints;
        if (constraints2 != null && invalidateOnConstraintsCallback != null) {
            Intrinsics.checkNotNull(constraints2);
            if (invalidateOnConstraintsCallback.mo16863invokeN9IONVI(constraints2.getValue(), constraints)) {
                return true;
            }
        } else if ((Constraints.m16434getHasFixedHeightimpl(constraints) && !getState().sameFixedHeight(Constraints.m16436getMaxHeightimpl(constraints))) || (Constraints.m16435getHasFixedWidthimpl(constraints) && !getState().sameFixedWidth(Constraints.m16437getMaxWidthimpl(constraints)))) {
            return true;
        }
        return source == CompositionSource.Content;
    }

    /* renamed from: recalculateInterpolation-36Wf7g4, reason: not valid java name */
    private final void m16924recalculateInterpolation36Wf7g4(long constraints, LayoutDirection layoutDirection, ConstraintSet constraintSetStart, ConstraintSet constraintSetEnd, TransitionImpl transition, List<? extends Measurable> measurables, int optimizationLevel, float progress, boolean remeasure) {
        WidgetFrame interpolated;
        this.lastProgressInInterpolation = progress;
        int i6 = 0;
        if (remeasure) {
            this.transition.clear();
            resetMeasureState$constraintlayout_compose_release();
            getState().width(Constraints.m16435getHasFixedWidthimpl(constraints) ? androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m16437getMaxWidthimpl(constraints)) : androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m16439getMinWidthimpl(constraints)));
            getState().height(Constraints.m16434getHasFixedHeightimpl(constraints) ? androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m16436getMaxHeightimpl(constraints)) : androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m16438getMinHeightimpl(constraints)));
            getState().m16953setRootIncomingConstraintsBRTryo0(constraints);
            getState().setRtl(layoutDirection == LayoutDirection.Rtl);
            m16922measureConstraintSethBUhpc(optimizationLevel, constraintSetStart, measurables, constraints);
            this.transition.updateFrom(getRoot(), 0);
            m16922measureConstraintSethBUhpc(optimizationLevel, constraintSetEnd, measurables, constraints);
            this.transition.updateFrom(getRoot(), 1);
            if (transition != null) {
                transition.applyKeyFramesTo(this.transition);
            }
        } else {
            ConstraintLayoutKt.buildMapping(getState(), measurables);
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), progress);
        getRoot().setWidth(this.transition.getInterpolatedWidth());
        getRoot().setHeight(this.transition.getInterpolatedHeight());
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        int size = children.size();
        while (true) {
            if (i6 >= size) {
                break;
            }
            ConstraintWidget constraintWidget = children.get(i6);
            Object companionWidget = constraintWidget.getCompanionWidget();
            Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
            if (measurable != null && (interpolated = this.transition.getInterpolated(constraintWidget)) != null) {
                getPlaceables().put(measurable, measurable.mo15247measureBRTryo0(Constraints.INSTANCE.m16447fixedJhjzzOo(interpolated.width(), interpolated.height())));
                getFrameCache().put(MeasurerKt.getAnyOrNullId(measurable), interpolated);
            }
            i6++;
        }
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float transition$lambda$1(Density density, float f6) {
        return density.mo10255toPx0680j_4(C2452Dp.m16484constructorimpl(f6));
    }

    public final void clearConstraintSets() {
        this.transition.clear();
        getFrameCache().clear();
    }

    @Override // androidx.constraintlayout.compose.Measurer2
    public void computeLayoutResult() {
        MotionMeasurer motionMeasurer = this;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        motionMeasurer.encodeRoot(sb);
        int[] iArr = new int[50];
        int[] iArr2 = new int[50];
        float[] fArr = new float[100];
        ArrayList<ConstraintWidget> children = motionMeasurer.getRoot().getChildren();
        int size = children.size();
        int i6 = 0;
        while (i6 < size) {
            ConstraintWidget constraintWidget = children.get(i6);
            WidgetFrame start = motionMeasurer.transition.getStart(constraintWidget.stringId);
            WidgetFrame end = motionMeasurer.transition.getEnd(constraintWidget.stringId);
            WidgetFrame interpolated = motionMeasurer.transition.getInterpolated(constraintWidget.stringId);
            float[] path = motionMeasurer.transition.getPath(constraintWidget.stringId);
            int keyFrames = motionMeasurer.transition.getKeyFrames(constraintWidget.stringId, fArr, iArr, iArr2);
            sb.append(' ' + constraintWidget.stringId + ": {");
            sb.append(" interpolated : ");
            interpolated.serialize(sb, true);
            sb.append(", start : ");
            start.serialize(sb);
            sb.append(", end : ");
            end.serialize(sb);
            motionMeasurer.encodeKeyFrames(sb, fArr, iArr, iArr2, keyFrames);
            sb.append(" path : [");
            for (float f6 : path) {
                sb.append(' ' + f6 + " ,");
            }
            sb.append(" ] ");
            sb.append("}, ");
            i6++;
            motionMeasurer = this;
        }
        sb.append(" }");
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(sb.toString());
        }
    }

    public final void drawDebug(DrawScope drawScope, boolean z6, boolean z7, boolean z8) {
        WidgetFrame widgetFrame;
        PathEffect pathEffect;
        PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        int size = children.size();
        int i6 = 0;
        while (i6 < size) {
            ConstraintWidget constraintWidget = children.get(i6);
            WidgetFrame start = this.transition.getStart(constraintWidget);
            WidgetFrame end = this.transition.getEnd(constraintWidget);
            if (z6) {
                Color.Companion companion = Color.INSTANCE;
                m16920drawFrameg2O1Hgs(drawScope, start, pathEffectDashPathEffect, companion.m13926getBlue0d7_KjU());
                m16920drawFrameg2O1Hgs(drawScope, end, pathEffectDashPathEffect, companion.m13926getBlue0d7_KjU());
                drawScope.getDrawContext().getTransform().translate(2.0f, 2.0f);
                try {
                    m16920drawFrameg2O1Hgs(drawScope, start, pathEffectDashPathEffect, companion.m13936getWhite0d7_KjU());
                    widgetFrame = start;
                    m16920drawFrameg2O1Hgs(drawScope, end, pathEffectDashPathEffect, companion.m13936getWhite0d7_KjU());
                    pathEffect = pathEffectDashPathEffect;
                } finally {
                    drawScope.getDrawContext().getTransform().translate(-2.0f, -2.0f);
                }
            } else {
                widgetFrame = start;
                pathEffect = pathEffectDashPathEffect;
            }
            drawPaths(drawScope, Size.m13727getWidthimpl(drawScope.mo14450getSizeNHjbRc()), Size.m13724getHeightimpl(drawScope.mo14450getSizeNHjbRc()), widgetFrame, z7, z8);
            i6++;
            pathEffectDashPathEffect = pathEffect;
        }
    }

    public final void encodeRoot(StringBuilder json) {
        json.append("  root: {");
        json.append("interpolated: { left:  0,");
        json.append("  top:  0,");
        json.append("  right:   " + getRoot().getWidth() + " ,");
        json.append("  bottom:  " + getRoot().getHeight() + " ,");
        json.append(" } }");
    }

    /* renamed from: getCustomColor-XeAY9LY, reason: not valid java name */
    public final long m16925getCustomColorXeAY9LY(String id, String name, float progress) {
        if (!this.transition.contains(id)) {
            return Color.INSTANCE.m13935getUnspecified0d7_KjU();
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), progress);
        WidgetFrame interpolated = this.transition.getInterpolated(id);
        return !interpolated.containsCustom(name) ? Color.INSTANCE.m13935getUnspecified0d7_KjU() : ColorKt.Color(interpolated.getCustomColor(name));
    }

    public final float getCustomFloat(String id, String name, float progress) {
        if (!this.transition.contains(id)) {
            return Float.NaN;
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), progress);
        return this.transition.getInterpolated(id).getCustomFloat(name);
    }

    public final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.transition;
    }

    public final void initWith(ConstraintSet start, ConstraintSet end, LayoutDirection layoutDirection, TransitionImpl transition, float progress) {
        clearConstraintSets();
        getState().setRtl(layoutDirection == LayoutDirection.Rtl);
        start.applyTo(getState(), CollectionsKt.emptyList());
        start.applyTo(this.transition, 0);
        getState().apply(getRoot());
        this.transition.updateFrom(getRoot(), 0);
        start.applyTo(getState(), CollectionsKt.emptyList());
        end.applyTo(this.transition, 1);
        getState().apply(getRoot());
        this.transition.updateFrom(getRoot(), 1);
        this.transition.interpolate(0, 0, progress);
        transition.applyAllTo(this.transition);
    }

    /* renamed from: performInterpolationMeasure-LzAeyeM, reason: not valid java name */
    public final long m16926performInterpolationMeasureLzAeyeM(long constraints, LayoutDirection layoutDirection, ConstraintSet constraintSetStart, ConstraintSet constraintSetEnd, TransitionImpl transition, List<? extends Measurable> measurables, Map<Measurable, Placeable> placeableMap, int optimizationLevel, float progress, CompositionSource compositionSource, ShouldInvalidateCallback invalidateOnConstraintsCallback) {
        long j6;
        MotionMeasurer motionMeasurer;
        LayoutInformationReceiver layoutInformationReceiver;
        LayoutInformationReceiver layoutInformationReceiver2;
        setPlaceables(placeableMap);
        boolean zM16923needsRemeasureNN6EwU = m16923needsRemeasureNN6EwU(constraints, compositionSource, invalidateOnConstraintsCallback);
        if (this.lastProgressInInterpolation != progress || ((((layoutInformationReceiver = getLayoutInformationReceiver()) == null || layoutInformationReceiver.getForcedWidth() != Integer.MIN_VALUE) && ((layoutInformationReceiver2 = getLayoutInformationReceiver()) == null || layoutInformationReceiver2.getForcedHeight() != Integer.MIN_VALUE)) || zM16923needsRemeasureNN6EwU)) {
            j6 = constraints;
            motionMeasurer = this;
            motionMeasurer.m16924recalculateInterpolation36Wf7g4(j6, layoutDirection, constraintSetStart, constraintSetEnd, transition, measurables, optimizationLevel, progress, zM16923needsRemeasureNN6EwU);
        } else {
            j6 = constraints;
            motionMeasurer = this;
        }
        motionMeasurer.oldConstraints = Constraints.m16424boximpl(j6);
        return IntSizeKt.IntSize(getRoot().getWidth(), getRoot().getHeight());
    }
}
