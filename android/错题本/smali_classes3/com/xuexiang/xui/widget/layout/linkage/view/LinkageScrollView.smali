.class public Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;
.super Landroidx/core/widget/NestedScrollView;
.source "SourceFile"

# interfaces
.implements Lb3/b;


# instance fields
.field public a:Lb3/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/core/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final a()Lb3/c;
    .locals 2

    .line 1
    new-instance v0, Lo2/a;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, v1}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final onScrollChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/core/widget/NestedScrollView;->onScrollChanged(IIII)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 6
    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;->a:Lb3/a;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    check-cast p1, Lo2/a;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Lo2/a;->A(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    const/4 p1, 0x1

    .line 25
    invoke-virtual {p0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;->a:Lb3/a;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    check-cast p1, Lo2/a;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Lo2/a;->z(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;->a:Lb3/a;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    check-cast p1, Lo2/a;

    .line 45
    .line 46
    iget-object p1, p1, Lo2/a;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->a(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public setChildLinkageEvent(Lb3/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;->a:Lb3/a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    check-cast p1, Lo2/a;

    .line 6
    .line 7
    iget-object p1, p1, Lo2/a;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->a(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
