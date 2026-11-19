.class public Lcom/lzy/okgo/request/base/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lzy/okgo/request/base/a;->d(Lcom/lzy/okgo/model/Progress;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/lzy/okgo/model/Progress;

.field public final synthetic d:Lcom/lzy/okgo/request/base/a;


# direct methods
.method public constructor <init>(Lcom/lzy/okgo/request/base/a;Lcom/lzy/okgo/model/Progress;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lzy/okgo/request/base/a$a;->d:Lcom/lzy/okgo/request/base/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/lzy/okgo/request/base/a$a;->c:Lcom/lzy/okgo/model/Progress;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lzy/okgo/request/base/a$a;->d:Lcom/lzy/okgo/request/base/a;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lzy/okgo/request/base/a;->c(Lcom/lzy/okgo/request/base/a;)Lc7/a;

    .line 4
    .line 5
    .line 6
    return-void
.end method
