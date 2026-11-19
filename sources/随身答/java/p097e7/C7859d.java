package p097e7;

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
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e7.d */
/* loaded from: classes5.dex */
public final class C7859d extends PopupWindow {

    /* renamed from: a */
    public final Context f13213a;

    /* renamed from: b */
    public final PlaySettingAdapter f13214b;

    /* renamed from: c */
    public final ArrayList f13215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7859d(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13213a = context;
        ViewPopupPlaySettingBinding viewPopupPlaySettingBindingM11910a = ViewPopupPlaySettingBinding.m11910a(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(viewPopupPlaySettingBindingM11910a, "inflate(...)");
        viewPopupPlaySettingBindingM11910a.f12808a.setLayoutManager(new LinearLayoutManager(context));
        ArrayList arrayList = new ArrayList();
        this.f13215c = arrayList;
        PlaySettingAdapter playSettingAdapter = new PlaySettingAdapter(context, arrayList);
        this.f13214b = playSettingAdapter;
        viewPopupPlaySettingBindingM11910a.f12808a.setAdapter(playSettingAdapter);
        setContentView(viewPopupPlaySettingBindingM11910a.getRoot());
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(context.getDrawable(R$drawable.view_bg_play_speed_rate_popup));
        setOutsideTouchable(true);
        setFocusable(true);
    }

    /* renamed from: a */
    public final void m12346a(View view, List data) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        showAsDropDown(view, -this.f13213a.getResources().getDimensionPixelOffset(R$dimen.view_43), this.f13213a.getResources().getDimensionPixelOffset(R$dimen.view_5));
        this.f13215c.clear();
        this.f13215c.addAll(data);
    }
}
