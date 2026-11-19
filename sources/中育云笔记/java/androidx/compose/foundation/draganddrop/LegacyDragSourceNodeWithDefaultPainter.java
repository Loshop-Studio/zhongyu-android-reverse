package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.node.DelegatingNode;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class LegacyDragSourceNodeWithDefaultPainter extends DelegatingNode {
    private InterfaceC9544p dragAndDropSourceHandler;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2", m26211f = "LegacyDragAndDropSourceWithDefaultPainter.android.kt", m26212l = {101}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2 */
    public static final class C12552 extends SuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        int label;

        public C12552(InterfaceC11588c<? super C12552> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C12552 c12552 = LegacyDragSourceNodeWithDefaultPainter.this.new C12552(interfaceC11588c);
            c12552.L$0 = obj;
            return c12552;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(DragAndDropSourceScope dragAndDropSourceScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C12552) create(dragAndDropSourceScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                DragAndDropSourceScope dragAndDropSourceScope = (DragAndDropSourceScope) this.L$0;
                InterfaceC9544p dragAndDropSourceHandler = LegacyDragSourceNodeWithDefaultPainter.this.getDragAndDropSourceHandler();
                this.label = 1;
                if (dragAndDropSourceHandler.invoke(dragAndDropSourceScope, this) == objM25952f) {
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
    }

    public LegacyDragSourceNodeWithDefaultPainter(InterfaceC9544p interfaceC9544p) {
        this.dragAndDropSourceHandler = interfaceC9544p;
        final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new C1256xa44377db(cacheDrawScopeDragShadowCallback)));
        delegate(new LegacyDragAndDropSourceNode(new InterfaceC9540l() { // from class: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(DrawScope drawScope) {
                cacheDrawScopeDragShadowCallback.drawDragShadow(drawScope);
            }
        }, new C12552(null)));
    }

    public final InterfaceC9544p getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final void setDragAndDropSourceHandler(InterfaceC9544p interfaceC9544p) {
        this.dragAndDropSourceHandler = interfaceC9544p;
    }
}
