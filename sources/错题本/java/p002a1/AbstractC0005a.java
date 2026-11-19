package p002a1;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.dragswipe.DragAndSwipeCallback;
import kotlin.jvm.internal.AbstractC5830k;
import p059f5.C5527a;
import p144q4.C6422f;

/* renamed from: a1.a */
/* loaded from: classes2.dex */
public abstract class AbstractC0005a {

    /* renamed from: a */
    public final BaseQuickAdapter f12a;

    /* renamed from: b */
    public boolean f13b;

    /* renamed from: c */
    public final ItemTouchHelper f14c;

    /* renamed from: d */
    public final DragAndSwipeCallback f15d;

    /* renamed from: e */
    public C6422f f16e;

    public AbstractC0005a(BaseQuickAdapter baseQuickAdapter) {
        AbstractC5830k.m5330g(baseQuickAdapter, "baseQuickAdapter");
        this.f12a = baseQuickAdapter;
        DragAndSwipeCallback dragAndSwipeCallback = new DragAndSwipeCallback();
        dragAndSwipeCallback.f2653b = 0.1f;
        dragAndSwipeCallback.f2654c = 0.7f;
        dragAndSwipeCallback.f2655d = 15;
        dragAndSwipeCallback.f2656e = 32;
        dragAndSwipeCallback.f2652a = (C5527a) this;
        this.f15d = dragAndSwipeCallback;
        this.f14c = new ItemTouchHelper(dragAndSwipeCallback);
    }
}
