package androidx.compose.foundation.relocation;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.LayoutAwareModifierNode;
import androidx.compose.p011ui.relocation.BringIntoViewModifierNode;
import androidx.compose.p011ui.relocation.BringIntoViewModifierNodeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5829j;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, m5110d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "responder", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Ld6/s;", "onPlaced", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "childCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "boundsProvider", "bringIntoView", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lr6/a;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "getResponder", "()Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "setResponder", "", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "()Z", "hasBeenPlaced", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends Modifier.Node implements BringIntoViewModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private boolean hasBeenPlaced;

    @NotNull
    private BringIntoViewResponder responder;
    private final boolean shouldAutoInvalidate;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/w0;", "<anonymous>", "(Lkotlinx/coroutines/v;)Lkotlinx/coroutines/w0;"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", m5303f = "BringIntoViewResponder.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2 */
    public static final class C11972 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6469a $boundsProvider;
        final /* synthetic */ LayoutCoordinates $childCoordinates;
        final /* synthetic */ InterfaceC6469a $parentRect;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", m5303f = "BringIntoViewResponder.kt", m5304i = {}, m5305l = {183}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC6469a $boundsProvider;
            final /* synthetic */ LayoutCoordinates $childCoordinates;
            int label;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
            public /* synthetic */ class C68551 extends FunctionReferenceImpl implements InterfaceC6469a {
                final /* synthetic */ InterfaceC6469a $boundsProvider;
                final /* synthetic */ LayoutCoordinates $childCoordinates;
                final /* synthetic */ BringIntoViewResponderNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C68551(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, InterfaceC6469a interfaceC6469a) {
                    super(0, AbstractC5829j.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.this$0 = bringIntoViewResponderNode;
                    this.$childCoordinates = layoutCoordinates;
                    this.$boundsProvider = interfaceC6469a;
                }

                @Override // p152r6.InterfaceC6469a
                public final Rect invoke() {
                    return BringIntoViewResponderNode.bringIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = bringIntoViewResponderNode;
                this.$childCoordinates = layoutCoordinates;
                this.$boundsProvider = interfaceC6469a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    BringIntoViewResponder responder = this.this$0.getResponder();
                    C68551 c68551 = new C68551(this.this$0, this.$childCoordinates, this.$boundsProvider);
                    this.label = 1;
                    if (responder.bringChildIntoView(c68551, this) == coroutineSingletons) {
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
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", m5303f = "BringIntoViewResponder.kt", m5304i = {}, m5305l = {191}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ InterfaceC6469a $parentRect;
            int label;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BringIntoViewResponderNode bringIntoViewResponderNode, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = bringIntoViewResponderNode;
                this.$parentRect = interfaceC6469a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass2(this.this$0, this.$parentRect, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    BringIntoViewResponderNode bringIntoViewResponderNode = this.this$0;
                    InterfaceC6469a interfaceC6469a = this.$parentRect;
                    this.label = 1;
                    if (BringIntoViewModifierNodeKt.bringIntoView(bringIntoViewResponderNode, interfaceC6469a, this) == coroutineSingletons) {
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
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11972(LayoutCoordinates layoutCoordinates, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC5631c<? super C11972> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$childCoordinates = layoutCoordinates;
            this.$boundsProvider = interfaceC6469a;
            this.$parentRect = interfaceC6469a2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C11972 c11972 = BringIntoViewResponderNode.this.new C11972(this.$childCoordinates, this.$boundsProvider, this.$parentRect, interfaceC5631c);
            c11972.L$0 = obj;
            return c11972;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
            AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass1(BringIntoViewResponderNode.this, this.$childCoordinates, this.$boundsProvider, null), 3);
            return AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass2(BringIntoViewResponderNode.this, this.$parentRect, null), 3);
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super InterfaceC6013w0> interfaceC5631c) {
            return ((C11972) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public BringIntoViewResponderNode(@NotNull BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringIntoView$localRect(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, InterfaceC6469a interfaceC6469a) {
        Rect rect;
        if (!bringIntoViewResponderNode.getIsAttached() || !bringIntoViewResponderNode.hasBeenPlaced) {
            return null;
        }
        LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(bringIntoViewResponderNode);
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (rect = (Rect) interfaceC6469a.invoke()) == null) {
            return null;
        }
        return BringIntoViewRequesterKt__BringIntoViewResponderKt.localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt(layoutCoordinatesRequireLayoutCoordinates, layoutCoordinates, rect);
    }

    @Override // androidx.compose.p011ui.relocation.BringIntoViewModifierNode
    @Nullable
    public Object bringIntoView(@NotNull final LayoutCoordinates layoutCoordinates, @NotNull final InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objM5637h = AbstractC6014x.m5637h(new C11972(layoutCoordinates, interfaceC6469a, new InterfaceC6469a() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$parentRect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Rect invoke() {
                Rect rectBringIntoView$localRect = BringIntoViewResponderNode.bringIntoView$localRect(this.this$0, layoutCoordinates, interfaceC6469a);
                if (rectBringIntoView$localRect != null) {
                    return this.this$0.getResponder().calculateRectForParent(rectBringIntoView$localRect);
                }
                return null;
            }
        }, null), interfaceC5631c);
        return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
    }

    @NotNull
    public final BringIntoViewResponder getResponder() {
        return this.responder;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p011ui.node.LayoutAwareModifierNode
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        this.hasBeenPlaced = true;
    }

    public final void setResponder(@NotNull BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }
}
