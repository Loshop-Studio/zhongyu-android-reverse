.class public abstract Lcom/taobao/agoo/IListAliasCallback;
.super Lcom/taobao/agoo/ICallback;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/taobao/agoo/ICallback;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onSuccess()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract onSuccess(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method
