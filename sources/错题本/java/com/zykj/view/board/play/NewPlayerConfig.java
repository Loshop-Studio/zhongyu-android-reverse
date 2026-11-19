package com.zykj.view.board.play;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0011\u0010\u0016\"\u0004\b2\u0010\u0018¨\u00063"}, m5110d2 = {"Lcom/zykj/view/board/play/NewPlayerConfig;", "", "", "needRecord", "Lkotlin/Function0;", "Ld6/s;", "callbackForBack", "callbackForRecord", "needDelete", "callbackForDelete", "", "Lcom/zykj/view/board/play/PlayerConfigSetting;", "extrasForSetting", "callbackFor", "Lcom/zykj/view/board/play/PlayActionListener;", "playActionListener", "needBack", "isMoveReset", "<init>", "(ZLr6/a;Lr6/a;ZLr6/a;Ljava/util/List;Lr6/a;Lcom/zykj/view/board/play/PlayActionListener;ZZ)V", "Z", "getNeedRecord", "()Z", "setNeedRecord", "(Z)V", "Lr6/a;", "getCallbackForBack", "()Lr6/a;", "setCallbackForBack", "(Lr6/a;)V", "getCallbackForRecord", "setCallbackForRecord", "getNeedDelete", "setNeedDelete", "getCallbackForDelete", "setCallbackForDelete", "Ljava/util/List;", "getExtrasForSetting", "()Ljava/util/List;", "setExtrasForSetting", "(Ljava/util/List;)V", "getCallbackFor", "setCallbackFor", "Lcom/zykj/view/board/play/PlayActionListener;", "getPlayActionListener", "()Lcom/zykj/view/board/play/PlayActionListener;", "setPlayActionListener", "(Lcom/zykj/view/board/play/PlayActionListener;)V", "getNeedBack", "setNeedBack", "setMoveReset", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class NewPlayerConfig {

    @Nullable
    private InterfaceC6469a callbackFor;

    @Nullable
    private InterfaceC6469a callbackForBack;

    @Nullable
    private InterfaceC6469a callbackForDelete;

    @Nullable
    private InterfaceC6469a callbackForRecord;

    @NotNull
    private List<PlayerConfigSetting> extrasForSetting;
    private boolean isMoveReset;
    private boolean needBack;
    private boolean needDelete;
    private boolean needRecord;

    @Nullable
    private PlayActionListener playActionListener;

    public NewPlayerConfig() {
        this(false, null, null, false, null, null, null, null, false, false, 1023, null);
    }

    @Nullable
    public final InterfaceC6469a getCallbackFor() {
        return this.callbackFor;
    }

    @Nullable
    public final InterfaceC6469a getCallbackForBack() {
        return this.callbackForBack;
    }

    @Nullable
    public final InterfaceC6469a getCallbackForDelete() {
        return this.callbackForDelete;
    }

    @Nullable
    public final InterfaceC6469a getCallbackForRecord() {
        return this.callbackForRecord;
    }

    @NotNull
    public final List<PlayerConfigSetting> getExtrasForSetting() {
        return this.extrasForSetting;
    }

    public final boolean getNeedBack() {
        return this.needBack;
    }

    public final boolean getNeedDelete() {
        return this.needDelete;
    }

    public final boolean getNeedRecord() {
        return this.needRecord;
    }

    @Nullable
    public final PlayActionListener getPlayActionListener() {
        return this.playActionListener;
    }

    /* renamed from: isMoveReset, reason: from getter */
    public final boolean getIsMoveReset() {
        return this.isMoveReset;
    }

    public final void setCallbackFor(@Nullable InterfaceC6469a interfaceC6469a) {
        this.callbackFor = interfaceC6469a;
    }

    public final void setCallbackForBack(@Nullable InterfaceC6469a interfaceC6469a) {
        this.callbackForBack = interfaceC6469a;
    }

    public final void setCallbackForDelete(@Nullable InterfaceC6469a interfaceC6469a) {
        this.callbackForDelete = interfaceC6469a;
    }

    public final void setCallbackForRecord(@Nullable InterfaceC6469a interfaceC6469a) {
        this.callbackForRecord = interfaceC6469a;
    }

    public final void setExtrasForSetting(@NotNull List<PlayerConfigSetting> list) {
        AbstractC5830k.m5330g(list, "<set-?>");
        this.extrasForSetting = list;
    }

    public final void setMoveReset(boolean z8) {
        this.isMoveReset = z8;
    }

    public final void setNeedBack(boolean z8) {
        this.needBack = z8;
    }

    public final void setNeedDelete(boolean z8) {
        this.needDelete = z8;
    }

    public final void setNeedRecord(boolean z8) {
        this.needRecord = z8;
    }

    public final void setPlayActionListener(@Nullable PlayActionListener playActionListener) {
        this.playActionListener = playActionListener;
    }

    public NewPlayerConfig(boolean z8, @Nullable InterfaceC6469a interfaceC6469a, @Nullable InterfaceC6469a interfaceC6469a2, boolean z9, @Nullable InterfaceC6469a interfaceC6469a3, @NotNull List<PlayerConfigSetting> extrasForSetting, @Nullable InterfaceC6469a interfaceC6469a4, @Nullable PlayActionListener playActionListener, boolean z10, boolean z11) {
        AbstractC5830k.m5330g(extrasForSetting, "extrasForSetting");
        this.needRecord = z8;
        this.callbackForBack = interfaceC6469a;
        this.callbackForRecord = interfaceC6469a2;
        this.needDelete = z9;
        this.callbackForDelete = interfaceC6469a3;
        this.extrasForSetting = extrasForSetting;
        this.callbackFor = interfaceC6469a4;
        this.playActionListener = playActionListener;
        this.needBack = z10;
        this.isMoveReset = z11;
    }

    public /* synthetic */ NewPlayerConfig(boolean z8, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, boolean z9, InterfaceC6469a interfaceC6469a3, List list, InterfaceC6469a interfaceC6469a4, PlayActionListener playActionListener, boolean z10, boolean z11, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? null : interfaceC6469a, (i & 4) != 0 ? null : interfaceC6469a2, (i & 8) != 0 ? false : z9, (i & 16) != 0 ? null : interfaceC6469a3, (i & 32) != 0 ? new ArrayList() : list, (i & 64) != 0 ? null : interfaceC6469a4, (i & 128) != 0 ? null : playActionListener, (i & 256) != 0 ? false : z10, (i & 512) != 0 ? false : z11);
    }
}
