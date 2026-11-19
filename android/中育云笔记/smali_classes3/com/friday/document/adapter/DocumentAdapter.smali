.class public final Lcom/friday/document/adapter/DocumentAdapter;
.super Landroidx/paging/PagingDataAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PagingDataAdapter<",
        "Lcom/friday/document/adapter/MultiModeFileEntity;",
        "Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lhd/p;

.field public b:Lhd/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/document/adapter/DocumentAdapter$1;

    .line 2
    .line 3
    invoke-direct {v1}, Lcom/friday/document/adapter/DocumentAdapter$1;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v4, 0x6

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v0, p0

    .line 11
    invoke-direct/range {v0 .. v5}, Landroidx/paging/PagingDataAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlin/coroutines/d;Lkotlin/coroutines/d;ILkotlin/jvm/internal/n;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic d(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Lcom/friday/document/adapter/DocumentAdapter;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/adapter/DocumentAdapter;->o(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Lcom/friday/document/adapter/DocumentAdapter;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Lcom/friday/document/adapter/DocumentAdapter;Ljava/util/List;Lcom/friday/common/entity/FileEntity;La8/c;La8/a;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/document/adapter/DocumentAdapter;->l(Lcom/friday/document/adapter/DocumentAdapter;Ljava/util/List;Lcom/friday/common/entity/FileEntity;La8/c;La8/a;I)V

    return-void
.end method

.method public static synthetic f(Lcom/friday/document/adapter/DocumentAdapter;Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/adapter/DocumentAdapter;->n(Lcom/friday/document/adapter/DocumentAdapter;Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lcom/friday/document/adapter/DocumentAdapter;Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/adapter/DocumentAdapter;->k(Lcom/friday/document/adapter/DocumentAdapter;Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Lcom/friday/document/adapter/DocumentAdapter;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/adapter/DocumentAdapter;->m(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Lcom/friday/document/adapter/DocumentAdapter;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lcom/friday/document/adapter/DocumentAdapter;Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v2, Lcom/friday/document/adapter/a$d;->b:Lcom/friday/document/adapter/a$d;

    .line 27
    .line 28
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    sget-object v2, Lcom/friday/document/adapter/a$c;->b:Lcom/friday/document/adapter/a$c;

    .line 32
    .line 33
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    sget-object v2, Lcom/friday/document/adapter/a$b;->b:Lcom/friday/document/adapter/a$b;

    .line 37
    .line 38
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->isFolder()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    sget-object v2, Lcom/friday/document/adapter/a$f;->b:Lcom/friday/document/adapter/a$f;

    .line 48
    .line 49
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 53
    .line 54
    const/16 v3, 0xa

    .line 55
    .line 56
    invoke-static {v1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    const/4 v4, 0x0

    .line 68
    move v5, v4

    .line 69
    :goto_0
    if-ge v5, v3, :cond_2

    .line 70
    .line 71
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    add-int/lit8 v5, v5, 0x1

    .line 76
    .line 77
    check-cast v6, Lcom/friday/document/adapter/a;

    .line 78
    .line 79
    invoke-virtual {v6}, Lcom/friday/document/adapter/a;->a()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    new-array v3, v4, [Ljava/lang/String;

    .line 88
    .line 89
    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, [Ljava/lang/String;

    .line 94
    .line 95
    new-instance v3, Landroid/graphics/Rect;

    .line 96
    .line 97
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->a()Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->f:Landroid/widget/ImageView;

    .line 105
    .line 106
    invoke-virtual {p1, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 107
    .line 108
    .line 109
    iget p1, v3, Landroid/graphics/Rect;->bottom:I

    .line 110
    .line 111
    sget v3, Lcom/friday/document/R$attr;->xui_config_simple_list_item_height:I

    .line 112
    .line 113
    filled-new-array {v3}, [I

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v5, v3}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    const-string v5, "obtainStyledAttributes(...)"

    .line 126
    .line 127
    invoke-static {v3, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const/high16 v5, 0x40a00000    # 5.0f

    .line 131
    .line 132
    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 137
    .line 138
    .line 139
    array-length v3, v2

    .line 140
    int-to-float v3, v3

    .line 141
    mul-float/2addr v5, v3

    .line 142
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    sget v6, Lcom/friday/document/R$dimen;->view_5:I

    .line 151
    .line 152
    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    add-float/2addr v5, v3

    .line 157
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenHeight()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    sub-int/2addr v3, p1

    .line 162
    int-to-float p1, v3

    .line 163
    cmpl-float p1, p1, v5

    .line 164
    .line 165
    const/4 v3, 0x1

    .line 166
    if-lez p1, :cond_3

    .line 167
    .line 168
    move v4, v3

    .line 169
    :cond_3
    new-instance p1, Lc9/c;

    .line 170
    .line 171
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-direct {p1, v6, v2}, Lc9/c;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    sget v6, Lcom/friday/document/R$dimen;->view_60:I

    .line 187
    .line 188
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    float-to-int v2, v2

    .line 193
    float-to-int v5, v5

    .line 194
    new-instance v6, Lo2/e;

    .line 195
    .line 196
    invoke-direct {v6, p0, v1, v0}, Lo2/e;-><init>(Lcom/friday/document/adapter/DocumentAdapter;Ljava/util/List;Lcom/friday/common/entity/FileEntity;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v2, v5, v6}, Lc9/c;->z(IILc9/c$b;)Lc9/c;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-virtual {p0, v3}, Lc9/c;->B(Z)Lc9/c;

    .line 204
    .line 205
    .line 206
    if-eqz v4, :cond_4

    .line 207
    .line 208
    invoke-virtual {p0, p2}, Lc9/b;->u(Landroid/view/View;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_4
    invoke-virtual {p0, p2}, Lc9/b;->v(Landroid/view/View;)V

    .line 213
    .line 214
    .line 215
    :cond_5
    :goto_1
    return-void
.end method

.method public static final l(Lcom/friday/document/adapter/DocumentAdapter;Ljava/util/List;Lcom/friday/common/entity/FileEntity;La8/c;La8/a;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/adapter/DocumentAdapter;->a:Lhd/p;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p1, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0, p1, p2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static final m(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Lcom/friday/document/adapter/DocumentAdapter;Landroid/view/View;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 p2, -0x1

    .line 11
    if-ne p0, p2, :cond_0

    .line 12
    .line 13
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p1, p0}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 21
    .line 22
    if-eqz p0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object p1, p1, Lcom/friday/document/adapter/DocumentAdapter;->a:Lhd/p;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    sget-object p2, Lcom/friday/document/adapter/a$a;->b:Lcom/friday/document/adapter/a$a;

    .line 36
    .line 37
    invoke-interface {p1, p2, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_2
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_3
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 44
    .line 45
    return-object p0
.end method

.method public static final n(Lcom/friday/document/adapter/DocumentAdapter;Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p0, p0, Lcom/friday/document/adapter/DocumentAdapter;->a:Lhd/p;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    sget-object p2, Lcom/friday/document/adapter/a$e;->b:Lcom/friday/document/adapter/a$e;

    .line 25
    .line 26
    invoke-interface {p0, p2, p1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public static final o(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Lcom/friday/document/adapter/DocumentAdapter;Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p2, -0x1

    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p0, p2, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    invoke-virtual {p1, p0}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 15
    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object p1, p1, Lcom/friday/document/adapter/DocumentAdapter;->b:Lhd/l;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_0
    return v0
.end method


# virtual methods
.method public i(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;I)V
    .locals 5

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 11
    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->a()Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v2, v2, Lcom/friday/document/databinding/ItemNoteListBinding;->f:Landroid/widget/ImageView;

    .line 32
    .line 33
    new-instance v3, Lo2/a;

    .line 34
    .line 35
    invoke-direct {v3, p0, p1}, Lo2/a;-><init>(Lcom/friday/document/adapter/DocumentAdapter;Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->a()Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v2, v2, Lcom/friday/document/databinding/ItemNoteListBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 46
    .line 47
    const-string v3, "container"

    .line 48
    .line 49
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v3, Lo2/b;

    .line 53
    .line 54
    invoke-direct {v3, p1, p0}, Lo2/b;-><init>(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Lcom/friday/document/adapter/DocumentAdapter;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v3}, Lgb/b;->e(Landroid/view/View;Lhd/l;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->a()Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v2, v2, Lcom/friday/document/databinding/ItemNoteListBinding;->g:Landroid/widget/ImageView;

    .line 65
    .line 66
    new-instance v3, Lo2/c;

    .line 67
    .line 68
    invoke-direct {v3, p0, p1}, Lo2/c;-><init>(Lcom/friday/document/adapter/DocumentAdapter;Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->a()Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object v2, v2, Lcom/friday/document/databinding/ItemNoteListBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 79
    .line 80
    new-instance v3, Lo2/d;

    .line 81
    .line 82
    invoke-direct {v3, p1, p0}, Lo2/d;-><init>(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Lcom/friday/document/adapter/DocumentAdapter;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->a()Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iget-object v2, v2, Lcom/friday/document/databinding/ItemNoteListBinding;->e:Landroid/widget/ImageView;

    .line 93
    .line 94
    sget-object v3, Lk2/n;->a:Lk2/n$a;

    .line 95
    .line 96
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v3, v4}, Lk2/n$a;->d(Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {p1, v2}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->b(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {p1, v2}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->e(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->isFolder()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    invoke-virtual {p1, v2, v0, v1}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c(ZZZ)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getSyncStatus()I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    invoke-virtual {p1, p2}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->d(I)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public j(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;ILjava/util/List;)V
    .locals 6

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "payloads"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v0}, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0}, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v0}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {p3}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    instance-of v4, v3, Ljava/util/List;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    check-cast v3, Ljava/util/List;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v3, v5

    .line 46
    :goto_0
    if-eqz v3, :cond_8

    .line 47
    .line 48
    move-object v4, v3

    .line 49
    check-cast v4, Ljava/util/Collection;

    .line 50
    .line 51
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-nez v4, :cond_2

    .line 56
    .line 57
    move-object v5, v3

    .line 58
    :cond_2
    if-eqz v5, :cond_8

    .line 59
    .line 60
    check-cast v5, Ljava/lang/Iterable;

    .line 61
    .line 62
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    if-eqz p3, :cond_7

    .line 71
    .line 72
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    instance-of v3, p3, Lcom/friday/document/adapter/b$b;

    .line 77
    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->isFolder()Z

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    invoke-virtual {p1, p3, v1, v2}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c(ZZZ)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    instance-of v3, p3, Lcom/friday/document/adapter/b$c;

    .line 89
    .line 90
    if-eqz v3, :cond_5

    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getSyncStatus()I

    .line 93
    .line 94
    .line 95
    move-result p3

    .line 96
    invoke-virtual {p1, p3}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->d(I)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    instance-of v3, p3, Lcom/friday/document/adapter/b$a;

    .line 101
    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    invoke-virtual {p1, p3}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->b(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_6
    instance-of p3, p3, Lcom/friday/document/adapter/b$d;

    .line 113
    .line 114
    if-eqz p3, :cond_3

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    invoke-virtual {p1, p3}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->e(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_7
    :goto_2
    return-void

    .line 125
    :cond_8
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/DocumentAdapter;->i(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;I)V

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;

    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/adapter/DocumentAdapter;->j(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;ILjava/util/List;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/DocumentAdapter;->p(Landroid/view/ViewGroup;I)Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public p(Landroid/view/ViewGroup;I)Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, p1, v1}, Lcom/friday/document/databinding/ItemNoteListBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "inflate(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, p1}, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;-><init>(Lcom/friday/document/databinding/ItemNoteListBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final q(Lhd/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter;->a:Lhd/p;

    .line 2
    .line 3
    return-void
.end method

.method public final r(Lhd/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter;->b:Lhd/l;

    .line 2
    .line 3
    return-void
.end method
