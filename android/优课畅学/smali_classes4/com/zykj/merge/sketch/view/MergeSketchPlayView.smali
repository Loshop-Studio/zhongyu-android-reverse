# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public final Lcom/zykj/merge/sketch/view/MergeSketchPlayView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field public final a:Landroid/util/AttributeSet;

.field public b:Lx3/b;

.field public c:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->c:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->a:Landroid/util/AttributeSet;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic c(Lcom/zykj/merge/sketch/view/MergeSketchPlayView;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic f(Lcom/zykj/merge/sketch/view/MergeSketchPlayView;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->e(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lx3/c;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lx3/b;->a(Lx3/c;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    instance-of v1, v0, Lx3/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lx3/a;

    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, Lx3/a;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    instance-of v1, v0, Lx3/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lx3/a;

    .line 13
    .line 14
    invoke-interface {v0}, Lx3/a;->areaMoveStart()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final e(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    instance-of v1, v0, Lx3/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lx3/a;

    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, Lx3/a;->areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lx3/b;->destroy()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final getMoveHorizontalProgress()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    instance-of v1, v0, Lx3/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lx3/a;

    .line 13
    .line 14
    invoke-interface {v0}, Lx3/a;->getMoveHorizontalProgress()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final getMoveMaxHeightTimes()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    instance-of v1, v0, Lx3/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lx3/a;

    .line 13
    .line 14
    invoke-interface {v0}, Lx3/a;->getMoveMaxHeightTimes()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final getMoveMaxWidthTimes()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    instance-of v1, v0, Lx3/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lx3/a;

    .line 13
    .line 14
    invoke-interface {v0}, Lx3/a;->getMoveMaxWidthTimes()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final getMoveVerticalProgress()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    instance-of v1, v0, Lx3/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lx3/a;

    .line 13
    .line 14
    invoke-interface {v0}, Lx3/a;->getMoveVerticalProgress()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lx3/b;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final getScreenBitmap()Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    instance-of v1, v0, Lx3/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lx3/a;

    .line 13
    .line 14
    invoke-interface {v0}, Lx3/a;->getCurrentScreenBitmap()Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public final h(Ljava/lang/String;Lx7/l;Lx7/l;)V
    .locals 7

    .line 1
    const-string v0, "\u6ca1\u6709\u5408\u9002\u7684\u753b\u677f\u52a0\u8f7d"

    .line 2
    .line 3
    const-string v1, "context"

    .line 4
    .line 5
    const-string v2, "path"

    .line 6
    .line 7
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "onSucceed"

    .line 11
    .line 12
    invoke-static {p2, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "onFailure"

    .line 16
    .line 17
    invoke-static {p3, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    :try_start_0
    new-instance v3, Ljava/io/File;

    .line 22
    .line 23
    const-string v4, "header.bin"

    .line 24
    .line 25
    invoke-direct {v3, p1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    new-instance v3, Ly3/b;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v5, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->a:Landroid/util/AttributeSet;

    .line 44
    .line 45
    invoke-direct {v3, v4, v5}, Ly3/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    .line 47
    .line 48
    iput-object v3, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :catchall_0
    move-exception v1

    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :catch_0
    move-exception v1

    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_0
    new-instance v3, Ljava/io/File;

    .line 59
    .line 60
    const-string v4, "page_router.bin"

    .line 61
    .line 62
    invoke-direct {v3, p1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    new-instance v3, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v5, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->a:Landroid/util/AttributeSet;

    .line 81
    .line 82
    invoke-direct {v3, v4, v5}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 83
    .line 84
    .line 85
    iput-object v3, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    new-instance v3, Ljava/io/FileInputStream;

    .line 89
    .line 90
    new-instance v4, Ljava/io/File;

    .line 91
    .line 92
    const-string v5, "actions.bin"

    .line 93
    .line 94
    invoke-direct {v4, p1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    .line 100
    :try_start_1
    invoke-static {v3}, Lcom/zykj/paint/Actions$EzyActionList;->m(Ljava/io/InputStream;)Lcom/zykj/paint/Actions$EzyActionList;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-eqz v4, :cond_3

    .line 105
    .line 106
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyActionList;->e()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    const/4 v6, 0x1

    .line 111
    if-ne v5, v6, :cond_2

    .line 112
    .line 113
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyActionList;->g()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const-string v5, "actionList.actionList"

    .line 118
    .line 119
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v4}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Lcom/zykj/paint/Actions$EzyAction;

    .line 127
    .line 128
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyAction;->o()Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-nez v4, :cond_2

    .line 133
    .line 134
    new-instance v4, Ly3/b;

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-static {v5, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v6, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->a:Landroid/util/AttributeSet;

    .line 144
    .line 145
    invoke-direct {v4, v5, v6}, Ly3/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :catchall_1
    move-exception v4

    .line 150
    goto :goto_2

    .line 151
    :cond_2
    new-instance v4, Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 152
    .line 153
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-static {v5, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-object v6, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->a:Landroid/util/AttributeSet;

    .line 161
    .line 162
    invoke-direct {v4, v5, v6}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 163
    .line 164
    .line 165
    :goto_0
    iput-object v4, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 166
    .line 167
    sget-object v4, Lh7/p;->a:Lh7/p;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 168
    .line 169
    :cond_3
    :try_start_2
    invoke-static {v3, v2}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    .line 171
    .line 172
    :goto_1
    iget-object v1, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 173
    .line 174
    if-eqz v1, :cond_5

    .line 175
    .line 176
    instance-of v2, v1, Landroid/view/View;

    .line 177
    .line 178
    if-eqz v2, :cond_4

    .line 179
    .line 180
    move-object v2, v1

    .line 181
    check-cast v2, Landroid/view/View;

    .line 182
    .line 183
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 184
    .line 185
    .line 186
    :cond_4
    invoke-interface {v1, p1, p2, p3}, Lx3/b;->loadData(Ljava/lang/String;Lx7/l;Lx7/l;)V

    .line 187
    .line 188
    .line 189
    sget-object v2, Lh7/p;->a:Lh7/p;

    .line 190
    .line 191
    :cond_5
    if-nez v2, :cond_9

    .line 192
    .line 193
    new-instance p1, Ljava/lang/Exception;

    .line 194
    .line 195
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-interface {p3, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :goto_2
    :try_start_3
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 203
    :catchall_2
    move-exception v5

    .line 204
    :try_start_4
    invoke-static {v3, v4}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    throw v5
    :try_end_4
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 208
    :goto_3
    :try_start_5
    invoke-interface {p3, v1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 209
    .line 210
    .line 211
    iget-object v1, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 212
    .line 213
    if-eqz v1, :cond_7

    .line 214
    .line 215
    instance-of v2, v1, Landroid/view/View;

    .line 216
    .line 217
    if-eqz v2, :cond_6

    .line 218
    .line 219
    move-object v2, v1

    .line 220
    check-cast v2, Landroid/view/View;

    .line 221
    .line 222
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 223
    .line 224
    .line 225
    :cond_6
    invoke-interface {v1, p1, p2, p3}, Lx3/b;->loadData(Ljava/lang/String;Lx7/l;Lx7/l;)V

    .line 226
    .line 227
    .line 228
    sget-object v2, Lh7/p;->a:Lh7/p;

    .line 229
    .line 230
    :cond_7
    if-nez v2, :cond_9

    .line 231
    .line 232
    new-instance p1, Ljava/lang/Exception;

    .line 233
    .line 234
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :goto_4
    invoke-interface {p3, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :catch_1
    :try_start_6
    new-instance v3, Ly3/b;

    .line 242
    .line 243
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    iget-object v1, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->a:Landroid/util/AttributeSet;

    .line 251
    .line 252
    invoke-direct {v3, v4, v1}, Ly3/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 253
    .line 254
    .line 255
    iput-object v3, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 256
    .line 257
    instance-of v1, v3, Landroid/view/View;

    .line 258
    .line 259
    if-eqz v1, :cond_8

    .line 260
    .line 261
    move-object v1, v3

    .line 262
    check-cast v1, Landroid/view/View;

    .line 263
    .line 264
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 265
    .line 266
    .line 267
    :cond_8
    invoke-interface {v3, p1, p2, p3}, Lx3/b;->loadData(Ljava/lang/String;Lx7/l;Lx7/l;)V

    .line 268
    .line 269
    .line 270
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 271
    .line 272
    if-nez p1, :cond_9

    .line 273
    .line 274
    new-instance p1, Ljava/lang/Exception;

    .line 275
    .line 276
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_9
    :goto_5
    return-void

    .line 281
    :goto_6
    iget-object v3, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 282
    .line 283
    if-eqz v3, :cond_b

    .line 284
    .line 285
    instance-of v2, v3, Landroid/view/View;

    .line 286
    .line 287
    if-eqz v2, :cond_a

    .line 288
    .line 289
    move-object v2, v3

    .line 290
    check-cast v2, Landroid/view/View;

    .line 291
    .line 292
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 293
    .line 294
    .line 295
    :cond_a
    invoke-interface {v3, p1, p2, p3}, Lx3/b;->loadData(Ljava/lang/String;Lx7/l;Lx7/l;)V

    .line 296
    .line 297
    .line 298
    sget-object v2, Lh7/p;->a:Lh7/p;

    .line 299
    .line 300
    :cond_b
    if-nez v2, :cond_c

    .line 301
    .line 302
    new-instance p1, Ljava/lang/Exception;

    .line 303
    .line 304
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-interface {p3, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    :cond_c
    throw v1
.end method

.method public final i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lx3/b;->pause()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lx3/b;->release()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final k(Lx3/c;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lx3/b;->b(Lx3/c;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lx3/b;->resume()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final m(ILx7/l;Lx7/l;)V
    .locals 1

    .line 1
    const-string v0, "onSuccess"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onFailure"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, p1, p2, p3}, Lx3/b;->seekTo(ILx7/l;Lx7/l;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final n(D)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lx3/b;->c(D)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lx3/b;->start()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final p()Lcom/zykj/merge/sketch/constant/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lx3/b;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final q()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lx3/b;->waiting()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    instance-of v1, v0, Lx3/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lx3/a;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lx3/a;->setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final setScaleEnable(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    instance-of v1, v0, Lx3/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lx3/a;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lx3/a;->setScaleEnable(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final setTranslateEnable(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->b:Lx3/b;

    .line 2
    .line 3
    instance-of v1, v0, Lx3/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lx3/a;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lx3/a;->setTranslateEnable(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
