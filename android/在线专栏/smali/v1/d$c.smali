.class Lv1/d$c;
.super Lp0/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv1/d;-><init>(Landroidx/room/h0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp0/f<",
        "Lv1/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lv1/d;


# direct methods
.method constructor <init>(Lv1/d;Landroidx/room/h0;)V
    .locals 0

    iput-object p1, p0, Lv1/d$c;->d:Lv1/d;

    invoke-direct {p0, p2}, Lp0/f;-><init>(Landroidx/room/h0;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR ABORT `download` SET `id` = ?,`downloadUrl` = ?,`localPath` = ?,`totalSize` = ?,`downloadSize` = ?,`verifyCode` = ?,`flag` = ? WHERE `id` = ?"

    return-object v0
.end method

.method public bridge synthetic g(Ls0/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lv1/b;

    invoke-virtual {p0, p1, p2}, Lv1/d$c;->i(Ls0/f;Lv1/b;)V

    return-void
.end method

.method public i(Ls0/f;Lv1/b;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lv1/b;->f()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ls0/d;->w(IJ)V

    .line 2
    invoke-virtual {p2}, Lv1/b;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    .line 3
    invoke-interface {p1, v1}, Ls0/d;->k(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lv1/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ls0/d;->c(ILjava/lang/String;)V

    .line 5
    :goto_0
    invoke-virtual {p2}, Lv1/b;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    .line 6
    invoke-interface {p1, v1}, Ls0/d;->k(I)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p2}, Lv1/b;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ls0/d;->c(ILjava/lang/String;)V

    :goto_1
    const/4 v0, 0x4

    .line 8
    invoke-virtual {p2}, Lv1/b;->h()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    const/4 v0, 0x5

    .line 9
    invoke-virtual {p2}, Lv1/b;->c()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    .line 10
    invoke-virtual {p2}, Lv1/b;->i()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_2

    .line 11
    invoke-interface {p1, v1}, Ls0/d;->k(I)V

    goto :goto_2

    .line 12
    :cond_2
    invoke-virtual {p2}, Lv1/b;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ls0/d;->c(ILjava/lang/String;)V

    .line 13
    :goto_2
    iget-object v0, p0, Lv1/d$c;->d:Lv1/d;

    invoke-static {v0}, Lv1/d;->d(Lv1/d;)Lv1/a;

    move-result-object v0

    invoke-virtual {p2}, Lv1/b;->e()Lcom/zykj/download/DownloadFlag;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv1/a;->a(Lcom/zykj/download/DownloadFlag;)I

    move-result v0

    const/4 v1, 0x7

    int-to-long v2, v0

    .line 14
    invoke-interface {p1, v1, v2, v3}, Ls0/d;->w(IJ)V

    const/16 v0, 0x8

    .line 15
    invoke-virtual {p2}, Lv1/b;->f()I

    move-result p2

    int-to-long v1, p2

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    return-void
.end method
