package p246t7;

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

/* renamed from: t7.d */
/* loaded from: classes5.dex */
public final class C9470d extends PopupWindow {

    /* renamed from: a */
    public final Context f16546a;

    /* renamed from: b */
    public final PlaySettingAdapter f16547b;

    /* renamed from: c */
    public final ArrayList f16548c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9470d(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16546a = context;
        ViewPopupPlaySettingBinding viewPopupPlaySettingBindingM11420a = ViewPopupPlaySettingBinding.m11420a(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(viewPopupPlaySettingBindingM11420a, "inflate(...)");
        viewPopupPlaySettingBindingM11420a.f11564a.setLayoutManager(new LinearLayoutManager(context));
        ArrayList arrayList = new ArrayList();
        this.f16548c = arrayList;
        PlaySettingAdapter playSettingAdapter = new PlaySettingAdapter(context, arrayList);
        this.f16547b = playSettingAdapter;
        viewPopupPlaySettingBindingM11420a.f11564a.setAdapter(playSettingAdapter);
        setContentView(viewPopupPlaySettingBindingM11420a.getRoot());
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(context.getDrawable(R$drawable.view_bg_play_speed_rate_popup));
        setOutsideTouchable(true);
        setFocusable(true);
    }

    /* renamed from: a */
    public final void m15849a(View view, List data) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        showAsDropDown(view, -this.f16546a.getResources().getDimensionPixelOffset(R$dimen.view_43), this.f16546a.getResources().getDimensionPixelOffset(R$dimen.view_5));
        this.f16548c.clear();
        this.f16548c.addAll(data);
    }
}
