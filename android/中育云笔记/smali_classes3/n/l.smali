.class public final Ln/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln/l$a;
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
    iput-object p1, p0, Ln/l;->a:Lk/t;

    .line 5
    .line 6
    iput-object p2, p0, Ln/l;->b:Lw/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lvc/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object p1, Lokio/Path;->Companion:Lokio/Path$Companion;

    .line 2
    .line 3
    iget-object v0, p0, Ln/l;->a:Lk/t;

    .line 4
    .line 5
    invoke-static {v0}, Lk/u;->d(Lk/t;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {p1, v0, v3, v1, v2}, Lokio/Path$Companion;->get$default(Lokio/Path$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lokio/Path;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    new-instance p1, Ln/p;

    .line 19
    .line 20
    iget-object v0, p0, Ln/l;->b:Lw/n;

    .line 21
    .line 22
    invoke-virtual {v0}, Lw/n;->g()Lokio/FileSystem;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    const/16 v9, 0x1c

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    invoke-static/range {v4 .. v10}, Ll/s;->d(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/lang/AutoCloseable;Ll/r$a;ILjava/lang/Object;)Ll/r;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v1, La0/r;->a:La0/r;

    .line 37
    .line 38
    invoke-static {v4}, La0/i;->d(Lokio/Path;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, La0/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    sget-object v2, Lcoil3/decode/DataSource;->e:Lcoil3/decode/DataSource;

    .line 47
    .line 48
    invoke-direct {p1, v0, v1, v2}, Ln/p;-><init>(Ll/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "filePath == null"

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method
