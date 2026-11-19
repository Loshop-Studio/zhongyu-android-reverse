package com.zykj.mistake.activity;

import android.content.Intent;
import android.text.Editable;
import android.util.Log;
import androidx.databinding.ViewDataBinding;
import com.zykj.mistake.R;
import com.zykj.mistake.databinding.ActivityMistakeCreateOrEditBinding;
import com.zykj.mistake.entity.req.CreateOrUpdateMistakeReq;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.SubjectResp;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.presenter.MistakeCreateOrEditPresenter;
import com.zykj.mistake.service.UploadIntentService;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p021b5.C3190b;
import p045d6.C5443s;
import p106l4.DialogC6053d;
import p106l4.DialogC6058i;
import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.mistake.activity.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4473i implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f5906a;

    /* renamed from: b */
    public final /* synthetic */ MistakeCreateOrEditActivity f5907b;

    public /* synthetic */ C4473i(MistakeCreateOrEditActivity mistakeCreateOrEditActivity, int i) {
        this.f5906a = i;
        this.f5907b = mistakeCreateOrEditActivity;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        ArrayList<String> extraStems;
        int i = this.f5906a;
        int i8 = 2;
        MistakeCreateOrEditActivity mistakeCreateOrEditActivity = this.f5907b;
        switch (i) {
            case 0:
                int i9 = MistakeCreateOrEditActivity.f5799u;
                return new DialogC6058i(mistakeCreateOrEditActivity, 2);
            case 1:
                int i10 = MistakeCreateOrEditActivity.f5799u;
                return new DialogC6053d(mistakeCreateOrEditActivity);
            default:
                int i11 = MistakeCreateOrEditActivity.f5799u;
                ViewDataBinding viewDataBindingM3957p = mistakeCreateOrEditActivity.m3957p();
                String[] strArr = mistakeCreateOrEditActivity.f5811p;
                CreateOrUpdateMistakeReq createOrUpdateMistakeReq = mistakeCreateOrEditActivity.f5813r;
                Editable text = ((ActivityMistakeCreateOrEditBinding) viewDataBindingM3957p).f6021d.getText();
                AbstractC5830k.m5329f(text, "getText(...)");
                if (AbstractC5855p.m5403k0(text).length() == 0) {
                    String string = mistakeCreateOrEditActivity.getString(R.string.mistake_info_missing);
                    AbstractC5830k.m5329f(string, "getString(...)");
                    mistakeCreateOrEditActivity.mo3962b(string);
                } else {
                    if (mistakeCreateOrEditActivity.getIntent().getBooleanExtra("isCustomMistake", true) && strArr[0].length() == 0 && strArr[1].length() == 0 && ((extraStems = createOrUpdateMistakeReq.getExtraStems()) == null || extraStems.isEmpty())) {
                        String string2 = mistakeCreateOrEditActivity.getString(R.string.mistake_info_missing);
                        AbstractC5830k.m5329f(string2, "getString(...)");
                        mistakeCreateOrEditActivity.mo3962b(string2);
                    } else {
                        createOrUpdateMistakeReq.setTopicId(((SubjectResp.Subject) mistakeCreateOrEditActivity.f5800e.get(((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity.m3957p()).f6037t.getSelectedIndex())).getId());
                        createOrUpdateMistakeReq.setTitle(((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity.m3957p()).f6021d.getText().toString());
                        createOrUpdateMistakeReq.setDiff(null);
                        createOrUpdateMistakeReq.setAttainedLevel(null);
                        createOrUpdateMistakeReq.setErrorReason(null);
                        createOrUpdateMistakeReq.getTagIdList().clear();
                        ArrayList arrayList = mistakeCreateOrEditActivity.f5801f;
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i12++;
                            CustomTagInfo customTagInfo = (CustomTagInfo) obj;
                            int localType = customTagInfo.getLocalType();
                            if (localType == -1) {
                                createOrUpdateMistakeReq.getTagIdList().add(Integer.valueOf((int) customTagInfo.getId()));
                            } else if (localType == 0) {
                                createOrUpdateMistakeReq.setDiff(Integer.valueOf((int) customTagInfo.getId()));
                            } else if (localType == 1) {
                                createOrUpdateMistakeReq.setAttainedLevel(Integer.valueOf((int) customTagInfo.getId()));
                            } else if (localType == 2) {
                                createOrUpdateMistakeReq.setErrorReason(Integer.valueOf((int) customTagInfo.getId()));
                            }
                        }
                        if (mistakeCreateOrEditActivity.getIntent().getBooleanExtra("isCustomMistake", true)) {
                            String str = mistakeCreateOrEditActivity.f5807l;
                            mistakeCreateOrEditActivity.mo3964d(true);
                            ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity.m3957p()).f6019b.setClickable(false);
                            int length = strArr.length;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= length) {
                                    MistakeCreateOrEditPresenter mistakeCreateOrEditPresenter = (MistakeCreateOrEditPresenter) mistakeCreateOrEditActivity.m3965r();
                                    mistakeCreateOrEditPresenter.m3970b(C5088a.m4381b().m4402t(createOrUpdateMistakeReq), new C3190b(mistakeCreateOrEditPresenter, i8), false);
                                } else if (strArr[i13].length() > 0) {
                                    int length2 = strArr.length;
                                    for (int i14 = 0; i14 < length2; i14++) {
                                        if (strArr[i14].length() > 0) {
                                            Intent intent = new Intent(mistakeCreateOrEditActivity, (Class<?>) UploadIntentService.class);
                                            intent.putExtra("UPLOAD_TYPE", 1);
                                            intent.putExtra("UPLOAD_PATH", str + "/" + i14 + ".jpg");
                                            intent.putExtra("UPLOAD_DATA", String.valueOf(i14));
                                            intent.putExtra("UPLOAD_MESSENGER", mistakeCreateOrEditActivity.f5815t);
                                            mistakeCreateOrEditActivity.startService(intent);
                                            Log.i("uploadImage", "path--->> " + str + "/" + i14 + ".jpg, tag--->> " + i14);
                                            mistakeCreateOrEditActivity.f5812q[i14] = 1;
                                        }
                                    }
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            MistakeCreateOrEditPresenter mistakeCreateOrEditPresenter2 = (MistakeCreateOrEditPresenter) mistakeCreateOrEditActivity.m3965r();
                            C5088a c5088a = C5088a.f7986a;
                            mistakeCreateOrEditPresenter2.m3970b(C5088a.m4381b().m4391i(createOrUpdateMistakeReq), new C3190b(mistakeCreateOrEditPresenter2, 3), false);
                        }
                    }
                }
                return C5443s.f8405a;
        }
    }
}
