.class final Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper;->addProgressResponseListener(Lje/v;Lcom/alibaba/sdk/android/oss/network/ExecutionContext;)Lje/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic val$context:Lcom/alibaba/sdk/android/oss/network/ExecutionContext;


# direct methods
.method public constructor <init>(Lcom/alibaba/sdk/android/oss/network/ExecutionContext;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper$1;->val$context:Lcom/alibaba/sdk/android/oss/network/ExecutionContext;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public intercept(Lje/s$a;)Lje/y;
    .locals 3

    .line 1
    invoke-interface {p1}, Lje/s$a;->request()Lje/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Lje/s$a;->a(Lje/w;)Lje/y;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lje/y;->v()Lje/y$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lcom/alibaba/sdk/android/oss/network/ProgressTouchableResponseBody;

    .line 14
    .line 15
    invoke-virtual {p1}, Lje/y;->e()Lje/z;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v2, p0, Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper$1;->val$context:Lcom/alibaba/sdk/android/oss/network/ExecutionContext;

    .line 20
    .line 21
    invoke-direct {v1, p1, v2}, Lcom/alibaba/sdk/android/oss/network/ProgressTouchableResponseBody;-><init>(Lje/z;Lcom/alibaba/sdk/android/oss/network/ExecutionContext;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lje/y$a;->b(Lje/z;)Lje/y$a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lje/y$a;->c()Lje/y;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method
