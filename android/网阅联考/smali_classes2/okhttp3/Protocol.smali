.class public final enum Lokhttp3/Protocol;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/Protocol$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lokhttp3/Protocol;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0086\u0001\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lokhttp3/Protocol;",
        "",
        "",
        "toString",
        "a",
        "Ljava/lang/String;",
        "protocol",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "i",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:Lokhttp3/Protocol;

.field public static final enum c:Lokhttp3/Protocol;

.field public static final enum d:Lokhttp3/Protocol;

.field public static final enum e:Lokhttp3/Protocol;

.field public static final enum f:Lokhttp3/Protocol;

.field public static final enum g:Lokhttp3/Protocol;

.field public static final synthetic h:[Lokhttp3/Protocol;

.field public static final i:Lokhttp3/Protocol$a;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [Lokhttp3/Protocol;

    .line 3
    .line 4
    new-instance v1, Lokhttp3/Protocol;

    .line 5
    .line 6
    const-string v2, "HTTP_1_0"

    .line 7
    .line 8
    const-string v3, "http/1.0"

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct {v1, v2, v4, v3}, Lokhttp3/Protocol;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lokhttp3/Protocol;->b:Lokhttp3/Protocol;

    .line 15
    .line 16
    aput-object v1, v0, v4

    .line 17
    .line 18
    new-instance v1, Lokhttp3/Protocol;

    .line 19
    .line 20
    const-string v2, "HTTP_1_1"

    .line 21
    .line 22
    const-string v3, "http/1.1"

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-direct {v1, v2, v4, v3}, Lokhttp3/Protocol;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Lokhttp3/Protocol;->c:Lokhttp3/Protocol;

    .line 29
    .line 30
    aput-object v1, v0, v4

    .line 31
    .line 32
    new-instance v1, Lokhttp3/Protocol;

    .line 33
    .line 34
    const-string v2, "SPDY_3"

    .line 35
    .line 36
    const-string v3, "spdy/3.1"

    .line 37
    .line 38
    const/4 v4, 0x2

    .line 39
    invoke-direct {v1, v2, v4, v3}, Lokhttp3/Protocol;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sput-object v1, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 43
    .line 44
    aput-object v1, v0, v4

    .line 45
    .line 46
    new-instance v1, Lokhttp3/Protocol;

    .line 47
    .line 48
    const-string v2, "HTTP_2"

    .line 49
    .line 50
    const-string v3, "h2"

    .line 51
    .line 52
    const/4 v4, 0x3

    .line 53
    invoke-direct {v1, v2, v4, v3}, Lokhttp3/Protocol;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sput-object v1, Lokhttp3/Protocol;->e:Lokhttp3/Protocol;

    .line 57
    .line 58
    aput-object v1, v0, v4

    .line 59
    .line 60
    new-instance v1, Lokhttp3/Protocol;

    .line 61
    .line 62
    const-string v2, "H2_PRIOR_KNOWLEDGE"

    .line 63
    .line 64
    const-string v3, "h2_prior_knowledge"

    .line 65
    .line 66
    const/4 v4, 0x4

    .line 67
    invoke-direct {v1, v2, v4, v3}, Lokhttp3/Protocol;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sput-object v1, Lokhttp3/Protocol;->f:Lokhttp3/Protocol;

    .line 71
    .line 72
    aput-object v1, v0, v4

    .line 73
    .line 74
    new-instance v1, Lokhttp3/Protocol;

    .line 75
    .line 76
    const-string v2, "QUIC"

    .line 77
    .line 78
    const-string v3, "quic"

    .line 79
    .line 80
    const/4 v4, 0x5

    .line 81
    invoke-direct {v1, v2, v4, v3}, Lokhttp3/Protocol;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    sput-object v1, Lokhttp3/Protocol;->g:Lokhttp3/Protocol;

    .line 85
    .line 86
    aput-object v1, v0, v4

    .line 87
    .line 88
    sput-object v0, Lokhttp3/Protocol;->h:[Lokhttp3/Protocol;

    .line 89
    .line 90
    new-instance v0, Lokhttp3/Protocol$a;

    .line 91
    .line 92
    const/4 v1, 0x0

    .line 93
    invoke-direct {v0, v1}, Lokhttp3/Protocol$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    .line 95
    .line 96
    sput-object v0, Lokhttp3/Protocol;->i:Lokhttp3/Protocol$a;

    .line 97
    .line 98
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lokhttp3/Protocol;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic a(Lokhttp3/Protocol;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/Protocol;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lokhttp3/Protocol;
    .locals 1

    const-class v0, Lokhttp3/Protocol;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lokhttp3/Protocol;

    return-object p0
.end method

.method public static values()[Lokhttp3/Protocol;
    .locals 1

    sget-object v0, Lokhttp3/Protocol;->h:[Lokhttp3/Protocol;

    invoke-virtual {v0}, [Lokhttp3/Protocol;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lokhttp3/Protocol;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/Protocol;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
