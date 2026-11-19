package com.zykj.mistake.feature.collection.detail;

import androidx.navigation.NavBackStackEntry;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

/* renamed from: com.zykj.mistake.feature.collection.detail.c */
/* loaded from: classes3.dex */
public final class C4581c implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ int f6454a;

    /* renamed from: b */
    public final /* synthetic */ MistakeCollectionDetailViewModel f6455b;

    /* renamed from: c */
    public final /* synthetic */ NavBackStackEntry f6456c;

    public C4581c(NavBackStackEntry navBackStackEntry, MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel) {
        this.f6454a = 0;
        this.f6456c = navBackStackEntry;
        this.f6455b = mistakeCollectionDetailViewModel;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    public final Object emit(Object obj, InterfaceC5631c interfaceC5631c) {
        switch (this.f6454a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    NavBackStackEntry navBackStackEntry = this.f6456c;
                    Integer num = (Integer) navBackStackEntry.getSavedStateHandle().get("nav_result_collection_added_count");
                    this.f6455b.m4027d(new C4598i0(num != null ? num.intValue() : 0));
                    navBackStackEntry.getSavedStateHandle().set("nav_result_collection_detail_refresh", Boolean.FALSE);
                }
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    this.f6455b.m4027d(C4596h0.f6485a);
                    this.f6456c.getSavedStateHandle().set("nav_result_collection_detail_refresh_after_practice", Boolean.FALSE);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    this.f6455b.m4027d(C4596h0.f6485a);
                    this.f6456c.getSavedStateHandle().set("nav_result_collection_detail_refresh_after_collection_change", Boolean.FALSE);
                }
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C4581c(MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, NavBackStackEntry navBackStackEntry, int i) {
        this.f6454a = i;
        this.f6455b = mistakeCollectionDetailViewModel;
        this.f6456c = navBackStackEntry;
    }
}
