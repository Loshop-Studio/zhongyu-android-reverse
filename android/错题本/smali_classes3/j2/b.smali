.class public final Lj2/b;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Z

.field public final synthetic c:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj2/b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 2
    .line 3
    iput-object p2, p0, Lj2/b;->a:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iput-boolean p3, p0, Lj2/b;->b:Z

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lj2/b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 5
    .line 6
    iget-object p2, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 7
    .line 8
    array-length p3, p2

    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    if-ge v1, p3, :cond_1

    .line 12
    .line 13
    aget-object v2, p2, v1

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x8

    .line 22
    .line 23
    if-eq v2, v3, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    :goto_1
    iget-object p2, p0, Lj2/b;->a:Landroid/view/ViewGroup;

    .line 31
    .line 32
    iget-boolean p3, p0, Lj2/b;->b:Z

    .line 33
    .line 34
    invoke-static {p1, p2, p3, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->a(Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;Landroid/view/ViewGroup;ZZ)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 38
    .line 39
    .line 40
    return-void
.end method
