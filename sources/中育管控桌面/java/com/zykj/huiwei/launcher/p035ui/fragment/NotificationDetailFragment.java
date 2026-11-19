package com.zykj.huiwei.launcher.p035ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.LinearLayoutCompat;
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
import com.blankj.utilcode.util.AbstractC4642e;
import com.blankj.utilcode.util.AbstractC4650i;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.download.data.AppDatabase;
import com.zykj.download.work.DownloadFileWorkProxy;
import com.zykj.huiwei.launcher.bean.resp.NoticeBean;
import com.zykj.huiwei.launcher.databinding.HwFragmentNotificationDetailBinding;
import com.zykj.huiwei.launcher.p035ui.fragment.NotificationDetailFragment;
import com.zykj.huiwei.launcher.viewmodels.NotificationViewModel;
import com.zykj.manage.R;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p078i4.C6548r;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\bH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0011\u0010\u001fR\u001a\u0010#\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u001f¨\u0006%"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;", "Lcom/zykj/huiwei/launcher/base/CommonFragment;", "Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationDetailBinding;", "<init>", "()V", "", "layoutId", "()I", "", "f", "initData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "url", "x", "(Ljava/lang/String;)V", "Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;", "i", "Lkotlin/Lazy;", "z", "()Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;", "viewModel", "Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragmentArgs;", "j", "Landroidx/navigation/NavArgsLazy;", "y", "()Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragmentArgs;", "args", "", "k", "Z", "()Z", "isLightStatusBars", "l", "h", "isLightNavigationBars", "JsToJava", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nNotificationDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDetailFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,254:1\n106#2,15:255\n42#3,3:270\n257#4,2:273\n*S KotlinDebug\n*F\n+ 1 NotificationDetailFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment\n*L\n47#1:255,15\n48#1:270,3\n135#1:273,2\n*E\n"})
/* loaded from: classes4.dex */
public final class NotificationDetailFragment extends Hilt_NotificationDetailFragment<HwFragmentNotificationDetailBinding> {

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: j, reason: from kotlin metadata */
    public final NavArgsLazy args;

    /* renamed from: k, reason: from kotlin metadata */
    public final boolean isLightStatusBars;

    /* renamed from: l, reason: from kotlin metadata */
    public final boolean isLightNavigationBars;

    public final class JsToJava {
        public JsToJava() {
        }

        @JavascriptInterface
        public final void open_file(String args) {
            Intrinsics.checkNotNullParameter(args, "args");
            if (args.length() == 0) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(NotificationDetailFragment.this), null, null, new NotificationDetailFragment$JsToJava$open_file$1(NotificationDetailFragment.this, args, null), 3, null);
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$a */
    public static final class C6149a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ NoticeBean f6758a;

        /* renamed from: b */
        public final /* synthetic */ NotificationDetailFragment f6759b;

        public C6149a(NoticeBean noticeBean, NotificationDetailFragment notificationDetailFragment) {
            this.f6758a = noticeBean;
            this.f6759b = notificationDetailFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            byte[] bytes;
            super.onPageFinished(webView, str);
            String content = this.f6758a.getContent();
            if (content != null) {
                bytes = content.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            } else {
                bytes = null;
            }
            String strM2194a = AbstractC4650i.m2194a(bytes);
            ((HwFragmentNotificationDetailBinding) this.f6759b.getMBindView()).webView.evaluateJavascript("javascript:window.notificationContent('" + strM2194a + "')", null);
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$b */
    public static final class C6150b implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f6760a;

        public C6150b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f6760a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f6760a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f6760a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$c */
    public static final class C6151c implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f6761a;

        public C6151c(Fragment fragment) {
            this.f6761a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f6761a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f6761a + " has null arguments");
        }
    }

    @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment", m7918f = "NotificationDetailFragment.kt", m7919i = {}, m7920l = {144}, m7921m = "initData", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$initData$1 */
    public static final class C61541 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f6773a;

        /* renamed from: c */
        public int f6775c;

        public C61541(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6773a = obj;
            this.f6775c |= Integer.MIN_VALUE;
            return NotificationDetailFragment.this.initData(this);
        }
    }

    public NotificationDetailFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(NotificationViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(NotificationDetailFragmentArgs.class), new C6151c(this));
        this.isLightStatusBars = true;
        this.isLightNavigationBars = true;
    }

    /* renamed from: A */
    public static final void m5940A(NotificationDetailFragment notificationDetailFragment, View view) {
        FragmentKt.findNavController(notificationDetailFragment).navigateUp();
    }

    /* renamed from: B */
    public static final boolean m5941B(View view) {
        return true;
    }

    /* renamed from: C */
    public static final void m5942C(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public static final Unit m5943D(NotificationDetailFragment notificationDetailFragment, NoticeBean noticeBean) {
        ((HwFragmentNotificationDetailBinding) notificationDetailFragment.getMBindView()).webView.setWebViewClient(new C6149a(noticeBean, notificationDetailFragment));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public static final Unit m5944E(NotificationDetailFragment notificationDetailFragment, Boolean bool) {
        LinearLayoutCompat flWithdrawPlaceholder = ((HwFragmentNotificationDetailBinding) notificationDetailFragment.getMBindView()).flWithdrawPlaceholder;
        Intrinsics.checkNotNullExpressionValue(flWithdrawPlaceholder, "flWithdrawPlaceholder");
        Intrinsics.checkNotNull(bool);
        flWithdrawPlaceholder.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m5945F(ToastMessage toastMessage) {
        C6548r c6548r = C6548r.f8382a;
        Intrinsics.checkNotNull(toastMessage);
        c6548r.m7409a(toastMessage);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonFragment
    /* renamed from: f */
    public void mo5284f() {
        ((HwFragmentNotificationDetailBinding) getMBindView()).titleBar.m4434h(new View.OnClickListener() { // from class: f4.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationDetailFragment.m5940A(this.f7692a, view);
            }
        });
        ((HwFragmentNotificationDetailBinding) getMBindView()).setVm(m5956z());
        WebView webView = ((HwFragmentNotificationDetailBinding) getMBindView()).webView;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new JsToJava(), "JsToJava");
        webView.getSettings().setDomStorageEnabled(true);
        webView.setOnLongClickListener(new View.OnLongClickListener() { // from class: f4.b0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return NotificationDetailFragment.m5941B(view);
            }
        });
        webView.setOnClickListener(new View.OnClickListener() { // from class: f4.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationDetailFragment.m5942C(view);
            }
        });
        webView.getSettings().setGeolocationEnabled(false);
        webView.getSettings().setAllowContentAccess(false);
        webView.getSettings().setCacheMode(1);
        webView.getSettings().setSupportMultipleWindows(false);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new NotificationDetailFragment$initView$3(this, null), 3, null);
        m5956z().getCreatorName().setValue(m5955y().getCreatorName());
        m5956z().getCreateTime().setValue(m5955y().getCreateTime());
        m5956z().getNoticeDetail().observe(this, new C6150b(new Function1() { // from class: f4.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationDetailFragment.m5943D(this.f7696a, (NoticeBean) obj);
            }
        }));
        ViewGroup.LayoutParams layoutParams = ((HwFragmentNotificationDetailBinding) getMBindView()).webView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, AbstractC4642e.m2167a());
        ((HwFragmentNotificationDetailBinding) getMBindView()).webView.setLayoutParams(marginLayoutParams);
        m5956z().getOnWithdraw().observe(getViewLifecycleOwner(), new C6150b(new Function1() { // from class: f4.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationDetailFragment.m5944E(this.f7698a, (Boolean) obj);
            }
        }));
        m5956z().getToastLiveData().observe(getViewLifecycleOwner(), new C6150b(new Function1() { // from class: f4.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationDetailFragment.m5945F((ToastMessage) obj);
            }
        }));
    }

    @Override // com.zykj.huiwei.launcher.base.CommonFragment
    /* renamed from: h, reason: from getter */
    public boolean getIsLightNavigationBars() {
        return this.isLightNavigationBars;
    }

    @Override // com.zykj.huiwei.launcher.base.CommonFragment
    /* renamed from: i, reason: from getter */
    public boolean getIsLightStatusBars() {
        return this.isLightStatusBars;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.huiwei.launcher.p035ui.fragment.NotificationDetailFragment.C61541
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$initData$1 r0 = (com.zykj.huiwei.launcher.p035ui.fragment.NotificationDetailFragment.C61541) r0
            int r1 = r0.f6775c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6775c = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$initData$1 r0 = new com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f6773a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6775c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f6775c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.huiwei.launcher.viewmodels.NotificationViewModel r5 = r4.m5956z()
            com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragmentArgs r0 = r4.m5955y()
            long r0 = r0.getParameterId()
            r5.m6178g(r0)
            com.zykj.huiwei.launcher.viewmodels.NotificationViewModel r5 = r4.m5956z()
            com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragmentArgs r0 = r4.m5955y()
            long r0 = r0.getMessageId()
            r5.m6183l(r0)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.p035ui.fragment.NotificationDetailFragment.initData(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment.smali:1080
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R.layout.hw_fragment_notification_detail;
    }

    /* renamed from: x */
    public final void m5954x(String url) {
        if (!StringsKt.contains$default((CharSequence) url, (CharSequence) "http", false, 2, (Object) null)) {
            ToastUtils.m2096r("无法打开文件", new Object[0]);
            return;
        }
        if (requireActivity().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_WIFI_STATE"}, 0);
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AppDatabase.Companion c5997a = AppDatabase.INSTANCE;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        DownloadFileWorkProxy downloadFileWorkProxy = new DownloadFileWorkProxy(contextRequireContext, c5997a.m4996b(contextRequireContext2), null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new NotificationDetailFragment$downloadAndOpen$1(this, url, downloadFileWorkProxy, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final NotificationDetailFragmentArgs m5955y() {
        return (NotificationDetailFragmentArgs) this.args.getValue();
    }

    /* renamed from: z */
    public final NotificationViewModel m5956z() {
        return (NotificationViewModel) this.viewModel.getValue();
    }
}
