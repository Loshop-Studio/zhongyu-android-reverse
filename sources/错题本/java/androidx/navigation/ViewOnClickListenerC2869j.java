package androidx.navigation;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.zykj.blackboard.widgets.TextDialog;
import com.zykj.mistake.activity.C4468f;
import com.zykj.mistake.activity.MistakeCreateOrEditActivity;
import com.zykj.mistake.fragment.MistakeCollectionLegacyFragment;
import com.zykj.mistake.utils.C5100e;
import kotlin.jvm.internal.AbstractC5830k;
import p106l4.DialogC6053d;
import p106l4.DialogC6054e;

/* renamed from: androidx.navigation.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2869j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f1339a;

    /* renamed from: b */
    public final /* synthetic */ Object f1340b;

    public /* synthetic */ ViewOnClickListenerC2869j(Object obj, int i) {
        this.f1339a = i;
        this.f1340b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1339a;
        Object obj = this.f1340b;
        switch (i) {
            case 0:
                Navigation.createNavigateOnClickListener$lambda$1((NavDirections) obj, view);
                break;
            case 1:
                ((MaterialDatePicker) obj).lambda$initHeaderToggle$0(view);
                break;
            case 2:
                TextDialog.m13814onCreate$lambda0((TextDialog) obj, view);
                break;
            case 3:
                DialogC6053d dialogC6053d = (DialogC6053d) obj;
                dialogC6053d.dismiss();
                dialogC6053d.f9648a.getClass();
                break;
            case 4:
                DialogC6054e dialogC6054e = (DialogC6054e) obj;
                dialogC6054e.dismiss();
                dialogC6054e.f9650a.invoke();
                break;
            case 5:
                ((C4468f) obj).invoke();
                break;
            default:
                C5100e.m4458b(6, "MainFloatingButton", null);
                int i8 = MistakeCreateOrEditActivity.f5799u;
                FragmentActivity fragmentActivityRequireActivity = ((MistakeCollectionLegacyFragment) obj).requireActivity();
                AbstractC5830k.m5329f(fragmentActivityRequireActivity, "requireActivity(...)");
                fragmentActivityRequireActivity.startActivity(new Intent(fragmentActivityRequireActivity, (Class<?>) MistakeCreateOrEditActivity.class));
                break;
        }
    }
}
