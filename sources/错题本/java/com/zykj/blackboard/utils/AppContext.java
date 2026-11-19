package com.zykj.blackboard.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\f"}, m5110d2 = {"Lcom/zykj/blackboard/utils/AppContext;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ld6/s;", "init", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "Landroid/content/Context;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class AppContext {

    @NotNull
    public static final AppContext INSTANCE = new AppContext();

    @Nullable
    private static Context context;

    private AppContext() {
    }

    @Nullable
    public final Context getContext() {
        return context;
    }

    public final void init(@NotNull Context context2) {
        AbstractC5830k.m5330g(context2, "context");
        context = context2.getApplicationContext();
    }
}
