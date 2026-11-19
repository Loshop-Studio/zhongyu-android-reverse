.class synthetic Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$xuexiang$xui$widget$imageview$edit$ViewType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->values()[Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$7;->$SwitchMap$com$xuexiang$xui$widget$imageview$edit$ViewType:[I

    :try_start_0
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->TEXT:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$7;->$SwitchMap$com$xuexiang$xui$widget$imageview$edit$ViewType:[I

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->IMAGE:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$7;->$SwitchMap$com$xuexiang$xui$widget$imageview$edit$ViewType:[I

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->EMOJI:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
