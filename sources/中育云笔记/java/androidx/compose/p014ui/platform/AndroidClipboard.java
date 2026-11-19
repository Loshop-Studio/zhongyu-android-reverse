package androidx.compose.p014ui.platform;

import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import p309qc.C10786q;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidClipboard implements Clipboard {
    public static final int $stable = 8;
    private final AndroidClipboardManager androidClipboardManager;

    public AndroidClipboard(AndroidClipboardManager androidClipboardManager) {
        this.androidClipboardManager = androidClipboardManager;
    }

    @Override // androidx.compose.p014ui.platform.Clipboard
    public Object getClipEntry(InterfaceC11588c<? super ClipEntry> interfaceC11588c) {
        return this.androidClipboardManager.getClip();
    }

    @Override // androidx.compose.p014ui.platform.Clipboard
    public ClipboardManager getNativeClipboard() {
        return this.androidClipboardManager.getNativeClipboard();
    }

    @Override // androidx.compose.p014ui.platform.Clipboard
    public Object setClipEntry(ClipEntry clipEntry, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        this.androidClipboardManager.setClip(clipEntry);
        return C10786q.f26013a;
    }

    public AndroidClipboard(Context context) {
        this(new AndroidClipboardManager(context));
    }
}
