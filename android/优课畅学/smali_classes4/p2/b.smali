.class public abstract Lp2/b;
.super Lp2/c;
.source "SourceFile"


# instance fields
.field public A:Z

.field public y:Landroid/widget/ListView;

.field public z:Landroid/widget/ListAdapter;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/widget/ListAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lp2/c;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lp2/b;->z:Landroid/widget/ListAdapter;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public w(II)Lp2/b;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lp2/a;->d()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x40a00000    # 5.0f

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/b;->a(Landroid/content/Context;F)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lcom/xuexiang/xui/widget/XUIWrapContentListView;

    .line 15
    .line 16
    invoke-virtual {p0}, Lp2/a;->d()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-direct {v2, v3, p2}, Lcom/xuexiang/xui/widget/XUIWrapContentListView;-><init>(Landroid/content/Context;I)V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Lp2/b;->y:Landroid/widget/ListView;

    .line 24
    .line 25
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 26
    .line 27
    invoke-direct {v2, p1, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v1, v0, v1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lp2/b;->y:Landroid/widget/ListView;

    .line 34
    .line 35
    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance p2, Lcom/xuexiang/xui/widget/XUIWrapContentListView;

    .line 40
    .line 41
    invoke-virtual {p0}, Lp2/a;->d()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {p2, v2}, Lcom/xuexiang/xui/widget/XUIWrapContentListView;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Lp2/b;->y:Landroid/widget/ListView;

    .line 49
    .line 50
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 51
    .line 52
    const/4 v2, -0x2

    .line 53
    invoke-direct {p2, p1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v1, v0, v1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lp2/b;->y:Landroid/widget/ListView;

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    iget-object p1, p0, Lp2/b;->y:Landroid/widget/ListView;

    .line 65
    .line 66
    invoke-virtual {p1, v0, v1, v0, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lp2/b;->y:Landroid/widget/ListView;

    .line 70
    .line 71
    iget-object p2, p0, Lp2/b;->z:Landroid/widget/ListAdapter;

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lp2/b;->y:Landroid/widget/ListView;

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lp2/b;->y:Landroid/widget/ListView;

    .line 82
    .line 83
    const/4 p2, 0x2

    .line 84
    invoke-virtual {p1, p2}, Landroid/view/View;->setOverScrollMode(I)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lp2/b;->y:Landroid/widget/ListView;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, Lp2/b;->y(Landroid/widget/ListView;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lp2/b;->y:Landroid/widget/ListView;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Lp2/c;->m(Landroid/view/View;)V

    .line 95
    .line 96
    .line 97
    return-object p0
.end method

.method public x(Z)Lp2/b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lp2/b;->A:Z

    .line 2
    .line 3
    iget-object p1, p0, Lp2/b;->y:Landroid/widget/ListView;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lp2/b;->y(Landroid/widget/ListView;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object p0
.end method

.method public final y(Landroid/widget/ListView;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lp2/b;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 6
    .line 7
    invoke-virtual {p0}, Lp2/a;->d()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget v2, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_light:I

    .line 12
    .line 13
    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lk1/b;->h()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lp2/a;->d()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/high16 v1, 0x3f800000    # 1.0f

    .line 34
    .line 35
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/b;->a(Landroid/content/Context;F)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-virtual {p0}, Lp2/a;->d()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/high16 v1, 0x3f000000    # 0.5f

    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/b;->a(Landroid/content/Context;F)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    const/4 v0, 0x0

    .line 58
    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method
