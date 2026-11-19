package kotlinx.coroutines.channels;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p157k8.C9068d;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements InterfaceC10574p {

    /* renamed from: a */
    public static final BufferedChannelKt$createSegmentFunction$1 f17660a = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    /* renamed from: d */
    public final C9068d m16519d(long j10, C9068d c9068d) {
        return BufferedChannelKt.m16516x(j10, c9068d);
    }

    @Override // p300x7.InterfaceC10574p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m16519d(((Number) obj).longValue(), (C9068d) obj2);
    }
}
