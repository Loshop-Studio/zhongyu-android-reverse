package com.zykj.blackboard.proxy;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JM\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"Lcom/zykj/blackboard/proxy/TextEditView;", "", "", "initText", "Lkotlin/Function1;", "Ld6/s;", "afterTextChangedCallback", "doneCallback", "Lkotlin/Function0;", "cancelCallback", "showEditView", "(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface TextEditView {
    void showEditView(@NotNull String initText, @NotNull InterfaceC6471c afterTextChangedCallback, @NotNull InterfaceC6471c doneCallback, @NotNull InterfaceC6469a cancelCallback);
}
