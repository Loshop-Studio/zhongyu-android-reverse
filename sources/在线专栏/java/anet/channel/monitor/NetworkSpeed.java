package anet.channel.monitor;

/* loaded from: classes.dex */
public enum NetworkSpeed {
    Slow("弱网络", 1),
    Fast("强网络", 5);


    /* renamed from: a */
    private final String f5183a;

    /* renamed from: b */
    private final int f5184b;

    NetworkSpeed(String str, int i4) {
        this.f5183a = str;
        this.f5184b = i4;
    }

    public static NetworkSpeed valueOfCode(int i4) {
        return i4 == 1 ? Slow : Fast;
    }

    public int getCode() {
        return this.f5184b;
    }

    public String getDesc() {
        return this.f5183a;
    }
}
