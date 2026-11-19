package com.zykj.mistake.activity;

import android.app.Dialog;
import android.view.View;
import androidx.core.view.GravityCompat;
import com.zykj.mistake.R;
import com.zykj.mistake.databinding.ActivityMistakeListBinding;
import com.zykj.mistake.entity.req.MistakeListReq;
import com.zykj.mistake.entity.req.MultiRemoveMistakeReq;
import com.zykj.mistake.entity.req.MultiSetTagsReq;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.MistakeListResp;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.presenter.MistakeListPresenter;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.utils.C5100e;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5830k;
import p021b5.C3194f;
import p021b5.C3195g;
import p106l4.DialogC6058i;

/* renamed from: com.zykj.mistake.activity.z */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC4490z implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f5957a;

    /* renamed from: b */
    public final /* synthetic */ MistakeListActivity f5958b;

    public /* synthetic */ ViewOnClickListenerC4490z(MistakeListActivity mistakeListActivity, int i) {
        this.f5957a = i;
        this.f5958b = mistakeListActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j7;
        int i = this.f5957a;
        int i8 = 0;
        int i9 = 1;
        MistakeListActivity mistakeListActivity = this.f5958b;
        switch (i) {
            case 0:
                int i10 = MistakeListActivity.f5831x;
                boolean z8 = !mistakeListActivity.getSharedPreferences("zykjMistake", 0).getBoolean("SP_CONTACT_MODE", false);
                AbstractC5099d.m4455e(mistakeListActivity, "SP_CONTACT_MODE", z8);
                mistakeListActivity.m3935B(z8);
                C5100e.m4458b(4, "MistakeListPracticeMode", String.valueOf(z8));
                return;
            case 1:
                boolean z9 = mistakeListActivity.f5850w;
                ArrayList arrayList = mistakeListActivity.f5847t;
                MultiSetTagsReq multiSetTagsReq = mistakeListActivity.f5843p;
                MistakeListReq mistakeListReq = mistakeListActivity.f5841n;
                long j8 = 0;
                if (z9) {
                    mistakeListReq.setSkipCount(0);
                    mistakeListReq.getDiff().clear();
                    mistakeListReq.getAttainedLevel().clear();
                    mistakeListReq.getErrorReason().clear();
                    mistakeListReq.getTagIdList().clear();
                    mistakeListReq.setHaveNoTag(((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6067b.f6153c.getFirstSelectedIndex() != -1);
                    if (!mistakeListReq.getHaveNoTag()) {
                        int firstSelectedIndex = ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6067b.f6155e.getFirstSelectedIndex();
                        if (firstSelectedIndex != -1) {
                            mistakeListReq.getDiff().add(Integer.valueOf(firstSelectedIndex + 1));
                        }
                        int firstSelectedIndex2 = ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6067b.f6156f.getFirstSelectedIndex();
                        if (firstSelectedIndex2 != -1) {
                            mistakeListReq.getAttainedLevel().add(Integer.valueOf(firstSelectedIndex2 + 1));
                        }
                        int firstSelectedIndex3 = ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6067b.f6157g.getFirstSelectedIndex();
                        if (firstSelectedIndex3 != -1) {
                            mistakeListReq.getErrorReason().add(Integer.valueOf(firstSelectedIndex3 + 1));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            CustomTagInfo customTagInfo = (CustomTagInfo) obj;
                            if (customTagInfo.getId() != j8) {
                                j7 = j8;
                                if (customTagInfo.getLocalType() == -1) {
                                    arrayList2.add(obj);
                                }
                            } else {
                                j7 = j8;
                            }
                            j8 = j7;
                        }
                        int size2 = arrayList2.size();
                        while (i8 < size2) {
                            Object obj2 = arrayList2.get(i8);
                            i8++;
                            mistakeListReq.getTagIdList().add(Integer.valueOf((int) ((CustomTagInfo) obj2).getId()));
                        }
                    }
                    C5100e.m4458b(6, "MistakeListFilter", null);
                    ((MistakeListPresenter) mistakeListActivity.m3965r()).m4438d(mistakeListReq, true);
                } else {
                    int firstSelectedIndex4 = ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6067b.f6155e.getFirstSelectedIndex();
                    multiSetTagsReq.setDiff(firstSelectedIndex4 != -1 ? Integer.valueOf(firstSelectedIndex4 + 1) : null);
                    int firstSelectedIndex5 = ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6067b.f6156f.getFirstSelectedIndex();
                    multiSetTagsReq.setAttainedLevel(firstSelectedIndex5 != -1 ? Integer.valueOf(firstSelectedIndex5 + 1) : null);
                    int firstSelectedIndex6 = ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6067b.f6157g.getFirstSelectedIndex();
                    multiSetTagsReq.setErrorReason(firstSelectedIndex6 != -1 ? Integer.valueOf(firstSelectedIndex6 + 1) : null);
                    multiSetTagsReq.getTagIdList().clear();
                    ArrayList arrayList3 = new ArrayList();
                    int size3 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Object obj3 = arrayList.get(i12);
                        i12++;
                        CustomTagInfo customTagInfo2 = (CustomTagInfo) obj3;
                        if (customTagInfo2.getId() != 0 && customTagInfo2.getLocalType() == -1) {
                            arrayList3.add(obj3);
                        }
                    }
                    int size4 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size4) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        multiSetTagsReq.getTagIdList().add(Integer.valueOf((int) ((CustomTagInfo) obj4).getId()));
                    }
                    multiSetTagsReq.getItemIds().clear();
                    ArrayList arrayList4 = mistakeListActivity.f5846s;
                    int size5 = arrayList4.size();
                    while (i8 < size5) {
                        Object obj5 = arrayList4.get(i8);
                        i8++;
                        multiSetTagsReq.getItemIds().add(Integer.valueOf((int) ((MistakeListResp.MistakeInfo) mistakeListActivity.f5832e.get(Integer.parseInt((String) obj5))).getId()));
                    }
                    MistakeListPresenter mistakeListPresenter = (MistakeListPresenter) mistakeListActivity.m3965r();
                    C5088a c5088a = C5088a.f7986a;
                    mistakeListPresenter.m3969a(C5088a.m4381b().m4393k(multiSetTagsReq), new C3195g(mistakeListPresenter, i9));
                }
                ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6066a.closeDrawer(GravityCompat.END);
                return;
            case 2:
                if (!mistakeListActivity.f5850w) {
                    ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6066a.closeDrawer(GravityCompat.END);
                    return;
                } else {
                    ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6067b.f6153c.getChildAt(0).setSelected(false);
                    mistakeListActivity.m3934A(true);
                    return;
                }
            case 3:
                int i14 = MistakeListActivity.f5831x;
                mistakeListActivity.finish();
                return;
            case 4:
                int i15 = MistakeListActivity.f5831x;
                mistakeListActivity.m3937E(null);
                return;
            case 5:
                int i16 = MistakeListActivity.f5831x;
                MistakeListPresenter mistakeListPresenter2 = (MistakeListPresenter) mistakeListActivity.m3965r();
                mistakeListPresenter2.m3970b(C5088a.m4381b().m4388f(), new C3194f(mistakeListPresenter2, true), true);
                return;
            case 6:
                Dialog dialog = mistakeListActivity.f5834g;
                if (dialog != null) {
                    dialog.show();
                    return;
                } else {
                    AbstractC5830k.m5339p("mRemoveMistakeDialog");
                    throw null;
                }
            case 7:
                int i17 = MistakeListActivity.f5831x;
                MistakeListPresenter mistakeListPresenter3 = (MistakeListPresenter) mistakeListActivity.m3965r();
                mistakeListPresenter3.m3970b(C5088a.m4381b().m4388f(), new C3194f(mistakeListPresenter3, false), true);
                return;
            case 8:
                int i18 = MistakeListActivity.f5831x;
                mistakeListActivity.m3941x();
                return;
            case 9:
                Dialog dialog2 = mistakeListActivity.f5834g;
                if (dialog2 != null) {
                    dialog2.dismiss();
                    return;
                } else {
                    AbstractC5830k.m5339p("mRemoveMistakeDialog");
                    throw null;
                }
            case 10:
                int i19 = MistakeListActivity.f5831x;
                C5100e.m4458b(6, "MistakeListManageDeleteConfirm", null);
                ArrayList arrayList5 = mistakeListActivity.f5846s;
                MultiRemoveMistakeReq req = mistakeListActivity.f5842o;
                int size6 = arrayList5.size();
                int i20 = 0;
                while (i20 < size6) {
                    Object obj6 = arrayList5.get(i20);
                    i20++;
                    req.getItemIds().add(Integer.valueOf((int) ((MistakeListResp.MistakeInfo) mistakeListActivity.f5832e.get(Integer.parseInt((String) obj6))).getId()));
                }
                MistakeListPresenter mistakeListPresenter4 = (MistakeListPresenter) mistakeListActivity.m3965r();
                AbstractC5830k.m5330g(req, "req");
                C5088a c5088a2 = C5088a.f7986a;
                mistakeListPresenter4.m3969a(C5088a.m4381b().m4386d(req), new C3195g(mistakeListPresenter4, i8));
                return;
            default:
                DialogC6058i dialogC6058i = mistakeListActivity.f5835h;
                if (dialogC6058i == null) {
                    AbstractC5830k.m5339p("mMistakeTagDialog");
                    throw null;
                }
                String string = mistakeListActivity.getString(R.string.add_mistake_tag);
                AbstractC5830k.m5329f(string, "getString(...)");
                C4477m c4477m = new C4477m(mistakeListActivity, 2);
                int i21 = DialogC6058i.f9655d;
                dialogC6058i.m5787a(string, "", c4477m);
                return;
        }
    }
}
