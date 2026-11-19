.class public final Lp0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/e$a;,
        Lp0/e$b;,
        Lp0/e$c;,
        Lp0/e$d;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lo0/m;

.field public final c:Lo0/m;

.field public final d:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo0/m;Lo0/m;Ljava/lang/Class;)V
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
    iput-object p1, p0, Lp0/e;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lp0/e;->b:Lo0/m;

    .line 11
    .line 12
    iput-object p3, p0, Lp0/e;->c:Lo0/m;

    .line 13
    .line 14
    iput-object p4, p0, Lp0/e;->d:Ljava/lang/Class;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lp0/e;->d(Landroid/net/Uri;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh0/d;)Lo0/m$a;
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lp0/e;->c(Landroid/net/Uri;IILh0/d;)Lo0/m$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Landroid/net/Uri;IILh0/d;)Lo0/m$a;
    .locals 11

    .line 1
    new-instance v0, Lo0/m$a;

    .line 2
    .line 3
    new-instance v1, Ld1/b;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ld1/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lp0/e$d;

    .line 9
    .line 10
    iget-object v3, p0, Lp0/e;->a:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v4, p0, Lp0/e;->b:Lo0/m;

    .line 13
    .line 14
    iget-object v5, p0, Lp0/e;->c:Lo0/m;

    .line 15
    .line 16
    iget-object v10, p0, Lp0/e;->d:Ljava/lang/Class;

    .line 17
    .line 18
    move-object v6, p1

    .line 19
    move v7, p2

    .line 20
    move v8, p3

    .line 21
    move-object v9, p4

    .line 22
    invoke-direct/range {v2 .. v10}, Lp0/e$d;-><init>(Landroid/content/Context;Lo0/m;Lo0/m;Landroid/net/Uri;IILh0/d;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Lo0/m$a;-><init>(Lh0/b;Li0/d;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public d(Landroid/net/Uri;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lj0/b;->b(Landroid/net/Uri;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method
