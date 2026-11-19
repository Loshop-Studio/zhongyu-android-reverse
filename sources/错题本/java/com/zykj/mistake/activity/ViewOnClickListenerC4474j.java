package com.zykj.mistake.activity;

import android.view.View;
import androidx.core.view.GravityCompat;
import com.zykj.mistake.R;
import com.zykj.mistake.base.BaseMVPActivity;
import com.zykj.mistake.databinding.ActivityMistakeCreateOrEditBinding;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.presenter.MistakeCreateOrEditPresenter;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5830k;
import p021b5.C3190b;
import p106l4.C6060k;
import p106l4.DialogC6058i;

/* renamed from: com.zykj.mistake.activity.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC4474j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f5908a;

    /* renamed from: b */
    public final /* synthetic */ BaseMVPActivity f5909b;

    public /* synthetic */ ViewOnClickListenerC4474j(BaseMVPActivity baseMVPActivity, int i) {
        this.f5908a = i;
        this.f5909b = baseMVPActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5908a;
        BaseMVPActivity baseMVPActivity = this.f5909b;
        switch (i) {
            case 0:
                int i8 = MistakeCreateOrEditActivity.f5799u;
                MistakeCreateOrEditPresenter mistakeCreateOrEditPresenter = (MistakeCreateOrEditPresenter) ((MistakeCreateOrEditActivity) baseMVPActivity).m3965r();
                C5088a c5088a = C5088a.f7986a;
                mistakeCreateOrEditPresenter.m3969a(C5088a.m4381b().m4388f(), new C3190b(mistakeCreateOrEditPresenter, 5));
                return;
            case 1:
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity = (MistakeCreateOrEditActivity) baseMVPActivity;
                int i9 = MistakeCreateOrEditActivity.f5799u;
                DialogC6058i dialogC6058i = (DialogC6058i) mistakeCreateOrEditActivity.f5805j.getValue();
                String string = mistakeCreateOrEditActivity.getString(R.string.add_mistake_tag);
                AbstractC5830k.m5329f(string, "getString(...)");
                C4477m c4477m = new C4477m(mistakeCreateOrEditActivity, 0);
                int i10 = DialogC6058i.f9655d;
                dialogC6058i.m5787a(string, "", c4477m);
                return;
            case 2:
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity2 = (MistakeCreateOrEditActivity) baseMVPActivity;
                ArrayList arrayList = mistakeCreateOrEditActivity2.f5801f;
                arrayList.clear();
                arrayList.addAll(mistakeCreateOrEditActivity2.f5803h);
                mistakeCreateOrEditActivity2.m3921z(arrayList);
                ((ActivityMistakeCreateOrEditBinding) mistakeCreateOrEditActivity2.m3957p()).f6020c.closeDrawer(GravityCompat.END);
                return;
            case 3:
                int i11 = MistakeCreateOrEditActivity.f5799u;
                ((MistakeCreateOrEditActivity) baseMVPActivity).finish();
                return;
            case 4:
                int i12 = MistakeCreateOrEditActivity.f5799u;
                ((MistakeCreateOrEditActivity) baseMVPActivity).finish();
                return;
            default:
                C6060k c6060k = ((SketchActivity) baseMVPActivity).f5862m;
                if (c6060k == null) {
                    AbstractC5830k.m5339p("mMenuPopupWindow");
                    throw null;
                }
                AbstractC5830k.m5327d(view);
                SketchActivity sketchActivity = c6060k.f9661a;
                c6060k.showAsDropDown(view, -sketchActivity.getResources().getDimensionPixelOffset(R.dimen.view_43), sketchActivity.getResources().getDimensionPixelOffset(R.dimen.view_5));
                return;
        }
    }
}
