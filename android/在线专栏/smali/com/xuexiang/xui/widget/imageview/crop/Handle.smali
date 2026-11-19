.class public final enum Lcom/xuexiang/xui/widget/imageview/crop/Handle;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/imageview/crop/Handle;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum BOTTOM_LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum BOTTOM_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum CENTER:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum TOP:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum TOP_LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum TOP_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;


# instance fields
.field private mHelper:Lcom/xuexiang/xui/widget/imageview/crop/HandleHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;

    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-direct {v1, v2, v3}, Lcom/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    const-string v4, "TOP_LEFT"

    const/4 v5, 0x0

    invoke-direct {v0, v4, v5, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILcom/xuexiang/xui/widget/imageview/crop/HandleHelper;)V

    sput-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->TOP_LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    new-instance v4, Lcom/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;

    sget-object v6, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-direct {v4, v2, v6}, Lcom/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    const-string v7, "TOP_RIGHT"

    const/4 v8, 0x1

    invoke-direct {v1, v7, v8, v4}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILcom/xuexiang/xui/widget/imageview/crop/HandleHelper;)V

    sput-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->TOP_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 3
    new-instance v4, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    new-instance v7, Lcom/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;

    sget-object v9, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-direct {v7, v9, v3}, Lcom/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    const-string v10, "BOTTOM_LEFT"

    const/4 v11, 0x2

    invoke-direct {v4, v10, v11, v7}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILcom/xuexiang/xui/widget/imageview/crop/HandleHelper;)V

    sput-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->BOTTOM_LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 4
    new-instance v7, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    new-instance v10, Lcom/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;

    invoke-direct {v10, v9, v6}, Lcom/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    const-string v12, "BOTTOM_RIGHT"

    const/4 v13, 0x3

    invoke-direct {v7, v12, v13, v10}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILcom/xuexiang/xui/widget/imageview/crop/HandleHelper;)V

    sput-object v7, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->BOTTOM_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 5
    new-instance v10, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    new-instance v12, Lcom/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;

    invoke-direct {v12, v3}, Lcom/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    const-string v3, "LEFT"

    const/4 v14, 0x4

    invoke-direct {v10, v3, v14, v12}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILcom/xuexiang/xui/widget/imageview/crop/HandleHelper;)V

    sput-object v10, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 6
    new-instance v3, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    new-instance v12, Lcom/xuexiang/xui/widget/imageview/crop/HorizontalHandleHelper;

    invoke-direct {v12, v2}, Lcom/xuexiang/xui/widget/imageview/crop/HorizontalHandleHelper;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    const-string v2, "TOP"

    const/4 v15, 0x5

    invoke-direct {v3, v2, v15, v12}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILcom/xuexiang/xui/widget/imageview/crop/HandleHelper;)V

    sput-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 7
    new-instance v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    new-instance v12, Lcom/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;

    invoke-direct {v12, v6}, Lcom/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    const-string v6, "RIGHT"

    const/4 v15, 0x6

    invoke-direct {v2, v6, v15, v12}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILcom/xuexiang/xui/widget/imageview/crop/HandleHelper;)V

    sput-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 8
    new-instance v6, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    new-instance v12, Lcom/xuexiang/xui/widget/imageview/crop/HorizontalHandleHelper;

    invoke-direct {v12, v9}, Lcom/xuexiang/xui/widget/imageview/crop/HorizontalHandleHelper;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    const-string v9, "BOTTOM"

    const/4 v15, 0x7

    invoke-direct {v6, v9, v15, v12}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILcom/xuexiang/xui/widget/imageview/crop/HandleHelper;)V

    sput-object v6, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 9
    new-instance v9, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    new-instance v12, Lcom/xuexiang/xui/widget/imageview/crop/CenterHandleHelper;

    invoke-direct {v12}, Lcom/xuexiang/xui/widget/imageview/crop/CenterHandleHelper;-><init>()V

    const-string v15, "CENTER"

    const/16 v14, 0x8

    invoke-direct {v9, v15, v14, v12}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILcom/xuexiang/xui/widget/imageview/crop/HandleHelper;)V

    sput-object v9, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->CENTER:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    const/16 v12, 0x9

    new-array v12, v12, [Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    aput-object v0, v12, v5

    aput-object v1, v12, v8

    aput-object v4, v12, v11

    aput-object v7, v12, v13

    const/4 v0, 0x4

    aput-object v10, v12, v0

    const/4 v0, 0x5

    aput-object v3, v12, v0

    const/4 v0, 0x6

    aput-object v2, v12, v0

    const/4 v0, 0x7

    aput-object v6, v12, v0

    aput-object v9, v12, v14

    .line 10
    sput-object v12, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->$VALUES:[Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/xuexiang/xui/widget/imageview/crop/HandleHelper;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/xuexiang/xui/widget/imageview/crop/HandleHelper;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->mHelper:Lcom/xuexiang/xui/widget/imageview/crop/HandleHelper;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/imageview/crop/Handle;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/imageview/crop/Handle;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->$VALUES:[Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/imageview/crop/Handle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    return-object v0
.end method


# virtual methods
.method public updateCropWindow(FFFLandroid/graphics/Rect;F)V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->mHelper:Lcom/xuexiang/xui/widget/imageview/crop/HandleHelper;

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/xuexiang/xui/widget/imageview/crop/HandleHelper;->updateCropWindow(FFFLandroid/graphics/Rect;F)V

    return-void
.end method

.method public updateCropWindow(FFLandroid/graphics/Rect;F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->mHelper:Lcom/xuexiang/xui/widget/imageview/crop/HandleHelper;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/crop/HandleHelper;->updateCropWindow(FFLandroid/graphics/Rect;F)V

    return-void
.end method
