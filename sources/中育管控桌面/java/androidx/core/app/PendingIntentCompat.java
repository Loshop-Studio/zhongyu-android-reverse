package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class PendingIntentCompat {

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void send(PendingIntent pendingIntent, Context context, int i6, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i6, intent, onFinished, handler, str, bundle);
        }
    }

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static PendingIntent getForegroundService(Context context, int i6, Intent intent, int i7) {
            return PendingIntent.getForegroundService(context, i6, intent, i7);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface Flags {
    }

    public static class GatedCallback implements Closeable {
        private PendingIntent.OnFinished mCallback;
        private final CountDownLatch mComplete = new CountDownLatch(1);
        private boolean mSuccess = false;

        public GatedCallback(PendingIntent.OnFinished onFinished) {
            this.mCallback = onFinished;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i6, String str, Bundle bundle) {
            boolean z6 = false;
            while (true) {
                try {
                    this.mComplete.await();
                    break;
                } catch (InterruptedException unused) {
                    z6 = true;
                    pendingIntent = pendingIntent;
                    intent = intent;
                    i6 = i6;
                    str = str;
                    bundle = bundle;
                } catch (Throwable th) {
                    if (!z6) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.mCallback;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i6, str, bundle);
                this.mCallback = null;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.mSuccess) {
                this.mCallback = null;
            }
            this.mComplete.countDown();
        }

        public void complete() {
            this.mSuccess = true;
        }

        public PendingIntent.OnFinished getCallback() {
            if (this.mCallback == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: androidx.core.app.r
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i6, String str, Bundle bundle) {
                    this.f394a.onSendFinished(pendingIntent, intent, i6, str, bundle);
                }
            };
        }
    }

    private PendingIntentCompat() {
    }

    public static int addMutabilityFlags(boolean z6, int i6) {
        int i7;
        if (!z6) {
            i7 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i6;
            }
            i7 = 33554432;
        }
        return i7 | i6;
    }

    public static PendingIntent getActivities(Context context, int i6, @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i7, Bundle bundle, boolean z6) {
        return PendingIntent.getActivities(context, i6, intentArr, addMutabilityFlags(z6, i7), bundle);
    }

    public static PendingIntent getActivity(Context context, int i6, Intent intent, int i7, boolean z6) {
        return PendingIntent.getActivity(context, i6, intent, addMutabilityFlags(z6, i7));
    }

    public static PendingIntent getBroadcast(Context context, int i6, Intent intent, int i7, boolean z6) {
        return PendingIntent.getBroadcast(context, i6, intent, addMutabilityFlags(z6, i7));
    }

    @RequiresApi(26)
    public static PendingIntent getForegroundService(Context context, int i6, Intent intent, int i7, boolean z6) {
        return Api26Impl.getForegroundService(context, i6, intent, addMutabilityFlags(z6, i7));
    }

    public static PendingIntent getService(Context context, int i6, Intent intent, int i7, boolean z6) {
        return PendingIntent.getService(context, i6, intent, addMutabilityFlags(z6, i7));
    }

    @SuppressLint({"LambdaLast"})
    public static void send(PendingIntent pendingIntent, int i6, PendingIntent.OnFinished onFinished, Handler handler) {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            pendingIntent.send(i6, gatedCallback.getCallback(), handler);
            gatedCallback.complete();
            gatedCallback.close();
        } catch (Throwable th) {
            try {
                gatedCallback.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static PendingIntent getActivities(Context context, int i6, @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i7, boolean z6) {
        return PendingIntent.getActivities(context, i6, intentArr, addMutabilityFlags(z6, i7));
    }

    public static PendingIntent getActivity(Context context, int i6, Intent intent, int i7, Bundle bundle, boolean z6) {
        return PendingIntent.getActivity(context, i6, intent, addMutabilityFlags(z6, i7), bundle);
    }

    @SuppressLint({"LambdaLast"})
    public static void send(PendingIntent pendingIntent, @SuppressLint({"ContextFirst"}) Context context, int i6, Intent intent, PendingIntent.OnFinished onFinished, Handler handler) {
        send(pendingIntent, context, i6, intent, onFinished, handler, null, null);
    }

    @SuppressLint({"LambdaLast"})
    public static void send(PendingIntent pendingIntent, @SuppressLint({"ContextFirst"}) Context context, int i6, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            Api23Impl.send(pendingIntent, context, i6, intent, onFinished, handler, str, bundle);
            gatedCallback.complete();
            gatedCallback.close();
        } finally {
        }
    }
}
