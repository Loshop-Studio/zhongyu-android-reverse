package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.AbstractC5380q;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.course.CatalogLockedBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.InterfaceC9198a;
import p009a8.C0045a;
import p009a8.InterfaceC0049e;
import p089e8.InterfaceC8383k;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9280q;
import p198o4.InterfaceC9519b;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CourseManageVewModel extends BaseViewModel {

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC8383k[] f13941f = {AbstractC9137y.m16157e(new MutablePropertyReference1Impl(CourseManageVewModel.class, "courseId", "getCourseId()J", 0))};

    /* renamed from: g */
    public static final int f13942g = 8;

    /* renamed from: a */
    public final InterfaceC9519b f13943a;

    /* renamed from: b */
    public final InterfaceC0049e f13944b;

    /* renamed from: c */
    public final InterfaceC9271h f13945c;

    /* renamed from: d */
    public final InterfaceC9271h f13946d;

    /* renamed from: e */
    public final InterfaceC9280q f13947e;

    public CourseManageVewModel(InterfaceC9519b courseApi) {
        AbstractC9133u.m16133g(courseApi, "courseApi");
        this.f13943a = courseApi;
        this.f13944b = C0045a.f110a.m117a();
        InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(AbstractC8809v.m14771n());
        this.f13945c = interfaceC9271hM17054a;
        InterfaceC9271h interfaceC9271hM17054a2 = AbstractC9281r.m17054a(AbstractC8809v.m14771n());
        this.f13946d = interfaceC9271hM17054a2;
        this.f13947e = AbstractC9268e.m17006R(AbstractC9268e.m17021k(interfaceC9271hM17054a, interfaceC9271hM17054a2, new CourseManageVewModel$catalogDataList$1(null)), ViewModelKt.getViewModelScope(this), InterfaceC9198a.a.m16691b(InterfaceC9198a.f17984a, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), AbstractC8809v.m14771n());
    }

    /* renamed from: f */
    public final InterfaceC9280q m12052f() {
        return this.f13947e;
    }

    /* renamed from: g */
    public final long m12053g() {
        return ((Number) this.f13944b.getValue(this, f13941f[0])).longValue();
    }

    /* renamed from: h */
    public final void m12054h(long j10) {
        BaseViewModel.launchData$default(this, null, null, new CourseManageVewModel$initData$1(this, j10, null), 3, null);
    }

    /* renamed from: i */
    public final void m12055i(long j10, boolean z10) {
        BaseViewModel.launchData$default(this, null, null, new CourseManageVewModel$setChapterExpanded$1(this, z10, j10, null), 3, null);
    }

    /* renamed from: j */
    public final void m12056j(long j10, boolean z10) {
        Object next;
        List<CatalogLockedBean> children;
        StringBuilder sb = new StringBuilder();
        sb.append("setChapterLocked -> [");
        sb.append(j10);
        sb.append("]: ");
        sb.append(!z10);
        AbstractC5380q.m2623s(sb.toString());
        Iterator it = ((Iterable) this.f13945c.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((CatalogLockedBean) next).getId() == j10) {
                    break;
                }
            }
        }
        CatalogLockedBean catalogLockedBean = (CatalogLockedBean) next;
        if (catalogLockedBean == null || (children = catalogLockedBean.getChildren()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(children, 10));
        Iterator<T> it2 = children.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((CatalogLockedBean) it2.next()).getId()));
        }
        BaseViewModel.launchData$default(this, null, null, new CourseManageVewModel$setChapterLocked$1(this, arrayList, z10, j10, null), 3, null);
    }

    /* renamed from: k */
    public final void m12057k(long j10) {
        this.f13944b.setValue(this, f13941f[0], Long.valueOf(j10));
    }

    /* renamed from: l */
    public final void m12058l(long j10, boolean z10) {
        StringBuilder sb = new StringBuilder();
        sb.append("setKnowledgeLocked -> [");
        sb.append(j10);
        sb.append("]: ");
        sb.append(!z10);
        AbstractC5380q.m2623s(sb.toString());
        BaseViewModel.launchData$default(this, null, null, new CourseManageVewModel$setKnowledgeLocked$1(z10, this, j10, null), 3, null);
    }
}
