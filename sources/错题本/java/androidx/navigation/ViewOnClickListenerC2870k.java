package androidx.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.autofill.HintConstants;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.gson.C3841g;
import com.zykj.mistake.activity.MistakeDetailActivity;
import com.zykj.mistake.activity.MistakeListActivity;
import com.zykj.mistake.adapter.MainLessonAdapter;
import com.zykj.mistake.adapter.MistakeListAdapter;
import com.zykj.mistake.adapter.SketchMaterialAdapter;
import com.zykj.mistake.entity.resp.MistakeBookResp;
import com.zykj.mistake.entity.resp.MistakeListResp;
import com.zykj.mistake.fragment.MistakeCollectionLegacyFragment;
import com.zykj.mistake.utils.C5100e;
import com.zykj.view.board.play.PlaySettingAdapter;
import com.zykj.view.widget.customColor.CustomColorLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5830k;
import p066g4.C5603b;

/* renamed from: androidx.navigation.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2870k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f1341a;

    /* renamed from: b */
    public final /* synthetic */ int f1342b;

    /* renamed from: c */
    public final /* synthetic */ Object f1343c;

    public /* synthetic */ ViewOnClickListenerC2870k(int i, Bundle bundle) {
        this.f1341a = 0;
        this.f1342b = i;
        this.f1343c = bundle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1341a;
        int i8 = this.f1342b;
        Object obj = this.f1343c;
        switch (i) {
            case 0:
                Navigation.createNavigateOnClickListener$lambda$0(i8, (Bundle) obj, view);
                break;
            case 1:
                PlaySettingAdapter.onBindViewHolder$lambda$0((PlaySettingAdapter) obj, i8, view);
                break;
            case 2:
                MistakeCollectionLegacyFragment mistakeCollectionLegacyFragment = ((MainLessonAdapter) obj).f5966c;
                ArrayList arrayList = mistakeCollectionLegacyFragment.f7778e;
                C5100e.m4458b(4, "MainSubjectCard", ((MistakeBookResp.MistakeBook) arrayList.get(i8)).getTopic().getContent());
                int i9 = MistakeListActivity.f5831x;
                FragmentActivity fragmentActivityRequireActivity = mistakeCollectionLegacyFragment.requireActivity();
                AbstractC5830k.m5329f(fragmentActivityRequireActivity, "requireActivity(...)");
                String name = ((MistakeBookResp.MistakeBook) arrayList.get(i8)).getTopic().getContent();
                long id = ((MistakeBookResp.MistakeBook) arrayList.get(i8)).getId();
                long id2 = ((MistakeBookResp.MistakeBook) arrayList.get(i8)).getTopic().getId();
                AbstractC5830k.m5330g(name, "name");
                Bundle bundle = new Bundle();
                bundle.putString(HintConstants.AUTOFILL_HINT_NAME, name);
                bundle.putLong("bookId", id);
                bundle.putLong("topicId", id2);
                Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) MistakeListActivity.class);
                intent.putExtras(bundle);
                fragmentActivityRequireActivity.startActivity(intent);
                break;
            case 3:
                MistakeListAdapter mistakeListAdapter = (MistakeListAdapter) obj;
                boolean z8 = mistakeListAdapter.f5975d;
                MistakeListActivity mistakeListActivity = mistakeListAdapter.f5974c;
                ArrayList arrayList2 = mistakeListAdapter.f5973b;
                if (!z8) {
                    mistakeListActivity.getClass();
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    ArrayList arrayList4 = mistakeListActivity.f5832e;
                    int size = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList4.get(i10);
                        i10++;
                        arrayList3.add(new C3841g().m2787f((MistakeListResp.MistakeInfo) obj2));
                    }
                    long j7 = mistakeListActivity.f5844q;
                    long j8 = mistakeListActivity.f5845r;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("bookId", j7);
                    bundle2.putLong("topicId", j8);
                    bundle2.putStringArrayList("mistakeList", arrayList3);
                    bundle2.putInt(RequestParameters.POSITION, i8);
                    Intent intent2 = new Intent(mistakeListActivity, (Class<?>) MistakeDetailActivity.class);
                    intent2.putExtras(bundle2);
                    mistakeListActivity.startActivityForResult(intent2, 0);
                    break;
                } else {
                    ((MistakeListResp.MistakeInfo) arrayList2.get(i8)).setSelected(!((MistakeListResp.MistakeInfo) arrayList2.get(i8)).getIsSelected());
                    mistakeListAdapter.notifyItemChanged(i8);
                    ArrayList arrayList5 = mistakeListActivity.f5846s;
                    if (arrayList5.contains(String.valueOf(i8))) {
                        arrayList5.remove(String.valueOf(i8));
                    } else {
                        arrayList5.add(String.valueOf(i8));
                    }
                    if (!arrayList5.isEmpty()) {
                        mistakeListActivity.m3940w();
                        break;
                    } else {
                        mistakeListActivity.m3939v();
                        break;
                    }
                }
            case 4:
                ((C5603b) ((SketchMaterialAdapter) obj).f5984b.get(i8)).f8705c.invoke();
                break;
            default:
                CustomColorLayout.toView$lambda$5$lambda$4((CustomColorLayout) obj, i8, view);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC2870k(Object obj, int i, int i8) {
        this.f1341a = i8;
        this.f1343c = obj;
        this.f1342b = i;
    }
}
