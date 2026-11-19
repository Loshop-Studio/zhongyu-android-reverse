package com.zykj.mistake.feature.home;

import android.view.SavedStateHandle;
import com.zykj.mistake.feature.notebook.list.C4985w0;
import com.zykj.mistake.feature.notebook.list.C4987x0;
import com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

/* renamed from: com.zykj.mistake.feature.home.f */
/* loaded from: classes3.dex */
public final class C4733f implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ int f6833a;

    /* renamed from: b */
    public final /* synthetic */ MistakeNotebookViewModel f6834b;

    /* renamed from: c */
    public final /* synthetic */ SavedStateHandle f6835c;

    public /* synthetic */ C4733f(MistakeNotebookViewModel mistakeNotebookViewModel, SavedStateHandle savedStateHandle, int i) {
        this.f6833a = i;
        this.f6834b = mistakeNotebookViewModel;
        this.f6835c = savedStateHandle;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    public final Object emit(Object obj, InterfaceC5631c interfaceC5631c) {
        switch (this.f6833a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    this.f6834b.m4293c(C4985w0.f7621a);
                    this.f6835c.set("nav_result_refresh_notebook", Boolean.FALSE);
                }
                break;
            default:
                Integer num = (Integer) obj;
                if (num != null) {
                    int iIntValue = num.intValue();
                    SavedStateHandle savedStateHandle = this.f6835c;
                    Boolean bool = (Boolean) savedStateHandle.get("nav_result_notebook_removed_item_is_mastered");
                    this.f6834b.m4293c(new C4987x0(iIntValue, bool != null ? bool.booleanValue() : false));
                    savedStateHandle.set("nav_result_notebook_removed_item_id", null);
                    savedStateHandle.set("nav_result_notebook_removed_item_is_mastered", null);
                }
                break;
        }
        return C5443s.f8405a;
    }
}
