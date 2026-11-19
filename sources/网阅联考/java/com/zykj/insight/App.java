package com.zykj.insight;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.message.client.MessageClient;
import kotlin.Metadata;
import p124t1.AbstractApplicationC4597o;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, m5175d2 = {"Lcom/zykj/insight/App;", "Landroid/app/Application;", "()V", "onCreate", "", "onTerminate", "app_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class App extends AbstractApplicationC4597o {
    @Override // p124t1.AbstractApplicationC4597o, android.app.Application
    public void onCreate() {
        super.onCreate();
        MessageClient.f4242a.mo4634d(this);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        MessageClient.f4242a.mo4635e();
    }
}
