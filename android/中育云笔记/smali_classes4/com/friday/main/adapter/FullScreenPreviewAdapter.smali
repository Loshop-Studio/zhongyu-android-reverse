.class public final Lcom/friday/main/adapter/FullScreenPreviewAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/main/adapter/FullScreenPreviewAdapter$FullScreenPreviewDiff;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Ljava/io/File;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget v0, Lcom/friday/main/R$layout;->item_full_preview_thumbnail:I

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
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic i(Lcom/friday/main/adapter/FullScreenPreviewAdapter;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/adapter/FullScreenPreviewAdapter;->k(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/io/File;)V
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
    sget v0, Lcom/friday/main/R$id;->sdv_thumbnail:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "null cannot be cast to non-null type android.widget.ImageView"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast p1, Landroid/widget/ImageView;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, "thumbnail.jpg"

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v1, Ljava/io/File;

    .line 57
    .line 58
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v2, Lw/g$a;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-direct {v2, v3}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v1}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1, p1}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    new-instance v2, Lcom/friday/main/adapter/FullScreenPreviewAdapter$b;

    .line 87
    .line 88
    invoke-direct {v2, p1, p0}, Lcom/friday/main/adapter/FullScreenPreviewAdapter$b;-><init>(Landroid/widget/ImageView;Lcom/friday/main/adapter/FullScreenPreviewAdapter;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v2}, Lw/g$a;->s(Ly/a;)Lw/g$a;

    .line 92
    .line 93
    .line 94
    new-instance p1, Lcom/friday/main/adapter/FullScreenPreviewAdapter$a;

    .line 95
    .line 96
    invoke-direct {p1, p0, p2}, Lcom/friday/main/adapter/FullScreenPreviewAdapter$a;-><init>(Lcom/friday/main/adapter/FullScreenPreviewAdapter;Ljava/io/File;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, p1}, Lw/g$a;->j(Lw/g$d;)Lw/g$a;

    .line 100
    .line 101
    .line 102
    sget-object p1, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    .line 103
    .line 104
    invoke-virtual {v1, p1}, Lw/g$a;->k(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, p1}, Lw/g$a;->f(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, p1}, Lw/g$a;->l(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Lw/g$a;->c()Lw/g;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {v0, p1}, Lcoil3/e;->c(Lw/g;)Lw/c;

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    new-instance v1, Lw/g$a;

    .line 130
    .line 131
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-direct {v1, v2}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, p2}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {v1, p1}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    new-instance v2, Lcom/friday/main/adapter/FullScreenPreviewAdapter$d;

    .line 147
    .line 148
    invoke-direct {v2, p1, p0}, Lcom/friday/main/adapter/FullScreenPreviewAdapter$d;-><init>(Landroid/widget/ImageView;Lcom/friday/main/adapter/FullScreenPreviewAdapter;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v2}, Lw/g$a;->s(Ly/a;)Lw/g$a;

    .line 152
    .line 153
    .line 154
    new-instance p1, Lcom/friday/main/adapter/FullScreenPreviewAdapter$c;

    .line 155
    .line 156
    invoke-direct {p1, p0, p2}, Lcom/friday/main/adapter/FullScreenPreviewAdapter$c;-><init>(Lcom/friday/main/adapter/FullScreenPreviewAdapter;Ljava/io/File;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, p1}, Lw/g$a;->j(Lw/g$d;)Lw/g$a;

    .line 160
    .line 161
    .line 162
    sget-object p1, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    .line 163
    .line 164
    invoke-virtual {v1, p1}, Lw/g$a;->k(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, p1}, Lw/g$a;->f(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, p1}, Lw/g$a;->l(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Lw/g$a;->c()Lw/g;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-interface {v0, p1}, Lcoil3/e;->c(Lw/g;)Lw/c;

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public final l()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    check-cast v3, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter;->a:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method
