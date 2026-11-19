package androidx.compose.material3.pulltorefresh;

import androidx.collection.AbstractC0584a;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RectKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathFillType;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2331Dp;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.internal.ViewUtils;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p200x6.C6751a;

@Metadata(m5109d1 = {"\u0000~\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0081\u0001\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aN\u0010\u001c\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aH\u0010 \u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u000f\u0010!\u001a\u00020\u0007H\u0007¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0007H\u0007¢\u0006\u0004\b#\u0010$\u001a(\u0010*\u001a\u00020\u00032\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00022\u0006\u0010'\u001a\u00020\u0017H\u0003ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a>\u00104\u001a\u00020\u0003*\u00020+2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010,\u001a\u00020%2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u0017\u00105\u001a\u00020-2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b5\u00106\u001aF\u0010<\u001a\u00020\u0003*\u00020+2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020/2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010,\u001a\u00020%2\u0006\u0010.\u001a\u00020-2\u0006\u00101\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b:\u0010;\"\u0014\u0010=\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010>\"\u0014\u0010@\u001a\u00020?8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010A\"\u0014\u0010B\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>\"\u0014\u0010C\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010>\"\u001a\u0010D\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bE\u0010F\"\u001a\u0010G\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010>\u001a\u0004\bH\u0010F\"\u0014\u0010I\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010>\"\u0014\u0010J\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010>\"\u0014\u0010K\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010>\"\u0014\u0010L\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010>\"\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020%0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\"\u0014\u0010P\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006R²\u0006\f\u0010Q\u001a\u00020%8\nX\u008a\u0084\u0002"}, m5110d2 = {"", "isRefreshing", "Lkotlin/Function0;", "Ld6/s;", "onRefresh", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "indicator", "content", "PullToRefreshBox", "(ZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lr6/f;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "threshold", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "elevation", "pullToRefreshIndicator-wUdLESc", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLandroidx/compose/ui/graphics/Shape;JF)Landroidx/compose/ui/Modifier;", "pullToRefreshIndicator", "enabled", "pullToRefresh-Z4HSEVQ", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLr6/a;)Landroidx/compose/ui/Modifier;", "pullToRefresh", "rememberPullToRefreshState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "PullToRefreshState", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "", "progress", TypedValues.Custom.S_COLOR, "CircularArrowProgressIndicator-RPmYEkk", "(Lr6/a;JLandroidx/compose/runtime/Composer;I)V", "CircularArrowProgressIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "alpha", "Landroidx/compose/material3/pulltorefresh/ArrowValues;", "values", "Landroidx/compose/ui/geometry/Rect;", "arcBounds", "strokeWidth", "drawCircularIndicator-KzyDr3Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V", "drawCircularIndicator", "ArrowValues", "(F)Landroidx/compose/material3/pulltorefresh/ArrowValues;", "Landroidx/compose/ui/graphics/Path;", "arrow", "bounds", "drawArrow-uDrxG_w", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V", "drawArrow", "MaxProgressArc", "F", "", "CrossfadeDurationMs", "I", "StrokeWidth", "ArcRadius", "SpinnerSize", "getSpinnerSize", "()F", "SpinnerContainerSize", "getSpinnerContainerSize", "ArrowWidth", "ArrowHeight", "MinAlpha", "MaxAlpha", "Landroidx/compose/animation/core/TweenSpec;", "AlphaTween", "Landroidx/compose/animation/core/TweenSpec;", "DragMultiplier", "targetAlpha", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,678:1\n71#2:679\n69#2,5:680\n74#2:713\n78#2:717\n78#3,6:685\n85#3,4:700\n89#3,2:710\n93#3:716\n368#4,9:691\n377#4:712\n378#4,2:714\n4032#5,6:704\n1223#6,3:718\n1226#6,3:722\n1223#6,6:725\n1223#6,6:731\n1223#6,6:737\n1#7:721\n147#8,5:743\n272#8,14:748\n81#9:762\n158#10:763\n158#10:764\n148#10:765\n148#10:766\n148#10:767\n148#10:768\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n*L\n136#1:679\n136#1:680,5\n136#1:713\n136#1:717\n136#1:685,6\n136#1:700,4\n136#1:710,2\n136#1:716\n136#1:691,9\n136#1:712\n136#1:714,2\n136#1:704,6\n563#1:718,3\n563#1:722,3\n565#1:725,6\n568#1:731,6\n572#1:737,6\n650#1:743,5\n650#1:748,14\n565#1:762\n659#1:763\n660#1:764\n661#1:765\n662#1:766\n663#1:767\n664#1:768\n*E\n"})
/* loaded from: classes.dex */
public final class PullToRefreshKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float DragMultiplier = 0.5f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float StrokeWidth = C2331Dp.m13305constructorimpl((float) 2.5d);
    private static final float ArcRadius = C2331Dp.m13305constructorimpl((float) 5.5d);
    private static final float SpinnerSize = C2331Dp.m13305constructorimpl(16);
    private static final float SpinnerContainerSize = C2331Dp.m13305constructorimpl(40);
    private static final float ArrowWidth = C2331Dp.m13305constructorimpl(10);
    private static final float ArrowHeight = C2331Dp.m13305constructorimpl(5);

    @NotNull
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues ArrowValues(float f) {
        float fMax = (Math.max(Math.min(1.0f, f) - 0.4f, 0.0f) * 5) / 3;
        float fM5273l = AbstractC5806u.m5273l(Math.abs(f) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fM5273l - (((float) Math.pow(fM5273l, 2)) / 4))) * 0.5f;
        float f7 = 360;
        return new ArrowValues(fPow, fPow * f7, ((0.8f * fMax) + fPow) * f7, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CircularArrowProgressIndicator-RPmYEkk, reason: not valid java name */
    public static final void m9409CircularArrowProgressIndicatorRPmYEkk(final InterfaceC6469a interfaceC6469a, final long j7, Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-569718810);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(interfaceC6469a) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(j7) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-569718810, i8, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:561)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo10575setFillTypeoQ8Xj4U(PathFillType.INSTANCE.m10964getEvenOddRgk1Os());
                composerStartRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final Path path = (Path) obj;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new InterfaceC6469a() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(((Number) interfaceC6469a.invoke()).floatValue() < 1.0f ? 0.3f : 1.0f);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowProgressIndicator_RPmYEkk$lambda$4((State) objRememberedValue2), AlphaTween, 0.0f, null, null, composerStartRestartGroup, 48, 28);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i9 = i8 & 14;
            boolean z8 = i9 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC6471c() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$1$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((SemanticsPropertyReceiver) obj2);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) interfaceC6469a.invoke()).floatValue(), new C6751a(0.0f, 1.0f), 0));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM7309size3ABfNKs = SizeKt.m7309size3ABfNKs(SemanticsModifierKt.semantics(companion2, true, (InterfaceC6471c) objRememberedValue3), SpinnerSize);
            boolean zChanged = (i9 == 4) | composerStartRestartGroup.changed(stateAnimateFloatAsState) | ((i8 & 112) == 32) | composerStartRestartGroup.changedInstance(path);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DrawScope) obj2);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull DrawScope drawScope) {
                        ArrowValues ArrowValues = PullToRefreshKt.ArrowValues(((Number) interfaceC6469a.invoke()).floatValue());
                        float fFloatValue = stateAnimateFloatAsState.getValue().floatValue();
                        float rotation = ArrowValues.getRotation();
                        long j8 = j7;
                        Path path2 = path;
                        long jMo11232getCenterF1C5BW0 = drawScope.mo11232getCenterF1C5BW0();
                        DrawContext drawContext = drawScope.getDrawContext();
                        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            drawContext.getTransform().mo11160rotateUv8p0NA(rotation, jMo11232getCenterF1C5BW0);
                            Rect rectM10480Rect3MmeM6k = RectKt.m10480Rect3MmeM6k(androidx.compose.p011ui.geometry.SizeKt.m10520getCenteruvyYCjk(drawScope.mo11233getSizeNHjbRc()), (drawScope.mo6903toPx0680j_4(PullToRefreshKt.StrokeWidth) / 2.0f) + drawScope.mo6903toPx0680j_4(PullToRefreshKt.ArcRadius));
                            PullToRefreshKt.m9414drawCircularIndicatorKzyDr3Q(drawScope, j8, fFloatValue, ArrowValues, rectM10480Rect3MmeM6k, PullToRefreshKt.StrokeWidth);
                            PullToRefreshKt.m9413drawArrowuDrxG_w(drawScope, path2, rectM10480Rect3MmeM6k, j8, fFloatValue, ArrowValues, PullToRefreshKt.StrokeWidth);
                        } finally {
                            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(interfaceC6471c);
                objRememberedValue4 = interfaceC6471c;
            }
            CanvasKt.Canvas(modifierM7309size3ABfNKs, (InterfaceC6471c) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    PullToRefreshKt.m9409CircularArrowProgressIndicatorRPmYEkk(interfaceC6469a, j7, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
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
    /* JADX WARN: Removed duplicated region for block: B:119:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c9  */
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
    public static final void PullToRefreshBox(final boolean r16, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r17, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r18, @org.jetbrains.annotations.Nullable androidx.compose.material3.pulltorefresh.PullToRefreshState r19, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Alignment r20, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r21, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r22, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshKt.PullToRefreshBox(boolean, r6.a, androidx.compose.ui.Modifier, androidx.compose.material3.pulltorefresh.PullToRefreshState, androidx.compose.ui.Alignment, r6.f, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final PullToRefreshState PullToRefreshState() {
        return new PullToRefreshStateImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawArrow-uDrxG_w, reason: not valid java name */
    public static final void m9413drawArrowuDrxG_w(DrawScope drawScope, Path path, Rect rect, long j7, float f, ArrowValues arrowValues, float f7) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f8 = ArrowWidth;
        path.lineTo((drawScope.mo6903toPx0680j_4(f8) * arrowValues.getScale()) / 2, drawScope.mo6903toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.lineTo(drawScope.mo6903toPx0680j_4(f8) * arrowValues.getScale(), 0.0f);
        path.mo10577translatek4lQ0M(OffsetKt.Offset((Offset.m10441getXimpl(rect.m10471getCenterF1C5BW0()) + (Math.min(rect.getWidth(), rect.getHeight()) / 2.0f)) - ((drawScope.mo6903toPx0680j_4(f8) * arrowValues.getScale()) / 2.0f), Offset.m10442getYimpl(rect.m10471getCenterF1C5BW0()) - drawScope.mo6903toPx0680j_4(f7)));
        float endAngle = arrowValues.getEndAngle() - drawScope.mo6903toPx0680j_4(f7);
        long jMo11232getCenterF1C5BW0 = drawScope.mo11232getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11160rotateUv8p0NA(endAngle, jMo11232getCenterF1C5BW0);
            DrawScope.m11223drawPathLG529CI$default(drawScope, path, j7, f, new Stroke(drawScope.mo6903toPx0680j_4(f7), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicator-KzyDr3Q, reason: not valid java name */
    public static final void m9414drawCircularIndicatorKzyDr3Q(DrawScope drawScope, long j7, float f, ArrowValues arrowValues, Rect rect, float f7) {
        DrawScope.m11212drawArcyD3GUKo$default(drawScope, j7, arrowValues.getStartAngle(), arrowValues.getEndAngle() - arrowValues.getStartAngle(), false, rect.m10476getTopLeftF1C5BW0(), rect.m10474getSizeNHjbRc(), f, new Stroke(drawScope.mo6903toPx0680j_4(f7), 0.0f, StrokeCap.INSTANCE.m11035getButtKaPHkGw(), 0, null, 26, null), null, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
    }

    public static final float getSpinnerContainerSize() {
        return SpinnerContainerSize;
    }

    public static final float getSpinnerSize() {
        return SpinnerSize;
    }

    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: pullToRefresh-Z4HSEVQ, reason: not valid java name */
    public static final Modifier m9415pullToRefreshZ4HSEVQ(@NotNull Modifier modifier, boolean z8, @NotNull PullToRefreshState pullToRefreshState, boolean z9, float f, @NotNull InterfaceC6469a interfaceC6469a) {
        return modifier.then(new PullToRefreshElement(z8, interfaceC6469a, z9, pullToRefreshState, f, null));
    }

    /* renamed from: pullToRefresh-Z4HSEVQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m9416pullToRefreshZ4HSEVQ$default(Modifier modifier, boolean z8, PullToRefreshState pullToRefreshState, boolean z9, float f, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 4) != 0) {
            z9 = true;
        }
        boolean z10 = z9;
        if ((i & 8) != 0) {
            f = PullToRefreshDefaults.INSTANCE.m9404getPositionalThresholdD9Ej5fM();
        }
        return m9415pullToRefreshZ4HSEVQ(modifier, z8, pullToRefreshState, z10, f, interfaceC6469a);
    }

    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: pullToRefreshIndicator-wUdLESc, reason: not valid java name */
    public static final Modifier m9417pullToRefreshIndicatorwUdLESc(@NotNull Modifier modifier, @NotNull final PullToRefreshState pullToRefreshState, final boolean z8, final float f, @NotNull final Shape shape, long j7, final float f7) {
        return BackgroundKt.m6753backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(SizeKt.m7309size3ABfNKs(modifier, SpinnerContainerSize), new InterfaceC6471c() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$1
            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull ContentDrawScope contentDrawScope) {
                int iM10671getIntersectrtfAjoo = ClipOp.INSTANCE.m10671getIntersectrtfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo11157clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iM10671getIntersectrtfAjoo);
                    contentDrawScope.drawContent();
                } finally {
                    AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
                }
            }
        }), new InterfaceC6471c() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull GraphicsLayerScope graphicsLayerScope) {
                boolean z9 = pullToRefreshState.getDistanceFraction() > 0.0f || z8;
                graphicsLayerScope.setTranslationY((pullToRefreshState.getDistanceFraction() * graphicsLayerScope.mo6897roundToPx0680j_4(f)) - Size.m10507getHeightimpl(graphicsLayerScope.getSize()));
                graphicsLayerScope.setShadowElevation(z9 ? graphicsLayerScope.mo6903toPx0680j_4(f7) : 0.0f);
                graphicsLayerScope.setShape(shape);
                graphicsLayerScope.setClip(true);
            }
        }), j7, shape);
    }

    /* renamed from: pullToRefreshIndicator-wUdLESc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m9418pullToRefreshIndicatorwUdLESc$default(Modifier modifier, PullToRefreshState pullToRefreshState, boolean z8, float f, Shape shape, long j7, float f7, int i, Object obj) {
        if ((i & 4) != 0) {
            f = PullToRefreshDefaults.INSTANCE.m9404getPositionalThresholdD9Ej5fM();
        }
        float f8 = f;
        if ((i & 8) != 0) {
            shape = PullToRefreshDefaults.INSTANCE.getShape();
        }
        Shape shape2 = shape;
        if ((i & 16) != 0) {
            j7 = Color.INSTANCE.m10718getUnspecified0d7_KjU();
        }
        return m9417pullToRefreshIndicatorwUdLESc(modifier, pullToRefreshState, z8, f8, shape2, j7, (i & 32) != 0 ? PullToRefreshDefaults.INSTANCE.m9403getElevationD9Ej5fM() : f7);
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final PullToRefreshState rememberPullToRefreshState(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(318623070, i, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:512)");
        }
        PullToRefreshStateImpl pullToRefreshStateImpl = (PullToRefreshStateImpl) RememberSaveableKt.m10224rememberSaveable(new Object[0], (Saver) PullToRefreshStateImpl.INSTANCE.getSaver(), (String) null, (InterfaceC6469a) new InterfaceC6469a() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt.rememberPullToRefreshState.1
            @Override // p152r6.InterfaceC6469a
            @NotNull
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
