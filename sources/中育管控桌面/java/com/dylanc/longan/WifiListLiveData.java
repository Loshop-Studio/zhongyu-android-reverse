package com.dylanc.longan;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import androidx.annotation.RequiresPermission;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p054f1.AbstractC6289a;

@Metadata(m7879d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u000f\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m7880d2 = {"Lcom/dylanc/longan/WifiListLiveData;", "Landroidx/lifecycle/LiveData;", "", "Landroid/net/wifi/ScanResult;", "<init>", "()V", "", "onActive", "onInactive", "Landroid/net/wifi/WifiManager;", "a", "Lkotlin/Lazy;", "c", "()Landroid/net/wifi/WifiManager;", "wifiManager", "com/dylanc/longan/WifiListLiveData$a", "b", "Lcom/dylanc/longan/WifiListLiveData$a;", "wifiScanReceiver", "longan"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class WifiListLiveData extends LiveData<List<? extends ScanResult>> {

    /* renamed from: a, reason: from kotlin metadata */
    public final Lazy wifiManager = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<WifiManager>() { // from class: com.dylanc.longan.WifiListLiveData$wifiManager$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WifiManager invoke() {
            Object systemService = AbstractC6289a.m6425a().getSystemService("wifi");
            if (systemService != null) {
                return (WifiManager) systemService;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        }
    });

    /* renamed from: b, reason: from kotlin metadata */
    public final C4846a wifiScanReceiver = new C4846a();

    /* renamed from: com.dylanc.longan.WifiListLiveData$a */
    public static final class C4846a extends BroadcastReceiver {
        public C4846a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (intent.getBooleanExtra("resultsUpdated", false)) {
                WifiListLiveData wifiListLiveData = WifiListLiveData.this;
                wifiListLiveData.setValue(wifiListLiveData.m3344c().getScanResults());
            }
        }
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"})
    public WifiListLiveData() {
    }

    /* renamed from: c */
    public final WifiManager m3344c() {
        return (WifiManager) this.wifiManager.getValue();
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        AbstractC6289a.m6425a().registerReceiver(this.wifiScanReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        AbstractC6289a.m6425a().unregisterReceiver(this.wifiScanReceiver);
    }
}
