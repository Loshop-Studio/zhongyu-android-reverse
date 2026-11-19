.class public final Lcom/zykj/blackboard/core/canvas/view/FixView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lw9/c;


# instance fields
.field public c:Landroid/graphics/Bitmap;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/canvas/view/FixView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/canvas/view/FixView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/FixView;->e:Ljava/util/Map;

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/FixView;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/view/FixView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic c(Lcom/zykj/blackboard/core/canvas/view/FixView;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/canvas/view/FixView;->d(Lcom/zykj/blackboard/core/canvas/view/FixView;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static final d(Lcom/zykj/blackboard/core/canvas/view/FixView;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$old"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/FixView;->d:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lcom/zykj/blackboard/core/canvas/view/FixView;->c:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    invoke-static {p1, p0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :goto_1
    monitor-exit v0

    .line 39
    throw p0
.end method

.method private final getMBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/FixView;->c:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/FixView;->c:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)V
    .locals 7

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string p1, "\u9875\u9762 FixView.kt -> draw\uff0c\u4f20\u5165\u6e90\u4f4d\u56fe\u5df2\u56de\u6536\uff0c\u653e\u5f03\u62f7\u8d1d"

    .line 13
    .line 14
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    :try_start_0
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 27
    .line 28
    .line 29
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_1

    .line 31
    :catch_0
    move-exception p1

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v2, "\u9875\u9762 FixView.kt -> draw\uff0c\u53d1\u751f\u672a\u77e5\u5f02\u5e38\uff0c\u5f02\u5e38="

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    move-object p1, v1

    .line 61
    goto :goto_1

    .line 62
    :catch_1
    move-exception v3

    .line 63
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 64
    .line 65
    const/16 v5, 0x1a

    .line 66
    .line 67
    if-lt v4, v5, :cond_1

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eqz v4, :cond_1

    .line 74
    .line 75
    const-string v5, "color space"

    .line 76
    .line 77
    const/4 v6, 0x1

    .line 78
    invoke-static {v4, v5, v6}, Lqd/c0;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-ne v4, v6, :cond_1

    .line 83
    .line 84
    const-string v3, "\u9875\u9762 FixView.kt -> draw\uff0cBitmap \u62f7\u8d1d\u7f3a\u5931 ColorSpace\uff0c\u6267\u884c\u5b89\u5168\u56de\u9000\u62f7\u8d1d"

    .line 85
    .line 86
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1, v0, v2}, Lcom/zykj/blackboard/core/canvas/view/FixView;->e(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v0, "\u9875\u9762 FixView.kt -> draw\uff0c\u53d1\u751f\u4e0d\u53ef\u63a7\u5f02\u5e38\uff0c\u5f02\u5e38="

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :goto_1
    if-eqz p1, :cond_3

    .line 128
    .line 129
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/FixView;->d:Ljava/lang/Object;

    .line 130
    .line 131
    monitor-enter v0

    .line 132
    :try_start_1
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/view/FixView;->c:Landroid/graphics/Bitmap;

    .line 133
    .line 134
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-nez v2, :cond_2

    .line 139
    .line 140
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/view/FixView;->c:Landroid/graphics/Bitmap;

    .line 141
    .line 142
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/FixView;->c:Landroid/graphics/Bitmap;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :catchall_0
    move-exception p1

    .line 146
    goto :goto_3

    .line 147
    :cond_2
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    .line 149
    monitor-exit v0

    .line 150
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 151
    .line 152
    .line 153
    if-eqz v1, :cond_3

    .line 154
    .line 155
    new-instance p1, Lw9/d;

    .line 156
    .line 157
    invoke-direct {p1, p0, v1}, Lw9/d;-><init>(Lcom/zykj/blackboard/core/canvas/view/FixView;Landroid/graphics/Bitmap;)V

    .line 158
    .line 159
    .line 160
    const-wide/16 v0, 0x64

    .line 161
    .line 162
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :goto_3
    monitor-exit v0

    .line 167
    throw p1

    .line 168
    :cond_3
    :goto_4
    return-void
.end method

.method public b()Landroid/graphics/Rect;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final e(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    const/16 v2, 0x1a

    .line 5
    .line 6
    if-lt v1, v2, :cond_0

    .line 7
    .line 8
    invoke-static {}, Landroidx/compose/ui/graphics/t1;->a()Landroid/graphics/ColorSpace$Named;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Landroidx/compose/ui/graphics/j2;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-static {v2, v3, p2, v4, v1}, Landroidx/core/graphics/a;->a(IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "createBitmap(source.widt\u2026ight, config, true, srgb)"

    .line 30
    .line 31
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-static {v1, v2, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "createBitmap(source.width, source.height, config)"

    .line 50
    .line 51
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    new-instance v2, Landroid/graphics/Canvas;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 57
    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-virtual {v2, p1, v3, v3, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p2, p3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string p3, "\u9875\u9762 FixView.kt -> fallbackSafeCopy\uff0c\u6267\u884c\u5931\u8d25\uff0c\u5f02\u5e38="

    .line 77
    .line 78
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x3

    .line 11
    invoke-direct {v0, v1, v2}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/FixView;->d:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/canvas/view/FixView;->getMBitmap()Landroid/graphics/Bitmap;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    sget-object v2, Lna/e;->a:Lna/e;

    .line 27
    .line 28
    new-instance v3, Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, p1, v1, v3}, Lna/e;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :goto_1
    monitor-exit v0

    .line 44
    throw p1
.end method

.method public reset()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/FixView;->c:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
