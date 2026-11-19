.class Lcom/tendcloud/tenddata/cr$1;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/cr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Ljava/util/concurrent/ConcurrentLinkedQueue<",
        "Lcom/tendcloud/tenddata/cr$a;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/cr;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/cr;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/cr$1;->this$0:Lcom/tendcloud/tenddata/cr;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/cr$1;->initialValue()Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v0

    return-object v0
.end method

.method public initialValue()Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tendcloud/tenddata/cr$a;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    return-object v0
.end method
