package androidx.compose.p011ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m5110d2 = {"Landroidx/compose/ui/platform/AndroidUriHandler;", "Landroidx/compose/ui/platform/UriHandler;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "uri", "Ld6/s;", "openUri", "(Ljava/lang/String;)V", "Landroid/content/Context;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class AndroidUriHandler implements UriHandler {
    public static final int $stable = 8;

    @NotNull
    private final Context context;

    public AndroidUriHandler(@NotNull Context context) {
        this.context = context;
    }

    @Override // androidx.compose.p011ui.platform.UriHandler
    public void openUri(@NotNull String uri) {
        try {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(AbstractC1923c.m1047k('.', "Can't open ", uri), e);
        }
    }
}
