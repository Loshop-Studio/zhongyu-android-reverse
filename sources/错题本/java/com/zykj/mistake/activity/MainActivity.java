package com.zykj.mistake.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LifecycleOwnerKt;
import android.view.ViewModelLazy;
import android.view.ViewModelProvider;
import android.view.ViewModelStore;
import android.view.compose.ComponentActivityKt;
import android.view.result.ActivityResult;
import android.view.result.ActivityResultCallback;
import android.view.result.ActivityResultLauncher;
import android.view.result.contract.ActivityResultContracts;
import android.view.viewmodel.CreationExtras;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.navigation.serialization.C2872b;
import com.blankj.utilcode.util.AbstractC3386f;
import com.google.gson.C3841g;
import com.zykj.message.client.MessageClient;
import com.zykj.mistake.activity.MainActivity;
import com.zykj.mistake.data.C4493b;
import com.zykj.mistake.entity.req.CreateOrUpdateMistakeReq;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.main.MainShellViewModel;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.utils.C5102g;
import com.zykj.view.utils.ImagePicker;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.flow.C5946n0;
import kotlinx.serialization.json.internal.C6031l;
import p006a5.C0014e;
import p095k1.C5752a;
import p106l4.DialogC6053d;
import p128o1.InterfaceC6267c;
import p129o2.C6268a;
import p139p7.C6394a;
import p152r6.InterfaceC6469a;
import p191w4.C6716a;
import p191w4.InterfaceC6718c;
import p212z4.C6814a;
import p212z4.C6816c;
import p212z4.C6818e;
import p212z4.C6820g;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, m5110d2 = {"Lcom/zykj/mistake/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lw4/c;", "<init>", "()V", "", "isLoading", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/mistake/activity/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,322:1\n70#2,11:323\n85#3:334\n1247#4,6:335\n1247#4,6:341\n1247#4,6:347\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/mistake/activity/MainActivity\n*L\n70#1:323,11\n137#1:334\n143#1:335,6\n144#1:341,6\n131#1:347,6\n*E\n"})
/* loaded from: classes3.dex */
public final class MainActivity extends AppCompatActivity implements InterfaceC6718c {

    /* renamed from: o */
    public static final /* synthetic */ int f5784o = 0;

    /* renamed from: a */
    public final ViewModelLazy f5785a;

    /* renamed from: c */
    public InterfaceC6267c f5787c;

    /* renamed from: f */
    public InterfaceC6469a f5790f;

    /* renamed from: g */
    public final ActivityResultLauncher f5791g;

    /* renamed from: h */
    public C5102g f5792h;

    /* renamed from: j */
    public DialogC6053d f5794j;

    /* renamed from: k */
    public final ActivityResultLauncher f5795k;

    /* renamed from: m */
    public C6716a f5797m;

    /* renamed from: b */
    public final C6268a f5786b = new C6268a(11, false);

    /* renamed from: d */
    public boolean f5788d = true;

    /* renamed from: e */
    public final ActivityResultLauncher f5789e = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new C6394a());

    /* renamed from: i */
    public final ImagePicker f5793i = new ImagePicker(0 == true ? 1 : 0, this, 1, 0 == true ? 1 : 0);

    /* renamed from: l */
    public final C6031l f5796l = new C6031l(2);

    /* renamed from: n */
    public final ServiceConnectionC4470g f5798n = new ServiceConnectionC4470g(this);

    @Metadata(m5109d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m5110d2 = {"com/zykj/mistake/activity/MainActivity$a", "Lk1/a;", "", "Lcom/zykj/mistake/entity/resp/CustomTagInfo;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.zykj.mistake.activity.MainActivity$a */
    public static final class C4456a extends C5752a<List<? extends CustomTagInfo>> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainActivity() {
        final InterfaceC6469a interfaceC6469a = null;
        this.f5785a = new ViewModelLazy(AbstractC5832m.m5340a(MainShellViewModel.class), new InterfaceC6469a() { // from class: com.zykj.mistake.activity.MainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC6469a() { // from class: com.zykj.mistake.activity.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC6469a() { // from class: com.zykj.mistake.activity.MainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC6469a interfaceC6469a2 = interfaceC6469a;
                return (interfaceC6469a2 == null || (creationExtras = (CreationExtras) interfaceC6469a2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
        final int i = 0;
        this.f5791g = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: com.zykj.mistake.activity.b

            /* renamed from: b */
            public final /* synthetic */ MainActivity f5879b;

            {
                this.f5879b = this;
            }

            @Override // android.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Intent data;
                String stringExtra;
                CreateOrUpdateMistakeReq createOrUpdateMistakeReq;
                String stringExtra2;
                int i8 = i;
                MainActivity mainActivity = this.f5879b;
                ActivityResult result = (ActivityResult) obj;
                switch (i8) {
                    case 0:
                        int i9 = MainActivity.f5784o;
                        AbstractC5830k.m5330g(result, "result");
                        if (result.getResultCode() == -1) {
                            InterfaceC6469a interfaceC6469a2 = mainActivity.f5790f;
                            if (interfaceC6469a2 != null) {
                                interfaceC6469a2.invoke();
                            }
                            mainActivity.f5790f = null;
                            return;
                        }
                        return;
                    default:
                        int i10 = MainActivity.f5784o;
                        AbstractC5830k.m5330g(result, "result");
                        if (result.getResultCode() != -1 || (data = result.getData()) == null || (stringExtra = data.getStringExtra("EDIT_MISTAKE_DATA")) == null || (createOrUpdateMistakeReq = (CreateOrUpdateMistakeReq) AbstractC3386f.m2337a().m2784c(stringExtra, new C5752a(CreateOrUpdateMistakeReq.class))) == null) {
                            return;
                        }
                        Intent data2 = result.getData();
                        String stringExtra3 = data2 != null ? data2.getStringExtra("EDIT_MISTAKE_SUBJECT_NAME") : null;
                        if (stringExtra3 == null) {
                            stringExtra3 = "";
                        }
                        Intent data3 = result.getData();
                        List list = (data3 == null || (stringExtra2 = data3.getStringExtra("EDIT_MISTAKE_TAGS")) == null) ? null : (List) new C3841g().m2784c(stringExtra2, new C5752a(new MainActivity.C4456a().f9104b));
                        if (list == null) {
                            list = EmptyList.INSTANCE;
                        }
                        C6716a c6716a = mainActivity.f5797m;
                        if (c6716a == null) {
                            AbstractC5830k.m5339p("routeInfrastructure");
                            throw null;
                        }
                        C2872b c2872b = c6716a.f11333a.f11551f;
                        if (c2872b != null) {
                            c2872b.invoke(createOrUpdateMistakeReq, stringExtra3, list);
                        }
                        C6716a c6716a2 = mainActivity.f5797m;
                        if (c6716a2 != null) {
                            c6716a2.f11333a.f11551f = null;
                            return;
                        } else {
                            AbstractC5830k.m5339p("routeInfrastructure");
                            throw null;
                        }
                }
            }
        });
        final int i8 = 1;
        this.f5795k = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: com.zykj.mistake.activity.b

            /* renamed from: b */
            public final /* synthetic */ MainActivity f5879b;

            {
                this.f5879b = this;
            }

            @Override // android.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Intent data;
                String stringExtra;
                CreateOrUpdateMistakeReq createOrUpdateMistakeReq;
                String stringExtra2;
                int i82 = i8;
                MainActivity mainActivity = this.f5879b;
                ActivityResult result = (ActivityResult) obj;
                switch (i82) {
                    case 0:
                        int i9 = MainActivity.f5784o;
                        AbstractC5830k.m5330g(result, "result");
                        if (result.getResultCode() == -1) {
                            InterfaceC6469a interfaceC6469a2 = mainActivity.f5790f;
                            if (interfaceC6469a2 != null) {
                                interfaceC6469a2.invoke();
                            }
                            mainActivity.f5790f = null;
                            return;
                        }
                        return;
                    default:
                        int i10 = MainActivity.f5784o;
                        AbstractC5830k.m5330g(result, "result");
                        if (result.getResultCode() != -1 || (data = result.getData()) == null || (stringExtra = data.getStringExtra("EDIT_MISTAKE_DATA")) == null || (createOrUpdateMistakeReq = (CreateOrUpdateMistakeReq) AbstractC3386f.m2337a().m2784c(stringExtra, new C5752a(CreateOrUpdateMistakeReq.class))) == null) {
                            return;
                        }
                        Intent data2 = result.getData();
                        String stringExtra3 = data2 != null ? data2.getStringExtra("EDIT_MISTAKE_SUBJECT_NAME") : null;
                        if (stringExtra3 == null) {
                            stringExtra3 = "";
                        }
                        Intent data3 = result.getData();
                        List list = (data3 == null || (stringExtra2 = data3.getStringExtra("EDIT_MISTAKE_TAGS")) == null) ? null : (List) new C3841g().m2784c(stringExtra2, new C5752a(new MainActivity.C4456a().f9104b));
                        if (list == null) {
                            list = EmptyList.INSTANCE;
                        }
                        C6716a c6716a = mainActivity.f5797m;
                        if (c6716a == null) {
                            AbstractC5830k.m5339p("routeInfrastructure");
                            throw null;
                        }
                        C2872b c2872b = c6716a.f11333a.f11551f;
                        if (c2872b != null) {
                            c2872b.invoke(createOrUpdateMistakeReq, stringExtra3, list);
                        }
                        C6716a c6716a2 = mainActivity.f5797m;
                        if (c6716a2 != null) {
                            c6716a2.f11333a.f11551f = null;
                            return;
                        } else {
                            AbstractC5830k.m5339p("routeInfrastructure");
                            throw null;
                        }
                }
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context newBase) {
        AbstractC5830k.m5330g(newBase, "newBase");
        super.attachBaseContext(AbstractC5806u.m5261O(newBase));
    }

    /* renamed from: b */
    public final void m3907b(String message) {
        boolean z8;
        AbstractC5830k.m5330g(message, "message");
        synchronized (C4493b.f6003a) {
            z8 = C4493b.f6004b;
        }
        if (z8) {
            return;
        }
        Context applicationContext = getApplicationContext();
        AbstractC5830k.m5329f(applicationContext, "getApplicationContext(...)");
        Toast toast = AbstractC5099d.f8034e;
        if (toast == null) {
            Toast toastMakeText = Toast.makeText(applicationContext, message, 0);
            toastMakeText.setGravity(81, 0, 220);
            AbstractC5099d.f8034e = toastMakeText;
        } else {
            toast.setText(message);
        }
        Toast toast2 = AbstractC5099d.f8034e;
        AbstractC5830k.m5327d(toast2);
        toast2.show();
    }

    /* renamed from: c */
    public final void m3908c() {
        C6031l c6031l = this.f5796l;
        int i = c6031l.f9559b - 1;
        if (i < 0) {
            i = 0;
        }
        c6031l.f9559b = i;
        C5946n0 c5946n0 = (C5946n0) c6031l.f9560c;
        Boolean boolValueOf = Boolean.valueOf(i > 0);
        c5946n0.getClass();
        c5946n0.m5571k(null, boolValueOf);
    }

    /* renamed from: d */
    public final void m3909d(boolean z8) {
        C6031l c6031l = this.f5796l;
        int i = c6031l.f9559b + 1;
        c6031l.f9559b = i;
        C5946n0 c5946n0 = (C5946n0) c6031l.f9560c;
        Boolean boolValueOf = Boolean.valueOf(i > 0);
        c5946n0.getClass();
        c5946n0.m5571k(null, boolValueOf);
    }

    /* renamed from: o */
    public final MainShellViewModel m3910o() {
        return (MainShellViewModel) this.f5785a.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        boolean z8;
        super.onCreate(bundle);
        getWindow().setStatusBarColor(-1);
        new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView()).setAppearanceLightStatusBars(true);
        synchronized (C4493b.f6003a) {
            z8 = false;
            try {
                C4493b.f6004b = false;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        AbstractC6014x.m5651v(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MainActivity$observeComposeAuthExpired$1(this, null), 3);
        this.f5792h = new C5102g(this);
        this.f5794j = new DialogC6053d(this);
        C0014e c0014e = new C0014e(this, this, new C4466e(this), new C4458a(this, 3));
        C0014e c0014e2 = new C0014e(this, new MainActivity$buildRouteInfrastructure$notebookDatePickerHost$1(this), new C4462c(this, 1), new C4468f(this, 1));
        C5102g c5102g = this.f5792h;
        if (c5102g == null) {
            AbstractC5830k.m5339p("galleryLauncher");
            throw null;
        }
        this.f5797m = new C6716a(new C6818e(this, c5102g, this.f5793i, this.f5794j, this.f5795k), new C6814a(this, this.f5786b), new C6816c(c0014e), new C6820g(this, c0014e2, new C4458a(this, 1)));
        this.f5789e.launch("android.permission.WRITE_EXTERNAL_STORAGE");
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1657665238, true, new C4462c(this, 0)), 1, null);
        try {
            z8 = getPackageManager().getApplicationInfo("cn.com.techvision.appstore", 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (z8) {
            Intent intent = new Intent();
            intent.setPackage("cn.com.techvision.appstore");
            intent.setAction("cn.com.techvision.appstore.action.CHECK_UPDATE_SERVICE");
            bindService(intent, this.f5798n, 1);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        DialogC6053d dialogC6053d = this.f5794j;
        if (dialogC6053d != null) {
            dialogC6053d.dismiss();
        }
        this.f5794j = null;
        C6031l c6031l = this.f5796l;
        boolean z8 = false;
        c6031l.f9559b = 0;
        C5946n0 c5946n0 = (C5946n0) c6031l.f9560c;
        Boolean bool = Boolean.FALSE;
        c5946n0.getClass();
        c5946n0.m5571k(null, bool);
        super.onDestroy();
        try {
            z8 = getPackageManager().getApplicationInfo("cn.com.techvision.appstore", 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (z8) {
            unbindService(this.f5798n);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        MessageClient.INSTANCES.getServerInfo(new C4458a(this, 0));
    }
}
