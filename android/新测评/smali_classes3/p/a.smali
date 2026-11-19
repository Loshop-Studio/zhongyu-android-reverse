.class public final Lp/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp/a$a;
    }
.end annotation


# instance fields
.field public final a:Lk/t;

.field public final b:Ly/k;


# direct methods
.method public constructor <init>(Lk/t;Ly/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp/a;->a:Lk/t;

    .line 5
    .line 6
    iput-object p2, p0, Lp/a;->b:Ly/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object p1, p0, Lp/a;->a:Lk/t;

    .line 2
    .line 3
    invoke-static {p1}, Lk/u;->f(Lk/t;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/16 v8, 0x3e

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    const-string v2, "/"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v0, Lp/p;

    .line 27
    .line 28
    iget-object v1, p0, Lp/a;->b:Ly/k;

    .line 29
    .line 30
    invoke-virtual {v1}, Ly/k;->c()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Lokio/Okio;->source(Ljava/io/InputStream;)Lokio/Source;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Lp/a;->b:Ly/k;

    .line 51
    .line 52
    invoke-virtual {v2}, Ly/k;->g()Lokio/FileSystem;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v3, Ln/a;

    .line 57
    .line 58
    invoke-direct {v3, p1}, Ln/a;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2, v3}, Ln/s;->a(Lokio/BufferedSource;Lokio/FileSystem;Ln/r$a;)Ln/r;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget-object v2, Lc0/r;->a:Lc0/r;

    .line 66
    .line 67
    invoke-virtual {v2, p1}, Lc0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    sget-object v2, Lcoil3/decode/DataSource;->c:Lcoil3/decode/DataSource;

    .line 72
    .line 73
    invoke-direct {v0, v1, p1, v2}, Lp/p;-><init>(Ln/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 74
    .line 75
    .line 76
    return-object v0
.end method
