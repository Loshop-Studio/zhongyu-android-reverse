package p021b5;

import android.app.Dialog;
import android.content.Intent;
import androidx.core.view.GravityCompat;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.MistakeDetailActivity;
import com.zykj.mistake.adapter.DetailPagerAdapter;
import com.zykj.mistake.databinding.ActivityMistakeDetailBinding;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.GetMyTagResp;
import com.zykj.mistake.entity.resp.MistakeDetail;
import com.zykj.mistake.entity.resp.MistakeDetailResp;
import com.zykj.mistake.entity.resp.MistakeGroupDetailResp;
import com.zykj.mistake.network.ApiResp;
import com.zykj.mistake.presenter.MistakeDetailPresenter;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.widget.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;
import p073h4.AbstractC5626b;

/* renamed from: b5.d */
/* loaded from: classes3.dex */
public final class C3192d extends AbstractC0000a {

    /* renamed from: a */
    public final /* synthetic */ int f1719a;

    /* renamed from: b */
    public final /* synthetic */ MistakeDetailPresenter f1720b;

    public /* synthetic */ C3192d(MistakeDetailPresenter mistakeDetailPresenter, int i) {
        this.f1719a = i;
        this.f1720b = mistakeDetailPresenter;
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: m */
    public final void mo15m(String e) {
        switch (this.f1719a) {
            case 0:
                AbstractC5830k.m5330g(e, "e");
                MistakeDetailActivity mistakeDetailActivity = (MistakeDetailActivity) this.f1720b.f6001c;
                if (mistakeDetailActivity != null) {
                    mistakeDetailActivity.m3924B(e);
                    break;
                }
                break;
            case 1:
                AbstractC5830k.m5330g(e, "e");
                MistakeDetailActivity mistakeDetailActivity2 = (MistakeDetailActivity) this.f1720b.f6001c;
                if (mistakeDetailActivity2 != null) {
                    mistakeDetailActivity2.m3924B(e);
                    break;
                }
                break;
            case 2:
                AbstractC5830k.m5330g(e, "e");
                MistakeDetailActivity mistakeDetailActivity3 = (MistakeDetailActivity) this.f1720b.f6001c;
                if (mistakeDetailActivity3 != null) {
                    mistakeDetailActivity3.m3924B(e);
                    break;
                }
                break;
            case 3:
                AbstractC5830k.m5330g(e, "e");
                MistakeDetailActivity mistakeDetailActivity4 = (MistakeDetailActivity) this.f1720b.f6001c;
                if (mistakeDetailActivity4 != null) {
                    mistakeDetailActivity4.mo3962b(e);
                    break;
                }
                break;
            case 4:
                AbstractC5830k.m5330g(e, "e");
                MistakeDetailActivity mistakeDetailActivity5 = (MistakeDetailActivity) this.f1720b.f6001c;
                if (mistakeDetailActivity5 != null) {
                    mistakeDetailActivity5.mo3962b(e);
                    break;
                }
                break;
            default:
                AbstractC5830k.m5330g(e, "e");
                MistakeDetailActivity mistakeDetailActivity6 = (MistakeDetailActivity) this.f1720b.f6001c;
                if (mistakeDetailActivity6 != null) {
                    mistakeDetailActivity6.mo3962b(e);
                    break;
                }
                break;
        }
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: n */
    public final void mo16n(Object obj) {
        boolean z8;
        switch (this.f1719a) {
            case 0:
                MistakeDetailResp resp = (MistakeDetailResp) obj;
                AbstractC5830k.m5330g(resp, "resp");
                MistakeDetail result = resp.getResult();
                MistakeDetailPresenter mistakeDetailPresenter = this.f1720b;
                if (result == null) {
                    MistakeDetailActivity mistakeDetailActivity = (MistakeDetailActivity) mistakeDetailPresenter.f6001c;
                    if (mistakeDetailActivity != null) {
                        String string = AbstractC5626b.f8757a.getString(R.string.no_mistake);
                        AbstractC5830k.m5329f(string, "getString(...)");
                        mistakeDetailActivity.m3924B(string);
                        return;
                    }
                    return;
                }
                MistakeDetailActivity mistakeDetailActivity2 = (MistakeDetailActivity) mistakeDetailPresenter.f6001c;
                if (mistakeDetailActivity2 != null) {
                    MistakeDetail result2 = resp.getResult();
                    AbstractC5830k.m5327d(result2);
                    mistakeDetailActivity2.f5820h = result2;
                    if (mistakeDetailActivity2.m3929w().getHasStem()) {
                        mistakeDetailActivity2.m3931z();
                    } else {
                        mistakeDetailActivity2.m3930y();
                    }
                    mistakeDetailActivity2.m3925C();
                    DetailPagerAdapter detailPagerAdapter = mistakeDetailActivity2.f5824l;
                    if (detailPagerAdapter == null) {
                        AbstractC5830k.m5339p("mDetailPagerAdapter");
                        throw null;
                    }
                    detailPagerAdapter.m3952f(result2);
                    mistakeDetailActivity2.m3928v();
                    return;
                }
                return;
            case 1:
                MistakeGroupDetailResp resp2 = (MistakeGroupDetailResp) obj;
                AbstractC5830k.m5330g(resp2, "resp");
                List<MistakeDetail> result3 = resp2.getResult();
                MistakeDetailPresenter mistakeDetailPresenter2 = this.f1720b;
                if (result3 == null) {
                    MistakeDetailActivity mistakeDetailActivity3 = (MistakeDetailActivity) mistakeDetailPresenter2.f6001c;
                    if (mistakeDetailActivity3 != null) {
                        String string2 = AbstractC5626b.f8757a.getString(R.string.no_mistake);
                        AbstractC5830k.m5329f(string2, "getString(...)");
                        mistakeDetailActivity3.m3924B(string2);
                        return;
                    }
                    return;
                }
                MistakeDetailActivity mistakeDetailActivity4 = (MistakeDetailActivity) mistakeDetailPresenter2.f6001c;
                if (mistakeDetailActivity4 != null) {
                    List<MistakeDetail> result4 = resp2.getResult();
                    AbstractC5830k.m5327d(result4);
                    int i = 0;
                    mistakeDetailActivity4.f5820h = result4.get(0);
                    if (mistakeDetailActivity4.m3929w().getHasStem()) {
                        mistakeDetailActivity4.m3931z();
                    } else {
                        mistakeDetailActivity4.m3930y();
                    }
                    mistakeDetailActivity4.m3925C();
                    DetailPagerAdapter detailPagerAdapter2 = mistakeDetailActivity4.f5824l;
                    if (detailPagerAdapter2 == null) {
                        AbstractC5830k.m5339p("mDetailPagerAdapter");
                        throw null;
                    }
                    detailPagerAdapter2.f5963e = true;
                    MistakeDetail mistakeDetail = result4.get(0);
                    ArrayList<MistakeDetail.AnswerListBean> arrayList = new ArrayList<>();
                    int size = result4.size();
                    int i8 = 0;
                    while (i8 < size) {
                        ArrayList<MistakeDetail.AnswerListBean> answerInfos = result4.get(i8).getAnswerInfos();
                        if (answerInfos != null && !answerInfos.isEmpty()) {
                            int size2 = result4.get(i8).getAnswerInfos().size();
                            for (int i9 = i; i9 < size2; i9++) {
                                MistakeDetail.AnswerListBean answerListBean = result4.get(i8).getAnswerInfos().get(i9);
                                AbstractC5830k.m5329f(answerListBean, "get(...)");
                                MistakeDetail.AnswerListBean answerListBean2 = answerListBean;
                                answerListBean2.setItemType(result4.get(i8).getItemType());
                                int number = result4.get(i8).getNumber();
                                Integer numValueOf = Integer.valueOf(number);
                                if (number <= 0) {
                                    numValueOf = null;
                                }
                                int iIntValue = numValueOf != null ? numValueOf.intValue() : i8 + 1;
                                int number2 = answerListBean2.getNumber();
                                Integer numValueOf2 = Integer.valueOf(number2);
                                if (number2 <= 0) {
                                    numValueOf2 = null;
                                }
                                int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : i9 + 1;
                                if (result4.get(i8).getAnswerInfos().size() > 1) {
                                    answerListBean2.setIndex(iIntValue + "." + iIntValue2);
                                } else {
                                    answerListBean2.setIndex(String.valueOf(iIntValue));
                                }
                                arrayList.add(answerListBean2);
                            }
                        }
                        i8++;
                        i = 0;
                    }
                    mistakeDetail.setAnswerInfos(arrayList);
                    detailPagerAdapter2.f5962d = mistakeDetail;
                    detailPagerAdapter2.m3948b();
                    detailPagerAdapter2.m3947a();
                    detailPagerAdapter2.m3949c();
                    detailPagerAdapter2.m3951e();
                    detailPagerAdapter2.m3950d();
                    detailPagerAdapter2.notifyDataSetChanged();
                    mistakeDetailActivity4.m3928v();
                    return;
                }
                return;
            case 2:
                MistakeDetailResp resp3 = (MistakeDetailResp) obj;
                AbstractC5830k.m5330g(resp3, "resp");
                MistakeDetail result5 = resp3.getResult();
                MistakeDetailPresenter mistakeDetailPresenter3 = this.f1720b;
                if (result5 == null) {
                    MistakeDetailActivity mistakeDetailActivity5 = (MistakeDetailActivity) mistakeDetailPresenter3.f6001c;
                    if (mistakeDetailActivity5 != null) {
                        String string3 = AbstractC5626b.f8757a.getString(R.string.no_mistake);
                        AbstractC5830k.m5329f(string3, "getString(...)");
                        mistakeDetailActivity5.m3924B(string3);
                        return;
                    }
                    return;
                }
                MistakeDetailActivity mistakeDetailActivity6 = (MistakeDetailActivity) mistakeDetailPresenter3.f6001c;
                if (mistakeDetailActivity6 != null) {
                    MistakeDetail result6 = resp3.getResult();
                    AbstractC5830k.m5327d(result6);
                    mistakeDetailActivity6.f5820h = result6;
                    if (mistakeDetailActivity6.m3929w().getHasStem()) {
                        mistakeDetailActivity6.m3931z();
                    } else {
                        mistakeDetailActivity6.m3930y();
                    }
                    mistakeDetailActivity6.m3925C();
                    DetailPagerAdapter detailPagerAdapter3 = mistakeDetailActivity6.f5824l;
                    if (detailPagerAdapter3 == null) {
                        AbstractC5830k.m5339p("mDetailPagerAdapter");
                        throw null;
                    }
                    detailPagerAdapter3.m3952f(result6);
                    mistakeDetailActivity6.m3928v();
                    return;
                }
                return;
            case 3:
                GetMyTagResp resp4 = (GetMyTagResp) obj;
                AbstractC5830k.m5330g(resp4, "resp");
                MistakeDetailActivity mistakeDetailActivity7 = (MistakeDetailActivity) this.f1720b.f6001c;
                if (mistakeDetailActivity7 == null) {
                    return;
                }
                ArrayList arrayList2 = mistakeDetailActivity7.f5823k;
                arrayList2.clear();
                List<CustomTagInfo> result7 = resp4.getResult();
                if (result7 != null) {
                    arrayList2.addAll(result7);
                }
                ArrayList arrayList3 = mistakeDetailActivity7.f5821i;
                arrayList3.clear();
                ArrayList arrayListM3927u = mistakeDetailActivity7.m3927u();
                ArrayList arrayList4 = new ArrayList();
                int size3 = arrayListM3927u.size();
                int i10 = 0;
                while (i10 < size3) {
                    Object obj2 = arrayListM3927u.get(i10);
                    i10++;
                    CustomTagInfo customTagInfo = (CustomTagInfo) obj2;
                    if (customTagInfo.getLocalType() == -1 && !arrayList2.isEmpty()) {
                        int size4 = arrayList2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size4) {
                                Object obj3 = arrayList2.get(i11);
                                i11++;
                                if (((CustomTagInfo) obj3).getId() == customTagInfo.getId()) {
                                    arrayList4.add(obj2);
                                }
                            }
                        }
                    }
                }
                arrayList3.addAll(arrayList4);
                ((ActivityMistakeDetailBinding) mistakeDetailActivity7.m3957p()).f6048c.f6155e.removeAllViews();
                ((ActivityMistakeDetailBinding) mistakeDetailActivity7.m3957p()).f6048c.f6156f.removeAllViews();
                ((ActivityMistakeDetailBinding) mistakeDetailActivity7.m3957p()).f6048c.f6157g.removeAllViews();
                ((ActivityMistakeDetailBinding) mistakeDetailActivity7.m3957p()).f6048c.f6154d.removeAllViews();
                int i12 = 0;
                while (true) {
                    boolean z9 = true;
                    if (i12 >= 3) {
                        int i13 = 0;
                        while (i13 < 3) {
                            FlowLayout flowLayout = ((ActivityMistakeDetailBinding) mistakeDetailActivity7.m3957p()).f6048c.f6156f;
                            String str = AbstractC5099d.f8031b[i13];
                            i13++;
                            flowLayout.addView(MistakeDetailActivity.m3922x(mistakeDetailActivity7, new CustomTagInfo(str, i13, 0, 1, 4, null), mistakeDetailActivity7.f5820h.getAttainedLevel() == i13, 4));
                        }
                        int i14 = 0;
                        while (i14 < 4) {
                            FlowLayout flowLayout2 = ((ActivityMistakeDetailBinding) mistakeDetailActivity7.m3957p()).f6048c.f6157g;
                            String str2 = AbstractC5099d.f8032c[i14];
                            i14++;
                            flowLayout2.addView(MistakeDetailActivity.m3922x(mistakeDetailActivity7, new CustomTagInfo(str2, i14, 0, 2, 4, null), mistakeDetailActivity7.f5820h.getErrorReason() == i14, 4));
                        }
                        ((ActivityMistakeDetailBinding) mistakeDetailActivity7.m3957p()).f6048c.f6154d.addView(MistakeDetailActivity.m3922x(mistakeDetailActivity7, new CustomTagInfo(null, 0L, 0, 0, 15, null), false, 2));
                        int size5 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size5) {
                            Object obj4 = arrayList2.get(i15);
                            i15++;
                            CustomTagInfo customTagInfo2 = (CustomTagInfo) obj4;
                            FlowLayout flowLayout3 = ((ActivityMistakeDetailBinding) mistakeDetailActivity7.m3957p()).f6048c.f6154d;
                            ArrayList<CustomTagInfo> mistakeTags = mistakeDetailActivity7.f5820h.getMistakeTags();
                            if (mistakeTags == null || !mistakeTags.isEmpty()) {
                                int size6 = mistakeTags.size();
                                int i16 = 0;
                                while (i16 < size6) {
                                    CustomTagInfo customTagInfo3 = mistakeTags.get(i16);
                                    i16++;
                                    CustomTagInfo customTagInfo4 = customTagInfo3;
                                    if (customTagInfo2.getId() == customTagInfo4.getId() && customTagInfo2.getLocalType() == customTagInfo4.getLocalType()) {
                                        z8 = true;
                                    }
                                }
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            flowLayout3.addView(MistakeDetailActivity.m3922x(mistakeDetailActivity7, customTagInfo2, z8, 4));
                        }
                        ((ActivityMistakeDetailBinding) mistakeDetailActivity7.m3957p()).f6046a.openDrawer(GravityCompat.END);
                        return;
                    }
                    FlowLayout flowLayout4 = ((ActivityMistakeDetailBinding) mistakeDetailActivity7.m3957p()).f6048c.f6155e;
                    String str3 = AbstractC5099d.f8030a[i12];
                    i12++;
                    CustomTagInfo customTagInfo5 = new CustomTagInfo(str3, i12, 0, 0, 4, null);
                    if (mistakeDetailActivity7.f5820h.getDiff() != i12) {
                        z9 = false;
                    }
                    flowLayout4.addView(MistakeDetailActivity.m3922x(mistakeDetailActivity7, customTagInfo5, z9, 4));
                }
                break;
            case 4:
                AbstractC5830k.m5330g((ApiResp) obj, "resp");
                MistakeDetailActivity mistakeDetailActivity8 = (MistakeDetailActivity) this.f1720b.f6001c;
                if (mistakeDetailActivity8 != null) {
                    Dialog dialog = mistakeDetailActivity8.f5818f;
                    if (dialog == null) {
                        AbstractC5830k.m5339p("mRemoveMistakeDialog");
                        throw null;
                    }
                    if (dialog.isShowing()) {
                        Dialog dialog2 = mistakeDetailActivity8.f5818f;
                        if (dialog2 == null) {
                            AbstractC5830k.m5339p("mRemoveMistakeDialog");
                            throw null;
                        }
                        dialog2.dismiss();
                    }
                    Intent intent = new Intent();
                    intent.putExtra("IS_DELETED", true);
                    intent.putExtra("DELETED_POSITION", mistakeDetailActivity8.f5830r);
                    mistakeDetailActivity8.setResult(0, intent);
                    mistakeDetailActivity8.finish();
                    return;
                }
                return;
            default:
                AbstractC5830k.m5330g((ApiResp) obj, "resp");
                MistakeDetailActivity mistakeDetailActivity9 = (MistakeDetailActivity) this.f1720b.f6001c;
                if (mistakeDetailActivity9 != null) {
                    int firstSelectedIndex = ((ActivityMistakeDetailBinding) mistakeDetailActivity9.m3957p()).f6048c.f6155e.getFirstSelectedIndex();
                    int i17 = 0;
                    mistakeDetailActivity9.f5820h.setDiff(firstSelectedIndex != -1 ? firstSelectedIndex + 1 : 0);
                    int firstSelectedIndex2 = ((ActivityMistakeDetailBinding) mistakeDetailActivity9.m3957p()).f6048c.f6156f.getFirstSelectedIndex();
                    mistakeDetailActivity9.f5820h.setAttainedLevel(firstSelectedIndex2 != -1 ? firstSelectedIndex2 + 1 : 0);
                    int firstSelectedIndex3 = ((ActivityMistakeDetailBinding) mistakeDetailActivity9.m3957p()).f6048c.f6157g.getFirstSelectedIndex();
                    mistakeDetailActivity9.f5820h.setErrorReason(firstSelectedIndex3 != -1 ? firstSelectedIndex3 + 1 : 0);
                    mistakeDetailActivity9.f5820h.getMistakeTags().clear();
                    ArrayList<CustomTagInfo> mistakeTags2 = mistakeDetailActivity9.f5820h.getMistakeTags();
                    ArrayList arrayList5 = mistakeDetailActivity9.f5821i;
                    ArrayList arrayList6 = new ArrayList();
                    int size7 = arrayList5.size();
                    while (i17 < size7) {
                        Object obj5 = arrayList5.get(i17);
                        i17++;
                        if (((CustomTagInfo) obj5).getLocalType() == -1) {
                            arrayList6.add(obj5);
                        }
                    }
                    mistakeTags2.addAll(arrayList6);
                    mistakeDetailActivity9.m3925C();
                    String string4 = mistakeDetailActivity9.getString(R.string.set_tag_success);
                    AbstractC5830k.m5329f(string4, "getString(...)");
                    mistakeDetailActivity9.mo3962b(string4);
                    ((ActivityMistakeDetailBinding) mistakeDetailActivity9.m3957p()).f6046a.closeDrawer(GravityCompat.END);
                    return;
                }
                return;
        }
    }
}
