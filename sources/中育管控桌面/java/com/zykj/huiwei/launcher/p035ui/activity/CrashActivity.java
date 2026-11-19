package com.zykj.huiwei.launcher.p035ui.activity;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.huiwei.launcher.p035ui.dialog.CrashHintDialog;
import com.zykj.manage.R;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/activity/CrashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class CrashActivity extends Hilt_CrashActivity {
    @Override // com.zykj.huiwei.launcher.p035ui.activity.Hilt_CrashActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crash);
        new CrashHintDialog().show(getSupportFragmentManager(), "");
    }
}
