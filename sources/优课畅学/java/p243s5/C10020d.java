package p243s5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.zykj.view.R$dimen;
import com.zykj.view.R$drawable;
import com.zykj.view.board.play.PlaySettingAdapter;
import com.zykj.view.databinding.ViewPopupPlaySettingBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: s5.d */
/* loaded from: classes5.dex */
public final class C10020d extends PopupWindow {

    /* renamed from: a */
    public final Context f20047a;

    /* renamed from: b */
    public final PlaySettingAdapter f20048b;

    /* renamed from: c */
    public final ArrayList f20049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10020d(Context context) {
        super(context);
        AbstractC9133u.m16133g(context, "context");
        this.f20047a = context;
        ViewPopupPlaySettingBinding viewPopupPlaySettingBindingM13287a = ViewPopupPlaySettingBinding.m13287a(LayoutInflater.from(context));
        AbstractC9133u.m16132f(viewPopupPlaySettingBindingM13287a, "inflate(...)");
        viewPopupPlaySettingBindingM13287a.f15517a.setLayoutManager(new LinearLayoutManager(context));
        ArrayList arrayList = new ArrayList();
        this.f20049c = arrayList;
        PlaySettingAdapter playSettingAdapter = new PlaySettingAdapter(context, arrayList);
        this.f20048b = playSettingAdapter;
        viewPopupPlaySettingBindingM13287a.f15517a.setAdapter(playSettingAdapter);
        setContentView(viewPopupPlaySettingBindingM13287a.getRoot());
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(context.getDrawable(R$drawable.view_bg_play_speed_rate_popup));
        setOutsideTouchable(true);
        setFocusable(true);
    }

    /* renamed from: a */
    public final void m18727a(View view, List data) {
        AbstractC9133u.m16133g(view, "view");
        AbstractC9133u.m16133g(data, "data");
        showAsDropDown(view, -this.f20047a.getResources().getDimensionPixelOffset(R$dimen.view_43), this.f20047a.getResources().getDimensionPixelOffset(R$dimen.view_5));
        this.f20049c.clear();
        this.f20049c.addAll(data);
    }
}
