.class public abstract synthetic Lcom/zykj/blackboard/core/play/AudioCommandThread$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/play/AudioCommandThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->values()[Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->h:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sput-object v0, Lcom/zykj/blackboard/core/play/AudioCommandThread$a;->a:[I

    return-void
.end method
