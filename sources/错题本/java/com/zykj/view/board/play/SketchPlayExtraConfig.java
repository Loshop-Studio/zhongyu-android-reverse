package com.zykj.view.board.play;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0080\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0089\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\n2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0014R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0019R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001bR4\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b1\u0010\u001b¨\u00062"}, m5110d2 = {"Lcom/zykj/view/board/play/SketchPlayExtraConfig;", "", "", "showFullscreenButton", "autoHideSeekBar", "seekBarVisibleManually", "interceptWhenVideo", "Lkotlin/Function0;", "Ld6/s;", "onAutoHideAction", "Lkotlin/Function1;", "sketchTapAction", "Landroid/view/View;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "itself", "fullscreenClickListener", "<init>", "(ZZZZLr6/a;Lr6/c;Lr6/c;)V", "component1", "()Z", "component2", "component3", "component4", "component5", "()Lr6/a;", "component6", "()Lr6/c;", "component7", "copy", "(ZZZZLr6/a;Lr6/c;Lr6/c;)Lcom/zykj/view/board/play/SketchPlayExtraConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowFullscreenButton", "getAutoHideSeekBar", "getSeekBarVisibleManually", "getInterceptWhenVideo", "Lr6/a;", "getOnAutoHideAction", "Lr6/c;", "getSketchTapAction", "getFullscreenClickListener", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class SketchPlayExtraConfig {
    private final boolean autoHideSeekBar;

    @Nullable
    private final InterfaceC6471c fullscreenClickListener;
    private final boolean interceptWhenVideo;

    @Nullable
    private final InterfaceC6469a onAutoHideAction;
    private final boolean seekBarVisibleManually;
    private final boolean showFullscreenButton;

    @Nullable
    private final InterfaceC6471c sketchTapAction;

    public SketchPlayExtraConfig() {
        this(false, false, false, false, null, null, null, 127, null);
    }

    public static /* synthetic */ SketchPlayExtraConfig copy$default(SketchPlayExtraConfig sketchPlayExtraConfig, boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = sketchPlayExtraConfig.showFullscreenButton;
        }
        if ((i & 2) != 0) {
            z9 = sketchPlayExtraConfig.autoHideSeekBar;
        }
        if ((i & 4) != 0) {
            z10 = sketchPlayExtraConfig.seekBarVisibleManually;
        }
        if ((i & 8) != 0) {
            z11 = sketchPlayExtraConfig.interceptWhenVideo;
        }
        if ((i & 16) != 0) {
            interfaceC6469a = sketchPlayExtraConfig.onAutoHideAction;
        }
        if ((i & 32) != 0) {
            interfaceC6471c = sketchPlayExtraConfig.sketchTapAction;
        }
        if ((i & 64) != 0) {
            interfaceC6471c2 = sketchPlayExtraConfig.fullscreenClickListener;
        }
        InterfaceC6471c interfaceC6471c3 = interfaceC6471c;
        InterfaceC6471c interfaceC6471c4 = interfaceC6471c2;
        InterfaceC6469a interfaceC6469a2 = interfaceC6469a;
        boolean z12 = z10;
        return sketchPlayExtraConfig.copy(z8, z9, z12, z11, interfaceC6469a2, interfaceC6471c3, interfaceC6471c4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowFullscreenButton() {
        return this.showFullscreenButton;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAutoHideSeekBar() {
        return this.autoHideSeekBar;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSeekBarVisibleManually() {
        return this.seekBarVisibleManually;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInterceptWhenVideo() {
        return this.interceptWhenVideo;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final InterfaceC6469a getOnAutoHideAction() {
        return this.onAutoHideAction;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final InterfaceC6471c getSketchTapAction() {
        return this.sketchTapAction;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final InterfaceC6471c getFullscreenClickListener() {
        return this.fullscreenClickListener;
    }

    @NotNull
    public final SketchPlayExtraConfig copy(boolean showFullscreenButton, boolean autoHideSeekBar, boolean seekBarVisibleManually, boolean interceptWhenVideo, @Nullable InterfaceC6469a onAutoHideAction, @Nullable InterfaceC6471c sketchTapAction, @Nullable InterfaceC6471c fullscreenClickListener) {
        return new SketchPlayExtraConfig(showFullscreenButton, autoHideSeekBar, seekBarVisibleManually, interceptWhenVideo, onAutoHideAction, sketchTapAction, fullscreenClickListener);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SketchPlayExtraConfig)) {
            return false;
        }
        SketchPlayExtraConfig sketchPlayExtraConfig = (SketchPlayExtraConfig) other;
        return this.showFullscreenButton == sketchPlayExtraConfig.showFullscreenButton && this.autoHideSeekBar == sketchPlayExtraConfig.autoHideSeekBar && this.seekBarVisibleManually == sketchPlayExtraConfig.seekBarVisibleManually && this.interceptWhenVideo == sketchPlayExtraConfig.interceptWhenVideo && AbstractC5830k.m5325b(this.onAutoHideAction, sketchPlayExtraConfig.onAutoHideAction) && AbstractC5830k.m5325b(this.sketchTapAction, sketchPlayExtraConfig.sketchTapAction) && AbstractC5830k.m5325b(this.fullscreenClickListener, sketchPlayExtraConfig.fullscreenClickListener);
    }

    public final boolean getAutoHideSeekBar() {
        return this.autoHideSeekBar;
    }

    @Nullable
    public final InterfaceC6471c getFullscreenClickListener() {
        return this.fullscreenClickListener;
    }

    public final boolean getInterceptWhenVideo() {
        return this.interceptWhenVideo;
    }

    @Nullable
    public final InterfaceC6469a getOnAutoHideAction() {
        return this.onAutoHideAction;
    }

    public final boolean getSeekBarVisibleManually() {
        return this.seekBarVisibleManually;
    }

    public final boolean getShowFullscreenButton() {
        return this.showFullscreenButton;
    }

    @Nullable
    public final InterfaceC6471c getSketchTapAction() {
        return this.sketchTapAction;
    }

    public int hashCode() {
        int iM908i = AbstractC0584a.m908i(this.interceptWhenVideo, AbstractC0584a.m908i(this.seekBarVisibleManually, AbstractC0584a.m908i(this.autoHideSeekBar, Boolean.hashCode(this.showFullscreenButton) * 31, 31), 31), 31);
        InterfaceC6469a interfaceC6469a = this.onAutoHideAction;
        int iHashCode = (iM908i + (interfaceC6469a == null ? 0 : interfaceC6469a.hashCode())) * 31;
        InterfaceC6471c interfaceC6471c = this.sketchTapAction;
        int iHashCode2 = (iHashCode + (interfaceC6471c == null ? 0 : interfaceC6471c.hashCode())) * 31;
        InterfaceC6471c interfaceC6471c2 = this.fullscreenClickListener;
        return iHashCode2 + (interfaceC6471c2 != null ? interfaceC6471c2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        boolean z8 = this.showFullscreenButton;
        boolean z9 = this.autoHideSeekBar;
        boolean z10 = this.seekBarVisibleManually;
        boolean z11 = this.interceptWhenVideo;
        InterfaceC6469a interfaceC6469a = this.onAutoHideAction;
        InterfaceC6471c interfaceC6471c = this.sketchTapAction;
        InterfaceC6471c interfaceC6471c2 = this.fullscreenClickListener;
        StringBuilder sb = new StringBuilder("SketchPlayExtraConfig(showFullscreenButton=");
        sb.append(z8);
        sb.append(", autoHideSeekBar=");
        sb.append(z9);
        sb.append(", seekBarVisibleManually=");
        AbstractC1923c.m1058v(", interceptWhenVideo=", ", onAutoHideAction=", sb, z10, z11);
        sb.append(interfaceC6469a);
        sb.append(", sketchTapAction=");
        sb.append(interfaceC6471c);
        sb.append(", fullscreenClickListener=");
        sb.append(interfaceC6471c2);
        sb.append(")");
        return sb.toString();
    }

    public SketchPlayExtraConfig(boolean z8, boolean z9, boolean z10, boolean z11, @Nullable InterfaceC6469a interfaceC6469a, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2) {
        this.showFullscreenButton = z8;
        this.autoHideSeekBar = z9;
        this.seekBarVisibleManually = z10;
        this.interceptWhenVideo = z11;
        this.onAutoHideAction = interfaceC6469a;
        this.sketchTapAction = interfaceC6471c;
        this.fullscreenClickListener = interfaceC6471c2;
    }

    public /* synthetic */ SketchPlayExtraConfig(boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? false : z9, (i & 4) != 0 ? true : z10, (i & 8) != 0 ? false : z11, (i & 16) != 0 ? null : interfaceC6469a, (i & 32) != 0 ? null : interfaceC6471c, (i & 64) != 0 ? null : interfaceC6471c2);
    }
}
