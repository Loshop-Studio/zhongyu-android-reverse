.class public final Ln/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln/n$a;
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
    iput-object p1, p0, Ln/n;->a:Lk/t;

    .line 5
    .line 6
    iput-object p2, p0, Ln/n;->b:Lw/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lvc/c;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object p1, p0, Ln/n;->a:Lk/t;

    .line 2
    .line 3
    invoke-virtual {p1}, Lk/t;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const-string p1, ""

    .line 10
    .line 11
    :cond_0
    move-object v0, p1

    .line 12
    const/4 v4, 0x6

    .line 13
    const/4 v5, 0x0

    .line 14
    const/16 v1, 0x21

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static/range {v0 .. v5}, Lqd/c0;->e0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 v1, -0x1

    .line 23
    if-eq p1, v1, :cond_1

    .line 24
    .line 25
    sget-object v1, Lokio/Path;->Companion:Lokio/Path$Companion;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-virtual {v0, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "substring(...)"

    .line 33
    .line 34
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-static {v1, v3, v2, v5, v6}, Lokio/Path$Companion;->get$default(Lokio/Path$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lokio/Path;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    add-int/2addr p1, v5

    .line 44
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    invoke-virtual {v0, p1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v1, p1, v2, v5, v6}, Lokio/Path$Companion;->get$default(Lokio/Path$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lokio/Path;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    new-instance p1, Ln/p;

    .line 60
    .line 61
    iget-object v0, p0, Ln/n;->b:Lw/n;

    .line 62
    .line 63
    invoke-virtual {v0}, Lw/n;->g()Lokio/FileSystem;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0, v3}, Lokio/Okio;->openZip(Lokio/FileSystem;Lokio/Path;)Lokio/FileSystem;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    const/16 v12, 0x1c

    .line 72
    .line 73
    const/4 v13, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    const/4 v11, 0x0

    .line 77
    invoke-static/range {v7 .. v13}, Ll/s;->d(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/lang/AutoCloseable;Ll/r$a;ILjava/lang/Object;)Ll/r;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v1, La0/r;->a:La0/r;

    .line 82
    .line 83
    invoke-static {v7}, La0/i;->d(Lokio/Path;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v1, v2}, La0/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sget-object v2, Lcoil3/decode/DataSource;->e:Lcoil3/decode/DataSource;

    .line 92
    .line 93
    invoke-direct {p1, v0, v1, v2}, Ln/p;-><init>(Ll/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 94
    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v0, "Invalid jar:file URI: "

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Ln/n;->a:Lk/t;

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v0
.end method
