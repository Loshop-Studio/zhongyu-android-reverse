.class Lcom/zykj/sketch/permission/RxPermissions$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/Function;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/permission/RxPermissions$4;->apply(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/Function<",
        "Ljava/util/List<",
        "Lcom/zykj/sketch/permission/Permission;",
        ">;",
        "Lio/reactivex/ObservableSource<",
        "Lcom/zykj/sketch/permission/Permission;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/zykj/sketch/permission/RxPermissions$4;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/permission/RxPermissions$4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/permission/RxPermissions$4$1;->this$1:Lcom/zykj/sketch/permission/RxPermissions$4;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public apply(Ljava/util/List;)Lio/reactivex/ObservableSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/permission/Permission;",
            ">;)",
            "Lio/reactivex/ObservableSource<",
            "Lcom/zykj/sketch/permission/Permission;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance v0, Lcom/zykj/sketch/permission/Permission;

    invoke-direct {v0, p1}, Lcom/zykj/sketch/permission/Permission;-><init>(Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/permission/RxPermissions$4$1;->apply(Ljava/util/List;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
