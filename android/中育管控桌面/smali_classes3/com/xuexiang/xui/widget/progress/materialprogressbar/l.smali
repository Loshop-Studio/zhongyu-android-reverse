.class public Lcom/xuexiang/xui/widget/progress/materialprogressbar/l;
.super Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/k;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/k;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/x;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/x;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/x;

    .line 12
    .line 13
    invoke-direct {v2, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/x;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    aput-object v0, v3, v4

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    aput-object v1, v3, v0

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    aput-object v2, v3, v0

    .line 27
    .line 28
    invoke-direct {p0, v3, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;-><init>([Landroid/graphics/drawable/Drawable;Landroid/content/Context;)V

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

.method public bridge synthetic c(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->c(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic d()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
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
