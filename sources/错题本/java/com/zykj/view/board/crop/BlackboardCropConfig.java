package com.zykj.view.board.crop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001BU\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R0\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m5110d2 = {"Lcom/zykj/view/board/crop/BlackboardCropConfig;", "", "Lkotlin/Function0;", "Ld6/s;", "callbackForBack", "callbackForNoTime", "callbackForNoSupport", "Lkotlin/Function1;", "", "callbackForConfirm", "<init>", "(Lr6/a;Lr6/a;Lr6/a;Lr6/c;)V", "Lr6/a;", "getCallbackForBack", "()Lr6/a;", "setCallbackForBack", "(Lr6/a;)V", "getCallbackForNoTime", "setCallbackForNoTime", "getCallbackForNoSupport", "setCallbackForNoSupport", "Lr6/c;", "getCallbackForConfirm", "()Lr6/c;", "setCallbackForConfirm", "(Lr6/c;)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BlackboardCropConfig {

    @Nullable
    private InterfaceC6469a callbackForBack;

    @Nullable
    private InterfaceC6471c callbackForConfirm;

    @Nullable
    private InterfaceC6469a callbackForNoSupport;

    @Nullable
    private InterfaceC6469a callbackForNoTime;

    public BlackboardCropConfig() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final InterfaceC6469a getCallbackForBack() {
        return this.callbackForBack;
    }

    @Nullable
    public final InterfaceC6471c getCallbackForConfirm() {
        return this.callbackForConfirm;
    }

    @Nullable
    public final InterfaceC6469a getCallbackForNoSupport() {
        return this.callbackForNoSupport;
    }

    @Nullable
    public final InterfaceC6469a getCallbackForNoTime() {
        return this.callbackForNoTime;
    }

    public final void setCallbackForBack(@Nullable InterfaceC6469a interfaceC6469a) {
        this.callbackForBack = interfaceC6469a;
    }

    public final void setCallbackForConfirm(@Nullable InterfaceC6471c interfaceC6471c) {
        this.callbackForConfirm = interfaceC6471c;
    }

    public final void setCallbackForNoSupport(@Nullable InterfaceC6469a interfaceC6469a) {
        this.callbackForNoSupport = interfaceC6469a;
    }

    public final void setCallbackForNoTime(@Nullable InterfaceC6469a interfaceC6469a) {
        this.callbackForNoTime = interfaceC6469a;
    }

    public BlackboardCropConfig(@Nullable InterfaceC6469a interfaceC6469a, @Nullable InterfaceC6469a interfaceC6469a2, @Nullable InterfaceC6469a interfaceC6469a3, @Nullable InterfaceC6471c interfaceC6471c) {
        this.callbackForBack = interfaceC6469a;
        this.callbackForNoTime = interfaceC6469a2;
        this.callbackForNoSupport = interfaceC6469a3;
        this.callbackForConfirm = interfaceC6471c;
    }

    public /* synthetic */ BlackboardCropConfig(InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6469a interfaceC6469a3, InterfaceC6471c interfaceC6471c, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? null : interfaceC6469a, (i & 2) != 0 ? null : interfaceC6469a2, (i & 4) != 0 ? null : interfaceC6469a3, (i & 8) != 0 ? null : interfaceC6471c);
    }
}
