package p070b.p146d.p152b;

import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* renamed from: b.d.b.d */
/* loaded from: classes.dex */
public final class C0897d extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage != null) {
            Log.d("MainActivity", ((Object) consoleMessage.message()) + " -- From line " + consoleMessage.lineNumber() + " of " + ((Object) consoleMessage.sourceId()));
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
