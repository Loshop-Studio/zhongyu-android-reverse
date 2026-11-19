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
import com.zykj.study.databinding.ViewMultipleChoiceAnimationViewerBinding;
import com.zykj.study.view.MultipleChoiceAnimationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MultipleChoiceAnimationView extends RecyclerView {

    /* renamed from: a */
    public final MultipleChoiceAnimationAdapter f13764a;

    @StabilityInferred(parameters = 0)
    public static final class MultipleChoiceAnimationAdapter extends RecyclerView.Adapter<ViewHolderViewer> {

        /* renamed from: a */
        public final List f13765a = new ArrayList();

        /* renamed from: b */
        public final List f13766b = new ArrayList();

        /* renamed from: c */
        public final List f13767c = new ArrayList();

        /* renamed from: d */
        public InterfaceC10574p f13768d = new InterfaceC10574p() { // from class: f5.p
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return MultipleChoiceAnimationView.MultipleChoiceAnimationAdapter.m11927h((SelectModel) obj, ((Integer) obj2).intValue());
            }
        };

        @StabilityInferred(parameters = 0)
        public static final class ViewHolderViewer extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public final ViewMultipleChoiceAnimationViewerBinding f13769a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewHolderViewer(ViewMultipleChoiceAnimationViewerBinding binding) {
                super(binding.getRoot());
                AbstractC9133u.m16133g(binding, "binding");
                this.f13769a = binding;
            }

            /* renamed from: a */
            public final void m11937a(List answerList, SelectModel option, List rightList, View.OnClickListener createClickListener) {
                ChoiceBean choiceBean;
                AbstractC9133u.m16133g(answerList, "answerList");
                AbstractC9133u.m16133g(option, "option");
                AbstractC9133u.m16133g(rightList, "rightList");
                AbstractC9133u.m16133g(createClickListener, "createClickListener");
                ViewMultipleChoiceAnimationViewerBinding viewMultipleChoiceAnimationViewerBinding = this.f13769a;
                viewMultipleChoiceAnimationViewerBinding.setText((String) option.getData());
                if (answerList.contains(option.getData())) {
                    choiceBean = new ChoiceBean(rightList.contains(option.getData()) ? ChoiceStatus.RIGHT : ChoiceStatus.ERROR);
                } else {
                    choiceBean = new ChoiceBean(ChoiceStatus.NULL);
                }
                viewMultipleChoiceAnimationViewerBinding.setEntity(choiceBean);
                viewMultipleChoiceAnimationViewerBinding.setIsSelected(option.isSelectModel());
                viewMultipleChoiceAnimationViewerBinding.setClickListener(createClickListener);
                viewMultipleChoiceAnimationViewerBinding.executePendingBindings();
            }
        }

        /* renamed from: g */
        public static final void m11926g(MultipleChoiceAnimationAdapter multipleChoiceAnimationAdapter, SelectModel selectModel, int i10, View view) {
            Iterator it = multipleChoiceAnimationAdapter.f13765a.iterator();
            while (it.hasNext()) {
                ((SelectModel) it.next()).setSelectModel(false);
            }
            selectModel.setSelectModel(true);
            multipleChoiceAnimationAdapter.notifyDataSetChanged();
            multipleChoiceAnimationAdapter.f13768d.invoke(selectModel, Integer.valueOf(i10));
        }

        /* renamed from: h */
        public static final C8736p m11927h(SelectModel selectModel, int i10) {
            AbstractC9133u.m16133g(selectModel, "<unused var>");
            return C8736p.f16368a;
        }

        /* renamed from: e */
        public final void m11928e() {
            Iterator it = this.f13765a.iterator();
            while (it.hasNext()) {
                ((SelectModel) it.next()).setSelectModel(false);
            }
            notifyDataSetChanged();
        }

        /* renamed from: f */
        public final View.OnClickListener m11929f(final SelectModel selectModel, final int i10) {
            return new View.OnClickListener() { // from class: f5.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MultipleChoiceAnimationView.MultipleChoiceAnimationAdapter.m11926g(this.f16034a, selectModel, i10, view);
                }
            };
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f13765a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(ViewHolderViewer holder, int i10) {
            AbstractC9133u.m16133g(holder, "holder");
            SelectModel selectModel = (SelectModel) this.f13765a.get(i10);
            holder.m11937a(this.f13766b, selectModel, this.f13767c, m11929f(selectModel, i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public ViewHolderViewer onCreateViewHolder(ViewGroup parent, int i10) {
            AbstractC9133u.m16133g(parent, "parent");
            ViewMultipleChoiceAnimationViewerBinding viewMultipleChoiceAnimationViewerBindingInflate = ViewMultipleChoiceAnimationViewerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC9133u.m16132f(viewMultipleChoiceAnimationViewerBindingInflate, "inflate(...)");
            return new ViewHolderViewer(viewMultipleChoiceAnimationViewerBindingInflate);
        }

        /* renamed from: k */
        public final void m11932k(InterfaceC10574p clickListener) {
            AbstractC9133u.m16133g(clickListener, "clickListener");
            this.f13768d = clickListener;
        }

        /* renamed from: l */
        public final void m11933l(int i10) {
            Iterator it = this.f13765a.iterator();
            while (it.hasNext()) {
                ((SelectModel) it.next()).setSelectModel(false);
            }
            try {
                ((SelectModel) this.f13765a.get(i10)).setSelectModel(true);
            } catch (IndexOutOfBoundsException e10) {
                e10.printStackTrace();
            }
            notifyDataSetChanged();
        }

        /* renamed from: m */
        public final void m11934m(List list) {
            AbstractC9133u.m16133g(list, "list");
            this.f13766b.clear();
            this.f13766b.addAll(list);
            notifyDataSetChanged();
        }

        /* renamed from: n */
        public final void m11935n(List list) {
            AbstractC9133u.m16133g(list, "list");
            this.f13765a.clear();
            List list2 = this.f13765a;
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new SelectModel(false, (String) it.next()));
            }
            list2.addAll(arrayList);
            if (!this.f13765a.isEmpty()) {
                ((SelectModel) AbstractC8778f0.m14566l0(this.f13765a)).setSelectModel(true);
            }
            notifyDataSetChanged();
        }

        /* renamed from: o */
        public final void m11936o(List list) {
            AbstractC9133u.m16133g(list, "list");
            this.f13767c.clear();
            this.f13767c.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipleChoiceAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        MultipleChoiceAnimationAdapter multipleChoiceAnimationAdapter = new MultipleChoiceAnimationAdapter();
        this.f13764a = multipleChoiceAnimationAdapter;
        setAdapter(multipleChoiceAnimationAdapter);
    }

    /* renamed from: b */
    public final void m11923b() {
        this.f13764a.m11928e();
    }

    public final void setAnswerList(List<String> answer) {
        AbstractC9133u.m16133g(answer, "answer");
        this.f13764a.m11934m(answer);
    }

    public final void setItemClickListener(InterfaceC10574p clickListener) {
        AbstractC9133u.m16133g(clickListener, "clickListener");
        this.f13764a.m11932k(clickListener);
    }

    public final void setOptionList(List<String> list) {
        AbstractC9133u.m16133g(list, "list");
        this.f13764a.m11935n(list);
        this.f13764a.notifyDataSetChanged();
    }

    public final void setRightOptionList(List<String> answer) {
        AbstractC9133u.m16133g(answer, "answer");
        this.f13764a.m11936o(answer);
    }

    public final void setSelectedIndex(int i10) {
        this.f13764a.m11933l(i10);
    }
}
