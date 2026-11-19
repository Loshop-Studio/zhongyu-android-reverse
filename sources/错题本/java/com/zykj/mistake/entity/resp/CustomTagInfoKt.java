package com.zykj.mistake.entity.resp;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"isSystemTag", "", "Lcom/zykj/mistake/entity/resp/CustomTagInfo;", "(Lcom/zykj/mistake/entity/resp/CustomTagInfo;)Z", "app_release"}, m5111k = 2, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CustomTagInfoKt {
    public static final boolean isSystemTag(@NotNull CustomTagInfo customTagInfo) {
        AbstractC5830k.m5330g(customTagInfo, "<this>");
        return customTagInfo.getLocalType() != -1;
    }
}
