.class public final synthetic Lcom/zykj/blackboard/utils/GraphUtils$WhenMappings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/utils/GraphUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->values()[Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->BOUNDED_CONTAINER_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->IMAGE_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->STROKE_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->BEELINE_STROKE_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->GROUP_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->TEXT_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->GEOMETRY_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1

    sput-object v0, Lcom/zykj/blackboard/utils/GraphUtils$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
