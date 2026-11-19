package p021b5;

import android.view.View;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.MistakeCreateOrEditActivity;
import com.zykj.mistake.databinding.ActivityMistakeCreateOrEditBinding;
import com.zykj.mistake.entity.EditMistakeData;
import com.zykj.mistake.entity.resp.CameraPermissionResp;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.CustomTagInfoKt;
import com.zykj.mistake.entity.resp.GetMyTagResp;
import com.zykj.mistake.entity.resp.SubjectResp;
import com.zykj.mistake.network.ApiResp;
import com.zykj.mistake.presenter.MistakeCreateOrEditPresenter;
import com.zykj.mistake.utils.AbstractC5099d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.angmarch.views.NiceSpinner;
import p000a.AbstractC0000a;

/* renamed from: b5.b */
/* loaded from: classes3.dex */
public final class C3190b extends AbstractC0000a {

    /* renamed from: a */
    public final /* synthetic */ int f1712a;

    /* renamed from: b */
    public final /* synthetic */ MistakeCreateOrEditPresenter f1713b;

    public /* synthetic */ C3190b(MistakeCreateOrEditPresenter mistakeCreateOrEditPresenter, int i) {
        this.f1712a = i;
        this.f1713b = mistakeCreateOrEditPresenter;
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: m */
    public final void mo15m(String e) {
        switch (this.f1712a) {
            case 0:
                AbstractC5830k.m5330g(e, "e");
                break;
            case 1:
                AbstractC5830k.m5330g(e, "e");
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity = (MistakeCreateOrEditActivity) this.f1713b.f6001c;
                if (mistakeCreateOrEditActivity != null) {
                    mistakeCreateOrEditActivity.mo3963c();
                    ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity.m3957p()).f6019b.setClickable(true);
                    mistakeCreateOrEditActivity.mo3962b(e);
                    break;
                }
                break;
            case 2:
                AbstractC5830k.m5330g(e, "e");
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity2 = (MistakeCreateOrEditActivity) this.f1713b.f6001c;
                if (mistakeCreateOrEditActivity2 != null) {
                    mistakeCreateOrEditActivity2.mo3963c();
                    ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity2.m3957p()).f6019b.setClickable(true);
                    mistakeCreateOrEditActivity2.mo3962b(e);
                    break;
                }
                break;
            case 3:
                AbstractC5830k.m5330g(e, "e");
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity3 = (MistakeCreateOrEditActivity) this.f1713b.f6001c;
                if (mistakeCreateOrEditActivity3 != null) {
                    mistakeCreateOrEditActivity3.mo3963c();
                    ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity3.m3957p()).f6019b.setClickable(true);
                    mistakeCreateOrEditActivity3.mo3962b(e);
                    break;
                }
                break;
            case 4:
                AbstractC5830k.m5330g(e, "e");
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity4 = (MistakeCreateOrEditActivity) this.f1713b.f6001c;
                if (mistakeCreateOrEditActivity4 != null) {
                    mistakeCreateOrEditActivity4.mo3962b(e);
                    break;
                }
                break;
            default:
                AbstractC5830k.m5330g(e, "e");
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity5 = (MistakeCreateOrEditActivity) this.f1713b.f6001c;
                if (mistakeCreateOrEditActivity5 != null) {
                    mistakeCreateOrEditActivity5.mo3962b(e);
                    break;
                }
                break;
        }
    }

    @Override // p000a.AbstractC0000a
    /* renamed from: n */
    public final void mo16n(Object obj) {
        int i;
        boolean z8;
        boolean z9;
        boolean z10;
        switch (this.f1712a) {
            case 0:
                CameraPermissionResp resp = (CameraPermissionResp) obj;
                AbstractC5830k.m5330g(resp, "resp");
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity = (MistakeCreateOrEditActivity) this.f1713b.f6001c;
                if (mistakeCreateOrEditActivity != null) {
                    mistakeCreateOrEditActivity.f5808m = resp.getResult();
                    AbstractC5099d.m4455e(mistakeCreateOrEditActivity, "SP_CAN_OPEN_CAMERA", resp.getResult());
                    AbstractC5099d.m4455e(mistakeCreateOrEditActivity, "SP_NEED_SHOW_CAMERA_DIALOG", true);
                    break;
                }
                break;
            case 1:
                AbstractC5830k.m5330g((ApiResp) obj, "resp");
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity2 = (MistakeCreateOrEditActivity) this.f1713b.f6001c;
                if (mistakeCreateOrEditActivity2 != null) {
                    mistakeCreateOrEditActivity2.mo3963c();
                    ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity2.m3957p()).f6019b.setClickable(true);
                    String string = mistakeCreateOrEditActivity2.getString(R.string.create_mistake_success);
                    AbstractC5830k.m5329f(string, "getString(...)");
                    mistakeCreateOrEditActivity2.mo3962b(string);
                    mistakeCreateOrEditActivity2.setResult(-1);
                    mistakeCreateOrEditActivity2.finish();
                    break;
                }
                break;
            case 2:
                AbstractC5830k.m5330g((ApiResp) obj, "resp");
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity3 = (MistakeCreateOrEditActivity) this.f1713b.f6001c;
                if (mistakeCreateOrEditActivity3 != null) {
                    mistakeCreateOrEditActivity3.m3914A();
                    break;
                }
                break;
            case 3:
                AbstractC5830k.m5330g((ApiResp) obj, "resp");
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity4 = (MistakeCreateOrEditActivity) this.f1713b.f6001c;
                if (mistakeCreateOrEditActivity4 != null) {
                    mistakeCreateOrEditActivity4.m3914A();
                    break;
                }
                break;
            case 4:
                SubjectResp resp2 = (SubjectResp) obj;
                AbstractC5830k.m5330g(resp2, "resp");
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity5 = (MistakeCreateOrEditActivity) this.f1713b.f6001c;
                if (mistakeCreateOrEditActivity5 != null) {
                    ArrayList arrayList = mistakeCreateOrEditActivity5.f5800e;
                    arrayList.clear();
                    arrayList.addAll(resp2.getResult());
                    int i8 = 0;
                    long j7 = mistakeCreateOrEditActivity5.getSharedPreferences("zykjMistake", 0).getLong("SP_SUBJECT_ID", -1L);
                    Long lValueOf = Long.valueOf(j7);
                    if (j7 == -1) {
                        lValueOf = null;
                    }
                    EditMistakeData editMistakeData = mistakeCreateOrEditActivity5.f5810o;
                    if (editMistakeData != null) {
                        lValueOf = Long.valueOf(editMistakeData.getTopicId());
                    }
                    if (lValueOf != null) {
                        long jLongValue = lValueOf.longValue();
                        int size = arrayList.size();
                        i = 0;
                        while (i < size) {
                            if (((SubjectResp.Subject) arrayList.get(i)).getId() != jLongValue) {
                                i++;
                            }
                        }
                        i = 0;
                    } else {
                        i = 0;
                    }
                    NiceSpinner niceSpinner = ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity5.m3957p()).f6037t;
                    ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
                    int size2 = arrayList.size();
                    while (i8 < size2) {
                        Object obj2 = arrayList.get(i8);
                        i8++;
                        arrayList2.add(((SubjectResp.Subject) obj2).getContent());
                    }
                    niceSpinner.m6019d(arrayList2);
                    if (!arrayList.isEmpty()) {
                        ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity5.m3957p()).f6037t.setSelectedIndex(i);
                        break;
                    }
                }
                break;
            default:
                GetMyTagResp resp3 = (GetMyTagResp) obj;
                AbstractC5830k.m5330g(resp3, "resp");
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity6 = (MistakeCreateOrEditActivity) this.f1713b.f6001c;
                if (mistakeCreateOrEditActivity6 != null) {
                    ArrayList arrayList3 = mistakeCreateOrEditActivity6.f5802g;
                    arrayList3.clear();
                    List<CustomTagInfo> result = resp3.getResult();
                    if (result != null) {
                        arrayList3.addAll(result);
                    }
                    ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity6.m3957p()).f6026i.f6154d.removeAllViews();
                    ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity6.m3957p()).f6026i.f6154d.addView(MistakeCreateOrEditActivity.m3913v(mistakeCreateOrEditActivity6, new CustomTagInfo(null, 0L, 0, 0, 15, null), false, 2));
                    int size3 = arrayList3.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj3 = arrayList3.get(i9);
                        i9++;
                        ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity6.m3957p()).f6026i.f6154d.addView(MistakeCreateOrEditActivity.m3913v(mistakeCreateOrEditActivity6, (CustomTagInfo) obj3, false, 6));
                    }
                    ArrayList arrayList4 = mistakeCreateOrEditActivity6.f5803h;
                    ArrayList arrayList5 = mistakeCreateOrEditActivity6.f5801f;
                    int childCount = ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity6.m3957p()).f6026i.f6155e.getChildCount();
                    int i10 = 0;
                    while (true) {
                        boolean z11 = true;
                        if (i10 >= childCount) {
                            int childCount2 = ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity6.m3957p()).f6026i.f6156f.getChildCount();
                            for (int i11 = 0; i11 < childCount2; i11++) {
                                View childAt = ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity6.m3957p()).f6026i.f6156f.getChildAt(i11);
                                CharSequence text = ((TextView) childAt.findViewById(R.id.tv_item_tag_content)).getText();
                                if (arrayList5 == null || !arrayList5.isEmpty()) {
                                    int size4 = arrayList5.size();
                                    int i12 = 0;
                                    while (i12 < size4) {
                                        Object obj4 = arrayList5.get(i12);
                                        i12++;
                                        CustomTagInfo customTagInfo = (CustomTagInfo) obj4;
                                        if (customTagInfo.getLocalType() == 1 && AbstractC5830k.m5325b(customTagInfo.getName(), text)) {
                                            z10 = true;
                                        }
                                    }
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                childAt.setSelected(z10);
                            }
                            int childCount3 = ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity6.m3957p()).f6026i.f6157g.getChildCount();
                            for (int i13 = 0; i13 < childCount3; i13++) {
                                View childAt2 = ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity6.m3957p()).f6026i.f6157g.getChildAt(i13);
                                CharSequence text2 = ((TextView) childAt2.findViewById(R.id.tv_item_tag_content)).getText();
                                if (arrayList5 == null || !arrayList5.isEmpty()) {
                                    int size5 = arrayList5.size();
                                    int i14 = 0;
                                    while (i14 < size5) {
                                        Object obj5 = arrayList5.get(i14);
                                        i14++;
                                        CustomTagInfo customTagInfo2 = (CustomTagInfo) obj5;
                                        if (customTagInfo2.getLocalType() == 2 && AbstractC5830k.m5325b(customTagInfo2.getName(), text2)) {
                                            z9 = true;
                                        }
                                    }
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                childAt2.setSelected(z9);
                            }
                            int childCount4 = ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity6.m3957p()).f6026i.f6154d.getChildCount();
                            for (int i15 = 0; i15 < childCount4; i15++) {
                                View childAt3 = ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity6.m3957p()).f6026i.f6154d.getChildAt(i15);
                                CharSequence text3 = ((TextView) childAt3.findViewById(R.id.tv_item_tag_content)).getText();
                                if (arrayList5 == null || !arrayList5.isEmpty()) {
                                    int size6 = arrayList5.size();
                                    int i16 = 0;
                                    while (i16 < size6) {
                                        Object obj6 = arrayList5.get(i16);
                                        i16++;
                                        CustomTagInfo customTagInfo3 = (CustomTagInfo) obj6;
                                        if (customTagInfo3.getLocalType() == -1 && AbstractC5830k.m5325b(customTagInfo3.getName(), text3)) {
                                            z8 = true;
                                        }
                                    }
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                childAt3.setSelected(z8);
                            }
                            arrayList4.clear();
                            int size7 = arrayList5.size();
                            int i17 = 0;
                            while (i17 < size7) {
                                Object obj7 = arrayList5.get(i17);
                                i17++;
                                CustomTagInfo customTagInfo4 = (CustomTagInfo) obj7;
                                if (!CustomTagInfoKt.isSystemTag(customTagInfo4)) {
                                    if (!arrayList3.isEmpty()) {
                                        int size8 = arrayList3.size();
                                        int i18 = 0;
                                        while (i18 < size8) {
                                            Object obj8 = arrayList3.get(i18);
                                            i18++;
                                            if (((CustomTagInfo) obj8).getId() == customTagInfo4.getId()) {
                                            }
                                        }
                                    }
                                }
                                arrayList4.add(customTagInfo4);
                            }
                            ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity6.m3957p()).f6020c.openDrawer(GravityCompat.END);
                            break;
                        } else {
                            View childAt4 = ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity6.m3957p()).f6026i.f6155e.getChildAt(i10);
                            CharSequence text4 = ((TextView) childAt4.findViewById(R.id.tv_item_tag_content)).getText();
                            if (arrayList5 == null || !arrayList5.isEmpty()) {
                                int size9 = arrayList5.size();
                                int i19 = 0;
                                while (i19 < size9) {
                                    Object obj9 = arrayList5.get(i19);
                                    i19++;
                                    CustomTagInfo customTagInfo5 = (CustomTagInfo) obj9;
                                    if (customTagInfo5.getLocalType() != 0 || !AbstractC5830k.m5325b(customTagInfo5.getName(), text4)) {
                                    }
                                }
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            childAt4.setSelected(z11);
                            i10++;
                        }
                    }
                }
                break;
        }
    }
}
