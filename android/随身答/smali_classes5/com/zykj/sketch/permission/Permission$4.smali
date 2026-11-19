.class Lcom/zykj/sketch/permission/Permission$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/permission/Permission;->combineShouldShowRequestPermissionRationale(Ljava/util/List;)Ljava/lang/Boolean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/Predicate<",
        "Lcom/zykj/sketch/permission/Permission;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/sketch/permission/Permission;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/permission/Permission;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/permission/Permission$4;->this$0:Lcom/zykj/sketch/permission/Permission;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public test(Lcom/zykj/sketch/permission/Permission;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-boolean p1, p1, Lcom/zykj/sketch/permission/Permission;->shouldShowRequestPermissionRationale:Z

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/zykj/sketch/permission/Permission;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/permission/Permission$4;->test(Lcom/zykj/sketch/permission/Permission;)Z

    move-result p1

    return p1
.end method
