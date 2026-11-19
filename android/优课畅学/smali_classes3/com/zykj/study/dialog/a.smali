.class public final synthetic Lcom/zykj/study/dialog/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/dialog/UpdateChoiceDialogMain;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/dialog/UpdateChoiceDialogMain;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/dialog/a;->a:Lcom/zykj/study/dialog/UpdateChoiceDialogMain;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/dialog/a;->a:Lcom/zykj/study/dialog/UpdateChoiceDialogMain;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/zykj/study/dialog/UpdateChoiceDialogMain$initView$2;->k(Lcom/zykj/study/dialog/UpdateChoiceDialogMain;Ljava/lang/Boolean;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
