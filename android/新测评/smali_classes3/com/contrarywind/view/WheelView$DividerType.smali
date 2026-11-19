.class public final enum Lcom/contrarywind/view/WheelView$DividerType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/contrarywind/view/WheelView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DividerType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/contrarywind/view/WheelView$DividerType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/contrarywind/view/WheelView$DividerType;

.field public static final enum b:Lcom/contrarywind/view/WheelView$DividerType;

.field public static final enum c:Lcom/contrarywind/view/WheelView$DividerType;

.field public static final synthetic d:[Lcom/contrarywind/view/WheelView$DividerType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/contrarywind/view/WheelView$DividerType;

    .line 2
    .line 3
    const-string v1, "FILL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/contrarywind/view/WheelView$DividerType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/contrarywind/view/WheelView$DividerType;->a:Lcom/contrarywind/view/WheelView$DividerType;

    .line 10
    .line 11
    new-instance v1, Lcom/contrarywind/view/WheelView$DividerType;

    .line 12
    .line 13
    const-string v2, "WRAP"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Lcom/contrarywind/view/WheelView$DividerType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/contrarywind/view/WheelView$DividerType;->b:Lcom/contrarywind/view/WheelView$DividerType;

    .line 20
    .line 21
    new-instance v2, Lcom/contrarywind/view/WheelView$DividerType;

    .line 22
    .line 23
    const-string v3, "CIRCLE"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Lcom/contrarywind/view/WheelView$DividerType;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcom/contrarywind/view/WheelView$DividerType;->c:Lcom/contrarywind/view/WheelView$DividerType;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lcom/contrarywind/view/WheelView$DividerType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/contrarywind/view/WheelView$DividerType;->d:[Lcom/contrarywind/view/WheelView$DividerType;

    .line 36
    .line 37
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

.method public static valueOf(Ljava/lang/String;)Lcom/contrarywind/view/WheelView$DividerType;
    .locals 1

    .line 1
    const-class v0, Lcom/contrarywind/view/WheelView$DividerType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/contrarywind/view/WheelView$DividerType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/contrarywind/view/WheelView$DividerType;
    .locals 1

    .line 1
    sget-object v0, Lcom/contrarywind/view/WheelView$DividerType;->d:[Lcom/contrarywind/view/WheelView$DividerType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/contrarywind/view/WheelView$DividerType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/contrarywind/view/WheelView$DividerType;

    .line 8
    .line 9
    return-object v0
.end method
