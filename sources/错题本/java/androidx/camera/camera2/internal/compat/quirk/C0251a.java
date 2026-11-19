package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.core.impl.QuirkSettings;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Consumer;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0251a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f249a;

    public /* synthetic */ C0251a(int i) {
        this.f249a = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f249a) {
            case 0:
                DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
            case 1:
                androidx.camera.core.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
            case 2:
                androidx.camera.video.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
            case 3:
                IntentSanitizer.lambda$sanitizeByThrowing$1((String) obj);
                break;
            case 4:
                IntentSanitizer.lambda$sanitizeByFiltering$0((String) obj);
                break;
            default:
                androidx.camera.view.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
        }
    }
}
