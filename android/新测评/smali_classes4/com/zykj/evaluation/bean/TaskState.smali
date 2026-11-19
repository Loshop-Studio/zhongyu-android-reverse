.class public abstract Lcom/zykj/evaluation/bean/TaskState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/bean/TaskState$Correcting;,
        Lcom/zykj/evaluation/bean/TaskState$Done;,
        Lcom/zykj/evaluation/bean/TaskState$Handling;,
        Lcom/zykj/evaluation/bean/TaskState$Revising;,
        Lcom/zykj/evaluation/bean/TaskState$ToCorrect;,
        Lcom/zykj/evaluation/bean/TaskState$ToDo;,
        Lcom/zykj/evaluation/bean/TaskState$WaitCorrect;,
        Lcom/zykj/evaluation/bean/TaskState$WaitRevise;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0008\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0019\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u0082\u0001\u0008\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/TaskState;",
        "",
        "state",
        "",
        "name",
        "",
        "<init>",
        "(ILjava/lang/String;)V",
        "getState",
        "()I",
        "getName",
        "()Ljava/lang/String;",
        "Handling",
        "ToDo",
        "WaitCorrect",
        "Correcting",
        "ToCorrect",
        "WaitRevise",
        "Revising",
        "Done",
        "Lcom/zykj/evaluation/bean/TaskState$Correcting;",
        "Lcom/zykj/evaluation/bean/TaskState$Done;",
        "Lcom/zykj/evaluation/bean/TaskState$Handling;",
        "Lcom/zykj/evaluation/bean/TaskState$Revising;",
        "Lcom/zykj/evaluation/bean/TaskState$ToCorrect;",
        "Lcom/zykj/evaluation/bean/TaskState$ToDo;",
        "Lcom/zykj/evaluation/bean/TaskState$WaitCorrect;",
        "Lcom/zykj/evaluation/bean/TaskState$WaitRevise;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final name:Ljava/lang/String;

.field private final state:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/evaluation/bean/TaskState;->state:I

    iput-object p2, p0, Lcom/zykj/evaluation/bean/TaskState;->name:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/evaluation/bean/TaskState;-><init>(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskState;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskState;->state:I

    .line 2
    .line 3
    return v0
.end method
