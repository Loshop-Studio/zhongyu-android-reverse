package androidx.paging;

import androidx.paging.PageEvent;
import androidx.paging.PagingData;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;

/* loaded from: classes3.dex */
public final class PagingData<T> {
    private final InterfaceC9529a cachedPageEvent;
    private final InterfaceC11594c flow;
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
        public void processHint(ViewportHint viewportHint) {
            AbstractC9979u.m20294g(viewportHint, "viewportHint");
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public static /* synthetic */ PagingData empty$default(Companion companion, LoadStates loadStates, LoadStates loadStates2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                loadStates2 = null;
            }
            return companion.empty(loadStates, loadStates2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PageEvent.Insert empty$lambda$0() {
            return PageEvent.Insert.Companion.Refresh(AbstractC10976v.m24126e(new TransformablePage(0, AbstractC10978w.m24136n())), 0, 0, LoadStates.Companion.getIDLE(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PageEvent.Insert empty$lambda$1(LoadStates loadStates, LoadStates loadStates2) {
            return PageEvent.Insert.Companion.Refresh(AbstractC10976v.m24126e(new TransformablePage(0, AbstractC10978w.m24136n())), 0, 0, loadStates, loadStates2);
        }

        public static /* synthetic */ PagingData from$default(Companion companion, List list, int i10, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return companion.from(list, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PageEvent.Insert from$lambda$0(List list, int i10, int i11) {
            return PageEvent.Insert.Companion.Refresh(AbstractC10976v.m24126e(new TransformablePage(0, list)), i10, i11, LoadStates.Companion.getIDLE(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PageEvent.Insert from$lambda$1(List list, int i10, int i11, LoadStates loadStates, LoadStates loadStates2) {
            return PageEvent.Insert.Companion.Refresh(AbstractC10976v.m24126e(new TransformablePage(0, list)), i10, i11, loadStates, loadStates2);
        }

        public final <T> PagingData<T> empty(LoadStates sourceLoadStates) {
            AbstractC9979u.m20294g(sourceLoadStates, "sourceLoadStates");
            return empty$default(this, sourceLoadStates, null, 2, null);
        }

        public final <T> PagingData<T> from(List<? extends T> data) {
            AbstractC9979u.m20294g(data, "data");
            return from$default(this, data, 0, 0, 6, null);
        }

        public final HintReceiver getNOOP_HINT_RECEIVER$paging_common() {
            return PagingData.NOOP_HINT_RECEIVER;
        }

        public final UiReceiver getNOOP_UI_RECEIVER$paging_common() {
            return PagingData.NOOP_UI_RECEIVER;
        }

        private Companion() {
        }

        public static /* synthetic */ PagingData from$default(Companion companion, List list, LoadStates loadStates, LoadStates loadStates2, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                loadStates2 = null;
            }
            return companion.from(list, loadStates, loadStates2, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 0 : i11);
        }

        public final <T> PagingData<T> empty() {
            return new PagingData<>(AbstractC11596e.m25532C(new PageEvent.StaticList(AbstractC10978w.m24136n(), null, null, 0, 0, 24, null)), getNOOP_UI_RECEIVER$paging_common(), getNOOP_HINT_RECEIVER$paging_common(), new InterfaceC9529a() { // from class: androidx.paging.s0
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return PagingData.Companion.empty$lambda$0();
                }
            });
        }

        public final <T> PagingData<T> from(List<? extends T> data, int i10) {
            AbstractC9979u.m20294g(data, "data");
            return from$default(this, data, i10, 0, 4, null);
        }

        public final <T> PagingData<T> from(List<? extends T> data, LoadStates sourceLoadStates) {
            AbstractC9979u.m20294g(data, "data");
            AbstractC9979u.m20294g(sourceLoadStates, "sourceLoadStates");
            return from$default(this, data, sourceLoadStates, null, 0, 0, 28, null);
        }

        public final <T> PagingData<T> from(List<? extends T> data, LoadStates sourceLoadStates, LoadStates loadStates) {
            AbstractC9979u.m20294g(data, "data");
            AbstractC9979u.m20294g(sourceLoadStates, "sourceLoadStates");
            return from$default(this, data, sourceLoadStates, loadStates, 0, 0, 24, null);
        }

        public final <T> PagingData<T> from(List<? extends T> data, LoadStates sourceLoadStates, LoadStates loadStates, int i10) {
            AbstractC9979u.m20294g(data, "data");
            AbstractC9979u.m20294g(sourceLoadStates, "sourceLoadStates");
            return from$default(this, data, sourceLoadStates, loadStates, i10, 0, 16, null);
        }

        public final <T> PagingData<T> from(final List<? extends T> data, final int i10, final int i11) {
            AbstractC9979u.m20294g(data, "data");
            return new PagingData<>(AbstractC11596e.m25532C(new PageEvent.StaticList(data, null, null, i10, i11)), getNOOP_UI_RECEIVER$paging_common(), getNOOP_HINT_RECEIVER$paging_common(), new InterfaceC9529a() { // from class: androidx.paging.t0
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return PagingData.Companion.from$lambda$0(data, i10, i11);
                }
            });
        }

        public final <T> PagingData<T> empty(final LoadStates sourceLoadStates, final LoadStates loadStates) {
            AbstractC9979u.m20294g(sourceLoadStates, "sourceLoadStates");
            return new PagingData<>(AbstractC11596e.m25532C(new PageEvent.StaticList(AbstractC10978w.m24136n(), sourceLoadStates, loadStates, 0, 0, 24, null)), getNOOP_UI_RECEIVER$paging_common(), getNOOP_HINT_RECEIVER$paging_common(), new InterfaceC9529a() { // from class: androidx.paging.u0
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return PagingData.Companion.empty$lambda$1(sourceLoadStates, loadStates);
                }
            });
        }

        public final <T> PagingData<T> from(final List<? extends T> data, final LoadStates sourceLoadStates, final LoadStates loadStates, final int i10, final int i11) {
            AbstractC9979u.m20294g(data, "data");
            AbstractC9979u.m20294g(sourceLoadStates, "sourceLoadStates");
            return new PagingData<>(AbstractC11596e.m25532C(new PageEvent.StaticList(data, sourceLoadStates, loadStates, i10, i11)), getNOOP_UI_RECEIVER$paging_common(), getNOOP_HINT_RECEIVER$paging_common(), new InterfaceC9529a() { // from class: androidx.paging.r0
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return PagingData.Companion.from$lambda$1(data, i10, i11, sourceLoadStates, loadStates);
                }
            });
        }
    }

    public PagingData(InterfaceC11594c flow, UiReceiver uiReceiver, HintReceiver hintReceiver, InterfaceC9529a cachedPageEvent) {
        AbstractC9979u.m20294g(flow, "flow");
        AbstractC9979u.m20294g(uiReceiver, "uiReceiver");
        AbstractC9979u.m20294g(hintReceiver, "hintReceiver");
        AbstractC9979u.m20294g(cachedPageEvent, "cachedPageEvent");
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

    public final PageEvent.Insert<T> cachedEvent$paging_common() {
        return (PageEvent.Insert) this.cachedPageEvent.invoke();
    }

    public final InterfaceC11594c getFlow$paging_common() {
        return this.flow;
    }

    public final HintReceiver getHintReceiver$paging_common() {
        return this.hintReceiver;
    }

    public final UiReceiver getUiReceiver$paging_common() {
        return this.uiReceiver;
    }

    public static final <T> PagingData<T> empty(LoadStates loadStates) {
        return Companion.empty(loadStates);
    }

    public static final <T> PagingData<T> from(List<? extends T> list, int i10) {
        return Companion.from(list, i10);
    }

    public static final <T> PagingData<T> empty(LoadStates loadStates, LoadStates loadStates2) {
        return Companion.empty(loadStates, loadStates2);
    }

    public static final <T> PagingData<T> from(List<? extends T> list, int i10, int i11) {
        return Companion.from(list, i10, i11);
    }

    public static final <T> PagingData<T> from(List<? extends T> list, LoadStates loadStates) {
        return Companion.from(list, loadStates);
    }

    public static final <T> PagingData<T> from(List<? extends T> list, LoadStates loadStates, LoadStates loadStates2) {
        return Companion.from(list, loadStates, loadStates2);
    }

    public /* synthetic */ PagingData(InterfaceC11594c interfaceC11594c, UiReceiver uiReceiver, HintReceiver hintReceiver, InterfaceC9529a interfaceC9529a, int i10, AbstractC9972n abstractC9972n) {
        this(interfaceC11594c, uiReceiver, hintReceiver, (i10 & 8) != 0 ? new InterfaceC9529a() { // from class: androidx.paging.PagingData.1
            @Override // p181hd.InterfaceC9529a
            public final Void invoke() {
                return null;
            }
        } : interfaceC9529a);
    }

    public static final <T> PagingData<T> from(List<? extends T> list, LoadStates loadStates, LoadStates loadStates2, int i10) {
        return Companion.from(list, loadStates, loadStates2, i10);
    }

    public static final <T> PagingData<T> from(List<? extends T> list, LoadStates loadStates, LoadStates loadStates2, int i10, int i11) {
        return Companion.from(list, loadStates, loadStates2, i10, i11);
    }
}
