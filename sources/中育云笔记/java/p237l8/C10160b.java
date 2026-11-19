package p237l8;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;

/* renamed from: l8.b */
/* loaded from: classes5.dex */
public class C10160b extends AbstractC10159a {
    public C10160b(Context context) {
        super(context);
    }

    @Override // p435z7.AbstractC12024a
    /* renamed from: g */
    public int mo247g() {
        return R$layout.xui_adapter_default_flow_tag_item;
    }

    @Override // p435z7.AbstractC12024a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo246f(TextView textView, String str, int i10) {
        textView.setText(str);
    }

    @Override // p435z7.AbstractC12024a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public TextView mo248h(View view) {
        return (TextView) view.findViewById(R$id.tv_tag_item);
    }
}
