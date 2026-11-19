package com.dylanc.longan;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p054f1.AbstractC6289a;
import p054f1.AbstractC6290b;

@Metadata(m7879d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m7880d2 = {"Lcom/dylanc/longan/AppInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "longan"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class AppInitializer implements Initializer<Unit> {
    /* renamed from: a */
    public void m3328a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AbstractC6289a.m6426b((Application) context);
        AbstractC6290b.m6428b(AbstractC6289a.m6425a(), new Function2<Activity, Bundle, Unit>() { // from class: com.dylanc.longan.AppInitializer.create.1
            /* renamed from: a */
            public final void m3329a(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                ActivityKt.m3324c().add(activity);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Activity activity, Bundle bundle) {
                m3329a(activity, bundle);
                return Unit.INSTANCE;
            }
        }, null, null, null, null, null, new Function1<Activity, Unit>() { // from class: com.dylanc.longan.AppInitializer.create.2
            /* renamed from: a */
            public final void m3330a(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                ActivityKt.m3324c().remove(activity);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Activity activity) {
                m3330a(activity);
                return Unit.INSTANCE;
            }
        }, 62, null);
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        m3328a(context);
        return Unit.INSTANCE;
    }

    @Override // androidx.startup.Initializer
    public List dependencies() {
        return CollectionsKt.emptyList();
    }
}
