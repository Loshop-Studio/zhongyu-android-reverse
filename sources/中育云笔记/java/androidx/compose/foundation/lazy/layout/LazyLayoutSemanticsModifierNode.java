package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.SemanticsModifierNode;
import androidx.compose.p014ui.node.SemanticsModifierNodeKt;
import androidx.compose.p014ui.semantics.CollectionInfo;
import androidx.compose.p014ui.semantics.ScrollAxisRange;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    private final InterfaceC9540l indexForKeyMapping = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$indexForKeyMapping$1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public final Integer invoke(Object obj) {
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.this$0.itemProviderLambda.invoke();
            int itemCount = lazyLayoutItemProvider.getItemCount();
            int i10 = 0;
            while (true) {
                if (i10 >= itemCount) {
                    i10 = -1;
                    break;
                }
                if (AbstractC9979u.m20289b(lazyLayoutItemProvider.getKey(i10), obj)) {
                    break;
                }
                i10++;
            }
            return Integer.valueOf(i10);
        }
    };
    private InterfaceC9529a itemProviderLambda;
    private Orientation orientation;
    private boolean reverseScrolling;
    private ScrollAxisRange scrollAxisRange;
    private InterfaceC9540l scrollToIndexAction;
    private LazyLayoutSemanticState state;
    private boolean userScrollEnabled;

    public LazyLayoutSemanticsModifierNode(InterfaceC9529a interfaceC9529a, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z10, boolean z11) {
        this.itemProviderLambda = interfaceC9529a;
        this.state = lazyLayoutSemanticState;
        this.orientation = orientation;
        this.userScrollEnabled = z10;
        this.reverseScrolling = z11;
        updateCachedSemanticsValues();
    }

    private final CollectionInfo getCollectionInfo() {
        return this.state.collectionInfo();
    }

    private final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }

    private final void updateCachedSemanticsValues() {
        this.scrollAxisRange = new ScrollAxisRange(new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode.updateCachedSemanticsValues.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Float invoke() {
                return Float.valueOf(LazyLayoutSemanticsModifierNode.this.state.getScrollOffset());
            }
        }, new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode.updateCachedSemanticsValues.2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Float invoke() {
                return Float.valueOf(LazyLayoutSemanticsModifierNode.this.state.getMaxScrollOffset());
            }
        }, this.reverseScrolling);
        this.scrollToIndexAction = this.userScrollEnabled ? new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode.updateCachedSemanticsValues.3

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", m26211f = "LazyLayoutSemantics.kt", m26212l = {213}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ int $index;
                int label;
                final /* synthetic */ LazyLayoutSemanticsModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i10, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.this$0 = lazyLayoutSemanticsModifierNode;
                    this.$index = i10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass2(this.this$0, this.$index, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        LazyLayoutSemanticState lazyLayoutSemanticState = this.this$0.state;
                        int i11 = this.$index;
                        this.label = 1;
                        if (lazyLayoutSemanticState.scrollToItem(i11, this) == objM25952f) {
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

            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Boolean invoke(int i10) {
                LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) LazyLayoutSemanticsModifierNode.this.itemProviderLambda.invoke();
                if (!(i10 >= 0 && i10 < lazyLayoutItemProvider.getItemCount())) {
                    InlineClassHelperKt.throwIllegalArgumentException("Can't scroll to index " + i10 + ", it is out of bounds [0, " + lazyLayoutItemProvider.getItemCount() + ')');
                }
                AbstractC11117h.m24726d(LazyLayoutSemanticsModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass2(LazyLayoutSemanticsModifierNode.this, i10, null), 3, null);
                return Boolean.TRUE;
            }
        } : null;
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        SemanticsPropertiesKt.indexForKey(semanticsPropertyReceiver, this.indexForKeyMapping);
        if (isVertical()) {
            ScrollAxisRange scrollAxisRange = this.scrollAxisRange;
            if (scrollAxisRange == null) {
                AbstractC9979u.m20312y("scrollAxisRange");
                scrollAxisRange = null;
            }
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.scrollAxisRange;
            if (scrollAxisRange2 == null) {
                AbstractC9979u.m20312y("scrollAxisRange");
                scrollAxisRange2 = null;
            }
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange2);
        }
        InterfaceC9540l interfaceC9540l = this.scrollToIndexAction;
        if (interfaceC9540l != null) {
            SemanticsPropertiesKt.scrollToIndex$default(semanticsPropertyReceiver, null, interfaceC9540l, 1, null);
        }
        SemanticsPropertiesKt.getScrollViewportLength$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode.applySemantics.2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Float invoke() {
                return Float.valueOf(LazyLayoutSemanticsModifierNode.this.state.getViewport() - LazyLayoutSemanticsModifierNode.this.state.getContentPadding());
            }
        }, 1, null);
        SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, getCollectionInfo());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void update(InterfaceC9529a interfaceC9529a, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z10, boolean z11) {
        this.itemProviderLambda = interfaceC9529a;
        this.state = lazyLayoutSemanticState;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (this.userScrollEnabled == z10 && this.reverseScrolling == z11) {
            return;
        }
        this.userScrollEnabled = z10;
        this.reverseScrolling = z11;
        updateCachedSemanticsValues();
        SemanticsModifierNodeKt.invalidateSemantics(this);
    }
}
