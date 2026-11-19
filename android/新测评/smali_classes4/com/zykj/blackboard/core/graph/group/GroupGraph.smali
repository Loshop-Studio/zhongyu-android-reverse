.class public Lcom/zykj/blackboard/core/graph/group/GroupGraph;
.super Ls4/a;
.source "SourceFile"

# interfaces
.implements Lr4/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/graph/group/GroupGraph$a;
    }
.end annotation


# static fields
.field public static final r:Lcom/zykj/blackboard/core/graph/group/GroupGraph$a;


# instance fields
.field public i:Ljava/lang/String;

.field public j:Ljava/lang/Integer;

.field public k:Z

.field public final l:Landroid/graphics/RectF;

.field public m:Landroid/graphics/Bitmap;

.field public n:Landroid/graphics/Matrix;

.field public final o:Landroid/graphics/Matrix;

.field public p:F

.field public q:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/graph/group/GroupGraph$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->r:Lcom/zykj/blackboard/core/graph/group/GroupGraph$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outRectF"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Ls4/a;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 3
    iput-object p3, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->i:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->j:Ljava/lang/Integer;

    .line 5
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 6
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->n:Landroid/graphics/Matrix;

    .line 7
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->o:Landroid/graphics/Matrix;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public static final synthetic y(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public A(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "newMatrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lq4/a;->b()Landroid/graphics/Matrix;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lq4/a;->v()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 18
    .line 19
    return-void
.end method

.method public final B(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lkotlin/jvm/functions/Function1;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Le5/b;->a:Le5/b;

    .line 6
    .line 7
    filled-new-array {v0}, [Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v2, Lcom/zykj/blackboard/core/graph/group/GroupGraph$drawChildrenDirectly$1;

    .line 12
    .line 13
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$drawChildrenDirectly$1;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0, v2}, Le5/b;->a([Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lq4/a;->t()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    move-object v2, v1

    .line 41
    check-cast v2, Lq4/c;

    .line 42
    .line 43
    const-string v1, "it"

    .line 44
    .line 45
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/16 v8, 0x18

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    move-object v3, p1

    .line 54
    move-object v4, p2

    .line 55
    move-object v5, p3

    .line 56
    invoke-static/range {v2 .. v9}, Lq4/b$a;->a(Lq4/b;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lkotlin/jvm/functions/Function1;ZZILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    return-void
.end method

.method public final C(ZLandroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Lq4/a;->j(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->p:F

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    cmpl-float p1, p1, v0

    .line 11
    .line 12
    if-lez p1, :cond_0

    .line 13
    .line 14
    iget p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->q:F

    .line 15
    .line 16
    cmpl-float p1, p1, v0

    .line 17
    .line 18
    if-lez p1, :cond_0

    .line 19
    .line 20
    new-instance p1, Landroid/graphics/RectF;

    .line 21
    .line 22
    iget v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->p:F

    .line 23
    .line 24
    const/high16 v1, 0x43480000    # 200.0f

    .line 25
    .line 26
    add-float/2addr v0, v1

    .line 27
    iget v2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->q:F

    .line 28
    .line 29
    add-float/2addr v2, v1

    .line 30
    const/high16 v1, -0x3cb80000    # -200.0f

    .line 31
    .line 32
    invoke-direct {p1, v1, v1, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    return-object p1

    .line 43
    :cond_0
    return-object p2
.end method

.method public final D()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->n:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method public final F(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/16 v0, 0x9

    .line 10
    .line 11
    new-array v2, v0, [F

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 14
    .line 15
    .line 16
    new-array p1, v0, [F

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 19
    .line 20
    .line 21
    aget p2, v2, v1

    .line 22
    .line 23
    aget v0, p1, v1

    .line 24
    .line 25
    cmpg-float p2, p2, v0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    if-nez p2, :cond_2

    .line 29
    .line 30
    const/4 p2, 0x4

    .line 31
    aget v3, v2, p2

    .line 32
    .line 33
    aget p2, p1, p2

    .line 34
    .line 35
    cmpg-float p2, v3, p2

    .line 36
    .line 37
    if-nez p2, :cond_2

    .line 38
    .line 39
    const/4 p2, 0x2

    .line 40
    aget v3, v2, p2

    .line 41
    .line 42
    aget p2, p1, p2

    .line 43
    .line 44
    sub-float/2addr v3, p2

    .line 45
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    const/4 v3, 0x5

    .line 50
    aget v2, v2, v3

    .line 51
    .line 52
    aget p1, p1, v3

    .line 53
    .line 54
    sub-float/2addr v2, p1

    .line 55
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    const/high16 v2, 0x42c80000    # 100.0f

    .line 60
    .line 61
    cmpl-float p2, p2, v2

    .line 62
    .line 63
    if-gtz p2, :cond_2

    .line 64
    .line 65
    cmpl-float p1, p1, v2

    .line 66
    .line 67
    if-lez p1, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    return v1

    .line 71
    :cond_2
    :goto_0
    return v0
.end method

.method public final G(ZLandroid/graphics/Matrix;Lkotlin/jvm/functions/Function1;)Z
    .locals 10

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->C(ZLandroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    sget-object p1, Le5/b;->a:Le5/b;

    .line 9
    .line 10
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    filled-new-array {p2}, [Landroid/graphics/Bitmap;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    new-instance p3, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$nextRenderRect$1$1;

    .line 17
    .line 18
    invoke-direct {p3, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$nextRenderRect$1$1;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p3}, Le5/b;->a([Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;)V

    .line 22
    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    float-to-int p1, p1

    .line 37
    const/4 v1, 0x1

    .line 38
    add-int/2addr p1, v1

    .line 39
    iget-object v2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    float-to-int v2, v2

    .line 46
    add-int/2addr v2, v1

    .line 47
    int-to-long v3, p1

    .line 48
    int-to-long v5, v2

    .line 49
    mul-long/2addr v3, v5

    .line 50
    const-wide/16 v5, 0x4

    .line 51
    .line 52
    mul-long/2addr v3, v5

    .line 53
    if-lez p1, :cond_5

    .line 54
    .line 55
    if-lez v2, :cond_5

    .line 56
    .line 57
    const/16 v5, 0x1000

    .line 58
    .line 59
    if-gt p1, v5, :cond_5

    .line 60
    .line 61
    if-le v2, v5, :cond_1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    const-wide/32 v5, 0x6400000

    .line 65
    .line 66
    .line 67
    cmp-long v3, v3, v5

    .line 68
    .line 69
    if-ltz v3, :cond_2

    .line 70
    .line 71
    sget-object p1, Le5/b;->a:Le5/b;

    .line 72
    .line 73
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 74
    .line 75
    filled-new-array {p2}, [Landroid/graphics/Bitmap;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    new-instance p3, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$2;

    .line 80
    .line 81
    invoke-direct {p3, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$2;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2, p3}, Le5/b;->a([Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;)V

    .line 85
    .line 86
    .line 87
    return v0

    .line 88
    :cond_2
    :try_start_0
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 89
    .line 90
    invoke-static {p1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 91
    .line 92
    .line 93
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    const/4 p1, 0x0

    .line 96
    :goto_0
    if-nez p1, :cond_3

    .line 97
    .line 98
    sget-object p1, Le5/b;->a:Le5/b;

    .line 99
    .line 100
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 101
    .line 102
    filled-new-array {p2}, [Landroid/graphics/Bitmap;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    new-instance p3, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$3;

    .line 107
    .line 108
    invoke-direct {p3, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$3;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2, p3}, Le5/b;->a([Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;)V

    .line 112
    .line 113
    .line 114
    return v0

    .line 115
    :cond_3
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 116
    .line 117
    new-instance v3, Landroid/graphics/Canvas;

    .line 118
    .line 119
    invoke-direct {v3, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 123
    .line 124
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 125
    .line 126
    neg-float v0, v0

    .line 127
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 128
    .line 129
    neg-float p1, p1

    .line 130
    invoke-virtual {v3, v0, p1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v3, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Lq4/a;->t()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_4

    .line 149
    .line 150
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    move-object v2, v0

    .line 155
    check-cast v2, Lq4/c;

    .line 156
    .line 157
    const-string v0, "it"

    .line 158
    .line 159
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const/16 v8, 0x18

    .line 163
    .line 164
    const/4 v9, 0x0

    .line 165
    const/4 v6, 0x0

    .line 166
    const/4 v7, 0x0

    .line 167
    move-object v4, p2

    .line 168
    move-object v5, p3

    .line 169
    invoke-static/range {v2 .. v9}, Lq4/b$a;->a(Lq4/b;Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lkotlin/jvm/functions/Function1;ZZILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    return v1

    .line 174
    :cond_5
    :goto_2
    sget-object p1, Le5/b;->a:Le5/b;

    .line 175
    .line 176
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 177
    .line 178
    filled-new-array {p2}, [Landroid/graphics/Bitmap;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    new-instance p3, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$1;

    .line 183
    .line 184
    invoke-direct {p3, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$updateGroupBitmap$1;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, p2, p3}, Le5/b;->a([Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;)V

    .line 188
    .line 189
    .line 190
    return v0
.end method

.method public final H(ZLandroid/graphics/Matrix;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->C(ZLandroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    float-to-int p2, p2

    .line 25
    const/4 v2, 0x1

    .line 26
    add-int/2addr p2, v2

    .line 27
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    float-to-int v3, v3

    .line 32
    add-int/2addr v3, v2

    .line 33
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ne p2, v4, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eq v3, p2, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :cond_3
    :goto_0
    return v1
.end method

.method public c()Lq4/a;
    .locals 7

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    .line 2
    .line 3
    invoke-virtual {p0}, Lq4/a;->getId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {p0}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-direct {v2, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 14
    .line 15
    .line 16
    const/16 v5, 0xc

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lq4/a;->b()Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lq4/a;->u(Landroid/graphics/Matrix;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lq4/a;->t()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lq4/c;

    .line 50
    .line 51
    invoke-interface {v2}, Lq4/c;->c()Lq4/a;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->s(Lq4/c;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-object v0
.end method

.method public e(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lq4/a;->e(Landroid/graphics/Matrix;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 11
    .line 12
    return-void
.end method

.method public graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public l(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method public m(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "matrix"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public o(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    const-string v0, "newRectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lq4/a;->v()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 18
    .line 19
    return-void
.end method

.method public onDestroy()V
    .locals 3

    .line 1
    invoke-super {p0}, Lq4/a;->onDestroy()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Le5/b;->a:Le5/b;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    filled-new-array {v1}, [Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/blackboard/core/graph/group/GroupGraph$onDestroy$1;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph$onDestroy$1;-><init>(Lcom/zykj/blackboard/core/graph/group/GroupGraph;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Le5/b;->a([Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public q(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lkotlin/jvm/functions/Function1;ZZ)V
    .locals 2

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->o:Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-virtual {p0, v0, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->F(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x1

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iput-boolean v1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-ne v0, v1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 51
    .line 52
    if-nez v0, :cond_4

    .line 53
    .line 54
    if-eqz p5, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-virtual {p0, p5, p2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->H(ZLandroid/graphics/Matrix;)Z

    .line 58
    .line 59
    .line 60
    move-result p4

    .line 61
    if-nez p4, :cond_7

    .line 62
    .line 63
    invoke-virtual {p0, p5, p2, p3}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->G(ZLandroid/graphics/Matrix;Lkotlin/jvm/functions/Function1;)Z

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    if-eqz p4, :cond_7

    .line 68
    .line 69
    iget-object p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->o:Landroid/graphics/Matrix;

    .line 70
    .line 71
    invoke-virtual {p4, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    :goto_0
    if-eqz p4, :cond_5

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 78
    .line 79
    .line 80
    move-result p4

    .line 81
    int-to-float p4, p4

    .line 82
    iput p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->p:F

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result p4

    .line 88
    int-to-float p4, p4

    .line 89
    iput p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->q:F

    .line 90
    .line 91
    :cond_5
    invoke-virtual {p0, p5, p2, p3}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->G(ZLandroid/graphics/Matrix;Lkotlin/jvm/functions/Function1;)Z

    .line 92
    .line 93
    .line 94
    move-result p4

    .line 95
    if-eqz p4, :cond_6

    .line 96
    .line 97
    iget-object p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->o:Landroid/graphics/Matrix;

    .line 98
    .line 99
    invoke-virtual {p4, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 100
    .line 101
    .line 102
    :cond_6
    const/4 p4, 0x0

    .line 103
    iput-boolean p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 104
    .line 105
    :cond_7
    :goto_1
    iget-object p4, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->m:Landroid/graphics/Bitmap;

    .line 106
    .line 107
    if-eqz p4, :cond_8

    .line 108
    .line 109
    invoke-virtual {p4}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 110
    .line 111
    .line 112
    move-result p5

    .line 113
    if-nez p5, :cond_8

    .line 114
    .line 115
    invoke-virtual {p0, p4}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->z(Landroid/graphics/Bitmap;)Z

    .line 116
    .line 117
    .line 118
    move-result p5

    .line 119
    if-eqz p5, :cond_8

    .line 120
    .line 121
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->l:Landroid/graphics/RectF;

    .line 122
    .line 123
    iget p3, p2, Landroid/graphics/RectF;->left:F

    .line 124
    .line 125
    iget p2, p2, Landroid/graphics/RectF;->top:F

    .line 126
    .line 127
    const/4 p5, 0x0

    .line 128
    invoke-virtual {p1, p4, p3, p2, p5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_8
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->B(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lkotlin/jvm/functions/Function1;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public r(Lq4/c;)V
    .locals 1

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lq4/a;->r(Lq4/c;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 11
    .line 12
    return-void
.end method

.method public s(Lq4/c;)V
    .locals 1

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lq4/a;->s(Lq4/c;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->k:Z

    .line 11
    .line 12
    return-void
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->j:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z(Landroid/graphics/Bitmap;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-long v0, p1

    .line 6
    const-wide/32 v2, 0x6400000

    .line 7
    .line 8
    .line 9
    cmp-long p1, v0, v2

    .line 10
    .line 11
    if-gez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method
