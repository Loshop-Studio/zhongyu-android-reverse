package p243s5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* renamed from: s5.a */
/* loaded from: classes5.dex */
public final class C10014a {

    /* renamed from: a */
    public boolean f20029a;

    /* renamed from: b */
    public InterfaceC10559a f20030b;

    /* renamed from: c */
    public InterfaceC10559a f20031c;

    /* renamed from: d */
    public boolean f20032d;

    /* renamed from: e */
    public InterfaceC10559a f20033e;

    /* renamed from: f */
    public List f20034f;

    /* renamed from: g */
    public InterfaceC10559a f20035g;

    /* renamed from: h */
    public boolean f20036h;

    /* renamed from: i */
    public boolean f20037i;

    public C10014a(boolean z10, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, boolean z11, InterfaceC10559a interfaceC10559a3, List extrasForSetting, InterfaceC10559a interfaceC10559a4, AbstractC10016b abstractC10016b, boolean z12, boolean z13) {
        AbstractC9133u.m16133g(extrasForSetting, "extrasForSetting");
        this.f20029a = z10;
        this.f20030b = interfaceC10559a;
        this.f20031c = interfaceC10559a2;
        this.f20032d = z11;
        this.f20033e = interfaceC10559a3;
        this.f20034f = extrasForSetting;
        this.f20035g = interfaceC10559a4;
        this.f20036h = z12;
        this.f20037i = z13;
    }

    /* renamed from: a */
    public final InterfaceC10559a m18711a() {
        return this.f20030b;
    }

    /* renamed from: b */
    public final InterfaceC10559a m18712b() {
        return this.f20033e;
    }

    /* renamed from: c */
    public final InterfaceC10559a m18713c() {
        return this.f20031c;
    }

    /* renamed from: d */
    public final List m18714d() {
        return this.f20034f;
    }

    /* renamed from: e */
    public final boolean m18715e() {
        return this.f20036h;
    }

    /* renamed from: f */
    public final boolean m18716f() {
        return this.f20032d;
    }

    /* renamed from: g */
    public final boolean m18717g() {
        return this.f20029a;
    }

    /* renamed from: h */
    public final AbstractC10016b m18718h() {
        return null;
    }

    /* renamed from: i */
    public final boolean m18719i() {
        return this.f20037i;
    }

    public /* synthetic */ C10014a(boolean z10, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, boolean z11, InterfaceC10559a interfaceC10559a3, List list, InterfaceC10559a interfaceC10559a4, AbstractC10016b abstractC10016b, boolean z12, boolean z13, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : interfaceC10559a, (i10 & 4) != 0 ? null : interfaceC10559a2, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : interfaceC10559a3, (i10 & 32) != 0 ? new ArrayList() : list, (i10 & 64) != 0 ? null : interfaceC10559a4, (i10 & 128) != 0 ? null : abstractC10016b, (i10 & 256) != 0 ? false : z12, (i10 & 512) != 0 ? false : z13);
    }
}
