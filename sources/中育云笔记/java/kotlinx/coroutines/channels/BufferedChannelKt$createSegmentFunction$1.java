package kotlinx.coroutines.channels;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9544p;
import p365ud.C11392g;

/* loaded from: classes6.dex */
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements InterfaceC9544p {

    /* renamed from: c */
    public static final BufferedChannelKt$createSegmentFunction$1 f23574c = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    /* renamed from: g */
    public final C11392g m20712g(long j10, C11392g c11392g) {
        return BufferedChannelKt.m20709x(j10, c11392g);
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m20712g(((Number) obj).longValue(), (C11392g) obj2);
    }
}
