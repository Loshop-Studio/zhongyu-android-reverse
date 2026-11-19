.class public final Ln/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln/a$a;
    }
.end annotation


# instance fields
.field public final a:Lk/t;

.field public final b:Lw/n;


# direct methods
.method public constructor <init>(Lk/t;Lw/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln/a;->a:Lk/t;

    .line 5
    .line 6
    iput-object p2, p0, Ln/a;->b:Lw/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object p1, p0, Ln/a;->a:Lk/t;

    .line 2
    .line 3
    invoke-static {p1}, Lk/u;->f(Lk/t;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Iterable;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p1, v0}, Lrc/g0;->g0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Ljava/lang/Iterable;

    .line 16
    .line 17
    const/16 v7, 0x3e

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const-string v1, "/"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-static/range {v0 .. v8}, Lrc/g0;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lhd/l;ILjava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v0, Ln/p;

    .line 32
    .line 33
    iget-object v1, p0, Ln/a;->b:Lw/n;

    .line 34
    .line 35
    invoke-virtual {v1}, Lw/n;->c()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1}, Lokio/Okio;->source(Ljava/io/InputStream;)Lokio/Source;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v2, p0, Ln/a;->b:Lw/n;

    .line 56
    .line 57
    invoke-virtual {v2}, Lw/n;->g()Lokio/FileSystem;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-instance v3, Ll/a;

    .line 62
    .line 63
    invoke-direct {v3, p1}, Ll/a;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v2, v3}, Ll/s;->a(Lokio/BufferedSource;Lokio/FileSystem;Ll/r$a;)Ll/r;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    sget-object v2, La0/r;->a:La0/r;

    .line 71
    .line 72
    invoke-virtual {v2, p1}, La0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object v2, Lcoil3/decode/DataSource;->e:Lcoil3/decode/DataSource;

    .line 77
    .line 78
    invoke-direct {v0, v1, p1, v2}, Ln/p;-><init>(Ll/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 79
    .line 80
    .line 81
    return-object v0
.end method
