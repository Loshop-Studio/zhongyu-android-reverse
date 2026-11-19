.class public final enum Lc3/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc3/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lc3/l;

.field public static final enum b:Lc3/l;

.field public static final enum c:Lc3/l;

.field public static final enum d:Lc3/l;

.field private static final synthetic e:[Lc3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lc3/l;

    const-string v1, "PUBLIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc3/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc3/l;->a:Lc3/l;

    .line 2
    new-instance v0, Lc3/l;

    const-string v1, "PROTECTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lc3/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc3/l;->b:Lc3/l;

    .line 3
    new-instance v0, Lc3/l;

    const-string v1, "INTERNAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lc3/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc3/l;->c:Lc3/l;

    .line 4
    new-instance v0, Lc3/l;

    const-string v1, "PRIVATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lc3/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc3/l;->d:Lc3/l;

    invoke-static {}, Lc3/l;->a()[Lc3/l;

    move-result-object v0

    sput-object v0, Lc3/l;->e:[Lc3/l;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic a()[Lc3/l;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lc3/l;

    sget-object v1, Lc3/l;->a:Lc3/l;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lc3/l;->b:Lc3/l;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lc3/l;->c:Lc3/l;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lc3/l;->d:Lc3/l;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lc3/l;
    .locals 1

    const-class v0, Lc3/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc3/l;

    return-object p0
.end method

.method public static values()[Lc3/l;
    .locals 1

    sget-object v0, Lc3/l;->e:[Lc3/l;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc3/l;

    return-object v0
.end method
