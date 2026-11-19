package androidx.compose.p014ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes2.dex */
final class AndroidFontResourceLoaderHelper {
    public static final AndroidFontResourceLoaderHelper INSTANCE = new AndroidFontResourceLoaderHelper();

    private AndroidFontResourceLoaderHelper() {
    }

    @RequiresApi(26)
    public final Typeface create(Context context, int i10) {
        return context.getResources().getFont(i10);
    }
}
