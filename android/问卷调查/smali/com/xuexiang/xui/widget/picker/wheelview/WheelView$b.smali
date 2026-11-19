.class public final enum Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

.field public static final enum c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

.field public static final synthetic d:[Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    const-string v1, "FILL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    const-string v3, "WRAP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;->d:[Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;->d:[Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    return-object v0
.end method
