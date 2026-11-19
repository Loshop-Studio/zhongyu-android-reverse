package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;

/* loaded from: classes5.dex */
public class AutoLifecycleFragment extends Fragment {

    /* renamed from: a */
    private final SparseArray<C7263a> f11507a = new SparseArray<>();

    /* renamed from: b */
    private boolean f11508b;

    /* renamed from: com.huawei.hms.common.internal.AutoLifecycleFragment$a */
    public static class C7263a {

        /* renamed from: a */
        public final HuaweiApiClient f11509a;

        /* renamed from: b */
        public final int f11510b;

        public C7263a(int i10, HuaweiApiClient huaweiApiClient) {
            this.f11509a = huaweiApiClient;
            this.f11510b = i10;
        }

        /* renamed from: a */
        public void m8457a() {
            this.f11509a.disconnect();
        }
    }

    public static AutoLifecycleFragment getInstance(Activity activity) {
        Preconditions.checkMainThread("Must be called on the main thread");
        try {
            AutoLifecycleFragment autoLifecycleFragment = (AutoLifecycleFragment) activity.getFragmentManager().findFragmentByTag("HmsAutoLifecycleFrag");
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (autoLifecycleFragment != null) {
                return autoLifecycleFragment;
            }
            AutoLifecycleFragment autoLifecycleFragment2 = new AutoLifecycleFragment();
            fragmentManager.beginTransaction().add(autoLifecycleFragment2, "HmsAutoLifecycleFrag").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return autoLifecycleFragment2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag HmsAutoLifecycleFrag is not a AutoLifecycleFragment", e10);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f11508b = true;
        for (int i10 = 0; i10 < this.f11507a.size(); i10++) {
            this.f11507a.valueAt(i10).f11509a.connect((Activity) null);
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f11508b = false;
        for (int i10 = 0; i10 < this.f11507a.size(); i10++) {
            this.f11507a.valueAt(i10).f11509a.disconnect();
        }
    }

    public void startAutoMange(int i10, HuaweiApiClient huaweiApiClient) {
        Preconditions.checkNotNull(huaweiApiClient, "HuaweiApiClient instance cannot be null");
        Preconditions.checkState(this.f11507a.indexOfKey(i10) < 0, "Already managing a HuaweiApiClient with this clientId: " + i10);
        this.f11507a.put(i10, new C7263a(i10, huaweiApiClient));
        if (this.f11508b) {
            huaweiApiClient.connect((Activity) null);
        }
    }

    public void stopAutoManage(int i10) {
        C7263a c7263a = this.f11507a.get(i10);
        this.f11507a.remove(i10);
        if (c7263a != null) {
            c7263a.m8457a();
        }
    }
}
