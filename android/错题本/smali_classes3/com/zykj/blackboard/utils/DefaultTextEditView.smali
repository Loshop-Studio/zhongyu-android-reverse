.class public final Lcom/zykj/blackboard/utils/DefaultTextEditView;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/proxy/TextEditView;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JM\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00082\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/blackboard/utils/DefaultTextEditView;",
        "Lcom/zykj/blackboard/proxy/TextEditView;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "initText",
        "Lkotlin/Function1;",
        "Ld6/s;",
        "afterTextChangedCallback",
        "doneCallback",
        "Lkotlin/Function0;",
        "cancelCallback",
        "showEditView",
        "(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V",
        "Landroid/content/Context;",
        "Lcom/zykj/blackboard/widgets/TextDialog;",
        "dialog",
        "Lcom/zykj/blackboard/widgets/TextDialog;",
        "getDialog",
        "()Lcom/zykj/blackboard/widgets/TextDialog;",
        "setDialog",
        "(Lcom/zykj/blackboard/widgets/TextDialog;)V",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private dialog:Lcom/zykj/blackboard/widgets/TextDialog;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/utils/DefaultTextEditView;->dialog:Lcom/zykj/blackboard/widgets/TextDialog;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setDialog(Lcom/zykj/blackboard/widgets/TextDialog;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/widgets/TextDialog;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/utils/DefaultTextEditView;->dialog:Lcom/zykj/blackboard/widgets/TextDialog;

    .line 2
    .line 3
    return-void
.end method

.method public showEditView(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "initText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "afterTextChangedCallback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "doneCallback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "cancelCallback"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct {v0, v1, v4, v2, v3}, Lcom/zykj/blackboard/widgets/TextDialog;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/e;)V

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
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/zykj/blackboard/widgets/TextDialog;->showDialog(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method
