package anetwork.channel.aidl.adapter;

import android.os.RemoteException;
import anet.channel.util.ALog;
import anetwork.channel.Response;
import anetwork.channel.aidl.ParcelableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: anetwork.channel.aidl.adapter.a */
/* loaded from: classes3.dex */
public class FutureC5095a implements Future<Response> {

    /* renamed from: a */
    private ParcelableFuture f2798a;

    /* renamed from: b */
    private Response f2799b;

    public FutureC5095a(ParcelableFuture parcelableFuture) {
        this.f2798a = parcelableFuture;
    }

    @Override // java.util.concurrent.Future
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Response get() {
        Response response = this.f2799b;
        if (response != null) {
            return response;
        }
        ParcelableFuture parcelableFuture = this.f2798a;
        if (parcelableFuture != null) {
            try {
                return parcelableFuture.get(20000L);
            } catch (RemoteException e10) {
                ALog.m2531w("anet.FutureResponse", "[get]", null, e10, new Object[0]);
            }
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        ParcelableFuture parcelableFuture = this.f2798a;
        if (parcelableFuture == null) {
            return false;
        }
        try {
            return parcelableFuture.cancel(z10);
        } catch (RemoteException e10) {
            ALog.m2531w("anet.FutureResponse", "[cancel]", null, e10, new Object[0]);
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        try {
            return this.f2798a.isCancelled();
        } catch (RemoteException e10) {
            ALog.m2531w("anet.FutureResponse", "[isCancelled]", null, e10, new Object[0]);
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        try {
            return this.f2798a.isDone();
        } catch (RemoteException e10) {
            ALog.m2531w("anet.FutureResponse", "[isDone]", null, e10, new Object[0]);
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public /* synthetic */ Response get(long j10, TimeUnit timeUnit) {
        return m2562a(j10);
    }

    public FutureC5095a(Response response) {
        this.f2799b = response;
    }

    /* renamed from: a */
    public Response m2562a(long j10) {
        Response response = this.f2799b;
        if (response != null) {
            return response;
        }
        ParcelableFuture parcelableFuture = this.f2798a;
        if (parcelableFuture != null) {
            try {
                return parcelableFuture.get(j10);
            } catch (RemoteException e10) {
                ALog.m2531w("anet.FutureResponse", "[get(long timeout, TimeUnit unit)]", null, e10, new Object[0]);
            }
        }
        return null;
    }
}
