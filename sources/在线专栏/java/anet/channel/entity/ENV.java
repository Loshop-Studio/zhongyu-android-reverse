package anet.channel.entity;

/* loaded from: classes.dex */
public enum ENV {
    ONLINE(0),
    PREPARE(1),
    TEST(2);

    private int envMode;

    ENV(int i4) {
        this.envMode = i4;
    }

    public int getEnvMode() {
        return this.envMode;
    }

    public void setEnvMode(int i4) {
        this.envMode = i4;
    }

    public static ENV valueOf(int i4) {
        return i4 != 1 ? i4 != 2 ? ONLINE : TEST : PREPARE;
    }
}
