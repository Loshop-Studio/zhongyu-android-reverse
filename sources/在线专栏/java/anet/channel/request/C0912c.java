package anet.channel.request;

import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;

/* renamed from: anet.channel.request.c */
/* loaded from: classes.dex */
public class C0912c implements Cancelable {
    public static final C0912c NULL = new C0912c(null, 0, null);

    /* renamed from: a */
    private final int f5261a;

    /* renamed from: b */
    private final SpdySession f5262b;

    /* renamed from: c */
    private final String f5263c;

    public C0912c(SpdySession spdySession, int i4, String str) {
        this.f5262b = spdySession;
        this.f5261a = i4;
        this.f5263c = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        int i4;
        try {
            if (this.f5262b == null || (i4 = this.f5261a) == 0) {
                return;
            }
            ALog.m4639i("awcn.TnetCancelable", "cancel tnet request", this.f5263c, "streamId", Integer.valueOf(i4));
            this.f5262b.streamReset(this.f5261a, 5);
        } catch (SpdyErrorException e4) {
            ALog.m4637e("awcn.TnetCancelable", "request cancel failed.", this.f5263c, e4, Constants.KEY_ERROR_CODE, Integer.valueOf(e4.SpdyErrorGetCode()));
        }
    }
}
