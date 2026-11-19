package anet.channel;

import anet.channel.session.TnetSpdySession;

/* loaded from: classes.dex */
public interface DataFrameCb {
    void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i4, int i5);

    void onException(int i4, int i5, boolean z3, String str);
}
