.class public final Lcom/friday/document/adapter/RecycleBinAdapter;
.super Landroidx/paging/PagingDataAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PagingDataAdapter<",
        "Lcom/friday/document/adapter/MultiModeFileEntity;",
        "Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/friday/document/viewmodel/RecycleBinViewModel;

.field public final b:Lhd/p;

.field public final c:Ljava/text/SimpleDateFormat;

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lhd/p;)V
    .locals 7

    .line 1
    const-string v0, "recycleBinViewModel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onItemClickListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lcom/friday/document/adapter/RecycleBinAdapter$1;

    .line 12
    .line 13
    invoke-direct {v2}, Lcom/friday/document/adapter/RecycleBinAdapter$1;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x6

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-direct/range {v1 .. v6}, Landroidx/paging/PagingDataAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlin/coroutines/d;Lkotlin/coroutines/d;ILkotlin/jvm/internal/n;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, v1, Lcom/friday/document/adapter/RecycleBinAdapter;->a:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 25
    .line 26
    iput-object p2, v1, Lcom/friday/document/adapter/RecycleBinAdapter;->b:Lhd/p;

    .line 27
    .line 28
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 29
    .line 30
    const-string p2, "yyyy-MM-dd"

    .line 31
    .line 32
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 33
    .line 34
    invoke-direct {p1, p2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v1, Lcom/friday/document/adapter/RecycleBinAdapter;->c:Ljava/text/SimpleDateFormat;

    .line 38
    .line 39
    const p1, 0x5265c00

    .line 40
    .line 41
    .line 42
    iput p1, v1, Lcom/friday/document/adapter/RecycleBinAdapter;->d:I

    .line 43
    .line 44
    return-void
.end method

.method public static synthetic d(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/RecycleBinAdapter;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/adapter/RecycleBinAdapter;->k(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/RecycleBinAdapter;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/RecycleBinAdapter;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/adapter/RecycleBinAdapter;->m(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/RecycleBinAdapter;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/friday/document/adapter/RecycleBinAdapter;[Lcom/friday/document/adapter/c;Lcom/friday/document/adapter/MultiModeFileEntity;La8/c;La8/a;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/document/adapter/RecycleBinAdapter;->l(Lcom/friday/document/adapter/RecycleBinAdapter;[Lcom/friday/document/adapter/c;Lcom/friday/document/adapter/MultiModeFileEntity;La8/c;La8/a;I)V

    return-void
.end method

.method public static final k(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/RecycleBinAdapter;Landroid/view/View;)Lqc/q;
    .locals 8

    .line 1
    const-string v0, "view"

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
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p1, v0}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    const/4 v1, 0x2

    .line 28
    new-array v2, v1, [Lcom/friday/document/adapter/c;

    .line 29
    .line 30
    sget-object v3, Lcom/friday/document/adapter/c$c;->b:Lcom/friday/document/adapter/c$c;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    aput-object v3, v2, v4

    .line 34
    .line 35
    sget-object v3, Lcom/friday/document/adapter/c$b;->b:Lcom/friday/document/adapter/c$b;

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    aput-object v3, v2, v5

    .line 39
    .line 40
    new-instance v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    move v6, v4

    .line 46
    :goto_0
    if-ge v6, v1, :cond_2

    .line 47
    .line 48
    aget-object v7, v2, v6

    .line 49
    .line 50
    invoke-virtual {v7}, Lcom/friday/document/adapter/c;->a()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    add-int/lit8 v6, v6, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    new-array v1, v4, [Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {v3, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, [Ljava/lang/String;

    .line 67
    .line 68
    new-instance v3, Landroid/graphics/Rect;

    .line 69
    .line 70
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;->a()Lcom/friday/document/databinding/ItemRecycleBinBinding;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iget-object p0, p0, Lcom/friday/document/databinding/ItemRecycleBinBinding;->e:Landroid/widget/ImageView;

    .line 78
    .line 79
    invoke-virtual {p0, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 80
    .line 81
    .line 82
    iget p0, v3, Landroid/graphics/Rect;->bottom:I

    .line 83
    .line 84
    sget v3, Lcom/friday/document/R$attr;->xui_config_simple_list_item_height:I

    .line 85
    .line 86
    filled-new-array {v3}, [I

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-virtual {v6, v3}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const-string v6, "obtainStyledAttributes(...)"

    .line 99
    .line 100
    invoke-static {v3, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const/high16 v6, 0x40a00000    # 5.0f

    .line 104
    .line 105
    invoke-virtual {v3, v4, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 110
    .line 111
    .line 112
    array-length v3, v1

    .line 113
    int-to-float v3, v3

    .line 114
    mul-float/2addr v6, v3

    .line 115
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    sget v7, Lcom/friday/document/R$dimen;->view_5:I

    .line 124
    .line 125
    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getDimension(I)F

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    add-float/2addr v6, v3

    .line 130
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenHeight()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    sub-int/2addr v3, p0

    .line 135
    int-to-float p0, v3

    .line 136
    cmpl-float p0, p0, v6

    .line 137
    .line 138
    if-lez p0, :cond_3

    .line 139
    .line 140
    move v4, v5

    .line 141
    :cond_3
    new-instance p0, Lc9/c;

    .line 142
    .line 143
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-direct {p0, v3, v1}, Lc9/c;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    sget v3, Lcom/friday/document/R$dimen;->view_60:I

    .line 159
    .line 160
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    float-to-int v1, v1

    .line 165
    float-to-int v3, v6

    .line 166
    new-instance v6, Lo2/i;

    .line 167
    .line 168
    invoke-direct {v6, p1, v2, v0}, Lo2/i;-><init>(Lcom/friday/document/adapter/RecycleBinAdapter;[Lcom/friday/document/adapter/c;Lcom/friday/document/adapter/MultiModeFileEntity;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v1, v3, v6}, Lc9/c;->z(IILc9/c$b;)Lc9/c;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {p0, v5}, Lc9/c;->B(Z)Lc9/c;

    .line 176
    .line 177
    .line 178
    if-eqz v4, :cond_4

    .line 179
    .line 180
    invoke-virtual {p0, p2}, Lc9/b;->u(Landroid/view/View;)V

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_4
    invoke-virtual {p0, p2}, Lc9/b;->v(Landroid/view/View;)V

    .line 185
    .line 186
    .line 187
    :goto_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 188
    .line 189
    return-object p0
.end method

.method public static final l(Lcom/friday/document/adapter/RecycleBinAdapter;[Lcom/friday/document/adapter/c;Lcom/friday/document/adapter/MultiModeFileEntity;La8/c;La8/a;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/adapter/RecycleBinAdapter;->b:Lhd/p;

    .line 2
    .line 3
    aget-object p1, p1, p5

    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-interface {p0, p1, p2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final m(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/RecycleBinAdapter;Landroid/view/View;)Lqc/q;
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
    if-eq p0, p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    iget-object p1, p1, Lcom/friday/document/adapter/RecycleBinAdapter;->b:Lhd/p;

    .line 22
    .line 23
    sget-object p2, Lcom/friday/document/adapter/c$a;->b:Lcom/friday/document/adapter/c$a;

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p1, p2, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 33
    .line 34
    return-object p0
.end method


# virtual methods
.method public final g(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/MultiModeFileEntity;)V
    .locals 5

    .line 1
    :try_start_0
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getExpiredTime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const/16 p2, 0x3e8

    .line 12
    .line 13
    int-to-long v2, p2

    .line 14
    mul-long/2addr v0, v2

    .line 15
    iget-object p2, p0, Lcom/friday/document/adapter/RecycleBinAdapter;->c:Ljava/text/SimpleDateFormat;

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p2, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p2, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iget-object p2, p0, Lcom/friday/document/adapter/RecycleBinAdapter;->c:Ljava/text/SimpleDateFormat;

    .line 37
    .line 38
    new-instance v2, Ljava/util/Date;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p2, v2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    sub-long/2addr v0, v2

    .line 59
    iget p2, p0, Lcom/friday/document/adapter/RecycleBinAdapter;->d:I

    .line 60
    .line 61
    int-to-long v2, p2

    .line 62
    div-long/2addr v0, v2

    .line 63
    invoke-virtual {p1}, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;->a()Lcom/friday/document/databinding/ItemRecycleBinBinding;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object p1, p1, Lcom/friday/document/databinding/ItemRecycleBinBinding;->g:Landroid/widget/TextView;

    .line 68
    .line 69
    new-instance p2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-wide/16 v2, 0x1e

    .line 75
    .line 76
    cmp-long v4, v0, v2

    .line 77
    .line 78
    if-lez v4, :cond_0

    .line 79
    .line 80
    move-wide v0, v2

    .line 81
    :cond_0
    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, "\u5929"

    .line 85
    .line 86
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 97
    .line 98
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    goto :goto_0

    .line 103
    :catchall_0
    move-exception p1

    .line 104
    sget-object p2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 105
    .line 106
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-eqz p1, :cond_1

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    new-instance p2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v0, "\u8ba1\u7b97\u65f6\u95f4\u5931\u8d25: "

    .line 130
    .line 131
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_1
    return-void
.end method

.method public h(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;I)V
    .locals 3

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
    if-eqz p2, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;->a()Lcom/friday/document/databinding/ItemRecycleBinBinding;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lcom/friday/document/databinding/ItemRecycleBinBinding;->d:Landroid/widget/ImageView;

    .line 19
    .line 20
    sget-object v1, Lk2/n;->a:Lk2/n$a;

    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v1, v2}, Lk2/n$a;->d(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/friday/document/adapter/RecycleBinAdapter;->a:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;->a()Lcom/friday/document/databinding/ItemRecycleBinBinding;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v1, v1, Lcom/friday/document/databinding/ItemRecycleBinBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_0

    .line 74
    .line 75
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v2, "0"

    .line 84
    .line 85
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_0

    .line 90
    .line 91
    sget v0, Lcom/friday/document/R$color;->select:I

    .line 92
    .line 93
    invoke-static {v0}, Lz1/b;->a(I)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    goto :goto_0

    .line 98
    :cond_0
    sget v0, Lcom/friday/document/R$color;->transparent:I

    .line 99
    .line 100
    invoke-static {v0}, Lz1/b;->a(I)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    goto :goto_0

    .line 105
    :cond_1
    sget v0, Lcom/friday/document/R$color;->transparent:I

    .line 106
    .line 107
    invoke-static {v0}, Lz1/b;->a(I)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;->a()Lcom/friday/document/databinding/ItemRecycleBinBinding;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v0, v0, Lcom/friday/document/databinding/ItemRecycleBinBinding;->f:Landroid/widget/TextView;

    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/RecycleBinAdapter;->g(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/MultiModeFileEntity;)V

    .line 132
    .line 133
    .line 134
    :cond_2
    return-void
.end method

.method public i(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;ILjava/util/List;)V
    .locals 3

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
    move-object v0, p3

    .line 12
    check-cast v0, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_5

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    check-cast p3, Ljava/lang/Iterable;

    .line 30
    .line 31
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, Lcom/friday/document/adapter/RecycleBinPayloadKeys;->c:Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    .line 46
    .line 47
    if-ne v0, v1, :cond_3

    .line 48
    .line 49
    iget-object v0, p0, Lcom/friday/document/adapter/RecycleBinAdapter;->a:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;->a()Lcom/friday/document/databinding/ItemRecycleBinBinding;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v1, v1, Lcom/friday/document/databinding/ItemRecycleBinBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v2, "0"

    .line 96
    .line 97
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_2

    .line 102
    .line 103
    sget v0, Lcom/friday/document/R$color;->select:I

    .line 104
    .line 105
    invoke-static {v0}, Lz1/b;->a(I)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    sget v0, Lcom/friday/document/R$color;->transparent:I

    .line 111
    .line 112
    invoke-static {v0}, Lz1/b;->a(I)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    :goto_1
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    sget-object v1, Lcom/friday/document/adapter/RecycleBinPayloadKeys;->d:Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    .line 121
    .line 122
    if-ne v0, v1, :cond_1

    .line 123
    .line 124
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/RecycleBinAdapter;->g(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/MultiModeFileEntity;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_4
    :goto_2
    return-void

    .line 129
    :cond_5
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public j(Landroid/view/ViewGroup;I)Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;

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
    invoke-static {v0, p1, v1}, Lcom/friday/document/databinding/ItemRecycleBinBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/friday/document/databinding/ItemRecycleBinBinding;

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
    invoke-direct {p2, p1}, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;-><init>(Lcom/friday/document/databinding/ItemRecycleBinBinding;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;->a()Lcom/friday/document/databinding/ItemRecycleBinBinding;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object p1, p1, Lcom/friday/document/databinding/ItemRecycleBinBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 34
    .line 35
    const-string v0, "container"

    .line 36
    .line 37
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Lo2/g;

    .line 41
    .line 42
    invoke-direct {v0, p2, p0}, Lo2/g;-><init>(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/RecycleBinAdapter;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v0}, Lgb/b;->e(Landroid/view/View;Lhd/l;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;->a()Lcom/friday/document/databinding/ItemRecycleBinBinding;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p1, p1, Lcom/friday/document/databinding/ItemRecycleBinBinding;->e:Landroid/widget/ImageView;

    .line 53
    .line 54
    const-string v0, "ivOption"

    .line 55
    .line 56
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Lo2/h;

    .line 60
    .line 61
    invoke-direct {v0, p2, p0}, Lo2/h;-><init>(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/RecycleBinAdapter;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v0}, Lgb/b;->e(Landroid/view/View;Lhd/l;)V

    .line 65
    .line 66
    .line 67
    return-object p2
.end method

.method public final n()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PagingDataAdapter;->snapshot()Landroidx/paging/ItemSnapshotList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/paging/ItemSnapshotList;->getItems()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-static {v0}, Lrc/w;->o(Ljava/util/Collection;)Lnd/j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    move-object v1, v0

    .line 26
    check-cast v1, Lrc/n0;

    .line 27
    .line 28
    invoke-virtual {v1}, Lrc/n0;->nextInt()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    sget-object v2, Lcom/friday/document/adapter/RecycleBinPayloadKeys;->c:Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    .line 33
    .line 34
    invoke-virtual {p0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method

.method public final o()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PagingDataAdapter;->snapshot()Landroidx/paging/ItemSnapshotList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/paging/ItemSnapshotList;->getItems()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-static {v0}, Lrc/w;->o(Ljava/util/Collection;)Lnd/j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    move-object v1, v0

    .line 26
    check-cast v1, Lrc/n0;

    .line 27
    .line 28
    invoke-virtual {v1}, Lrc/n0;->nextInt()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    sget-object v2, Lcom/friday/document/adapter/RecycleBinPayloadKeys;->d:Lcom/friday/document/adapter/RecycleBinPayloadKeys;

    .line 33
    .line 34
    invoke-virtual {p0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/RecycleBinAdapter;->h(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;I)V

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;

    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/adapter/RecycleBinAdapter;->i(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;ILjava/util/List;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/RecycleBinAdapter;->j(Landroid/view/ViewGroup;I)Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
