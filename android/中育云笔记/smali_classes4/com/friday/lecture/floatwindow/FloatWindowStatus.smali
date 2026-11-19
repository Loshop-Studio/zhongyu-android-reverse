.class public final enum Lcom/friday/lecture/floatwindow/FloatWindowStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/friday/lecture/floatwindow/FloatWindowStatus;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

.field public static final enum d:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

.field public static final enum e:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

.field public static final enum f:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

.field public static final enum g:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

.field public static final synthetic h:[Lcom/friday/lecture/floatwindow/FloatWindowStatus;

.field public static final synthetic i:Lyc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 2
    .line 3
    const-string v1, "SHOW_OPTIONS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/friday/lecture/floatwindow/FloatWindowStatus;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->c:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 10
    .line 11
    new-instance v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 12
    .line 13
    const-string v1, "SHOW_HOMEWORK"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/friday/lecture/floatwindow/FloatWindowStatus;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->d:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 20
    .line 21
    new-instance v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 22
    .line 23
    const-string v1, "SHOW_SUBJECTIVE_ANSWER"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/friday/lecture/floatwindow/FloatWindowStatus;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->e:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 30
    .line 31
    new-instance v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 32
    .line 33
    const-string v1, "SHOW_OBJECTIVE_ANSWER"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/friday/lecture/floatwindow/FloatWindowStatus;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->f:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 40
    .line 41
    new-instance v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 42
    .line 43
    const-string v1, "SHOW_STUDENT_DEMO"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/friday/lecture/floatwindow/FloatWindowStatus;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->g:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 50
    .line 51
    invoke-static {}, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->a()[Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->h:[Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lyc/a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->i:Lyc/a;

    .line 62
    .line 63
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

.method public static final synthetic a()[Lcom/friday/lecture/floatwindow/FloatWindowStatus;
    .locals 5

    .line 1
    sget-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->c:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    sget-object v1, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->d:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    sget-object v2, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->e:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    sget-object v3, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->f:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    sget-object v4, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->g:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/friday/lecture/floatwindow/FloatWindowStatus;
    .locals 1

    const-class v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    return-object p0
.end method

.method public static values()[Lcom/friday/lecture/floatwindow/FloatWindowStatus;
    .locals 1

    sget-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->h:[Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    return-object v0
.end method
