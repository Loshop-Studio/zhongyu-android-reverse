.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;
.super Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Delete"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
        "()V",
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
.field public static final INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;

    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "\u5220\u9664"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {p0, v2, v3, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
