.class Lcom/tendcloud/tenddata/bu$b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bu$b;-><init>(Lcom/tendcloud/tenddata/bu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tendcloud/tenddata/bu$b;

.field final synthetic val$this$0:Lcom/tendcloud/tenddata/bu;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/bu$b;Lcom/tendcloud/tenddata/bu;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/bu$b$1;->this$1:Lcom/tendcloud/tenddata/bu$b;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tendcloud/tenddata/bu$b$1;->val$this$0:Lcom/tendcloud/tenddata/bu;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
