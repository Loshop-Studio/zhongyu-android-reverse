.class public Lm0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/g$a;
    }
.end annotation


# instance fields
.field public final a:Ll0/n;


# direct methods
.method public constructor <init>(Ll0/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/g;->a:Ll0/n;

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
    invoke-virtual {p0, p1}, Lm0/g;->d(Ljava/net/URL;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILf0/d;)Ll0/n$a;
    .locals 0

    .line 1
    check-cast p1, Ljava/net/URL;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lm0/g;->c(Ljava/net/URL;IILf0/d;)Ll0/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/net/URL;IILf0/d;)Ll0/n$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/g;->a:Ll0/n;

    .line 2
    .line 3
    new-instance v1, Ll0/h;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ll0/h;-><init>(Ljava/net/URL;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p2, p3, p4}, Ll0/n;->b(Ljava/lang/Object;IILf0/d;)Ll0/n$a;

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
