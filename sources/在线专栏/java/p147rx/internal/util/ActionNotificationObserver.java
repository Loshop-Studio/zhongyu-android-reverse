package p147rx.internal.util;

import p147rx.Notification;
import p147rx.Observer;
import p147rx.functions.Action1;

/* loaded from: classes2.dex */
public final class ActionNotificationObserver<T> implements Observer<T> {
    final Action1<Notification<? super T>> onNotification;

    public ActionNotificationObserver(Action1<Notification<? super T>> action1) {
        this.onNotification = action1;
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        this.onNotification.call(Notification.createOnCompleted());
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        this.onNotification.call(Notification.createOnError(th));
    }

    @Override // p147rx.Observer
    public void onNext(T t3) {
        this.onNotification.call(Notification.createOnNext(t3));
    }
}
