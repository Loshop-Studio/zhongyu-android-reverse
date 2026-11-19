.class Lcom/zykj/sketch/permission/RxPermissions$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/Function;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/permission/RxPermissions;->request(Lio/reactivex/Observable;[Ljava/lang/String;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/Function<",
        "Ljava/lang/Object;",
        "Lio/reactivex/Observable<",
        "Lcom/zykj/sketch/permission/Permission;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/sketch/permission/RxPermissions;

.field final synthetic val$permissions:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/permission/RxPermissions;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/permission/RxPermissions$5;->this$0:Lcom/zykj/sketch/permission/RxPermissions;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/sketch/permission/RxPermissions$5;->val$permissions:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/zykj/sketch/permission/Permission;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object p1, p0, Lcom/zykj/sketch/permission/RxPermissions$5;->this$0:Lcom/zykj/sketch/permission/RxPermissions;

    iget-object v0, p0, Lcom/zykj/sketch/permission/RxPermissions$5;->val$permissions:[Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/zykj/sketch/permission/RxPermissions;->access$200(Lcom/zykj/sketch/permission/RxPermissions;[Ljava/lang/String;)Lio/reactivex/Observable;

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
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/permission/RxPermissions$5;->apply(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
