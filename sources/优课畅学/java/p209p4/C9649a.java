package p209p4;

import android.content.Context;
import android.view.View;
import com.zykj.study.bean.course.CatalogBean;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p173m1.C9295c;
import p207p2.AbstractC9642d;

/* renamed from: p4.a */
/* loaded from: classes3.dex */
public final class C9649a extends AbstractC9642d {

    /* renamed from: B */
    public CatalogBean f19337B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9649a(Context context, List listItems) {
        super(context, new C9295c(context, listItems));
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(listItems, "listItems");
    }

    /* renamed from: D */
    public final CatalogBean m18235D() {
        return this.f19337B;
    }

    /* renamed from: E */
    public final void m18236E(CatalogBean catalogBean) {
        this.f19337B = catalogBean;
    }

    @Override // p207p2.AbstractC9641c
    /* renamed from: v */
    public void mo18229v(View view) {
        super.mo18229v(view);
        this.f19322o.setVisibility(8);
        this.f19321n.setVisibility(8);
    }
}
