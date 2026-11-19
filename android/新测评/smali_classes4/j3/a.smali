.class public Lj3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/b;


# instance fields
.field public a:Le1/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Le1/d;

    invoke-direct {v0}, Le1/d;-><init>()V

    sget v1, Lcom/xuexiang/xui/R$drawable;->xui_ic_no_img:I

    .line 2
    invoke-virtual {v0, v1}, Le1/a;->k(I)Le1/a;

    move-result-object v0

    check-cast v0, Le1/d;

    sget-object v1, Lo0/c;->a:Lo0/c;

    .line 3
    invoke-virtual {v0, v1}, Le1/a;->h(Lo0/c;)Le1/a;

    move-result-object v0

    check-cast v0, Le1/d;

    .line 4
    invoke-direct {p0, v0}, Lj3/a;-><init>(Le1/d;)V

    return-void
.end method

.method public constructor <init>(Le1/d;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lj3/a;->a:Le1/d;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bumptech/glide/b;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/b;->v(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bumptech/glide/h;->onStop()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Lj3/c;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/b;->v(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bumptech/glide/h;->j()Lcom/bumptech/glide/g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lj3/a;->a:Le1/d;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/g;->m0(Le1/a;)Lcom/bumptech/glide/g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/g;->A0(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance p2, Lj3/a$a;

    .line 20
    .line 21
    invoke-direct {p2, p0, p4}, Lj3/a$a;-><init>(Lj3/a;Lj3/c;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/g;->y0(Le1/c;)Lcom/bumptech/glide/g;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1, p3}, Lcom/bumptech/glide/g;->w0(Landroid/widget/ImageView;)Lf1/i;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public d(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/widget/ImageView;Lj3/c;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/b;->v(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bumptech/glide/h;->l()Lcom/bumptech/glide/g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lj3/a;->a:Le1/d;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/g;->m0(Le1/a;)Lcom/bumptech/glide/g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/g;->A0(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance p2, Lj3/a$b;

    .line 20
    .line 21
    invoke-direct {p2, p0, p4}, Lj3/a$b;-><init>(Lj3/a;Lj3/c;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/g;->y0(Le1/c;)Lcom/bumptech/glide/g;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1, p3}, Lcom/bumptech/glide/g;->w0(Landroid/widget/ImageView;)Lf1/i;

    .line 29
    .line 30
    .line 31
    return-void
.end method
