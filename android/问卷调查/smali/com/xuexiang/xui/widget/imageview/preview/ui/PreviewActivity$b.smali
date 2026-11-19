.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$b;
.super La/k/b/h0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic h:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;La/k/b/c0;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$b;->h:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-direct {p0, p2}, La/k/b/h0;-><init>(La/k/b/c0;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p3, La/k/b/m;

    iget-object p1, p0, La/k/b/h0;->e:La/k/b/l0;

    if-nez p1, :cond_0

    iget-object p1, p0, La/k/b/h0;->c:La/k/b/c0;

    .line 2
    new-instance p2, La/k/b/a;

    invoke-direct {p2, p1}, La/k/b/a;-><init>(La/k/b/c0;)V

    .line 3
    iput-object p2, p0, La/k/b/h0;->e:La/k/b/l0;

    :cond_0
    iget-object p1, p0, La/k/b/h0;->e:La/k/b/l0;

    check-cast p1, La/k/b/a;

    .line 4
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p3, La/k/b/m;->t:La/k/b/c0;

    if-eqz p2, :cond_2

    iget-object v0, p1, La/k/b/a;->p:La/k/b/c0;

    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot detach Fragment attached to a different FragmentManager. Fragment "

    invoke-static {p2}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p3}, La/k/b/m;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " is already attached to a FragmentManager."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_2
    :goto_0
    new-instance p2, La/k/b/l0$a;

    const/4 v0, 0x6

    invoke-direct {p2, v0, p3}, La/k/b/l0$a;-><init>(ILa/k/b/m;)V

    invoke-virtual {p1, p2}, La/k/b/l0;->b(La/k/b/l0$a;)V

    .line 6
    iget-object p1, p0, La/k/b/h0;->f:La/k/b/m;

    invoke-virtual {p3, p1}, La/k/b/m;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    iput-object p1, p0, La/k/b/h0;->f:La/k/b/m;

    :cond_3
    return-void
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$b;->h:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 1
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->r:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0
.end method
