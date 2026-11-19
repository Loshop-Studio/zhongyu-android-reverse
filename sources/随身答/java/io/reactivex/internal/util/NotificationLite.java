package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.Serializable;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public enum NotificationLite {
    COMPLETE;

    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final Disposable upstream;

        public DisposableNotification(Disposable disposable) {
            this.upstream = disposable;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }
    }

    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e */
        final Throwable f14202e;

        public ErrorNotification(Throwable th) {
            this.f14202e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return ObjectHelper.equals(this.f14202e, ((ErrorNotification) obj).f14202e);
            }
            return false;
        }

        public int hashCode() {
            return this.f14202e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f14202e + "]";
        }
    }

    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final InterfaceC0051d upstream;

        public SubscriptionNotification(InterfaceC0051d interfaceC0051d) {
            this.upstream = interfaceC0051d;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }
    }

    public static <T> boolean accept(Object obj, InterfaceC0050c interfaceC0050c) {
        if (obj == COMPLETE) {
            interfaceC0050c.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            interfaceC0050c.onError(((ErrorNotification) obj).f14202e);
            return true;
        }
        interfaceC0050c.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, InterfaceC0050c interfaceC0050c) {
        if (obj == COMPLETE) {
            interfaceC0050c.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            interfaceC0050c.onError(((ErrorNotification) obj).f14202e);
            return true;
        }
        if (obj instanceof SubscriptionNotification) {
            interfaceC0050c.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        }
        interfaceC0050c.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Disposable getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).f14202e;
    }

    public static InterfaceC0051d getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).upstream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static <T> Object next(T t9) {
        return t9;
    }

    public static Object subscription(InterfaceC0051d interfaceC0051d) {
        return new SubscriptionNotification(interfaceC0051d);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f14202e);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f14202e);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            observer.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        }
        observer.onNext(obj);
        return false;
    }
}
