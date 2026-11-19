package androidx.camera.core.impl.stabilization;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class StabilizationMode {
    public static final int OFF = 1;

    /* renamed from: ON */
    public static final int f618ON = 2;
    public static final int UNSPECIFIED = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Mode {
    }

    private StabilizationMode() {
    }
}
