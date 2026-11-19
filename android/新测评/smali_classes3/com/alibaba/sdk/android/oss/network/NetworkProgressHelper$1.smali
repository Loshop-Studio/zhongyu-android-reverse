.class final Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La9/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper;->addProgressResponseListener(La9/v;Lcom/alibaba/sdk/android/oss/network/ExecutionContext;)La9/v;
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
.method public intercept(La9/s$a;)La9/y;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, La9/s$a;->a()La9/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, La9/s$a;->b(La9/w;)La9/y;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, La9/y;->s()La9/y$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lcom/alibaba/sdk/android/oss/network/ProgressTouchableResponseBody;

    .line 14
    .line 15
    invoke-virtual {p1}, La9/y;->a()La9/z;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v2, p0, Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper$1;->val$context:Lcom/alibaba/sdk/android/oss/network/ExecutionContext;

    .line 20
    .line 21
    invoke-direct {v1, p1, v2}, Lcom/alibaba/sdk/android/oss/network/ProgressTouchableResponseBody;-><init>(La9/z;Lcom/alibaba/sdk/android/oss/network/ExecutionContext;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, La9/y$a;->b(La9/z;)La9/y$a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, La9/y$a;->c()La9/y;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method
