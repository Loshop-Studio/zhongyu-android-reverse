package com.zykj.mistake.adapter;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.google.gson.C3841g;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.MistakeDetailActivity;
import com.zykj.mistake.entity.resp.MistakeDetail;
import com.zykj.mistake.fragment.MicroClassFragment;
import com.zykj.mistake.fragment.NoteFragment;
import com.zykj.mistake.fragment.OriginalAnswerFragment;
import com.zykj.mistake.fragment.RevisedAnswerFragment;
import com.zykj.mistake.fragment.TypicalAnswerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import p169t6.AbstractC6600a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m5110d2 = {"Lcom/zykj/mistake/adapter/DetailPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDetailPagerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailPagerAdapter.kt\ncom/zykj/mistake/adapter/DetailPagerAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,220:1\n1869#2,2:221\n1869#2,2:224\n1869#2,2:226\n1869#2,2:228\n1869#2,2:230\n1869#2,2:232\n1869#2,2:234\n1#3:223\n37#4:236\n36#4,3:237\n*S KotlinDebug\n*F\n+ 1 DetailPagerAdapter.kt\ncom/zykj/mistake/adapter/DetailPagerAdapter\n*L\n78#1:221,2\n130#1:224,2\n133#1:226,2\n172#1:228,2\n175#1:230,2\n197#1:232,2\n200#1:234,2\n215#1:236\n215#1:237,3\n*E\n"})
/* loaded from: classes3.dex */
public final class DetailPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a */
    public final MistakeDetailActivity f5959a;

    /* renamed from: b */
    public final ArrayList f5960b;

    /* renamed from: c */
    public final String[] f5961c;

    /* renamed from: d */
    public MistakeDetail f5962d;

    /* renamed from: e */
    public boolean f5963e;

    public DetailPagerAdapter(MistakeDetailActivity mistakeDetailActivity, FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.f5959a = mistakeDetailActivity;
        this.f5960b = new ArrayList();
        this.f5961c = new String[]{"原答案", "订正答案", "微课", "优解典错", "我的笔记"};
        m3948b();
    }

    /* renamed from: a */
    public final void m3947a() {
        MistakeDetail.AnswerListBean answerListBean;
        MistakeDetail mistakeDetail = this.f5962d;
        if (mistakeDetail == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        ArrayList<MistakeDetail.AnswerListBean> answerInfos = mistakeDetail.getAnswerInfos();
        if (answerInfos == null || answerInfos.isEmpty()) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        MistakeDetail mistakeDetail2 = this.f5962d;
        if (mistakeDetail2 == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        ArrayList<MistakeDetail.AnswerListBean> answerInfos2 = mistakeDetail2.getAnswerInfos();
        int size = answerInfos2.size();
        int i = 0;
        while (i < size) {
            MistakeDetail.AnswerListBean answerListBean2 = answerInfos2.get(i);
            i++;
            arrayList.add(new C3841g().m2787f(answerListBean2));
        }
        MistakeDetail mistakeDetail3 = this.f5962d;
        if (mistakeDetail3 == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        ArrayList<MistakeDetail.QstFlowBean> qstFlows = mistakeDetail3.getQstFlows();
        int size2 = qstFlows.size();
        int i8 = 0;
        while (i8 < size2) {
            MistakeDetail.QstFlowBean qstFlowBean = qstFlows.get(i8);
            i8++;
            arrayList2.add(new C3841g().m2787f(qstFlowBean));
        }
        MistakeDetail mistakeDetail4 = this.f5962d;
        if (mistakeDetail4 == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        ArrayList<MistakeDetail.AnswerListBean> answerInfos3 = mistakeDetail4.getAnswerInfos();
        if (answerInfos3 != null && !answerInfos3.isEmpty()) {
            MistakeDetail mistakeDetail5 = this.f5962d;
            if (mistakeDetail5 == null) {
                AbstractC5830k.m5339p("mMistakeDetail");
                throw null;
            }
            ArrayList<MistakeDetail.AnswerListBean> answerInfos4 = mistakeDetail5.getAnswerInfos();
            int size3 = answerInfos4.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size3) {
                    answerListBean = null;
                    break;
                }
                answerListBean = answerInfos4.get(i9);
                i9++;
                if (answerListBean.getResult() != 1) {
                    break;
                }
            }
            MistakeDetail.AnswerListBean answerListBean3 = answerListBean;
            if (answerListBean3 == null) {
                MistakeDetail mistakeDetail6 = this.f5962d;
                if (mistakeDetail6 == null) {
                    AbstractC5830k.m5339p("mMistakeDetail");
                    throw null;
                }
                MistakeDetail.AnswerListBean answerListBean4 = mistakeDetail6.getAnswerInfos().get(0);
                AbstractC5830k.m5329f(answerListBean4, "get(...)");
                answerListBean3 = answerListBean4;
            }
            MistakeDetail.QstMicroLessonBean qstMicroLessonBean = new MistakeDetail.QstMicroLessonBean();
            int i10 = R.string.exam_micro;
            MistakeDetailActivity mistakeDetailActivity = this.f5959a;
            String string = mistakeDetailActivity.getString(i10);
            AbstractC5830k.m5329f(string, "getString(...)");
            qstMicroLessonBean.setName(string);
            String str = (String) AbstractC5805t.m5229i0(answerListBean3.getExamAnswers());
            if (str == null) {
                str = "";
            }
            qstMicroLessonBean.setSnapshot(str);
            String examMicroLessonComment = answerListBean3.getExamMicroLessonComment();
            if (examMicroLessonComment == null) {
                examMicroLessonComment = "";
            }
            qstMicroLessonBean.setAddress(examMicroLessonComment);
            MistakeDetail.QstMicroLessonBean qstMicroLessonBean2 = new MistakeDetail.QstMicroLessonBean();
            String string2 = mistakeDetailActivity.getString(R.string.revise_micro);
            AbstractC5830k.m5329f(string2, "getString(...)");
            qstMicroLessonBean2.setName(string2);
            String str2 = (String) AbstractC5805t.m5229i0(answerListBean3.getRevisingAnswers());
            if (str2 == null) {
                str2 = "";
            }
            qstMicroLessonBean2.setSnapshot(str2);
            String reviseMicroLessonComment = answerListBean3.getReviseMicroLessonComment();
            qstMicroLessonBean2.setAddress(reviseMicroLessonComment != null ? reviseMicroLessonComment : "");
            if (qstMicroLessonBean.getAddress().length() > 0) {
                arrayList3.add(new C3841g().m2787f(qstMicroLessonBean));
            }
            if (qstMicroLessonBean2.getAddress().length() > 0) {
                arrayList4.add(new C3841g().m2787f(qstMicroLessonBean2));
            }
        }
        MistakeDetail mistakeDetail7 = this.f5962d;
        if (mistakeDetail7 == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        int itemType = mistakeDetail7.getItemType();
        MistakeDetail mistakeDetail8 = this.f5962d;
        if (mistakeDetail8 == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        boolean isShowAnswer = mistakeDetail8.getIsShowAnswer();
        boolean z8 = this.f5963e;
        Bundle bundle = new Bundle();
        bundle.putInt("itemType", itemType);
        bundle.putStringArrayList("answerInfoList", arrayList);
        bundle.putStringArrayList("qstFlowList", arrayList2);
        bundle.putStringArrayList("microClassForScreenList", arrayList3);
        bundle.putBoolean("isShowAnswer", isShowAnswer);
        bundle.putBoolean("isGroup", z8);
        OriginalAnswerFragment originalAnswerFragment = new OriginalAnswerFragment();
        originalAnswerFragment.setArguments(bundle);
        MistakeDetail mistakeDetail9 = this.f5962d;
        if (mistakeDetail9 == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        int itemType2 = mistakeDetail9.getItemType();
        MistakeDetail mistakeDetail10 = this.f5962d;
        if (mistakeDetail10 == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        boolean isShowAnswer2 = mistakeDetail10.getIsShowAnswer();
        boolean z9 = this.f5963e;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("itemType", itemType2);
        bundle2.putStringArrayList("answerInfoList", arrayList);
        bundle2.putStringArrayList("qstFlowList", arrayList2);
        bundle2.putStringArrayList("microClassForScreenList", arrayList4);
        bundle2.putBoolean("isShowAnswer", isShowAnswer2);
        bundle2.putBoolean("isGroup", z9);
        RevisedAnswerFragment revisedAnswerFragment = new RevisedAnswerFragment();
        revisedAnswerFragment.setArguments(bundle2);
        ArrayList arrayList5 = this.f5960b;
        arrayList5.set(0, originalAnswerFragment);
        arrayList5.set(1, revisedAnswerFragment);
    }

    /* renamed from: b */
    public final void m3948b() {
        ArrayList arrayList = this.f5960b;
        arrayList.clear();
        int i = R.string.original_answer_empty;
        MistakeDetailActivity mistakeDetailActivity = this.f5959a;
        String string = mistakeDetailActivity.getString(i);
        AbstractC5830k.m5329f(string, "getString(...)");
        arrayList.add(AbstractC6600a.m6238n(string));
        String string2 = mistakeDetailActivity.getString(R.string.revised_answer_empty);
        AbstractC5830k.m5329f(string2, "getString(...)");
        arrayList.add(AbstractC6600a.m6238n(string2));
        String string3 = mistakeDetailActivity.getString(R.string.micro_class_empty);
        AbstractC5830k.m5329f(string3, "getString(...)");
        arrayList.add(AbstractC6600a.m6238n(string3));
        String string4 = mistakeDetailActivity.getString(R.string.typical_empty);
        AbstractC5830k.m5329f(string4, "getString(...)");
        arrayList.add(AbstractC6600a.m6238n(string4));
        String string5 = mistakeDetailActivity.getString(R.string.note_empty);
        AbstractC5830k.m5329f(string5, "getString(...)");
        arrayList.add(AbstractC6600a.m6238n(string5));
    }

    /* renamed from: c */
    public final void m3949c() {
        MicroClassFragment microClassFragment;
        MistakeDetail mistakeDetail = this.f5962d;
        if (mistakeDetail == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        if (mistakeDetail.getIsShowMicroLesson()) {
            MistakeDetail mistakeDetail2 = this.f5962d;
            if (mistakeDetail2 == null) {
                AbstractC5830k.m5339p("mMistakeDetail");
                throw null;
            }
            List<MistakeDetail.QstMicroLessonBean> microClassToQuestionList = mistakeDetail2.getMicroClassToQuestionList();
            if (microClassToQuestionList == null || microClassToQuestionList.isEmpty()) {
                MistakeDetail mistakeDetail3 = this.f5962d;
                if (mistakeDetail3 == null) {
                    AbstractC5830k.m5339p("mMistakeDetail");
                    throw null;
                }
                List<MistakeDetail.QstMicroLessonBean> microClassToStudentList = mistakeDetail3.getMicroClassToStudentList();
                if (microClassToStudentList == null || microClassToStudentList.isEmpty()) {
                    return;
                }
            }
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            MistakeDetail mistakeDetail4 = this.f5962d;
            if (mistakeDetail4 == null) {
                AbstractC5830k.m5339p("mMistakeDetail");
                throw null;
            }
            Iterator<T> it = mistakeDetail4.getMicroClassToQuestionList().iterator();
            while (it.hasNext()) {
                arrayList.add(new C3841g().m2787f((MistakeDetail.QstMicroLessonBean) it.next()));
            }
            MistakeDetail mistakeDetail5 = this.f5962d;
            if (mistakeDetail5 == null) {
                AbstractC5830k.m5339p("mMistakeDetail");
                throw null;
            }
            Iterator<T> it2 = mistakeDetail5.getMicroClassToStudentList().iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C3841g().m2787f((MistakeDetail.QstMicroLessonBean) it2.next()));
            }
            MistakeDetail mistakeDetail6 = this.f5962d;
            if (mistakeDetail6 == null) {
                AbstractC5830k.m5339p("mMistakeDetail");
                throw null;
            }
            if (mistakeDetail6.getQuestionId() == 0 || mistakeDetail6.getExamId() == 0) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("microClassToQuestionList", arrayList);
                bundle.putStringArrayList("microClassToStudentList", arrayList2);
                microClassFragment = new MicroClassFragment();
                microClassFragment.setArguments(bundle);
            } else {
                MistakeDetail mistakeDetail7 = this.f5962d;
                if (mistakeDetail7 == null) {
                    AbstractC5830k.m5339p("mMistakeDetail");
                    throw null;
                }
                int examId = (int) mistakeDetail7.getExamId();
                MistakeDetail mistakeDetail8 = this.f5962d;
                if (mistakeDetail8 == null) {
                    AbstractC5830k.m5339p("mMistakeDetail");
                    throw null;
                }
                int questionId = (int) mistakeDetail8.getQuestionId();
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("microClassToQuestionList", arrayList);
                bundle2.putStringArrayList("microClassToStudentList", arrayList2);
                bundle2.putInt("examId", examId);
                bundle2.putInt("questionId", questionId);
                microClassFragment = new MicroClassFragment();
                microClassFragment.setArguments(bundle2);
            }
            this.f5960b.set(2, microClassFragment);
        }
    }

    /* renamed from: d */
    public final void m3950d() {
        String[] strArr;
        MistakeDetail mistakeDetail = this.f5962d;
        if (mistakeDetail == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        long itemId = mistakeDetail.getItemId();
        MistakeDetail mistakeDetail2 = this.f5962d;
        if (mistakeDetail2 == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        String note = mistakeDetail2.getNote();
        if (note == null) {
            note = "";
        }
        MistakeDetail mistakeDetail3 = this.f5962d;
        if (mistakeDetail3 == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        List<String> pictureNote = mistakeDetail3.getPictureNote();
        if (pictureNote == null || (strArr = (String[]) pictureNote.toArray(new String[0])) == null) {
            strArr = new String[0];
        }
        Bundle bundle = new Bundle();
        bundle.putLong("itemId", itemId);
        bundle.putString("noteUrl", note);
        bundle.putStringArray("pictureNoteUrl", strArr);
        NoteFragment noteFragment = new NoteFragment();
        noteFragment.setArguments(bundle);
        this.f5960b.set(4, noteFragment);
    }

    /* renamed from: e */
    public final void m3951e() {
        MistakeDetail mistakeDetail = this.f5962d;
        if (mistakeDetail == null) {
            AbstractC5830k.m5339p("mMistakeDetail");
            throw null;
        }
        if (mistakeDetail.getIsShowMicroLesson()) {
            MistakeDetail mistakeDetail2 = this.f5962d;
            if (mistakeDetail2 == null) {
                AbstractC5830k.m5339p("mMistakeDetail");
                throw null;
            }
            List<MistakeDetail.QstAnswerBean> typicalRightAnswers = mistakeDetail2.getTypicalRightAnswers();
            if (typicalRightAnswers == null || typicalRightAnswers.isEmpty()) {
                MistakeDetail mistakeDetail3 = this.f5962d;
                if (mistakeDetail3 == null) {
                    AbstractC5830k.m5339p("mMistakeDetail");
                    throw null;
                }
                List<MistakeDetail.QstAnswerBean> typicalErrorAnswers = mistakeDetail3.getTypicalErrorAnswers();
                if (typicalErrorAnswers == null || typicalErrorAnswers.isEmpty()) {
                    return;
                }
            }
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            MistakeDetail mistakeDetail4 = this.f5962d;
            if (mistakeDetail4 == null) {
                AbstractC5830k.m5339p("mMistakeDetail");
                throw null;
            }
            List<MistakeDetail.QstAnswerBean> typicalRightAnswers2 = mistakeDetail4.getTypicalRightAnswers();
            if (typicalRightAnswers2 != null) {
                Iterator<T> it = typicalRightAnswers2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C3841g().m2787f((MistakeDetail.QstAnswerBean) it.next()));
                }
            }
            MistakeDetail mistakeDetail5 = this.f5962d;
            if (mistakeDetail5 == null) {
                AbstractC5830k.m5339p("mMistakeDetail");
                throw null;
            }
            List<MistakeDetail.QstAnswerBean> typicalErrorAnswers2 = mistakeDetail5.getTypicalErrorAnswers();
            if (typicalErrorAnswers2 != null) {
                Iterator<T> it2 = typicalErrorAnswers2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C3841g().m2787f((MistakeDetail.QstAnswerBean) it2.next()));
                }
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("typicalRightAnswers", arrayList);
            bundle.putStringArrayList("typicalErrorAnswers", arrayList2);
            TypicalAnswerFragment typicalAnswerFragment = new TypicalAnswerFragment();
            typicalAnswerFragment.setArguments(bundle);
            this.f5960b.set(3, typicalAnswerFragment);
        }
    }

    /* renamed from: f */
    public final void m3952f(MistakeDetail mistakeDetail) {
        int i = 0;
        this.f5963e = false;
        ArrayList<MistakeDetail.AnswerListBean> answerInfos = mistakeDetail.getAnswerInfos();
        int size = answerInfos.size();
        while (i < size) {
            MistakeDetail.AnswerListBean answerListBean = answerInfos.get(i);
            i++;
            MistakeDetail.AnswerListBean answerListBean2 = answerListBean;
            answerListBean2.setIndex(String.valueOf(answerListBean2.getNumber()));
            answerListBean2.setItemType(mistakeDetail.getItemType());
        }
        this.f5962d = mistakeDetail;
        m3948b();
        m3947a();
        m3949c();
        m3951e();
        m3950d();
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f5960b.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public final Fragment getItem(int i) {
        Object obj = this.f5960b.get(i);
        AbstractC5830k.m5329f(obj, "get(...)");
        return (Fragment) obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object object) {
        AbstractC5830k.m5330g(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.f5961c[i];
    }
}
