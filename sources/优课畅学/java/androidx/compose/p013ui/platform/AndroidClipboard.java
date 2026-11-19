package androidx.compose.p013ui.platform;

import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidClipboard implements Clipboard {
    public static final int $stable = 8;
    private final AndroidClipboardManager androidClipboardManager;

    public AndroidClipboard(AndroidClipboardManager androidClipboardManager) {
        this.androidClipboardManager = androidClipboardManager;
    }

    @Override // androidx.compose.p013ui.platform.Clipboard
    public Object getClipEntry(InterfaceC9324c<? super ClipEntry> interfaceC9324c) {
        return this.androidClipboardManager.getClip();
    }

    @Override // androidx.compose.p013ui.platform.Clipboard
    public ClipboardManager getNativeClipboard() {
        return this.androidClipboardManager.getNativeClipboard();
    }

    @Override // androidx.compose.p013ui.platform.Clipboard
    public Object setClipEntry(ClipEntry clipEntry, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        this.androidClipboardManager.setClip(clipEntry);
        return C8736p.f16368a;
    }

    public AndroidClipboard(Context context) {
        this(new AndroidClipboardManager(context));
    }
}
