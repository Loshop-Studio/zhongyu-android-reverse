package com.zykj.mistake.feature.collection.detail;

import android.view.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p167t4.C6592e;
import p185v7.AbstractC6675d;

/* renamed from: com.zykj.mistake.feature.collection.detail.d */
/* loaded from: classes3.dex */
public final class C4584d implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ MistakeCollectionDetailViewModel f6464a;

    /* renamed from: b */
    public final /* synthetic */ C6592e f6465b;

    /* renamed from: c */
    public final /* synthetic */ NavBackStackEntry f6466c;

    public C4584d(MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, C6592e c6592e, NavBackStackEntry navBackStackEntry) {
        this.f6464a = mistakeCollectionDetailViewModel;
        this.f6465b = c6592e;
        this.f6466c = navBackStackEntry;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    public final Object emit(Object obj, InterfaceC5631c interfaceC5631c) {
        Integer num = (Integer) obj;
        C5443s c5443s = C5443s.f8405a;
        if (num == null) {
            return c5443s;
        }
        this.f6464a.m4027d(new C4600j0(AbstractC6675d.m6354t(num)));
        SavedStateHandle savedStateHandleM6223b = this.f6465b.m6223b();
        if (savedStateHandleM6223b != null) {
            savedStateHandleM6223b.set("nav_result_refresh_notebook", Boolean.TRUE);
        }
        NavBackStackEntry navBackStackEntry = this.f6466c;
        navBackStackEntry.getSavedStateHandle().set("nav_result_collection_removed_item_id", null);
        navBackStackEntry.getSavedStateHandle().set("nav_result_collection_removed_item_is_mastered", null);
        return c5443s;
    }
}
