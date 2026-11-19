package androidx.navigation;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"NavUri", "Landroid/net/Uri;", "Landroidx/navigation/NavUri;", "uriString", "", "(Ljava/lang/String;)Landroid/net/Uri;", "navigation-common_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavUriKt {
    @NotNull
    public static final Uri NavUri(@NotNull String uriString) {
        AbstractC5830k.m5330g(uriString, "uriString");
        return NavUriUtils.INSTANCE.parse(uriString);
    }
}
