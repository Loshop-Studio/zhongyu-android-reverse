.class public final Lcom/friday/paint/adapter/OptionsAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/friday/common/entity/OptionEntity;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    invoke-direct {p0, p1, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;ILkotlin/jvm/internal/n;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/common/entity/OptionEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/adapter/OptionsAdapter;->i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/common/entity/OptionEntity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/common/entity/OptionEntity;)V
    .locals 2

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
    sget v0, Lcom/friday/paint/R$id;->cv_option:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroidx/cardview/widget/CardView;

    .line 18
    .line 19
    sget v1, Lcom/friday/paint/R$id;->tv_option:I

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/friday/common/entity/OptionEntity;->getOption()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Lcom/friday/common/entity/OptionEntity;->isSelected()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    sget v1, Lcom/friday/paint/R$color;->colorPrimary:I

    .line 45
    .line 46
    invoke-static {p2, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-virtual {v0, p2}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    sget v0, Lcom/friday/paint/R$color;->white:I

    .line 58
    .line 59
    invoke-static {p2, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_0
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    sget v1, Lcom/friday/paint/R$color;->white:I

    .line 72
    .line 73
    invoke-static {p2, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-virtual {v0, p2}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    sget v0, Lcom/friday/paint/R$color;->colorPrimary:I

    .line 85
    .line 86
    invoke-static {p2, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 91
    .line 92
    .line 93
    return-void
.end method
