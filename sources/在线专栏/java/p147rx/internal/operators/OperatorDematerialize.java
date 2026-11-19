package p147rx.internal.operators;

import p147rx.Notification;
import p147rx.Observable;
import p147rx.Subscriber;

/* loaded from: classes2.dex */
public final class OperatorDematerialize<T> implements Observable.Operator<T, Notification<T>> {

    /* renamed from: rx.internal.operators.OperatorDematerialize$2 */
    static /* synthetic */ class C31872 {
        static final /* synthetic */ int[] $SwitchMap$rx$Notification$Kind;

        static {
            int[] iArr = new int[Notification.Kind.values().length];
            $SwitchMap$rx$Notification$Kind = iArr;
            try {
                iArr[Notification.Kind.OnNext.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$rx$Notification$Kind[Notification.Kind.OnError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$rx$Notification$Kind[Notification.Kind.OnCompleted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static final class Holder {
        static final OperatorDematerialize<Object> INSTANCE = new OperatorDematerialize<>();

        Holder() {
        }
    }

    OperatorDematerialize() {
    }

    public static OperatorDematerialize instance() {
        return Holder.INSTANCE;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super Notification<T>> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<Notification<T>>(subscriber) { // from class: rx.internal.operators.OperatorDematerialize.1
            boolean terminated;

            @Override // p147rx.Observer
            public void onCompleted() {
                if (this.terminated) {
                    return;
                }
                this.terminated = true;
                subscriber.onCompleted();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                if (this.terminated) {
                    return;
                }
                this.terminated = true;
                subscriber.onError(th);
            }

            @Override // p147rx.Observer
            public void onNext(Notification<T> notification) {
                int i4 = C31872.$SwitchMap$rx$Notification$Kind[notification.getKind().ordinal()];
                if (i4 == 1) {
                    if (this.terminated) {
                        return;
                    }
                    subscriber.onNext(notification.getValue());
                } else {
                    if (i4 == 2) {
                        onError(notification.getThrowable());
                        return;
                    }
                    if (i4 == 3) {
                        onCompleted();
                        return;
                    }
                    onError(new IllegalArgumentException("Unsupported notification type: " + notification));
                }
            }
        };
    }
}
