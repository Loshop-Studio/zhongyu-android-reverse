.class public abstract Lcom/zykj/evaluation/bean/TaskListType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/bean/TaskListType$CompletedTask;,
        Lcom/zykj/evaluation/bean/TaskListType$FavoriteTask;,
        Lcom/zykj/evaluation/bean/TaskListType$ToHandleTask;,
        Lcom/zykj/evaluation/bean/TaskListType$TotalTask;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0004\u0008\t\n\u000bB\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0004\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/TaskListType;",
        "",
        "type",
        "",
        "<init>",
        "(I)V",
        "getType",
        "()I",
        "ToHandleTask",
        "TotalTask",
        "FavoriteTask",
        "CompletedTask",
        "Lcom/zykj/evaluation/bean/TaskListType$CompletedTask;",
        "Lcom/zykj/evaluation/bean/TaskListType$FavoriteTask;",
        "Lcom/zykj/evaluation/bean/TaskListType$ToHandleTask;",
        "Lcom/zykj/evaluation/bean/TaskListType$TotalTask;",
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
.field private final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/evaluation/bean/TaskListType;->type:I

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/evaluation/bean/TaskListType;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskListType;->type:I

    .line 2
    .line 3
    return v0
.end method
