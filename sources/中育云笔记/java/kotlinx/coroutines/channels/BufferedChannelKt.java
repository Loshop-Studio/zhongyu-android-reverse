package kotlinx.coroutines.channels;

import androidx.collection.SieveCacheKt;
import p181hd.InterfaceC9545q;
import p280od.InterfaceC10473g;
import p365ud.C11392g;
import p410xd.AbstractC11845f0;
import p410xd.C11839c0;
import sd.InterfaceC11125j;

/* loaded from: classes6.dex */
public abstract class BufferedChannelKt {

    /* renamed from: a */
    public static final C11392g f23555a = new C11392g(-1, null, null, 0);

    /* renamed from: b */
    public static final int f23556b = AbstractC11845f0.m26265e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* renamed from: c */
    public static final int f23557c = AbstractC11845f0.m26265e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* renamed from: d */
    public static final C11839c0 f23558d = new C11839c0("BUFFERED");

    /* renamed from: e */
    public static final C11839c0 f23559e = new C11839c0("SHOULD_BUFFER");

    /* renamed from: f */
    public static final C11839c0 f23560f = new C11839c0("S_RESUMING_BY_RCV");

    /* renamed from: g */
    public static final C11839c0 f23561g = new C11839c0("RESUMING_BY_EB");

    /* renamed from: h */
    public static final C11839c0 f23562h = new C11839c0("POISONED");

    /* renamed from: i */
    public static final C11839c0 f23563i = new C11839c0("DONE_RCV");

    /* renamed from: j */
    public static final C11839c0 f23564j = new C11839c0("INTERRUPTED_SEND");

    /* renamed from: k */
    public static final C11839c0 f23565k = new C11839c0("INTERRUPTED_RCV");

    /* renamed from: l */
    public static final C11839c0 f23566l = new C11839c0("CHANNEL_CLOSED");

    /* renamed from: m */
    public static final C11839c0 f23567m = new C11839c0("SUSPEND");

    /* renamed from: n */
    public static final C11839c0 f23568n = new C11839c0("SUSPEND_NO_WAITER");

    /* renamed from: o */
    public static final C11839c0 f23569o = new C11839c0("FAILED");

    /* renamed from: p */
    public static final C11839c0 f23570p = new C11839c0("NO_RECEIVE_RESULT");

    /* renamed from: q */
    public static final C11839c0 f23571q = new C11839c0("CLOSE_HANDLER_CLOSED");

    /* renamed from: r */
    public static final C11839c0 f23572r = new C11839c0("CLOSE_HANDLER_INVOKED");

    /* renamed from: s */
    public static final C11839c0 f23573s = new C11839c0("NO_CLOSE_CAUSE");

    /* renamed from: A */
    public static final long m20683A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: B */
    public static final boolean m20684B(InterfaceC11125j interfaceC11125j, Object obj, InterfaceC9545q interfaceC9545q) {
        Object objMo20533r = interfaceC11125j.mo20533r(obj, null, interfaceC9545q);
        if (objMo20533r == null) {
            return false;
        }
        interfaceC11125j.mo20502D(objMo20533r);
        return true;
    }

    /* renamed from: C */
    public static /* synthetic */ boolean m20685C(InterfaceC11125j interfaceC11125j, Object obj, InterfaceC9545q interfaceC9545q, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC9545q = null;
        }
        return m20684B(interfaceC11125j, obj, interfaceC9545q);
    }

    /* renamed from: v */
    public static final long m20707v(long j10, boolean z10) {
        return (z10 ? SieveCacheKt.NodeVisitedBit : 0L) + j10;
    }

    /* renamed from: w */
    public static final long m20708w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    /* renamed from: x */
    public static final C11392g m20709x(long j10, C11392g c11392g) {
        return new C11392g(j10, c11392g, c11392g.m25353y(), 0);
    }

    /* renamed from: y */
    public static final InterfaceC10473g m20710y() {
        return BufferedChannelKt$createSegmentFunction$1.f23574c;
    }

    /* renamed from: z */
    public static final C11839c0 m20711z() {
        return f23566l;
    }
}
