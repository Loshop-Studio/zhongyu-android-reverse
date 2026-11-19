.class public final Lc3/b;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc3/b;->a:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 2
    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iget-object p2, p0, Lc3/b;->a:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p2, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;->a:Lb3/a;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    check-cast p1, Lo2/a;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lo2/a;->A(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 p1, 0x1

    .line 23
    invoke-virtual {p2, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p2, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;->a:Lb3/a;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    check-cast p1, Lo2/a;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lo2/a;->z(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object p1, p2, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;->a:Lb3/a;

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    check-cast p1, Lo2/a;

    .line 43
    .line 44
    iget-object p1, p1, Lo2/a;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->a(Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method
