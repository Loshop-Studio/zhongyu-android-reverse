package p006a5;

import android.app.Dialog;
import android.util.SparseArray;
import android.view.View;
import androidx.camera.core.impl.C0362d;
import androidx.fragment.app.FragmentActivity;
import com.chad.library.adapter.base.BaseBinderAdapter;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.snackbar.Snackbar;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.C4468f;
import com.zykj.mistake.activity.MistakeCreateOrEditActivity;
import com.zykj.mistake.activity.MistakeDetailActivity;
import com.zykj.mistake.activity.MistakeListActivity;
import com.zykj.mistake.activity.SketchPlayerActivity;
import com.zykj.mistake.databinding.IncludeMistakeDetailEndBinding;
import com.zykj.mistake.dialog.AnswerDialogFragment;
import com.zykj.mistake.dialog.ImageDialogFragment;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.MistakeDetail;
import com.zykj.mistake.fragment.NoteFragment;
import com.zykj.mistake.fragment.OriginalAnswerFragment;
import com.zykj.mistake.fragment.RevisedAnswerFragment;
import com.zykj.mistake.utils.C5102g;
import com.zykj.mistake.utils.C5106k;
import com.zykj.mistake.widget.FlowLayout;
import com.zykj.view.board.play.SpeedRate;
import com.zykj.view.board.play.SpeedRateAdapter;
import com.zykj.view.widget.customColor.LatestColorLayout;
import io.reactivex.internal.operators.observable.C5707c;
import java.util.ArrayList;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import p144q4.C6419c;
import p144q4.C6420d;
import p144q4.C6421e;
import p152r6.InterfaceC6469a;

/* renamed from: a5.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0015f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f43a;

    /* renamed from: b */
    public final /* synthetic */ Object f44b;

    /* renamed from: c */
    public final /* synthetic */ Object f45c;

    public /* synthetic */ ViewOnClickListenerC0015f(int i, Object obj, Object obj2) {
        this.f43a = i;
        this.f44b = obj;
        this.f45c = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [d6.e, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        int i = this.f43a;
        int i8 = 0;
        Object obj = this.f45c;
        Object obj2 = this.f44b;
        switch (i) {
            case 0:
                ((C4468f) ((C0014e) obj2).f42f).invoke();
                ((Dialog) obj).dismiss();
                return;
            case 1:
                ((Snackbar) obj2).lambda$setAction$0((View.OnClickListener) obj, it);
                return;
            case 2:
                String str = (String) obj2;
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity = (MistakeCreateOrEditActivity) obj;
                int i9 = MistakeCreateOrEditActivity.f5799u;
                if (str != null) {
                    new ImageDialogFragment().m3989l(mistakeCreateOrEditActivity, str, null);
                    return;
                }
                return;
            case 3:
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity2 = (MistakeCreateOrEditActivity) obj2;
                CustomTagInfo customTagInfo = (CustomTagInfo) obj;
                ArrayList arrayList = mistakeCreateOrEditActivity2.f5801f;
                arrayList.remove(customTagInfo);
                mistakeCreateOrEditActivity2.f5803h.remove(customTagInfo);
                mistakeCreateOrEditActivity2.m3921z(arrayList);
                return;
            case 4:
                IncludeMistakeDetailEndBinding includeMistakeDetailEndBinding = (IncludeMistakeDetailEndBinding) obj;
                ((MistakeCreateOrEditActivity) obj2).f5803h.clear();
                FlowLayout flowLayout = includeMistakeDetailEndBinding.f6155e;
                FlowLayout flowLayout2 = includeMistakeDetailEndBinding.f6154d;
                FlowLayout flowLayout3 = includeMistakeDetailEndBinding.f6157g;
                FlowLayout flowLayout4 = includeMistakeDetailEndBinding.f6156f;
                int childCount = flowLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    includeMistakeDetailEndBinding.f6155e.getChildAt(i10).setSelected(false);
                }
                int childCount2 = flowLayout4.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    flowLayout4.getChildAt(i11).setSelected(false);
                }
                int childCount3 = flowLayout3.getChildCount();
                for (int i12 = 0; i12 < childCount3; i12++) {
                    flowLayout3.getChildAt(i12).setSelected(false);
                }
                int childCount4 = flowLayout2.getChildCount();
                for (int i13 = 0; i13 < childCount4; i13++) {
                    flowLayout2.getChildAt(i13).setSelected(false);
                }
                return;
            case 5:
                int i14 = MistakeDetailActivity.f5816s;
                new AnswerDialogFragment().m3986l((MistakeDetailActivity) obj2, (String) obj, null, false);
                return;
            case 6:
                View view = (View) obj2;
                MistakeListActivity mistakeListActivity = (MistakeListActivity) obj;
                ArrayList arrayList2 = mistakeListActivity.f5847t;
                int i15 = MistakeListActivity.f5831x;
                if (!view.isSelected()) {
                    mistakeListActivity.m3934A(false);
                    view.setSelected(true);
                    String string = mistakeListActivity.getString(R.string.no_tag);
                    AbstractC5830k.m5329f(string, "getString(...)");
                    arrayList2.add(new CustomTagInfo(string, 0L, 0, 3, 6, null));
                    return;
                }
                view.setSelected(false);
                mistakeListActivity.m3934A(true);
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                while (i8 < size) {
                    Object obj3 = arrayList2.get(i8);
                    i8++;
                    if (((CustomTagInfo) obj3).getLocalType() == 3) {
                        arrayList3.add(obj3);
                    }
                }
                arrayList2.removeAll(arrayList3);
                return;
            case 7:
                C5106k c5106k = (C5106k) obj2;
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) obj;
                long jLongValue = ((Number) c5106k.f8049b.invoke()).longValue();
                Long l = c5106k.f8050c;
                if (l == null || jLongValue - l.longValue() >= c5106k.f8048a) {
                    c5106k.f8050c = Long.valueOf(jLongValue);
                    interfaceC6469a.invoke();
                    return;
                }
                return;
            case 8:
                SpeedRateAdapter.onBindViewHolder$lambda$1((SpeedRateAdapter) obj2, (SpeedRate) obj, it);
                return;
            case 9:
                LatestColorLayout.buildColorView$lambda$7$lambda$6((Integer) obj2, (LatestColorLayout) obj, it);
                return;
            case 10:
                int i16 = SketchPlayerActivity.f5871g;
                C5707c.m5080o(((OriginalAnswerFragment) obj2).getActivity(), ((MistakeDetail.QstMicroLessonBean) obj).getAddress(), null, null);
                return;
            case 11:
                AnswerDialogFragment answerDialogFragment = new AnswerDialogFragment();
                FragmentActivity fragmentActivityRequireActivity = ((OriginalAnswerFragment) obj2).requireActivity();
                AbstractC5830k.m5329f(fragmentActivityRequireActivity, "requireActivity(...)");
                answerDialogFragment.m3986l(fragmentActivityRequireActivity, (String) obj, "", false);
                return;
            case 12:
                int i17 = SketchPlayerActivity.f5871g;
                C5707c.m5080o(((RevisedAnswerFragment) obj2).getActivity(), ((MistakeDetail.QstMicroLessonBean) obj).getAddress(), null, null);
                return;
            case 13:
                BaseViewHolder viewHolder = (BaseViewHolder) obj2;
                BaseBinderAdapter baseBinderAdapter = (BaseBinderAdapter) obj;
                AbstractC5830k.m5330g(viewHolder, "$viewHolder");
                if (viewHolder.getBindingAdapterPosition() == -1) {
                    return;
                }
                baseBinderAdapter.m2499j(viewHolder.getItemViewType());
                throw null;
            case 14:
                BaseViewHolder viewHolder2 = (BaseViewHolder) obj2;
                BaseProviderMultiAdapter baseProviderMultiAdapter = (BaseProviderMultiAdapter) obj;
                AbstractC5830k.m5330g(viewHolder2, "$viewHolder");
                int bindingAdapterPosition = viewHolder2.getBindingAdapterPosition();
                if (bindingAdapterPosition == -1) {
                    return;
                }
                if (((SparseArray) baseProviderMultiAdapter.f2643e.getValue()).get(viewHolder2.getItemViewType()) != null) {
                    throw new ClassCastException();
                }
                AbstractC5830k.m5329f(it, "it");
                baseProviderMultiAdapter.f2645b.get(bindingAdapterPosition);
                throw null;
            default:
                BaseViewHolder viewHolder3 = (BaseViewHolder) obj2;
                BaseQuickAdapter baseQuickAdapter = (BaseQuickAdapter) obj;
                AbstractC5830k.m5330g(viewHolder3, "$viewHolder");
                int bindingAdapterPosition2 = viewHolder3.getBindingAdapterPosition();
                if (bindingAdapterPosition2 == -1) {
                    return;
                }
                AbstractC5830k.m5329f(it, "v");
                C0362d c0362d = baseQuickAdapter.f2646c;
                if (c0362d != null) {
                    NoteFragment noteFragment = (NoteFragment) c0362d.f446b;
                    Object objM5230j0 = AbstractC5805t.m5230j0(bindingAdapterPosition2, baseQuickAdapter.f2645b);
                    String str2 = objM5230j0 instanceof String ? (String) objM5230j0 : null;
                    if (str2 == null) {
                        return;
                    }
                    if (str2.length() != 0) {
                        ImageDialogFragment imageDialogFragment = new ImageDialogFragment();
                        FragmentActivity fragmentActivityRequireActivity2 = noteFragment.requireActivity();
                        AbstractC5830k.m5329f(fragmentActivityRequireActivity2, "requireActivity(...)");
                        imageDialogFragment.m3989l(fragmentActivityRequireActivity2, str2, new C6421e(noteFragment, str2, imageDialogFragment, i8));
                        return;
                    }
                    C5102g c5102g = noteFragment.f7791m;
                    if (c5102g != null) {
                        c5102g.m4465a(new C6419c(noteFragment, 2), new C6420d(noteFragment, i8));
                        return;
                    } else {
                        AbstractC5830k.m5339p("galleryLauncher");
                        throw null;
                    }
                }
                return;
        }
    }
}
