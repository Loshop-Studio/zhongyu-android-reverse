.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;
.super Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Rotate"
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;

    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, ""

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {p0, v2, v3, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/n;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
