.class public Lcom/xuexiang/xui/widget/guidview/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public c:Lcom/xuexiang/xui/widget/guidview/FocusShape;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/xuexiang/xui/widget/guidview/FocusShape;Landroid/view/View;DZII)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/DisplayMetrics;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 18
    .line 19
    .line 20
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 21
    .line 22
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 23
    .line 24
    iput v1, p0, Lcom/xuexiang/xui/widget/guidview/a;->a:I

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz p6, :cond_0

    .line 28
    .line 29
    move v2, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {p1}, Lcom/xuexiang/xui/widget/guidview/d;->a(Landroid/content/Context;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    :goto_0
    sub-int/2addr v0, v2

    .line 36
    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->b:I

    .line 37
    .line 38
    if-eqz p3, :cond_3

    .line 39
    .line 40
    const/4 v0, -0x1

    .line 41
    if-ne p7, v0, :cond_2

    .line 42
    .line 43
    if-eqz p6, :cond_1

    .line 44
    .line 45
    move p7, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-static {p1}, Lcom/xuexiang/xui/widget/guidview/d;->a(Landroid/content/Context;)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    move p7, p1

    .line 52
    :cond_2
    :goto_1
    const/4 p1, 0x2

    .line 53
    new-array p6, p1, [I

    .line 54
    .line 55
    invoke-virtual {p3, p6}, Landroid/view/View;->getLocationInWindow([I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->d:I

    .line 63
    .line 64
    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->e:I

    .line 69
    .line 70
    iput-object p2, p0, Lcom/xuexiang/xui/widget/guidview/a;->c:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    .line 71
    .line 72
    aget p2, p6, v1

    .line 73
    .line 74
    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/a;->d:I

    .line 75
    .line 76
    div-int/2addr v1, p1

    .line 77
    add-int/2addr p2, v1

    .line 78
    add-int/2addr p2, p8

    .line 79
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/a;->f:I

    .line 80
    .line 81
    const/4 p2, 0x1

    .line 82
    aget p6, p6, p2

    .line 83
    .line 84
    div-int/2addr v0, p1

    .line 85
    add-int/2addr p6, v0

    .line 86
    sub-int/2addr p6, p7

    .line 87
    iput p6, p0, Lcom/xuexiang/xui/widget/guidview/a;->g:I

    .line 88
    .line 89
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    int-to-double p6, p1

    .line 94
    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    int-to-double v0, p1

    .line 99
    invoke-static {p6, p7, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    .line 100
    .line 101
    .line 102
    move-result-wide p6

    .line 103
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 104
    .line 105
    div-double/2addr p6, v0

    .line 106
    double-to-int p1, p6

    .line 107
    int-to-double p6, p1

    .line 108
    mul-double/2addr p6, p4

    .line 109
    double-to-int p1, p6

    .line 110
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/a;->h:I

    .line 111
    .line 112
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/guidview/a;->i:Z

    .line 113
    .line 114
    return-void

    .line 115
    :cond_3
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/guidview/a;->i:Z

    .line 116
    .line 117
    return-void
.end method


# virtual methods
.method public a(ID)F
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->h:I

    .line 2
    .line 3
    int-to-double v0, v0

    .line 4
    int-to-double v2, p1

    .line 5
    mul-double/2addr v2, p2

    .line 6
    add-double/2addr v0, v2

    .line 7
    double-to-float p1, v0

    .line 8
    return p1
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public e()Lcom/xuexiang/xui/widget/guidview/FocusShape;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->c:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public h(ID)F
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->g:I

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/a;->e:I

    .line 4
    .line 5
    div-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    int-to-double v0, v0

    .line 9
    int-to-double v2, p1

    .line 10
    mul-double/2addr v2, p2

    .line 11
    add-double/2addr v0, v2

    .line 12
    double-to-float p1, v0

    .line 13
    return p1
.end method

.method public i(ID)F
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->f:I

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/a;->d:I

    .line 4
    .line 5
    div-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    int-to-double v0, v0

    .line 9
    int-to-double v2, p1

    .line 10
    mul-double/2addr v2, p2

    .line 11
    sub-double/2addr v0, v2

    .line 12
    double-to-float p1, v0

    .line 13
    return p1
.end method

.method public j(ID)F
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->f:I

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/a;->d:I

    .line 4
    .line 5
    div-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    int-to-double v0, v0

    .line 9
    int-to-double v2, p1

    .line 10
    mul-double/2addr v2, p2

    .line 11
    add-double/2addr v0, v2

    .line 12
    double-to-float p1, v0

    .line 13
    return p1
.end method

.method public k(ID)F
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/a;->g:I

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/a;->e:I

    .line 4
    .line 5
    div-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    int-to-double v0, v0

    .line 9
    int-to-double v2, p1

    .line 10
    mul-double/2addr v2, p2

    .line 11
    sub-double/2addr v0, v2

    .line 12
    double-to-float p1, v0

    .line 13
    return p1
.end method

.method public l(III)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/a;->f:I

    .line 2
    .line 3
    iput p3, p0, Lcom/xuexiang/xui/widget/guidview/a;->h:I

    .line 4
    .line 5
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/a;->g:I

    .line 6
    .line 7
    sget-object p1, Lcom/xuexiang/xui/widget/guidview/FocusShape;->c:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/a;->c:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/guidview/a;->i:Z

    .line 13
    .line 14
    return-void
.end method

.method public m(IIII)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/a;->f:I

    .line 2
    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/a;->g:I

    .line 4
    .line 5
    iput p3, p0, Lcom/xuexiang/xui/widget/guidview/a;->d:I

    .line 6
    .line 7
    iput p4, p0, Lcom/xuexiang/xui/widget/guidview/a;->e:I

    .line 8
    .line 9
    sget-object p1, Lcom/xuexiang/xui/widget/guidview/FocusShape;->d:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/a;->c:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/guidview/a;->i:Z

    .line 15
    .line 16
    return-void
.end method
