package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.p011ui.unit.VelocityKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010 \u001a\u00020\u001d*\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010#\u001a\u00020!*\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u0016\u0010&\u001a\u00020\u0019*\u00020!H\u0002ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\u00020\u0019*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b'\u0010%J\u0016\u0010*\u001a\u00020!*\u00020!H\u0002ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\u00020\u001d*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b+\u0010)J\u000f\u0010,\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010\u0015J\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010\u0015JO\u00107\u001a\u00020\u00132=\u00106\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u001100¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u00130/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001304\u0012\u0006\u0012\u0004\u0018\u0001050.H\u0096@¢\u0006\u0004\b7\u00108J\u001a\u0010<\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u001dH\u0016ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010>\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020!H\u0016ø\u0001\u0001¢\u0006\u0004\b=\u0010;J\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010?J]\u0010@\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b@\u0010\u0012R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010AR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010BR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010CR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010DR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010CR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010ER\"\u0010F\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010E\u001a\u0004\bG\u0010H\"\u0004\bI\u0010\u0018R\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010?\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006N"}, m5110d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableNode;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "startDragImmediately", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "<init>", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLjava/lang/Boolean;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Ljava/lang/Boolean;Landroidx/compose/foundation/gestures/FlingBehavior;)V", "Ld6/s;", "updateDensity", "()V", "newFlingBehavior", "updateFlingBehavior", "(Landroidx/compose/foundation/gestures/FlingBehavior;)V", "", "velocity", "fling", "(FLh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "toOffset-tuRUvjQ", "(F)J", "toOffset", "Landroidx/compose/ui/unit/Velocity;", "toVelocity-adjELrA", "toVelocity", "toFloat-TH1AsA0", "(J)F", "toFloat", "toFloat-k-4lQ0M", "reverseIfNeeded-AH228Gc", "(J)J", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "onAttach", "onDensityChange", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dragDelta", "Lh6/c;", "", "forEachDelta", "drag", "(Lr6/e;Lh6/c;)Ljava/lang/Object;", "startedPosition", "onDragStarted-k-4lQ0M", "(J)V", "onDragStarted", "onDragStopped-TH1AsA0", "onDragStopped", "()Z", "update", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "Landroidx/compose/foundation/gestures/Orientation;", "Ljava/lang/Boolean;", "Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "resolvedFlingBehavior", "getResolvedFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "setResolvedFlingBehavior", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "isReverseDirection", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1753:1\n1#2:1754\n30#3:1755\n53#4,3:1756\n70#4:1760\n60#4:1763\n69#5:1759\n65#5:1762\n22#6:1761\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableNode\n*L\n517#1:1755\n517#1:1756,3\n530#1:1760\n530#1:1763\n530#1:1759\n530#1:1762\n530#1:1761\n*E\n"})
/* loaded from: classes.dex */
final class AnchoredDraggableNode<T> extends DragGestureNode {

    @Nullable
    private Density density;

    @Nullable
    private FlingBehavior flingBehavior;

    @NotNull
    private Orientation orientation;

    @Nullable
    private OverscrollEffect overscrollEffect;
    public FlingBehavior resolvedFlingBehavior;

    @Nullable
    private Boolean reverseDirection;

    @Nullable
    private Boolean startDragImmediately;

    @NotNull
    private AnchoredDraggableState<T> state;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "it", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/AnchoredDragScope;Landroidx/compose/foundation/gestures/DraggableAnchors;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {408}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2 */
    public static final class C08252 extends SuspendLambda implements InterfaceC6474f {
        final /* synthetic */ InterfaceC6473e $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08252(InterfaceC6473e interfaceC6473e, AnchoredDraggableNode<T> anchoredDraggableNode, InterfaceC5631c<? super C08252> interfaceC5631c) {
            super(3, interfaceC5631c);
            this.$forEachDelta = interfaceC6473e;
            this.this$0 = anchoredDraggableNode;
        }

        @Override // p152r6.InterfaceC6474f
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C08252 c08252 = new C08252(this.$forEachDelta, this.this$0, interfaceC5631c);
            c08252.L$0 = anchoredDragScope;
            return c08252.invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                InterfaceC6473e interfaceC6473e = this.$forEachDelta;
                final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode.drag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DragEvent.DragDelta) obj2);
                        return C5443s.f8405a;
                    }

                    public final void invoke(DragEvent.DragDelta dragDelta) {
                        AnchoredDraggableNode<T> anchoredDraggableNode2 = anchoredDraggableNode;
                        float fM6918toFloatk4lQ0M = anchoredDraggableNode2.m6918toFloatk4lQ0M(anchoredDraggableNode2.m6916reverseIfNeededMKHz9U(dragDelta.getDelta()));
                        if (((AnchoredDraggableNode) anchoredDraggableNode).overscrollEffect == null) {
                            AnchoredDragScope.dragTo$default(anchoredDragScope, ((AnchoredDraggableNode) anchoredDraggableNode).state.newOffsetForDelta$foundation_release(fM6918toFloatk4lQ0M), 0.0f, 2, null);
                            return;
                        }
                        OverscrollEffect overscrollEffect = ((AnchoredDraggableNode) anchoredDraggableNode).overscrollEffect;
                        AbstractC5830k.m5327d(overscrollEffect);
                        long jM6919toOffsettuRUvjQ = anchoredDraggableNode.m6919toOffsettuRUvjQ(fM6918toFloatk4lQ0M);
                        int iM11800getUserInputWNlRxjI = NestedScrollSource.INSTANCE.m11800getUserInputWNlRxjI();
                        final AnchoredDraggableNode<T> anchoredDraggableNode3 = anchoredDraggableNode;
                        final AnchoredDragScope anchoredDragScope2 = anchoredDragScope;
                        overscrollEffect.mo6733applyToScrollRhakbz0(jM6919toOffsettuRUvjQ, iM11800getUserInputWNlRxjI, new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode.drag.2.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                return Offset.m10430boximpl(m6923invokeMKHz9U(((Offset) obj2).m10451unboximpl()));
                            }

                            /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
                            public final long m6923invokeMKHz9U(long j7) {
                                float fNewOffsetForDelta$foundation_release = ((AnchoredDraggableNode) anchoredDraggableNode3).state.newOffsetForDelta$foundation_release(anchoredDraggableNode3.m6918toFloatk4lQ0M(j7));
                                AnchoredDraggableNode<T> anchoredDraggableNode4 = anchoredDraggableNode3;
                                long jM6919toOffsettuRUvjQ2 = anchoredDraggableNode4.m6919toOffsettuRUvjQ(fNewOffsetForDelta$foundation_release - ((AnchoredDraggableNode) anchoredDraggableNode4).state.requireOffset());
                                AnchoredDragScope.dragTo$default(anchoredDragScope2, fNewOffsetForDelta$foundation_release, 0.0f, 2, null);
                                return jM6919toOffsettuRUvjQ2;
                            }
                        });
                    }
                };
                this.label = 1;
                if (interfaceC6473e.invoke(interfaceC6471c, this) == coroutineSingletons) {
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

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", m5303f = "AnchoredDraggable.kt", m5304i = {1}, m5305l = {455, 458}, m5306m = "fling", m5307n = {"leftoverVelocity"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 */
    public static final class C08261 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08261(AnchoredDraggableNode<T> anchoredDraggableNode, InterfaceC5631c<? super C08261> interfaceC5631c) {
            super(interfaceC5631c);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fling(0.0f, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "it", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/AnchoredDragScope;Landroidx/compose/foundation/gestures/DraggableAnchors;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {469}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2 */
    public static final class C08272 extends SuspendLambda implements InterfaceC6474f {
        final /* synthetic */ Ref$FloatRef $leftoverVelocity;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08272(AnchoredDraggableNode<T> anchoredDraggableNode, Ref$FloatRef ref$FloatRef, float f, InterfaceC5631c<? super C08272> interfaceC5631c) {
            super(3, interfaceC5631c);
            this.this$0 = anchoredDraggableNode;
            this.$leftoverVelocity = ref$FloatRef;
            this.$velocity = f;
        }

        @Override // p152r6.InterfaceC6474f
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C08272 c08272 = new C08272(this.this$0, this.$leftoverVelocity, this.$velocity, interfaceC5631c);
            c08272.L$0 = anchoredDragScope;
            return c08272.invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref$FloatRef ref$FloatRef;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2$scrollScope$1
                    @Override // androidx.compose.foundation.gestures.ScrollScope
                    public float scrollBy(float pixels) {
                        float fNewOffsetForDelta$foundation_release = ((AnchoredDraggableNode) anchoredDraggableNode).state.newOffsetForDelta$foundation_release(pixels);
                        float offset = fNewOffsetForDelta$foundation_release - ((AnchoredDraggableNode) anchoredDraggableNode).state.getOffset();
                        AnchoredDragScope.dragTo$default(anchoredDragScope, fNewOffsetForDelta$foundation_release, 0.0f, 2, null);
                        return offset;
                    }
                };
                FlingBehavior resolvedFlingBehavior = this.this$0.getResolvedFlingBehavior();
                Ref$FloatRef ref$FloatRef2 = this.$leftoverVelocity;
                float f = this.$velocity;
                this.L$0 = ref$FloatRef2;
                this.label = 1;
                obj = resolvedFlingBehavior.performFling(scrollScope, f, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$FloatRef = ref$FloatRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$FloatRef = (Ref$FloatRef) this.L$0;
                AbstractC5774b.m5119b(obj);
            }
            ref$FloatRef.element = ((Number) obj).floatValue();
            return C5443s.f8405a;
        }
    }

    public AnchoredDraggableNode(@NotNull AnchoredDraggableState<T> anchoredDraggableState, @NotNull Orientation orientation, boolean z8, @Nullable Boolean bool, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable OverscrollEffect overscrollEffect, @Nullable Boolean bool2, @Nullable FlingBehavior flingBehavior) {
        super(AnchoredDraggableKt.AlwaysDrag, z8, mutableInteractionSource, orientation);
        this.state = anchoredDraggableState;
        this.orientation = orientation;
        this.reverseDirection = bool;
        this.overscrollEffect = overscrollEffect;
        this.startDragImmediately = bool2;
        this.flingBehavior = flingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fling(float r8, p075h6.InterfaceC5631c<? super java.lang.Float> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableNode.C08261
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableNode.C08261) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r8 = r4.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref$FloatRef) r8
            kotlin.AbstractC5774b.m5119b(r9)
            goto L71
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.AbstractC5774b.m5119b(r9)
            return r9
        L3c:
            kotlin.AbstractC5774b.m5119b(r9)
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> r9 = r7.state
            boolean r9 = r9.getUsePreModifierChangeBehavior$foundation_release()
            if (r9 == 0) goto L53
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> r9 = r7.state
            r4.label = r3
            java.lang.Object r8 = r9.settle(r8, r4)
            if (r8 != r0) goto L52
            goto L6f
        L52:
            return r8
        L53:
            kotlin.jvm.internal.Ref$FloatRef r9 = new kotlin.jvm.internal.Ref$FloatRef
            r9.<init>()
            r9.element = r8
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> r1 = r7.state
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2 r3 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2
            r5 = 0
            r3.<init>(r7, r9, r8, r5)
            r4.L$0 = r9
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r8 = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L70
        L6f:
            return r0
        L70:
            r8 = r9
        L71:
            float r8 = r8.element
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode.fling(float, h6.c):java.lang.Object");
    }

    private final boolean isReverseDirection() {
        Boolean bool = this.reverseDirection;
        if (bool == null) {
            return DelegatableNodeKt.requireLayoutDirection(this) == LayoutDirection.Rtl && this.orientation == Orientation.Horizontal;
        }
        AbstractC5830k.m5327d(bool);
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m6915reverseIfNeededAH228Gc(long j7) {
        return Velocity.m13549timesadjELrA(j7, isReverseDirection() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m6916reverseIfNeededMKHz9U(long j7) {
        return Offset.m10448timestuRUvjQ(j7, isReverseDirection() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m6917toFloatTH1AsA0(long j7) {
        return this.orientation == Orientation.Vertical ? Velocity.m13544getYimpl(j7) : Velocity.m13543getXimpl(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m6918toFloatk4lQ0M(long j7) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Vertical ? j7 & 4294967295L : j7 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m6919toOffsettuRUvjQ(float f) {
        Orientation orientation = this.orientation;
        float f7 = orientation == Orientation.Horizontal ? f : 0.0f;
        if (orientation != Orientation.Vertical) {
            f = 0.0f;
        }
        return Offset.m10433constructorimpl((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m6920toVelocityadjELrA(float f) {
        Orientation orientation = this.orientation;
        float f7 = orientation == Orientation.Horizontal ? f : 0.0f;
        if (orientation != Orientation.Vertical) {
            f = 0.0f;
        }
        return VelocityKt.Velocity(f7, f);
    }

    private final void updateDensity() {
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        Density density = this.density;
        if (density == null || !AbstractC5830k.m5325b(density, densityRequireDensity)) {
            this.density = densityRequireDensity;
            updateFlingBehavior(this.flingBehavior);
        }
    }

    private final void updateFlingBehavior(FlingBehavior newFlingBehavior) {
        if (newFlingBehavior == null) {
            AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
            AnimationSpec<Float> snapAnimationSpec = anchoredDraggableDefaults.getSnapAnimationSpec();
            InterfaceC6471c positionalThreshold = anchoredDraggableDefaults.getPositionalThreshold();
            Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
            this.density = densityRequireDensity;
            newFlingBehavior = AnchoredDraggableKt.anchoredDraggableFlingBehavior(this.state, densityRequireDensity, positionalThreshold, snapAnimationSpec);
        }
        setResolvedFlingBehavior(newFlingBehavior);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    @Nullable
    public Object drag(@NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.state, null, new C08252(interfaceC6473e, this, null), interfaceC5631c, 1, null);
        return objAnchoredDrag$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnchoredDrag$default : C5443s.f8405a;
    }

    @NotNull
    public final FlingBehavior getResolvedFlingBehavior() {
        FlingBehavior flingBehavior = this.resolvedFlingBehavior;
        if (flingBehavior != null) {
            return flingBehavior;
        }
        AbstractC5830k.m5339p("resolvedFlingBehavior");
        throw null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateFlingBehavior(this.flingBehavior);
    }

    @Override // androidx.compose.p011ui.node.DelegatableNode, androidx.compose.p011ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        if (getIsAttached()) {
            updateDensity();
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M, reason: not valid java name */
    public void mo6921onDragStartedk4lQ0M(long startedPosition) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0, reason: not valid java name */
    public void mo6922onDragStoppedTH1AsA0(long velocity) {
        if (getIsAttached()) {
            AbstractC6014x.m5651v(getCoroutineScope(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, velocity, null), 3);
        }
    }

    public final void setResolvedFlingBehavior(@NotNull FlingBehavior flingBehavior) {
        this.resolvedFlingBehavior = flingBehavior;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: startDragImmediately */
    public boolean getStartDragImmediately() {
        Boolean bool = this.startDragImmediately;
        return bool != null ? bool.booleanValue() : this.state.isAnimationRunning();
    }

    public final void update(@NotNull AnchoredDraggableState<T> state, @NotNull Orientation orientation, boolean enabled, @Nullable Boolean reverseDirection, @Nullable MutableInteractionSource interactionSource, @Nullable OverscrollEffect overscrollEffect, @Nullable Boolean startDragImmediately, @Nullable FlingBehavior flingBehavior) {
        boolean z8;
        boolean z9;
        this.flingBehavior = flingBehavior;
        if (AbstractC5830k.m5325b(this.state, state)) {
            z8 = false;
        } else {
            this.state = state;
            updateFlingBehavior(flingBehavior);
            z8 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z8 = true;
        }
        if (AbstractC5830k.m5325b(this.reverseDirection, reverseDirection)) {
            z9 = z8;
        } else {
            this.reverseDirection = reverseDirection;
            z9 = true;
        }
        this.startDragImmediately = startDragImmediately;
        this.overscrollEffect = overscrollEffect;
        DragGestureNode.update$default(this, null, enabled, interactionSource, orientation, z9, 1, null);
    }
}
