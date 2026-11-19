package com.zykj.mistake.main.drawer;

import com.zykj.mistake.entity.resp.CustomTagInfo;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.main.drawer.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5037h implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f7883a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6473e f7884b;

    /* renamed from: c */
    public final /* synthetic */ CustomTagInfo f7885c;

    public /* synthetic */ C5037h(InterfaceC6473e interfaceC6473e, CustomTagInfo customTagInfo, int i) {
        this.f7883a = i;
        this.f7884b = interfaceC6473e;
        this.f7885c = customTagInfo;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f7883a) {
            case 0:
                this.f7884b.invoke(this.f7885c, Boolean.TRUE);
                break;
            default:
                CustomTagInfo customTagInfo = this.f7885c;
                this.f7884b.invoke(Long.valueOf(customTagInfo.getId()), customTagInfo.getName());
                break;
        }
        return C5443s.f8405a;
    }
}
