.class public final Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"

# interfaces
.implements Lcom/chad/library/adapter/base/module/DraggableModule;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;",
        "Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder<",
        "Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;",
        ">;>;",
        "Lcom/chad/library/adapter/base/module/DraggableModule;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ%\u0010\r\u001a\u00020\u000c2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;",
        "Lcom/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;",
        "Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;",
        "Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;",
        "Lcom/chad/library/adapter/base/module/DraggableModule;",
        "Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;",
        "viewModel",
        "<init>",
        "(Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;)V",
        "holder",
        "item",
        "",
        "h",
        "(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V",
        "a",
        "Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;",
        "app_release"
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
        "SMAP\nCategoryEditAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryEditAdapter.kt\ncom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,74:1\n257#2,2:75\n278#2,2:77\n*S KotlinDebug\n*F\n+ 1 CategoryEditAdapter.kt\ncom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter\n*L\n45#1:75,2\n46#1:77,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;)V
    .locals 3

    .line 1
    const-string v0, "viewModel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Lcom/zykj/student/dialogue/R$layout;->dialogue_item_edit:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {p0, v0, v1, v2, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;->a:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 14
    .line 15
    new-instance p1, Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter$1;

    .line 16
    .line 17
    invoke-direct {p1}, Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter$1;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setDiffCallback(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static synthetic f(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;->i(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;->j(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    add-int/lit8 p0, p0, -0x1

    .line 11
    .line 12
    if-ltz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-ge p0, p2, :cond_0

    .line 23
    .line 24
    iget-object p2, p1, Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;->a:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 25
    .line 26
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/category/b$c;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lcom/zykj/student/dialogue/ui/home/category/b$c;-><init>(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v0}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->B(Lcom/zykj/student/dialogue/ui/home/category/b;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0
.end method

.method public static final j(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    add-int/lit8 p2, p2, -0x1

    .line 11
    .line 12
    if-ltz p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ge p2, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getSessionCount()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-lez v0, :cond_0

    .line 35
    .line 36
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget p1, Lcom/zykj/student/dialogue/R$string;->dialogue_category_cannot_delete:I

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const/4 p1, 0x0

    .line 49
    new-array p1, p1, [Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object p0, p1, Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;->a:Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 56
    .line 57
    new-instance p1, Lcom/zykj/student/dialogue/ui/home/category/b$b;

    .line 58
    .line 59
    invoke-direct {p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/b$b;-><init>(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->B(Lcom/zykj/student/dialogue/ui/home/category/b;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0
.end method


# virtual methods
.method public addDraggableModule(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/module/BaseDraggableModule;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/chad/library/adapter/base/module/DraggableModule;->addDraggableModule(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lcom/chad/library/adapter/base/module/BaseDraggableModule;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;

    .line 2
    .line 3
    check-cast p2, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;->h(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V
    .locals 4

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;->getDataBinding()Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;

    .line 16
    .line 17
    if-eqz p2, :cond_4

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x1

    .line 24
    sub-int/2addr v0, v1

    .line 25
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 30
    .line 31
    iget-object v2, p2, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->e:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->isArchived()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v3, 0x0

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->inDiscussing()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v1, v3

    .line 55
    :cond_1
    :goto_0
    iget-object v0, p2, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->b:Landroidx/constraintlayout/widget/Group;

    .line 56
    .line 57
    const-string v2, "groupOperation"

    .line 58
    .line 59
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    move v2, v3

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const/16 v2, 0x8

    .line 67
    .line 68
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p2, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->a:Landroidx/cardview/widget/CardView;

    .line 72
    .line 73
    const-string v2, "cvSystemType"

    .line 74
    .line 75
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    const/4 v3, 0x4

    .line 81
    :cond_3
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sget v1, Lcom/zykj/base/R$dimen;->view_4:I

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-object v1, p2, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->d:Landroid/widget/ImageView;

    .line 101
    .line 102
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ClickUtils;->expandClickArea(Landroid/view/View;I)V

    .line 103
    .line 104
    .line 105
    iget-object v1, p2, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->c:Landroid/widget/ImageView;

    .line 106
    .line 107
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ClickUtils;->expandClickArea(Landroid/view/View;I)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p2, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->d:Landroid/widget/ImageView;

    .line 111
    .line 112
    const-string v1, "ivEdit"

    .line 113
    .line 114
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    new-instance v1, Lt6/d;

    .line 118
    .line 119
    invoke-direct {v1, p1, p0}, Lt6/d;-><init>(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v1}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 123
    .line 124
    .line 125
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->c:Landroid/widget/ImageView;

    .line 126
    .line 127
    const-string v0, "ivDelete"

    .line 128
    .line 129
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    new-instance v0, Lt6/e;

    .line 133
    .line 134
    invoke-direct {v0, p1, p0}, Lt6/e;-><init>(Lcom/chad/library/adapter/base/viewholder/BaseDataBindingHolder;Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;)V

    .line 135
    .line 136
    .line 137
    invoke-static {p2, v0}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 138
    .line 139
    .line 140
    :cond_4
    return-void
.end method
