.class public final Lcom/zykj/blackboard/widgets/TextDialog$onCreate$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/widgets/TextDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/blackboard/widgets/TextDialog;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/widgets/TextDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/widgets/TextDialog$onCreate$1;->this$0:Lcom/zykj/blackboard/widgets/TextDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/widgets/TextDialog$onCreate$1;->this$0:Lcom/zykj/blackboard/widgets/TextDialog;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/widgets/TextDialog;->getAfterTextChangedCallback()Lx7/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {v0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
