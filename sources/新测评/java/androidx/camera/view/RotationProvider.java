package androidx.camera.view;

import android.content.Context;
import android.view.OrientationEventListener;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.view.RotationProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class RotationProvider {

    @NonNull
    @GuardedBy("mLock")
    @VisibleForTesting
    final OrientationEventListener mOrientationListener;
    final Object mLock = new Object();

    @NonNull
    @GuardedBy("mLock")
    final Map<Listener, ListenerWrapper> mListeners = new HashMap();

    @VisibleForTesting
    boolean mIgnoreCanDetectForTest = false;

    public interface Listener {
        void onRotationChanged(int i10);
    }

    public static class ListenerWrapper {
        private final AtomicBoolean mEnabled = new AtomicBoolean(true);
        private final Executor mExecutor;
        private final Listener mListener;

        public ListenerWrapper(Listener listener, Executor executor) {
            this.mListener = listener;
            this.mExecutor = executor;
        }

        /* renamed from: a */
        public static /* synthetic */ void m1023a(ListenerWrapper listenerWrapper, int i10) {
            if (listenerWrapper.mEnabled.get()) {
                listenerWrapper.mListener.onRotationChanged(i10);
            }
        }

        public void disable() {
            this.mEnabled.set(false);
        }

        public void onRotationChanged(final int i10) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.view.v
                @Override // java.lang.Runnable
                public final void run() {
                    RotationProvider.ListenerWrapper.m1023a(this.f1215a, i10);
                }
            });
        }
    }

    public RotationProvider(@NonNull Context context) {
        this.mOrientationListener = new OrientationEventListener(context) { // from class: androidx.camera.view.RotationProvider.1
            private static final int INVALID_SURFACE_ROTATION = -1;
            private int mRotation = -1;

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i10) {
                int iOrientationToSurfaceRotation;
                ArrayList arrayList;
                if (i10 == -1 || this.mRotation == (iOrientationToSurfaceRotation = RotationProvider.orientationToSurfaceRotation(i10))) {
                    return;
                }
                this.mRotation = iOrientationToSurfaceRotation;
                synchronized (RotationProvider.this.mLock) {
                    arrayList = new ArrayList(RotationProvider.this.mListeners.values());
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((ListenerWrapper) obj).onRotationChanged(iOrientationToSurfaceRotation);
                }
            }
        };
    }

    @VisibleForTesting
    public static int orientationToSurfaceRotation(int i10) {
        if (i10 >= 315 || i10 < 45) {
            return 0;
        }
        if (i10 >= 225) {
            return 1;
        }
        return i10 >= 135 ? 2 : 3;
    }

    @CheckResult
    public boolean addListener(@NonNull Executor executor, @NonNull Listener listener) {
        synchronized (this.mLock) {
            try {
                if (!this.mOrientationListener.canDetectOrientation() && !this.mIgnoreCanDetectForTest) {
                    return false;
                }
                this.mListeners.put(listener, new ListenerWrapper(listener, executor));
                this.mOrientationListener.enable();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeListener(@NonNull Listener listener) {
        synchronized (this.mLock) {
            try {
                ListenerWrapper listenerWrapper = this.mListeners.get(listener);
                if (listenerWrapper != null) {
                    listenerWrapper.disable();
                    this.mListeners.remove(listener);
                }
                if (this.mListeners.isEmpty()) {
                    this.mOrientationListener.disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
