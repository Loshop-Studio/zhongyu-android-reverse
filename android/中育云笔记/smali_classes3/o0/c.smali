.class public Lo0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/c$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lo0/c;->a:Landroid/content/Context;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lo0/c;->d(Landroid/net/Uri;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh0/e;)Ln0/n$a;
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lo0/c;->c(Landroid/net/Uri;IILh0/e;)Ln0/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Landroid/net/Uri;IILh0/e;)Ln0/n$a;
    .locals 0

    .line 1
    invoke-static {p2, p3}, Li0/b;->e(II)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p4}, Lo0/c;->e(Lh0/e;)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    new-instance p2, Ln0/n$a;

    .line 14
    .line 15
    new-instance p3, Lc1/d;

    .line 16
    .line 17
    invoke-direct {p3, p1}, Lc1/d;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object p4, p0, Lo0/c;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p4, p1}, Li0/c;->e(Landroid/content/Context;Landroid/net/Uri;)Li0/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {p2, p3, p1}, Ln0/n$a;-><init>(Lh0/b;Lcom/bumptech/glide/load/data/d;)V

    .line 27
    .line 28
    .line 29
    return-object p2

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method

.method public d(Landroid/net/Uri;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Li0/b;->d(Landroid/net/Uri;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final e(Lh0/e;)Z
    .locals 4

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/VideoDecoder;->d:Lh0/d;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lh0/e;->c(Lh0/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Long;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/16 v2, -0x1

    .line 16
    .line 17
    cmp-long p1, v0, v2

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method
