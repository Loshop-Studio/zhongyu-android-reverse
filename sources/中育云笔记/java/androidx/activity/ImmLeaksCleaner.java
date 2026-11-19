package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements LifecycleEventObserver {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC10773d cleaner$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.activity.ImmLeaksCleaner$Companion$cleaner$2
        @Override // p181hd.InterfaceC9529a
        public final ImmLeaksCleaner.Cleaner invoke() throws NoSuchFieldException, SecurityException {
            try {
                Field servedViewField = InputMethodManager.class.getDeclaredField("mServedView");
                servedViewField.setAccessible(true);
                Field nextServedViewField = InputMethodManager.class.getDeclaredField("mNextServedView");
                nextServedViewField.setAccessible(true);
                Field hField = InputMethodManager.class.getDeclaredField("mH");
                hField.setAccessible(true);
                AbstractC9979u.m20293f(hField, "hField");
                AbstractC9979u.m20293f(servedViewField, "servedViewField");
                AbstractC9979u.m20293f(nextServedViewField, "nextServedViewField");
                return new ImmLeaksCleaner.ValidCleaner(hField, servedViewField, nextServedViewField);
            } catch (NoSuchFieldException unused) {
                return ImmLeaksCleaner.FailedInitialization.INSTANCE;
            }
        }
    });
    private final Activity activity;

    public static abstract class Cleaner {
        public /* synthetic */ Cleaner(AbstractC9972n abstractC9972n) {
            this();
        }

        public abstract boolean clearNextServedView(InputMethodManager inputMethodManager);

        public abstract Object getLock(InputMethodManager inputMethodManager);

        public abstract View getServedView(InputMethodManager inputMethodManager);

        private Cleaner() {
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Cleaner getCleaner() {
            return (Cleaner) ImmLeaksCleaner.cleaner$delegate.getValue();
        }

        private Companion() {
        }
    }

    public static final class FailedInitialization extends Cleaner {
        public static final FailedInitialization INSTANCE = new FailedInitialization();

        private FailedInitialization() {
            super(null);
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(InputMethodManager inputMethodManager) {
            AbstractC9979u.m20294g(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public Object getLock(InputMethodManager inputMethodManager) {
            AbstractC9979u.m20294g(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public View getServedView(InputMethodManager inputMethodManager) {
            AbstractC9979u.m20294g(inputMethodManager, "<this>");
            return null;
        }
    }

    public static final class ValidCleaner extends Cleaner {
        private final Field hField;
        private final Field nextServedViewField;
        private final Field servedViewField;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidCleaner(Field hField, Field servedViewField, Field nextServedViewField) {
            super(null);
            AbstractC9979u.m20294g(hField, "hField");
            AbstractC9979u.m20294g(servedViewField, "servedViewField");
            AbstractC9979u.m20294g(nextServedViewField, "nextServedViewField");
            this.hField = hField;
            this.servedViewField = servedViewField;
            this.nextServedViewField = nextServedViewField;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(InputMethodManager inputMethodManager) throws IllegalAccessException, IllegalArgumentException {
            AbstractC9979u.m20294g(inputMethodManager, "<this>");
            try {
                this.nextServedViewField.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public Object getLock(InputMethodManager inputMethodManager) {
            AbstractC9979u.m20294g(inputMethodManager, "<this>");
            try {
                return this.hField.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public View getServedView(InputMethodManager inputMethodManager) {
            AbstractC9979u.m20294g(inputMethodManager, "<this>");
            try {
                return (View) this.servedViewField.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public ImmLeaksCleaner(Activity activity) {
        AbstractC9979u.m20294g(activity, "activity");
        this.activity = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(event, "event");
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        Object systemService = this.activity.getSystemService("input_method");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        Cleaner cleaner = Companion.getCleaner();
        Object lock = cleaner.getLock(inputMethodManager);
        if (lock == null) {
            return;
        }
        synchronized (lock) {
            View servedView = cleaner.getServedView(inputMethodManager);
            if (servedView == null) {
                return;
            }
            if (servedView.isAttachedToWindow()) {
                return;
            }
            boolean zClearNextServedView = cleaner.clearNextServedView(inputMethodManager);
            if (zClearNextServedView) {
                inputMethodManager.isActive();
            }
        }
    }
}
