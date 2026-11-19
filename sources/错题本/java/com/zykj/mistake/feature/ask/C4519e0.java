package com.zykj.mistake.feature.ask;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.notebook.list.AbstractC4954j;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.ask.e0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4519e0 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6227a = 1;

    /* renamed from: b */
    public final /* synthetic */ String f6228b;

    /* renamed from: c */
    public final /* synthetic */ long f6229c;

    /* renamed from: d */
    public final /* synthetic */ long f6230d;

    /* renamed from: e */
    public final /* synthetic */ boolean f6231e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC6469a f6232f;

    /* renamed from: g */
    public final /* synthetic */ int f6233g;

    public /* synthetic */ C4519e0(String str, long j7, long j8, boolean z8, InterfaceC6469a interfaceC6469a, int i) {
        this.f6228b = str;
        this.f6229c = j7;
        this.f6230d = j8;
        this.f6231e = z8;
        this.f6232f = interfaceC6469a;
        this.f6233g = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6227a) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC4539o0.m4004b(RecomposeScopeImplKt.updateChangedFlags(this.f6233g | 1), this.f6229c, this.f6230d, (Composer) obj, this.f6228b, this.f6232f, this.f6231e);
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC4954j.m4314b(RecomposeScopeImplKt.updateChangedFlags(this.f6233g | 1), this.f6229c, this.f6230d, (Composer) obj, this.f6228b, this.f6232f, this.f6231e);
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C4519e0(String str, boolean z8, long j7, long j8, InterfaceC6469a interfaceC6469a, int i) {
        this.f6228b = str;
        this.f6231e = z8;
        this.f6229c = j7;
        this.f6230d = j8;
        this.f6232f = interfaceC6469a;
        this.f6233g = i;
    }
}
