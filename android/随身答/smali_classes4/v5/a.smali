.class public final synthetic Lv5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/widgets/TextDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/widgets/TextDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv5/a;->a:Lcom/zykj/blackboard/widgets/TextDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv5/a;->a:Lcom/zykj/blackboard/widgets/TextDialog;

    invoke-static {v0, p1}, Lcom/zykj/blackboard/widgets/TextDialog;->a(Lcom/zykj/blackboard/widgets/TextDialog;Landroid/view/View;)V

    return-void
.end method
