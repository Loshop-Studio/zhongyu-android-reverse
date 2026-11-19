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
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements LifecycleEventObserver {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC8724d cleaner$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.activity.ImmLeaksCleaner$Companion$cleaner$2
        @Override // p300x7.InterfaceC10559a
        public final ImmLeaksCleaner.Cleaner invoke() throws NoSuchFieldException, SecurityException {
            try {
                Field servedViewField = InputMethodManager.class.getDeclaredField("mServedView");
                servedViewField.setAccessible(true);
                Field nextServedViewField = InputMethodManager.class.getDeclaredField("mNextServedView");
                nextServedViewField.setAccessible(true);
                Field hField = InputMethodManager.class.getDeclaredField("mH");
                hField.setAccessible(true);
                AbstractC9133u.m16132f(hField, "hField");
                AbstractC9133u.m16132f(servedViewField, "servedViewField");
                AbstractC9133u.m16132f(nextServedViewField, "nextServedViewField");
                return new ImmLeaksCleaner.ValidCleaner(hField, servedViewField, nextServedViewField);
            } catch (NoSuchFieldException unused) {
                return ImmLeaksCleaner.FailedInitialization.INSTANCE;
            }
        }
    });
    private final Activity activity;

    public static abstract class Cleaner {
        public /* synthetic */ Cleaner(AbstractC9126n abstractC9126n) {
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
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
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
            AbstractC9133u.m16133g(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public Object getLock(InputMethodManager inputMethodManager) {
            AbstractC9133u.m16133g(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public View getServedView(InputMethodManager inputMethodManager) {
            AbstractC9133u.m16133g(inputMethodManager, "<this>");
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
            AbstractC9133u.m16133g(hField, "hField");
            AbstractC9133u.m16133g(servedViewField, "servedViewField");
            AbstractC9133u.m16133g(nextServedViewField, "nextServedViewField");
            this.hField = hField;
            this.servedViewField = servedViewField;
            this.nextServedViewField = nextServedViewField;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(InputMethodManager inputMethodManager) throws IllegalAccessException, IllegalArgumentException {
            AbstractC9133u.m16133g(inputMethodManager, "<this>");
            try {
                this.nextServedViewField.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public Object getLock(InputMethodManager inputMethodManager) {
            AbstractC9133u.m16133g(inputMethodManager, "<this>");
            try {
                return this.hField.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public View getServedView(InputMethodManager inputMethodManager) {
            AbstractC9133u.m16133g(inputMethodManager, "<this>");
            try {
                return (View) this.servedViewField.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public ImmLeaksCleaner(Activity activity) {
        AbstractC9133u.m16133g(activity, "activity");
        this.activity = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        AbstractC9133u.m16133g(source, "source");
        AbstractC9133u.m16133g(event, "event");
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        Object systemService = this.activity.getSystemService("input_method");
        AbstractC9133u.m16131e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
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
