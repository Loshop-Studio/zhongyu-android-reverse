package com.zykj.mistake.feature.collection.filter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.main.drawer.AbstractC5036g;
import com.zykj.mistake.main.drawer.AbstractC5041l;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.filter.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4653h implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6641a;

    /* renamed from: b */
    public final /* synthetic */ String f6642b;

    /* renamed from: c */
    public final /* synthetic */ long f6643c;

    /* renamed from: d */
    public final /* synthetic */ long f6644d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6469a f6645e;

    /* renamed from: f */
    public final /* synthetic */ int f6646f;

    public /* synthetic */ C4653h(String str, long j7, long j8, InterfaceC6469a interfaceC6469a, int i, int i8) {
        this.f6641a = i8;
        this.f6642b = str;
        this.f6643c = j7;
        this.f6644d = j8;
        this.f6645e = interfaceC6469a;
        this.f6646f = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6641a) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC4655i.m4075a(this.f6642b, this.f6643c, this.f6644d, this.f6645e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6646f | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC5036g.m4365b(this.f6642b, this.f6643c, this.f6644d, this.f6645e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6646f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC5041l.m4369a(this.f6642b, this.f6643c, this.f6644d, this.f6645e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6646f | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
