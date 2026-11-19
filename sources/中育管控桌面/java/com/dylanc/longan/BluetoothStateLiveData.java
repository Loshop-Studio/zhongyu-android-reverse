package com.dylanc.longan;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RequiresPermission;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p054f1.AbstractC6289a;

@Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB!\b\u0007\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nR\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\b\u0018\u00010\u000eR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m7880d2 = {"Lcom/dylanc/longan/BluetoothStateLiveData;", "Landroidx/lifecycle/LiveData;", "", "Lkotlin/Function1;", "Landroid/bluetooth/BluetoothDevice;", "filter", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "onActive", "()V", "onInactive", "a", "Lkotlin/jvm/functions/Function1;", "Lcom/dylanc/longan/BluetoothStateLiveData$a;", "b", "Lcom/dylanc/longan/BluetoothStateLiveData$a;", "receiver", "longan"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class BluetoothStateLiveData extends LiveData<Boolean> {

    /* renamed from: a, reason: from kotlin metadata */
    public final Function1 filter;

    /* renamed from: b, reason: from kotlin metadata */
    public C4844a receiver;

    /* renamed from: com.dylanc.longan.BluetoothStateLiveData$a */
    public final class C4844a extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ BluetoothStateLiveData f3261a;

        public C4844a(BluetoothStateLiveData this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f3261a = this$0;
        }

        /* renamed from: a */
        public final BluetoothDevice m3333a(Intent intent) {
            return (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        }

        /* renamed from: b */
        public final int m3334b(Intent intent) {
            return intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Function1 function1;
            Function1 function12;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -1530327060) {
                    if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                        int iM3334b = m3334b(intent);
                        if (iM3334b == 10) {
                            this.f3261a.setValue(Boolean.FALSE);
                            return;
                        } else {
                            if (iM3334b == 12 && this.f3261a.filter == null) {
                                this.f3261a.setValue(Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (iHashCode == -301431627) {
                    if (action.equals("android.bluetooth.device.action.ACL_CONNECTED") && (function1 = this.f3261a.filter) != null) {
                        BluetoothDevice bluetoothDeviceM3333a = m3333a(intent);
                        Intrinsics.checkNotNull(bluetoothDeviceM3333a);
                        if (((Boolean) function1.invoke(bluetoothDeviceM3333a)).booleanValue()) {
                            this.f3261a.setValue(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (iHashCode == 1821585647 && action.equals("android.bluetooth.device.action.ACL_DISCONNECTED") && (function12 = this.f3261a.filter) != null) {
                    BluetoothDevice bluetoothDeviceM3333a2 = m3333a(intent);
                    Intrinsics.checkNotNull(bluetoothDeviceM3333a2);
                    if (((Boolean) function12.invoke(bluetoothDeviceM3333a2)).booleanValue()) {
                        this.f3261a.setValue(Boolean.FALSE);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RequiresPermission("android.permission.BLUETOOTH")
    public BluetoothStateLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        if (this.filter != null) {
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_OFF");
            intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_ON");
        }
        this.receiver = new C4844a(this);
        AbstractC6289a.m6425a().registerReceiver(this.receiver, intentFilter);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        AbstractC6289a.m6425a().unregisterReceiver(this.receiver);
        this.receiver = null;
    }

    public /* synthetic */ BluetoothStateLiveData(Function1 function1, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : function1);
    }

    public BluetoothStateLiveData(Function1 function1) {
        this.filter = function1;
    }
}
