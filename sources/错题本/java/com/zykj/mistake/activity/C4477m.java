package com.zykj.mistake.activity;

import com.blankj.utilcode.util.AbstractC3385e;
import com.zykj.mistake.presenter.MistakeCreateOrEditPresenter;
import com.zykj.mistake.presenter.MistakeDetailPresenter;
import com.zykj.mistake.presenter.MistakeListPresenter;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.activity.m */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4477m implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f5917a;

    /* renamed from: b */
    public final /* synthetic */ Object f5918b;

    public /* synthetic */ C4477m(Object obj, int i) {
        this.f5917a = i;
        this.f5918b = obj;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        int i = this.f5917a;
        C5443s c5443s = C5443s.f8405a;
        Object obj2 = this.f5918b;
        switch (i) {
            case 0:
                String it = (String) obj;
                int i8 = MistakeCreateOrEditActivity.f5799u;
                AbstractC5830k.m5330g(it, "it");
                ((MistakeCreateOrEditPresenter) ((MistakeCreateOrEditActivity) obj2).m3965r()).m4435c(0L, it, "");
                break;
            case 1:
                String it2 = (String) obj;
                int i9 = MistakeDetailActivity.f5816s;
                AbstractC5830k.m5330g(it2, "it");
                ((MistakeDetailPresenter) ((MistakeDetailActivity) obj2).m3965r()).m4436c(0L, it2, "");
                break;
            case 2:
                String it3 = (String) obj;
                int i10 = MistakeListActivity.f5831x;
                AbstractC5830k.m5330g(it3, "it");
                ((MistakeListPresenter) ((MistakeListActivity) obj2).m3965r()).m4437c(0L, it3, "");
                break;
            default:
                int i11 = SketchActivity.f5853v;
                AbstractC3385e.m2333e(AbstractC3385e.m2335g((String) obj2));
                break;
        }
        return c5443s;
    }
}
