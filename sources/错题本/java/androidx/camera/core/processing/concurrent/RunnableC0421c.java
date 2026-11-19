package androidx.camera.core.processing.concurrent;

import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.processing.SurfaceEdge;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.record.RecordControl;
import java.util.Map;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.camera.core.processing.concurrent.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0421c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f515a;

    /* renamed from: b */
    public final /* synthetic */ Object f516b;

    /* renamed from: c */
    public final /* synthetic */ Object f517c;

    /* renamed from: d */
    public final /* synthetic */ Object f518d;

    /* renamed from: e */
    public final /* synthetic */ Object f519e;

    /* renamed from: f */
    public final /* synthetic */ Object f520f;

    /* renamed from: g */
    public final /* synthetic */ Object f521g;

    public /* synthetic */ RunnableC0421c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f515a = i;
        this.f516b = obj;
        this.f517c = obj2;
        this.f518d = obj3;
        this.f519e = obj4;
        this.f520f = obj5;
        this.f521g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f515a) {
            case 0:
                ((DualSurfaceProcessorNode) this.f516b).lambda$sendSurfaceOutputs$0((CameraInternal) this.f517c, (CameraInternal) this.f518d, (SurfaceEdge) this.f519e, (SurfaceEdge) this.f520f, (Map.Entry) this.f521g);
                break;
            default:
                RecordControl.m13877loadData$lambda1$lambda0((EzyDrawBoard.BoardHead) this.f516b, (String) this.f517c, (EzyDrawBoard.DrawBoard) this.f518d, (RecordControl) this.f519e, (InterfaceC6471c) this.f520f, (InterfaceC6471c) this.f521g);
                break;
        }
    }
}
