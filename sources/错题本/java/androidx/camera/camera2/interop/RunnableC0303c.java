package androidx.camera.camera2.interop;

import android.view.View;
import androidx.camera.video.internal.audio.AudioStream;
import com.google.android.material.internal.ViewUtils;
import com.zykj.blackboard.core.edit.BoardControl;
import com.zykj.view.board.crop.BlackboardCropFragment;
import java.util.ArrayList;

/* renamed from: androidx.camera.camera2.interop.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0303c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f377a;

    /* renamed from: b */
    public final /* synthetic */ boolean f378b;

    /* renamed from: c */
    public final /* synthetic */ Object f379c;

    public /* synthetic */ RunnableC0303c(Object obj, boolean z8, int i) {
        this.f377a = i;
        this.f379c = obj;
        this.f378b = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f377a) {
            case 0:
                ((Camera2CameraControl) this.f379c).lambda$setActive$6(this.f378b);
                break;
            case 1:
                ((AudioStream.AudioStreamCallback) this.f379c).onSilenceStateChanged(this.f378b);
                break;
            case 2:
                ViewUtils.showKeyboard((View) this.f379c, this.f378b);
                break;
            case 3:
                BoardControl.m13768save$lambda9$lambda7((ArrayList) this.f379c, this.f378b);
                break;
            default:
                BlackboardCropFragment.initView$lambda$10$lambda$9$lambda$8$lambda$7((BlackboardCropFragment) this.f379c, this.f378b);
                break;
        }
    }
}
