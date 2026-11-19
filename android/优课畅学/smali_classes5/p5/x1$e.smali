.class public final Lp5/x1$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/RecordListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/x1;->e(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/a;Lx7/l;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx7/l;

.field public final synthetic b:Lx7/a;

.field public final synthetic c:Lx7/a;


# direct methods
.method public constructor <init>(Lx7/l;Lx7/a;Lx7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp5/x1$e;->a:Lx7/l;

    .line 2
    .line 3
    iput-object p2, p0, Lp5/x1$e;->b:Lx7/a;

    .line 4
    .line 5
    iput-object p3, p0, Lp5/x1$e;->c:Lx7/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public progress(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/x1$e;->a:Lx7/l;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public startRecord()V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/x1$e;->b:Lx7/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public stopRecord()V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/x1$e;->c:Lx7/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
