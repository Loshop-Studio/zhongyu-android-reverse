package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.camera.view.AbstractC0949q;
import androidx.compose.p013ui.InternalComposeUiApi;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC9131s;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.AbstractC8722b;
import p135i8.AbstractC8839h;
import p135i8.C8876t0;
import p146j8.AbstractC9030e;
import p300x7.InterfaceC10559a;

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
        return AbstractC0949q.m807a(factory, windowRecomposerFactory, windowRecomposerFactory2);
    }

    public final Recomposer createAndInstallWindowRecomposer$ui_release(View view) {
        Recomposer recomposerCreateRecomposer = factory.get().createRecomposer(view);
        WindowRecomposer_androidKt.setCompositionContext(view, recomposerCreateRecomposer);
        final InterfaceC9212n interfaceC9212nM14861d = AbstractC8839h.m14861d(C8876t0.f16535a, AbstractC9030e.m15695b(view.getHandler(), "windowRecomposer cleanup").mo15693o(), null, new C2981xbfd085b3(recomposerCreateRecomposer, view, null), 2, null);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                view2.removeOnAttachStateChangeListener(this);
                InterfaceC9212n.a.m16777a(interfaceC9212nM14861d, null, 1, null);
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

    public final <R> R withFactory(WindowRecomposerFactory windowRecomposerFactory, InterfaceC10559a interfaceC10559a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WindowRecomposerFactory andSetFactory = getAndSetFactory(windowRecomposerFactory);
        try {
            R r10 = (R) interfaceC10559a.invoke();
            AbstractC9131s.m16125b(1);
            if (!compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
            }
            AbstractC9131s.m16124a(1);
            return r10;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC9131s.m16125b(1);
                if (compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                    AbstractC9131s.m16124a(1);
                    throw th2;
                }
                AbstractC8722b.m14228a(th, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th;
            }
        }
    }
}
