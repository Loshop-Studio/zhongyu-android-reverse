.class Lcom/zykj/sketch/permission/RxPermissions$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/ObservableTransformer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/permission/RxPermissions;->ensureEachCombined([Ljava/lang/String;)Lio/reactivex/ObservableTransformer;
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
    iput-object p1, p0, Lcom/zykj/sketch/permission/RxPermissions$4;->this$0:Lcom/zykj/sketch/permission/RxPermissions;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/sketch/permission/RxPermissions$4;->val$permissions:[Ljava/lang/String;

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
    iget-object v0, p0, Lcom/zykj/sketch/permission/RxPermissions$4;->this$0:Lcom/zykj/sketch/permission/RxPermissions;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/sketch/permission/RxPermissions$4;->val$permissions:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, Lcom/zykj/sketch/permission/RxPermissions;->access$100(Lcom/zykj/sketch/permission/RxPermissions;Lio/reactivex/Observable;[Ljava/lang/String;)Lio/reactivex/Observable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/permission/RxPermissions$4;->val$permissions:[Ljava/lang/String;

    .line 10
    .line 11
    array-length v0, v0

    .line 12
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->buffer(I)Lio/reactivex/Observable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Lcom/zykj/sketch/permission/RxPermissions$4$1;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lcom/zykj/sketch/permission/RxPermissions$4$1;-><init>(Lcom/zykj/sketch/permission/RxPermissions$4;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method
