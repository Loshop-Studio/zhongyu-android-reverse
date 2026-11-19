package com.zykj.mistake.activity;

import android.widget.ImageView;
import com.zykj.merge.sketch.view.RunnableC4417f;
import com.zykj.mistake.R;
import com.zykj.mistake.feature.notebook.detail.C4764a5;
import com.zykj.mistake.feature.notebook.detail.C4791f;
import com.zykj.mistake.feature.notebook.list.C4941e1;
import com.zykj.mistake.feature.notebook.list.C4960l;
import com.zykj.mistake.feature.notebook.list.C4980u;
import com.zykj.mistake.feature.notebook.list.C4986x;
import com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel;
import com.zykj.mistake.widget.StemWebView;
import com.zykj.view.utils.ImagePicker;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.flow.C5946n0;
import p045d6.C5443s;
import p106l4.DialogC6053d;
import p137p4.C6383b;
import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.mistake.activity.o */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4479o implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f5923a;

    /* renamed from: b */
    public final /* synthetic */ int f5924b;

    /* renamed from: c */
    public final /* synthetic */ Object f5925c;

    /* renamed from: d */
    public final /* synthetic */ Object f5926d;

    /* renamed from: e */
    public final /* synthetic */ Object f5927e;

    public /* synthetic */ C4479o(int i, int i8, Object obj, Object obj2, Object obj3) {
        this.f5923a = i8;
        this.f5925c = obj;
        this.f5926d = obj2;
        this.f5927e = obj3;
        this.f5924b = i;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        Object value;
        C4941e1 c4941e1;
        int size;
        int i;
        ArrayList arrayList;
        switch (this.f5923a) {
            case 0:
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity = (MistakeCreateOrEditActivity) this.f5925c;
                ImageView imageView = (ImageView) this.f5926d;
                ImageView imageView2 = (ImageView) this.f5927e;
                if (mistakeCreateOrEditActivity.f5808m) {
                    ImagePicker.startSystemCamera$default(mistakeCreateOrEditActivity.f5806k, null, true, new C4480p(this.f5924b, 2, mistakeCreateOrEditActivity, imageView, imageView2), 1, null);
                    mistakeCreateOrEditActivity.overridePendingTransition(0, 0);
                } else {
                    ((DialogC6053d) mistakeCreateOrEditActivity.f5809n.getValue()).show();
                }
                return C5443s.f8405a;
            case 1:
                StemWebView stemWebView = (StemWebView) this.f5925c;
                stemWebView.postDelayed(new RunnableC4417f((C4764a5) this.f5926d, (C4791f) this.f5927e, stemWebView, this.f5924b), 300L);
                break;
            default:
                C4941e1 c4941e12 = (C4941e1) this.f5925c;
                MistakeNotebookViewModel mistakeNotebookViewModel = (MistakeNotebookViewModel) this.f5926d;
                ArrayList arrayList2 = (ArrayList) this.f5927e;
                Set set = c4941e12.f7510j;
                C5946n0 c5946n0 = mistakeNotebookViewModel.f7448d;
                do {
                    value = c5946n0.getValue();
                    c4941e1 = (C4941e1) value;
                    size = c4941e1.f7501a - arrayList2.size();
                    if (size < 0) {
                        size = 0;
                    }
                    int i8 = c4941e1.f7502b - this.f5924b;
                    i = i8 >= 0 ? i8 : 0;
                    List list = c4941e1.f7504d;
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!set.contains(((C6383b) obj).f10446a)) {
                            arrayList.add(obj);
                        }
                    }
                } while (!c5946n0.m5569i(value, C4941e1.m4303a(c4941e1, size, i, false, arrayList, false, false, false, false, EmptySet.INSTANCE, null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33553652)));
                mistakeNotebookViewModel.m4296h(C4960l.f7574a);
                mistakeNotebookViewModel.m4296h(C4980u.f7616a);
                String string = mistakeNotebookViewModel.getApplication().getString(R.string.remove_mistake_success);
                AbstractC5830k.m5329f(string, "getString(...)");
                mistakeNotebookViewModel.m4296h(new C4986x(string));
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C4479o(int i, ImageView imageView, ImageView imageView2, MistakeCreateOrEditActivity mistakeCreateOrEditActivity) {
        this.f5923a = 0;
        this.f5925c = mistakeCreateOrEditActivity;
        this.f5924b = i;
        this.f5926d = imageView;
        this.f5927e = imageView2;
    }
}
