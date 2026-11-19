.class public final synthetic Lcom/zykj/merge/sketch/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/a;->c:Lhd/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/a;->c:Lhd/l;

    invoke-static {v0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->a(Lhd/l;)V

    return-void
.end method
