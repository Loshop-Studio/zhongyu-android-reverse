package p264nb;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* renamed from: nb.g */
/* loaded from: classes6.dex */
public final class C10368g {

    /* renamed from: a */
    public int f24695a;

    /* renamed from: b */
    public String f24696b;

    /* renamed from: c */
    public InterfaceC9529a f24697c;

    public C10368g(int i10, String displayText, InterfaceC9529a clickCallback) {
        AbstractC9979u.m20294g(displayText, "displayText");
        AbstractC9979u.m20294g(clickCallback, "clickCallback");
        this.f24695a = i10;
        this.f24696b = displayText;
        this.f24697c = clickCallback;
    }

    /* renamed from: a */
    public final InterfaceC9529a m21705a() {
        return this.f24697c;
    }

    /* renamed from: b */
    public final String m21706b() {
        return this.f24696b;
    }

    /* renamed from: c */
    public final int m21707c() {
        return this.f24695a;
    }
}
