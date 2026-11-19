package androidx.compose.p006ui.text.platform.extensions;

import android.text.style.URLSpan;
import androidx.compose.p006ui.text.ExperimentalTextApi;
import androidx.compose.p006ui.text.UrlAnnotation;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m5175d2 = {"toSpan", "Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/UrlAnnotation;", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class UrlAnnotationExtensions_androidKt {
    @ExperimentalTextApi
    public static final URLSpan toSpan(UrlAnnotation urlAnnotation) {
        Intrinsics.checkNotNullParameter(urlAnnotation, "<this>");
        return new URLSpan(urlAnnotation.getUrl());
    }
}
