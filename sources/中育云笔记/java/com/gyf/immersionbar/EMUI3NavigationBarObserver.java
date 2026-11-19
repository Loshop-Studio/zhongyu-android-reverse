package com.gyf.immersionbar;

import android.app.Application;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.ArrayList;

/* loaded from: classes5.dex */
final class EMUI3NavigationBarObserver extends ContentObserver {
    private Application mApplication;
    private ArrayList<ImmersionCallback> mCallbacks;
    private Boolean mIsRegister;

    public static class NavigationBarObserverInstance {
        private static final EMUI3NavigationBarObserver INSTANCE = new EMUI3NavigationBarObserver();

        private NavigationBarObserverInstance() {
        }
    }

    public static EMUI3NavigationBarObserver getInstance() {
        return NavigationBarObserverInstance.INSTANCE;
    }

    public void addOnNavigationBarListener(ImmersionCallback immersionCallback) {
        if (immersionCallback == null) {
            return;
        }
        if (this.mCallbacks == null) {
            this.mCallbacks = new ArrayList<>();
        }
        if (this.mCallbacks.contains(immersionCallback)) {
            return;
        }
        this.mCallbacks.add(immersionCallback);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        ArrayList<ImmersionCallback> arrayList;
        super.onChange(z10);
        Application application = this.mApplication;
        if (application == null || application.getContentResolver() == null || (arrayList = this.mCallbacks) == null || arrayList.isEmpty()) {
            return;
        }
        int i10 = Settings.System.getInt(this.mApplication.getContentResolver(), "navigationbar_is_min", 0);
        ArrayList<ImmersionCallback> arrayList2 = this.mCallbacks;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            ImmersionCallback immersionCallback = arrayList2.get(i11);
            i11++;
            ImmersionCallback immersionCallback2 = immersionCallback;
            boolean z11 = true;
            if (i10 == 1) {
                z11 = false;
            }
            immersionCallback2.onNavigationBarChange(z11);
        }
    }

    public void register(Application application) {
        Uri uriFor;
        this.mApplication = application;
        if (application == null || application.getContentResolver() == null || this.mIsRegister.booleanValue() || (uriFor = Settings.System.getUriFor("navigationbar_is_min")) == null) {
            return;
        }
        this.mApplication.getContentResolver().registerContentObserver(uriFor, true, this);
        this.mIsRegister = Boolean.TRUE;
    }

    public void removeOnNavigationBarListener(ImmersionCallback immersionCallback) {
        ArrayList<ImmersionCallback> arrayList;
        if (immersionCallback == null || (arrayList = this.mCallbacks) == null) {
            return;
        }
        arrayList.remove(immersionCallback);
    }

    private EMUI3NavigationBarObserver() {
        super(new Handler(Looper.getMainLooper()));
        this.mIsRegister = Boolean.FALSE;
    }
}
