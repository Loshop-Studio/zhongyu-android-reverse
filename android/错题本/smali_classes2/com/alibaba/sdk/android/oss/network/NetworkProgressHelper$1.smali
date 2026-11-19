.class final Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper;->addProgressResponseListener(Lokhttp3/z;Lcom/alibaba/sdk/android/oss/network/ExecutionContext;)Lokhttp3/z;
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
.method public intercept(Lokhttp3/s;)Lokhttp3/i0;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ls7/e;

    .line 3
    .line 4
    iget-object v0, v0, Ls7/e;->e:Lokhttp3/c0;

    .line 5
    .line 6
    check-cast p1, Ls7/e;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ls7/e;->b(Lokhttp3/c0;)Lokhttp3/i0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lokhttp3/i0;->c()Lokhttp3/h0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lcom/alibaba/sdk/android/oss/network/ProgressTouchableResponseBody;

    .line 17
    .line 18
    iget-object p1, p1, Lokhttp3/i0;->g:Lokhttp3/m0;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper$1;->val$context:Lcom/alibaba/sdk/android/oss/network/ExecutionContext;

    .line 21
    .line 22
    invoke-direct {v1, p1, v2}, Lcom/alibaba/sdk/android/oss/network/ProgressTouchableResponseBody;-><init>(Lokhttp3/m0;Lcom/alibaba/sdk/android/oss/network/ExecutionContext;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, v0, Lokhttp3/h0;->g:Lokhttp3/m0;

    .line 26
    .line 27
    invoke-virtual {v0}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method
