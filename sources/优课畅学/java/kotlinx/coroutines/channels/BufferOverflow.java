package kotlinx.coroutines.channels;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BufferOverflow {

    /* renamed from: a */
    public static final BufferOverflow f17603a = new BufferOverflow("SUSPEND", 0);

    /* renamed from: b */
    public static final BufferOverflow f17604b = new BufferOverflow("DROP_OLDEST", 1);

    /* renamed from: c */
    public static final BufferOverflow f17605c = new BufferOverflow("DROP_LATEST", 2);

    /* renamed from: d */
    public static final /* synthetic */ BufferOverflow[] f17606d;

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC9760a f17607e;

    static {
        BufferOverflow[] bufferOverflowArrM16375a = m16375a();
        f17606d = bufferOverflowArrM16375a;
        f17607e = AbstractC9108a.m16085a(bufferOverflowArrM16375a);
    }

    public BufferOverflow(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ BufferOverflow[] m16375a() {
        return new BufferOverflow[]{f17603a, f17604b, f17605c};
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) f17606d.clone();
    }
}
