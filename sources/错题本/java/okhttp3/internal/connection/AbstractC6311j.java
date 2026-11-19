package okhttp3.internal.connection;

import java.net.Proxy;

/* renamed from: okhttp3.internal.connection.j */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC6311j {

    /* renamed from: a */
    public static final /* synthetic */ int[] f10165a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f10165a = iArr;
    }
}
