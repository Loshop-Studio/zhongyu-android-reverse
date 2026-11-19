.class public final enum Lcoil3/size/Scale;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcoil3/size/Scale;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcoil3/size/Scale;

.field public static final enum d:Lcoil3/size/Scale;

.field public static final synthetic e:[Lcoil3/size/Scale;

.field public static final synthetic f:Lyc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcoil3/size/Scale;

    .line 2
    .line 3
    const-string v1, "FILL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcoil3/size/Scale;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcoil3/size/Scale;->c:Lcoil3/size/Scale;

    .line 10
    .line 11
    new-instance v0, Lcoil3/size/Scale;

    .line 12
    .line 13
    const-string v1, "FIT"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcoil3/size/Scale;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcoil3/size/Scale;->d:Lcoil3/size/Scale;

    .line 20
    .line 21
    invoke-static {}, Lcoil3/size/Scale;->a()[Lcoil3/size/Scale;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcoil3/size/Scale;->e:[Lcoil3/size/Scale;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lyc/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lcoil3/size/Scale;->f:Lyc/a;

    .line 32
    .line 33
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

.method public static final synthetic a()[Lcoil3/size/Scale;
    .locals 2

    .line 1
    sget-object v0, Lcoil3/size/Scale;->c:Lcoil3/size/Scale;

    sget-object v1, Lcoil3/size/Scale;->d:Lcoil3/size/Scale;

    filled-new-array {v0, v1}, [Lcoil3/size/Scale;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcoil3/size/Scale;
    .locals 1

    const-class v0, Lcoil3/size/Scale;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcoil3/size/Scale;

    return-object p0
.end method

.method public static values()[Lcoil3/size/Scale;
    .locals 1

    sget-object v0, Lcoil3/size/Scale;->e:[Lcoil3/size/Scale;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcoil3/size/Scale;

    return-object v0
.end method
