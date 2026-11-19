package androidx.compose.p014ui.text.font;

import android.content.Context;
import androidx.compose.p014ui.text.font.Font;
import androidx.compose.p014ui.text.font.FontFamily;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class DelegatingFontLoaderForDeprecatedUsage_androidKt {
    @InterfaceC10770a
    public static final FontFamily.Resolver createFontFamilyResolver(Font.ResourceLoader resourceLoader, Context context) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForBridgeUsage(resourceLoader, context.getApplicationContext()), null, null, null, null, 30, null);
    }

    @InterfaceC10770a
    public static final FontFamily.Resolver createFontFamilyResolver(Font.ResourceLoader resourceLoader) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForDeprecatedUsage(resourceLoader), null, null, null, null, 30, null);
    }
}
