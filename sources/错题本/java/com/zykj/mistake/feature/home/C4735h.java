package com.zykj.mistake.feature.home;

import com.zykj.mistake.feature.collection.list.C4709h;
import com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel;
import com.zykj.mistake.feature.notebook.list.C4990z;
import com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel;
import com.zykj.mistake.feature.review.C4996d;
import com.zykj.mistake.feature.review.ReviewViewModel;
import com.zykj.mistake.main.C5043e;
import com.zykj.mistake.main.MainShellViewModel;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

/* renamed from: com.zykj.mistake.feature.home.h */
/* loaded from: classes3.dex */
public final class C4735h implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ MainShellViewModel f6839a;

    /* renamed from: b */
    public final /* synthetic */ MistakeNotebookViewModel f6840b;

    /* renamed from: c */
    public final /* synthetic */ MistakeCollectionViewModel f6841c;

    /* renamed from: d */
    public final /* synthetic */ ReviewViewModel f6842d;

    public C4735h(MainShellViewModel mainShellViewModel, MistakeNotebookViewModel mistakeNotebookViewModel, MistakeCollectionViewModel mistakeCollectionViewModel, ReviewViewModel reviewViewModel) {
        this.f6839a = mainShellViewModel;
        this.f6840b = mistakeNotebookViewModel;
        this.f6841c = mistakeCollectionViewModel;
        this.f6842d = reviewViewModel;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    public final Object emit(Object obj, InterfaceC5631c interfaceC5631c) {
        C5043e c5043e = (C5043e) obj;
        C5443s c5443s = C5443s.f8405a;
        if (c5043e == null) {
            return c5443s;
        }
        int i = c5043e.f7906c;
        String str = c5043e.f7905b;
        MainShellViewModel mainShellViewModel = this.f6839a;
        mainShellViewModel.f7815g = null;
        mainShellViewModel.m4353a();
        this.f6840b.m4293c(new C4990z(i));
        this.f6841c.m4089a(new C4709h(i));
        this.f6842d.m4319a(new C4996d(i, str));
        return c5443s;
    }
}
