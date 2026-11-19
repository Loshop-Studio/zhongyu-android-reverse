.class public final enum Lcom/zykj/merge/sketch/constant/PlayStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/merge/sketch/constant/PlayStatus;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/zykj/merge/sketch/constant/PlayStatus;

.field public static final enum d:Lcom/zykj/merge/sketch/constant/PlayStatus;

.field public static final enum e:Lcom/zykj/merge/sketch/constant/PlayStatus;

.field public static final enum f:Lcom/zykj/merge/sketch/constant/PlayStatus;

.field public static final enum g:Lcom/zykj/merge/sketch/constant/PlayStatus;

.field public static final synthetic h:[Lcom/zykj/merge/sketch/constant/PlayStatus;


# instance fields
.field public a:I

.field public b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "\u5f55\u5236\u5f00\u59cb"

    .line 5
    .line 6
    const-string v3, "RECORD_START"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/zykj/merge/sketch/constant/PlayStatus;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->c:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 12
    .line 13
    new-instance v0, Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "\u5f55\u5236\u6682\u505c"

    .line 17
    .line 18
    const-string v3, "RECORD_PAUSE"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/zykj/merge/sketch/constant/PlayStatus;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->d:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 24
    .line 25
    new-instance v0, Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "\u5f55\u5236\u7ee7\u7eed"

    .line 29
    .line 30
    const-string v3, "RECORD_RESUME"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/zykj/merge/sketch/constant/PlayStatus;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->e:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 36
    .line 37
    new-instance v0, Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "\u5f55\u5236\u7ed3\u675f"

    .line 41
    .line 42
    const-string v3, "RECORD_END"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/zykj/merge/sketch/constant/PlayStatus;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->f:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 48
    .line 49
    new-instance v0, Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "\u7b49\u5f85"

    .line 53
    .line 54
    const-string v3, "RECORD_WAIT"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/zykj/merge/sketch/constant/PlayStatus;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->g:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 60
    .line 61
    invoke-static {}, Lcom/zykj/merge/sketch/constant/PlayStatus;->a()[Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->h:[Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/zykj/merge/sketch/constant/PlayStatus;->a:I

    .line 5
    .line 6
    iput-object p4, p0, Lcom/zykj/merge/sketch/constant/PlayStatus;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static final synthetic a()[Lcom/zykj/merge/sketch/constant/PlayStatus;
    .locals 5

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->c:Lcom/zykj/merge/sketch/constant/PlayStatus;

    sget-object v1, Lcom/zykj/merge/sketch/constant/PlayStatus;->d:Lcom/zykj/merge/sketch/constant/PlayStatus;

    sget-object v2, Lcom/zykj/merge/sketch/constant/PlayStatus;->e:Lcom/zykj/merge/sketch/constant/PlayStatus;

    sget-object v3, Lcom/zykj/merge/sketch/constant/PlayStatus;->f:Lcom/zykj/merge/sketch/constant/PlayStatus;

    sget-object v4, Lcom/zykj/merge/sketch/constant/PlayStatus;->g:Lcom/zykj/merge/sketch/constant/PlayStatus;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/zykj/merge/sketch/constant/PlayStatus;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/merge/sketch/constant/PlayStatus;
    .locals 1

    const-class v0, Lcom/zykj/merge/sketch/constant/PlayStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/merge/sketch/constant/PlayStatus;

    return-object p0
.end method

.method public static values()[Lcom/zykj/merge/sketch/constant/PlayStatus;
    .locals 1

    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->h:[Lcom/zykj/merge/sketch/constant/PlayStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/merge/sketch/constant/PlayStatus;

    return-object v0
.end method
