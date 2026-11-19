package p059f5;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.dragswipe.DragAndSwipeCallback;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC5830k;
import p002a1.AbstractC0005a;

/* renamed from: f5.a */
/* loaded from: classes3.dex */
public final class C5527a extends AbstractC0005a {

    /* renamed from: f */
    public final BaseQuickAdapter f8562f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5527a(BaseQuickAdapter baseQuickAdapter) {
        super(baseQuickAdapter);
        AbstractC5830k.m5330g(baseQuickAdapter, "baseQuickAdapter");
        this.f8562f = baseQuickAdapter;
        this.f13b = true;
        DragAndSwipeCallback dragAndSwipeCallback = this.f15d;
        if (dragAndSwipeCallback != null) {
            dragAndSwipeCallback.f2655d = 12;
        } else {
            AbstractC5830k.m5339p("itemTouchHelperCallback");
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean m4892a(int i) {
        int iNextIndex;
        if (i >= 0) {
            List list = this.f8562f.f2645b;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                if (((String) listIterator.previous()).length() > 0) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (i <= iNextIndex) {
                return true;
            }
        }
        return false;
    }
}
