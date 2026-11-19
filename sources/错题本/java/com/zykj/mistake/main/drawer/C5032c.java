package com.zykj.mistake.main.drawer;

import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.main.C5066p;
import java.util.ArrayList;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5810y;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.main.drawer.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5032c implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f7857a;

    /* renamed from: b */
    public final /* synthetic */ CustomTagInfo f7858b;

    public /* synthetic */ C5032c(CustomTagInfo customTagInfo, int i) {
        this.f7857a = i;
        this.f7858b = customTagInfo;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f7857a) {
            case 0:
                C5066p draft = (C5066p) obj;
                AbstractC5830k.m5330g(draft, "draft");
                ArrayList arrayListM5218E0 = AbstractC5805t.m5218E0(draft.f7950l);
                boolean zIsEmpty = arrayListM5218E0.isEmpty();
                CustomTagInfo customTagInfo = this.f7858b;
                if (zIsEmpty) {
                    arrayListM5218E0.add(customTagInfo);
                } else {
                    int size = arrayListM5218E0.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayListM5218E0.get(i);
                        i++;
                        if (((CustomTagInfo) obj2).getId() == customTagInfo.getId()) {
                            AbstractC5810y.m5298Z(arrayListM5218E0, new C5032c(customTagInfo, 1));
                        }
                    }
                    arrayListM5218E0.add(customTagInfo);
                }
                return C5066p.m4379a(draft, null, null, 0, null, null, false, null, null, null, null, false, arrayListM5218E0, 2047);
            case 1:
                CustomTagInfo it = (CustomTagInfo) obj;
                AbstractC5830k.m5330g(it, "it");
                return Boolean.valueOf(it.getId() == this.f7858b.getId());
            case 2:
                CustomTagInfo it2 = (CustomTagInfo) obj;
                AbstractC5830k.m5330g(it2, "it");
                long id = it2.getId();
                CustomTagInfo customTagInfo2 = this.f7858b;
                return Boolean.valueOf(id == customTagInfo2.getId() && it2.getLocalType() == customTagInfo2.getLocalType());
            default:
                CustomTagInfo it3 = (CustomTagInfo) obj;
                AbstractC5830k.m5330g(it3, "it");
                return Boolean.valueOf(it3.getLocalType() == this.f7858b.getLocalType());
        }
    }
}
