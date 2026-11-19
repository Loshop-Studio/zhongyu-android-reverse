.class public final synthetic Lcom/zykj/sketch/core/record/SketchRecorderView$WhenMappings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/core/record/SketchRecorderView;
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

    invoke-static {}, Lcom/zykj/sketch/core/data/Mode;->values()[Lcom/zykj/sketch/core/data/Mode;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/zykj/sketch/core/data/Mode;->ACTION_SELECT:Lcom/zykj/sketch/core/data/Mode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/core/data/Mode;->ACTION_WRITING:Lcom/zykj/sketch/core/data/Mode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/core/data/Mode;->ACTION_WRITING_MOVE:Lcom/zykj/sketch/core/data/Mode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/core/data/Mode;->ACTION_SHAPE_RECT:Lcom/zykj/sketch/core/data/Mode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/core/data/Mode;->ACTION_SHAPE_CIRCLE:Lcom/zykj/sketch/core/data/Mode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/core/data/Mode;->ACTION_ERASER_VIEW:Lcom/zykj/sketch/core/data/Mode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/core/data/Mode;->ACTION_ERASER_WRITING:Lcom/zykj/sketch/core/data/Mode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/core/data/Mode;->ACTION_DELETE:Lcom/zykj/sketch/core/data/Mode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/sketch/core/data/Mode;->ACTION_WRITING_MOVE_VERTICAL:Lcom/zykj/sketch/core/data/Mode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1

    sput-object v0, Lcom/zykj/sketch/core/record/SketchRecorderView$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
