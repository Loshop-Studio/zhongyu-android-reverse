package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p379vd.InterfaceC11594c;

/* loaded from: classes3.dex */
public interface WindowInfoTracker {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        private static final boolean DEBUG = false;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String TAG = AbstractC9983y.m20315b(WindowInfoTracker.class).mo20277f();
        private static WindowInfoTrackerDecorator decorator = EmptyDecorator.INSTANCE;

        private Companion() {
        }

        public final WindowInfoTracker getOrCreate(Context context) {
            AbstractC9979u.m20294g(context, "context");
            return decorator.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, windowBackend$window_release(context)));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void overrideDecorator(WindowInfoTrackerDecorator overridingDecorator) {
            AbstractC9979u.m20294g(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }

        public final WindowBackend windowBackend$window_release(Context context) {
            AbstractC9979u.m20294g(context, "context");
            ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = null;
            try {
                WindowLayoutComponent windowLayoutComponent = SafeWindowLayoutComponentProvider.INSTANCE.getWindowLayoutComponent();
                if (windowLayoutComponent != null) {
                    extensionWindowLayoutInfoBackend = new ExtensionWindowLayoutInfoBackend(windowLayoutComponent);
                }
            } catch (Throwable unused) {
            }
            return extensionWindowLayoutInfoBackend == null ? SidecarWindowBackend.Companion.getInstance(context) : extensionWindowLayoutInfoBackend;
        }
    }

    static WindowInfoTracker getOrCreate(Context context) {
        return Companion.getOrCreate(context);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static void overrideDecorator(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        Companion.overrideDecorator(windowInfoTrackerDecorator);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static void reset() {
        Companion.reset();
    }

    InterfaceC11594c windowLayoutInfo(Activity activity);
}
