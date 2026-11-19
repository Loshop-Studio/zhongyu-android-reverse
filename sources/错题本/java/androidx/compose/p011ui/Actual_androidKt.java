package androidx.compose.p011ui;

import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009a8.RunnableC0023a;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"", "currentTimeMillis", "()J", "delayMillis", "Lkotlin/Function0;", "Ld6/s;", "block", "", "postDelayed", "(JLr6/a;)Ljava/lang/Object;", "token", "removePost", "(Ljava/lang/Object;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class Actual_androidKt {

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper());

    public static final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @NotNull
    public static final Object postDelayed(long j7, @NotNull InterfaceC6469a interfaceC6469a) {
        RunnableC0023a runnableC0023a = new RunnableC0023a(interfaceC6469a, 11);
        handler.postDelayed(runnableC0023a, j7);
        return runnableC0023a;
    }

    public static final void removePost(@Nullable Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        handler.removeCallbacks((Runnable) obj);
    }
}
