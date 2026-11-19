package androidx.camera.view.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.view.internal.compat.quirk.DeviceQuirks;
import androidx.core.util.Consumer;

/* loaded from: classes.dex */
public class DeviceQuirks {
    private static final String TAG = "DeviceQuirks";

    @NonNull
    private static volatile Quirks sQuirks;

    static {
        QuirkSettingsHolder.instance().observe(CameraXExecutors.directExecutor(), new Consumer() { // from class: e.a
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DeviceQuirks.m811a((QuirkSettings) obj);
            }
        });
    }

    private DeviceQuirks() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m811a(QuirkSettings quirkSettings) {
        sQuirks = new Quirks(DeviceQuirksLoader.loadQuirks(quirkSettings));
        Logger.m501d(TAG, "view DeviceQuirks = " + Quirks.toString(sQuirks));
    }

    @Nullable
    public static <T extends Quirk> T get(@NonNull Class<T> cls) {
        return (T) sQuirks.get(cls);
    }
}
