package com.dylanc.longan;

import android.app.Activity;
import android.content.Context;
import androidx.core.content.ContextCompat;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ActivityKt {

    /* renamed from: a */
    public static final LinkedList f3250a = new LinkedList();

    /* renamed from: a */
    public static final boolean m3322a(final Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return CollectionsKt.removeAll((List) f3250a, (Function1) new Function1<Activity, Boolean>() { // from class: com.dylanc.longan.ActivityKt$finishActivity$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Activity it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (Intrinsics.areEqual(it.getClass().getName(), clazz.getName())) {
                    it.finish();
                }
                return Boolean.valueOf(Intrinsics.areEqual(it.getClass().getName(), clazz.getName()));
            }
        });
    }

    /* renamed from: b */
    public static final boolean m3323b() {
        return CollectionsKt.removeAll((List) f3250a, (Function1) new Function1<Activity, Boolean>() { // from class: com.dylanc.longan.ActivityKt$finishAllActivities$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Activity it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.finish();
                return Boolean.TRUE;
            }
        });
    }

    /* renamed from: c */
    public static final LinkedList m3324c() {
        return f3250a;
    }

    /* renamed from: d */
    public static final boolean m3325d(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(context, permission) == 0;
    }
}
