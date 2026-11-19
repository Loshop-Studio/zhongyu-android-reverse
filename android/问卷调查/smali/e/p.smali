.class public final enum Le/p;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/p;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Le/p;

.field public static final enum d:Le/p;

.field public static final enum e:Le/p;

.field public static final enum f:Le/p;

.field public static final enum g:Le/p;

.field public static final synthetic h:[Le/p;

.field public static final i:Le/p$a;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x5

    new-array v0, v0, [Le/p;

    new-instance v1, Le/p;

    const-string v2, "TLS_1_3"

    const/4 v3, 0x0

    const-string v4, "TLSv1.3"

    invoke-direct {v1, v2, v3, v4}, Le/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Le/p;->c:Le/p;

    aput-object v1, v0, v3

    new-instance v1, Le/p;

    const-string v2, "TLS_1_2"

    const/4 v3, 0x1

    const-string v4, "TLSv1.2"

    invoke-direct {v1, v2, v3, v4}, Le/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Le/p;->d:Le/p;

    aput-object v1, v0, v3

    new-instance v1, Le/p;

    const-string v2, "TLS_1_1"

    const/4 v3, 0x2

    const-string v4, "TLSv1.1"

    invoke-direct {v1, v2, v3, v4}, Le/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Le/p;->e:Le/p;

    aput-object v1, v0, v3

    new-instance v1, Le/p;

    const-string v2, "TLS_1_0"

    const/4 v3, 0x3

    const-string v4, "TLSv1"

    invoke-direct {v1, v2, v3, v4}, Le/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Le/p;->f:Le/p;

    aput-object v1, v0, v3

    new-instance v1, Le/p;

    const-string v2, "SSL_3_0"

    const/4 v3, 0x4

    const-string v4, "SSLv3"

    invoke-direct {v1, v2, v3, v4}, Le/p;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Le/p;->g:Le/p;

    aput-object v1, v0, v3

    sput-object v0, Le/p;->h:[Le/p;

    new-instance v0, Le/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/p$a;-><init>(Ld/f/b/c;)V

    sput-object v0, Le/p;->i:Le/p$a;

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

    iput-object p3, p0, Le/p;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le/p;
    .locals 1

    const-class v0, Le/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/p;

    return-object p0
.end method

.method public static values()[Le/p;
    .locals 1

    sget-object v0, Le/p;->h:[Le/p;

    invoke-virtual {v0}, [Le/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/p;

    return-object v0
.end method
