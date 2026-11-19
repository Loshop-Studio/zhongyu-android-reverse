package com.zykj.study.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.exercise.ChoiceBean;
import com.zykj.study.bean.exercise.ChoiceStatus;
import com.zykj.study.databinding.ViewMultipleChoiceViewerBinding;
import com.zykj.study.view.MultipleChoiceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8811w;
import p212p7.InterfaceC9760a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MultipleChoiceView extends RecyclerView {

    /* renamed from: a */
    public final MultipleChoiceAdapter f13770a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class JudgingStatus {

        /* renamed from: a */
        public static final JudgingStatus f13771a = new JudgingStatus("EDIT", 0);

        /* renamed from: b */
        public static final JudgingStatus f13772b = new JudgingStatus("ONLY_ERROR_WITH_SELECTED", 1);

        /* renamed from: c */
        public static final JudgingStatus f13773c = new JudgingStatus("ONLY_RIGHT_WITH_SELECTED", 2);

        /* renamed from: d */
        public static final JudgingStatus f13774d = new JudgingStatus("RIGHT_OR_ERROR_WITH_RIGHT_OPTION", 3);

        /* renamed from: e */
        public static final JudgingStatus f13775e = new JudgingStatus("RIGHT_WITH_RIGHT_OPTION", 4);

        /* renamed from: f */
        public static final JudgingStatus f13776f = new JudgingStatus("RIGHT_OR_ERROR_OR_NULL", 5);

        /* renamed from: g */
        public static final /* synthetic */ JudgingStatus[] f13777g;

        /* renamed from: h */
        public static final /* synthetic */ InterfaceC9760a f13778h;

        static {
            JudgingStatus[] judgingStatusArrM11940a = m11940a();
            f13777g = judgingStatusArrM11940a;
            f13778h = AbstractC9108a.m16085a(judgingStatusArrM11940a);
        }

        public JudgingStatus(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ JudgingStatus[] m11940a() {
            return new JudgingStatus[]{f13771a, f13772b, f13773c, f13774d, f13775e, f13776f};
        }

        public static JudgingStatus valueOf(String str) {
            return (JudgingStatus) Enum.valueOf(JudgingStatus.class, str);
        }

        public static JudgingStatus[] values() {
            return (JudgingStatus[]) f13777g.clone();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class MultipleChoiceAdapter extends RecyclerView.Adapter<ViewHolderViewer> {

        /* renamed from: a */
        public final List f13779a = new ArrayList();

        /* renamed from: b */
        public final List f13780b = new ArrayList();

        /* renamed from: c */
        public final List f13781c = new ArrayList();

        /* renamed from: d */
        public JudgingStatus f13782d = JudgingStatus.f13772b;

        /* renamed from: e */
        public InterfaceC10574p f13783e = new InterfaceC10574p() { // from class: f5.r
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return MultipleChoiceView.MultipleChoiceAdapter.m11945i((SelectModel) obj, ((Integer) obj2).intValue());
            }
        };

        @StabilityInferred(parameters = 0)
        public static final class ViewHolderViewer extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public final ViewMultipleChoiceViewerBinding f13784a;

            /* renamed from: com.zykj.study.view.MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer$a */
            public static final /* synthetic */ class C8139a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f13785a;

                static {
                    int[] iArr = new int[JudgingStatus.values().length];
                    try {
                        iArr[JudgingStatus.f13771a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[JudgingStatus.f13772b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[JudgingStatus.f13773c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[JudgingStatus.f13774d.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[JudgingStatus.f13775e.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[JudgingStatus.f13776f.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    f13785a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewHolderViewer(ViewMultipleChoiceViewerBinding binding) {
                super(binding.getRoot());
                AbstractC9133u.m16133g(binding, "binding");
                this.f13784a = binding;
            }

            /* renamed from: a */
            public final void m11955a(List answerList, SelectModel option, JudgingStatus judgingStatus, List rightList, View.OnClickListener createClickListener) {
                ChoiceBean choiceBean;
                ChoiceBean choiceBean2;
                AbstractC9133u.m16133g(answerList, "answerList");
                AbstractC9133u.m16133g(option, "option");
                AbstractC9133u.m16133g(judgingStatus, "judgingStatus");
                AbstractC9133u.m16133g(rightList, "rightList");
                AbstractC9133u.m16133g(createClickListener, "createClickListener");
                ViewMultipleChoiceViewerBinding viewMultipleChoiceViewerBinding = this.f13784a;
                viewMultipleChoiceViewerBinding.tvTitle.setText((CharSequence) option.getData());
                switch (C8139a.f13785a[judgingStatus.ordinal()]) {
                    case 1:
                        if (!option.isSelectModel()) {
                            choiceBean = new ChoiceBean(ChoiceStatus.CUSTOM);
                            break;
                        } else {
                            choiceBean = new ChoiceBean(ChoiceStatus.SELECTED);
                            break;
                        }
                    case 2:
                        if (!option.isSelectModel()) {
                            choiceBean = new ChoiceBean(ChoiceStatus.CUSTOM);
                            break;
                        } else {
                            choiceBean = new ChoiceBean(ChoiceStatus.ERROR);
                            break;
                        }
                    case 3:
                        if (!option.isSelectModel()) {
                            choiceBean = new ChoiceBean(ChoiceStatus.CUSTOM);
                            break;
                        } else {
                            choiceBean = new ChoiceBean(ChoiceStatus.RIGHT);
                            break;
                        }
                    case 4:
                        if (!rightList.contains(option.getData())) {
                            choiceBean = new ChoiceBean(ChoiceStatus.ERROR);
                            break;
                        } else {
                            choiceBean = new ChoiceBean(ChoiceStatus.RIGHT);
                            break;
                        }
                    case 5:
                        if (AbstractC8778f0.m14527D0(rightList, answerList).isEmpty() && AbstractC8778f0.m14527D0(answerList, rightList).isEmpty()) {
                            choiceBean2 = new ChoiceBean(answerList.contains(option.getData()) ? ChoiceStatus.RIGHT : ChoiceStatus.CUSTOM);
                        } else {
                            choiceBean2 = new ChoiceBean(answerList.contains(option.getData()) ? ChoiceStatus.ERROR : ChoiceStatus.CUSTOM);
                        }
                        choiceBean = choiceBean2;
                        break;
                    case 6:
                        if (!answerList.contains(option.getData())) {
                            choiceBean = new ChoiceBean(ChoiceStatus.NULL);
                            break;
                        } else {
                            choiceBean = new ChoiceBean(rightList.contains(option.getData()) ? ChoiceStatus.RIGHT : ChoiceStatus.ERROR);
                            break;
                        }
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                viewMultipleChoiceViewerBinding.setEntity(choiceBean);
                viewMultipleChoiceViewerBinding.tvTitle.setOnClickListener(createClickListener);
                viewMultipleChoiceViewerBinding.executePendingBindings();
            }
        }

        /* renamed from: f */
        private final View.OnClickListener m11943f(final SelectModel selectModel, final int i10) {
            return new View.OnClickListener() { // from class: f5.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MultipleChoiceView.MultipleChoiceAdapter.m11944g(this.f16037a, selectModel, i10, view);
                }
            };
        }

        /* renamed from: g */
        public static final void m11944g(MultipleChoiceAdapter multipleChoiceAdapter, SelectModel selectModel, int i10, View view) {
            if (multipleChoiceAdapter.f13782d == JudgingStatus.f13771a) {
                selectModel.setSelectModel(!selectModel.isSelectModel());
                multipleChoiceAdapter.notifyItemChanged(i10);
            }
            multipleChoiceAdapter.f13783e.invoke(selectModel, Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final C8736p m11945i(SelectModel selectModel, int i10) {
            AbstractC9133u.m16133g(selectModel, "<unused var>");
            return C8736p.f16368a;
        }

        /* renamed from: e */
        public final void m11946e() {
            Iterator it = this.f13779a.iterator();
            while (it.hasNext()) {
                ((SelectModel) it.next()).setSelectModel(false);
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f13779a.size();
        }

        /* renamed from: h */
        public final List m11947h() {
            List list = this.f13779a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((SelectModel) obj).isSelectModel()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((SelectModel) it.next()).getData());
            }
            return arrayList2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(ViewHolderViewer holder, int i10) {
            AbstractC9133u.m16133g(holder, "holder");
            SelectModel selectModel = (SelectModel) this.f13779a.get(i10);
            holder.m11955a(this.f13780b, selectModel, this.f13782d, this.f13781c, m11943f(selectModel, i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public ViewHolderViewer onCreateViewHolder(ViewGroup parent, int i10) {
            AbstractC9133u.m16133g(parent, "parent");
            ViewMultipleChoiceViewerBinding viewMultipleChoiceViewerBindingInflate = ViewMultipleChoiceViewerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC9133u.m16132f(viewMultipleChoiceViewerBindingInflate, "inflate(...)");
            return new ViewHolderViewer(viewMultipleChoiceViewerBindingInflate);
        }

        /* renamed from: l */
        public final void m11950l(InterfaceC10574p clickListener) {
            AbstractC9133u.m16133g(clickListener, "clickListener");
            this.f13783e = clickListener;
        }

        /* renamed from: m */
        public final void m11951m(JudgingStatus status) {
            AbstractC9133u.m16133g(status, "status");
            this.f13782d = status;
            notifyDataSetChanged();
        }

        /* renamed from: n */
        public final void m11952n(List list) {
            AbstractC9133u.m16133g(list, "list");
            this.f13780b.clear();
            this.f13780b.addAll(list);
            for (SelectModel selectModel : this.f13779a) {
                selectModel.setSelectModel(list.contains(selectModel.getData()));
            }
        }

        /* renamed from: o */
        public final void m11953o(List list) {
            AbstractC9133u.m16133g(list, "list");
            this.f13779a.clear();
            List list2 = this.f13779a;
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                arrayList.add(new SelectModel(this.f13780b.contains(str), str));
            }
            list2.addAll(arrayList);
        }

        /* renamed from: p */
        public final void m11954p(List list) {
            AbstractC9133u.m16133g(list, "list");
            this.f13781c.clear();
            this.f13781c.addAll(list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipleChoiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        MultipleChoiceAdapter multipleChoiceAdapter = new MultipleChoiceAdapter();
        this.f13770a = multipleChoiceAdapter;
        setAdapter(multipleChoiceAdapter);
    }

    /* renamed from: b */
    public final void m11938b() {
        this.f13770a.m11946e();
    }

    /* renamed from: c */
    public final List m11939c() {
        return this.f13770a.m11947h();
    }

    public final void setAnswerList(List<String> answer) {
        AbstractC9133u.m16133g(answer, "answer");
        this.f13770a.m11952n(answer);
    }

    public final void setItemClickListener(InterfaceC10574p clickListener) {
        AbstractC9133u.m16133g(clickListener, "clickListener");
        this.f13770a.m11950l(clickListener);
    }

    public final void setJudgingStatus(JudgingStatus status) {
        AbstractC9133u.m16133g(status, "status");
        this.f13770a.m11951m(status);
        this.f13770a.notifyDataSetChanged();
    }

    public final void setOptionList(List<String> list) {
        AbstractC9133u.m16133g(list, "list");
        this.f13770a.m11953o(list);
        this.f13770a.notifyDataSetChanged();
    }

    public final void setRightOptionList(List<String> answer) {
        AbstractC9133u.m16133g(answer, "answer");
        this.f13770a.m11954p(answer);
    }
}
