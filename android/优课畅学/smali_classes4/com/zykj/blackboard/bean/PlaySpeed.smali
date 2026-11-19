.class public final Lcom/zykj/blackboard/bean/PlaySpeed;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/bean/PlaySpeed$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/bean/PlaySpeed$Companion;

.field public static final INITIAL_PLAY_INCREMENT:I = 0x10


# instance fields
.field private playIncrement:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/bean/PlaySpeed$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/bean/PlaySpeed$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/blackboard/bean/PlaySpeed;->Companion:Lcom/zykj/blackboard/bean/PlaySpeed$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    iput v0, p0, Lcom/zykj/blackboard/bean/PlaySpeed;->playIncrement:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getPlayIncrement()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/PlaySpeed;->playIncrement:I

    .line 2
    .line 3
    return v0
.end method

.method public final declared-synchronized setRate(F)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    int-to-float v0, v0

    .line 5
    mul-float/2addr v0, p1

    .line 6
    float-to-int p1, v0

    .line 7
    :try_start_0
    iput p1, p0, Lcom/zykj/blackboard/bean/PlaySpeed;->playIncrement:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw p1
.end method
