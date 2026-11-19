package p144q4;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.zykj.mistake.base.BaseFragment;
import com.zykj.mistake.dialog.AnswerDialogFragment;
import com.zykj.mistake.fragment.OriginalAnswerFragment;
import com.zykj.mistake.fragment.RevisedAnswerFragment;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: q4.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC6423g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f10540a;

    /* renamed from: b */
    public final /* synthetic */ String f10541b;

    /* renamed from: c */
    public final /* synthetic */ boolean f10542c;

    /* renamed from: d */
    public final /* synthetic */ String f10543d;

    /* renamed from: e */
    public final /* synthetic */ BaseFragment f10544e;

    public /* synthetic */ ViewOnClickListenerC6423g(BaseFragment baseFragment, String str, boolean z8, String str2, int i) {
        this.f10540a = i;
        this.f10544e = baseFragment;
        this.f10541b = str;
        this.f10542c = z8;
        this.f10543d = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10540a) {
            case 0:
                OriginalAnswerFragment originalAnswerFragment = (OriginalAnswerFragment) this.f10544e;
                boolean z8 = this.f10542c;
                String str = z8 ? this.f10543d : null;
                AnswerDialogFragment answerDialogFragment = new AnswerDialogFragment();
                FragmentActivity fragmentActivityRequireActivity = originalAnswerFragment.requireActivity();
                AbstractC5830k.m5329f(fragmentActivityRequireActivity, "requireActivity(...)");
                answerDialogFragment.m3986l(fragmentActivityRequireActivity, this.f10541b, str, z8);
                break;
            default:
                RevisedAnswerFragment revisedAnswerFragment = (RevisedAnswerFragment) this.f10544e;
                boolean z9 = this.f10542c;
                String str2 = z9 ? this.f10543d : null;
                revisedAnswerFragment.getClass();
                AnswerDialogFragment answerDialogFragment2 = new AnswerDialogFragment();
                FragmentActivity fragmentActivityRequireActivity2 = revisedAnswerFragment.requireActivity();
                AbstractC5830k.m5329f(fragmentActivityRequireActivity2, "requireActivity(...)");
                answerDialogFragment2.m3986l(fragmentActivityRequireActivity2, this.f10541b, str2, z9);
                break;
        }
    }
}
