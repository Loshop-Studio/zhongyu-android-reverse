.class public final enum Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;",
        "",
        "",
        "position",
        "<init>",
        "(Ljava/lang/String;II)V",
        "a",
        "b",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

.field public static final enum b:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

.field public static final synthetic c:[Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

.field public static final synthetic d:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 2
    .line 3
    const-string v1, "ALL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 12
    .line 13
    const-string v1, "PRIMARY"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;->b:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 20
    .line 21
    invoke-static {}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;->a()[Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;->c:[Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;->d:Lkotlin/enums/EnumEntries;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic a()[Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    sget-object v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;->b:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    filled-new-array {v0, v1}, [Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;
    .locals 1

    const-class v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    return-object p0
.end method

.method public static values()[Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;
    .locals 1

    sget-object v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;->c:[Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    return-object v0
.end method
