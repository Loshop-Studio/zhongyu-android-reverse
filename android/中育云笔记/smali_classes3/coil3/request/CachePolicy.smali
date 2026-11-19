.class public final enum Lcoil3/request/CachePolicy;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcoil3/request/CachePolicy;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lcoil3/request/CachePolicy;

.field public static final enum f:Lcoil3/request/CachePolicy;

.field public static final enum g:Lcoil3/request/CachePolicy;

.field public static final enum h:Lcoil3/request/CachePolicy;

.field public static final synthetic i:[Lcoil3/request/CachePolicy;

.field public static final synthetic j:Lyc/a;


# instance fields
.field public final c:Z

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcoil3/request/CachePolicy;

    .line 2
    .line 3
    const-string v1, "ENABLED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lcoil3/request/CachePolicy;-><init>(Ljava/lang/String;IZZ)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcoil3/request/CachePolicy;->e:Lcoil3/request/CachePolicy;

    .line 11
    .line 12
    new-instance v0, Lcoil3/request/CachePolicy;

    .line 13
    .line 14
    const-string v1, "READ_ONLY"

    .line 15
    .line 16
    invoke-direct {v0, v1, v3, v3, v2}, Lcoil3/request/CachePolicy;-><init>(Ljava/lang/String;IZZ)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcoil3/request/CachePolicy;->f:Lcoil3/request/CachePolicy;

    .line 20
    .line 21
    new-instance v0, Lcoil3/request/CachePolicy;

    .line 22
    .line 23
    const-string v1, "WRITE_ONLY"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v0, v1, v4, v2, v3}, Lcoil3/request/CachePolicy;-><init>(Ljava/lang/String;IZZ)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcoil3/request/CachePolicy;->g:Lcoil3/request/CachePolicy;

    .line 30
    .line 31
    new-instance v0, Lcoil3/request/CachePolicy;

    .line 32
    .line 33
    const-string v1, "DISABLED"

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    invoke-direct {v0, v1, v3, v2, v2}, Lcoil3/request/CachePolicy;-><init>(Ljava/lang/String;IZZ)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    .line 40
    .line 41
    invoke-static {}, Lcoil3/request/CachePolicy;->a()[Lcoil3/request/CachePolicy;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcoil3/request/CachePolicy;->i:[Lcoil3/request/CachePolicy;

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lyc/a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lcoil3/request/CachePolicy;->j:Lyc/a;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lcoil3/request/CachePolicy;->c:Z

    .line 5
    .line 6
    iput-boolean p4, p0, Lcoil3/request/CachePolicy;->d:Z

    .line 7
    .line 8
    return-void
.end method

.method public static final synthetic a()[Lcoil3/request/CachePolicy;
    .locals 4

    .line 1
    sget-object v0, Lcoil3/request/CachePolicy;->e:Lcoil3/request/CachePolicy;

    sget-object v1, Lcoil3/request/CachePolicy;->f:Lcoil3/request/CachePolicy;

    sget-object v2, Lcoil3/request/CachePolicy;->g:Lcoil3/request/CachePolicy;

    sget-object v3, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    filled-new-array {v0, v1, v2, v3}, [Lcoil3/request/CachePolicy;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcoil3/request/CachePolicy;
    .locals 1

    const-class v0, Lcoil3/request/CachePolicy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcoil3/request/CachePolicy;

    return-object p0
.end method

.method public static values()[Lcoil3/request/CachePolicy;
    .locals 1

    sget-object v0, Lcoil3/request/CachePolicy;->i:[Lcoil3/request/CachePolicy;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcoil3/request/CachePolicy;

    return-object v0
.end method


# virtual methods
.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcoil3/request/CachePolicy;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcoil3/request/CachePolicy;->d:Z

    .line 2
    .line 3
    return v0
.end method
