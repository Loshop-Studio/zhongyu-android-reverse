.class public final Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/adapter/PreviewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PreviewHolder"
.end annotation


# instance fields
.field public final c:Lcom/friday/document/databinding/ItemNoteThumbnailBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/document/databinding/ItemNoteThumbnailBinding;)V
    .locals 1

    .line 1
    const-string v0, "dataBinding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;->c:Lcom/friday/document/databinding/ItemNoteThumbnailBinding;

    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic a(Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;)Lcom/friday/document/databinding/ItemNoteThumbnailBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;->c:Lcom/friday/document/databinding/ItemNoteThumbnailBinding;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/io/File;Ljava/util/ArrayList;I)V
    .locals 4

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "imageErrorList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-string v1, "sdvThumbnail"

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;->c:Lcom/friday/document/databinding/ItemNoteThumbnailBinding;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/friday/document/databinding/ItemNoteThumbnailBinding;->d:Lcom/friday/common/widget/ScaleImageView;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v2, Lw/g$a;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-direct {v2, v3}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p1}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1, v0}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v0, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$b;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$b;-><init>(Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lw/g$a;->s(Ly/a;)Lw/g$a;

    .line 57
    .line 58
    .line 59
    new-instance v0, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$a;

    .line 60
    .line 61
    invoke-direct {v0, p2, p3}, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$a;-><init>(Ljava/util/ArrayList;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lw/g$a;->j(Lw/g$d;)Lw/g$a;

    .line 65
    .line 66
    .line 67
    sget-object p2, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Lw/g$a;->k(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lw/g$a;->f(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Lw/g$a;->l(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lw/g$a;->c()Lw/g;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-interface {v1, p1}, Lcoil3/e;->c(Lw/g;)Lw/c;

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 91
    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p1, "thumbnail.jpg"

    .line 104
    .line 105
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object v0, p0, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;->c:Lcom/friday/document/databinding/ItemNoteThumbnailBinding;

    .line 113
    .line 114
    iget-object v0, v0, Lcom/friday/document/databinding/ItemNoteThumbnailBinding;->d:Lcom/friday/common/widget/ScaleImageView;

    .line 115
    .line 116
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v1, Ljava/io/File;

    .line 120
    .line 121
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    new-instance v2, Lw/g$a;

    .line 133
    .line 134
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-direct {v2, v3}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v1}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-static {v1, v0}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    new-instance v1, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$d;

    .line 150
    .line 151
    invoke-direct {v1, p0}, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$d;-><init>(Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Lw/g$a;->s(Ly/a;)Lw/g$a;

    .line 155
    .line 156
    .line 157
    new-instance v1, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$c;

    .line 158
    .line 159
    invoke-direct {v1, p2, p3}, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$c;-><init>(Ljava/util/ArrayList;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v1}, Lw/g$a;->j(Lw/g$d;)Lw/g$a;

    .line 163
    .line 164
    .line 165
    sget-object p2, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    .line 166
    .line 167
    invoke-virtual {v0, p2}, Lw/g$a;->k(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p2}, Lw/g$a;->f(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, p2}, Lw/g$a;->l(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Lw/g$a;->c()Lw/g;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-interface {p1, p2}, Lcoil3/e;->c(Lw/g;)Lw/c;

    .line 181
    .line 182
    .line 183
    return-void
.end method
