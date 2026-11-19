.class public final synthetic Lcom/friday/cloudsnote/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/cloudsnote/view/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/cloudsnote/view/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/friday/cloudsnote/view/a;->c:Lcom/friday/cloudsnote/view/MainActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/cloudsnote/view/a;->c:Lcom/friday/cloudsnote/view/MainActivity;

    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-static {v0, p1}, Lcom/friday/cloudsnote/view/MainActivity$initData$1;->n(Lcom/friday/cloudsnote/view/MainActivity;Lcom/zykj/message/server/bean/ServerInfo;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
