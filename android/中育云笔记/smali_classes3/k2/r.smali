.class public Lk2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk2/r$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk2/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk2/r;-><init>()V

    return-void
.end method

.method public static g()Lk2/r;
    .locals 1

    .line 1
    sget-object v0, Lk2/r$a;->a:Lk2/r;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bumptech/glide/h;->w()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 1

    .line 1
    invoke-static {p1}, La7/a;->a(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/h;->t(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1, p3}, Lcom/bumptech/glide/g;->A0(Landroid/widget/ImageView;)La1/i;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bumptech/glide/h;->x()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 3

    .line 1
    invoke-static {p1}, La7/a;->a(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/bumptech/glide/h;->j()Lcom/bumptech/glide/g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/g;->F0(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/16 p2, 0xb4

    .line 21
    .line 22
    invoke-virtual {p1, p2, p2}, Lz0/a;->V(II)Lz0/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcom/bumptech/glide/g;

    .line 27
    .line 28
    const/high16 p2, 0x3f000000    # 0.5f

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lz0/a;->f0(F)Lz0/a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lcom/bumptech/glide/g;

    .line 35
    .line 36
    new-instance p2, Lq0/j;

    .line 37
    .line 38
    invoke-direct {p2}, Lq0/j;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lq0/x;

    .line 42
    .line 43
    const/16 v1, 0x8

    .line 44
    .line 45
    invoke-direct {v0, v1}, Lq0/x;-><init>(I)V

    .line 46
    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    new-array v1, v1, [Lh0/h;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    aput-object p2, v1, v2

    .line 53
    .line 54
    const/4 p2, 0x1

    .line 55
    aput-object v0, v1, p2

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Lz0/a;->m0([Lh0/h;)Lz0/a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Lcom/bumptech/glide/g;

    .line 62
    .line 63
    sget p2, Lcom/friday/common/R$drawable;->ps_image_placeholder:I

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Lz0/a;->W(I)Lz0/a;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lcom/bumptech/glide/g;

    .line 70
    .line 71
    invoke-virtual {p1, p3}, Lcom/bumptech/glide/g;->A0(Landroid/widget/ImageView;)La1/i;

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 1

    .line 1
    invoke-static {p1}, La7/a;->a(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/h;->t(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/16 p2, 0xc8

    .line 17
    .line 18
    invoke-virtual {p1, p2, p2}, Lz0/a;->V(II)Lz0/a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/bumptech/glide/g;

    .line 23
    .line 24
    invoke-virtual {p1}, Lz0/a;->e()Lz0/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/bumptech/glide/g;

    .line 29
    .line 30
    sget p2, Lcom/friday/common/R$drawable;->ps_image_placeholder:I

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lz0/a;->W(I)Lz0/a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/bumptech/glide/g;

    .line 37
    .line 38
    invoke-virtual {p1, p3}, Lcom/bumptech/glide/g;->A0(Landroid/widget/ImageView;)La1/i;

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public f(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;II)V
    .locals 1

    .line 1
    invoke-static {p1}, La7/a;->a(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p3}, Lcom/bumptech/glide/h;->t(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1, p4, p5}, Lz0/a;->V(II)Lz0/a;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lcom/bumptech/glide/g;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/g;->A0(Landroid/widget/ImageView;)La1/i;

    .line 23
    .line 24
    .line 25
    return-void
.end method
