.class public final Lcom/friday/paint/adapter/OptionsListAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/friday/common/entity/OptionListEntity;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Z

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IIZ)V
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
    iput p2, p0, Lcom/friday/paint/adapter/OptionsListAdapter;->a:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/friday/paint/adapter/OptionsListAdapter;->b:Z

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic i(Lcom/friday/paint/adapter/OptionsListAdapter;Lcom/friday/paint/adapter/OptionsAdapter;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/paint/adapter/OptionsListAdapter;->k(Lcom/friday/paint/adapter/OptionsListAdapter;Lcom/friday/paint/adapter/OptionsAdapter;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static final k(Lcom/friday/paint/adapter/OptionsListAdapter;Lcom/friday/paint/adapter/OptionsAdapter;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-boolean p2, p0, Lcom/friday/paint/adapter/OptionsListAdapter;->c:Z

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p1, p4}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, Lcom/friday/common/entity/OptionEntity;

    .line 19
    .line 20
    iget-boolean p0, p0, Lcom/friday/paint/adapter/OptionsListAdapter;->b:Z

    .line 21
    .line 22
    const/4 p3, 0x1

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/lang/Iterable;

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result p4

    .line 39
    if-eqz p4, :cond_1

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    check-cast p4, Lcom/friday/common/entity/OptionEntity;

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p4, v0}, Lcom/friday/common/entity/OptionEntity;->setSelected(Z)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {p2, p3}, Lcom/friday/common/entity/OptionEntity;->setSelected(Z)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-virtual {p2}, Lcom/friday/common/entity/OptionEntity;->isSelected()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    xor-int/2addr p0, p3

    .line 61
    invoke-virtual {p2, p0}, Lcom/friday/common/entity/OptionEntity;->setSelected(Z)V

    .line 62
    .line 63
    .line 64
    :goto_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 65
    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/common/entity/OptionListEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/adapter/OptionsListAdapter;->j(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/common/entity/OptionListEntity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public j(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/common/entity/OptionListEntity;)V
    .locals 12

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
    sget v0, Lcom/friday/paint/R$id;->tv_qst_num:I

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/friday/common/entity/OptionListEntity;->getIndex()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "."

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p1, v0, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 35
    .line 36
    .line 37
    sget v0, Lcom/friday/paint/R$id;->rv_option:I

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 44
    .line 45
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget v2, p0, Lcom/friday/paint/adapter/OptionsListAdapter;->a:I

    .line 52
    .line 53
    const/4 v3, 0x4

    .line 54
    const/4 v4, 0x5

    .line 55
    if-le v2, v4, :cond_0

    .line 56
    .line 57
    move v2, v3

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v2, v4

    .line 60
    :goto_0
    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    new-instance v5, Lcom/friday/common/helper/GridSpacingItemDecoration;

    .line 73
    .line 74
    iget v0, p0, Lcom/friday/paint/adapter/OptionsListAdapter;->a:I

    .line 75
    .line 76
    if-le v0, v4, :cond_1

    .line 77
    .line 78
    move v6, v3

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    move v6, v4

    .line 81
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sget v1, Lcom/friday/paint/R$dimen;->view_2:I

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    float-to-int v7, v0

    .line 96
    const/16 v10, 0x8

    .line 97
    .line 98
    const/4 v11, 0x0

    .line 99
    const/4 v8, 0x1

    .line 100
    const/4 v9, 0x0

    .line 101
    invoke-direct/range {v5 .. v11}, Lcom/friday/common/helper/GridSpacingItemDecoration;-><init>(IIZZILkotlin/jvm/internal/n;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    iget v0, p0, Lcom/friday/paint/adapter/OptionsListAdapter;->a:I

    .line 108
    .line 109
    if-le v0, v4, :cond_3

    .line 110
    .line 111
    new-instance v0, Lcom/friday/paint/adapter/OptionsAdapter;

    .line 112
    .line 113
    sget v1, Lcom/friday/paint/R$layout;->item_option_less_than_five:I

    .line 114
    .line 115
    invoke-direct {v0, v1}, Lcom/friday/paint/adapter/OptionsAdapter;-><init>(I)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    new-instance v0, Lcom/friday/paint/adapter/OptionsAdapter;

    .line 120
    .line 121
    sget v1, Lcom/friday/paint/R$layout;->item_option_more_than_four:I

    .line 122
    .line 123
    invoke-direct {v0, v1}, Lcom/friday/paint/adapter/OptionsAdapter;-><init>(I)V

    .line 124
    .line 125
    .line 126
    :goto_2
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 127
    .line 128
    .line 129
    new-instance p1, Ly3/a;

    .line 130
    .line 131
    invoke-direct {p1, p0, v0}, Ly3/a;-><init>(Lcom/friday/paint/adapter/OptionsListAdapter;Lcom/friday/paint/adapter/OptionsAdapter;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lo1/d;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2}, Lcom/friday/common/entity/OptionListEntity;->getList()Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Ljava/util/Collection;

    .line 142
    .line 143
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final l(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/paint/adapter/OptionsListAdapter;->c:Z

    .line 2
    .line 3
    return-void
.end method
