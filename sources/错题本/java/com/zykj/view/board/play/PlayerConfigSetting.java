package com.zykj.view.board.play;

import android.view.C2766k;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m5110d2 = {"Lcom/zykj/view/board/play/PlayerConfigSetting;", "", "", "drawableId", "", "displayText", "Lkotlin/Function0;", "Ld6/s;", "clickCallback", "<init>", "(ILjava/lang/String;Lr6/a;)V", "I", "getDrawableId", "()I", "setDrawableId", "(I)V", "Ljava/lang/String;", "getDisplayText", "()Ljava/lang/String;", "setDisplayText", "(Ljava/lang/String;)V", "Lr6/a;", "getClickCallback", "()Lr6/a;", "setClickCallback", "(Lr6/a;)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PlayerConfigSetting {

    @NotNull
    private InterfaceC6469a clickCallback;

    @NotNull
    private String displayText;
    private int drawableId;

    public PlayerConfigSetting() {
        this(0, null, null, 7, null);
    }

    @NotNull
    public final InterfaceC6469a getClickCallback() {
        return this.clickCallback;
    }

    @NotNull
    public final String getDisplayText() {
        return this.displayText;
    }

    public final int getDrawableId() {
        return this.drawableId;
    }

    public final void setClickCallback(@NotNull InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5330g(interfaceC6469a, "<set-?>");
        this.clickCallback = interfaceC6469a;
    }

    public final void setDisplayText(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.displayText = str;
    }

    public final void setDrawableId(int i) {
        this.drawableId = i;
    }

    public PlayerConfigSetting(int i, @NotNull String displayText, @NotNull InterfaceC6469a clickCallback) {
        AbstractC5830k.m5330g(displayText, "displayText");
        AbstractC5830k.m5330g(clickCallback, "clickCallback");
        this.drawableId = i;
        this.displayText = displayText;
        this.clickCallback = clickCallback;
    }

    public /* synthetic */ PlayerConfigSetting(int i, String str, InterfaceC6469a interfaceC6469a, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? -1 : i, (i8 & 2) != 0 ? "" : str, (i8 & 4) != 0 ? new C2766k(28) : interfaceC6469a);
    }
}
