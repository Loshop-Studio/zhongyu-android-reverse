package p144q4;

import android.view.View;
import com.zykj.mistake.fragment.TypicalAnswerFragment;
import java.util.ArrayList;

/* renamed from: q4.m */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC6429m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f10553a = 0;

    /* renamed from: b */
    public final /* synthetic */ TypicalAnswerFragment f10554b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f10555c;

    /* renamed from: d */
    public final /* synthetic */ int f10556d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f10557e;

    public /* synthetic */ ViewOnClickListenerC6429m(int i, ArrayList arrayList, TypicalAnswerFragment typicalAnswerFragment, ArrayList arrayList2) {
        this.f10556d = i;
        this.f10555c = arrayList;
        this.f10554b = typicalAnswerFragment;
        this.f10557e = arrayList2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10553a) {
            case 0:
                ArrayList arrayList = this.f10555c;
                int size = arrayList.size();
                int i = this.f10556d;
                TypicalAnswerFragment typicalAnswerFragment = this.f10554b;
                ArrayList arrayList2 = this.f10557e;
                if (i >= size) {
                    typicalAnswerFragment.m4352h((String) arrayList2.get(i), null);
                    break;
                } else {
                    typicalAnswerFragment.m4352h((String) arrayList2.get(i), (String) arrayList.get(i));
                    break;
                }
            default:
                ArrayList arrayList3 = this.f10555c;
                int i8 = this.f10556d;
                this.f10554b.m4352h((String) arrayList3.get(i8), (String) this.f10557e.get(i8));
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC6429m(TypicalAnswerFragment typicalAnswerFragment, ArrayList arrayList, int i, ArrayList arrayList2) {
        this.f10554b = typicalAnswerFragment;
        this.f10555c = arrayList;
        this.f10556d = i;
        this.f10557e = arrayList2;
    }
}
