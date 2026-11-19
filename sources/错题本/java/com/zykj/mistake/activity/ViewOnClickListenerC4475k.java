package com.zykj.mistake.activity;

import android.view.View;
import android.view.ViewParent;
import com.zykj.mistake.base.BaseMVPActivity;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.widget.FlowLayout;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;

/* renamed from: com.zykj.mistake.activity.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC4475k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f5910a;

    /* renamed from: b */
    public final /* synthetic */ View f5911b;

    /* renamed from: c */
    public final /* synthetic */ CustomTagInfo f5912c;

    /* renamed from: d */
    public final /* synthetic */ BaseMVPActivity f5913d;

    public /* synthetic */ ViewOnClickListenerC4475k(View view, BaseMVPActivity baseMVPActivity, CustomTagInfo customTagInfo, int i) {
        this.f5910a = i;
        this.f5911b = view;
        this.f5913d = baseMVPActivity;
        this.f5912c = customTagInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5910a;
        Object obj = null;
        int i8 = 0;
        CustomTagInfo customTagInfo = this.f5912c;
        BaseMVPActivity baseMVPActivity = this.f5913d;
        View view2 = this.f5911b;
        switch (i) {
            case 0:
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity = (MistakeCreateOrEditActivity) baseMVPActivity;
                int i9 = MistakeCreateOrEditActivity.f5799u;
                if (view2.isSelected()) {
                    view2.setSelected(false);
                    ArrayList arrayList = mistakeCreateOrEditActivity.f5803h;
                    int size = arrayList.size();
                    while (true) {
                        if (i8 < size) {
                            Object obj2 = arrayList.get(i8);
                            i8++;
                            CustomTagInfo customTagInfo2 = (CustomTagInfo) obj2;
                            if (customTagInfo2.getId() == customTagInfo.getId() && customTagInfo2.getLocalType() == customTagInfo.getLocalType() && AbstractC5830k.m5325b(customTagInfo2.getName(), customTagInfo.getName())) {
                                obj = obj2;
                            }
                        }
                    }
                    AbstractC5835p.m5352a(mistakeCreateOrEditActivity.f5803h).remove((CustomTagInfo) obj);
                    return;
                }
                if (customTagInfo.getLocalType() == -1) {
                    if (mistakeCreateOrEditActivity.f5803h.size() < mistakeCreateOrEditActivity.f5804i) {
                        view2.setSelected(true);
                        mistakeCreateOrEditActivity.f5803h.add(customTagInfo);
                        return;
                    }
                    return;
                }
                ArrayList arrayList2 = mistakeCreateOrEditActivity.f5803h;
                int size2 = arrayList2.size();
                int i10 = -1;
                while (i8 < size2) {
                    if (((CustomTagInfo) arrayList2.get(i8)).getLocalType() == customTagInfo.getLocalType()) {
                        i10 = i8;
                    }
                    i8++;
                }
                if (i10 != -1) {
                    arrayList2.remove(i10);
                    arrayList2.add(customTagInfo);
                    MistakeCreateOrEditActivity.m3912u(view2);
                    return;
                } else {
                    if (arrayList2.size() < mistakeCreateOrEditActivity.f5804i) {
                        arrayList2.add(customTagInfo);
                        MistakeCreateOrEditActivity.m3912u(view2);
                        return;
                    }
                    return;
                }
            case 1:
                MistakeDetailActivity mistakeDetailActivity = (MistakeDetailActivity) baseMVPActivity;
                int i11 = MistakeDetailActivity.f5816s;
                if (view2.isSelected()) {
                    view2.setSelected(false);
                    ArrayList arrayList3 = mistakeDetailActivity.f5821i;
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i8 < size3) {
                            Object obj3 = arrayList3.get(i8);
                            i8++;
                            CustomTagInfo customTagInfo3 = (CustomTagInfo) obj3;
                            if (customTagInfo3.getId() == customTagInfo.getId() && customTagInfo3.getLocalType() == customTagInfo.getLocalType() && AbstractC5830k.m5325b(customTagInfo3.getName(), customTagInfo.getName())) {
                                obj = obj3;
                            }
                        }
                    }
                    CustomTagInfo customTagInfo4 = (CustomTagInfo) obj;
                    if (customTagInfo4 != null) {
                        mistakeDetailActivity.f5821i.remove(customTagInfo4);
                        return;
                    }
                    return;
                }
                if (customTagInfo.getLocalType() == -1) {
                    if (mistakeDetailActivity.f5821i.size() < mistakeDetailActivity.f5822j) {
                        view2.setSelected(true);
                        mistakeDetailActivity.f5821i.add(customTagInfo);
                        return;
                    }
                    return;
                }
                ViewParent parent = view2.getParent();
                AbstractC5830k.m5328e(parent, "null cannot be cast to non-null type com.zykj.mistake.widget.FlowLayout");
                FlowLayout flowLayout = (FlowLayout) parent;
                int childCount = flowLayout.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    flowLayout.getChildAt(i12).setSelected(false);
                }
                ArrayList arrayList4 = mistakeDetailActivity.f5821i;
                int size4 = arrayList4.size();
                int i13 = -1;
                while (i8 < size4) {
                    if (((CustomTagInfo) arrayList4.get(i8)).getLocalType() == customTagInfo.getLocalType()) {
                        i13 = i8;
                    }
                    i8++;
                }
                if (i13 != -1) {
                    arrayList4.remove(i13);
                    view2.setSelected(true);
                    arrayList4.add(customTagInfo);
                    return;
                } else {
                    if (arrayList4.size() < mistakeDetailActivity.f5822j) {
                        view2.setSelected(true);
                        arrayList4.add(customTagInfo);
                        return;
                    }
                    return;
                }
            default:
                MistakeListActivity mistakeListActivity = (MistakeListActivity) baseMVPActivity;
                int i14 = MistakeListActivity.f5831x;
                if (view2.isSelected()) {
                    view2.setSelected(false);
                    ArrayList arrayList5 = mistakeListActivity.f5847t;
                    int size5 = arrayList5.size();
                    while (i8 < size5) {
                        Object obj4 = arrayList5.get(i8);
                        i8++;
                        CustomTagInfo customTagInfo5 = (CustomTagInfo) obj4;
                        if (customTagInfo5.getId() == customTagInfo.getId() && AbstractC5830k.m5325b(customTagInfo5.getName(), customTagInfo.getName())) {
                            arrayList5.remove(obj4);
                            return;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if (customTagInfo.getLocalType() == -1) {
                    if (mistakeListActivity.f5847t.size() < mistakeListActivity.f5849v) {
                        mistakeListActivity.m3936C(view2, customTagInfo);
                        return;
                    }
                    return;
                }
                ViewParent parent2 = view2.getParent();
                AbstractC5830k.m5328e(parent2, "null cannot be cast to non-null type com.zykj.mistake.widget.FlowLayout");
                FlowLayout flowLayout2 = (FlowLayout) parent2;
                int childCount2 = flowLayout2.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    flowLayout2.getChildAt(i15).setSelected(false);
                }
                ArrayList arrayList6 = mistakeListActivity.f5847t;
                int size6 = arrayList6.size();
                int i16 = -1;
                while (i8 < size6) {
                    if (((CustomTagInfo) arrayList6.get(i8)).getLocalType() == customTagInfo.getLocalType()) {
                        i16 = i8;
                    }
                    i8++;
                }
                if (i16 != -1) {
                    arrayList6.remove(i16);
                    mistakeListActivity.m3936C(view2, customTagInfo);
                    return;
                } else {
                    if (arrayList6.size() < mistakeListActivity.f5849v) {
                        mistakeListActivity.m3936C(view2, customTagInfo);
                        return;
                    }
                    return;
                }
        }
    }
}
