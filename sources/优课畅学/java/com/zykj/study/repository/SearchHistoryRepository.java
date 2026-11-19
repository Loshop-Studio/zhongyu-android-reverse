package com.zykj.study.repository;

import androidx.lifecycle.LiveData;
import com.zykj.study.data.SearchHistoryEntity;
import com.zykj.study.data.SearchHistoryEntityDao;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

/* loaded from: classes3.dex */
public final class SearchHistoryRepository {

    /* renamed from: a */
    public final SearchHistoryEntityDao f11501a;

    public SearchHistoryRepository(SearchHistoryEntityDao searchHistoryDao) {
        AbstractC9133u.m16133g(searchHistoryDao, "searchHistoryDao");
        this.f11501a = searchHistoryDao;
    }

    /* renamed from: b */
    public final Object m10389b(String str, InterfaceC9324c interfaceC9324c) {
        Object objDeleteAll = this.f11501a.deleteAll(str, interfaceC9324c);
        return objDeleteAll == AbstractC9434a.m17291f() ? objDeleteAll : C8736p.f16368a;
    }

    /* renamed from: c */
    public final Object m10390c(SearchHistoryEntity searchHistoryEntity, InterfaceC9324c interfaceC9324c) {
        Object objDelete = this.f11501a.delete(new SearchHistoryEntity[]{searchHistoryEntity}, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
        return objDelete == AbstractC9434a.m17291f() ? objDelete : C8736p.f16368a;
    }

    /* renamed from: d */
    public final LiveData m10391d(String userId) {
        AbstractC9133u.m16133g(userId, "userId");
        return this.f11501a.getHistoryList(userId);
    }

    /* renamed from: e */
    public final Object m10392e(String str, String str2, InterfaceC9324c interfaceC9324c) {
        if (AbstractC8661c0.m13982W0(str).toString().length() == 0) {
            return C8736p.f16368a;
        }
        Object objM14848g = AbstractC8833f.m14848g(C8843i0.m14867b(), new SearchHistoryRepository$insertRecord$2(this, str2, str, null), interfaceC9324c);
        return objM14848g == AbstractC9434a.m17291f() ? objM14848g : C8736p.f16368a;
    }
}
