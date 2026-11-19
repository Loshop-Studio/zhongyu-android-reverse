package com.zykj.mistake.presenter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.activity.MistakeDetailActivity;
import com.zykj.mistake.base.BasePresenter;
import com.zykj.mistake.entity.req.CreateTagReq;
import com.zykj.mistake.network.C5088a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p021b5.C3191c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/mistake/presenter/MistakeDetailPresenter;", "Lcom/zykj/mistake/base/BasePresenter;", "Lcom/zykj/mistake/activity/MistakeDetailActivity;", "", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeDetailPresenter extends BasePresenter<MistakeDetailActivity> {
    /* renamed from: c */
    public final void m4436c(long j7, String tag, String oldTag) {
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC5830k.m5330g(oldTag, "oldTag");
        CreateTagReq createTagReq = new CreateTagReq(tag, j7);
        C5088a c5088a = C5088a.f7986a;
        m3969a(C5088a.m4381b().m4390h(createTagReq), new C3191c(j7, this, tag, oldTag, 1));
    }
}
