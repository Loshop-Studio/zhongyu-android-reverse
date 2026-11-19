package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Consumer;

/* loaded from: classes.dex */
public class DeviceQuirks {
    private static final String TAG = "DeviceQuirks";

    @NonNull
    private static volatile Quirks sQuirks;

    static {
        QuirkSettingsHolder.instance().observe(CameraXExecutors.directExecutor(), new Consumer() { // from class: androidx.camera.camera2.internal.compat.quirk.a
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DeviceQuirks.m458a((QuirkSettings) obj);
            }
        });
    }

    private DeviceQuirks() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m458a(QuirkSettings quirkSettings) {
        sQuirks = new Quirks(DeviceQuirksLoader.loadQuirks(quirkSettings));
        Logger.m501d(TAG, "camera2 DeviceQuirks = " + Quirks.toString(sQuirks));
    }

    @Nullable
    public static <T extends Quirk> T get(@NonNull Class<T> cls) {
        return (T) sQuirks.get(cls);
    }

    @NonNull
    public static Quirks getAll() {
        return sQuirks;
    }
}
