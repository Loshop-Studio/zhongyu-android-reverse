.class public final Lcom/friday/main/adapter/TabAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Ls3/a;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Lhd/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget v0, Lcom/friday/main/R$layout;->item_tab:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    invoke-direct {p0, v0, v1, v2, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;ILkotlin/jvm/internal/n;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/friday/main/adapter/TabAdapter;->a:Ljava/lang/Integer;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic i(Lcom/friday/main/adapter/TabAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/main/adapter/TabAdapter;->k(Lcom/friday/main/adapter/TabAdapter;ILandroid/view/View;)V

    return-void
.end method

.method public static final k(Lcom/friday/main/adapter/TabAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/adapter/TabAdapter;->l(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic n(Lcom/friday/main/adapter/TabAdapter;IZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/adapter/TabAdapter;->m(IZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ls3/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/adapter/TabAdapter;->j(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ls3/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public j(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ls3/a;)V
    .locals 4

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
    invoke-virtual {p0, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemPosition(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sget v1, Lcom/friday/main/R$id;->iv_icon:I

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroid/widget/ImageView;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/friday/main/adapter/TabAdapter;->a:Ljava/lang/Integer;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-ne v2, v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p2}, Ls3/a;->d()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    invoke-virtual {p2}, Ls3/a;->c()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-virtual {p2}, Ls3/a;->c()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Ls3/a;->a()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    const/4 v2, 0x3

    .line 60
    if-ne v0, v2, :cond_3

    .line 61
    .line 62
    sget v2, Lcom/friday/main/R$id;->view_connect:I

    .line 63
    .line 64
    invoke-virtual {p1, v2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    sget v2, Lcom/friday/main/R$id;->view_connect:I

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const/16 v3, 0x8

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    :goto_2
    sget v2, Lcom/friday/main/R$id;->tv_label:I

    .line 85
    .line 86
    invoke-virtual {p1, v2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Landroid/widget/TextView;

    .line 91
    .line 92
    invoke-virtual {p2}, Ls3/a;->b()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    iget-object p2, p0, Lcom/friday/main/adapter/TabAdapter;->a:Ljava/lang/Integer;

    .line 100
    .line 101
    if-nez p2, :cond_4

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-ne p2, v0, :cond_5

    .line 109
    .line 110
    sget p2, Lcom/friday/main/R$id;->tv_label:I

    .line 111
    .line 112
    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, Landroid/widget/TextView;

    .line 117
    .line 118
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    sget v2, Lcom/friday/main/R$color;->colorPrimary:I

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_5
    :goto_3
    sget p2, Lcom/friday/main/R$id;->tv_label:I

    .line 133
    .line 134
    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    check-cast p2, Landroid/widget/TextView;

    .line 139
    .line 140
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    sget v2, Lcom/friday/main/R$color;->date_time:I

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 151
    .line 152
    .line 153
    :goto_4
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 154
    .line 155
    new-instance p2, Ls3/d;

    .line 156
    .line 157
    invoke-direct {p2, p0, v0}, Ls3/d;-><init>(Lcom/friday/main/adapter/TabAdapter;I)V

    .line 158
    .line 159
    .line 160
    const-wide/16 v0, 0x1f4

    .line 161
    .line 162
    invoke-static {p1, v0, v1, p2}, Lcom/blankj/utilcode/util/ClickUtils;->applySingleDebouncing(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 163
    .line 164
    .line 165
    return-void
.end method

.method public final l(IZ)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/friday/main/adapter/TabAdapter;->a:Ljava/lang/Integer;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/friday/main/adapter/TabAdapter;->b:Lhd/p;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-interface {v0, p1, p2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final m(IZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/adapter/TabAdapter;->l(IZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final o(Lhd/p;)V
    .locals 1

    .line 1
    const-string v0, "onTabSelectListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/main/adapter/TabAdapter;->b:Lhd/p;

    .line 7
    .line 8
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/friday/main/adapter/TabAdapter;->a:Ljava/lang/Integer;

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
