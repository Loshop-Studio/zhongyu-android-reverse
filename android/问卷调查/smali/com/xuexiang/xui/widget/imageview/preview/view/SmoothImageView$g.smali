.class public final enum Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

.field public static final enum c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

.field public static final enum d:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

.field public static final enum e:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

.field public static final synthetic f:[Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    const-string v1, "STATE_NORMAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    const-string v3, "STATE_IN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    new-instance v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    const-string v5, "STATE_OUT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->d:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    new-instance v5, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    const-string v7, "STATE_MOVE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->f:[Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

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

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->f:[Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    return-object v0
.end method
