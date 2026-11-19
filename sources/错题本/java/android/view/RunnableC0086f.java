package android.view;

import android.content.IntentSender;
import android.view.result.contract.ActivityResultContract;
import androidx.profileinstaller.DeviceProfileWriter;
import com.zykj.merge.sketch.view.OldSketchProxyView;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.activity.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0086f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f145a;

    /* renamed from: b */
    public final /* synthetic */ Object f146b;

    /* renamed from: c */
    public final /* synthetic */ int f147c;

    /* renamed from: d */
    public final /* synthetic */ Object f148d;

    public /* synthetic */ RunnableC0086f(int i, int i8, Object obj, Object obj2) {
        this.f145a = i8;
        this.f146b = obj;
        this.f147c = i;
        this.f148d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f145a) {
            case 0:
                ComponentActivity$activityResultRegistry$1.onLaunch$lambda$0((ComponentActivity$activityResultRegistry$1) this.f146b, this.f147c, (ActivityResultContract.SynchronousResult) this.f148d);
                break;
            case 1:
                ComponentActivity$activityResultRegistry$1.onLaunch$lambda$1((ComponentActivity$activityResultRegistry$1) this.f146b, this.f147c, (IntentSender.SendIntentException) this.f148d);
                break;
            case 2:
                ((DeviceProfileWriter) this.f146b).lambda$result$0(this.f147c, this.f148d);
                break;
            default:
                OldSketchProxyView.m13838seekTo$lambda9$lambda6((OldSketchProxyView) this.f146b, (InterfaceC6471c) this.f148d, this.f147c);
                break;
        }
    }

    public /* synthetic */ RunnableC0086f(OldSketchProxyView oldSketchProxyView, InterfaceC6471c interfaceC6471c, int i) {
        this.f145a = 3;
        this.f146b = oldSketchProxyView;
        this.f148d = interfaceC6471c;
        this.f147c = i;
    }
}
