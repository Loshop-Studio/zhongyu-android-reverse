.class public final enum Lcom/friday/common/util/SyncException$Kind;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/common/util/SyncException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Kind"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/friday/common/util/SyncException$Kind;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/friday/common/util/SyncException$Kind;

.field public static final enum d:Lcom/friday/common/util/SyncException$Kind;

.field public static final enum e:Lcom/friday/common/util/SyncException$Kind;

.field public static final enum f:Lcom/friday/common/util/SyncException$Kind;

.field public static final enum g:Lcom/friday/common/util/SyncException$Kind;

.field public static final enum h:Lcom/friday/common/util/SyncException$Kind;

.field public static final synthetic i:[Lcom/friday/common/util/SyncException$Kind;

.field public static final synthetic j:Lyc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/common/util/SyncException$Kind;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/friday/common/util/SyncException$Kind;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/friday/common/util/SyncException$Kind;->c:Lcom/friday/common/util/SyncException$Kind;

    .line 10
    .line 11
    new-instance v0, Lcom/friday/common/util/SyncException$Kind;

    .line 12
    .line 13
    const-string v1, "LOCAL_FILE_MISSING"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/friday/common/util/SyncException$Kind;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/friday/common/util/SyncException$Kind;->d:Lcom/friday/common/util/SyncException$Kind;

    .line 20
    .line 21
    new-instance v0, Lcom/friday/common/util/SyncException$Kind;

    .line 22
    .line 23
    const-string v1, "PARENT_MISSING"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/friday/common/util/SyncException$Kind;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/friday/common/util/SyncException$Kind;->e:Lcom/friday/common/util/SyncException$Kind;

    .line 30
    .line 31
    new-instance v0, Lcom/friday/common/util/SyncException$Kind;

    .line 32
    .line 33
    const-string v1, "PARENT_SYNC_FAILED"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/friday/common/util/SyncException$Kind;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/friday/common/util/SyncException$Kind;->f:Lcom/friday/common/util/SyncException$Kind;

    .line 40
    .line 41
    new-instance v0, Lcom/friday/common/util/SyncException$Kind;

    .line 42
    .line 43
    const-string v1, "RATE_LIMIT"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/friday/common/util/SyncException$Kind;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/friday/common/util/SyncException$Kind;->g:Lcom/friday/common/util/SyncException$Kind;

    .line 50
    .line 51
    new-instance v0, Lcom/friday/common/util/SyncException$Kind;

    .line 52
    .line 53
    const-string v1, "SERVICE_FAILED"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, Lcom/friday/common/util/SyncException$Kind;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/friday/common/util/SyncException$Kind;->h:Lcom/friday/common/util/SyncException$Kind;

    .line 60
    .line 61
    invoke-static {}, Lcom/friday/common/util/SyncException$Kind;->a()[Lcom/friday/common/util/SyncException$Kind;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lcom/friday/common/util/SyncException$Kind;->i:[Lcom/friday/common/util/SyncException$Kind;

    .line 66
    .line 67
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lyc/a;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lcom/friday/common/util/SyncException$Kind;->j:Lyc/a;

    .line 72
    .line 73
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic a()[Lcom/friday/common/util/SyncException$Kind;
    .locals 6

    .line 1
    sget-object v0, Lcom/friday/common/util/SyncException$Kind;->c:Lcom/friday/common/util/SyncException$Kind;

    sget-object v1, Lcom/friday/common/util/SyncException$Kind;->d:Lcom/friday/common/util/SyncException$Kind;

    sget-object v2, Lcom/friday/common/util/SyncException$Kind;->e:Lcom/friday/common/util/SyncException$Kind;

    sget-object v3, Lcom/friday/common/util/SyncException$Kind;->f:Lcom/friday/common/util/SyncException$Kind;

    sget-object v4, Lcom/friday/common/util/SyncException$Kind;->g:Lcom/friday/common/util/SyncException$Kind;

    sget-object v5, Lcom/friday/common/util/SyncException$Kind;->h:Lcom/friday/common/util/SyncException$Kind;

    filled-new-array/range {v0 .. v5}, [Lcom/friday/common/util/SyncException$Kind;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/friday/common/util/SyncException$Kind;
    .locals 1

    const-class v0, Lcom/friday/common/util/SyncException$Kind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/friday/common/util/SyncException$Kind;

    return-object p0
.end method

.method public static values()[Lcom/friday/common/util/SyncException$Kind;
    .locals 1

    sget-object v0, Lcom/friday/common/util/SyncException$Kind;->i:[Lcom/friday/common/util/SyncException$Kind;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/friday/common/util/SyncException$Kind;

    return-object v0
.end method
