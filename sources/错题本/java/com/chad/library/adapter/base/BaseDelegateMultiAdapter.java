package com.chad.library.adapter.base;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/chad/library/adapter/base/BaseDelegateMultiAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "com.github.CymChad.brvah"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBaseDelegateMultiAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDelegateMultiAdapter.kt\ncom/chad/library/adapter/base/BaseDelegateMultiAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseDelegateMultiAdapter<T, VH extends BaseViewHolder> extends BaseQuickAdapter<T, VH> {
    public BaseDelegateMultiAdapter() {
        super(0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: d */
    public final int mo2496d(int i) {
        throw new IllegalStateException("Please use setMultiTypeDelegate first!");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: h */
    public final BaseViewHolder mo2497h(ViewGroup viewGroup, int i) {
        throw new IllegalStateException("Please use setMultiTypeDelegate first!");
    }
}
