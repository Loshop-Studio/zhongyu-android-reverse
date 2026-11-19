package p021b5;

import android.widget.TextView;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.MistakeCreateOrEditActivity;
import com.zykj.mistake.activity.MistakeDetailActivity;
import com.zykj.mistake.activity.MistakeListActivity;
import com.zykj.mistake.base.BasePresenter;
import com.zykj.mistake.databinding.ActivityMistakeCreateOrEditBinding;
import com.zykj.mistake.databinding.ActivityMistakeDetailBinding;
import com.zykj.mistake.databinding.ActivityMistakeListBinding;
import com.zykj.mistake.entity.resp.CreateOrEditTagResp;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.presenter.MistakeCreateOrEditPresenter;
import com.zykj.mistake.presenter.MistakeDetailPresenter;
import com.zykj.mistake.presenter.MistakeListPresenter;
import com.zykj.mistake.widget.FlowLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;

/* renamed from: b5.c */
/* loaded from: classes3.dex */
public final class C3191c extends AbstractC0000a {

    /* renamed from: a */
    public final /* synthetic */ int f1714a;

    /* renamed from: b */
    public final /* synthetic */ long f1715b;

    /* renamed from: c */
    public final /* synthetic */ String f1716c;

    /* renamed from: d */
    public final /* synthetic */ String f1717d;

    /* renamed from: e */
    public final /* synthetic */ BasePresenter f1718e;

    public /* synthetic */ C3191c(long j7, BasePresenter basePresenter, String str, String str2, int i) {
        this.f1714a = i;
        this.f1715b = j7;
        this.f1718e = basePresenter;
        this.f1716c = str;
        this.f1717d = str2;
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: m */
    public final void mo15m(String e) {
        switch (this.f1714a) {
            case 0:
                MistakeCreateOrEditPresenter mistakeCreateOrEditPresenter = (MistakeCreateOrEditPresenter) this.f1718e;
                AbstractC5830k.m5330g(e, "e");
                if (this.f1715b != 0) {
                    MistakeCreateOrEditActivity mistakeCreateOrEditActivity = (MistakeCreateOrEditActivity) mistakeCreateOrEditPresenter.f6001c;
                    if (mistakeCreateOrEditActivity != null) {
                        mistakeCreateOrEditActivity.mo3962b(e);
                        break;
                    }
                } else {
                    MistakeCreateOrEditActivity mistakeCreateOrEditActivity2 = (MistakeCreateOrEditActivity) mistakeCreateOrEditPresenter.f6001c;
                    if (mistakeCreateOrEditActivity2 != null) {
                        mistakeCreateOrEditActivity2.mo3962b(e);
                        break;
                    }
                }
                break;
            case 1:
                MistakeDetailPresenter mistakeDetailPresenter = (MistakeDetailPresenter) this.f1718e;
                AbstractC5830k.m5330g(e, "e");
                if (this.f1715b != 0) {
                    MistakeDetailActivity mistakeDetailActivity = (MistakeDetailActivity) mistakeDetailPresenter.f6001c;
                    if (mistakeDetailActivity != null) {
                        mistakeDetailActivity.mo3962b(e);
                        break;
                    }
                } else {
                    MistakeDetailActivity mistakeDetailActivity2 = (MistakeDetailActivity) mistakeDetailPresenter.f6001c;
                    if (mistakeDetailActivity2 != null) {
                        mistakeDetailActivity2.mo3962b(e);
                        break;
                    }
                }
                break;
            default:
                MistakeListPresenter mistakeListPresenter = (MistakeListPresenter) this.f1718e;
                AbstractC5830k.m5330g(e, "e");
                if (this.f1715b != 0) {
                    MistakeListActivity mistakeListActivity = (MistakeListActivity) mistakeListPresenter.f6001c;
                    if (mistakeListActivity != null) {
                        mistakeListActivity.mo3962b(e);
                        break;
                    }
                } else {
                    MistakeListActivity mistakeListActivity2 = (MistakeListActivity) mistakeListPresenter.f6001c;
                    if (mistakeListActivity2 != null) {
                        mistakeListActivity2.mo3962b(e);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: n */
    public final void mo16n(Object obj) {
        switch (this.f1714a) {
            case 0:
                CreateOrEditTagResp resp = (CreateOrEditTagResp) obj;
                MistakeCreateOrEditPresenter mistakeCreateOrEditPresenter = (MistakeCreateOrEditPresenter) this.f1718e;
                AbstractC5830k.m5330g(resp, "resp");
                long j7 = this.f1715b;
                String newName = this.f1716c;
                if (j7 == 0) {
                    MistakeCreateOrEditActivity mistakeCreateOrEditActivity = (MistakeCreateOrEditActivity) mistakeCreateOrEditPresenter.f6001c;
                    if (mistakeCreateOrEditActivity != null) {
                        long result = resp.getResult();
                        AbstractC5830k.m5330g(newName, "name");
                        CustomTagInfo customTagInfo = new CustomTagInfo(newName, result, 0, 0, 12, null);
                        mistakeCreateOrEditActivity.f5802g.add(0, customTagInfo);
                        ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity.m3957p()).f6026i.f6154d.removeViewAt(0);
                        FlowLayout flowLayout = ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity.m3957p()).f6026i.f6154d;
                        ArrayList arrayList = mistakeCreateOrEditActivity.f5803h;
                        int size = arrayList.size();
                        int i = mistakeCreateOrEditActivity.f5804i;
                        flowLayout.addView(MistakeCreateOrEditActivity.m3913v(mistakeCreateOrEditActivity, customTagInfo, size < i, 4), 0);
                        ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity.m3957p()).f6026i.f6154d.addView(MistakeCreateOrEditActivity.m3913v(mistakeCreateOrEditActivity, new CustomTagInfo(null, 0L, 0, 0, 15, null), false, 2), 0);
                        if (arrayList.size() < i) {
                            arrayList.add(customTagInfo);
                            break;
                        }
                    }
                } else {
                    MistakeCreateOrEditActivity mistakeCreateOrEditActivity2 = (MistakeCreateOrEditActivity) mistakeCreateOrEditPresenter.f6001c;
                    if (mistakeCreateOrEditActivity2 != null) {
                        String oldName = this.f1717d;
                        AbstractC5830k.m5330g(oldName, "oldName");
                        AbstractC5830k.m5330g(newName, "newName");
                        ArrayList arrayList2 = mistakeCreateOrEditActivity2.f5802g;
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = arrayList2.size();
                        int i8 = 0;
                        while (i8 < size2) {
                            Object obj2 = arrayList2.get(i8);
                            i8++;
                            CustomTagInfo customTagInfo2 = (CustomTagInfo) obj2;
                            if (customTagInfo2.getId() == j7 && customTagInfo2.getLocalType() == -1) {
                                arrayList3.add(obj2);
                            }
                        }
                        int size3 = arrayList3.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            Object obj3 = arrayList3.get(i9);
                            i9++;
                            ((CustomTagInfo) obj3).setName(newName);
                        }
                        ArrayList arrayList4 = mistakeCreateOrEditActivity2.f5803h;
                        ArrayList arrayList5 = new ArrayList();
                        int size4 = arrayList4.size();
                        int i10 = 0;
                        while (i10 < size4) {
                            Object obj4 = arrayList4.get(i10);
                            i10++;
                            CustomTagInfo customTagInfo3 = (CustomTagInfo) obj4;
                            if (customTagInfo3.getId() == j7 && customTagInfo3.getLocalType() == -1) {
                                arrayList5.add(obj4);
                            }
                        }
                        int size5 = arrayList5.size();
                        int i11 = 0;
                        while (i11 < size5) {
                            Object obj5 = arrayList5.get(i11);
                            i11++;
                            ((CustomTagInfo) obj5).setName(newName);
                        }
                        int childCount = ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity2.m3957p()).f6026i.f6154d.getChildCount();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            TextView textView = (TextView) ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity2.m3957p()).f6026i.f6154d.getChildAt(i12).findViewById(R.id.tv_item_tag_content);
                            if (oldName.equals(textView.getText())) {
                                textView.setText(newName);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 1:
                CreateOrEditTagResp resp2 = (CreateOrEditTagResp) obj;
                MistakeDetailPresenter mistakeDetailPresenter = (MistakeDetailPresenter) this.f1718e;
                AbstractC5830k.m5330g(resp2, "resp");
                long j8 = this.f1715b;
                String newName2 = this.f1716c;
                if (j8 == 0) {
                    MistakeDetailActivity mistakeDetailActivity = (MistakeDetailActivity) mistakeDetailPresenter.f6001c;
                    if (mistakeDetailActivity != null) {
                        long result2 = resp2.getResult();
                        AbstractC5830k.m5330g(newName2, "name");
                        CustomTagInfo customTagInfo4 = new CustomTagInfo(newName2, result2, 0, 0, 12, null);
                        mistakeDetailActivity.f5823k.add(0, customTagInfo4);
                        ((ActivityMistakeDetailBinding) mistakeDetailActivity.m3957p()).f6048c.f6154d.removeViewAt(0);
                        FlowLayout flowLayout2 = ((ActivityMistakeDetailBinding) mistakeDetailActivity.m3957p()).f6048c.f6154d;
                        ArrayList arrayList6 = mistakeDetailActivity.f5821i;
                        int size6 = arrayList6.size();
                        int i13 = mistakeDetailActivity.f5822j;
                        flowLayout2.addView(MistakeDetailActivity.m3922x(mistakeDetailActivity, customTagInfo4, size6 < i13, 4), 0);
                        ((ActivityMistakeDetailBinding) mistakeDetailActivity.m3957p()).f6048c.f6154d.addView(MistakeDetailActivity.m3922x(mistakeDetailActivity, new CustomTagInfo(null, 0L, 0, 0, 15, null), false, 2), 0);
                        if (arrayList6.size() < i13) {
                            arrayList6.add(customTagInfo4);
                            break;
                        }
                    }
                } else {
                    MistakeDetailActivity mistakeDetailActivity2 = (MistakeDetailActivity) mistakeDetailPresenter.f6001c;
                    if (mistakeDetailActivity2 != null) {
                        String oldName2 = this.f1717d;
                        AbstractC5830k.m5330g(oldName2, "oldName");
                        AbstractC5830k.m5330g(newName2, "newName");
                        ArrayList arrayList7 = mistakeDetailActivity2.f5823k;
                        ArrayList arrayList8 = new ArrayList();
                        int size7 = arrayList7.size();
                        int i14 = 0;
                        while (i14 < size7) {
                            Object obj6 = arrayList7.get(i14);
                            i14++;
                            CustomTagInfo customTagInfo5 = (CustomTagInfo) obj6;
                            if (customTagInfo5.getLocalType() == -1 && customTagInfo5.getId() == j8) {
                                arrayList8.add(obj6);
                            }
                        }
                        int size8 = arrayList8.size();
                        int i15 = 0;
                        while (i15 < size8) {
                            Object obj7 = arrayList8.get(i15);
                            i15++;
                            ((CustomTagInfo) obj7).setName(newName2);
                        }
                        ArrayList arrayList9 = mistakeDetailActivity2.f5821i;
                        ArrayList arrayList10 = new ArrayList();
                        int size9 = arrayList9.size();
                        int i16 = 0;
                        while (i16 < size9) {
                            Object obj8 = arrayList9.get(i16);
                            i16++;
                            CustomTagInfo customTagInfo6 = (CustomTagInfo) obj8;
                            if (customTagInfo6.getLocalType() == -1 && customTagInfo6.getId() == j8) {
                                arrayList10.add(obj8);
                            }
                        }
                        int size10 = arrayList10.size();
                        int i17 = 0;
                        while (i17 < size10) {
                            Object obj9 = arrayList10.get(i17);
                            i17++;
                            ((CustomTagInfo) obj9).setName(newName2);
                        }
                        int childCount2 = ((ActivityMistakeDetailBinding) mistakeDetailActivity2.m3957p()).f6048c.f6154d.getChildCount();
                        for (int i18 = 0; i18 < childCount2; i18++) {
                            TextView textView2 = (TextView) ((ActivityMistakeDetailBinding) mistakeDetailActivity2.m3957p()).f6048c.f6154d.getChildAt(i18).findViewById(R.id.tv_item_tag_content);
                            if (oldName2.equals(textView2.getText())) {
                                textView2.setText(newName2);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                CreateOrEditTagResp resp3 = (CreateOrEditTagResp) obj;
                MistakeListPresenter mistakeListPresenter = (MistakeListPresenter) this.f1718e;
                AbstractC5830k.m5330g(resp3, "resp");
                long j9 = this.f1715b;
                String newName3 = this.f1716c;
                if (j9 == 0) {
                    MistakeListActivity mistakeListActivity = (MistakeListActivity) mistakeListPresenter.f6001c;
                    if (mistakeListActivity != null) {
                        long result3 = resp3.getResult();
                        AbstractC5830k.m5330g(newName3, "name");
                        CustomTagInfo customTagInfo7 = new CustomTagInfo(newName3, result3, 0, 0, 12, null);
                        mistakeListActivity.f5848u.add(0, customTagInfo7);
                        ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6067b.f6154d.removeViewAt(0);
                        FlowLayout flowLayout3 = ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6067b.f6154d;
                        ArrayList arrayList11 = mistakeListActivity.f5847t;
                        int size11 = arrayList11.size();
                        int i19 = mistakeListActivity.f5849v;
                        flowLayout3.addView(MistakeListActivity.m3933y(mistakeListActivity, customTagInfo7, size11 < i19, 4), 0);
                        ((ActivityMistakeListBinding) mistakeListActivity.m3957p()).f6067b.f6154d.addView(MistakeListActivity.m3933y(mistakeListActivity, new CustomTagInfo(null, 0L, 0, 0, 15, null), false, 2), 0);
                        if (arrayList11.size() < i19) {
                            arrayList11.add(customTagInfo7);
                            break;
                        }
                    }
                } else {
                    MistakeListActivity mistakeListActivity2 = (MistakeListActivity) mistakeListPresenter.f6001c;
                    if (mistakeListActivity2 != null) {
                        String oldName3 = this.f1717d;
                        AbstractC5830k.m5330g(oldName3, "oldName");
                        AbstractC5830k.m5330g(newName3, "newName");
                        ArrayList arrayList12 = mistakeListActivity2.f5848u;
                        ArrayList arrayList13 = new ArrayList();
                        int size12 = arrayList12.size();
                        int i20 = 0;
                        while (i20 < size12) {
                            Object obj10 = arrayList12.get(i20);
                            i20++;
                            CustomTagInfo customTagInfo8 = (CustomTagInfo) obj10;
                            if (customTagInfo8.getId() == j9 && customTagInfo8.getLocalType() == -1) {
                                arrayList13.add(obj10);
                            }
                        }
                        int size13 = arrayList13.size();
                        int i21 = 0;
                        while (i21 < size13) {
                            Object obj11 = arrayList13.get(i21);
                            i21++;
                            ((CustomTagInfo) obj11).setName(newName3);
                        }
                        ArrayList arrayList14 = mistakeListActivity2.f5847t;
                        ArrayList arrayList15 = new ArrayList();
                        int size14 = arrayList14.size();
                        int i22 = 0;
                        while (i22 < size14) {
                            Object obj12 = arrayList14.get(i22);
                            i22++;
                            CustomTagInfo customTagInfo9 = (CustomTagInfo) obj12;
                            if (customTagInfo9.getId() == j9 && customTagInfo9.getLocalType() == -1) {
                                arrayList15.add(obj12);
                            }
                        }
                        int size15 = arrayList15.size();
                        int i23 = 0;
                        while (i23 < size15) {
                            Object obj13 = arrayList15.get(i23);
                            i23++;
                            ((CustomTagInfo) obj13).setName(newName3);
                        }
                        int childCount3 = ((ActivityMistakeListBinding) mistakeListActivity2.m3957p()).f6067b.f6154d.getChildCount();
                        for (int i24 = 0; i24 < childCount3; i24++) {
                            TextView textView3 = (TextView) ((ActivityMistakeListBinding) mistakeListActivity2.m3957p()).f6067b.f6154d.getChildAt(i24).findViewById(R.id.tv_item_tag_content);
                            if (oldName3.equals(textView3.getText())) {
                                textView3.setText(newName3);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
