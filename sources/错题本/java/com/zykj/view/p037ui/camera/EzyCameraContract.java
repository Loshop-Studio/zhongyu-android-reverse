package com.zykj.view.p037ui.camera;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.result.contract.ActivityResultContract;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/view/ui/camera/EzyCameraContract;", "", "<init>", "()V", "StartCameraForResult", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EzyCameraContract {

    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, m5110d2 = {"Lcom/zykj/view/ui/camera/EzyCameraContract$StartCameraForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class StartCameraForResult extends ActivityResultContract<Uri, Uri> {
        @Override // android.view.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull Uri input) {
            AbstractC5830k.m5330g(context, "context");
            AbstractC5830k.m5330g(input, "input");
            Intent intent = new Intent(context, (Class<?>) EzyCameraActivity.class);
            intent.putExtra("Uri", input);
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.view.result.contract.ActivityResultContract
        @Nullable
        public Uri parseResult(int resultCode, @Nullable Intent intent) {
            if (resultCode == -1 && intent != null) {
                return (Uri) intent.getParcelableExtra("ResultUri");
            }
            return null;
        }
    }
}
