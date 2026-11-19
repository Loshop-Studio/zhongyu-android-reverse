.class public final enum Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ALIGN"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

.field public static final enum CENTER:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

.field public static final enum START:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    const-string v1, "START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;->START:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    const-string v3, "CENTER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;->CENTER:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;->$VALUES:[Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

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

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;->$VALUES:[Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    return-object v0
.end method
