package retrofit2.adapter.rxjava;

import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes.dex */
final class CallEnqueueOnSubscribe<T> implements Observable.OnSubscribe<Response<T>> {
    private final Call<T> originalCall;

    CallEnqueueOnSubscribe(Call<T> call) {
        this.originalCall = call;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super Response<T>> subscriber) {
        Call<T> callClone = this.originalCall.clone();
        final CallArbiter callArbiter = new CallArbiter(callClone, subscriber);
        subscriber.add(callArbiter);
        subscriber.setProducer(callArbiter);
        callClone.enqueue(new Callback<T>() { // from class: retrofit2.adapter.rxjava.CallEnqueueOnSubscribe.1
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call, Throwable th) {
                Exceptions.throwIfFatal(th);
                callArbiter.emitError(th);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call, Response<T> response) {
                callArbiter.emitResponse(response);
            }
        });
    }
}
