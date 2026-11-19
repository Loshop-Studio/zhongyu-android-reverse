.class public final enum Lcom/umeng/commonsdk/statistics/proto/d$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/statistics/proto/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/umeng/commonsdk/statistics/proto/d$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/umeng/commonsdk/statistics/proto/d$e;

.field public static final enum d:Lcom/umeng/commonsdk/statistics/proto/d$e;

.field public static final enum e:Lcom/umeng/commonsdk/statistics/proto/d$e;

.field public static final f:Ljava/util/Map;

.field public static final synthetic g:[Lcom/umeng/commonsdk/statistics/proto/d$e;


# instance fields
.field public final a:S

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 2
    .line 3
    const-string v1, "property"

    .line 4
    .line 5
    const-string v2, "PROPERTY"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    invoke-direct {v0, v2, v3, v4, v1}, Lcom/umeng/commonsdk/statistics/proto/d$e;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/d$e;->c:Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 13
    .line 14
    new-instance v1, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 15
    .line 16
    const-string v2, "version"

    .line 17
    .line 18
    const-string v3, "VERSION"

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    invoke-direct {v1, v3, v4, v5, v2}, Lcom/umeng/commonsdk/statistics/proto/d$e;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Lcom/umeng/commonsdk/statistics/proto/d$e;->d:Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 25
    .line 26
    new-instance v2, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    const-string v4, "checksum"

    .line 30
    .line 31
    const-string v6, "CHECKSUM"

    .line 32
    .line 33
    invoke-direct {v2, v6, v5, v3, v4}, Lcom/umeng/commonsdk/statistics/proto/d$e;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v2, Lcom/umeng/commonsdk/statistics/proto/d$e;->e:Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 37
    .line 38
    filled-new-array {v0, v1, v2}, [Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/d$e;->g:[Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 43
    .line 44
    new-instance v0, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/d$e;->f:Ljava/util/Map;

    .line 50
    .line 51
    const-class v0, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 52
    .line 53
    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 72
    .line 73
    sget-object v2, Lcom/umeng/commonsdk/statistics/proto/d$e;->f:Ljava/util/Map;

    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/umeng/commonsdk/statistics/proto/d$e;->a()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ISLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-short p3, p0, Lcom/umeng/commonsdk/statistics/proto/d$e;->a:S

    .line 5
    .line 6
    iput-object p4, p0, Lcom/umeng/commonsdk/statistics/proto/d$e;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/d$e;
    .locals 1

    .line 1
    const-class v0, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/umeng/commonsdk/statistics/proto/d$e;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/d$e;->g:[Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/umeng/commonsdk/statistics/proto/d$e;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/d$e;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
