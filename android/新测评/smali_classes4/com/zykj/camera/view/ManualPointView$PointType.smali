.class public final enum Lcom/zykj/camera/view/ManualPointView$PointType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/camera/view/ManualPointView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PointType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/camera/view/ManualPointView$PointType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/zykj/camera/view/ManualPointView$PointType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "camera_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum a:Lcom/zykj/camera/view/ManualPointView$PointType;

.field public static final enum b:Lcom/zykj/camera/view/ManualPointView$PointType;

.field public static final enum c:Lcom/zykj/camera/view/ManualPointView$PointType;

.field public static final enum d:Lcom/zykj/camera/view/ManualPointView$PointType;

.field public static final synthetic e:[Lcom/zykj/camera/view/ManualPointView$PointType;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/zykj/camera/view/ManualPointView$PointType;

    const-string v1, "LEFT_TOP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/zykj/camera/view/ManualPointView$PointType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/zykj/camera/view/ManualPointView$PointType;->a:Lcom/zykj/camera/view/ManualPointView$PointType;

    new-instance v1, Lcom/zykj/camera/view/ManualPointView$PointType;

    const-string v2, "LEFT_BOTTOM"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/zykj/camera/view/ManualPointView$PointType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/zykj/camera/view/ManualPointView$PointType;->b:Lcom/zykj/camera/view/ManualPointView$PointType;

    new-instance v2, Lcom/zykj/camera/view/ManualPointView$PointType;

    const-string v3, "RIGHT_TOP"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/zykj/camera/view/ManualPointView$PointType;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/zykj/camera/view/ManualPointView$PointType;->c:Lcom/zykj/camera/view/ManualPointView$PointType;

    new-instance v3, Lcom/zykj/camera/view/ManualPointView$PointType;

    const-string v4, "RIGHT_BOTTOM"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/zykj/camera/view/ManualPointView$PointType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/zykj/camera/view/ManualPointView$PointType;->d:Lcom/zykj/camera/view/ManualPointView$PointType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/zykj/camera/view/ManualPointView$PointType;

    move-result-object v0

    sput-object v0, Lcom/zykj/camera/view/ManualPointView$PointType;->e:[Lcom/zykj/camera/view/ManualPointView$PointType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/camera/view/ManualPointView$PointType;
    .locals 1

    const-class v0, Lcom/zykj/camera/view/ManualPointView$PointType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/camera/view/ManualPointView$PointType;

    return-object p0
.end method

.method public static values()[Lcom/zykj/camera/view/ManualPointView$PointType;
    .locals 1

    sget-object v0, Lcom/zykj/camera/view/ManualPointView$PointType;->e:[Lcom/zykj/camera/view/ManualPointView$PointType;

    invoke-virtual {v0}, [Lcom/zykj/camera/view/ManualPointView$PointType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/camera/view/ManualPointView$PointType;

    return-object v0
.end method
