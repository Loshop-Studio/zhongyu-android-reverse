package kotlinx.coroutines.channels;

import kotlinx.coroutines.InterfaceC5895f;
import p054e7.AbstractC5469a;
import p054e7.C5486r;
import p152r6.InterfaceC6474f;

/* renamed from: kotlinx.coroutines.channels.c */
/* loaded from: classes4.dex */
public abstract class AbstractC5874c {

    /* renamed from: a */
    public static final C5880i f9305a = new C5880i(-1, null, null, 0);

    /* renamed from: b */
    public static final int f9306b = AbstractC5469a.m4836l(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c */
    public static final int f9307c = AbstractC5469a.m4836l(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d */
    public static final C5486r f9308d = new C5486r("BUFFERED");

    /* renamed from: e */
    public static final C5486r f9309e = new C5486r("SHOULD_BUFFER");

    /* renamed from: f */
    public static final C5486r f9310f = new C5486r("S_RESUMING_BY_RCV");

    /* renamed from: g */
    public static final C5486r f9311g = new C5486r("RESUMING_BY_EB");

    /* renamed from: h */
    public static final C5486r f9312h = new C5486r("POISONED");

    /* renamed from: i */
    public static final C5486r f9313i = new C5486r("DONE_RCV");

    /* renamed from: j */
    public static final C5486r f9314j = new C5486r("INTERRUPTED_SEND");

    /* renamed from: k */
    public static final C5486r f9315k = new C5486r("INTERRUPTED_RCV");

    /* renamed from: l */
    public static final C5486r f9316l = new C5486r("CHANNEL_CLOSED");

    /* renamed from: m */
    public static final C5486r f9317m = new C5486r("SUSPEND");

    /* renamed from: n */
    public static final C5486r f9318n = new C5486r("SUSPEND_NO_WAITER");

    /* renamed from: o */
    public static final C5486r f9319o = new C5486r("FAILED");

    /* renamed from: p */
    public static final C5486r f9320p = new C5486r("NO_RECEIVE_RESULT");

    /* renamed from: q */
    public static final C5486r f9321q = new C5486r("CLOSE_HANDLER_CLOSED");

    /* renamed from: r */
    public static final C5486r f9322r = new C5486r("CLOSE_HANDLER_INVOKED");

    /* renamed from: s */
    public static final C5486r f9323s = new C5486r("NO_CLOSE_CAUSE");

    /* renamed from: a */
    public static final boolean m5503a(InterfaceC5895f interfaceC5895f, Object obj, InterfaceC6474f interfaceC6474f) {
        C5486r c5486rMo4967n = interfaceC5895f.mo4967n(obj, interfaceC6474f);
        if (c5486rMo4967n == null) {
            return false;
        }
        interfaceC5895f.mo4968r(c5486rMo4967n);
        return true;
    }
}
