package com.zykj.study.dialog;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.blankj.utilcode.util.AbstractC5357d;
import com.zykj.download.OssUtils;
import com.zykj.download.work.DownloadFileCommonWork;
import com.zykj.lib.ota.R$layout;
import com.zykj.lib.ota.databinding.DialogCheckUpdateBinding;
import com.zykj.lib.ota.viewmodel.VersionViewModel;
import com.zykj.study.dialog.UpdateChoiceDialogMain;
import java.io.File;
import java.util.List;
import java.util.UUID;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class UpdateChoiceDialogMain extends Hilt_UpdateChoiceDialogMain<DialogCheckUpdateBinding> {

    /* renamed from: f */
    public final NavArgsLazy f11218f = new NavArgsLazy(AbstractC9137y.m16154b(UpdateChoiceDialogMainArgs.class), new C7727c(this));

    /* renamed from: g */
    public final InterfaceC8724d f11219g;

    /* renamed from: h */
    public UUID f11220h;

    /* renamed from: com.zykj.study.dialog.UpdateChoiceDialogMain$a */
    public static final /* synthetic */ class C7725a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11228a;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11228a = iArr;
        }
    }

    /* renamed from: com.zykj.study.dialog.UpdateChoiceDialogMain$b */
    public static final class C7726b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f11229a;

        public C7726b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f11229a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f11229a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11229a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.dialog.UpdateChoiceDialogMain$c */
    public static final class C7727c implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11230a;

        public C7727c(Fragment fragment) {
            this.f11230a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11230a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11230a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.dialog.UpdateChoiceDialogMain$initView$2", m17801f = "UpdateChoiceDialogMain.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.dialog.UpdateChoiceDialogMain$initView$2 */
    public static final class C77282 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11231a;

        public C77282(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* renamed from: l */
        public static final C8736p m10301l(UpdateChoiceDialogMain updateChoiceDialogMain, Boolean bool) {
            FragmentKt.findNavController(updateChoiceDialogMain).navigateUp();
            return C8736p.f16368a;
        }

        /* renamed from: m */
        public static final C8736p m10302m(UpdateChoiceDialogMain updateChoiceDialogMain, Boolean bool) {
            updateChoiceDialogMain.m10294o(updateChoiceDialogMain.m10296l().m10304a().getFileUrl());
            return C8736p.f16368a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final C8736p m10303n(Boolean bool) {
            AbstractC5357d.m2435a();
            return C8736p.f16368a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return UpdateChoiceDialogMain.this.new C77282(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77282) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f11231a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            MutableLiveData mutableLiveDataM9491c = UpdateChoiceDialogMain.this.m10292m().m9491c();
            final UpdateChoiceDialogMain updateChoiceDialogMain = UpdateChoiceDialogMain.this;
            mutableLiveDataM9491c.observe(updateChoiceDialogMain, new C7726b(new InterfaceC10570l() { // from class: com.zykj.study.dialog.a
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return UpdateChoiceDialogMain.C77282.m10301l(updateChoiceDialogMain, (Boolean) obj2);
                }
            }));
            MutableLiveData mutableLiveDataM9494f = UpdateChoiceDialogMain.this.m10292m().m9494f();
            final UpdateChoiceDialogMain updateChoiceDialogMain2 = UpdateChoiceDialogMain.this;
            mutableLiveDataM9494f.observe(updateChoiceDialogMain2, new C7726b(new InterfaceC10570l() { // from class: com.zykj.study.dialog.b
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return UpdateChoiceDialogMain.C77282.m10302m(updateChoiceDialogMain2, (Boolean) obj2);
                }
            }));
            UpdateChoiceDialogMain.this.m10292m().m9490b().observe(UpdateChoiceDialogMain.this.getViewLifecycleOwner(), new C7726b(new InterfaceC10570l() { // from class: com.zykj.study.dialog.c
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return UpdateChoiceDialogMain.C77282.m10303n((Boolean) obj2);
                }
            }));
            return C8736p.f16368a;
        }
    }

    public UpdateChoiceDialogMain() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.dialog.UpdateChoiceDialogMain$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.dialog.UpdateChoiceDialogMain$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f11219g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(VersionViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.dialog.UpdateChoiceDialogMain$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.dialog.UpdateChoiceDialogMain$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
                if (interfaceC10559a3 != null && (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.dialog.UpdateChoiceDialogMain$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final VersionViewModel m10292m() {
        return (VersionViewModel) this.f11219g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m10293n(File file) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Context context = getContext();
            Uri uriForFile = FileProvider.getUriForFile(fragmentActivityRequireActivity, (context != null ? context.getPackageName() : null) + ".FileProvider", file);
            AbstractC9133u.m16132f(uriForFile, "getUriForFile(...)");
            AbstractC9133u.m16130d(intent.addFlags(1));
            intent.addFlags(268435456);
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.startActivity(intent);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m10294o(String str) {
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) DownloadFileCommonWork.class).setInputData(DownloadFileCommonWork.C7280a.m9199b(DownloadFileCommonWork.Companion, str, null, null, 6, null)).build();
        this.f11220h = oneTimeWorkRequestBuild.getId();
        WorkManager.Companion companion = WorkManager.Companion;
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        WorkManager companion2 = companion.getInstance(contextRequireContext);
        companion2.enqueueUniqueWork(str, ExistingWorkPolicy.REPLACE, oneTimeWorkRequestBuild);
        companion2.getWorkInfosForUniqueWorkLiveData(str).observe(getViewLifecycleOwner(), new C7726b(new InterfaceC10570l() { // from class: p4.w
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return UpdateChoiceDialogMain.m10295p(this.f19354a, (List) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final C8736p m10295p(UpdateChoiceDialogMain updateChoiceDialogMain, List list) {
        AbstractC9133u.m16130d(list);
        WorkInfo workInfo = (WorkInfo) AbstractC8778f0.m14566l0(list);
        int i10 = C7725a.f11228a[workInfo.getState().ordinal()];
        if (i10 == 1) {
            String string = workInfo.getOutputData().getString(OssUtils.SUCCESS_KEY);
            LifecycleOwner viewLifecycleOwner = updateChoiceDialogMain.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new UpdateChoiceDialogMain$startDownload$1$1$1$1(string, updateChoiceDialogMain, null), 3, null);
        } else if (i10 != 2) {
            int i11 = workInfo.getProgress().getInt("progress", 0);
            updateChoiceDialogMain.m10292m().m9492d().postValue(Integer.valueOf(i11));
            ((DialogCheckUpdateBinding) updateChoiceDialogMain.getMBindView()).f10232d.setProgress(i11);
        } else {
            int i12 = workInfo.getOutputData().getInt(OssUtils.ERROR_KEY, 0);
            LifecycleOwner viewLifecycleOwner2 = updateChoiceDialogMain.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new UpdateChoiceDialogMain$startDownload$1$1$2$1(i12, null), 3, null);
            updateChoiceDialogMain.m10292m().m9493e().postValue(Boolean.TRUE);
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        setCancelable(!m10296l().m10304a().getForceUpdate());
        m10292m().m9497i().setValue(m10296l().m10304a());
        ((DialogCheckUpdateBinding) getMBindView()).mo9463a(m10292m());
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new C77282(null));
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public final UpdateChoiceDialogMainArgs m10296l() {
        return (UpdateChoiceDialogMainArgs) this.f11218f.getValue();
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_check_update;
    }
}
