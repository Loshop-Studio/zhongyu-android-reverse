package androidx.navigation;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005¨\u0006\f"}, m5110d2 = {"Landroidx/navigation/NavUriUtils;", "", "<init>", "()V", "encode", "", "s", "allow", "decode", "parse", "Landroid/net/Uri;", "uriString", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavUriUtils {

    @NotNull
    public static final NavUriUtils INSTANCE = new NavUriUtils();

    private NavUriUtils() {
    }

    public static /* synthetic */ String encode$default(NavUriUtils navUriUtils, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return navUriUtils.encode(str, str2);
    }

    @NotNull
    public final String decode(@NotNull String s8) {
        AbstractC5830k.m5330g(s8, "s");
        String strDecode = Uri.decode(s8);
        AbstractC5830k.m5329f(strDecode, "decode(...)");
        return strDecode;
    }

    @NotNull
    public final String encode(@NotNull String s8, @Nullable String allow) {
        AbstractC5830k.m5330g(s8, "s");
        String strEncode = Uri.encode(s8, allow);
        AbstractC5830k.m5329f(strEncode, "encode(...)");
        return strEncode;
    }

    @NotNull
    public final Uri parse(@NotNull String uriString) {
        AbstractC5830k.m5330g(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        AbstractC5830k.m5329f(uri, "parse(...)");
        return uri;
    }
}
