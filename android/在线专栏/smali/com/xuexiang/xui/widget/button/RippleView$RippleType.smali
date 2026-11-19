.class public final enum Lcom/xuexiang/xui/widget/button/RippleView$RippleType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/button/RippleView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RippleType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/button/RippleView$RippleType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

.field public static final enum DOUBLE:Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

.field public static final enum RECTANGLE:Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

.field public static final enum SIMPLE:Lcom/xuexiang/xui/widget/button/RippleView$RippleType;


# instance fields
.field type:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    const-string v1, "SIMPLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;->SIMPLE:Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    const-string v3, "DOUBLE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;->DOUBLE:Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    .line 3
    new-instance v3, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    const-string v5, "RECTANGLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;->RECTANGLE:Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;->$VALUES:[Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

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
    iput p3, p0, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;->type:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/button/RippleView$RippleType;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/button/RippleView$RippleType;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;->$VALUES:[Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/button/RippleView$RippleType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    return-object v0
.end method
