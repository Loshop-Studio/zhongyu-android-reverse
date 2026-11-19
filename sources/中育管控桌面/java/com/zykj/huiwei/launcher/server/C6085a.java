package com.zykj.huiwei.launcher.server;

import com.zykj.huiwei.launcher.server.AbstractC6086b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* renamed from: com.zykj.huiwei.launcher.server.a */
/* loaded from: classes4.dex */
public final class C6085a {

    /* renamed from: a */
    public static final C6085a f6279a = new C6085a();

    /* renamed from: b */
    public static final Channel f6280b;

    /* renamed from: c */
    public static final Flow f6281c;

    /* renamed from: d */
    public static final int f6282d;

    static {
        Channel channelChannel$default = ChannelKt.Channel$default(-2, null, null, 6, null);
        f6280b = channelChannel$default;
        f6281c = FlowKt.receiveAsFlow(channelChannel$default);
        f6282d = 8;
    }

    /* renamed from: a */
    public final Flow m5508a() {
        return f6281c;
    }

    /* renamed from: b */
    public final Object m5509b(String str, Continuation continuation) {
        Object objSend = f6280b.send(new AbstractC6086b.a(str), continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }
}
