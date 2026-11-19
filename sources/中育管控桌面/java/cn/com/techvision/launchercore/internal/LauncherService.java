package cn.com.techvision.launchercore.internal;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.LauncherActivityInfo;
import android.content.pm.LauncherApps;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.UserHandle;
import android.provider.Settings;
import cn.com.techvision.launchercore.internal.LauncherFlow;
import cn.com.techvision.launchercore.internal.LauncherService;
import cn.com.techvision.launchercore.internal.LauncherService$mLACallback$2;
import cn.com.techvision.launchercore.internal.LauncherService$mUACallback$2;
import com.blankj.utilcode.util.AbstractC4654k;
import com.blankj.utilcode.util.AbstractC4656l;
import com.blankj.utilcode.util.AbstractC4657l0;
import com.blankj.utilcode.util.AbstractC4660n;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p066h.C6428a;
import p066h.InterfaceC6430c;

@Metadata(m7879d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0003R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#¨\u0006&"}, m7880d2 = {"Lcn/com/techvision/launchercore/internal/LauncherService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "onCreate", "onDestroy", "q", "h", "s", "t", "Lio/reactivex/disposables/CompositeDisposable;", "a", "Lkotlin/Lazy;", "m", "()Lio/reactivex/disposables/CompositeDisposable;", "mCompositeDisposable", "Landroid/content/pm/LauncherApps;", "b", "o", "()Landroid/content/pm/LauncherApps;", "mLAService", "Landroid/database/ContentObserver;", "c", "p", "()Landroid/database/ContentObserver;", "mUACallback", "Landroid/content/pm/LauncherApps$Callback;", "d", "n", "()Landroid/content/pm/LauncherApps$Callback;", "mLACallback", "e", "LauncherCore_release"}, m7881k = 1, m7882mv = {1, 6, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class LauncherService extends Service {

    /* renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f */
    public static InterfaceC6430c f1400f;

    /* renamed from: a, reason: from kotlin metadata */
    public final Lazy mCompositeDisposable = LazyKt.lazy(new Function0<CompositeDisposable>() { // from class: cn.com.techvision.launchercore.internal.LauncherService$mCompositeDisposable$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompositeDisposable invoke() {
            return new CompositeDisposable();
        }
    });

    /* renamed from: b, reason: from kotlin metadata */
    public final Lazy mLAService = LazyKt.lazy(new Function0<LauncherApps>() { // from class: cn.com.techvision.launchercore.internal.LauncherService$mLAService$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LauncherApps invoke() {
            Object systemService = this.f1408a.getSystemService("launcherapps");
            if (systemService != null) {
                return (LauncherApps) systemService;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.pm.LauncherApps");
        }
    });

    /* renamed from: c, reason: from kotlin metadata */
    public final Lazy mUACallback = LazyKt.lazy(new Function0<LauncherService$mUACallback$2.C4539a>() { // from class: cn.com.techvision.launchercore.internal.LauncherService$mUACallback$2

        /* renamed from: cn.com.techvision.launchercore.internal.LauncherService$mUACallback$2$a */
        public static final class C4539a extends ContentObserver {

            /* renamed from: a */
            public final /* synthetic */ LauncherService f1410a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4539a(LauncherService launcherService, Handler handler) {
                super(handler);
                this.f1410a = launcherService;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z6) {
                super.onChange(z6);
                LauncherService.INSTANCE.m1630c("onMDMUsableAppsChanged");
                this.f1410a.m1625q();
            }
        }

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4539a invoke() {
            return new C4539a(this.f1409a, new Handler(Looper.getMainLooper()));
        }
    });

    /* renamed from: d, reason: from kotlin metadata */
    public final Lazy mLACallback = LazyKt.lazy(new Function0<LauncherService$mLACallback$2.C4538a>() { // from class: cn.com.techvision.launchercore.internal.LauncherService$mLACallback$2

        /* renamed from: cn.com.techvision.launchercore.internal.LauncherService$mLACallback$2$a */
        public static final class C4538a extends LauncherApps.Callback {

            /* renamed from: a */
            public final /* synthetic */ LauncherService f1407a;

            public C4538a(LauncherService launcherService) {
                this.f1407a = launcherService;
            }

            @Override // android.content.pm.LauncherApps.Callback
            public void onPackageAdded(String packageName, UserHandle user) {
                Intrinsics.checkNotNullParameter(packageName, "packageName");
                Intrinsics.checkNotNullParameter(user, "user");
                LauncherService.INSTANCE.m1630c("onPackageAdded" + packageName);
                this.f1407a.m1625q();
            }

            @Override // android.content.pm.LauncherApps.Callback
            public void onPackageChanged(String packageName, UserHandle user) {
                Intrinsics.checkNotNullParameter(packageName, "packageName");
                Intrinsics.checkNotNullParameter(user, "user");
                LauncherService.INSTANCE.m1630c("onPackageChanged" + packageName);
                this.f1407a.m1625q();
            }

            @Override // android.content.pm.LauncherApps.Callback
            public void onPackageRemoved(String packageName, UserHandle user) {
                Intrinsics.checkNotNullParameter(packageName, "packageName");
                Intrinsics.checkNotNullParameter(user, "user");
                LauncherService.INSTANCE.m1630c("onPackageRemoved" + packageName);
                this.f1407a.m1625q();
            }

            @Override // android.content.pm.LauncherApps.Callback
            public void onPackagesAvailable(String[] packageNames, UserHandle user, boolean z6) {
                Intrinsics.checkNotNullParameter(packageNames, "packageNames");
                Intrinsics.checkNotNullParameter(user, "user");
                LauncherService.INSTANCE.m1630c("onPackagesAvailable" + this.f1407a.getPackageName());
                this.f1407a.m1625q();
            }

            @Override // android.content.pm.LauncherApps.Callback
            public void onPackagesUnavailable(String[] packageNames, UserHandle user, boolean z6) {
                Intrinsics.checkNotNullParameter(packageNames, "packageNames");
                Intrinsics.checkNotNullParameter(user, "user");
                LauncherService.INSTANCE.m1630c("onPackagesUnavailable" + this.f1407a.getPackageName());
                this.f1407a.m1625q();
            }
        }

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4538a invoke() {
            return new C4538a(this.f1406a);
        }
    });

    /* renamed from: cn.com.techvision.launchercore.internal.LauncherService$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final void m1629b(Context ctx, InterfaceC6430c listener) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(listener, "listener");
            LauncherService.f1400f = listener;
            ctx.startService(new Intent(ctx, (Class<?>) LauncherService.class));
        }

        /* renamed from: c */
        public final void m1630c(String str) {
        }

        public Companion() {
        }
    }

    /* renamed from: i */
    public static final List m1615i(LauncherService this$0, LauncherFlow.C4536b it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.m1630c("getActivityList");
        List<LauncherActivityInfo> mAIList = this$0.m1623o().getActivityList(null, Process.myUserHandle());
        String string = Settings.System.getString(this$0.getContentResolver(), "usableApps");
        if (string == null) {
            string = "[]";
        }
        Intrinsics.checkNotNullExpressionValue(mAIList, "mAIList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : mAIList) {
            boolean zContains$default = false;
            try {
                ApplicationInfo applicationInfo = ((LauncherActivityInfo) obj).getApplicationInfo();
                Intrinsics.checkNotNull(applicationInfo);
                String str = applicationInfo.packageName;
                Intrinsics.checkNotNull(str);
                zContains$default = StringsKt.contains$default((CharSequence) string, (CharSequence) str, false, 2, (Object) null);
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            if (zContains$default) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static final List m1616j(LauncherService this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.m1630c("cache icon");
        String str = this$0.getCacheDir().getAbsolutePath() + "/launcher-core-icon/";
        ArrayList arrayList = new ArrayList();
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            LauncherActivityInfo launcherActivityInfo = (LauncherActivityInfo) it2.next();
            ComponentName componentName = launcherActivityInfo.getComponentName();
            String str2 = str + componentName.flattenToShortString() + ".png";
            String str3 = str + componentName.flattenToShortString() + ".flag";
            if (AbstractC4656l.m2247y(str2) && AbstractC4656l.m2247y(str3) && Intrinsics.areEqual("1", AbstractC4654k.m2212d(str3))) {
                arrayList.add(new C6428a(launcherActivityInfo.getLabel().toString(), launcherActivityInfo.getComponentName().getPackageName(), launcherActivityInfo.getComponentName(), str2));
            } else {
                AbstractC4656l.m2232j(str2);
                AbstractC4656l.m2232j(str3);
                AbstractC4654k.m2216h(str3, "0", false);
                if (AbstractC4660n.m2271e(AbstractC4660n.m2267a(launcherActivityInfo.getIcon(320)), str2, Bitmap.CompressFormat.PNG, true)) {
                    AbstractC4654k.m2216h(str3, "1", false);
                    arrayList.add(new C6428a(launcherActivityInfo.getLabel().toString(), launcherActivityInfo.getComponentName().getPackageName(), launcherActivityInfo.getComponentName(), str2));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static final void m1617k(List list) {
        InterfaceC6430c interfaceC6430c = f1400f;
        if (interfaceC6430c != null) {
            interfaceC6430c.mo7038a(list);
        }
    }

    /* renamed from: l */
    public static final void m1618l(Throwable th) {
        th.printStackTrace();
    }

    /* renamed from: r */
    public static final void m1619r(LauncherService this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m1625q();
    }

    /* renamed from: h */
    public final void m1620h() {
        m1621m().add(LauncherFlow.f1394b.m1607a().m1605d(LauncherFlow.C4536b.class).subscribeOn(Schedulers.m7435io()).unsubscribeOn(Schedulers.m7435io()).observeOn(Schedulers.single()).map(new Function() { // from class: i.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return LauncherService.m1615i(this.f8298a, (LauncherFlow.C4536b) obj);
            }
        }).observeOn(Schedulers.single()).map(new Function() { // from class: i.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return LauncherService.m1616j(this.f8299a, (List) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: i.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LauncherService.m1617k((List) obj);
            }
        }, new Consumer() { // from class: i.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LauncherService.m1618l((Throwable) obj);
            }
        }));
    }

    /* renamed from: m */
    public final CompositeDisposable m1621m() {
        return (CompositeDisposable) this.mCompositeDisposable.getValue();
    }

    /* renamed from: n */
    public final LauncherApps.Callback m1622n() {
        return (LauncherApps.Callback) this.mLACallback.getValue();
    }

    /* renamed from: o */
    public final LauncherApps m1623o() {
        return (LauncherApps) this.mLAService.getValue();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        AbstractC4657l0.m2251b(getApplication());
        Companion companion = INSTANCE;
        companion.m1630c("onCreate");
        m1626s();
        companion.m1630c("registerLA");
        m1620h();
        companion.m1630c("forwardChange");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i.a
            @Override // java.lang.Runnable
            public final void run() {
                LauncherService.m1619r(this.f8297a);
            }
        });
        companion.m1630c("noticeChange");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        m1627t();
        m1621m().clear();
    }

    /* renamed from: p */
    public final ContentObserver m1624p() {
        return (ContentObserver) this.mUACallback.getValue();
    }

    /* renamed from: q */
    public final void m1625q() {
        LauncherFlow.f1394b.m1607a().m1604c(new LauncherFlow.C4536b(true));
    }

    /* renamed from: s */
    public final void m1626s() {
        m1623o().registerCallback(m1622n());
        getContentResolver().registerContentObserver(Settings.System.getUriFor("usableApps"), false, m1624p());
    }

    /* renamed from: t */
    public final void m1627t() {
        m1623o().unregisterCallback(m1622n());
        getContentResolver().unregisterContentObserver(m1624p());
    }
}
