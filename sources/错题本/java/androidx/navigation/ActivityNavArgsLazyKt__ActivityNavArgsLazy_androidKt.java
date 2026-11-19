package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\u0087\b¨\u0006\u0005"}, m5110d2 = {"navArgs", "Landroidx/navigation/NavArgsLazy;", "Args", "Landroidx/navigation/NavArgs;", "Landroid/app/Activity;", "navigation-runtime_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/navigation/ActivityNavArgsLazyKt")
/* loaded from: classes2.dex */
final /* synthetic */ class ActivityNavArgsLazyKt__ActivityNavArgsLazy_androidKt {

    @Metadata(m5111k = 3, m5112mv = {2, 0, 0}, m5114xi = 176)
    /* renamed from: androidx.navigation.ActivityNavArgsLazyKt__ActivityNavArgsLazy_androidKt$navArgs$1 */
    public static final class C28201 implements InterfaceC6469a {
        final /* synthetic */ Activity $this_navArgs;

        public C28201(Activity activity) {
            this.$this_navArgs = activity;
        }

        @Override // p152r6.InterfaceC6469a
        public final Bundle invoke() {
            Intent intent = this.$this_navArgs.getIntent();
            if (intent == null) {
                throw new IllegalStateException("Activity " + this.$this_navArgs + " has a null Intent");
            }
            Activity activity = this.$this_navArgs;
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras;
            }
            throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
        }
    }

    @MainThread
    public static final <Args extends NavArgs> NavArgsLazy<Args> navArgs(Activity activity) {
        AbstractC5830k.m5330g(activity, "<this>");
        AbstractC5830k.m5338o();
        throw null;
    }
}
