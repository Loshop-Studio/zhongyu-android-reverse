package com.zykj.mistake.entity.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;", "", "<init>", "()V", "bookId", "", "getBookId", "()I", "setBookId", "(I)V", "itemIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemIds", "()Ljava/util/ArrayList;", "setItemIds", "(Ljava/util/ArrayList;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MultiRemoveMistakeReq {
    public static final int $stable = 8;
    private int bookId;

    @NotNull
    private ArrayList<Integer> itemIds = new ArrayList<>();

    public final int getBookId() {
        return this.bookId;
    }

    @NotNull
    public final ArrayList<Integer> getItemIds() {
        return this.itemIds;
    }

    public final void setBookId(int i) {
        this.bookId = i;
    }

    public final void setItemIds(@NotNull ArrayList<Integer> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.itemIds = arrayList;
    }
}
