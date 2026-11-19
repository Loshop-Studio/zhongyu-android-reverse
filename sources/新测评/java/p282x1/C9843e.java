package p282x1;

import com.liulishuo.okdownload.core.exception.InterruptException;
import com.liulishuo.okdownload.core.exception.RetryException;
import java.io.IOException;
import p240t1.InterfaceC9377a;
import p262v1.C9657d;
import p262v1.RunnableC9659f;

/* renamed from: x1.e */
/* loaded from: classes4.dex */
public class C9843e implements InterfaceC9841c, InterfaceC9842d {
    @Override // p282x1.InterfaceC9841c
    /* renamed from: a */
    public InterfaceC9377a.a mo16482a(RunnableC9659f runnableC9659f) throws IOException {
        C9657d c9657dM16120e = runnableC9659f.m16120e();
        while (true) {
            try {
                if (c9657dM16120e.m16085f()) {
                    throw InterruptException.f4725a;
                }
                return runnableC9659f.m16130o();
            } catch (IOException e10) {
                if (!(e10 instanceof RetryException)) {
                    runnableC9659f.m16120e().m16080a(e10);
                    runnableC9659f.m16124i().m16273c(runnableC9659f.m16119d());
                    throw e10;
                }
                runnableC9659f.m16134s();
            }
        }
    }

    @Override // p282x1.InterfaceC9842d
    /* renamed from: b */
    public long mo16483b(RunnableC9659f runnableC9659f) throws IOException {
        try {
            return runnableC9659f.m16131p();
        } catch (IOException e10) {
            runnableC9659f.m16120e().m16080a(e10);
            throw e10;
        }
    }
}
