package com.zykj.mistake.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.C3412f;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.google.gson.C3841g;
import com.zykj.mistake.R;
import com.zykj.mistake.base.BaseFragment;
import com.zykj.mistake.databinding.FragmentOriginalAnswerBinding;
import com.zykj.mistake.entity.resp.MistakeDetail;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.utils.QuestionType;
import com.zykj.mistake.widget.WrapLinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import p006a5.ViewOnClickListenerC0015f;
import p016b0.AbstractC3085o;
import p095k1.C5752a;
import p144q4.C6424h;
import p144q4.C6425i;
import p144q4.C6426j;
import p144q4.ViewOnClickListenerC6423g;
import p147r0.C6446d;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/mistake/fragment/OriginalAnswerFragment;", "Lcom/zykj/mistake/base/BaseFragment;", "Lcom/zykj/mistake/databinding/FragmentOriginalAnswerBinding;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOriginalAnswerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OriginalAnswerFragment.kt\ncom/zykj/mistake/fragment/OriginalAnswerFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n1869#2,2:438\n1869#2,2:440\n1869#2,2:442\n1761#2,3:444\n1869#2,2:447\n1869#2:449\n1870#2:451\n1869#2:452\n1869#2,2:453\n1870#2:455\n1869#2:456\n774#2:457\n865#2,2:458\n774#2:460\n865#2,2:461\n1870#2:463\n1869#2,2:464\n1869#2,2:466\n1869#2,2:468\n1#3:450\n*S KotlinDebug\n*F\n+ 1 OriginalAnswerFragment.kt\ncom/zykj/mistake/fragment/OriginalAnswerFragment\n*L\n77#1:438,2\n80#1:440,2\n83#1:442,2\n109#1:444,3\n139#1:447,2\n152#1:449\n152#1:451\n192#1:452\n194#1:453,2\n192#1:455\n213#1:456\n220#1:457\n220#1:458,2\n225#1:460\n225#1:461,2\n213#1:463\n325#1:464,2\n362#1:466,2\n394#1:468,2\n*E\n"})
/* loaded from: classes3.dex */
public final class OriginalAnswerFragment extends BaseFragment<FragmentOriginalAnswerBinding> {

    /* renamed from: e */
    public LinearLayout f7796e;

    /* renamed from: b */
    public final ArrayList f7793b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f7794c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f7795d = new ArrayList();

    /* renamed from: f */
    public int f7797f = -1;

    /* renamed from: i */
    public static /* synthetic */ void m4340i(OriginalAnswerFragment originalAnswerFragment, MistakeDetail.AnswerListBean answerListBean) {
        originalAnswerFragment.m4341h(answerListBean, answerListBean.getExamAnswers(), answerListBean.getExamComments(), "");
    }

    @Override // com.zykj.mistake.base.BaseFragment
    /* renamed from: e */
    public final int mo3959e() {
        return R.layout.fragment_original_answer;
    }

    @Override // com.zykj.mistake.base.BaseFragment
    /* renamed from: g */
    public final void mo3961g(View view) {
        View viewFindViewById = view.findViewById(R.id.ll_answer);
        AbstractC5830k.m5329f(viewFindViewById, "findViewById(...)");
        this.f7796e = (LinearLayout) viewFindViewById;
        this.f7797f = requireArguments().getInt("itemType");
        ArrayList<String> stringArrayList = requireArguments().getStringArrayList("answerInfoList");
        ArrayList<String> stringArrayList2 = requireArguments().getStringArrayList("qstFlowList");
        ArrayList<String> stringArrayList3 = requireArguments().getStringArrayList("microClassForScreenList");
        boolean z8 = requireArguments().getBoolean("isShowAnswer");
        ArrayList arrayList = this.f7793b;
        int i = 0;
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            int i8 = 0;
            while (i8 < size) {
                String str = stringArrayList.get(i8);
                i8++;
                arrayList.add(new C3841g().m2784c(str, new C5752a(MistakeDetail.AnswerListBean.class)));
            }
        }
        if (stringArrayList2 != null) {
            int size2 = stringArrayList2.size();
            int i9 = 0;
            while (i9 < size2) {
                String str2 = stringArrayList2.get(i9);
                i9++;
                this.f7794c.add(new C3841g().m2784c(str2, new C5752a(MistakeDetail.QstFlowBean.class)));
            }
        }
        if (stringArrayList3 != null) {
            int size3 = stringArrayList3.size();
            int i10 = 0;
            while (i10 < size3) {
                String str3 = stringArrayList3.get(i10);
                i10++;
                this.f7795d.add(new C3841g().m2784c(str3, new C5752a(MistakeDetail.QstMicroLessonBean.class)));
            }
        }
        boolean z9 = requireArguments().getBoolean("isGroup");
        String[] strArr = AbstractC5099d.f8033d;
        if (z9) {
            int size4 = arrayList.size();
            int i11 = 0;
            while (i11 < size4) {
                Object obj = arrayList.get(i11);
                i11++;
                MistakeDetail.AnswerListBean answerListBean = (MistakeDetail.AnswerListBean) obj;
                int itemType = answerListBean.getItemType();
                Integer numValueOf = Integer.valueOf(itemType);
                if (itemType == 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : this.f7797f;
                if (iIntValue == QuestionType.TYPE_SINGLE.getType() || iIntValue == QuestionType.TYPE_CLOZE.getType() || iIntValue == QuestionType.TYPE_MULTIPLE.getType() || iIntValue == QuestionType.TYPE_LISTEN.getType() || iIntValue == QuestionType.TYPE_SEVEN_CHOICES_FIVE.getType() || iIntValue == QuestionType.TYPE_JUDGE.getType()) {
                    m4342j(answerListBean, z8);
                } else if (iIntValue == QuestionType.TYPE_COMPREHENSION.getType()) {
                    if ((!answerListBean.getExamAnswers().isEmpty() && answerListBean.getExamAnswers().get(0).length() == 1 && AbstractC5802q.m5209v(strArr, answerListBean.getExamAnswers().get(0))) || ((!answerListBean.getExamComments().isEmpty() && answerListBean.getExamComments().get(0).length() == 1 && AbstractC5802q.m5209v(strArr, answerListBean.getExamComments().get(0))) || ((!answerListBean.getRevisingAnswers().isEmpty() && answerListBean.getRevisingAnswers().get(0).length() == 1 && AbstractC5802q.m5209v(strArr, answerListBean.getRevisingAnswers().get(0))) || (!answerListBean.getRevisingComments().isEmpty() && answerListBean.getRevisingComments().get(0).length() == 1 && AbstractC5802q.m5209v(strArr, answerListBean.getRevisingComments().get(0)))))) {
                        m4342j(answerListBean, z8);
                    } else {
                        m4340i(this, answerListBean);
                    }
                } else if (iIntValue == QuestionType.TYPE_UNKNOW.getType()) {
                    m4340i(this, answerListBean);
                } else {
                    m4340i(this, answerListBean);
                }
            }
            m4344l();
            return;
        }
        int i12 = this.f7797f;
        if (i12 == QuestionType.TYPE_SINGLE.getType() || i12 == QuestionType.TYPE_CLOZE.getType() || i12 == QuestionType.TYPE_MULTIPLE.getType() || i12 == QuestionType.TYPE_LISTEN.getType() || i12 == QuestionType.TYPE_SEVEN_CHOICES_FIVE.getType() || i12 == QuestionType.TYPE_JUDGE.getType()) {
            ArrayList arrayList2 = this.f7793b;
            int size5 = arrayList2.size();
            while (i < size5) {
                Object obj2 = arrayList2.get(i);
                i++;
                m4342j((MistakeDetail.AnswerListBean) obj2, z8);
            }
        } else if (i12 == QuestionType.TYPE_SUMMARY.getType() || i12 == QuestionType.TYPE_COMPOSITION.getType() || i12 == QuestionType.TYPE_BLANK.getType() || i12 == QuestionType.TYPE_MIX.getType()) {
            m4343k();
        } else if (i12 == QuestionType.TYPE_COMPREHENSION.getType()) {
            if (arrayList == null || !arrayList.isEmpty()) {
                int size6 = arrayList.size();
                int i13 = 0;
                while (i13 < size6) {
                    Object obj3 = arrayList.get(i13);
                    i13++;
                    MistakeDetail.AnswerListBean answerListBean2 = (MistakeDetail.AnswerListBean) obj3;
                    if ((!answerListBean2.getExamAnswers().isEmpty() && answerListBean2.getExamAnswers().get(0).length() == 1 && AbstractC5802q.m5209v(strArr, answerListBean2.getExamAnswers().get(0))) || ((!answerListBean2.getExamComments().isEmpty() && answerListBean2.getExamComments().get(0).length() == 1 && AbstractC5802q.m5209v(strArr, answerListBean2.getExamComments().get(0))) || ((!answerListBean2.getRevisingAnswers().isEmpty() && answerListBean2.getRevisingAnswers().get(0).length() == 1 && AbstractC5802q.m5209v(strArr, answerListBean2.getRevisingAnswers().get(0))) || (!answerListBean2.getRevisingComments().isEmpty() && answerListBean2.getRevisingComments().get(0).length() == 1 && AbstractC5802q.m5209v(strArr, answerListBean2.getRevisingComments().get(0)))))) {
                        ArrayList arrayList3 = this.f7793b;
                        int size7 = arrayList3.size();
                        while (i < size7) {
                            Object obj4 = arrayList3.get(i);
                            i++;
                            m4342j((MistakeDetail.AnswerListBean) obj4, z8);
                        }
                    }
                }
                m4343k();
            } else {
                m4343k();
            }
        } else if (i12 == QuestionType.TYPE_UNKNOW.getType()) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            if (((MistakeDetail.AnswerListBean) arrayList.get(0)).getExamAnswers().isEmpty()) {
                linearLayout.addView(LayoutInflater.from(getContext()).inflate(R.layout.item_answer_subjective, (ViewGroup) null));
            } else {
                ArrayList<String> examAnswers = ((MistakeDetail.AnswerListBean) arrayList.get(0)).getExamAnswers();
                int size8 = examAnswers.size();
                while (i < size8) {
                    String str4 = examAnswers.get(i);
                    i++;
                    String str5 = str4;
                    View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_answer_subjective, (ViewGroup) null);
                    View viewFindViewById2 = viewInflate.findViewById(R.id.tv_no_answer);
                    AbstractC5830k.m5329f(viewFindViewById2, "findViewById(...)");
                    View viewFindViewById3 = viewInflate.findViewById(R.id.iv_answer);
                    AbstractC5830k.m5329f(viewFindViewById3, "findViewById(...)");
                    ((TextView) viewFindViewById2).setVisibility(8);
                    ((C3412f) ComponentCallbacks2C3408b.m2363f(this).m2386l(str5).m6087h(R.mipmap.pic_error)).mo2374c(((C6446d) new C6446d().m6086g(AbstractC3085o.f1480b)).m6096r()).m2379z(new C6426j((ImageView) viewFindViewById3, viewInflate, this, str5));
                    linearLayout.addView(viewInflate);
                }
            }
            LinearLayout linearLayout2 = this.f7796e;
            if (linearLayout2 == null) {
                AbstractC5830k.m5339p("answerContent");
                throw null;
            }
            linearLayout2.addView(linearLayout);
        }
        m4344l();
    }

    /* renamed from: h */
    public final void m4341h(MistakeDetail.AnswerListBean answerListBean, ArrayList arrayList, ArrayList arrayList2, String str) {
        OriginalAnswerFragment originalAnswerFragment;
        String str2 = "";
        String str3 = (arrayList == null || arrayList.isEmpty()) ? "" : (String) arrayList.get(0);
        AbstractC5830k.m5327d(str3);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            str2 = (String) arrayList2.get(0);
        }
        String str4 = str2;
        AbstractC5830k.m5327d(str4);
        boolean z8 = (str4.length() <= 0 || AbstractC5855p.m5372F(str4, "corrected", false) || str4.equals(str3)) ? false : true;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams((int) getResources().getDimension(R.dimen.view_18), -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams());
        layoutParams.gravity = 16;
        textView.setLayoutParams(layoutParams);
        textView.setText(str + answerListBean.getIndex());
        textView.setTextSize(0, getResources().getDimension(R.dimen.text_7));
        linearLayout.addView(textView);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_answer_subjective, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_no_answer);
        AbstractC5830k.m5329f(viewFindViewById, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.iv_answer);
        AbstractC5830k.m5329f(viewFindViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.iv_comment);
        AbstractC5830k.m5329f(viewFindViewById3, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById3;
        if (str3.length() == 0 && (str4.length() == 0 || AbstractC5855p.m5372F(str4, "corrected", false))) {
            textView2.setVisibility(0);
            textView2.setText(getString(R.string.no_answer));
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
            originalAnswerFragment = this;
        } else {
            textView2.setVisibility(8);
            imageView.setVisibility(0);
            imageView2.setVisibility(z8 ? 0 : 8);
            ComponentCallbacks2C3408b.m2363f(this).m2386l(str3).m2379z(new C6424h(imageView));
            if (z8) {
                C3412f c3412fM2384j = ComponentCallbacks2C3408b.m2363f(this).m2384j();
                c3412fM2384j.f2234w = str4;
                c3412fM2384j.f2236y = true;
                c3412fM2384j.m2379z(new C6425i(imageView2));
            }
            originalAnswerFragment = this;
            viewInflate.setOnClickListener(new ViewOnClickListenerC6423g(originalAnswerFragment, str3, z8, str4, 0));
        }
        linearLayout.addView(viewInflate);
        LinearLayout linearLayout2 = originalAnswerFragment.f7796e;
        if (linearLayout2 != null) {
            linearLayout2.addView(linearLayout);
        } else {
            AbstractC5830k.m5339p("answerContent");
            throw null;
        }
    }

    /* renamed from: j */
    public final void m4342j(MistakeDetail.AnswerListBean answerListBean, boolean z8) {
        ArrayList<String> examAnswers = answerListBean.getExamAnswers();
        ArrayList<String> examComments = answerListBean.getExamComments();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams((int) getResources().getDimension(R.dimen.view_18), -1));
        textView.setGravity(16);
        textView.setText(String.valueOf(answerListBean.getIndex()));
        int i = 0;
        textView.setTextSize(0, getResources().getDimension(R.dimen.text_7));
        linearLayout.addView(textView);
        WrapLinearLayout wrapLinearLayout = new WrapLinearLayout(getContext());
        wrapLinearLayout.setGravity(1);
        wrapLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if (examAnswers.isEmpty()) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_answer, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R.id.text)).setText(getString(R.string.no_answer));
            wrapLinearLayout.addView(viewInflate);
        } else {
            boolean z9 = examAnswers.containsAll(examComments) && examComments.containsAll(examAnswers);
            int size = examAnswers.size();
            while (i < size) {
                String str = examAnswers.get(i);
                i++;
                View viewInflate2 = LayoutInflater.from(getContext()).inflate(R.layout.item_answer, (ViewGroup) null);
                ((TextView) viewInflate2.findViewById(R.id.text)).setText(str);
                if (z8) {
                    if (z9) {
                        ((TextView) viewInflate2.findViewById(R.id.text)).setActivated(true);
                    } else {
                        ((TextView) viewInflate2.findViewById(R.id.text)).setSelected(true);
                    }
                }
                wrapLinearLayout.addView(viewInflate2);
            }
        }
        linearLayout.addView(wrapLinearLayout);
        LinearLayout linearLayout2 = this.f7796e;
        if (linearLayout2 != null) {
            linearLayout2.addView(linearLayout);
        } else {
            AbstractC5830k.m5339p("answerContent");
            throw null;
        }
    }

    /* renamed from: k */
    public final void m4343k() {
        if (this.f7797f != QuestionType.TYPE_BLANK.getType()) {
            m4345m(null, "");
            return;
        }
        ArrayList arrayList = this.f7794c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MistakeDetail.QstFlowBean qstFlowBean = (MistakeDetail.QstFlowBean) obj;
            if (qstFlowBean.getType() == 0) {
                List<MistakeDetail.SubQuestionsBean> subQuestions = qstFlowBean.getSubQuestions();
                if (subQuestions != null) {
                    Iterator<T> it = subQuestions.iterator();
                    while (it.hasNext()) {
                        m4345m(((MistakeDetail.SubQuestionsBean) it.next()).getUuid(), qstFlowBean.getNumber() + ".");
                    }
                }
            } else if (qstFlowBean.getType() == 1) {
                m4345m(qstFlowBean.getUuid(), "");
            }
        }
    }

    /* renamed from: l */
    public final void m4344l() {
        ArrayList arrayList = this.f7795d;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            MistakeDetail.QstMicroLessonBean qstMicroLessonBean = (MistakeDetail.QstMicroLessonBean) it.next();
            View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.item_micro_lesson_screen, (ViewGroup) null);
            viewInflate.setOnClickListener(new ViewOnClickListenerC0015f(10, this, qstMicroLessonBean));
            LinearLayout linearLayout = this.f7796e;
            if (linearLayout != null) {
                linearLayout.addView(viewInflate);
            } else {
                AbstractC5830k.m5339p("answerContent");
                throw null;
            }
        }
    }

    /* renamed from: m */
    public final void m4345m(String str, String str2) {
        ArrayList<String> examAnswers;
        ArrayList<String> examComments;
        ArrayList arrayList = this.f7793b;
        int size = arrayList.size();
        boolean z8 = true;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MistakeDetail.AnswerListBean answerListBean = (MistakeDetail.AnswerListBean) obj;
            if ((str == null || str.equals(answerListBean.getUuid())) && (z8 || (this.f7797f != QuestionType.TYPE_SUMMARY.getType() && this.f7797f != QuestionType.TYPE_MIX.getType() && this.f7797f != QuestionType.TYPE_COMPREHENSION.getType()))) {
                if (this.f7797f == QuestionType.TYPE_SUMMARY.getType() || this.f7797f == QuestionType.TYPE_MIX.getType() || this.f7797f == QuestionType.TYPE_COMPREHENSION.getType()) {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = arrayList.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        Object obj2 = arrayList.get(i8);
                        i8++;
                        MistakeDetail.AnswerListBean answerListBean2 = (MistakeDetail.AnswerListBean) obj2;
                        ArrayList<String> examAnswers2 = answerListBean2.getExamAnswers();
                        if (examAnswers2 != null && !examAnswers2.isEmpty()) {
                            String str3 = answerListBean2.getExamAnswers().get(0);
                            AbstractC5830k.m5329f(str3, "get(...)");
                            if (AbstractC5855p.m5372F(str3, "http", false)) {
                                arrayList2.add(obj2);
                            }
                        }
                    }
                    examAnswers = !arrayList2.isEmpty() ? ((MistakeDetail.AnswerListBean) arrayList2.get(0)).getExamAnswers() : new ArrayList<>();
                    ArrayList arrayList3 = new ArrayList();
                    int size3 = arrayList.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj3 = arrayList.get(i9);
                        i9++;
                        MistakeDetail.AnswerListBean answerListBean3 = (MistakeDetail.AnswerListBean) obj3;
                        ArrayList<String> examComments2 = answerListBean3.getExamComments();
                        if (examComments2 != null && !examComments2.isEmpty()) {
                            String str4 = answerListBean3.getExamComments().get(0);
                            AbstractC5830k.m5329f(str4, "get(...)");
                            if (AbstractC5855p.m5372F(str4, "http", false)) {
                                arrayList3.add(obj3);
                            }
                        }
                    }
                    examComments = !arrayList3.isEmpty() ? ((MistakeDetail.AnswerListBean) arrayList3.get(0)).getExamComments() : new ArrayList<>();
                } else {
                    examAnswers = answerListBean.getExamAnswers();
                    examComments = answerListBean.getExamComments();
                }
                m4341h(answerListBean, examAnswers, examComments, str2);
                z8 = false;
            }
        }
    }
}
