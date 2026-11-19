package coil3.network.okhttp.internal;

import com.zykj.mistake.utils.C5098c;
import com.zykj.mistake.widget.StemWebView;
import java.io.IOException;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C5961g;
import okhttp3.C6301i0;
import okhttp3.InterfaceC6292e;
import okhttp3.InterfaceC6294f;
import okhttp3.internal.connection.C6310i;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: coil3.network.okhttp.internal.b */
/* loaded from: classes2.dex */
public final class C3327b implements InterfaceC6294f, InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f2032a;

    /* renamed from: b */
    public final Object f2033b;

    /* renamed from: c */
    public final Object f2034c;

    public /* synthetic */ C3327b(int i, Object obj, Object obj2) {
        this.f2032a = i;
        this.f2033b = obj;
        this.f2034c = obj2;
    }

    @Override // okhttp3.InterfaceC6294f
    /* renamed from: d */
    public void mo110d(InterfaceC6292e interfaceC6292e, IOException iOException) {
        if (((C6310i) interfaceC6292e).f10162n) {
            return;
        }
        ((C5961g) this.f2034c).resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(iOException)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f2032a) {
            case 0:
                try {
                    ((C6310i) this.f2033b).cancel();
                } catch (Throwable unused) {
                }
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f2033b;
                C5098c c5098c = (C5098c) this.f2034c;
                StemWebView stemWebView = (StemWebView) ref$ObjectRef.element;
                if (stemWebView != null) {
                    stemWebView.removeAllViews();
                }
                c5098c.f8029b.removeAllViews();
                ref$ObjectRef.element = null;
                break;
        }
        return C5443s.f8405a;
    }

    @Override // okhttp3.InterfaceC6294f
    /* renamed from: j */
    public void mo116j(C6301i0 c6301i0) {
        ((C5961g) this.f2034c).resumeWith(Result.m13956constructorimpl(c6301i0));
    }
}
