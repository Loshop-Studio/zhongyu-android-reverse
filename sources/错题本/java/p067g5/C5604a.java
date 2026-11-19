package p067g5;

import android.view.MotionEvent;
import com.zykj.view.simpleBoard.action.BaseAction;
import p152r6.InterfaceC6469a;

/* renamed from: g5.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5604a implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f8706a;

    /* renamed from: b */
    public final /* synthetic */ BaseAction f8707b;

    /* renamed from: c */
    public final /* synthetic */ MotionEvent f8708c;

    public /* synthetic */ C5604a(BaseAction baseAction, MotionEvent motionEvent, int i) {
        this.f8706a = i;
        this.f8707b = baseAction;
        this.f8708c = motionEvent;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f8706a) {
            case 0:
                return BaseAction.onTouchDown$lambda$0(this.f8707b, this.f8708c);
            case 1:
                return BaseAction.onTouchMove$lambda$2(this.f8707b, this.f8708c);
            case 2:
                return BaseAction.onTouchPointerDown$lambda$1(this.f8707b, this.f8708c);
            default:
                return BaseAction.onTouchUp$lambda$3(this.f8707b, this.f8708c);
        }
    }
}
