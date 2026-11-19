package com.friday.document.view.document;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.FromPage;
import com.friday.common.entity.UpdateSpecifiedItem;
import com.friday.common.helper.C5963c;
import com.friday.document.R$color;
import com.friday.document.R$dimen;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import com.friday.document.R$string;
import com.friday.document.adapter.AbstractC5985a;
import com.friday.document.adapter.DocumentAdapter;
import com.friday.document.databinding.DocumentFragmentBinding;
import com.friday.document.view.ManualSyncFileDialog;
import com.friday.document.view.NewestPreviewFragment;
import com.friday.document.view.document.NewestFragment;
import com.friday.document.viewmodel.BaseFileViewModel;
import com.friday.document.viewmodel.NewestViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p200j2.InterfaceC9663c;
import p215k2.AbstractC9804v;
import p294pb.DialogC10643d;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10980x;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11607p;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class NewestFragment extends Hilt_NewestFragment<NewestViewModel, DocumentAdapter, DocumentFragmentBinding> implements InterfaceC9663c {

    /* renamed from: com.friday.document.view.document.NewestFragment$a */
    public static final class C6042a implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f7390c;

        public C6042a(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f7390c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f7390c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7390c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.NewestFragment$initDataSource$2", m26211f = "NewestFragment.kt", m26212l = {200}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.NewestFragment$initDataSource$2 */
    public static final class C60432 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7391c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.document.NewestFragment$initDataSource$2$1", m26211f = "NewestFragment.kt", m26212l = {201}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.document.NewestFragment$initDataSource$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7393c;

            /* renamed from: d */
            public /* synthetic */ Object f7394d;

            /* renamed from: e */
            public final /* synthetic */ NewestFragment f7395e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NewestFragment newestFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7395e = newestFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7395e, interfaceC11588c);
                anonymousClass1.f7394d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(PagingData pagingData, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(pagingData, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PagingData pagingData = (PagingData) this.f7394d;
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f7393c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    DocumentAdapter documentAdapter = (DocumentAdapter) this.f7395e.m5819D();
                    this.f7394d = AbstractC11833h.m26224a(pagingData);
                    this.f7393c = 1;
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

        public C60432(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewestFragment.this.new C60432(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7391c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594cM6318I0 = ((NewestViewModel) NewestFragment.this.m5820E()).m6318I0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NewestFragment.this, null);
                this.f7391c = 1;
                if (AbstractC11596e.m25559i(interfaceC11594cM6318I0, anonymousClass1, this) == objM25952f) {
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
            return ((C60432) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.NewestFragment$initDataSource$5", m26211f = "NewestFragment.kt", m26212l = {221}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.NewestFragment$initDataSource$5 */
    public static final class C60445 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7396c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.document.NewestFragment$initDataSource$5$1", m26211f = "NewestFragment.kt", m26212l = {Constants.SDK_VERSION_CODE}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.document.NewestFragment$initDataSource$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7398c;

            /* renamed from: d */
            public final /* synthetic */ NewestFragment f7399d;

            /* renamed from: com.friday.document.view.document.NewestFragment$initDataSource$5$1$a */
            public static final class a implements InterfaceC11595d {

                /* renamed from: c */
                public final /* synthetic */ NewestFragment f7400c;

                public a(NewestFragment newestFragment) {
                    this.f7400c = newestFragment;
                }

                @Override // p379vd.InterfaceC11595d
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(C10786q c10786q, InterfaceC11588c interfaceC11588c) {
                    LogUtils.m3886d("NewestFragment.kt -> Fragment监听到缓存清除信号，执行刷新");
                    this.f7400c.m5826y();
                    return C10786q.f26013a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NewestFragment newestFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7399d = newestFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7399d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f7398c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11607p interfaceC11607pM6220D = ((NewestViewModel) this.f7399d.m5820E()).m6220D();
                    a aVar = new a(this.f7399d);
                    this.f7398c = 1;
                    if (interfaceC11607pM6220D.collect(aVar, this) == objM25952f) {
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

        public C60445(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewestFragment.this.new C60445(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7396c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LifecycleOwner viewLifecycleOwner = NewestFragment.this.getViewLifecycleOwner();
                AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NewestFragment.this, null);
                this.f7396c = 1;
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
            return ((C60445) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.NewestFragment$onClick$1", m26211f = "NewestFragment.kt", m26212l = {239}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.NewestFragment$onClick$1 */
    public static final class C60451 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7402c;

        public C60451(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewestFragment.this.new C60451(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7402c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                if (!NetworkUtils.isConnected()) {
                    AbstractC11958b.m26588i("当前没有网络，请检查网络连接后再次尝试");
                    return C10786q.f26013a;
                }
                NewestViewModel newestViewModel = (NewestViewModel) NewestFragment.this.m5820E();
                this.f7402c = 1;
                obj = newestViewModel.m6219C(this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            if (((Number) obj).intValue() == 0) {
                AbstractC11958b.m26588i("当前没有需要手动同步的文件");
                return C10786q.f26013a;
            }
            ManualSyncFileDialog manualSyncFileDialog = new ManualSyncFileDialog();
            FragmentManager childFragmentManager = NewestFragment.this.getChildFragmentManager();
            AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
            manualSyncFileDialog.show(childFragmentManager, ManualSyncFileDialog.class.getSimpleName());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60451) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.NewestFragment$onClick$2", m26211f = "NewestFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.NewestFragment$onClick$2 */
    public static final class C60462 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7404c;

        public C60462(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewestFragment.this.new C60462(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f7404c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            List list = (List) ((NewestViewModel) NewestFragment.this.m5820E()).m6238V().getValue();
            C5963c c5963c = C5963c.f6084a;
            FragmentActivity fragmentActivityRequireActivity = NewestFragment.this.requireActivity();
            AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
            String parentId = ((FileEntity) AbstractC10947g0.m23944m0(list)).getParentId();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FileEntity) it.next()).getFileId());
            }
            C10786q c10786q = C10786q.f26013a;
            C5963c.m5300b(c5963c, fragmentActivityRequireActivity, parentId, null, false, null, false, false, arrayList, 124, null);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60462) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* renamed from: a0 */
    private final void m5897a0(final FileEntity fileEntity) {
        Context contextRequireContext = requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        new DialogC10643d(contextRequireContext, 0, 2, null).m22517g("即将删除该笔记文件，并从服务器重新获取。未成功同步到服务器的文件内容将无法找回", true, new InterfaceC9529a() { // from class: v2.g0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return NewestFragment.m5898b0(this.f27252c, fileEntity);
            }
        }, true);
    }

    /* renamed from: b0 */
    public static final C10786q m5898b0(NewestFragment newestFragment, FileEntity fileEntity) {
        ((NewestViewModel) newestFragment.m5820E()).m6317H0(fileEntity);
        return C10786q.f26013a;
    }

    /* renamed from: c0 */
    private final void m5899c0(final List list) {
        Context contextRequireContext = requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        new DialogC10643d(contextRequireContext, 0, 2, null).m22517g("内容将被删除，可在回收站中恢复", true, new InterfaceC9529a() { // from class: v2.f0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return NewestFragment.m5900d0(this.f27247c, list);
            }
        }, true);
    }

    /* renamed from: d0 */
    public static final C10786q m5900d0(NewestFragment newestFragment, List list) {
        ((NewestViewModel) newestFragment.m5820E()).m6256n0(list);
        return C10786q.f26013a;
    }

    /* renamed from: e0 */
    public static final void m5901e0(NewestFragment newestFragment, UpdateSpecifiedItem updateSpecifiedItem) {
        if (updateSpecifiedItem.getFromPage() == FromPage.FROM_NEWEST) {
            ((NewestViewModel) newestFragment.m5820E()).m6262s0(updateSpecifiedItem.getFileId());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p309qc.C10786q m5902f0(com.friday.document.view.document.NewestFragment r3, com.friday.common.entity.FileEntity r4) {
        /*
            if (r4 != 0) goto L5
            qc.q r3 = p309qc.C10786q.f26013a
            return r3
        L5:
            java.lang.String r0 = r4.getFileType()
            int r1 = r0.hashCode()
            r2 = 49
            if (r1 == r2) goto L30
            r2 = 54
            if (r1 == r2) goto L23
            r2 = 1569(0x621, float:2.199E-42)
            if (r1 == r2) goto L1a
            goto L3c
        L1a:
            java.lang.String r1 = "12"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39
            goto L3c
        L23:
            java.lang.String r1 = "6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            goto L3c
        L2c:
            r3.m5817A(r4)
            goto L3c
        L30:
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39
            goto L3c
        L39:
            r3.m5827z(r4)
        L3c:
            androidx.databinding.ViewDataBinding r0 = r3.getMBinding()
            com.friday.document.databinding.DocumentFragmentBinding r0 = (com.friday.document.databinding.DocumentFragmentBinding) r0
            com.friday.document.databinding.LayoutFileBrowserBinding r0 = r0.f6359d
            androidx.recyclerview.widget.RecyclerView r0 = r0.f6538i
            java.lang.String r1 = "recyclerView"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r0, r1)
            java.lang.String r4 = r4.getFileId()
            r3.m5823N(r0, r4)
            qc.q r3 = p309qc.C10786q.f26013a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.document.NewestFragment.m5902f0(com.friday.document.view.document.NewestFragment, com.friday.common.entity.FileEntity):qc.q"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/document/NewestFragment.smali:371
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g0 */
    public static final C10786q m5903g0(NewestFragment newestFragment, Boolean bool) {
        newestFragment.isShowLoading(false);
        SwipeRefreshLayout swipeRefreshLayout = ((DocumentFragmentBinding) newestFragment.getMBinding()).f6359d.f6539j;
        swipeRefreshLayout.setRefreshing(false);
        swipeRefreshLayout.setEnabled(true);
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p309qc.C10786q m5904i0(com.friday.document.view.document.NewestFragment r3, androidx.paging.CombinedLoadStates r4) {
        /*
            java.lang.String r0 = "loadState"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r4, r0)
            androidx.databinding.ViewDataBinding r0 = r3.getMBinding()
            com.friday.document.databinding.DocumentFragmentBinding r0 = (com.friday.document.databinding.DocumentFragmentBinding) r0
            com.friday.document.databinding.LayoutFileBrowserBinding r0 = r0.f6359d
            android.widget.TextView r0 = r0.f6532c
            java.lang.String r1 = "emptyView"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r0, r1)
            androidx.paging.LoadStates r1 = r4.getSource()
            androidx.paging.LoadState r1 = r1.getRefresh()
            boolean r1 = r1 instanceof androidx.paging.LoadState.NotLoading
            r2 = 0
            if (r1 == 0) goto L39
            androidx.paging.LoadState r4 = r4.getAppend()
            boolean r4 = r4.getEndOfPaginationReached()
            if (r4 == 0) goto L39
            androidx.paging.PagingDataAdapter r3 = r3.m5819D()
            com.friday.document.adapter.DocumentAdapter r3 = (com.friday.document.adapter.DocumentAdapter) r3
            int r3 = r3.getItemCount()
            r4 = 1
            if (r3 >= r4) goto L39
            goto L3a
        L39:
            r4 = r2
        L3a:
            if (r4 == 0) goto L3d
            goto L3f
        L3d:
            r2 = 8
        L3f:
            r0.setVisibility(r2)
            qc.q r3 = p309qc.C10786q.f26013a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.document.NewestFragment.m5904i0(com.friday.document.view.document.NewestFragment, androidx.paging.CombinedLoadStates):qc.q"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/document/NewestFragment.smali:607
    }

    /* renamed from: j0 */
    public static final C10786q m5905j0(NewestFragment newestFragment, AbstractC5985a option, FileEntity fileEntity) {
        AbstractC9979u.m20294g(option, "option");
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        if (AbstractC9979u.m20289b(option, AbstractC5985a.d.f6275b)) {
            newestFragment.m5818B(fileEntity.getFileId(), fileEntity.getFileType(), fileEntity.getFileName());
        } else if (AbstractC9979u.m20289b(option, AbstractC5985a.c.f6274b)) {
            if (NetworkUtils.isConnected()) {
                C5963c c5963c = C5963c.f6084a;
                FragmentActivity fragmentActivityRequireActivity = newestFragment.requireActivity();
                AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
                C5963c.m5300b(c5963c, fragmentActivityRequireActivity, fileEntity.getParentId(), fileEntity.getFileId(), false, null, false, false, null, 248, null);
            } else {
                AbstractC11958b.m26588i("当前没有网络，请检查网络连接后再次尝试");
            }
        } else if (AbstractC9979u.m20289b(option, AbstractC5985a.b.f6273b)) {
            if (fileEntity.getState() != 0) {
                AbstractC11958b.m26588i("请等待笔记同步完成后再删除");
            } else {
                newestFragment.m5899c0(AbstractC10976v.m24126e(fileEntity.getFileId()));
            }
        } else if (AbstractC9979u.m20289b(option, AbstractC5985a.f.f6277b)) {
            newestFragment.m5897a0(fileEntity);
        } else if (AbstractC9979u.m20289b(option, AbstractC5985a.a.f6272b)) {
            if (AbstractC9979u.m20289b(((NewestViewModel) newestFragment.m5820E()).m6250h0().getValue(), Boolean.TRUE)) {
                ((NewestViewModel) newestFragment.m5820E()).m6275z0(fileEntity);
            } else {
                ((NewestViewModel) newestFragment.m5820E()).m6264t0(fileEntity);
            }
        } else {
            if (!AbstractC9979u.m20289b(option, AbstractC5985a.e.f6276b)) {
                throw new NoWhenBranchMatchedException();
            }
            LogUtils.m3886d("NewestFragment.kt->  DocumentOption.SyncRetry，单个同步文件");
            ((NewestViewModel) newestFragment.m5820E()).m6319J0(fileEntity);
        }
        return C10786q.f26013a;
    }

    /* renamed from: k0 */
    public static final C10786q m5906k0(NewestFragment newestFragment, FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        ((NewestViewModel) newestFragment.m5820E()).m6270w0(true, fileEntity);
        return C10786q.f26013a;
    }

    /* renamed from: l0 */
    public static final void m5907l0(NewestFragment newestFragment, SwipeRefreshLayout swipeRefreshLayout) {
        newestFragment.m5826y();
        if (swipeRefreshLayout.isRefreshing()) {
            swipeRefreshLayout.setEnabled(false);
        }
        ((NewestViewModel) newestFragment.m5820E()).m6217A0();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.document_fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h0 */
    public final void m5908h0() {
        final RecyclerView recyclerView = ((DocumentFragmentBinding) getMBinding()).f6359d.f6538i;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.friday.document.view.document.NewestFragment$initRecyclerView$1$1
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
        recyclerView.setAdapter(m5819D());
        ((DocumentAdapter) m5819D()).addLoadStateListener(new InterfaceC9540l() { // from class: v2.c0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewestFragment.m5904i0(this.f27241c, (CombinedLoadStates) obj);
            }
        });
        ((DocumentAdapter) m5819D()).m5455q(new InterfaceC9544p() { // from class: v2.d0
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return NewestFragment.m5905j0(this.f27243c, (AbstractC5985a) obj, (FileEntity) obj2);
            }
        });
        ((DocumentAdapter) m5819D()).m5456r(new InterfaceC9540l() { // from class: v2.e0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewestFragment.m5906k0(this.f27245c, (FileEntity) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
        m5825P((BaseFileViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(NewestViewModel.class));
        m5824O(new DocumentAdapter());
        m5821F();
        m5908h0();
        initView();
        initDataSource();
        ((DocumentFragmentBinding) getMBinding()).f6359d.f6534e.setVisibility(8);
        ((DocumentFragmentBinding) getMBinding()).f6359d.f6542m.setText(getString(R$string.newest));
        LogUtils.m3886d("NewestFragment开始执行自动同步逻辑------------");
        ((NewestViewModel) m5820E()).m6230N().m5600E();
        isShowLoading(true);
        ((NewestViewModel) m5820E()).m6217A0();
    }

    @Override // com.friday.common.base.BaseFragment
    public void initDataSource() {
        super.initDataSource();
        ((NewestViewModel) m5820E()).m6222F().observe(getViewLifecycleOwner(), new C6042a(new InterfaceC9540l() { // from class: v2.y
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewestFragment.m5902f0(this.f27282c, (FileEntity) obj);
            }
        }));
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60432(null), 3, null);
        ((NewestViewModel) m5820E()).m6252j0().observe(getViewLifecycleOwner(), new C6042a(new InterfaceC9540l() { // from class: v2.z
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return NewestFragment.m5903g0(this.f27283c, (Boolean) obj);
            }
        }));
        LiveEventBus.get("UpdateSelectedNote", UpdateSpecifiedItem.class).observe(this, new Observer() { // from class: v2.a0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NewestFragment.m5901e0(this.f27236c, (UpdateSpecifiedItem) obj);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C60445(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment
    public void initView() {
        super.initView();
        ((DocumentFragmentBinding) getMBinding()).setLifecycleOwner(getViewLifecycleOwner());
        ((DocumentFragmentBinding) getMBinding()).mo5514a(((NewestViewModel) m5820E()).m6250h0());
        ((DocumentFragmentBinding) getMBinding()).mo5515c(((NewestViewModel) m5820E()).m6251i0());
        m5822M();
        getChildFragmentManager().beginTransaction().add(R$id.fragment_preview, new NewestPreviewFragment()).commitAllowingStateLoss();
        final SwipeRefreshLayout swipeRefreshLayout = ((DocumentFragmentBinding) getMBinding()).f6359d.f6539j;
        swipeRefreshLayout.setColorSchemeColors(AbstractC11958b.m26580a(R$color.colorAccent));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: v2.b0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                NewestFragment.m5907l0(this.f27238a, swipeRefreshLayout);
            }
        });
        AppCompatImageView ivSearch = ((DocumentFragmentBinding) getMBinding()).f6359d.f6535f;
        AbstractC9979u.m20293f(ivSearch, "ivSearch");
        AppCompatImageView ivMore = ((DocumentFragmentBinding) getMBinding()).f6359d.f6534e;
        AbstractC9979u.m20293f(ivMore, "ivMore");
        AppCompatImageView ivSync = ((DocumentFragmentBinding) getMBinding()).f6359d.f6536g;
        AbstractC9979u.m20293f(ivSync, "ivSync");
        setClickListener(ivSearch, ivMore, ivSync);
        AppCompatTextView tvMove = ((DocumentFragmentBinding) getMBinding()).f6359d.f6543n;
        AbstractC9979u.m20293f(tvMove, "tvMove");
        AppCompatTextView tvDelete = ((DocumentFragmentBinding) getMBinding()).f6359d.f6541l;
        AbstractC9979u.m20293f(tvDelete, "tvDelete");
        AppCompatTextView tvCancel = ((DocumentFragmentBinding) getMBinding()).f6359d.f6540k;
        AbstractC9979u.m20293f(tvCancel, "tvCancel");
        setClickListener(tvMove, tvDelete, tvCancel);
    }

    @Override // p200j2.InterfaceC9663c
    /* renamed from: j */
    public void mo5876j() {
        BaseFileViewModel.m6215x0(m5820E(), false, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment, com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC9979u.m20294g(view, "view");
        super.onClick(view);
        if (AbstractC9979u.m20289b(view, ((DocumentFragmentBinding) getMBinding()).f6359d.f6536g)) {
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60451(null), 3, null);
            return;
        }
        if (AbstractC9979u.m20289b(view, ((DocumentFragmentBinding) getMBinding()).f6359d.f6535f)) {
            AbstractC9804v.f23002a.m19815a("Search");
            C5963c.f6084a.m5315n();
            return;
        }
        if (AbstractC9979u.m20289b(view, ((DocumentFragmentBinding) getMBinding()).f6359d.f6543n)) {
            if (!NetworkUtils.isConnected()) {
                AbstractC11958b.m26588i("当前没有网络，请检查网络连接后再次尝试");
                return;
            }
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C60462(null), 3, null);
            return;
        }
        if (!AbstractC9979u.m20289b(view, ((DocumentFragmentBinding) getMBinding()).f6359d.f6541l)) {
            if (AbstractC9979u.m20289b(view, ((DocumentFragmentBinding) getMBinding()).f6359d.f6540k)) {
                mo5876j();
                return;
            }
            return;
        }
        List list = (List) ((NewestViewModel) m5820E()).m6238V().getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((FileEntity) it.next()).getState() != 0) {
                    AbstractC11958b.m26588i("存在未同步的笔记，请等待笔记同步完成后再删除");
                    return;
                }
            }
        }
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((FileEntity) it2.next()).getFileId());
        }
        m5899c0(arrayList);
    }

    @Override // com.friday.common.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((NewestViewModel) m5820E()).m6316G0();
    }
}
