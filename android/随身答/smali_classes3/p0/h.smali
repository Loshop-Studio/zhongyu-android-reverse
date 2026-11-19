.class public Lp0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/h$a;
    }
.end annotation


# instance fields
.field public final a:Lo0/m;


# direct methods
.method public constructor <init>(Lo0/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp0/h;->a:Lo0/m;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/net/URL;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lp0/h;->d(Ljava/net/URL;)Z

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
    check-cast p1, Ljava/net/URL;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lp0/h;->c(Ljava/net/URL;IILh0/d;)Lo0/m$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/net/URL;IILh0/d;)Lo0/m$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/h;->a:Lo0/m;

    .line 2
    .line 3
    new-instance v1, Lo0/g;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lo0/g;-><init>(Ljava/net/URL;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p2, p3, p4}, Lo0/m;->b(Ljava/lang/Object;IILh0/d;)Lo0/m$a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public d(Ljava/net/URL;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
