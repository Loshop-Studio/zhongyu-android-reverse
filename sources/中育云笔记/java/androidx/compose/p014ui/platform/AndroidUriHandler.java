package androidx.compose.p014ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidUriHandler implements UriHandler {
    public static final int $stable = 8;
    private final Context context;

    public AndroidUriHandler(Context context) {
        this.context = context;
    }

    @Override // androidx.compose.p014ui.platform.UriHandler
    public void openUri(String str) {
        try {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e10) {
            throw new IllegalArgumentException("Can't open " + str + '.', e10);
        }
    }
}
