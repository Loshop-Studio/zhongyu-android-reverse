.class public final Ln/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/g;


# instance fields
.field public final a:Lcoil3/x;

.field public final b:Ls/l;


# direct methods
.method public constructor <init>(Lcoil3/x;Ls/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln/h;->a:Lcoil3/x;

    .line 5
    .line 6
    iput-object p2, p0, Ln/h;->b:Ls/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lh6/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object p1, Lokio/Path;->Companion:Lokio/Path$Companion;

    .line 2
    .line 3
    iget-object v0, p0, Ln/h;->a:Lcoil3/x;

    .line 4
    .line 5
    invoke-static {v0}, Lcoil3/o;->g(Lcoil3/x;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {p1, v0, v1, v2, v3}, Lokio/Path$Companion;->get$default(Lokio/Path$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lokio/Path;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v0, Ln/k;

    .line 19
    .line 20
    iget-object v1, p0, Ln/h;->b:Ls/l;

    .line 21
    .line 22
    iget-object v1, v1, Ls/l;->f:Lokio/FileSystem;

    .line 23
    .line 24
    const/16 v2, 0x1c

    .line 25
    .line 26
    invoke-static {p1, v1, v3, v3, v2}, Lcoil3/network/g;->a(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Lcoil3/disk/i;I)Lcoil3/decode/o;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1}, Lokio/Path;->name()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/16 v2, 0x2e

    .line 35
    .line 36
    const-string v4, ""

    .line 37
    .line 38
    invoke-static {v2, p1, v4}, Lkotlin/text/p;->e0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string/jumbo v2, "toLowerCase(...)"

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    sget-object v2, Lcoil3/util/i;->a:Ljava/util/Map;

    .line 62
    .line 63
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    move-object v3, v2

    .line 68
    check-cast v3, Ljava/lang/String;

    .line 69
    .line 70
    if-nez v3, :cond_1

    .line 71
    .line 72
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2, p1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    :cond_1
    :goto_0
    sget-object p1, Lcoil3/decode/DataSource;->DISK:Lcoil3/decode/DataSource;

    .line 81
    .line 82
    invoke-direct {v0, v1, v3, p1}, Ln/k;-><init>(Lcoil3/decode/p;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string v0, "filePath == null"

    .line 89
    .line 90
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1
.end method
