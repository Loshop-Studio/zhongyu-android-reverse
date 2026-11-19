package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import p142q2.InterfaceC3015g;

/* loaded from: classes.dex */
public interface CoroutineExceptionHandler extends InterfaceC3015g.b {

    /* renamed from: Q */
    @NotNull
    public static final C2784a f10740Q = C2784a.f10741a;

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    public static final class C2784a implements InterfaceC3015g.c<CoroutineExceptionHandler> {

        /* renamed from: a */
        static final /* synthetic */ C2784a f10741a = new C2784a();

        private C2784a() {
        }
    }

    void handleException(@NotNull InterfaceC3015g interfaceC3015g, @NotNull Throwable th);
}
