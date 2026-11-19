.class public final enum Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

.field public static final enum CENTER_CROP:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

.field public static final enum CENTER_INSIDE:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

.field public static final enum CIRCLE_CROP:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

.field public static final enum DEFAULT:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

.field public static final enum FIT_CENTER:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;->DEFAULT:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    const-string v3, "CENTER_CROP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;->CENTER_CROP:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    .line 3
    new-instance v3, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    const-string v5, "CENTER_INSIDE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;->CENTER_INSIDE:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    .line 4
    new-instance v5, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    const-string v7, "FIT_CENTER"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;->FIT_CENTER:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    .line 5
    new-instance v7, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    const-string v9, "CIRCLE_CROP"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;->CIRCLE_CROP:Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 6
    sput-object v9, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;->$VALUES:[Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

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

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;->$VALUES:[Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/widget/imageview/strategy/AlignEnum;

    return-object v0
.end method
