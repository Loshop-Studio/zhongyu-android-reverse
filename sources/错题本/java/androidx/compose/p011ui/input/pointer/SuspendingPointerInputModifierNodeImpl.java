package androidx.compose.p011ui.input.pointer;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DpRect;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5895f;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.C5637i;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p185v7.AbstractC6683l;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001eB=\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBZ\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e¢\u0006\u0002\b\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J?\u0010\u001a\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\rJ*\u0010#\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010\u0015J?\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2'\u0010'\u001a#\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e¢\u0006\u0002\b\u0011H\u0096@¢\u0006\u0004\b(\u0010)J4\u0010,\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u001a\u0010'\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u00030+R\u00020\u0000\u0012\u0004\u0012\u00020\u00100*H\u0082\b¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b.\u0010/R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00100R\"\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00101R9\u00102\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000e¢\u0006\u0002\b\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030+R\u00020\u00000;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00100R\"\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030+R\u00020\u00000;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010:R\u001c\u0010A\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IRl\u0010P\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e¢\u0006\u0002\b\u00112'\u0010J\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e¢\u0006\u0002\b\u00118V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\bO\u0010\u0015\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u000b\u001a\u00020\n2\u0006\u0010J\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010WR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001a\u0010a\u001a\u00020\u001f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b_\u0010`R\u001a\u0010d\u001a\u00020b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bc\u0010`\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "", "key1", "key2", "", "keys", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "pointerInputEventHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "Lkotlin/Function2;", "Lh6/c;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "pointerInputEvent", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lr6/e;)V", "onDetach", "()V", "onDensityChange", "onViewConfigurationChange", "resetPointerInputHandler", "update$ui_release", "update", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "block", "awaitPointerEventScope", "(Lr6/e;Lh6/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", "forEachCurrentPointerHandler", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lr6/c;)V", "dispatchPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "Ljava/lang/Object;", "[Ljava/lang/Object;", "_deprecatedPointerInputHandler", "Lr6/e;", "_pointerInputEventHandler", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "Lkotlinx/coroutines/w0;", "pointerInputJob", "Lkotlinx/coroutines/w0;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/runtime/collection/MutableVector;", "pointerHandlers", "Landroidx/compose/runtime/collection/MutableVector;", "pointerHandlersLock", "dispatchingPointerHandlers", "lastPointerEvent", "boundsSize", "J", "", "interceptOutOfBoundsChildEvents", "Z", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "value", "getPointerInputHandler", "()Lr6/e;", "setPointerInputHandler", "(Lr6/e;)V", "getPointerInputHandler$annotations", "pointerInputHandler", "getPointerInputEventHandler", "()Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "setPointerInputEventHandler", "(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "PointerEventHandlerCoroutine", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,918:1\n681#1:961\n682#1,4:965\n686#1:978\n689#1,3:988\n1101#2:919\n1083#2,2:920\n1101#2:923\n1083#2,2:924\n27#3:922\n32#3,2:940\n32#3,2:962\n32#3,2:1028\n57#4:926\n61#4:931\n60#5:927\n85#5:930\n70#5:932\n90#5:935\n53#5,3:937\n22#6:928\n22#6:933\n54#7:929\n59#7:934\n33#8:936\n144#9:942\n423#9,9:943\n447#9,9:952\n144#9:964\n423#9,9:969\n447#9,9:979\n641#9,2:1030\n87#10,2:991\n34#10,6:993\n89#10:999\n87#10,2:1000\n34#10,6:1002\n89#10:1008\n439#10,3:1009\n34#10,4:1012\n39#10:1017\n442#10:1018\n1#11:1016\n314#12,9:1019\n323#12,2:1032\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n*L\n698#1:961\n698#1:965,4\n698#1:978\n698#1:988,3\n549#1:919\n549#1:920,2\n559#1:923\n559#1:924,2\n551#1:922\n681#1:940,2\n698#1:962,2\n772#1:1028,2\n579#1:926\n580#1:931\n579#1:927\n579#1:930\n580#1:932\n580#1:935\n581#1:937,3\n579#1:928\n580#1:933\n579#1:929\n580#1:934\n581#1:936\n681#1:942\n685#1:943,9\n686#1:952,9\n698#1:964\n698#1:969,9\n698#1:979,9\n773#1:1030,2\n728#1:991,2\n728#1:993,6\n728#1:999\n738#1:1000,2\n738#1:1002,6\n738#1:1008\n742#1:1009,3\n742#1:1012,4\n742#1:1017\n742#1:1018\n742#1:1016\n770#1:1019,9\n770#1:1032,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {
    public static final int $stable = 0;

    @Nullable
    private InterfaceC6473e _deprecatedPointerInputHandler;

    @NotNull
    private PointerInputEventHandler _pointerInputEventHandler;
    private long boundsSize;

    @NotNull
    private PointerEvent currentEvent;

    @NotNull
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;

    @Nullable
    private Object key1;

    @Nullable
    private Object key2;

    @Nullable
    private Object[] keys;

    @Nullable
    private PointerEvent lastPointerEvent;

    @NotNull
    private final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;

    @NotNull
    private final Object pointerHandlersLock;

    @Nullable
    private InterfaceC6013w0 pointerInputJob;

    @Metadata(m5109d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t*\u00020\rH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b*\u00020\rH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\b*\u00020\u0013H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0012\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u0018*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u0013*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u0013*\u00020\rH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0011J\u0014\u0010!\u001a\u00020 *\u00020\u001fH\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u0017*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001aJ\u0017\u0010'\u001a\u00020\r*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u00020\r*\u00020\u0013H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010&J\u001a\u0010'\u001a\u00020\r*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001d\u0010/\u001a\u00020.2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\u00020.2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b9\u0010:JI\u0010B\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010;2\u0006\u0010=\u001a\u00020<2'\u0010A\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010?0>¢\u0006\u0002\b@H\u0096@¢\u0006\u0004\bB\u0010CJG\u0010D\u001a\u00028\u0001\"\u0004\b\u0001\u0010;2\u0006\u0010=\u001a\u00020<2'\u0010A\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010?0>¢\u0006\u0002\b@H\u0096@¢\u0006\u0004\bD\u0010CR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ER\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010L\u001a\u00020K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u00138\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\u00138\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0014\u0010W\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001a\u0010[\u001a\u00020X8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001a\u0010a\u001a\u00020\u00178VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b`\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Lh6/c;", "completion", "<init>", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;Lh6/c;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/input/pointer/PointerEvent;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Ld6/s;", "offerPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "awaitPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "", "timeMillis", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "block", "withTimeoutOrNull", "(JLr6/e;Lh6/c;)Ljava/lang/Object;", "withTimeout", "Lh6/c;", "Lkotlinx/coroutines/f;", "pointerAwaiter", "Lkotlinx/coroutines/f;", "awaitPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Lh6/h;", "context", "Lh6/h;", "getContext", "()Lh6/h;", "getDensity", "()F", "density", "getFontScale", "fontScale", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,918:1\n32#2,2:919\n646#3,2:921\n314#4,11:923\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n*L\n846#1:919,2\n846#1:921,2\n851#1:923,11\n*E\n"})
    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, InterfaceC5631c<R> {
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl $$delegate_0;

        @NotNull
        private final InterfaceC5631c<R> completion;

        @Nullable
        private InterfaceC5895f pointerAwaiter;

        @NotNull
        private PointerEventPass awaitPass = PointerEventPass.Main;

        @NotNull
        private final InterfaceC5636h context = EmptyCoroutineContext.INSTANCE;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(@NotNull InterfaceC5631c<? super R> interfaceC5631c) {
            this.completion = interfaceC5631c;
            this.$$delegate_0 = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // androidx.compose.p011ui.input.pointer.AwaitPointerEventScope
        @Nullable
        public Object awaitPointerEvent(@NotNull PointerEventPass pointerEventPass, @NotNull InterfaceC5631c<? super PointerEvent> interfaceC5631c) {
            C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
            c5961g.m5584u();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = c5961g;
            Object objM5583t = c5961g.m5583t();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objM5583t;
        }

        public final void cancel(@Nullable Throwable cause) {
            InterfaceC5895f interfaceC5895f = this.pointerAwaiter;
            if (interfaceC5895f != null) {
                interfaceC5895f.mo4965i(cause);
            }
            this.pointerAwaiter = null;
        }

        @Override // p075h6.InterfaceC5631c
        @NotNull
        public InterfaceC5636h getContext() {
            return this.context;
        }

        @Override // androidx.compose.p011ui.input.pointer.AwaitPointerEventScope
        @NotNull
        public PointerEvent getCurrentEvent() {
            return SuspendingPointerInputModifierNodeImpl.this.currentEvent;
        }

        @Override // androidx.compose.p011ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.p011ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo11815getExtendedTouchPaddingNHjbRc() {
            return SuspendingPointerInputModifierNodeImpl.this.mo6893getExtendedTouchPaddingNHjbRc();
        }

        @Override // androidx.compose.p011ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.p011ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getSize-YbymL2g */
        public long mo11816getSizeYbymL2g() {
            return SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        }

        @Override // androidx.compose.p011ui.input.pointer.AwaitPointerEventScope
        @NotNull
        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        public final void offerPointerEvent(@NotNull PointerEvent event, @NotNull PointerEventPass pass) {
            InterfaceC5895f interfaceC5895f;
            if (pass != this.awaitPass || (interfaceC5895f = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            interfaceC5895f.resumeWith(Result.m13956constructorimpl(event));
        }

        @Override // p075h6.InterfaceC5631c
        public void resumeWith(@NotNull Object result) {
            Object obj = SuspendingPointerInputModifierNodeImpl.this.pointerHandlersLock;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (obj) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.remove(this);
            }
            this.completion.resumeWith(result);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: roundToPx--R2X_6o */
        public int mo6896roundToPxR2X_6o(long j7) {
            return this.$$delegate_0.mo6896roundToPxR2X_6o(j7);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: roundToPx-0680j_4 */
        public int mo6897roundToPx0680j_4(float f) {
            return this.$$delegate_0.mo6897roundToPx0680j_4(f);
        }

        @Override // androidx.compose.p011ui.unit.FontScaling
        @Stable
        /* renamed from: toDp-GaN1DYA */
        public float mo6898toDpGaN1DYA(long j7) {
            return this.$$delegate_0.mo6898toDpGaN1DYA(j7);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo6899toDpu2uoSUM(float f) {
            return this.$$delegate_0.mo6899toDpu2uoSUM(f);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toDpSize-k-rfVVM */
        public long mo6901toDpSizekrfVVM(long j7) {
            return this.$$delegate_0.mo6901toDpSizekrfVVM(j7);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toPx--R2X_6o */
        public float mo6902toPxR2X_6o(long j7) {
            return this.$$delegate_0.mo6902toPxR2X_6o(j7);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toPx-0680j_4 */
        public float mo6903toPx0680j_4(float f) {
            return this.$$delegate_0.mo6903toPx0680j_4(f);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        @NotNull
        public Rect toRect(@NotNull DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toSize-XkaWNTQ */
        public long mo6904toSizeXkaWNTQ(long j7) {
            return this.$$delegate_0.mo6904toSizeXkaWNTQ(j7);
        }

        @Override // androidx.compose.p011ui.unit.FontScaling
        @Stable
        /* renamed from: toSp-0xMU5do */
        public long mo6905toSp0xMU5do(float f) {
            return this.$$delegate_0.mo6905toSp0xMU5do(f);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo6906toSpkPz2Gy4(float f) {
            return this.$$delegate_0.mo6906toSpkPz2Gy4(f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.w0] */
        /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.w0] */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference failed for: r9v0, types: [r6.e] */
        @Override // androidx.compose.p011ui.input.pointer.AwaitPointerEventScope
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object withTimeout(long r7, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r9, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super T> r10) {
            /*
                r6 = this;
                boolean r0 = r10 instanceof androidx.compose.p011ui.input.pointer.C2144x647a7347
                if (r0 == 0) goto L13
                r0 = r10
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.p011ui.input.pointer.C2144x647a7347) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r6, r10)
            L18:
                java.lang.Object r10 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.w0 r7 = (kotlinx.coroutines.InterfaceC6013w0) r7
                kotlin.AbstractC5774b.m5119b(r10)     // Catch: java.lang.Throwable -> L2b
                goto L6e
            L2b:
                r8 = move-exception
                goto L74
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                kotlin.AbstractC5774b.m5119b(r10)
                r4 = 0
                int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r10 > 0) goto L52
                kotlinx.coroutines.f r10 = r6.pointerAwaiter
                if (r10 == 0) goto L52
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r7)
                kotlin.Result$Failure r2 = kotlin.AbstractC5774b.m5118a(r2)
                java.lang.Object r2 = kotlin.Result.m13956constructorimpl(r2)
                r10.resumeWith(r2)
            L52:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r10 = androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                kotlinx.coroutines.v r10 = r10.getCoroutineScope()
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r2 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r4 = 0
                r2.<init>(r7, r6, r4)
                r7 = 3
                kotlinx.coroutines.k1 r7 = kotlinx.coroutines.AbstractC6014x.m5651v(r10, r4, r4, r2, r7)
                r0.L$0 = r7     // Catch: java.lang.Throwable -> L2b
                r0.label = r3     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L2b
                if (r10 != r1) goto L6e
                return r1
            L6e:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r8 = androidx.compose.p011ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r7.cancel(r8)
                return r10
            L74:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r9 = androidx.compose.p011ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r7.cancel(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeout(long, r6.e, h6.c):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.p011ui.input.pointer.AwaitPointerEventScope
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object withTimeoutOrNull(long r5, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r7, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.p011ui.input.pointer.C2146x2677a771
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.p011ui.input.pointer.C2146x2677a771) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.AbstractC5774b.m5119b(r8)     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
                return r8
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                kotlin.AbstractC5774b.m5119b(r8)
                r0.label = r3     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
                java.lang.Object r5 = r4.withTimeout(r5, r7, r0)     // Catch: androidx.compose.p011ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
                if (r5 != r1) goto L3b
                return r1
            L3b:
                return r5
            L3c:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeoutOrNull(long, r6.e, h6.c):java.lang.Object");
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo6900toDpu2uoSUM(int i) {
            return this.$$delegate_0.mo6900toDpu2uoSUM(i);
        }

        @Override // androidx.compose.p011ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo6907toSpkPz2Gy4(int i) {
            return this.$$delegate_0.mo6907toSpkPz2Gy4(i);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pass) {
        synchronized (this.pointerHandlersLock) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = this.dispatchingPointerHandlers;
            mutableVector.addAll(mutableVector.getSize(), this.pointerHandlers);
        }
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pass.ordinal()];
            if (i == 1 || i == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i8 = 0; i8 < size; i8++) {
                    pointerEventHandlerCoroutineArr[i8].offerPointerEvent(pointerEvent, pass);
                }
            } else if (i == 3) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize() - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = mutableVector3.content;
                if (size2 < pointerEventHandlerCoroutineArr2.length) {
                    while (size2 >= 0) {
                        pointerEventHandlerCoroutineArr2[size2].offerPointerEvent(pointerEvent, pass);
                        size2--;
                    }
                }
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    private final void forEachCurrentPointerHandler(PointerEventPass pass, InterfaceC6471c block) {
        synchronized (this.pointerHandlersLock) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = this.dispatchingPointerHandlers;
            mutableVector.addAll(mutableVector.getSize(), this.pointerHandlers);
        }
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pass.ordinal()];
            if (i == 1 || i == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i8 = 0; i8 < size; i8++) {
                    block.invoke(pointerEventHandlerCoroutineArr[i8]);
                }
            } else if (i == 3) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize() - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = mutableVector3.content;
                if (size2 < pointerEventHandlerCoroutineArr2.length) {
                    while (size2 >= 0) {
                        block.invoke(pointerEventHandlerCoroutineArr2[size2]);
                        size2--;
                    }
                }
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    @Deprecated(message = "Super property deprecated")
    public static /* synthetic */ void getPointerInputHandler$annotations() {
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
    @Nullable
    public <R> Object awaitPointerEventScope(@NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super R> interfaceC5631c) {
        C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g.m5584u();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(c5961g);
        synchronized (this.pointerHandlersLock) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            AbstractC5830k.m5330g(interfaceC6473e, "<this>");
            new C5637i(AbstractC6683l.m6374n(AbstractC6683l.m6365e(interfaceC6473e, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine)), CoroutineSingletons.COROUTINE_SUSPENDED).resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
        }
        c5961g.mo4966m(new InterfaceC6471c() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Throwable th) {
                pointerEventHandlerCoroutine.cancel(th);
            }
        });
        return c5961g.m5583t();
    }

    @Override // androidx.compose.p011ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo6893getExtendedTouchPaddingNHjbRc() {
        long jMo6904toSizeXkaWNTQ = mo6904toSizeXkaWNTQ(getViewConfiguration().mo12222getMinimumTouchTargetSizeMYxV2XQ());
        long boundsSize = getBoundsSize();
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo6904toSizeXkaWNTQ >> 32)) - ((int) (boundsSize >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jMo6904toSizeXkaWNTQ & 4294967295L)) - ((int) (boundsSize & 4294967295L))) / 2.0f;
        return Size.m10501constructorimpl((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L));
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode
    @NotNull
    /* renamed from: getPointerInputEventHandler, reason: from getter */
    public PointerInputEventHandler get_pointerInputEventHandler() {
        return this._pointerInputEventHandler;
    }

    @Override // androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode
    @NotNull
    public InterfaceC6473e getPointerInputHandler() {
        InterfaceC6473e interfaceC6473e = this._deprecatedPointerInputHandler;
        return interfaceC6473e == null ? new SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(null) : interfaceC6473e;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
    /* renamed from: getSize-YbymL2g, reason: from getter */
    public long getBoundsSize() {
        return this.boundsSize;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).getPressed()) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    PointerInputChange pointerInputChange = changes2.get(i8);
                    arrayList.add(new PointerInputChange(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), pointerInputChange.getType(), 0L, 1024, (AbstractC5824e) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    @Override // androidx.compose.p011ui.node.DelegatableNode, androidx.compose.p011ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo6724onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        this.boundsSize = bounds;
        if (pass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            this.pointerInputJob = AbstractC6014x.m5651v(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        dispatchPointerEvent(pointerEvent, pass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerEvent = null;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.p011ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        InterfaceC6013w0 interfaceC6013w0 = this.pointerInputJob;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z8) {
        this.interceptOutOfBoundsChildEvents = z8;
    }

    @Override // androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputEventHandler(@NotNull PointerInputEventHandler pointerInputEventHandler) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = null;
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    @Override // androidx.compose.p011ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(@NotNull InterfaceC6473e interfaceC6473e) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = interfaceC6473e;
    }

    public final void update$ui_release(@Nullable Object key1, @Nullable Object key2, @Nullable Object[] keys, @NotNull PointerInputEventHandler pointerInputEventHandler) {
        boolean z8 = !AbstractC5830k.m5325b(this.key1, key1);
        this.key1 = key1;
        if (!AbstractC5830k.m5325b(this.key2, key2)) {
            z8 = true;
        }
        this.key2 = key2;
        Object[] objArr = this.keys;
        if (objArr != null && keys == null) {
            z8 = true;
        }
        if (objArr == null && keys != null) {
            z8 = true;
        }
        if (objArr != null && keys != null && !Arrays.equals(keys, objArr)) {
            z8 = true;
        }
        this.keys = keys;
        if (get_pointerInputEventHandler().getClass() == pointerInputEventHandler.getClass() ? z8 : true) {
            resetPointerInputHandler();
        }
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    public SuspendingPointerInputModifierNodeImpl(@Nullable Object obj, @Nullable Object obj2, @Nullable Object[] objArr, @NotNull PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputEventHandler = pointerInputEventHandler;
        this.currentEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.pointerHandlers = mutableVector;
        this.pointerHandlersLock = mutableVector;
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.INSTANCE.m13481getZeroYbymL2g();
    }

    @Deprecated(message = "Exists to maintain compatibility with previous API shape")
    public SuspendingPointerInputModifierNodeImpl(@Nullable Object obj, @Nullable Object obj2, @Nullable Object[] objArr, @NotNull InterfaceC6473e interfaceC6473e) {
        this(obj, obj2, objArr, new PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.1
            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return C5443s.f8405a;
            }
        });
        this._deprecatedPointerInputHandler = interfaceC6473e;
    }
}
