.class public abstract Lcom/yanzhenjie/recyclerview/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yanzhenjie/recyclerview/a$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Landroid/view/View;

.field public c:Lcom/yanzhenjie/recyclerview/a$a;


# direct methods
.method public constructor <init>(ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/yanzhenjie/recyclerview/a;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/yanzhenjie/recyclerview/a;->b:Landroid/view/View;

    .line 7
    .line 8
    new-instance p1, Lcom/yanzhenjie/recyclerview/a$a;

    .line 9
    .line 10
    invoke-direct {p1}, Lcom/yanzhenjie/recyclerview/a$a;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/yanzhenjie/recyclerview/a;->c:Lcom/yanzhenjie/recyclerview/a$a;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public abstract a(Landroid/widget/OverScroller;II)V
.end method

.method public abstract b(Landroid/widget/OverScroller;II)V
.end method

.method public c()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/a;->b:Landroid/view/View;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_0
    return v2
.end method

.method public abstract d(II)Lcom/yanzhenjie/recyclerview/a$a;
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/yanzhenjie/recyclerview/a;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public f()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/a;->b:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/a;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public abstract h(IF)Z
.end method

.method public i(I)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/yanzhenjie/recyclerview/a;->f()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    neg-int v0, v0

    .line 10
    invoke-virtual {p0}, Lcom/yanzhenjie/recyclerview/a;->e()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    mul-int/2addr v0, v1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method
