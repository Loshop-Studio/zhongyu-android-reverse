.class public abstract La/k/b/h0;
.super La/t/a/a;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final c:La/k/b/c0;

.field public final d:I

.field public e:La/k/b/l0;

.field public f:La/k/b/m;

.field public g:Z


# direct methods
.method public constructor <init>(La/k/b/c0;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, La/t/a/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/k/b/h0;->e:La/k/b/l0;

    iput-object v0, p0, La/k/b/h0;->f:La/k/b/m;

    iput-object p1, p0, La/k/b/h0;->c:La/k/b/c0;

    const/4 p1, 0x0

    iput p1, p0, La/k/b/h0;->d:I

    return-void
.end method

.method public static j(IJ)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "android:switcher:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b(Landroid/view/ViewGroup;)V
    .locals 3

    iget-object p1, p0, La/k/b/h0;->e:La/k/b/l0;

    if-eqz p1, :cond_2

    iget-boolean v0, p0, La/k/b/h0;->g:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, La/k/b/h0;->g:Z

    check-cast p1, La/k/b/a;

    .line 1
    iget-boolean v2, p1, La/k/b/l0;->g:Z

    if-nez v2, :cond_0

    .line 2
    iget-object v2, p1, La/k/b/a;->p:La/k/b/c0;

    invoke-virtual {v2, p1, v1}, La/k/b/c0;->D(La/k/b/c0$l;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    iput-boolean v0, p0, La/k/b/h0;->g:Z

    goto :goto_0

    .line 4
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "This transaction is already being added to the back stack"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 5
    iput-boolean v0, p0, La/k/b/h0;->g:Z

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, La/k/b/h0;->e:La/k/b/l0;

    :cond_2
    return-void
.end method

.method public d(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, La/k/b/h0;->e:La/k/b/l0;

    if-nez v0, :cond_0

    iget-object v0, p0, La/k/b/h0;->c:La/k/b/c0;

    .line 1
    new-instance v1, La/k/b/a;

    invoke-direct {v1, v0}, La/k/b/a;-><init>(La/k/b/c0;)V

    .line 2
    iput-object v1, p0, La/k/b/h0;->e:La/k/b/l0;

    :cond_0
    int-to-long v0, p2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result v2

    invoke-static {v2, v0, v1}, La/k/b/h0;->j(IJ)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, La/k/b/h0;->c:La/k/b/c0;

    invoke-virtual {v3, v2}, La/k/b/c0;->I(Ljava/lang/String;)La/k/b/m;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    iget-object p1, p0, La/k/b/h0;->e:La/k/b/l0;

    .line 3
    new-instance p2, La/k/b/l0$a;

    const/4 v0, 0x7

    invoke-direct {p2, v0, v2}, La/k/b/l0$a;-><init>(ILa/k/b/m;)V

    invoke-virtual {p1, p2}, La/k/b/l0;->b(La/k/b/l0$a;)V

    goto :goto_0

    .line 4
    :cond_1
    move-object v2, p0

    check-cast v2, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$b;

    .line 5
    iget-object v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$b;->h:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 6
    iget-object v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->r:Ljava/util/List;

    .line 7
    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, La/k/b/m;

    .line 8
    iget-object p2, p0, La/k/b/h0;->e:La/k/b/l0;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result p1

    invoke-static {p1, v0, v1}, La/k/b/h0;->j(IJ)Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-virtual {p2, v4, v2, p1, v3}, La/k/b/l0;->c(ILa/k/b/m;Ljava/lang/String;I)V

    .line 10
    :goto_0
    iget-object p1, p0, La/k/b/h0;->f:La/k/b/m;

    if-eq v2, p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, La/k/b/m;->s0(Z)V

    iget p2, p0, La/k/b/h0;->d:I

    if-ne p2, v3, :cond_2

    iget-object p1, p0, La/k/b/h0;->e:La/k/b/l0;

    sget-object p2, La/m/d$b;->e:La/m/d$b;

    invoke-virtual {p1, v2, p2}, La/k/b/l0;->d(La/k/b/m;La/m/d$b;)La/k/b/l0;

    goto :goto_1

    :cond_2
    invoke-virtual {v2, p1}, La/k/b/m;->v0(Z)V

    :cond_3
    :goto_1
    return-object v2
.end method

.method public e(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, La/k/b/m;

    .line 1
    iget-object p2, p2, La/k/b/m;->G:Landroid/view/View;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 0

    return-void
.end method

.method public g()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public h(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 2

    check-cast p3, La/k/b/m;

    iget-object p1, p0, La/k/b/h0;->f:La/k/b/m;

    if-eq p3, p1, :cond_5

    const/4 p2, 0x1

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, La/k/b/m;->s0(Z)V

    iget p1, p0, La/k/b/h0;->d:I

    if-ne p1, p2, :cond_1

    iget-object p1, p0, La/k/b/h0;->e:La/k/b/l0;

    if-nez p1, :cond_0

    iget-object p1, p0, La/k/b/h0;->c:La/k/b/c0;

    .line 1
    new-instance v0, La/k/b/a;

    invoke-direct {v0, p1}, La/k/b/a;-><init>(La/k/b/c0;)V

    .line 2
    iput-object v0, p0, La/k/b/h0;->e:La/k/b/l0;

    :cond_0
    iget-object p1, p0, La/k/b/h0;->e:La/k/b/l0;

    iget-object v0, p0, La/k/b/h0;->f:La/k/b/m;

    sget-object v1, La/m/d$b;->e:La/m/d$b;

    invoke-virtual {p1, v0, v1}, La/k/b/l0;->d(La/k/b/m;La/m/d$b;)La/k/b/l0;

    goto :goto_0

    :cond_1
    iget-object p1, p0, La/k/b/h0;->f:La/k/b/m;

    invoke-virtual {p1, v0}, La/k/b/m;->v0(Z)V

    :cond_2
    :goto_0
    invoke-virtual {p3, p2}, La/k/b/m;->s0(Z)V

    iget p1, p0, La/k/b/h0;->d:I

    if-ne p1, p2, :cond_4

    iget-object p1, p0, La/k/b/h0;->e:La/k/b/l0;

    if-nez p1, :cond_3

    iget-object p1, p0, La/k/b/h0;->c:La/k/b/c0;

    .line 3
    new-instance p2, La/k/b/a;

    invoke-direct {p2, p1}, La/k/b/a;-><init>(La/k/b/c0;)V

    .line 4
    iput-object p2, p0, La/k/b/h0;->e:La/k/b/l0;

    :cond_3
    iget-object p1, p0, La/k/b/h0;->e:La/k/b/l0;

    sget-object p2, La/m/d$b;->f:La/m/d$b;

    invoke-virtual {p1, p3, p2}, La/k/b/l0;->d(La/k/b/m;La/m/d$b;)La/k/b/l0;

    goto :goto_1

    :cond_4
    invoke-virtual {p3, p2}, La/k/b/m;->v0(Z)V

    :goto_1
    iput-object p3, p0, La/k/b/h0;->f:La/k/b/m;

    :cond_5
    return-void
.end method

.method public i(Landroid/view/ViewGroup;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ViewPager with adapter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " requires a view id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
