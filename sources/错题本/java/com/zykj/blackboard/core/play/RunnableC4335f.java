package com.zykj.blackboard.core.play;

import com.zykj.blackboard.core.play.PlayPageControl;
import java.io.IOException;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.blackboard.core.play.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4335f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5266a;

    /* renamed from: b */
    public final /* synthetic */ Object f5267b;

    /* renamed from: c */
    public final /* synthetic */ Object f5268c;

    public /* synthetic */ RunnableC4335f(int i, Object obj, Object obj2) {
        this.f5266a = i;
        this.f5267b = obj;
        this.f5268c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException, InterruptedException, IOException {
        switch (this.f5266a) {
            case 0:
                PlayPageControl.C43281.m13792invoke$lambda4$lambda3((InterfaceC6471c) this.f5267b, (Throwable) this.f5268c);
                break;
            case 1:
                BasePlayPageControl.m13785show$lambda4((BasePlayPageControl) this.f5267b, (InterfaceC6469a) this.f5268c);
                break;
            case 2:
                PlayControl.m13788loadPath$lambda4$lambda2((InterfaceC6471c) this.f5267b, (PlayControl) this.f5268c);
                break;
            default:
                PlayPageControl.m13790initCommandThread$lambda0((PlayPageControl) this.f5267b, (InterfaceC6469a) this.f5268c);
                break;
        }
    }
}
