.class public final Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "",
        "isLight",
        "",
        "setBackgroundLight",
        "(Z)V",
        "c",
        "()V",
        "Lkotlin/Function1;",
        "a",
        "Lkotlin/jvm/functions/Function1;",
        "getOnColorChangeListener",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnColorChangeListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onColorChangeListener",
        "value",
        "getSelectColor",
        "()Ljava/lang/Integer;",
        "setSelectColor",
        "(Ljava/lang/Integer;)V",
        "selectColor",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCustomColorFrameLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomColorFrameLayout.kt\ncom/zykj/view/widget/customColor/CustomColorFrameLayout\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,65:1\n404#2:66\n404#2:67\n*S KotlinDebug\n*F\n+ 1 CustomColorFrameLayout.kt\ncom/zykj/view/widget/customColor/CustomColorFrameLayout\n*L\n56#1:66\n58#1:67\n*E\n"
    }
.end annotation


# instance fields
.field public a:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x0

    .line 5
    invoke-static {p1, p0, p2}, Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object p2, p1, Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;->a:Lcom/zykj/view/widget/customColor/CustomColorLayout;

    new-instance p3, Ln7/a;

    invoke-direct {p3, p1, p0}, Ln7/a;-><init>(Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;)V

    invoke-virtual {p2, p3}, Lcom/zykj/view/widget/customColor/CustomColorLayout;->setOnColorChangeListener(Lkotlin/jvm/functions/Function1;)V

    .line 7
    iget-object p2, p1, Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;->b:Lcom/zykj/view/widget/customColor/LatestColorLayout;

    new-instance p3, Ln7/b;

    invoke-direct {p3, p1, p0}, Ln7/b;-><init>(Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;)V

    invoke-virtual {p2, p3}, Lcom/zykj/view/widget/customColor/LatestColorLayout;->setOnColorChangeListener(Lkotlin/jvm/functions/Function1;)V

    .line 8
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static a(Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;I)Lkotlin/Unit;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;->b:Lcom/zykj/view/widget/customColor/LatestColorLayout;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lcom/zykj/view/widget/customColor/LatestColorLayout;->setSelectColor(Ljava/lang/Integer;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p1, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->a:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method

.method public static b(Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;I)Lkotlin/Unit;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewIncludeCustomColorBinding;->a:Lcom/zykj/view/widget/customColor/CustomColorLayout;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lcom/zykj/view/widget/customColor/CustomColorLayout;->setSelectColor(Ljava/lang/Integer;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p1, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->a:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method


# virtual methods
.method public final c()V
    .locals 1

    .line 1
    sget v0, Lcom/zykj/view/R$id;->latestColor:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/widget/customColor/LatestColorLayout;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/view/widget/customColor/LatestColorLayout;->e()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final getOnColorChangeListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelectColor()Ljava/lang/Integer;
    .locals 1

    .line 1
    sget v0, Lcom/zykj/view/R$id;->customColor:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/widget/customColor/CustomColorLayout;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/view/widget/customColor/CustomColorLayout;->getSelectColor()Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget v0, Lcom/zykj/view/R$id;->latestColor:I

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/zykj/view/widget/customColor/LatestColorLayout;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/view/widget/customColor/LatestColorLayout;->getSelectColor()Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_0
    return-object v0
.end method

.method public final setBackgroundLight(Z)V
    .locals 1

    .line 1
    sget v0, Lcom/zykj/view/R$id;->tvLatest:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const-string p1, "#555555"

    .line 12
    .line 13
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p1, "#FFFFFF"

    .line 19
    .line 20
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final setOnColorChangeListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final setSelectColor(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    sget v0, Lcom/zykj/view/R$id;->customColor:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/widget/customColor/CustomColorLayout;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/zykj/view/widget/customColor/CustomColorLayout;->setSelectColor(Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    sget p1, Lcom/zykj/view/R$id;->latestColor:I

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/view/widget/customColor/LatestColorLayout;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Lcom/zykj/view/widget/customColor/LatestColorLayout;->setSelectColor(Ljava/lang/Integer;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
