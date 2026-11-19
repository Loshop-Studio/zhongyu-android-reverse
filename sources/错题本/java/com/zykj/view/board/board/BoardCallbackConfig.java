package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BË\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012,\b\u0002\u0010\u000b\u001a&\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a&\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ$\u0010 \u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ$\u0010!\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ \u0010\"\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010$J\u001e\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u001e\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u001e\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJÔ\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042,\b\u0002\u0010\u000b\u001a&\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001aR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u001cR;\u0010\u000b\u001a&\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001eR'\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b:\u0010\u001cR+\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b;\u0010\u001cR+\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b<\u0010\u001cR'\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b=\u0010\u001cR\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010$R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b@\u0010$R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\bA\u0010\u001cR%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\bB\u0010\u001cR%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\bC\u0010\u001cR%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\bD\u0010\u001c¨\u0006E"}, m5110d2 = {"Lcom/zykj/view/board/board/BoardCallbackConfig;", "", "", "needLoading", "Lkotlin/Function1;", "Landroid/view/View;", "Ld6/s;", "onBackClick", "Lkotlin/Function2;", "Lkotlin/Function0;", "Lh6/c;", "onCommitClick", "", "onPreviewClick", "onCameraClick", "onGalleryClick", "onCropClick", "onInitFinished", "onLoadFailed", "onAddCameraImage", "onAddGalleryImage", "onImageDelete", "onErrorReport", "<init>", "(ZLr6/c;Lr6/e;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/a;Lr6/a;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V", "component1", "()Z", "component2", "()Lr6/c;", "component3", "()Lr6/e;", "component4", "component5", "component6", "component7", "component8", "()Lr6/a;", "component9", "component10", "component11", "component12", "component13", "copy", "(ZLr6/c;Lr6/e;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/a;Lr6/a;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)Lcom/zykj/view/board/board/BoardCallbackConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getNeedLoading", "Lr6/c;", "getOnBackClick", "Lr6/e;", "getOnCommitClick", "getOnPreviewClick", "getOnCameraClick", "getOnGalleryClick", "getOnCropClick", "Lr6/a;", "getOnInitFinished", "getOnLoadFailed", "getOnAddCameraImage", "getOnAddGalleryImage", "getOnImageDelete", "getOnErrorReport", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class BoardCallbackConfig {
    private final boolean needLoading;

    @Nullable
    private final InterfaceC6471c onAddCameraImage;

    @Nullable
    private final InterfaceC6471c onAddGalleryImage;

    @Nullable
    private final InterfaceC6471c onBackClick;

    @Nullable
    private final InterfaceC6471c onCameraClick;

    @Nullable
    private final InterfaceC6473e onCommitClick;

    @Nullable
    private final InterfaceC6471c onCropClick;

    @Nullable
    private final InterfaceC6471c onErrorReport;

    @Nullable
    private final InterfaceC6471c onGalleryClick;

    @Nullable
    private final InterfaceC6471c onImageDelete;

    @Nullable
    private final InterfaceC6469a onInitFinished;

    @Nullable
    private final InterfaceC6469a onLoadFailed;

    @Nullable
    private final InterfaceC6471c onPreviewClick;

    public BoardCallbackConfig() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ BoardCallbackConfig copy$default(BoardCallbackConfig boardCallbackConfig, boolean z8, InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6471c interfaceC6471c6, InterfaceC6471c interfaceC6471c7, InterfaceC6471c interfaceC6471c8, InterfaceC6471c interfaceC6471c9, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = boardCallbackConfig.needLoading;
        }
        return boardCallbackConfig.copy(z8, (i & 2) != 0 ? boardCallbackConfig.onBackClick : interfaceC6471c, (i & 4) != 0 ? boardCallbackConfig.onCommitClick : interfaceC6473e, (i & 8) != 0 ? boardCallbackConfig.onPreviewClick : interfaceC6471c2, (i & 16) != 0 ? boardCallbackConfig.onCameraClick : interfaceC6471c3, (i & 32) != 0 ? boardCallbackConfig.onGalleryClick : interfaceC6471c4, (i & 64) != 0 ? boardCallbackConfig.onCropClick : interfaceC6471c5, (i & 128) != 0 ? boardCallbackConfig.onInitFinished : interfaceC6469a, (i & 256) != 0 ? boardCallbackConfig.onLoadFailed : interfaceC6469a2, (i & 512) != 0 ? boardCallbackConfig.onAddCameraImage : interfaceC6471c6, (i & 1024) != 0 ? boardCallbackConfig.onAddGalleryImage : interfaceC6471c7, (i & 2048) != 0 ? boardCallbackConfig.onImageDelete : interfaceC6471c8, (i & 4096) != 0 ? boardCallbackConfig.onErrorReport : interfaceC6471c9);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getNeedLoading() {
        return this.needLoading;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final InterfaceC6471c getOnAddCameraImage() {
        return this.onAddCameraImage;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final InterfaceC6471c getOnAddGalleryImage() {
        return this.onAddGalleryImage;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final InterfaceC6471c getOnImageDelete() {
        return this.onImageDelete;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final InterfaceC6471c getOnErrorReport() {
        return this.onErrorReport;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final InterfaceC6471c getOnBackClick() {
        return this.onBackClick;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final InterfaceC6473e getOnCommitClick() {
        return this.onCommitClick;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final InterfaceC6471c getOnPreviewClick() {
        return this.onPreviewClick;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final InterfaceC6471c getOnCameraClick() {
        return this.onCameraClick;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final InterfaceC6471c getOnGalleryClick() {
        return this.onGalleryClick;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final InterfaceC6471c getOnCropClick() {
        return this.onCropClick;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final InterfaceC6469a getOnInitFinished() {
        return this.onInitFinished;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final InterfaceC6469a getOnLoadFailed() {
        return this.onLoadFailed;
    }

    @NotNull
    public final BoardCallbackConfig copy(boolean needLoading, @Nullable InterfaceC6471c onBackClick, @Nullable InterfaceC6473e onCommitClick, @Nullable InterfaceC6471c onPreviewClick, @Nullable InterfaceC6471c onCameraClick, @Nullable InterfaceC6471c onGalleryClick, @Nullable InterfaceC6471c onCropClick, @Nullable InterfaceC6469a onInitFinished, @Nullable InterfaceC6469a onLoadFailed, @Nullable InterfaceC6471c onAddCameraImage, @Nullable InterfaceC6471c onAddGalleryImage, @Nullable InterfaceC6471c onImageDelete, @Nullable InterfaceC6471c onErrorReport) {
        return new BoardCallbackConfig(needLoading, onBackClick, onCommitClick, onPreviewClick, onCameraClick, onGalleryClick, onCropClick, onInitFinished, onLoadFailed, onAddCameraImage, onAddGalleryImage, onImageDelete, onErrorReport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardCallbackConfig)) {
            return false;
        }
        BoardCallbackConfig boardCallbackConfig = (BoardCallbackConfig) other;
        return this.needLoading == boardCallbackConfig.needLoading && AbstractC5830k.m5325b(this.onBackClick, boardCallbackConfig.onBackClick) && AbstractC5830k.m5325b(this.onCommitClick, boardCallbackConfig.onCommitClick) && AbstractC5830k.m5325b(this.onPreviewClick, boardCallbackConfig.onPreviewClick) && AbstractC5830k.m5325b(this.onCameraClick, boardCallbackConfig.onCameraClick) && AbstractC5830k.m5325b(this.onGalleryClick, boardCallbackConfig.onGalleryClick) && AbstractC5830k.m5325b(this.onCropClick, boardCallbackConfig.onCropClick) && AbstractC5830k.m5325b(this.onInitFinished, boardCallbackConfig.onInitFinished) && AbstractC5830k.m5325b(this.onLoadFailed, boardCallbackConfig.onLoadFailed) && AbstractC5830k.m5325b(this.onAddCameraImage, boardCallbackConfig.onAddCameraImage) && AbstractC5830k.m5325b(this.onAddGalleryImage, boardCallbackConfig.onAddGalleryImage) && AbstractC5830k.m5325b(this.onImageDelete, boardCallbackConfig.onImageDelete) && AbstractC5830k.m5325b(this.onErrorReport, boardCallbackConfig.onErrorReport);
    }

    public final boolean getNeedLoading() {
        return this.needLoading;
    }

    @Nullable
    public final InterfaceC6471c getOnAddCameraImage() {
        return this.onAddCameraImage;
    }

    @Nullable
    public final InterfaceC6471c getOnAddGalleryImage() {
        return this.onAddGalleryImage;
    }

    @Nullable
    public final InterfaceC6471c getOnBackClick() {
        return this.onBackClick;
    }

    @Nullable
    public final InterfaceC6471c getOnCameraClick() {
        return this.onCameraClick;
    }

    @Nullable
    public final InterfaceC6473e getOnCommitClick() {
        return this.onCommitClick;
    }

    @Nullable
    public final InterfaceC6471c getOnCropClick() {
        return this.onCropClick;
    }

    @Nullable
    public final InterfaceC6471c getOnErrorReport() {
        return this.onErrorReport;
    }

    @Nullable
    public final InterfaceC6471c getOnGalleryClick() {
        return this.onGalleryClick;
    }

    @Nullable
    public final InterfaceC6471c getOnImageDelete() {
        return this.onImageDelete;
    }

    @Nullable
    public final InterfaceC6469a getOnInitFinished() {
        return this.onInitFinished;
    }

    @Nullable
    public final InterfaceC6469a getOnLoadFailed() {
        return this.onLoadFailed;
    }

    @Nullable
    public final InterfaceC6471c getOnPreviewClick() {
        return this.onPreviewClick;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.needLoading) * 31;
        InterfaceC6471c interfaceC6471c = this.onBackClick;
        int iHashCode2 = (iHashCode + (interfaceC6471c == null ? 0 : interfaceC6471c.hashCode())) * 31;
        InterfaceC6473e interfaceC6473e = this.onCommitClick;
        int iHashCode3 = (iHashCode2 + (interfaceC6473e == null ? 0 : interfaceC6473e.hashCode())) * 31;
        InterfaceC6471c interfaceC6471c2 = this.onPreviewClick;
        int iHashCode4 = (iHashCode3 + (interfaceC6471c2 == null ? 0 : interfaceC6471c2.hashCode())) * 31;
        InterfaceC6471c interfaceC6471c3 = this.onCameraClick;
        int iHashCode5 = (iHashCode4 + (interfaceC6471c3 == null ? 0 : interfaceC6471c3.hashCode())) * 31;
        InterfaceC6471c interfaceC6471c4 = this.onGalleryClick;
        int iHashCode6 = (iHashCode5 + (interfaceC6471c4 == null ? 0 : interfaceC6471c4.hashCode())) * 31;
        InterfaceC6471c interfaceC6471c5 = this.onCropClick;
        int iHashCode7 = (iHashCode6 + (interfaceC6471c5 == null ? 0 : interfaceC6471c5.hashCode())) * 31;
        InterfaceC6469a interfaceC6469a = this.onInitFinished;
        int iHashCode8 = (iHashCode7 + (interfaceC6469a == null ? 0 : interfaceC6469a.hashCode())) * 31;
        InterfaceC6469a interfaceC6469a2 = this.onLoadFailed;
        int iHashCode9 = (iHashCode8 + (interfaceC6469a2 == null ? 0 : interfaceC6469a2.hashCode())) * 31;
        InterfaceC6471c interfaceC6471c6 = this.onAddCameraImage;
        int iHashCode10 = (iHashCode9 + (interfaceC6471c6 == null ? 0 : interfaceC6471c6.hashCode())) * 31;
        InterfaceC6471c interfaceC6471c7 = this.onAddGalleryImage;
        int iHashCode11 = (iHashCode10 + (interfaceC6471c7 == null ? 0 : interfaceC6471c7.hashCode())) * 31;
        InterfaceC6471c interfaceC6471c8 = this.onImageDelete;
        int iHashCode12 = (iHashCode11 + (interfaceC6471c8 == null ? 0 : interfaceC6471c8.hashCode())) * 31;
        InterfaceC6471c interfaceC6471c9 = this.onErrorReport;
        return iHashCode12 + (interfaceC6471c9 != null ? interfaceC6471c9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BoardCallbackConfig(needLoading=" + this.needLoading + ", onBackClick=" + this.onBackClick + ", onCommitClick=" + this.onCommitClick + ", onPreviewClick=" + this.onPreviewClick + ", onCameraClick=" + this.onCameraClick + ", onGalleryClick=" + this.onGalleryClick + ", onCropClick=" + this.onCropClick + ", onInitFinished=" + this.onInitFinished + ", onLoadFailed=" + this.onLoadFailed + ", onAddCameraImage=" + this.onAddCameraImage + ", onAddGalleryImage=" + this.onAddGalleryImage + ", onImageDelete=" + this.onImageDelete + ", onErrorReport=" + this.onErrorReport + ")";
    }

    public BoardCallbackConfig(boolean z8, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6473e interfaceC6473e, @Nullable InterfaceC6471c interfaceC6471c2, @Nullable InterfaceC6471c interfaceC6471c3, @Nullable InterfaceC6471c interfaceC6471c4, @Nullable InterfaceC6471c interfaceC6471c5, @Nullable InterfaceC6469a interfaceC6469a, @Nullable InterfaceC6469a interfaceC6469a2, @Nullable InterfaceC6471c interfaceC6471c6, @Nullable InterfaceC6471c interfaceC6471c7, @Nullable InterfaceC6471c interfaceC6471c8, @Nullable InterfaceC6471c interfaceC6471c9) {
        this.needLoading = z8;
        this.onBackClick = interfaceC6471c;
        this.onCommitClick = interfaceC6473e;
        this.onPreviewClick = interfaceC6471c2;
        this.onCameraClick = interfaceC6471c3;
        this.onGalleryClick = interfaceC6471c4;
        this.onCropClick = interfaceC6471c5;
        this.onInitFinished = interfaceC6469a;
        this.onLoadFailed = interfaceC6469a2;
        this.onAddCameraImage = interfaceC6471c6;
        this.onAddGalleryImage = interfaceC6471c7;
        this.onImageDelete = interfaceC6471c8;
        this.onErrorReport = interfaceC6471c9;
    }

    public /* synthetic */ BoardCallbackConfig(boolean z8, InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6471c interfaceC6471c6, InterfaceC6471c interfaceC6471c7, InterfaceC6471c interfaceC6471c8, InterfaceC6471c interfaceC6471c9, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? true : z8, (i & 2) != 0 ? null : interfaceC6471c, (i & 4) != 0 ? null : interfaceC6473e, (i & 8) != 0 ? null : interfaceC6471c2, (i & 16) != 0 ? null : interfaceC6471c3, (i & 32) != 0 ? null : interfaceC6471c4, (i & 64) != 0 ? null : interfaceC6471c5, (i & 128) != 0 ? null : interfaceC6469a, (i & 256) != 0 ? null : interfaceC6469a2, (i & 512) != 0 ? null : interfaceC6471c6, (i & 1024) != 0 ? null : interfaceC6471c7, (i & 2048) != 0 ? null : interfaceC6471c8, (i & 4096) != 0 ? null : interfaceC6471c9);
    }
}
