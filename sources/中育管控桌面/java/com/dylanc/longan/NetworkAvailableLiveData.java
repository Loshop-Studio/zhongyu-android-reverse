package com.dylanc.longan;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresPermission;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LiveData;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p054f1.AbstractC6289a;

@Metadata(m7879d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0015\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR#\u0010\u0014\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m7880d2 = {"Lcom/dylanc/longan/NetworkAvailableLiveData;", "Landroidx/lifecycle/LiveData;", "", "<init>", "()V", "", "onActive", "onInactive", "value", "b", "(Z)V", "Landroid/net/ConnectivityManager;", "a", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/NetworkRequest;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "getNetworkRequest", "()Landroid/net/NetworkRequest;", "networkRequest", "com/dylanc/longan/NetworkAvailableLiveData$a", "c", "Lcom/dylanc/longan/NetworkAvailableLiveData$a;", "networkCallback", "longan"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class NetworkAvailableLiveData extends LiveData<Boolean> {

    /* renamed from: a, reason: from kotlin metadata */
    public final ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(AbstractC6289a.m6425a(), ConnectivityManager.class);

    /* renamed from: b, reason: from kotlin metadata */
    public final Lazy networkRequest = LazyKt.lazy(new Function0<NetworkRequest>() { // from class: com.dylanc.longan.NetworkAvailableLiveData$networkRequest$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkRequest invoke() {
            return new NetworkRequest.Builder().addTransportType(0).addTransportType(3).addTransportType(1).build();
        }
    });

    /* renamed from: c, reason: from kotlin metadata */
    public final C4845a networkCallback = new C4845a();

    /* renamed from: com.dylanc.longan.NetworkAvailableLiveData$a */
    public static final class C4845a extends ConnectivityManager.NetworkCallback {
        public C4845a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
            NetworkAvailableLiveData.this.postValue(Boolean.valueOf(networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            NetworkAvailableLiveData.this.postValue(Boolean.FALSE);
        }
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public NetworkAvailableLiveData() {
    }

    /* renamed from: b */
    public void m3339b(boolean value) {
        if (Intrinsics.areEqual(getValue(), Boolean.valueOf(value))) {
            return;
        }
        super.setValue(Boolean.valueOf(value));
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.registerDefaultNetworkCallback(this.networkCallback);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.networkCallback);
    }

    @Override // androidx.lifecycle.LiveData
    public /* bridge */ /* synthetic */ void setValue(Boolean bool) {
        m3339b(bool.booleanValue());
    }
}
