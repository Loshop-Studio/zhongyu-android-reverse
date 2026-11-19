.class public final Lp/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp/d$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/nio/ByteBuffer;

.field public final b:Ly/k;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Ly/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp/d;->a:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    iput-object p2, p0, Lp/d;->b:Ly/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance p1, Lp/p;

    .line 2
    .line 3
    iget-object v0, p0, Lp/d;->a:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-static {v0}, Lp/e;->a(Ljava/nio/ByteBuffer;)Lokio/Source;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lp/d;->b:Ly/k;

    .line 14
    .line 15
    invoke-virtual {v1}, Ly/k;->g()Lokio/FileSystem;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Ln/e;

    .line 20
    .line 21
    iget-object v3, p0, Lp/d;->a:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ln/e;-><init>(Ljava/nio/ByteBuffer;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Ln/s;->a(Lokio/BufferedSource;Lokio/FileSystem;Ln/r$a;)Ln/r;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v1, 0x0

    .line 31
    sget-object v2, Lcoil3/decode/DataSource;->b:Lcoil3/decode/DataSource;

    .line 32
    .line 33
    invoke-direct {p1, v0, v1, v2}, Lp/p;-><init>(Ln/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 34
    .line 35
    .line 36
    return-object p1
.end method
