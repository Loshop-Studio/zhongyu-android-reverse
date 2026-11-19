.class public final synthetic Lcom/zykj/merge/sketch/view/BlackBoardProxyView$WhenMappings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/merge/sketch/view/BlackBoardProxyView;
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

    invoke-static {}, Lcom/zykj/blackboard/enums/PlayStatus;->values()[Lcom/zykj/blackboard/enums/PlayStatus;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->e:Lcom/zykj/blackboard/enums/PlayStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->g:Lcom/zykj/blackboard/enums/PlayStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->h:Lcom/zykj/blackboard/enums/PlayStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1

    sput-object v0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
