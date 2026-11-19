package com.friday.document.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.helper.C5962b;
import com.friday.document.service.FileManager;
import kotlin.jvm.internal.AbstractC9979u;
import p330s2.InterfaceC11051a;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11608q;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11607p;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TeacherOnlyViewModel extends BaseViewModel {

    /* renamed from: b */
    public final InterfaceC11051a f8388b;

    /* renamed from: c */
    public final FileDao f8389c;

    /* renamed from: d */
    public final FileManager f8390d;

    /* renamed from: e */
    public final InterfaceC11602k f8391e;

    /* renamed from: f */
    public final InterfaceC11607p f8392f;

    public TeacherOnlyViewModel(InterfaceC11051a service, FileDao fileDao, FileManager fileManager) {
        AbstractC9979u.m20294g(service, "service");
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(fileManager, "fileManager");
        this.f8388b = service;
        this.f8389c = fileDao;
        this.f8390d = fileManager;
        InterfaceC11602k interfaceC11602kM25592b = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f8391e = interfaceC11602kM25592b;
        this.f8392f = AbstractC11596e.m25551a(interfaceC11602kM25592b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final long m6474l() {
        return C5962b.f6082a.m5299a().m5292t();
    }

    /* renamed from: j */
    public final InterfaceC11607p m6475j() {
        return this.f8392f;
    }

    /* renamed from: k */
    public final void m6476k() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new TeacherOnlyViewModel$startJob$1(this, null), 3, null);
    }
}
