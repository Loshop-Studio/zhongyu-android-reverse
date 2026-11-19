.class public final synthetic Lw3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljc/a;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lio/objectbox/BoxStore;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljc/a;Ljava/lang/String;Lio/objectbox/BoxStore;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/d;->c:Ljava/util/List;

    iput-object p2, p0, Lw3/d;->d:Ljc/a;

    iput-object p3, p0, Lw3/d;->e:Ljava/lang/String;

    iput-object p4, p0, Lw3/d;->f:Lio/objectbox/BoxStore;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lw3/d;->c:Ljava/util/List;

    iget-object v1, p0, Lw3/d;->d:Ljc/a;

    iget-object v2, p0, Lw3/d;->e:Ljava/lang/String;

    iget-object v3, p0, Lw3/d;->f:Lio/objectbox/BoxStore;

    invoke-static {v0, v1, v2, v3}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->e(Ljava/util/List;Ljc/a;Ljava/lang/String;Lio/objectbox/BoxStore;)V

    return-void
.end method
