.class public final Lcom/zykj/view/utils/ExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\u0005*\u00020\u00082\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0019\u0010\u000f\u001a\u00020\t*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001aG\u0010\u0017\u001a\u00020\u0005*\u00020\u00112\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\t\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a\u001d\u0010\u001f\u001a\u00020\u0005*\u00020\u001c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 \u001a\u001d\u0010$\u001a\u00020\u0005*\u00020!2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u0007\u00a2\u0006\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Landroid/view/View;",
        "",
        "duration",
        "Landroid/view/View$OnClickListener;",
        "listener",
        "Ld6/s;",
        "singleClick",
        "(Landroid/view/View;JLandroid/view/View$OnClickListener;)V",
        "Landroid/widget/RadioGroup;",
        "",
        "index",
        "checkAt",
        "(Landroid/widget/RadioGroup;I)V",
        "",
        "alpha",
        "withAlpha",
        "(IF)I",
        "Lcom/zykj/view/widget/SketchProgressView;",
        "Lkotlin/Function0;",
        "onTouchStart",
        "Lkotlin/Function1;",
        "onProgress",
        "onTouchEnd",
        "setProgressListener",
        "(Lcom/zykj/view/widget/SketchProgressView;Lr6/a;Lr6/c;Lr6/c;)V",
        "Lcom/zykj/view/board/board/PenColor;",
        "toPenColor",
        "(I)Lcom/zykj/view/board/board/PenColor;",
        "Lcom/zykj/view/widget/radio/CustomColorRadioButton;",
        "",
        "color",
        "setCustomColor",
        "(Lcom/zykj/view/widget/radio/CustomColorRadioButton;Ljava/lang/String;)V",
        "Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;",
        "",
        "isLight",
        "setLight",
        "(Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;Ljava/lang/Boolean;)V",
        "view_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ext.kt\ncom/zykj/view/utils/ExtKt\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,70:1\n404#2:71\n*S KotlinDebug\n*F\n+ 1 Ext.kt\ncom/zykj/view/utils/ExtKt\n*L\n64#1:71\n*E\n"
    }
.end annotation


# direct methods
.method public static final checkAt(Landroid/widget/RadioGroup;I)V
    .locals 1
    .param p0    # Landroid/widget/RadioGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string p1, "null cannot be cast to non-null type android.widget.RadioButton"

    .line 11
    .line 12
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p0, Landroid/widget/RadioButton;

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final setCustomColor(Lcom/zykj/view/widget/radio/CustomColorRadioButton;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/zykj/view/widget/radio/CustomColorRadioButton;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "customColor"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/radio/CustomColorRadioButton;->setColor(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final setLight(Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;Ljava/lang/Boolean;)V
    .locals 1
    .param p0    # Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroidx/databinding/BindingAdapter;
        value = {
            "isLight"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x1

    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->setBackgroundLight(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final setProgressListener(Lcom/zykj/view/widget/SketchProgressView;Lr6/a;Lr6/c;Lr6/c;)V
    .locals 1
    .param p0    # Lcom/zykj/view/widget/SketchProgressView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/widget/SketchProgressView;",
            "Lr6/a;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onTouchStart"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onProgress"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onTouchEnd"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/zykj/view/utils/ExtKt$setProgressListener$1;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/view/utils/ExtKt$setProgressListener$1;-><init>(Lr6/a;Lr6/c;Lr6/c;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/zykj/view/widget/SketchProgressView;->setProgressListener(Lcom/zykj/view/widget/SketchProgressView$ProgressListener;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final singleClick(Landroid/view/View;JLandroid/view/View$OnClickListener;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/view/View$OnClickListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listener"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    filled-new-array {p0}, [Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x0

    .line 16
    aget-object p0, p0, v0

    .line 17
    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance v0, Lcom/blankj/utilcode/util/b;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2, p3}, Lcom/blankj/utilcode/util/b;-><init>(JLandroid/view/View$OnClickListener;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static synthetic singleClick$default(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const-wide/16 p1, 0x1f4

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/view/utils/ExtKt;->singleClick(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final toPenColor(I)Lcom/zykj/view/board/board/PenColor;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/board/board/PenColor$ColorBlack;->INSTANCE:Lcom/zykj/view/board/board/PenColor$ColorBlack;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, Lcom/zykj/view/board/board/PenColor$ColorWhite;->INSTANCE:Lcom/zykj/view/board/board/PenColor$ColorWhite;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne p0, v1, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    sget-object v0, Lcom/zykj/view/board/board/PenColor$ColorRed;->INSTANCE:Lcom/zykj/view/board/board/PenColor$ColorRed;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ne p0, v1, :cond_2

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_2
    new-instance v0, Lcom/zykj/view/board/board/PenColor$ColorCustom;

    .line 29
    .line 30
    sget-object v1, Lcom/zykj/view/utils/CustomColorManager;->INSTANCE:Lcom/zykj/view/utils/CustomColorManager;

    .line 31
    .line 32
    invoke-virtual {v1, p0}, Lcom/zykj/view/utils/CustomColorManager;->isColorExist(I)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    const/4 p0, 0x0

    .line 40
    :goto_0
    invoke-direct {v0, p0}, Lcom/zykj/view/board/board/PenColor$ColorCustom;-><init>(I)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public static final withAlpha(IF)I
    .locals 1

    const v0, 0xffffff

    and-int/2addr p0, v0

    const/16 v0, 0xff

    int-to-float v0, v0

    mul-float/2addr p1, v0

    float-to-int p1, p1

    shl-int/lit8 p1, p1, 0x18

    or-int/2addr p0, p1

    return p0
.end method
