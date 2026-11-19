package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.Serializable;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
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
        final Throwable f8510e;

        public ErrorNotification(Throwable th) {
            this.f8510e = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return ObjectHelper.equals(this.f8510e, ((ErrorNotification) obj).f8510e);
            }
            return false;
        }

        public int hashCode() {
            return this.f8510e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f8510e + "]";
        }
    }

    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final InterfaceC7918d upstream;

        public SubscriptionNotification(InterfaceC7918d interfaceC7918d) {
            this.upstream = interfaceC7918d;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }
    }

    public static <T> boolean accept(Object obj, InterfaceC7917c interfaceC7917c) {
        if (obj == COMPLETE) {
            interfaceC7917c.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            interfaceC7917c.onError(((ErrorNotification) obj).f8510e);
            return true;
        }
        interfaceC7917c.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, InterfaceC7917c interfaceC7917c) {
        if (obj == COMPLETE) {
            interfaceC7917c.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            interfaceC7917c.onError(((ErrorNotification) obj).f8510e);
            return true;
        }
        if (obj instanceof SubscriptionNotification) {
            interfaceC7917c.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        }
        interfaceC7917c.onNext(obj);
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
        return ((ErrorNotification) obj).f8510e;
    }

    public static InterfaceC7918d getSubscription(Object obj) {
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

    public static <T> Object next(T t6) {
        return t6;
    }

    public static Object subscription(InterfaceC7918d interfaceC7918d) {
        return new SubscriptionNotification(interfaceC7918d);
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
            observer.onError(((ErrorNotification) obj).f8510e);
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
            observer.onError(((ErrorNotification) obj).f8510e);
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
