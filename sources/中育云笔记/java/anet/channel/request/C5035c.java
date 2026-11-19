package anet.channel.request;

import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;

/* renamed from: anet.channel.request.c */
/* loaded from: classes3.dex */
public class C5035c implements Cancelable {
    public static final C5035c NULL = new C5035c(null, 0, null);

    /* renamed from: a */
    private final int f2539a;

    /* renamed from: b */
    private final SpdySession f2540b;

    /* renamed from: c */
    private final String f2541c;

    public C5035c(SpdySession spdySession, int i10, String str) {
        this.f2540b = spdySession;
        this.f2539a = i10;
        this.f2541c = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        int i10;
        try {
            if (this.f2540b == null || (i10 = this.f2539a) == 0) {
                return;
            }
            ALog.m2530i("awcn.TnetCancelable", "cancel tnet request", this.f2541c, "streamId", Integer.valueOf(i10));
            this.f2540b.streamReset(this.f2539a, 5);
        } catch (SpdyErrorException e10) {
            ALog.m2528e("awcn.TnetCancelable", "request cancel failed.", this.f2541c, e10, Constants.KEY_ERROR_CODE, Integer.valueOf(e10.SpdyErrorGetCode()));
        }
    }
}
