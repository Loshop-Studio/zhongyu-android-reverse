package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3}, m5305l = {542, 546, 547, 548}, m5306m = "syncLocalDraft", m5307n = {"sync", "itemId", "sync", "itemId", "sync", "draftUrl", "itemId", "sync", "draftUrl", "itemId"}, m5308s = {"L$0", "J$0", "L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$syncLocalDraft$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$syncLocalDraft$1(MistakeDetailNewViewModel mistakeDetailNewViewModel, InterfaceC5631c<? super MistakeDetailNewViewModel$syncLocalDraft$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = mistakeDetailNewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MistakeDetailNewViewModel.m4121f(this.this$0, null, this);
    }
}
