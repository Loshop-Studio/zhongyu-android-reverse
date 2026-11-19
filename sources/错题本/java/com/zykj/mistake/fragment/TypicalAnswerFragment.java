package com.zykj.mistake.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.google.gson.C3841g;
import com.zykj.mistake.R;
import com.zykj.mistake.base.BaseFragment;
import com.zykj.mistake.databinding.FragmentTypicalAnswerBinding;
import com.zykj.mistake.databinding.ItemMicroSessionsBinding;
import com.zykj.mistake.dialog.AnswerDialogFragment;
import com.zykj.mistake.entity.resp.MistakeDetail;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import p095k1.C5752a;
import p144q4.ViewOnClickListenerC6429m;
import p147r0.C6446d;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/mistake/fragment/TypicalAnswerFragment;", "Lcom/zykj/mistake/base/BaseFragment;", "Lcom/zykj/mistake/databinding/FragmentTypicalAnswerBinding;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTypicalAnswerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypicalAnswerFragment.kt\ncom/zykj/mistake/fragment/TypicalAnswerFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n1869#2,2:155\n1869#2,2:157\n1869#2,2:159\n1869#2,2:161\n*S KotlinDebug\n*F\n+ 1 TypicalAnswerFragment.kt\ncom/zykj/mistake/fragment/TypicalAnswerFragment\n*L\n54#1:155,2\n59#1:157,2\n77#1:159,2\n110#1:161,2\n*E\n"})
/* loaded from: classes3.dex */
public final class TypicalAnswerFragment extends BaseFragment<FragmentTypicalAnswerBinding> {

    /* renamed from: b */
    public final ArrayList f7803b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f7804c = new ArrayList();

    /* renamed from: d */
    public LinearLayout f7805d;

    /* renamed from: e */
    public LinearLayout f7806e;

    /* renamed from: f */
    public LinearLayout f7807f;

    /* renamed from: g */
    public LinearLayout f7808g;

    @Override // com.zykj.mistake.base.BaseFragment
    /* renamed from: e */
    public final int mo3959e() {
        return R.layout.fragment_typical_answer;
    }

    @Override // com.zykj.mistake.base.BaseFragment
    /* renamed from: g */
    public final void mo3961g(View view) throws Throwable {
        Throwable th;
        View viewFindViewById = view.findViewById(R.id.ll_right);
        AbstractC5830k.m5329f(viewFindViewById, "findViewById(...)");
        this.f7805d = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ll_wrong);
        AbstractC5830k.m5329f(viewFindViewById2, "findViewById(...)");
        this.f7806e = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.ll_right_container);
        AbstractC5830k.m5329f(viewFindViewById3, "findViewById(...)");
        this.f7807f = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.ll_wrong_container);
        AbstractC5830k.m5329f(viewFindViewById4, "findViewById(...)");
        this.f7808g = (LinearLayout) viewFindViewById4;
        ArrayList<String> stringArrayList = requireArguments().getStringArrayList("typicalRightAnswers");
        ArrayList<String> stringArrayList2 = requireArguments().getStringArrayList("typicalErrorAnswers");
        ArrayList arrayList = this.f7803b;
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            int i = 0;
            while (i < size) {
                String str = stringArrayList.get(i);
                i++;
                arrayList.add(new C3841g().m2784c(str, new C5752a(MistakeDetail.QstAnswerBean.class)));
            }
        }
        ArrayList arrayList2 = this.f7804c;
        if (stringArrayList2 != null) {
            int size2 = stringArrayList2.size();
            int i8 = 0;
            while (i8 < size2) {
                String str2 = stringArrayList2.get(i8);
                i8++;
                arrayList2.add(new C3841g().m2784c(str2, new C5752a(MistakeDetail.QstAnswerBean.class)));
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            th = null;
            LinearLayout linearLayout = this.f7805d;
            if (linearLayout == null) {
                AbstractC5830k.m5339p("rightContent");
                throw null;
            }
            linearLayout.setVisibility(8);
        } else {
            int size3 = arrayList.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj = arrayList.get(i9);
                i9++;
                MistakeDetail.QstAnswerBean qstAnswerBean = (MistakeDetail.QstAnswerBean) obj;
                ArrayList<String> answers = qstAnswerBean.getAnswers();
                ArrayList<String> comments = qstAnswerBean.getComments();
                if (answers != null && !answers.isEmpty()) {
                    int size4 = answers.size();
                    for (int i10 = 0; i10 < size4; i10++) {
                        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
                        LinearLayout linearLayout2 = this.f7807f;
                        if (linearLayout2 == null) {
                            AbstractC5830k.m5339p("rightContainer");
                            throw null;
                        }
                        ItemMicroSessionsBinding itemMicroSessionsBindingM3980a = ItemMicroSessionsBinding.m3980a(layoutInflaterFrom, linearLayout2);
                        AbstractC5830k.m5329f(itemMicroSessionsBindingM3980a, "inflate(...)");
                        ComponentCallbacks2C3408b.m2363f(this).m2386l(answers.get(i10)).mo2374c(new C6446d().m6090l(R.mipmap.ic_default_micro)).m2378y(itemMicroSessionsBindingM3980a.f6165a);
                        itemMicroSessionsBindingM3980a.f6166b.setText(qstAnswerBean.getFullname());
                        itemMicroSessionsBindingM3980a.getRoot().setOnClickListener(new ViewOnClickListenerC6429m(this, answers, i10, comments));
                        LinearLayout linearLayout3 = this.f7807f;
                        if (linearLayout3 == null) {
                            AbstractC5830k.m5339p("rightContainer");
                            throw null;
                        }
                        linearLayout3.addView(itemMicroSessionsBindingM3980a.getRoot());
                    }
                }
            }
            th = null;
            LinearLayout linearLayout4 = this.f7805d;
            if (linearLayout4 == null) {
                AbstractC5830k.m5339p("rightContent");
                throw null;
            }
            linearLayout4.setVisibility(0);
        }
        if (arrayList2 == null || arrayList2.isEmpty()) {
            LinearLayout linearLayout5 = this.f7806e;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
                return;
            } else {
                AbstractC5830k.m5339p("wrongContent");
                throw th;
            }
        }
        int size5 = arrayList2.size();
        int i11 = 0;
        while (i11 < size5) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            MistakeDetail.QstAnswerBean qstAnswerBean2 = (MistakeDetail.QstAnswerBean) obj2;
            ArrayList<String> answers2 = qstAnswerBean2.getAnswers();
            ArrayList<String> comments2 = qstAnswerBean2.getComments();
            if (answers2 != null && !answers2.isEmpty()) {
                int size6 = answers2.size();
                for (int i12 = 0; i12 < size6; i12++) {
                    LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(requireContext());
                    LinearLayout linearLayout6 = this.f7808g;
                    if (linearLayout6 == null) {
                        AbstractC5830k.m5339p("wrongContainer");
                        throw th;
                    }
                    ItemMicroSessionsBinding itemMicroSessionsBindingM3980a2 = ItemMicroSessionsBinding.m3980a(layoutInflaterFrom2, linearLayout6);
                    AbstractC5830k.m5329f(itemMicroSessionsBindingM3980a2, "inflate(...)");
                    ComponentCallbacks2C3408b.m2363f(this).m2386l(answers2.get(i12)).mo2374c(new C6446d().m6090l(R.mipmap.ic_default_micro)).m2378y(itemMicroSessionsBindingM3980a2.f6165a);
                    itemMicroSessionsBindingM3980a2.f6166b.setText(qstAnswerBean2.getFullname());
                    itemMicroSessionsBindingM3980a2.getRoot().setOnClickListener(new ViewOnClickListenerC6429m(i12, comments2, this, answers2));
                    LinearLayout linearLayout7 = this.f7808g;
                    if (linearLayout7 == null) {
                        AbstractC5830k.m5339p("wrongContainer");
                        throw th;
                    }
                    linearLayout7.addView(itemMicroSessionsBindingM3980a2.getRoot());
                }
            }
        }
        LinearLayout linearLayout8 = this.f7806e;
        if (linearLayout8 == null) {
            AbstractC5830k.m5339p("wrongContent");
            throw th;
        }
        linearLayout8.setVisibility(0);
    }

    /* renamed from: h */
    public final void m4352h(String str, String str2) {
        AnswerDialogFragment answerDialogFragment = new AnswerDialogFragment();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        AbstractC5830k.m5329f(fragmentActivityRequireActivity, "requireActivity(...)");
        answerDialogFragment.m3986l(fragmentActivityRequireActivity, str, str2, (str2 == null || str2.length() == 0 || str2.equals(str)) ? false : true);
    }
}
