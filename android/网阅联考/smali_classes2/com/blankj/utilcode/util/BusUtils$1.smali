.class Lcom/blankj/utilcode/util/BusUtils$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/blankj/utilcode/util/BusUtils;->invokeMethod(Ljava/lang/Object;Ljava/lang/Object;Lcom/blankj/utilcode/util/BusUtils$BusInfo;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/blankj/utilcode/util/BusUtils;

.field final synthetic val$arg:Ljava/lang/Object;

.field final synthetic val$bus:Ljava/lang/Object;

.field final synthetic val$busInfo:Lcom/blankj/utilcode/util/BusUtils$BusInfo;

.field final synthetic val$sticky:Z


# direct methods
.method public constructor <init>(Lcom/blankj/utilcode/util/BusUtils;Ljava/lang/Object;Ljava/lang/Object;Lcom/blankj/utilcode/util/BusUtils$BusInfo;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/blankj/utilcode/util/BusUtils$1;->this$0:Lcom/blankj/utilcode/util/BusUtils;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/blankj/utilcode/util/BusUtils$1;->val$bus:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/blankj/utilcode/util/BusUtils$1;->val$arg:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/blankj/utilcode/util/BusUtils$1;->val$busInfo:Lcom/blankj/utilcode/util/BusUtils$BusInfo;

    .line 8
    .line 9
    iput-boolean p5, p0, Lcom/blankj/utilcode/util/BusUtils$1;->val$sticky:Z

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/BusUtils$1;->this$0:Lcom/blankj/utilcode/util/BusUtils;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/blankj/utilcode/util/BusUtils$1;->val$bus:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/blankj/utilcode/util/BusUtils$1;->val$arg:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/blankj/utilcode/util/BusUtils$1;->val$busInfo:Lcom/blankj/utilcode/util/BusUtils$BusInfo;

    .line 8
    .line 9
    iget-boolean v4, p0, Lcom/blankj/utilcode/util/BusUtils$1;->val$sticky:Z

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, Lcom/blankj/utilcode/util/BusUtils;->access$100(Lcom/blankj/utilcode/util/BusUtils;Ljava/lang/Object;Ljava/lang/Object;Lcom/blankj/utilcode/util/BusUtils$BusInfo;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
