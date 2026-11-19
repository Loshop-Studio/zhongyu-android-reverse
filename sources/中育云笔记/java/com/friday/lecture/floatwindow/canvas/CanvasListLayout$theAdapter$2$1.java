package com.friday.lecture.floatwindow.canvas;

import android.widget.FrameLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.lecture.R$id;
import com.friday.lecture.floatwindow.canvas.CanvasListLayout$theAdapter$2$1;
import com.friday.lecture.floatwindow.options.C6149a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes4.dex */
public final class CanvasListLayout$theAdapter$2$1 extends BaseQuickAdapter<SimpleCanvasLayout, BaseViewHolder> {
    public CanvasListLayout$theAdapter$2$1(int i10) {
        super(i10, null, 2, null);
    }

    /* renamed from: k */
    public static final C10786q m6526k() {
        C6144a.f8725d.m6571a().m6569h();
        C6149a.m6651q(C6149a.f8778g.m6662a(), false, 1, null);
        return C10786q.f26013a;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, SimpleCanvasLayout simpleCanvasLayout) {
        AbstractC9979u.m20294g(holder, "holder");
        if (simpleCanvasLayout != null) {
            FrameLayout frameLayout = (FrameLayout) holder.getView(R$id.fl_container);
            if (frameLayout.getChildCount() == 0) {
                frameLayout.addView(simpleCanvasLayout);
            } else {
                frameLayout.removeAllViews();
                frameLayout.addView(simpleCanvasLayout);
            }
            simpleCanvasLayout.setOnClose(new InterfaceC9529a() { // from class: e3.b
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return CanvasListLayout$theAdapter$2$1.m6526k();
                }
            });
        }
    }
}
