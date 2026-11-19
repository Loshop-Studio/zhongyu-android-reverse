package kotlinx.coroutines.flow;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SharingCommand {

    /* renamed from: c */
    public static final SharingCommand f23853c = new SharingCommand("START", 0);

    /* renamed from: d */
    public static final SharingCommand f23854d = new SharingCommand("STOP", 1);

    /* renamed from: e */
    public static final SharingCommand f23855e = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* renamed from: f */
    public static final /* synthetic */ SharingCommand[] f23856f;

    /* renamed from: g */
    public static final /* synthetic */ InterfaceC11943a f23857g;

    static {
        SharingCommand[] sharingCommandArrM20862a = m20862a();
        f23856f = sharingCommandArrM20862a;
        f23857g = AbstractC9953a.m20230a(sharingCommandArrM20862a);
    }

    public SharingCommand(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ SharingCommand[] m20862a() {
        return new SharingCommand[]{f23853c, f23854d, f23855e};
    }

    public static SharingCommand valueOf(String str) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, str);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) f23856f.clone();
    }
}
