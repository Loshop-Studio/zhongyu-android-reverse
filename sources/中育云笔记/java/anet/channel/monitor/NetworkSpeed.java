package anet.channel.monitor;

/* loaded from: classes3.dex */
public enum NetworkSpeed {
    Slow("弱网络", 1),
    Fast("强网络", 5);


    /* renamed from: a */
    private final String f2461a;

    /* renamed from: b */
    private final int f2462b;

    NetworkSpeed(String str, int i10) {
        this.f2461a = str;
        this.f2462b = i10;
    }

    public static NetworkSpeed valueOfCode(int i10) {
        return i10 == 1 ? Slow : Fast;
    }

    public int getCode() {
        return this.f2462b;
    }

    public String getDesc() {
        return this.f2461a;
    }
}
