.class public Lcom/xuexiang/xui/widget/imageview/photoview/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/imageview/photoview/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final a:Li2/c;

.field public b:I

.field public c:I

.field public final synthetic d:Lcom/xuexiang/xui/widget/imageview/photoview/c;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/photoview/c;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->d:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Li2/c;->f(Landroid/content/Context;)Li2/c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->a:Li2/c;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "PhotoViewAttacher"

    .line 8
    .line 9
    const-string v1, "Cancel Fling"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lq1/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->a:Li2/c;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Li2/c;->c(Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public b(IIII)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->d:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->q()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 12
    .line 13
    neg-float v1, v1

    .line 14
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    int-to-float p1, p1

    .line 19
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    cmpg-float v1, p1, v1

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-gez v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    sub-float/2addr v1, p1

    .line 33
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    move v8, p1

    .line 38
    move v7, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v7, v3

    .line 41
    move v8, v7

    .line 42
    :goto_0
    iget p1, v0, Landroid/graphics/RectF;->top:F

    .line 43
    .line 44
    neg-float p1, p1

    .line 45
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    int-to-float p1, p2

    .line 50
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    cmpg-float p2, p1, p2

    .line 55
    .line 56
    if-gez p2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    sub-float/2addr p2, p1

    .line 63
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    move v10, p1

    .line 68
    move v9, v2

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move v9, v4

    .line 71
    move v10, v9

    .line 72
    :goto_1
    iput v3, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->b:I

    .line 73
    .line 74
    iput v4, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->c:I

    .line 75
    .line 76
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->g()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    new-instance p1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string p2, "fling. StartX:"

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p2, " StartY:"

    .line 96
    .line 97
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p2, " MaxX:"

    .line 104
    .line 105
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string p2, " MaxY:"

    .line 112
    .line 113
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    const-string p2, "PhotoViewAttacher"

    .line 124
    .line 125
    invoke-static {p2, p1}, Lq1/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_3
    if-ne v3, v8, :cond_5

    .line 129
    .line 130
    if-eq v4, v10, :cond_4

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    :goto_2
    return-void

    .line 134
    :cond_5
    :goto_3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->a:Li2/c;

    .line 135
    .line 136
    const/4 v11, 0x0

    .line 137
    const/4 v12, 0x0

    .line 138
    move/from16 v5, p3

    .line 139
    .line 140
    move/from16 v6, p4

    .line 141
    .line 142
    invoke-virtual/range {v2 .. v12}, Li2/c;->b(IIIIIIIIII)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->a:Li2/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Li2/c;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->d:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->u()Landroid/widget/ImageView;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->a:Li2/c;

    .line 19
    .line 20
    invoke-virtual {v1}, Li2/c;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->a:Li2/c;

    .line 27
    .line 28
    invoke-virtual {v1}, Li2/c;->d()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->a:Li2/c;

    .line 33
    .line 34
    invoke-virtual {v2}, Li2/c;->e()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->g()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    new-instance v3, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v4, "fling run(). CurrentX:"

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->b:I

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v4, " CurrentY:"

    .line 60
    .line 61
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->c:I

    .line 65
    .line 66
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v4, " NewX:"

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v4, " NewY:"

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    const-string v4, "PhotoViewAttacher"

    .line 90
    .line 91
    invoke-static {v4, v3}, Lq1/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->d:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 95
    .line 96
    invoke-static {v3}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->h(Lcom/xuexiang/xui/widget/imageview/photoview/c;)Landroid/graphics/Matrix;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->b:I

    .line 101
    .line 102
    sub-int/2addr v4, v1

    .line 103
    int-to-float v4, v4

    .line 104
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->c:I

    .line 105
    .line 106
    sub-int/2addr v5, v2

    .line 107
    int-to-float v5, v5

    .line 108
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 109
    .line 110
    .line 111
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->d:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 112
    .line 113
    invoke-static {v3}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->i(Lcom/xuexiang/xui/widget/imageview/photoview/c;)Landroid/graphics/Matrix;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-static {v3, v4}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->j(Lcom/xuexiang/xui/widget/imageview/photoview/c;Landroid/graphics/Matrix;)V

    .line 118
    .line 119
    .line 120
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->b:I

    .line 121
    .line 122
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$d;->c:I

    .line 123
    .line 124
    invoke-static {v0, p0}, Lg2/a;->c(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 125
    .line 126
    .line 127
    :cond_2
    :goto_0
    return-void
.end method
