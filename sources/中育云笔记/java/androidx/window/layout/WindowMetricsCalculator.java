package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
public interface WindowMetricsCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static InterfaceC9540l decorator = new InterfaceC9540l() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$decorator$1
            @Override // p181hd.InterfaceC9540l
            public final WindowMetricsCalculator invoke(WindowMetricsCalculator it) {
                AbstractC9979u.m20294g(it, "it");
                return it;
            }
        };

        private Companion() {
        }

        public final WindowMetricsCalculator getOrCreate() {
            return (WindowMetricsCalculator) decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }

        @ExperimentalWindowApi
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void overrideDecorator(WindowMetricsCalculatorDecorator overridingDecorator) {
            AbstractC9979u.m20294g(overridingDecorator, "overridingDecorator");
            decorator = new WindowMetricsCalculator$Companion$overrideDecorator$1(overridingDecorator);
        }

        @ExperimentalWindowApi
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void reset() {
            decorator = new InterfaceC9540l() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$reset$1
                @Override // p181hd.InterfaceC9540l
                public final WindowMetricsCalculator invoke(WindowMetricsCalculator it) {
                    AbstractC9979u.m20294g(it, "it");
                    return it;
                }
            };
        }
    }

    static WindowMetricsCalculator getOrCreate() {
        return Companion.getOrCreate();
    }

    @ExperimentalWindowApi
    @RestrictTo({RestrictTo.Scope.TESTS})
    static void overrideDecorator(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        Companion.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    @ExperimentalWindowApi
    @RestrictTo({RestrictTo.Scope.TESTS})
    static void reset() {
        Companion.reset();
    }

    WindowMetrics computeCurrentWindowMetrics(Activity activity);

    WindowMetrics computeMaximumWindowMetrics(Activity activity);
}
