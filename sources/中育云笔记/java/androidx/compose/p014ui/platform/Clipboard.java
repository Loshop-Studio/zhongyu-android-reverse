package androidx.compose.p014ui.platform;

import android.content.ClipboardManager;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public interface Clipboard {
    Object getClipEntry(InterfaceC11588c<? super ClipEntry> interfaceC11588c);

    ClipboardManager getNativeClipboard();

    Object setClipEntry(ClipEntry clipEntry, InterfaceC11588c<? super C10786q> interfaceC11588c);
}
