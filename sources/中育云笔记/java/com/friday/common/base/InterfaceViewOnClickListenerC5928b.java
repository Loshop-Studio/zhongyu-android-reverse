package com.friday.common.base;

import android.view.View;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.friday.common.base.b */
/* loaded from: classes3.dex */
public interface InterfaceViewOnClickListenerC5928b extends View.OnClickListener {
    @Override // android.view.View.OnClickListener
    default void onClick(View view) {
        AbstractC9979u.m20294g(view, "view");
    }
}
