package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.concurrent.Executor;
import p100i1.AbstractC2665a;
import p103j.InterfaceC2685a;
import p169x0.AbstractC3445n;
import p173y0.C3494i;

/* loaded from: classes.dex */
public class RemoteWorkManagerClient extends AbstractC2665a {

    /* renamed from: e */
    static final String f4901e = AbstractC3445n.m10503f("RemoteWorkManagerClient");

    /* renamed from: f */
    private static final InterfaceC2685a<byte[], Void> f4902f = new C0832a();

    /* renamed from: g */
    public static final /* synthetic */ int f4903g = 0;

    /* renamed from: a */
    final Context f4904a;

    /* renamed from: b */
    final C3494i f4905b;

    /* renamed from: c */
    final Executor f4906c;

    /* renamed from: d */
    final Object f4907d = new Object();

    /* renamed from: androidx.work.multiprocess.RemoteWorkManagerClient$a */
    class C0832a implements InterfaceC2685a<byte[], Void> {
        C0832a() {
        }

        @Override // p103j.InterfaceC2685a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void apply(byte[] bArr) {
            return null;
        }
    }

    @Keep
    public RemoteWorkManagerClient(Context context, C3494i c3494i) {
        this.f4904a = context.getApplicationContext();
        this.f4905b = c3494i;
        this.f4906c = c3494i.m10615u().mo8915c();
    }
}
