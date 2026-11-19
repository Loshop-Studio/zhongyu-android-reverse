package androidx.compose.foundation.relocation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
import androidx.compose.p013ui.relocation.BringIntoViewModifierNode;
import androidx.compose.p013ui.relocation.BringIntoViewModifierNodeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0096@¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m13558d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "responder", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V", "hasBeenPlaced", "", "getResponder", "()Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "setResponder", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "bringIntoView", "", "childCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsProvider", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPlaced", "coordinates", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends Modifier.Node implements BringIntoViewModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private boolean hasBeenPlaced;
    private BringIntoViewResponder responder;
    private final boolean shouldAutoInvalidate;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", m13596f = "BringIntoViewResponder.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2 */
    public static final class C15982 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ Function0<Rect> $boundsProvider;
        final /* synthetic */ LayoutCoordinates $childCoordinates;
        final /* synthetic */ Function0<Rect> $parentRect;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", m13596f = "BringIntoViewResponder.kt", m13597i = {}, m13598l = {183}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Rect> $boundsProvider;
            final /* synthetic */ LayoutCoordinates $childCoordinates;
            int label;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
            /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
            public /* synthetic */ class C101051 extends FunctionReferenceImpl implements Function0<Rect> {
                final /* synthetic */ Function0<Rect> $boundsProvider;
                final /* synthetic */ LayoutCoordinates $childCoordinates;
                final /* synthetic */ BringIntoViewResponderNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C101051(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, Function0<Rect> function0) {
                    super(0, Intrinsics.Kotlin.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.this$0 = bringIntoViewResponderNode;
                    this.$childCoordinates = layoutCoordinates;
                    this.$boundsProvider = function0;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Rect invoke() {
                    return BringIntoViewResponderNode.bringIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = bringIntoViewResponderNode;
                this.$childCoordinates = layoutCoordinates;
                this.$boundsProvider = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    BringIntoViewResponder responder = this.this$0.getResponder();
                    C101051 c101051 = new C101051(this.this$0, this.$childCoordinates, this.$boundsProvider);
                    this.label = 1;
                    if (responder.bringChildIntoView(c101051, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
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

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", m13596f = "BringIntoViewResponder.kt", m13597i = {}, m13598l = {191}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Rect> $parentRect;
            int label;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BringIntoViewResponderNode bringIntoViewResponderNode, Function0<Rect> function0, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = bringIntoViewResponderNode;
                this.$parentRect = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$parentRect, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    BringIntoViewResponderNode bringIntoViewResponderNode = this.this$0;
                    Function0<Rect> function0 = this.$parentRect;
                    this.label = 1;
                    if (BringIntoViewModifierNodeKt.bringIntoView(bringIntoViewResponderNode, function0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
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
        public C15982(LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Function0<Rect> function02, Continuation<? super C15982> continuation) {
            super(2, continuation);
            this.$childCoordinates = layoutCoordinates;
            this.$boundsProvider = function0;
            this.$parentRect = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C15982 c15982 = BringIntoViewResponderNode.this.new C15982(this.$childCoordinates, this.$boundsProvider, this.$parentRect, continuation);
            c15982.L$0 = obj;
            return c15982;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(BringIntoViewResponderNode.this, this.$childCoordinates, this.$boundsProvider, null), 3, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(BringIntoViewResponderNode.this, this.$parentRect, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C15982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public BringIntoViewResponderNode(BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringIntoView$localRect(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, Function0<Rect> function0) {
        Rect rectInvoke;
        if (!bringIntoViewResponderNode.getIsAttached() || !bringIntoViewResponderNode.hasBeenPlaced) {
            return null;
        }
        LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(bringIntoViewResponderNode);
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (rectInvoke = function0.invoke()) == null) {
            return null;
        }
        return BringIntoViewRequesterKt__BringIntoViewResponderKt.localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt(layoutCoordinatesRequireLayoutCoordinates, layoutCoordinates, rectInvoke);
    }

    @Override // androidx.compose.p013ui.relocation.BringIntoViewModifierNode
    public Object bringIntoView(final LayoutCoordinates layoutCoordinates, final Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C15982(layoutCoordinates, function0, new Function0<Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$parentRect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Rect invoke() {
                Rect rectBringIntoView$localRect = BringIntoViewResponderNode.bringIntoView$localRect(this.this$0, layoutCoordinates, function0);
                if (rectBringIntoView$localRect != null) {
                    return this.this$0.getResponder().calculateRectForParent(rectBringIntoView$localRect);
                }
                return null;
            }
        }, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final BringIntoViewResponder getResponder() {
        return this.responder;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates coordinates) {
        this.hasBeenPlaced = true;
    }

    public final void setResponder(BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }
}
