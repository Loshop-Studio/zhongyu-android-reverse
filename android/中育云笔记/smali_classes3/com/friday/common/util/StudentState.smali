.class public final enum Lcom/friday/common/util/StudentState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/friday/common/util/StudentState;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/friday/common/util/StudentState;

.field public static final enum d:Lcom/friday/common/util/StudentState;

.field public static final enum e:Lcom/friday/common/util/StudentState;

.field public static final synthetic f:[Lcom/friday/common/util/StudentState;

.field public static final synthetic g:Lyc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/common/util/StudentState;

    .line 2
    .line 3
    const-string v1, "SCREEN_OFF_ONLINE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/friday/common/util/StudentState;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/friday/common/util/StudentState;->c:Lcom/friday/common/util/StudentState;

    .line 10
    .line 11
    new-instance v0, Lcom/friday/common/util/StudentState;

    .line 12
    .line 13
    const-string v1, "SCREEN_ON_ONLINE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/friday/common/util/StudentState;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/friday/common/util/StudentState;->d:Lcom/friday/common/util/StudentState;

    .line 20
    .line 21
    new-instance v0, Lcom/friday/common/util/StudentState;

    .line 22
    .line 23
    const-string v1, "OFFLINE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/friday/common/util/StudentState;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/friday/common/util/StudentState;->e:Lcom/friday/common/util/StudentState;

    .line 30
    .line 31
    invoke-static {}, Lcom/friday/common/util/StudentState;->a()[Lcom/friday/common/util/StudentState;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/friday/common/util/StudentState;->f:[Lcom/friday/common/util/StudentState;

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lyc/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lcom/friday/common/util/StudentState;->g:Lyc/a;

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

.method public static final synthetic a()[Lcom/friday/common/util/StudentState;
    .locals 3

    .line 1
    sget-object v0, Lcom/friday/common/util/StudentState;->c:Lcom/friday/common/util/StudentState;

    sget-object v1, Lcom/friday/common/util/StudentState;->d:Lcom/friday/common/util/StudentState;

    sget-object v2, Lcom/friday/common/util/StudentState;->e:Lcom/friday/common/util/StudentState;

    filled-new-array {v0, v1, v2}, [Lcom/friday/common/util/StudentState;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/friday/common/util/StudentState;
    .locals 1

    const-class v0, Lcom/friday/common/util/StudentState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/friday/common/util/StudentState;

    return-object p0
.end method

.method public static values()[Lcom/friday/common/util/StudentState;
    .locals 1

    sget-object v0, Lcom/friday/common/util/StudentState;->f:[Lcom/friday/common/util/StudentState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/friday/common/util/StudentState;

    return-object v0
.end method
