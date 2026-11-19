package com.zykj.study.repository;

import androidx.lifecycle.LiveData;
import com.zykj.study.data.AppDatabase;
import com.zykj.study.data.GradeEntityDao;
import com.zykj.study.data.PeriodEntityDao;
import com.zykj.study.data.SubjectEntityDao;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p198o4.InterfaceC9520c;

/* loaded from: classes3.dex */
public final class DictRepository {

    /* renamed from: a */
    public final AppDatabase f11386a;

    /* renamed from: b */
    public final PeriodEntityDao f11387b;

    /* renamed from: c */
    public final GradeEntityDao f11388c;

    /* renamed from: d */
    public final SubjectEntityDao f11389d;

    /* renamed from: e */
    public final InterfaceC9520c f11390e;

    public DictRepository(AppDatabase db, PeriodEntityDao periodEntityDao, GradeEntityDao gradeEntityDao, SubjectEntityDao subjectEntityDao, InterfaceC9520c api) {
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(periodEntityDao, "periodEntityDao");
        AbstractC9133u.m16133g(gradeEntityDao, "gradeEntityDao");
        AbstractC9133u.m16133g(subjectEntityDao, "subjectEntityDao");
        AbstractC9133u.m16133g(api, "api");
        this.f11386a = db;
        this.f11387b = periodEntityDao;
        this.f11388c = gradeEntityDao;
        this.f11389d = subjectEntityDao;
        this.f11390e = api;
    }

    /* renamed from: f */
    public final LiveData m10361f() {
        return this.f11388c.getList();
    }

    /* renamed from: g */
    public final LiveData m10362g() {
        return this.f11387b.getList();
    }

    /* renamed from: h */
    public final LiveData m10363h() {
        return this.f11389d.getList();
    }

    /* renamed from: i */
    public final Object m10364i(InterfaceC9324c interfaceC9324c) {
        Object objM14848g = AbstractC8833f.m14848g(C8843i0.m14867b(), new DictRepository$initDict$2(this, null), interfaceC9324c);
        return objM14848g == AbstractC9434a.m17291f() ? objM14848g : C8736p.f16368a;
    }
}
