package com.zykj.study.p065ui.home.exercise;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.blankj.utilcode.util.AbstractC5364g0;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.base.utils.XToastUtils;
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.download.OssUtils;
import com.zykj.lib.error.code.ErrorCodeHandler;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.bean.OssData;
import com.zykj.study.databinding.FragmentMicroEditBinding;
import com.zykj.study.p065ui.home.exercise.MicroEditFragment;
import com.zykj.study.viewmodels.MicroEditViewModel;
import com.zykj.study.viewmodels.OssTokenViewModel;
import com.zykj.view.board.board.AbstractC8211g;
import com.zykj.view.board.board.BoardFragment;
import com.zykj.view.board.board.C8208d;
import java.io.File;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p007a6.C0038l;
import p086e5.AbstractC8366o;
import p089e8.InterfaceC8375c;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p173m1.C9293a;
import p173m1.C9295c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p209p4.C9667s;
import p210p5.C9674a;
import p210p5.C9679b1;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MicroEditFragment extends Hilt_MicroEditFragment<FragmentMicroEditBinding> {

    /* renamed from: n */
    public static final C7829a f12022n = new C7829a(null);

    /* renamed from: o */
    public static final int f12023o = 8;

    /* renamed from: f */
    public final NavArgsLazy f12024f = new NavArgsLazy(AbstractC9137y.m16154b(MicroEditFragmentArgs.class), new C7834d(this));

    /* renamed from: g */
    public final InterfaceC8724d f12025g;

    /* renamed from: h */
    public final InterfaceC8724d f12026h;

    /* renamed from: i */
    public C9667s f12027i;

    /* renamed from: j */
    public BoardFragment f12028j;

    /* renamed from: k */
    public final ActivityResultLauncher f12029k;

    /* renamed from: l */
    public final C0038l f12030l;

    /* renamed from: m */
    public MicroCropExtraFragment f12031m;

    /* renamed from: com.zykj.study.ui.home.exercise.MicroEditFragment$a */
    public static final class C7829a {
        public /* synthetic */ C7829a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7829a() {
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.MicroEditFragment$b */
    public static final /* synthetic */ class C7832b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12051a;

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
            f12051a = iArr;
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.MicroEditFragment$c */
    public static final class C7833c implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12052a;

        public C7833c(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12052a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12052a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12052a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.MicroEditFragment$d */
    public static final class C7834d implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12053a;

        public C7834d(Fragment fragment) {
            this.f12053a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12053a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12053a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.MicroEditFragment", m17801f = "MicroEditFragment.kt", m17802l = {79}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.exercise.MicroEditFragment$initData$1 */
    public static final class C78351 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12054a;

        /* renamed from: c */
        public int f12056c;

        public C78351(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12054a = obj;
            this.f12056c |= Integer.MIN_VALUE;
            return MicroEditFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.MicroEditFragment$initView$3", m17801f = "MicroEditFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.exercise.MicroEditFragment$initView$3 */
    public static final class C78363 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12057a;

        /* renamed from: b */
        public /* synthetic */ Object f12058b;

        public C78363(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, InterfaceC9324c interfaceC9324c) {
            return ((C78363) create(str, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C78363 c78363 = MicroEditFragment.this.new C78363(interfaceC9324c);
            c78363.f12058b = obj;
            return c78363;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f12058b;
            AbstractC9434a.m17291f();
            if (this.f12057a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            if (str == null) {
                return C8736p.f16368a;
            }
            MicroEditFragment.this.m10760O(str);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.MicroEditFragment$initView$7", m17801f = "MicroEditFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.exercise.MicroEditFragment$initView$7 */
    public static final class C78377 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12060a;

        public C78377(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return MicroEditFragment.this.new C78377(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C78377) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            BoardFragment boardFragment;
            AbstractC9434a.m17291f();
            if (this.f12060a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            if (MicroEditFragment.this.isAdded() && (boardFragment = MicroEditFragment.this.f12028j) != null) {
                MicroEditFragment.this.getChildFragmentManager().beginTransaction().replace(R$id.container, boardFragment, "black_fragment").commitAllowingStateLoss();
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MicroEditFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.MicroEditFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.MicroEditFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12025g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(OssTokenViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.MicroEditFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.MicroEditFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.MicroEditFragment$special$$inlined$viewModels$default$5
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
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(MicroEditViewModel.class);
        InterfaceC10559a interfaceC10559a3 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.MicroEditFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        };
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f12026h = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC8375cM16154b, interfaceC10559a3, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.MicroEditFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a4 = objArr;
                return (interfaceC10559a4 == null || (creationExtras = (CreationExtras) interfaceC10559a4.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.MicroEditFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: w4.g1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MicroEditFragment.m10731J((Boolean) obj);
            }
        });
        AbstractC9133u.m16132f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f12029k = activityResultLauncherRegisterForActivityResult;
        this.f12030l = new C0038l(this, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    /* renamed from: D */
    public static final void m10725D(MicroEditFragment microEditFragment, C9295c c9295c, C9293a c9293a, int i10) {
        AbstractC9133u.m16133g(c9293a, "<unused var>");
        microEditFragment.m10759K();
    }

    /* renamed from: E */
    public static final C8736p m10726E(MicroEditFragment microEditFragment, String str, Bundle bundle) {
        AbstractC9133u.m16133g(str, "<unused var>");
        AbstractC9133u.m16133g(bundle, "bundle");
        String string = bundle.getString("RESULT_KEY_ACTION");
        if (string != null && string.hashCode() == -978507415 && string.equals("RESULT_VALUE_ACTION_CROP")) {
            BoardBox.INSTANCE.clearLocalData(microEditFragment.m10764z().m10774b(), microEditFragment.requireContext());
        }
        return C8736p.f16368a;
    }

    /* renamed from: F */
    public static final C8736p m10727F(MicroEditFragment microEditFragment, View it) {
        AbstractC9133u.m16133g(it, "it");
        FragmentKt.findNavController(microEditFragment).navigateUp();
        return C8736p.f16368a;
    }

    /* renamed from: G */
    public static final C8736p m10728G(MicroEditFragment microEditFragment, String str) {
        if (str == null) {
            return C8736p.f16368a;
        }
        FragmentKt.findNavController(microEditFragment).navigate(AbstractC7849i.f12128a.m10788b(str));
        return C8736p.f16368a;
    }

    /* renamed from: H */
    public static final C8736p m10729H(MicroEditFragment microEditFragment, String str) {
        FragmentKt.findNavController(microEditFragment).navigate(AbstractC7849i.f12128a.m10787a("REQUEST_KEY_CROP", microEditFragment.m10764z().m10774b()));
        return C8736p.f16368a;
    }

    /* renamed from: I */
    public static final void m10730I(MicroEditFragment microEditFragment, View view) {
        C9667s c9667s = microEditFragment.f12027i;
        if (c9667s != null) {
            c9667s.mo18229v(view);
        }
    }

    /* renamed from: J */
    public static final void m10731J(Boolean it) {
        AbstractC9133u.m16133g(it, "it");
    }

    /* renamed from: L */
    public static final C8736p m10732L(final MicroEditFragment microEditFragment, File file) {
        AbstractC9133u.m16133g(file, "file");
        C0038l c0038l = microEditFragment.f12030l;
        Uri uriM2469b = AbstractC5364g0.m2469b(file);
        AbstractC9133u.m16132f(uriM2469b, "file2Uri(...)");
        c0038l.m93r(uriM2469b, new InterfaceC10570l() { // from class: w4.s1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroEditFragment.m10733M(this.f20573a, (Uri) obj);
            }
        });
        microEditFragment.m10758C();
        return C8736p.f16368a;
    }

    /* renamed from: M */
    public static final C8736p m10733M(MicroEditFragment microEditFragment, Uri uri) {
        BoardFragment boardFragment = microEditFragment.f12028j;
        if (boardFragment != null) {
            BoardFragment.m12637k0(boardFragment, null, AbstractC5364g0.m2472e(uri).getAbsolutePath(), null, false, null, 29, null);
        }
        return C8736p.f16368a;
    }

    /* renamed from: N */
    public static final C8736p m10734N(MicroEditFragment microEditFragment) {
        microEditFragment.m10758C();
        return C8736p.f16368a;
    }

    /* renamed from: Q */
    public static final void m10735Q(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, DialogInterface dialogInterface) {
        workManager.cancelWorkById(oneTimeWorkRequest.getId());
    }

    /* renamed from: R */
    public static final void m10736R(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, final MicroEditFragment microEditFragment, final String str, final OssData ossData, final String str2, final DialogInterface dialogInterface) {
        workManager.getWorkInfoByIdLiveData(oneTimeWorkRequest.getId()).observe(microEditFragment.getViewLifecycleOwner(), new C7833c(new InterfaceC10570l() { // from class: w4.j1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroEditFragment.m10737S(dialogInterface, microEditFragment, str, ossData, str2, (WorkInfo) obj);
            }
        }));
    }

    /* renamed from: S */
    public static final C8736p m10737S(DialogInterface dialogInterface, MicroEditFragment microEditFragment, String str, OssData ossData, String str2, WorkInfo workInfo) {
        WorkInfo.State state = workInfo != null ? workInfo.getState() : null;
        int i10 = state == null ? -1 : C7832b.f12051a[state.ordinal()];
        if (i10 == 1) {
            dialogInterface.dismiss();
            String string = workInfo.getOutputData().getString(OssUtils.SUCCESS_KEY);
            if (string != null) {
                microEditFragment.m10762T(str, string, ossData, str2);
            }
        } else if (i10 == 2) {
            Integer messageResId = ErrorCodeHandler.INSTANCE.getErrorCode(workInfo.getOutputData().getInt(OssUtils.ERROR_KEY, 0)).getErrorCodeInfo().getMessageResId();
            if (messageResId != null) {
                AbstractC8366o.m13651c(XToastUtils.INSTANCE, messageResId.intValue());
            }
        } else {
            if (workInfo == null) {
                return C8736p.f16368a;
            }
            AbstractC9133u.m16131e(dialogInterface, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog");
            ((MaterialDialog) dialogInterface).m6725t(workInfo.getProgress().getInt("progress", 0));
        }
        return C8736p.f16368a;
    }

    /* renamed from: A */
    public final MicroEditViewModel m10756A() {
        return (MicroEditViewModel) this.f12026h.getValue();
    }

    /* renamed from: B */
    public final OssTokenViewModel m10757B() {
        return (OssTokenViewModel) this.f12025g.getValue();
    }

    /* renamed from: C */
    public final void m10758C() {
        MicroCropExtraFragment microCropExtraFragment = this.f12031m;
        if (microCropExtraFragment != null) {
            getChildFragmentManager().beginTransaction().remove(microCropExtraFragment).commitAllowingStateLoss();
        }
    }

    /* renamed from: K */
    public final void m10759K() {
        MicroCropExtraFragment microCropExtraFragment = new MicroCropExtraFragment();
        microCropExtraFragment.m10724r(new InterfaceC10570l() { // from class: w4.q1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroEditFragment.m10732L(this.f20567a, (File) obj);
            }
        });
        microCropExtraFragment.m10723q(new InterfaceC10559a() { // from class: w4.r1
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MicroEditFragment.m10734N(this.f20570a);
            }
        });
        this.f12031m = microCropExtraFragment;
        getChildFragmentManager().beginTransaction().replace(R$id.fragment_crop, microCropExtraFragment, "MicroCropExtraFragment").commitAllowingStateLoss();
    }

    /* renamed from: O */
    public final void m10760O(String str) {
        m10756A().isDialogVisible().postValue(Boolean.TRUE);
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MicroEditFragment$startUpload$1(str, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10761P(java.lang.String r17, java.lang.String r18, p179m7.InterfaceC9324c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.MicroEditFragment.m10761P(java.lang.String, java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/MicroEditFragment.smali:1522
    }

    /* renamed from: T */
    public final void m10762T(String str, String str2, OssData ossData, String str3) {
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MicroEditFragment$uploadMicroThumbnail$1(str, ossData, str3, this, str2, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.zykj.study.p065ui.home.exercise.MicroEditFragment.C78351
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.study.ui.home.exercise.MicroEditFragment$initData$1 r0 = (com.zykj.study.p065ui.home.exercise.MicroEditFragment.C78351) r0
            int r1 = r0.f12056c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12056c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.MicroEditFragment$initData$1 r0 = new com.zykj.study.ui.home.exercise.MicroEditFragment$initData$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12054a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12056c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.AbstractC9079b.m15926b(r6)
            r0.f12056c = r3
            java.lang.Object r6 = super.initData(r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            p4.s r6 = new p4.s
            android.content.Context r0 = r5.requireContext()
            java.lang.String r1 = "requireContext(...)"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r0, r1)
            m1.a r1 = new m1.a
            int r2 = com.zykj.study.R$string.exercise_stem
            java.lang.String r2 = r5.getString(r2)
            int r4 = com.zykj.study.R$mipmap.icon_edit
            r1.<init>(r2, r4)
            m1.a[] r1 = new p173m1.C9293a[]{r1}
            java.util.List r1 = p134i7.AbstractC8809v.m14776s(r1)
            r6.<init>(r0, r1)
            android.content.res.Resources r0 = r5.getResources()
            int r1 = com.zykj.lib.p063ui.R$dimen.view_70
            int r0 = r0.getDimensionPixelSize(r1)
            w4.o1 r1 = new w4.o1
            r1.<init>()
            r2 = 0
            p2.d r6 = r6.m18233z(r0, r2, r1)
            p4.s r6 = (p209p4.C9667s) r6
            p2.d r6 = r6.m18231B(r3)
            p4.s r6 = (p209p4.C9667s) r6
            r5.f12027i = r6
            w4.p1 r6 = new w4.p1
            r6.<init>()
            java.lang.String r0 = "REQUEST_KEY_CROP"
            androidx.fragment.app.FragmentKt.setFragmentResultListener(r5, r0, r6)
            androidx.activity.result.ActivityResultLauncher r6 = r5.f12029k
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r6.launch(r0)
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.MicroEditFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/MicroEditFragment.smali:2199
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentMicroEditBinding) getMBindView()).setViewModel(m10756A());
        this.f12028j = BoardFragment.f14833f.m12691a(m10764z().m10774b(), new C8208d(true, false, true, false, true, true, true, true, false, AbstractC8211g.a.f15026c, 266, null), new C9679b1(null, false, true, 5, 5, false, 33, null), new C9674a(false, new InterfaceC10570l() { // from class: w4.k1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroEditFragment.m10727F(this.f20546a, (View) obj);
            }
        }, new C78363(null), new InterfaceC10570l() { // from class: w4.l1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroEditFragment.m10728G(this.f20549a, (String) obj);
            }
        }, null, null, new InterfaceC10570l() { // from class: w4.m1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroEditFragment.m10729H(this.f20552a, (String) obj);
            }
        }, null, null, null, null, null, null, 8113, null));
        ((FragmentMicroEditBinding) getMBindView()).menuExtra.setOnClickListener(new View.OnClickListener() { // from class: w4.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MicroEditFragment.m10730I(this.f20555a, view);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new C78377(null));
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_micro_edit;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: y */
    public final void m10763y(String str) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MicroEditFragment$attachmentToServer$1(this, str, null), 3, null);
    }

    /* renamed from: z */
    public final MicroEditFragmentArgs m10764z() {
        return (MicroEditFragmentArgs) this.f12024f.getValue();
    }
}
