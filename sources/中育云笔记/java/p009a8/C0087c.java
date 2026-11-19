package p009a8;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import java.util.ArrayList;
import java.util.List;
import p435z7.AbstractC12024a;

/* renamed from: a8.c */
/* loaded from: classes5.dex */
public class C0087c extends AbstractC12024a {

    /* renamed from: f */
    public int f75f;

    public C0087c(Context context) {
        super(context);
    }

    /* renamed from: j */
    public static C0087c m245j(Context context, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return new C0087c(context);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(new C0085a(str));
        }
        return new C0087c(context, arrayList);
    }

    @Override // p435z7.AbstractC12024a
    /* renamed from: g */
    public int mo247g() {
        return R$layout.xui_adapter_listview_simple_item;
    }

    @Override // p435z7.AbstractC12024a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo246f(C0086b c0086b, C0085a c0085a, int i10) {
        c0086b.f73b.setText(c0085a.m244b());
        if (c0085a.m243a() == null) {
            c0086b.f74c.setVisibility(8);
        } else {
            c0086b.f74c.setVisibility(0);
            c0086b.f74c.setImageDrawable(c0085a.m243a());
        }
    }

    @Override // p435z7.AbstractC12024a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0086b mo248h(View view) {
        C0086b c0086b = new C0086b();
        c0086b.f72a = (LinearLayout) view.findViewById(R$id.ll_content);
        c0086b.f73b = (TextView) view.findViewById(R$id.tv_title);
        c0086b.f74c = (ImageView) view.findViewById(R$id.iv_icon);
        int i10 = this.f75f;
        if (i10 == 0) {
            c0086b.f72a.setGravity(17);
            return c0086b;
        }
        c0086b.f72a.setPaddingRelative(i10, 0, 0, 0);
        c0086b.f72a.setGravity(16);
        return c0086b;
    }

    public C0087c(Context context, List list) {
        super(context, list);
    }
}
