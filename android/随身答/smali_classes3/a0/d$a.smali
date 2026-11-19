.class public final La0/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcoil3/decode/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z


# direct methods
.method public constructor <init>(ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, La0/d$a;->a:Z

    .line 3
    iput-boolean p2, p0, La0/d$a;->b:Z

    .line 4
    iput-boolean p3, p0, La0/d$a;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    .line 5
    :cond_2
    invoke-direct {p0, p1, p2, p3}, La0/d$a;-><init>(ZZZ)V

    return-void
.end method


# virtual methods
.method public a(Lp/p;Ly/m;Lcoil3/e;)Lcoil3/decode/a;
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, La0/d$a;->b(Lp/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    new-instance v0, La0/d;

    .line 10
    .line 11
    invoke-virtual {p1}, Lp/p;->c()Ln/r;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-boolean v3, p0, La0/d$a;->a:Z

    .line 16
    .line 17
    iget-boolean v4, p0, La0/d$a;->b:Z

    .line 18
    .line 19
    iget-boolean v5, p0, La0/d$a;->c:Z

    .line 20
    .line 21
    move-object v2, p2

    .line 22
    invoke-direct/range {v0 .. v5}, La0/d;-><init>(Ln/r;Ly/m;ZZZ)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final b(Lp/p;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lp/p;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "image/svg+xml"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Ln/h;->a:Ln/h;

    .line 14
    .line 15
    invoke-virtual {p1}, Lp/p;->c()Ln/r;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Ln/r;->source()Lokio/BufferedSource;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {v0, p1}, La0/a;->a(Ln/h;Lokio/BufferedSource;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    return p1

    .line 32
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 33
    return p1
.end method
