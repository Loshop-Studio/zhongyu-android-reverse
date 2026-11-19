package com.zykj.mistake.data;

import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5873b;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5904c;
import p045d6.C5443s;

/* renamed from: com.zykj.mistake.data.b */
/* loaded from: classes3.dex */
public final class C4493b {

    /* renamed from: a */
    public static final C4493b f6003a = new C4493b();

    /* renamed from: b */
    public static boolean f6004b;

    /* renamed from: c */
    public static final C5873b f6005c;

    /* renamed from: d */
    public static final C5904c f6006d;

    static {
        C5873b c5873bM5511a = AbstractC5882k.m5511a(-1, 6, null);
        f6005c = c5873bM5511a;
        f6006d = AbstractC5914h.m5556l(c5873bM5511a);
    }

    /* renamed from: a */
    public final synchronized void m3974a() {
        if (f6004b) {
            return;
        }
        f6004b = true;
        f6005c.mo5481a(C5443s.f8405a);
    }
}
