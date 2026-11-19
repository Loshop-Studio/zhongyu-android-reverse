package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.DrawModifierKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RectKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.ClipOp;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathFillType;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.Stroke;
import androidx.compose.p013ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.internal.ViewUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13557d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u001a(\u0010\u0017\u001a\u00020\u00182\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u007f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00192\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\u001e\b\u0002\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00180)¢\u0006\u0002\b+¢\u0006\u0002\b,2\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00180)¢\u0006\u0002\b+¢\u0006\u0002\b,H\u0007¢\u0006\u0002\u0010.\u001a\b\u0010/\u001a\u00020%H\u0007\u001a\r\u00100\u001a\u00020%H\u0007¢\u0006\u0002\u00101\u001aF\u00102\u001a\u00020\u0018*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a>\u0010=\u001a\u00020\u0018*\u0002032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00152\u0006\u0010>\u001a\u0002072\u0006\u0010:\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001aH\u0010A\u001a\u00020#*\u00020#2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010B\u001a\u00020 2\b\b\u0002\u0010C\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001aN\u0010F\u001a\u00020#*\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010C\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020\u001b2\b\b\u0002\u0010J\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bK\u0010L\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u000e\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0011\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u0010\"\u0010\u0010\u0013\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006M²\u0006\n\u0010N\u001a\u00020\u0002X\u008a\u0084\u0002"}, m13558d2 = {"AlphaTween", "Landroidx/compose/animation/core/TweenSpec;", "", "ArcRadius", "Landroidx/compose/ui/unit/Dp;", "F", "ArrowHeight", "ArrowWidth", "CrossfadeDurationMs", "", "DragMultiplier", "MaxAlpha", "MaxProgressArc", "MinAlpha", "SpinnerContainerSize", "getSpinnerContainerSize", "()F", "SpinnerSize", "getSpinnerSize", "StrokeWidth", "ArrowValues", "Landroidx/compose/material3/pulltorefresh/ArrowValues;", "progress", "CircularArrowProgressIndicator", "", "Lkotlin/Function0;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "CircularArrowProgressIndicator-RPmYEkk", "(Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "PullToRefreshBox", "isRefreshing", "", "onRefresh", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "indicator", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PullToRefreshState", "rememberPullToRefreshState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "drawArrow", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "arrow", "Landroidx/compose/ui/graphics/Path;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "alpha", "values", "strokeWidth", "drawArrow-uDrxG_w", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V", "drawCircularIndicator", "arcBounds", "drawCircularIndicator-KzyDr3Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V", "pullToRefresh", "enabled", "threshold", "pullToRefresh-Z4HSEVQ", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "pullToRefreshIndicator", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "elevation", "pullToRefreshIndicator-wUdLESc", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLandroidx/compose/ui/graphics/Shape;JF)Landroidx/compose/ui/Modifier;", "material3_release", "targetAlpha"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,678:1\n71#2:679\n69#2,5:680\n74#2:713\n78#2:717\n78#3,6:685\n85#3,4:700\n89#3,2:710\n93#3:716\n368#4,9:691\n377#4:712\n378#4,2:714\n4032#5,6:704\n1223#6,3:718\n1226#6,3:722\n1223#6,6:725\n1223#6,6:731\n1223#6,6:737\n1#7:721\n147#8,5:743\n272#8,14:748\n81#9:762\n158#10:763\n158#10:764\n148#10:765\n148#10:766\n148#10:767\n148#10:768\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n*L\n136#1:679\n136#1:680,5\n136#1:713\n136#1:717\n136#1:685,6\n136#1:700,4\n136#1:710,2\n136#1:716\n136#1:691,9\n136#1:712\n136#1:714,2\n136#1:704,6\n563#1:718,3\n563#1:722,3\n565#1:725,6\n568#1:731,6\n572#1:737,6\n650#1:743,5\n650#1:748,14\n565#1:762\n659#1:763\n660#1:764\n661#1:765\n662#1:766\n663#1:767\n664#1:768\n*E\n"})
/* loaded from: classes2.dex */
public final class PullToRefreshKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float DragMultiplier = 0.5f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float StrokeWidth = C3127Dp.m23561constructorimpl((float) 2.5d);
    private static final float ArcRadius = C3127Dp.m23561constructorimpl((float) 5.5d);
    private static final float SpinnerSize = C3127Dp.m23561constructorimpl(16);
    private static final float SpinnerContainerSize = C3127Dp.m23561constructorimpl(40);
    private static final float ArrowWidth = C3127Dp.m23561constructorimpl(10);
    private static final float ArrowHeight = C3127Dp.m23561constructorimpl(5);
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues ArrowValues(float f10) {
        float fMax = (Math.max(Math.min(1.0f, f10) - 0.4f, 0.0f) * 5) / 3;
        float fCoerceIn = RangesKt.coerceIn(Math.abs(f10) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fCoerceIn - (((float) Math.pow(fCoerceIn, 2)) / 4))) * 0.5f;
        float f11 = 360;
        return new ArrowValues(fPow, fPow * f11, ((0.8f * fMax) + fPow) * f11, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CircularArrowProgressIndicator-RPmYEkk, reason: not valid java name */
    public static final void m19727CircularArrowProgressIndicatorRPmYEkk(final Function0<Float> function0, final long j10, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-569718810);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-569718810, i11, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:561)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo20869setFillTypeoQ8Xj4U(PathFillType.INSTANCE.m21258getEvenOddRgk1Os());
                composerStartRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final Path path = (Path) obj;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(function0.invoke().floatValue() < 1.0f ? 0.3f : 1.0f);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowProgressIndicator_RPmYEkk$lambda$4((State) objRememberedValue2), AlphaTween, 0.0f, null, null, composerStartRestartGroup, 48, 28);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i12 = i11 & 14;
            boolean z9 = i12 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function0.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM17728size3ABfNKs = SizeKt.m17728size3ABfNKs(SemanticsModifierKt.semantics(companion2, true, (Function1) objRememberedValue3), SpinnerSize);
            boolean zChanged = (i12 == 4) | composerStartRestartGroup.changed(stateAnimateFloatAsState) | ((i11 & 112) == 32) | composerStartRestartGroup.changedInstance(path);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$2$1
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
                        ArrowValues ArrowValues = PullToRefreshKt.ArrowValues(function0.invoke().floatValue());
                        float fFloatValue = stateAnimateFloatAsState.getValue().floatValue();
                        float rotation = ArrowValues.getRotation();
                        long j11 = j10;
                        Path path2 = path;
                        long jMo21526getCenterF1C5BW0 = drawScope.mo21526getCenterF1C5BW0();
                        DrawContext drawContext = drawScope.getDrawContext();
                        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            drawContext.getTransform().mo21454rotateUv8p0NA(rotation, jMo21526getCenterF1C5BW0);
                            Rect rectM20774Rect3MmeM6k = RectKt.m20774Rect3MmeM6k(androidx.compose.p013ui.geometry.SizeKt.m20814getCenteruvyYCjk(drawScope.mo21527getSizeNHjbRc()), drawScope.mo17332toPx0680j_4(PullToRefreshKt.ArcRadius) + (drawScope.mo17332toPx0680j_4(PullToRefreshKt.StrokeWidth) / 2.0f));
                            PullToRefreshKt.m19732drawCircularIndicatorKzyDr3Q(drawScope, j11, fFloatValue, ArrowValues, rectM20774Rect3MmeM6k, PullToRefreshKt.StrokeWidth);
                            PullToRefreshKt.m19731drawArrowuDrxG_w(drawScope, path2, rectM20774Rect3MmeM6k, j11, fFloatValue, ArrowValues, PullToRefreshKt.StrokeWidth);
                        } finally {
                            drawContext.getCanvas().restore();
                            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue4 = function1;
            }
            CanvasKt.Canvas(modifierM17728size3ABfNKs, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i13) {
                    PullToRefreshKt.m19727CircularArrowProgressIndicatorRPmYEkk(function0, j10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    private static final float CircularArrowProgressIndicator_RPmYEkk$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0104  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PullToRefreshBox(final boolean r16, final kotlin.jvm.functions.Function0<kotlin.Unit> r17, androidx.compose.p013ui.Modifier r18, androidx.compose.material3.pulltorefresh.PullToRefreshState r19, androidx.compose.p013ui.Alignment r20, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshKt.PullToRefreshBox(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.material3.pulltorefresh.PullToRefreshState, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalMaterial3Api
    public static final PullToRefreshState PullToRefreshState() {
        return new PullToRefreshStateImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawArrow-uDrxG_w, reason: not valid java name */
    public static final void m19731drawArrowuDrxG_w(DrawScope drawScope, Path path, Rect rect, long j10, float f10, ArrowValues arrowValues, float f11) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f12 = ArrowWidth;
        path.lineTo((drawScope.mo17332toPx0680j_4(f12) * arrowValues.getScale()) / 2, drawScope.mo17332toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.lineTo(drawScope.mo17332toPx0680j_4(f12) * arrowValues.getScale(), 0.0f);
        path.mo20871translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m20735getXimpl(rect.m20765getCenterF1C5BW0())) - ((drawScope.mo17332toPx0680j_4(f12) * arrowValues.getScale()) / 2.0f), Offset.m20736getYimpl(rect.m20765getCenterF1C5BW0()) - drawScope.mo17332toPx0680j_4(f11)));
        float endAngle = arrowValues.getEndAngle() - drawScope.mo17332toPx0680j_4(f11);
        long jMo21526getCenterF1C5BW0 = drawScope.mo21526getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21454rotateUv8p0NA(endAngle, jMo21526getCenterF1C5BW0);
            DrawScope.m21517drawPathLG529CI$default(drawScope, path, j10, f10, new Stroke(drawScope.mo17332toPx0680j_4(f11), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicator-KzyDr3Q, reason: not valid java name */
    public static final void m19732drawCircularIndicatorKzyDr3Q(DrawScope drawScope, long j10, float f10, ArrowValues arrowValues, Rect rect, float f11) {
        DrawScope.m21506drawArcyD3GUKo$default(drawScope, j10, arrowValues.getStartAngle(), arrowValues.getEndAngle() - arrowValues.getStartAngle(), false, rect.m20770getTopLeftF1C5BW0(), rect.m20768getSizeNHjbRc(), f10, new Stroke(drawScope.mo17332toPx0680j_4(f11), 0.0f, StrokeCap.INSTANCE.m21329getButtKaPHkGw(), 0, null, 26, null), null, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
    }

    public static final float getSpinnerContainerSize() {
        return SpinnerContainerSize;
    }

    public static final float getSpinnerSize() {
        return SpinnerSize;
    }

    @ExperimentalMaterial3Api
    /* renamed from: pullToRefresh-Z4HSEVQ, reason: not valid java name */
    public static final Modifier m19733pullToRefreshZ4HSEVQ(Modifier modifier, boolean z9, PullToRefreshState pullToRefreshState, boolean z10, float f10, Function0<Unit> function0) {
        return modifier.then(new PullToRefreshElement(z9, function0, z10, pullToRefreshState, f10, null));
    }

    /* renamed from: pullToRefresh-Z4HSEVQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m19734pullToRefreshZ4HSEVQ$default(Modifier modifier, boolean z9, PullToRefreshState pullToRefreshState, boolean z10, float f10, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            f10 = PullToRefreshDefaults.INSTANCE.m19722getPositionalThresholdD9Ej5fM();
        }
        return m19733pullToRefreshZ4HSEVQ(modifier, z9, pullToRefreshState, z11, f10, function0);
    }

    @ExperimentalMaterial3Api
    /* renamed from: pullToRefreshIndicator-wUdLESc, reason: not valid java name */
    public static final Modifier m19735pullToRefreshIndicatorwUdLESc(Modifier modifier, final PullToRefreshState pullToRefreshState, final boolean z9, final float f10, final Shape shape, long j10, final float f11) {
        return BackgroundKt.m17189backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(SizeKt.m17728size3ABfNKs(modifier, SpinnerContainerSize), new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                int iM20965getIntersectrtfAjoo = ClipOp.INSTANCE.m20965getIntersectrtfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo21451clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iM20965getIntersectrtfAjoo);
                    contentDrawScope.drawContent();
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
                }
            }
        }), new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                boolean z10 = pullToRefreshState.getDistanceFraction() > 0.0f || z9;
                graphicsLayerScope.setTranslationY((pullToRefreshState.getDistanceFraction() * graphicsLayerScope.mo17326roundToPx0680j_4(f10)) - Size.m20801getHeightimpl(graphicsLayerScope.getSize()));
                graphicsLayerScope.setShadowElevation(z10 ? graphicsLayerScope.mo17332toPx0680j_4(f11) : 0.0f);
                graphicsLayerScope.setShape(shape);
                graphicsLayerScope.setClip(true);
            }
        }), j10, shape);
    }

    /* renamed from: pullToRefreshIndicator-wUdLESc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m19736pullToRefreshIndicatorwUdLESc$default(Modifier modifier, PullToRefreshState pullToRefreshState, boolean z9, float f10, Shape shape, long j10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = PullToRefreshDefaults.INSTANCE.m19722getPositionalThresholdD9Ej5fM();
        }
        float f12 = f10;
        if ((i10 & 8) != 0) {
            shape = PullToRefreshDefaults.INSTANCE.getShape();
        }
        Shape shape2 = shape;
        if ((i10 & 16) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        return m19735pullToRefreshIndicatorwUdLESc(modifier, pullToRefreshState, z9, f12, shape2, j10, (i10 & 32) != 0 ? PullToRefreshDefaults.INSTANCE.m19721getElevationD9Ej5fM() : f11);
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final PullToRefreshState rememberPullToRefreshState(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(318623070, i10, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:512)");
        }
        PullToRefreshStateImpl pullToRefreshStateImpl = (PullToRefreshStateImpl) RememberSaveableKt.m20533rememberSaveable(new Object[0], (Saver) PullToRefreshStateImpl.INSTANCE.getSaver(), (String) null, (Function0) new Function0<PullToRefreshStateImpl>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt.rememberPullToRefreshState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final PullToRefreshStateImpl invoke() {
                return new PullToRefreshStateImpl();
            }
        }, composer, 3072, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pullToRefreshStateImpl;
    }
}
