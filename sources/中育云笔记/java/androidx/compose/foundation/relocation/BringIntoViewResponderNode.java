package androidx.compose.foundation.relocation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.LayoutAwareModifierNode;
import androidx.compose.p014ui.relocation.BringIntoViewModifierNode;
import androidx.compose.p014ui.relocation.BringIntoViewModifierNodeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends Modifier.Node implements BringIntoViewModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private boolean hasBeenPlaced;
    private BringIntoViewResponder responder;
    private final boolean shouldAutoInvalidate;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", m26211f = "BringIntoViewResponder.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2 */
    public static final class C16572 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9529a $boundsProvider;
        final /* synthetic */ LayoutCoordinates $childCoordinates;
        final /* synthetic */ InterfaceC9529a $parentRect;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", m26211f = "BringIntoViewResponder.kt", m26212l = {Opcodes.INVOKESPECIAL}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC9529a $boundsProvider;
            final /* synthetic */ LayoutCoordinates $childCoordinates;
            int label;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
            public /* synthetic */ class C120711 extends FunctionReferenceImpl implements InterfaceC9529a {
                final /* synthetic */ InterfaceC9529a $boundsProvider;
                final /* synthetic */ LayoutCoordinates $childCoordinates;
                final /* synthetic */ BringIntoViewResponderNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120711(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, InterfaceC9529a interfaceC9529a) {
                    super(0, AbstractC9979u.a.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.this$0 = bringIntoViewResponderNode;
                    this.$childCoordinates = layoutCoordinates;
                    this.$boundsProvider = interfaceC9529a;
                }

                @Override // p181hd.InterfaceC9529a
                public final Rect invoke() {
                    return BringIntoViewResponderNode.bringIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = bringIntoViewResponderNode;
                this.$childCoordinates = layoutCoordinates;
                this.$boundsProvider = interfaceC9529a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    BringIntoViewResponder responder = this.this$0.getResponder();
                    C120711 c120711 = new C120711(this.this$0, this.$childCoordinates, this.$boundsProvider);
                    this.label = 1;
                    if (responder.bringChildIntoView(c120711, this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", m26211f = "BringIntoViewResponder.kt", m26212l = {191}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC9529a $parentRect;
            int label;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BringIntoViewResponderNode bringIntoViewResponderNode, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = bringIntoViewResponderNode;
                this.$parentRect = interfaceC9529a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass2(this.this$0, this.$parentRect, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    BringIntoViewResponderNode bringIntoViewResponderNode = this.this$0;
                    InterfaceC9529a interfaceC9529a = this.$parentRect;
                    this.label = 1;
                    if (BringIntoViewModifierNodeKt.bringIntoView(bringIntoViewResponderNode, interfaceC9529a, this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16572(LayoutCoordinates layoutCoordinates, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC11588c<? super C16572> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$childCoordinates = layoutCoordinates;
            this.$boundsProvider = interfaceC9529a;
            this.$parentRect = interfaceC9529a2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C16572 c16572 = BringIntoViewResponderNode.this.new C16572(this.$childCoordinates, this.$boundsProvider, this.$parentRect, interfaceC11588c);
            c16572.L$0 = obj;
            return c16572;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass1(BringIntoViewResponderNode.this, this.$childCoordinates, this.$boundsProvider, null), 3, null);
            return AbstractC11117h.m24726d(interfaceC11122i0, null, null, new AnonymousClass2(BringIntoViewResponderNode.this, this.$parentRect, null), 3, null);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super InterfaceC10045g> interfaceC11588c) {
            return ((C16572) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public BringIntoViewResponderNode(BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringIntoView$localRect(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, InterfaceC9529a interfaceC9529a) {
        Rect rect;
        if (!bringIntoViewResponderNode.isAttached() || !bringIntoViewResponderNode.hasBeenPlaced) {
            return null;
        }
        LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(bringIntoViewResponderNode);
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (rect = (Rect) interfaceC9529a.invoke()) == null) {
            return null;
        }
        return BringIntoViewRequesterKt__BringIntoViewResponderKt.localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt(layoutCoordinatesRequireLayoutCoordinates, layoutCoordinates, rect);
    }

    @Override // androidx.compose.p014ui.relocation.BringIntoViewModifierNode
    public Object bringIntoView(final LayoutCoordinates layoutCoordinates, final InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C16572(layoutCoordinates, interfaceC9529a, new InterfaceC9529a() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$parentRect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Rect invoke() {
                Rect rectBringIntoView$localRect = BringIntoViewResponderNode.bringIntoView$localRect(this.this$0, layoutCoordinates, interfaceC9529a);
                if (rectBringIntoView$localRect != null) {
                    return this.this$0.getResponder().calculateRectForParent(rectBringIntoView$localRect);
                }
                return null;
            }
        }, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    public final BringIntoViewResponder getResponder() {
        return this.responder;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.hasBeenPlaced = true;
    }

    public final void setResponder(BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }
}
