.class public final Lp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp/c$a;
    }
.end annotation


# instance fields
.field public final a:[B

.field public final b:Ly/m;


# direct methods
.method public constructor <init>([BLy/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp/c;->a:[B

    .line 5
    .line 6
    iput-object p2, p0, Lp/c;->b:Ly/m;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance p1, Lokio/Buffer;

    .line 2
    .line 3
    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp/c;->a:[B

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lokio/Buffer;->write([B)Lokio/Buffer;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lp/c;->b:Ly/m;

    .line 12
    .line 13
    invoke-virtual {v0}, Ly/m;->g()Lokio/FileSystem;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x4

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {p1, v0, v2, v1, v2}, Ln/s;->c(Lokio/BufferedSource;Lokio/FileSystem;Ln/r$a;ILjava/lang/Object;)Ln/r;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object v0, Lcoil3/decode/DataSource;->b:Lcoil3/decode/DataSource;

    .line 24
    .line 25
    new-instance v1, Lp/p;

    .line 26
    .line 27
    invoke-direct {v1, p1, v2, v0}, Lp/p;-><init>(Ln/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 28
    .line 29
    .line 30
    return-object v1
.end method
