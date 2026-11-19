.class public final enum Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CENTER:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public static final enum END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public static final enum START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public static final synthetic a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 2
    .line 3
    const-string v1, "START"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->START:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 10
    .line 11
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 12
    .line 13
    const-string v2, "CENTER"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->CENTER:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 20
    .line 21
    new-instance v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 22
    .line 23
    const-string v3, "END"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->END:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 36
    .line 37
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;
    .locals 1

    .line 1
    const-class v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a:[Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getGravityInt()I
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RtlHardcoded"
        }
    .end annotation

    .line 1
    sget-object v0, Li2/a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const v0, 0x800005

    .line 19
    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v1, "Invalid gravity constant"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :cond_1
    return v1

    .line 31
    :cond_2
    const v0, 0x800003

    .line 32
    .line 33
    .line 34
    return v0
.end method

.method public getTextAlignment()I
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .line 1
    sget-object v0, Li2/a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x6

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x4

    .line 20
    return v0
.end method
