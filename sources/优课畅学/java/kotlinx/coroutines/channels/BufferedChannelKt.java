package kotlinx.coroutines.channels;

import androidx.collection.SieveCacheKt;
import com.tencent.smtt.audio.core.utils.TbsDialogBase;
import p089e8.InterfaceC8379g;
import p135i8.InterfaceC8845j;
import p157k8.C9068d;
import p191n8.AbstractC9448g0;
import p191n8.C9442d0;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public abstract class BufferedChannelKt {

    /* renamed from: a */
    public static final C9068d f17641a = new C9068d(-1, null, null, 0);

    /* renamed from: b */
    public static final int f17642b = AbstractC9448g0.m17337e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* renamed from: c */
    public static final int f17643c = AbstractC9448g0.m17337e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", TbsDialogBase.BTN_ID_POSITIVE, 0, 0, 12, null);

    /* renamed from: d */
    public static final C9442d0 f17644d = new C9442d0("BUFFERED");

    /* renamed from: e */
    public static final C9442d0 f17645e = new C9442d0("SHOULD_BUFFER");

    /* renamed from: f */
    public static final C9442d0 f17646f = new C9442d0("S_RESUMING_BY_RCV");

    /* renamed from: g */
    public static final C9442d0 f17647g = new C9442d0("RESUMING_BY_EB");

    /* renamed from: h */
    public static final C9442d0 f17648h = new C9442d0("POISONED");

    /* renamed from: i */
    public static final C9442d0 f17649i = new C9442d0("DONE_RCV");

    /* renamed from: j */
    public static final C9442d0 f17650j = new C9442d0("INTERRUPTED_SEND");

    /* renamed from: k */
    public static final C9442d0 f17651k = new C9442d0("INTERRUPTED_RCV");

    /* renamed from: l */
    public static final C9442d0 f17652l = new C9442d0("CHANNEL_CLOSED");

    /* renamed from: m */
    public static final C9442d0 f17653m = new C9442d0("SUSPEND");

    /* renamed from: n */
    public static final C9442d0 f17654n = new C9442d0("SUSPEND_NO_WAITER");

    /* renamed from: o */
    public static final C9442d0 f17655o = new C9442d0("FAILED");

    /* renamed from: p */
    public static final C9442d0 f17656p = new C9442d0("NO_RECEIVE_RESULT");

    /* renamed from: q */
    public static final C9442d0 f17657q = new C9442d0("CLOSE_HANDLER_CLOSED");

    /* renamed from: r */
    public static final C9442d0 f17658r = new C9442d0("CLOSE_HANDLER_INVOKED");

    /* renamed from: s */
    public static final C9442d0 f17659s = new C9442d0("NO_CLOSE_CAUSE");

    /* renamed from: A */
    public static final long m16490A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: B */
    public static final boolean m16491B(InterfaceC8845j interfaceC8845j, Object obj, InterfaceC10570l interfaceC10570l) {
        Object objMo14874t = interfaceC8845j.mo14874t(obj, null, interfaceC10570l);
        if (objMo14874t == null) {
            return false;
        }
        interfaceC8845j.mo14875w(objMo14874t);
        return true;
    }

    /* renamed from: C */
    public static /* synthetic */ boolean m16492C(InterfaceC8845j interfaceC8845j, Object obj, InterfaceC10570l interfaceC10570l, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC10570l = null;
        }
        return m16491B(interfaceC8845j, obj, interfaceC10570l);
    }

    /* renamed from: v */
    public static final long m16514v(long j10, boolean z10) {
        return (z10 ? SieveCacheKt.NodeVisitedBit : 0L) + j10;
    }

    /* renamed from: w */
    public static final long m16515w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    /* renamed from: x */
    public static final C9068d m16516x(long j10, C9068d c9068d) {
        return new C9068d(j10, c9068d, c9068d.m15894y(), 0);
    }

    /* renamed from: y */
    public static final InterfaceC8379g m16517y() {
        return BufferedChannelKt$createSegmentFunction$1.f17660a;
    }

    /* renamed from: z */
    public static final C9442d0 m16518z() {
        return f17652l;
    }
}
