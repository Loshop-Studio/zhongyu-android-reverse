.class public final Lcom/friday/lecture/adapter/KeyboardAdapter;
.super Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter<",
        "Lcom/friday/lecture/model/KeyboardData;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;ILkotlin/jvm/internal/n;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    sget v2, Lcom/friday/lecture/R$layout;->item_keyboard_number:I

    .line 8
    .line 9
    invoke-virtual {p0, v0, v2}, Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;->i(II)V

    .line 10
    .line 11
    .line 12
    sget v0, Lcom/friday/lecture/R$layout;->item_keyboard_backspace:I

    .line 13
    .line 14
    invoke-virtual {p0, v1, v0}, Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;->i(II)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget v1, Lcom/friday/lecture/R$dimen;->view_32:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, Lcom/friday/lecture/adapter/KeyboardAdapter;->b:I

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/lecture/model/KeyboardData;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/adapter/KeyboardAdapter;->k(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/lecture/model/KeyboardData;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/lecture/model/KeyboardData;)V
    .locals 3

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, p0, Lcom/friday/lecture/adapter/KeyboardAdapter;->b:I

    .line 18
    .line 19
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/friday/lecture/model/KeyboardData;->getItemType()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    sget v0, Lcom/friday/lecture/R$id;->tv_number:I

    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/friday/lecture/model/KeyboardData;->getValue()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, v0, p2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final l(Lcom/friday/lecture/model/ConnectMode;)V
    .locals 1

    .line 1
    const-string v0, "connectMode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/friday/lecture/model/ConnectMode$Code;->INSTANCE:Lcom/friday/lecture/model/ConnectMode$Code;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget v0, Lcom/friday/lecture/R$dimen;->view_32:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v0, Lcom/friday/lecture/model/ConnectMode$IP;->INSTANCE:Lcom/friday/lecture/model/ConnectMode$IP;

    .line 30
    .line 31
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget v0, Lcom/friday/lecture/R$dimen;->view_26:I

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    :goto_0
    iput p1, p0, Lcom/friday/lecture/adapter/KeyboardAdapter;->b:I

    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 58
    .line 59
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 60
    .line 61
    .line 62
    throw p1
.end method
