package com.zykj.message.client;

import android.os.Parcel;
import com.zykj.message.client.MessageClient;
import p028c4.AbstractBinderC3223a;
import p043d4.C5420b;
import p043d4.InterfaceC5422d;

/* renamed from: com.zykj.message.client.i0 */
/* loaded from: classes3.dex */
public final class RunnableC4438i0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f5701a;

    /* renamed from: b */
    public final /* synthetic */ AbstractBinderC3223a f5702b;

    public RunnableC4438i0(MessageClient.INSTANCES instances, AbstractBinderC3223a abstractBinderC3223a) {
        this.f5701a = instances;
        this.f5702b = abstractBinderC3223a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5422d remoteServer = this.f5701a.getRemoteServer();
        if (remoteServer != null) {
            C5420b c5420b = (C5420b) remoteServer;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                AbstractBinderC3223a abstractBinderC3223a = this.f5702b;
                if (abstractBinderC3223a == null) {
                    abstractBinderC3223a = null;
                }
                parcelObtain.writeStrongBinder(abstractBinderC3223a);
                c5420b.f8385c.transact(6, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }
}
