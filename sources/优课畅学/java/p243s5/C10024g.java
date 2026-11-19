package p243s5;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* renamed from: s5.g */
/* loaded from: classes5.dex */
public final class C10024g {

    /* renamed from: a */
    public int f20057a;

    /* renamed from: b */
    public String f20058b;

    /* renamed from: c */
    public InterfaceC10559a f20059c;

    public C10024g(int i10, String displayText, InterfaceC10559a clickCallback) {
        AbstractC9133u.m16133g(displayText, "displayText");
        AbstractC9133u.m16133g(clickCallback, "clickCallback");
        this.f20057a = i10;
        this.f20058b = displayText;
        this.f20059c = clickCallback;
    }

    /* renamed from: a */
    public final InterfaceC10559a m18731a() {
        return this.f20059c;
    }

    /* renamed from: b */
    public final String m18732b() {
        return this.f20058b;
    }

    /* renamed from: c */
    public final int m18733c() {
        return this.f20057a;
    }
}
