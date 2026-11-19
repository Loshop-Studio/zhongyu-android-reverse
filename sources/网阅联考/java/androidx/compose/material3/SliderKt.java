package androidx.compose.material3;

import android.content.res.Resources;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.AbstractC0504a;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.PointMode;
import androidx.compose.p006ui.graphics.StrokeCap;
import androidx.compose.p006ui.graphics.drawscope.AbstractC1312b;
import androidx.compose.p006ui.graphics.drawscope.DrawScope;
import androidx.compose.p006ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p006ui.input.pointer.PointerInputScope;
import androidx.compose.p006ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p006ui.layout.LayoutKt;
import androidx.compose.p006ui.layout.MeasurePolicy;
import androidx.compose.p006ui.node.ComposeUiNode;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.platform.ViewConfiguration;
import androidx.compose.p006ui.semantics.SemanticsModifierKt;
import androidx.compose.p006ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p006ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.DpKt;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.p006ui.util.MathHelpersKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(m5174d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u007f\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010\u001f\u001a\u00020 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010%\u001ae\u0010&\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020$2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00101\u001a±\u0001\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b52\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010\u001f\u001a\u00020 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u00106\u001a\u00020-2\u0019\b\u0002\u00107\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b5H\u0007¢\u0006\u0002\u00108\u001a}\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010\u001f\u001a\u00020 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u00106\u001a\u00020-H\u0007¢\u0006\u0002\u00109\u001a\u0096\u0001\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010\u001f\u001a\u00020 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u00106\u001a\u00020-2\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b5H\u0007¢\u0006\u0002\u0010:\u001a\u0099\u0001\u0010;\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00106\u001a\u00020-2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b52\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b5H\u0003¢\u0006\u0002\u0010<\u001aU\u0010=\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020*2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\bH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a1\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010H\u001a \u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\bH\u0002\u001a0\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002\u001a<\u0010M\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002\u001a(\u0010T\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\u0006\u0010)\u001a\u00020*2\u0006\u0010U\u001a\u00020\b2\u0006\u0010V\u001a\u00020\bH\u0002\u001a\u0010\u0010W\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a?\u0010X\u001a\u00020\u0016*\u00020Y2\u0006\u0010Z\u001a\u00020\u00032\u001c\u0010[\u001a\u0018\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b5¢\u0006\u0002\b\\H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b]\u0010^\u001a;\u0010_\u001a\u0010\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\b\u0018\u00010`*\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020fH\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bg\u0010h\u001a\u0098\u0001\u0010i\u001a\u00020\u0001*\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\b0k2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\b0k2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010m\u001a\u00020\u001d2\u0006\u0010V\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00160\u001a0k2\u001e\u0010o\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160p0kH\u0002\u001a\\\u0010q\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002\u001ad\u0010r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0006\u00106\u001a\u00020-2\u0006\u0010V\u001a\u00020 2\u0006\u0010m\u001a\u00020\u001d2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\b0k2\u0012\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\"0k2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\b0u2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\f\u001a\u00020\rX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u000e\"\u0019\u0010\u000f\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\u0011\"\u0013\u0010\u0012\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u0013\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0014\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006v"}, m5175d2 = {"DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "SliderHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SliderMinWidth", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "", "ThumbDefaultElevation", "ThumbHeight", "ThumbPressedElevation", "ThumbSize", "Landroidx/compose/ui/unit/DpSize;", "J", "ThumbWidth", "getThumbWidth", "()F", "TickSize", "TrackHeight", "getTrackHeight", "RangeSlider", "", "value", "Lkotlin/ranges/ClosedFloatingPointRange;", "onValueChange", "Lkotlin/Function1;", "modifier", "enabled", "", "valueRange", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "colors", "Landroidx/compose/material3/SliderColors;", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "positionFractionStart", "positionFractionEnd", "tickFractions", "", "width", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "(ZFF[FLandroidx/compose/material3/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Slider", "track", "Landroidx/compose/material3/SliderPositions;", "Landroidx/compose/runtime/Composable;", "interactionSource", "thumb", "(FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IFLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "TempRangeSliderTrack", "thumbWidth", "trackStrokeWidth", "TempRangeSliderTrack-au3_HiA", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZFF[FFFLandroidx/compose/runtime/Composer;I)V", "animateToTarget", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "current", "target", "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calcFraction", C3335ai.f1705at, "b", "pos", "scale", "a1", "b1", "x1", "a2", "b2", "x", "snapValueToTick", "minPx", "maxPx", "stepsToTickFractions", "TempRangeSliderThumb", "Landroidx/compose/foundation/layout/BoxScope;", "offset", "content", "Lkotlin/ExtensionFunctionType;", "TempRangeSliderThumb-rAjV9yQ", "(Landroidx/compose/foundation/layout/BoxScope;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderPressDragModifier", "rawOffsetStart", "Landroidx/compose/runtime/State;", "rawOffsetEnd", "isRtl", "gestureEndAction", "onDrag", "Lkotlin/Function2;", "sliderSemantics", "sliderTapModifier", "rawOffset", "pressOffset", "Landroidx/compose/runtime/MutableState;", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbDefaultElevation;
    private static final float ThumbHeight;
    private static final float ThumbPressedElevation;
    private static final long ThumbSize;
    private static final float ThumbWidth;
    private static final float TickSize;
    private static final float TrackHeight;

    @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$2 */
    public static final class C10652 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        final /* synthetic */ int $steps;
        final /* synthetic */ float[] $tickFractions;
        final /* synthetic */ ClosedFloatingPointRange<Float> $value;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10652(Function0<Unit> function0, int i4, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z3, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i5, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, float[] fArr, SliderColors sliderColors) {
            super(3);
            this.$onValueChangeFinished = function0;
            this.$$dirty = i4;
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$enabled = z3;
            this.$valueRange = closedFloatingPointRange;
            this.$value = closedFloatingPointRange2;
            this.$steps = i5;
            this.$onValueChangeState = state;
            this.$tickFractions = fArr;
            this.$colors = sliderColors;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f4) {
            return SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f4, floatRef.element, floatRef2.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ClosedFloatingPointRange<Float> invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
            return SliderKt.scale(floatRef.element, floatRef2.element, closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i4) throws Resources.NotFoundException {
            int i5;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i4 & 14) == 0) {
                i5 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i4;
            } else {
                i5 = i4;
            }
            if ((i5 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-990606702, i4, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:412)");
            }
            boolean z3 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            float fM11493getMaxWidthimpl = Constraints.m11493getMaxWidthimpl(BoxWithConstraints.getConstraints());
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            float f4 = 2;
            floatRef.element = fM11493getMaxWidthimpl - (density.mo7206toPx0680j_4(SliderKt.getThumbWidth()) / f4);
            floatRef2.element = density.mo7206toPx0680j_4(SliderKt.getThumbWidth()) / f4;
            Unit unit = Unit.INSTANCE;
            ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$value;
            ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange2, floatRef2, floatRef, closedFloatingPointRange.getStart().floatValue())), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$value;
            ClosedFloatingPointRange<Float> closedFloatingPointRange4 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange4, floatRef2, floatRef, closedFloatingPointRange3.getEndInclusive().floatValue())), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            final Function0<Unit> function0 = this.$onValueChangeFinished;
            composer.startReplaceableGroup(1157296644);
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2$gestureEndAction$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z4) {
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(objRememberedValue3, composer, 0);
            final ClosedFloatingPointRange<Float> closedFloatingPointRange5 = this.$value;
            final float[] fArr = this.$tickFractions;
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.$onValueChangeState;
            final ClosedFloatingPointRange<Float> closedFloatingPointRange6 = this.$valueRange;
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new Function2<Boolean, Float, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2$onDrag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Float f5) {
                    invoke(bool.booleanValue(), f5.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z4, float f5) {
                    ClosedFloatingPointRange closedFloatingPointRangeRangeTo;
                    if (z4) {
                        MutableState<Float> mutableState3 = mutableState;
                        mutableState3.setValue(Float.valueOf(mutableState3.getValue().floatValue() + f5));
                        mutableState2.setValue(Float.valueOf(SliderKt.C10652.invoke$scaleToOffset(closedFloatingPointRange6, floatRef2, floatRef, closedFloatingPointRange5.getEndInclusive().floatValue())));
                        float fFloatValue = mutableState2.getValue().floatValue();
                        closedFloatingPointRangeRangeTo = RangesKt__RangesKt.rangeTo(SliderKt.snapValueToTick(RangesKt___RangesKt.coerceIn(mutableState.getValue().floatValue(), floatRef2.element, fFloatValue), fArr, floatRef2.element, floatRef.element), fFloatValue);
                    } else {
                        MutableState<Float> mutableState4 = mutableState2;
                        mutableState4.setValue(Float.valueOf(mutableState4.getValue().floatValue() + f5));
                        mutableState.setValue(Float.valueOf(SliderKt.C10652.invoke$scaleToOffset(closedFloatingPointRange6, floatRef2, floatRef, closedFloatingPointRange5.getStart().floatValue())));
                        float fFloatValue2 = mutableState.getValue().floatValue();
                        closedFloatingPointRangeRangeTo = RangesKt__RangesKt.rangeTo(fFloatValue2, SliderKt.snapValueToTick(RangesKt___RangesKt.coerceIn(mutableState2.getValue().floatValue(), fFloatValue2, floatRef.element), fArr, floatRef2.element, floatRef.element));
                    }
                    state.getValue().invoke(SliderKt.C10652.invoke$scaleToUserValue(floatRef2, floatRef, closedFloatingPointRange6, closedFloatingPointRangeRangeTo));
                }
            }, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierRangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(companion2, this.$startInteractionSource, this.$endInteractionSource, mutableState, mutableState2, this.$enabled, z3, fM11493getMaxWidthimpl, this.$valueRange, stateRememberUpdatedState, stateRememberUpdatedState2);
            final float fCoerceIn = RangesKt___RangesKt.coerceIn(this.$value.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$value.getEndInclusive().floatValue());
            final float fCoerceIn2 = RangesKt___RangesKt.coerceIn(this.$value.getEndInclusive().floatValue(), this.$value.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            float fCalcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), fCoerceIn);
            float fCalcFraction2 = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), fCoerceIn2);
            int iFloor = (int) Math.floor(this.$steps * fCalcFraction2);
            int iFloor2 = (int) Math.floor(this.$steps * (1.0f - fCalcFraction));
            boolean z4 = this.$enabled;
            Object obj = this.$onValueChangeState;
            Object objValueOf = Float.valueOf(fCoerceIn2);
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state2 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            boolean zChanged2 = composer.changed(obj) | composer.changed(objValueOf);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2$startThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f5) {
                        invoke(f5.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f5) {
                        state2.getValue().invoke(RangesKt__RangesKt.rangeTo(f5, fCoerceIn2));
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            Modifier modifierSliderSemantics = SliderKt.sliderSemantics(companion2, fCoerceIn, z4, (Function1) objRememberedValue4, this.$onValueChangeFinished, RangesKt__RangesKt.rangeTo(this.$valueRange.getStart().floatValue(), fCoerceIn2), iFloor);
            boolean z5 = this.$enabled;
            Object obj2 = this.$onValueChangeState;
            Object objValueOf2 = Float.valueOf(fCoerceIn);
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state3 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            boolean zChanged3 = composer.changed(obj2) | composer.changed(objValueOf2);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2$endThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f5) {
                        invoke(f5.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f5) {
                        state3.getValue().invoke(RangesKt__RangesKt.rangeTo(fCoerceIn, f5));
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            Modifier modifierSliderSemantics2 = SliderKt.sliderSemantics(companion2, fCoerceIn2, z5, (Function1) objRememberedValue5, this.$onValueChangeFinished, RangesKt__RangesKt.rangeTo(fCoerceIn, this.$valueRange.getEndInclusive().floatValue()), iFloor2);
            boolean z6 = this.$enabled;
            float[] fArr2 = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            float f5 = floatRef.element - floatRef2.element;
            MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
            MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
            int i6 = this.$$dirty;
            SliderKt.RangeSliderImpl(z6, fCalcFraction, fCalcFraction2, fArr2, sliderColors, f5, mutableInteractionSource, mutableInteractionSource2, modifierRangeSliderPressDragModifier, modifierSliderSemantics, modifierSliderSemantics2, composer, ((i6 >> 9) & 14) | 14159872 | ((i6 >> 9) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 7, 1})
    @DebugMetadata(m5191c = "androidx.compose.material3.SliderKt$animateToTarget$2", m5192f = "Slider.kt", m5193i = {}, m5194l = {1174}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.material3.SliderKt$animateToTarget$2 */
    public static final class C10732 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $current;
        final /* synthetic */ float $target;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10732(float f4, float f5, float f6, Continuation<? super C10732> continuation) {
            super(2, continuation);
            this.$current = f4;
            this.$target = f5;
            this.$velocity = f6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10732 c10732 = new C10732(this.$current, this.$target, this.$velocity, continuation);
            c10732.L$0 = obj;
            return c10732;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
            return ((C10732) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                float f4 = this.$current;
                floatRef.element = f4;
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(f4, 0.0f, 2, null);
                Float fBoxFloat = Boxing.boxFloat(this.$target);
                TweenSpec tweenSpec = SliderKt.SliderToTickAnimation;
                Float fBoxFloat2 = Boxing.boxFloat(this.$velocity);
                Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.SliderKt.animateToTarget.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                        invoke2(animatable);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Animatable<Float, AnimationVector1D> animateTo) {
                        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                        dragScope.dragBy(animateTo.getValue().floatValue() - floatRef.element);
                        floatRef.element = animateTo.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (animatableAnimatable$default.animateTo(fBoxFloat, tweenSpec, fBoxFloat2, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 7, 1})
    @DebugMetadata(m5191c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", m5192f = "Slider.kt", m5193i = {}, m5194l = {1202}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1 */
    public static final class C10741 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
        final /* synthetic */ State<Float> $rawOffsetEnd;
        final /* synthetic */ State<Float> $rawOffsetStart;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 7, 1})
        @DebugMetadata(m5191c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", m5192f = "Slider.kt", m5193i = {}, m5194l = {1203}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ State<Float> $rawOffsetEnd;
            final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            int label;

            @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 7, 1})
            @DebugMetadata(m5191c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", m5192f = "Slider.kt", m5193i = {}, m5194l = {1204}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
            /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C47421 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ State<Float> $rawOffsetEnd;
                final /* synthetic */ State<Float> $rawOffsetStart;
                private /* synthetic */ Object L$0;
                int label;

                @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 7, 1})
                @DebugMetadata(m5191c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1", m5192f = "Slider.kt", m5193i = {0, 1, 1, 1, 1, 1, 2, 2}, m5194l = {1205, 1215, 1234}, m5195m = "invokeSuspend", m5196n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", NotificationCompat.CATEGORY_EVENT, "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, m5197s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
                /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C47431 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ CoroutineScope $$this$coroutineScope;
                    final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ float $maxPx;
                    final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    final /* synthetic */ State<Float> $rawOffsetEnd;
                    final /* synthetic */ State<Float> $rawOffsetStart;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;

                    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 7, 1})
                    @DebugMetadata(m5191c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2", m5192f = "Slider.kt", m5193i = {}, m5194l = {1251}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
                    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Ref.BooleanRef $draggingStart;
                        final /* synthetic */ DragInteraction $finishInteraction;
                        final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$rangeSliderLogic = rangeSliderLogic;
                            this.$draggingStart = booleanRef;
                            this.$finishInteraction = dragInteraction;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i4 = this.label;
                            if (i4 == 0) {
                                ResultKt.throwOnFailure(obj);
                                MutableInteractionSource mutableInteractionSourceActiveInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element);
                                DragInteraction dragInteraction = this.$finishInteraction;
                                this.label = 1;
                                if (mutableInteractionSourceActiveInteraction.emit(dragInteraction, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i4 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C47431(boolean z3, float f4, RangeSliderLogic rangeSliderLogic, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super C47431> continuation) {
                        super(2, continuation);
                        this.$isRtl = z3;
                        this.$maxPx = f4;
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$rawOffsetStart = state;
                        this.$$this$coroutineScope = coroutineScope;
                        this.$gestureEndAction = state2;
                        this.$rawOffsetEnd = state3;
                        this.$onDrag = state4;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C47431 c47431 = new C47431(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                        c47431.L$0 = obj;
                        return c47431;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                        return ((C47431) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x0172 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x017d A[Catch: CancellationException -> 0x018b, TryCatch #0 {CancellationException -> 0x018b, blocks: (B:8:0x001d, B:57:0x0175, B:59:0x017d, B:60:0x0183), top: B:67:0x001d }] */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0183 A[Catch: CancellationException -> 0x018b, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x018b, blocks: (B:8:0x001d, B:57:0x0175, B:59:0x017d, B:60:0x0183), top: B:67:0x001d }] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                        /*
                            Method dump skipped, instructions count: 436
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.C10741.AnonymousClass1.C47421.C47431.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C47421(boolean z3, float f4, RangeSliderLogic rangeSliderLogic, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super C47421> continuation) {
                    super(2, continuation);
                    this.$isRtl = z3;
                    this.$maxPx = f4;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$rawOffsetStart = state;
                    this.$$this$coroutineScope = coroutineScope;
                    this.$gestureEndAction = state2;
                    this.$rawOffsetEnd = state3;
                    this.$onDrag = state4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C47421 c47421 = new C47421(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                    c47421.L$0 = obj;
                    return c47421;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((C47421) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i4 = this.label;
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C47431 c47431 = new C47431(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                        this.label = 1;
                        if (pointerInputScope.awaitPointerEventScope(c47431, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(PointerInputScope pointerInputScope, boolean z3, float f4, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$pointerInput = pointerInputScope;
                this.$isRtl = z3;
                this.$maxPx = f4;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$rawOffsetStart = state;
                this.$gestureEndAction = state2;
                this.$rawOffsetEnd = state3;
                this.$onDrag = state4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C47421 c47421 = new C47421(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                    this.label = 1;
                    if (ForEachGestureKt.forEachGesture(pointerInputScope, c47421, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10741(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends Function2<? super Boolean, ? super Float, Unit>> state3, boolean z3, float f4, State<? extends Function1<? super Boolean, Unit>> state4, Continuation<? super C10741> continuation) {
            super(2, continuation);
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$rawOffsetStart = state;
            this.$rawOffsetEnd = state2;
            this.$onDrag = state3;
            this.$isRtl = z3;
            this.$maxPx = f4;
            this.$gestureEndAction = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10741 c10741 = new C10741(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, continuation);
            c10741.L$0 = obj;
            return c10741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C10741) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$isRtl, this.$maxPx, new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag), this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        float fM8696getHandleWidthD9Ej5fM = sliderTokens.m8696getHandleWidthD9Ej5fM();
        ThumbWidth = fM8696getHandleWidthD9Ej5fM;
        float fM8695getHandleHeightD9Ej5fM = sliderTokens.m8695getHandleHeightD9Ej5fM();
        ThumbHeight = fM8695getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m11547DpSizeYgX7TsA(fM8696getHandleWidthD9Ej5fM, fM8695getHandleHeightD9Ej5fM);
        ThumbDefaultElevation = C1700Dp.m11525constructorimpl(1);
        ThumbPressedElevation = C1700Dp.m11525constructorimpl(6);
        TickSize = sliderTokens.m8702getTickMarksContainerSizeD9Ej5fM();
        TrackHeight = sliderTokens.m8697getInactiveTrackHeightD9Ej5fM();
        float fM11525constructorimpl = C1700Dp.m11525constructorimpl(48);
        SliderHeight = fM11525constructorimpl;
        float fM11525constructorimpl2 = C1700Dp.m11525constructorimpl(144);
        SliderMinWidth = fM11525constructorimpl2;
        DefaultSliderConstraints = SizeKt.m7347heightInVpY3zN4$default(SizeKt.m7366widthInVpY3zN4$default(Modifier.INSTANCE, fM11525constructorimpl2, 0.0f, 2, null), 0.0f, fM11525constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r41, final kotlin.jvm.functions.Function1<? super kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit> r42, androidx.compose.p006ui.Modifier r43, boolean r44, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r45, int r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, androidx.compose.material3.SliderColors r48, androidx.compose.runtime.Composer r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RangeSliderImpl(final boolean z3, final float f4, final float f5, final float[] fArr, final SliderColors sliderColors, final float f6, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, final Modifier modifier2, final Modifier modifier3, Composer composer, final int i4, final int i5) throws Resources.NotFoundException {
        Composer composerStartRestartGroup = composer.startRestartGroup(-597471305);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-597471305, i4, i5, "androidx.compose.material3.RangeSliderImpl (Slider.kt:511)");
        }
        Strings.Companion companion = Strings.INSTANCE;
        final String strM8134getStringNWtq28 = Strings_androidKt.m8134getStringNWtq28(companion.m8133getSliderRangeStartadMyvUU(), composerStartRestartGroup, 6);
        final String strM8134getStringNWtq282 = Strings_androidKt.m8134getStringNWtq28(companion.m8132getSliderRangeEndadMyvUU(), composerStartRestartGroup, 6);
        Modifier modifierThen = modifier.then(DefaultSliderConstraints);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM8824constructorimpl = Updater.m8824constructorimpl(composerStartRestartGroup);
        Updater.m8831setimpl(composerM8824constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m8831setimpl(composerM8824constructorimpl, density, companion3.getSetDensity());
        Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1755032509);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float fMo7206toPx0680j_4 = density2.mo7206toPx0680j_4(TrackHeight);
        float fMo7202toDpu2uoSUM = density2.mo7202toDpu2uoSUM(f6);
        float fM11525constructorimpl = C1700Dp.m11525constructorimpl(fMo7202toDpu2uoSUM * f4);
        float fM11525constructorimpl2 = C1700Dp.m11525constructorimpl(fMo7202toDpu2uoSUM * f5);
        int i6 = i4 << 6;
        m8104TempRangeSliderTrackau3_HiA(SizeKt.fillMaxSize$default(boxScopeInstance.align(Modifier.INSTANCE, companion2.getCenterStart()), 0.0f, 1, null), sliderColors, z3, f4, f5, fArr, ThumbWidth, fMo7206toPx0680j_4, composerStartRestartGroup, ((i4 >> 9) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 1835008 | (i6 & 896) | (i6 & 7168) | (i6 & 57344));
        m8103TempRangeSliderThumbrAjV9yQ(boxScopeInstance, fM11525constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1592025586, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                invoke(boxScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(BoxScope TempRangeSliderThumb, Composer composer2, int i7) {
                Intrinsics.checkNotNullParameter(TempRangeSliderThumb, "$this$TempRangeSliderThumb");
                if ((i7 & 81) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1592025586, i7, -1, "androidx.compose.material3.RangeSliderImpl.<anonymous>.<anonymous> (Slider.kt:552)");
                }
                SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                final String str = strM8134getStringNWtq28;
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(str);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$2$1$1
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
                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.setContentDescription(semantics, str);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierThen2 = FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (Function1) objRememberedValue), true, mutableInteractionSource).then(modifier2);
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                SliderColors sliderColors2 = sliderColors;
                boolean z4 = z3;
                int i8 = i4;
                sliderDefaults.m8101Thumb9LiSoMs(mutableInteractionSource3, modifierThen2, sliderColors2, z4, 0L, composer2, ((i8 >> 18) & 14) | ProfileVerifier.CompilationStatus.f417xf2722a21 | ((i8 >> 6) & 896) | ((i8 << 9) & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 390);
        m8103TempRangeSliderThumbrAjV9yQ(boxScopeInstance, fM11525constructorimpl2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1141545019, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                invoke(boxScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(BoxScope TempRangeSliderThumb, Composer composer2, int i7) {
                Intrinsics.checkNotNullParameter(TempRangeSliderThumb, "$this$TempRangeSliderThumb");
                if ((i7 & 81) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1141545019, i7, -1, "androidx.compose.material3.RangeSliderImpl.<anonymous>.<anonymous> (Slider.kt:568)");
                }
                SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                final String str = strM8134getStringNWtq282;
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(str);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$3$1$1
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
                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.setContentDescription(semantics, str);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierThen2 = FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (Function1) objRememberedValue), true, mutableInteractionSource2).then(modifier3);
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                SliderColors sliderColors2 = sliderColors;
                boolean z4 = z3;
                int i8 = i4;
                sliderDefaults.m8101Thumb9LiSoMs(mutableInteractionSource3, modifierThen2, sliderColors2, z4, 0L, composer2, ((i8 >> 21) & 14) | ProfileVerifier.CompilationStatus.f417xf2722a21 | ((i8 >> 6) & 896) | ((i8 << 9) & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 390);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSliderImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) throws Resources.NotFoundException {
                SliderKt.RangeSliderImpl(z3, f4, f5, fArr, sliderColors, f6, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, composer2, i4 | 1, i5);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r44, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r45, androidx.compose.p006ui.Modifier r46, boolean r47, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r48, int r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, androidx.compose.material3.SliderColors r51, androidx.compose.foundation.interaction.MutableInteractionSource r52, androidx.compose.runtime.Composer r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0594  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SliderImpl(final androidx.compose.p006ui.Modifier r32, final boolean r33, final androidx.compose.foundation.interaction.MutableInteractionSource r34, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, final int r37, final float r38, final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r39, final kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, final kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.SliderImpl(androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, int, float, kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SliderImpl$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f4, float f5, float f6) {
        return scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f6, f4, f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SliderImpl$scaleToUserValue(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f4, float f5, float f6) {
        return scale(f4, f5, f6, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: TempRangeSliderThumb-rAjV9yQ, reason: not valid java name */
    public static final void m8103TempRangeSliderThumbrAjV9yQ(final BoxScope boxScope, final float f4, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i4) {
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2104116536);
        if ((i4 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i5 |= composerStartRestartGroup.changed(f4) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(function3) ? 256 : 128;
        }
        int i6 = i5;
        if ((i6 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2104116536, i6, -1, "androidx.compose.material3.TempRangeSliderThumb (Slider.kt:946)");
            }
            Modifier modifierM7320paddingqDBjuR0$default = PaddingKt.m7320paddingqDBjuR0$default(Modifier.INSTANCE, f4, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierM7320paddingqDBjuR0$default, companion.getCenterStart());
            int i7 = (i6 << 3) & 7168;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i8 = i7 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, (i8 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | (i8 & 14));
            int i9 = (i7 << 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierAlign);
            int i10 = ((i9 << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM8824constructorimpl = Updater.m8824constructorimpl(composerStartRestartGroup);
            Updater.m8831setimpl(composerM8824constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl, density, companion2.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i10 >> 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            if (((i10 >> 9) & 14 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                function3.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i7 >> 6) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 6));
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$TempRangeSliderThumb$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i11) {
                SliderKt.m8103TempRangeSliderThumbrAjV9yQ(boxScope, f4, function3, composer2, i4 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: TempRangeSliderTrack-au3_HiA, reason: not valid java name */
    public static final void m8104TempRangeSliderTrackau3_HiA(final Modifier modifier, final SliderColors sliderColors, final boolean z3, final float f4, final float f5, final float[] fArr, final float f6, final float f7, Composer composer, final int i4) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1015664062);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1015664062, i4, -1, "androidx.compose.material3.TempRangeSliderTrack (Slider.kt:960)");
        }
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        floatRef.element = density.mo7206toPx0680j_4(f6) / 2;
        floatRef2.element = density.mo7206toPx0680j_4(TickSize);
        int i5 = ((i4 >> 6) & 14) | 48 | ((i4 << 3) & 896);
        final State<Color> stateTrackColor$material3_release = sliderColors.trackColor$material3_release(z3, false, composerStartRestartGroup, i5);
        final State<Color> stateTrackColor$material3_release2 = sliderColors.trackColor$material3_release(z3, true, composerStartRestartGroup, i5);
        final State<Color> stateTickColor$material3_release = sliderColors.tickColor$material3_release(z3, false, composerStartRestartGroup, i5);
        final State<Color> stateTickColor$material3_release2 = sliderColors.tickColor$material3_release(z3, true, composerStartRestartGroup, i5);
        CanvasKt.Canvas(modifier, new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderKt$TempRangeSliderTrack$2
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
            public final void invoke2(DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                boolean z4 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
                long jOffset = OffsetKt.Offset(floatRef.element, Offset.m8946getYimpl(Canvas.mo9613getCenterF1C5BW0()));
                long jOffset2 = OffsetKt.Offset(Size.m9014getWidthimpl(Canvas.mo9614getSizeNHjbRc()) - floatRef.element, Offset.m8946getYimpl(Canvas.mo9613getCenterF1C5BW0()));
                long j4 = z4 ? jOffset2 : jOffset;
                long j5 = z4 ? jOffset : jOffset2;
                long jM9188unboximpl = stateTrackColor$material3_release.getValue().m9188unboximpl();
                float f8 = f7;
                StrokeCap.Companion companion = StrokeCap.INSTANCE;
                long j6 = j5;
                long j7 = j4;
                AbstractC1312b.m428C(Canvas, jM9188unboximpl, j4, j5, f8, companion.m9502getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                AbstractC1312b.m428C(Canvas, stateTrackColor$material3_release2.getValue().m9188unboximpl(), OffsetKt.Offset(Offset.m8945getXimpl(j7) + ((Offset.m8945getXimpl(j6) - Offset.m8945getXimpl(j7)) * f4), Offset.m8946getYimpl(Canvas.mo9613getCenterF1C5BW0())), OffsetKt.Offset(Offset.m8945getXimpl(j7) + ((Offset.m8945getXimpl(j6) - Offset.m8945getXimpl(j7)) * f5), Offset.m8946getYimpl(Canvas.mo9613getCenterF1C5BW0())), f7, companion.m9502getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                float[] fArr2 = fArr;
                float f9 = f5;
                float f10 = f4;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = fArr2.length;
                for (int i6 = 0; i6 < length; i6++) {
                    float f11 = fArr2[i6];
                    Boolean boolValueOf = Boolean.valueOf(f11 > f9 || f11 < f10);
                    Object arrayList = linkedHashMap.get(boolValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(boolValueOf, arrayList);
                    }
                    ((List) arrayList).add(Float.valueOf(f11));
                }
                State<Color> state = stateTickColor$material3_release;
                State<Color> state2 = stateTickColor$material3_release2;
                Ref.FloatRef floatRef3 = floatRef2;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Offset.m8934boximpl(OffsetKt.Offset(Offset.m8945getXimpl(OffsetKt.m8968lerpWko1d7g(j7, j6, ((Number) it.next()).floatValue())), Offset.m8946getYimpl(Canvas.mo9613getCenterF1C5BW0()))));
                    }
                    long j8 = j6;
                    long j9 = j7;
                    AbstractC1312b.m433H(Canvas, arrayList2, PointMode.INSTANCE.m9454getPointsr_lszbg(), (zBooleanValue ? state : state2).getValue().m9188unboximpl(), floatRef3.element, StrokeCap.INSTANCE.m9502getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    j7 = j9;
                    floatRef3 = floatRef3;
                    j6 = j8;
                }
            }
        }, composerStartRestartGroup, i4 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$TempRangeSliderTrack$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) {
                SliderKt.m8104TempRangeSliderTrackau3_HiA(modifier, sliderColors, z3, f4, f5, fArr, f6, f7, composer2, i4 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f4, float f5, float f6, Continuation<? super Unit> continuation) {
        Object objM163a = AbstractC0504a.m163a(draggableState, null, new C10732(f4, f5, f6, null), continuation, 1, null);
        return objM163a == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM163a : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8108awaitSlop8vUncbI(androidx.compose.p006ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, kotlin.coroutines.Continuation<? super kotlin.Pair<androidx.compose.p006ui.input.pointer.PointerInputChange, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = (androidx.compose.material3.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = new androidx.compose.material3.SliderKt$awaitSlop$1
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            kotlin.ResultKt.throwOnFailure(r12)
            goto L54
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>()
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.DragGestureDetectorCopyKt.m7952awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L51
            return r0
        L51:
            r7 = r12
            r12 = r8
            r8 = r7
        L54:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L63
            float r8 = r8.element
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r8)
            kotlin.Pair r8 = kotlin.TuplesKt.m5182to(r12, r8)
            goto L64
        L63:
            r8 = 0
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m8108awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f4, float f5, float f6) {
        float f7 = f5 - f4;
        return RangesKt___RangesKt.coerceIn((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f6 - f4) / f7, 0.0f, 1.0f);
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z3, boolean z4, float f4, ClosedFloatingPointRange<Float> closedFloatingPointRange, State<? extends Function1<? super Boolean, Unit>> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4) {
        return z3 ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f4), Boolean.valueOf(z4), closedFloatingPointRange}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new C10741(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z4, f4, state3, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f4, float f5, float f6, float f7, float f8) {
        return MathHelpersKt.lerp(f7, f8, calcFraction(f4, f5, f6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f4, final boolean z3, final Function1<? super Float, Unit> function1, final Function0<Unit> function0, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final int i4) {
        final float fCoerceIn = RangesKt___RangesKt.coerceIn(f4, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (!z3) {
                    SemanticsPropertiesKt.disabled(semantics);
                }
                final ClosedFloatingPointRange<Float> closedFloatingPointRange2 = closedFloatingPointRange;
                final int i5 = i4;
                final float f5 = fCoerceIn;
                final Function1<Float, Unit> function12 = function1;
                final Function0<Unit> function02 = function0;
                SemanticsPropertiesKt.setProgress$default(semantics, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f6) {
                        return invoke(f6.floatValue());
                    }

                    public final Boolean invoke(float f6) {
                        int i6;
                        float fCoerceIn2 = RangesKt___RangesKt.coerceIn(f6, closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
                        int i7 = i5;
                        boolean z4 = false;
                        if (i7 > 0 && (i6 = i7 + 1) >= 0) {
                            float fAbs = fCoerceIn2;
                            float f7 = fAbs;
                            int i8 = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), i8 / (i5 + 1));
                                float f8 = fLerp - fCoerceIn2;
                                if (Math.abs(f8) <= fAbs) {
                                    fAbs = Math.abs(f8);
                                    f7 = fLerp;
                                }
                                if (i8 == i6) {
                                    break;
                                }
                                i8++;
                            }
                            fCoerceIn2 = f7;
                        }
                        if (!(fCoerceIn2 == f5)) {
                            function12.invoke(Float.valueOf(fCoerceIn2));
                            Function0<Unit> function03 = function02;
                            if (function03 != null) {
                                function03.invoke();
                            }
                            z4 = true;
                        }
                        return Boolean.valueOf(z4);
                    }
                }, 1, null);
            }
        }, 1, null), f4, closedFloatingPointRange, i4);
    }

    public static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f4, boolean z3, Function1 function1, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            function0 = null;
        }
        Function0 function02 = function0;
        if ((i5 & 16) != 0) {
            closedFloatingPointRange = RangesKt__RangesKt.rangeTo(0.0f, 1.0f);
        }
        ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
        if ((i5 & 32) != 0) {
            i4 = 0;
        }
        return sliderSemantics(modifier, f4, z3, function1, function02, closedFloatingPointRange2, i4);
    }

    private static final Modifier sliderTapModifier(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final int i4, final boolean z3, final State<Float> state, final State<? extends Function0<Unit>> state2, final MutableState<Float> mutableState, final boolean z4) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
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
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("sliderTapModifier");
                inspectorInfo.getProperties().set("draggableState", draggableState);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("maxPx", Integer.valueOf(i4));
                inspectorInfo.getProperties().set("isRtl", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("rawOffset", state);
                inspectorInfo.getProperties().set("gestureEndAction", state2);
                inspectorInfo.getProperties().set("pressOffset", mutableState);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.SliderKt.sliderTapModifier.2

            @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m5191c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1", m5192f = "Slider.kt", m5193i = {}, m5194l = {1129}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
            /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ DraggableState $draggableState;
                final /* synthetic */ State<Function0<Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ int $maxPx;
                final /* synthetic */ MutableState<Float> $pressOffset;
                final /* synthetic */ State<Float> $rawOffset;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m5191c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1", m5192f = "Slider.kt", m5193i = {}, m5194l = {1134}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
                /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C47441 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ int $maxPx;
                    final /* synthetic */ MutableState<Float> $pressOffset;
                    final /* synthetic */ State<Float> $rawOffset;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C47441(boolean z3, int i4, MutableState<Float> mutableState, State<Float> state, Continuation<? super C47441> continuation) {
                        super(3, continuation);
                        this.$isRtl = z3;
                        this.$maxPx = i4;
                        this.$pressOffset = mutableState;
                        this.$rawOffset = state;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                        return m8109invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
                    }

                    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m8109invoked4ec7I(PressGestureScope pressGestureScope, long j4, Continuation<? super Unit> continuation) {
                        C47441 c47441 = new C47441(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, continuation);
                        c47441.L$0 = pressGestureScope;
                        c47441.J$0 = j4;
                        return c47441.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i4 = this.label;
                        try {
                            if (i4 == 0) {
                                ResultKt.throwOnFailure(obj);
                                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                long j4 = this.J$0;
                                this.$pressOffset.setValue(Boxing.boxFloat((this.$isRtl ? this.$maxPx - Offset.m8945getXimpl(j4) : Offset.m8945getXimpl(j4)) - this.$rawOffset.getValue().floatValue()));
                                this.label = 1;
                                if (pressGestureScope.awaitRelease(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i4 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                        } catch (GestureCancellationException unused) {
                            this.$pressOffset.setValue(Boxing.boxFloat(0.0f));
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(boolean z3, int i4, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function0<Unit>> state2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$isRtl = z3;
                    this.$maxPx = i4;
                    this.$pressOffset = mutableState;
                    this.$rawOffset = state;
                    this.$scope = coroutineScope;
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i4 = this.label;
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C47441 c47441 = new C47441(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                        final CoroutineScope coroutineScope = this.$scope;
                        final DraggableState draggableState = this.$draggableState;
                        final State<Function0<Unit>> state = this.$gestureEndAction;
                        Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.material3.SliderKt.sliderTapModifier.2.1.2

                            @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                            @DebugMetadata(m5191c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1", m5192f = "Slider.kt", m5193i = {}, m5194l = {1141}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
                            /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1, reason: invalid class name and collision with other inner class name */
                            public static final class C47451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ DraggableState $draggableState;
                                final /* synthetic */ State<Function0<Unit>> $gestureEndAction;
                                int label;

                                @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                                @DebugMetadata(m5191c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1", m5192f = "Slider.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
                                /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                                public static final class C47461 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                                    private /* synthetic */ Object L$0;
                                    int label;

                                    public C47461(Continuation<? super C47461> continuation) {
                                        super(2, continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        C47461 c47461 = new C47461(continuation);
                                        c47461.L$0 = obj;
                                        return c47461;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
                                        return ((C47461) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        if (this.label != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                        ((DragScope) this.L$0).dragBy(0.0f);
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C47451(DraggableState draggableState, State<? extends Function0<Unit>> state, Continuation<? super C47451> continuation) {
                                    super(2, continuation);
                                    this.$draggableState = draggableState;
                                    this.$gestureEndAction = state;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C47451(this.$draggableState, this.$gestureEndAction, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i4 = this.label;
                                    if (i4 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        DraggableState draggableState = this.$draggableState;
                                        MutatePriority mutatePriority = MutatePriority.UserInput;
                                        C47461 c47461 = new C47461(null);
                                        this.label = 1;
                                        if (draggableState.drag(mutatePriority, c47461, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i4 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    this.$gestureEndAction.getValue().invoke();
                                    return Unit.INSTANCE;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C47451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                m8110invokek4lQ0M(offset.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m8110invokek4lQ0M(long j4) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C47451(draggableState, state, null), 3, null);
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c47441, function1, this, 3, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier composed, Composer composer, int i5) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(2040469710);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2040469710, i5, -1, "androidx.compose.material3.sliderTapModifier.<anonymous> (Slider.kt:1124)");
                }
                if (z4) {
                    composer.startReplaceableGroup(773894976);
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composer.endReplaceableGroup();
                    composed = SuspendingPointerInputFilterKt.pointerInput(composed, new Object[]{draggableState, mutableInteractionSource, Integer.valueOf(i4), Boolean.valueOf(z3)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1(z3, i4, mutableState, state, coroutineScope, draggableState, state2, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return composed;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final float snapValueToTick(float f4, float[] fArr, float f5, float f6) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f7 = fArr[0];
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
            if (lastIndex == 0) {
                fValueOf = Float.valueOf(f7);
            } else {
                float fAbs = Math.abs(MathHelpersKt.lerp(f5, f6, f7) - f4);
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    float f8 = fArr[it.nextInt()];
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f5, f6, f8) - f4);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f7 = f8;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f7);
            }
        }
        return fValueOf != null ? MathHelpersKt.lerp(f5, f6, fValueOf.floatValue()) : f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] stepsToTickFractions(int i4) {
        if (i4 == 0) {
            return new float[0];
        }
        int i5 = i4 + 2;
        float[] fArr = new float[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr[i6] = i6 / (i4 + 1);
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> scale(float f4, float f5, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f6, float f7) {
        return RangesKt__RangesKt.rangeTo(scale(f4, f5, closedFloatingPointRange.getStart().floatValue(), f6, f7), scale(f4, f5, closedFloatingPointRange.getEndInclusive().floatValue(), f6, f7));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r45, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r46, androidx.compose.p006ui.Modifier r47, boolean r48, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r49, int r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, androidx.compose.material3.SliderColors r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, final kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r47, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r48, final kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, androidx.compose.p006ui.Modifier r50, boolean r51, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r52, int r53, kotlin.jvm.functions.Function0<kotlin.Unit> r54, androidx.compose.material3.SliderColors r55, androidx.compose.foundation.interaction.MutableInteractionSource r56, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, androidx.compose.runtime.Composer r58, final int r59, final int r60, final int r61) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
