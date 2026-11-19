package p115m4;

import androidx.camera.core.impl.C0362d;
import androidx.navigation.C2856d;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.CallableC5708d;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import p151r5.AbstractC6465b;
import p183v5.AbstractC6668a;

/* renamed from: m4.e */
/* loaded from: classes3.dex */
public final class C6107e extends ForwardingSource {

    /* renamed from: a */
    public long f9748a;

    /* renamed from: b */
    public final /* synthetic */ C6108f f9749b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6107e(C6108f c6108f, BufferedSource bufferedSource) {
        super(bufferedSource);
        this.f9749b = c6108f;
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer sink, long j7) throws IOException {
        AbstractC5830k.m5330g(sink, "sink");
        long j8 = super.read(sink, j7);
        this.f9748a += j8 != -1 ? j8 : 0L;
        new CallableC5708d(Long.valueOf(j8)).m6079d(AbstractC6465b.m6127a()).m6078b(new LambdaObserver(new C0362d(new C2856d(19, this.f9749b, this), 15), AbstractC6668a.f11250d, AbstractC6668a.f11248b, AbstractC6668a.f11249c));
        return j8;
    }
}
