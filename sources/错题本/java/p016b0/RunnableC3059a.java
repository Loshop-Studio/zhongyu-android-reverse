package p016b0;

import android.R;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.blankj.utilcode.R$id;
import com.blankj.utilcode.R$layout;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.AbstractC3383c0;
import com.blankj.utilcode.util.AbstractC3390j;
import com.blankj.utilcode.util.AbstractC3400t;
import com.blankj.utilcode.util.C3402v;
import com.blankj.utilcode.util.C3403w;
import com.blankj.utilcode.util.C3404x;
import com.blankj.utilcode.util.NetworkUtils$NetworkChangedReceiver;
import com.blankj.utilcode.util.NetworkUtils$NetworkType;
import com.blankj.utilcode.util.RunnableC3378a;
import com.blankj.utilcode.util.ToastUtils$MODE;
import com.bumptech.glide.ComponentCallbacks2C3414h;
import com.tencent.bugly.proguard.C4050ag;
import com.tencent.bugly.proguard.C4064au;
import com.tencent.bugly.proguard.C4150z0;
import com.xuexiang.xui.widget.StickyNestedScrollView;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner;
import com.xuexiang.xui.widget.button.RippleView;
import com.xuexiang.xui.widget.popupwindow.status.StatusView;
import com.xuexiang.xui.widget.tabbar.VerticalTabLayout;
import com.xuexiang.xui.widget.textview.ExpandableTextView;
import com.zykj.message.KillSelfService;
import com.zykj.message.UnInstallActivity;
import com.zykj.message.UnLoginActivity;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC5830k;
import p080i3.C5677c;
import p121n1.C6210a;
import p136p3.C6380r;
import p153r7.AbstractC6479a;
import p153r7.C6480b;
import p153r7.C6481c;
import p185v7.AbstractC6683l;

/* renamed from: b0.a */
/* loaded from: classes2.dex */
public final class RunnableC3059a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1380a;

    /* renamed from: b */
    public final /* synthetic */ Object f1381b;

    public /* synthetic */ RunnableC3059a(Object obj, int i) {
        this.f1380a = i;
        this.f1381b = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        NetworkUtils$NetworkType networkUtils$NetworkType;
        NetworkInfo networkInfo;
        NetworkInfo.State state;
        AbstractC3400t c3402v;
        View viewInflate;
        AbstractC6479a abstractC6479aM6134c;
        long jNanoTime;
        int i = 0;
        switch (this.f1380a) {
            case 0:
                Process.setThreadPriority(10);
                ((Runnable) this.f1381b).run();
                return;
            case 1:
                C3065d c3065d = (C3065d) this.f1381b;
                c3065d.getClass();
                while (true) {
                    try {
                        c3065d.m2010d((C3063c) ((ReferenceQueue) c3065d.f1397c).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 2:
                ((BaseBanner) this.f1381b).f4048w.obtainMessage().sendToTarget();
                return;
            case 3:
                int i8 = AbstractC3390j.f2165a;
                ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC3382c.m2303d().getSystemService("connectivity");
                if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(9)) == null || (state = networkInfo.getState()) == null || (state != NetworkInfo.State.CONNECTED && state != NetworkInfo.State.CONNECTING)) {
                    ConnectivityManager connectivityManager2 = (ConnectivityManager) AbstractC3382c.m2303d().getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager2 != null ? connectivityManager2.getActiveNetworkInfo() : null;
                    if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                        networkUtils$NetworkType = NetworkUtils$NetworkType.NETWORK_NO;
                    } else if (activeNetworkInfo.getType() == 1) {
                        networkUtils$NetworkType = NetworkUtils$NetworkType.NETWORK_WIFI;
                    } else if (activeNetworkInfo.getType() == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                networkUtils$NetworkType = NetworkUtils$NetworkType.NETWORK_2G;
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                networkUtils$NetworkType = NetworkUtils$NetworkType.NETWORK_3G;
                                break;
                            case 13:
                            case 18:
                                networkUtils$NetworkType = NetworkUtils$NetworkType.NETWORK_4G;
                                break;
                            case 19:
                            default:
                                String subtypeName = activeNetworkInfo.getSubtypeName();
                                if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                                    networkUtils$NetworkType = NetworkUtils$NetworkType.NETWORK_UNKNOWN;
                                    break;
                                } else {
                                    networkUtils$NetworkType = NetworkUtils$NetworkType.NETWORK_3G;
                                    break;
                                }
                                break;
                            case 20:
                                networkUtils$NetworkType = NetworkUtils$NetworkType.NETWORK_5G;
                                break;
                        }
                    } else {
                        networkUtils$NetworkType = NetworkUtils$NetworkType.NETWORK_UNKNOWN;
                    }
                } else {
                    networkUtils$NetworkType = NetworkUtils$NetworkType.NETWORK_ETHERNET;
                }
                NetworkUtils$NetworkChangedReceiver networkUtils$NetworkChangedReceiver = (NetworkUtils$NetworkChangedReceiver) this.f1381b;
                if (networkUtils$NetworkChangedReceiver.f2110a == networkUtils$NetworkType) {
                    return;
                }
                networkUtils$NetworkChangedReceiver.f2110a = networkUtils$NetworkType;
                if (networkUtils$NetworkType == NetworkUtils$NetworkType.NETWORK_NO) {
                    Iterator it = networkUtils$NetworkChangedReceiver.f2111b.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    return;
                }
                Iterator it2 = networkUtils$NetworkChangedReceiver.f2111b.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                return;
            case 4:
                AbstractC3383c0.m2328g(new RunnableC3378a(2));
                C3404x c3404x = C3404x.f2187b;
                if (!NotificationManagerCompat.from(AbstractC3382c.m2303d()).areNotificationsEnabled() || Settings.canDrawOverlays(AbstractC3382c.m2303d())) {
                    int i9 = Build.VERSION.SDK_INT;
                    c3402v = i9 < 25 ? new C3402v(2005) : Settings.canDrawOverlays(AbstractC3382c.m2303d()) ? i9 >= 26 ? new C3402v(2038) : new C3402v(2002) : new C3402v(c3404x, i);
                } else {
                    c3402v = new C3403w(c3404x);
                }
                C3404x.f2188c = new WeakReference(c3402v);
                CharSequence charSequence = (CharSequence) this.f1381b;
                Drawable[] drawableArr = c3402v.f2179b.f2189a;
                if (!ToastUtils$MODE.DARK.equals(null) && !ToastUtils$MODE.LIGHT.equals(null) && drawableArr[0] == null && drawableArr[1] == null && drawableArr[2] == null && drawableArr[3] == null) {
                    viewInflate = null;
                } else {
                    viewInflate = ((LayoutInflater) AbstractC3382c.m2303d().getSystemService("layout_inflater")).inflate(R$layout.utils_toast_view, (ViewGroup) null);
                    TextView textView = (TextView) viewInflate.findViewById(R.id.message);
                    if (ToastUtils$MODE.DARK.equals(null)) {
                        ((GradientDrawable) viewInflate.getBackground().mutate()).setColor(Color.parseColor("#BB000000"));
                        textView.setTextColor(-1);
                    }
                    textView.setText(charSequence);
                    if (drawableArr[0] != null) {
                        View viewFindViewById = viewInflate.findViewById(R$id.utvLeftIconView);
                        ViewCompat.setBackground(viewFindViewById, drawableArr[0]);
                        viewFindViewById.setVisibility(0);
                    }
                    if (drawableArr[1] != null) {
                        View viewFindViewById2 = viewInflate.findViewById(R$id.utvTopIconView);
                        ViewCompat.setBackground(viewFindViewById2, drawableArr[1]);
                        viewFindViewById2.setVisibility(0);
                    }
                    if (drawableArr[2] != null) {
                        View viewFindViewById3 = viewInflate.findViewById(R$id.utvRightIconView);
                        ViewCompat.setBackground(viewFindViewById3, drawableArr[2]);
                        viewFindViewById3.setVisibility(0);
                    }
                    if (drawableArr[3] != null) {
                        View viewFindViewById4 = viewInflate.findViewById(R$id.utvBottomIconView);
                        ViewCompat.setBackground(viewFindViewById4, drawableArr[3]);
                        viewFindViewById4.setVisibility(0);
                    }
                }
                if (viewInflate != null) {
                    c3402v.f2180c = viewInflate;
                    c3402v.f2178a.setView(viewInflate);
                    c3402v.m2353c();
                } else {
                    View view = c3402v.f2178a.getView();
                    c3402v.f2180c = view;
                    if (view == null || view.findViewById(R.id.message) == null) {
                        View viewInflate2 = ((LayoutInflater) AbstractC3382c.m2303d().getSystemService("layout_inflater")).inflate(R$layout.utils_toast_view, (ViewGroup) null);
                        c3402v.f2180c = viewInflate2;
                        c3402v.f2178a.setView(viewInflate2);
                    }
                    ((TextView) c3402v.f2180c.findViewById(R.id.message)).setText(charSequence);
                    c3402v.m2353c();
                }
                c3402v.mo2354d();
                return;
            case 5:
                ((C3402v) this.f1381b).mo2351a();
                return;
            case 6:
                ((C3402v) this.f1381b).mo2351a();
                return;
            case 7:
                ComponentCallbacks2C3414h componentCallbacks2C3414h = (ComponentCallbacks2C3414h) this.f1381b;
                componentCallbacks2C3414h.f2241c.mo5081d(componentCallbacks2C3414h);
                return;
            case 8:
                C4050ag.m2979c((List) this.f1381b);
                return;
            case 9:
                C4064au.m3162a((C4064au) this.f1381b);
                return;
            case 10:
                ((RippleView) this.f1381b).invalidate();
                return;
            case 11:
                KillSelfService killSelfService = (KillSelfService) this.f1381b;
                PackageManager packageManager = killSelfService.getPackageManager();
                Application application = killSelfService.getApplication();
                AbstractC5830k.m5326c(application, "application");
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(application.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(268435456);
                    launchIntentForPackage.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                    killSelfService.startActivity(launchIntentForPackage);
                    killSelfService.stopSelf();
                    return;
                }
                return;
            case 12:
                UnInstallActivity unInstallActivity = (UnInstallActivity) this.f1381b;
                if (unInstallActivity.isFinishing()) {
                    return;
                }
                unInstallActivity.finish();
                return;
            case 13:
                UnLoginActivity unLoginActivity = (UnLoginActivity) this.f1381b;
                if (unLoginActivity.isFinishing()) {
                    return;
                }
                unLoginActivity.finish();
                return;
            case 14:
                StatusView statusView = (StatusView) this.f1381b;
                View viewM3536a = statusView.m3536a(statusView.f4628a);
                if (viewM3536a != null) {
                    viewM3536a.startAnimation(statusView.f4634g);
                    statusView.f4634g.setAnimationListener(new C5677c(statusView, viewM3536a));
                }
                statusView.f4636i.removeCallbacks(statusView.f4637j);
                return;
            case 15:
                C6210a c6210a = (C6210a) ((C4150z0) this.f1381b).f3919b;
                if (c6210a.m5846c()) {
                    try {
                        Log.d("Mp3Recorder", "stop recording");
                        c6210a.m5844a();
                        return;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            case 16:
                C6380r c6380r = (C6380r) this.f1381b;
                VerticalTabLayout verticalTabLayout = c6380r.f10439h;
                int i10 = verticalTabLayout.f4966g;
                if (i10 == 5) {
                    c6380r.f10433b = c6380r.getWidth() - c6380r.f10439h.f4965f;
                } else if (i10 == 119) {
                    c6380r.f10435d = verticalTabLayout.f4965f;
                    verticalTabLayout.f4965f = c6380r.getWidth();
                }
                c6380r.invalidate();
                return;
            case 17:
                ExpandableTextView expandableTextView = (ExpandableTextView) this.f1381b;
                expandableTextView.f5005h = expandableTextView.getHeight() - expandableTextView.f4998a.getHeight();
                return;
            case 18:
                break;
            default:
                StickyNestedScrollView stickyNestedScrollView = (StickyNestedScrollView) this.f1381b;
                View view2 = stickyNestedScrollView.f3966b;
                if (view2 != null) {
                    int iM3436d = stickyNestedScrollView.m3436d(view2);
                    View view3 = stickyNestedScrollView.f3966b;
                    stickyNestedScrollView.getClass();
                    int bottom = view3.getBottom();
                    while (view3.getParent() != null && view3.getParent() != stickyNestedScrollView.getChildAt(0)) {
                        view3 = (View) view3.getParent();
                        bottom += view3.getBottom();
                    }
                    stickyNestedScrollView.invalidate(iM3436d, bottom, stickyNestedScrollView.m3437e(stickyNestedScrollView.f3966b), (int) (stickyNestedScrollView.f3966b.getHeight() + stickyNestedScrollView.f3967c + stickyNestedScrollView.getScrollY()));
                }
                stickyNestedScrollView.postDelayed(this, 16L);
                return;
        }
        while (true) {
            C6481c c6481c = (C6481c) this.f1381b;
            synchronized (c6481c) {
                abstractC6479aM6134c = c6481c.m6134c();
            }
            if (abstractC6479aM6134c == null) {
                return;
            }
            C6480b c6480b = abstractC6479aM6134c.f10648c;
            AbstractC5830k.m5327d(c6480b);
            C6481c c6481c2 = (C6481c) this.f1381b;
            boolean zIsLoggable = C6481c.f10657i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = System.nanoTime();
                AbstractC6683l.m6361a(abstractC6479aM6134c, c6480b, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                C6481c.m6132a(c6481c2, abstractC6479aM6134c);
                if (zIsLoggable) {
                    AbstractC6683l.m6361a(abstractC6479aM6134c, c6480b, "finished run in ".concat(AbstractC6683l.m6372l(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) c6481c2.f10658a.f10500a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        AbstractC6683l.m6361a(abstractC6479aM6134c, c6480b, "failed a run in ".concat(AbstractC6683l.m6372l(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }

    public RunnableC3059a(CharSequence charSequence) {
        this.f1380a = 4;
        C3404x c3404x = C3404x.f2187b;
        this.f1381b = charSequence;
    }
}
