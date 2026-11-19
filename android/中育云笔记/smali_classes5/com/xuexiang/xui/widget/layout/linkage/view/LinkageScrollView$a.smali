.class public Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;->a()Ly8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollOffset()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$a;->d()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    invoke-virtual {v0, v1, v2}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollRange()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroidx/core/widget/NestedScrollView;->fling(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$a;->a:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v1}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
