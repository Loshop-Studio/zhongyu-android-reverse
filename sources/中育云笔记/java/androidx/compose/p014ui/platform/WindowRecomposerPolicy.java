package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.camera.view.AbstractC0979q;
import androidx.compose.p014ui.InternalComposeUiApi;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC9977s;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p309qc.AbstractC10771b;
import sd.AbstractC11117h;
import sd.C11119h1;
import td.AbstractC11277h;

@StabilityInferred(parameters = 0)
@InternalComposeUiApi
/* loaded from: classes2.dex */
public final class WindowRecomposerPolicy {
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();
    private static final AtomicReference<WindowRecomposerFactory> factory = new AtomicReference<>(WindowRecomposerFactory.Companion.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    public final boolean compareAndSetFactory(WindowRecomposerFactory windowRecomposerFactory, WindowRecomposerFactory windowRecomposerFactory2) {
        return AbstractC0979q.m884a(factory, windowRecomposerFactory, windowRecomposerFactory2);
    }

    public final Recomposer createAndInstallWindowRecomposer$ui_release(View view) {
        Recomposer recomposerCreateRecomposer = factory.get().createRecomposer(view);
        WindowRecomposer_androidKt.setCompositionContext(view, recomposerCreateRecomposer);
        final InterfaceC10045g interfaceC10045gM24726d = AbstractC11117h.m24726d(C11119h1.f26784c, AbstractC11277h.m25213b(view.getHandler(), "windowRecomposer cleanup").mo25209k(), null, new C3011xbfd085b3(recomposerCreateRecomposer, view, null), 2, null);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                view2.removeOnAttachStateChangeListener(this);
                InterfaceC10045g.a.m20900a(interfaceC10045gM24726d, null, 1, null);
            }
        });
        return recomposerCreateRecomposer;
    }

    public final WindowRecomposerFactory getAndSetFactory(WindowRecomposerFactory windowRecomposerFactory) {
        return factory.getAndSet(windowRecomposerFactory);
    }

    public final void setFactory(WindowRecomposerFactory windowRecomposerFactory) {
        factory.set(windowRecomposerFactory);
    }

    public final <R> R withFactory(WindowRecomposerFactory windowRecomposerFactory, InterfaceC9529a interfaceC9529a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WindowRecomposerFactory andSetFactory = getAndSetFactory(windowRecomposerFactory);
        try {
            R r10 = (R) interfaceC9529a.invoke();
            AbstractC9977s.m20286b(1);
            if (!compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
            }
            AbstractC9977s.m20285a(1);
            return r10;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC9977s.m20286b(1);
                if (compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                    AbstractC9977s.m20285a(1);
                    throw th2;
                }
                AbstractC10771b.m22973a(th, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th;
            }
        }
    }
}
