package com.friday.document.view.document;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.fastjson.asm.Opcodes;
import com.blankj.utilcode.util.ToastUtils;
import com.friday.common.entity.FileEntity;
import com.friday.common.helper.C5963c;
import com.friday.common.widget.dialog.BaseDialog;
import com.friday.common.widget.dialog.C5975a;
import com.friday.document.R$color;
import com.friday.document.R$dimen;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import com.friday.document.adapter.AbstractC5987c;
import com.friday.document.adapter.MultiModeFileEntity;
import com.friday.document.adapter.RecycleBinAdapter;
import com.friday.document.databinding.FragmentRecycleBinBinding;
import com.friday.document.view.RecycleBinPreviewFragment;
import com.friday.document.view.document.RecycleBinFragment;
import com.friday.document.viewmodel.BaseFileViewModel;
import com.friday.document.viewmodel.RecycleBinViewModel;
import gb.AbstractC9286b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.InterfaceC9975q;
import p141f2.C9166c;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p200j2.InterfaceC9668h;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10980x;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
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
public final class RecycleBinFragment extends Hilt_RecycleBinFragment<RecycleBinViewModel, RecycleBinAdapter, FragmentRecycleBinBinding> implements InterfaceC9668h {

    /* renamed from: com.friday.document.view.document.RecycleBinFragment$a */
    public static final class C6047a implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f7406c;

        public C6047a(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f7406c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f7406c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7406c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.RecycleBinFragment$initObserver$1", m26211f = "RecycleBinFragment.kt", m26212l = {Opcodes.IF_ACMPEQ}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.RecycleBinFragment$initObserver$1 */
    public static final class C60481 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7407c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.document.RecycleBinFragment$initObserver$1$1", m26211f = "RecycleBinFragment.kt", m26212l = {Opcodes.IF_ACMPNE}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.document.RecycleBinFragment$initObserver$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7409c;

            /* renamed from: d */
            public /* synthetic */ Object f7410d;

            /* renamed from: e */
            public final /* synthetic */ RecycleBinFragment f7411e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RecycleBinFragment recycleBinFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7411e = recycleBinFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7411e, interfaceC11588c);
                anonymousClass1.f7410d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(PagingData pagingData, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(pagingData, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PagingData pagingData = (PagingData) this.f7410d;
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f7409c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    RecycleBinAdapter recycleBinAdapter = (RecycleBinAdapter) this.f7411e.m5819D();
                    this.f7410d = AbstractC11833h.m26224a(pagingData);
                    this.f7409c = 1;
                    if (recycleBinAdapter.submitData(pagingData, this) == objM25952f) {
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

        public C60481(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return RecycleBinFragment.this.new C60481(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7407c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594cM6336L0 = ((RecycleBinViewModel) RecycleBinFragment.this.m5820E()).m6336L0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RecycleBinFragment.this, null);
                this.f7407c = 1;
                if (AbstractC11596e.m25559i(interfaceC11594cM6336L0, anonymousClass1, this) == objM25952f) {
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
            return ((C60481) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.RecycleBinFragment$initObserver$2", m26211f = "RecycleBinFragment.kt", m26212l = {171}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.RecycleBinFragment$initObserver$2 */
    public static final class C60492 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7412c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.document.RecycleBinFragment$initObserver$2$1", m26211f = "RecycleBinFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.document.RecycleBinFragment$initObserver$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7414c;

            /* renamed from: d */
            public final /* synthetic */ RecycleBinFragment f7415d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RecycleBinFragment recycleBinFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7415d = recycleBinFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7415d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f7414c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                ((RecycleBinAdapter) this.f7415d.m5819D()).m5487o();
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C60492(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return RecycleBinFragment.this.new C60492(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7412c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                RecycleBinFragment recycleBinFragment = RecycleBinFragment.this;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(recycleBinFragment, null);
                this.f7412c = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(recycleBinFragment, state, anonymousClass1, this) == objM25952f) {
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
            return ((C60492) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.RecycleBinFragment$initObserver$3", m26211f = "RecycleBinFragment.kt", m26212l = {Opcodes.RETURN}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.RecycleBinFragment$initObserver$3 */
    public static final class C60503 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7416c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.document.RecycleBinFragment$initObserver$3$1", m26211f = "RecycleBinFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.document.RecycleBinFragment$initObserver$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7418c;

            /* renamed from: d */
            public /* synthetic */ boolean f7419d;

            /* renamed from: e */
            public final /* synthetic */ RecycleBinFragment f7420e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RecycleBinFragment recycleBinFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7420e = recycleBinFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7420e, interfaceC11588c);
                anonymousClass1.f7419d = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z10 = this.f7419d;
                AbstractC11725a.m25952f();
                if (this.f7418c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                this.f7420e.isShowLoading(z10);
                return C10786q.f26013a;
            }

            public final Object invoke(boolean z10, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C60503(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return RecycleBinFragment.this.new C60503(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7416c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11612u interfaceC11612uM6231O = ((RecycleBinViewModel) RecycleBinFragment.this.m5820E()).m6231O();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RecycleBinFragment.this, null);
                this.f7416c = 1;
                if (AbstractC11596e.m25559i(interfaceC11612uM6231O, anonymousClass1, this) == objM25952f) {
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
            return ((C60503) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.document.RecycleBinFragment$initObserver$4", m26211f = "RecycleBinFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.document.RecycleBinFragment$initObserver$4 */
    public static final class C60514 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7421c;

        public C60514(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        /* renamed from: m */
        public static final C10786q m5926m(RecycleBinFragment recycleBinFragment, Boolean bool) {
            recycleBinFragment.isShowLoading(false);
            SwipeRefreshLayout swipeRefreshLayout = RecycleBinFragment.m5917Y(recycleBinFragment).f6425i;
            swipeRefreshLayout.setRefreshing(false);
            swipeRefreshLayout.setEnabled(true);
            return C10786q.f26013a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return RecycleBinFragment.this.new C60514(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f7421c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            MutableLiveData mutableLiveDataM6252j0 = ((RecycleBinViewModel) RecycleBinFragment.this.m5820E()).m6252j0();
            LifecycleOwner viewLifecycleOwner = RecycleBinFragment.this.getViewLifecycleOwner();
            final RecycleBinFragment recycleBinFragment = RecycleBinFragment.this;
            mutableLiveDataM6252j0.observe(viewLifecycleOwner, new C6047a(new InterfaceC9540l() { // from class: com.friday.document.view.document.a
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return RecycleBinFragment.C60514.m5926m(recycleBinFragment, (Boolean) obj2);
                }
            }));
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60514) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Y */
    public static final /* synthetic */ FragmentRecycleBinBinding m5917Y(RecycleBinFragment recycleBinFragment) {
        return (FragmentRecycleBinBinding) recycleBinFragment.getMBinding();
    }

    /* renamed from: Z */
    public static final C10786q m5918Z(final RecycleBinFragment recycleBinFragment, AbstractC5987c option, final FileEntity fileEntity) {
        AbstractC9979u.m20294g(option, "option");
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        if (AbstractC9979u.m20289b(option, AbstractC5987c.c.f6285b)) {
            if (C9166c.f21406a.m18061e()) {
                C5963c c5963c = C5963c.f6084a;
                FragmentActivity fragmentActivityRequireActivity = recycleBinFragment.requireActivity();
                AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
                C5963c.m5300b(c5963c, fragmentActivityRequireActivity, "0", fileEntity.getFileId(), false, null, false, true, null, Opcodes.INVOKESTATIC, null);
            } else {
                ToastUtils.showShort("当前没有网络，请检查网络连接后再次尝试", new Object[0]);
            }
        } else if (AbstractC9979u.m20289b(option, AbstractC5987c.b.f6284b)) {
            if (C9166c.f21406a.m18061e()) {
                BaseDialog baseDialogM5437F = C5975a.f6196a.m5437F(new InterfaceC9529a() { // from class: v2.m0
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return RecycleBinFragment.m5919a0(this.f27265c, fileEntity);
                    }
                });
                FragmentManager childFragmentManager = recycleBinFragment.getChildFragmentManager();
                AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
                baseDialogM5437F.show(childFragmentManager, UUID.randomUUID().toString());
            } else {
                ToastUtils.showShort("当前没有网络，请检查网络连接后再次尝试", new Object[0]);
            }
        } else {
            if (!AbstractC9979u.m20289b(option, AbstractC5987c.a.f6283b)) {
                throw new NoWhenBranchMatchedException();
            }
            ((RecycleBinViewModel) recycleBinFragment.m5820E()).m6264t0(fileEntity);
        }
        return C10786q.f26013a;
    }

    /* renamed from: a0 */
    public static final C10786q m5919a0(RecycleBinFragment recycleBinFragment, FileEntity fileEntity) {
        ((RecycleBinViewModel) recycleBinFragment.m5820E()).m6335K0(AbstractC10976v.m24126e(fileEntity.getFileId()));
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p309qc.C10786q m5920b0(com.friday.document.view.document.RecycleBinFragment r3, com.friday.common.entity.FileEntity r4) {
        /*
            androidx.paging.PagingDataAdapter r0 = r3.m5819D()
            com.friday.document.adapter.RecycleBinAdapter r0 = (com.friday.document.adapter.RecycleBinAdapter) r0
            r0.m5486n()
            if (r4 != 0) goto Le
            qc.q r3 = p309qc.C10786q.f26013a
            return r3
        Le:
            java.lang.String r0 = r4.getFileType()
            int r1 = r0.hashCode()
            r2 = 49
            if (r1 == r2) goto L39
            r2 = 54
            if (r1 == r2) goto L2c
            r2 = 1569(0x621, float:2.199E-42)
            if (r1 == r2) goto L23
            goto L45
        L23:
            java.lang.String r1 = "12"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto L45
        L2c:
            java.lang.String r1 = "6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L45
        L35:
            r3.m5817A(r4)
            goto L45
        L39:
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto L45
        L42:
            r3.m5827z(r4)
        L45:
            androidx.databinding.ViewDataBinding r0 = r3.getMBinding()
            com.friday.document.databinding.FragmentRecycleBinBinding r0 = (com.friday.document.databinding.FragmentRecycleBinBinding) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f6424h
            java.lang.String r1 = "recyclerView"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r0, r1)
            java.lang.String r4 = r4.getFileId()
            r3.m5823N(r0, r4)
            qc.q r3 = p309qc.C10786q.f26013a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.document.RecycleBinFragment.m5920b0(com.friday.document.view.document.RecycleBinFragment, com.friday.common.entity.FileEntity):qc.q"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/document/RecycleBinFragment.smali:499
    }

    /* renamed from: c0 */
    public static final void m5921c0(RecycleBinFragment recycleBinFragment, SwipeRefreshLayout swipeRefreshLayout) {
        recycleBinFragment.m5826y();
        if (swipeRefreshLayout.isRefreshing()) {
            swipeRefreshLayout.setEnabled(false);
        }
        ((RecycleBinViewModel) recycleBinFragment.m5820E()).m6217A0();
    }

    /* renamed from: d0 */
    public static final C10786q m5922d0(final RecycleBinFragment recycleBinFragment, View it) {
        AbstractC9979u.m20294g(it, "it");
        if (C9166c.f21406a.m18061e()) {
            BaseDialog baseDialogM5437F = C5975a.f6196a.m5437F(new InterfaceC9529a() { // from class: v2.o0
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return RecycleBinFragment.m5923e0(this.f27270c);
                }
            });
            FragmentManager childFragmentManager = recycleBinFragment.getChildFragmentManager();
            AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
            baseDialogM5437F.show(childFragmentManager, UUID.randomUUID().toString());
        } else {
            ToastUtils.showShort("当前没有网络，请检查网络连接后再次尝试", new Object[0]);
        }
        return C10786q.f26013a;
    }

    /* renamed from: e0 */
    public static final C10786q m5923e0(RecycleBinFragment recycleBinFragment) {
        RecycleBinViewModel recycleBinViewModel = (RecycleBinViewModel) recycleBinFragment.m5820E();
        List<MultiModeFileEntity> items = ((RecycleBinAdapter) recycleBinFragment.m5819D()).snapshot().getItems();
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(((MultiModeFileEntity) it.next()).getEntity().getFileId());
        }
        recycleBinViewModel.m6335K0(arrayList);
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p309qc.C10786q m5924f0(com.friday.document.view.document.RecycleBinFragment r3, androidx.paging.CombinedLoadStates r4) {
        /*
            java.lang.String r0 = "loadState"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r4, r0)
            androidx.databinding.ViewDataBinding r0 = r3.getMBinding()
            com.friday.document.databinding.FragmentRecycleBinBinding r0 = (com.friday.document.databinding.FragmentRecycleBinBinding) r0
            android.widget.TextView r0 = r0.f6419c
            java.lang.String r1 = "emptyView"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r0, r1)
            androidx.paging.LoadStates r1 = r4.getSource()
            androidx.paging.LoadState r1 = r1.getRefresh()
            boolean r1 = r1 instanceof androidx.paging.LoadState.NotLoading
            r2 = 0
            if (r1 == 0) goto L37
            androidx.paging.LoadState r4 = r4.getAppend()
            boolean r4 = r4.getEndOfPaginationReached()
            if (r4 == 0) goto L37
            androidx.paging.PagingDataAdapter r3 = r3.m5819D()
            com.friday.document.adapter.RecycleBinAdapter r3 = (com.friday.document.adapter.RecycleBinAdapter) r3
            int r3 = r3.getItemCount()
            r4 = 1
            if (r3 >= r4) goto L37
            goto L38
        L37:
            r4 = r2
        L38:
            if (r4 == 0) goto L3b
            goto L3d
        L3b:
            r2 = 8
        L3d:
            r0.setVisibility(r2)
            qc.q r3 = p309qc.C10786q.f26013a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.document.RecycleBinFragment.m5924f0(com.friday.document.view.document.RecycleBinFragment, androidx.paging.CombinedLoadStates):qc.q"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/document/RecycleBinFragment.smali:1001
    }

    private final void initObserver() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C60481(null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C60492(null), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new C60503(null), 3, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new C60514(null), 3, null);
        ((RecycleBinViewModel) m5820E()).m6222F().observe(getViewLifecycleOwner(), new C6047a(new InterfaceC9540l() { // from class: v2.n0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RecycleBinFragment.m5920b0(this.f27268c, (FileEntity) obj);
            }
        }));
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_recycle_bin;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
        m5825P((BaseFileViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(RecycleBinViewModel.class));
        m5824O(new RecycleBinAdapter((RecycleBinViewModel) m5820E(), new InterfaceC9544p() { // from class: v2.i0
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return RecycleBinFragment.m5918Z(this.f27257c, (AbstractC5987c) obj, (FileEntity) obj2);
            }
        }));
        ((RecycleBinViewModel) m5820E()).m6333H0();
        m5821F();
        initView();
        initObserver();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment
    public void initView() {
        final SwipeRefreshLayout swipeRefreshLayout = ((FragmentRecycleBinBinding) getMBinding()).f6425i;
        swipeRefreshLayout.setColorSchemeColors(AbstractC11958b.m26580a(R$color.colorAccent));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: v2.j0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                RecycleBinFragment.m5921c0(this.f27259a, swipeRefreshLayout);
            }
        });
        ImageView ivClean = ((FragmentRecycleBinBinding) getMBinding()).f6421e;
        AbstractC9979u.m20293f(ivClean, "ivClean");
        AbstractC9286b.m18309e(ivClean, new InterfaceC9540l() { // from class: v2.k0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RecycleBinFragment.m5922d0(this.f27262c, (View) obj);
            }
        });
        final RecyclerView recyclerView = ((FragmentRecycleBinBinding) getMBinding()).f6424h;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.friday.document.view.document.RecycleBinFragment$initView$3$1
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
        ((RecycleBinAdapter) m5819D()).registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.friday.document.view.document.RecycleBinFragment$initView$3$2
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i10, int i11) {
                super.onItemRangeRemoved(i10, i11);
                AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this.f7424a), null, null, new RecycleBinFragment$initView$3$2$onItemRangeRemoved$1(this.f7424a, null), 3, null);
            }
        });
        ((RecycleBinAdapter) m5819D()).addLoadStateListener(new InterfaceC9540l() { // from class: v2.l0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RecycleBinFragment.m5924f0(this.f27263c, (CombinedLoadStates) obj);
            }
        });
        getChildFragmentManager().beginTransaction().add(R$id.preview_container, new RecycleBinPreviewFragment()).commitAllowingStateLoss();
    }
}
