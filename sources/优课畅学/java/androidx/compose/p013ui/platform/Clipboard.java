package androidx.compose.p013ui.platform;

import android.content.ClipboardManager;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* loaded from: classes2.dex */
public interface Clipboard {
    Object getClipEntry(InterfaceC9324c<? super ClipEntry> interfaceC9324c);

    ClipboardManager getNativeClipboard();

    Object setClipEntry(ClipEntry clipEntry, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
