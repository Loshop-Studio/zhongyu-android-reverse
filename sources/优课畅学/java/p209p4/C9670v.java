package p209p4;

import android.content.Context;
import android.view.View;
import com.zykj.study.bean.teach.SuperviseGroup;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p173m1.C9295c;
import p207p2.AbstractC9642d;

/* renamed from: p4.v */
/* loaded from: classes3.dex */
public class C9670v extends AbstractC9642d {

    /* renamed from: B */
    public SuperviseGroup f19353B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9670v(Context context, List listItems) {
        super(context, new C9295c(context, listItems));
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(listItems, "listItems");
    }

    /* renamed from: D */
    public final SuperviseGroup m18237D() {
        return this.f19353B;
    }

    /* renamed from: E */
    public final void m18238E(SuperviseGroup superviseGroup) {
        this.f19353B = superviseGroup;
    }

    @Override // p207p2.AbstractC9641c
    /* renamed from: v */
    public void mo18229v(View view) {
        super.mo18229v(view);
        this.f19322o.setVisibility(8);
        this.f19321n.setVisibility(8);
    }
}
