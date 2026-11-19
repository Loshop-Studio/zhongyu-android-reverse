.class public final Lp5/x1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/EventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/x1;->b(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx7/l;

.field public final synthetic b:Lcom/zykj/blackboard/core/edit/IPageControl;


# direct methods
.method public constructor <init>(Lx7/l;Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp5/x1$b;->a:Lx7/l;

    .line 2
    .line 3
    iput-object p2, p0, Lp5/x1$b;->b:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onEvent(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 1

    .line 1
    const-string v0, "entity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp5/x1$b;->a:Lx7/l;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lp5/x1$b;->b:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Lcom/zykj/blackboard/core/edit/IPageControl;->removeEventListener(Lcom/zykj/blackboard/listener/EventListener;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
