.class Lcom/zykj/sketch/permission/RxPermissions$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/ObservableTransformer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/permission/RxPermissions;->ensureEach([Ljava/lang/String;)Lio/reactivex/ObservableTransformer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/ObservableTransformer<",
        "TT;",
        "Lcom/zykj/sketch/permission/Permission;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/sketch/permission/RxPermissions;

.field final synthetic val$permissions:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/permission/RxPermissions;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/permission/RxPermissions$3;->this$0:Lcom/zykj/sketch/permission/RxPermissions;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/sketch/permission/RxPermissions$3;->val$permissions:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public apply(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "TT;>;)",
            "Lio/reactivex/ObservableSource<",
            "Lcom/zykj/sketch/permission/Permission;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/permission/RxPermissions$3;->this$0:Lcom/zykj/sketch/permission/RxPermissions;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/sketch/permission/RxPermissions$3;->val$permissions:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, Lcom/zykj/sketch/permission/RxPermissions;->access$100(Lcom/zykj/sketch/permission/RxPermissions;Lio/reactivex/Observable;[Ljava/lang/String;)Lio/reactivex/Observable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
