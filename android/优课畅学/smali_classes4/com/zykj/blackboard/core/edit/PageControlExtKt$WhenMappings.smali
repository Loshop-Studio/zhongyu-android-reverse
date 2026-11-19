.class public final synthetic Lcom/zykj/blackboard/core/edit/PageControlExtKt$WhenMappings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/edit/PageControlExtKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    invoke-static {}, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->values()[Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->f:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->g:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v3, 0x2

    aput v3, v0, v1

    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->e:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v4, 0x3

    aput v4, v0, v1

    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->d:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v5, 0x4

    aput v5, v0, v1

    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->b:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v6, 0x5

    aput v6, v0, v1

    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->c:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v7, 0x6

    aput v7, v0, v1

    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->h:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v8, 0x7

    aput v8, v0, v1

    sput-object v0, Lcom/zykj/blackboard/core/edit/PageControlExtKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->values()[Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->b:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->c:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->d:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v4, v0, v1

    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->e:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v5, v0, v1

    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->g:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v6, v0, v1

    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->h:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v7, v0, v1

    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->i:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v8, v0, v1

    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->j:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1

    sput-object v0, Lcom/zykj/blackboard/core/edit/PageControlExtKt$WhenMappings;->$EnumSwitchMapping$1:[I

    return-void
.end method
