package p279w1;

import com.liulishuo.okdownload.core.exception.InterruptException;
import com.liulishuo.okdownload.core.exception.RetryException;
import java.io.IOException;
import p239s1.InterfaceC9465a;
import p259u1.C9662d;
import p259u1.RunnableC9664f;

/* renamed from: w1.e */
/* loaded from: classes4.dex */
public class C9800e implements InterfaceC9798c, InterfaceC9799d {
    @Override // p279w1.InterfaceC9799d
    /* renamed from: a */
    public long mo16601a(RunnableC9664f runnableC9664f) throws IOException {
        try {
            return runnableC9664f.m16092p();
        } catch (IOException e10) {
            runnableC9664f.m16081e().m16041a(e10);
            throw e10;
        }
    }

    @Override // p279w1.InterfaceC9798c
    /* renamed from: b */
    public InterfaceC9465a.a mo16602b(RunnableC9664f runnableC9664f) throws IOException {
        C9662d c9662dM16081e = runnableC9664f.m16081e();
        while (true) {
            try {
                if (c9662dM16081e.m16046f()) {
                    throw InterruptException.f5333a;
                }
                return runnableC9664f.m16091o();
            } catch (IOException e10) {
                if (!(e10 instanceof RetryException)) {
                    runnableC9664f.m16081e().m16041a(e10);
                    runnableC9664f.m16085i().m16306c(runnableC9664f.m16080d());
                    throw e10;
                }
                runnableC9664f.m16095s();
            }
        }
    }
}
