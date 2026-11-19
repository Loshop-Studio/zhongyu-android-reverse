package com.friday.document.view.document;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.common.entity.FileEntity;
import com.friday.document.R$color;
import com.friday.document.R$dimen;
import com.friday.document.R$layout;
import com.friday.document.adapter.AbstractC5985a;
import com.friday.document.adapter.DocumentAdapter;
import com.friday.document.databinding.FragmentFileListBinding;
import com.friday.document.view.document.FileListFragment;
import com.friday.document.viewmodel.FolderViewModel;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p370v2.InterfaceC11453x;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11607p;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FileListFragment extends Hilt_FileListFragment<FragmentFileListBinding> {

    /* renamed from: i */
    public final InterfaceC11453x f7312i;

    /* renamed from: j */
    public final FolderViewModel f7313j;

    /* renamed from: k */
    public final String f7314k;

    /* renamed from: l */
    public final DocumentAdapter f7315l;

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.FileListFragment$initObserver$1", m26211f = "FileListFragment.kt", m26212l = {100}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.FileListFragment$initObserver$1 */
    public static final class C60311 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7316c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.document.FileListFragment$initObserver$1$1", m26211f = "FileListFragment.kt", m26212l = {101}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.document.FileListFragment$initObserver$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7318c;

            /* renamed from: d */
            public /* synthetic */ Object f7319d;

            /* renamed from: e */
            public final /* synthetic */ FileListFragment f7320e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FileListFragment fileListFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7320e = fileListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7320e, interfaceC11588c);
                anonymousClass1.f7319d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(PagingData pagingData, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(pagingData, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PagingData pagingData = (PagingData) this.f7319d;
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f7318c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    DocumentAdapter documentAdapter = this.f7320e.f7315l;
                    this.f7319d = AbstractC11833h.m26224a(pagingData);
                    this.f7318c = 1;
                    if (documentAdapter.submitData(pagingData, this) == objM25952f) {
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

        public C60311(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FileListFragment.this.new C60311(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7316c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594cM6291K0 = FileListFragment.this.f7313j.m6291K0(FileListFragment.this.m5839x());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FileListFragment.this, null);
                this.f7316c = 1;
                if (AbstractC11596e.m25559i(interfaceC11594cM6291K0, anonymousClass1, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60311) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.FileListFragment$initObserver$2", m26211f = "FileListFragment.kt", m26212l = {106}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.FileListFragment$initObserver$2 */
    public static final class C60322 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7321c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.document.FileListFragment$initObserver$2$1", m26211f = "FileListFragment.kt", m26212l = {PatchStatus.CODE_PRELOAD_OPT_MERGED}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.document.FileListFragment$initObserver$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7323c;

            /* renamed from: d */
            public final /* synthetic */ FileListFragment f7324d;

            /* renamed from: com.friday.document.view.document.FileListFragment$initObserver$2$1$a */
            public static final class a implements InterfaceC11595d {

                /* renamed from: c */
                public final /* synthetic */ FileListFragment f7325c;

                public a(FileListFragment fileListFragment) {
                    this.f7325c = fileListFragment;
                }

                @Override // p379vd.InterfaceC11595d
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(C10786q c10786q, InterfaceC11588c interfaceC11588c) {
                    this.f7325c.f7315l.refresh();
                    return C10786q.f26013a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FileListFragment fileListFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7324d = fileListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7324d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f7323c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11607p interfaceC11607pM6293M0 = this.f7324d.f7313j.m6293M0();
                    a aVar = new a(this.f7324d);
                    this.f7323c = 1;
                    if (interfaceC11607pM6293M0.collect(aVar, this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C60322(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FileListFragment.this.new C60322(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7321c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LifecycleOwner viewLifecycleOwner = FileListFragment.this.getViewLifecycleOwner();
                AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FileListFragment.this, null);
                this.f7321c = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60322) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.FileListFragment$initObserver$3", m26211f = "FileListFragment.kt", m26212l = {114}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.FileListFragment$initObserver$3 */
    public static final class C60333 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7326c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.document.FileListFragment$initObserver$3$1", m26211f = "FileListFragment.kt", m26212l = {115}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.document.FileListFragment$initObserver$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7328c;

            /* renamed from: d */
            public final /* synthetic */ FileListFragment f7329d;

            /* renamed from: com.friday.document.view.document.FileListFragment$initObserver$3$1$a */
            public static final class a implements InterfaceC11595d {

                /* renamed from: c */
                public final /* synthetic */ FileListFragment f7330c;

                public a(FileListFragment fileListFragment) {
                    this.f7330c = fileListFragment;
                }

                /* renamed from: b */
                public final Object m5843b(boolean z10, InterfaceC11588c interfaceC11588c) {
                    this.f7330c.isShowLoading(z10);
                    return C10786q.f26013a;
                }

                @Override // p379vd.InterfaceC11595d
                public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
                    return m5843b(((Boolean) obj).booleanValue(), interfaceC11588c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FileListFragment fileListFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7329d = fileListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7329d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f7328c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11612u interfaceC11612uM6231O = this.f7329d.f7313j.m6231O();
                    a aVar = new a(this.f7329d);
                    this.f7328c = 1;
                    if (interfaceC11612uM6231O.collect(aVar, this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C60333(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FileListFragment.this.new C60333(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7326c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LifecycleOwner viewLifecycleOwner = FileListFragment.this.getViewLifecycleOwner();
                AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FileListFragment.this, null);
                this.f7326c = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60333) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public FileListFragment(InterfaceC11453x iFileListImpl, FolderViewModel mViewModel, String str) {
        AbstractC9979u.m20294g(iFileListImpl, "iFileListImpl");
        AbstractC9979u.m20294g(mViewModel, "mViewModel");
        this.f7312i = iFileListImpl;
        this.f7313j = mViewModel;
        this.f7314k = str;
        this.f7315l = new DocumentAdapter();
    }

    /* renamed from: A */
    public static final void m5828A(FileListFragment fileListFragment, SwipeRefreshLayout swipeRefreshLayout) {
        fileListFragment.f7312i.mo5870c();
        if (swipeRefreshLayout.isRefreshing()) {
            swipeRefreshLayout.setEnabled(false);
        }
        fileListFragment.f7313j.m6217A0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p309qc.C10786q m5829B(com.friday.document.view.document.FileListFragment r3, androidx.paging.CombinedLoadStates r4) {
        /*
            java.lang.String r0 = "loadState"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r4, r0)
            androidx.databinding.ViewDataBinding r0 = r3.getMBinding()
            com.friday.document.databinding.FragmentFileListBinding r0 = (com.friday.document.databinding.FragmentFileListBinding) r0
            android.widget.TextView r0 = r0.f6374c
            java.lang.String r1 = "emptyView"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r0, r1)
            androidx.paging.LoadStates r1 = r4.getSource()
            androidx.paging.LoadState r1 = r1.getRefresh()
            boolean r1 = r1 instanceof androidx.paging.LoadState.NotLoading
            r2 = 0
            if (r1 == 0) goto L33
            androidx.paging.LoadState r4 = r4.getAppend()
            boolean r4 = r4.getEndOfPaginationReached()
            if (r4 == 0) goto L33
            com.friday.document.adapter.DocumentAdapter r3 = r3.f7315l
            int r3 = r3.getItemCount()
            r4 = 1
            if (r3 >= r4) goto L33
            goto L34
        L33:
            r4 = r2
        L34:
            if (r4 == 0) goto L37
            goto L39
        L37:
            r2 = 8
        L39:
            r0.setVisibility(r2)
            qc.q r3 = p309qc.C10786q.f26013a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.document.FileListFragment.m5829B(com.friday.document.view.document.FileListFragment, androidx.paging.CombinedLoadStates):qc.q"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/document/FileListFragment.smali:138
    }

    /* renamed from: C */
    public static final C10786q m5830C(FileListFragment fileListFragment, AbstractC5985a option, FileEntity fileEntity) {
        AbstractC9979u.m20294g(option, "option");
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        fileListFragment.f7312i.mo5871e(option, fileEntity);
        return C10786q.f26013a;
    }

    /* renamed from: D */
    public static final C10786q m5831D(FileListFragment fileListFragment, FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        fileListFragment.f7312i.mo5869b(fileEntity);
        return C10786q.f26013a;
    }

    private final void initObserver() {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60311(null), 3, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C60322(null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C60333(null), 3, null);
    }

    /* renamed from: E */
    public final void m5838E() {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FileListFragment$setEmpty$1(this, null), 3, null);
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_file_list;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        initView();
        initObserver();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment
    public void initView() {
        final SwipeRefreshLayout swipeRefreshLayout = ((FragmentFileListBinding) getMBinding()).f6376e;
        swipeRefreshLayout.setColorSchemeColors(AbstractC11958b.m26580a(R$color.colorAccent));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: v2.h
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                FileListFragment.m5828A(this.f27254a, swipeRefreshLayout);
            }
        });
        final RecyclerView recyclerView = ((FragmentFileListBinding) getMBinding()).f6375d;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.friday.document.view.document.FileListFragment$initView$2$1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                AbstractC9979u.m20294g(outRect, "outRect");
                AbstractC9979u.m20294g(view, "view");
                AbstractC9979u.m20294g(parent, "parent");
                AbstractC9979u.m20294g(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
                if (AbstractC9979u.m20289b(layoutManager != null ? Integer.valueOf(layoutManager.getPosition(view)) : null, parent.getLayoutManager() != null ? Integer.valueOf(r4.getItemCount() - 1) : null)) {
                    outRect.bottom = (int) recyclerView.getResources().getDimension(R$dimen.view_5);
                } else {
                    outRect.bottom = 0;
                }
            }
        });
        recyclerView.setAdapter(this.f7315l);
        this.f7315l.addLoadStateListener(new InterfaceC9540l() { // from class: v2.i
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileListFragment.m5829B(this.f27256c, (CombinedLoadStates) obj);
            }
        });
        this.f7315l.m5455q(new InterfaceC9544p() { // from class: v2.j
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return FileListFragment.m5830C(this.f27258c, (AbstractC5985a) obj, (FileEntity) obj2);
            }
        });
        this.f7315l.m5456r(new InterfaceC9540l() { // from class: v2.k
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FileListFragment.m5831D(this.f27261c, (FileEntity) obj);
            }
        });
    }

    /* renamed from: x */
    public final String m5839x() {
        return this.f7314k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final RecyclerView m5840y() {
        RecyclerView recyclerView = ((FragmentFileListBinding) getMBinding()).f6375d;
        AbstractC9979u.m20293f(recyclerView, "recyclerView");
        return recyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public final SwipeRefreshLayout m5841z() {
        SwipeRefreshLayout refreshLayout = ((FragmentFileListBinding) getMBinding()).f6376e;
        AbstractC9979u.m20293f(refreshLayout, "refreshLayout");
        return refreshLayout;
    }
}
