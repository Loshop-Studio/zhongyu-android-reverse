.class public final synthetic Lcom/zykj/sketch/core/ActionExecute$WhenMappings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/core/ActionExecute;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphType;->values()[Lcom/zykj/sketch/GraphSnapshot$GraphType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/zykj/sketch/GraphSnapshot$GraphType;->UNBOUNDED_CONTAINER_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/GraphSnapshot$GraphType;->BOUNDED_CONTAINER_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/GraphSnapshot$GraphType;->IMAGE_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/GraphSnapshot$GraphType;->WEB_VIEW_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/GraphSnapshot$GraphType;->WRITING_GROUP_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/GraphSnapshot$GraphType;->STROKE_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/GraphSnapshot$GraphType;->SHAPE_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1

    sput-object v0, Lcom/zykj/sketch/core/ActionExecute$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
