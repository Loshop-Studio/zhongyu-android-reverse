package p264nb;

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
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: nb.d */
/* loaded from: classes6.dex */
public final class C10364d extends PopupWindow {

    /* renamed from: a */
    public final Context f24685a;

    /* renamed from: b */
    public final PlaySettingAdapter f24686b;

    /* renamed from: c */
    public final ArrayList f24687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10364d(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
        this.f24685a = context;
        ViewPopupPlaySettingBinding viewPopupPlaySettingBindingM17359a = ViewPopupPlaySettingBinding.m17359a(LayoutInflater.from(context));
        AbstractC9979u.m20293f(viewPopupPlaySettingBindingM17359a, "inflate(...)");
        viewPopupPlaySettingBindingM17359a.f20728c.setLayoutManager(new LinearLayoutManager(context));
        ArrayList arrayList = new ArrayList();
        this.f24687c = arrayList;
        PlaySettingAdapter playSettingAdapter = new PlaySettingAdapter(context, arrayList);
        this.f24686b = playSettingAdapter;
        viewPopupPlaySettingBindingM17359a.f20728c.setAdapter(playSettingAdapter);
        setContentView(viewPopupPlaySettingBindingM17359a.getRoot());
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(context.getDrawable(R$drawable.view_bg_play_speed_rate_popup));
        setOutsideTouchable(true);
        setFocusable(true);
    }

    /* renamed from: a */
    public final void m21701a(View view, List data) {
        AbstractC9979u.m20294g(view, "view");
        AbstractC9979u.m20294g(data, "data");
        showAsDropDown(view, -this.f24685a.getResources().getDimensionPixelOffset(R$dimen.view_43), this.f24685a.getResources().getDimensionPixelOffset(R$dimen.view_5));
        this.f24687c.clear();
        this.f24687c.addAll(data);
    }
}
