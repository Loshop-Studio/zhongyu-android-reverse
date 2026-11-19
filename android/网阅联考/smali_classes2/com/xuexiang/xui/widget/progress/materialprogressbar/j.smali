.class public Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;
.super Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;
.source "SourceFile"


# direct methods
.method public constructor <init>(ILandroid/content/Context;)V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;

    .line 5
    .line 6
    invoke-direct {v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v1, v0, v2

    .line 11
    .line 12
    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 13
    .line 14
    invoke-direct {v1, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    aput-object v1, v0, v2

    .line 19
    .line 20
    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 21
    .line 22
    invoke-direct {v1, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;-><init>(I)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    aput-object v1, v0, p1

    .line 27
    .line 28
    invoke-direct {p0, v0, p2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;-><init>([Landroid/graphics/drawable/Drawable;Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic b(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->b(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic c()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic d(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->d(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setTint(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->setTint(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
