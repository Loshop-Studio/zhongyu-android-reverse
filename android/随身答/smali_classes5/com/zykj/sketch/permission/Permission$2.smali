.class Lcom/zykj/sketch/permission/Permission$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/Function;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/permission/Permission;->combineName(Ljava/util/List;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/Function<",
        "Lcom/zykj/sketch/permission/Permission;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/sketch/permission/Permission;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/permission/Permission;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/permission/Permission$2;->this$0:Lcom/zykj/sketch/permission/Permission;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/zykj/sketch/permission/Permission;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/permission/Permission$2;->apply(Lcom/zykj/sketch/permission/Permission;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public apply(Lcom/zykj/sketch/permission/Permission;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object p1, p1, Lcom/zykj/sketch/permission/Permission;->name:Ljava/lang/String;

    return-object p1
.end method
