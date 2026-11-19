package p173m1;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import java.util.List;
import p162l1.AbstractC9241a;

/* renamed from: m1.c */
/* loaded from: classes4.dex */
public class C9295c extends AbstractC9241a {

    /* renamed from: d */
    public int f18320d;

    public C9295c(Context context, List list) {
        super(context, list);
    }

    @Override // p162l1.AbstractC9241a
    /* renamed from: e */
    public int mo16946e() {
        return R$layout.xui_adapter_listview_simple_item;
    }

    @Override // p162l1.AbstractC9241a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo16945d(C9294b c9294b, C9293a c9293a, int i10) {
        c9294b.f18318b.setText(c9293a.m17097b());
        if (c9293a.m17096a() == null) {
            c9294b.f18319c.setVisibility(8);
        } else {
            c9294b.f18319c.setVisibility(0);
            c9294b.f18319c.setImageDrawable(c9293a.m17096a());
        }
    }

    @Override // p162l1.AbstractC9241a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C9294b mo16947f(View view) {
        C9294b c9294b = new C9294b();
        c9294b.f18317a = (LinearLayout) view.findViewById(R$id.ll_content);
        c9294b.f18318b = (TextView) view.findViewById(R$id.tv_title);
        c9294b.f18319c = (ImageView) view.findViewById(R$id.iv_icon);
        int i10 = this.f18320d;
        if (i10 == 0) {
            c9294b.f18317a.setGravity(17);
            return c9294b;
        }
        c9294b.f18317a.setPaddingRelative(i10, 0, 0, 0);
        c9294b.f18317a.setGravity(16);
        return c9294b;
    }
}
