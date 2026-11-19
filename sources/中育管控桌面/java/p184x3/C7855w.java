package p184x3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.blankj.utilcode.util.AbstractC4668s;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x3.w */
/* loaded from: classes4.dex */
public final class C7855w extends BroadcastReceiver {

    /* renamed from: a */
    public Function1 f10457a;

    /* renamed from: b */
    public Function1 f10458b;

    /* renamed from: a */
    public final void m9523a(Function1 function1) {
        this.f10458b = function1;
    }

    /* renamed from: b */
    public final void m9524b(Function1 function1) {
        this.f10457a = function1;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent.getAction(), "com.android.launcher3.mdm.SCREEN_SHOT_FINISH")) {
            String stringExtra = intent.getStringExtra("path");
            if (stringExtra == null) {
                AbstractC4668s.m2379k("ScreenshotReceiver.kt,截图完成广播未包含图片路径截图完成广播未包含图片路径");
                Toast.makeText(context, "截图完成广播未包含图片路径", 0).show();
                Function1 function1 = this.f10458b;
                if (function1 != null) {
                    function1.invoke("截图完成广播未包含图片路径");
                    return;
                }
                return;
            }
            AbstractC4668s.m2377i("ScreenshotReceiver.kt,领创的截图完成，图片路径: " + stringExtra);
            if (new File(stringExtra).exists()) {
                AbstractC4668s.m2377i("ScreenshotReceiver.kt,文件实际存在: " + stringExtra);
                Function1 function12 = this.f10457a;
                if (function12 != null) {
                    function12.invoke(stringExtra);
                    return;
                }
                return;
            }
            String str = "ScreenshotReceiver.kt,图片文件未找到或未保存成功: " + stringExtra;
            AbstractC4668s.m2379k(str);
            Function1 function13 = this.f10458b;
            if (function13 != null) {
                function13.invoke(str);
            }
        }
    }
}
