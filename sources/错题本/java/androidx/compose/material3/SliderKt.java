package androidx.compose.material3;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.C2075R;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.C2142xe3d9cdbd;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p011ui.layout.LayoutIdKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.DpKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p169t6.AbstractC6600a;
import p200x6.C6751a;
import p200x6.C6755e;
import p200x6.C6756f;
import p200x6.InterfaceC6752b;

@Metadata(m5109d1 = {"\u0000\u0094\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aµ\u0001\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0019\u001au\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u0013\u0010\u001b\u001a\u0081\u0001\u0010\u001c\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aæ\u0001\u0010\u001c\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\u0019\b\u0002\u0010!\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\b\b\u0003\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001c\u0010#\u001a\u009a\u0001\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020 2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\u0019\b\u0002\u0010!\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001c\u0010$\u001aa\u0010%\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b%\u0010&\u001a\u0082\u0001\u0010'\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b'\u0010(\u001a/\u0010.\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0002¢\u0006\u0004\b.\u0010/\u001a5\u00109\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0000\u0018\u000105*\u0002002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0082@ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a\u0017\u0010:\u001a\u00020*2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b:\u0010;\u001a7\u0010A\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0000H\u0002¢\u0006\u0004\bA\u0010B\u001a:\u0010A\u001a\u00020C2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a'\u0010J\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0000H\u0002¢\u0006\u0004\bJ\u0010K\u001a#\u0010L\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bL\u0010M\u001a#\u0010N\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001a\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bN\u0010O\u001a#\u0010P\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001a\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bP\u0010O\u001a+\u0010Q\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\bQ\u0010R\u001a3\u0010S\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001a\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\bS\u0010T\u001a\u001f\u0010W\u001a\u00020C2\u0006\u0010U\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0000H\u0001¢\u0006\u0004\bW\u0010X\u001a\u001d\u0010W\u001a\u00020C2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0001¢\u0006\u0004\bW\u0010Z\"\u001a\u0010\\\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u001a\u0010`\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010]\u001a\u0004\ba\u0010_\"\u0014\u0010b\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010]\"\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e\"\u0014\u0010f\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010]\"\u0014\u0010g\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010]\"\u0014\u0010i\u001a\u00020h8\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010j\"\u001e\u0010o\u001a\u00020\u0007*\u00020C8@X\u0081\u0004¢\u0006\f\u0012\u0004\bm\u0010n\u001a\u0004\bk\u0010l\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006p"}, m5110d2 = {"", "value", "Lkotlin/Function1;", "Ld6/s;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lx6/b;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/material3/SliderColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Slider", "(FLr6/c;Landroidx/compose/ui/Modifier;ZLx6/b;ILr6/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SliderState;", "Landroidx/compose/runtime/Composable;", "thumb", "track", "(FLr6/c;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILr6/f;Lr6/f;Lx6/b;Landroidx/compose/runtime/Composer;III)V", "state", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/f;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "RangeSlider", "(Lx6/b;Lr6/c;Landroidx/compose/ui/Modifier;ZLx6/b;ILr6/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "startInteractionSource", "endInteractionSource", "Landroidx/compose/material3/RangeSliderState;", "startThumb", "endThumb", "(Lx6/b;Lr6/c;Landroidx/compose/ui/Modifier;ZLx6/b;Lr6/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/f;Lr6/f;Lr6/f;ILandroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/f;Lr6/f;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/f;Lr6/f;Landroidx/compose/runtime/Composer;I)V", "RangeSliderImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RangeSliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/f;Lr6/f;Lr6/f;Landroidx/compose/runtime/Composer;I)V", "current", "", "tickFractions", "minPx", "maxPx", "snapValueToTick", "(F[FFF)F", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "Landroidx/compose/ui/input/pointer/PointerType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILh6/c;)Ljava/lang/Object;", "awaitSlop", "stepsToTickFractions", "(I)[F", "a1", "b1", "x1", "a2", "b2", "scale", "(FFFFF)F", "Landroidx/compose/material3/SliderRange;", "x", "scale-ziovWd0", "(FFJFF)J", "a", "b", "pos", "calcFraction", "(FFF)F", "sliderSemantics", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderState;Z)Landroidx/compose/ui/Modifier;", "rangeSliderStartThumbSemantics", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RangeSliderState;Z)Landroidx/compose/ui/Modifier;", "rangeSliderEndThumbSemantics", "sliderTapModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Z)Landroidx/compose/ui/Modifier;", "rangeSliderPressDragModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RangeSliderState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Z)Landroidx/compose/ui/Modifier;", "start", "endInclusive", "SliderRange", "(FF)J", "range", "(Lx6/b;)J", "Landroidx/compose/ui/unit/Dp;", "TrackHeight", "F", "getTrackHeight", "()F", "ThumbWidth", "getThumbWidth", "ThumbHeight", "Landroidx/compose/ui/unit/DpSize;", "ThumbSize", "J", "ThumbTrackGapSize", "TrackInsideCornerSize", "", "SliderRangeTolerance", "D", "isSpecified-If1S1O4", "(J)Z", "isSpecified-If1S1O4$annotations", "(J)V", "isSpecified", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 10 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2263:1\n1223#2,6:2264\n1223#2,6:2270\n1223#2,6:2276\n1223#2,6:2282\n1223#2,6:2289\n1223#2,6:2295\n1223#2,6:2301\n1223#2,6:2307\n1223#2,6:2313\n1223#2,6:2319\n1223#2,6:2325\n1223#2,6:2331\n1223#2,6:2338\n1223#2,6:2344\n1223#2,6:2378\n1223#2,6:2470\n1223#2,6:2504\n1223#2,6:2510\n1223#2,6:2556\n1223#2,6:2562\n1#3:2288\n77#4:2337\n77#4:2467\n78#5,6:2350\n85#5,4:2365\n89#5,2:2375\n78#5,6:2391\n85#5,4:2406\n89#5,2:2416\n93#5:2422\n78#5,6:2431\n85#5,4:2446\n89#5,2:2456\n93#5:2462\n93#5:2466\n78#5,6:2476\n85#5,4:2491\n89#5,2:2501\n78#5,6:2523\n85#5,4:2538\n89#5,2:2548\n93#5:2554\n78#5,6:2575\n85#5,4:2590\n89#5,2:2600\n93#5:2606\n78#5,6:2615\n85#5,4:2630\n89#5,2:2640\n93#5:2646\n93#5:2650\n368#6,9:2356\n377#6:2377\n368#6,9:2397\n377#6:2418\n378#6,2:2420\n368#6,9:2437\n377#6:2458\n378#6,2:2460\n378#6,2:2464\n368#6,9:2482\n377#6:2503\n368#6,9:2529\n377#6:2550\n378#6,2:2552\n368#6,9:2581\n377#6:2602\n378#6,2:2604\n368#6,9:2621\n377#6:2642\n378#6,2:2644\n378#6,2:2648\n4032#7,6:2369\n4032#7,6:2410\n4032#7,6:2450\n4032#7,6:2495\n4032#7,6:2542\n4032#7,6:2594\n4032#7,6:2634\n71#8:2384\n68#8,6:2385\n74#8:2419\n78#8:2423\n71#8:2424\n68#8,6:2425\n74#8:2459\n78#8:2463\n71#8:2516\n68#8,6:2517\n74#8:2551\n78#8:2555\n71#8:2568\n68#8,6:2569\n74#8:2603\n78#8:2607\n71#8:2608\n68#8,6:2609\n74#8:2643\n78#8:2647\n57#9:2468\n60#9:2469\n16867#10,14:2651\n63#11,3:2665\n63#11,3:2668\n148#12:2671\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n*L\n169#1:2264,6\n258#1:2270,6\n273#1:2276,6\n341#1:2282,6\n411#1:2289,6\n412#1:2295,6\n513#1:2301,6\n514#1:2307,6\n539#1:2313,6\n550#1:2319,6\n618#1:2325,6\n619#1:2331,6\n674#1:2338,6\n699#1:2344,6\n683#1:2378,6\n785#1:2470,6\n756#1:2504,6\n758#1:2510,6\n769#1:2556,6\n771#1:2562,6\n666#1:2337\n737#1:2467\n679#1:2350,6\n679#1:2365,4\n679#1:2375,2\n681#1:2391,6\n681#1:2406,4\n681#1:2416,2\n681#1:2422\n689#1:2431,6\n689#1:2446,4\n689#1:2456,2\n689#1:2462\n679#1:2466\n750#1:2476,6\n750#1:2491,4\n750#1:2501,2\n752#1:2523,6\n752#1:2538,4\n752#1:2548,2\n752#1:2554\n765#1:2575,6\n765#1:2590,4\n765#1:2600,2\n765#1:2606\n778#1:2615,6\n778#1:2630,4\n778#1:2640,2\n778#1:2646\n750#1:2650\n679#1:2356,9\n679#1:2377\n681#1:2397,9\n681#1:2418\n681#1:2420,2\n689#1:2437,9\n689#1:2458\n689#1:2460,2\n679#1:2464,2\n750#1:2482,9\n750#1:2503\n752#1:2529,9\n752#1:2550\n752#1:2552,2\n765#1:2581,9\n765#1:2602\n765#1:2604,2\n778#1:2621,9\n778#1:2642\n778#1:2644,2\n750#1:2648,2\n679#1:2369,6\n681#1:2410,6\n689#1:2450,6\n750#1:2495,6\n752#1:2542,6\n765#1:2594,6\n778#1:2634,6\n681#1:2384\n681#1:2385,6\n681#1:2419\n681#1:2423\n689#1:2424\n689#1:2425,6\n689#1:2459\n689#1:2463\n752#1:2516\n752#1:2517,6\n752#1:2551\n752#1:2555\n765#1:2568\n765#1:2569,6\n765#1:2603\n765#1:2607\n778#1:2608\n778#1:2609,6\n778#1:2643\n778#1:2647\n747#1:2468\n748#1:2469\n1413#1:2651,14\n2238#1:2665,3\n2256#1:2668,3\n1869#1:2671\n*E\n"})
/* loaded from: classes.dex */
public final class SliderKt {
    private static final double SliderRangeTolerance = 1.0E-4d;
    private static final float ThumbHeight;
    private static final long ThumbSize;
    private static final float ThumbTrackGapSize;
    private static final float ThumbWidth;
    private static final float TrackHeight;
    private static final float TrackInsideCornerSize;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/PointerInputScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", m5303f = "Slider.kt", m5304i = {}, m5305l = {1651}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1 */
    public static final class C18381 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        final /* synthetic */ RangeSliderState $state;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
        @DebugMetadata(m5302c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", m5303f = "Slider.kt", m5304i = {}, m5305l = {1652}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ RangeSliderState $state;
            private /* synthetic */ Object L$0;
            int label;

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
            @DebugMetadata(m5302c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", m5303f = "Slider.kt", m5304i = {0, 1, 1, 1, 1, 1, 2, 2}, m5305l = {1653, 1665, 1687}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture", "$this$awaitEachGesture", NotificationCompat.CATEGORY_EVENT, "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, m5308s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
            /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C68651 extends RestrictedSuspendLambda implements InterfaceC6473e {
                final /* synthetic */ InterfaceC6009v $$this$coroutineScope;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ RangeSliderState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                @DebugMetadata(m5302c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", m5303f = "Slider.kt", m5304i = {}, m5305l = {1705}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
                public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
                    final /* synthetic */ Ref$BooleanRef $draggingStart;
                    final /* synthetic */ DragInteraction $finishInteraction;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref$BooleanRef ref$BooleanRef, DragInteraction dragInteraction, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$draggingStart = ref$BooleanRef;
                        this.$finishInteraction = dragInteraction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                        return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, interfaceC5631c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            AbstractC5774b.m5119b(obj);
                            MutableInteractionSource mutableInteractionSourceActiveInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element);
                            DragInteraction dragInteraction = this.$finishInteraction;
                            this.label = 1;
                            if (mutableInteractionSourceActiveInteraction.emit(dragInteraction, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC5774b.m5119b(obj);
                        }
                        return C5443s.f8405a;
                    }

                    @Override // p152r6.InterfaceC6473e
                    @Nullable
                    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C68651(RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C68651> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$state = rangeSliderState;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$$this$coroutineScope = interfaceC6009v;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                    C68651 c68651 = new C68651(this.$state, this.$rangeSliderLogic, this.$$this$coroutineScope, interfaceC5631c);
                    c68651.L$0 = obj;
                    return c68651;
                }

                @Override // p152r6.InterfaceC6473e
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C68651) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:51:0x0164, code lost:
                
                    if (r1 != r6) goto L53;
                 */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) {
                    /*
                        Method dump skipped, instructions count: 417
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.C18381.AnonymousClass1.C68651.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$$this$pointerInput = pointerInputScope;
                this.$state = rangeSliderState;
                this.$rangeSliderLogic = rangeSliderLogic;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$state, this.$rangeSliderLogic, interfaceC5631c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C68651 c68651 = new C68651(this.$state, this.$rangeSliderLogic, interfaceC6009v, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c68651, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                }
                return C5443s.f8405a;
            }

            @Override // p152r6.InterfaceC6473e
            @Nullable
            public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18381(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, InterfaceC5631c<? super C18381> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$state = rangeSliderState;
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            C18381 c18381 = new C18381(this.$state, this.$startInteractionSource, this.$endInteractionSource, interfaceC5631c);
            c18381.L$0 = obj;
            return c18381;
        }

        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C18381) create(pointerInputScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$state, new RangeSliderLogic(this.$state, this.$startInteractionSource, this.$endInteractionSource), null);
                this.label = 1;
                if (AbstractC6014x.m5637h(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/PointerInputScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.SliderKt$sliderTapModifier$1", m5303f = "Slider.kt", m5304i = {}, m5305l = {1627}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1 */
    public static final class C18421 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ SliderState $state;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/PressGestureScope;Landroidx/compose/ui/geometry/Offset;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
        @DebugMetadata(m5302c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", m5303f = "Slider.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6474f {
            final /* synthetic */ SliderState $state;
            /* synthetic */ long J$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SliderState sliderState, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(3, interfaceC5631c);
                this.$state = sliderState;
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m8919invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m10451unboximpl(), (InterfaceC5631c) obj3);
            }

            @Nullable
            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final Object m8919invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j7, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, interfaceC5631c);
                anonymousClass1.J$0 = j7;
                return anonymousClass1.invokeSuspend(C5443s.f8405a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                this.$state.m8932onPressk4lQ0M$material3_release(this.J$0);
                return C5443s.f8405a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18421(SliderState sliderState, InterfaceC5631c<? super C18421> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$state = sliderState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            C18421 c18421 = new C18421(this.$state, interfaceC5631c);
            c18421.L$0 = obj;
            return c18421;
        }

        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C18421) create(pointerInputScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, null);
                final SliderState sliderState = this.$state;
                InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt.sliderTapModifier.1.2
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        m8920invokek4lQ0M(((Offset) obj2).m10451unboximpl());
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m8920invokek4lQ0M(long j7) {
                        sliderState.dispatchRawDelta(0.0f);
                        sliderState.getGestureEndAction().invoke();
                    }
                };
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, interfaceC6471c, this, 3, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }
    }

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        TrackHeight = sliderTokens.m9915getInactiveTrackHeightD9Ej5fM();
        float fM9913getHandleWidthD9Ej5fM = sliderTokens.m9913getHandleWidthD9Ej5fM();
        ThumbWidth = fM9913getHandleWidthD9Ej5fM;
        float fM9912getHandleHeightD9Ej5fM = sliderTokens.m9912getHandleHeightD9Ej5fM();
        ThumbHeight = fM9912getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m13327DpSizeYgX7TsA(fM9913getHandleWidthD9Ej5fM, fM9912getHandleHeightD9Ej5fM);
        ThumbTrackGapSize = sliderTokens.m9905getActiveHandleLeadingSpaceD9Ej5fM();
        TrackInsideCornerSize = C2331Dp.m13305constructorimpl(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(@org.jetbrains.annotations.NotNull final p200x6.InterfaceC6752b r28, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r29, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r30, boolean r31, @org.jetbrains.annotations.Nullable p200x6.InterfaceC6752b r32, @androidx.annotation.IntRange(from = com.google.android.material.transformation.FabTransformationScrimBehavior.COLLAPSE_DELAY) int r33, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6469a r34, @org.jetbrains.annotations.Nullable androidx.compose.material3.SliderColors r35, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(x6.b, r6.c, androidx.compose.ui.Modifier, boolean, x6.b, int, r6.a, androidx.compose.material3.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void RangeSliderImpl(final Modifier modifier, final RangeSliderState rangeSliderState, final boolean z8, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final InterfaceC6474f interfaceC6474f, InterfaceC6474f interfaceC6474f2, InterfaceC6474f interfaceC6474f3, Composer composer, final int i) {
        Modifier modifier2;
        int i8;
        InterfaceC6474f interfaceC6474f4;
        final InterfaceC6474f interfaceC6474f5;
        InterfaceC6474f interfaceC6474f6 = interfaceC6474f3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1411725677);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i8 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(rangeSliderState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6474f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6474f2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6474f6) ? 8388608 : 4194304;
        }
        if ((4793491 & i8) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            interfaceC6474f4 = interfaceC6474f2;
            interfaceC6474f5 = interfaceC6474f6;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1411725677, i8, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:735)");
            }
            rangeSliderState.setRtl$material3_release(composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierRangeSliderPressDragModifier = rangeSliderPressDragModifier(companion, rangeSliderState, mutableInteractionSource, mutableInteractionSource2, z8);
            Strings.Companion companion2 = Strings.INSTANCE;
            final String strM9393getString2EP1pXo = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C2075R.string.range_start), composerStartRestartGroup, 0);
            final String strM9393getString2EP1pXo2 = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C2075R.string.range_end), composerStartRestartGroup, 0);
            Modifier modifierThen = SizeKt.m7305requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null).then(modifierRangeSliderPressDragModifier);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(rangeSliderState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo6545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j7) {
                        long j8 = j7;
                        int size = list.size();
                        int i9 = 0;
                        int i10 = 0;
                        while (i10 < size) {
                            Measurable measurable = list.get(i10);
                            if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                                final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j8);
                                int size2 = list.size();
                                int i11 = 0;
                                while (i11 < size2) {
                                    Measurable measurable2 = list.get(i11);
                                    if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                        final Placeable placeableMo12033measureBRTryo02 = measurable2.mo12033measureBRTryo0(j8);
                                        int size3 = list.size();
                                        while (i9 < size3) {
                                            Measurable measurable3 = list.get(i9);
                                            if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                                final Placeable placeableMo12033measureBRTryo03 = measurable3.mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(ConstraintsKt.m13278offsetNN6EwU$default(j8, (-(placeableMo12033measureBRTryo02.getWidth() + placeableMo12033measureBRTryo0.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                                int width = ((placeableMo12033measureBRTryo02.getWidth() + placeableMo12033measureBRTryo0.getWidth()) / 2) + placeableMo12033measureBRTryo03.getWidth();
                                                int iMax = Math.max(placeableMo12033measureBRTryo03.getHeight(), Math.max(placeableMo12033measureBRTryo0.getHeight(), placeableMo12033measureBRTryo02.getHeight()));
                                                rangeSliderState.setTrackHeight$material3_release(placeableMo12033measureBRTryo03.getHeight());
                                                rangeSliderState.setTotalWidth$material3_release(width);
                                                rangeSliderState.updateMinMaxPx$material3_release();
                                                final int width2 = placeableMo12033measureBRTryo0.getWidth() / 2;
                                                final int iM6241q = AbstractC6600a.m6241q(rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release() * placeableMo12033measureBRTryo03.getWidth());
                                                final int iM6241q2 = AbstractC6600a.m6241q((rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release() * placeableMo12033measureBRTryo03.getWidth()) + AbstractC0584a.m898C(placeableMo12033measureBRTryo02, placeableMo12033measureBRTryo0.getWidth(), 2));
                                                final int iM906g = AbstractC0584a.m906g(placeableMo12033measureBRTryo03, iMax, 2);
                                                final int iM906g2 = AbstractC0584a.m906g(placeableMo12033measureBRTryo0, iMax, 2);
                                                final int iM906g3 = AbstractC0584a.m906g(placeableMo12033measureBRTryo02, iMax, 2);
                                                return MeasureScope.layout$default(measureScope, width, iMax, null, new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // p152r6.InterfaceC6471c
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        invoke((Placeable.PlacementScope) obj);
                                                        return C5443s.f8405a;
                                                    }

                                                    public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo03, width2, iM906g, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo0, iM6241q, iM906g2, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo02, iM6241q2, iM906g3, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                            i9++;
                                            j8 = j7;
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    i11++;
                                    j8 = j7;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i10++;
                            j8 = j7;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            int i9 = i8;
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(companion, RangeSliderComponents.STARTTHUMB), null, false, 3, null);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(rangeSliderState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$1$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m8916invokeozmzZPI(((IntSize) obj).m13480unboximpl());
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m8916invokeozmzZPI(long j7) {
                        rangeSliderState.setStartThumbWidth$material3_release(IntSize.m13476getWidthimpl(j7));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierRangeSliderStartThumbSemantics = rangeSliderStartThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(modifierWrapContentWidth$default, (InterfaceC6471c) objRememberedValue2), rangeSliderState, z8);
            boolean zChanged = composerStartRestartGroup.changed(strM9393getString2EP1pXo);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9393getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierFocusable = FocusableKt.focusable(SemanticsModifierKt.semantics(modifierRangeSliderStartThumbSemantics, true, (InterfaceC6471c) objRememberedValue3), z8, mutableInteractionSource);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFocusable);
            InterfaceC6469a constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i10 = (i9 >> 3) & 14;
            interfaceC6474f.invoke(rangeSliderState, composerStartRestartGroup, Integer.valueOf(((i9 >> 12) & 112) | i10));
            composerStartRestartGroup.endNode();
            Modifier modifierWrapContentWidth$default2 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(companion, RangeSliderComponents.ENDTHUMB), null, false, 3, null);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(rangeSliderState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$4$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m8917invokeozmzZPI(((IntSize) obj).m13480unboximpl());
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m8917invokeozmzZPI(long j7) {
                        rangeSliderState.setEndThumbWidth$material3_release(IntSize.m13476getWidthimpl(j7));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierRangeSliderEndThumbSemantics = rangeSliderEndThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(modifierWrapContentWidth$default2, (InterfaceC6471c) objRememberedValue4), rangeSliderState, z8);
            boolean zChanged2 = composerStartRestartGroup.changed(strM9393getString2EP1pXo2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9393getString2EP1pXo2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierFocusable2 = FocusableKt.focusable(SemanticsModifierKt.semantics(modifierRangeSliderEndThumbSemantics, true, (InterfaceC6471c) objRememberedValue5), z8, mutableInteractionSource2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFocusable2);
            InterfaceC6469a constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM10109constructorimpl3, currentCompositionLocalMap3);
            if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
            }
            Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            InterfaceC6474f interfaceC6474f7 = interfaceC6474f2;
            interfaceC6474f7.invoke(rangeSliderState, composerStartRestartGroup, Integer.valueOf(((i9 >> 15) & 112) | i10));
            composerStartRestartGroup.endNode();
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, RangeSliderComponents.TRACK);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            InterfaceC6469a constructor4 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl4 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r4 = AbstractC0584a.m917r(companion3, composerM10109constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM10109constructorimpl4, currentCompositionLocalMap4);
            if (composerM10109constructorimpl4.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                AbstractC0584a.m918s(currentCompositeKeyHash4, composerM10109constructorimpl4, currentCompositeKeyHash4, interfaceC6473eM917r4);
            }
            Updater.m10116setimpl(composerM10109constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            InterfaceC6474f interfaceC6474f8 = interfaceC6474f3;
            interfaceC6474f8.invoke(rangeSliderState, composerStartRestartGroup, Integer.valueOf(((i9 >> 18) & 112) | i10));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            interfaceC6474f5 = interfaceC6474f8;
            interfaceC6474f4 = interfaceC6474f7;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                interfaceC6474f5 = interfaceC6474f8;
                interfaceC6474f4 = interfaceC6474f7;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final InterfaceC6474f interfaceC6474f9 = interfaceC6474f4;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.SliderKt.RangeSliderImpl.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    SliderKt.RangeSliderImpl(modifier, rangeSliderState, z8, mutableInteractionSource, mutableInteractionSource2, interfaceC6474f, interfaceC6474f9, interfaceC6474f5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r27, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r28, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r29, boolean r30, @org.jetbrains.annotations.Nullable p200x6.InterfaceC6752b r31, @androidx.annotation.IntRange(from = com.google.android.material.transformation.FabTransformationScrimBehavior.COLLAPSE_DELAY) int r32, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6469a r33, @org.jetbrains.annotations.Nullable androidx.compose.material3.SliderColors r34, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r35, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, r6.c, androidx.compose.ui.Modifier, boolean, x6.b, int, r6.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SliderImpl(final Modifier modifier, final SliderState sliderState, final boolean z8, final MutableInteractionSource mutableInteractionSource, final InterfaceC6474f interfaceC6474f, final InterfaceC6474f interfaceC6474f2, Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1390990089);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(sliderState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6474f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6474f2) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1390990089, i8, -1, "androidx.compose.material3.SliderImpl (Slider.kt:664)");
            }
            sliderState.setRtl$material3_release(composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierSliderTapModifier = sliderTapModifier(companion, sliderState, mutableInteractionSource, z8);
            int i9 = i8;
            Orientation orientation = Orientation.Horizontal;
            boolean zIsRtl$material3_release = sliderState.getIsRtl();
            boolean zIsDragging$material3_release = sliderState.isDragging$material3_release();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(sliderState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SliderKt$SliderImpl$drag$1$1(sliderState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierThen = FocusableKt.focusable(sliderSemantics(SizeKt.m7305requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null), sliderState, z8), z8, mutableInteractionSource).then(modifierSliderTapModifier).then(DraggableKt.draggable$default(companion, sliderState, orientation, z8, mutableInteractionSource, zIsDragging$material3_release, null, (InterfaceC6474f) objRememberedValue, zIsRtl$material3_release, 32, null));
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(sliderState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo6545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j7) {
                        int size = list.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            Measurable measurable = list.get(i11);
                            if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                                long j8 = j7;
                                final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j8);
                                int size2 = list.size();
                                while (i10 < size2) {
                                    Measurable measurable2 = list.get(i10);
                                    if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                                        final Placeable placeableMo12033measureBRTryo02 = measurable2.mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(ConstraintsKt.m13278offsetNN6EwU$default(j8, -placeableMo12033measureBRTryo0.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                                        int width = placeableMo12033measureBRTryo02.getWidth() + placeableMo12033measureBRTryo0.getWidth();
                                        int iMax = Math.max(placeableMo12033measureBRTryo02.getHeight(), placeableMo12033measureBRTryo0.getHeight());
                                        sliderState.updateDimensions$material3_release(placeableMo12033measureBRTryo02.getHeight(), width);
                                        final int width2 = placeableMo12033measureBRTryo0.getWidth() / 2;
                                        final int iM6241q = AbstractC6600a.m6241q(sliderState.getCoercedValueAsFraction$material3_release() * placeableMo12033measureBRTryo02.getWidth());
                                        final int iM906g = AbstractC0584a.m906g(placeableMo12033measureBRTryo02, iMax, 2);
                                        final int iM906g2 = AbstractC0584a.m906g(placeableMo12033measureBRTryo0, iMax, 2);
                                        return MeasureScope.layout$default(measureScope, width, iMax, null, new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // p152r6.InterfaceC6471c
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((Placeable.PlacementScope) obj);
                                                return C5443s.f8405a;
                                            }

                                            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo02, width2, iM906g, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo0, iM6241q, iM906g2, 0.0f, 4, null);
                                            }
                                        }, 4, null);
                                    }
                                    i10++;
                                    j8 = j7;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(companion, SliderComponents.THUMB), null, false, 3, null);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(sliderState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt$SliderImpl$1$1$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m8918invokeozmzZPI(((IntSize) obj).m13480unboximpl());
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m8918invokeozmzZPI(long j7) {
                        sliderState.setThumbWidth$material3_release(IntSize.m13476getWidthimpl(j7));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierWrapContentWidth$default, (InterfaceC6471c) objRememberedValue3);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
            InterfaceC6469a constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i10 = (i9 >> 3) & 14;
            interfaceC6474f.invoke(sliderState, composerStartRestartGroup, Integer.valueOf(((i9 >> 9) & 112) | i10));
            composerStartRestartGroup.endNode();
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, SliderComponents.TRACK);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            InterfaceC6469a constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM10109constructorimpl3, currentCompositionLocalMap3);
            if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
            }
            Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            interfaceC6474f2.invoke(sliderState, composerStartRestartGroup, Integer.valueOf(((i9 >> 12) & 112) | i10));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.SliderKt.SliderImpl.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    SliderKt.SliderImpl(modifier, sliderState, z8, mutableInteractionSource, interfaceC6474f, interfaceC6474f2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Stable
    public static final long SliderRange(float f, float f7) {
        if ((Float.isNaN(f) && Float.isNaN(f7)) || f <= f7 + SliderRangeTolerance) {
            return SliderRange.m8922constructorimpl((Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        }
        throw new IllegalArgumentException(("start(" + f + ") must be <= endInclusive(" + f7 + ')').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8911awaitSlop8vUncbI(androidx.compose.p011ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, p075h6.InterfaceC5631c<? super kotlin.Pair<androidx.compose.p011ui.input.pointer.PointerInputChange, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = (androidx.compose.material3.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = new androidx.compose.material3.SliderKt$awaitSlop$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref$FloatRef) r8
            kotlin.AbstractC5774b.m5119b(r12)
            goto L53
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.AbstractC5774b.m5119b(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>()
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.internal.DragGestureDetectorCopyKt.m9311awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L50
            return r0
        L50:
            r7 = r12
            r12 = r8
            r8 = r7
        L53:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L64
            float r8 = r8.element
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r8)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r12, r9)
            return r8
        L64:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m8911awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, h6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f7, float f8) {
        float f9 = f7 - f;
        return AbstractC5806u.m5273l(f9 == 0.0f ? 0.0f : (f8 - f) / f9, 0.0f, 1.0f);
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* renamed from: isSpecified-If1S1O4, reason: not valid java name */
    public static final boolean m8912isSpecifiedIf1S1O4(long j7) {
        return j7 != SliderRange.INSTANCE.m8931getUnspecifiedFYbKRX4();
    }

    @Stable
    /* renamed from: isSpecified-If1S1O4$annotations, reason: not valid java name */
    public static /* synthetic */ void m8913isSpecifiedIf1S1O4$annotations(long j7) {
    }

    private static final Modifier rangeSliderEndThumbSemantics(Modifier modifier, final RangeSliderState rangeSliderState, final boolean z8) {
        final C6751a c6751a = new C6751a(rangeSliderState.getActiveRangeStart(), Float.valueOf(((C6751a) rangeSliderState.getValueRange()).f11419b).floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt.rangeSliderEndThumbSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z8) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final InterfaceC6752b interfaceC6752b = c6751a;
                final RangeSliderState rangeSliderState2 = rangeSliderState;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt.rangeSliderEndThumbSemantics.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).floatValue());
                    }

                    @NotNull
                    public final Boolean invoke(float f) {
                        int endSteps$material3_release;
                        float fM5273l = AbstractC5806u.m5273l(f, Float.valueOf(((C6751a) interfaceC6752b).f11418a).floatValue(), Float.valueOf(((C6751a) interfaceC6752b).f11419b).floatValue());
                        boolean z9 = false;
                        if (rangeSliderState2.getEndSteps$material3_release() > 0 && (endSteps$material3_release = rangeSliderState2.getEndSteps$material3_release() + 1) >= 0) {
                            float fAbs = fM5273l;
                            float f7 = fAbs;
                            int i = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(Float.valueOf(((C6751a) interfaceC6752b).f11418a).floatValue(), Float.valueOf(((C6751a) interfaceC6752b).f11419b).floatValue(), i / (rangeSliderState2.getEndSteps$material3_release() + 1));
                                float f8 = fLerp - fM5273l;
                                if (Math.abs(f8) <= fAbs) {
                                    fAbs = Math.abs(f8);
                                    f7 = fLerp;
                                }
                                if (i == endSteps$material3_release) {
                                    break;
                                }
                                i++;
                            }
                            fM5273l = f7;
                        }
                        if (fM5273l != rangeSliderState2.getActiveRangeEnd()) {
                            long jSliderRange = SliderKt.SliderRange(rangeSliderState2.getActiveRangeStart(), fM5273l);
                            if (!SliderRange.m8924equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState2.getActiveRangeStart(), rangeSliderState2.getActiveRangeEnd()))) {
                                if (rangeSliderState2.getOnValueChange$material3_release() != null) {
                                    InterfaceC6471c onValueChange$material3_release = rangeSliderState2.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(SliderRange.m8921boximpl(jSliderRange));
                                    }
                                } else {
                                    rangeSliderState2.setActiveRangeStart(SliderRange.m8926getStartimpl(jSliderRange));
                                    rangeSliderState2.setActiveRangeEnd(SliderRange.m8925getEndInclusiveimpl(jSliderRange));
                                }
                            }
                            InterfaceC6469a onValueChangeFinished = rangeSliderState2.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z9 = true;
                        }
                        return Boolean.valueOf(z9);
                    }
                }, 1, null);
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState.getActiveRangeEnd(), c6751a, rangeSliderState.getEndSteps$material3_release());
    }

    @Stable
    private static final Modifier rangeSliderPressDragModifier(Modifier modifier, RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z8) {
        return z8 ? modifier.then(new SuspendPointerInputElement(null, null, new Object[]{mutableInteractionSource, mutableInteractionSource2, rangeSliderState}, new C2142xe3d9cdbd(new C18381(rangeSliderState, mutableInteractionSource, mutableInteractionSource2, null)), 3, null)) : modifier;
    }

    private static final Modifier rangeSliderStartThumbSemantics(Modifier modifier, final RangeSliderState rangeSliderState, final boolean z8) {
        final C6751a c6751a = new C6751a(Float.valueOf(((C6751a) rangeSliderState.getValueRange()).f11418a).floatValue(), rangeSliderState.getActiveRangeEnd());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt.rangeSliderStartThumbSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z8) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final InterfaceC6752b interfaceC6752b = c6751a;
                final RangeSliderState rangeSliderState2 = rangeSliderState;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt.rangeSliderStartThumbSemantics.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).floatValue());
                    }

                    @NotNull
                    public final Boolean invoke(float f) {
                        int startSteps$material3_release;
                        float fM5273l = AbstractC5806u.m5273l(f, Float.valueOf(((C6751a) interfaceC6752b).f11418a).floatValue(), Float.valueOf(((C6751a) interfaceC6752b).f11419b).floatValue());
                        boolean z9 = false;
                        if (rangeSliderState2.getStartSteps$material3_release() > 0 && (startSteps$material3_release = rangeSliderState2.getStartSteps$material3_release() + 1) >= 0) {
                            float fAbs = fM5273l;
                            float f7 = fAbs;
                            int i = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(Float.valueOf(((C6751a) interfaceC6752b).f11418a).floatValue(), Float.valueOf(((C6751a) interfaceC6752b).f11419b).floatValue(), i / (rangeSliderState2.getStartSteps$material3_release() + 1));
                                float f8 = fLerp - fM5273l;
                                if (Math.abs(f8) <= fAbs) {
                                    fAbs = Math.abs(f8);
                                    f7 = fLerp;
                                }
                                if (i == startSteps$material3_release) {
                                    break;
                                }
                                i++;
                            }
                            fM5273l = f7;
                        }
                        if (fM5273l != rangeSliderState2.getActiveRangeStart()) {
                            long jSliderRange = SliderKt.SliderRange(fM5273l, rangeSliderState2.getActiveRangeEnd());
                            if (!SliderRange.m8924equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState2.getActiveRangeStart(), rangeSliderState2.getActiveRangeEnd()))) {
                                if (rangeSliderState2.getOnValueChange$material3_release() != null) {
                                    InterfaceC6471c onValueChange$material3_release = rangeSliderState2.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(SliderRange.m8921boximpl(jSliderRange));
                                    }
                                } else {
                                    rangeSliderState2.setActiveRangeStart(SliderRange.m8926getStartimpl(jSliderRange));
                                    rangeSliderState2.setActiveRangeEnd(SliderRange.m8925getEndInclusiveimpl(jSliderRange));
                                }
                            }
                            InterfaceC6469a onValueChangeFinished = rangeSliderState2.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z9 = true;
                        }
                        return Boolean.valueOf(z9);
                    }
                }, 1, null);
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState.getActiveRangeStart(), c6751a, rangeSliderState.getStartSteps$material3_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f7, float f8, float f9, float f10) {
        return MathHelpersKt.lerp(f9, f10, calcFraction(f, f7, f8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scale-ziovWd0, reason: not valid java name */
    public static final long m8914scaleziovWd0(float f, float f7, long j7, float f8, float f9) {
        return SliderRange(scale(f, f7, SliderRange.m8926getStartimpl(j7), f8, f9), scale(f, f7, SliderRange.m8925getEndInclusiveimpl(j7), f8, f9));
    }

    private static final Modifier sliderSemantics(Modifier modifier, final SliderState sliderState, final boolean z8) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z8) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final SliderState sliderState2 = sliderState;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1.1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).floatValue());
                    }

                    @NotNull
                    public final Boolean invoke(float f) {
                        int steps;
                        float fM5273l = AbstractC5806u.m5273l(f, Float.valueOf(((C6751a) sliderState2.getValueRange()).f11418a).floatValue(), Float.valueOf(((C6751a) sliderState2.getValueRange()).f11419b).floatValue());
                        boolean z9 = false;
                        if (sliderState2.getSteps() > 0 && (steps = sliderState2.getSteps() + 1) >= 0) {
                            float fAbs = fM5273l;
                            float f7 = fAbs;
                            int i = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(Float.valueOf(((C6751a) sliderState2.getValueRange()).f11418a).floatValue(), Float.valueOf(((C6751a) sliderState2.getValueRange()).f11419b).floatValue(), i / (sliderState2.getSteps() + 1));
                                float f8 = fLerp - fM5273l;
                                if (Math.abs(f8) <= fAbs) {
                                    fAbs = Math.abs(f8);
                                    f7 = fLerp;
                                }
                                if (i == steps) {
                                    break;
                                }
                                i++;
                            }
                            fM5273l = f7;
                        }
                        if (fM5273l != sliderState2.getValue()) {
                            if (fM5273l != sliderState2.getValue()) {
                                if (sliderState2.getOnValueChange() != null) {
                                    InterfaceC6471c onValueChange$material3_release = sliderState2.getOnValueChange();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(Float.valueOf(fM5273l));
                                    }
                                } else {
                                    sliderState2.setValue(fM5273l);
                                }
                            }
                            InterfaceC6469a onValueChangeFinished = sliderState2.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z9 = true;
                        }
                        return Boolean.valueOf(z9);
                    }
                }, 1, null);
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), sliderState.getValue(), new C6751a(Float.valueOf(((C6751a) sliderState.getValueRange()).f11418a).floatValue(), Float.valueOf(((C6751a) sliderState.getValueRange()).f11419b).floatValue()), sliderState.getSteps());
    }

    @Stable
    private static final Modifier sliderTapModifier(Modifier modifier, SliderState sliderState, MutableInteractionSource mutableInteractionSource, boolean z8) {
        return z8 ? modifier.then(new SuspendPointerInputElement(sliderState, mutableInteractionSource, null, new C2142xe3d9cdbd(new C18421(sliderState, null)), 4, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f, float[] fArr, float f7, float f8) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f9 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f9);
            } else {
                float fAbs = Math.abs(MathHelpersKt.lerp(f7, f8, f9) - f);
                C6755e it = new C6756f(1, length, 1).iterator();
                while (it.f11425c) {
                    float f10 = fArr[it.nextInt()];
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f7, f8, f10) - f);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f9 = f10;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f9);
            }
        }
        return fValueOf != null ? MathHelpersKt.lerp(f7, f8, fValueOf.floatValue()) : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] stepsToTickFractions(int i) {
        if (i == 0) {
            return new float[0];
        }
        int i8 = i + 2;
        float[] fArr = new float[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            fArr[i9] = i9 / (i + 1);
        }
        return fArr;
    }

    @Stable
    public static final long SliderRange(@NotNull InterfaceC6752b interfaceC6752b) {
        float fFloatValue = Float.valueOf(((C6751a) interfaceC6752b).f11418a).floatValue();
        float fFloatValue2 = Float.valueOf(((C6751a) interfaceC6752b).f11419b).floatValue();
        if ((Float.isNaN(fFloatValue) && Float.isNaN(fFloatValue2)) || fFloatValue <= fFloatValue2 + SliderRangeTolerance) {
            return SliderRange.m8922constructorimpl((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(fFloatValue2) & 4294967295L));
        }
        throw new IllegalArgumentException(("ClosedFloatingPointRange<Float>.start(" + fFloatValue + ") must be <= ClosedFloatingPoint.endInclusive(" + fFloatValue2 + ')').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r27, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r28, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r29, boolean r30, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6469a r31, @org.jetbrains.annotations.Nullable androidx.compose.material3.SliderColors r32, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r33, @androidx.annotation.IntRange(from = com.google.android.material.transformation.FabTransformationScrimBehavior.COLLAPSE_DELAY) int r34, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r35, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r36, @org.jetbrains.annotations.Nullable p200x6.InterfaceC6752b r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, r6.c, androidx.compose.ui.Modifier, boolean, r6.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, int, r6.f, r6.f, x6.b, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0111  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(@org.jetbrains.annotations.NotNull final p200x6.InterfaceC6752b r30, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r31, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r32, boolean r33, @org.jetbrains.annotations.Nullable p200x6.InterfaceC6752b r34, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6469a r35, @org.jetbrains.annotations.Nullable androidx.compose.material3.SliderColors r36, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r37, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r38, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r39, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r40, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r41, @androidx.annotation.IntRange(from = com.google.android.material.transformation.FabTransformationScrimBehavior.COLLAPSE_DELAY) int r42, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(x6.b, r6.c, androidx.compose.ui.Modifier, boolean, x6.b, r6.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, r6.f, r6.f, r6.f, int, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(@org.jetbrains.annotations.NotNull final androidx.compose.material3.SliderState r17, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r18, boolean r19, @org.jetbrains.annotations.Nullable androidx.compose.material3.SliderColors r20, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r21, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r22, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r23, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, r6.f, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(@org.jetbrains.annotations.NotNull final androidx.compose.material3.RangeSliderState r22, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r23, boolean r24, @org.jetbrains.annotations.Nullable androidx.compose.material3.SliderColors r25, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r26, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r27, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r28, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r29, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, r6.f, r6.f, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }
}
