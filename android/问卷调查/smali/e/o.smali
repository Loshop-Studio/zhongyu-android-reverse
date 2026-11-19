.class public final enum Le/o;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Le/o;

.field public static final enum d:Le/o;

.field public static final synthetic e:[Le/o;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x6

    new-array v0, v0, [Le/o;

    new-instance v1, Le/o;

    const-string v2, "HTTP_1_0"

    const/4 v3, 0x0

    const-string v4, "http/1.0"

    invoke-direct {v1, v2, v3, v4}, Le/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    aput-object v1, v0, v3

    new-instance v1, Le/o;

    const-string v2, "HTTP_1_1"

    const/4 v3, 0x1

    const-string v4, "http/1.1"

    invoke-direct {v1, v2, v3, v4}, Le/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Le/o;->c:Le/o;

    aput-object v1, v0, v3

    new-instance v1, Le/o;

    const-string v2, "SPDY_3"

    const/4 v3, 0x2

    const-string v4, "spdy/3.1"

    invoke-direct {v1, v2, v3, v4}, Le/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    aput-object v1, v0, v3

    new-instance v1, Le/o;

    const-string v2, "HTTP_2"

    const/4 v3, 0x3

    const-string v4, "h2"

    invoke-direct {v1, v2, v3, v4}, Le/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Le/o;->d:Le/o;

    aput-object v1, v0, v3

    new-instance v1, Le/o;

    const-string v2, "H2_PRIOR_KNOWLEDGE"

    const/4 v3, 0x4

    const-string v4, "h2_prior_knowledge"

    invoke-direct {v1, v2, v3, v4}, Le/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    aput-object v1, v0, v3

    new-instance v1, Le/o;

    const-string v2, "QUIC"

    const/4 v3, 0x5

    const-string v4, "quic"

    invoke-direct {v1, v2, v3, v4}, Le/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    aput-object v1, v0, v3

    sput-object v0, Le/o;->e:[Le/o;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Le/o;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le/o;
    .locals 1

    const-class v0, Le/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/o;

    return-object p0
.end method

.method public static values()[Le/o;
    .locals 1

    sget-object v0, Le/o;->e:[Le/o;

    invoke-virtual {v0}, [Le/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/o;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le/o;->b:Ljava/lang/String;

    return-object v0
.end method
