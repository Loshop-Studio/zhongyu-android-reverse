package androidx.compose.p013ui.text.font;

import android.content.Context;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m13558d2 = {"AndroidFontResolveInterceptor", "Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;", "context", "Landroid/content/Context;", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class AndroidFontResolveInterceptor_androidKt {
    public static final AndroidFontResolveInterceptor AndroidFontResolveInterceptor(Context context) {
        return new AndroidFontResolveInterceptor(FontWeightAdjustmentHelper.INSTANCE.getFontWeightAdjustment(context));
    }
}
