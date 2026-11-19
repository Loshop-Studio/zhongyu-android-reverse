package com.dylanc.longan.activityresult;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import com.dylanc.longan.ActivityKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0013\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, m7880d2 = {"Lcom/dylanc/longan/activityresult/RequestPermissionContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Lkotlin/Pair;", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "", "resultCode", "intent", "a", "(ILandroid/content/Intent;)Lkotlin/Pair;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "Ljava/lang/String;", "permission", "longan"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class RequestPermissionContract extends ActivityResultContract<String, Pair<? extends String, ? extends Boolean>> {

    /* renamed from: a, reason: from kotlin metadata */
    public String permission;

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pair parseResult(int resultCode, Intent intent) {
        String str = null;
        if (intent == null || resultCode != -1) {
            String str2 = this.permission;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permission");
            } else {
                str = str2;
            }
            return TuplesKt.m7887to(str, Boolean.FALSE);
        }
        int[] intArrayExtra = intent.getIntArrayExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS);
        String str3 = this.permission;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permission");
        } else {
            str = str3;
        }
        boolean z6 = false;
        if (intArrayExtra != null && intArrayExtra.length != 0 && intArrayExtra[0] == 0) {
            z6 = true;
        }
        return TuplesKt.m7887to(str, Boolean.valueOf(z6));
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent(ActivityResultContracts.RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS).putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS, new String[]{input});
        this.permission = input;
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ActivityResultCon…so { permission = input }");
        return intentPutExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public ActivityResultContract.SynchronousResult getSynchronousResult(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (input == null) {
            return new ActivityResultContract.SynchronousResult(TuplesKt.m7887to("", Boolean.FALSE));
        }
        if (ActivityKt.m3325d(context, input)) {
            return new ActivityResultContract.SynchronousResult(TuplesKt.m7887to(input, Boolean.TRUE));
        }
        return null;
    }
}
