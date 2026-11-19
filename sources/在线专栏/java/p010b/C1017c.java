package p010b;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* renamed from: b.c */
/* loaded from: classes.dex */
public final class C1017c extends AbstractC1015a<Intent, ActivityResult> {
    @Override // p010b.AbstractC1015a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo2522a(Context context, Intent intent) {
        return intent;
    }

    @Override // p010b.AbstractC1015a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ActivityResult mo2523c(int i4, Intent intent) {
        return new ActivityResult(i4, intent);
    }
}
