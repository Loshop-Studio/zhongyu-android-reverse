.class final Lcom/tencent/liteav/basic/util/e$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/basic/util/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/basic/util/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/tencent/liteav/basic/util/a$a<",
        "Lcom/tencent/liteav/basic/util/b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/util/e$1;->b()Lcom/tencent/liteav/basic/util/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()Lcom/tencent/liteav/basic/util/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/liteav/basic/util/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/liteav/basic/util/b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
