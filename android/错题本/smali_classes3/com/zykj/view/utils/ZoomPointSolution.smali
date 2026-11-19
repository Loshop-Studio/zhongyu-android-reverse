.class public final enum Lcom/zykj/view/utils/ZoomPointSolution;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/view/utils/ZoomPointSolution;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/zykj/view/utils/ZoomPointSolution;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getValue",
        "()I",
        "setValue",
        "(I)V",
        "TOP_LEFT",
        "TOP_RIGHT",
        "BOTTOM_LEFT",
        "BOTTOM_RIGHT",
        "CENTER_TOP",
        "CENTER_LEFT",
        "CENTER_RIGHT",
        "CENTER_BOTTOM",
        "CENTER",
        "view_release"
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
.field private static final synthetic $ENTRIES:Lj6/a;

.field private static final synthetic $VALUES:[Lcom/zykj/view/utils/ZoomPointSolution;

.field public static final enum BOTTOM_LEFT:Lcom/zykj/view/utils/ZoomPointSolution;

.field public static final enum BOTTOM_RIGHT:Lcom/zykj/view/utils/ZoomPointSolution;

.field public static final enum CENTER:Lcom/zykj/view/utils/ZoomPointSolution;

.field public static final enum CENTER_BOTTOM:Lcom/zykj/view/utils/ZoomPointSolution;

.field public static final enum CENTER_LEFT:Lcom/zykj/view/utils/ZoomPointSolution;

.field public static final enum CENTER_RIGHT:Lcom/zykj/view/utils/ZoomPointSolution;

.field public static final enum CENTER_TOP:Lcom/zykj/view/utils/ZoomPointSolution;

.field public static final enum TOP_LEFT:Lcom/zykj/view/utils/ZoomPointSolution;

.field public static final enum TOP_RIGHT:Lcom/zykj/view/utils/ZoomPointSolution;


# instance fields
.field private value:I


# direct methods
.method private static final synthetic $values()[Lcom/zykj/view/utils/ZoomPointSolution;
    .locals 9

    sget-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->TOP_LEFT:Lcom/zykj/view/utils/ZoomPointSolution;

    sget-object v1, Lcom/zykj/view/utils/ZoomPointSolution;->TOP_RIGHT:Lcom/zykj/view/utils/ZoomPointSolution;

    sget-object v2, Lcom/zykj/view/utils/ZoomPointSolution;->BOTTOM_LEFT:Lcom/zykj/view/utils/ZoomPointSolution;

    sget-object v3, Lcom/zykj/view/utils/ZoomPointSolution;->BOTTOM_RIGHT:Lcom/zykj/view/utils/ZoomPointSolution;

    sget-object v4, Lcom/zykj/view/utils/ZoomPointSolution;->CENTER_TOP:Lcom/zykj/view/utils/ZoomPointSolution;

    sget-object v5, Lcom/zykj/view/utils/ZoomPointSolution;->CENTER_LEFT:Lcom/zykj/view/utils/ZoomPointSolution;

    sget-object v6, Lcom/zykj/view/utils/ZoomPointSolution;->CENTER_RIGHT:Lcom/zykj/view/utils/ZoomPointSolution;

    sget-object v7, Lcom/zykj/view/utils/ZoomPointSolution;->CENTER_BOTTOM:Lcom/zykj/view/utils/ZoomPointSolution;

    sget-object v8, Lcom/zykj/view/utils/ZoomPointSolution;->CENTER:Lcom/zykj/view/utils/ZoomPointSolution;

    filled-new-array/range {v0 .. v8}, [Lcom/zykj/view/utils/ZoomPointSolution;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/view/utils/ZoomPointSolution;

    .line 2
    .line 3
    const-string v1, "TOP_LEFT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/view/utils/ZoomPointSolution;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->TOP_LEFT:Lcom/zykj/view/utils/ZoomPointSolution;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/view/utils/ZoomPointSolution;

    .line 12
    .line 13
    const-string v1, "TOP_RIGHT"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/view/utils/ZoomPointSolution;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->TOP_RIGHT:Lcom/zykj/view/utils/ZoomPointSolution;

    .line 20
    .line 21
    new-instance v0, Lcom/zykj/view/utils/ZoomPointSolution;

    .line 22
    .line 23
    const-string v1, "BOTTOM_LEFT"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/view/utils/ZoomPointSolution;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->BOTTOM_LEFT:Lcom/zykj/view/utils/ZoomPointSolution;

    .line 30
    .line 31
    new-instance v0, Lcom/zykj/view/utils/ZoomPointSolution;

    .line 32
    .line 33
    const-string v1, "BOTTOM_RIGHT"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/view/utils/ZoomPointSolution;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->BOTTOM_RIGHT:Lcom/zykj/view/utils/ZoomPointSolution;

    .line 40
    .line 41
    new-instance v0, Lcom/zykj/view/utils/ZoomPointSolution;

    .line 42
    .line 43
    const-string v1, "CENTER_TOP"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/view/utils/ZoomPointSolution;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->CENTER_TOP:Lcom/zykj/view/utils/ZoomPointSolution;

    .line 50
    .line 51
    new-instance v0, Lcom/zykj/view/utils/ZoomPointSolution;

    .line 52
    .line 53
    const-string v1, "CENTER_LEFT"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/view/utils/ZoomPointSolution;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->CENTER_LEFT:Lcom/zykj/view/utils/ZoomPointSolution;

    .line 60
    .line 61
    new-instance v0, Lcom/zykj/view/utils/ZoomPointSolution;

    .line 62
    .line 63
    const-string v1, "CENTER_RIGHT"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/view/utils/ZoomPointSolution;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->CENTER_RIGHT:Lcom/zykj/view/utils/ZoomPointSolution;

    .line 70
    .line 71
    new-instance v0, Lcom/zykj/view/utils/ZoomPointSolution;

    .line 72
    .line 73
    const-string v1, "CENTER_BOTTOM"

    .line 74
    .line 75
    const/4 v2, 0x7

    .line 76
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/view/utils/ZoomPointSolution;-><init>(Ljava/lang/String;II)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->CENTER_BOTTOM:Lcom/zykj/view/utils/ZoomPointSolution;

    .line 80
    .line 81
    new-instance v0, Lcom/zykj/view/utils/ZoomPointSolution;

    .line 82
    .line 83
    const-string v1, "CENTER"

    .line 84
    .line 85
    const/16 v2, 0x8

    .line 86
    .line 87
    invoke-direct {v0, v1, v2, v2}, Lcom/zykj/view/utils/ZoomPointSolution;-><init>(Ljava/lang/String;II)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->CENTER:Lcom/zykj/view/utils/ZoomPointSolution;

    .line 91
    .line 92
    invoke-static {}, Lcom/zykj/view/utils/ZoomPointSolution;->$values()[Lcom/zykj/view/utils/ZoomPointSolution;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sput-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->$VALUES:[Lcom/zykj/view/utils/ZoomPointSolution;

    .line 97
    .line 98
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lj6/a;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sput-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->$ENTRIES:Lj6/a;

    .line 103
    .line 104
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/zykj/view/utils/ZoomPointSolution;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static getEntries()Lj6/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->$ENTRIES:Lj6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/view/utils/ZoomPointSolution;
    .locals 1

    const-class v0, Lcom/zykj/view/utils/ZoomPointSolution;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/utils/ZoomPointSolution;

    return-object p0
.end method

.method public static values()[Lcom/zykj/view/utils/ZoomPointSolution;
    .locals 1

    sget-object v0, Lcom/zykj/view/utils/ZoomPointSolution;->$VALUES:[Lcom/zykj/view/utils/ZoomPointSolution;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/view/utils/ZoomPointSolution;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/utils/ZoomPointSolution;->value:I

    .line 2
    .line 3
    return v0
.end method

.method public final setValue(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/utils/ZoomPointSolution;->value:I

    .line 2
    .line 3
    return-void
.end method
