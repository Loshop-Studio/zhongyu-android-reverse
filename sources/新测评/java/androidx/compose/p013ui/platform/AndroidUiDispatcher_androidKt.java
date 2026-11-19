package androidx.compose.p013ui.platform;

import android.os.Looper;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002¨\u0006\u0002"}, m13558d2 = {"isMainThread", "", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class AndroidUiDispatcher_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
