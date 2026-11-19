.class public final synthetic Lp4/w;
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

    iput-object p1, p0, Lp4/w;->a:Lcom/zykj/study/dialog/UpdateChoiceDialogMain;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/w;->a:Lcom/zykj/study/dialog/UpdateChoiceDialogMain;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/zykj/study/dialog/UpdateChoiceDialogMain;->g(Lcom/zykj/study/dialog/UpdateChoiceDialogMain;Ljava/util/List;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
