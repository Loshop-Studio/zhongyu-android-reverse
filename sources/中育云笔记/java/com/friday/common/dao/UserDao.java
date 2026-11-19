package com.friday.common.dao;

import com.friday.common.entity.User;
import com.friday.common.helper.C5962b;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public interface UserDao {
    /* renamed from: a */
    static /* synthetic */ Object m5199a(UserDao userDao, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAlbumPermission");
        }
        if ((i10 & 1) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return userDao.mo5207c(j10, interfaceC11588c);
    }

    /* renamed from: e */
    static /* synthetic */ Object m5200e(UserDao userDao, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCameraPermission");
        }
        if ((i10 & 1) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return userDao.mo5209f(j10, interfaceC11588c);
    }

    /* renamed from: i */
    static /* synthetic */ Object m5201i(UserDao userDao, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getScreensPermission");
        }
        if ((i10 & 1) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return userDao.mo5208d(j10, interfaceC11588c);
    }

    /* renamed from: j */
    static /* synthetic */ Object m5202j(UserDao userDao, boolean z10, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveAlbumPermission");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return userDao.mo5212l(z10, j10, interfaceC11588c);
    }

    /* renamed from: k */
    static /* synthetic */ Object m5203k(UserDao userDao, boolean z10, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveCameraPermission");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return userDao.mo5214p(z10, j10, interfaceC11588c);
    }

    /* renamed from: m */
    static /* synthetic */ Object m5204m(UserDao userDao, boolean z10, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveScreensPermission");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return userDao.mo5210g(z10, j10, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
    
        if (r0.mo5211h(r1, r4) != r5) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object m5205n(com.friday.common.dao.UserDao r23, long r24, java.lang.String r26, vc.InterfaceC11588c r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.dao.UserDao.m5205n(com.friday.common.dao.UserDao, long, java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/dao/UserDao.smali:397
    }

    /* renamed from: b */
    default Object mo5206b(long j10, String str, InterfaceC11588c interfaceC11588c) {
        return m5205n(this, j10, str, interfaceC11588c);
    }

    /* renamed from: c */
    Object mo5207c(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: d */
    Object mo5208d(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: f */
    Object mo5209f(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: g */
    Object mo5210g(boolean z10, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: h */
    Object mo5211h(User user, InterfaceC11588c interfaceC11588c);

    /* renamed from: l */
    Object mo5212l(boolean z10, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: o */
    Object mo5213o(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: p */
    Object mo5214p(boolean z10, long j10, InterfaceC11588c interfaceC11588c);
}
