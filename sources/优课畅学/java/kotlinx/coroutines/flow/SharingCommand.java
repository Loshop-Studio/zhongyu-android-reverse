package kotlinx.coroutines.flow;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class SharingCommand {

    /* renamed from: a */
    public static final SharingCommand f17941a = new SharingCommand("START", 0);

    /* renamed from: b */
    public static final SharingCommand f17942b = new SharingCommand("STOP", 1);

    /* renamed from: c */
    public static final SharingCommand f17943c = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* renamed from: d */
    public static final /* synthetic */ SharingCommand[] f17944d;

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC9760a f17945e;

    static {
        SharingCommand[] sharingCommandArrM16678a = m16678a();
        f17944d = sharingCommandArrM16678a;
        f17945e = AbstractC9108a.m16085a(sharingCommandArrM16678a);
    }

    public SharingCommand(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ SharingCommand[] m16678a() {
        return new SharingCommand[]{f17941a, f17942b, f17943c};
    }

    public static SharingCommand valueOf(String str) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, str);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) f17944d.clone();
    }
}
