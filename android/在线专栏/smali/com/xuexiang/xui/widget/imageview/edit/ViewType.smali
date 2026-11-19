.class public final enum Lcom/xuexiang/xui/widget/imageview/edit/ViewType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/imageview/edit/ViewType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

.field public static final enum BRUSH_DRAWING:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

.field public static final enum EMOJI:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

.field public static final enum IMAGE:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

.field public static final enum TEXT:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    const-string v1, "BRUSH_DRAWING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->BRUSH_DRAWING:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    const-string v3, "TEXT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->TEXT:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    .line 3
    new-instance v3, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    const-string v5, "IMAGE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->IMAGE:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    .line 4
    new-instance v5, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    const-string v7, "EMOJI"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->EMOJI:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->$VALUES:[Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/imageview/edit/ViewType;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/imageview/edit/ViewType;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->$VALUES:[Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    return-object v0
.end method
