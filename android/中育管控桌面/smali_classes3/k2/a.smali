.class public Lk2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/b;


# instance fields
.field public a:Lx0/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lx0/d;

    invoke-direct {v0}, Lx0/d;-><init>()V

    sget v1, Lcom/xuexiang/xui/R$drawable;->xui_ic_no_img:I

    .line 2
    invoke-virtual {v0, v1}, Lx0/a;->l(I)Lx0/a;

    move-result-object v0

    check-cast v0, Lx0/d;

    sget-object v1, Lh0/c;->a:Lh0/c;

    .line 3
    invoke-virtual {v0, v1}, Lx0/a;->j(Lh0/c;)Lx0/a;

    move-result-object v0

    check-cast v0, Lx0/d;

    .line 4
    invoke-direct {p0, v0}, Lk2/a;-><init>(Lx0/d;)V

    return-void
.end method

.method public constructor <init>(Lx0/d;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lk2/a;->a:Lx0/d;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/c;->c(Landroid/content/Context;)Lcom/bumptech/glide/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bumptech/glide/c;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/c;->v(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bumptech/glide/i;->onStop()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Lk2/c;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/c;->v(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bumptech/glide/i;->m()Lcom/bumptech/glide/h;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lk2/a;->a:Lx0/d;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/h;->m0(Lx0/a;)Lcom/bumptech/glide/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/h;->A0(Ljava/lang/String;)Lcom/bumptech/glide/h;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance p2, Lk2/a$b;

    .line 20
    .line 21
    invoke-direct {p2, p0, p4}, Lk2/a$b;-><init>(Lk2/a;Lk2/c;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/h;->y0(Lx0/c;)Lcom/bumptech/glide/h;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1, p3}, Lcom/bumptech/glide/h;->w0(Landroid/widget/ImageView;)Ly0/i;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public d(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Lk2/c;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/c;->v(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bumptech/glide/i;->k()Lcom/bumptech/glide/h;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lk2/a;->a:Lx0/d;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/h;->m0(Lx0/a;)Lcom/bumptech/glide/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/h;->A0(Ljava/lang/String;)Lcom/bumptech/glide/h;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance p2, Lk2/a$a;

    .line 20
    .line 21
    invoke-direct {p2, p0, p4}, Lk2/a$a;-><init>(Lk2/a;Lk2/c;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/h;->y0(Lx0/c;)Lcom/bumptech/glide/h;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1, p3}, Lcom/bumptech/glide/h;->w0(Landroid/widget/ImageView;)Ly0/i;

    .line 29
    .line 30
    .line 31
    return-void
.end method
