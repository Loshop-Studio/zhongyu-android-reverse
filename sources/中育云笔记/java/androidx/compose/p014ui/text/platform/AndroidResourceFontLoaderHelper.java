package androidx.compose.p014ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
@RequiresApi(26)
/* loaded from: classes2.dex */
final class AndroidResourceFontLoaderHelper {
    public static final AndroidResourceFontLoaderHelper INSTANCE = new AndroidResourceFontLoaderHelper();

    private AndroidResourceFontLoaderHelper() {
    }

    @RequiresApi(26)
    public final Typeface create(Context context, int i10) {
        return context.getResources().getFont(i10);
    }
}
