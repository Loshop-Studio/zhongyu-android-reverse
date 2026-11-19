package com.zykj.mistake.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.google.gson.C3841g;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.SketchPlayerActivity;
import com.zykj.mistake.base.BaseFragment;
import com.zykj.mistake.databinding.FragmentMicroClassBinding;
import com.zykj.mistake.databinding.ItemMicroSessionsBinding;
import com.zykj.mistake.entity.resp.MistakeDetail;
import com.zykj.mistake.fragment.MicroClassFragment;
import io.reactivex.internal.operators.observable.C5707c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import p095k1.C5752a;
import p147r0.C6446d;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/mistake/fragment/MicroClassFragment;", "Lcom/zykj/mistake/base/BaseFragment;", "Lcom/zykj/mistake/databinding/FragmentMicroClassBinding;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMicroClassFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicroClassFragment.kt\ncom/zykj/mistake/fragment/MicroClassFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1869#2,2:178\n1869#2,2:180\n1869#2,2:182\n774#2:184\n865#2,2:185\n1869#2,2:187\n774#2:189\n865#2,2:190\n1869#2,2:192\n*S KotlinDebug\n*F\n+ 1 MicroClassFragment.kt\ncom/zykj/mistake/fragment/MicroClassFragment\n*L\n70#1:178,2\n75#1:180,2\n96#1:182,2\n123#1:184\n123#1:185,2\n127#1:187,2\n152#1:189\n152#1:190,2\n156#1:192,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MicroClassFragment extends BaseFragment<FragmentMicroClassBinding> {

    /* renamed from: b */
    public final ArrayList f7769b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f7770c = new ArrayList();

    /* renamed from: d */
    public LinearLayout f7771d;

    /* renamed from: e */
    public LinearLayout f7772e;

    /* renamed from: f */
    public LinearLayout f7773f;

    /* renamed from: g */
    public LinearLayout f7774g;

    /* renamed from: h */
    public LinearLayout f7775h;

    /* renamed from: i */
    public LinearLayout f7776i;

    @Override // com.zykj.mistake.base.BaseFragment
    /* renamed from: e */
    public final int mo3959e() {
        return R.layout.fragment_micro_class;
    }

    @Override // com.zykj.mistake.base.BaseFragment
    /* renamed from: g */
    public final void mo3961g(View view) {
        View viewFindViewById = view.findViewById(R.id.ll_answer);
        AbstractC5830k.m5329f(viewFindViewById, "findViewById(...)");
        this.f7771d = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ll_revised);
        AbstractC5830k.m5329f(viewFindViewById2, "findViewById(...)");
        this.f7772e = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.ll_one2one);
        AbstractC5830k.m5329f(viewFindViewById3, "findViewById(...)");
        this.f7773f = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.ll_screen);
        AbstractC5830k.m5329f(viewFindViewById4, "findViewById(...)");
        View viewFindViewById5 = view.findViewById(R.id.ll_answer_container);
        AbstractC5830k.m5329f(viewFindViewById5, "findViewById(...)");
        this.f7774g = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.ll_revised_container);
        AbstractC5830k.m5329f(viewFindViewById6, "findViewById(...)");
        this.f7775h = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.ll_one2one_container);
        AbstractC5830k.m5329f(viewFindViewById7, "findViewById(...)");
        this.f7776i = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.ll_screen_container);
        AbstractC5830k.m5329f(viewFindViewById8, "findViewById(...)");
        ArrayList<String> stringArrayList = requireArguments().getStringArrayList("microClassToQuestionList");
        ArrayList<String> stringArrayList2 = requireArguments().getStringArrayList("microClassToStudentList");
        ArrayList arrayList = this.f7769b;
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            int i = 0;
            while (i < size) {
                String str = stringArrayList.get(i);
                i++;
                arrayList.add(new C3841g().m2784c(str, new C5752a(MistakeDetail.QstMicroLessonBean.class)));
            }
        }
        ArrayList arrayList2 = this.f7770c;
        if (stringArrayList2 != null) {
            int size2 = stringArrayList2.size();
            int i8 = 0;
            while (i8 < size2) {
                String str2 = stringArrayList2.get(i8);
                i8++;
                arrayList2.add(new C3841g().m2784c(str2, new C5752a(MistakeDetail.QstMicroLessonBean.class)));
            }
        }
        if (arrayList.isEmpty()) {
            LinearLayout linearLayout = this.f7771d;
            if (linearLayout == null) {
                AbstractC5830k.m5339p("answerContent");
                throw null;
            }
            linearLayout.setVisibility(8);
        } else {
            int size3 = arrayList.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj = arrayList.get(i9);
                i9++;
                MistakeDetail.QstMicroLessonBean qstMicroLessonBean = (MistakeDetail.QstMicroLessonBean) obj;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
                LinearLayout linearLayout2 = this.f7774g;
                if (linearLayout2 == null) {
                    AbstractC5830k.m5339p("answerContainer");
                    throw null;
                }
                ItemMicroSessionsBinding itemMicroSessionsBindingM3980a = ItemMicroSessionsBinding.m3980a(layoutInflaterFrom, linearLayout2);
                AbstractC5830k.m5329f(itemMicroSessionsBindingM3980a, "inflate(...)");
                ComponentCallbacks2C3408b.m2363f(this).m2386l(qstMicroLessonBean.getSnapshot()).mo2374c(new C6446d().m6090l(R.mipmap.ic_default_micro)).m2378y(itemMicroSessionsBindingM3980a.f6165a);
                itemMicroSessionsBindingM3980a.f6166b.setText(qstMicroLessonBean.getName());
                final String address = qstMicroLessonBean.getAddress();
                final int i10 = 1;
                itemMicroSessionsBindingM3980a.getRoot().setOnClickListener(new View.OnClickListener(this) { // from class: q4.a

                    /* renamed from: b */
                    public final /* synthetic */ MicroClassFragment f10527b;

                    {
                        this.f10527b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11 = i10;
                        String str3 = address;
                        MicroClassFragment microClassFragment = this.f10527b;
                        switch (i11) {
                            case 0:
                                int i12 = SketchPlayerActivity.f5871g;
                                C5707c.m5080o(microClassFragment.getActivity(), str3, null, null);
                                break;
                            case 1:
                                Bundle arguments = microClassFragment.getArguments();
                                Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("examId")) : null;
                                Bundle arguments2 = microClassFragment.getArguments();
                                Integer numValueOf2 = arguments2 != null ? Integer.valueOf(arguments2.getInt("questionId")) : null;
                                int i13 = SketchPlayerActivity.f5871g;
                                C5707c.m5080o(microClassFragment.getActivity(), str3, numValueOf, numValueOf2);
                                break;
                            default:
                                int i14 = SketchPlayerActivity.f5871g;
                                C5707c.m5080o(microClassFragment.getActivity(), str3, null, null);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout3 = this.f7774g;
                if (linearLayout3 == null) {
                    AbstractC5830k.m5339p("answerContainer");
                    throw null;
                }
                linearLayout3.addView(itemMicroSessionsBindingM3980a.getRoot());
            }
            LinearLayout linearLayout4 = this.f7771d;
            if (linearLayout4 == null) {
                AbstractC5830k.m5339p("answerContent");
                throw null;
            }
            linearLayout4.setVisibility(0);
        }
        ArrayList arrayList3 = new ArrayList();
        int size4 = arrayList2.size();
        int i11 = 0;
        while (i11 < size4) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            if (AbstractC5830k.m5325b(((MistakeDetail.QstMicroLessonBean) obj2).getIsRevising(), Boolean.FALSE)) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            LinearLayout linearLayout5 = this.f7773f;
            if (linearLayout5 == null) {
                AbstractC5830k.m5339p("one2oneContent");
                throw null;
            }
            linearLayout5.setVisibility(8);
        } else {
            int size5 = arrayList3.size();
            int i12 = 0;
            while (i12 < size5) {
                Object obj3 = arrayList3.get(i12);
                i12++;
                MistakeDetail.QstMicroLessonBean qstMicroLessonBean2 = (MistakeDetail.QstMicroLessonBean) obj3;
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(requireContext());
                LinearLayout linearLayout6 = this.f7776i;
                if (linearLayout6 == null) {
                    AbstractC5830k.m5339p("one2oneContainer");
                    throw null;
                }
                ItemMicroSessionsBinding itemMicroSessionsBindingM3980a2 = ItemMicroSessionsBinding.m3980a(layoutInflaterFrom2, linearLayout6);
                AbstractC5830k.m5329f(itemMicroSessionsBindingM3980a2, "inflate(...)");
                ComponentCallbacks2C3408b.m2363f(this).m2386l(qstMicroLessonBean2.getSnapshot()).mo2374c(new C6446d().m6090l(R.mipmap.ic_default_micro)).m2378y(itemMicroSessionsBindingM3980a2.f6165a);
                itemMicroSessionsBindingM3980a2.f6166b.setText(qstMicroLessonBean2.getName());
                final String address2 = qstMicroLessonBean2.getAddress();
                final int i13 = 0;
                itemMicroSessionsBindingM3980a2.getRoot().setOnClickListener(new View.OnClickListener(this) { // from class: q4.a

                    /* renamed from: b */
                    public final /* synthetic */ MicroClassFragment f10527b;

                    {
                        this.f10527b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i112 = i13;
                        String str3 = address2;
                        MicroClassFragment microClassFragment = this.f10527b;
                        switch (i112) {
                            case 0:
                                int i122 = SketchPlayerActivity.f5871g;
                                C5707c.m5080o(microClassFragment.getActivity(), str3, null, null);
                                break;
                            case 1:
                                Bundle arguments = microClassFragment.getArguments();
                                Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("examId")) : null;
                                Bundle arguments2 = microClassFragment.getArguments();
                                Integer numValueOf2 = arguments2 != null ? Integer.valueOf(arguments2.getInt("questionId")) : null;
                                int i132 = SketchPlayerActivity.f5871g;
                                C5707c.m5080o(microClassFragment.getActivity(), str3, numValueOf, numValueOf2);
                                break;
                            default:
                                int i14 = SketchPlayerActivity.f5871g;
                                C5707c.m5080o(microClassFragment.getActivity(), str3, null, null);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout7 = this.f7776i;
                if (linearLayout7 == null) {
                    AbstractC5830k.m5339p("one2oneContainer");
                    throw null;
                }
                linearLayout7.addView(itemMicroSessionsBindingM3980a2.getRoot());
            }
            LinearLayout linearLayout8 = this.f7773f;
            if (linearLayout8 == null) {
                AbstractC5830k.m5339p("one2oneContent");
                throw null;
            }
            linearLayout8.setVisibility(0);
        }
        ArrayList arrayList4 = new ArrayList();
        int size6 = arrayList2.size();
        int i14 = 0;
        while (i14 < size6) {
            Object obj4 = arrayList2.get(i14);
            i14++;
            if (AbstractC5830k.m5325b(((MistakeDetail.QstMicroLessonBean) obj4).getIsRevising(), Boolean.TRUE)) {
                arrayList4.add(obj4);
            }
        }
        if (arrayList4.isEmpty()) {
            LinearLayout linearLayout9 = this.f7772e;
            if (linearLayout9 != null) {
                linearLayout9.setVisibility(8);
                return;
            } else {
                AbstractC5830k.m5339p("revisedContent");
                throw null;
            }
        }
        int size7 = arrayList4.size();
        int i15 = 0;
        while (i15 < size7) {
            Object obj5 = arrayList4.get(i15);
            i15++;
            MistakeDetail.QstMicroLessonBean qstMicroLessonBean3 = (MistakeDetail.QstMicroLessonBean) obj5;
            LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(requireContext());
            LinearLayout linearLayout10 = this.f7775h;
            if (linearLayout10 == null) {
                AbstractC5830k.m5339p("revisedContainer");
                throw null;
            }
            ItemMicroSessionsBinding itemMicroSessionsBindingM3980a3 = ItemMicroSessionsBinding.m3980a(layoutInflaterFrom3, linearLayout10);
            AbstractC5830k.m5329f(itemMicroSessionsBindingM3980a3, "inflate(...)");
            ComponentCallbacks2C3408b.m2363f(this).m2386l(qstMicroLessonBean3.getSnapshot()).mo2374c(new C6446d().m6090l(R.mipmap.ic_default_micro)).m2378y(itemMicroSessionsBindingM3980a3.f6165a);
            itemMicroSessionsBindingM3980a3.f6166b.setText(qstMicroLessonBean3.getName());
            final String address3 = qstMicroLessonBean3.getAddress();
            final int i16 = 2;
            itemMicroSessionsBindingM3980a3.getRoot().setOnClickListener(new View.OnClickListener(this) { // from class: q4.a

                /* renamed from: b */
                public final /* synthetic */ MicroClassFragment f10527b;

                {
                    this.f10527b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i112 = i16;
                    String str3 = address3;
                    MicroClassFragment microClassFragment = this.f10527b;
                    switch (i112) {
                        case 0:
                            int i122 = SketchPlayerActivity.f5871g;
                            C5707c.m5080o(microClassFragment.getActivity(), str3, null, null);
                            break;
                        case 1:
                            Bundle arguments = microClassFragment.getArguments();
                            Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("examId")) : null;
                            Bundle arguments2 = microClassFragment.getArguments();
                            Integer numValueOf2 = arguments2 != null ? Integer.valueOf(arguments2.getInt("questionId")) : null;
                            int i132 = SketchPlayerActivity.f5871g;
                            C5707c.m5080o(microClassFragment.getActivity(), str3, numValueOf, numValueOf2);
                            break;
                        default:
                            int i142 = SketchPlayerActivity.f5871g;
                            C5707c.m5080o(microClassFragment.getActivity(), str3, null, null);
                            break;
                    }
                }
            });
            LinearLayout linearLayout11 = this.f7775h;
            if (linearLayout11 == null) {
                AbstractC5830k.m5339p("revisedContainer");
                throw null;
            }
            linearLayout11.addView(itemMicroSessionsBindingM3980a3.getRoot());
        }
        LinearLayout linearLayout12 = this.f7772e;
        if (linearLayout12 != null) {
            linearLayout12.setVisibility(0);
        } else {
            AbstractC5830k.m5339p("revisedContent");
            throw null;
        }
    }
}
