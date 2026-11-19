package p021b5;

import android.app.Dialog;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.MistakeListActivity;
import com.zykj.mistake.adapter.MistakeListAdapter;
import com.zykj.mistake.entity.req.MultiSetTagsReq;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.MistakeListResp;
import com.zykj.mistake.network.ApiResp;
import com.zykj.mistake.presenter.MistakeListPresenter;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;

/* renamed from: b5.g */
/* loaded from: classes3.dex */
public final class C3195g extends AbstractC0000a {

    /* renamed from: a */
    public final /* synthetic */ int f1725a;

    /* renamed from: b */
    public final /* synthetic */ MistakeListPresenter f1726b;

    public /* synthetic */ C3195g(MistakeListPresenter mistakeListPresenter, int i) {
        this.f1725a = i;
        this.f1726b = mistakeListPresenter;
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: m */
    public final void mo15m(String e) {
        switch (this.f1725a) {
            case 0:
                AbstractC5830k.m5330g(e, "e");
                MistakeListActivity mistakeListActivity = (MistakeListActivity) this.f1726b.f6001c;
                if (mistakeListActivity != null) {
                    Dialog dialog = mistakeListActivity.f5834g;
                    if (dialog == null) {
                        AbstractC5830k.m5339p("mRemoveMistakeDialog");
                        throw null;
                    }
                    if (dialog.isShowing()) {
                        Dialog dialog2 = mistakeListActivity.f5834g;
                        if (dialog2 == null) {
                            AbstractC5830k.m5339p("mRemoveMistakeDialog");
                            throw null;
                        }
                        dialog2.dismiss();
                    }
                    mistakeListActivity.mo3962b(e);
                    return;
                }
                return;
            default:
                AbstractC5830k.m5330g(e, "e");
                MistakeListActivity mistakeListActivity2 = (MistakeListActivity) this.f1726b.f6001c;
                if (mistakeListActivity2 != null) {
                    mistakeListActivity2.mo3962b(e);
                    return;
                }
                return;
        }
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: n */
    public final void mo16n(Object obj) {
        switch (this.f1725a) {
            case 0:
                ApiResp resp = (ApiResp) obj;
                AbstractC5830k.m5330g(resp, "resp");
                MistakeListActivity mistakeListActivity = (MistakeListActivity) this.f1726b.f6001c;
                if (mistakeListActivity != null) {
                    ArrayList arrayList = mistakeListActivity.f5832e;
                    Dialog dialog = mistakeListActivity.f5834g;
                    if (dialog == null) {
                        AbstractC5830k.m5339p("mRemoveMistakeDialog");
                        throw null;
                    }
                    if (dialog.isShowing()) {
                        Dialog dialog2 = mistakeListActivity.f5834g;
                        if (dialog2 == null) {
                            AbstractC5830k.m5339p("mRemoveMistakeDialog");
                            throw null;
                        }
                        dialog2.dismiss();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = mistakeListActivity.f5846s;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList3.get(i);
                        i++;
                        arrayList2.add(arrayList.get(Integer.parseInt((String) obj2)));
                    }
                    arrayList.removeAll(arrayList2);
                    MistakeListAdapter mistakeListAdapter = mistakeListActivity.f5833f;
                    if (mistakeListAdapter == null) {
                        AbstractC5830k.m5339p("mMistakeListAdapter");
                        throw null;
                    }
                    mistakeListAdapter.notifyDataSetChanged();
                    mistakeListActivity.m3941x();
                    mistakeListActivity.m3938u();
                    String string = mistakeListActivity.getString(R.string.remove_mistake_success);
                    AbstractC5830k.m5329f(string, "getString(...)");
                    mistakeListActivity.mo3962b(string);
                    return;
                }
                return;
            default:
                ApiResp resp2 = (ApiResp) obj;
                AbstractC5830k.m5330g(resp2, "resp");
                MistakeListActivity mistakeListActivity2 = (MistakeListActivity) this.f1726b.f6001c;
                if (mistakeListActivity2 != null) {
                    MultiSetTagsReq multiSetTagsReq = mistakeListActivity2.f5843p;
                    ArrayList arrayList4 = mistakeListActivity2.f5832e;
                    ArrayList arrayList5 = mistakeListActivity2.f5846s;
                    int i8 = 0;
                    Integer num = 0;
                    int size2 = arrayList5.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        Object obj3 = arrayList5.get(i9);
                        i9++;
                        String str = (String) obj3;
                        MistakeListResp.MistakeInfo mistakeInfo = (MistakeListResp.MistakeInfo) arrayList4.get(Integer.parseInt(str));
                        Integer diff = multiSetTagsReq.getDiff();
                        if (diff == null) {
                            diff = num;
                        }
                        mistakeInfo.setDiff(diff);
                        MistakeListResp.MistakeInfo mistakeInfo2 = (MistakeListResp.MistakeInfo) arrayList4.get(Integer.parseInt(str));
                        Integer attainedLevel = multiSetTagsReq.getAttainedLevel();
                        if (attainedLevel == null) {
                            attainedLevel = num;
                        }
                        mistakeInfo2.setAttainedLevel(attainedLevel);
                        MistakeListResp.MistakeInfo mistakeInfo3 = (MistakeListResp.MistakeInfo) arrayList4.get(Integer.parseInt(str));
                        Integer errorReason = multiSetTagsReq.getErrorReason();
                        if (errorReason == null) {
                            errorReason = num;
                        }
                        mistakeInfo3.setErrorReason(errorReason);
                        ((MistakeListResp.MistakeInfo) arrayList4.get(Integer.parseInt(str))).setTagNames(new ArrayList<>());
                        ArrayList<Integer> tagIdList = multiSetTagsReq.getTagIdList();
                        int size3 = tagIdList.size();
                        int i10 = i8;
                        while (i10 < size3) {
                            Integer num2 = tagIdList.get(i10);
                            i10++;
                            int iIntValue = num2.intValue();
                            ArrayList arrayList6 = mistakeListActivity2.f5848u;
                            ArrayList arrayList7 = new ArrayList();
                            int size4 = arrayList6.size();
                            MultiSetTagsReq multiSetTagsReq2 = multiSetTagsReq;
                            int i11 = 0;
                            while (i11 < size4) {
                                ArrayList arrayList8 = arrayList5;
                                Object obj4 = arrayList6.get(i11);
                                i11++;
                                int i12 = size4;
                                Integer num3 = num;
                                if (((CustomTagInfo) obj4).getId() == iIntValue) {
                                    arrayList7.add(obj4);
                                }
                                arrayList5 = arrayList8;
                                num = num3;
                                size4 = i12;
                            }
                            ArrayList arrayList9 = arrayList5;
                            Integer num4 = num;
                            int size5 = arrayList7.size();
                            int i13 = 0;
                            while (i13 < size5) {
                                Object obj5 = arrayList7.get(i13);
                                i13++;
                                CustomTagInfo customTagInfo = (CustomTagInfo) obj5;
                                ArrayList<String> tagNames = ((MistakeListResp.MistakeInfo) arrayList4.get(Integer.parseInt(str))).getTagNames();
                                if (tagNames != null) {
                                    tagNames.add(customTagInfo.getName());
                                }
                            }
                            multiSetTagsReq = multiSetTagsReq2;
                            arrayList5 = arrayList9;
                            num = num4;
                        }
                        MultiSetTagsReq multiSetTagsReq3 = multiSetTagsReq;
                        ArrayList arrayList10 = arrayList5;
                        Integer num5 = num;
                        MistakeListAdapter mistakeListAdapter2 = mistakeListActivity2.f5833f;
                        if (mistakeListAdapter2 == null) {
                            AbstractC5830k.m5339p("mMistakeListAdapter");
                            throw null;
                        }
                        mistakeListAdapter2.notifyDataSetChanged();
                        multiSetTagsReq = multiSetTagsReq3;
                        arrayList5 = arrayList10;
                        num = num5;
                        i8 = 0;
                    }
                    mistakeListActivity2.m3941x();
                    String string2 = mistakeListActivity2.getString(R.string.set_tag_success);
                    AbstractC5830k.m5329f(string2, "getString(...)");
                    mistakeListActivity2.mo3962b(string2);
                    return;
                }
                return;
        }
    }
}
