package com.zykj.mistake.feature.home;

import android.view.SavedStateHandle;
import android.view.ViewModel;
import com.zykj.mistake.feature.collection.list.C4715n;
import com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel;
import com.zykj.mistake.feature.notebook.list.C4952i0;
import com.zykj.mistake.feature.notebook.list.C4955j0;
import com.zykj.mistake.feature.notebook.list.C4961l0;
import com.zykj.mistake.feature.notebook.list.C4964m0;
import com.zykj.mistake.feature.notebook.list.C4973q0;
import com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel;
import com.zykj.mistake.main.AbstractC5020a0;
import com.zykj.mistake.main.C5072s;
import com.zykj.mistake.main.C5076u;
import com.zykj.mistake.main.C5078v;
import com.zykj.mistake.main.C5080w;
import com.zykj.mistake.main.C5082x;
import com.zykj.mistake.main.C5084y;
import com.zykj.mistake.main.C5087z0;
import com.zykj.mistake.main.MainShellViewModel;
import com.zykj.mistake.main.TagEditorTarget;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

/* renamed from: com.zykj.mistake.feature.home.g */
/* loaded from: classes3.dex */
public final class C4734g implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ int f6836a;

    /* renamed from: b */
    public final /* synthetic */ ViewModel f6837b;

    /* renamed from: c */
    public final /* synthetic */ Object f6838c;

    public /* synthetic */ C4734g(ViewModel viewModel, Object obj, int i) {
        this.f6836a = i;
        this.f6837b = viewModel;
        this.f6838c = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    public final Object emit(Object obj, InterfaceC5631c interfaceC5631c) {
        switch (this.f6836a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    ((MainShellViewModel) this.f6837b).f7816h = true;
                    ((SavedStateHandle) this.f6838c).set("nav_result_refresh_collection_list", Boolean.FALSE);
                }
                break;
            default:
                AbstractC5020a0 abstractC5020a0 = (AbstractC5020a0) obj;
                MistakeNotebookViewModel mistakeNotebookViewModel = (MistakeNotebookViewModel) this.f6837b;
                if (AbstractC5830k.m5325b(abstractC5020a0, C5078v.f7966a)) {
                    mistakeNotebookViewModel.m4293c(C4952i0.f7565a);
                } else if (AbstractC5830k.m5325b(abstractC5020a0, C5072s.f7960a)) {
                    ((MistakeCollectionViewModel) this.f6838c).m4089a(C4715n.f6767a);
                } else if (abstractC5020a0 instanceof C5080w) {
                    C5080w c5080w = (C5080w) abstractC5020a0;
                    if (c5080w.f7968a == TagEditorTarget.NOTEBOOK) {
                        C5087z0 c5087z0 = c5080w.f7969b;
                        mistakeNotebookViewModel.m4293c(new C4961l0(c5087z0.f7981a, c5087z0.f7982b, c5087z0.f7983c, c5087z0.f7984d, c5087z0.f7985e));
                    }
                } else if (abstractC5020a0 instanceof C5076u) {
                    mistakeNotebookViewModel.m4293c(new C4955j0(((C5076u) abstractC5020a0).f7964a));
                } else if (abstractC5020a0 instanceof C5082x) {
                    C5082x c5082x = (C5082x) abstractC5020a0;
                    if (c5082x.f7971a == TagEditorTarget.NOTEBOOK) {
                        mistakeNotebookViewModel.m4293c(new C4964m0(c5082x.f7972b));
                    }
                } else if (abstractC5020a0 instanceof C5084y) {
                    C5084y c5084y = (C5084y) abstractC5020a0;
                    if (c5084y.f7974a == TagEditorTarget.NOTEBOOK) {
                        mistakeNotebookViewModel.m4293c(new C4973q0(c5084y.f7975b, c5084y.f7976c, c5084y.f7977d));
                    }
                }
                break;
        }
        return C5443s.f8405a;
    }
}
