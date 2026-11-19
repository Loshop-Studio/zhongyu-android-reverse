.class public final Lcom/friday/user/adapter/UserMenuAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Ljava/lang/String;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget v0, Lcom/friday/user/R$layout;->user_menu:I

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
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/user/adapter/UserMenuAdapter;->i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/String;)V
    .locals 8

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
    sget v0, Lcom/friday/user/R$id;->mContainer:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget v1, Lcom/friday/user/R$id;->tv_name:I

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/widget/TextView;

    .line 24
    .line 25
    sget v2, Lcom/friday/user/R$id;->tv_info:I

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Landroid/widget/TextView;

    .line 32
    .line 33
    sget v3, Lcom/friday/user/R$id;->iv_icon:I

    .line 34
    .line 35
    invoke-virtual {p1, v3}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Landroid/widget/ImageView;

    .line 40
    .line 41
    sget v4, Lcom/friday/user/R$id;->next_step:I

    .line 42
    .line 43
    invoke-virtual {p1, v4}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Landroid/widget/ImageView;

    .line 48
    .line 49
    invoke-virtual {p0, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemPosition(Ljava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    iget v5, p0, Lcom/friday/user/adapter/UserMenuAdapter;->a:I

    .line 54
    .line 55
    if-ne v5, v4, :cond_0

    .line 56
    .line 57
    sget v5, Lcom/friday/user/R$color;->colorAccent:I

    .line 58
    .line 59
    invoke-static {v5}, Lz1/b;->a(I)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 64
    .line 65
    .line 66
    sget v5, Lcom/friday/user/R$color;->select:I

    .line 67
    .line 68
    invoke-static {v5}, Lz1/b;->a(I)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    sget v5, Lcom/friday/user/R$color;->app_l_dark:I

    .line 74
    .line 75
    invoke-static {v5}, Lz1/b;->a(I)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 80
    .line 81
    .line 82
    sget v5, Lcom/friday/user/R$color;->transparent:I

    .line 83
    .line 84
    invoke-static {v5}, Lz1/b;->a(I)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    :goto_0
    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 89
    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    if-ne v4, v0, :cond_1

    .line 93
    .line 94
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    new-instance v6, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v7, "V"

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    goto :goto_1

    .line 116
    :cond_1
    const-string v5, ""

    .line 117
    .line 118
    :goto_1
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    if-eqz v4, :cond_6

    .line 125
    .line 126
    if-eq v4, v0, :cond_5

    .line 127
    .line 128
    const/4 p2, 0x2

    .line 129
    if-eq v4, p2, :cond_4

    .line 130
    .line 131
    const/4 p2, 0x3

    .line 132
    const/16 v0, 0x8

    .line 133
    .line 134
    if-eq v4, p2, :cond_3

    .line 135
    .line 136
    const/4 p2, 0x4

    .line 137
    if-eq v4, p2, :cond_2

    .line 138
    .line 139
    return-void

    .line 140
    :cond_2
    sget p2, Lcom/friday/user/R$mipmap;->icon_quit:I

    .line 141
    .line 142
    invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_3
    sget p2, Lcom/friday/user/R$mipmap;->icon_clear:I

    .line 150
    .line 151
    invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_4
    sget p1, Lcom/friday/user/R$mipmap;->icon_help:I

    .line 159
    .line 160
    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_5
    sget p1, Lcom/friday/user/R$mipmap;->icon_about:I

    .line 165
    .line 166
    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_6
    sget p1, Lcom/friday/user/R$mipmap;->icon_person_info:I

    .line 171
    .line 172
    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public final j(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/user/adapter/UserMenuAdapter;->a:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
