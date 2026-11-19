.class public final Ln0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/l$b;,
        Ln0/l$a;
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
    iput-object p1, p0, Ln0/l;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ln0/l;->d(Landroid/net/Uri;)Z

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
    invoke-virtual {p0, p1, p2, p3, p4}, Ln0/l;->c(Landroid/net/Uri;IILh0/e;)Ln0/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Landroid/net/Uri;IILh0/e;)Ln0/n$a;
    .locals 1

    .line 1
    new-instance p2, Ln0/n$a;

    .line 2
    .line 3
    new-instance p3, Lc1/d;

    .line 4
    .line 5
    invoke-direct {p3, p1}, Lc1/d;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p4, Ln0/l$b;

    .line 9
    .line 10
    iget-object v0, p0, Ln0/l;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {p4, v0, p1}, Ln0/l$b;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p2, p3, p4}, Ln0/n$a;-><init>(Lh0/b;Lcom/bumptech/glide/load/data/d;)V

    .line 16
    .line 17
    .line 18
    return-object p2
.end method

.method public d(Landroid/net/Uri;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Li0/b;->c(Landroid/net/Uri;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
