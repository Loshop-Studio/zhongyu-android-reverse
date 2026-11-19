package androidx.paging;

import androidx.paging.PageEvent;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class PagingData<T> {
    private final InterfaceC10559a cachedPageEvent;
    private final InterfaceC9266c flow;
    private final HintReceiver hintReceiver;
    private final UiReceiver uiReceiver;
    public static final Companion Companion = new Companion(null);
    private static final UiReceiver NOOP_UI_RECEIVER = new UiReceiver() { // from class: androidx.paging.PagingData$Companion$NOOP_UI_RECEIVER$1
        @Override // androidx.paging.UiReceiver
        public void refresh() {
        }

        @Override // androidx.paging.UiReceiver
        public void retry() {
        }
    };
    private static final HintReceiver NOOP_HINT_RECEIVER = new HintReceiver() { // from class: androidx.paging.PagingData$Companion$NOOP_HINT_RECEIVER$1
        @Override // androidx.paging.HintReceiver
        public void accessHint(ViewportHint viewportHint) {
            AbstractC9133u.m16133g(viewportHint, "viewportHint");
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public static /* synthetic */ PagingData empty$default(Companion companion, LoadStates loadStates, LoadStates loadStates2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                loadStates2 = null;
            }
            return companion.empty(loadStates, loadStates2);
        }

        public static /* synthetic */ PagingData from$default(Companion companion, List list, LoadStates loadStates, LoadStates loadStates2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                loadStates2 = null;
            }
            return companion.from(list, loadStates, loadStates2);
        }

        public final <T> PagingData<T> empty(LoadStates sourceLoadStates) {
            AbstractC9133u.m16133g(sourceLoadStates, "sourceLoadStates");
            return empty$default(this, sourceLoadStates, null, 2, null);
        }

        public final <T> PagingData<T> from(List<? extends T> data, LoadStates sourceLoadStates) {
            AbstractC9133u.m16133g(data, "data");
            AbstractC9133u.m16133g(sourceLoadStates, "sourceLoadStates");
            return from$default(this, data, sourceLoadStates, null, 4, null);
        }

        public final HintReceiver getNOOP_HINT_RECEIVER$paging_common_release() {
            return PagingData.NOOP_HINT_RECEIVER;
        }

        public final UiReceiver getNOOP_UI_RECEIVER$paging_common_release() {
            return PagingData.NOOP_UI_RECEIVER;
        }

        private Companion() {
        }

        public final <T> PagingData<T> empty() {
            return new PagingData<>(AbstractC9268e.m16992D(new PageEvent.StaticList(AbstractC8809v.m14771n(), null, null)), getNOOP_UI_RECEIVER$paging_common_release(), getNOOP_HINT_RECEIVER$paging_common_release(), new InterfaceC10559a() { // from class: androidx.paging.PagingData$Companion$empty$1
                @Override // p300x7.InterfaceC10559a
                public final PageEvent.Insert<T> invoke() {
                    return PageEvent.Insert.Companion.Refresh(AbstractC8807u.m14755e(new TransformablePage(0, AbstractC8809v.m14771n())), 0, 0, LoadStates.Companion.getIDLE(), null);
                }
            });
        }

        public final <T> PagingData<T> from(final List<? extends T> data) {
            AbstractC9133u.m16133g(data, "data");
            return new PagingData<>(AbstractC9268e.m16992D(new PageEvent.StaticList(data, null, null)), getNOOP_UI_RECEIVER$paging_common_release(), getNOOP_HINT_RECEIVER$paging_common_release(), new InterfaceC10559a() { // from class: androidx.paging.PagingData$Companion$from$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final PageEvent.Insert<T> invoke() {
                    return PageEvent.Insert.Companion.Refresh(AbstractC8807u.m14755e(new TransformablePage(0, data)), 0, 0, LoadStates.Companion.getIDLE(), null);
                }
            });
        }

        public final <T> PagingData<T> from(final List<? extends T> data, final LoadStates sourceLoadStates, final LoadStates loadStates) {
            AbstractC9133u.m16133g(data, "data");
            AbstractC9133u.m16133g(sourceLoadStates, "sourceLoadStates");
            return new PagingData<>(AbstractC9268e.m16992D(new PageEvent.StaticList(data, sourceLoadStates, loadStates)), getNOOP_UI_RECEIVER$paging_common_release(), getNOOP_HINT_RECEIVER$paging_common_release(), new InterfaceC10559a() { // from class: androidx.paging.PagingData$Companion$from$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final PageEvent.Insert<T> invoke() {
                    return PageEvent.Insert.Companion.Refresh(AbstractC8807u.m14755e(new TransformablePage(0, data)), 0, 0, sourceLoadStates, loadStates);
                }
            });
        }

        public final <T> PagingData<T> empty(final LoadStates sourceLoadStates, final LoadStates loadStates) {
            AbstractC9133u.m16133g(sourceLoadStates, "sourceLoadStates");
            return new PagingData<>(AbstractC9268e.m16992D(new PageEvent.StaticList(AbstractC8809v.m14771n(), sourceLoadStates, loadStates)), getNOOP_UI_RECEIVER$paging_common_release(), getNOOP_HINT_RECEIVER$paging_common_release(), new InterfaceC10559a() { // from class: androidx.paging.PagingData$Companion$empty$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final PageEvent.Insert<T> invoke() {
                    return PageEvent.Insert.Companion.Refresh(AbstractC8807u.m14755e(new TransformablePage(0, AbstractC8809v.m14771n())), 0, 0, sourceLoadStates, loadStates);
                }
            });
        }
    }

    public PagingData(InterfaceC9266c flow, UiReceiver uiReceiver, HintReceiver hintReceiver, InterfaceC10559a cachedPageEvent) {
        AbstractC9133u.m16133g(flow, "flow");
        AbstractC9133u.m16133g(uiReceiver, "uiReceiver");
        AbstractC9133u.m16133g(hintReceiver, "hintReceiver");
        AbstractC9133u.m16133g(cachedPageEvent, "cachedPageEvent");
        this.flow = flow;
        this.uiReceiver = uiReceiver;
        this.hintReceiver = hintReceiver;
        this.cachedPageEvent = cachedPageEvent;
    }

    public static final <T> PagingData<T> empty() {
        return Companion.empty();
    }

    public static final <T> PagingData<T> from(List<? extends T> list) {
        return Companion.from(list);
    }

    public final PageEvent.Insert<T> cachedEvent$paging_common_release() {
        return (PageEvent.Insert) this.cachedPageEvent.invoke();
    }

    public final InterfaceC9266c getFlow$paging_common_release() {
        return this.flow;
    }

    public final HintReceiver getHintReceiver$paging_common_release() {
        return this.hintReceiver;
    }

    public final UiReceiver getUiReceiver$paging_common_release() {
        return this.uiReceiver;
    }

    public static final <T> PagingData<T> empty(LoadStates loadStates) {
        return Companion.empty(loadStates);
    }

    public static final <T> PagingData<T> from(List<? extends T> list, LoadStates loadStates) {
        return Companion.from(list, loadStates);
    }

    public static final <T> PagingData<T> empty(LoadStates loadStates, LoadStates loadStates2) {
        return Companion.empty(loadStates, loadStates2);
    }

    public static final <T> PagingData<T> from(List<? extends T> list, LoadStates loadStates, LoadStates loadStates2) {
        return Companion.from(list, loadStates, loadStates2);
    }

    public /* synthetic */ PagingData(InterfaceC9266c interfaceC9266c, UiReceiver uiReceiver, HintReceiver hintReceiver, InterfaceC10559a interfaceC10559a, int i10, AbstractC9126n abstractC9126n) {
        this(interfaceC9266c, uiReceiver, hintReceiver, (i10 & 8) != 0 ? new InterfaceC10559a() { // from class: androidx.paging.PagingData.1
            @Override // p300x7.InterfaceC10559a
            public final Void invoke() {
                return null;
            }
        } : interfaceC10559a);
    }
}
