package com.zykj.mistake.feature.notebook.list;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel", m5303f = "MistakeNotebookViewModel.kt", m5304i = {0, 0}, m5305l = {492}, m5306m = "appendToNewCollection", m5307n = {"collection", "itemIds"}, m5308s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class MistakeNotebookViewModel$appendToNewCollection$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MistakeNotebookViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeNotebookViewModel$appendToNewCollection$1(MistakeNotebookViewModel mistakeNotebookViewModel, InterfaceC5631c<? super MistakeNotebookViewModel$appendToNewCollection$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = mistakeNotebookViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MistakeNotebookViewModel.m4289a(this.this$0, null, null, this);
    }
}
