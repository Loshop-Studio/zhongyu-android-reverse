package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class DeferrableSurfaces {
    private DeferrableSurfaces() {
    }

    /* renamed from: a */
    public static /* synthetic */ Object m797a(final ListenableFuture listenableFuture, Executor executor, final boolean z9, Collection collection, final CallbackToFutureAdapter.Completer completer) {
        completer.addCancellationListener(new Runnable() { // from class: androidx.camera.core.impl.m
            @Override // java.lang.Runnable
            public final void run() {
                listenableFuture.cancel(true);
            }
        }, executor);
        Futures.addCallback(listenableFuture, new FutureCallback<List<Surface>>() { // from class: androidx.camera.core.impl.DeferrableSurfaces.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th) {
                if (th instanceof TimeoutException) {
                    completer.setException(th);
                } else {
                    completer.set(Collections.EMPTY_LIST);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable List<Surface> list) {
                Preconditions.checkNotNull(list);
                ArrayList arrayList = new ArrayList(list);
                if (z9) {
                    arrayList.removeAll(Collections.singleton(null));
                }
                completer.set(arrayList);
            }
        }, executor);
        return "surfaceList[" + collection + "]";
    }

    public static void decrementAll(@NonNull List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().decrementUseCount();
        }
    }

    public static void incrementAll(@NonNull List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        do {
            try {
                list.get(i10).incrementUseCount();
                i10++;
            } catch (DeferrableSurface.SurfaceClosedException e10) {
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    list.get(i11).decrementUseCount();
                }
                throw e10;
            }
        } while (i10 < list.size());
    }

    @NonNull
    public static ListenableFuture<List<Surface>> surfaceListWithTimeout(@NonNull final Collection<DeferrableSurface> collection, final boolean z9, long j10, @NonNull final Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Futures.nonCancellationPropagating(it.next().getSurface()));
        }
        final ListenableFuture listenableFutureMakeTimeoutFuture = Futures.makeTimeoutFuture(j10, scheduledExecutorService, Futures.successfulAsList(arrayList));
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.n
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DeferrableSurfaces.m797a(listenableFutureMakeTimeoutFuture, executor, z9, collection, completer);
            }
        });
    }

    public static boolean tryIncrementAll(@NonNull List<DeferrableSurface> list) {
        try {
            incrementAll(list);
            return true;
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }
}
