package com.friday.main.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5250g2;
import p040c2.InterfaceC5308v0;
import p325rc.AbstractC10978w;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DbViewModel extends BaseViewModel {

    /* renamed from: b */
    public final FileDao f9435b;

    /* renamed from: c */
    public final ResourceDao f9436c;

    /* renamed from: d */
    public final InterfaceC5250g2 f9437d;

    /* renamed from: e */
    public final InterfaceC5308v0 f9438e;

    /* renamed from: f */
    public final InterfaceC11603l f9439f;

    /* renamed from: g */
    public final InterfaceC11612u f9440g;

    /* renamed from: h */
    public final InterfaceC11603l f9441h;

    /* renamed from: i */
    public final InterfaceC11612u f9442i;

    /* renamed from: j */
    public final InterfaceC11603l f9443j;

    /* renamed from: k */
    public final InterfaceC11612u f9444k;

    /* renamed from: l */
    public final InterfaceC11603l f9445l;

    /* renamed from: m */
    public final InterfaceC11612u f9446m;

    public DbViewModel(FileDao fileDao, ResourceDao resourceDao, InterfaceC5250g2 shareCacheDao, InterfaceC5308v0 imageSafetyDao) {
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(shareCacheDao, "shareCacheDao");
        AbstractC9979u.m20294g(imageSafetyDao, "imageSafetyDao");
        this.f9435b = fileDao;
        this.f9436c = resourceDao;
        this.f9437d = shareCacheDao;
        this.f9438e = imageSafetyDao;
        m7186m();
        m7188o();
        m7189p();
        m7187n();
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f9439f = interfaceC11603lM25602a;
        this.f9440g = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        InterfaceC11603l interfaceC11603lM25602a2 = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f9441h = interfaceC11603lM25602a2;
        this.f9442i = AbstractC11596e.m25552b(interfaceC11603lM25602a2);
        InterfaceC11603l interfaceC11603lM25602a3 = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f9443j = interfaceC11603lM25602a3;
        this.f9444k = AbstractC11596e.m25552b(interfaceC11603lM25602a3);
        InterfaceC11603l interfaceC11603lM25602a4 = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f9445l = interfaceC11603lM25602a4;
        this.f9446m = AbstractC11596e.m25552b(interfaceC11603lM25602a4);
    }

    /* renamed from: m */
    public final void m7186m() {
        BaseViewModel.m4802c(this, new DbViewModel$fetchDb$1(this, null), null, null, 6, null);
    }

    /* renamed from: n */
    public final void m7187n() {
        BaseViewModel.m4802c(this, new DbViewModel$fetchImageDb$1(this, null), null, null, 6, null);
    }

    /* renamed from: o */
    public final void m7188o() {
        BaseViewModel.m4802c(this, new DbViewModel$fetchResDb$1(this, null), null, null, 6, null);
    }

    /* renamed from: p */
    public final void m7189p() {
        BaseViewModel.m4802c(this, new DbViewModel$fetchShareDb$1(this, null), null, null, 6, null);
    }

    /* renamed from: q */
    public final InterfaceC11612u m7190q() {
        return this.f9440g;
    }

    /* renamed from: r */
    public final InterfaceC11612u m7191r() {
        return this.f9446m;
    }

    /* renamed from: s */
    public final InterfaceC11612u m7192s() {
        return this.f9442i;
    }

    /* renamed from: t */
    public final InterfaceC11612u m7193t() {
        return this.f9444k;
    }
}
