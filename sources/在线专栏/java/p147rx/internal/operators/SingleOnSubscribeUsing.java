package p147rx.internal.operators;

import java.util.Arrays;
import p147rx.Single;
import p147rx.SingleSubscriber;
import p147rx.exceptions.CompositeException;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Action1;
import p147rx.functions.Func0;
import p147rx.functions.Func1;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class SingleOnSubscribeUsing<T, Resource> implements Single.OnSubscribe<T> {
    final Action1<? super Resource> disposeAction;
    final boolean disposeEagerly;
    final Func0<Resource> resourceFactory;
    final Func1<? super Resource, ? extends Single<? extends T>> singleFactory;

    public SingleOnSubscribeUsing(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1, boolean z3) {
        this.resourceFactory = func0;
        this.singleFactory = func1;
        this.disposeAction = action1;
        this.disposeEagerly = z3;
    }

    void handleSubscriptionTimeError(SingleSubscriber<? super T> singleSubscriber, Resource resource, Throwable th) {
        Exceptions.throwIfFatal(th);
        if (this.disposeEagerly) {
            try {
                this.disposeAction.call(resource);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                th = new CompositeException(Arrays.asList(th, th2));
            }
        }
        singleSubscriber.onError(th);
        if (this.disposeEagerly) {
            return;
        }
        try {
            this.disposeAction.call(resource);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaHooks.onError(th3);
        }
    }

    @Override // p147rx.functions.Action1
    public void call(final SingleSubscriber<? super T> singleSubscriber) {
        try {
            final Resource resourceCall = this.resourceFactory.call();
            try {
                Single<? extends T> singleCall = this.singleFactory.call(resourceCall);
                if (singleCall == null) {
                    handleSubscriptionTimeError(singleSubscriber, resourceCall, new NullPointerException("The single"));
                    return;
                }
                SingleSubscriber<T> singleSubscriber2 = new SingleSubscriber<T>() { // from class: rx.internal.operators.SingleOnSubscribeUsing.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p147rx.SingleSubscriber
                    public void onError(Throwable th) {
                        SingleOnSubscribeUsing.this.handleSubscriptionTimeError(singleSubscriber, resourceCall, th);
                    }

                    @Override // p147rx.SingleSubscriber
                    public void onSuccess(T t3) {
                        SingleOnSubscribeUsing singleOnSubscribeUsing = SingleOnSubscribeUsing.this;
                        if (singleOnSubscribeUsing.disposeEagerly) {
                            try {
                                singleOnSubscribeUsing.disposeAction.call((Object) resourceCall);
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                singleSubscriber.onError(th);
                                return;
                            }
                        }
                        singleSubscriber.onSuccess(t3);
                        SingleOnSubscribeUsing singleOnSubscribeUsing2 = SingleOnSubscribeUsing.this;
                        if (singleOnSubscribeUsing2.disposeEagerly) {
                            return;
                        }
                        try {
                            singleOnSubscribeUsing2.disposeAction.call((Object) resourceCall);
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            RxJavaHooks.onError(th2);
                        }
                    }
                };
                singleSubscriber.add(singleSubscriber2);
                singleCall.subscribe((SingleSubscriber<? super Object>) singleSubscriber2);
            } catch (Throwable th) {
                handleSubscriptionTimeError(singleSubscriber, resourceCall, th);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            singleSubscriber.onError(th2);
        }
    }
}
