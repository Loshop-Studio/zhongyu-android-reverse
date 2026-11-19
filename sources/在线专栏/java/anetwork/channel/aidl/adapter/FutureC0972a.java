package anetwork.channel.aidl.adapter;

import android.os.RemoteException;
import anet.channel.util.ALog;
import anetwork.channel.Response;
import anetwork.channel.aidl.ParcelableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: anetwork.channel.aidl.adapter.a */
/* loaded from: classes.dex */
public class FutureC0972a implements Future<Response> {

    /* renamed from: a */
    private ParcelableFuture f5520a;

    /* renamed from: b */
    private Response f5521b;

    public FutureC0972a(ParcelableFuture parcelableFuture) {
        this.f5520a = parcelableFuture;
    }

    @Override // java.util.concurrent.Future
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Response get() throws ExecutionException, InterruptedException {
        Response response = this.f5521b;
        if (response != null) {
            return response;
        }
        ParcelableFuture parcelableFuture = this.f5520a;
        if (parcelableFuture != null) {
            try {
                return parcelableFuture.get(20000L);
            } catch (RemoteException e4) {
                ALog.m4640w("anet.FutureResponse", "[get]", null, e4, new Object[0]);
            }
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        ParcelableFuture parcelableFuture = this.f5520a;
        if (parcelableFuture == null) {
            return false;
        }
        try {
            return parcelableFuture.cancel(z3);
        } catch (RemoteException e4) {
            ALog.m4640w("anet.FutureResponse", "[cancel]", null, e4, new Object[0]);
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        try {
            return this.f5520a.isCancelled();
        } catch (RemoteException e4) {
            ALog.m4640w("anet.FutureResponse", "[isCancelled]", null, e4, new Object[0]);
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        try {
            return this.f5520a.isDone();
        } catch (RemoteException e4) {
            ALog.m4640w("anet.FutureResponse", "[isDone]", null, e4, new Object[0]);
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public /* synthetic */ Response get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return m4671a(j4);
    }

    public FutureC0972a(Response response) {
        this.f5521b = response;
    }

    /* renamed from: a */
    public Response m4671a(long j4) throws ExecutionException, InterruptedException, TimeoutException {
        Response response = this.f5521b;
        if (response != null) {
            return response;
        }
        ParcelableFuture parcelableFuture = this.f5520a;
        if (parcelableFuture != null) {
            try {
                return parcelableFuture.get(j4);
            } catch (RemoteException e4) {
                ALog.m4640w("anet.FutureResponse", "[get(long timeout, TimeUnit unit)]", null, e4, new Object[0]);
            }
        }
        return null;
    }
}
