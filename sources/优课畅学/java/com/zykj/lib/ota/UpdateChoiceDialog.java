package com.zykj.lib.ota;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
import com.zykj.base.utils.ActivityCollectionHelper;
import com.zykj.download.OssUtils;
import com.zykj.download.work.DownloadFileCommonWork;
import com.zykj.lib.ota.UpdateChoiceDialog;
import com.zykj.lib.ota.databinding.DialogCheckUpdateBinding;
import com.zykj.lib.ota.viewmodel.VersionViewModel;
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

/* loaded from: classes4.dex */
public final class UpdateChoiceDialog extends Hilt_UpdateChoiceDialog<DialogCheckUpdateBinding> {

    /* renamed from: f */
    public final NavArgsLazy f10200f = new NavArgsLazy(AbstractC9137y.m16154b(UpdateChoiceDialogArgs.class), new C7370c(this));

    /* renamed from: g */
    public final InterfaceC8724d f10201g;

    /* renamed from: h */
    public UUID f10202h;

    /* renamed from: com.zykj.lib.ota.UpdateChoiceDialog$a */
    public static final /* synthetic */ class C7368a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10210a;

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
            f10210a = iArr;
        }
    }

    /* renamed from: com.zykj.lib.ota.UpdateChoiceDialog$b */
    public static final class C7369b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f10211a;

        public C7369b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f10211a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f10211a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f10211a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.lib.ota.UpdateChoiceDialog$c */
    public static final class C7370c implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f10212a;

        public C7370c(Fragment fragment) {
            this.f10212a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f10212a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f10212a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.lib.ota.UpdateChoiceDialog$initView$2", m17801f = "UpdateChoiceDialog.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.ota.UpdateChoiceDialog$initView$2 */
    public static final class C73712 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f10213a;

        public C73712(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* renamed from: l */
        public static final C8736p m9454l(UpdateChoiceDialog updateChoiceDialog, Boolean bool) {
            FragmentKt.findNavController(updateChoiceDialog).navigateUp();
            return C8736p.f16368a;
        }

        /* renamed from: m */
        public static final C8736p m9455m(UpdateChoiceDialog updateChoiceDialog, Boolean bool) {
            updateChoiceDialog.m9449o(updateChoiceDialog.m9446l().m9457a().getFileUrl());
            return C8736p.f16368a;
        }

        /* renamed from: n */
        public static final C8736p m9456n(Boolean bool) {
            ActivityCollectionHelper.INSTANCE.exitApp();
            return C8736p.f16368a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return UpdateChoiceDialog.this.new C73712(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73712) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f10213a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            MutableLiveData mutableLiveDataM9491c = UpdateChoiceDialog.this.m9447m().m9491c();
            final UpdateChoiceDialog updateChoiceDialog = UpdateChoiceDialog.this;
            mutableLiveDataM9491c.observe(updateChoiceDialog, new C7369b(new InterfaceC10570l() { // from class: com.zykj.lib.ota.b
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return UpdateChoiceDialog.C73712.m9454l(updateChoiceDialog, (Boolean) obj2);
                }
            }));
            MutableLiveData mutableLiveDataM9494f = UpdateChoiceDialog.this.m9447m().m9494f();
            final UpdateChoiceDialog updateChoiceDialog2 = UpdateChoiceDialog.this;
            mutableLiveDataM9494f.observe(updateChoiceDialog2, new C7369b(new InterfaceC10570l() { // from class: com.zykj.lib.ota.c
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return UpdateChoiceDialog.C73712.m9455m(updateChoiceDialog2, (Boolean) obj2);
                }
            }));
            UpdateChoiceDialog.this.m9447m().m9490b().observe(UpdateChoiceDialog.this.getViewLifecycleOwner(), new C7369b(new InterfaceC10570l() { // from class: com.zykj.lib.ota.d
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return UpdateChoiceDialog.C73712.m9456n((Boolean) obj2);
                }
            }));
            return C8736p.f16368a;
        }
    }

    public UpdateChoiceDialog() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.lib.ota.UpdateChoiceDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.lib.ota.UpdateChoiceDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f10201g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(VersionViewModel.class), new InterfaceC10559a() { // from class: com.zykj.lib.ota.UpdateChoiceDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.lib.ota.UpdateChoiceDialog$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.lib.ota.UpdateChoiceDialog$special$$inlined$viewModels$default$5
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final C8736p m9445p(UpdateChoiceDialog updateChoiceDialog, List list) {
        AbstractC9133u.m16130d(list);
        WorkInfo workInfo = (WorkInfo) AbstractC8778f0.m14566l0(list);
        int i10 = C7368a.f10210a[workInfo.getState().ordinal()];
        if (i10 == 1) {
            String string = workInfo.getOutputData().getString(OssUtils.SUCCESS_KEY);
            LifecycleOwner viewLifecycleOwner = updateChoiceDialog.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new UpdateChoiceDialog$startDownload$1$1$1$1(string, updateChoiceDialog, null), 3, null);
        } else if (i10 != 2) {
            int i11 = workInfo.getProgress().getInt("progress", 0);
            updateChoiceDialog.m9447m().m9492d().postValue(Integer.valueOf(i11));
            ((DialogCheckUpdateBinding) updateChoiceDialog.getMBindView()).f10232d.setProgress(i11);
        } else {
            int i12 = workInfo.getOutputData().getInt(OssUtils.ERROR_KEY, 0);
            LifecycleOwner viewLifecycleOwner2 = updateChoiceDialog.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new UpdateChoiceDialog$startDownload$1$1$2$1(i12, null), 3, null);
            updateChoiceDialog.m9447m().m9493e().postValue(Boolean.TRUE);
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        setCancelable(!m9446l().m9457a().getForceUpdate());
        m9447m().m9497i().setValue(m9446l().m9457a());
        ((DialogCheckUpdateBinding) getMBindView()).mo9463a(m9447m());
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new C73712(null));
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public final UpdateChoiceDialogArgs m9446l() {
        return (UpdateChoiceDialogArgs) this.f10200f.getValue();
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_check_update;
    }

    /* renamed from: m */
    public final VersionViewModel m9447m() {
        return (VersionViewModel) this.f10201g.getValue();
    }

    /* renamed from: n */
    public final void m9448n(File file) {
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

    /* renamed from: o */
    public final void m9449o(String str) {
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) DownloadFileCommonWork.class).setInputData(DownloadFileCommonWork.C7280a.m9199b(DownloadFileCommonWork.Companion, str, null, null, 6, null)).build();
        this.f10202h = oneTimeWorkRequestBuild.getId();
        WorkManager.Companion companion = WorkManager.Companion;
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        WorkManager companion2 = companion.getInstance(contextRequireContext);
        companion2.enqueueUniqueWork(str, ExistingWorkPolicy.REPLACE, oneTimeWorkRequestBuild);
        companion2.getWorkInfosForUniqueWorkLiveData(str).observe(getViewLifecycleOwner(), new C7369b(new InterfaceC10570l() { // from class: s3.h
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return UpdateChoiceDialog.m9445p(this.f20023a, (List) obj);
            }
        }));
    }
}
