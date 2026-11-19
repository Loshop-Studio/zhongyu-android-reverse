package com.friday.document.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.common.base.BaseViewModel;
import com.friday.document.model.TchByCloudEntity;
import com.friday.document.viewmodel.ShareByTeacherViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p330s2.InterfaceC11052b;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShareByTeacherViewModel extends BaseViewModel {

    /* renamed from: b */
    public final InterfaceC11052b f8273b;

    /* renamed from: c */
    public final InterfaceC11603l f8274c;

    /* renamed from: d */
    public final InterfaceC11612u f8275d;

    /* renamed from: e */
    public final InterfaceC11603l f8276e;

    /* renamed from: f */
    public final InterfaceC11612u f8277f;

    public ShareByTeacherViewModel(InterfaceC11052b shareService) {
        AbstractC9979u.m20294g(shareService, "shareService");
        this.f8273b = shareService;
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f8274c = interfaceC11603lM25602a;
        this.f8275d = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        InterfaceC11603l interfaceC11603lM25602a2 = AbstractC11613v.m25602a(Boolean.FALSE);
        this.f8276e = interfaceC11603lM25602a2;
        this.f8277f = AbstractC11596e.m25552b(interfaceC11603lM25602a2);
    }

    /* renamed from: j */
    public static final C10786q m6391j(boolean z10, ShareByTeacherViewModel shareByTeacherViewModel) {
        if (z10) {
            shareByTeacherViewModel.f8276e.setValue(Boolean.FALSE);
        }
        return C10786q.f26013a;
    }

    /* renamed from: i */
    public final void m6392i(final boolean z10) {
        m4804b(new ShareByTeacherViewModel$getSharedTchList$1(z10, this, null), new ShareByTeacherViewModel$getSharedTchList$2(this, null), new InterfaceC9529a() { // from class: z2.z
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return ShareByTeacherViewModel.m6391j(z10, this);
            }
        });
    }

    /* renamed from: k */
    public final InterfaceC11612u m6393k() {
        return this.f8275d;
    }

    /* renamed from: l */
    public final void m6394l(TchByCloudEntity clickedTch) {
        AbstractC9979u.m20294g(clickedTch, "clickedTch");
        List<TchByCloudEntity> listM23925a1 = AbstractC10947g0.m23925a1((Collection) this.f8274c.getValue());
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(listM23925a1, 10));
        for (TchByCloudEntity tchByCloudEntity : listM23925a1) {
            arrayList.add(tchByCloudEntity.getTeacherId() == clickedTch.getTeacherId() ? TchByCloudEntity.copy$default(tchByCloudEntity, 0L, null, null, null, true, 15, null) : TchByCloudEntity.copy$default(tchByCloudEntity, 0L, null, null, null, false, 15, null));
        }
        this.f8274c.setValue(arrayList);
    }

    /* renamed from: m */
    public final InterfaceC11612u m6395m() {
        return this.f8277f;
    }
}
