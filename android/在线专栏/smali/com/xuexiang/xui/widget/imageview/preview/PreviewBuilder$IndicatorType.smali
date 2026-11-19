.class public final enum Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "IndicatorType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

.field public static final enum Dot:Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

.field public static final enum Number:Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    const-string v1, "Dot"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;->Dot:Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    const-string v3, "Number"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;->Number:Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;->$VALUES:[Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;->$VALUES:[Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;

    return-object v0
.end method
