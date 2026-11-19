.class public final enum Lb/c/a/e/d/a/b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb/c/a/e/d/a/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lb/c/a/e/d/a/b;

.field public static final enum c:Lb/c/a/e/d/a/b;

.field public static final enum d:Lb/c/a/e/d/a/b;

.field public static final synthetic e:[Lb/c/a/e/d/a/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lb/c/a/e/d/a/b;

    const-string v1, "ALWAYS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb/c/a/e/d/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/c/a/e/d/a/b;->b:Lb/c/a/e/d/a/b;

    new-instance v1, Lb/c/a/e/d/a/b;

    const-string v3, "ADAPTIVE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lb/c/a/e/d/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lb/c/a/e/d/a/b;->c:Lb/c/a/e/d/a/b;

    new-instance v3, Lb/c/a/e/d/a/b;

    const-string v5, "NEVER"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lb/c/a/e/d/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lb/c/a/e/d/a/b;->d:Lb/c/a/e/d/a/b;

    const/4 v5, 0x3

    new-array v5, v5, [Lb/c/a/e/d/a/b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lb/c/a/e/d/a/b;->e:[Lb/c/a/e/d/a/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb/c/a/e/d/a/b;
    .locals 1

    const-class v0, Lb/c/a/e/d/a/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb/c/a/e/d/a/b;

    return-object p0
.end method

.method public static values()[Lb/c/a/e/d/a/b;
    .locals 1

    sget-object v0, Lb/c/a/e/d/a/b;->e:[Lb/c/a/e/d/a/b;

    invoke-virtual {v0}, [Lb/c/a/e/d/a/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/c/a/e/d/a/b;

    return-object v0
.end method
