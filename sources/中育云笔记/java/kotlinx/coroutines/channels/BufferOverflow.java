package kotlinx.coroutines.channels;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BufferOverflow {

    /* renamed from: c */
    public static final BufferOverflow f23519c = new BufferOverflow("SUSPEND", 0);

    /* renamed from: d */
    public static final BufferOverflow f23520d = new BufferOverflow("DROP_OLDEST", 1);

    /* renamed from: e */
    public static final BufferOverflow f23521e = new BufferOverflow("DROP_LATEST", 2);

    /* renamed from: f */
    public static final /* synthetic */ BufferOverflow[] f23522f;

    /* renamed from: g */
    public static final /* synthetic */ InterfaceC11943a f23523g;

    static {
        BufferOverflow[] bufferOverflowArrM20541a = m20541a();
        f23522f = bufferOverflowArrM20541a;
        f23523g = AbstractC9953a.m20230a(bufferOverflowArrM20541a);
    }

    public BufferOverflow(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ BufferOverflow[] m20541a() {
        return new BufferOverflow[]{f23519c, f23520d, f23521e};
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) f23522f.clone();
    }
}
