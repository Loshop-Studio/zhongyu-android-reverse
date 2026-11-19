.class public final synthetic Lcom/zykj/mistake/activity/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Landroid/widget/ImageView;

.field public final synthetic f:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(ILcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Ljava/lang/String;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/activity/s;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/mistake/activity/s;->b:I

    iput-object p2, p0, Lcom/zykj/mistake/activity/s;->c:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    iput-object p3, p0, Lcom/zykj/mistake/activity/s;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/mistake/activity/s;->e:Landroid/widget/ImageView;

    iput-object p5, p0, Lcom/zykj/mistake/activity/s;->f:Landroid/widget/ImageView;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/ImageView;Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;ILjava/lang/String;Landroid/widget/ImageView;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/mistake/activity/s;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/activity/s;->e:Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/zykj/mistake/activity/s;->c:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    iput p3, p0, Lcom/zykj/mistake/activity/s;->b:I

    iput-object p4, p0, Lcom/zykj/mistake/activity/s;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/mistake/activity/s;->f:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget p1, p0, Lcom/zykj/mistake/activity/s;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, ""

    .line 5
    .line 6
    iget-object v2, p0, Lcom/zykj/mistake/activity/s;->d:Ljava/lang/String;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/mistake/activity/s;->c:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 12
    .line 13
    iget-object v3, p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->r:Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    iget v5, p0, Lcom/zykj/mistake/activity/s;->b:I

    .line 17
    .line 18
    if-ge v5, v4, :cond_3

    .line 19
    .line 20
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getExtraStems()Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    invoke-static {v4}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Object;)Ljava/util/Collection;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-interface {v4, v2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getStemShoot()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_4

    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getExtraStems()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-static {v2}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/String;

    .line 54
    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    :cond_1
    move-object v2, v1

    .line 58
    :cond_2
    invoke-virtual {v3, v2}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->setStemShoot(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getExtraAnswers()Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    invoke-static {v3}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Object;)Ljava/util/Collection;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v3, v2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_4
    :goto_0
    invoke-static {p1}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lo0/h;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2, p1}, Lo0/h;->c(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/h;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v3, Lcom/bumptech/glide/g;

    .line 87
    .line 88
    iget-object v4, p0, Lcom/zykj/mistake/activity/s;->e:Landroid/widget/ImageView;

    .line 89
    .line 90
    invoke-direct {v3, v4}, Ls0/f;-><init>(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v3}, Lcom/bumptech/glide/h;->k(Ls0/i;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 97
    .line 98
    .line 99
    const/4 v0, 0x0

    .line 100
    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 101
    .line 102
    .line 103
    invoke-static {v4, v0}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->C(Landroid/widget/ImageView;Z)V

    .line 104
    .line 105
    .line 106
    const/16 v0, 0x8

    .line 107
    .line 108
    iget-object v2, p0, Lcom/zykj/mistake/activity/s;->f:Landroid/widget/ImageView;

    .line 109
    .line 110
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->p:[Ljava/lang/String;

    .line 114
    .line 115
    aput-object v1, p1, v5

    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_0
    sget p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 119
    .line 120
    iget-object v7, p0, Lcom/zykj/mistake/activity/s;->e:Landroid/widget/ImageView;

    .line 121
    .line 122
    invoke-virtual {v7}, Landroid/view/View;->isSelected()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    iget-object v6, p0, Lcom/zykj/mistake/activity/s;->c:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 127
    .line 128
    iget v4, p0, Lcom/zykj/mistake/activity/s;->b:I

    .line 129
    .line 130
    if-eqz p1, :cond_7

    .line 131
    .line 132
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->p:[Ljava/lang/String;

    .line 133
    .line 134
    aget-object p1, p1, v4

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-nez v3, :cond_6

    .line 141
    .line 142
    if-nez v2, :cond_5

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    move-object v1, v2

    .line 146
    :goto_1
    move-object p1, v1

    .line 147
    :cond_6
    new-instance v1, Lcom/zykj/mistake/dialog/ImageDialogFragment;

    .line 148
    .line 149
    invoke-direct {v1}, Lcom/zykj/mistake/dialog/ImageDialogFragment;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v6, p1, v0}, Lcom/zykj/mistake/dialog/ImageDialogFragment;->l(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lr6/a;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_7
    iget-object p1, v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->s:Lcom/zykj/mistake/utils/g;

    .line 157
    .line 158
    new-instance v0, Lcom/zykj/mistake/activity/o;

    .line 159
    .line 160
    iget-object v8, p0, Lcom/zykj/mistake/activity/s;->f:Landroid/widget/ImageView;

    .line 161
    .line 162
    invoke-direct {v0, v4, v7, v8, v6}, Lcom/zykj/mistake/activity/o;-><init>(ILandroid/widget/ImageView;Landroid/widget/ImageView;Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;)V

    .line 163
    .line 164
    .line 165
    new-instance v3, Lcom/zykj/mistake/activity/p;

    .line 166
    .line 167
    const/4 v5, 0x0

    .line 168
    invoke-direct/range {v3 .. v8}, Lcom/zykj/mistake/activity/p;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v0, v3}, Lcom/zykj/mistake/utils/g;->a(Lr6/a;Lr6/c;)V

    .line 172
    .line 173
    .line 174
    :goto_2
    return-void

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
