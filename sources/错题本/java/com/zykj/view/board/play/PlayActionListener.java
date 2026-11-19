package com.zykj.view.board.play;

import android.view.C2766k;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.feature.notebook.list.C4959k1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u00002\u00020\u0001B]\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\r\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, m5110d2 = {"Lcom/zykj/view/board/play/PlayActionListener;", "", "Lkotlin/Function0;", "Ld6/s;", "callbackForStart", "callbackForResume", "Lkotlin/Function1;", "", "callbackForRunning", "callbackForPause", "callbackForEnd", "<init>", "(Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;)V", "Lr6/a;", "getCallbackForStart", "()Lr6/a;", "setCallbackForStart", "(Lr6/a;)V", "getCallbackForResume", "setCallbackForResume", "Lr6/c;", "getCallbackForRunning", "()Lr6/c;", "setCallbackForRunning", "(Lr6/c;)V", "getCallbackForPause", "setCallbackForPause", "getCallbackForEnd", "setCallbackForEnd", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PlayActionListener {

    @NotNull
    private InterfaceC6469a callbackForEnd;

    @NotNull
    private InterfaceC6469a callbackForPause;

    @NotNull
    private InterfaceC6469a callbackForResume;

    @NotNull
    private InterfaceC6471c callbackForRunning;

    @NotNull
    private InterfaceC6469a callbackForStart;

    public PlayActionListener() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s _init_$lambda$2(long j7) {
        return C5443s.f8405a;
    }

    @NotNull
    public final InterfaceC6469a getCallbackForEnd() {
        return this.callbackForEnd;
    }

    @NotNull
    public final InterfaceC6469a getCallbackForPause() {
        return this.callbackForPause;
    }

    @NotNull
    public final InterfaceC6469a getCallbackForResume() {
        return this.callbackForResume;
    }

    @NotNull
    public final InterfaceC6471c getCallbackForRunning() {
        return this.callbackForRunning;
    }

    @NotNull
    public final InterfaceC6469a getCallbackForStart() {
        return this.callbackForStart;
    }

    public final void setCallbackForEnd(@NotNull InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5330g(interfaceC6469a, "<set-?>");
        this.callbackForEnd = interfaceC6469a;
    }

    public final void setCallbackForPause(@NotNull InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5330g(interfaceC6469a, "<set-?>");
        this.callbackForPause = interfaceC6469a;
    }

    public final void setCallbackForResume(@NotNull InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5330g(interfaceC6469a, "<set-?>");
        this.callbackForResume = interfaceC6469a;
    }

    public final void setCallbackForRunning(@NotNull InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(interfaceC6471c, "<set-?>");
        this.callbackForRunning = interfaceC6471c;
    }

    public final void setCallbackForStart(@NotNull InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5330g(interfaceC6469a, "<set-?>");
        this.callbackForStart = interfaceC6469a;
    }

    public PlayActionListener(@NotNull InterfaceC6469a callbackForStart, @NotNull InterfaceC6469a callbackForResume, @NotNull InterfaceC6471c callbackForRunning, @NotNull InterfaceC6469a callbackForPause, @NotNull InterfaceC6469a callbackForEnd) {
        AbstractC5830k.m5330g(callbackForStart, "callbackForStart");
        AbstractC5830k.m5330g(callbackForResume, "callbackForResume");
        AbstractC5830k.m5330g(callbackForRunning, "callbackForRunning");
        AbstractC5830k.m5330g(callbackForPause, "callbackForPause");
        AbstractC5830k.m5330g(callbackForEnd, "callbackForEnd");
        this.callbackForStart = callbackForStart;
        this.callbackForResume = callbackForResume;
        this.callbackForRunning = callbackForRunning;
        this.callbackForPause = callbackForPause;
        this.callbackForEnd = callbackForEnd;
    }

    public /* synthetic */ PlayActionListener(InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a3, InterfaceC6469a interfaceC6469a4, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? new C2766k(24) : interfaceC6469a, (i & 2) != 0 ? new C2766k(25) : interfaceC6469a2, (i & 4) != 0 ? new C4959k1(20) : interfaceC6471c, (i & 8) != 0 ? new C2766k(26) : interfaceC6469a3, (i & 16) != 0 ? new C2766k(27) : interfaceC6469a4);
    }
}
