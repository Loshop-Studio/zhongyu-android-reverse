.class public final enum Lcom/xuexiang/xui/utils/ViewUtils$Direction;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/utils/ViewUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Direction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/utils/ViewUtils$Direction;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/xuexiang/xui/utils/ViewUtils$Direction;

.field public static final enum BOTTOM_TO_TOP:Lcom/xuexiang/xui/utils/ViewUtils$Direction;

.field public static final enum LEFT_TO_RIGHT:Lcom/xuexiang/xui/utils/ViewUtils$Direction;

.field public static final enum RIGHT_TO_LEFT:Lcom/xuexiang/xui/utils/ViewUtils$Direction;

.field public static final enum TOP_TO_BOTTOM:Lcom/xuexiang/xui/utils/ViewUtils$Direction;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    const-string v1, "LEFT_TO_RIGHT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/utils/ViewUtils$Direction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xuexiang/xui/utils/ViewUtils$Direction;->LEFT_TO_RIGHT:Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    .line 2
    new-instance v1, Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    const-string v3, "TOP_TO_BOTTOM"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/xuexiang/xui/utils/ViewUtils$Direction;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/xuexiang/xui/utils/ViewUtils$Direction;->TOP_TO_BOTTOM:Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    .line 3
    new-instance v3, Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    const-string v5, "RIGHT_TO_LEFT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/xuexiang/xui/utils/ViewUtils$Direction;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/xuexiang/xui/utils/ViewUtils$Direction;->RIGHT_TO_LEFT:Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    .line 4
    new-instance v5, Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    const-string v7, "BOTTOM_TO_TOP"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/xuexiang/xui/utils/ViewUtils$Direction;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/xuexiang/xui/utils/ViewUtils$Direction;->BOTTOM_TO_TOP:Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lcom/xuexiang/xui/utils/ViewUtils$Direction;->$VALUES:[Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/utils/ViewUtils$Direction;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/utils/ViewUtils$Direction;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/utils/ViewUtils$Direction;->$VALUES:[Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/utils/ViewUtils$Direction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/utils/ViewUtils$Direction;

    return-object v0
.end method
