package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p013ui.draw.DrawModifierKt;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.node.DelegatingNode;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class LegacyDragSourceNodeWithDefaultPainter extends DelegatingNode {
    private InterfaceC10574p dragAndDropSourceHandler;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2", m17801f = "LegacyDragAndDropSourceWithDefaultPainter.android.kt", m17802l = {101}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2 */
    public static final class C12252 extends SuspendLambda implements InterfaceC10574p {
        private /* synthetic */ Object L$0;
        int label;

        public C12252(InterfaceC9324c<? super C12252> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12252 c12252 = LegacyDragSourceNodeWithDefaultPainter.this.new C12252(interfaceC9324c);
            c12252.L$0 = obj;
            return c12252;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(DragAndDropSourceScope dragAndDropSourceScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12252) create(dragAndDropSourceScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                DragAndDropSourceScope dragAndDropSourceScope = (DragAndDropSourceScope) this.L$0;
                InterfaceC10574p dragAndDropSourceHandler = LegacyDragSourceNodeWithDefaultPainter.this.getDragAndDropSourceHandler();
                this.label = 1;
                if (dragAndDropSourceHandler.invoke(dragAndDropSourceScope, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public LegacyDragSourceNodeWithDefaultPainter(InterfaceC10574p interfaceC10574p) {
        this.dragAndDropSourceHandler = interfaceC10574p;
        final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new C1226xa44377db(cacheDrawScopeDragShadowCallback)));
        delegate(new LegacyDragAndDropSourceNode(new InterfaceC10570l() { // from class: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(DrawScope drawScope) {
                cacheDrawScopeDragShadowCallback.drawDragShadow(drawScope);
            }
        }, new C12252(null)));
    }

    public final InterfaceC10574p getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final void setDragAndDropSourceHandler(InterfaceC10574p interfaceC10574p) {
        this.dragAndDropSourceHandler = interfaceC10574p;
    }
}
