package androidx.paging;

import androidx.paging.PageEvent;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p325rc.AbstractC10976v;
import p365ud.InterfaceC11395j;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class ItemSnapshotListFlow {

    @InterfaceC11829d(m26210c = "androidx.paging.ItemSnapshotListFlow$asItemSnapshotListFlow$2", m26211f = "ItemSnapshotListFlow.kt", m26212l = {59}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.ItemSnapshotListFlow$asItemSnapshotListFlow$2 */
    public static final class C42312 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Ref$ObjectRef<CombinedLoadStates> $errorCombinedLoadStates;
        final /* synthetic */ InterfaceC9540l $onLoadError;
        final /* synthetic */ InterfaceC11594c $this_asItemSnapshotListFlow;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.paging.ItemSnapshotListFlow$asItemSnapshotListFlow$2$1", m26211f = "ItemSnapshotListFlow.kt", m26212l = {PatchStatus.CODE_LOAD_RES_INJECT_PATH}, m26213m = "invokeSuspend", m26214v = 1)
        /* renamed from: androidx.paging.ItemSnapshotListFlow$asItemSnapshotListFlow$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC11395j $$this$channelFlow;
            final /* synthetic */ Ref$ObjectRef<CombinedLoadStates> $errorCombinedLoadStates;
            final /* synthetic */ InterfaceC9540l $onLoadError;
            /* synthetic */ Object L$0;
            int label;

            @InterfaceC11829d(m26210c = "androidx.paging.ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1", m26211f = "ItemSnapshotListFlow.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
            /* renamed from: androidx.paging.ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C120901 extends SuspendLambda implements InterfaceC9545q {
                final /* synthetic */ Ref$ObjectRef<CombinedLoadStates> $errorCombinedLoadStates;
                final /* synthetic */ InterfaceC9540l $onLoadError;
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120901(Ref$ObjectRef<CombinedLoadStates> ref$ObjectRef, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C120901> interfaceC11588c) {
                    super(3, interfaceC11588c);
                    this.$errorCombinedLoadStates = ref$ObjectRef;
                    this.$onLoadError = interfaceC9540l;
                }

                @Override // p181hd.InterfaceC9545q
                public final Object invoke(PageStore<T> pageStore, PageEvent<T> pageEvent, InterfaceC11588c<? super PageStore<T>> interfaceC11588c) {
                    C120901 c120901 = new C120901(this.$errorCombinedLoadStates, this.$onLoadError, interfaceC11588c);
                    c120901.L$0 = pageStore;
                    c120901.L$1 = pageEvent;
                    return c120901.invokeSuspend(C10786q.f26013a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    LoadStates mediator;
                    AbstractC11725a.m25952f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    PageStore pageStore = (PageStore) this.L$0;
                    PageEvent pageEvent = (PageEvent) this.L$1;
                    if (pageEvent instanceof PageEvent.LoadStateUpdate) {
                        PageEvent.LoadStateUpdate loadStateUpdate = (PageEvent.LoadStateUpdate) pageEvent;
                        if (!loadStateUpdate.getSource().hasError() && ((mediator = loadStateUpdate.getMediator()) == null || !mediator.hasError())) {
                            return pageStore;
                        }
                        Ref$ObjectRef<CombinedLoadStates> ref$ObjectRef = this.$errorCombinedLoadStates;
                        ref$ObjectRef.f23402c = MutableCombinedLoadStateCollectionKt.computeNewState((CombinedLoadStates) ref$ObjectRef.f23402c, loadStateUpdate.getSource(), loadStateUpdate.getMediator());
                        this.$onLoadError.invoke(this.$errorCombinedLoadStates.f23402c);
                        return pageStore;
                    }
                    if (pageEvent instanceof PageEvent.StaticList) {
                        PageEvent.StaticList staticList = (PageEvent.StaticList) pageEvent;
                        return new PageStore(AbstractC10976v.m24126e(new TransformablePage(0, staticList.getData())), staticList.getPlaceholdersBefore(), staticList.getPlaceholdersAfter());
                    }
                    if (pageEvent instanceof PageEvent.Insert) {
                        PageEvent.Insert insert = (PageEvent.Insert) pageEvent;
                        if (insert.getLoadType() == LoadType.REFRESH) {
                            if (pageStore == null) {
                                return new PageStore(insert.getPages(), insert.getPlaceholdersBefore(), insert.getPlaceholdersAfter());
                            }
                            throw new IllegalArgumentException("PageStore should be null on REFRESH. This likely indicates an error in the library. Please file a bug in the Buganizer");
                        }
                    }
                    if (pageStore == null) {
                        throw new IllegalArgumentException("PageStore should only be null on REFRESH. This likely indicates an error in the library. Please file a bug in the Buganizer");
                    }
                    pageStore.processEvent(pageEvent);
                    return pageStore;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref$ObjectRef<CombinedLoadStates> ref$ObjectRef, InterfaceC9540l interfaceC9540l, InterfaceC11395j interfaceC11395j, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$errorCombinedLoadStates = ref$ObjectRef;
                this.$onLoadError = interfaceC9540l;
                this.$$this$channelFlow = interfaceC11395j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$errorCombinedLoadStates, this.$onLoadError, this.$$this$channelFlow, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(PagingData<T> pagingData, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(pagingData, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11594c interfaceC11594cM25566p = AbstractC11596e.m25566p(AbstractC11596e.m25572v(FlowExtKt.simpleScan(((PagingData) this.L$0).getFlow$paging_common(), null, new C120901(this.$errorCombinedLoadStates, this.$onLoadError, null))), new InterfaceC9540l() { // from class: androidx.paging.x
                        @Override // p181hd.InterfaceC9540l
                        public final Object invoke(Object obj2) {
                            return Integer.valueOf(((PageStore) obj2).hashCode());
                        }
                    });
                    final InterfaceC11395j interfaceC11395j = this.$$this$channelFlow;
                    InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.paging.ItemSnapshotListFlow.asItemSnapshotListFlow.2.1.3
                        @Override // p379vd.InterfaceC11595d
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                            return emit((PageStore) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                        }

                        public final Object emit(PageStore<T> pageStore, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            Object objSend = interfaceC11395j.send(pageStore.snapshot(), interfaceC11588c);
                            return objSend == AbstractC11725a.m25952f() ? objSend : C10786q.f26013a;
                        }
                    };
                    this.label = 1;
                    if (interfaceC11594cM25566p.collect(interfaceC11595d, this) == objM25952f) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42312(InterfaceC11594c interfaceC11594c, Ref$ObjectRef<CombinedLoadStates> ref$ObjectRef, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C42312> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_asItemSnapshotListFlow = interfaceC11594c;
            this.$errorCombinedLoadStates = ref$ObjectRef;
            this.$onLoadError = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42312 c42312 = new C42312(this.$this_asItemSnapshotListFlow, this.$errorCombinedLoadStates, this.$onLoadError, interfaceC11588c);
            c42312.L$0 = obj;
            return c42312;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11395j interfaceC11395j = (InterfaceC11395j) this.L$0;
                InterfaceC11594c interfaceC11594c = this.$this_asItemSnapshotListFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$errorCombinedLoadStates, this.$onLoadError, interfaceC11395j, null);
                this.label = 1;
                if (AbstractC11596e.m25559i(interfaceC11594c, anonymousClass1, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11395j interfaceC11395j, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42312) create(interfaceC11395j, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static final <T> InterfaceC11594c asItemSnapshotListFlow(InterfaceC11594c interfaceC11594c, InterfaceC9540l onLoadError) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(onLoadError, "onLoadError");
        return AbstractC11596e.m25557g(new C42312(interfaceC11594c, new Ref$ObjectRef(), onLoadError, null));
    }

    public static /* synthetic */ InterfaceC11594c asItemSnapshotListFlow$default(InterfaceC11594c interfaceC11594c, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.paging.w
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return ItemSnapshotListFlow.asItemSnapshotListFlow$lambda$0((CombinedLoadStates) obj2);
                }
            };
        }
        return asItemSnapshotListFlow(interfaceC11594c, interfaceC9540l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q asItemSnapshotListFlow$lambda$0(CombinedLoadStates it) {
        AbstractC9979u.m20294g(it, "it");
        return C10786q.f26013a;
    }
}
