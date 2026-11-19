package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086\b\u001a\u0017\u0010\t\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0086\b¨\u0006\u000b"}, m5175d2 = {"parseAsHtml", "Landroid/text/Spanned;", "", "flags", "", "imageGetter", "Landroid/text/Html$ImageGetter;", "tagHandler", "Landroid/text/Html$TagHandler;", "toHtml", "option", "core-ktx_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class HtmlKt {
    public static final Spanned parseAsHtml(String str, int i4, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Spanned spannedFromHtml = HtmlCompat.fromHtml(str, i4, imageGetter, tagHandler);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(this, flags, imageGetter, tagHandler)");
        return spannedFromHtml;
    }

    public static /* synthetic */ Spanned parseAsHtml$default(String str, int i4, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            imageGetter = null;
        }
        if ((i5 & 4) != 0) {
            tagHandler = null;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Spanned spannedFromHtml = HtmlCompat.fromHtml(str, i4, imageGetter, tagHandler);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(this, flags, imageGetter, tagHandler)");
        return spannedFromHtml;
    }

    public static final String toHtml(Spanned spanned, int i4) {
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        String html = HtmlCompat.toHtml(spanned, i4);
        Intrinsics.checkNotNullExpressionValue(html, "toHtml(this, option)");
        return html;
    }

    public static /* synthetic */ String toHtml$default(Spanned spanned, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        String html = HtmlCompat.toHtml(spanned, i4);
        Intrinsics.checkNotNullExpressionValue(html, "toHtml(this, option)");
        return html;
    }
}
