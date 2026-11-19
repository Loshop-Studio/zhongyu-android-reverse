package com.yanzhenjie.recyclerview;

import android.view.View;
import android.widget.OverScroller;
import com.yanzhenjie.recyclerview.AbstractC7029a;

/* renamed from: com.yanzhenjie.recyclerview.b */
/* loaded from: classes4.dex */
public class C7030b extends AbstractC7029a {
    public C7030b(View view) {
        super(1, view);
    }

    @Override // com.yanzhenjie.recyclerview.AbstractC7029a
    /* renamed from: a */
    public void mo7305a(OverScroller overScroller, int i10, int i11) {
        overScroller.startScroll(-Math.abs(i10), 0, Math.abs(i10), 0, i11);
    }

    @Override // com.yanzhenjie.recyclerview.AbstractC7029a
    /* renamed from: b */
    public void mo7306b(OverScroller overScroller, int i10, int i11) {
        overScroller.startScroll(Math.abs(i10), 0, m7310f().getWidth() - Math.abs(i10), 0, i11);
    }

    @Override // com.yanzhenjie.recyclerview.AbstractC7029a
    /* renamed from: d */
    public AbstractC7029a.a mo7308d(int i10, int i11) {
        AbstractC7029a.a aVar = this.f8535c;
        aVar.f8536a = i10;
        aVar.f8537b = i11;
        aVar.f8538c = false;
        if (i10 == 0) {
            aVar.f8538c = true;
        }
        if (i10 >= 0) {
            aVar.f8536a = 0;
        }
        if (aVar.f8536a <= (-m7310f().getWidth())) {
            this.f8535c.f8536a = -m7310f().getWidth();
        }
        return this.f8535c;
    }

    @Override // com.yanzhenjie.recyclerview.AbstractC7029a
    /* renamed from: h */
    public boolean mo7312h(int i10, float f10) {
        return f10 > ((float) m7310f().getWidth());
    }

    /* renamed from: j */
    public boolean m7314j(int i10) {
        int iM7309e = (-m7310f().getWidth()) * m7309e();
        return i10 <= iM7309e && iM7309e != 0;
    }

    /* renamed from: k */
    public boolean m7315k(int i10) {
        return i10 < (-m7310f().getWidth()) * m7309e();
    }
}
