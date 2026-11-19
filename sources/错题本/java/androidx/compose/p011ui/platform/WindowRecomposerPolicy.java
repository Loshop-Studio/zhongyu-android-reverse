package androidx.compose.p011ui.platform;

import android.os.Handler;
import android.view.View;
import androidx.compose.p011ui.InternalComposeUiApi;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.AbstractC5806u;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5976k1;
import kotlinx.coroutines.C5993q0;
import org.jetbrains.annotations.NotNull;
import p046d7.AbstractC5448e;
import p046d7.C5447d;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, m5110d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "<init>", "()V", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "factory", "getAndSetFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;)Landroidx/compose/ui/platform/WindowRecomposerFactory;", "expected", "", "compareAndSetFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;Landroidx/compose/ui/platform/WindowRecomposerFactory;)Z", "Ld6/s;", "setFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;)V", "R", "Lkotlin/Function0;", "block", "withFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;Lr6/a;)Ljava/lang/Object;", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "createAndInstallWindowRecomposer$ui_release", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "createAndInstallWindowRecomposer", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@InternalComposeUiApi
/* loaded from: classes2.dex */
public final class WindowRecomposerPolicy {

    @NotNull
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();

    @NotNull
    private static final AtomicReference<WindowRecomposerFactory> factory = new AtomicReference<>(WindowRecomposerFactory.INSTANCE.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    @PublishedApi
    public final boolean compareAndSetFactory(@NotNull WindowRecomposerFactory expected, @NotNull WindowRecomposerFactory factory2) {
        AtomicReference<WindowRecomposerFactory> atomicReference = factory;
        while (!atomicReference.compareAndSet(expected, factory2)) {
            if (atomicReference.get() != expected) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final Recomposer createAndInstallWindowRecomposer$ui_release(@NotNull View rootView) {
        Recomposer recomposerCreateRecomposer = factory.get().createRecomposer(rootView);
        WindowRecomposer_androidKt.setCompositionContext(rootView, recomposerCreateRecomposer);
        Handler handler = rootView.getHandler();
        int i = AbstractC5448e.f8412a;
        C5447d c5447d = new C5447d(handler, "windowRecomposer cleanup", false);
        final C5976k1 c5976k1M5651v = AbstractC6014x.m5651v(C5993q0.f9492a, c5447d.f8411d, null, new C2259xbfd085b3(recomposerCreateRecomposer, rootView, null), 2);
        rootView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v2) {
                v2.removeOnAttachStateChangeListener(this);
                c5976k1M5651v.cancel(null);
            }
        });
        return recomposerCreateRecomposer;
    }

    @PublishedApi
    @NotNull
    public final WindowRecomposerFactory getAndSetFactory(@NotNull WindowRecomposerFactory factory2) {
        return factory.getAndSet(factory2);
    }

    public final void setFactory(@NotNull WindowRecomposerFactory factory2) {
        factory.set(factory2);
    }

    public final <R> R withFactory(@NotNull WindowRecomposerFactory factory2, @NotNull InterfaceC6469a block) {
        WindowRecomposerFactory andSetFactory = getAndSetFactory(factory2);
        try {
            R r = (R) block.invoke();
            if (compareAndSetFactory(factory2, andSetFactory)) {
                return r;
            }
            throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (compareAndSetFactory(factory2, andSetFactory)) {
                    throw th2;
                }
                AbstractC5806u.m5266e(th, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th;
            }
        }
    }
}
