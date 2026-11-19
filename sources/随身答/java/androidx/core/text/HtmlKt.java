package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086\b\u001a\u0017\u0010\t\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0086\b¨\u0006\u000b"}, m13413d2 = {"parseAsHtml", "Landroid/text/Spanned;", "", "flags", "", "imageGetter", "Landroid/text/Html$ImageGetter;", "tagHandler", "Landroid/text/Html$TagHandler;", "toHtml", "option", "core-ktx_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class HtmlKt {
    public static final Spanned parseAsHtml(String str, int i9, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return HtmlCompat.fromHtml(str, i9, imageGetter, tagHandler);
    }

    public static /* synthetic */ Spanned parseAsHtml$default(String str, int i9, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = 0;
        }
        if ((i10 & 2) != 0) {
            imageGetter = null;
        }
        if ((i10 & 4) != 0) {
            tagHandler = null;
        }
        return HtmlCompat.fromHtml(str, i9, imageGetter, tagHandler);
    }

    public static final String toHtml(Spanned spanned, int i9) {
        return HtmlCompat.toHtml(spanned, i9);
    }

    public static /* synthetic */ String toHtml$default(Spanned spanned, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = 0;
        }
        return HtmlCompat.toHtml(spanned, i9);
    }
}
