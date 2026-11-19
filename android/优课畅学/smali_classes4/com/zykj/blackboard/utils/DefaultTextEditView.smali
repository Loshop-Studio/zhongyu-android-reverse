.class public final Lcom/zykj/blackboard/utils/DefaultTextEditView;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/TextEditView;


# instance fields
.field private final context:Landroid/content/Context;

.field private dialog:Lcom/zykj/blackboard/widgets/TextDialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/blackboard/utils/DefaultTextEditView;->context:Landroid/content/Context;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final getDialog()Lcom/zykj/blackboard/widgets/TextDialog;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/utils/DefaultTextEditView;->dialog:Lcom/zykj/blackboard/widgets/TextDialog;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setDialog(Lcom/zykj/blackboard/widgets/TextDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/utils/DefaultTextEditView;->dialog:Lcom/zykj/blackboard/widgets/TextDialog;

    .line 2
    .line 3
    return-void
.end method

.method public showEditView(Ljava/lang/String;Lx7/l;Lx7/l;Lx7/a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lx7/l;",
            "Lx7/l;",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "initText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "afterTextChangedCallback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "doneCallback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "cancelCallback"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/blackboard/utils/DefaultTextEditView;->dialog:Lcom/zykj/blackboard/widgets/TextDialog;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    new-instance v0, Lcom/zykj/blackboard/widgets/TextDialog;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/zykj/blackboard/utils/DefaultTextEditView;->context:Landroid/content/Context;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct {v0, v1, v4, v2, v3}, Lcom/zykj/blackboard/widgets/TextDialog;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/zykj/blackboard/utils/DefaultTextEditView;->dialog:Lcom/zykj/blackboard/widgets/TextDialog;

    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/utils/DefaultTextEditView;->dialog:Lcom/zykj/blackboard/widgets/TextDialog;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/zykj/blackboard/widgets/TextDialog;->showDialog(Ljava/lang/String;Lx7/l;Lx7/l;Lx7/a;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method
