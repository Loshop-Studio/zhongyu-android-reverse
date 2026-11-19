package p144q4;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.AbstractC3385e;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.MistakeDetailActivity;
import com.zykj.mistake.activity.SketchActivity;
import com.zykj.mistake.entity.resp.MistakeDetail;
import com.zykj.mistake.entity.resp.MistakeListResp;
import com.zykj.mistake.fragment.NoteFragment;
import com.zykj.mistake.network.C5088a;
import com.zykj.view.utils.ImagePicker;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import p045d6.C5443s;
import p106l4.DialogC6053d;
import p152r6.InterfaceC6469a;

/* renamed from: q4.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6419c implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f10531a;

    /* renamed from: b */
    public final /* synthetic */ NoteFragment f10532b;

    public /* synthetic */ C6419c(NoteFragment noteFragment, int i) {
        this.f10531a = i;
        this.f10532b = noteFragment;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() throws Resources.NotFoundException {
        String str;
        ArrayList<MistakeDetail.AnswerListBean> arrayList;
        ArrayList<MistakeDetail.AnswerListBean> arrayList2;
        switch (this.f10531a) {
            case 0:
                Context contextRequireContext = this.f10532b.requireContext();
                AbstractC5830k.m5329f(contextRequireContext, "requireContext(...)");
                Toast toastMakeText = Toast.makeText(contextRequireContext, R.string.tips_data_err, 0);
                toastMakeText.setGravity(81, 0, 220);
                toastMakeText.show();
                break;
            case 1:
                NoteFragment noteFragment = this.f10532b;
                FragmentActivity activity = noteFragment.getActivity();
                if (activity != null && (activity instanceof MistakeDetailActivity)) {
                    MistakeDetailActivity mistakeDetailActivity = (MistakeDetailActivity) activity;
                    long j7 = noteFragment.f7783e;
                    boolean z8 = noteFragment.f7789k;
                    String note = mistakeDetailActivity.f5820h.getNote();
                    ArrayList arrayList3 = mistakeDetailActivity.f5829q;
                    if (((MistakeListResp.MistakeInfo) arrayList3.get(mistakeDetailActivity.f5830r)).getHasStem()) {
                        str = C5088a.f7987b + mistakeDetailActivity.f5820h.getQstPath() + "?showAnalysis=" + mistakeDetailActivity.f5820h.getIsShowAnswer();
                    } else {
                        str = null;
                    }
                    ArrayList<String> extraStems = ((MistakeListResp.MistakeInfo) arrayList3.get(mistakeDetailActivity.f5830r)).getHasStem() ? null : mistakeDetailActivity.f5820h.getExtraStems();
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    if (mistakeDetailActivity.f5820h.getItemType() == 0) {
                        ArrayList<MistakeDetail.AnswerListBean> answerInfos = mistakeDetailActivity.f5820h.getAnswerInfos();
                        if (answerInfos != null && !answerInfos.isEmpty()) {
                            arrayList4.addAll(mistakeDetailActivity.f5820h.getAnswerInfos().get(0).getExamAnswers());
                        }
                    } else {
                        ArrayList<MistakeDetail.AnswerListBean> answerInfos2 = mistakeDetailActivity.f5820h.getAnswerInfos();
                        int size = answerInfos2.size();
                        int i = 0;
                        while (i < size) {
                            MistakeDetail.AnswerListBean answerListBean = answerInfos2.get(i);
                            i++;
                            MistakeDetail.AnswerListBean answerListBean2 = answerListBean;
                            ArrayList<String> examAnswers = answerListBean2.getExamAnswers();
                            if (examAnswers == null || examAnswers.isEmpty()) {
                                arrayList = answerInfos2;
                            } else {
                                arrayList = answerInfos2;
                                String str2 = answerListBean2.getExamAnswers().get(0);
                                AbstractC5830k.m5329f(str2, "get(...)");
                                if (AbstractC5855p.m5372F(str2, "http", false)) {
                                    arrayList4.add(answerListBean2.getExamAnswers().get(0));
                                }
                            }
                            answerInfos2 = arrayList;
                        }
                    }
                    ArrayList<String> arrayList5 = new ArrayList<>();
                    if (mistakeDetailActivity.f5820h.getItemType() == 0) {
                        ArrayList<MistakeDetail.AnswerListBean> answerInfos3 = mistakeDetailActivity.f5820h.getAnswerInfos();
                        if (answerInfos3 != null && !answerInfos3.isEmpty()) {
                            arrayList5.addAll(mistakeDetailActivity.f5820h.getAnswerInfos().get(0).getRevisingAnswers());
                        }
                    } else {
                        ArrayList<MistakeDetail.AnswerListBean> answerInfos4 = mistakeDetailActivity.f5820h.getAnswerInfos();
                        int size2 = answerInfos4.size();
                        int i8 = 0;
                        while (i8 < size2) {
                            MistakeDetail.AnswerListBean answerListBean3 = answerInfos4.get(i8);
                            i8++;
                            MistakeDetail.AnswerListBean answerListBean4 = answerListBean3;
                            ArrayList<String> revisingAnswers = answerListBean4.getRevisingAnswers();
                            if (revisingAnswers == null || revisingAnswers.isEmpty()) {
                                arrayList2 = answerInfos4;
                            } else {
                                arrayList2 = answerInfos4;
                                String str3 = answerListBean4.getRevisingAnswers().get(0);
                                AbstractC5830k.m5329f(str3, "get(...)");
                                if (AbstractC5855p.m5372F(str3, "http", false)) {
                                    arrayList5.add(answerListBean4.getRevisingAnswers().get(0));
                                }
                            }
                            answerInfos4 = arrayList2;
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("itemId", j7);
                    bundle.putBoolean("canOpenCamera", z8);
                    if (note != null) {
                        bundle.putString("noteUrl", note);
                    }
                    if (str != null) {
                        bundle.putString("stemUrl", str);
                    }
                    if (extraStems != null) {
                        bundle.putStringArrayList("stemPathList", extraStems);
                    }
                    bundle.putStringArrayList("answerPathList", arrayList4);
                    bundle.putStringArrayList("revisedAnswerPathList", arrayList5);
                    Intent intent = new Intent(mistakeDetailActivity, (Class<?>) SketchActivity.class);
                    intent.putExtras(bundle);
                    mistakeDetailActivity.startActivity(intent);
                }
                break;
            default:
                NoteFragment noteFragment2 = this.f10532b;
                if (noteFragment2.f7789k) {
                    File file = new File(noteFragment2.f7785g, System.currentTimeMillis() + ".jpg");
                    AbstractC3385e.m2332d(file);
                    ImagePicker imagePicker = noteFragment2.f7786h;
                    Uri uriM2302c = AbstractC3382c.m2302c(file);
                    AbstractC5830k.m5329f(uriM2302c, "file2Uri(...)");
                    imagePicker.startSystemCamera(uriM2302c, true, new C6420d(noteFragment2, 1));
                } else {
                    DialogC6053d dialogC6053d = noteFragment2.f7790l;
                    if (dialogC6053d != null) {
                        dialogC6053d.show();
                    }
                }
                break;
        }
        return C5443s.f8405a;
    }
}
