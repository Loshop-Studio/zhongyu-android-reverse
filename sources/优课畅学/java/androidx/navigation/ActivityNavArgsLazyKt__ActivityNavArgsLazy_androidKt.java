package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.MainThread;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
final /* synthetic */ class ActivityNavArgsLazyKt__ActivityNavArgsLazy_androidKt {
    @MainThread
    public static final /* synthetic */ <Args extends NavArgs> NavArgsLazy<Args> navArgs(final Activity activity) {
        AbstractC9133u.m16133g(activity, "<this>");
        AbstractC9133u.m16139m(4, "Args");
        return new NavArgsLazy<>(AbstractC9137y.m16154b(NavArgs.class), new InterfaceC10559a() { // from class: androidx.navigation.ActivityNavArgsLazyKt__ActivityNavArgsLazy_androidKt.navArgs.1
            @Override // p300x7.InterfaceC10559a
            public final Bundle invoke() {
                Intent intent = activity.getIntent();
                if (intent == null) {
                    throw new IllegalStateException("Activity " + activity + " has a null Intent");
                }
                Activity activity2 = activity;
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras;
                }
                throw new IllegalStateException("Activity " + activity2 + " has null extras in " + intent);
            }
        });
    }
}
