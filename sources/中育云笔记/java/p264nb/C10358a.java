package p264nb;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* renamed from: nb.a */
/* loaded from: classes6.dex */
public final class C10358a {

    /* renamed from: a */
    public boolean f24667a;

    /* renamed from: b */
    public InterfaceC9529a f24668b;

    /* renamed from: c */
    public InterfaceC9529a f24669c;

    /* renamed from: d */
    public boolean f24670d;

    /* renamed from: e */
    public InterfaceC9529a f24671e;

    /* renamed from: f */
    public List f24672f;

    /* renamed from: g */
    public InterfaceC9529a f24673g;

    /* renamed from: h */
    public boolean f24674h;

    /* renamed from: i */
    public boolean f24675i;

    public C10358a(boolean z10, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, boolean z11, InterfaceC9529a interfaceC9529a3, List extrasForSetting, InterfaceC9529a interfaceC9529a4, AbstractC10360b abstractC10360b, boolean z12, boolean z13) {
        AbstractC9979u.m20294g(extrasForSetting, "extrasForSetting");
        this.f24667a = z10;
        this.f24668b = interfaceC9529a;
        this.f24669c = interfaceC9529a2;
        this.f24670d = z11;
        this.f24671e = interfaceC9529a3;
        this.f24672f = extrasForSetting;
        this.f24673g = interfaceC9529a4;
        this.f24674h = z12;
        this.f24675i = z13;
    }

    /* renamed from: a */
    public final InterfaceC9529a m21685a() {
        return this.f24668b;
    }

    /* renamed from: b */
    public final InterfaceC9529a m21686b() {
        return this.f24671e;
    }

    /* renamed from: c */
    public final InterfaceC9529a m21687c() {
        return this.f24669c;
    }

    /* renamed from: d */
    public final List m21688d() {
        return this.f24672f;
    }

    /* renamed from: e */
    public final boolean m21689e() {
        return this.f24674h;
    }

    /* renamed from: f */
    public final boolean m21690f() {
        return this.f24670d;
    }

    /* renamed from: g */
    public final boolean m21691g() {
        return this.f24667a;
    }

    /* renamed from: h */
    public final AbstractC10360b m21692h() {
        return null;
    }

    /* renamed from: i */
    public final boolean m21693i() {
        return this.f24675i;
    }

    public /* synthetic */ C10358a(boolean z10, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, boolean z11, InterfaceC9529a interfaceC9529a3, List list, InterfaceC9529a interfaceC9529a4, AbstractC10360b abstractC10360b, boolean z12, boolean z13, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : interfaceC9529a, (i10 & 4) != 0 ? null : interfaceC9529a2, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : interfaceC9529a3, (i10 & 32) != 0 ? new ArrayList() : list, (i10 & 64) != 0 ? null : interfaceC9529a4, (i10 & 128) != 0 ? null : abstractC10360b, (i10 & 256) != 0 ? false : z12, (i10 & 512) != 0 ? false : z13);
    }
}
