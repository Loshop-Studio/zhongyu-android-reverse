package com.zykj.mistake.feature.collection.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.notebook.list.AbstractC4953i1;
import p045d6.C5443s;
import p137p4.C6383b;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.list.w */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4724w implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6786a;

    /* renamed from: b */
    public final /* synthetic */ boolean f6787b;

    /* renamed from: c */
    public final /* synthetic */ boolean f6788c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6469a f6789d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6469a f6790e;

    /* renamed from: f */
    public final /* synthetic */ int f6791f;

    /* renamed from: g */
    public final /* synthetic */ Object f6792g;

    public /* synthetic */ C4724w(Object obj, boolean z8, boolean z9, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, int i, int i8) {
        this.f6786a = i8;
        this.f6792g = obj;
        this.f6787b = z8;
        this.f6788c = z9;
        this.f6789d = interfaceC6469a;
        this.f6790e = interfaceC6469a2;
        this.f6791f = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6786a) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC4704c0.m4094b((C4701b) this.f6792g, this.f6787b, this.f6788c, this.f6789d, this.f6790e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6791f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC4953i1.m4304a((C6383b) this.f6792g, this.f6787b, this.f6788c, this.f6789d, this.f6790e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6791f | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
