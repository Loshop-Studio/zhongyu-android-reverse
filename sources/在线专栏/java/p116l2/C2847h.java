package p116l2;

import android.content.Context;
import android.widget.Toast;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: l2.h */
/* loaded from: classes.dex */
public final class C2847h {

    /* renamed from: a */
    @NotNull
    public static final C2847h f10954a = new C2847h();

    /* renamed from: b */
    @Nullable
    private static Toast f10955b;

    private C2847h() {
    }

    /* renamed from: a */
    public final void m9553a(@NotNull Context context, @NotNull String content) {
        C2769l.m9241e(context, "context");
        C2769l.m9241e(content, "content");
        Toast toast = f10955b;
        if (toast == null) {
            f10955b = Toast.makeText(context, content, 0);
        } else {
            C2769l.m9239c(toast);
            toast.setText(content);
        }
        Toast toast2 = f10955b;
        C2769l.m9239c(toast2);
        toast2.show();
    }
}
