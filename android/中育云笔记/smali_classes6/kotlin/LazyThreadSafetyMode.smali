.class public final enum Lkotlin/LazyThreadSafetyMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkotlin/LazyThreadSafetyMode;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lkotlin/LazyThreadSafetyMode;

.field public static final enum d:Lkotlin/LazyThreadSafetyMode;

.field public static final enum e:Lkotlin/LazyThreadSafetyMode;

.field public static final synthetic f:[Lkotlin/LazyThreadSafetyMode;

.field public static final synthetic g:Lyc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lkotlin/LazyThreadSafetyMode;

    .line 2
    .line 3
    const-string v1, "SYNCHRONIZED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lkotlin/LazyThreadSafetyMode;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v0, Lkotlin/LazyThreadSafetyMode;

    .line 12
    .line 13
    const-string v1, "PUBLICATION"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lkotlin/LazyThreadSafetyMode;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lkotlin/LazyThreadSafetyMode;->d:Lkotlin/LazyThreadSafetyMode;

    .line 20
    .line 21
    new-instance v0, Lkotlin/LazyThreadSafetyMode;

    .line 22
    .line 23
    const-string v1, "NONE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lkotlin/LazyThreadSafetyMode;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lkotlin/LazyThreadSafetyMode;->e:Lkotlin/LazyThreadSafetyMode;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/LazyThreadSafetyMode;->a()[Lkotlin/LazyThreadSafetyMode;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lkotlin/LazyThreadSafetyMode;->f:[Lkotlin/LazyThreadSafetyMode;

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lyc/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lkotlin/LazyThreadSafetyMode;->g:Lyc/a;

    .line 42
    .line 43
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

.method public static final synthetic a()[Lkotlin/LazyThreadSafetyMode;
    .locals 3

    .line 1
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Lkotlin/LazyThreadSafetyMode;->d:Lkotlin/LazyThreadSafetyMode;

    sget-object v2, Lkotlin/LazyThreadSafetyMode;->e:Lkotlin/LazyThreadSafetyMode;

    filled-new-array {v0, v1, v2}, [Lkotlin/LazyThreadSafetyMode;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/LazyThreadSafetyMode;
    .locals 1

    const-class v0, Lkotlin/LazyThreadSafetyMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/LazyThreadSafetyMode;

    return-object p0
.end method

.method public static values()[Lkotlin/LazyThreadSafetyMode;
    .locals 1

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->f:[Lkotlin/LazyThreadSafetyMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/LazyThreadSafetyMode;

    return-object v0
.end method
