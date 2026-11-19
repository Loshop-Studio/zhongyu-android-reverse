package com.friday.document.view.document;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.FromPage;
import com.friday.common.entity.UpdateSpecifiedItem;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import com.friday.document.R$string;
import com.friday.document.adapter.AbstractC5985a;
import com.friday.document.adapter.DocumentAdapter;
import com.friday.document.databinding.FolderFragmentBinding;
import com.friday.document.databinding.PopSortBinding;
import com.friday.document.model.FolderLevelEntity;
import com.friday.document.view.FolderPreviewFragment;
import com.friday.document.view.ManualSyncFileDialog;
import com.friday.document.view.document.FolderFragment;
import com.friday.document.viewmodel.BaseFileViewModel;
import com.friday.document.viewmodel.FolderViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p200j2.InterfaceC9666f;
import p215k2.AbstractC9804v;
import p244m2.C10193a;
import p244m2.C10193a.a;
import p294pb.DialogC10643d;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10980x;
import p370v2.InterfaceC11453x;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11607p;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FolderFragment extends Hilt_FolderFragment<FolderViewModel, DocumentAdapter, FolderFragmentBinding> implements InterfaceC9666f, InterfaceC11453x {

    /* renamed from: k */
    public final Stack f7334k = new Stack();

    /* renamed from: com.friday.document.view.document.FolderFragment$a */
    public static final class C6034a implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f7335c;

        public C6034a(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f7335c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f7335c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7335c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$initObserver$5", m26211f = "FolderFragment.kt", m26212l = {251}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.FolderFragment$initObserver$5 */
    public static final class C60355 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7339c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$initObserver$5$1", m26211f = "FolderFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.document.FolderFragment$initObserver$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7341c;

            /* renamed from: d */
            public /* synthetic */ Object f7342d;

            /* renamed from: e */
            public final /* synthetic */ FolderFragment f7343e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FolderFragment folderFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7343e = folderFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7343e, interfaceC11588c);
                anonymousClass1.f7342d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(str, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                String str = (String) this.f7342d;
                AbstractC11725a.m25952f();
                if (this.f7341c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                Stack stack = this.f7343e.f7334k;
                FolderFragment folderFragment = this.f7343e;
                stack.push(new FileListFragment(folderFragment, (FolderViewModel) folderFragment.m5820E(), str));
                this.f7343e.getChildFragmentManager().beginTransaction().add(R$id.fragment_list, this.f7343e.m5878l0()).show(this.f7343e.m5878l0()).commitAllowingStateLoss();
                return C10786q.f26013a;
            }
        }

        public C60355(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FolderFragment.this.new C60355(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7339c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11607p interfaceC11607pM6227K = ((FolderViewModel) FolderFragment.this.m5820E()).m6227K();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FolderFragment.this, null);
                this.f7339c = 1;
                if (AbstractC11596e.m25559i(interfaceC11607pM6227K, anonymousClass1, this) == objM25952f) {
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
            return ((C60355) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$initObserver$6", m26211f = "FolderFragment.kt", m26212l = {268}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.FolderFragment$initObserver$6 */
    public static final class C60366 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7344c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$initObserver$6$1", m26211f = "FolderFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.document.FolderFragment$initObserver$6$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7346c;

            /* renamed from: d */
            public /* synthetic */ Object f7347d;

            /* renamed from: e */
            public final /* synthetic */ FolderFragment f7348e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FolderFragment folderFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7348e = folderFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7348e, interfaceC11588c);
                anonymousClass1.f7347d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(str, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                String str = (String) this.f7347d;
                AbstractC11725a.m25952f();
                if (this.f7346c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                FragmentTransaction fragmentTransactionBeginTransaction = this.f7348e.getChildFragmentManager().beginTransaction();
                AbstractC9979u.m20293f(fragmentTransactionBeginTransaction, "beginTransaction(...)");
                while (!AbstractC9979u.m20289b(this.f7348e.m5878l0().m5839x(), str)) {
                    if (this.f7348e.f7334k.empty()) {
                        return C10786q.f26013a;
                    }
                    fragmentTransactionBeginTransaction.remove((Fragment) this.f7348e.f7334k.pop());
                }
                fragmentTransactionBeginTransaction.show(this.f7348e.m5878l0()).commitAllowingStateLoss();
                return C10786q.f26013a;
            }
        }

        public C60366(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FolderFragment.this.new C60366(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7344c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11607p interfaceC11607pM6228L = ((FolderViewModel) FolderFragment.this.m5820E()).m6228L();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FolderFragment.this, null);
                this.f7344c = 1;
                if (AbstractC11596e.m25559i(interfaceC11607pM6228L, anonymousClass1, this) == objM25952f) {
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
            return ((C60366) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$initObserver$8", m26211f = "FolderFragment.kt", m26212l = {287}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.FolderFragment$initObserver$8 */
    public static final class C60378 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7349c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$initObserver$8$1", m26211f = "FolderFragment.kt", m26212l = {288}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.document.FolderFragment$initObserver$8$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7351c;

            /* renamed from: d */
            public final /* synthetic */ FolderFragment f7352d;

            /* renamed from: com.friday.document.view.document.FolderFragment$initObserver$8$1$a */
            public static final class a implements InterfaceC11595d {

                /* renamed from: c */
                public final /* synthetic */ FolderFragment f7353c;

                public a(FolderFragment folderFragment) {
                    this.f7353c = folderFragment;
                }

                @Override // p379vd.InterfaceC11595d
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(C10786q c10786q, InterfaceC11588c interfaceC11588c) {
                    LogUtils.m3886d("FolderFragment.kt -> Fragment监听到缓存清除信号，执行刷新");
                    this.f7353c.m5826y();
                    return C10786q.f26013a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FolderFragment folderFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7352d = folderFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7352d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f7351c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11607p interfaceC11607pM6220D = ((FolderViewModel) this.f7352d.m5820E()).m6220D();
                    a aVar = new a(this.f7352d);
                    this.f7351c = 1;
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

        public C60378(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FolderFragment.this.new C60378(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7349c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LifecycleOwner viewLifecycleOwner = FolderFragment.this.getViewLifecycleOwner();
                AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FolderFragment.this, null);
                this.f7349c = 1;
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
            return ((C60378) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$onClick$1", m26211f = "FolderFragment.kt", m26212l = {TypedValues.AttributesType.TYPE_PATH_ROTATE}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.FolderFragment$onClick$1 */
    public static final class C60381 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7354c;

        public C60381(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FolderFragment.this.new C60381(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7354c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                if (!NetworkUtils.isConnected()) {
                    AbstractC11958b.m26588i("当前没有网络，请检查网络连接后再次尝试");
                    return C10786q.f26013a;
                }
                FolderViewModel folderViewModel = (FolderViewModel) FolderFragment.this.m5820E();
                this.f7354c = 1;
                obj = folderViewModel.m6219C(this);
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
            FragmentManager childFragmentManager = FolderFragment.this.getChildFragmentManager();
            AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
            manualSyncFileDialog.show(childFragmentManager, ManualSyncFileDialog.class.getSimpleName());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60381) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$onClick$2", m26211f = "FolderFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.FolderFragment$onClick$2 */
    public static final class C60392 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7356c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$onClick$2$1", m26211f = "FolderFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.document.FolderFragment$onClick$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7358c;

            /* renamed from: d */
            public final /* synthetic */ FolderFragment f7359d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FolderFragment folderFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7359d = folderFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7359d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f7358c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                List list = (List) ((FolderViewModel) this.f7359d.m5820E()).m6238V().getValue();
                C5963c c5963c = C5963c.f6084a;
                FragmentActivity fragmentActivityRequireActivity = this.f7359d.requireActivity();
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
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C60392(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FolderFragment.this.new C60392(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f7356c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            if (NetworkUtils.isConnected()) {
                LifecycleOwner viewLifecycleOwner = FolderFragment.this.getViewLifecycleOwner();
                AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AnonymousClass1(FolderFragment.this, null), 3, null);
            } else {
                AbstractC11958b.m26588i("当前没有网络，请检查网络连接后再次尝试");
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60392) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.FolderFragment$onResume$1", m26211f = "FolderFragment.kt", m26212l = {434}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.FolderFragment$onResume$1 */
    public static final class C60411 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7368c;

        public C60411(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return FolderFragment.this.new C60411(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7368c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                FolderViewModel folderViewModel = (FolderViewModel) FolderFragment.this.m5820E();
                this.f7368c = 1;
                obj = folderViewModel.m6267v(this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                FolderFragment.this.mo5872f();
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60411) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* renamed from: h0 */
    public static final C10786q m5858h0(FolderFragment folderFragment, FileEntity fileEntity) {
        ((FolderViewModel) folderFragment.m5820E()).m6288H0(fileEntity);
        return C10786q.f26013a;
    }

    private final void initObserver() {
        ((FolderViewModel) m5820E()).m6222F().observe(getViewLifecycleOwner(), new C6034a(new InterfaceC9540l() { // from class: v2.o
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FolderFragment.m5860m0(this.f27269c, (FileEntity) obj);
            }
        }));
        ((FolderViewModel) m5820E()).m6252j0().observe(getViewLifecycleOwner(), new C6034a(new InterfaceC9540l() { // from class: v2.p
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FolderFragment.m5861n0(this.f27271c, (Boolean) obj);
            }
        }));
        LiveEventBus.get("SearchToDetailPath", FileEntity.class).observe(getViewLifecycleOwner(), new Observer() { // from class: v2.q
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FolderFragment.m5862o0(this.f27272c, (FileEntity) obj);
            }
        });
        LiveEventBus.get("UpdateSelectedNote", UpdateSpecifiedItem.class).observe(this, new Observer() { // from class: v2.r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FolderFragment.m5863p0(this.f27273c, (UpdateSpecifiedItem) obj);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C60355(null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C60366(null), 3, null);
        ((FolderViewModel) m5820E()).m6221E().observe(getViewLifecycleOwner(), new C6034a(new InterfaceC9540l() { // from class: v2.s
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return FolderFragment.m5864q0(this.f27274c, (FolderLevelEntity) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new C60378(null), 3, null);
    }

    /* renamed from: k0 */
    public static final C10786q m5859k0(FolderFragment folderFragment, List list) {
        ((FolderViewModel) folderFragment.m5820E()).m6256n0(list);
        return C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p309qc.C10786q m5860m0(com.friday.document.view.document.FolderFragment r3, com.friday.common.entity.FileEntity r4) {
        /*
            if (r4 != 0) goto L5
            qc.q r3 = p309qc.C10786q.f26013a
            return r3
        L5:
            java.lang.String r0 = r4.getFileType()
            int r1 = r0.hashCode()
            r2 = 48
            if (r1 == r2) goto L6b
            r2 = 49
            if (r1 == r2) goto L49
            r2 = 54
            if (r1 == r2) goto L27
            r2 = 1569(0x621, float:2.199E-42)
            if (r1 == r2) goto L1e
            goto L77
        L1e:
            java.lang.String r1 = "12"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L52
            goto L77
        L27:
            java.lang.String r1 = "6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L77
        L30:
            r3.m5817A(r4)
            com.friday.document.view.document.FileListFragment r0 = r3.m5878l0()
            boolean r1 = r0.isResumed()
            if (r1 == 0) goto L77
            androidx.recyclerview.widget.RecyclerView r0 = r0.m5840y()
            java.lang.String r4 = r4.getFileId()
            r3.m5823N(r0, r4)
            goto L77
        L49:
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L52
            goto L77
        L52:
            r3.m5827z(r4)
            com.friday.document.view.document.FileListFragment r0 = r3.m5878l0()
            boolean r1 = r0.isResumed()
            if (r1 == 0) goto L77
            androidx.recyclerview.widget.RecyclerView r0 = r0.m5840y()
            java.lang.String r4 = r4.getFileId()
            r3.m5823N(r0, r4)
            goto L77
        L6b:
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L74
            goto L77
        L74:
            r3.m5875i0(r4)
        L77:
            qc.q r3 = p309qc.C10786q.f26013a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.document.FolderFragment.m5860m0(com.friday.document.view.document.FolderFragment, com.friday.common.entity.FileEntity):qc.q"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/document/FolderFragment.smali:639
    }

    /* renamed from: n0 */
    public static final C10786q m5861n0(FolderFragment folderFragment, Boolean bool) {
        folderFragment.isShowLoading(false);
        folderFragment.m5879u0();
        SwipeRefreshLayout swipeRefreshLayoutM5841z = folderFragment.m5878l0().m5841z();
        swipeRefreshLayoutM5841z.setRefreshing(false);
        swipeRefreshLayoutM5841z.setEnabled(true);
        return C10786q.f26013a;
    }

    /* renamed from: o0 */
    public static final void m5862o0(FolderFragment folderFragment, FileEntity fileEntity) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(folderFragment), null, null, new FolderFragment$initObserver$3$1(fileEntity, folderFragment, null), 3, null);
    }

    /* renamed from: p0 */
    public static final void m5863p0(FolderFragment folderFragment, UpdateSpecifiedItem updateSpecifiedItem) {
        if (updateSpecifiedItem.getFromPage() == FromPage.FROM_FOLDER) {
            ((FolderViewModel) folderFragment.m5820E()).m6262s0(updateSpecifiedItem.getFileId());
        }
    }

    /* renamed from: q0 */
    public static final C10786q m5864q0(FolderFragment folderFragment, FolderLevelEntity folderLevelEntity) {
        folderFragment.m5879u0();
        return C10786q.f26013a;
    }

    /* renamed from: r0 */
    public static final void m5865r0(FolderFragment folderFragment, View view) {
        ((FolderViewModel) folderFragment.m5820E()).m6259q0();
    }

    /* renamed from: s0 */
    public static final C10786q m5866s0(final FolderFragment folderFragment, View view, final PopupWindow popupWindow, final PopSortBinding binding) {
        AbstractC9979u.m20294g(view, "<unused var>");
        AbstractC9979u.m20294g(popupWindow, "popupWindow");
        AbstractC9979u.m20294g(binding, "binding");
        RadioGroup radioGroup = binding.f6607e;
        radioGroup.check(C5962b.f6082a.m5299a().m5282j() == 0 ? binding.f6605c.getId() : binding.f6606d.getId());
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: v2.u
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i10) {
                FolderFragment.m5867t0(this.f27277a, popupWindow, binding, radioGroup2, i10);
            }
        });
        return C10786q.f26013a;
    }

    /* renamed from: t0 */
    public static final void m5867t0(FolderFragment folderFragment, PopupWindow popupWindow, PopSortBinding popSortBinding, RadioGroup radioGroup, int i10) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(folderFragment), null, null, new FolderFragment$onClick$batchWindow$1$1$1$1(folderFragment, popupWindow, i10, popSortBinding, null), 3, null);
    }

    @Override // p200j2.InterfaceC9666f
    /* renamed from: a */
    public Object mo5868a(InterfaceC11588c interfaceC11588c) {
        return ((FolderViewModel) m5820E()).m6290J0(interfaceC11588c);
    }

    @Override // p370v2.InterfaceC11453x
    /* renamed from: b */
    public void mo5869b(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        ((FolderViewModel) m5820E()).m6270w0(true, fileEntity);
    }

    @Override // p370v2.InterfaceC11453x
    /* renamed from: c */
    public void mo5870c() {
        m5826y();
    }

    @Override // p370v2.InterfaceC11453x
    /* renamed from: e */
    public void mo5871e(AbstractC5985a option, FileEntity fileEntity) {
        AbstractC9979u.m20294g(option, "option");
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        if (AbstractC9979u.m20289b(option, AbstractC5985a.d.f6275b)) {
            m5818B(fileEntity.getFileId(), fileEntity.getFileType(), fileEntity.getFileName());
            return;
        }
        if (AbstractC9979u.m20289b(option, AbstractC5985a.c.f6274b)) {
            if (!NetworkUtils.isConnected()) {
                AbstractC11958b.m26588i("当前没有网络，请检查网络连接后再次尝试");
                return;
            }
            C5963c c5963c = C5963c.f6084a;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
            C5963c.m5300b(c5963c, fragmentActivityRequireActivity, fileEntity.getParentId(), fileEntity.getFileId(), false, null, false, false, null, 248, null);
            return;
        }
        if (AbstractC9979u.m20289b(option, AbstractC5985a.b.f6273b)) {
            if (fileEntity.getState() != 0) {
                AbstractC11958b.m26588i("请等待笔记同步完成后再删除");
                return;
            } else {
                m5877j0(AbstractC10976v.m24126e(fileEntity.getFileId()));
                return;
            }
        }
        if (AbstractC9979u.m20289b(option, AbstractC5985a.f.f6277b)) {
            m5874g0(fileEntity);
            return;
        }
        if (AbstractC9979u.m20289b(option, AbstractC5985a.e.f6276b)) {
            ((FolderViewModel) m5820E()).m6295O0(fileEntity);
        } else {
            if (!AbstractC9979u.m20289b(option, AbstractC5985a.a.f6272b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (AbstractC9979u.m20289b(((FolderViewModel) m5820E()).m6250h0().getValue(), Boolean.TRUE)) {
                ((FolderViewModel) m5820E()).m6275z0(fileEntity);
            } else {
                ((FolderViewModel) m5820E()).m6264t0(fileEntity);
            }
        }
    }

    @Override // p200j2.InterfaceC9666f
    /* renamed from: f */
    public void mo5872f() {
        ((FolderViewModel) m5820E()).m6273y0();
        m5826y();
    }

    /* renamed from: f0 */
    public final void m5873f0(FileEntity fileEntity) {
        ((FolderViewModel) m5820E()).m6261s(fileEntity);
    }

    /* renamed from: g0 */
    public final void m5874g0(final FileEntity fileEntity) {
        Context contextRequireContext = requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        new DialogC10643d(contextRequireContext, 0, 2, null).m22517g("即将删除该笔记文件，并从服务器重新获取。未成功同步到服务器的文件内容将无法找回。", true, new InterfaceC9529a() { // from class: v2.v
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return FolderFragment.m5858h0(this.f27280c, fileEntity);
            }
        }, true);
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.folder_fragment;
    }

    /* renamed from: i0 */
    public final void m5875i0(FileEntity fileEntity) {
        m5873f0(fileEntity);
        m5826y();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
        m5825P((BaseFileViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(FolderViewModel.class));
        this.f7334k.push(new FileListFragment(this, (FolderViewModel) m5820E(), "0"));
        m5821F();
        initView();
        initObserver();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment
    public void initView() {
        super.initView();
        ((FolderFragmentBinding) getMBinding()).setLifecycleOwner(getViewLifecycleOwner());
        ((FolderFragmentBinding) getMBinding()).mo5519a(((FolderViewModel) m5820E()).m6250h0());
        ((FolderFragmentBinding) getMBinding()).mo5520c(((FolderViewModel) m5820E()).m6251i0());
        getChildFragmentManager().beginTransaction().add(R$id.fragment_list, m5878l0()).commitAllowingStateLoss();
        getChildFragmentManager().beginTransaction().add(R$id.fragment_preview, new FolderPreviewFragment()).commitAllowingStateLoss();
        ClickUtils.applySingleDebouncing(((FolderFragmentBinding) getMBinding()).f6367d.f6552d, 500L, new View.OnClickListener() { // from class: v2.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FolderFragment.m5865r0(this.f27267c, view);
            }
        });
        AppCompatImageView ivSearch = ((FolderFragmentBinding) getMBinding()).f6367d.f6554f;
        AbstractC9979u.m20293f(ivSearch, "ivSearch");
        AppCompatImageView ivMore = ((FolderFragmentBinding) getMBinding()).f6367d.f6553e;
        AbstractC9979u.m20293f(ivMore, "ivMore");
        AppCompatImageView ivSync = ((FolderFragmentBinding) getMBinding()).f6367d.f6555g;
        AbstractC9979u.m20293f(ivSync, "ivSync");
        setClickListener(ivSearch, ivMore, ivSync);
        AppCompatTextView tvMove = ((FolderFragmentBinding) getMBinding()).f6367d.f6560l;
        AbstractC9979u.m20293f(tvMove, "tvMove");
        AppCompatTextView tvDelete = ((FolderFragmentBinding) getMBinding()).f6367d.f6558j;
        AbstractC9979u.m20293f(tvDelete, "tvDelete");
        AppCompatTextView tvCancel = ((FolderFragmentBinding) getMBinding()).f6367d.f6557i;
        AbstractC9979u.m20293f(tvCancel, "tvCancel");
        setClickListener(tvMove, tvDelete, tvCancel);
    }

    @Override // p200j2.InterfaceC9663c
    /* renamed from: j */
    public void mo5876j() {
        BaseFileViewModel.m6215x0(m5820E(), false, null, 2, null);
    }

    /* renamed from: j0 */
    public final void m5877j0(final List list) {
        Context contextRequireContext = requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        new DialogC10643d(contextRequireContext, 0, 2, null).m22517g("内容将被删除，可在回收站中恢复", true, new InterfaceC9529a() { // from class: v2.t
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return FolderFragment.m5859k0(this.f27275c, list);
            }
        }, true);
    }

    /* renamed from: l0 */
    public final FileListFragment m5878l0() {
        Object objPeek = this.f7334k.peek();
        AbstractC9979u.m20293f(objPeek, "peek(...)");
        return (FileListFragment) objPeek;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment, com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC9979u.m20294g(view, "view");
        super.onClick(view);
        if (AbstractC9979u.m20289b(view, ((FolderFragmentBinding) getMBinding()).f6367d.f6555g)) {
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60381(null), 3, null);
            return;
        }
        if (AbstractC9979u.m20289b(view, ((FolderFragmentBinding) getMBinding()).f6367d.f6554f)) {
            AbstractC9804v.f23002a.m19815a("Search");
            C5963c.f6084a.m5315n();
            return;
        }
        if (AbstractC9979u.m20289b(view, ((FolderFragmentBinding) getMBinding()).f6367d.f6553e)) {
            Context contextRequireContext = requireContext();
            AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
            C10193a.a aVar = new C10193a(contextRequireContext).new a();
            PopSortBinding popSortBindingM5549a = PopSortBinding.m5549a(getLayoutInflater());
            AbstractC9979u.m20293f(popSortBindingM5549a, "inflate(...)");
            aVar.m21278b(popSortBindingM5549a).m21281e(-2, -2).m21280d(true).m21279c(new InterfaceC9545q() { // from class: v2.m
                @Override // p181hd.InterfaceC9545q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FolderFragment.m5866s0(this.f27264c, (View) obj, (PopupWindow) obj2, (PopSortBinding) obj3);
                }
            }).m21277a().showAsDropDown(view, 0, 0, 80);
            return;
        }
        if (AbstractC9979u.m20289b(view, ((FolderFragmentBinding) getMBinding()).f6367d.f6560l)) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C60392(null), 3, null);
            return;
        }
        if (!AbstractC9979u.m20289b(view, ((FolderFragmentBinding) getMBinding()).f6367d.f6558j)) {
            if (AbstractC9979u.m20289b(view, ((FolderFragmentBinding) getMBinding()).f6367d.f6557i)) {
                mo5876j();
                return;
            }
            return;
        }
        List list = (List) ((FolderViewModel) m5820E()).m6238V().getValue();
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
        m5877j0(arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60411(null), 3, null);
        m5879u0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u0 */
    public final void m5879u0() {
        if (((FolderViewModel) m5820E()).m6249g0()) {
            ((FolderFragmentBinding) getMBinding()).f6367d.f6552d.setVisibility(8);
            ((FolderFragmentBinding) getMBinding()).f6367d.f6559k.setText(getString(R$string.folder));
        } else {
            FolderLevelEntity folderLevelEntityM6258p0 = ((FolderViewModel) m5820E()).m6258p0();
            ((FolderFragmentBinding) getMBinding()).f6367d.f6552d.setVisibility(0);
            ((FolderFragmentBinding) getMBinding()).f6367d.f6559k.setText(folderLevelEntityM6258p0 != null ? folderLevelEntityM6258p0.getFileName() : null);
        }
    }

    /* renamed from: v0 */
    public final void m5880v0() {
        ((FolderViewModel) m5820E()).m6296P0();
    }
}
