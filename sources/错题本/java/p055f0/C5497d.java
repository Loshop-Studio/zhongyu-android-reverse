package p055f0;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p180v0.AbstractC6654a;
import p208z.InterfaceC6799d;
import p208z.InterfaceC6800e;

/* renamed from: f0.d */
/* loaded from: classes2.dex */
public final class C5497d implements InterfaceC6800e {

    /* renamed from: a */
    public final /* synthetic */ int f8503a;

    /* renamed from: b */
    public final Object f8504b;

    public /* synthetic */ C5497d(Object obj, int i) {
        this.f8503a = i;
        this.f8504b = obj;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: a */
    public final void mo21a() {
        int i = this.f8503a;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: b */
    public final Class mo22b() {
        switch (this.f8503a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f8504b.getClass();
        }
    }

    @Override // p208z.InterfaceC6800e
    public final void cancel() {
        int i = this.f8503a;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: d */
    public final DataSource mo23d() {
        switch (this.f8503a) {
        }
        return DataSource.LOCAL;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: e */
    public final void mo24e(Priority priority, InterfaceC6799d interfaceC6799d) {
        switch (this.f8503a) {
            case 0:
                try {
                    interfaceC6799d.mo121o(AbstractC6654a.m6312a((File) this.f8504b));
                    break;
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    interfaceC6799d.mo109c(e);
                    return;
                }
            default:
                interfaceC6799d.mo121o(this.f8504b);
                break;
        }
    }

    /* renamed from: c */
    private final void m4875c() {
    }

    /* renamed from: f */
    private final void m4876f() {
    }

    /* renamed from: g */
    private final void m4877g() {
    }

    /* renamed from: h */
    private final void m4878h() {
    }
}
