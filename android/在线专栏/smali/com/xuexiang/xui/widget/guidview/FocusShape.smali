.class public final enum Lcom/xuexiang/xui/widget/guidview/FocusShape;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/guidview/FocusShape;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/xuexiang/xui/widget/guidview/FocusShape;

.field public static final enum CIRCLE:Lcom/xuexiang/xui/widget/guidview/FocusShape;

.field public static final enum ROUNDED_RECTANGLE:Lcom/xuexiang/xui/widget/guidview/FocusShape;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/guidview/FocusShape;

    const-string v1, "CIRCLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/guidview/FocusShape;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xuexiang/xui/widget/guidview/FocusShape;->CIRCLE:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/guidview/FocusShape;

    const-string v3, "ROUNDED_RECTANGLE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/xuexiang/xui/widget/guidview/FocusShape;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/xuexiang/xui/widget/guidview/FocusShape;->ROUNDED_RECTANGLE:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/xuexiang/xui/widget/guidview/FocusShape;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/xuexiang/xui/widget/guidview/FocusShape;->$VALUES:[Lcom/xuexiang/xui/widget/guidview/FocusShape;

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

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/guidview/FocusShape;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/guidview/FocusShape;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/guidview/FocusShape;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/guidview/FocusShape;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/guidview/FocusShape;->$VALUES:[Lcom/xuexiang/xui/widget/guidview/FocusShape;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/guidview/FocusShape;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/widget/guidview/FocusShape;

    return-object v0
.end method
