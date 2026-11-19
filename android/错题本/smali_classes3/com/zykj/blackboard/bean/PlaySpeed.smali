.class public final Lcom/zykj/blackboard/bean/PlaySpeed;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/bean/PlaySpeed$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/zykj/blackboard/bean/PlaySpeed;",
        "",
        "<init>",
        "()V",
        "",
        "rate",
        "Ld6/s;",
        "setRate",
        "(F)V",
        "",
        "<set-?>",
        "playIncrement",
        "I",
        "getPlayIncrement",
        "()I",
        "Companion",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/bean/PlaySpeed$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INITIAL_PLAY_INCREMENT:I = 0x10


# instance fields
.field private playIncrement:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/bean/PlaySpeed$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/bean/PlaySpeed$Companion;-><init>(Lkotlin/jvm/internal/e;)V

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
