.class public Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->h(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "#onContentScrollToBottom#"

    .line 2
    .line 3
    const-string v1, "ELinkageScrollLayout"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->a(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v2, 0x11

    .line 15
    .line 16
    if-eq v0, v2, :cond_0

    .line 17
    .line 18
    const-string p1, "onContentScrollToBottom, Invalid Fling Orientation"

    .line 19
    .line 20
    invoke-static {v1, p1}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 25
    .line 26
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->g(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Ly8/c;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ly8/c;->f()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 47
    .line 48
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget p1, p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;->a:I

    .line 62
    .line 63
    if-eq v0, p1, :cond_4

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 67
    .line 68
    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_6

    .line 77
    .line 78
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 79
    .line 80
    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrVelocity()F

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    const/4 v0, 0x0

    .line 89
    cmpl-float v0, p1, v0

    .line 90
    .line 91
    if-lez v0, :cond_5

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    neg-float p1, p1

    .line 95
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v2, "onContentScrollToBottom, currVelocity: "

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v1, v0}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 116
    .line 117
    invoke-static {v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 125
    .line 126
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->f(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;F)V

    .line 127
    .line 128
    .line 129
    :cond_6
    :goto_1
    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "#onContentScrollToTop#"

    .line 2
    .line 3
    const-string v1, "ELinkageScrollLayout"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->a(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v2, 0x12

    .line 15
    .line 16
    if-eq v0, v2, :cond_0

    .line 17
    .line 18
    const-string p1, "onContentScrollToTop, Invalid Fling Orientation"

    .line 19
    .line 20
    invoke-static {v1, p1}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 25
    .line 26
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->b(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Ly8/c;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ly8/c;->f()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 47
    .line 48
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;Landroid/view/View;)Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget p1, p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$b;->a:I

    .line 62
    .line 63
    if-eq v0, p1, :cond_4

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 67
    .line 68
    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_6

    .line 77
    .line 78
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 79
    .line 80
    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrVelocity()F

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    const/4 v0, 0x0

    .line 89
    cmpg-float v0, p1, v0

    .line 90
    .line 91
    if-gez v0, :cond_5

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    neg-float p1, p1

    .line 95
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v2, "onContentScrollToTop, currVelocity: "

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v1, v0}, Lb8/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 116
    .line 117
    invoke-static {v0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->e(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)Landroid/widget/Scroller;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 125
    .line 126
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->f(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;F)V

    .line 127
    .line 128
    .line 129
    :cond_6
    :goto_1
    return-void
.end method
