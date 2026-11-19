package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.MainThread;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
final /* synthetic */ class ActivityNavArgsLazyKt__ActivityNavArgsLazy_androidKt {
    @MainThread
    public static final /* synthetic */ <Args extends NavArgs> NavArgsLazy<Args> navArgs(final Activity activity) {
        AbstractC9979u.m20294g(activity, "<this>");
        AbstractC9979u.m20300m(4, "Args");
        return new NavArgsLazy<>(AbstractC9983y.m20315b(NavArgs.class), new InterfaceC9529a() { // from class: androidx.navigation.ActivityNavArgsLazyKt__ActivityNavArgsLazy_androidKt.navArgs.1
            @Override // p181hd.InterfaceC9529a
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
