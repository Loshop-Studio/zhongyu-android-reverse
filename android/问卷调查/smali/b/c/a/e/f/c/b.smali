.class public final enum Lb/c/a/e/f/c/b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb/c/a/e/f/c/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lb/c/a/e/f/c/b;

.field public static final enum c:Lb/c/a/e/f/c/b;

.field public static final synthetic d:[Lb/c/a/e/f/c/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lb/c/a/e/f/c/b;

    const-string v1, "Dot"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb/c/a/e/f/c/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/c/a/e/f/c/b;->b:Lb/c/a/e/f/c/b;

    new-instance v1, Lb/c/a/e/f/c/b;

    const-string v3, "Number"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lb/c/a/e/f/c/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lb/c/a/e/f/c/b;->c:Lb/c/a/e/f/c/b;

    const/4 v3, 0x2

    new-array v3, v3, [Lb/c/a/e/f/c/b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lb/c/a/e/f/c/b;->d:[Lb/c/a/e/f/c/b;

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

.method public static valueOf(Ljava/lang/String;)Lb/c/a/e/f/c/b;
    .locals 1

    const-class v0, Lb/c/a/e/f/c/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb/c/a/e/f/c/b;

    return-object p0
.end method

.method public static values()[Lb/c/a/e/f/c/b;
    .locals 1

    sget-object v0, Lb/c/a/e/f/c/b;->d:[Lb/c/a/e/f/c/b;

    invoke-virtual {v0}, [Lb/c/a/e/f/c/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/c/a/e/f/c/b;

    return-object v0
.end method
